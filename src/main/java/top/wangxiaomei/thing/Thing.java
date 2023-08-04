package top.wangxiaomei.thing;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import static top.wangxiaomei.IndustrialMod.MOD_ID;

public abstract class Thing<T extends Thing<T>> {
    protected Block block;
    protected Item item;
    protected Identifier identifier;
    protected String itemDescription;

    public Thing(String name) {
        this.itemDescription = name;
        this.identifier = new Identifier(MOD_ID, name.toLowerCase());
    }

    public abstract Thing<T> setItem(String str, Item.Settings itemSettings);

    public Block getBlock() {
        return block;
    }
    public Identifier getIdentifier() {
        return identifier;
    }

    public abstract Thing<T> setBlock(AbstractBlock.Settings blockSettings);

    public Item getItem() {
        return item;
    }

    public abstract Thing<T> setItem(Item.Settings itemSettings);
}
