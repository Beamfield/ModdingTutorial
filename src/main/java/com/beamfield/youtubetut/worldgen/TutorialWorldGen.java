package com.beamfield.youtubetut.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.beamfield.youtubetut.Main;

import cpw.mods.fml.common.IWorldGenerator;

public class TutorialWorldGen implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		}
	}
	public void generateSurface(World world, Random random, int x, int z){
		this.addOreSpawn(Main.tutorialOre, world, random, x, z, 16, 16, 6, 5, 1, 40);
	}
	private void addOreSpawn(Block block, World world, Random random, int blockX, int blockZ, int maxX, int maxZ, int maxVein, int spawnChance, int minY, int maxY){
		for(int i =0; i < spawnChance;i++){
			int posX = blockX + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY);
			int posZ = blockZ + random.nextInt(maxZ);
			(new WorldGenMinable(block, maxVein)).generate(world, random, posX, posY, posZ);
		}
	}
}
