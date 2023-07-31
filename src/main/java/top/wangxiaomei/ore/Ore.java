package top.wangxiaomei.ore;

import net.minecraft.block.AbstractBlock;
import net.minecraft.item.Item;
import top.wangxiaomei.thing.Thing;

public class Ore extends Thing<Ore> implements Crushable {

    public Ore(String name) {
        super(name);
    }

    @Override
    public Ore setBlock(AbstractBlock.Settings blockSettings) {
        this.block = new Ore_Block(blockSettings);
        return this;
    }

    @Override
    public Ore setItem(Item.Settings itemSettings) {
        this.item = new Ore_BlockItem(this.block, itemSettings);
        return this;
    }

    @Override
    public Ore setItem(String str, Item.Settings itemSettings) {
        this.itemDescription = str;
        this.item = new Ore_BlockItem(this.block, itemSettings);
        return this;
    }

    @Override
    public void crush() {

    }
}
