package com.wadewegner.firstmod.init;

// import com.wadewegner.firstmod.init.FirstModBlocks;
// import com.wadewegner.firstmod.init.FirstModFood;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class FirstModTabs
{
    public static final CreativeTabs tabFirstModItems = new CreativeTabs("tabFirstModItems")
    {
        @Override
        public Item getTabIconItem()
        {
            return FirstModItems.first_item;
        }
    };

    public static final CreativeTabs tabFirstModBlocks = new CreativeTabs("tabFirstModBlocks")
    {
        @Override
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(FirstModBlocks.ruby_block);
        }
    };

    public static final CreativeTabs tabFirstModeFood = new CreativeTabs("tabFirstModeFood")
    {
        @Override
        public Item getTabIconItem()
        {
            return FirstModFood.butter;
        }
    };

}