package top.wangxiaomei.machine;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import top.wangxiaomei.thing.Thing;
import top.wangxiaomei.thing.Things;

public class Machines {
    public static Thing<Machine> 打粉机 = Things.register(new Machine("powderBeater")
            .setBlock(FabricBlockSettings.copyOf(Blocks.STONE))
            .setItem(new FabricItemSettings()));
    public static Thing<Machine> 碎石机 = Things.register(new Machine("lithotripser")
            .setBlock(FabricBlockSettings.copyOf(Blocks.STONE))
            .setItem(new FabricItemSettings()));


    public static void load() {
    }
}
