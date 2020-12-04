// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Device;
import com.microsoft.graph.requests.extensions.DeviceCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.DeviceCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Collection Page.
 */
public class DeviceCollectionPage extends BaseCollectionPage<Device, DeviceCollectionRequestBuilder> {

    /**
     * A collection page for Device
     *
     * @param response the serialized DeviceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceCollectionPage(@Nonnull final DeviceCollectionResponse response, @Nonnull final DeviceCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Device
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceCollectionPage(@Nonnull final java.util.List<Device> pageContents, @Nullable final DeviceCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
