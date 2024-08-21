package Animals;

import Food.Food;

public abstract class Animal {
    private String name = "it animal";
    protected int MaxWeight = 50;
    protected int weight = 1;


    private void Move(){};
    public String GetName(){
        return this.name;
    };

    public void SetName(String name){
        this.name = name;
    };

    public int GetWeight(){return weight;};

    public abstract void Eat(Food food);



}
