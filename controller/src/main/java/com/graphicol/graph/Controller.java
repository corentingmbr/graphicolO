package com.graphicol.graph;

import org.jetbrains.annotations.NotNull;

public class Controller implements IController {
    private IView view;
    private IModel model;

    @Override
    public void setView(@NotNull final IView view) {
        this.view = view;
        this.view.setController(this);
        this.view.setModel(this.model);
    }

    @Override
    public void setModel(final IModel model) {
        this.model = model;
    }
}
