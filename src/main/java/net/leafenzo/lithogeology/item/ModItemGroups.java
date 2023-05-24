package net.leafenzo.lithogeology.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.leafenzo.lithogeology.Super;
import net.leafenzo.lithogeology.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SEDIMENTARY = FabricItemGroup.builder(new Identifier(Super.MOD_ID, "sedimentary"))
            .displayName(Text.literal("Sedimentary"))
            .icon(() -> new ItemStack(ModBlocks.AGED_PLASTER))
            .build();

    public static final ItemGroup IGNEOUS = FabricItemGroup.builder(new Identifier(Super.MOD_ID, "igneous"))
            .displayName(Text.literal("Igneous"))
            .icon(() -> new ItemStack(ModBlocks.AGED_PLASTER))
            .build();

    public static final ItemGroup METAMORPHIC = FabricItemGroup.builder(new Identifier(Super.MOD_ID, "metamorphic"))
            .displayName(Text.literal("Metamorphic"))
            .icon(() -> new ItemStack(ModBlocks.AGED_PLASTER))
            .build();

    public static final ItemGroup ANTHROPIC = FabricItemGroup.builder(new Identifier(Super.MOD_ID, "anthropic"))
            .displayName(Text.literal("Anthropic"))
            .icon(() -> new ItemStack(ModBlocks.AGED_PLASTER))
            .build();

    public static final ItemGroup RESOURCE = FabricItemGroup.builder(new Identifier(Super.MOD_ID, "resource"))
            .displayName(Text.literal("Resource"))
            .icon(() -> new ItemStack(ModBlocks.AGED_PLASTER))
            .build();

    public static final ItemGroup TEKTITE = FabricItemGroup.builder(new Identifier(Super.MOD_ID, "tektite"))
            .displayName(Text.literal("Tektites"))
            .icon(() -> new ItemStack(ModBlocks.AGED_PLASTER))
            .build();

    public static final ItemGroup NETHER = FabricItemGroup.builder(new Identifier(Super.MOD_ID, "nether"))
            .displayName(Text.literal("MEow hell rocks mew meOW >w<"))
            .icon(() -> new ItemStack(ModBlocks.AGED_PLASTER))
            .build();

    public static final ItemGroup END = FabricItemGroup.builder(new Identifier(Super.MOD_ID, "end"))
            .displayName(Text.literal("Spaceycool :3"))
            .icon(() -> new ItemStack(ModBlocks.AGED_PLASTER))
            .build();
}
