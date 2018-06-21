package com.kave.antitech.blocks;

import com.kave.antitech.Main;
import com.kave.antitech.init.ModBlocks;
import com.kave.antitech.init.ModItems;
import com.kave.antitech.util.interfaces.IHasModel;
import com.kave.antitech.util.interfaces.IMetaName;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockOres extends Block implements IHasModel,IMetaName {
	private String name,dimention;
	public BlockOres(String name, String dimentions) {
		super(Material.ROCK);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.REDSTONE);
	//	setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumHandler));
		
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}

	@Override
	public void RegisterModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}

}
