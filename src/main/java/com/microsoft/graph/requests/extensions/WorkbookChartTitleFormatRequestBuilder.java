// Template Source: Templates\Java\requests_extensions\BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartTitleFormat;
import com.microsoft.graph.requests.extensions.WorkbookChartFillRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartFontRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Title Format Request Builder.
 */
public class WorkbookChartTitleFormatRequestBuilder extends BaseRequestBuilder<WorkbookChartTitleFormat> {

    /**
     * The request builder for the WorkbookChartTitleFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartTitleFormatRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the WorkbookChartTitleFormatRequest instance
     */
    @Nonnull
    public WorkbookChartTitleFormatRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the WorkbookChartTitleFormatRequest instance
     */
    @Nonnull
    public WorkbookChartTitleFormatRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.WorkbookChartTitleFormatRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for WorkbookChartFill
     *
     * @return the WorkbookChartFillRequestBuilder instance
     */
    @Nonnull
    public WorkbookChartFillRequestBuilder fill() {
        return new WorkbookChartFillRequestBuilder(getRequestUrlWithAdditionalSegment("fill"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartFont
     *
     * @return the WorkbookChartFontRequestBuilder instance
     */
    @Nonnull
    public WorkbookChartFontRequestBuilder font() {
        return new WorkbookChartFontRequestBuilder(getRequestUrlWithAdditionalSegment("font"), getClient(), null);
    }
}
