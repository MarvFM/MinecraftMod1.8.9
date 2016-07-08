package com.example.examplemod.blocks;

import com.example.examplemod.ExampleMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Marvin on 03.07.2016.
 */
public class SuperTestBlock extends Block {

    private static String name = "SuperTestBlock";
    public static String getName(){return name;}

    public SuperTestBlock() {
        super(Material.ground);
        this.setUnlocalizedName(ExampleMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
}
