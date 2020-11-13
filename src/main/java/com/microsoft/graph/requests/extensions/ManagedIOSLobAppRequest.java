// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedIOSLobApp;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed IOSLob App Request.
 */
public class ManagedIOSLobAppRequest extends BaseRequest {
	
    /**
     * The request for the ManagedIOSLobApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedIOSLobAppRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedIOSLobApp.class);
    }

    /**
     * Gets the ManagedIOSLobApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super ManagedIOSLobApp> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedIOSLobApp from the service
     *
     * @return the ManagedIOSLobApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedIOSLobApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super ManagedIOSLobApp> callback) {
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
     * Patches this ManagedIOSLobApp with a source
     *
     * @param sourceManagedIOSLobApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final ManagedIOSLobApp sourceManagedIOSLobApp, @Nonnull final ICallback<? super ManagedIOSLobApp> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedIOSLobApp);
    }

    /**
     * Patches this ManagedIOSLobApp with a source
     *
     * @param sourceManagedIOSLobApp the source object with updates
     * @return the updated ManagedIOSLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedIOSLobApp patch(@Nonnull final ManagedIOSLobApp sourceManagedIOSLobApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedIOSLobApp);
    }

    /**
     * Creates a ManagedIOSLobApp with a new object
     *
     * @param newManagedIOSLobApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final ManagedIOSLobApp newManagedIOSLobApp, @Nonnull final ICallback<? super ManagedIOSLobApp> callback) {
        send(HttpMethod.POST, callback, newManagedIOSLobApp);
    }

    /**
     * Creates a ManagedIOSLobApp with a new object
     *
     * @param newManagedIOSLobApp the new object to create
     * @return the created ManagedIOSLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedIOSLobApp post(@Nonnull final ManagedIOSLobApp newManagedIOSLobApp) throws ClientException {
        return send(HttpMethod.POST, newManagedIOSLobApp);
    }

    /**
     * Creates a ManagedIOSLobApp with a new object
     *
     * @param newManagedIOSLobApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final ManagedIOSLobApp newManagedIOSLobApp, @Nonnull final ICallback<? super ManagedIOSLobApp> callback) {
        send(HttpMethod.PUT, callback, newManagedIOSLobApp);
    }

    /**
     * Creates a ManagedIOSLobApp with a new object
     *
     * @param newManagedIOSLobApp the object to create/update
     * @return the created ManagedIOSLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedIOSLobApp put(@Nonnull final ManagedIOSLobApp newManagedIOSLobApp) throws ClientException {
        return send(HttpMethod.PUT, newManagedIOSLobApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ManagedIOSLobAppRequest select(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ManagedIOSLobAppRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public ManagedIOSLobAppRequest expand(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ManagedIOSLobAppRequest)this;
     }

}

