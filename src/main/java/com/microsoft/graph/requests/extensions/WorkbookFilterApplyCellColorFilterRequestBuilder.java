// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFilterApplyCellColorFilterRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Filter Apply Cell Color Filter Request Builder.
 */
public class WorkbookFilterApplyCellColorFilterRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFilterApplyCellColorFilter
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param color the color
     */
    public WorkbookFilterApplyCellColorFilterRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final String color) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("color", color);
    }

    /**
     * Creates the WorkbookFilterApplyCellColorFilterRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFilterApplyCellColorFilterRequest instance
     */
    @Nonnull
    public WorkbookFilterApplyCellColorFilterRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFilterApplyCellColorFilterRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFilterApplyCellColorFilterRequest instance
     */
    @Nonnull
    public WorkbookFilterApplyCellColorFilterRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFilterApplyCellColorFilterRequest request = new WorkbookFilterApplyCellColorFilterRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("color")) {
            request.body.color = getParameter("color");
        }

        return request;
    }
}
