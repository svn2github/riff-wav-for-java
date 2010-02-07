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
package com.skratchdot.riff.wav;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chunk Play List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.ChunkPlayList#getNumberOfSegments <em>Number Of Segments</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkPlayList#getSegments <em>Segments</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.riff.wav.WavPackage#getChunkPlayList()
 * @model
 * @generated
 */
public interface ChunkPlayList extends Chunk {
	/**
	 * Returns the value of the '<em><b>Number Of Segments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Segments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Segments</em>' attribute.
	 * @see #setNumberOfSegments(Long)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkPlayList_NumberOfSegments()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getNumberOfSegments();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkPlayList#getNumberOfSegments <em>Number Of Segments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Segments</em>' attribute.
	 * @see #getNumberOfSegments()
	 * @generated
	 */
	void setNumberOfSegments(Long value);

	/**
	 * Returns the value of the '<em><b>Segments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segments</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' reference.
	 * @see #setSegments(Segment)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkPlayList_Segments()
	 * @model
	 * @generated
	 */
	Segment getSegments();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkPlayList#getSegments <em>Segments</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segments</em>' reference.
	 * @see #getSegments()
	 * @generated
	 */
	void setSegments(Segment value);

} // ChunkPlayList
