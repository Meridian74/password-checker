package loc.exercise.pwdchecker.config;

/**
 *  Jelszó konfigurációs osztály. <br><br>
 *  A beállításokhoz megadott paraméterekt ellenőrzi, ha nem lehetséges beállítani, akkor nem változtat a régin.<br>
 *  A minimális hossz 0 is lehet, ekkor pl nem lehet megadni minimum értékeket a kis és nagybetűk, számok és <br>
 *  szimbólumok kötelező mennyiségére, mivel együttesen meghaladnák ezt az értéket egy lehetséges jelszóben <br>
 *  (pl egykarakteres jelszó esetén...)
 *  <br>
 *  A jelszó legkisebb mérete 0 lehet. <br>
 *  A jelszó leghosszabb mérete 254 karakter lehet<br>
 *  <br>
 *  A config beállításaihoz belső Builder osztály van létrehozva.<br>
 *  Ezzel egyesével és láncolt módon be lehet állítani az adatokat, és visszaadni ebből egy példányt.
 *  <br>
 *
 *	@author: Fazekas László (2024) alias Meridian.
 */
public class PasswordConfig {

    private static final int MIN_LENGTH = 0;
    private static final int MAX_LENGTH = 254;

    private final int minimumLength;
    private final int maximumLength;
    private final int minimumLowerCaseLetter;
    private final int minimumUpperCaseLetter;
    private final int minimumNumber;
    private final int minimumSymbol;


    // inner builder class - help to set and construct this config object
    public static class Builder {

        // default values
        private int minimumLength = 4;
        private int maximumLength = 127;
        private int minimumLowerCaseLetter = 0;
        private int minimumUpperCaseLetter = 0;
        private int minimumNumber = 0;
        private int minimumSymbol = 0;

        public Builder withMinimumLength(int minLength) {
            if (minLength > MIN_LENGTH && minLength < maximumLength) {
                this.minimumLength = minLength;
            }
            return this;
        }

        public Builder withMaximumLength(int maxLength) {
            if (maxLength > minimumLength && maxLength < MAX_LENGTH)
                this.maximumLength = maxLength;
            return this;
        }

        public Builder withMinimumLowerCaseLetter(int minLowerCase) {
            if (this.minimumSymbol + this.minimumNumber + this.minimumUpperCaseLetter
                    + minLowerCase <= this.minimumLength) {
                this.minimumLowerCaseLetter = minLowerCase;
            }
            return this;
        }

        public Builder withMinimumUpperCaseLetter(int minUpperCase) {
            if (this.minimumSymbol + this.minimumNumber + this.minimumLowerCaseLetter
                    + minUpperCase <= this.minimumLength) {
                this.minimumUpperCaseLetter = minUpperCase;
            }
            return this;
        }

        public Builder withMinimumNumber(int minNumber) {
            if (this.minimumSymbol + this.minimumLowerCaseLetter + this.minimumUpperCaseLetter
                    + minNumber <= this.minimumLength) {
                this.minimumNumber = minNumber;
            }
            return this;
        }

        public Builder withMinimumSymbol(int minSymbol) {
            if (this.minimumNumber + this.minimumLowerCaseLetter + this.minimumUpperCaseLetter
                    + minSymbol <= this.minimumLength) {
                this.minimumSymbol = minSymbol;
            }
            return this;
        }

        public PasswordConfig build() {
            return new PasswordConfig(this.minimumLength, this.maximumLength, this.minimumLowerCaseLetter,
                    this.minimumUpperCaseLetter, this.minimumNumber, this.minimumSymbol);
        }

    }


    // private(!) constructor - use inner Builder!
    private PasswordConfig(int minimumLength, int maximumLength, int minimumLowerCaseLetter,
                          int minimumUpperCaseLetter, int minimumNumber, int minimumSymbol) {

        this.minimumLength = minimumLength;
        this.maximumLength = maximumLength;
        this.minimumLowerCaseLetter = minimumLowerCaseLetter;
        this.minimumUpperCaseLetter = minimumUpperCaseLetter;
        this.minimumNumber = minimumNumber;
        this.minimumSymbol = minimumSymbol;
    }

    public int getMinimumLength() {
        return minimumLength;
    }

    public int getMaximumLength() {
        return maximumLength;
    }

    public int getMinimumLowerCaseLetter() {
        return minimumLowerCaseLetter;
    }

    public int getMinimumUpperCaseLetter() {
        return minimumUpperCaseLetter;
    }

    public int getMinimumNumber() {
        return minimumNumber;
    }

    public int getMinimumSymbol() {
        return minimumSymbol;
    }

}
