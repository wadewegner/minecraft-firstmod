package com.wadewegner.wegnercraft.proxy;

import com.wadewegner.wegnercraft.init.WegnercraftItems;
import com.wadewegner.wegnercraft.init.WegnercraftBlocks;
import com.wadewegner.wegnercraft.init.WegnercraftFood;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

public class ClientProxy extends CommonProxy
{
    @Override
    public void preInit(FMLPreInitializationEvent evt) {
        super.preInit(evt);

        WegnercraftItems.init();
        WegnercraftBlocks.init();
        WegnercraftFood.init();
    }

    @Override
    public void init(FMLInitializationEvent evt) {
        super.init(evt);

        WegnercraftItems.registerRenders();  
        WegnercraftBlocks.registerRenders();
        WegnercraftFood.registerRenders();
    }

    @Override
    public void postInit(FMLPostInitializationEvent evt) {
        super.postInit(evt);
    }
}