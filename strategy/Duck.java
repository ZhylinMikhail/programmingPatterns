package strategy;

public class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void quack() {

        quackBehavior.quack();
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void display() {


    }
}
