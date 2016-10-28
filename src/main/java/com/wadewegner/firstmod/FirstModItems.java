package com.wadewegner.firstmod.init;

import com.wadewegner.firstmod.main.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation; 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class FirstModItems
{
    public static Item first_item;

    public static void init()
    {
        first_item = registerItem(new Item(), "first_item").setUnlocalizedName("first_item").setCreativeTab(CreativeTabs.tabTools);
    }

    public static void registerRenders()
    {
        registerRender(first_item);
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