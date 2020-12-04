// Template Source: Templates\Java\requests_extensions\BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsT_Inv_2TRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions T_Inv_2TRequest Builder.
 */
public class WorkbookFunctionsT_Inv_2TRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    /**
     * The request builder for this WorkbookFunctionsT_Inv_2T
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param probability the probability
     * @param degFreedom the degFreedom
     */
    public WorkbookFunctionsT_Inv_2TRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final com.google.gson.JsonElement probability, @Nullable final com.google.gson.JsonElement degFreedom) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("probability", probability);
        bodyParams.put("degFreedom", degFreedom);
    }

    /**
     * Creates the WorkbookFunctionsT_Inv_2TRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsT_Inv_2TRequest instance
     */
    @Nonnull
    public WorkbookFunctionsT_Inv_2TRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsT_Inv_2TRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsT_Inv_2TRequest instance
     */
    @Nonnull
    public WorkbookFunctionsT_Inv_2TRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsT_Inv_2TRequest request = new WorkbookFunctionsT_Inv_2TRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("probability")) {
            request.body.probability = getParameter("probability");
        }

        if (hasParameter("degFreedom")) {
            request.body.degFreedom = getParameter("degFreedom");
        }

        return request;
    }
}
