// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedAppPolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.UserGetManagedAppPoliciesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserGetManagedAppPoliciesCollectionRequest;
import com.microsoft.graph.requests.extensions.UserGetManagedAppPoliciesCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Get Managed App Policies Collection Request Builder.
 */
public class UserGetManagedAppPoliciesCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<ManagedAppPolicy, UserGetManagedAppPoliciesCollectionRequestBuilder, UserGetManagedAppPoliciesCollectionResponse, UserGetManagedAppPoliciesCollectionPage, UserGetManagedAppPoliciesCollectionRequest> {

    /**
     * The request builder for this collection of User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserGetManagedAppPoliciesCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserGetManagedAppPoliciesCollectionRequestBuilder.class, UserGetManagedAppPoliciesCollectionResponse.class, UserGetManagedAppPoliciesCollectionPage.class, UserGetManagedAppPoliciesCollectionRequest.class);
    }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the UserGetManagedAppPoliciesCollectionRequest instance
     */
     @Override
    public UserGetManagedAppPoliciesCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final UserGetManagedAppPoliciesCollectionRequest request = super.buildRequest(requestOptions);

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
