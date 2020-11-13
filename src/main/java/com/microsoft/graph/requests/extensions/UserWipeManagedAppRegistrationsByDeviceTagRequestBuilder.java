// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.UserWipeManagedAppRegistrationsByDeviceTagRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Wipe Managed App Registrations By Device Tag Request Builder.
 */
public class UserWipeManagedAppRegistrationsByDeviceTagRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this UserWipeManagedAppRegistrationsByDeviceTag
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param deviceTag the deviceTag
     */
    public UserWipeManagedAppRegistrationsByDeviceTagRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final String deviceTag) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("deviceTag", deviceTag);
    }

    /**
     * Creates the UserWipeManagedAppRegistrationsByDeviceTagRequest
     *
     * @param requestOptions the options for the request
     * @return the UserWipeManagedAppRegistrationsByDeviceTagRequest instance
     */
    @Nonnull
    public UserWipeManagedAppRegistrationsByDeviceTagRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the UserWipeManagedAppRegistrationsByDeviceTagRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the UserWipeManagedAppRegistrationsByDeviceTagRequest instance
     */
    @Nonnull
    public UserWipeManagedAppRegistrationsByDeviceTagRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        UserWipeManagedAppRegistrationsByDeviceTagRequest request = new UserWipeManagedAppRegistrationsByDeviceTagRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("deviceTag")) {
            request.body.deviceTag = getParameter("deviceTag");
        }

        return request;
    }
}
