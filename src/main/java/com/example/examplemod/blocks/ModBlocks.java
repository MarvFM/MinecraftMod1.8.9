package com.example.examplemod.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
    public static final Block testBlock = new TestBlock();
    public static final Block superTestBlock = new SuperTestBlock();
    public static final Block testPartialBlock = new TestPartialBlock();
    public static final Block explodingBlock = new ExplodingBlock();

    public static void createBlocks(){
        GameRegistry.registerBlock(testBlock, TestBlock.getName());
        GameRegistry.registerBlock(superTestBlock, SuperTestBlock.getName());
        GameRegistry.registerBlock(testPartialBlock, TestPartialBlock.getName());
        GameRegistry.registerBlock(explodingBlock, ExplodingBlock.getName());
    }

}
