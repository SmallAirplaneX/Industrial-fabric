package top.wangxiaomei.ore.fragment;

import net.minecraft.item.Item;
import top.wangxiaomei.thing.Thing;
import top.wangxiaomei.thing.Things;

public class Ore_Fragments {
    public static final Thing<Ore_Fragment> COPPER_FRAGMENT = Things.register(new Ore_Fragment("copper_fragment")
            .setItem(new Item.Settings()));

    public static final Thing<Ore_Fragment> ALUMINUM_FRAGMENT = Things.register(new Ore_Fragment("aluminum_fragment")
            .setItem(new Item.Settings()));

    public static final Thing<Ore_Fragment> IRON_FRAGMENT = Things.register(new Ore_Fragment("iron_fragment")
            .setItem(new Item.Settings()));

    public static final Thing<Ore_Fragment> MAGNESIUM_FRAGMENT = Things.register(new Ore_Fragment("magnesium_fragment")
            .setItem(new Item.Settings()));

    public static final Thing<Ore_Fragment> NICKEL_FRAGMENT = Things.register(new Ore_Fragment("nickel_fragment")
            .setItem(new Item.Settings()));

    public static final Thing<Ore_Fragment> LEAD_FRAGMENT = Things.register(new Ore_Fragment("lead_fragment")
            .setItem(new Item.Settings()));

    public static final Thing<Ore_Fragment> TITANIUM_FRAGMENT = Things.register(new Ore_Fragment("titanium_fragment")
            .setItem(new Item.Settings()));

    public static final Thing<Ore_Fragment> ZINC_FRAGMENT = Things.register(new Ore_Fragment("zinc_fragment")
            .setItem(new Item.Settings()));

    public static final Thing<Ore_Fragment> TIN_FRAGMENT = Things.register(new Ore_Fragment("tin_fragment")
            .setItem(new Item.Settings()));

    public static final Thing<Ore_Fragment> TUNGSTEN_FRAGMENT = Things.register(new Ore_Fragment("tungsten_fragment")
            .setItem(new Item.Settings()));

    public static void load() {
    }
}
