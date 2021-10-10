package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer has started pushing things!");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer has stopped pushing things!");
    }
}