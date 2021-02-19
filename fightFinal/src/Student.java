public class Student extends Hero {
    int intel,hinkleyStench,lethargicSleep;
    public Student(String name, int attack, int hp, int accuracy, int crit, int dexterity,int intel,int hinkleyStench,int lethargicSleep) {
        super(name, attack, hp, accuracy, crit, dexterity);
        this.hinkleyStench = hinkleyStench;
        this.intel = intel;
        this.lethargicSleep = lethargicSleep;
    }
}
