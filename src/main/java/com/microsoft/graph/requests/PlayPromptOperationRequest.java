// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.PlayPromptOperation;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Play Prompt Operation Request.
 */
public class PlayPromptOperationRequest extends BaseRequest<PlayPromptOperation> {
	
    /**
     * The request for the PlayPromptOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlayPromptOperationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PlayPromptOperation.class);
    }

    /**
     * Gets the PlayPromptOperation from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PlayPromptOperation> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the PlayPromptOperation from the service
     *
     * @return the PlayPromptOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PlayPromptOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PlayPromptOperation> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public PlayPromptOperation delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PlayPromptOperation with a source
     *
     * @param sourcePlayPromptOperation the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PlayPromptOperation> patchAsync(@Nonnull final PlayPromptOperation sourcePlayPromptOperation) {
        return sendAsync(HttpMethod.PATCH, sourcePlayPromptOperation);
    }

    /**
     * Patches this PlayPromptOperation with a source
     *
     * @param sourcePlayPromptOperation the source object with updates
     * @return the updated PlayPromptOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PlayPromptOperation patch(@Nonnull final PlayPromptOperation sourcePlayPromptOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlayPromptOperation);
    }

    /**
     * Creates a PlayPromptOperation with a new object
     *
     * @param newPlayPromptOperation the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PlayPromptOperation> postAsync(@Nonnull final PlayPromptOperation newPlayPromptOperation) {
        return sendAsync(HttpMethod.POST, newPlayPromptOperation);
    }

    /**
     * Creates a PlayPromptOperation with a new object
     *
     * @param newPlayPromptOperation the new object to create
     * @return the created PlayPromptOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PlayPromptOperation post(@Nonnull final PlayPromptOperation newPlayPromptOperation) throws ClientException {
        return send(HttpMethod.POST, newPlayPromptOperation);
    }

    /**
     * Creates a PlayPromptOperation with a new object
     *
     * @param newPlayPromptOperation the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PlayPromptOperation> putAsync(@Nonnull final PlayPromptOperation newPlayPromptOperation) {
        return sendAsync(HttpMethod.PUT, newPlayPromptOperation);
    }

    /**
     * Creates a PlayPromptOperation with a new object
     *
     * @param newPlayPromptOperation the object to create/update
     * @return the created PlayPromptOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PlayPromptOperation put(@Nonnull final PlayPromptOperation newPlayPromptOperation) throws ClientException {
        return send(HttpMethod.PUT, newPlayPromptOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PlayPromptOperationRequest select(@Nonnull final String value) {
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
     public PlayPromptOperationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
