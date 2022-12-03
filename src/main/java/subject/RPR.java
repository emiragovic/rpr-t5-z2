package subject;

public class RPR implements Subject{
    @Override
    public String nastavniAnsambl() {
        return "Dino Keco, Adnan Hajro, Almina Brulic";
    }

    @Override
    public String bodovanje() {
        return "{ kvizovi : 5, zadace : 5, projekat : 20, parcijalni ispit : 20, zavrsni ispit : 20, usmeni ispit : 30 }";
    }
}