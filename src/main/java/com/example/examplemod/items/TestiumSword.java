package com.example.examplemod.items;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.ItemSword;

public class TestiumSword extends ItemSword {
    private static String name = "TestiumSword";

    public TestiumSword(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(ExampleMod.MODID + "_" + name);
    }

    public static String getName(){return name;}
}
