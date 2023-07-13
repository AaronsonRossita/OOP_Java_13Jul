package animals;

public class Cat extends Animal implements Runnable{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void printName() {
        System.out.println("This cat's name is " + this.getName());
    }

    @Override
    public void printAge() {
        System.out.println("This cat's age is " + this.getAge());
    }
}
