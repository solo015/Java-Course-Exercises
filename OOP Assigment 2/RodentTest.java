public class RodentTest {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[3];
        rodents[0] = new Mouse();
        rodents[1] = new Gerbil();
        rodents[2] = new Hamster();

        for (Rodent r : rodents) {
            r.eat();
            r.sleep();
            r.run();
            System.out.println();
        }
    }
}
class Rodent {
    public void eat() {
        System.out.println("Rodent is eating.");
    }

    public void sleep() {
        System.out.println("Rodent is sleeping.");
    }

    public void run() {
        System.out.println("Rodent is running.");
    }
}

class Mouse extends Rodent {
    @Override
    public void eat() {
        System.out.println("Mouse is eating cheese.");
    }

    @Override
    public void sleep() {
        System.out.println("Mouse is sleeping in a burrow.");
    }

    @Override
    public void run() {
        System.out.println("Mouse is running on a wheel.");
    }
}

class Gerbil extends Rodent {
    @Override
    public void eat() {
        System.out.println("Gerbil is eating seeds.");
    }

    @Override
    public void sleep() {
        System.out.println("Gerbil is sleeping in a nest.");
    }

    @Override
    public void run() {
        System.out.println("Gerbil is running in a maze.");
    }
}

class Hamster extends Rodent {
    @Override
    public void eat() {
        System.out.println("Hamster is eating pellets.");
    }

    @Override
    public void sleep() {
        System.out.println("Hamster is sleeping in a cage.");
    }

    @Override
    public void run() {
        System.out.println("Hamster is running on a wheel.");
    }
}


