package Animals;


import Food.Food;
import Food.Plant;

public abstract class Herbivore extends Animal {

    @Override
    public void Eat(Food food) {
        if (weight < MaxWeight){
            if (food instanceof Plant){
                System.out.println("Я поел растений");
                weight += food.GetCalorieValue();
                System.out.println("И теперь вешу " + weight + " kg");
            }
            else{
                System.out.println("Я не могу кушать мясо");
            }
        }
        else {
            System.out.println("Я слишком сыт");
        }



    }
}
