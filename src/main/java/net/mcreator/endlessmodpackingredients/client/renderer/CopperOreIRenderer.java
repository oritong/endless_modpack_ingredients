
package net.mcreator.endlessmodpackingredients.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.endlessmodpackingredients.entity.CopperOreIEntity;

public class CopperOreIRenderer extends HumanoidMobRenderer<CopperOreIEntity, HumanoidModel<CopperOreIEntity>> {
	public CopperOreIRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(CopperOreIEntity entity) {
		return new ResourceLocation("endless_modpack_ingredients:textures/entities/mixueer_lee.png");
	}
}
