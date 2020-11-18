package de.dealog.common.model;

/**
 * The status of the message
 */
public enum Status {

    /**
     * The message was created within e.g. the backoffice or imported e.g Mowas
     */
    Published,

    /**
     * The message is superseded
     */
    Superseded,

    /**
     * The message is disposed
     */
    Disposed;
}