package com.wadewegner.wegnercraft.init;

import com.wadewegner.wegnercraft.init.items.tools.WegnercraftItemPickaxe;
import com.wadewegner.wegnercraft.init.items.tools.WegnercraftItemAxe;
import com.wadewegner.wegnercraft.init.items.tools.WegnercraftItemShovel;
import com.wadewegner.wegnercraft.init.WegnercraftItems;

import com.wadewegner.wegnercraft.main.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation; 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.common.registry.GameRegistry;


public class WegnercraftTools
{
    public static Item ruby_pickaxe;
    public static Item sapphire_pickaxe;
    public static Item emerald_pickaxe;
    public static Item copper_pickaxe;

    public static Item ruby_axe;
    public static Item sapphire_axe;
    public static Item emerald_axe;
    public static Item copper_axe;

    public static Item ruby_shovel;
    public static Item sapphire_shovel;
    public static Item emerald_shovel;
    public static Item copper_shovel;

    public static void init()
    {
        ruby_pickaxe = registerItem(new WegnercraftItemPickaxe(WegnercraftToolMaterials.RUBY), "ruby_pickaxe").setUnlocalizedName("ruby_pickaxe");
        sapphire_pickaxe = registerItem(new WegnercraftItemPickaxe(WegnercraftToolMaterials.SAPPHIRE), "sapphire_pickaxe").setUnlocalizedName("sapphire_pickaxe");
        emerald_pickaxe = registerItem(new WegnercraftItemPickaxe(WegnercraftToolMaterials.EMERALD), "emerald_pickaxe").setUnlocalizedName("emerald_pickaxe");
        copper_pickaxe = registerItem(new WegnercraftItemPickaxe(WegnercraftToolMaterials.COPPER), "copper_pickaxe").setUnlocalizedName("copper_pickaxe");

        ruby_axe = registerItem(new WegnercraftItemAxe(WegnercraftToolMaterials.RUBY), "ruby_axe").setUnlocalizedName("ruby_axe");
        sapphire_axe = registerItem(new WegnercraftItemAxe(WegnercraftToolMaterials.SAPPHIRE), "sapphire_axe").setUnlocalizedName("sapphire_axe");
        emerald_axe = registerItem(new WegnercraftItemAxe(WegnercraftToolMaterials.EMERALD), "emerald_axe").setUnlocalizedName("emerald_axe");
        copper_axe = registerItem(new WegnercraftItemAxe(WegnercraftToolMaterials.COPPER), "copper_axe").setUnlocalizedName("copper_axe");

        ruby_shovel = registerItem(new WegnercraftItemShovel(WegnercraftToolMaterials.RUBY), "ruby_shovel").setUnlocalizedName("ruby_shovel");
        sapphire_shovel = registerItem(new WegnercraftItemShovel(WegnercraftToolMaterials.SAPPHIRE), "sapphire_shovel").setUnlocalizedName("sapphire_shovel");
        emerald_shovel = registerItem(new WegnercraftItemShovel(WegnercraftToolMaterials.EMERALD), "emerald_shovel").setUnlocalizedName("emerald_shovel");
        copper_shovel = registerItem(new WegnercraftItemShovel(WegnercraftToolMaterials.COPPER), "copper_shovel").setUnlocalizedName("copper_shovel");
    }

    public static void registerRenders()
    {
        registerRender(ruby_pickaxe);
        registerRender(sapphire_pickaxe);
        registerRender(emerald_pickaxe);
        registerRender(copper_pickaxe);

        registerRender(ruby_axe);
        registerRender(sapphire_axe);
        registerRender(emerald_axe);
        registerRender(copper_axe);

        registerRender(ruby_shovel);
        registerRender(sapphire_shovel);
        registerRender(emerald_shovel);
        registerRender(copper_shovel);
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

