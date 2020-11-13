// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAppManagement;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionPolicy;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionPolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionPolicyCollectionRequest;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionPolicyCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection Policy Collection Request.
 */
public class WindowsInformationProtectionPolicyCollectionRequest extends BaseCollectionRequest<WindowsInformationProtectionPolicyCollectionResponse, WindowsInformationProtectionPolicyCollectionPage> {

    /**
     * The request builder for this collection of WindowsInformationProtectionPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsInformationProtectionPolicyCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsInformationProtectionPolicyCollectionResponse.class, WindowsInformationProtectionPolicyCollectionPage.class);
    }

    public void get(@Nonnull final ICallback<? super WindowsInformationProtectionPolicyCollectionPage> callback) {
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
    public WindowsInformationProtectionPolicyCollectionPage get() throws ClientException {
        final WindowsInformationProtectionPolicyCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(@Nonnull final WindowsInformationProtectionPolicy newWindowsInformationProtectionPolicy, @Nonnull final ICallback<? super WindowsInformationProtectionPolicy> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new WindowsInformationProtectionPolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newWindowsInformationProtectionPolicy, callback);
    }

    @Nonnull
    public WindowsInformationProtectionPolicy post(@Nonnull final WindowsInformationProtectionPolicy newWindowsInformationProtectionPolicy) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new WindowsInformationProtectionPolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newWindowsInformationProtectionPolicy);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public WindowsInformationProtectionPolicyCollectionRequest expand(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WindowsInformationProtectionPolicyCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public WindowsInformationProtectionPolicyCollectionRequest filter(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (WindowsInformationProtectionPolicyCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public WindowsInformationProtectionPolicyCollectionRequest orderBy(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (WindowsInformationProtectionPolicyCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public WindowsInformationProtectionPolicyCollectionRequest select(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (WindowsInformationProtectionPolicyCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public WindowsInformationProtectionPolicyCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (WindowsInformationProtectionPolicyCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public WindowsInformationProtectionPolicyCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (WindowsInformationProtectionPolicyCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public WindowsInformationProtectionPolicyCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (WindowsInformationProtectionPolicyCollectionRequest)this;
    }
    @Nonnull
    public WindowsInformationProtectionPolicyCollectionPage buildFromResponse(@Nonnull final WindowsInformationProtectionPolicyCollectionResponse response) {
        final WindowsInformationProtectionPolicyCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new WindowsInformationProtectionPolicyCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final WindowsInformationProtectionPolicyCollectionPage page = new WindowsInformationProtectionPolicyCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
