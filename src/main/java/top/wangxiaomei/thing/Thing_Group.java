package top.wangxiaomei.thing;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import top.wangxiaomei.ore.Ores;

import static top.wangxiaomei.IndustrialMod.MOD_ID;

public class Thing_Group {
    public static final RegistryKey<ItemGroup> ITEM_GROUP_REGISTRY_KEY = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "test_group"));
    public static final ItemGroup ITEM_GROUP = Registry.register(Registries.ITEM_GROUP, ITEM_GROUP_REGISTRY_KEY, FabricItemGroup.builder()
            .icon(() -> new ItemStack(Ores.COPPER_ORE.getItem()))
            .displayName(Text.translatable("industrial.test_group"))
            .build());

    public synchronized static void add(Item item) {
        ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP_REGISTRY_KEY).register(content -> {
            content.add(item);
        });
    }

    public static void load() {

    }

}
