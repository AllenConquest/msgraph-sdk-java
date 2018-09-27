// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfiguration;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Managed Device Mobile App Configuration Collection Page.
 */
public class BaseManagedDeviceMobileAppConfigurationCollectionPage extends BaseCollectionPage<ManagedDeviceMobileAppConfiguration, IManagedDeviceMobileAppConfigurationCollectionRequestBuilder> implements IBaseManagedDeviceMobileAppConfigurationCollectionPage {

    /**
     * A collection page for ManagedDeviceMobileAppConfiguration
     *
     * @param response the serialized BaseManagedDeviceMobileAppConfigurationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseManagedDeviceMobileAppConfigurationCollectionPage(final BaseManagedDeviceMobileAppConfigurationCollectionResponse response, final IManagedDeviceMobileAppConfigurationCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}