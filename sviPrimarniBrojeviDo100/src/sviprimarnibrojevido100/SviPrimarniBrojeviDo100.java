package sviprimarnibrojevido100;

public class SviPrimarniBrojeviDo100 {

    public static void main(String[] args) {
        int i = 0;
        int broj = 0;
        //prazan string
        String primarniBrojevi = "";

        for (i = 1; i <= 100; i++) {
            int brojac = 0;
            for (broj = i; broj >= 1; broj--) {
                if (i % broj == 0) {
                    brojac = brojac + 1;
                }
            }
            if (brojac == 2) {
                //Dodavanje primarnog broja stringu
                primarniBrojevi = primarniBrojevi + i + " ";
            }
        }
        System.out.println("Primarni brojevi od 1 do 100 su :");
        System.out.println(primarniBrojevi);
    }
}
