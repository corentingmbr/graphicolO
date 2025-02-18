package com.graphicol.graph;

import com.google.gson.Gson;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Graph<E> implements IGraph<E> {
    private final List<INode<E>> nodes = new ArrayList<>();

    @Override
    public List<INode<E>> getNodes() {
        return this.nodes;
    }

    @Override
    public void addNodes(final @NotNull INode<E> node) {
        if (this.nodes.contains(node)) return;
        this.nodes.add(node);
    }

    @Override
    public void loadFromJson(final Gson json) {
        
    }

    @Override
    public Gson toJson() {
        return null;
    }
}
