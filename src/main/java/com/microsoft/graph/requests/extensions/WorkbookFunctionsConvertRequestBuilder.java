// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsConvertRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Convert Request Builder.
 */
public class WorkbookFunctionsConvertRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    /**
     * The request builder for this WorkbookFunctionsConvert
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param fromUnit the fromUnit
     * @param toUnit the toUnit
     */
    public WorkbookFunctionsConvertRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement fromUnit, final com.google.gson.JsonElement toUnit) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("fromUnit", fromUnit);
        bodyParams.put("toUnit", toUnit);
    }

    /**
     * Creates the WorkbookFunctionsConvertRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsConvertRequest instance
     */
    public WorkbookFunctionsConvertRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsConvertRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsConvertRequest instance
     */
    public WorkbookFunctionsConvertRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsConvertRequest request = new WorkbookFunctionsConvertRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("fromUnit")) {
            request.body.fromUnit = getParameter("fromUnit");
        }

        if (hasParameter("toUnit")) {
            request.body.toUnit = getParameter("toUnit");
        }

        return request;
    }
}
