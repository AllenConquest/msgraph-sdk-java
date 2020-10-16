// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookChartSetDataRequest;
import com.microsoft.graph.models.extensions.WorkbookChart;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Set Data Request Builder.
 */
public class WorkbookChartSetDataRequestBuilder extends BaseActionRequestBuilder<WorkbookChart> {

    /**
     * The request builder for this WorkbookChartSetData
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param sourceData the sourceData
     * @param seriesBy the seriesBy
     */
    public WorkbookChartSetDataRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement sourceData, final String seriesBy) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("sourceData", sourceData);
        bodyParams.put("seriesBy", seriesBy);
    }

    /**
     * Creates the WorkbookChartSetDataRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookChartSetDataRequest instance
     */
    public WorkbookChartSetDataRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookChartSetDataRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookChartSetDataRequest instance
     */
    public WorkbookChartSetDataRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookChartSetDataRequest request = new WorkbookChartSetDataRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("sourceData")) {
            request.body.sourceData = getParameter("sourceData");
        }

        if (hasParameter("seriesBy")) {
            request.body.seriesBy = getParameter("seriesBy");
        }

        return request;
    }
}
