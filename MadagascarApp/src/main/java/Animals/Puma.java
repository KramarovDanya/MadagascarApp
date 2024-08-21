package Animals;

import Food.Plant;

public class Puma extends Predator implements Speaking, Running {
    String sound = "rrr";
    int MaxWeight = 22;
    @Override
    public void Speak() {
        System.out.println(sound);
    }

    @Override
    public void Run() {

    }
}
