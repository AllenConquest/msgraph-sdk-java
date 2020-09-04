// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeConnectorSyncRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Exchange Connector Sync Request Builder.
 */
public interface IDeviceManagementExchangeConnectorSyncRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDeviceManagementExchangeConnectorSyncRequest
     *
     * @return the IDeviceManagementExchangeConnectorSyncRequest instance
     */
    IDeviceManagementExchangeConnectorSyncRequest buildRequest();

    /**
     * Creates the IDeviceManagementExchangeConnectorSyncRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDeviceManagementExchangeConnectorSyncRequest instance
     */
    IDeviceManagementExchangeConnectorSyncRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
