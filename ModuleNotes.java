import java.util.Scanner;

public class ModuleNotes {

    // Demander combien de notes
    public static int saisirNombreNotes(Scanner sc) {
        System.out.print("Combien de notes ? ");
        int n = sc.nextInt();
        sc.nextLine(); // vider le buffer
        return n;
    }

    // Saisir les notes avec validation 0 a 20
    public static double[] saisirNotes(Scanner sc, int n) {
        double[] notes = new double[n];
        for (int i = 0; i < n; i++) {
            double note;
            do {
                System.out.print("Note " + (i + 1) + " (0-20) : ");
                note = sc.nextDouble();
                sc.nextLine();
                if (note < 0 || note > 20) {
                    System.out.println("Erreur : la note doit etre entre 0 et 20.");
                }
            } while (note < 0 || note > 20);
            notes[i] = note;
        }
        return notes;
    }
}
