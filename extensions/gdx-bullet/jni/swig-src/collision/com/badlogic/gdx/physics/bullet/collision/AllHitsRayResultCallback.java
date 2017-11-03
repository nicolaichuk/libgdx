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

public class AllHitsRayResultCallback extends RayResultCallback {
	private long swigCPtr;
	
	protected AllHitsRayResultCallback(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.AllHitsRayResultCallback_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new AllHitsRayResultCallback, normally you should not need this constructor it's intended for low-level usage. */
	public AllHitsRayResultCallback(long cPtr, boolean cMemoryOwn) {
		this("AllHitsRayResultCallback", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.AllHitsRayResultCallback_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(AllHitsRayResultCallback obj) {
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
				CollisionJNI.delete_AllHitsRayResultCallback(swigCPtr);
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
    CollisionJNI.AllHitsRayResultCallback_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    CollisionJNI.AllHitsRayResultCallback_change_ownership(this, swigCPtr, true);
  }

  public AllHitsRayResultCallback(Vector3 rayFromWorld, Vector3 rayToWorld) {
    this(CollisionJNI.new_AllHitsRayResultCallback(rayFromWorld, rayToWorld), true);
    CollisionJNI.AllHitsRayResultCallback_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public void setCollisionObjects(btCollisionObjectConstArray value) {
    CollisionJNI.AllHitsRayResultCallback_collisionObjects_set(swigCPtr, this, btCollisionObjectConstArray.getCPtr(value), value);
  }

  public btCollisionObjectConstArray getCollisionObjects() {
    long cPtr = CollisionJNI.AllHitsRayResultCallback_collisionObjects_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btCollisionObjectConstArray(cPtr, false);
  }

  public void setHitNormalWorld(btVector3Array value) {
    CollisionJNI.AllHitsRayResultCallback_hitNormalWorld_set(swigCPtr, this, btVector3Array.getCPtr(value), value);
  }

  public btVector3Array getHitNormalWorld() {
    long cPtr = CollisionJNI.AllHitsRayResultCallback_hitNormalWorld_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3Array(cPtr, false);
  }

  public void setHitPointWorld(btVector3Array value) {
    CollisionJNI.AllHitsRayResultCallback_hitPointWorld_set(swigCPtr, this, btVector3Array.getCPtr(value), value);
  }

  public btVector3Array getHitPointWorld() {
    long cPtr = CollisionJNI.AllHitsRayResultCallback_hitPointWorld_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3Array(cPtr, false);
  }

  public void setHitFractions(btScalarArray value) {
    CollisionJNI.AllHitsRayResultCallback_hitFractions_set(swigCPtr, this, btScalarArray.getCPtr(value), value);
  }

  public btScalarArray getHitFractions() {
    long cPtr = CollisionJNI.AllHitsRayResultCallback_hitFractions_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btScalarArray(cPtr, false);
  }

  public float addSingleResult(LocalRayResult rayResult, boolean normalInWorldSpace) {
    return (getClass() == AllHitsRayResultCallback.class) ? CollisionJNI.AllHitsRayResultCallback_addSingleResult(swigCPtr, this, LocalRayResult.getCPtr(rayResult), rayResult, normalInWorldSpace) : CollisionJNI.AllHitsRayResultCallback_addSingleResultSwigExplicitAllHitsRayResultCallback(swigCPtr, this, LocalRayResult.getCPtr(rayResult), rayResult, normalInWorldSpace);
  }

  public void getRayFromWorld(Vector3 out) {
    CollisionJNI.AllHitsRayResultCallback_getRayFromWorld(swigCPtr, this, out);
  }

  public void setRayFromWorld(Vector3 value) {
    CollisionJNI.AllHitsRayResultCallback_setRayFromWorld(swigCPtr, this, value);
  }

  public void getRayToWorld(Vector3 out) {
    CollisionJNI.AllHitsRayResultCallback_getRayToWorld(swigCPtr, this, out);
  }

  public void setRayToWorld(Vector3 value) {
    CollisionJNI.AllHitsRayResultCallback_setRayToWorld(swigCPtr, this, value);
  }

}
