/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.extras;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.physics.bullet.dynamics.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.physics.bullet.inversedynamics.MultiBodyTree;
import com.badlogic.gdx.physics.bullet.dynamics.btDynamicsWorld;
import com.badlogic.gdx.physics.bullet.dynamics.btContactSolverInfo;
import com.badlogic.gdx.physics.bullet.collision.btCollisionShape;

public class bChunkPtr4 extends BulletBase {
	private long swigCPtr;
	
	protected bChunkPtr4(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new bChunkPtr4, normally you should not need this constructor it's intended for low-level usage. */ 
	public bChunkPtr4(long cPtr, boolean cMemoryOwn) {
		this("bChunkPtr4", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(bChunkPtr4 obj) {
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
				ExtrasJNI.delete_bChunkPtr4(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public bChunkPtr4() {
    this(ExtrasJNI.new_bChunkPtr4(), true);
  }

  public void setCode(int value) {
    ExtrasJNI.bChunkPtr4_code_set(swigCPtr, this, value);
  }

  public int getCode() {
    return ExtrasJNI.bChunkPtr4_code_get(swigCPtr, this);
  }

  public void setLen(int value) {
    ExtrasJNI.bChunkPtr4_len_set(swigCPtr, this, value);
  }

  public int getLen() {
    return ExtrasJNI.bChunkPtr4_len_get(swigCPtr, this);
  }

  public void setUniqueInt(int value) {
    ExtrasJNI.bChunkPtr4_uniqueInt_set(swigCPtr, this, value);
  }

  public int getUniqueInt() {
    return ExtrasJNI.bChunkPtr4_uniqueInt_get(swigCPtr, this);
  }

  public void setDna_nr(int value) {
    ExtrasJNI.bChunkPtr4_dna_nr_set(swigCPtr, this, value);
  }

  public int getDna_nr() {
    return ExtrasJNI.bChunkPtr4_dna_nr_get(swigCPtr, this);
  }

  public void setNr(int value) {
    ExtrasJNI.bChunkPtr4_nr_set(swigCPtr, this, value);
  }

  public int getNr() {
    return ExtrasJNI.bChunkPtr4_nr_get(swigCPtr, this);
  }

}
