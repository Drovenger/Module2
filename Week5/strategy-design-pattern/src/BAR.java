@SuppressWarnings("ALL")
class BAR extends StrategySearch {
    private int state = 1;

    @Override
    void preProcess() {
        System.out.println("PreProcess");
    }

    @Override
    boolean search() {
        System.out.println("Search-" + state++ + " ");
        return state == 3 ? true : false;
    }

    @Override
    void postProcess() {
        System.out.println("PostProcess");
    }
}
