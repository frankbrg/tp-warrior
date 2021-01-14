import javax.swing.Action;

public class Guerrier {
    IAction action;
    String name;
    public Guerrier(String name){
        this.action=new IAction(){
            public void taper(){
                System.out.println("Je suis "+name+" et je tape comme une buse");
            }
        };
        this.name =name;
        
        
    }

    public IAction getAction() {
        return action;
    }

    public void setAction(IAction action) {
        this.action = action;
    }

    public void taper(){
        this.action.taper();
    }

    public void levelUp(){
        this.setAction(new IAction(){
            public void taper(){
                System.out.println("Je suis "+name+" et je tape en faisant des moulinés stylés avec mon épée");
            }
        });
       
};
}
