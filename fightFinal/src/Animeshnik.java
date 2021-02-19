public class Animeshnik extends Hero{
    int rasengan,chidori ,deathNote;

    public Animeshnik(String name, int attack, int hp, int accuracy, int crit, int dexterity, int rasengan, int chidori, int deathNote) {
        super(name, attack, hp, accuracy, crit, dexterity);
        this.rasengan = rasengan;
        this.chidori = chidori;
        this.deathNote = deathNote;
    }
}
