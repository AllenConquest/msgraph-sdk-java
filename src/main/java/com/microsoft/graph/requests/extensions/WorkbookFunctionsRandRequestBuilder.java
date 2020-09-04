// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsRandRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsRandRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Rand Request Builder.
 */
public class WorkbookFunctionsRandRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsRandRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsRand
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookFunctionsRandRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookFunctionsRandRequest
     *
     * @return the IWorkbookFunctionsRandRequest instance
     */
    public IWorkbookFunctionsRandRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsRandRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsRandRequest instance
     */
    public IWorkbookFunctionsRandRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsRandRequest request = new WorkbookFunctionsRandRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
