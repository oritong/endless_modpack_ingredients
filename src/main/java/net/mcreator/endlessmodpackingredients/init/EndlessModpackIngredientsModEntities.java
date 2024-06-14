
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endlessmodpackingredients.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.endlessmodpackingredients.entity.QuartzOreIEntity;
import net.mcreator.endlessmodpackingredients.entity.IronOreIEntity;
import net.mcreator.endlessmodpackingredients.entity.CopperOreIEntity;
import net.mcreator.endlessmodpackingredients.entity.CoalOreIEntity;
import net.mcreator.endlessmodpackingredients.EndlessModpackIngredientsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EndlessModpackIngredientsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, EndlessModpackIngredientsMod.MODID);
	public static final RegistryObject<EntityType<CopperOreIEntity>> COPPER_ORE_I = register("copper_ore_i",
			EntityType.Builder.<CopperOreIEntity>of(CopperOreIEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CopperOreIEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<IronOreIEntity>> IRON_ORE_I = register("iron_ore_i",
			EntityType.Builder.<IronOreIEntity>of(IronOreIEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(IronOreIEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<CoalOreIEntity>> COAL_ORE_I = register("coal_ore_i",
			EntityType.Builder.<CoalOreIEntity>of(CoalOreIEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CoalOreIEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<QuartzOreIEntity>> QUARTZ_ORE_I = register("quartz_ore_i",
			EntityType.Builder.<QuartzOreIEntity>of(QuartzOreIEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(QuartzOreIEntity::new)

					.sized(0.6f, 1.9f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CopperOreIEntity.init();
			IronOreIEntity.init();
			CoalOreIEntity.init();
			QuartzOreIEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(COPPER_ORE_I.get(), CopperOreIEntity.createAttributes().build());
		event.put(IRON_ORE_I.get(), IronOreIEntity.createAttributes().build());
		event.put(COAL_ORE_I.get(), CoalOreIEntity.createAttributes().build());
		event.put(QUARTZ_ORE_I.get(), QuartzOreIEntity.createAttributes().build());
	}
}
