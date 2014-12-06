package com.beamfield.youtubetut.eventhandler;

import com.beamfield.youtubetut.Main;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class TutorialHandler {
	@SubscribeEvent
	public void onLivingUpdateEvent(LivingUpdateEvent event){
		if(event.entityLiving != null){  
			if(event.entityLiving instanceof EntityPlayer){
				if(((EntityPlayer)event.entityLiving).inventory.armorItemInSlot(2) != null && ((EntityPlayer)event.entityLiving).inventory.armorItemInSlot(2).getItem() == Main.tutorialChestplate && ((EntityPlayer)event.entityLiving).capabilities.isCreativeMode == false){
					((EntityPlayer)event.entityLiving).capabilities.allowFlying = true;
				}else if(((EntityPlayer)event.entityLiving).capabilities.isCreativeMode == false){
					((EntityPlayer)event.entityLiving).capabilities.allowFlying = false;
				}
			}
		}
	}
}
