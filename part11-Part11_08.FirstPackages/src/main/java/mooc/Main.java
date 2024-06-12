package mooc;

import mooc.logic.ApplicationLogic;
import mooc.ui.TextInterface;
import mooc.ui.UserInterface;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello packages!");
        UserInterface ui = new TextInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
