package com.wadewegner.firstmod.proxy;

import com.wadewegner.firstmod.init.FirstModItems;
import com.wadewegner.firstmod.init.FirstModBlocks;
import com.wadewegner.firstmod.init.FirstModFood;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

public class ClientProxy extends CommonProxy
{
    @Override
    public void preInit(FMLPreInitializationEvent evt) {
        super.preInit(evt);

        FirstModItems.init();
        FirstModBlocks.init();
        FirstModFood.init();
    }

    @Override
    public void init(FMLInitializationEvent evt) {
        super.init(evt);

        FirstModItems.registerRenders();  
        FirstModBlocks.registerRenders();
        FirstModFood.registerRenders();
    }

    @Override
    public void postInit(FMLPostInitializationEvent evt) {
        super.postInit(evt);
    }
}