package com.kave.antitech;


import com.kave.antitech.init.ModBlocks;
import com.kave.antitech.init.ModItems;
import com.kave.antitech.proxy.CommonProxy;
import com.kave.antitech.proxy.*;
import com.kave.antitech.util.Reference;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID,name = Reference.NAME,version = Reference.VERSION)

public class Main {
	public static final CreativeTabs AntitechItems = new CreativeTabs("anti")
	{
	    @Override
	    public ItemStack getTabIconItem()
	    {
	        return new ItemStack(ModItems.WRENCH);
	    }
	};
	public static final CreativeTabs AntitechBlocks = new CreativeTabs("antb")
	{
	    @Override
	    public ItemStack getTabIconItem()
	    {
	        return new ItemStack(ModBlocks.ALUMINIUM_BLOCK);
	    }
	};
	
	@Instance(Reference.NAME)
    public static Main instance;
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.CLIENT_PROXY_CLASS)
    public static CommonProxy proxy;

     
    
    @EventHandler
    public static void PreInit(FMLPreInitializationEvent event){

    }

    @EventHandler
    public static void init(FMLInitializationEvent event){

    }

    @EventHandler
    public static void Postinit(FMLPostInitializationEvent event){

    }


}

