package net.leafenzo.lithogeology.datageneration;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.leafenzo.lithogeology.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends FabricTagProvider<Block> {
    /**
     * Constructs a new {@link FabricTagProvider} with the default computed path.
     *
     * <p>Common implementations of this class are provided.
     *
     * @param output           the {@link FabricDataOutput} instance
     * @param registriesFuture the backing registry for the tag type
     */
    public ModBlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, Registries.BLOCK.getKey(), registriesFuture);
    }


   //BlockTags & ItemTags are vanilla

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
//        getOrCreateTagBuilder(BlockTags.WOOL)

//
//        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)

//        getOrCreateTagBuilder(BlockTags.CRYSTAL_SOUND_BLOCKS)

//
//        getOrCreateTagBuilder(BlockTags.INFINIBURN_OVERWORLD)

//
//        getOrCreateTagBuilder(BlockTags.SOUL_FIRE_BASE_BLOCKS)

//
//        getOrCreateTagBuilder(BlockTags.SOUL_SPEED_BLOCKS)

//
//        getOrCreateTagBuilder(BlockTags.WITHER_IMMUNE)

//
//        getOrCreateTagBuilder(BlockTags.GUARDED_BY_PIGLINS)

    }
}

