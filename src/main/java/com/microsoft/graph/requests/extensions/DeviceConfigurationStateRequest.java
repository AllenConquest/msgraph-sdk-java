// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceConfigurationState;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration State Request.
 */
public class DeviceConfigurationStateRequest extends BaseRequest {
	
    /**
     * The request for the DeviceConfigurationState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceConfigurationStateRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceConfigurationState.class);
    }

    /**
     * Gets the DeviceConfigurationState from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super DeviceConfigurationState> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceConfigurationState from the service
     *
     * @return the DeviceConfigurationState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceConfigurationState get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super DeviceConfigurationState> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceConfigurationState with a source
     *
     * @param sourceDeviceConfigurationState the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final DeviceConfigurationState sourceDeviceConfigurationState, @Nonnull final ICallback<? super DeviceConfigurationState> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceConfigurationState);
    }

    /**
     * Patches this DeviceConfigurationState with a source
     *
     * @param sourceDeviceConfigurationState the source object with updates
     * @return the updated DeviceConfigurationState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceConfigurationState patch(@Nonnull final DeviceConfigurationState sourceDeviceConfigurationState) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceConfigurationState);
    }

    /**
     * Creates a DeviceConfigurationState with a new object
     *
     * @param newDeviceConfigurationState the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final DeviceConfigurationState newDeviceConfigurationState, @Nonnull final ICallback<? super DeviceConfigurationState> callback) {
        send(HttpMethod.POST, callback, newDeviceConfigurationState);
    }

    /**
     * Creates a DeviceConfigurationState with a new object
     *
     * @param newDeviceConfigurationState the new object to create
     * @return the created DeviceConfigurationState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceConfigurationState post(@Nonnull final DeviceConfigurationState newDeviceConfigurationState) throws ClientException {
        return send(HttpMethod.POST, newDeviceConfigurationState);
    }

    /**
     * Creates a DeviceConfigurationState with a new object
     *
     * @param newDeviceConfigurationState the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final DeviceConfigurationState newDeviceConfigurationState, @Nonnull final ICallback<? super DeviceConfigurationState> callback) {
        send(HttpMethod.PUT, callback, newDeviceConfigurationState);
    }

    /**
     * Creates a DeviceConfigurationState with a new object
     *
     * @param newDeviceConfigurationState the object to create/update
     * @return the created DeviceConfigurationState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceConfigurationState put(@Nonnull final DeviceConfigurationState newDeviceConfigurationState) throws ClientException {
        return send(HttpMethod.PUT, newDeviceConfigurationState);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceConfigurationStateRequest select(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceConfigurationStateRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public DeviceConfigurationStateRequest expand(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceConfigurationStateRequest)this;
     }

}

