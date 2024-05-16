package aula4.observer;

public class ConcreteObserver implements Observer {
    public void update(int state) {
        System.out.println("State updated: " + state);
    }
}
