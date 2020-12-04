// Template Source: Templates\Java\requests_extensions\BaseMethodRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Report;
import com.microsoft.graph.models.extensions.ReportRoot;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointSiteUsageDetailRequest;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Share Point Site Usage Detail Request.
 */
public class ReportRootGetSharePointSiteUsageDetailRequest extends BaseRequest<Report> {

    /**
     * The request for this ReportRootGetSharePointSiteUsageDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetSharePointSiteUsageDetailRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Report.class);
    }

    /**
     * Patches the ReportRootGetSharePointSiteUsageDetail
     * @param srcReport the Report with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull Report srcReport, @Nonnull final ICallback<? super Report> callback) {
        send(HttpMethod.PATCH, callback, srcReport);
    }

    /**
     * Patches the ReportRootGetSharePointSiteUsageDetail
     *
     * @param srcReport the Report with which to PATCH
     * @return the Report
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     @Nullable
     public Report patch(@Nonnull final Report srcReport) throws ClientException {
        return this.send(HttpMethod.PATCH, srcReport);
    }

    /**
     * Puts the ReportRootGetSharePointSiteUsageDetail
     *
     * @param srcReport the Report to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final Report srcReport, @Nonnull final ICallback<? super Report> callback) {
        send(HttpMethod.PUT, callback, srcReport);
    }

    /**
     * Puts the ReportRootGetSharePointSiteUsageDetail
     *
     * @param srcReport the Report to PUT
     * @return the Report
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     @Nullable
     public Report put(@Nonnull final Report srcReport) throws ClientException {
        return this.send(HttpMethod.PUT, srcReport);
    }
    /**
     * Gets the Report
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super Report> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Report
     *
     * @return the Report
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public Report get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public ReportRootGetSharePointSiteUsageDetailRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public ReportRootGetSharePointSiteUsageDetailRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public ReportRootGetSharePointSiteUsageDetailRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public ReportRootGetSharePointSiteUsageDetailRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

}
