public class Boss extends GameEntity {
    private Weapon weapon;

    public Boss(int health, int damge, Weapon weapon) {
        super(health, damge);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printInfo() {
        return "Boss - health: " + getHealth() +
                ", damage; " + getDamage() + ", weapon: " +
                weapon.getName() + " (" + weapon.getType() + ")";
    }
}
