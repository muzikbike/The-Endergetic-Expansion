package endergeticexpansion.client.model.booflo;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import endergeticexpansion.api.endimator.EndimatorEntityModel;
import endergeticexpansion.api.endimator.EndimatorModelRenderer;
import endergeticexpansion.common.entities.booflo.EntityBooflo;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * BoofloDefault - Endergized
 * Created using Tabula 7.0.0
 */
@OnlyIn(Dist.CLIENT)
public class ModelBooflo<E extends EntityBooflo> extends EndimatorEntityModel<E> {
    public EndimatorModelRenderer Head;
    public EndimatorModelRenderer Jaw;
    public EndimatorModelRenderer KneeLeft;
    public EndimatorModelRenderer KneeRight;
    public EndimatorModelRenderer LegLeft;
    public EndimatorModelRenderer LegRight;
    public EndimatorModelRenderer LegBackLeft;
    public EndimatorModelRenderer LegBackRight;
    public EndimatorModelRenderer FruitPos;
    
    public EndimatorModelRenderer HeadInflated;
    public EndimatorModelRenderer KneeLeftInflated;
    public EndimatorModelRenderer KneeRightInflated;
    public EndimatorModelRenderer LegLeftInflated;
    public EndimatorModelRenderer LegRightInflated;
    public EndimatorModelRenderer JawInflated;
    public EndimatorModelRenderer LegBackLeftInflated;
    public EndimatorModelRenderer LegBackRightInflated;
    
    public ModelBooflo() {
        this.textureWidth = 150;
        this.textureHeight = 150;
        this.Jaw = new EndimatorModelRenderer(this, 0, 0);
        this.Jaw.setRotationPoint(0.0F, 4.0F, 8.0F);
        this.Jaw.addBox(-8.0F, 0.0F, -16.0F, 16, 6, 16, 0.0F);
        this.LegLeft = new EndimatorModelRenderer(this, 28, 59);
        this.LegLeft.setRotationPoint(8.5F, 2.0F, -3.0F);
        this.LegLeft.addBox(0.0F, -1.5F, -1.5F, 20, 3, 3, 0.0F);
        this.setRotateAngle(LegLeft, 0.0F, 0.5235987755982988F, 1.0471975511965976F);
        this.LegRight = new EndimatorModelRenderer(this, 28, 59);
        this.LegRight.setRotationPoint(-8.5F, 2.0F, -3.0F);
        this.LegRight.addBox(0.0F, -1.5F, -1.5F, 20, 3, 3, 0.0F);
        this.setRotateAngle(LegRight, 0.0F, 0.5235987755982988F, 2.0943951023931953F);
        this.KneeRight = new EndimatorModelRenderer(this, 0, 58);
        this.KneeRight.setRotationPoint(-5.5F, -2.0F, 5.5F);
        this.KneeRight.addBox(-2.5F, -10.0F, -2.5F, 5, 10, 5, 0.0F);
        this.setRotateAngle(KneeRight, 0.0F, 0.17453292519943295F, -0.7853981633974483F);
        this.KneeLeft = new EndimatorModelRenderer(this, 0, 58);
        this.KneeLeft.setRotationPoint(5.5F, -2.0F, 5.5F);
        this.KneeLeft.addBox(-2.5F, -10.0F, -2.5F, 5, 10, 5, 0.0F);
        this.setRotateAngle(KneeLeft, 0.0F, -0.17453292519943295F, 0.7853981633974483F);
        this.LegBackRight = new EndimatorModelRenderer(this, 0, 89);
        this.LegBackRight.setRotationPoint(-1.5F, -7.5F, 0.0F);
        this.LegBackRight.addBox(-25.0F, -1.5F, -1.5F, 25, 3, 3, 0.0F);
        this.setRotateAngle(LegBackRight, 0.0F, 0.3490658503988659F, -0.3490658503988659F);
        this.LegBackLeft = new EndimatorModelRenderer(this, 0, 81);
        this.LegBackLeft.setRotationPoint(1.5F, -7.5F, -0.5F);
        this.LegBackLeft.addBox(0.0F, -1.5F, -1.5F, 25, 3, 3, 0.0F);
        this.setRotateAngle(LegBackLeft, 0.0F, -0.3490658503988659F, 0.3490658503988659F);
        this.Head = new EndimatorModelRenderer(this, 0, 29);
        this.Head.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.Head.addBox(-9.0F, -4.0F, -9.0F, 18, 8, 18, 0.0F);
        this.setRotateAngle(Head, -0.091106186954104F, 0.0F, 0.0F);
        this.FruitPos = new EndimatorModelRenderer(this, 0, 0);
        this.FruitPos.setRotationPoint(20.0F, -4.15F, -0.5F);
        this.FruitPos.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(FruitPos, -0.7853981633974483F, -0.2617993877991494F, -1.3089969389957472F);
        this.Head.addChild(this.Jaw);
        this.Head.addChild(this.LegLeft);
        this.Head.addChild(this.LegRight);
        this.Head.addChild(this.KneeRight);
        this.Head.addChild(this.KneeLeft);
        this.KneeRight.addChild(this.LegBackRight);
        this.KneeLeft.addChild(this.LegBackLeft);
        this.LegRight.addChild(this.FruitPos);
        
        this.LegRightInflated = new EndimatorModelRenderer(this, 28, 66);
        this.LegRightInflated.setRotationPoint(-8.5F, 2.0F, -3.0F);
        this.LegRightInflated.addBox(0.0F, -1.5F, -1.5F, 20, 3, 3, 0.0F);
        this.setRotateAngle(LegRightInflated, 0.0F, 0.5235987755982988F, 3.141592653589794F);
        this.LegBackLeftInflated = new EndimatorModelRenderer(this, 0, 81);
        this.LegBackLeftInflated.setRotationPoint(1.5F, -7.5F, -0.5F);
        this.LegBackLeftInflated.addBox(0.0F, -1.5F, -1.5F, 25, 3, 3, 0.0F);
        this.setRotateAngle(LegBackLeftInflated, 0.0F, -0.3490658503988659F, 0.3490658503988658F);
        this.JawInflated = new EndimatorModelRenderer(this, 0, 97);
        this.JawInflated.setRotationPoint(0.0F, 4.0F, 8.0F);
        this.JawInflated.addBox(-16.0F, 0.0F, -24.0F, 32, 16, 32, 0.0F);
        this.KneeRightInflated = new EndimatorModelRenderer(this, 0, 58);
        this.KneeRightInflated.setRotationPoint(-5.5F, -2.0F, 5.5F);
        this.KneeRightInflated.addBox(-2.5F, -10.0F, -2.5F, 5, 10, 5, 0.0F);
        this.setRotateAngle(KneeRightInflated, 0.0F, 0.17453292519943295F, -0.5585053606381855F);
        this.LegLeftInflated = new EndimatorModelRenderer(this, 28, 59);
        this.LegLeftInflated.setRotationPoint(8.5F, 2.0F, -3.0F);
        this.LegLeftInflated.addBox(0.0F, -1.5F, -1.5F, 20, 3, 3, 0.0F);
        this.setRotateAngle(LegLeftInflated, 0.0F, 0.5235987755982988F, -2.4802620430283604E-16F);
        this.HeadInflated = new EndimatorModelRenderer(this, 0, 29);
        this.HeadInflated.setRotationPoint(0.0F, 3.9999999999999947F, 0.0F);
        this.HeadInflated.addBox(-9.0F, -4.0F, -9.0F, 18, 8, 18, 0.0F);
        this.setRotateAngle(HeadInflated, 3.1003275537854505E-17F, 0.0F, 0.0F);
        this.KneeLeftInflated = new EndimatorModelRenderer(this, 0, 58);
        this.KneeLeftInflated.setRotationPoint(5.5F, -2.0F, 5.5F);
        this.KneeLeftInflated.addBox(-2.5F, -10.0F, -2.5F, 5, 10, 5, 0.0F);
        this.setRotateAngle(KneeLeftInflated, 0.0F, -0.17453292519943295F, 0.558505360638178F);
        this.LegBackRightInflated = new EndimatorModelRenderer(this, 0, 89);
        this.LegBackRightInflated.setRotationPoint(-1.5F, -7.5F, 0.0F);
        this.LegBackRightInflated.addBox(-25.0F, -1.5F, -1.5F, 25, 3, 3, 0.0F);
        this.setRotateAngle(LegBackRightInflated, 0.0F, 0.3490658503988659F, -0.3490658503988659F);
        this.HeadInflated.addChild(this.LegRightInflated);
        this.KneeLeftInflated.addChild(this.LegBackLeftInflated);
        this.HeadInflated.addChild(this.JawInflated);
        this.HeadInflated.addChild(this.KneeRightInflated);
        this.HeadInflated.addChild(this.LegLeftInflated);
        this.HeadInflated.addChild(this.KneeLeftInflated);
        this.KneeRightInflated.addChild(this.LegBackRightInflated);
        
        this.createScaleController();
        
        this.setDefaultBoxValues();
    }
    
    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
    	this.animateModel(this.entity);
    	
    	if(this.entity.isBoofed()) {
    		this.HeadInflated.render(matrixStack, buffer, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    	} else {
    		this.Head.render(matrixStack, buffer, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    	}
    }
    
    @Override
    public void setRotationAngles(E booflo, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    	super.setRotationAngles(booflo, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
    	
    	this.revertBoxesToDefaultValues();
    	
    	if(booflo.isBoofed()) {
    		this.HeadInflated.rotateAngleY = netHeadYaw * (float) (Math.PI / 180F);
    		this.HeadInflated.rotateAngleX = headPitch * (float) (Math.PI / 180F);
    	
    		this.JawInflated.rotateAngleX += 0.4F * booflo.OPEN_JAW.getAnimationProgress();
    	}
    }
    
    @Override
    public void animateModel(E booflo) {
    	this.endimator.updateAnimations(booflo);
    	
    	if(booflo.isEndimationPlaying(EntityBooflo.CROAK)) {
    		this.endimator.setAnimationToPlay(EntityBooflo.CROAK);
    		
    		this.endimator.startKeyframe(5);
    		this.endimator.rotate(this.Jaw, 0.25F, 0.0F, 0.0F);
    		this.endimator.endKeyframe();
    		
    		this.endimator.setStaticKeyframe(45);
    		
    		this.endimator.startKeyframe(5);
    		this.endimator.rotate(this.Jaw, -0.0F, 0.0F, 0.0F);
    		this.endimator.endKeyframe();
    	} else if(booflo.isEndimationPlaying(EntityBooflo.HOP)) {
    		this.endimator.setAnimationToPlay(EntityBooflo.HOP);
    		
    		this.endimator.startKeyframe(10);
    		this.endimator.rotate(this.KneeRight, 0.0F, -0.6F, -0.2F);
    		this.endimator.rotate(this.LegBackRight, 0.0F, 0.0F, 0.5F);
    		
    		this.endimator.rotate(this.KneeLeft, 0.0F, 0.6F, 0.2F);
    		this.endimator.rotate(this.LegBackLeft, 0.0F, 0.0F, -0.5F);
    		
    		this.endimator.rotate(this.LegRight, 0.0F, -0.75F, 0.14F);
    		this.endimator.rotate(this.LegLeft, 0.0F, -0.75F, -0.14F);
    		
    		this.endimator.rotate(this.Jaw, -0.02F, 0.0F, 0.0F);
    		
    		this.endimator.rotate(this.Head, 0.05F, 0.0F, 0.0F);
    		this.endimator.endKeyframe();
    		
    		this.endimator.startKeyframe(5);
    		this.endimator.rotate(this.KneeRight, -0.18F, 0.33F, -0.2F);
    		this.endimator.rotate(this.LegBackRight, 0.06F, 0.33F, 0.18F);
    		
    		this.endimator.rotate(this.KneeLeft, -0.18F, -0.33F, 0.2F);
    		this.endimator.rotate(this.LegBackLeft, 0.06F, -0.33F, -0.18F);
    		
    		this.endimator.rotate(this.LegRight, 0.0F, 0.47F, 0.0F);
    		this.endimator.rotate(this.LegLeft, 0.0F, 0.47F, 0.0F);
    		
    		this.endimator.rotate(this.Jaw, 0.2F, 0.0F, 0.0F);
    		
    		this.endimator.rotate(this.Head, -0.4F, 0.0F, 0.0F);
    		this.endimator.endKeyframe();
    		
    		/*
    		 * Brings to Default
    		 */
    		this.endimator.startKeyframe(10);
    		this.endimator.endKeyframe();
    	} else if(booflo.isEndimationPlaying(EntityBooflo.HURT)) {
    		this.endimator.setAnimationToPlay(EntityBooflo.HURT);
    		
    		this.endimator.startKeyframe(5);
    		this.endimator.rotate(this.Jaw, 0.25F, 0.0F, 0.0F);
    		
    		this.endimator.rotate(this.KneeRight, -0.18F, 0.23F, -0.2F);
    		this.endimator.rotate(this.LegBackRight, 0.06F, 0.23F, 0.18F);
    		
    		this.endimator.rotate(this.KneeLeft, -0.18F, -0.23F, 0.2F);
    		this.endimator.rotate(this.LegBackLeft, 0.06F, -0.23F, -0.18F);
    		
    		this.endimator.rotate(this.LegRight, 0.0F, 0.30F, 0.0F);
    		this.endimator.rotate(this.LegLeft, 0.0F, 0.30F, 0.0F);
    		
    		this.endimator.rotate(this.Head, 0.05F, 0.0F, 0.0F);
    		this.endimator.endKeyframe();
    		
    		this.endimator.setStaticKeyframe(5);
    		
    		/*
    		 * Brings to Default
    		 */
    		this.endimator.startKeyframe(5);
    		this.endimator.endKeyframe();
    	} else if(booflo.isEndimationPlaying(EntityBooflo.BIRTH)) {
    		this.endimator.setAnimationToPlay(EntityBooflo.BIRTH);
    		
    		this.endimator.startKeyframe(10);
    		this.endimator.rotate(this.Head, 0.05F, 0.0F, 0.0F);
    		this.endimator.endKeyframe();
    		
    		this.endimator.setStaticKeyframe(120);
    		
    		this.endimator.startKeyframe(10);
    		this.endimator.rotate(this.Head, 0.00F, 0.0F, 0.0F);
    		this.endimator.endKeyframe();
    	} else if(booflo.isEndimationPlaying(EntityBooflo.EAT)) {
    		this.endimator.setAnimationToPlay(EntityBooflo.EAT);
    		
    		/*
    		 * Start
    		 */
    		this.endimator.startKeyframe(20);
    		this.endimator.rotate(this.LegRight, 0.0F, 0.15F, -0.9F);
    		this.endimator.rotate(this.LegLeft, 0.0F, 0.15F, 0.9F);
    		this.endimator.endKeyframe();
    		
    		//-------------------------------------------------------
    		
    		this.endimator.startKeyframe(10);
    		this.endimator.rotate(this.Jaw, 0.4F, 0.0F, 0.0F);
    		this.endimator.rotate(this.Head, -0.1F, 0.0F, 0.0F);
    		
    		this.endimator.rotate(this.LegBackRight, 0.0F, 0.03F, 0.05F);
    		this.endimator.rotate(this.LegBackLeft, 0.0F, -0.03F, -0.05F);
    		
    		this.endimator.rotate(this.LegRight, 0.0F, 0.25F, -0.93F);
    		this.endimator.rotate(this.LegLeft, 0.0F, 0.25F, 0.93F);
    		this.endimator.endKeyframe();
    		
    		this.endimator.startKeyframe(10);
    		this.endimator.rotate(this.LegBackRight, 0.0F, 0.0F, 0.0F);
    		this.endimator.rotate(this.LegBackLeft, 0.0F, 0.0F, 0.0F);
    		
    		this.endimator.rotate(this.LegRight, 0.0F, 0.15F, -0.9F);
    		this.endimator.rotate(this.LegLeft, 0.0F, 0.15F, 0.9F);
    		this.endimator.endKeyframe();
    		
    		//-------------------------------------------------------
    		
    		this.endimator.startKeyframe(10);
    		this.endimator.rotate(this.Jaw, 0.4F, 0.0F, 0.0F);
    		this.endimator.rotate(this.Head, -0.1F, 0.0F, 0.0F);
    		
    		this.endimator.rotate(this.LegBackRight, 0.0F, 0.03F, 0.05F);
    		this.endimator.rotate(this.LegBackLeft, 0.0F, -0.03F, -0.05F);
    		
    		this.endimator.rotate(this.LegRight, 0.0F, 0.25F, -0.93F);
    		this.endimator.rotate(this.LegLeft, 0.0F, 0.25F, 0.93F);
    		this.endimator.endKeyframe();
    		
    		this.endimator.startKeyframe(10);
    		this.endimator.rotate(this.LegBackRight, 0.0F, 0.0F, 0.0F);
    		this.endimator.rotate(this.LegBackLeft, 0.0F, 0.0F, 0.0F);
    		
    		this.endimator.rotate(this.LegRight, 0.0F, 0.15F, -0.9F);
    		this.endimator.rotate(this.LegLeft, 0.0F, 0.15F, 0.9F);
    		this.endimator.endKeyframe();
    		
    		//-------------------------------------------------------
    		
    		this.endimator.startKeyframe(10);
    		this.endimator.rotate(this.Jaw, 0.4F, 0.0F, 0.0F);
    		this.endimator.rotate(this.Head, -0.1F, 0.0F, 0.0F);
    		
    		this.endimator.rotate(this.LegBackRight, 0.0F, 0.03F, 0.05F);
    		this.endimator.rotate(this.LegBackLeft, 0.0F, -0.03F, -0.05F);
    		
    		this.endimator.rotate(this.LegRight, 0.0F, 0.25F, -0.93F);
    		this.endimator.rotate(this.LegLeft, 0.0F, 0.25F, 0.93F);
    		this.endimator.endKeyframe();
    		
    		this.endimator.startKeyframe(10);
    		this.endimator.rotate(this.LegBackRight, 0.0F, 0.0F, 0.0F);
    		this.endimator.rotate(this.LegBackLeft, 0.0F, 0.0F, 0.0F);
    		
    		this.endimator.rotate(this.LegRight, 0.0F, 0.15F, -0.9F);
    		this.endimator.rotate(this.LegLeft, 0.0F, 0.15F, 0.9F);
    		this.endimator.endKeyframe();
    		
    		//-------------------------------------------------------
    		
    		this.endimator.startKeyframe(10);
    		this.endimator.rotate(this.Jaw, 0.4F, 0.0F, 0.0F);
    		this.endimator.rotate(this.Head, -0.1F, 0.0F, 0.0F);
    		
    		this.endimator.rotate(this.LegBackRight, 0.0F, 0.03F, 0.05F);
    		this.endimator.rotate(this.LegBackLeft, 0.0F, -0.03F, -0.05F);
    		
    		this.endimator.rotate(this.LegRight, 0.0F, 0.25F, -0.93F);
    		this.endimator.rotate(this.LegLeft, 0.0F, 0.25F, 0.93F);
    		this.endimator.endKeyframe();
    		
    		this.endimator.startKeyframe(10);
    		this.endimator.rotate(this.LegBackRight, 0.0F, 0.0F, 0.0F);
    		this.endimator.rotate(this.LegBackLeft, 0.0F, 0.0F, 0.0F);
    		
    		this.endimator.rotate(this.LegRight, 0.0F, 0.15F, -0.9F);
    		this.endimator.rotate(this.LegLeft, 0.0F, 0.15F, 0.9F);
    		this.endimator.endKeyframe();
    		
    		//-------------------------------------------------------
    		
    		this.endimator.startKeyframe(10);
    		this.endimator.rotate(this.Jaw, 0.4F, 0.0F, 0.0F);
    		this.endimator.rotate(this.Head, -0.1F, 0.0F, 0.0F);
    		
    		this.endimator.rotate(this.LegBackRight, 0.0F, 0.03F, 0.05F);
    		this.endimator.rotate(this.LegBackLeft, 0.0F, -0.03F, -0.05F);
    		
    		this.endimator.rotate(this.LegRight, 0.0F, 0.25F, -0.93F);
    		this.endimator.rotate(this.LegLeft, 0.0F, 0.25F, 0.93F);
    		this.endimator.endKeyframe();
    		
    		this.endimator.startKeyframe(10);
    		this.endimator.rotate(this.LegBackRight, 0.0F, 0.0F, 0.0F);
    		this.endimator.rotate(this.LegBackLeft, 0.0F, 0.0F, 0.0F);
    		
    		this.endimator.rotate(this.LegRight, 0.0F, 0.15F, -0.9F);
    		this.endimator.rotate(this.LegLeft, 0.0F, 0.15F, 0.9F);
    		this.endimator.endKeyframe();
    		
    		//-------------------------------------------------------
    		
    		this.endimator.startKeyframe(10);
    		this.endimator.rotate(this.Jaw, 0.4F, 0.0F, 0.0F);
    		this.endimator.rotate(this.Head, -0.1F, 0.0F, 0.0F);
    		
    		this.endimator.rotate(this.LegBackRight, 0.0F, 0.03F, 0.05F);
    		this.endimator.rotate(this.LegBackLeft, 0.0F, -0.03F, -0.05F);
    		
    		this.endimator.rotate(this.LegRight, 0.0F, 0.25F, -0.93F);
    		this.endimator.rotate(this.LegLeft, 0.0F, 0.25F, 0.93F);
    		this.endimator.endKeyframe();
    		
    		this.endimator.startKeyframe(10);
    		this.endimator.rotate(this.LegBackRight, 0.0F, 0.0F, 0.0F);
    		this.endimator.rotate(this.LegBackLeft, 0.0F, 0.0F, 0.0F);
    		
    		this.endimator.rotate(this.LegRight, 0.0F, 0.15F, -0.9F);
    		this.endimator.rotate(this.LegLeft, 0.0F, 0.15F, 0.9F);
    		this.endimator.endKeyframe();
    		
    		//-------------------------------------------------------
    		
    		/*
    		 * End
    		 */
    		this.endimator.resetKeyframe(20);
    	} else if(booflo.isEndimationPlaying(EntityBooflo.GROWL)) {
    		this.endimator.setAnimationToPlay(EntityBooflo.GROWL);
    		
    		this.endimator.startKeyframe(10);
    		this.endimator.rotate(this.Jaw, 0.25F, 0.0F, 0.0F);
    		this.endimator.endKeyframe();
    		
    		this.endimator.setStaticKeyframe(45);
    		
    		this.endimator.startKeyframe(5);
    		this.endimator.rotate(this.Jaw, -0.0F, 0.0F, 0.0F);
    		this.endimator.endKeyframe();
    	} else if(booflo.isEndimationPlaying(EntityBooflo.INFLATE)) {
    		this.endimator.setAnimationToPlay(EntityBooflo.INFLATE);
    		
    		this.endimator.startKeyframe(5);
    		this.endimator.move(this.getScaleController(), 0.7F, 0.0F, 0.7F);
    		
    		this.endimator.rotate(this.LegRightInflated, 0.0F, 0.0F, 0.6F);
    		this.endimator.rotate(this.LegLeftInflated, 0.0F, 0.0F, -0.6F);
    		
    		this.endimator.rotate(this.KneeRightInflated, 0.0F, 0.0F, 0.4F);
    		this.endimator.rotate(this.LegBackRightInflated, 0.0F, 0.0F, -0.4F);
    		
    		this.endimator.rotate(this.KneeRightInflated, 0.0F, 0.0F, 0.2F);
    		this.endimator.rotate(this.KneeLeftInflated, 0.0F, 0.0F, -0.2F);
    		this.endimator.endKeyframe();
    		
    		this.endimator.startKeyframe(5);
    		this.endimator.move(this.getScaleController(), 0.0F, 0.0F, 0.0F);
    		this.endimator.endKeyframe();
    	} else if(booflo.isEndimationPlaying(EntityBooflo.SWIM)) {
    		this.endimator.setAnimationToPlay(EntityBooflo.SWIM);
    		
    		this.endimator.startKeyframe(10);
    		this.endimator.rotate(this.LegRightInflated, 0.0F, -1.6F, 0.0F);
    		this.endimator.rotate(this.LegLeftInflated, 0.0F, -1.6F, 0.0F);
    		
    		this.endimator.rotate(this.KneeRightInflated, -0.895F, 0.0F, 0.0F);
    		this.endimator.rotate(this.KneeLeftInflated, -0.895F, 0.0F, 0.0F);
    		
    		this.endimator.rotate(this.LegBackRightInflated, 0.8F, 0.8F, 1.6F);
    		this.endimator.rotate(this.LegBackLeftInflated, 0.8F, -0.8F, -1.6F);
    		
    		this.endimator.rotate(this.JawInflated, 0.2F, 0.0F, 0.0F);
    		
    		this.endimator.rotate(this.HeadInflated, -0.105F, 0.0F, 0.0F);
    		this.endimator.move(this.HeadInflated, 0.0F, -0.3F, 0.0F);
    		this.endimator.endKeyframe();
    		
    		/*
    		 * Returns to defaults
    		 */
    		this.endimator.startKeyframe(10);
    		this.endimator.endKeyframe();
    	} else if(booflo.isEndimationPlaying(EntityBooflo.CHARGE)) {
    		this.endimator.setAnimationToPlay(EntityBooflo.CHARGE);
    		
    		this.endimator.startKeyframe(15);
    		this.endimator.rotate(this.LegRightInflated, 0.0F, 0.0F, 0.5F);
    		this.endimator.rotate(this.LegLeftInflated, 0.0F, 0.0F, -0.5F);
    		
    		this.endimator.rotate(this.KneeRightInflated, 0.0F, 0.0F, 0.4F);
    		this.endimator.rotate(this.KneeLeftInflated, 0.0F, 0.0F, -0.4F);
    		
    		this.endimator.rotate(this.LegBackRightInflated, 0.0F, 0.0F, 0.5F);
    		this.endimator.rotate(this.LegBackLeftInflated, 0.0F, 0.0F, -0.5F);
    		this.endimator.endKeyframe();
    		
    		this.endimator.setStaticKeyframe(60);
    	} else if(booflo.isEndimationPlaying(EntityBooflo.SLAM)) {
    		this.endimator.setAnimationToPlay(EntityBooflo.SLAM);
    		
    		this.endimator.startKeyframe(4);
    		this.endimator.move(this.HeadInflated, 0.0F, 9.9F, 0.0F);
    		this.endimator.move(this.getScaleController(), -0.2F, -0.5F, -0.2F);
    		
    		this.endimator.rotate(this.LegRightInflated, 0.0F, 0.0F, -0.5F);
    		this.endimator.rotate(this.LegLeftInflated, 0.0F, 0.0F, 0.5F);
    		
    		this.endimator.rotate(this.KneeRightInflated, 0.0F, 0.0F, -0.5F);
    		this.endimator.rotate(this.KneeLeftInflated, 0.0F, 0.0F, 0.5F);
    		
    		this.endimator.rotate(this.LegBackRightInflated, 0.0F, 0.0F, -0.2F);
    		this.endimator.rotate(this.LegBackLeftInflated, 0.0F, 0.0F, 0.2F);
    		this.endimator.endKeyframe();
    		
    		this.endimator.startKeyframe(3);
    		this.endimator.move(this.HeadInflated, 0.0F, 1.9F, 0.0F);
    		this.endimator.move(this.getScaleController(), 0.8F, 1.5F, 0.8F);
    		
    		this.endimator.rotate(this.LegRightInflated, 0.0F, 0.0F, 0.5F);
    		this.endimator.rotate(this.LegLeftInflated, 0.0F, 0.0F, -0.5F);
    		
    		this.endimator.rotate(this.KneeRightInflated, 0.0F, 0.0F, 0.7F);
    		this.endimator.rotate(this.KneeLeftInflated, 0.0F, 0.0F, -0.7F);
    		
    		this.endimator.rotate(this.LegBackRightInflated, 0.0F, 0.0F, 0.1F);
    		this.endimator.rotate(this.LegBackLeftInflated, 0.0F, 0.0F, -0.1F);
    		this.endimator.endKeyframe();
    		
    		this.endimator.resetKeyframe(3);
    	}
    	
    	this.HeadInflated.setScale(this.getScaleController().rotationPointX, this.getScaleController().rotationPointY, this.getScaleController().rotationPointZ);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(EndimatorModelRenderer EndimatorModelRenderer, float x, float y, float z) {
        EndimatorModelRenderer.rotateAngleX = x;
        EndimatorModelRenderer.rotateAngleY = y;
        EndimatorModelRenderer.rotateAngleZ = z;
    }
}