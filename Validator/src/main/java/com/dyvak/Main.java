package com.dyvak;

/**
 * Main.java
 * <p>
 * Start point of the validation.
 * Here we will start controller {@link Controller}
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 5.11.2016.
 */
public class Main {

    public static void main(String[] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();
    }

}
