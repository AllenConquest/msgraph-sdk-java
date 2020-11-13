// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartAxis;
import com.microsoft.graph.requests.extensions.WorkbookChartAxisFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartGridlinesRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartAxisTitleRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Axis Request Builder.
 */
public class WorkbookChartAxisRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for the WorkbookChartAxis
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartAxisRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the WorkbookChartAxisRequest instance
     */
    @Nonnull
    public WorkbookChartAxisRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the WorkbookChartAxisRequest instance
     */
    @Nonnull
    public WorkbookChartAxisRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.WorkbookChartAxisRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for WorkbookChartAxisFormat
     *
     * @return the WorkbookChartAxisFormatRequestBuilder instance
     */
    @Nonnull
    public WorkbookChartAxisFormatRequestBuilder format() {
        return new WorkbookChartAxisFormatRequestBuilder(getRequestUrlWithAdditionalSegment("format"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartGridlines
     *
     * @return the WorkbookChartGridlinesRequestBuilder instance
     */
    @Nonnull
    public WorkbookChartGridlinesRequestBuilder majorGridlines() {
        return new WorkbookChartGridlinesRequestBuilder(getRequestUrlWithAdditionalSegment("majorGridlines"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartGridlines
     *
     * @return the WorkbookChartGridlinesRequestBuilder instance
     */
    @Nonnull
    public WorkbookChartGridlinesRequestBuilder minorGridlines() {
        return new WorkbookChartGridlinesRequestBuilder(getRequestUrlWithAdditionalSegment("minorGridlines"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartAxisTitle
     *
     * @return the WorkbookChartAxisTitleRequestBuilder instance
     */
    @Nonnull
    public WorkbookChartAxisTitleRequestBuilder title() {
        return new WorkbookChartAxisTitleRequestBuilder(getRequestUrlWithAdditionalSegment("title"), getClient(), null);
    }
}
