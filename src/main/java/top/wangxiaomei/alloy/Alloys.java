package top.wangxiaomei.alloy;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import top.wangxiaomei.thing.Thing;
import top.wangxiaomei.thing.Things;

public class Alloys {
    public static Thing<Alloy> STEEL = Things.register(new Alloy("steel")
            .setItem(new FabricItemSettings()));

    public static void load() {

    }
}
