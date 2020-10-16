// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsGamma_InvRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Gamma_Inv Request Builder.
 */
public class WorkbookFunctionsGamma_InvRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    /**
     * The request builder for this WorkbookFunctionsGamma_Inv
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param probability the probability
     * @param alpha the alpha
     * @param beta the beta
     */
    public WorkbookFunctionsGamma_InvRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement probability, final com.google.gson.JsonElement alpha, final com.google.gson.JsonElement beta) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("probability", probability);
        bodyParams.put("alpha", alpha);
        bodyParams.put("beta", beta);
    }

    /**
     * Creates the WorkbookFunctionsGamma_InvRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsGamma_InvRequest instance
     */
    public WorkbookFunctionsGamma_InvRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsGamma_InvRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsGamma_InvRequest instance
     */
    public WorkbookFunctionsGamma_InvRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsGamma_InvRequest request = new WorkbookFunctionsGamma_InvRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("probability")) {
            request.body.probability = getParameter("probability");
        }

        if (hasParameter("alpha")) {
            request.body.alpha = getParameter("alpha");
        }

        if (hasParameter("beta")) {
            request.body.beta = getParameter("beta");
        }

        return request;
    }
}
