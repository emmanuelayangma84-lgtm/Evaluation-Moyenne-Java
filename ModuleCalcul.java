public class ModuleCalcul {

    // Calculer la moyenne
    public static double calculerMoyenne(double[] notes) {
        double somme = 0;
        for (int i = 0; i < notes.length; i++) {
            somme = somme + notes[i];
        }
        return somme / notes.length;
    }

    // Trouver la note max
    public static double trouverMax(double[] notes) {
        double max = notes[0];
        for (int i = 1; i < notes.length; i++) {
            if (notes[i] > max) {
                max = notes[i];
            }
        }
        return max;
    }

    // Trouver la note min
    public static double trouverMin(double[] notes) {
        double min = notes[0];
        for (int i = 1; i < notes.length; i++) {
            if (notes[i] < min) {
                min = notes[i];
            }
        }
        return min;
    }
}
