// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.UserRemoveAllDevicesFromManagementRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Remove All Devices From Management Request Builder.
 */
public class UserRemoveAllDevicesFromManagementRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this UserRemoveAllDevicesFromManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserRemoveAllDevicesFromManagementRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the UserRemoveAllDevicesFromManagementRequest
     *
     * @param requestOptions the options for the request
     * @return the UserRemoveAllDevicesFromManagementRequest instance
     */
    @Nonnull
    public UserRemoveAllDevicesFromManagementRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the UserRemoveAllDevicesFromManagementRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the UserRemoveAllDevicesFromManagementRequest instance
     */
    @Nonnull
    public UserRemoveAllDevicesFromManagementRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        UserRemoveAllDevicesFromManagementRequest request = new UserRemoveAllDevicesFromManagementRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
