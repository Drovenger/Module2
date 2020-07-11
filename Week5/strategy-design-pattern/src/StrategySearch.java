abstract class StrategySearch implements Strategy {
    abstract void preProcess();

    abstract boolean search();

    abstract void postProcess();

    @Override
    public void solve() {
        while (true) {
            preProcess();
            if (search()) {
                break;
            }
            postProcess();
        }
    }
}
