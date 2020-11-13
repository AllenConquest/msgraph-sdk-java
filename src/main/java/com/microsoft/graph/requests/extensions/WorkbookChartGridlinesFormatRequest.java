// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartGridlinesFormat;
import com.microsoft.graph.requests.extensions.WorkbookChartLineFormatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Gridlines Format Request.
 */
public class WorkbookChartGridlinesFormatRequest extends BaseRequest {
	
    /**
     * The request for the WorkbookChartGridlinesFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartGridlinesFormatRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartGridlinesFormat.class);
    }

    /**
     * Gets the WorkbookChartGridlinesFormat from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super WorkbookChartGridlinesFormat> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartGridlinesFormat from the service
     *
     * @return the WorkbookChartGridlinesFormat from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartGridlinesFormat get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super WorkbookChartGridlinesFormat> callback) {
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
     * Patches this WorkbookChartGridlinesFormat with a source
     *
     * @param sourceWorkbookChartGridlinesFormat the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final WorkbookChartGridlinesFormat sourceWorkbookChartGridlinesFormat, @Nonnull final ICallback<? super WorkbookChartGridlinesFormat> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChartGridlinesFormat);
    }

    /**
     * Patches this WorkbookChartGridlinesFormat with a source
     *
     * @param sourceWorkbookChartGridlinesFormat the source object with updates
     * @return the updated WorkbookChartGridlinesFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartGridlinesFormat patch(@Nonnull final WorkbookChartGridlinesFormat sourceWorkbookChartGridlinesFormat) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartGridlinesFormat);
    }

    /**
     * Creates a WorkbookChartGridlinesFormat with a new object
     *
     * @param newWorkbookChartGridlinesFormat the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final WorkbookChartGridlinesFormat newWorkbookChartGridlinesFormat, @Nonnull final ICallback<? super WorkbookChartGridlinesFormat> callback) {
        send(HttpMethod.POST, callback, newWorkbookChartGridlinesFormat);
    }

    /**
     * Creates a WorkbookChartGridlinesFormat with a new object
     *
     * @param newWorkbookChartGridlinesFormat the new object to create
     * @return the created WorkbookChartGridlinesFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartGridlinesFormat post(@Nonnull final WorkbookChartGridlinesFormat newWorkbookChartGridlinesFormat) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartGridlinesFormat);
    }

    /**
     * Creates a WorkbookChartGridlinesFormat with a new object
     *
     * @param newWorkbookChartGridlinesFormat the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final WorkbookChartGridlinesFormat newWorkbookChartGridlinesFormat, @Nonnull final ICallback<? super WorkbookChartGridlinesFormat> callback) {
        send(HttpMethod.PUT, callback, newWorkbookChartGridlinesFormat);
    }

    /**
     * Creates a WorkbookChartGridlinesFormat with a new object
     *
     * @param newWorkbookChartGridlinesFormat the object to create/update
     * @return the created WorkbookChartGridlinesFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartGridlinesFormat put(@Nonnull final WorkbookChartGridlinesFormat newWorkbookChartGridlinesFormat) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookChartGridlinesFormat);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WorkbookChartGridlinesFormatRequest select(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WorkbookChartGridlinesFormatRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public WorkbookChartGridlinesFormatRequest expand(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WorkbookChartGridlinesFormatRequest)this;
     }

}

