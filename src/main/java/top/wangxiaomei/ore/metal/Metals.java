package top.wangxiaomei.ore.metal;

import net.minecraft.item.Item;
import top.wangxiaomei.thing.Thing;
import top.wangxiaomei.thing.Things;

public class Metals {
    public static final Thing<Metal> COPPER_METAL = Things.register(new Metal("copper_metal")
            .setItem(new Item.Settings()));
    public static final Thing<Metal> ALUMINUM_METAL = Things.register(new Metal("aluminum_metal")
            .setItem(new Item.Settings()));
    public static final Thing<Metal> IRON_METAL = Things.register(new Metal("iron_metal")
            .setItem(new Item.Settings()));
    public static final Thing<Metal> MAGNESIUM_METAL = Things.register(new Metal("magnesium_metal")
            .setItem(new Item.Settings()));
    public static final Thing<Metal> NICKEL_METAL = Things.register(new Metal("nickel_metal")
            .setItem(new Item.Settings()));
    public static final Thing<Metal> LEAD_METAL = Things.register(new Metal("lead_metal")
            .setItem(new Item.Settings()));
    public static final Thing<Metal> TITANIUM_METAL = Things.register(new Metal("titanium_metal")
            .setItem(new Item.Settings()));
    public static final Thing<Metal> ZINC_METAL = Things.register(new Metal("zinc_metal")
            .setItem(new Item.Settings()));
    public static final Thing<Metal> TIN_METAL = Things.register(new Metal("tin_metal")
            .setItem(new Item.Settings()));
    public static final Thing<Metal> TUNGSTEN_METAL = Things.register(new Metal("tungsten_metal")
            .setItem(new Item.Settings()));

    public static void load() {
    }
}
