package com.wadewegner.wegnercraft.init;

import com.wadewegner.wegnercraft.main.Reference;
import com.wadewegner.wegnercraft.init.blocks.RubyOre;
import com.wadewegner.wegnercraft.init.blocks.SapphireOre;

import net.minecraft.block.Block;   
import net.minecraft.item.Item;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

public class WegnercraftBlocks
{
    public static RubyOre ruby_ore;
    public static SapphireOre sapphire_ore;

    public static void init()
    {
        ruby_ore = new RubyOre();
        
        ruby_ore.setUnlocalizedName("ruby_ore");
        ruby_ore.setCreativeTab(WegnercraftTabs.tabWegnercraftBlocks);
        
        sapphire_ore = new SapphireOre();

        sapphire_ore.setUnlocalizedName("sapphire_ore");
        sapphire_ore.setCreativeTab(WegnercraftTabs.tabWegnercraftBlocks);
    }

    public static void registerRenders()
    {
        registerRender(ruby_ore);
        registerRender(sapphire_ore);
    }

    public static void registerRender(Block block)
    {
        Item item = Item.getItemFromBlock(block);

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + 
                item.getUnlocalizedName().substring(5), "inventory"));
    }
}