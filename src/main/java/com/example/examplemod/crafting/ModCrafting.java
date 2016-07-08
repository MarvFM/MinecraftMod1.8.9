package com.example.examplemod.crafting;

import com.example.examplemod.blocks.ModBlocks;
import com.example.examplemod.items.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

    public static void initCrafting(){
        // splitted because its prettier that way
        addRecipes();
        addShapelessRecipes();
        addSmeltings();
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
        //addShapelessRecipe(new ItemStack(output_Block/Item, amount(optional), metadata(optional)), input1, input2, ...)
        // inputs can either be items, blocks or stacks
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.explodingBlock, 2), new ItemStack(Blocks.dirt, 2),  new ItemStack(Blocks.cobblestone, 2));
    }

    private static void addSmeltings(){
        //addSmelting(input_Block/Item, output_Block/Item, experienceamount)
        GameRegistry.addSmelting(Blocks.dirt, new ItemStack(ModItems.testItem), 1.0F);
        GameRegistry.addSmelting(Blocks.diamond_block, new ItemStack(ModBlocks.testBlock), 1.0F);
    }

}
