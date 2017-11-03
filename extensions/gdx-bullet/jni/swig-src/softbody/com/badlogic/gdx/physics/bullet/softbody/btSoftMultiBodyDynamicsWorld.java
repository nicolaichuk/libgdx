/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.softbody;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.physics.bullet.dynamics.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btSoftMultiBodyDynamicsWorld extends btMultiBodyDynamicsWorld {
	private long swigCPtr;
	
	protected btSoftMultiBodyDynamicsWorld(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, SoftbodyJNI.btSoftMultiBodyDynamicsWorld_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btSoftMultiBodyDynamicsWorld, normally you should not need this constructor it's intended for low-level usage. */
	public btSoftMultiBodyDynamicsWorld(long cPtr, boolean cMemoryOwn) {
		this("btSoftMultiBodyDynamicsWorld", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(SoftbodyJNI.btSoftMultiBodyDynamicsWorld_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btSoftMultiBodyDynamicsWorld obj) {
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
				SoftbodyJNI.delete_btSoftMultiBodyDynamicsWorld(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btSoftMultiBodyDynamicsWorld(btDispatcher dispatcher, btBroadphaseInterface pairCache, btMultiBodyConstraintSolver constraintSolver, btCollisionConfiguration collisionConfiguration, btSoftBodySolver softBodySolver) {
    this(SoftbodyJNI.new_btSoftMultiBodyDynamicsWorld__SWIG_0(btDispatcher.getCPtr(dispatcher), dispatcher, btBroadphaseInterface.getCPtr(pairCache), pairCache, btMultiBodyConstraintSolver.getCPtr(constraintSolver), constraintSolver, btCollisionConfiguration.getCPtr(collisionConfiguration), collisionConfiguration, btSoftBodySolver.getCPtr(softBodySolver), softBodySolver), true);
  }

  public btSoftMultiBodyDynamicsWorld(btDispatcher dispatcher, btBroadphaseInterface pairCache, btMultiBodyConstraintSolver constraintSolver, btCollisionConfiguration collisionConfiguration) {
    this(SoftbodyJNI.new_btSoftMultiBodyDynamicsWorld__SWIG_1(btDispatcher.getCPtr(dispatcher), dispatcher, btBroadphaseInterface.getCPtr(pairCache), pairCache, btMultiBodyConstraintSolver.getCPtr(constraintSolver), constraintSolver, btCollisionConfiguration.getCPtr(collisionConfiguration), collisionConfiguration), true);
  }

  public void addSoftBody(btSoftBody body, int collisionFilterGroup, int collisionFilterMask) {
    SoftbodyJNI.btSoftMultiBodyDynamicsWorld_addSoftBody__SWIG_0(swigCPtr, this, btSoftBody.getCPtr(body), body, collisionFilterGroup, collisionFilterMask);
  }

  public void addSoftBody(btSoftBody body, int collisionFilterGroup) {
    SoftbodyJNI.btSoftMultiBodyDynamicsWorld_addSoftBody__SWIG_1(swigCPtr, this, btSoftBody.getCPtr(body), body, collisionFilterGroup);
  }

  public void addSoftBody(btSoftBody body) {
    SoftbodyJNI.btSoftMultiBodyDynamicsWorld_addSoftBody__SWIG_2(swigCPtr, this, btSoftBody.getCPtr(body), body);
  }

  public void removeSoftBody(btSoftBody body) {
    SoftbodyJNI.btSoftMultiBodyDynamicsWorld_removeSoftBody(swigCPtr, this, btSoftBody.getCPtr(body), body);
  }

  public int getDrawFlags() {
    return SoftbodyJNI.btSoftMultiBodyDynamicsWorld_getDrawFlags(swigCPtr, this);
  }

  public void setDrawFlags(int f) {
    SoftbodyJNI.btSoftMultiBodyDynamicsWorld_setDrawFlags(swigCPtr, this, f);
  }

  public btSoftBodyWorldInfo getWorldInfo() {
    return new btSoftBodyWorldInfo(SoftbodyJNI.btSoftMultiBodyDynamicsWorld_getWorldInfo(swigCPtr, this), false);
  }

  public btSoftBodyWorldInfo getWorldInfoConst() {
    return new btSoftBodyWorldInfo(SoftbodyJNI.btSoftMultiBodyDynamicsWorld_getWorldInfoConst(swigCPtr, this), false);
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_btSoftBody_p_t getSoftBodyArray() {
    return new SWIGTYPE_p_btAlignedObjectArrayT_btSoftBody_p_t(SoftbodyJNI.btSoftMultiBodyDynamicsWorld_getSoftBodyArray(swigCPtr, this), false);
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_btSoftBody_p_t getSoftBodyArrayConst() {
    return new SWIGTYPE_p_btAlignedObjectArrayT_btSoftBody_p_t(SoftbodyJNI.btSoftMultiBodyDynamicsWorld_getSoftBodyArrayConst(swigCPtr, this), false);
  }

  public static void rayTestSingle(Matrix4 rayFromTrans, Matrix4 rayToTrans, btCollisionObject collisionObject, btCollisionShape collisionShape, Matrix4 colObjWorldTransform, RayResultCallback resultCallback) {
    SoftbodyJNI.btSoftMultiBodyDynamicsWorld_rayTestSingle(rayFromTrans, rayToTrans, btCollisionObject.getCPtr(collisionObject), collisionObject, btCollisionShape.getCPtr(collisionShape), collisionShape, colObjWorldTransform, RayResultCallback.getCPtr(resultCallback), resultCallback);
  }

}
