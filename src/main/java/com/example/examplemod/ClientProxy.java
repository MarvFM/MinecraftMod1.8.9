package com.example.examplemod;

import com.example.examplemod.blocks.BlockRenderRegister;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.example.examplemod.items.ItemRenderRegister;

/**
 * Created by Marvin on 01.07.2016.
 */

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLInitializationEvent event){
        super.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event){
        super.init(event);

        ItemRenderRegister.registerItemRenderer();
        BlockRenderRegister.registerBlockRenderer();
    }

    @Override
    public void postInit(FMLInitializationEvent event){
        super.postInit(event);
    }

}
