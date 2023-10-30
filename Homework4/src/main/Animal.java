public class Animal {

    private String name;
    private int runLimit;
    private int swimLimit;
    private static int animalCount = 0;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        animalCount++;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробіг " + distance + " м");
        } else {
            System.out.println(name + " не зміг пробігти " + distance + " м");
        }
    }

    public void swim(int distance) {
        if (swimLimit <= 0) {
            System.out.println(name + " не вміє плавати");
        } else if (distance <= swimLimit) {
            System.out.println(name + " проплив " + distance + " м");
        } else {
            System.out.println(name + " не зміг пропливти " + distance + " м");
        }
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}
