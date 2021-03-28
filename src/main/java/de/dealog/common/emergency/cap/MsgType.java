package de.dealog.common.emergency.cap;

/**
 * The code denoting the nature of the alert message
 */
public enum MsgType {
    /**
     * Initial information requiring attention by targeted recipients
     */
    Alert,
    /**
     * Updates and supercedes the earlier message(s) identified in <references>
     */
    Update,
    /**
     * Cancels the earlier message(s) identified in <references>
     */
    Cancel,
    /**
     * Acknowledges receipt and acceptance of the message(s) identified in <references>
     */
    Ack,
    /**
     * Indicates rejection of the message(s) identified in <references>; explanation SHOULD appear in <note>
     */
    Error;
}
