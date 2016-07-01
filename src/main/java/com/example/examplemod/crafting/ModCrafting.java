package com.example.examplemod.crafting;

import com.example.examplemod.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.example.examplemod.blocks.TestBlock;
/**
 * Created by Marvin on 02.07.2016.
 */
public class ModCrafting {

    public static void initCrafting(){
        GameRegistry.addRecipe(new ItemStack(Blocks.diamond_block, 3), new Object[]{
                "A",
                "A",
                'A', new TestBlock()});
    }
}
