// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWindowsPhone81GeneralConfigurationRequest;
import com.microsoft.graph.requests.extensions.WindowsPhone81GeneralConfigurationRequest;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Windows Phone81General Configuration Request Builder.
 */
public class BaseWindowsPhone81GeneralConfigurationRequestBuilder extends BaseRequestBuilder implements IBaseWindowsPhone81GeneralConfigurationRequestBuilder {

    /**
     * The request builder for the WindowsPhone81GeneralConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWindowsPhone81GeneralConfigurationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWindowsPhone81GeneralConfigurationRequest instance
     */
    public IWindowsPhone81GeneralConfigurationRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWindowsPhone81GeneralConfigurationRequest instance
     */
    public IWindowsPhone81GeneralConfigurationRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new WindowsPhone81GeneralConfigurationRequest(getRequestUrl(), getClient(), requestOptions);
    }

}
