package Animals;

public class Tiger extends Predator implements Speaking, Running{
    int MaxWeight = 33;
    private String sound = "aRRR";
    @Override
    public void Speak() {
        System.out.println(sound);
    }

    @Override
    public void Run() {
        System.out.println("Тигр бежит");
    }
}
