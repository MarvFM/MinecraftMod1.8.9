package com.example.examplemod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Marvin on 01.07.2016.
 */
public class TestItem extends Item {

    private static String name = "TestItem";

    public TestItem(String unlocalizedName){
        super();

        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }

    public String getName(){return name;}
}
