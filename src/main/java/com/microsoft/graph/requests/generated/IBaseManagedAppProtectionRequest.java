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
 * The interface for the Base Managed App Protection Request.
 */
public interface IBaseManagedAppProtectionRequest extends IHttpRequest {

    /**
     * Gets the ManagedAppProtection from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ManagedAppProtection> callback);

    /**
     * Gets the ManagedAppProtection from the service
     *
     * @return the ManagedAppProtection from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedAppProtection get() throws ClientException;

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
     * Patches this ManagedAppProtection with a source
     *
     * @param sourceManagedAppProtection the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ManagedAppProtection sourceManagedAppProtection, final ICallback<ManagedAppProtection> callback);

    /**
     * Patches this ManagedAppProtection with a source
     *
     * @param sourceManagedAppProtection the source object with updates
     * @return the updated ManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedAppProtection patch(final ManagedAppProtection sourceManagedAppProtection) throws ClientException;

    /**
     * Posts a ManagedAppProtection with a new object
     *
     * @param newManagedAppProtection the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ManagedAppProtection newManagedAppProtection, final ICallback<ManagedAppProtection> callback);

    /**
     * Posts a ManagedAppProtection with a new object
     *
     * @param newManagedAppProtection the new object to create
     * @return the created ManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedAppProtection post(final ManagedAppProtection newManagedAppProtection) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseManagedAppProtectionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseManagedAppProtectionRequest expand(final String value);

}

