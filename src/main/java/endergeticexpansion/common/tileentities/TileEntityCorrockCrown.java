package endergeticexpansion.common.tileentities;

import endergeticexpansion.core.registry.EETileEntities;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;

public class TileEntityCorrockCrown extends TileEntity {

	public TileEntityCorrockCrown() {
		super(EETileEntities.CORROCK_CROWN.get());
	}
	
	@Override
	public AxisAlignedBB getRenderBoundingBox() {
		return super.getRenderBoundingBox().grow(8.0D);
	}
	
	@Override
	public double getMaxRenderDistanceSquared() {
		return super.getMaxRenderDistanceSquared() * 10;
	}
	
}