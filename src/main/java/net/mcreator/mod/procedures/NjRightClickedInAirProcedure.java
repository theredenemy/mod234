package net.mcreator.mod.procedures;

import net.minecraft.item.ItemStack;

import net.mcreator.mod.ModMod;

import java.util.Map;

public class NjRightClickedInAirProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				ModMod.LOGGER.warn("Failed to load dependency itemstack for procedure NjRightClickedInAir!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		(itemstack).getOrCreateTag().putDouble("f", (1 / 0));
	}
}
