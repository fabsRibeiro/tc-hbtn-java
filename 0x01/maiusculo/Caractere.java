//package maiusculo;

public class Caractere {
    public static boolean EhMaiusculo(char c) {
        switch (c) {
            case 'a':
                return false;
            case 'A':
                return true;
            case 'b':
                return false;
            case 'B':
                return true;
            case 'd':
                return false;
            case 'D':
                return true;
            case 'f':
                return false;
            case 'F':
                return true;
            case 'g':
                return false;
            case 'G':
                return true;
            default:
                return false;
        }
    }
}
