// Template Source: Templates\Java\requests_extensions\BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsBitandRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Bitand Request Builder.
 */
public class WorkbookFunctionsBitandRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    /**
     * The request builder for this WorkbookFunctionsBitand
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number1 the number1
     * @param number2 the number2
     */
    public WorkbookFunctionsBitandRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final com.google.gson.JsonElement number1, @Nullable final com.google.gson.JsonElement number2) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number1", number1);
        bodyParams.put("number2", number2);
    }

    /**
     * Creates the WorkbookFunctionsBitandRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsBitandRequest instance
     */
    @Nonnull
    public WorkbookFunctionsBitandRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsBitandRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsBitandRequest instance
     */
    @Nonnull
    public WorkbookFunctionsBitandRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsBitandRequest request = new WorkbookFunctionsBitandRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number1")) {
            request.body.number1 = getParameter("number1");
        }

        if (hasParameter("number2")) {
            request.body.number2 = getParameter("number2");
        }

        return request;
    }
}
