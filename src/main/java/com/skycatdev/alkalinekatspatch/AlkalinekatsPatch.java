package com.skycatdev.alkalinekatspatch;

import net.fabricmc.api.ModInitializer;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

import net.minecraft.sounds.SoundEvent;

public class AlkalinekatsPatch implements ModInitializer {

	@Override
	public void onInitialize() {
		makeSound("alkalinekats");
	}

	/**
	 * Super easy helper method to make it easy.
	 */
	public static void makeSound(String path) {
		ResourceLocation id = new ResourceLocation("alkalinekats-patch", path);
		Registry.register(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
	}
}
