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

public class btCollisionObject {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btCollisionObject(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btCollisionObject obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btCollisionObject(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean mergesSimulationIslands() {
    return gdxBulletJNI.btCollisionObject_mergesSimulationIslands(swigCPtr, this);
  }

  public Vector3 getAnisotropicFriction() {
	return gdxBulletJNI.btCollisionObject_getAnisotropicFriction__SWIG_0(swigCPtr, this);
}

  public void setAnisotropicFriction(Vector3 anisotropicFriction) {
    gdxBulletJNI.btCollisionObject_setAnisotropicFriction(swigCPtr, this, anisotropicFriction);
  }

  public boolean hasAnisotropicFriction() {
    return gdxBulletJNI.btCollisionObject_hasAnisotropicFriction(swigCPtr, this);
  }

  public void setContactProcessingThreshold(float contactProcessingThreshold) {
    gdxBulletJNI.btCollisionObject_setContactProcessingThreshold(swigCPtr, this, contactProcessingThreshold);
  }

  public float getContactProcessingThreshold() {
    return gdxBulletJNI.btCollisionObject_getContactProcessingThreshold(swigCPtr, this);
  }

  public boolean isStaticObject() {
    return gdxBulletJNI.btCollisionObject_isStaticObject(swigCPtr, this);
  }

  public boolean isKinematicObject() {
    return gdxBulletJNI.btCollisionObject_isKinematicObject(swigCPtr, this);
  }

  public boolean isStaticOrKinematicObject() {
    return gdxBulletJNI.btCollisionObject_isStaticOrKinematicObject(swigCPtr, this);
  }

  public boolean hasContactResponse() {
    return gdxBulletJNI.btCollisionObject_hasContactResponse(swigCPtr, this);
  }

  public btCollisionObject() {
    this(gdxBulletJNI.new_btCollisionObject(), true);
  }

  public void setCollisionShape(btCollisionShape collisionShape) {
    gdxBulletJNI.btCollisionObject_setCollisionShape(swigCPtr, this, btCollisionShape.getCPtr(collisionShape), collisionShape);
  }

  public btCollisionShape getCollisionShape() {
    long cPtr = gdxBulletJNI.btCollisionObject_getCollisionShape__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : btCollisionShape.newDerivedObject(cPtr, false);
  }

  public SWIGTYPE_p_void internalGetExtensionPointer() {
    long cPtr = gdxBulletJNI.btCollisionObject_internalGetExtensionPointer(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void internalSetExtensionPointer(SWIGTYPE_p_void pointer) {
    gdxBulletJNI.btCollisionObject_internalSetExtensionPointer(swigCPtr, this, SWIGTYPE_p_void.getCPtr(pointer));
  }

  public int getActivationState() {
    return gdxBulletJNI.btCollisionObject_getActivationState(swigCPtr, this);
  }

  public void setActivationState(int newState) {
    gdxBulletJNI.btCollisionObject_setActivationState(swigCPtr, this, newState);
  }

  public void setDeactivationTime(float time) {
    gdxBulletJNI.btCollisionObject_setDeactivationTime(swigCPtr, this, time);
  }

  public float getDeactivationTime() {
    return gdxBulletJNI.btCollisionObject_getDeactivationTime(swigCPtr, this);
  }

  public void forceActivationState(int newState) {
    gdxBulletJNI.btCollisionObject_forceActivationState(swigCPtr, this, newState);
  }

  public void activate(boolean forceActivation) {
    gdxBulletJNI.btCollisionObject_activate__SWIG_0(swigCPtr, this, forceActivation);
  }

  public void activate() {
    gdxBulletJNI.btCollisionObject_activate__SWIG_1(swigCPtr, this);
  }

  public boolean isActive() {
    return gdxBulletJNI.btCollisionObject_isActive(swigCPtr, this);
  }

  public void setRestitution(float rest) {
    gdxBulletJNI.btCollisionObject_setRestitution(swigCPtr, this, rest);
  }

  public float getRestitution() {
    return gdxBulletJNI.btCollisionObject_getRestitution(swigCPtr, this);
  }

  public void setFriction(float frict) {
    gdxBulletJNI.btCollisionObject_setFriction(swigCPtr, this, frict);
  }

  public float getFriction() {
    return gdxBulletJNI.btCollisionObject_getFriction(swigCPtr, this);
  }

  public int getInternalType() {
    return gdxBulletJNI.btCollisionObject_getInternalType(swigCPtr, this);
  }

  public btTransform getWorldTransform() {
    return new btTransform(gdxBulletJNI.btCollisionObject_getWorldTransform__SWIG_0(swigCPtr, this), false);
  }

  public void setWorldTransform(btTransform worldTrans) {
    gdxBulletJNI.btCollisionObject_setWorldTransform(swigCPtr, this, btTransform.getCPtr(worldTrans), worldTrans);
  }

  public btBroadphaseProxy getBroadphaseHandle() {
    long cPtr = gdxBulletJNI.btCollisionObject_getBroadphaseHandle__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new btBroadphaseProxy(cPtr, false);
  }

  public void setBroadphaseHandle(btBroadphaseProxy handle) {
    gdxBulletJNI.btCollisionObject_setBroadphaseHandle(swigCPtr, this, btBroadphaseProxy.getCPtr(handle), handle);
  }

  public btTransform getInterpolationWorldTransform() {
    return new btTransform(gdxBulletJNI.btCollisionObject_getInterpolationWorldTransform__SWIG_0(swigCPtr, this), false);
  }

  public void setInterpolationWorldTransform(btTransform trans) {
    gdxBulletJNI.btCollisionObject_setInterpolationWorldTransform(swigCPtr, this, btTransform.getCPtr(trans), trans);
  }

  public void setInterpolationLinearVelocity(Vector3 linvel) {
    gdxBulletJNI.btCollisionObject_setInterpolationLinearVelocity(swigCPtr, this, linvel);
  }

  public void setInterpolationAngularVelocity(Vector3 angvel) {
    gdxBulletJNI.btCollisionObject_setInterpolationAngularVelocity(swigCPtr, this, angvel);
  }

  public Vector3 getInterpolationLinearVelocity() {
	return gdxBulletJNI.btCollisionObject_getInterpolationLinearVelocity__SWIG_0(swigCPtr, this);
}

  public Vector3 getInterpolationAngularVelocity() {
	return gdxBulletJNI.btCollisionObject_getInterpolationAngularVelocity__SWIG_0(swigCPtr, this);
}

  public int getIslandTag() {
    return gdxBulletJNI.btCollisionObject_getIslandTag(swigCPtr, this);
  }

  public void setIslandTag(int tag) {
    gdxBulletJNI.btCollisionObject_setIslandTag(swigCPtr, this, tag);
  }

  public int getCompanionId() {
    return gdxBulletJNI.btCollisionObject_getCompanionId(swigCPtr, this);
  }

  public void setCompanionId(int id) {
    gdxBulletJNI.btCollisionObject_setCompanionId(swigCPtr, this, id);
  }

  public float getHitFraction() {
    return gdxBulletJNI.btCollisionObject_getHitFraction(swigCPtr, this);
  }

  public void setHitFraction(float hitFraction) {
    gdxBulletJNI.btCollisionObject_setHitFraction(swigCPtr, this, hitFraction);
  }

  public int getCollisionFlags() {
    return gdxBulletJNI.btCollisionObject_getCollisionFlags(swigCPtr, this);
  }

  public void setCollisionFlags(int flags) {
    gdxBulletJNI.btCollisionObject_setCollisionFlags(swigCPtr, this, flags);
  }

  public float getCcdSweptSphereRadius() {
    return gdxBulletJNI.btCollisionObject_getCcdSweptSphereRadius(swigCPtr, this);
  }

  public void setCcdSweptSphereRadius(float radius) {
    gdxBulletJNI.btCollisionObject_setCcdSweptSphereRadius(swigCPtr, this, radius);
  }

  public float getCcdMotionThreshold() {
    return gdxBulletJNI.btCollisionObject_getCcdMotionThreshold(swigCPtr, this);
  }

  public float getCcdSquareMotionThreshold() {
    return gdxBulletJNI.btCollisionObject_getCcdSquareMotionThreshold(swigCPtr, this);
  }

  public void setCcdMotionThreshold(float ccdMotionThreshold) {
    gdxBulletJNI.btCollisionObject_setCcdMotionThreshold(swigCPtr, this, ccdMotionThreshold);
  }

  public SWIGTYPE_p_void getUserPointer() {
    long cPtr = gdxBulletJNI.btCollisionObject_getUserPointer(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setUserPointer(SWIGTYPE_p_void userPointer) {
    gdxBulletJNI.btCollisionObject_setUserPointer(swigCPtr, this, SWIGTYPE_p_void.getCPtr(userPointer));
  }

  public boolean checkCollideWith(btCollisionObject co) {
    return gdxBulletJNI.btCollisionObject_checkCollideWith(swigCPtr, this, btCollisionObject.getCPtr(co), co);
  }

  public int calculateSerializeBufferSize() {
    return gdxBulletJNI.btCollisionObject_calculateSerializeBufferSize(swigCPtr, this);
  }

  public String serialize(SWIGTYPE_p_void dataBuffer, SWIGTYPE_p_btSerializer serializer) {
    return gdxBulletJNI.btCollisionObject_serialize(swigCPtr, this, SWIGTYPE_p_void.getCPtr(dataBuffer), SWIGTYPE_p_btSerializer.getCPtr(serializer));
  }

  public void serializeSingleObject(SWIGTYPE_p_btSerializer serializer) {
    gdxBulletJNI.btCollisionObject_serializeSingleObject(swigCPtr, this, SWIGTYPE_p_btSerializer.getCPtr(serializer));
  }

  public void getAnisotropicFriction(Vector3 out) {
    gdxBulletJNI.btCollisionObject_getAnisotropicFriction__SWIG_1(swigCPtr, this, out);
  }

  public void getWorldTransform(btTransform out) {
    gdxBulletJNI.btCollisionObject_getWorldTransform__SWIG_2(swigCPtr, this, btTransform.getCPtr(out), out);
  }

  public void getInterpolationWorldTransform(btTransform out) {
    gdxBulletJNI.btCollisionObject_getInterpolationWorldTransform__SWIG_2(swigCPtr, this, btTransform.getCPtr(out), out);
  }

  public void getInterpolationLinearVelocity(Vector3 out) {
    gdxBulletJNI.btCollisionObject_getInterpolationLinearVelocity__SWIG_1(swigCPtr, this, out);
  }

  public void getInterpolationAngularVelocity(Vector3 out) {
    gdxBulletJNI.btCollisionObject_getInterpolationAngularVelocity__SWIG_1(swigCPtr, this, out);
  }

  public final static class CollisionFlags {
    public final static int CF_STATIC_OBJECT = 1;
    public final static int CF_KINEMATIC_OBJECT = 2;
    public final static int CF_NO_CONTACT_RESPONSE = 4;
    public final static int CF_CUSTOM_MATERIAL_CALLBACK = 8;
    public final static int CF_CHARACTER_OBJECT = 16;
    public final static int CF_DISABLE_VISUALIZE_OBJECT = 32;
    public final static int CF_DISABLE_SPU_COLLISION_PROCESSING = 64;
  }

  public final static class CollisionObjectTypes {
    public final static int CO_COLLISION_OBJECT = 1;
    public final static int CO_RIGID_BODY = 2;
    public final static int CO_GHOST_OBJECT = 4;
    public final static int CO_SOFT_BODY = 8;
    public final static int CO_HF_FLUID = 16;
    public final static int CO_USER_TYPE = 32;
  }

}