package de.dealog.common.emergency.cap.v1x2;

/**
 * The code denoting the intended distribution of the alert message
 */
public enum Scope {
    /**
     * For general dissemination to unrestricted audiences
     */
    Public,
    /**
     * For dissemination only to users with a known operational requirement
     * (see {@link de.dealog.common.emergency.cap.v1x2.Alert.Info#restriction}, below)
     */
    Restricted,
    /**
     * For dissemination only to specified addresses (see {@link de.dealog.common.emergency.cap.v1x2.Alert.Info#addresses}, below)
     */
    Private;
}
