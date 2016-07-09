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

public class ExplodingBlock extends Block {

        private static String name = "ExplodingBlock";
        public static String getName(){return name;}

        public ExplodingBlock(){
            //basic initializations
            super(Material.tnt);
            this.setUnlocalizedName(ExampleMod.MODID + "_" + name);
            this.setCreativeTab(CreativeTabs.tabBlock);
        }

    // called when activated
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        this.explode(worldIn, pos);
        return true;
    }

    // little explosion method :)
    private void explode(World worldIn, BlockPos pos)
    {
        // newExplosion - world method
        // newExplosion(enity or null, x, y, z, float strength, bool flames, bool smoke)
        worldIn.newExplosion((Entity)null, (double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, 5.0F, true, true);
    }

    // should not drop from explosion, should explode instead!
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return false;
    }

    // called when explosion destroys the block, should create another explosion :D
    public void onBlockDestroyedByExplosion(World worldIn, BlockPos pos, Explosion explosionIn)
    {
        // TODO not sure what this is for? found this in tnt
        if (!worldIn.isRemote)
        {
            this.explode(worldIn, pos);
        }
    }

    // called when punched
    public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state)
    {
        this.explode(worldIn, pos);
    }

  }