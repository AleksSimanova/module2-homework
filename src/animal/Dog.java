package animal;

public class Dog extends Animal {
    public Dog(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }

    @Override
    public void say() {
        System.out.println("я говорю гав");
    }
    @Override
    public  void go(){
        System.out.println("Я хожу");
    }
}
