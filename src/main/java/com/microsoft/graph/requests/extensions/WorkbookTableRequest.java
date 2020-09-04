// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookTable;
import com.microsoft.graph.models.extensions.WorkbookRange;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookTableColumnCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookTableColumnRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableRowCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableRowRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookTableRowCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookTableRowRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableSortRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookTableSortRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Request.
 */
public class WorkbookTableRequest extends BaseRequest implements IWorkbookTableRequest {
	
    /**
     * The request for the WorkbookTable
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookTableRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookTable.class);
    }

    /**
     * Gets the WorkbookTable from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WorkbookTable> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookTable from the service
     *
     * @return the WorkbookTable from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookTable get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WorkbookTable> callback) {
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
     * Patches this WorkbookTable with a source
     *
     * @param sourceWorkbookTable the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookTable sourceWorkbookTable, final ICallback<WorkbookTable> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookTable);
    }

    /**
     * Patches this WorkbookTable with a source
     *
     * @param sourceWorkbookTable the source object with updates
     * @return the updated WorkbookTable
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookTable patch(final WorkbookTable sourceWorkbookTable) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookTable);
    }

    /**
     * Creates a WorkbookTable with a new object
     *
     * @param newWorkbookTable the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookTable newWorkbookTable, final ICallback<WorkbookTable> callback) {
        send(HttpMethod.POST, callback, newWorkbookTable);
    }

    /**
     * Creates a WorkbookTable with a new object
     *
     * @param newWorkbookTable the new object to create
     * @return the created WorkbookTable
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookTable post(final WorkbookTable newWorkbookTable) throws ClientException {
        return send(HttpMethod.POST, newWorkbookTable);
    }

    /**
     * Creates a WorkbookTable with a new object
     *
     * @param newWorkbookTable the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WorkbookTable newWorkbookTable, final ICallback<WorkbookTable> callback) {
        send(HttpMethod.PUT, callback, newWorkbookTable);
    }

    /**
     * Creates a WorkbookTable with a new object
     *
     * @param newWorkbookTable the object to create/update
     * @return the created WorkbookTable
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookTable put(final WorkbookTable newWorkbookTable) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookTable);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookTableRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WorkbookTableRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookTableRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WorkbookTableRequest)this;
     }

}

