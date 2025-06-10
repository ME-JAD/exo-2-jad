package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo implements IFoo {
    private final IBaz baz;
    private final List<IBar> bars = new ArrayList<>();
    private IQux qux;
    private ICorge corge;

    public Foo(final IBaz baz) {
        this.baz = baz;
    }

    public IBaz getBaz() {
        return this.baz;
    }

    public List<IBar> getBars() {
        return this.bars;
    }

    public IQux getQux() {
        return this.qux;
    }

    public void setQux(final IQux qux) {
        this.qux = qux;
    }

    @Override
    public ICorge getCorge() {
        return this.corge;
    }

    @Override
    public void setCorge(final ICorge corge) {
        this.corge = corge;
    }

    public void addBar(final IBar bar) {
        if (!this.bars.contains(bar)) {
            this.bars.add(bar);
        }
    }
}
