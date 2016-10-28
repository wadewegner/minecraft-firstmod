package com.wadewegner.wegnercraft.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SapphireOre extends Block
{
    public SapphireOre()
    {
        super(Material.IRON);

        setRegistryName("sapphire_ore");
        setResistance(3F);
        setHardness(3F);

        /**
        wood: 0
        stone: 1
        iron: 2
        diamond: 3
        gold: 0
        **/

        setHarvestLevel("pickaxe", 2);
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
    }
}