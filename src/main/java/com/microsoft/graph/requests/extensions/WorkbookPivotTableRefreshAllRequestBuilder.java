// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookPivotTableRefreshAllRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Pivot Table Refresh All Request Builder.
 */
public class WorkbookPivotTableRefreshAllRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookPivotTableRefreshAll
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookPivotTableRefreshAllRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the WorkbookPivotTableRefreshAllRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookPivotTableRefreshAllRequest instance
     */
    @Nonnull
    public WorkbookPivotTableRefreshAllRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookPivotTableRefreshAllRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookPivotTableRefreshAllRequest instance
     */
    @Nonnull
    public WorkbookPivotTableRefreshAllRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookPivotTableRefreshAllRequest request = new WorkbookPivotTableRefreshAllRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
