/**
 * Copyright (c) 2010 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Initial modeling finished using information provided by:
 * 	http://www.sonicspot.com/guide/wavefiles.html
 * 
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *
 * $Id$
 */
package com.skratchdot.riff.wav.impl;

import com.skratchdot.riff.wav.ChunkSilent;
import com.skratchdot.riff.wav.WavPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chunk Silent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkSilentImpl#getNumberOfSilentSamples <em>Number Of Silent Samples</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChunkSilentImpl extends ChunkImpl implements ChunkSilent {
	/**
	 * The default value of the '{@link #getNumberOfSilentSamples() <em>Number Of Silent Samples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSilentSamples()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUMBER_OF_SILENT_SAMPLES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfSilentSamples() <em>Number Of Silent Samples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSilentSamples()
	 * @generated
	 * @ordered
	 */
	protected Long numberOfSilentSamples = NUMBER_OF_SILENT_SAMPLES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkSilentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavPackage.Literals.CHUNK_SILENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getNumberOfSilentSamples() {
		return numberOfSilentSamples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfSilentSamples(Long newNumberOfSilentSamples) {
		Long oldNumberOfSilentSamples = numberOfSilentSamples;
		numberOfSilentSamples = newNumberOfSilentSamples;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavPackage.CHUNK_SILENT__NUMBER_OF_SILENT_SAMPLES, oldNumberOfSilentSamples, numberOfSilentSamples));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WavPackage.CHUNK_SILENT__NUMBER_OF_SILENT_SAMPLES:
				return getNumberOfSilentSamples();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WavPackage.CHUNK_SILENT__NUMBER_OF_SILENT_SAMPLES:
				setNumberOfSilentSamples((Long)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case WavPackage.CHUNK_SILENT__NUMBER_OF_SILENT_SAMPLES:
				setNumberOfSilentSamples(NUMBER_OF_SILENT_SAMPLES_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WavPackage.CHUNK_SILENT__NUMBER_OF_SILENT_SAMPLES:
				return NUMBER_OF_SILENT_SAMPLES_EDEFAULT == null ? numberOfSilentSamples != null : !NUMBER_OF_SILENT_SAMPLES_EDEFAULT.equals(numberOfSilentSamples);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (numberOfSilentSamples: ");
		result.append(numberOfSilentSamples);
		result.append(')');
		return result.toString();
	}

} //ChunkSilentImpl