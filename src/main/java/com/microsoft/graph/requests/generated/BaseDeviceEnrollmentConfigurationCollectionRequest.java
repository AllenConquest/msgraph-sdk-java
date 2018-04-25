// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Device Enrollment Configuration Collection Request.
 */
public class BaseDeviceEnrollmentConfigurationCollectionRequest extends BaseCollectionRequest<BaseDeviceEnrollmentConfigurationCollectionResponse, IDeviceEnrollmentConfigurationCollectionPage> implements IBaseDeviceEnrollmentConfigurationCollectionRequest {

    /**
     * The request builder for this collection of DeviceEnrollmentConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseDeviceEnrollmentConfigurationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseDeviceEnrollmentConfigurationCollectionResponse.class, IDeviceEnrollmentConfigurationCollectionPage.class);
    }

    public void get(final ICallback<IDeviceEnrollmentConfigurationCollectionPage> callback) {
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

    public IDeviceEnrollmentConfigurationCollectionPage get() throws ClientException {
        final BaseDeviceEnrollmentConfigurationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceEnrollmentConfiguration newDeviceEnrollmentConfiguration, final ICallback<DeviceEnrollmentConfiguration> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceEnrollmentConfigurationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceEnrollmentConfiguration, callback);
    }

    public DeviceEnrollmentConfiguration post(final DeviceEnrollmentConfiguration newDeviceEnrollmentConfiguration) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceEnrollmentConfigurationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceEnrollmentConfiguration);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceEnrollmentConfigurationCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (DeviceEnrollmentConfigurationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceEnrollmentConfigurationCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (DeviceEnrollmentConfigurationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceEnrollmentConfigurationCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (DeviceEnrollmentConfigurationCollectionRequest)this;
    }

    public IDeviceEnrollmentConfigurationCollectionPage buildFromResponse(final BaseDeviceEnrollmentConfigurationCollectionResponse response) {
        final IDeviceEnrollmentConfigurationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceEnrollmentConfigurationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceEnrollmentConfigurationCollectionPage page = new DeviceEnrollmentConfigurationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
