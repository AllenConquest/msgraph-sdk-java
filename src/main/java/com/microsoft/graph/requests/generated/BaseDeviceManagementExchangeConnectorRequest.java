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
 * The class for the Base Device Management Exchange Connector Request.
 */
public class BaseDeviceManagementExchangeConnectorRequest extends BaseRequest implements IBaseDeviceManagementExchangeConnectorRequest {

    /**
     * The request for the DeviceManagementExchangeConnector
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseDeviceManagementExchangeConnectorRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<DeviceManagementExchangeConnector> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the DeviceManagementExchangeConnector from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceManagementExchangeConnector> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementExchangeConnector from the service
     *
     * @return the DeviceManagementExchangeConnector from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementExchangeConnector get() throws ClientException {
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
     * Patches this DeviceManagementExchangeConnector with a source
     *
     * @param sourceDeviceManagementExchangeConnector the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceManagementExchangeConnector sourceDeviceManagementExchangeConnector, final ICallback<DeviceManagementExchangeConnector> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementExchangeConnector);
    }

    /**
     * Patches this DeviceManagementExchangeConnector with a source
     *
     * @param sourceDeviceManagementExchangeConnector the source object with updates
     * @return the updated DeviceManagementExchangeConnector
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementExchangeConnector patch(final DeviceManagementExchangeConnector sourceDeviceManagementExchangeConnector) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementExchangeConnector);
    }

    /**
     * Creates a DeviceManagementExchangeConnector with a new object
     *
     * @param newDeviceManagementExchangeConnector the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagementExchangeConnector newDeviceManagementExchangeConnector, final ICallback<DeviceManagementExchangeConnector> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementExchangeConnector);
    }

    /**
     * Creates a DeviceManagementExchangeConnector with a new object
     *
     * @param newDeviceManagementExchangeConnector the new object to create
     * @return the created DeviceManagementExchangeConnector
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementExchangeConnector post(final DeviceManagementExchangeConnector newDeviceManagementExchangeConnector) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementExchangeConnector);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementExchangeConnectorRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DeviceManagementExchangeConnectorRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementExchangeConnectorRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DeviceManagementExchangeConnectorRequest)this;
     }

}

