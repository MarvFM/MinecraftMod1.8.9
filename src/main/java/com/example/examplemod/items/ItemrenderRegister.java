package com.example.examplemod.items;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.LogFile;
import com.example.examplemod.blocks.ModBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import java.io.IOException;

/**
 * Created by Marvin on 01.07.2016.
 */

public class ItemRenderRegister {

    public static void registerItemRenderer(){
        reg(ModItems.testItem);
    }

    public static void reg(Item item){

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
                new ModelResourceLocation(ExampleMod.MODID + ":" + item.getUnlocalizedName().substring(ExampleMod.MODID.length()+6) , "inventory"));
    }
}

//ExampleMod.MODID + ":" + item.getUnlocalizedName().substring(ExampleMod.MODID.length()+1)