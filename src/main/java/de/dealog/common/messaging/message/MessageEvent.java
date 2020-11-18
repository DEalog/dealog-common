package de.dealog.common.messaging.message;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * The message event
 */
@Getter
@Setter
public class MessageEvent implements Serializable {

    private static final long serialVersionUID = 123L;

    /**
     * The {@link MessageEventType} of the message
     */
    private MessageEventType type;

    /**
     * The payload containing the message
     */
    private MessageEventPayload payload;

}
