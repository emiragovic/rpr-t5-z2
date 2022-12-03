package subject;

public class SP implements Subject{
    @Override
    public String nastavniAnsambl() {
        return "Samir Ribic, Kerim Hodzic, Lamija Cemalovic";
    }

    @Override
    public String bodovanje() {
        return "{ aktivnost : 5, prisustvo : 10, zadace : 10, parcijalni ispit : 20, zavrsni ispit : 20, usmeni ispit : 40 }";
    }
}
