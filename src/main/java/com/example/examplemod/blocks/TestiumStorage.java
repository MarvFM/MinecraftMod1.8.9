package com.example.examplemod.blocks;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.VariableSizeChest;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityHopper;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

// use a block container or an entity for storage, block containers must implement createNewTileEntity
public class TestiumStorage extends BlockContainer {

    private static String name = "TestiumStorage";
    public static String getName(){return name;}

    public TestiumStorage(){
        //basic initializations
        super(Material.rock);
        this.setUnlocalizedName(ExampleMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    // must be implemeneted!
    // called on placing the chest
//    public TileEntity createNewTileEntity(World worldIn, int meta)
//    {
//        // just pass the size of the inventory to the constructor
//        return new VariableSizeChest(52);
//    }

    // necessary, since super class overwrites this to no render -.-
    @Override
    public int getRenderType()
    {
        return 3;
    }


    public TileEntity createNewTileEntity(World worldIn, int meta)
    {
        return new TileEntityHopper();
    }

    // for displaying the content
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        if (worldIn.isRemote)
        {
            return true;
        }
        else
        {
            TileEntity tileentity = worldIn.getTileEntity(pos);

            if (tileentity instanceof TileEntityHopper)
            {
                playerIn.displayGUIChest((TileEntityHopper)tileentity);
            }

            return true;
        }
    }

  }
