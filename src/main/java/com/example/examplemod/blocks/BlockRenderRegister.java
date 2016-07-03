package com.example.examplemod.blocks;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.LogFile;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by Marvin on 01.07.2016.
 */
public class BlockRenderRegister {

    public static void registerBlockRenderer(){
        reg(ModBlocks.testBlock);
        reg(ModBlocks.superTestBlock);
    }

    public static void reg(Block block){
        LogFile.writeLn(block.getUnlocalizedName());
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0,
                new ModelResourceLocation(ExampleMod.MODID +  ":" + block.getUnlocalizedName().substring(ExampleMod.MODID.length()+6), "inventory"));
    }



}
//