// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Device Configuration Device Status Request.
 */
public interface IBaseDeviceConfigurationDeviceStatusRequest extends IHttpRequest {

    /**
     * Gets the DeviceConfigurationDeviceStatus from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DeviceConfigurationDeviceStatus> callback);

    /**
     * Gets the DeviceConfigurationDeviceStatus from the service
     *
     * @return the DeviceConfigurationDeviceStatus from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceConfigurationDeviceStatus get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceConfigurationDeviceStatus with a source
     *
     * @param sourceDeviceConfigurationDeviceStatus the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceConfigurationDeviceStatus sourceDeviceConfigurationDeviceStatus, final ICallback<DeviceConfigurationDeviceStatus> callback);

    /**
     * Patches this DeviceConfigurationDeviceStatus with a source
     *
     * @param sourceDeviceConfigurationDeviceStatus the source object with updates
     * @return the updated DeviceConfigurationDeviceStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceConfigurationDeviceStatus patch(final DeviceConfigurationDeviceStatus sourceDeviceConfigurationDeviceStatus) throws ClientException;

    /**
     * Posts a DeviceConfigurationDeviceStatus with a new object
     *
     * @param newDeviceConfigurationDeviceStatus the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceConfigurationDeviceStatus newDeviceConfigurationDeviceStatus, final ICallback<DeviceConfigurationDeviceStatus> callback);

    /**
     * Posts a DeviceConfigurationDeviceStatus with a new object
     *
     * @param newDeviceConfigurationDeviceStatus the new object to create
     * @return the created DeviceConfigurationDeviceStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceConfigurationDeviceStatus post(final DeviceConfigurationDeviceStatus newDeviceConfigurationDeviceStatus) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseDeviceConfigurationDeviceStatusRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseDeviceConfigurationDeviceStatusRequest expand(final String value);

}

