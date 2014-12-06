package com.beamfield.youtubetut.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockTutorialOre extends Block {

	public BlockTutorialOre(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHarvestLevel("pickaxe", 2);
	}
	public Item getItemDropped(int par1, Random rnd, int par3){
		return Items.nether_star;
	}
}
