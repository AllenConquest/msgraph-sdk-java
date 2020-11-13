// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Organization;
import com.microsoft.graph.requests.extensions.OrganizationCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.OrganizationCollectionPage;
import com.microsoft.graph.requests.extensions.OrganizationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Organization Collection Page.
 */
public class OrganizationCollectionPage extends BaseCollectionPage<Organization, OrganizationCollectionRequestBuilder> {

    /**
     * A collection page for Organization
     *
     * @param response the serialized OrganizationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public OrganizationCollectionPage(@Nonnull final OrganizationCollectionResponse response, @Nonnull final OrganizationCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
