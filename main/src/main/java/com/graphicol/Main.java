package com.graphicol;

import com.graphicol.graph.*;


public class Main {
    public static void main(String[] args) {

        IView view = new View();
        IController controller = new Controller();
        IModel model = new Model();

        view.setModel(model);
        controller.setView(view);
        controller.setModel(model);


    }
}