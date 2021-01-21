// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.SubscribedSku;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Subscribed Sku Request.
 */
public class SubscribedSkuRequest extends BaseRequest<SubscribedSku> {
	
    /**
     * The request for the SubscribedSku
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SubscribedSkuRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SubscribedSku.class);
    }

    /**
     * Gets the SubscribedSku from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SubscribedSku> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the SubscribedSku from the service
     *
     * @return the SubscribedSku from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SubscribedSku get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SubscribedSku> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public SubscribedSku delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this SubscribedSku with a source
     *
     * @param sourceSubscribedSku the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SubscribedSku> patchAsync(@Nonnull final SubscribedSku sourceSubscribedSku) {
        return sendAsync(HttpMethod.PATCH, sourceSubscribedSku);
    }

    /**
     * Patches this SubscribedSku with a source
     *
     * @param sourceSubscribedSku the source object with updates
     * @return the updated SubscribedSku
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SubscribedSku patch(@Nonnull final SubscribedSku sourceSubscribedSku) throws ClientException {
        return send(HttpMethod.PATCH, sourceSubscribedSku);
    }

    /**
     * Creates a SubscribedSku with a new object
     *
     * @param newSubscribedSku the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SubscribedSku> postAsync(@Nonnull final SubscribedSku newSubscribedSku) {
        return sendAsync(HttpMethod.POST, newSubscribedSku);
    }

    /**
     * Creates a SubscribedSku with a new object
     *
     * @param newSubscribedSku the new object to create
     * @return the created SubscribedSku
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SubscribedSku post(@Nonnull final SubscribedSku newSubscribedSku) throws ClientException {
        return send(HttpMethod.POST, newSubscribedSku);
    }

    /**
     * Creates a SubscribedSku with a new object
     *
     * @param newSubscribedSku the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SubscribedSku> putAsync(@Nonnull final SubscribedSku newSubscribedSku) {
        return sendAsync(HttpMethod.PUT, newSubscribedSku);
    }

    /**
     * Creates a SubscribedSku with a new object
     *
     * @param newSubscribedSku the object to create/update
     * @return the created SubscribedSku
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SubscribedSku put(@Nonnull final SubscribedSku newSubscribedSku) throws ClientException {
        return send(HttpMethod.PUT, newSubscribedSku);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public SubscribedSkuRequest select(@Nonnull final String value) {
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
     public SubscribedSkuRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
