package com.elchris.elrand.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.elchris.elrand.Elrand;
import com.elchris.elrand.init.ElrandItems;

public class ElrandArmor extends ItemArmor{

	public ElrandArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);

        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Elrand.tabElrand);
    }
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == ElrandItems.elrand_helmet
		        && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == ElrandItems.elrand_chestplate
		        && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == ElrandItems.elrand_leggings
		        && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == ElrandItems.elrand_boots) {
		        this.effectPlayer(player, Potion.regeneration, 1);
		        this.effectPlayer(player, Potion.jump, 2);
		        this.effectPlayer(player, Potion.moveSpeed, 2);
		        this.effectPlayer(player, Potion.damageBoost, 2);
		}
	}
	
	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
	    //Always effect for 8 seconds, then refresh
	    if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
	        player.addPotionEffect(new PotionEffect(potion.id, 159, amplifier, true, true));
	}
}
