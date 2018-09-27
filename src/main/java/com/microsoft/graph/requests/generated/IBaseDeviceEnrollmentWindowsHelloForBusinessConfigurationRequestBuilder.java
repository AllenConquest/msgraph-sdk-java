// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentWindowsHelloForBusinessConfigurationRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Device Enrollment Windows Hello For Business Configuration Request Builder.
 */
public interface IBaseDeviceEnrollmentWindowsHelloForBusinessConfigurationRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IDeviceEnrollmentWindowsHelloForBusinessConfigurationRequest instance
     */
    IDeviceEnrollmentWindowsHelloForBusinessConfigurationRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDeviceEnrollmentWindowsHelloForBusinessConfigurationRequest instance
     */
    IDeviceEnrollmentWindowsHelloForBusinessConfigurationRequest buildRequest(final java.util.List<? extends Option> requestOptions);

}