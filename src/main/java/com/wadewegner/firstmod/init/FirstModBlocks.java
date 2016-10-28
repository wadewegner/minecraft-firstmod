package com.wadewegner.firstmod.init;

import com.wadewegner.firstmod.main.Reference;
import com.wadewegner.firstmod.init.blocks.RubyBlock;
import net.minecraft.block.Block;   
import net.minecraft.item.Item;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;

public class FirstModBlocks
{
    public static RubyBlock ruby_block;

    public static void init()
    {
        ruby_block = new RubyBlock();

        ruby_block.setUnlocalizedName("ruby_block");
        ruby_block.setCreativeTab(CreativeTabs.TOOLS);
    }

    public static void registerRenders()
    {
        registerRender(ruby_block);
    }

    public static void registerRender(Block block)
    {
        Item item = Item.getItemFromBlock(block);

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + 
                item.getUnlocalizedName().substring(5), "inventory"));
    }
}