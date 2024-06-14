
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endlessmodpackingredients.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.endlessmodpackingredients.client.renderer.QuartzOreIRenderer;
import net.mcreator.endlessmodpackingredients.client.renderer.IronOreIRenderer;
import net.mcreator.endlessmodpackingredients.client.renderer.CopperOreIRenderer;
import net.mcreator.endlessmodpackingredients.client.renderer.CoalOreIRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EndlessModpackIngredientsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(EndlessModpackIngredientsModEntities.COPPER_ORE_I.get(), CopperOreIRenderer::new);
		event.registerEntityRenderer(EndlessModpackIngredientsModEntities.IRON_ORE_I.get(), IronOreIRenderer::new);
		event.registerEntityRenderer(EndlessModpackIngredientsModEntities.COAL_ORE_I.get(), CoalOreIRenderer::new);
		event.registerEntityRenderer(EndlessModpackIngredientsModEntities.QUARTZ_ORE_I.get(), QuartzOreIRenderer::new);
	}
}
