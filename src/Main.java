public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {new Magic(), new Warrior(), new Medic()};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
        }
    }
}