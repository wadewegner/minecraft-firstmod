package com.wadewegner.firstmod.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RubyBlock extends Block
{
    public RubyBlock(Material materialIn)
    {
        super(Material.iron);
        setRegistryName("ruby_block");
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
    }
}