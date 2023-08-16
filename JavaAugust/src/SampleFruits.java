class Mango {
    public void Season() {
        System.out.println("Mango is the best");
    }
}

class Apple {
    public void Season() {
        System.out.println("Apple is the best");
    }
}

class Grape {
    public void Season() {
        System.out.println("Grape is the best");
    }
}

public class SampleFruits {
    public static void main(String args[]) {
        Mango Fruit1 = new Mango();
        Apple Fruit2 = new Apple();
        Grape Fruit3 = new Grape();
        Fruit1.Season();
        Fruit2.Season();
        Fruit3.Season();
    }
}
