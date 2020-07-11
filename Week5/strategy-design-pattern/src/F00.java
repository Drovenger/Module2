class F00 extends StrategySolution {
    private int state = 1;

    protected void start() {
        System.out.println("Start");
    }

    protected void stop() {
        System.out.println("Stop");
    }

    protected boolean nextTry() {
        System.out.println("Next try-" + state++ + " ");
        return (state == 3);
    }

    protected boolean isSolution() {
        System.out.println("IsSolution-" + (state == 3) + " ");
        return (state == 3);
    }
}
