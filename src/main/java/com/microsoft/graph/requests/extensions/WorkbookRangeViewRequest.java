// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookRangeView;
import com.microsoft.graph.models.extensions.WorkbookRange;
import com.microsoft.graph.requests.extensions.WorkbookRangeViewCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeViewRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range View Request.
 */
public class WorkbookRangeViewRequest extends BaseRequest {
	
    /**
     * The request for the WorkbookRangeView
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookRangeViewRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookRangeView.class);
    }

    /**
     * Gets the WorkbookRangeView from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super WorkbookRangeView> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookRangeView from the service
     *
     * @return the WorkbookRangeView from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookRangeView get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super WorkbookRangeView> callback) {
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
     * Patches this WorkbookRangeView with a source
     *
     * @param sourceWorkbookRangeView the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final WorkbookRangeView sourceWorkbookRangeView, @Nonnull final ICallback<? super WorkbookRangeView> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookRangeView);
    }

    /**
     * Patches this WorkbookRangeView with a source
     *
     * @param sourceWorkbookRangeView the source object with updates
     * @return the updated WorkbookRangeView
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookRangeView patch(@Nonnull final WorkbookRangeView sourceWorkbookRangeView) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookRangeView);
    }

    /**
     * Creates a WorkbookRangeView with a new object
     *
     * @param newWorkbookRangeView the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final WorkbookRangeView newWorkbookRangeView, @Nonnull final ICallback<? super WorkbookRangeView> callback) {
        send(HttpMethod.POST, callback, newWorkbookRangeView);
    }

    /**
     * Creates a WorkbookRangeView with a new object
     *
     * @param newWorkbookRangeView the new object to create
     * @return the created WorkbookRangeView
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookRangeView post(@Nonnull final WorkbookRangeView newWorkbookRangeView) throws ClientException {
        return send(HttpMethod.POST, newWorkbookRangeView);
    }

    /**
     * Creates a WorkbookRangeView with a new object
     *
     * @param newWorkbookRangeView the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final WorkbookRangeView newWorkbookRangeView, @Nonnull final ICallback<? super WorkbookRangeView> callback) {
        send(HttpMethod.PUT, callback, newWorkbookRangeView);
    }

    /**
     * Creates a WorkbookRangeView with a new object
     *
     * @param newWorkbookRangeView the object to create/update
     * @return the created WorkbookRangeView
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookRangeView put(@Nonnull final WorkbookRangeView newWorkbookRangeView) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookRangeView);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WorkbookRangeViewRequest select(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WorkbookRangeViewRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public WorkbookRangeViewRequest expand(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WorkbookRangeViewRequest)this;
     }

}

