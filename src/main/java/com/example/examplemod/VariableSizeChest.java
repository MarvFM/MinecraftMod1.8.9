package com.example.examplemod;

import net.minecraft.tileentity.TileEntityChest;

/**
 * Created by deus on 10.07.2016.
 */

// helper class for creating larger chests
public class VariableSizeChest extends TileEntityChest {
    private int inventorySize;

    public VariableSizeChest(int inventorySize) {
        this.inventorySize = inventorySize;
    }

    @Override
    public int getSizeInventory() {
        return this.inventorySize;
    }
}
