package com.wadewegner.wegnercraft.init;

import com.wadewegner.wegnercraft.init.items.weapons.WegnercraftItemSword;

import com.wadewegner.wegnercraft.main.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation; 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class WegnercraftWeapons
{
    public static Item ruby_sword;
    public static Item sapphire_sword;
    public static Item emerald_sword;
    public static Item copper_sword;

    public static void init()
    {
        ruby_sword = registerItem(new WegnercraftItemSword(WegnercraftToolMaterials.RUBY), "ruby_sword").setUnlocalizedName("ruby_sword");
        sapphire_sword = registerItem(new WegnercraftItemSword(WegnercraftToolMaterials.SAPPHIRE), "sapphire_sword").setUnlocalizedName("sapphire_sword");
        emerald_sword = registerItem(new WegnercraftItemSword(WegnercraftToolMaterials.EMERALD), "emerald_sword").setUnlocalizedName("emerald_sword");
        copper_sword = registerItem(new WegnercraftItemSword(WegnercraftToolMaterials.COPPER), "copper_sword").setUnlocalizedName("copper_sword");
    }

    public static void registerRenders()
    {
        registerRender(ruby_sword);
        registerRender(sapphire_sword);
        registerRender(emerald_sword);
        registerRender(copper_sword);
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

