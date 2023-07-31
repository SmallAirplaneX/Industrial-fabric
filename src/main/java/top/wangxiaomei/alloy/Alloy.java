package top.wangxiaomei.alloy;

import net.minecraft.block.AbstractBlock;
import net.minecraft.item.Item;
import top.wangxiaomei.thing.Thing;

public class Alloy extends Thing<Alloy> {

    public Alloy(String name) {
        super(name);
    }

    @Override
    public Alloy setBlock(AbstractBlock.Settings blockSettings) {
        return null;
    }

    @Override
    public Alloy setItem(Item.Settings itemSettings) {
        this.item = new Alloy_Item(itemSettings);
        return this;
    }

    @Override
    public Alloy setItem(String str, Item.Settings itemSettings) {
        this.itemDescription = str;
        this.item = new Alloy_Item(itemSettings);
        return this;
    }
}
