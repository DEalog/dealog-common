package de.dealog.common.emergency.cap;

/**
 * The code denoting the urgency of the subject event of the alert message
 */
public enum Urgency {
    /**
     * Immediate - Responsive action SHOULD be taken immediately
     */
    Immediate,

    /**
     *  - Responsive action SHOULD be taken soon (within next hour)
     */
    Expected,

    /**
     * Future - Responsive action SHOULD be taken in the near future
     */

    Future,
    /**
     * Responsive action is no longer required
     */
    Past,

    /**
     * Urgency not known
     */
    Unknown;
}
