// Template Source: Templates\Java\requests_extensions\BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsImSinRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Im Sin Request Builder.
 */
public class WorkbookFunctionsImSinRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    /**
     * The request builder for this WorkbookFunctionsImSin
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param inumber the inumber
     */
    public WorkbookFunctionsImSinRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final com.google.gson.JsonElement inumber) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("inumber", inumber);
    }

    /**
     * Creates the WorkbookFunctionsImSinRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsImSinRequest instance
     */
    @Nonnull
    public WorkbookFunctionsImSinRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsImSinRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsImSinRequest instance
     */
    @Nonnull
    public WorkbookFunctionsImSinRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsImSinRequest request = new WorkbookFunctionsImSinRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("inumber")) {
            request.body.inumber = getParameter("inumber");
        }

        return request;
    }
}
