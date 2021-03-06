/**
 */
package org.xtext.guicemodules.guiceModules.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.xbase.XExpression;

import org.xtext.guicemodules.guiceModules.BindingAST;
import org.xtext.guicemodules.guiceModules.GuiceModulesPackage;
import org.xtext.guicemodules.guiceModules.KeyAST;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding AST</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.guicemodules.guiceModules.impl.BindingASTImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.xtext.guicemodules.guiceModules.impl.BindingASTImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.xtext.guicemodules.guiceModules.impl.BindingASTImpl#getToInstance <em>To Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingASTImpl extends MinimalEObjectImpl.Container implements BindingAST
{
  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected KeyAST from;

  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected KeyAST to;

  /**
   * The cached value of the '{@link #getToInstance() <em>To Instance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToInstance()
   * @generated
   * @ordered
   */
  protected XExpression toInstance;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BindingASTImpl()
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
    return GuiceModulesPackage.Literals.BINDING_AST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyAST getFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFrom(KeyAST newFrom, NotificationChain msgs)
  {
    KeyAST oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiceModulesPackage.BINDING_AST__FROM, oldFrom, newFrom);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(KeyAST newFrom)
  {
    if (newFrom != from)
    {
      NotificationChain msgs = null;
      if (from != null)
        msgs = ((InternalEObject)from).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiceModulesPackage.BINDING_AST__FROM, null, msgs);
      if (newFrom != null)
        msgs = ((InternalEObject)newFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiceModulesPackage.BINDING_AST__FROM, null, msgs);
      msgs = basicSetFrom(newFrom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiceModulesPackage.BINDING_AST__FROM, newFrom, newFrom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyAST getTo()
  {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTo(KeyAST newTo, NotificationChain msgs)
  {
    KeyAST oldTo = to;
    to = newTo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiceModulesPackage.BINDING_AST__TO, oldTo, newTo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTo(KeyAST newTo)
  {
    if (newTo != to)
    {
      NotificationChain msgs = null;
      if (to != null)
        msgs = ((InternalEObject)to).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiceModulesPackage.BINDING_AST__TO, null, msgs);
      if (newTo != null)
        msgs = ((InternalEObject)newTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiceModulesPackage.BINDING_AST__TO, null, msgs);
      msgs = basicSetTo(newTo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiceModulesPackage.BINDING_AST__TO, newTo, newTo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getToInstance()
  {
    return toInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetToInstance(XExpression newToInstance, NotificationChain msgs)
  {
    XExpression oldToInstance = toInstance;
    toInstance = newToInstance;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiceModulesPackage.BINDING_AST__TO_INSTANCE, oldToInstance, newToInstance);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToInstance(XExpression newToInstance)
  {
    if (newToInstance != toInstance)
    {
      NotificationChain msgs = null;
      if (toInstance != null)
        msgs = ((InternalEObject)toInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiceModulesPackage.BINDING_AST__TO_INSTANCE, null, msgs);
      if (newToInstance != null)
        msgs = ((InternalEObject)newToInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiceModulesPackage.BINDING_AST__TO_INSTANCE, null, msgs);
      msgs = basicSetToInstance(newToInstance, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiceModulesPackage.BINDING_AST__TO_INSTANCE, newToInstance, newToInstance));
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
      case GuiceModulesPackage.BINDING_AST__FROM:
        return basicSetFrom(null, msgs);
      case GuiceModulesPackage.BINDING_AST__TO:
        return basicSetTo(null, msgs);
      case GuiceModulesPackage.BINDING_AST__TO_INSTANCE:
        return basicSetToInstance(null, msgs);
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
      case GuiceModulesPackage.BINDING_AST__FROM:
        return getFrom();
      case GuiceModulesPackage.BINDING_AST__TO:
        return getTo();
      case GuiceModulesPackage.BINDING_AST__TO_INSTANCE:
        return getToInstance();
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
      case GuiceModulesPackage.BINDING_AST__FROM:
        setFrom((KeyAST)newValue);
        return;
      case GuiceModulesPackage.BINDING_AST__TO:
        setTo((KeyAST)newValue);
        return;
      case GuiceModulesPackage.BINDING_AST__TO_INSTANCE:
        setToInstance((XExpression)newValue);
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
      case GuiceModulesPackage.BINDING_AST__FROM:
        setFrom((KeyAST)null);
        return;
      case GuiceModulesPackage.BINDING_AST__TO:
        setTo((KeyAST)null);
        return;
      case GuiceModulesPackage.BINDING_AST__TO_INSTANCE:
        setToInstance((XExpression)null);
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
      case GuiceModulesPackage.BINDING_AST__FROM:
        return from != null;
      case GuiceModulesPackage.BINDING_AST__TO:
        return to != null;
      case GuiceModulesPackage.BINDING_AST__TO_INSTANCE:
        return toInstance != null;
    }
    return super.eIsSet(featureID);
  }

} //BindingASTImpl
