package com.wadewegner.firstmod.init;

import com.wadewegner.firstmod.main.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

public class FirstModBlocks
{
    public static void init()
    {

    }

    public static void registerRenders()
    {
        registerRender(block);
    }

    public static void registerRender(Block block)
    {
        Item item = Item.getItemFromBlock(block);

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}