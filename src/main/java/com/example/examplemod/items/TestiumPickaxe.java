package com.example.examplemod.items;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.ItemPickaxe;

public class TestiumPickaxe extends ItemPickaxe {
    private static String name = "TestiumPickaxe";

    public TestiumPickaxe(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(ExampleMod.MODID + "_" + name);
    }

    public static String getName(){return name;}
}
