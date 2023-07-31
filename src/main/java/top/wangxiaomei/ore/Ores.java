package top.wangxiaomei.ore;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import top.wangxiaomei.ore.fragment.Ore_Fragments;
import top.wangxiaomei.thing.Thing;
import top.wangxiaomei.thing.Things;


public class Ores extends Things {
    public static final Thing<Ore> COPPER_ORE = Things.register(new Ore("copper_ore")
            .setBlock(FabricBlockSettings.create().hardness(0.4f))
            .setItem(new FabricItemSettings()));
    public static final Thing<Ore> ALUMINUM_ORE = Things.register(new Ore("aluminum_ore")
            .setBlock(FabricBlockSettings.create().hardness(0.4f))
            .setItem(new FabricItemSettings()));
    public static final Thing<Ore> IRON_ORE = Things.register(new Ore("iron_ore")
            .setBlock(FabricBlockSettings.create().hardness(0.4f))
            .setItem(new FabricItemSettings()));
    public static final Thing<Ore> MAGNESIUM_ORE = Things.register(new Ore("magnesium_ore")
            .setBlock(FabricBlockSettings.create().hardness(0.4f))
            .setItem(new FabricItemSettings()));
    public static final Thing<Ore> NICKEL_ORE = Things.register(new Ore("nickel_ore")
            .setBlock(FabricBlockSettings.create().hardness(0.4f))
            .setItem(new FabricItemSettings()));
    public static final Thing<Ore> LEAD_ORE = Things.register(new Ore("lead_ore")
            .setBlock(FabricBlockSettings.create().hardness(0.4f))
            .setItem(new FabricItemSettings()));
    public static final Thing<Ore> TITANIUM_ORE = Things.register(new Ore("titanium_ore")
            .setBlock(FabricBlockSettings.create().hardness(0.4f))
            .setItem(new FabricItemSettings()));
    public static final Thing<Ore> ZINC_ORE = Things.register(new Ore("zinc_ore")
            .setBlock(FabricBlockSettings.create().hardness(0.4f))
            .setItem(new FabricItemSettings()));
    public static final Thing<Ore> TIN_ORE = Things.register(new Ore("tin_ore")
            .setBlock(FabricBlockSettings.create().hardness(0.4f))
            .setItem(new FabricItemSettings()));
    public static final Thing<Ore> TUNGSTEN_ORE = Things.register(new Ore("tungsten_ore")
            .setBlock(FabricBlockSettings.create().hardness(0.4f))
            .setItem(new FabricItemSettings()));


    public static void load() {
        Ore_Fragments.load();
    }


}
