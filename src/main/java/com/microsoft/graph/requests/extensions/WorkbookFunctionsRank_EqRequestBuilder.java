// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsRank_EqRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Rank_Eq Request Builder.
 */
public class WorkbookFunctionsRank_EqRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsRank_Eq
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param ref the ref
     * @param order the order
     */
    public WorkbookFunctionsRank_EqRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final com.google.gson.JsonElement number, @Nullable final com.google.gson.JsonElement ref, @Nullable final com.google.gson.JsonElement order) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("ref", ref);
        bodyParams.put("order", order);
    }

    /**
     * Creates the WorkbookFunctionsRank_EqRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsRank_EqRequest instance
     */
    @Nonnull
    public WorkbookFunctionsRank_EqRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsRank_EqRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsRank_EqRequest instance
     */
    @Nonnull
    public WorkbookFunctionsRank_EqRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsRank_EqRequest request = new WorkbookFunctionsRank_EqRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("ref")) {
            request.body.ref = getParameter("ref");
        }

        if (hasParameter("order")) {
            request.body.order = getParameter("order");
        }

        return request;
    }
}
