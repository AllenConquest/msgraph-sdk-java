// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookChartSeries;
import com.microsoft.graph.requests.extensions.WorkbookChartSeriesCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookChartSeriesCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookChartSeriesCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Series Collection Page.
 */
public class WorkbookChartSeriesCollectionPage extends BaseCollectionPage<WorkbookChartSeries, WorkbookChartSeriesCollectionRequestBuilder> {

    /**
     * A collection page for WorkbookChartSeries
     *
     * @param response the serialized WorkbookChartSeriesCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WorkbookChartSeriesCollectionPage(@Nonnull final WorkbookChartSeriesCollectionResponse response, @Nonnull final WorkbookChartSeriesCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
