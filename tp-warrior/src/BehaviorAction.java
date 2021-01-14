public abstract class BehaviorAction {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean is(String name) {
        return name.equals(this.getName());
    }
    public abstract void taper();

}