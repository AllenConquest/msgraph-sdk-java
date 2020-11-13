// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicySettingStateSummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicySettingStateSummaryCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicySettingStateSummaryCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicySettingStateSummaryCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy Setting State Summary Collection Request.
 */
public class DeviceCompliancePolicySettingStateSummaryCollectionRequest extends BaseCollectionRequest<DeviceCompliancePolicySettingStateSummaryCollectionResponse, DeviceCompliancePolicySettingStateSummaryCollectionPage> {

    /**
     * The request builder for this collection of DeviceCompliancePolicySettingStateSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCompliancePolicySettingStateSummaryCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceCompliancePolicySettingStateSummaryCollectionResponse.class, DeviceCompliancePolicySettingStateSummaryCollectionPage.class);
    }

    public void get(@Nonnull final ICallback<? super DeviceCompliancePolicySettingStateSummaryCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    @Nonnull
    public DeviceCompliancePolicySettingStateSummaryCollectionPage get() throws ClientException {
        final DeviceCompliancePolicySettingStateSummaryCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(@Nonnull final DeviceCompliancePolicySettingStateSummary newDeviceCompliancePolicySettingStateSummary, @Nonnull final ICallback<? super DeviceCompliancePolicySettingStateSummary> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceCompliancePolicySettingStateSummaryRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceCompliancePolicySettingStateSummary, callback);
    }

    @Nonnull
    public DeviceCompliancePolicySettingStateSummary post(@Nonnull final DeviceCompliancePolicySettingStateSummary newDeviceCompliancePolicySettingStateSummary) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceCompliancePolicySettingStateSummaryRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceCompliancePolicySettingStateSummary);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public DeviceCompliancePolicySettingStateSummaryCollectionRequest expand(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceCompliancePolicySettingStateSummaryCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public DeviceCompliancePolicySettingStateSummaryCollectionRequest filter(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (DeviceCompliancePolicySettingStateSummaryCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public DeviceCompliancePolicySettingStateSummaryCollectionRequest orderBy(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (DeviceCompliancePolicySettingStateSummaryCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public DeviceCompliancePolicySettingStateSummaryCollectionRequest select(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceCompliancePolicySettingStateSummaryCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public DeviceCompliancePolicySettingStateSummaryCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DeviceCompliancePolicySettingStateSummaryCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public DeviceCompliancePolicySettingStateSummaryCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (DeviceCompliancePolicySettingStateSummaryCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public DeviceCompliancePolicySettingStateSummaryCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (DeviceCompliancePolicySettingStateSummaryCollectionRequest)this;
    }
    @Nonnull
    public DeviceCompliancePolicySettingStateSummaryCollectionPage buildFromResponse(@Nonnull final DeviceCompliancePolicySettingStateSummaryCollectionResponse response) {
        final DeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceCompliancePolicySettingStateSummaryCollectionPage page = new DeviceCompliancePolicySettingStateSummaryCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
