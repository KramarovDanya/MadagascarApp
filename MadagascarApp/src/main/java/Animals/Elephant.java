package Animals;

public class Elephant extends Herbivore implements Speaking, Running {
    private String sound = "tytyty";
    int MaxWeight = 55;
    @Override
    public void Speak() {
        System.out.println(sound);
    }

    @Override
    public void Run() {
        System.out.println("слон бежит");
    }
}
