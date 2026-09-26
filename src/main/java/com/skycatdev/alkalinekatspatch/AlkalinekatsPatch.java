package com.skycatdev.alkalinekatspatch;

import net.fabricmc.api.ModInitializer;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

import net.minecraft.sounds.SoundEvent;

public class AlkalinekatsPatch implements ModInitializer {
	public static final String MOD_ID = "alkalinekats-patch";

	public static final SoundEvent SOUND = Registry.register(BuiltInRegistries.SOUND_EVENT, id("alkalinekats"),
			SoundEvent.createVariableRangeEvent(id("alkalinekats")));

	@Override
	public void onInitialize() {
	}

	public static ResourceLocation id(String path) {
		return new ResourceLocation(MOD_ID, path);
	}
}
