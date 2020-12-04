// Template Source: Templates\Java\requests_extensions\BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceCategory;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Category Request.
 */
public class DeviceCategoryRequest extends BaseRequest<DeviceCategory> {
	
    /**
     * The request for the DeviceCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCategoryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceCategory.class);
    }

    /**
     * Gets the DeviceCategory from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super DeviceCategory> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceCategory from the service
     *
     * @return the DeviceCategory from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceCategory get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super DeviceCategory> callback) {
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
     * Patches this DeviceCategory with a source
     *
     * @param sourceDeviceCategory the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final DeviceCategory sourceDeviceCategory, @Nonnull final ICallback<? super DeviceCategory> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceCategory);
    }

    /**
     * Patches this DeviceCategory with a source
     *
     * @param sourceDeviceCategory the source object with updates
     * @return the updated DeviceCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceCategory patch(@Nonnull final DeviceCategory sourceDeviceCategory) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceCategory);
    }

    /**
     * Creates a DeviceCategory with a new object
     *
     * @param newDeviceCategory the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final DeviceCategory newDeviceCategory, @Nonnull final ICallback<? super DeviceCategory> callback) {
        send(HttpMethod.POST, callback, newDeviceCategory);
    }

    /**
     * Creates a DeviceCategory with a new object
     *
     * @param newDeviceCategory the new object to create
     * @return the created DeviceCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceCategory post(@Nonnull final DeviceCategory newDeviceCategory) throws ClientException {
        return send(HttpMethod.POST, newDeviceCategory);
    }

    /**
     * Creates a DeviceCategory with a new object
     *
     * @param newDeviceCategory the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final DeviceCategory newDeviceCategory, @Nonnull final ICallback<? super DeviceCategory> callback) {
        send(HttpMethod.PUT, callback, newDeviceCategory);
    }

    /**
     * Creates a DeviceCategory with a new object
     *
     * @param newDeviceCategory the object to create/update
     * @return the created DeviceCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceCategory put(@Nonnull final DeviceCategory newDeviceCategory) throws ClientException {
        return send(HttpMethod.PUT, newDeviceCategory);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceCategoryRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public DeviceCategoryRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

