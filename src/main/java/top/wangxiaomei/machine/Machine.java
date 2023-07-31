package top.wangxiaomei.machine;

import net.minecraft.block.AbstractBlock;
import net.minecraft.item.Item;
import top.wangxiaomei.thing.Thing;

public class Machine extends Thing<Machine> {
    public Machine(String name) {
        super(name);
    }

    @Override
    public Machine setBlock(AbstractBlock.Settings blockSettings) {
        this.block = new Machine_Block(blockSettings);
        return this;
    }

    @Override
    public Machine setItem(Item.Settings itemSettings) {
        this.item = new Machine_BlockItem(this.block, itemSettings);
        return this;
    }

    @Override
    public Machine setItem(String str, Item.Settings itemSettings) {
        this.itemDescription = str;
        this.item = new Machine_BlockItem(this.block, itemSettings);
        return this;
    }
}
