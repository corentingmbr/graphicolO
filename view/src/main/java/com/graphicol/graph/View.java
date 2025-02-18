package com.graphicol.graph;

public class View implements IView {
    private IModel model;
    private IController controller;

    @Override
    public void setModel(final IModel model) {
        this.model = model;
    }

    @Override
    public void setController(final IController controller) {
        this.controller = controller;
    }
}
