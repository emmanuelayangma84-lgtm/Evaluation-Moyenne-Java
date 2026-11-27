public class ModuleMention {

    // Determiner la mention selon la moyenne
    public static String determinerMention(double moyenne) {
        if (moyenne >= 16) {
            return "Tres Bien";
        } else if (moyenne >= 14) {
            return "Bien";
        } else if (moyenne >= 12) {
            return "Assez Bien";
        } else if (moyenne >= 10) {
            return "Passable";
        } else {
            return "Insuffisant";
        }
    }

    // Determiner si admis ou echoue
    public static String determinerDecision(double moyenne) {
        if (moyenne >= 10) {
            return "ADMIS";
        } else {
            return "ECHOUE";
        }
    }
}
