package com.example.examplemod.blocks;

import com.example.examplemod.ExampleMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import java.util.Random;

public class BlueVirus extends Block {

    private static String name = "BlueVirus";
    public static String getName(){return name;}

    public BlueVirus(){
        super(Material.ground);
        this.setUnlocalizedName(ExampleMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.tabBlock);
        // make this tick, so stuff can happen after a while
        this.setTickRandomly(true);
    }

    // should not drop from explosion
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return false;
    }

    // will be called when a random tick occurs
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        //worldIn.isAirBlock()
//        if (!worldIn.isRemote)
//        {
//
//        }
//        worldIn.setBlock
//        pos.down()
//        if(worldIn.isAirBlock())
//        this.destroy(worldIn, pos);
//        worldIn.
    }

    private void destroy(World worldIn, BlockPos pos)
    {
        worldIn.setBlockToAir(pos);
    }

  }