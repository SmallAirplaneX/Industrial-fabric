package top.wangxiaomei.ore.metal;

import net.minecraft.block.AbstractBlock;
import net.minecraft.item.Item;
import top.wangxiaomei.ore.fragment.Ore_Fragment_Item;
import top.wangxiaomei.thing.Thing;

public class Metal extends Thing<Metal> {
    public Metal(String name) {
        super(name);
    }

    @Override
    public Metal setBlock(AbstractBlock.Settings blockSettings) {
        return null;
    }

    @Override
    public Metal setItem(Item.Settings itemSettings) {
        this.item = new Ore_Fragment_Item(itemSettings);
        return this;
    }

    @Override
    public Metal setItem(String str, Item.Settings itemSettings) {
        this.itemDescription = str;
        this.item = new Ore_Fragment_Item(itemSettings);
        return this;
    }
}
