package test;

class Single {
    private Single single = new Single();

    public Single() {
    }

    public Single getSingle(Single single) {
        return single;
    }
}

class Single2 {
    private Single2 single2 = null;

    public Single2() {
    }

    public Single2 getSingle2(Single2 single2) {
        if (single2 == null) {
            new Single2();
        }
        return single2;
    }
}
