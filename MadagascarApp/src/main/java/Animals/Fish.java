package Animals;

public class Fish extends Herbivore implements Floating{
    int MaxWeight = 5;
    @Override
    public void Float() {
        System.out.println("Рыба плывет");
    }
}
