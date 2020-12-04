// Template Source: Templates\Java\requests_extensions\BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookPivotTableRefreshRequest;
import com.microsoft.graph.models.extensions.WorkbookPivotTable;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Pivot Table Refresh Request Builder.
 */
public class WorkbookPivotTableRefreshRequestBuilder extends BaseActionRequestBuilder<WorkbookPivotTable> {

    /**
     * The request builder for this WorkbookPivotTableRefresh
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookPivotTableRefreshRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the WorkbookPivotTableRefreshRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookPivotTableRefreshRequest instance
     */
    @Nonnull
    public WorkbookPivotTableRefreshRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookPivotTableRefreshRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookPivotTableRefreshRequest instance
     */
    @Nonnull
    public WorkbookPivotTableRefreshRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookPivotTableRefreshRequest request = new WorkbookPivotTableRefreshRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
