public abstract class Weapon implements BehaviorWeapon {
    private BehaviorWeapon behaviorWeapon;

    public Weapon(BehaviorWeapon behaviorWeapon) {
        this.setBehaviorWeapon(behaviorWeapon);
    }

    public void use(){
        this.getBehaviorWeapon().use();
    }

    public BehaviorWeapon getBehaviorWeapon() {
        return behaviorWeapon;
    }

    public void setBehaviorWeapon(BehaviorWeapon behaviorWeapon) {
        this.behaviorWeapon = behaviorWeapon;
    }
}
