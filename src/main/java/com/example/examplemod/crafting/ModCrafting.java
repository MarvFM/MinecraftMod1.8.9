package com.example.examplemod.crafting;

import com.example.examplemod.blocks.ModBlocks;
import com.example.examplemod.items.ModItems;
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
        addRecipes(); //block recipes don't work at this time
        addShapelessRecipes(); //block recipes don't work at this time
        addSmeltings(); //block recipes don't work at this time
    }

    private static void addRecipes(){
        // addRecipe(new ItemStack(output_Block/Item, amount(optional), metadata(optional)), "Top_Line_CraftingField", "Mid_Line_CraftingField", "Bottom_Line_CraftingField", 'Placeholder', Placeholder_Block/Item)
        GameRegistry.addRecipe(new ItemStack(ModBlocks.testBlock, 64),
                "AAA",
                "AAA",
                "AAA",
                'A', Blocks.dirt);

        GameRegistry.addRecipe(new ItemStack(ModItems.testItem, 3),
                "AA",
                "AA",
                'A', Blocks.dirt);
    }

    private static void addShapelessRecipes(){
        //addShapelessRecipe(new ItemStack(output_Block/Item, amount(optional), metadata(optional)), new Object[]{new ItemStack(input_Block/Item, amount(optional), metadata(optional)})
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.testItem), new Object[] {new ItemStack(Blocks.dirt, 4)});
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.testBlock), new Object[] {new ItemStack(ModItems.testItem, 4)});
    }

    private static void addSmeltings(){
        //addSmelting(input_Block/Item, output_Block/Item, experienceamount)
        GameRegistry.addSmelting(Blocks.dirt, new ItemStack(ModItems.testItem), 1.0F);
        GameRegistry.addSmelting(Blocks.diamond_block, new ItemStack(ModBlocks.testBlock), 1.0F);
    }

}
