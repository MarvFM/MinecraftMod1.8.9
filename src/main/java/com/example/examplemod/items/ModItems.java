package com.example.examplemod.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Marvin on 01.07.2016.
 */

public class ModItems {

    public static Item item;

    public static void createItems(){
        GameRegistry.registerItem(item = new TestItem("TestItem"), "TestItem");
    }

}
