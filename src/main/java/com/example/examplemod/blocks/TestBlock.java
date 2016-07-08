package com.example.examplemod.blocks;

import com.example.examplemod.ExampleMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Marvin on 01.07.2016.
 */

  public class TestBlock extends Block {

        private static String name = "TestBlock";
        public static String getName(){return name;}

        public TestBlock(){
            //basic initializations
            super(Material.ground);
            this.setUnlocalizedName(ExampleMod.MODID + "_" + name);
            this.setCreativeTab(CreativeTabs.tabBlock);

            this.setLightLevel(1.0F);
        }
  }
