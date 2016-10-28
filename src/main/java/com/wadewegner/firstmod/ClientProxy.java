package com.wadewegner.firstmod.proxy;

import com.wadewegner.firstmod.init.FirstModItems;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

public class ClientProxy extends CommonProxy
{
    @Override
    public void preInit(FMLPreInitializationEvent evt) {
        super.preInit(evt);

        FirstModItems.init();
        // inits
    }

    @Override
    public void init(FMLInitializationEvent evt) {
        super.init(evt);

        // RegisterRenders

        FirstModItems.registerRenders();  
    }

    @Override
    public void postInit(FMLPostInitializationEvent evt) {
        super.postInit(evt);
    }
}