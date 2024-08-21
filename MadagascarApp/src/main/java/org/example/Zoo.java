package org.example;

import Animals.*;
import Food.*;
import Workers.Worker;

public class Zoo {
    public static void main(String[] args) {
        //cоздание животных
        Puma Bagira = new Puma();
        Tiger Shirhan = new Tiger();
        Duck blackDuck = new Duck();
        Elephant Dambo = new Elephant();
        Fish fish = new Fish();

        //создание еды
        Banana banana = new Banana();
        Berry berry = new Berry();
        Grass grass = new Grass();
        FishFillet fishFillet = new FishFillet();
        BeefSteak beefSteak = new BeefSteak();

        //Создание работника
        Worker worker = new Worker();

        //Работник кормит животных
        worker.feed(Bagira, fishFillet);
        worker.feed(blackDuck, banana);
        worker.feed(blackDuck, grass);
        worker.feed(blackDuck, grass);

        worker.feed(blackDuck, banana);

        worker.feed(Shirhan, grass);
        worker.feed(Dambo, beefSteak);

        //Работник вызывает голос
        worker.getVoice(Dambo);
        //worker.getVoice(fish);  данная команда не даст скомпилироваться программе
        worker.getVoice(Shirhan);
        worker.getVoice(Bagira);



        //создание озера и запуск туда животных
        Fish nemo = new Fish();
        Fish goldFish = new Fish();
        Duck duck = new Duck();
        Floating[] lake = {nemo, goldFish, duck};
        for (Floating animal: lake) {
            animal.Float();
        }

    }
}
