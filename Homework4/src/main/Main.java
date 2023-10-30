public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Бобік");
        Cat cat = new Cat("Мурка");

        dog.run(400);
        dog.swim(5);

        cat.run(250);
        cat.swim(2);

        System.out.println("Кількість створених тварин: " + Animal.getAnimalCount());
    }
}
