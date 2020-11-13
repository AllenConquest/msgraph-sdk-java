// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ActivityHistoryItem;
import com.microsoft.graph.requests.extensions.UserActivityRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Activity History Item Request.
 */
public class ActivityHistoryItemRequest extends BaseRequest {
	
    /**
     * The request for the ActivityHistoryItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ActivityHistoryItemRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ActivityHistoryItem.class);
    }

    /**
     * Gets the ActivityHistoryItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super ActivityHistoryItem> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ActivityHistoryItem from the service
     *
     * @return the ActivityHistoryItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ActivityHistoryItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super ActivityHistoryItem> callback) {
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
     * Patches this ActivityHistoryItem with a source
     *
     * @param sourceActivityHistoryItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final ActivityHistoryItem sourceActivityHistoryItem, @Nonnull final ICallback<? super ActivityHistoryItem> callback) {
        send(HttpMethod.PATCH, callback, sourceActivityHistoryItem);
    }

    /**
     * Patches this ActivityHistoryItem with a source
     *
     * @param sourceActivityHistoryItem the source object with updates
     * @return the updated ActivityHistoryItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ActivityHistoryItem patch(@Nonnull final ActivityHistoryItem sourceActivityHistoryItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceActivityHistoryItem);
    }

    /**
     * Creates a ActivityHistoryItem with a new object
     *
     * @param newActivityHistoryItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final ActivityHistoryItem newActivityHistoryItem, @Nonnull final ICallback<? super ActivityHistoryItem> callback) {
        send(HttpMethod.POST, callback, newActivityHistoryItem);
    }

    /**
     * Creates a ActivityHistoryItem with a new object
     *
     * @param newActivityHistoryItem the new object to create
     * @return the created ActivityHistoryItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ActivityHistoryItem post(@Nonnull final ActivityHistoryItem newActivityHistoryItem) throws ClientException {
        return send(HttpMethod.POST, newActivityHistoryItem);
    }

    /**
     * Creates a ActivityHistoryItem with a new object
     *
     * @param newActivityHistoryItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final ActivityHistoryItem newActivityHistoryItem, @Nonnull final ICallback<? super ActivityHistoryItem> callback) {
        send(HttpMethod.PUT, callback, newActivityHistoryItem);
    }

    /**
     * Creates a ActivityHistoryItem with a new object
     *
     * @param newActivityHistoryItem the object to create/update
     * @return the created ActivityHistoryItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ActivityHistoryItem put(@Nonnull final ActivityHistoryItem newActivityHistoryItem) throws ClientException {
        return send(HttpMethod.PUT, newActivityHistoryItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ActivityHistoryItemRequest select(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ActivityHistoryItemRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public ActivityHistoryItemRequest expand(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ActivityHistoryItemRequest)this;
     }

}

