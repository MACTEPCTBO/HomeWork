public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Боб", 2, "Белого");
        cat.getInfo();

        Dog dog = new Dog("Крипер", 3, "Чёрного");
        dog.getInfo();
    }
}
class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void getInfo() {
        System.out.println("Я кот моё имя " + name + ", мне : " + age + " лет, я : " + color + " цвета");
    }
}

class Dog extends Animal {public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Боб", 2, "Белого");
        cat.getInfo();

        Dog dog = new Dog("Крипер", 3, "Чёрного");
        dog.getInfo();
    }
}
class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void getInfo() {
        System.out.println("Я кот моё имя " + name + ", мне : " + age + " лет, я : " + color + " цвета");
    }
}

class Dog extends Animal {
    private String color;

    public Dog(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void getInfo() {
        System.out.println("Я собака моё имя " + name + ", мне : " + age + " лет, я : " + color + " цвета");
    }
}

    private String color;

    public Dog(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void getInfo() {
        System.out.println("Я собака моё имя " + name + ", мне : " + age + " лет, я : " + color + " цвета");
    }
}
