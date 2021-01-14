import javax.swing.Action;

public class Guerrier {
    BehaviorAction action;
    String name;
    int lvl;
    public Guerrier(String name){
        this.action=new BehaviorAction(){
            public void taper(){
                System.out.println("Je suis "+name+" et je tape comme une buse");
            }
        };
        this.name =name;
        this.lvl = 1;
        
        
    }

    public BehaviorAction getAction() {
        return action;
    }

    public void setAction(BehaviorAction action) {
        this.action = action;
    }

    public void taper(){
        this.action.taper();
    }
    public void taper(String attack){

        this.action.taper(attack);
    }

    public void levelUp(){

        if (this.getAction() == new BehaviorAction(){
                public void taper(){
                    System.out.println("Je suis "+name+" et je tape en faisant des moulinés stylés avec mon épée");
                }
        }) {
            this.setAction(new BehaviorAction(){
                public void taper(){
                    System.out.println("Je suis "+name+" et je tape en faisant des moulinés stylés avec mon épée");
                }
                public void taper(String attack){
                    switch (attack) {
                        case "brutal attaque":
                            if (lvl >= 2) {
                                System.out.println("Je suis "+name+" et je tape avec mon attaque sépciale BRUTAL ATTACK");
                            }     
                            break;
                        
                        case "Berserk attaque":
                            if (lvl >= 3) {
                                System.out.println("Je suis "+name+" et je tape avec mon attaque sépciale BERSERK ATTACK");
                            }else{
                                this.taper();
                            }
                            break;
                
                        default:
                            break;
                    }
                }
            });
        }
        this.setAction(new BehaviorAction(){
            public void taper(){
                System.out.println("Je suis "+name+" et je tape en faisant des moulinés stylés avec mon épée");
            }
        });

       
};
}
