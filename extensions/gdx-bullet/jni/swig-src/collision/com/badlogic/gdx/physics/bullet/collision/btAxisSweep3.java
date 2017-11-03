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

public class btAxisSweep3 extends btAxisSweep3InternalShort {
	private long swigCPtr;
	
	protected btAxisSweep3(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btAxisSweep3_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btAxisSweep3, normally you should not need this constructor it's intended for low-level usage. */
	public btAxisSweep3(long cPtr, boolean cMemoryOwn) {
		this("btAxisSweep3", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btAxisSweep3_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btAxisSweep3 obj) {
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
				CollisionJNI.delete_btAxisSweep3(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btAxisSweep3(Vector3 worldAabbMin, Vector3 worldAabbMax, int maxHandles, btOverlappingPairCache pairCache, boolean disableRaycastAccelerator) {
    this(CollisionJNI.new_btAxisSweep3__SWIG_0(worldAabbMin, worldAabbMax, maxHandles, btOverlappingPairCache.getCPtr(pairCache), pairCache, disableRaycastAccelerator), true);
  }

  public btAxisSweep3(Vector3 worldAabbMin, Vector3 worldAabbMax, int maxHandles, btOverlappingPairCache pairCache) {
    this(CollisionJNI.new_btAxisSweep3__SWIG_1(worldAabbMin, worldAabbMax, maxHandles, btOverlappingPairCache.getCPtr(pairCache), pairCache), true);
  }

  public btAxisSweep3(Vector3 worldAabbMin, Vector3 worldAabbMax, int maxHandles) {
    this(CollisionJNI.new_btAxisSweep3__SWIG_2(worldAabbMin, worldAabbMax, maxHandles), true);
  }

  public btAxisSweep3(Vector3 worldAabbMin, Vector3 worldAabbMax) {
    this(CollisionJNI.new_btAxisSweep3__SWIG_3(worldAabbMin, worldAabbMax), true);
  }

}
