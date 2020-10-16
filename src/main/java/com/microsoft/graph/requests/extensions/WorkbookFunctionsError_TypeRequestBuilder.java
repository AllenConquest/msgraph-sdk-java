// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsError_TypeRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Error_Type Request Builder.
 */
public class WorkbookFunctionsError_TypeRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    /**
     * The request builder for this WorkbookFunctionsError_Type
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param errorVal the errorVal
     */
    public WorkbookFunctionsError_TypeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement errorVal) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("errorVal", errorVal);
    }

    /**
     * Creates the WorkbookFunctionsError_TypeRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsError_TypeRequest instance
     */
    public WorkbookFunctionsError_TypeRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsError_TypeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsError_TypeRequest instance
     */
    public WorkbookFunctionsError_TypeRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsError_TypeRequest request = new WorkbookFunctionsError_TypeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("errorVal")) {
            request.body.errorVal = getParameter("errorVal");
        }

        return request;
    }
}
