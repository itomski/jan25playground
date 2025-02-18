package de.lubowiecki.exceptions;

public class OwnExceptionTest {

    public static void main(String[] args) {

        try {
            System.out.println(darfIchRein(150));
        }
        catch (ZuAltException e) {
            System.out.println("Die Angabe ist zu hoch");
        }
        catch (ZuJungException e) {
            System.out.println("Die Angabe ist zu niedrig");
        }
    }

    /**
     *
     * @param alter
     * @return
     * @throws ZuAltException wenn der Wert über 120 ist
     * @throws ZuJungException wenn der Wert unter 0 ist
     */
    private static boolean darfIchRein(int alter) throws ZuAltException, ZuJungException {

        if(alter < 0) throw new ZuJungException();

        if(alter > 120) throw new ZuAltException();

        return alter >= 18;
    }
}

// Checked, da von Exception abgeleitet
class ZuJungException extends Exception {
}

class ZuAltException extends Exception {
}

