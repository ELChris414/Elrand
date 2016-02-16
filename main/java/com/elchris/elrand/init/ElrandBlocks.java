package com.elchris.elrand.init;

import com.elchris.elrand.Elrand;
import com.elchris.elrand.Strings;
import com.elchris.elrand.blocks.ElrandMadnessBlock;
import com.elchris.elrand.blocks.ElrandPortalBlock;
import com.elchris.elrand.blocks.ElrandWorkstationBlock;
import com.elchris.elrand.blocks.MadnessedObsidian;
import com.elchris.elrand.blocks.RedChunkOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ElrandBlocks {
	
	public static Block elrand_workstation_block;
	public static Block elrand_madness_block;
	public static Block madnessed_obsidian;
	public static Block elrand_portal_block;
	public static Block red_chunk_ore;
	public static final int guiIdElrandWorkstationBlock = 1;
	
	public static void init() {
		elrand_workstation_block = new ElrandWorkstationBlock(Material.wood).setUnlocalizedName("elrand_workstation_block").setCreativeTab(Elrand.tabElrand).setHardness(1.0F).setLightOpacity(5);
		elrand_madness_block = new ElrandMadnessBlock(Material.rock).setUnlocalizedName("elrand_madness_block").setCreativeTab(Elrand.tabElrand).setHardness(2.0F).setLightLevel(0.9F);
		elrand_portal_block = new ElrandPortalBlock(Material.rock).setUnlocalizedName("elrand_portal_block").setCreativeTab(Elrand.tabElrand).setHardness(8.0F).setLightOpacity(1);
		madnessed_obsidian = new MadnessedObsidian(Material.rock).setUnlocalizedName("madnessed_obsidian").setCreativeTab(Elrand.tabElrand).setHardness(8.0F).setLightOpacity(15);
		red_chunk_ore = new RedChunkOre(Material.rock).setUnlocalizedName("red_chunk_ore").setCreativeTab(Elrand.tabElrand).setHardness(4.0F);
		
	}
	
	public static void register() {
		GameRegistry.registerBlock(elrand_workstation_block, elrand_workstation_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(elrand_madness_block, elrand_madness_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(elrand_portal_block, elrand_portal_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(madnessed_obsidian, madnessed_obsidian.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(red_chunk_ore, red_chunk_ore.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders() {
		registerRender(elrand_workstation_block);
		registerRender(elrand_madness_block);
		registerRender(elrand_portal_block);
		registerRender(madnessed_obsidian);
		registerRender(red_chunk_ore);
	}
	
	public static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Strings.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
