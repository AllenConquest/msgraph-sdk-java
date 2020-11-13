// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsFloor_MathRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Floor_Math Request Builder.
 */
public class WorkbookFunctionsFloor_MathRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsFloor_Math
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param significance the significance
     * @param mode the mode
     */
    public WorkbookFunctionsFloor_MathRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final com.google.gson.JsonElement number, @Nullable final com.google.gson.JsonElement significance, @Nullable final com.google.gson.JsonElement mode) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("significance", significance);
        bodyParams.put("mode", mode);
    }

    /**
     * Creates the WorkbookFunctionsFloor_MathRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsFloor_MathRequest instance
     */
    @Nonnull
    public WorkbookFunctionsFloor_MathRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsFloor_MathRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsFloor_MathRequest instance
     */
    @Nonnull
    public WorkbookFunctionsFloor_MathRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsFloor_MathRequest request = new WorkbookFunctionsFloor_MathRequest(
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

        if (hasParameter("mode")) {
            request.body.mode = getParameter("mode");
        }

        return request;
    }
}
