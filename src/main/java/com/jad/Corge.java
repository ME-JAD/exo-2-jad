package com.jad;

public class Corge implements ICorge {
    private IFoo foo;

    public Corge(final IFoo foo) {
        this.foo = foo;
    }

    @Override
    public IFoo getFoo() {
        return this.foo;
    }

    @Override
    public void setFoo(final IFoo foo) {
        if (this.foo != null && foo != null) {
            this.foo.setCorge(null);
        }
        this.foo = foo;
        if (this.foo.getCorge() != this) {
            this.foo.setCorge(this);
        }
    }
}
