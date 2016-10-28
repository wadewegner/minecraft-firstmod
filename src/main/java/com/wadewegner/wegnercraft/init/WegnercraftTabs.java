package com.wadewegner.wegnercraft.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class WegnercraftTabs
{
    public static final CreativeTabs tabWegnercraftItems = new CreativeTabs("tabWegnercraftItems")
    {
        @Override
        public Item getTabIconItem()
        {
            return WegnercraftItems.ethan_head;
        }
    };

    public static final CreativeTabs tabWegnercraftBlocks = new CreativeTabs("tabWegnercraftBlocks")
    {
        @Override
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(WegnercraftBlocks.ruby_ore);
        }
    };

    public static final CreativeTabs tabWegnercraftFood = new CreativeTabs("tabWegnercraftFood")
    {
        @Override
        public Item getTabIconItem()
        {
            return WegnercraftFood.butter;
        }
    };

}