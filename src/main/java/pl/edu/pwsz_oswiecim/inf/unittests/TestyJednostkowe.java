package pl.edu.pwsz_oswiecim.inf.unittests;

/**
 * Created by mswierczek on 2017-06-04.
 */
public class TestyJednostkowe {

    public static class Czlowiek {

        private String imie;

        private String nazwisko;

        private int rokUrodzenia;

        public String getImie() {
            return imie;
        }

        public void setImie(String imie) {
            this.imie = imie;
        }

        public String getNazwisko() {
            return nazwisko;
        }

        public void setNazwisko(String nazwisko) {
            this.nazwisko = nazwisko;
        }

        public int getRokUrodzenia() {
            return rokUrodzenia;
        }

        public void setRokUrodzenia(int rokUrodzenia) {
            this.rokUrodzenia = rokUrodzenia;
        }
    }

    public String fizzBuzz(int liczba) {
        if(liczba % 5 == 0 && liczba % 3 == 0) {
            return "fizzbuzz";
        } else if (liczba % 5 == 0) {
            return "fizz";
        } else if (liczba % 3 == 0) {
            return "buzz";
        }  else {
            return "";
        }
    }

    public Czlowiek nowyCzlowiek(String imie, String nazwisko, int rokUrodzenia) {
        Czlowiek czlowiek = new Czlowiek();
        czlowiek.setImie(imie);
        czlowiek.setNazwisko(nazwisko);
        return czlowiek;
    }



}
