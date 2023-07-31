package top.wangxiaomei.ore.fragment;

import net.minecraft.block.AbstractBlock;
import net.minecraft.item.Item;
import top.wangxiaomei.ore.Smeltable;
import top.wangxiaomei.thing.Thing;

public class Ore_Fragment extends Thing<Ore_Fragment> implements Smeltable {

    public Ore_Fragment(String name) {
        super(name);
    }

    @Override
    public void Smelt() {

    }

    @Override
    public Ore_Fragment setBlock(AbstractBlock.Settings blockSettings) {
        return null;
    }

    @Override
    public Ore_Fragment setItem(Item.Settings itemSettings) {
        this.item = new Ore_Fragment_Item(itemSettings);
        return this;
    }

    @Override
    public Ore_Fragment setItem(String str, Item.Settings itemSettings) {
        this.itemDescription = str;
        this.item = new Ore_Fragment_Item(itemSettings);
        return this;
    }
}
