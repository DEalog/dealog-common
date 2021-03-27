package de.dealog.cap.model;

/**
 * The code denoting the appropriate handling of the alert message
 */
public enum Status {
    /**
     * Actionable by all targeted recipients
     */
    Actual,

    /**
     * Actionable only by designated exercise participants; exercise identifier SHOULD appear in <note>
     */
    Exercise,

    /**
     * For messages that support alert network internal functions
     */
    System,

    /**
     * Technical testing only, all recipients disregard
     */
    Test,

    /**
     * A preliminary template or draft, not actionable in its current form
     */
    Draft;
}
