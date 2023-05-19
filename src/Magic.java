public class Magic extends Hero{

    @Override
    public void applySuperAbility() {
        setTypeSuperAbility("Огненный шар");
        System.out.println("Magic применил суперспособность " + this.getTypeSuperAbility());
    }
}
