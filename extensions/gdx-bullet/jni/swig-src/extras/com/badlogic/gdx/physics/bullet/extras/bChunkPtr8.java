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

public class bChunkPtr8 extends BulletBase {
	private long swigCPtr;
	
	protected bChunkPtr8(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new bChunkPtr8, normally you should not need this constructor it's intended for low-level usage. */ 
	public bChunkPtr8(long cPtr, boolean cMemoryOwn) {
		this("bChunkPtr8", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(bChunkPtr8 obj) {
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
				ExtrasJNI.delete_bChunkPtr8(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public bChunkPtr8() {
    this(ExtrasJNI.new_bChunkPtr8(), true);
  }

  public void setCode(int value) {
    ExtrasJNI.bChunkPtr8_code_set(swigCPtr, this, value);
  }

  public int getCode() {
    return ExtrasJNI.bChunkPtr8_code_get(swigCPtr, this);
  }

  public void setLen(int value) {
    ExtrasJNI.bChunkPtr8_len_set(swigCPtr, this, value);
  }

  public int getLen() {
    return ExtrasJNI.bChunkPtr8_len_get(swigCPtr, this);
  }

  public void setOldPrev(long value) {
    ExtrasJNI.bChunkPtr8_oldPrev_set(swigCPtr, this, value);
  }

  public long getOldPrev() {
    return ExtrasJNI.bChunkPtr8_oldPrev_get(swigCPtr, this);
  }

  public void setUniqueInts(int[] value) {
    ExtrasJNI.bChunkPtr8_uniqueInts_set(swigCPtr, this, value);
  }

  public int[] getUniqueInts() {
    return ExtrasJNI.bChunkPtr8_uniqueInts_get(swigCPtr, this);
}

  public void setDna_nr(int value) {
    ExtrasJNI.bChunkPtr8_dna_nr_set(swigCPtr, this, value);
  }

  public int getDna_nr() {
    return ExtrasJNI.bChunkPtr8_dna_nr_get(swigCPtr, this);
  }

  public void setNr(int value) {
    ExtrasJNI.bChunkPtr8_nr_set(swigCPtr, this, value);
  }

  public int getNr() {
    return ExtrasJNI.bChunkPtr8_nr_get(swigCPtr, this);
  }

}
