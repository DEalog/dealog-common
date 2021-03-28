package de.dealog.common.emergency.cap.v1x2;

/**
 * The code denoting the type of action recommended for the target audience
 */
public enum ResponseType {
    /**
     * Take shelter in place or per {@link de.dealog.common.emergency.cap.v1x2.Alert.Info#instruction}
     */
    Shelter,

    /**
     * Relocate as instructed in the {@link de.dealog.common.emergency.cap.v1x2.Alert.Info#instruction}
     */
    Evacuate,

    /**
     * Make preparations per the {@link de.dealog.common.emergency.cap.v1x2.Alert.Info#instruction}
     */
    Prepare,

    /**
     * Execute a pre-planned activity identified in {@link de.dealog.common.emergency.cap.v1x2.Alert.Info#instruction}
     */
    Execute,

    /**
     * Avoid the subject event as per the {@link de.dealog.common.emergency.cap.v1x2.Alert.Info#instruction}
     */
    Avoid,

    /**
     * Attend to information sources as described in {@link de.dealog.common.emergency.cap.v1x2.Alert.Info#instruction}
     */
    Monitor,

    /**
     * Evaluate the information in this message. (This value SHOULD NOT be used in public warning applications.)
     */
    Assess,

    /**
     * The subject event no longer poses a threat or concern and any follow on action is described in {@link de.dealog.common.emergency.cap.v1x2.Alert.Info#instruction}
     */
    AllClear,

    /**
     * No action recommended
     */
    None;
}
