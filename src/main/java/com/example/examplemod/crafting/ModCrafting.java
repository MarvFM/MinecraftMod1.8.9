package com.example.examplemod.crafting;

import com.example.examplemod.blocks.ModBlocks;
import com.example.examplemod.items.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
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

        GameRegistry.addRecipe(new ItemStack(ModItems.testiumPickaxe, 1),
                "TTT",
                " S ",
                " S ",
                'T', ModBlocks.explodingBlock,
                'S', Items.stick);

        GameRegistry.addRecipe(new ItemStack(ModItems.testiumSword, 1),
                "T",
                "T",
                "S",
                'T', ModBlocks.explodingBlock,
                'S', Items.stick);
    }

    private static void addShapelessRecipes(){
        //addShapelessRecipe(new ItemStack(output_Block/Item, amount(optional), metadata(optional)), input1, input2, ...)
        // inputs can either be items, blocks or stacks; stacks are always treated as single item
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.unrefinedTestium, 2), Blocks.dirt,  Blocks.cobblestone);
    }

    private static void addSmeltings(){
        //addSmelting(input_Block/Item, output_Block/Item, experienceamount)
        GameRegistry.addSmelting(Blocks.dirt, new ItemStack(ModItems.testItem), 1.0F);
        GameRegistry.addSmelting(Blocks.diamond_block, new ItemStack(ModBlocks.testBlock), 1.0F);
        GameRegistry.addSmelting(ModBlocks.unrefinedTestium,  new ItemStack(ModBlocks.explodingBlock), 0.1F);
    }

}
