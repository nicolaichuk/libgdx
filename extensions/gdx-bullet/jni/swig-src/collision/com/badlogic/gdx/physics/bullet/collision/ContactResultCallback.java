/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class ContactResultCallback extends BulletBase {
	private long swigCPtr;
	
	protected ContactResultCallback(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new ContactResultCallback, normally you should not need this constructor it's intended for low-level usage. */ 
	public ContactResultCallback(long cPtr, boolean cMemoryOwn) {
		this("ContactResultCallback", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(ContactResultCallback obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_ContactResultCallback(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    CollisionJNI.ContactResultCallback_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    CollisionJNI.ContactResultCallback_change_ownership(this, swigCPtr, true);
  }

  public void setCollisionFilterGroup(int value) {
    CollisionJNI.ContactResultCallback_collisionFilterGroup_set(swigCPtr, this, value);
  }

  public int getCollisionFilterGroup() {
    return CollisionJNI.ContactResultCallback_collisionFilterGroup_get(swigCPtr, this);
  }

  public void setCollisionFilterMask(int value) {
    CollisionJNI.ContactResultCallback_collisionFilterMask_set(swigCPtr, this, value);
  }

  public int getCollisionFilterMask() {
    return CollisionJNI.ContactResultCallback_collisionFilterMask_get(swigCPtr, this);
  }

  public void setClosestDistanceThreshold(float value) {
    CollisionJNI.ContactResultCallback_closestDistanceThreshold_set(swigCPtr, this, value);
  }

  public float getClosestDistanceThreshold() {
    return CollisionJNI.ContactResultCallback_closestDistanceThreshold_get(swigCPtr, this);
  }

  public ContactResultCallback() {
    this(CollisionJNI.new_ContactResultCallback(), true);
    CollisionJNI.ContactResultCallback_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public boolean needsCollision(btBroadphaseProxy proxy0) {
    return (getClass() == ContactResultCallback.class) ? CollisionJNI.ContactResultCallback_needsCollision(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy0), proxy0) : CollisionJNI.ContactResultCallback_needsCollisionSwigExplicitContactResultCallback(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy0), proxy0);
  }

  public float addSingleResult(btManifoldPoint cp, btCollisionObjectWrapper colObj0Wrap, int partId0, int index0, btCollisionObjectWrapper colObj1Wrap, int partId1, int index1) {
    return CollisionJNI.ContactResultCallback_addSingleResult(swigCPtr, this, btManifoldPoint.getCPtr(cp), cp, btCollisionObjectWrapper.getCPtr(colObj0Wrap), colObj0Wrap, partId0, index0, btCollisionObjectWrapper.getCPtr(colObj1Wrap), colObj1Wrap, partId1, index1);
  }

}
