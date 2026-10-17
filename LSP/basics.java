//bad design
class Bird {
    void fly() {
        System.out.println("Flying");
    }
}

class Sparrow extends Bird {
}

class Penguin extends Bird {
    @Override
    void fly() {
        throw new UnsupportedOperationException(
            "Penguins cannot fly"
        );
    }
}
//better design
interface Bird {
    void eat();
}

interface FlyingBird extends Bird {
    void fly();
}

class Sparrow implements FlyingBird {
    public void eat() {
        System.out.println("Sparrow eating");
    }

    public void fly() {
        System.out.println("Sparrow flying");
    }
}

class Penguin implements Bird {
    public void eat() {
        System.out.println("Penguin eating");
    }
}