package com.wadewegner.wegnercraft.init;

import com.wadewegner.wegnercraft.main.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation; 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class WegnercraftItems
{
    public static Item ethan_head;
    public static Item katelyn_head;
    public static Item hayley_head;

    public static Item ruby;
    public static Item sapphire;
    public static Item emerald;
    public static Item copper;

    public static void init()
    {
        ethan_head = registerItem(new Item(), "ethan_head").setUnlocalizedName("ethan_head").setCreativeTab(WegnercraftTabs.tabWegnercraftItems);
    }

    public static void registerRenders()
    {
        registerRender(ethan_head);
    }

    public static void registerRender(Item item)
    {
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

    public static Item registerItem(Item item, String name) {
        return registerItem(item, name, null);
    }

    public static Item registerItem(Item item, String name, CreativeTabs tabs) {
        GameRegistry.register(item, new ResourceLocation(Reference.MODID, name));
        return item;
    }
}