// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Event;
import com.microsoft.graph.models.extensions.Recipient;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;
import com.microsoft.graph.requests.extensions.AttachmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AttachmentRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.EventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EventRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Event Request Builder.
 */
public class EventRequestBuilder extends BaseRequestBuilder<Event> {

    /**
     * The request builder for the Event
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EventRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the EventRequest instance
     */
    public EventRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the EventRequest instance
     */
    public EventRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.EventRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public AttachmentCollectionRequestBuilder attachments() {
        return new AttachmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("attachments"), getClient(), null);
    }

    public AttachmentRequestBuilder attachments(final String id) {
        return new AttachmentRequestBuilder(getRequestUrlWithAdditionalSegment("attachments") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Calendar
     *
     * @return the CalendarRequestBuilder instance
     */
    public CalendarRequestBuilder calendar() {
        return new CalendarRequestBuilder(getRequestUrlWithAdditionalSegment("calendar"), getClient(), null);
    }
    public ExtensionCollectionRequestBuilder extensions() {
        return new ExtensionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions"), getClient(), null);
    }

    public ExtensionRequestBuilder extensions(final String id) {
        return new ExtensionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions") + "/" + id, getClient(), null);
    }
    public EventCollectionRequestBuilder instances() {
        return new EventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("instances"), getClient(), null);
    }

    public EventRequestBuilder instances(final String id) {
        return new EventRequestBuilder(getRequestUrlWithAdditionalSegment("instances") + "/" + id, getClient(), null);
    }
    public MultiValueLegacyExtendedPropertyCollectionRequestBuilder multiValueExtendedProperties() {
        return new MultiValueLegacyExtendedPropertyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("multiValueExtendedProperties"), getClient(), null);
    }

    public MultiValueLegacyExtendedPropertyRequestBuilder multiValueExtendedProperties(final String id) {
        return new MultiValueLegacyExtendedPropertyRequestBuilder(getRequestUrlWithAdditionalSegment("multiValueExtendedProperties") + "/" + id, getClient(), null);
    }
    public SingleValueLegacyExtendedPropertyCollectionRequestBuilder singleValueExtendedProperties() {
        return new SingleValueLegacyExtendedPropertyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("singleValueExtendedProperties"), getClient(), null);
    }

    public SingleValueLegacyExtendedPropertyRequestBuilder singleValueExtendedProperties(final String id) {
        return new SingleValueLegacyExtendedPropertyRequestBuilder(getRequestUrlWithAdditionalSegment("singleValueExtendedProperties") + "/" + id, getClient(), null);
    }

    public EventAcceptRequestBuilder accept(final String comment, final Boolean sendResponse) {
        return new EventAcceptRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.accept"), getClient(), null, comment, sendResponse);
    }

    public EventCancelRequestBuilder cancel(final String comment) {
        return new EventCancelRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.cancel"), getClient(), null, comment);
    }

    public EventDeclineRequestBuilder decline(final String comment, final Boolean sendResponse) {
        return new EventDeclineRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.decline"), getClient(), null, comment, sendResponse);
    }

    public EventDismissReminderRequestBuilder dismissReminder() {
        return new EventDismissReminderRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dismissReminder"), getClient(), null);
    }

    public EventForwardRequestBuilder forward(final java.util.List<Recipient> toRecipients, final String comment) {
        return new EventForwardRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.forward"), getClient(), null, toRecipients, comment);
    }

    public EventSnoozeReminderRequestBuilder snoozeReminder(final DateTimeTimeZone newReminderTime) {
        return new EventSnoozeReminderRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.snoozeReminder"), getClient(), null, newReminderTime);
    }

    public EventTentativelyAcceptRequestBuilder tentativelyAccept(final String comment, final Boolean sendResponse) {
        return new EventTentativelyAcceptRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.tentativelyAccept"), getClient(), null, comment, sendResponse);
    }
}
