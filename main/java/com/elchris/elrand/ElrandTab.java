package com.elchris.elrand;

import com.elchris.elrand.init.ElrandItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ElrandTab extends CreativeTabs{

	public ElrandTab(String label) {
		super(label);
		this.setBackgroundImageName("elrand.png");
	}

	@Override
	public Item getTabIconItem() {
		return ElrandItems.elrand_item;
	}

}
