package biweekly.property;

import biweekly.util.UtcOffset;

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
 * <p>
 * Defines the timezone offset that was in affect before the timezone observance
 * began.
 * </p>
 * <p>
 * <b>Code sample:</b>
 * 
 * <pre class="brush:java">
 * VTimezone timezone = ...
 * StandardTime standard = new StandardTime();
 * standard.setTimezoneOffsetFrom(-5, 0);
 * ...
 * timezone.addStandardTime(standard);
 * </pre>
 * 
 * </p>
 * @author Michael Angstadt
 * @rfc 5545 p.104-5
 */
public class TimezoneOffsetFrom extends UtcOffsetProperty {
	/**
	 * Creates a new timezone offset from property.
	 * @param hourOffset the hour offset (e.g. "-5")
	 * @param minuteOffset the minute offset (e.g. "0")
	 */
	public TimezoneOffsetFrom(Integer hourOffset, Integer minuteOffset) {
		super(hourOffset, minuteOffset);
	}

	/**
	 * Creates a new timezone offset from property.
	 * @param offset the UTC offset
	 */
	public TimezoneOffsetFrom(UtcOffset offset) {
		super(offset);
	}
}
