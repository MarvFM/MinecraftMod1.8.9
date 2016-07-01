package com.example.examplemod.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Marvin on 01.07.2016.
 */
public class ModBlocks {

    public static Block block;

    public static void createBlocks(){
        GameRegistry.registerBlock(block = new TestBlock(), ((TestBlock)block).getName());
    }

}
