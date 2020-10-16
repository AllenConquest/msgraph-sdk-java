// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsCeiling_PreciseRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Ceiling_Precise Request Builder.
 */
public class WorkbookFunctionsCeiling_PreciseRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    /**
     * The request builder for this WorkbookFunctionsCeiling_Precise
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param significance the significance
     */
    public WorkbookFunctionsCeiling_PreciseRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement significance) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("significance", significance);
    }

    /**
     * Creates the WorkbookFunctionsCeiling_PreciseRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsCeiling_PreciseRequest instance
     */
    public WorkbookFunctionsCeiling_PreciseRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsCeiling_PreciseRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsCeiling_PreciseRequest instance
     */
    public WorkbookFunctionsCeiling_PreciseRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsCeiling_PreciseRequest request = new WorkbookFunctionsCeiling_PreciseRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("significance")) {
            request.body.significance = getParameter("significance");
        }

        return request;
    }
}
