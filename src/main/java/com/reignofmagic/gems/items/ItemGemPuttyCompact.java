package com.reignofmagic.gems.items;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.helper.Reference;

import net.minecraft.item.Item;

public class ItemGemPuttyCompact extends Item {
	public ItemGemPuttyCompact() {
		super();
		setUnlocalizedName(Reference.MODID + "_" + "PuttyCompact");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(Gems.GTFOtab);
}
}
