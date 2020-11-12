package de.dealog.common.model;

import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * The available message event types
 */
@RegisterForReflection
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
    Superseded,

    /**
     * The message is disposed
     */
    Disposed;
    ;
}
