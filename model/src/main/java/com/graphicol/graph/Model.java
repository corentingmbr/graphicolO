package com.graphicol.graph;

public class Model implements IModel {
    private IGraph<INode<String>> graph = new Graph<>();

    public Model() {
        graph.loadFromJson("AventuriersDuRailEurope.json");
    }
}
