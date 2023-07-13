package animals;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void printAge() {
        System.out.println("This dog's age is " + this.getAge());
    }
}
