// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidManagedAppRegistration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Managed App Registration Request Builder.
 */
public class AndroidManagedAppRegistrationRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for the AndroidManagedAppRegistration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidManagedAppRegistrationRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the AndroidManagedAppRegistrationRequest instance
     */
    @Nonnull
    public AndroidManagedAppRegistrationRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the AndroidManagedAppRegistrationRequest instance
     */
    @Nonnull
    public AndroidManagedAppRegistrationRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.AndroidManagedAppRegistrationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    @Nonnull
    public ManagedAppPolicyCollectionRequestBuilder appliedPolicies() {
        return new ManagedAppPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("appliedPolicies"), getClient(), null);
    }

    @Nonnull
    public ManagedAppPolicyRequestBuilder appliedPolicies(@Nonnull final String id) {
        return new ManagedAppPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("appliedPolicies") + "/" + id, getClient(), null);
    }
    @Nonnull
    public ManagedAppPolicyCollectionRequestBuilder intendedPolicies() {
        return new ManagedAppPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("intendedPolicies"), getClient(), null);
    }

    @Nonnull
    public ManagedAppPolicyRequestBuilder intendedPolicies(@Nonnull final String id) {
        return new ManagedAppPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("intendedPolicies") + "/" + id, getClient(), null);
    }
    @Nonnull
    public ManagedAppOperationCollectionRequestBuilder operations() {
        return new ManagedAppOperationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("operations"), getClient(), null);
    }

    @Nonnull
    public ManagedAppOperationRequestBuilder operations(@Nonnull final String id) {
        return new ManagedAppOperationRequestBuilder(getRequestUrlWithAdditionalSegment("operations") + "/" + id, getClient(), null);
    }
}
