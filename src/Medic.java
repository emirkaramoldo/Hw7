public class Medic extends Hero{
    @Override
    public void applySuperAbility() {
        setTypeSuperAbility("Омоложение");
        System.out.println("Medic применил суперспособность " + this.getTypeSuperAbility());
    }
}