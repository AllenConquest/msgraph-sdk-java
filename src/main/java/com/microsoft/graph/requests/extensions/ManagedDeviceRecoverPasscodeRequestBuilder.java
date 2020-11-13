// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ManagedDeviceRecoverPasscodeRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Recover Passcode Request Builder.
 */
public class ManagedDeviceRecoverPasscodeRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this ManagedDeviceRecoverPasscode
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceRecoverPasscodeRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the ManagedDeviceRecoverPasscodeRequest
     *
     * @param requestOptions the options for the request
     * @return the ManagedDeviceRecoverPasscodeRequest instance
     */
    @Nonnull
    public ManagedDeviceRecoverPasscodeRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ManagedDeviceRecoverPasscodeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ManagedDeviceRecoverPasscodeRequest instance
     */
    @Nonnull
    public ManagedDeviceRecoverPasscodeRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ManagedDeviceRecoverPasscodeRequest request = new ManagedDeviceRecoverPasscodeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
