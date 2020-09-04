// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.models.extensions.UpdateWindowsDeviceAccountActionParameter;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCategoryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed Device With Reference Request.
 */
public interface IManagedDeviceWithReferenceRequest extends IHttpRequest {

    void post(final ManagedDevice newManagedDevice, final IJsonBackedObject payload, final ICallback<ManagedDevice> callback);

    ManagedDevice post(final ManagedDevice newManagedDevice, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<ManagedDevice> callback);

    ManagedDevice get() throws ClientException;

	void delete(final ICallback<ManagedDevice> callback);

	void delete() throws ClientException;

	void patch(final ManagedDevice sourceManagedDevice, final ICallback<ManagedDevice> callback);

	ManagedDevice patch(final ManagedDevice sourceManagedDevice) throws ClientException;

    IManagedDeviceWithReferenceRequest select(final String value);

    IManagedDeviceWithReferenceRequest expand(final String value);

}
