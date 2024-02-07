public class Main {
    public static void main(String[] args) {
        String text = "Dumitru";
        
        // Transformă fiecare caracter în poziția numerică în alfabet
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                // Convertim litera la majuscula pentru a obtine o valoare corecta
                c = Character.toUpperCase(c);
                
                // Calculăm poziția numerică și o afișăm pe aceeași linie cu două spații între litere
                System.out.print((int)(c - 'A' + 1) + "  ");
            } else {
                // Dacă caracterul nu este o literă, îl afișăm pe aceeași linie
                System.out.print(c + "  ");
            }
        }

        System.out.println(); // Trecem la următoarea linie pentru a afișa pozițiile

        // Afișăm pozițiile sub fiecare literă
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                System.out.print("   " + (c + "").toUpperCase()); // Afisam litera in majuscula
            } else {
                System.out.print("   "); // Spațiu pentru caractere care nu sunt litere
            }
        }
    }
}
