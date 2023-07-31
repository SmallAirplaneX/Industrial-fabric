package top.wangxiaomei.thing;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import top.wangxiaomei.machine.Machine_BlockEntity;
import top.wangxiaomei.machine.Machines;

import static top.wangxiaomei.IndustrialMod.MOD_ID;

public class Thing_BlockEntity {
    public static void load() {
    }    public static BlockEntityType<Machine_BlockEntity> TEST_BLOCK_ENTITY_TYPE = Registry.register(
            Registries.BLOCK_ENTITY_TYPE, new Identifier(MOD_ID, "test_block_entity"),
            FabricBlockEntityTypeBuilder.create(Machine_BlockEntity::new, Machines.打粉机.getBlock())
                    .build()
    );


}
