/*        Controlli che il numeratore e il denominatore non siano null
        Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione.*/
public class Main {
    public static void main(String[] args) {
        Integer y = null;
        int x = 3;
        check(x,y);
    }
    public static void check(Integer numeratore,Integer denominatore){
        try {
            int result = numeratore / denominatore;
        }catch (NullPointerException e){
            System.out.println("nullo");
        }
    }
}