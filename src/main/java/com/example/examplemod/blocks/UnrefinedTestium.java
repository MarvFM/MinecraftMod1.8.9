package com.example.examplemod.blocks;

import com.example.examplemod.ExampleMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import java.util.Random;

public class UnrefinedTestium extends Block {

    private static String name = "UnrefinedTestium";
    public static String getName(){return name;}

    public UnrefinedTestium(){
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
        this.destroy(worldIn, pos);
    }

    private void destroy(World worldIn, BlockPos pos)
    {
        worldIn.setBlockToAir(pos);
    }

  }