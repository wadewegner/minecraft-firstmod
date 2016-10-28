package com.wadewegner.wegnercraft.init.items.tools;

import com.wadewegner.wegnercraft.init.WegnercraftTabs;

import net.minecraft.item.ItemAxe;

public class WegnercraftItemAxe extends ItemAxe
{
    public WegnercraftItemAxe(ToolMaterial material)
    {
        super(material, 8.0F, -3.0F);
        this.setCreativeTab(WegnercraftTabs.tabWegnercraftItems);
    }
}