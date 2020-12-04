// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionWithReferencesPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.HomeRealmDiscoveryPolicy;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyCollectionResponse;
import com.microsoft.graph.models.extensions.HomeRealmDiscoveryPolicy;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Home Realm Discovery Policy Collection With References Page.
 */
public class HomeRealmDiscoveryPolicyCollectionWithReferencesPage extends BaseCollectionPage<HomeRealmDiscoveryPolicy, HomeRealmDiscoveryPolicyCollectionWithReferencesRequestBuilder> {

    /**
     * A collection page for HomeRealmDiscoveryPolicy
     *
     * @param response the serialized HomeRealmDiscoveryPolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public HomeRealmDiscoveryPolicyCollectionWithReferencesPage(@Nonnull final HomeRealmDiscoveryPolicyCollectionResponse response, @Nullable final HomeRealmDiscoveryPolicyCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }

    /**
     * Creates the collection page for HomeRealmDiscoveryPolicy
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public HomeRealmDiscoveryPolicyCollectionWithReferencesPage(@Nonnull final java.util.List<HomeRealmDiscoveryPolicy> pageContents, @Nullable final HomeRealmDiscoveryPolicyCollectionWithReferencesRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
