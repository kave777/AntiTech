package com.kave.antitech.item;

import com.kave.antitech.Main;
import com.kave.antitech.init.ModItems;

public class ItemPlate extends ItemBase {

	public ItemPlate(String name) {
		super(name);
		setUnlocalizedName(name);
		//setRegistryName(name);
		this.setCreativeTab(Main.AntitechItems);
		
		ModItems.ITEMS.add(this);
	}

}
