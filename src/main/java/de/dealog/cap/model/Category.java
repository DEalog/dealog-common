package de.dealog.cap.model;

/**
 * The code denoting the category of the subject event of the alert message
 */
public enum Category {
    /**
     * Geophysical (inc. landslide)
     */
    Geo,

    /**
     * Meteorological (inc. flood)
     */
    Met,

    /**
     * General emergency and public safety
     */
    Safety,

    /**
     * Law enforcement, military, homeland and local/private security
     */
    Securiy,

    /**
     * Rescue and recovery,
     */
    Rescue,

    /**
     * Fire suppression and rescue
     */
    Fire,

    /**
     * Medical and public health
     */
    Health,

    /**
     * Pollution and other environmental
     */
    Env,

    /**
     * Public and private transportation
     */
    Transport,

    /**
     * Utility, telecommunication, other non-transport infrastructure
     */
    Infra,

    /**
     * Chemical, Biological, Radiological, Nuclear or High-Yield Explosive threat or attack
     */
    CBRNE,

    /**
     * Other events
     */
    Other;
}
