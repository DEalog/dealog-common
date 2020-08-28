package de.dealog.common.model;

/**
 * The available message event types
 */
public enum MessageEventType {

    /**
     * The message was imported from 3rd party (Mecom / BBK)
     */
    Imported,

    /**
     * The message was created within e.g. the backoffice
     */
    Created,

    /**
     * The message was updated
     */
    Updated,

    /**
     * The message is superseded
     */
    Superseded;
}
