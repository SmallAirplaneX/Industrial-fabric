package top.wangxiaomei;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.wangxiaomei.alloy.Alloys;
import top.wangxiaomei.machine.Machines;
import top.wangxiaomei.ore.Ores;
import top.wangxiaomei.ore.metal.Metals;
import top.wangxiaomei.thing.Thing_BlockEntity;
import top.wangxiaomei.thing.Thing_Group;

public class IndustrialMod implements ModInitializer {
    public static final String MOD_ID = "Industrial".toLowerCase();
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final RegistryKey<PlacedFeature> CUSTOM_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID, "ore_custom"));

    //	public static final BlockEntityType<Machine_BlockEntity> BOX_BLOCK_ENTITY= Registry.register(
//			Registries.BLOCK_ENTITY_TYPE,
//			new Identifier(MOD_ID, "box_block"),
//			BlockEntityType.Builder.create(Machine_BlockEntity::new, Machines.打粉机.getBlock()).build(null));
    @Override
    public void onInitialize() {
        LOGGER.info("<----------------------------工业革命已加载！---------------------------->");
        Ores.load();
        Machines.load();
        Metals.load();
        Alloys.load();
        Thing_Group.load();
        Thing_BlockEntity.load();
        //自定义矿物
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, CUSTOM_ORE_PLACED_KEY);

//		AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
//			var playerName = player.getDisplayName().copy();
//			var entityName = entity.getDisplayName().copy();
//
//			return ActionResult.SUCCESS;
//		});
    }

}