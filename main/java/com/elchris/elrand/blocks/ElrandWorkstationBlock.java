package com.elchris.elrand.blocks;

import com.elchris.elrand.Elrand;
import com.elchris.elrand.Strings;
import com.elchris.elrand.init.ElrandBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;

public class ElrandWorkstationBlock extends Block{

	public ElrandWorkstationBlock(Material materialIn) {
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
