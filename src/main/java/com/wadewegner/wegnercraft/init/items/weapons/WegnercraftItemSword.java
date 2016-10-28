package com.wadewegner.wegnercraft.init.items.weapons;

import com.wadewegner.wegnercraft.init.WegnercraftTabs;

import net.minecraft.item.ItemSword;;

public class WegnercraftItemSword extends ItemSword
{
    public WegnercraftItemSword(ToolMaterial material)
    {
        super(material);
        this.setCreativeTab(WegnercraftTabs.tabWegnercraftItems);
    }
}