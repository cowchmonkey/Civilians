package com.cowch.civilians;

import com.cowch.civilians.configuration.ConfigurationHandler;
import com.cowch.civilians.proxy.IProxy;
import com.cowch.civilians.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/* the information below tells us about our mod to change or add new things click on the "@Mod" and CTRL+B and it will take you to the code window where it will give you a hole list
* of stuff to look at.all changes will be made in the reference page*/
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME , version = Reference.VERSION)
public class civilians
{
    @Mod.Instance (Reference.MOD_ID) //more like a reference
    public static civilians instance;

   @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) //this is where items and blocks will be loaded first and configs will be loaded here as well
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void preInit(FMLInitializationEvent event) //this is where all the other things get loaded,
    {

    }

    @Mod.EventHandler
    public void preInit(FMLPostInitializationEvent event)
    {

    }

}
