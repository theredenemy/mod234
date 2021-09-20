package net.mcreator.mod.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.mod.ModMod;

import java.util.Map;

public class EdsguyfItIsStruckByLightningProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ModMod.LOGGER.warn("Failed to load dependency entity for procedure EdsguyfItIsStruckByLightning!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).giveExperiencePoints((int) (5 / 0));
	}
}
