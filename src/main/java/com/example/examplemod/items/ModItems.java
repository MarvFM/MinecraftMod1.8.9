package com.example.examplemod.items;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    // new tool material
    public static Item.ToolMaterial TESTIUM = EnumHelper.addToolMaterial("Testium", 2, 5000, 50.0F, 8.0F, 30);

    public static final Item testItem = new TestItem();
    public static final Item testiumSword = new TestiumSword(TESTIUM);
    public static final Item testiumPickaxe = new TestiumPickaxe(TESTIUM);

    public static void createItems(){
        GameRegistry.registerItem(testItem, TestItem.getName());
        GameRegistry.registerItem(testiumSword, TestiumSword.getName());
        GameRegistry.registerItem(testiumPickaxe, TestiumPickaxe.getName());
    }

}
