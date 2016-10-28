package com.wadewegner.wegnercraft.init.items.tools;

import com.wadewegner.wegnercraft.init.WegnercraftTabs;

import net.minecraft.item.ItemPickaxe;

public class WegnercraftItemPickaxe extends ItemPickaxe
{
    public WegnercraftItemPickaxe(ToolMaterial material)
    {
        super(material);
        this.setCreativeTab(WegnercraftTabs.tabWegnercraftItems);
    }
}