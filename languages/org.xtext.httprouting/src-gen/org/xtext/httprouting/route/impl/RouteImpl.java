/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.httprouting.route.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xbase.XExpression;

import org.xtext.httprouting.route.RequestType;
import org.xtext.httprouting.route.Route;
import org.xtext.httprouting.route.RoutePackage;
import org.xtext.httprouting.route.URL;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.httprouting.route.impl.RouteImpl#getRequestType <em>Request Type</em>}</li>
 *   <li>{@link org.xtext.httprouting.route.impl.RouteImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.xtext.httprouting.route.impl.RouteImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.httprouting.route.impl.RouteImpl#getCall <em>Call</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RouteImpl extends AbstractDeclarationImpl implements Route
{
  /**
   * The default value of the '{@link #getRequestType() <em>Request Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequestType()
   * @generated
   * @ordered
   */
  protected static final RequestType REQUEST_TYPE_EDEFAULT = RequestType.GET;

  /**
   * The cached value of the '{@link #getRequestType() <em>Request Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequestType()
   * @generated
   * @ordered
   */
  protected RequestType requestType = REQUEST_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected URL url;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected XExpression condition;

  /**
   * The cached value of the '{@link #getCall() <em>Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCall()
   * @generated
   * @ordered
   */
  protected XExpression call;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RouteImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RoutePackage.Literals.ROUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequestType getRequestType()
  {
    return requestType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequestType(RequestType newRequestType)
  {
    RequestType oldRequestType = requestType;
    requestType = newRequestType == null ? REQUEST_TYPE_EDEFAULT : newRequestType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoutePackage.ROUTE__REQUEST_TYPE, oldRequestType, requestType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public URL getUrl()
  {
    return url;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUrl(URL newUrl, NotificationChain msgs)
  {
    URL oldUrl = url;
    url = newUrl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoutePackage.ROUTE__URL, oldUrl, newUrl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrl(URL newUrl)
  {
    if (newUrl != url)
    {
      NotificationChain msgs = null;
      if (url != null)
        msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoutePackage.ROUTE__URL, null, msgs);
      if (newUrl != null)
        msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoutePackage.ROUTE__URL, null, msgs);
      msgs = basicSetUrl(newUrl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoutePackage.ROUTE__URL, newUrl, newUrl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(XExpression newCondition, NotificationChain msgs)
  {
    XExpression oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoutePackage.ROUTE__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(XExpression newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoutePackage.ROUTE__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoutePackage.ROUTE__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoutePackage.ROUTE__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getCall()
  {
    return call;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCall(XExpression newCall, NotificationChain msgs)
  {
    XExpression oldCall = call;
    call = newCall;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoutePackage.ROUTE__CALL, oldCall, newCall);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCall(XExpression newCall)
  {
    if (newCall != call)
    {
      NotificationChain msgs = null;
      if (call != null)
        msgs = ((InternalEObject)call).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoutePackage.ROUTE__CALL, null, msgs);
      if (newCall != null)
        msgs = ((InternalEObject)newCall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoutePackage.ROUTE__CALL, null, msgs);
      msgs = basicSetCall(newCall, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoutePackage.ROUTE__CALL, newCall, newCall));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RoutePackage.ROUTE__URL:
        return basicSetUrl(null, msgs);
      case RoutePackage.ROUTE__CONDITION:
        return basicSetCondition(null, msgs);
      case RoutePackage.ROUTE__CALL:
        return basicSetCall(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RoutePackage.ROUTE__REQUEST_TYPE:
        return getRequestType();
      case RoutePackage.ROUTE__URL:
        return getUrl();
      case RoutePackage.ROUTE__CONDITION:
        return getCondition();
      case RoutePackage.ROUTE__CALL:
        return getCall();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RoutePackage.ROUTE__REQUEST_TYPE:
        setRequestType((RequestType)newValue);
        return;
      case RoutePackage.ROUTE__URL:
        setUrl((URL)newValue);
        return;
      case RoutePackage.ROUTE__CONDITION:
        setCondition((XExpression)newValue);
        return;
      case RoutePackage.ROUTE__CALL:
        setCall((XExpression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RoutePackage.ROUTE__REQUEST_TYPE:
        setRequestType(REQUEST_TYPE_EDEFAULT);
        return;
      case RoutePackage.ROUTE__URL:
        setUrl((URL)null);
        return;
      case RoutePackage.ROUTE__CONDITION:
        setCondition((XExpression)null);
        return;
      case RoutePackage.ROUTE__CALL:
        setCall((XExpression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RoutePackage.ROUTE__REQUEST_TYPE:
        return requestType != REQUEST_TYPE_EDEFAULT;
      case RoutePackage.ROUTE__URL:
        return url != null;
      case RoutePackage.ROUTE__CONDITION:
        return condition != null;
      case RoutePackage.ROUTE__CALL:
        return call != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (requestType: ");
    result.append(requestType);
    result.append(')');
    return result.toString();
  }

} //RouteImpl