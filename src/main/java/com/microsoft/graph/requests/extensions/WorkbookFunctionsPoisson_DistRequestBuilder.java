// Template Source: Templates\Java\requests_extensions\BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsPoisson_DistRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Poisson_Dist Request Builder.
 */
public class WorkbookFunctionsPoisson_DistRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    /**
     * The request builder for this WorkbookFunctionsPoisson_Dist
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param x the x
     * @param mean the mean
     * @param cumulative the cumulative
     */
    public WorkbookFunctionsPoisson_DistRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final com.google.gson.JsonElement x, @Nullable final com.google.gson.JsonElement mean, @Nullable final com.google.gson.JsonElement cumulative) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("x", x);
        bodyParams.put("mean", mean);
        bodyParams.put("cumulative", cumulative);
    }

    /**
     * Creates the WorkbookFunctionsPoisson_DistRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsPoisson_DistRequest instance
     */
    @Nonnull
    public WorkbookFunctionsPoisson_DistRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsPoisson_DistRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsPoisson_DistRequest instance
     */
    @Nonnull
    public WorkbookFunctionsPoisson_DistRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsPoisson_DistRequest request = new WorkbookFunctionsPoisson_DistRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("x")) {
            request.body.x = getParameter("x");
        }

        if (hasParameter("mean")) {
            request.body.mean = getParameter("mean");
        }

        if (hasParameter("cumulative")) {
            request.body.cumulative = getParameter("cumulative");
        }

        return request;
    }
}
