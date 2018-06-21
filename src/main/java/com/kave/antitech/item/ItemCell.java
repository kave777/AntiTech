package com.kave.antitech.item;

import com.kave.antitech.Main;
import com.kave.antitech.init.ModItems;

public class ItemCell extends ItemBase {

	public ItemCell(String name) {
		super(name);
		setUnlocalizedName(name);
		//setRegistryName(name);
		this.setCreativeTab(Main.AntitechItems);
		
		ModItems.ITEMS.add(this);
	}
	

}
