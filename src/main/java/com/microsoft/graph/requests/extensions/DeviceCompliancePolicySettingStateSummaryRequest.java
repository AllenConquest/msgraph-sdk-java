// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicySettingStateSummary;
import com.microsoft.graph.requests.extensions.DeviceComplianceSettingStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceSettingStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy Setting State Summary Request.
 */
public class DeviceCompliancePolicySettingStateSummaryRequest extends BaseRequest {
	
    /**
     * The request for the DeviceCompliancePolicySettingStateSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCompliancePolicySettingStateSummaryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceCompliancePolicySettingStateSummary.class);
    }

    /**
     * Gets the DeviceCompliancePolicySettingStateSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super DeviceCompliancePolicySettingStateSummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceCompliancePolicySettingStateSummary from the service
     *
     * @return the DeviceCompliancePolicySettingStateSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceCompliancePolicySettingStateSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super DeviceCompliancePolicySettingStateSummary> callback) {
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
     * Patches this DeviceCompliancePolicySettingStateSummary with a source
     *
     * @param sourceDeviceCompliancePolicySettingStateSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final DeviceCompliancePolicySettingStateSummary sourceDeviceCompliancePolicySettingStateSummary, @Nonnull final ICallback<? super DeviceCompliancePolicySettingStateSummary> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceCompliancePolicySettingStateSummary);
    }

    /**
     * Patches this DeviceCompliancePolicySettingStateSummary with a source
     *
     * @param sourceDeviceCompliancePolicySettingStateSummary the source object with updates
     * @return the updated DeviceCompliancePolicySettingStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceCompliancePolicySettingStateSummary patch(@Nonnull final DeviceCompliancePolicySettingStateSummary sourceDeviceCompliancePolicySettingStateSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceCompliancePolicySettingStateSummary);
    }

    /**
     * Creates a DeviceCompliancePolicySettingStateSummary with a new object
     *
     * @param newDeviceCompliancePolicySettingStateSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final DeviceCompliancePolicySettingStateSummary newDeviceCompliancePolicySettingStateSummary, @Nonnull final ICallback<? super DeviceCompliancePolicySettingStateSummary> callback) {
        send(HttpMethod.POST, callback, newDeviceCompliancePolicySettingStateSummary);
    }

    /**
     * Creates a DeviceCompliancePolicySettingStateSummary with a new object
     *
     * @param newDeviceCompliancePolicySettingStateSummary the new object to create
     * @return the created DeviceCompliancePolicySettingStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceCompliancePolicySettingStateSummary post(@Nonnull final DeviceCompliancePolicySettingStateSummary newDeviceCompliancePolicySettingStateSummary) throws ClientException {
        return send(HttpMethod.POST, newDeviceCompliancePolicySettingStateSummary);
    }

    /**
     * Creates a DeviceCompliancePolicySettingStateSummary with a new object
     *
     * @param newDeviceCompliancePolicySettingStateSummary the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final DeviceCompliancePolicySettingStateSummary newDeviceCompliancePolicySettingStateSummary, @Nonnull final ICallback<? super DeviceCompliancePolicySettingStateSummary> callback) {
        send(HttpMethod.PUT, callback, newDeviceCompliancePolicySettingStateSummary);
    }

    /**
     * Creates a DeviceCompliancePolicySettingStateSummary with a new object
     *
     * @param newDeviceCompliancePolicySettingStateSummary the object to create/update
     * @return the created DeviceCompliancePolicySettingStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceCompliancePolicySettingStateSummary put(@Nonnull final DeviceCompliancePolicySettingStateSummary newDeviceCompliancePolicySettingStateSummary) throws ClientException {
        return send(HttpMethod.PUT, newDeviceCompliancePolicySettingStateSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceCompliancePolicySettingStateSummaryRequest select(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceCompliancePolicySettingStateSummaryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public DeviceCompliancePolicySettingStateSummaryRequest expand(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceCompliancePolicySettingStateSummaryRequest)this;
     }

}

