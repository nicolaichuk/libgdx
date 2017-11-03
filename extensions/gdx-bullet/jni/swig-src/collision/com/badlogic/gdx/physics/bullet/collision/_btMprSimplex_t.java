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

public class _btMprSimplex_t extends BulletBase {
	private long swigCPtr;
	
	protected _btMprSimplex_t(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new _btMprSimplex_t, normally you should not need this constructor it's intended for low-level usage. */ 
	public _btMprSimplex_t(long cPtr, boolean cMemoryOwn) {
		this("_btMprSimplex_t", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(_btMprSimplex_t obj) {
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
				CollisionJNI.delete__btMprSimplex_t(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setPs(_btMprSupport_t value) {
    CollisionJNI._btMprSimplex_t_ps_set(swigCPtr, this, _btMprSupport_t.getCPtr(value), value);
  }

  public _btMprSupport_t getPs() {
    long cPtr = CollisionJNI._btMprSimplex_t_ps_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _btMprSupport_t(cPtr, false);
  }

  public void setLast(int value) {
    CollisionJNI._btMprSimplex_t_last_set(swigCPtr, this, value);
  }

  public int getLast() {
    return CollisionJNI._btMprSimplex_t_last_get(swigCPtr, this);
  }

  public _btMprSimplex_t() {
    this(CollisionJNI.new__btMprSimplex_t(), true);
  }

}
