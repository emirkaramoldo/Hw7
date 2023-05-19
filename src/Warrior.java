public class Warrior extends Hero {
    @Override
    public void applySuperAbility() {
        setTypeSuperAbility("Вихрь");
        System.out.println("Warrior применил суперспособность " + this.getTypeSuperAbility());
    }
}