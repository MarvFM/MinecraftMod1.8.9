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
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.MODNAME,version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";
    public static final String MODNAME = "Example Mod";

    @Mod.Instance
    public static ExampleMod instance = new ExampleMod();

    @SidedProxy(clientSide="com.bedrockminer.tutorial.ClientProxy", serverSide="com.bedrockminer.tutorial.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLInitializationEvent event)
    {
       this.proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        this.proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLInitializationEvent event)
    {
        this.proxy.postInit(event);
    }

    /*
    *  //blocks
        Block testBlock = new TestBlock();
        GameRegistry.registerBlock(testBlock, ((TestBlock)testBlock).getName());

        Block testBlock = new TestBlock();
        //recipe DOESN'T WORK
        GameRegistry.addRecipe(new ItemStack(testBlock),
                "AA",
                "AA",
                'A', TestBlock);

        //register renders
        if(event.getSide() == Side.CLIENT){
            RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
            //blocks
            renderItem.getItemModelMesher().register(Item.getItemFromBlock(testBlock), 0, new ModelResourceLocation(ExampleMod.MODID + ":" + ((TestBlock)testBlock).getName(), "inventory"));
        }
    * */
}
