public class StrategyDemo {
    private static void execute(Strategy strategy) {
        strategy.solve();
    }

    public static void main(String[] args) {
        Strategy[] algorithms = {new F00(), new BAR()};
        for (Strategy algorithm : algorithms) {
            execute(algorithm);
        }
    }
}
