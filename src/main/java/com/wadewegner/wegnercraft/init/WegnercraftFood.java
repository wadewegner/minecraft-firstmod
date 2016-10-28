package com.wadewegner.wegnercraft.init;

import com.wadewegner.wegnercraft.main.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation; 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.common.registry.GameRegistry;


public class WegnercraftFood
{
    public static Item butter;

    public static void init()
    {
        butter = registerItem(new ItemFood(1, 0.9F, false), "butter").setUnlocalizedName("butter")
            .setCreativeTab(WegnercraftTabs.tabWegnercraftFood);
    }

    public static void registerRenders()
    {
        registerRender(butter);
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