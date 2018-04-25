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
 * The class for the Base Device App Management Request.
 */
public class BaseDeviceAppManagementRequest extends BaseRequest implements IBaseDeviceAppManagementRequest {

    /**
     * The request for the DeviceAppManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseDeviceAppManagementRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<DeviceAppManagement> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the DeviceAppManagement from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceAppManagement> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceAppManagement from the service
     *
     * @return the DeviceAppManagement from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceAppManagement get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this DeviceAppManagement with a source
     *
     * @param sourceDeviceAppManagement the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceAppManagement sourceDeviceAppManagement, final ICallback<DeviceAppManagement> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceAppManagement);
    }

    /**
     * Patches this DeviceAppManagement with a source
     *
     * @param sourceDeviceAppManagement the source object with updates
     * @return the updated DeviceAppManagement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceAppManagement patch(final DeviceAppManagement sourceDeviceAppManagement) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceAppManagement);
    }

    /**
     * Creates a DeviceAppManagement with a new object
     *
     * @param newDeviceAppManagement the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceAppManagement newDeviceAppManagement, final ICallback<DeviceAppManagement> callback) {
        send(HttpMethod.POST, callback, newDeviceAppManagement);
    }

    /**
     * Creates a DeviceAppManagement with a new object
     *
     * @param newDeviceAppManagement the new object to create
     * @return the created DeviceAppManagement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceAppManagement post(final DeviceAppManagement newDeviceAppManagement) throws ClientException {
        return send(HttpMethod.POST, newDeviceAppManagement);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceAppManagementRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DeviceAppManagementRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceAppManagementRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DeviceAppManagementRequest)this;
     }

}

