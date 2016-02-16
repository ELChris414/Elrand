package com.elchris.elrand.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.elchris.elrand.Elrand;
import com.elchris.elrand.Strings;
import com.elchris.elrand.items.ElrandArmor;
import com.elchris.elrand.items.ElrandAxe;
import com.elchris.elrand.items.ElrandHoe;
import com.elchris.elrand.items.ElrandMultiTool;
import com.elchris.elrand.items.ElrandPickaxe;
import com.elchris.elrand.items.ElrandShovel;
import com.elchris.elrand.items.ElrandSword;

public class ElrandItems {
	
	public static ToolMaterial ELRANDSWORD = EnumHelper.addToolMaterial("ELRANDSWORD", 1, 5000, 3.0F, 8.0F, 35);
	public static ToolMaterial ELRANDPICK = EnumHelper.addToolMaterial("ELRANDPICK", 9, 8000, 20.0F, 3.0F, 35);
	public static ToolMaterial ELRANDHOE = EnumHelper.addToolMaterial("ELRANDHOE", 1, 5000, 3.0F, 8.0F, 35);
	public static ToolMaterial ELRANDONEFORALL = EnumHelper.addToolMaterial("ELRANDONEFORALL", 9, 14000, 25.0F, 11.0F, 40);
	public static ArmorMaterial ELRANDARMOR = EnumHelper.addArmorMaterial("ELRANDARMOR", "elrand:elrand_armor", 50, new int[]{4, 8, 7, 3}, 40);
	
	public static Item elrand_item;
	public static Item obsidian_notch_tl;
	public static Item obsidian_notch_tr;
	public static Item obsidian_notch_bl;
	public static Item obsidian_notch_br;
	public static Item lapis_emblem_tl;
	public static Item lapis_emblem_tr;
	public static Item lapis_emblem_bl;
	public static Item lapis_emblem_br;
	public static Item emerald_ring;
	public static Item diamond_rounding;
	public static Item gold_block;
	public static Item diamond_rounding_with_gold_block;
	public static Item obsidian_notch_with_lapis_emblem_tl;
	public static Item obsidian_notch_with_lapis_emblem_tr;
	public static Item obsidian_notch_with_lapis_emblem_bl;
	public static Item obsidian_notch_with_lapis_emblem_br;
	public static Item emerald_ring_with_diamond_rounding_with_gold_block;
	public static Item burned_elrand;
	public static Item madnessed_lava_bucket;
	public static Item elrand_sword;
	public static Item madnessed_metal;
	public static Item elrand_hoe;
	public static Item elrand_shovel;
	public static Item elrand_pickaxe;
	public static Item elrand_axe;
	public static Item madnessed_crystal;
	public static Item mad_metalcrystal_of_madness;
	public static Item small_elrand_item;
	public static Item elrand_multitool;
	public static Item red_chunk;
	public static Item elrand_helmet;
	public static Item elrand_chestplate;
	public static Item elrand_leggings;
	public static Item elrand_boots;
	
	public static void init() {
		elrand_item = new Item().setUnlocalizedName("elrand_item").setCreativeTab(Elrand.tabElrand);
		obsidian_notch_tl = new Item().setUnlocalizedName("obsidian_notch_tl").setCreativeTab(Elrand.tabElrand);
		obsidian_notch_tr = new Item().setUnlocalizedName("obsidian_notch_tr").setCreativeTab(Elrand.tabElrand);
		obsidian_notch_bl = new Item().setUnlocalizedName("obsidian_notch_bl").setCreativeTab(Elrand.tabElrand);
		obsidian_notch_br = new Item().setUnlocalizedName("obsidian_notch_br").setCreativeTab(Elrand.tabElrand);
		lapis_emblem_tl = new Item().setUnlocalizedName("lapis_emblem_tl").setCreativeTab(Elrand.tabElrand);
		lapis_emblem_tr = new Item().setUnlocalizedName("lapis_emblem_tr").setCreativeTab(Elrand.tabElrand);
		lapis_emblem_bl = new Item().setUnlocalizedName("lapis_emblem_bl").setCreativeTab(Elrand.tabElrand);
		lapis_emblem_br = new Item().setUnlocalizedName("lapis_emblem_br").setCreativeTab(Elrand.tabElrand);
		emerald_ring = new Item().setUnlocalizedName("emerald_ring").setCreativeTab(Elrand.tabElrand);
		diamond_rounding = new Item().setUnlocalizedName("diamond_rounding").setCreativeTab(Elrand.tabElrand);
		gold_block = new Item().setUnlocalizedName("gold_block").setCreativeTab(Elrand.tabElrand);
		diamond_rounding_with_gold_block = new Item().setUnlocalizedName("diamond_rounding_with_gold_block").setCreativeTab(Elrand.tabElrand);
		obsidian_notch_with_lapis_emblem_tl = new Item().setUnlocalizedName("obsidian_notch_with_lapis_emblem_tl").setCreativeTab(Elrand.tabElrand);
		obsidian_notch_with_lapis_emblem_tr = new Item().setUnlocalizedName("obsidian_notch_with_lapis_emblem_tr").setCreativeTab(Elrand.tabElrand);
		obsidian_notch_with_lapis_emblem_bl = new Item().setUnlocalizedName("obsidian_notch_with_lapis_emblem_bl").setCreativeTab(Elrand.tabElrand);
		obsidian_notch_with_lapis_emblem_br = new Item().setUnlocalizedName("obsidian_notch_with_lapis_emblem_br").setCreativeTab(Elrand.tabElrand);
		emerald_ring_with_diamond_rounding_with_gold_block = new Item().setUnlocalizedName("emerald_ring_with_diamond_rounding_with_gold_block").setCreativeTab(Elrand.tabElrand);
		burned_elrand = new Item().setUnlocalizedName("burned_elrand").setCreativeTab(Elrand.tabElrand);
		madnessed_lava_bucket = new Item().setUnlocalizedName("madnessed_lava_bucket").setCreativeTab(Elrand.tabElrand);
		madnessed_metal = new Item().setUnlocalizedName("madnessed_metal").setCreativeTab(Elrand.tabElrand);
		madnessed_crystal = new Item().setUnlocalizedName("madnessed_crystal").setCreativeTab(Elrand.tabElrand);
		mad_metalcrystal_of_madness = new Item().setUnlocalizedName("mad_metalcrystal_of_madness").setCreativeTab(Elrand.tabElrand);
		elrand_sword = new ElrandSword(ELRANDSWORD).setUnlocalizedName("elrand_sword").setCreativeTab(Elrand.tabElrand);
		elrand_hoe = new ElrandHoe(ELRANDHOE).setUnlocalizedName("elrand_hoe").setCreativeTab(Elrand.tabElrand);
		elrand_pickaxe = new ElrandPickaxe(ELRANDPICK).setUnlocalizedName("elrand_pickaxe").setCreativeTab(Elrand.tabElrand);
		elrand_axe = new ElrandAxe(ELRANDPICK).setUnlocalizedName("elrand_axe").setCreativeTab(Elrand.tabElrand);
		elrand_shovel = new ElrandShovel(ELRANDPICK).setUnlocalizedName("elrand_shovel").setCreativeTab(Elrand.tabElrand);
		small_elrand_item = new Item().setUnlocalizedName("small_elrand_item").setCreativeTab(Elrand.tabElrand);
		elrand_multitool = new ElrandMultiTool(ELRANDONEFORALL).setUnlocalizedName("elrand_multitool").setCreativeTab(Elrand.tabElrand);
		red_chunk = new Item().setUnlocalizedName("red_chunk").setCreativeTab(Elrand.tabElrand);
		elrand_helmet = new Item().setUnlocalizedName("elrand_helmet").setCreativeTab(Elrand.tabElrand);
		elrand_chestplate = new Item().setUnlocalizedName("elrand_chestplate").setCreativeTab(Elrand.tabElrand);
		elrand_leggings = new Item().setUnlocalizedName("elrand_leggings").setCreativeTab(Elrand.tabElrand);
		elrand_boots = new Item().setUnlocalizedName("elrand_boots").setCreativeTab(Elrand.tabElrand);
	}
	
	public static void register() {
		GameRegistry.registerItem(elrand_item, elrand_item.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obsidian_notch_tl, obsidian_notch_tl.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obsidian_notch_tr, obsidian_notch_tr.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obsidian_notch_bl, obsidian_notch_bl.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obsidian_notch_br, obsidian_notch_br.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lapis_emblem_tl, lapis_emblem_tl.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lapis_emblem_tr, lapis_emblem_tr.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lapis_emblem_bl, lapis_emblem_bl.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lapis_emblem_br, lapis_emblem_br.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emerald_ring, emerald_ring.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(diamond_rounding, diamond_rounding.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(gold_block, gold_block.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(diamond_rounding_with_gold_block, diamond_rounding_with_gold_block.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obsidian_notch_with_lapis_emblem_tl, obsidian_notch_with_lapis_emblem_tl.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obsidian_notch_with_lapis_emblem_tr, obsidian_notch_with_lapis_emblem_tr.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obsidian_notch_with_lapis_emblem_bl, obsidian_notch_with_lapis_emblem_bl.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obsidian_notch_with_lapis_emblem_br, obsidian_notch_with_lapis_emblem_br.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emerald_ring_with_diamond_rounding_with_gold_block, emerald_ring_with_diamond_rounding_with_gold_block.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(burned_elrand, burned_elrand.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(madnessed_lava_bucket, madnessed_lava_bucket.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(madnessed_metal, madnessed_metal.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(madnessed_crystal, madnessed_crystal.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mad_metalcrystal_of_madness, mad_metalcrystal_of_madness.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(elrand_sword, elrand_sword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(elrand_hoe, elrand_hoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(elrand_pickaxe, elrand_pickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(elrand_axe, elrand_axe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(elrand_shovel, elrand_shovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(small_elrand_item, small_elrand_item.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(elrand_multitool, elrand_multitool.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(red_chunk, red_chunk.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(elrand_helmet = new ElrandArmor("elrand_helmet", ELRANDARMOR, 1, 0), "elrand_helmet");
		GameRegistry.registerItem(elrand_chestplate = new ElrandArmor("elrand_chestplate", ELRANDARMOR, 1, 1), "elrand_chestplate");
		GameRegistry.registerItem(elrand_leggings = new ElrandArmor("elrand_leggings", ELRANDARMOR, 2, 2), "elrand_leggings");
		GameRegistry.registerItem(elrand_boots = new ElrandArmor("elrand_boots", ELRANDARMOR, 1, 3), "elrand_boots");  
	}
	
	public static void registerRenders() {
		registerRender(elrand_item);
		registerRender(obsidian_notch_tl);
		registerRender(obsidian_notch_tr);
		registerRender(obsidian_notch_bl);
		registerRender(obsidian_notch_br);
		registerRender(lapis_emblem_tl);
		registerRender(lapis_emblem_tr);
		registerRender(lapis_emblem_bl);
		registerRender(lapis_emblem_br);
		registerRender(emerald_ring);
		registerRender(diamond_rounding);
		registerRender(gold_block);
		registerRender(diamond_rounding_with_gold_block);
		registerRender(obsidian_notch_with_lapis_emblem_tl);
		registerRender(obsidian_notch_with_lapis_emblem_tr);
		registerRender(obsidian_notch_with_lapis_emblem_bl);
		registerRender(obsidian_notch_with_lapis_emblem_br);
		registerRender(emerald_ring_with_diamond_rounding_with_gold_block);
		registerRender(burned_elrand);
		registerRender(madnessed_lava_bucket);
		registerRender(elrand_sword);
		registerRender(elrand_hoe);
		registerRender(elrand_pickaxe);
		registerRender(elrand_axe);
		registerRender(elrand_shovel);
		registerRender(madnessed_crystal);
		registerRender(madnessed_metal);
		registerRender(mad_metalcrystal_of_madness);
		registerRender(small_elrand_item);
		registerRender(elrand_multitool);
		registerRender(red_chunk);
		registerRender(elrand_helmet);
		registerRender(elrand_chestplate);
		registerRender(elrand_leggings);
		registerRender(elrand_boots);
	}
	
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Strings.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
