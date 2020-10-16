// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsAreasRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Areas Request Builder.
 */
public class WorkbookFunctionsAreasRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    /**
     * The request builder for this WorkbookFunctionsAreas
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param reference the reference
     */
    public WorkbookFunctionsAreasRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement reference) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("reference", reference);
    }

    /**
     * Creates the WorkbookFunctionsAreasRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsAreasRequest instance
     */
    public WorkbookFunctionsAreasRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsAreasRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsAreasRequest instance
     */
    public WorkbookFunctionsAreasRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsAreasRequest request = new WorkbookFunctionsAreasRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("reference")) {
            request.body.reference = getParameter("reference");
        }

        return request;
    }
}
