package com.graphicol.graph;

import java.util.List;

public interface INode<E> {
    List<ILink<E>> getLinks();

    void addLink(final ILink<E> link);

    E getValue();

    void setValue(final E value);
}
