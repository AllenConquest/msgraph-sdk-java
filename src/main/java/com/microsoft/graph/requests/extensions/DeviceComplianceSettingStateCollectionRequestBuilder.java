// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicySettingStateSummary;
import com.microsoft.graph.models.extensions.DeviceComplianceSettingState;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.DeviceComplianceSettingStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceSettingStateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceSettingStateCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Setting State Collection Request Builder.
 */
public class DeviceComplianceSettingStateCollectionRequestBuilder extends BaseCollectionRequestBuilder<DeviceComplianceSettingState, DeviceComplianceSettingStateRequestBuilder, DeviceComplianceSettingStateCollectionResponse, DeviceComplianceSettingStateCollectionPage, DeviceComplianceSettingStateCollectionRequest> {

    /**
     * The request builder for this collection of DeviceCompliancePolicySettingStateSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceComplianceSettingStateCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceComplianceSettingStateRequestBuilder.class, DeviceComplianceSettingStateCollectionResponse.class, DeviceComplianceSettingStateCollectionPage.class, DeviceComplianceSettingStateCollectionRequest.class);
    }


}
