/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class bt32BitAxisSweep3 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected bt32BitAxisSweep3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(bt32BitAxisSweep3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_bt32BitAxisSweep3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public bt32BitAxisSweep3(Vector3 worldAabbMin, Vector3 worldAabbMax, long maxHandles, btOverlappingPairCache pairCache, boolean disableRaycastAccelerator) {
    this(gdxBulletJNI.new_bt32BitAxisSweep3__SWIG_0(worldAabbMin, worldAabbMax, maxHandles, btOverlappingPairCache.getCPtr(pairCache), pairCache, disableRaycastAccelerator), true);
  }

  public bt32BitAxisSweep3(Vector3 worldAabbMin, Vector3 worldAabbMax, long maxHandles, btOverlappingPairCache pairCache) {
    this(gdxBulletJNI.new_bt32BitAxisSweep3__SWIG_1(worldAabbMin, worldAabbMax, maxHandles, btOverlappingPairCache.getCPtr(pairCache), pairCache), true);
  }

  public bt32BitAxisSweep3(Vector3 worldAabbMin, Vector3 worldAabbMax, long maxHandles) {
    this(gdxBulletJNI.new_bt32BitAxisSweep3__SWIG_2(worldAabbMin, worldAabbMax, maxHandles), true);
  }

  public bt32BitAxisSweep3(Vector3 worldAabbMin, Vector3 worldAabbMax) {
    this(gdxBulletJNI.new_bt32BitAxisSweep3__SWIG_3(worldAabbMin, worldAabbMax), true);
  }

}