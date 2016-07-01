package com.example.examplemod;

import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.LanguageRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";

    public Block testBlock;

    @EventHandler
    public void preInit(FMLInitializationEvent event)
    {
        //blocks
        testBlock = new TestBlock();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        //recipe DOESN'T WORK
        GameRegistry.addRecipe(new ItemStack(testBlock, 1),
                "AA",
                "AA",
                'A', Blocks.dirt);

        //register renders
        if(event.getSide() == Side.CLIENT){
            RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
            
            renderItem.getItemModelMesher().register(Item.getItemFromBlock(testBlock), 0, new ModelResourceLocation(ExampleMod.MODID + ":TestBlock", "inventory"));
        }
    }

    @EventHandler
    public void postInit(FMLInitializationEvent event)
    {

    }
}
