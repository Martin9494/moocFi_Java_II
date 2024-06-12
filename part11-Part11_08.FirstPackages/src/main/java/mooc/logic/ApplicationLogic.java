package mooc.logic;

import mooc.ui.UserInterface;

public class ApplicationLogic {

    private UserInterface myUi;
    public ApplicationLogic(UserInterface ui){
        this.myUi = ui;
        
    }
    public void execute(int times){
        for (int i = 0; i < times; i++){ 
            System.out.println("Application logic is working");    
            this.myUi.update();
              
        }
    }


}
