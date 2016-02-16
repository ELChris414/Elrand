package com.elchris.elrand;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.elchris.elrand.init.ElrandBlocks;
import com.elchris.elrand.init.ElrandItems;
import com.elchris.elrand.proxy.CommonProxy;
import com.elchris.elrand.worldgen.ElrandWorldGen;

@Mod(modid = Strings.MOD_ID, name = Strings.MOD_NAME, version = Strings.VERSION)
public class Elrand {
	
	public static final ElrandTab tabElrand = new ElrandTab("tabElrand");
	
	@Instance
	public static Elrand instance = new Elrand();
	
	@SidedProxy(clientSide = Strings.CLIENT_PROXY_CLASS, serverSide = Strings.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ElrandBlocks.init();
		ElrandBlocks.register();
		ElrandItems.init();
		ElrandItems.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.registerRenders();
		ElrandRecipes.addRecipes();
		GameRegistry.registerWorldGenerator(new ElrandWorldGen(), 0);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
