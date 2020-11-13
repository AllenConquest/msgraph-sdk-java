// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.VppToken;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Vpp Token Request.
 */
public class VppTokenRequest extends BaseRequest {
	
    /**
     * The request for the VppToken
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public VppTokenRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, VppToken.class);
    }

    /**
     * Gets the VppToken from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super VppToken> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the VppToken from the service
     *
     * @return the VppToken from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public VppToken get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super VppToken> callback) {
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
     * Patches this VppToken with a source
     *
     * @param sourceVppToken the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final VppToken sourceVppToken, @Nonnull final ICallback<? super VppToken> callback) {
        send(HttpMethod.PATCH, callback, sourceVppToken);
    }

    /**
     * Patches this VppToken with a source
     *
     * @param sourceVppToken the source object with updates
     * @return the updated VppToken
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public VppToken patch(@Nonnull final VppToken sourceVppToken) throws ClientException {
        return send(HttpMethod.PATCH, sourceVppToken);
    }

    /**
     * Creates a VppToken with a new object
     *
     * @param newVppToken the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final VppToken newVppToken, @Nonnull final ICallback<? super VppToken> callback) {
        send(HttpMethod.POST, callback, newVppToken);
    }

    /**
     * Creates a VppToken with a new object
     *
     * @param newVppToken the new object to create
     * @return the created VppToken
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public VppToken post(@Nonnull final VppToken newVppToken) throws ClientException {
        return send(HttpMethod.POST, newVppToken);
    }

    /**
     * Creates a VppToken with a new object
     *
     * @param newVppToken the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final VppToken newVppToken, @Nonnull final ICallback<? super VppToken> callback) {
        send(HttpMethod.PUT, callback, newVppToken);
    }

    /**
     * Creates a VppToken with a new object
     *
     * @param newVppToken the object to create/update
     * @return the created VppToken
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public VppToken put(@Nonnull final VppToken newVppToken) throws ClientException {
        return send(HttpMethod.PUT, newVppToken);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public VppTokenRequest select(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (VppTokenRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public VppTokenRequest expand(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (VppTokenRequest)this;
     }

}

