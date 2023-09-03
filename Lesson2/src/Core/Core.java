package Core;

import Abstractions.ItemGenerator;
import Rewards.Bronze.BronzeGenerator;
import Rewards.Gold.GoldGenerator;
import Rewards.Silver.SilverGenetator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Core {
    // Логика игры
    public void run() {
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new BronzeGenerator());
        generatorList.add(new SilverGenetator());
        ItemGenerator myGenerator = generatorList.get((int) Math.round(Math.random()*2));
        System.out.println("Alex gets "+myGenerator.openReward());
    }
}
