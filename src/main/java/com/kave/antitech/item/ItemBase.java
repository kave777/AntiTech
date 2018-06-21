package com.kave.antitech.item;

import com.kave.antitech.Main;
import com.kave.antitech.init.ModItems;
import com.kave.antitech.util.interfaces.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
	
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		this.setCreativeTab(Main.AntitechItems);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override 
	public void RegisterModels() {
		Main.proxy.registerItemRenderer(this , 0,"inventory");
		
		
	}

}
