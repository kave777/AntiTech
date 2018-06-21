package com.kave.antitech.init;

import java.util.ArrayList;
import java.util.List;

import com.kave.antitech.blocks.BlockBase;
import com.kave.antitech.blocks.MetalBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block TIN_BLOCK = new MetalBlock("tin_block",Material.IRON); 
	public static final Block COPPER_BLOCK = new MetalBlock("copper_block",Material.IRON);
	public static final Block LEAD_BLOCK = new MetalBlock("lead_block",Material.IRON);
	public static final Block ALUMINIUM_BLOCK = new MetalBlock("aluminium_block",Material.IRON);
	public static final Block NICKEL_BLOCK = new MetalBlock("nickel_block",Material.IRON);
	public static final Block URANIUM_BLOCK = new MetalBlock("uranium_block",Material.IRON,4.2F);
	public static final Block THORIUM_BLOCK = new MetalBlock("thorium_block",Material.IRON,4.2F);
	public static final Block PLATINUM_BLOCK = new MetalBlock("platinum_block",Material.IRON);
	public static final Block SILVER_BLOCK = new MetalBlock("silver_block",Material.IRON);
	public static final Block PLUTONIUM_BLOCK = new MetalBlock("plutonium_block",Material.IRON,4.2F);
	
	public static final Block MACHINE_HULL = new BlockBase("machine_hull", Material.IRON);
	
	
	/*public static final Block TIN_ORE = new MetalBlock("tin_block",Material.IRON); 
	public static final Block COPPER_ORE = new MetalBlock("copper_block",Material.IRON);
	public static final Block LEAD_ORE = new MetalBlock("lead_block",Material.IRON);
	public static final Block ALUMINIUM_ORE = new MetalBlock("aluminium_block",Material.IRON);
	public static final Block NICKEL_ORE = new MetalBlock("nickel_block",Material.IRON);
	public static final Block URANIUM_ORE = new MetalBlock("uranium_block",Material.IRON,2.2F);
	public static final Block THORIUM_ORE = new MetalBlock("thorium_block",Material.IRON,2.2F);
	public static final Block PLATINUM_ORE = new MetalBlock("platinum_block",Material.IRON);
	public static final Block SILVER_ORE = new MetalBlock("silver_block",Material.IRON);
	public static final Block PLUTONIUM_ORE = new MetalBlock("plutonium_block",Material.IRON,2.2F);
	*/
	
	
}

