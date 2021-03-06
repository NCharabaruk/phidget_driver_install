/*
 * Copyright 2006 Phidgets Inc.  All rights reserved.
 */

package com.phidgets.event;

import com.phidgets.Phidget;

/**
 * This class represents the data for a TagLossEvent.
 * 
 * @author Phidgets Inc.
 */
public class TagLossEvent
{
	Phidget source;
	String value;
	int protocol;

	/**
	 * Class constructor. This is called internally by the phidget library when creating this event.
	 * 
	 * @param source the Phidget object from which this event originated
	 */
	public TagLossEvent(Phidget source, String value)
	{
		this.source = source;
		this.value = value;
	}
	public TagLossEvent(Phidget source, String value, int protocol)
	{
		this.source = source;
		this.value = value;
		this.protocol = protocol;
	}

	/**
	 * Returns the source Phidget of this event. This is a reference to the Phidget object from which this
	 * event was called. This object can be cast into a specific type of Phidget object to call specific
	 * device calls on it.
	 * 
	 * @return the event caller
	 */
	public Phidget getSource() {
		return source;
	}

	/**
	 * Returns the Tag that was lost.
	 * 
	 * @return the lost tag
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Returns the protocol of the Tag that was lost.
	 * 
	 * @return the lost tag protocol
	 */
	public int getProtocol() {
		return protocol;
	}

	/**
	 * Returns a string containing information about the event.
	 * 
	 * @return an informative event string
	 */
	public String toString() {
		return source.toString() + " Tag lost: "
		  + value;
	}
}
