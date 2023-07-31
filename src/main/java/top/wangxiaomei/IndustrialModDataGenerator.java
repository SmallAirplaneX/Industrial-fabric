package top.wangxiaomei;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import top.wangxiaomei.alloy.Alloys;
import top.wangxiaomei.machine.Machines;
import top.wangxiaomei.ore.Ores;
import top.wangxiaomei.ore.fragment.Ore_Fragments;
import top.wangxiaomei.ore.metal.Metals;
import top.wangxiaomei.thing.Thing_Group;


public class IndustrialModDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        //汉化文件生成
        pack.addProvider(MyModEnglishLangProvider::new);
        //掉落物生成
        pack.addProvider(MyBlockLootTables::new);
        //模型生成
        pack.addProvider(MyModelGenerator::new);
    }

    private static class MyModEnglishLangProvider extends FabricLanguageProvider {
        private MyModEnglishLangProvider(FabricDataOutput dataGenerator) {
            super(dataGenerator, "zh_cn");
        }

        @Override
        public void generateTranslations(TranslationBuilder translationBuilder) {
            //物品
            translationBuilder.add(Ores.COPPER_ORE.getItem(), "铜矿石");
            translationBuilder.add(Ores.ALUMINUM_ORE.getItem(), "铝矿石");
            translationBuilder.add(Ores.IRON_ORE.getItem(), "铁矿石");
            translationBuilder.add(Ores.MAGNESIUM_ORE.getItem(), "镁矿石");
            translationBuilder.add(Ores.NICKEL_ORE.getItem(), "镍矿石");
            translationBuilder.add(Ores.LEAD_ORE.getItem(), "铅矿石");
            translationBuilder.add(Ores.TITANIUM_ORE.getItem(), "钛矿石");
            translationBuilder.add(Ores.ZINC_ORE.getItem(), "锌矿石");
            translationBuilder.add(Ores.TIN_ORE.getItem(), "锡矿石");
            translationBuilder.add(Ores.TUNGSTEN_ORE.getItem(), "钨矿石");

            translationBuilder.add(Ore_Fragments.COPPER_FRAGMENT.getItem(), "粉碎铜矿石");
            translationBuilder.add(Ore_Fragments.ALUMINUM_FRAGMENT.getItem(), "粉碎铝矿石");
            translationBuilder.add(Ore_Fragments.IRON_FRAGMENT.getItem(), "粉碎铁矿石");
            translationBuilder.add(Ore_Fragments.MAGNESIUM_FRAGMENT.getItem(), "粉碎镁矿石");
            translationBuilder.add(Ore_Fragments.NICKEL_FRAGMENT.getItem(), "粉碎镍矿石");
            translationBuilder.add(Ore_Fragments.LEAD_FRAGMENT.getItem(), "粉碎铅矿石");
            translationBuilder.add(Ore_Fragments.TITANIUM_FRAGMENT.getItem(), "粉碎钛矿石");
            translationBuilder.add(Ore_Fragments.ZINC_FRAGMENT.getItem(), "粉碎锌矿石");
            translationBuilder.add(Ore_Fragments.TIN_FRAGMENT.getItem(), "粉碎锡矿石");
            translationBuilder.add(Ore_Fragments.TUNGSTEN_FRAGMENT.getItem(), "粉碎钨矿石");

            translationBuilder.add(Metals.COPPER_METAL.getItem(), "铜锭");
            translationBuilder.add(Metals.ALUMINUM_METAL.getItem(), "铝锭");
            translationBuilder.add(Metals.IRON_METAL.getItem(), "铁锭");
            translationBuilder.add(Metals.MAGNESIUM_METAL.getItem(), "镁锭");
            translationBuilder.add(Metals.NICKEL_METAL.getItem(), "镍锭");
            translationBuilder.add(Metals.LEAD_METAL.getItem(), "铅锭");
            translationBuilder.add(Metals.TITANIUM_METAL.getItem(), "钛锭");
            translationBuilder.add(Metals.ZINC_METAL.getItem(), "锌锭");
            translationBuilder.add(Metals.TIN_METAL.getItem(), "锡锭");
            translationBuilder.add(Metals.TUNGSTEN_METAL.getItem(), "钨锭");

            translationBuilder.add(Alloys.STEEL.getItem(), "钢");


            translationBuilder.add(Machines.打粉机.getItem(), "打粉机");


            //物品组
            translationBuilder.add(Thing_Group.ITEM_GROUP_REGISTRY_KEY, "工业革命");
        }
    }

    private static class MyBlockLootTables extends FabricBlockLootTableProvider {
        public MyBlockLootTables(FabricDataOutput dataOutput) {
            super(dataOutput);
        }

        @Override
        public void generate() {
            addDrop(Ores.COPPER_ORE.getBlock(), drops(Ores.COPPER_ORE.getItem()));
            addDrop(Ores.ALUMINUM_ORE.getBlock(), drops(Ores.ALUMINUM_ORE.getItem()));
            addDrop(Ores.IRON_ORE.getBlock(), drops(Ores.IRON_ORE.getItem()));
            addDrop(Ores.MAGNESIUM_ORE.getBlock(), drops(Ores.MAGNESIUM_ORE.getItem()));
            addDrop(Ores.NICKEL_ORE.getBlock(), drops(Ores.NICKEL_ORE.getItem()));
            addDrop(Ores.LEAD_ORE.getBlock(), drops(Ores.LEAD_ORE.getItem()));
            addDrop(Ores.TIN_ORE.getBlock(), drops(Ores.TIN_ORE.getItem()));
            addDrop(Ores.TITANIUM_ORE.getBlock(), drops(Ores.TITANIUM_ORE.getItem()));
            addDrop(Ores.ZINC_ORE.getBlock(), drops(Ores.ZINC_ORE.getItem()));
            addDrop(Ores.TUNGSTEN_ORE.getBlock(), drops(Ores.TUNGSTEN_ORE.getItem()));
            addDrop(Machines.打粉机.getBlock(), drops(Machines.打粉机.getItem()));
        }
    }

    private static class MyModelGenerator extends FabricModelProvider {
        private MyModelGenerator(FabricDataOutput generator) {
            super(generator);
        }

        @Override
        public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
            blockStateModelGenerator.registerSimpleCubeAll(Ores.COPPER_ORE.getBlock());
            blockStateModelGenerator.registerSimpleCubeAll(Ores.ALUMINUM_ORE.getBlock());
            blockStateModelGenerator.registerSimpleCubeAll(Ores.IRON_ORE.getBlock());
            blockStateModelGenerator.registerSimpleCubeAll(Ores.MAGNESIUM_ORE.getBlock());
            blockStateModelGenerator.registerSimpleCubeAll(Ores.NICKEL_ORE.getBlock());
            blockStateModelGenerator.registerSimpleCubeAll(Ores.LEAD_ORE.getBlock());
            blockStateModelGenerator.registerSimpleCubeAll(Ores.TIN_ORE.getBlock());
            blockStateModelGenerator.registerSimpleCubeAll(Ores.TITANIUM_ORE.getBlock());
            blockStateModelGenerator.registerSimpleCubeAll(Ores.ZINC_ORE.getBlock());
            blockStateModelGenerator.registerSimpleCubeAll(Ores.TUNGSTEN_ORE.getBlock());


            blockStateModelGenerator.registerSimpleCubeAll(Machines.打粉机.getBlock());
        }

        @Override
        public void generateItemModels(ItemModelGenerator itemModelGenerator) {
//            itemModelGenerator.register(Ores.COPPER_ORE.getBlockItem(), Models.GENERATED);
//            itemModelGenerator.register(Ores.ALUMINUM_ORE.getBlockItem(), Models.GENERATED);
//            itemModelGenerator.register(Ores.IRON_ORE.getBlockItem(), Models.GENERATED);
//            itemModelGenerator.register(Ores.MAGNESIUM_ORE.getBlockItem(), Models.GENERATED);
//            itemModelGenerator.register(Ores.NICKEL_ORE.getBlockItem(), Models.GENERATED);
//            itemModelGenerator.register(Ores.LEAD_ORE.getBlockItem(), Models.GENERATED);
//            itemModelGenerator.register(Ores.TIN_ORE.getBlockItem(), Models.GENERATED);
//            itemModelGenerator.register(Ores.TITANIUM_ORE.getBlockItem(), Models.GENERATED);
//            itemModelGenerator.register(Ores.ZINC_ORE.getBlockItem(), Models.GENERATED);
//            itemModelGenerator.register(Ores.TUNGSTEN_ORE.getBlockItem(), Models.GENERATED);
//            itemModelGenerator.register(Machines.打粉机.getBlockItem(), Models.GENERATED);

            itemModelGenerator.register(Metals.COPPER_METAL.getItem(), Models.GENERATED);
            itemModelGenerator.register(Metals.ALUMINUM_METAL.getItem(), Models.GENERATED);
            itemModelGenerator.register(Metals.IRON_METAL.getItem(), Models.GENERATED);
            itemModelGenerator.register(Metals.MAGNESIUM_METAL.getItem(), Models.GENERATED);
            itemModelGenerator.register(Metals.NICKEL_METAL.getItem(), Models.GENERATED);
            itemModelGenerator.register(Metals.LEAD_METAL.getItem(), Models.GENERATED);
            itemModelGenerator.register(Metals.TITANIUM_METAL.getItem(), Models.GENERATED);
            itemModelGenerator.register(Metals.ZINC_METAL.getItem(), Models.GENERATED);
            itemModelGenerator.register(Metals.TIN_METAL.getItem(), Models.GENERATED);
            itemModelGenerator.register(Metals.TUNGSTEN_METAL.getItem(), Models.GENERATED);

            itemModelGenerator.register(Ore_Fragments.COPPER_FRAGMENT.getItem(), Models.GENERATED);
            itemModelGenerator.register(Ore_Fragments.ALUMINUM_FRAGMENT.getItem(), Models.GENERATED);
            itemModelGenerator.register(Ore_Fragments.IRON_FRAGMENT.getItem(), Models.GENERATED);
            itemModelGenerator.register(Ore_Fragments.MAGNESIUM_FRAGMENT.getItem(), Models.GENERATED);
            itemModelGenerator.register(Ore_Fragments.NICKEL_FRAGMENT.getItem(), Models.GENERATED);
            itemModelGenerator.register(Ore_Fragments.LEAD_FRAGMENT.getItem(), Models.GENERATED);
            itemModelGenerator.register(Ore_Fragments.TITANIUM_FRAGMENT.getItem(), Models.GENERATED);
            itemModelGenerator.register(Ore_Fragments.ZINC_FRAGMENT.getItem(), Models.GENERATED);
            itemModelGenerator.register(Ore_Fragments.TIN_FRAGMENT.getItem(), Models.GENERATED);
            itemModelGenerator.register(Ore_Fragments.TUNGSTEN_FRAGMENT.getItem(), Models.GENERATED);


        }


    }
}
