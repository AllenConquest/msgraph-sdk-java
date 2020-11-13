// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DomainDnsTxtRecord;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Domain Dns Txt Record Request.
 */
public class DomainDnsTxtRecordRequest extends BaseRequest {
	
    /**
     * The request for the DomainDnsTxtRecord
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DomainDnsTxtRecordRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DomainDnsTxtRecord.class);
    }

    /**
     * Gets the DomainDnsTxtRecord from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super DomainDnsTxtRecord> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DomainDnsTxtRecord from the service
     *
     * @return the DomainDnsTxtRecord from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DomainDnsTxtRecord get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super DomainDnsTxtRecord> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DomainDnsTxtRecord with a source
     *
     * @param sourceDomainDnsTxtRecord the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final DomainDnsTxtRecord sourceDomainDnsTxtRecord, @Nonnull final ICallback<? super DomainDnsTxtRecord> callback) {
        send(HttpMethod.PATCH, callback, sourceDomainDnsTxtRecord);
    }

    /**
     * Patches this DomainDnsTxtRecord with a source
     *
     * @param sourceDomainDnsTxtRecord the source object with updates
     * @return the updated DomainDnsTxtRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DomainDnsTxtRecord patch(@Nonnull final DomainDnsTxtRecord sourceDomainDnsTxtRecord) throws ClientException {
        return send(HttpMethod.PATCH, sourceDomainDnsTxtRecord);
    }

    /**
     * Creates a DomainDnsTxtRecord with a new object
     *
     * @param newDomainDnsTxtRecord the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final DomainDnsTxtRecord newDomainDnsTxtRecord, @Nonnull final ICallback<? super DomainDnsTxtRecord> callback) {
        send(HttpMethod.POST, callback, newDomainDnsTxtRecord);
    }

    /**
     * Creates a DomainDnsTxtRecord with a new object
     *
     * @param newDomainDnsTxtRecord the new object to create
     * @return the created DomainDnsTxtRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DomainDnsTxtRecord post(@Nonnull final DomainDnsTxtRecord newDomainDnsTxtRecord) throws ClientException {
        return send(HttpMethod.POST, newDomainDnsTxtRecord);
    }

    /**
     * Creates a DomainDnsTxtRecord with a new object
     *
     * @param newDomainDnsTxtRecord the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final DomainDnsTxtRecord newDomainDnsTxtRecord, @Nonnull final ICallback<? super DomainDnsTxtRecord> callback) {
        send(HttpMethod.PUT, callback, newDomainDnsTxtRecord);
    }

    /**
     * Creates a DomainDnsTxtRecord with a new object
     *
     * @param newDomainDnsTxtRecord the object to create/update
     * @return the created DomainDnsTxtRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DomainDnsTxtRecord put(@Nonnull final DomainDnsTxtRecord newDomainDnsTxtRecord) throws ClientException {
        return send(HttpMethod.PUT, newDomainDnsTxtRecord);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DomainDnsTxtRecordRequest select(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DomainDnsTxtRecordRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public DomainDnsTxtRecordRequest expand(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DomainDnsTxtRecordRequest)this;
     }

}

