package subject;

public class DM implements Subject {
    @Override
    public String nastavniAnsambl() {
        return "Zeljko Juric, Seila Becirovic";
    }

    @Override
    public String bodovanje() {
        return "{ kvizovi : 10, zadace : 20, parcijalni ispit : 20, zavrsni ispit : 30, usmeni ispit : 20 }";
    }
}