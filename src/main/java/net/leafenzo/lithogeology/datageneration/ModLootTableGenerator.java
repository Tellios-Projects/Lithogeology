package net.leafenzo.lithogeology.datageneration;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.leafenzo.lithogeology.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.item.Items;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
//    private static final LootCondition.Builder WITH_SILK_TOUCH;
//    private static final LootCondition.Builder WITHOUT_SILK_TOUCH;
//    private static final LootCondition.Builder WITH_SHEARS;
//    private static final LootCondition.Builder WITH_SILK_TOUCH_OR_SHEARS;
//    private static final LootCondition.Builder WITHOUT_SILK_TOUCH_NOR_SHEARS;
//    private static final Set<Item> EXPLOSION_IMMUNE;
//    private static final float[] SAPLING_DROP_CHANCE;
//    private static final float[] JUNGLE_SAPLING_DROP_CHANCE;
//    private final Map<Identifier, LootTable.Builder> lootTables = Maps.newHashMap();


    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

    }
}
