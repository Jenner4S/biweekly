package biweekly.property;

import biweekly.parameter.RelationshipType;

/*
 Copyright (c) 2013, Michael Angstadt
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions are met: 

 1. Redistributions of source code must retain the above copyright notice, this
 list of conditions and the following disclaimer. 
 2. Redistributions in binary form must reproduce the above copyright notice,
 this list of conditions and the following disclaimer in the documentation
 and/or other materials provided with the distribution. 

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/**
 * Defines a relationship between the component that this property belongs to
 * and another component.
 * @author Michael Angstadt
 * @see "RFC 5545 p.115-6"
 */
public class RelatedTo extends TextProperty {
	/**
	 * Creates a related-to property.
	 * @param uid the value of the {@link Uid} property of the component that
	 * this property is referencing
	 */
	public RelatedTo(String uid) {
		super(uid);
	}

	/**
	 * Gets the relationship type.
	 * @return the relationship type (e.g. "child") or null if not set
	 */
	public RelationshipType getRelationshipType() {
		return parameters.getRelationshipType();
	}

	/**
	 * Sets the relationship type.
	 * @param related the relationship type (e.g. "child") or null to remove
	 */
	public void setRelationshipType(RelationshipType related) {
		parameters.setRelationshipType(related);
	}
}