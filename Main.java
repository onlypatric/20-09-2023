/**
* Programma principale, contiene tutte le informazioni e attributi necessari al funzionamento
* Non serve alcun import.
* 
* @author Pintescul Patric & Eletr Shehab Ali Latif Ali
* @version v1.0.0
*/
public class Main
{
    
    static final int DIM = 10; // variabile che indica la dimensione dell array
    static int valori[] = new int[DIM]; // array che contiene i valori di cui si vuole calcolare la media
  /**
   * Processo principale della classe Main
   * 
   * @param args dati dalla JVM
   * @version v1.0.0
   */
  public static void main(String args[])
  {

    double mPari, mDispari, mPosPari,mPosDispari; // variabili che contengono la media dei numeri pari, i numeri dispari, i numeri pari posizionati, i numeri dispari posizionati

    creaVettore(1,9);  // genera il vettore in un range che va dal primo al secondo numero (inclusi)
    System.out.println("Vettore creato: ");
    visualizzaVettore(); // stampa il contenuto del vettore
    System.out.println("---------------------------------------");
    mPari = mediaPariVettore(); // trova la media degli elementi pari
    // System.out.println("Media elementi pari: " + mPari);
    System.out.printf("Media elementi pari: %.2f \n", mPari); // stampa
    mDispari = mediaDispariVettore(); // trova la media degli elementi dispari
    // System.out.println("Media elementi dispari: " + mDispari);
    System.out.printf("Media elementi pari: %.2f \n", mDispari); // stampa
    mPosPari = mediaPosPariVettore(); // trova la media degli elementi da posizioni pari (0,2,4,6,8 ...)
    // System.out.println("Media elementi pari: " + mPosPari);
    System.out.printf("Media elementi pari: %.2f \n", mPosPari); // stampa
    mPosDispari = mediaPosDispariVettore(); // trova la media degli elementi da posizioni dispari (1,3,5,7,9 ...)
    // System.out.println("Media elementi dispari: " + mPosDispari);
    System.out.printf("Media elementi dispari: %.2f \n", mPosDispari); // stampa
    
  } 

  /**
   * metodo per popolare il vettore con numeri casuali utilizzando Math.random() arrotondato a int
   * 
   * @version v1.0.0
   */

    private static void creaVettore(int a, int b) 
    {
      for(int i=0; i<DIM; i++)
      {
        valori[i] = (int) Math.round(a + Math.random() * b); 
      }
    }

    /**
     * metodo per stampare il contenuto del vettore utilizzando println a console
     * @version v1.0.0
    */
    private static void visualizzaVettore()
    {
      for(int i=0; i<DIM; i++)
      {
        System.out.println("Nella cella "+i+" il valore presente e': "+valori[i]);
      }
    }

    /**
     * metodo per calcolare la media degli elementi pari
     * con check di validità per evitare che non divida per 0
     * @version v1.0.0
    */

    private static double mediaPariVettore()
    {
      int somma = 0;
      int conta = 0;
      double media;

      for(int i=0; i<DIM; i++)
      {
        if (valori[i]%2==0)
        {
          
          somma += valori[i];
          conta++;
        }
      }

      if (conta!=0)
        media = (double) somma / conta;
      else
        media = 0;

      return media;

    }

    /**
     * metodo per calcolare la media degli elementi dispari
     * con check di validità per evitare che non divida per 0
     */
    private static double mediaDispariVettore()
    {
      int somma = 0;
      int conta = 0;
      double media;
      for(int i= 0; i<DIM; i++)
      {
        if (valori[i]%2!=0)
        {
          conta++;
          somma += valori[i]; 
        }
      }

      if (conta!=0)
        media = (double) somma / conta;
      else
        media = 0;

      return media;

    }
    /*
     * metodo per calcolare la media degli elementi da posizioni dato uno specifico pattern 
     * con check di validità per evitare che non divida per 0
     * @version v1.0.0
     */
    private static double mediaPosizioniVettore(int posizioni)
    {
      int somma = 0;
      int conta = 0;
      double media;
      for(int i= 0; i<DIM; i++)
      {
        if (i%2==posizioni)
        {
          conta++;
          somma += valori[i]; 
        }
      }

      if (conta!=0)
        media = (double) somma / conta;
      else
        media = 0;

      return media;
    }
    /**
     * metodo prefabbricato per trovare la media delle posizioni pari
     * @version v1.0.0
     */
    private static double mediaPosPariVettore(){
      return mediaPosizioniVettore(0);
    }
    /**
     * metodo prefabbricato per trovare la media delle posizioni pari
     * @version v1.0.0
     */
    private static double mediaPosDispariVettore(){
      return mediaPosizioniVettore(1);
    }
    
} 
