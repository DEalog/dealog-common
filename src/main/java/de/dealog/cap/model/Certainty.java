package de.dealog.cap.model;

/**
 * The code denoting the certainty of the subject event of the alert message
 */
public enum Certainty {
    /**
     * Determined to have occurred or to be ongoing
     */
    Observed,

    /**
     * Likely (p > ~50%)
     */
    Likely,

    /**
     * Possible but not likely (p <= ~50%)
     */
    Possible,

    /**
     * Not expected to occur (p ~ 0)
     */
    Unlikely,

    /**
     * Certainty unknown
     */
    Unknown;
}
