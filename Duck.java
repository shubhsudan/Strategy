public class Duck
{
    public void quack() {
        System.out.println("Quack Quack!");
    }

    public void fly() {
        System.out.println("I'm flying!");
    }
}

class MallardDuck extends Duck {
    public MallardDuck()
    {
        super();
    }
}

class RedheadDuck extends Duck {

}

class RubberDuck extends Duck {
    public RubberDuck() {
        super();
    }

    public void quack() {
        System.out.println("Squeak Squeak!");
    }
}

class DecoyDuck extends Duck {
    public DecoyDuck() {
        super();
    }

    public void fly() {
        System.out.println("I can't fly, I'm a decoy!");
    }

    Duck mallard = new MallardDuck();
    Duck redhead = new RedheadDuck();
    Duck rubber = new RubberDuck();
    Duck decoy = new DecoyDuck();
}