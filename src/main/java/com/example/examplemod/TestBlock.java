package com.example.examplemod;

/**
 * Created by Marvin on 01.07.2016.
 */

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TestBlock extends Block {

    private final String name = "TestBlock";

    public TestBlock(){
        //basic initializations
        super(Material.ground);
        GameRegistry.registerBlock(this, name);
        this.setUnlocalizedName(ExampleMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.tabBlock);
        //setup properties
        this.setHardness(0.25f);
        this.setLightLevel(10/16f);
    }

    public String getName(){
        return name;
    }

}
