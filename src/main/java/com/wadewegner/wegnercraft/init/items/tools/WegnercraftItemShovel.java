package com.wadewegner.wegnercraft.init.items.tools;

import com.wadewegner.wegnercraft.init.WegnercraftTabs;

import net.minecraft.item.ItemSpade;

public class WegnercraftItemShovel extends ItemSpade
{
    public WegnercraftItemShovel(ToolMaterial material)
    {
        super(material);
        this.setCreativeTab(WegnercraftTabs.tabWegnercraftItems);
    }
}