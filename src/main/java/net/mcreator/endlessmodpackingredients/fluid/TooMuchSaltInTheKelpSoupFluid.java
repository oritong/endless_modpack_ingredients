
package net.mcreator.endlessmodpackingredients.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.endlessmodpackingredients.init.EndlessModpackIngredientsModItems;
import net.mcreator.endlessmodpackingredients.init.EndlessModpackIngredientsModFluids;
import net.mcreator.endlessmodpackingredients.init.EndlessModpackIngredientsModFluidTypes;
import net.mcreator.endlessmodpackingredients.init.EndlessModpackIngredientsModBlocks;

public abstract class TooMuchSaltInTheKelpSoupFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> EndlessModpackIngredientsModFluidTypes.TOO_MUCH_SALT_IN_THE_KELP_SOUP_TYPE.get(),
			() -> EndlessModpackIngredientsModFluids.TOO_MUCH_SALT_IN_THE_KELP_SOUP.get(), () -> EndlessModpackIngredientsModFluids.FLOWING_TOO_MUCH_SALT_IN_THE_KELP_SOUP.get()).explosionResistance(100f)
			.bucket(() -> EndlessModpackIngredientsModItems.TOO_MUCH_SALT_IN_THE_KELP_SOUP_BUCKET.get()).block(() -> (LiquidBlock) EndlessModpackIngredientsModBlocks.TOO_MUCH_SALT_IN_THE_KELP_SOUP.get());

	private TooMuchSaltInTheKelpSoupFluid() {
		super(PROPERTIES);
	}

	public static class Source extends TooMuchSaltInTheKelpSoupFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends TooMuchSaltInTheKelpSoupFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
