package de.dealog.common.emergency.cap.v1x2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

/**
 * Model of an Alert, according to the Common Alerting Protocol - Version 1.2
 * @see <a href="https://docs.oasis-open.org/emergency/cap/v1.2/CAP-v1.2.html">Common Alerting Protocol Version 1.2</a>
 *
 * The container for all component parts of the alert message
 */
@Getter
@Setter
@NoArgsConstructor
public class Alert {

    /**
     * The identifier of the alert message
     */
    @NotEmpty
    private String identifier;

    /**
     * The identifier of the sender of the alert message
     */
    @NotEmpty
    private String sender;

    /**
     * The time and date of the origination of the alert message
     */
    @NotNull
    private Date sent;

    /**
     * The code denoting the appropriate handling of the alert message
     */
    @NotNull
    private Status status;

    /**
     * The code denoting the nature of the alert message
     */
    @NotEmpty
    private MsgType msgType;

    /**
     * The text identifying the source of the alert message
     */
    private String source;

    /**
     * The code denoting the intended distribution of the alert message
     */
    @NotEmpty
    private Scope scope;

    /**
     * The text describing the rule for limiting distribution of the restricted alert message
     */
    private String restriction;

    /**
     * The group listing of intended recipients of the alert message
     *
     * Multiple space-delimited addresses MAY be included.  Addresses including whitespace MUST be enclosed in double-quotes.
     */
    private String addresses;

    /**
     * The code denoting the special handling of the alert message
     */
    private List<String> code;

    /**
     * The text describing the purpose or significance of the alert message
     */
    private String note;

    /**
     * The group listing identifying earlier message(s) referenced by the alert message
     *
     * If multiple messages are referenced, they SHALL be separated by whitespace.
     */
    private String references;

    /**
     * The group listing naming the referent incident(s) of the alert message
     *
     * If multiple incident identifiers are referenced, they SHALL be separated by whitespace.  Incident names including whitespace SHALL be surrounded by double-quotes.
     */
    private String incidents;

    private List<Info> info;

    /**
     * The container for all component parts of the info sub-element of the alert message
     */
    @Getter
    @Setter
    public static class Info {

        /**
         * The code denoting the language of the info sub-element of the alert message
         */
        private String language;

        /**
         * The code denoting the category of the subject event of the alert message
         */
        @Size(min = 1)
        private List<Category> category;

        /**
         * The text denoting the type of the subject event of the alert message
         */
        @NotEmpty
        private String event;

        /**
         * The code denoting the type of action recommended for the target audience
         */
        private ResponseType responseType;

        /**
         * The code denoting the urgency of the subject event of the alert message
         */
        @NotEmpty
        private Urgency urgency;

        /**
         * The code denoting the severity of the subject event of the alert message
         */
        @NotEmpty
        private Severity severity;

        /**
         * The code denoting the certainty of the subject event of the alert message
         */
        @NotEmpty
        private Certainty certainty;

        /**
         * The text describing the intended audience of the alert message
         */
        private String audience;

        /**
         * A system-specific code identifying the event type of the alert message
         */
        private List<Parameter> eventCode;

        /**
         * The effective time of the information of the alert message
         */
        private Date effective;

        /**
         * The expected time of the beginning of the subject event of the alert message
         */
        private Date onset;

        /**
         * The expiry time of the information of the alert message
         */
        private Date expires;

        /**
         * The text naming the originator of the alert message
         */
        private String senderName;

        /**
         * The text headline of the alert message
         */
        private String headline;

        /**
         * The text describing the subject event of the alert message
         */
        private String description;

        /**
         * The text describing the recommended action to be taken by recipients of the alert message
         */
        private String instruction;

        /**
         * The identifier of the hyperlink associating additional information with the alert message
         */
        private String web;

        /**
         * The text describing the contact for follow-up and confirmation of the alert message
         */
        private String contact;

        /**
         * A system-specific additional parameter associated with the alert message
         */
        private List<Alert.Parameter> parameter;

        private List<Resource> resource;

        private List<Area> area;

        /**
         * The container for all component parts of the area sub-element of the info sub-element of the alert message
         */
        @Getter
        @Setter
        public static class Area {

            /**
             * The text describing the affected area of the alert message
             */
            @NotEmpty
            private String areaDesc;

            /**
             * The paired values of points defining a polygon that delineates the affected area of the alert message
             */
            private List<String> polygon;

            /**
             * The paired values of a point and radius delineating the affected area of the alert message
             */
            private List<String> circle;

            /**
             * The geographic code delineating the affected area of the alert message
             */
            private List<Alert.Parameter> geocode;

            /**
             * The specific or minimum altitude of the affected area of the alert message
             */
            private String altitude;

            /**
             * The maximum altitude of the affected area of the alert message
             */
            private String ceiling;
        }

        /**
         * The container for all component parts of the resource sub-element of the info sub-element of the alert element
         */
        @Getter
        @Setter
        public static class Resource {

            /**
             * The text describing the type and content of the resource file
             */
            @NotEmpty
            private String resourceDesc;

            /**
             * The identifier of the MIME content type and sub-type describing the resource file
             */
            @NotEmpty
            private String mimeType;

            /**
             * The integer indicating the size of the resource file
             */
            private int size;

            /**
             * The identifier of the hyperlink for the resource file
             */
            private String uri;

            /**
             * The base-64 encoded data content of the resource file
             */
            private String derefUri;

            /**
             * The code representing the digital digest (“hash”) computed from the resource file
             */
            private String digest;
        }
    }

    /**
     * Any system-specific datum
     */
    @Getter
    @Setter
    public static class Parameter {
        /**
         * user-assigned string designating the domain of the code
         */
        private String valueName;

        /**
         * string (which may represent a number) denoting the value itself
         */
        private String value;
    }


}

