package de.dealog.common.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The payload contains the data of the message
 */
@Getter
@Setter
@ToString
public class MessageEventPayload {

    /**
     * The unique identifier
     */
    private String identifier;

    /**
     * The headline
     */
    private String headline;

    /**
     * The description
     */
    private String description;
}


