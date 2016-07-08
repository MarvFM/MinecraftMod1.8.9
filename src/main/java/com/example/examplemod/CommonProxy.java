package com.example.examplemod;

import com.example.examplemod.blocks.ModBlocks;
import com.example.examplemod.crafting.ModCrafting;
import com.example.examplemod.items.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Marvin on 01.07.2016.
 */

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event){
        ModItems.createItems();
        ModBlocks.createBlocks();
    }

    public void init(FMLInitializationEvent event){
        ModCrafting.initCrafting();
    }

    public void postInit(FMLPostInitializationEvent event){

    }

}