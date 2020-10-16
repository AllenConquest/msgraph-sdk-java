// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookRangeInsertRequest;
import com.microsoft.graph.models.extensions.WorkbookRange;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Insert Request Builder.
 */
public class WorkbookRangeInsertRequestBuilder extends BaseActionRequestBuilder<WorkbookRange> {

    /**
     * The request builder for this WorkbookRangeInsert
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param shift the shift
     */
    public WorkbookRangeInsertRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String shift) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("shift", shift);
    }

    /**
     * Creates the WorkbookRangeInsertRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookRangeInsertRequest instance
     */
    public WorkbookRangeInsertRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookRangeInsertRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookRangeInsertRequest instance
     */
    public WorkbookRangeInsertRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookRangeInsertRequest request = new WorkbookRangeInsertRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("shift")) {
            request.body.shift = getParameter("shift");
        }

        return request;
    }
}
