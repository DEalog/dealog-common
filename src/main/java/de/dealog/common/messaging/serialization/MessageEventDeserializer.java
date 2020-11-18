package de.dealog.common.messaging.serialization;

import de.dealog.common.messaging.message.MessageEvent;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

/**
 * Implementation of the {@link ObjectMapperDeserializer} that converts bytes to a {@link MessageEvent} object.
 */
public class MessageEventDeserializer  extends ObjectMapperDeserializer<MessageEvent> {

    public MessageEventDeserializer() {
        super(MessageEvent.class);
    }
}
