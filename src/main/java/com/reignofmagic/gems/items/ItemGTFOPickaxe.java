package com.reignofmagic.gems.items;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.helper.Reference;
import com.reignofmagic.gems.init.ModItems;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemGTFOPickaxe extends ItemPickaxe{
	public ItemGTFOPickaxe(ToolMaterial material, String name)
	{
		super(material);
		setUnlocalizedName(Reference.MODID + "_" + name + "Pickaxe");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(Gems.GTFOtab);
	}

}
