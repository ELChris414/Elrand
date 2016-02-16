package com.elchris.elrand;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.elchris.elrand.init.ElrandBlocks;
import com.elchris.elrand.init.ElrandItems;

public class ElrandRecipes {
	public static void addRecipes() {
		//Item Recipes
				GameRegistry.addRecipe(new ItemStack(ElrandItems.obsidian_notch_tl), new Object[]{"OO", "O ", 'O', Blocks.obsidian});
				GameRegistry.addShapelessRecipe(new ItemStack(ElrandItems.obsidian_notch_tr), new Object[]{ElrandItems.obsidian_notch_tl});
				GameRegistry.addShapelessRecipe(new ItemStack(ElrandItems.obsidian_notch_bl), new Object[]{ElrandItems.obsidian_notch_tr});
				GameRegistry.addShapelessRecipe(new ItemStack(ElrandItems.obsidian_notch_br), new Object[]{ElrandItems.obsidian_notch_bl});
				GameRegistry.addShapelessRecipe(new ItemStack(ElrandItems.obsidian_notch_tl), new Object[]{ElrandItems.obsidian_notch_br});
				GameRegistry.addRecipe(new ItemStack(ElrandItems.lapis_emblem_tl), new Object[]{" LL","L L","LL ",'L', new ItemStack(Items.dye, 1, 4)});
				GameRegistry.addShapelessRecipe(new ItemStack(ElrandItems.lapis_emblem_tr), new Object[]{ElrandItems.lapis_emblem_tl});
				GameRegistry.addShapelessRecipe(new ItemStack(ElrandItems.lapis_emblem_bl), new Object[]{ElrandItems.lapis_emblem_tr});
				GameRegistry.addShapelessRecipe(new ItemStack(ElrandItems.lapis_emblem_br), new Object[]{ElrandItems.lapis_emblem_bl});
				GameRegistry.addShapelessRecipe(new ItemStack(ElrandItems.lapis_emblem_tl), new Object[]{ElrandItems.lapis_emblem_br});
				GameRegistry.addRecipe(new ItemStack(ElrandItems.emerald_ring), new Object[]{"EEE","E E","EEE",'E',Items.emerald});
				GameRegistry.addRecipe(new ItemStack(ElrandItems.diamond_rounding), new Object[]{" D ","D D"," D ",'D',Items.diamond});
				GameRegistry.addRecipe(new ItemStack(ElrandItems.gold_block), new Object[]{"GG","GG",'G',Items.gold_ingot});
				GameRegistry.addShapelessRecipe(new ItemStack(ElrandItems.diamond_rounding_with_gold_block), new Object[]{ElrandItems.diamond_rounding,ElrandItems.gold_block});
				GameRegistry.addRecipe(new ItemStack(ElrandItems.obsidian_notch_with_lapis_emblem_tl), new Object[]{"O "," L",'O',ElrandItems.obsidian_notch_tl,'L',ElrandItems.lapis_emblem_tl});
				GameRegistry.addRecipe(new ItemStack(ElrandItems.obsidian_notch_with_lapis_emblem_tr), new Object[]{" O","L ",'O',ElrandItems.obsidian_notch_tr,'L',ElrandItems.lapis_emblem_tr});
				GameRegistry.addRecipe(new ItemStack(ElrandItems.obsidian_notch_with_lapis_emblem_bl), new Object[]{" L","O ",'O',ElrandItems.obsidian_notch_bl,'L',ElrandItems.lapis_emblem_bl});
				GameRegistry.addRecipe(new ItemStack(ElrandItems.obsidian_notch_with_lapis_emblem_br), new Object[]{"L "," O",'O',ElrandItems.obsidian_notch_br,'L',ElrandItems.lapis_emblem_br});
				GameRegistry.addShapelessRecipe(new ItemStack(ElrandItems.emerald_ring_with_diamond_rounding_with_gold_block), new Object[]{ElrandItems.diamond_rounding_with_gold_block,ElrandItems.emerald_ring});
				GameRegistry.addRecipe(new ItemStack(ElrandItems.elrand_item), new Object[]{"Q W"," R ","Y U",'Q',ElrandItems.obsidian_notch_with_lapis_emblem_tl,'W',ElrandItems.obsidian_notch_with_lapis_emblem_tr,'R',ElrandItems.emerald_ring_with_diamond_rounding_with_gold_block,'Y',ElrandItems.obsidian_notch_with_lapis_emblem_bl,'U',ElrandItems.obsidian_notch_with_lapis_emblem_br});
				GameRegistry.addShapelessRecipe(new ItemStack(ElrandItems.madnessed_lava_bucket), new Object[]{ElrandItems.burned_elrand,Items.lava_bucket});
				GameRegistry.addShapelessRecipe(new ItemStack(ElrandItems.obsidian_notch_with_lapis_emblem_tr), new Object[]{ElrandItems.obsidian_notch_with_lapis_emblem_tl});
				GameRegistry.addShapelessRecipe(new ItemStack(ElrandItems.obsidian_notch_with_lapis_emblem_bl), new Object[]{ElrandItems.obsidian_notch_with_lapis_emblem_tr});
				GameRegistry.addShapelessRecipe(new ItemStack(ElrandItems.obsidian_notch_with_lapis_emblem_br), new Object[]{ElrandItems.obsidian_notch_with_lapis_emblem_bl});
				GameRegistry.addShapelessRecipe(new ItemStack(ElrandItems.obsidian_notch_with_lapis_emblem_tl), new Object[]{ElrandItems.obsidian_notch_with_lapis_emblem_br});
				GameRegistry.addShapelessRecipe(new ItemStack(ElrandItems.mad_metalcrystal_of_madness), new Object[]{ElrandItems.madnessed_crystal, ElrandItems.madnessed_metal});
				GameRegistry.addRecipe(new ItemStack(ElrandItems.elrand_axe), new Object[]{"EE ","EM "," M ",'E',ElrandItems.elrand_item,'M',ElrandItems.mad_metalcrystal_of_madness});
				GameRegistry.addRecipe(new ItemStack(ElrandItems.elrand_pickaxe), new Object[]{"EEE"," M "," M ",'E',ElrandItems.elrand_item,'M',ElrandItems.mad_metalcrystal_of_madness});
				GameRegistry.addRecipe(new ItemStack(ElrandItems.elrand_hoe), new Object[]{"EE "," M "," M ",'E',ElrandItems.elrand_item,'M',ElrandItems.mad_metalcrystal_of_madness});
				GameRegistry.addRecipe(new ItemStack(ElrandItems.elrand_shovel), new Object[]{" E "," M "," M ",'E',ElrandItems.elrand_item,'M',ElrandItems.mad_metalcrystal_of_madness});
				GameRegistry.addRecipe(new ItemStack(ElrandItems.elrand_axe), new Object[]{" E "," E "," M ",'E',ElrandItems.elrand_item,'M',ElrandItems.mad_metalcrystal_of_madness});
				GameRegistry.addShapelessRecipe(new ItemStack(ElrandItems.madnessed_crystal), new Object[]{Items.diamond,ElrandItems.madnessed_lava_bucket});
				GameRegistry.addShapelessRecipe(new ItemStack(ElrandItems.madnessed_metal), new Object[]{Items.iron_ingot,ElrandItems.madnessed_lava_bucket});
				GameRegistry.addRecipe(new ItemStack(ElrandItems.elrand_multitool), new Object[]{"HMA","MPM","SMI",'H',ElrandItems.elrand_hoe,'M',ElrandItems.mad_metalcrystal_of_madness,'A',ElrandItems.elrand_axe,'P',ElrandItems.elrand_pickaxe,'S',ElrandItems.elrand_shovel,'I',ElrandItems.elrand_sword});
				GameRegistry.addRecipe(new ItemStack(ElrandItems.small_elrand_item), new Object[]{"OLO","DRG","OLO",'O',Blocks.obsidian,'L',new ItemStack(Items.dye, 1, 4),'D',Items.diamond,'G',Items.gold_ingot});
				GameRegistry.addRecipe(new ItemStack(ElrandItems.elrand_helmet), new Object[]{"RER","R R","   ",'R',ElrandItems.red_chunk,'E',ElrandItems.elrand_item});
				GameRegistry.addRecipe(new ItemStack(ElrandItems.elrand_chestplate), new Object[]{"R R","RER","RRR",'R',ElrandItems.red_chunk,'E',ElrandItems.elrand_item});
				GameRegistry.addRecipe(new ItemStack(ElrandItems.elrand_leggings), new Object[]{"RER","R R","R R",'R',ElrandItems.red_chunk,'E',ElrandItems.elrand_item});
				GameRegistry.addRecipe(new ItemStack(ElrandItems.elrand_boots), new Object[]{"E E","R R","   ",'R',ElrandItems.red_chunk,'E',ElrandItems.elrand_item});
				
				//Block Recipes
				GameRegistry.addRecipe(new ItemStack(ElrandBlocks.elrand_workstation_block), new Object[]{"GEG"," W ","W W",'G',Blocks.gold_block,'E',ElrandItems.small_elrand_item,'W',Blocks.log});
				GameRegistry.addRecipe(new ItemStack(ElrandBlocks.elrand_madness_block), new Object[]{"IRI","ILI","III",'I',Items.iron_ingot,'R',Blocks.iron_bars,'L',ElrandItems.madnessed_lava_bucket});
				GameRegistry.addRecipe(new ItemStack(ElrandBlocks.madnessed_obsidian, 8), new Object[]{"OOO","OEO","OOO",'O',Blocks.obsidian,'E',ElrandItems.madnessed_lava_bucket});
				GameRegistry.addShapelessRecipe(new ItemStack(ElrandBlocks.elrand_portal_block), new Object[]{ElrandItems.elrand_item,Blocks.obsidian});
				
				//Smelting recipes and etc.
				GameRegistry.addSmelting(new ItemStack(ElrandItems.elrand_item), new ItemStack(ElrandItems.burned_elrand), 0.1F);
				GameRegistry.addSmelting(new ItemStack(ElrandBlocks.red_chunk_ore), new ItemStack(ElrandItems.red_chunk, 4), 0.1F);
	}
}
