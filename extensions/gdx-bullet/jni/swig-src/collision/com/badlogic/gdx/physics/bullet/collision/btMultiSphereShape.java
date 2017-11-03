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

public class btMultiSphereShape extends btConvexInternalAabbCachingShape {
	private long swigCPtr;
	
	protected btMultiSphereShape(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btMultiSphereShape_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btMultiSphereShape, normally you should not need this constructor it's intended for low-level usage. */
	public btMultiSphereShape(long cPtr, boolean cMemoryOwn) {
		this("btMultiSphereShape", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btMultiSphereShape_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btMultiSphereShape obj) {
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
				CollisionJNI.delete_btMultiSphereShape(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public long operatorNew(long sizeInBytes) {
    return CollisionJNI.btMultiSphereShape_operatorNew__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDelete(long ptr) {
    CollisionJNI.btMultiSphereShape_operatorDelete__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNew(long arg0, long ptr) {
    return CollisionJNI.btMultiSphereShape_operatorNew__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDelete(long arg0, long arg1) {
    CollisionJNI.btMultiSphereShape_operatorDelete__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public long operatorNewArray(long sizeInBytes) {
    return CollisionJNI.btMultiSphereShape_operatorNewArray__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDeleteArray(long ptr) {
    CollisionJNI.btMultiSphereShape_operatorDeleteArray__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNewArray(long arg0, long ptr) {
    return CollisionJNI.btMultiSphereShape_operatorNewArray__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDeleteArray(long arg0, long arg1) {
    CollisionJNI.btMultiSphereShape_operatorDeleteArray__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public btMultiSphereShape(Vector3[] positions, float[] radi, int numSpheres) {
    this(CollisionJNI.new_btMultiSphereShape(positions, radi, numSpheres), true);
  }

  public int getSphereCount() {
    return CollisionJNI.btMultiSphereShape_getSphereCount(swigCPtr, this);
  }

  public Vector3 getSpherePosition(int index) {
	return CollisionJNI.btMultiSphereShape_getSpherePosition(swigCPtr, this, index);
}

  public float getSphereRadius(int index) {
    return CollisionJNI.btMultiSphereShape_getSphereRadius(swigCPtr, this, index);
  }

}
