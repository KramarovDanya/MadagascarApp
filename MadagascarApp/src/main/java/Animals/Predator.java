package Animals;

import Food.Food;
import Food.Meat;

public abstract class Predator extends Animal {
    @Override
    public  void Eat(Food food) {

        if (weight < MaxWeight){
            if (food instanceof Meat){
                System.out.println("Я поел мяса");
                weight += food.GetCalorieValue();
                System.out.println("И теперь вешу " + weight + " kg");
            }
            else{
                System.out.println("Я не могу кушать траву");
            }
        }
        else {
            System.out.println("Я слишком сыт");
        }

    }
}
