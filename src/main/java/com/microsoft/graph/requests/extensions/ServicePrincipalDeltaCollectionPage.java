// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IServicePrincipalDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ServicePrincipalDeltaCollectionPage;
import com.microsoft.graph.requests.extensions.ServicePrincipalDeltaCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Delta Collection Page.
 */
public class ServicePrincipalDeltaCollectionPage extends BaseCollectionPage<ServicePrincipal, IServicePrincipalDeltaCollectionRequestBuilder> implements IServicePrincipalDeltaCollectionPage {

    /**
     * The opaque link to query delta after the 
     * initial request
     */
    public String deltaLink;

    /**
     * A collection page for ServicePrincipal.
     *
     * @param response The serialized ServicePrincipalDeltaCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ServicePrincipalDeltaCollectionPage(final ServicePrincipalDeltaCollectionResponse response, final IServicePrincipalDeltaCollectionRequestBuilder builder) {
       super(response.value, builder);

        if (response.getRawObject().get("@odata.deltaLink") != null) {
            deltaLink = response.getRawObject().get("@odata.deltaLink").getAsString();
        } else {
            deltaLink = null;
        }
    }
    /**
     * The deltaLink to make future delta requests
     *
     * @return String The deltaLink URL
     */
    public String deltaLink() {
        return deltaLink;
    }
}
