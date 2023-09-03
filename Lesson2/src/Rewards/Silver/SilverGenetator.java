package Rewards.Silver;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class SilverGenetator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new SilverRevards();
    }
    
}
