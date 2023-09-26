import java.util.Arrays;

/*
 * Aufgabe:
 * erstelle ein boolean Array mit alternierenden boolean-Werten, z.B.:
 * [false, true, false, true, false,...]
 */
public class Main {
    public static void main(String[] args) {
        /*
         * Variante 1:
         * Ich ändere in der for-Schleife nur Elemente an geraden Index Positionen
         */
        boolean[] myArray1 = new boolean[10];
        // { false, false, false, false, false, false, false, false, false, false }

        for (int position = 0; position < myArray1.length; position += 2) {
            // Jedes Element entspricht der negierten Version des Vorgängers:
            myArray1[position + 1] = !myArray1[position];
        }

        System.out.println("myArray1: " + Arrays.toString(myArray1));

        // ============================================================================================== //

        /*
         * Variante 2:
         * Aktuelles Element mit 'Vorgänger' vergleichen
         * ACHTUNG: die Abbruch-Bedingung der for-Schleife muss den 'offset' berücksichtigen!
         */
        boolean[] myArray2 = new boolean[10];
        // { false, false, false, false, false, false, false, false, false, false }

        for (int position = 0; position < myArray2.length - 1; position++) {
            // Jedes Element entspricht der negierten Version des Vorgängers:
            myArray2[position + 1] = !myArray2[position];
        }

        System.out.println("myArray2: " + Arrays.toString(myArray2));

        // ============================================================================================== //

        /*
         * Variante 3:
         * Modulo Variante 1 - ich ändere nur die Elemente wo der Index eine gerade Zahl ist
         * (und das teste ich mithilfe des Modulo!)
         */

        boolean[] myArray3 = new boolean[10];
        // { false, false, false, false, false, false, false, false, false, false }

        for (int j = 0; j < 10; j++) {
            if (j % 2 == 0) {
                myArray3[j] = true;
            }
        }

        System.out.println("myArray3: " + Arrays.toString(myArray3));

        // ============================================================================================== //

        /*
         * Variante 4:
         * Modulo Variante 2 - ich überschreibe ALLE Elemente des Arrays
         * mithilfe des Modulo-Vergleichs der vorherigen Variante
         */

        boolean[] myArray4 = new boolean[10];
        // { false, false, false, false, false, false, false, false, false, false }

        for (int j = 0; j < 10; j++) {
            myArray4[j] = j % 2 == 0; // <- (j % 2 == 0) ist immer abwechselnd 'true' oder 'false'!
        }

        System.out.println("myArray4: " + Arrays.toString(myArray4));

        // ============================================================================================== //

        /*
         * Variante 5:
         * Bit Operation - BONUS LÖSUNG - Wer kann das erklären?
         */

        boolean[] myArray5 = new boolean[10];
        // { false, false, false, false, false, false, false, false, false, false }

        for (int j = 0; j < 10; j++) {
            myArray5[j] = (j & 1) == 0;
        }

        System.out.println("myArray5: " + Arrays.toString(myArray5));

        // ============================================================================================== //

        /*
         * Der print Output wird wie folgt aussehen:
         * (Man beachte den Unterschied zwischen Lösung 1+2 vs. 3-5!)
         * myArray1: [false, true, false, true, false, true, false, true, false, true]
         * myArray2: [false, true, false, true, false, true, false, true, false, true]
         * myArray3: [true, false, true, false, true, false, true, false, true, false]
         * myArray4: [true, false, true, false, true, false, true, false, true, false]
         * myArray5: [true, false, true, false, true, false, true, false, true, false]
         */
    }
}