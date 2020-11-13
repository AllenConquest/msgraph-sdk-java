// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.requests.extensions.ServicePrincipalCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ServicePrincipalCollectionPage;
import com.microsoft.graph.requests.extensions.ServicePrincipalCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Collection Page.
 */
public class ServicePrincipalCollectionPage extends BaseCollectionPage<ServicePrincipal, ServicePrincipalCollectionRequestBuilder> {

    /**
     * A collection page for ServicePrincipal
     *
     * @param response the serialized ServicePrincipalCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ServicePrincipalCollectionPage(@Nonnull final ServicePrincipalCollectionResponse response, @Nonnull final ServicePrincipalCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
