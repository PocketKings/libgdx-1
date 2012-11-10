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

public class btConvexInternalShapeData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btConvexInternalShapeData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btConvexInternalShapeData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btConvexInternalShapeData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_collisionShapeData(btCollisionShapeData value) {
    gdxBulletJNI.btConvexInternalShapeData_m_collisionShapeData_set(swigCPtr, this, btCollisionShapeData.getCPtr(value), value);
  }

  public btCollisionShapeData getM_collisionShapeData() {
    long cPtr = gdxBulletJNI.btConvexInternalShapeData_m_collisionShapeData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btCollisionShapeData(cPtr, false);
  }

  public void setM_localScaling(btVector3FloatData value) {
    gdxBulletJNI.btConvexInternalShapeData_m_localScaling_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getM_localScaling() {
    long cPtr = gdxBulletJNI.btConvexInternalShapeData_m_localScaling_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setM_implicitShapeDimensions(btVector3FloatData value) {
    gdxBulletJNI.btConvexInternalShapeData_m_implicitShapeDimensions_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getM_implicitShapeDimensions() {
    long cPtr = gdxBulletJNI.btConvexInternalShapeData_m_implicitShapeDimensions_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setM_collisionMargin(float value) {
    gdxBulletJNI.btConvexInternalShapeData_m_collisionMargin_set(swigCPtr, this, value);
  }

  public float getM_collisionMargin() {
    return gdxBulletJNI.btConvexInternalShapeData_m_collisionMargin_get(swigCPtr, this);
  }

  public void setM_padding(int value) {
    gdxBulletJNI.btConvexInternalShapeData_m_padding_set(swigCPtr, this, value);
  }

  public int getM_padding() {
    return gdxBulletJNI.btConvexInternalShapeData_m_padding_get(swigCPtr, this);
  }

  public btConvexInternalShapeData() {
    this(gdxBulletJNI.new_btConvexInternalShapeData(), true);
  }

}