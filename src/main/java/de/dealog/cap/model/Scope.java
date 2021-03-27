package de.dealog.cap.model;

/**
 * The code denoting the intended distribution of the alert message
 */
public enum Scope {
    /**
     * For general dissemination to unrestricted audiences
     */
    Public,
    /**
     * For dissemination only to users with a known operational requirement (see <restriction>, below)
     */
    Restricted,
    /**
     * For dissemination only to specified addresses (see <addresses>, below)
     */
    Private;
}
