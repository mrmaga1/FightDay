public class Programmer extends Hero{
    int hack,cheat,stackoverflow;

    public Programmer(String name, int attack, int hp, int accuracy, int crit, int dexterity, int hack, int cheat, int stackoverflow) {
        super(name, attack, hp, accuracy, crit, dexterity);
        this.hack = hack;
        this.cheat = cheat;
        this.stackoverflow = stackoverflow;
    }
}
