package de.dealog.common.emergency.cap;

/**
 * The code denoting the type of action recommended for the target audience
 */
public enum ResponseType {
    /**
     * Take shelter in place or per <instruction>
     */
    Shelter,

    /**
     * Relocate as instructed in the <instruction>
     */
    Evacuate,

    /**
     * Make preparations per the <instruction>
     */
    Prepare,

    /**
     * Execute a pre-planned activity identified in <instruction>
     */
    Execute,

    /**
     * Avoid the subject event as per the <instruction>
     */
    Avoid,

    /**
     * Attend to information sources as described in <instruction>
     */
    Monitor,

    /**
     * Evaluate the information in this message.  (This value SHOULD NOT be used in public warning applications.)
     */
    Assess,

    /**
     * The subject event no longer poses a threat or concern and any follow on action is described in <instruction>
     */
    AllClear,

    /**
     * No action recommended
     */
    None;
}
