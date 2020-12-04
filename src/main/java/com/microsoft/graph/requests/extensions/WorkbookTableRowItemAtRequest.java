// Template Source: Templates\Java\requests_extensions\BaseMethodRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookTableRow;
import com.microsoft.graph.requests.extensions.WorkbookTableRowItemAtRequest;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Row Item At Request.
 */
public class WorkbookTableRowItemAtRequest extends BaseRequest<WorkbookTableRow> {

    /**
     * The request for this WorkbookTableRowItemAt
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookTableRowItemAtRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookTableRow.class);
    }

    /**
     * Patches the WorkbookTableRowItemAt
     * @param srcWorkbookTableRow the WorkbookTableRow with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull WorkbookTableRow srcWorkbookTableRow, @Nonnull final ICallback<? super WorkbookTableRow> callback) {
        send(HttpMethod.PATCH, callback, srcWorkbookTableRow);
    }

    /**
     * Patches the WorkbookTableRowItemAt
     *
     * @param srcWorkbookTableRow the WorkbookTableRow with which to PATCH
     * @return the WorkbookTableRow
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     @Nullable
     public WorkbookTableRow patch(@Nonnull final WorkbookTableRow srcWorkbookTableRow) throws ClientException {
        return this.send(HttpMethod.PATCH, srcWorkbookTableRow);
    }

    /**
     * Puts the WorkbookTableRowItemAt
     *
     * @param srcWorkbookTableRow the WorkbookTableRow to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final WorkbookTableRow srcWorkbookTableRow, @Nonnull final ICallback<? super WorkbookTableRow> callback) {
        send(HttpMethod.PUT, callback, srcWorkbookTableRow);
    }

    /**
     * Puts the WorkbookTableRowItemAt
     *
     * @param srcWorkbookTableRow the WorkbookTableRow to PUT
     * @return the WorkbookTableRow
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     @Nullable
     public WorkbookTableRow put(@Nonnull final WorkbookTableRow srcWorkbookTableRow) throws ClientException {
        return this.send(HttpMethod.PUT, srcWorkbookTableRow);
    }
    /**
     * Gets the WorkbookTableRow
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super WorkbookTableRow> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookTableRow
     *
     * @return the WorkbookTableRow
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public WorkbookTableRow get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public WorkbookTableRowItemAtRequest select(@Nonnull final String value) {
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
    public WorkbookTableRowItemAtRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public WorkbookTableRowItemAtRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public WorkbookTableRowItemAtRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

}
