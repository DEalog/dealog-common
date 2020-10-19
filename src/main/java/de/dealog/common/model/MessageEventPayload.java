package de.dealog.common.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

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

    /**
     * The date and time when the message was published in UTC
     */
    private Date publishedAt;

    /**
     * Amtlicher Regionalschlüssel
     * 1.–2. Stelle   = Kennzahl des Bundeslandes
     * 3. Stelle      = Kennzahl des Regierungsbezirks; wenn nicht vorhanden: 0
     * 4.–5. Stelle   = Kennzahl des Landkreises oder der kreisfreien Stadt
     * 6.–9. Stelle   = Verbandsschlüssel
     * 10.–12. Stelle = Gemeindekennzahl
     */
    private String ars;

    /**
     * The geocode geometry as WKT
     * @see <a href="http://giswiki.org/wiki/Well_Known_Text">http://giswiki.org/wiki/Well_Known_Text</a>
     */
    @ToString.Exclude
    private String geocode;
}


