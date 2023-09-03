package Rewards.Bronze;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class BronzeGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new BronzeRevards();
    }
    
}
