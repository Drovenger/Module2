@SuppressWarnings("ALL")
abstract class StrategySolution implements Strategy {
    abstract void start();

    abstract boolean nextTry();

    abstract boolean isSolution();

    abstract void stop();

    @Override
    public void solve() {
        start();
        while (nextTry() && !isSolution()) {
            stop();
        }
    }
}
