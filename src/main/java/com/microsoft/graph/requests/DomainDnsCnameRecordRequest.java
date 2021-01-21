// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DomainDnsCnameRecord;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Domain Dns Cname Record Request.
 */
public class DomainDnsCnameRecordRequest extends BaseRequest<DomainDnsCnameRecord> {
	
    /**
     * The request for the DomainDnsCnameRecord
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DomainDnsCnameRecordRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DomainDnsCnameRecord.class);
    }

    /**
     * Gets the DomainDnsCnameRecord from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DomainDnsCnameRecord> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DomainDnsCnameRecord from the service
     *
     * @return the DomainDnsCnameRecord from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DomainDnsCnameRecord get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DomainDnsCnameRecord> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DomainDnsCnameRecord delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DomainDnsCnameRecord with a source
     *
     * @param sourceDomainDnsCnameRecord the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DomainDnsCnameRecord> patchAsync(@Nonnull final DomainDnsCnameRecord sourceDomainDnsCnameRecord) {
        return sendAsync(HttpMethod.PATCH, sourceDomainDnsCnameRecord);
    }

    /**
     * Patches this DomainDnsCnameRecord with a source
     *
     * @param sourceDomainDnsCnameRecord the source object with updates
     * @return the updated DomainDnsCnameRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DomainDnsCnameRecord patch(@Nonnull final DomainDnsCnameRecord sourceDomainDnsCnameRecord) throws ClientException {
        return send(HttpMethod.PATCH, sourceDomainDnsCnameRecord);
    }

    /**
     * Creates a DomainDnsCnameRecord with a new object
     *
     * @param newDomainDnsCnameRecord the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DomainDnsCnameRecord> postAsync(@Nonnull final DomainDnsCnameRecord newDomainDnsCnameRecord) {
        return sendAsync(HttpMethod.POST, newDomainDnsCnameRecord);
    }

    /**
     * Creates a DomainDnsCnameRecord with a new object
     *
     * @param newDomainDnsCnameRecord the new object to create
     * @return the created DomainDnsCnameRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DomainDnsCnameRecord post(@Nonnull final DomainDnsCnameRecord newDomainDnsCnameRecord) throws ClientException {
        return send(HttpMethod.POST, newDomainDnsCnameRecord);
    }

    /**
     * Creates a DomainDnsCnameRecord with a new object
     *
     * @param newDomainDnsCnameRecord the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DomainDnsCnameRecord> putAsync(@Nonnull final DomainDnsCnameRecord newDomainDnsCnameRecord) {
        return sendAsync(HttpMethod.PUT, newDomainDnsCnameRecord);
    }

    /**
     * Creates a DomainDnsCnameRecord with a new object
     *
     * @param newDomainDnsCnameRecord the object to create/update
     * @return the created DomainDnsCnameRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DomainDnsCnameRecord put(@Nonnull final DomainDnsCnameRecord newDomainDnsCnameRecord) throws ClientException {
        return send(HttpMethod.PUT, newDomainDnsCnameRecord);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DomainDnsCnameRecordRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public DomainDnsCnameRecordRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
