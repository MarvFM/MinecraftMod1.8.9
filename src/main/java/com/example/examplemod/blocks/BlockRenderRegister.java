package com.example.examplemod.blocks;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.LogFile;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlockRenderRegister {

    public static void registerBlockRenderer(){
        reg(ModBlocks.testBlock);
        reg(ModBlocks.superTestBlock);
        reg(ModBlocks.testPartialBlock);
        reg(ModBlocks.explodingBlock);
        reg(ModBlocks.unrefinedTestium);
        reg(ModBlocks.blueVirus);
        reg(ModBlocks.testiumStorage);
    }

    public static void reg(Block block){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0,
                new ModelResourceLocation(ExampleMod.MODID +  ":" + block.getUnlocalizedName().substring(ExampleMod.MODID.length()+6), "inventory"));
    }
}