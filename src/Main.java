import animal.*;
import helpper.AnimalType;
import helpper.CommandData;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        List<Animal> animals= new ArrayList<Animal>();

        Scanner scanner= new Scanner(System.in);
        boolean isRunning =true;
        while (isRunning) {
            System.out.println("Введите команду ADD/LIST/EXIT");
            String command = scanner.next();
            String filterCommand = command.trim().toUpperCase();
            try {
                CommandData commandData = CommandData.valueOf(filterCommand);
                switch (commandData) {
                    case ADD: {
                        AnimalType animalType = null;
                        while (animalType == null){
                            System.out.println("Введите  тип животного dog/cat/duck");
                            String typeAnimal = scanner.next();
                            String filterTypeAnimal = typeAnimal.trim().toUpperCase();
                            try {
                                animalType = AnimalType.valueOf(filterTypeAnimal);
                            }catch (Exception exception){
                                System.out.println("Тип животного введен не корректно");
                            }
                        }
                        System.out.println("Введите имя");
                        String name = scanner.next();

                        Integer age = null;
                        while (age==null){
                            try {
                                System.out.println("введите возраст цифрой");
                                age = Integer.parseInt(scanner.next());
                            }catch (Exception e){
                                System.out.println("Возраст введен не корректно.");
                            }
                        }

                        Integer weight = null;
                        while (weight==null){
                            try {
                                System.out.println("введите вес цифрой");
                                weight = Integer.parseInt(scanner.next());
                            }catch (Exception e){
                                System.out.println("Вес введен не корректно.");
                            }
                        }

                        System.out.println(" Ведите цвет");
                        String color = scanner.next();
                        switch (animalType){
                            case DOG :{
                                Animal  dog = new Dog(name,age,weight,color);
                                animals.add(dog);
                                break;
                            }
                            case CAT :{
                                Animal  cat = new Cat(name,age,weight,color);
                                animals.add(cat);
                                break;
                            }
                            case DUCK: {
                                Animal  duck = new Duck(name,age,weight,color);
                                animals.add(duck);
                                break;
                            }
                        }
                    break;
                    }


                    case LIST: animals.forEach(element-> {
                        System.out.println(element.toString());
                        element.say();
                        if (element instanceof IFlying){
                            ((IFlying) element).fly();
                        }
                    });

                        break;

                    case EXIT: {
                        isRunning=false;
                        System.out.println("Программа заверщина");
                        break;}

                }
            } catch (Exception exception) {
                System.out.println("Команда  " + command + "  отсутствует. Введите команду из списка");
            }
        }
    }
}