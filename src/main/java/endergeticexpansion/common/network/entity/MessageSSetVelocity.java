package endergeticexpansion.common.network.entity;

import java.util.function.Supplier;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.fml.network.NetworkEvent;

/**
 * @author SmellyModder(Luke Tonon)
 */
public class MessageSSetVelocity {
	private int entityId;
	private double vecX;
	private double vecY;
	private double vecZ;
	
	public MessageSSetVelocity(Vec3d motion, int entityId) {
		this.entityId = entityId;
		this.vecX = motion.getX();
		this.vecY = motion.getY();
		this.vecZ = motion.getZ();
	}
	
	public void serialize(PacketBuffer buf) {
		buf.writeInt(this.entityId);
		buf.writeDouble(this.vecX);
		buf.writeDouble(this.vecY);
		buf.writeDouble(this.vecZ);
	}
	
	public static MessageSSetVelocity deserialize(PacketBuffer buf) {
		int entityId = buf.readInt();
		double vecX = buf.readDouble();
		double vecY = buf.readDouble();
		double vecZ = buf.readDouble();
		return new MessageSSetVelocity(new Vec3d(vecX, vecY, vecZ), entityId);
	}
	
	public static void handle(MessageSSetVelocity message, Supplier<NetworkEvent.Context> ctx) {
		NetworkEvent.Context context = ctx.get();
		PlayerEntity player = ctx.get().getSender();
		Entity entity = player.getEntityWorld().getEntityByID(message.entityId);
		if (context.getDirection().getReceptionSide() == LogicalSide.CLIENT) {
			context.enqueueWork(() -> {
				entity.setVelocity(message.vecX, message.vecY, message.vecZ);
			});
			context.setPacketHandled(true);
		}
	}
}
