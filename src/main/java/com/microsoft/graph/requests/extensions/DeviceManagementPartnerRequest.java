// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementPartner;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Partner Request.
 */
public class DeviceManagementPartnerRequest extends BaseRequest {
	
    /**
     * The request for the DeviceManagementPartner
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementPartnerRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementPartner.class);
    }

    /**
     * Gets the DeviceManagementPartner from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super DeviceManagementPartner> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementPartner from the service
     *
     * @return the DeviceManagementPartner from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementPartner get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super DeviceManagementPartner> callback) {
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
     * Patches this DeviceManagementPartner with a source
     *
     * @param sourceDeviceManagementPartner the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final DeviceManagementPartner sourceDeviceManagementPartner, @Nonnull final ICallback<? super DeviceManagementPartner> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementPartner);
    }

    /**
     * Patches this DeviceManagementPartner with a source
     *
     * @param sourceDeviceManagementPartner the source object with updates
     * @return the updated DeviceManagementPartner
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementPartner patch(@Nonnull final DeviceManagementPartner sourceDeviceManagementPartner) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementPartner);
    }

    /**
     * Creates a DeviceManagementPartner with a new object
     *
     * @param newDeviceManagementPartner the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final DeviceManagementPartner newDeviceManagementPartner, @Nonnull final ICallback<? super DeviceManagementPartner> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementPartner);
    }

    /**
     * Creates a DeviceManagementPartner with a new object
     *
     * @param newDeviceManagementPartner the new object to create
     * @return the created DeviceManagementPartner
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementPartner post(@Nonnull final DeviceManagementPartner newDeviceManagementPartner) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementPartner);
    }

    /**
     * Creates a DeviceManagementPartner with a new object
     *
     * @param newDeviceManagementPartner the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final DeviceManagementPartner newDeviceManagementPartner, @Nonnull final ICallback<? super DeviceManagementPartner> callback) {
        send(HttpMethod.PUT, callback, newDeviceManagementPartner);
    }

    /**
     * Creates a DeviceManagementPartner with a new object
     *
     * @param newDeviceManagementPartner the object to create/update
     * @return the created DeviceManagementPartner
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementPartner put(@Nonnull final DeviceManagementPartner newDeviceManagementPartner) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementPartner);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceManagementPartnerRequest select(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceManagementPartnerRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public DeviceManagementPartnerRequest expand(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceManagementPartnerRequest)this;
     }

}

