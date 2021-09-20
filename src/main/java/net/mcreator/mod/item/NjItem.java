
package net.mcreator.mod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;

import net.mcreator.mod.procedures.NjRightClickedInAirProcedure;
import net.mcreator.mod.ModModElements;

import java.util.Map;
import java.util.HashMap;

@ModModElements.ModElement.Tag
public class NjItem extends ModModElements.ModElement {
	@ObjectHolder("mod:nj")
	public static final Item block = null;
	public NjItem(ModModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, ModModElements.sounds.get(new ResourceLocation("mod:fll")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("nj");
		}

		@Override
		public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
			ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
			ItemStack itemstack = ar.getResult();
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("itemstack", itemstack);
				NjRightClickedInAirProcedure.executeProcedure($_dependencies);
			}
			return ar;
		}
	}
}
