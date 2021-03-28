package de.dealog.common.emergency.cap;

/**
 * The code denoting the severity of the subject event of the alert message
 */
public enum Severity {
    /**
     * Extraordinary threat to life or property
     */
    Extreme,

    /**
     * Significant threat to life or property
     */
    Severe,

    /**
     * Possible threat to life or property
     */
    Moderate,

    /**
     * Minimal to no known threat to life or property
     */
    Minor,

    /**
     * Severity unknown
     */
    Unknown;
}
