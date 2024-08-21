package Workers;

import Animals.Animal;
import Animals.Speaking;
import Food.Food;

public class Worker {
    public void feed(Animal animal, Food food){
        animal.Eat(food);
    }
    public <T extends Animal & Speaking> void getVoice(T animal){
        animal.Speak();
    }
}
