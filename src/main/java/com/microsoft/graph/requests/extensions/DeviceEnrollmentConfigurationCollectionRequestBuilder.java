// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.DeviceEnrollmentConfiguration;
import com.microsoft.graph.models.extensions.EnrollmentConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Enrollment Configuration Collection Request Builder.
 */
public class DeviceEnrollmentConfigurationCollectionRequestBuilder extends BaseCollectionRequestBuilder<DeviceEnrollmentConfiguration, DeviceEnrollmentConfigurationRequestBuilder, DeviceEnrollmentConfigurationCollectionResponse, DeviceEnrollmentConfigurationCollectionPage, DeviceEnrollmentConfigurationCollectionRequest> {

    /**
     * The request builder for this collection of DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceEnrollmentConfigurationCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceEnrollmentConfigurationRequestBuilder.class, DeviceEnrollmentConfigurationCollectionResponse.class, DeviceEnrollmentConfigurationCollectionPage.class, DeviceEnrollmentConfigurationCollectionRequest.class);
    }


}
