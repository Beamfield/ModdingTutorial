/**
 * @author: Beamfield
 * License: Creative Commons
 */
package com.beamfield.youtubetut;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

import com.beamfield.youtubetut.eventhandler.TutorialHandler;
import com.beamfield.youtubetut.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid=Reference.MODID, version=Reference.VERSION)
public class Main {
	public static Main instance;
	public static Item tutorialItem;
	public static Block tutorialBlock;
	public static final Item.ToolMaterial TutorialMaterial = EnumHelper.addToolMaterial("TutorialMaterial", 2, 1000, 7.0F, 3.0F, 15);
	public static Item tutorialSword;
	public static Item tutorialPickaxe;
	public static Item tutorialShovel;
	public static Item tutorialAxe;
	public static Item tutorialHoe;
	
	public static int armorIDtutorialHelmet;
	public static int armorIDtutorialChestplate;
	public static int armorIDtutorialLeggings;
	public static int armorIDtutorialBoots;
	
	public static Item tutorialHelmet;
	public static Item tutorialChestplate;
	public static Item tutorialLeggings;
	public static Item tutorialBoots;
	
	public static ItemArmor.ArmorMaterial TutorialMaterialArmor = EnumHelper.addArmorMaterial("TutorialMaterialArmor", 17, new int[]{2, 6, 5, 2},9);
	
	//CreativeTab:
	public static CreativeTabs tabTutorial = new CreativeTabs("youtubetut")
	{
		public Item getTabIconItem(){
			return Item.getItemFromBlock(Blocks.bedrock);
		}
	};
	@SidedProxy(clientSide=Reference.CLProxyLoc, serverSide=Reference.CProxyLoc)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ModRegistry.preInit();
	}
	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.registerRenderers();
		ModRegistry.init();
	}
	@EventHandler
	public void load(FMLInitializationEvent event){
		MinecraftForge.EVENT_BUS.register(new TutorialHandler());
	}
}
