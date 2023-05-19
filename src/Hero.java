public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private String typeSuperAbility;

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String getTypeSuperAbility() {
        return typeSuperAbility;
    }

    public void setTypeSuperAbility(String typeSuperAbility) {
        this.typeSuperAbility = typeSuperAbility;
    }

    public void applySuperAbility() {
        System.out.println("Герой применил способность" + this.typeSuperAbility);
    }
}