package com.reignofmagic.gems.items;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.helper.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class ItemEmeraldAxe extends ItemAxe{
	public ItemEmeraldAxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(Reference.MODID + "_" + "emeraldAxe");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(Gems.GTFOtab);
		
		
	
	}
}