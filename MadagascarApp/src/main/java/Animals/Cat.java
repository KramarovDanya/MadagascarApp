package Animals;

public class Cat  extends Predator  implements Speaking, Running{

    private String sound = "meow";

    public Cat(){
        this.MaxWeight = 12;
    }

    @Override
    public void Speak() {
        System.out.println(sound);

    }

    @Override
    public void Run() {
        System.out.println("Кошка бежит");
    }
}
