package animal;

public abstract class Animal implements IAnimal {
    private String name;
    private int age;
    private int weight;
    private String color;

    public Animal(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public void say() {
        System.out.println("Я говорю");
    }

    @Override
    public void go() {
        System.out.println("Я хожу");
    }

    @Override
    public void drink() {
        System.out.println("Я пью");
    }

    @Override
    public void eat() {
        System.out.println("я ем");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "привет " +
                "меня зовут " + name + '\'' +
                ", мне "+ age +" "+ getYear() +
                ", я вещу " + weight + " кг" +
                ", мой цвет " + color + '\'';
    }

    private String getYear() {
        if (age < 20 && age > 10)
            return "лет";
        int remainsAge = age % 10;
        if (remainsAge == 1) {
            return "год";
        } else if (remainsAge < 5) {
            return "года";
        } else  {
            return "лет";
        }
    }
}

