package com.kave.antitech.blocks;

import com.kave.antitech.Main;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MetalBlock extends BlockBase{

	public MetalBlock(String name, Material material,float llevel) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(30.0F);
		setHarvestLevel("picaxe", 2);
		setLightLevel(llevel);
		this.setCreativeTab(Main.AntitechBlocks);
	}
	
	public MetalBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(30.0F);
		setHarvestLevel("picaxe", 2);
		this.setCreativeTab(Main.AntitechBlocks);
	}

}
