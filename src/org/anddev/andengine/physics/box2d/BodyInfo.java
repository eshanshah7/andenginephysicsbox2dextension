package org.anddev.andengine.physics.box2d;

/**
 * @author Nicolas Gramlich
 * @since 16:29:00 - 21.03.2010
 */
public class BodyInfo {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	private float mX;
	private float mY;
	private float mAngle; // rad

	private float mVelocityX;
	private float mVelocityY;

	private boolean mBullet;
	private boolean mSleeping;
	private boolean mFrozen;
	private boolean mDynamic;
	private boolean mStatic;

	// ===========================================================
	// Constructors
	// ===========================================================

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	public float getX() {
		return this.mX;
	}

	public void setX(final float pX) {
		this.mX = pX;
	}

	public float getY() {
		return this.mY;
	}

	public void setY(final float pY) {
		this.mY = pY;
	}

	public float getAngle() {
		return this.mAngle;
	}

	public void setAngle(final float pAngle) {
		this.mAngle = pAngle;
	}

	public void setValues(final float pX, final float pY, final float pAngle) {
		this.mX = pX;
		this.mY = pY;
		this.mAngle = pAngle;
	}

	public boolean isBullet() {
		return this.mBullet;
	}

	public void setBullet(final boolean pBullet) {
		this.mBullet = pBullet;
	}

	public boolean isSleeping() {
		return this.mSleeping;
	}

	public void setSleeping(final boolean pSleeping) {
		this.mSleeping = pSleeping;
	}

	public boolean isDynamic() {
		return this.mDynamic;
	}

	public void setDynamic(final boolean pDynamic) {
		this.mDynamic = pDynamic;
	}

	public boolean isStatic() {
		return this.mStatic;
	}

	public void setStatic(final boolean pStatic) {
		this.mStatic = pStatic;
	}

	public boolean isFrozen() {
		return this.mFrozen;
	}

	public void setFrozen(final boolean pFrozen) {
		this.mFrozen = pFrozen;
	}

	public void setStatus(final boolean pBullet, final boolean pSleeping, final boolean pFrozen, final boolean pDynamic, final boolean pStatic) {
		this.mBullet = pBullet;
		this.mSleeping = pSleeping;
		this.mFrozen = pFrozen;
		this.mDynamic = pDynamic;
		this.mStatic = pStatic;
	}
	
	public float getVelocityX() {
		return this.mVelocityX;
	}
	
	public float getVelocityY() {
		return this.mVelocityY;
	}

	public void setLinearVelocity(final float x, final float y) {
		this.mVelocityX = x;
		this.mVelocityY = y;
	}

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}