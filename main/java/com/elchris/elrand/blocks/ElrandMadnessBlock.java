package com.elchris.elrand.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumWorldBlockLayer;

public class ElrandMadnessBlock extends Block {

	public ElrandMadnessBlock(Material materialIn) {
		super(materialIn);
	}	
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	@Override
	public boolean isFullCube() {
		return false;
	}
	
	@Override
	public EnumWorldBlockLayer getBlockLayer() {

		return EnumWorldBlockLayer.CUTOUT;
	}
	
}
