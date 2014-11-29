package com.beamfield.youtubetut.item;

import com.beamfield.youtubetut.Main;
import com.beamfield.youtubetut.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemTutorialArmor extends ItemArmor {

	public ItemTutorialArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == Main.tutorialHelmet || stack.getItem() == Main.tutorialChestplate || stack.getItem() == Main.tutorialBoots){
			return Reference.texturePrefix+"textures/models/armor/tutorial_layer_1.png";
		}else if(stack.getItem() == Main.tutorialLeggings){
			return Reference.texturePrefix+"textures/models/armor/tutorial_layer_2.png";
		}
		return null;
	}
}
