package top.wangxiaomei.thing;


import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public abstract class Things {
    public static <T extends Thing<T>> Thing<T> register(Thing<T> thing) {
        if (thing.block != null) {
            Registry.register(Registries.BLOCK, thing.identifier, thing.block);

        } else {
            if (thing.itemDescription.isEmpty())
                thing.itemDescription = "这玩意可不兴放在地上！";
        }
        if (thing.item != null) {
            Registry.register(Registries.ITEM, thing.identifier, thing.item);
            Thing_Group.add(thing.item);
        }

        return thing;
    }

}
