import java.util.ArrayList;

import javax.swing.Action;

public class Guerrier {

    ArrayList<BehaviorAction> actions;
    String name;
    int lvl;

    public Guerrier(String name){

        this.actions = new ArrayList<BehaviorAction>();
        this.addAction(new BehaviorAction(){
            public void taper(){
                System.out.println("Je suis "+name+" et je tape comme une buse");
            }
        }).setName("default");

        this.name =name;
        this.lvl = 1;
        
        
    }

    public ArrayList<BehaviorAction> getActions() {
        return actions;
    }

    public BehaviorAction addAction(BehaviorAction action) {
        this.actions.add(action);
        return action;
    }
    
    public void taper(){
        for (BehaviorAction action : this.getActions()) {
            if (action.is("default")) {
                action.taper();
            }
        }
    }
    public void taper(String attack){
        for (BehaviorAction action : this.getActions()) {
            if (action.is(attack)) {
                action.taper();
                return;
            }
        }
        this.taper();
    }

    public void levelUp(){

        this.lvl++;
        
        if (lvl == 2) {
            this.addAction(new BehaviorAction(){
                public void taper(){
                    System.out.println("Je suis "+name+" et je tape en faisant des moulinés stylés avec mon épée");
                }
            });
            this.addAction(new BehaviorAction(){
                @Override
                public void taper() {
                    System.out.println("Je suis "+name+" et je tape avec mon attaque sépciale BRUTAL ATTACK !!!");
                }
            }).setName("brutal attaque");;
        }
        if (lvl == 3) {
            this.addAction(new BehaviorAction(){
                @Override
                public void taper() {
                    System.out.println("Je suis "+name+" et je tape avec mon attaque sépciale BERSERK ATTACK !!!");
                }
            }).setName("Berserk attaque");;
        }
       
};
}
