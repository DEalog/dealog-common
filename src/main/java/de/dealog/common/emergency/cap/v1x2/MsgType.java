package de.dealog.common.emergency.cap.v1x2;

/**
 * The code denoting the nature of the alert message
 */
public enum MsgType {
    /**
     * Initial information requiring attention by targeted recipients
     */
    Alert,
    /**
     * Updates and supercedes the earlier message(s) identified in {@link de.dealog.common.emergency.cap.v1x2.Alert.Info#references}
     */
    Update,
    /**
     * Cancels the earlier message(s) identified in {@link de.dealog.common.emergency.cap.v1x2.Alert.Info#references}
     */
    Cancel,
    /**
     * Acknowledges receipt and acceptance of the message(s) identified in {@link de.dealog.common.emergency.cap.v1x2.Alert.Info#references}
     */
    Ack,
    /**
     * Indicates rejection of the message(s) identified in {@link de.dealog.common.emergency.cap.v1x2.Alert.Info#references};
     * explanation SHOULD appear in {@link de.dealog.common.emergency.cap.v1x2.Alert.Info#note}
     */
    Error;
}
