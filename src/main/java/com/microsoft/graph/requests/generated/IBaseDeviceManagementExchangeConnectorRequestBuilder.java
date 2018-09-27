// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeConnectorRequest;
import com.microsoft.graph.models.generated.DeviceManagementExchangeConnectorSyncType;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeConnectorSyncRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Device Management Exchange Connector Request Builder.
 */
public interface IBaseDeviceManagementExchangeConnectorRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IDeviceManagementExchangeConnectorRequest instance
     */
    IDeviceManagementExchangeConnectorRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDeviceManagementExchangeConnectorRequest instance
     */
    IDeviceManagementExchangeConnectorRequest buildRequest(final java.util.List<? extends Option> requestOptions);
    IDeviceManagementExchangeConnectorSyncRequestBuilder sync(final DeviceManagementExchangeConnectorSyncType syncType);

}