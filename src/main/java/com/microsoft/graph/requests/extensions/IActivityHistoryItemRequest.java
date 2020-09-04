// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ActivityHistoryItem;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Activity History Item Request.
 */
public interface IActivityHistoryItemRequest extends IHttpRequest {

    /**
     * Gets the ActivityHistoryItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ActivityHistoryItem> callback);

    /**
     * Gets the ActivityHistoryItem from the service
     *
     * @return the ActivityHistoryItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ActivityHistoryItem get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<ActivityHistoryItem> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ActivityHistoryItem with a source
     *
     * @param sourceActivityHistoryItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ActivityHistoryItem sourceActivityHistoryItem, final ICallback<ActivityHistoryItem> callback);

    /**
     * Patches this ActivityHistoryItem with a source
     *
     * @param sourceActivityHistoryItem the source object with updates
     * @return the updated ActivityHistoryItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ActivityHistoryItem patch(final ActivityHistoryItem sourceActivityHistoryItem) throws ClientException;

    /**
     * Posts a ActivityHistoryItem with a new object
     *
     * @param newActivityHistoryItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ActivityHistoryItem newActivityHistoryItem, final ICallback<ActivityHistoryItem> callback);

    /**
     * Posts a ActivityHistoryItem with a new object
     *
     * @param newActivityHistoryItem the new object to create
     * @return the created ActivityHistoryItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ActivityHistoryItem post(final ActivityHistoryItem newActivityHistoryItem) throws ClientException;

    /**
     * Posts a ActivityHistoryItem with a new object
     *
     * @param newActivityHistoryItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ActivityHistoryItem newActivityHistoryItem, final ICallback<ActivityHistoryItem> callback);

    /**
     * Posts a ActivityHistoryItem with a new object
     *
     * @param newActivityHistoryItem the object to create/update
     * @return the created ActivityHistoryItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ActivityHistoryItem put(final ActivityHistoryItem newActivityHistoryItem) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IActivityHistoryItemRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IActivityHistoryItemRequest expand(final String value);

}

