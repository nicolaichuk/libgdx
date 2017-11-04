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

public class bFile extends BulletBase {
	private long swigCPtr;
	
	protected bFile(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new bFile, normally you should not need this constructor it's intended for low-level usage. */ 
	public bFile(long cPtr, boolean cMemoryOwn) {
		this("bFile", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(bFile obj) {
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
				ExtrasJNI.delete_bFile(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public SWIGTYPE_p_bDNA getFileDNA() {
    long cPtr = ExtrasJNI.bFile_getFileDNA(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_bDNA(cPtr, false);
  }

  public void addDataBlock(String dataBlock) {
    ExtrasJNI.bFile_addDataBlock(swigCPtr, this, dataBlock);
  }

  public int getFlags() {
    return ExtrasJNI.bFile_getFlags(swigCPtr, this);
  }

  public void setFileDNAisMemoryDNA() {
    ExtrasJNI.bFile_setFileDNAisMemoryDNA(swigCPtr, this);
  }

  public SWIGTYPE_p_bPtrMap getLibPointers() {
    return new SWIGTYPE_p_bPtrMap(ExtrasJNI.bFile_getLibPointers(swigCPtr, this), false);
  }

  public long findLibPointer(long ptr) {
    return ExtrasJNI.bFile_findLibPointer(swigCPtr, this, ptr);
  }

  public boolean ok() {
    return ExtrasJNI.bFile_ok(swigCPtr, this);
  }

  public void parse(int verboseMode) {
    ExtrasJNI.bFile_parse(swigCPtr, this, verboseMode);
  }

  public int write(String fileName, boolean fixupPointers) {
    return ExtrasJNI.bFile_write__SWIG_0(swigCPtr, this, fileName, fixupPointers);
  }

  public int write(String fileName) {
    return ExtrasJNI.bFile_write__SWIG_1(swigCPtr, this, fileName);
  }

  public void writeChunks(SWIGTYPE_p_FILE fp, boolean fixupPointers) {
    ExtrasJNI.bFile_writeChunks(swigCPtr, this, SWIGTYPE_p_FILE.getCPtr(fp), fixupPointers);
  }

  public void writeDNA(SWIGTYPE_p_FILE fp) {
    ExtrasJNI.bFile_writeDNA(swigCPtr, this, SWIGTYPE_p_FILE.getCPtr(fp));
  }

  public void updateOldPointers() {
    ExtrasJNI.bFile_updateOldPointers(swigCPtr, this);
  }

  public void resolvePointers(int verboseMode) {
    ExtrasJNI.bFile_resolvePointers(swigCPtr, this, verboseMode);
  }

  public void dumpChunks(SWIGTYPE_p_bDNA dna) {
    ExtrasJNI.bFile_dumpChunks(swigCPtr, this, SWIGTYPE_p_bDNA.getCPtr(dna));
  }

  public void setFileDNA(int verboseMode, String buffer, int len) {
    ExtrasJNI.bFile_setFileDNA(swigCPtr, this, verboseMode, buffer, len);
  }

  public int getVersion() {
    return ExtrasJNI.bFile_getVersion(swigCPtr, this);
  }

  public void preSwap() {
    ExtrasJNI.bFile_preSwap(swigCPtr, this);
  }

  public void writeFile(String fileName) {
    ExtrasJNI.bFile_writeFile(swigCPtr, this, fileName);
  }

}