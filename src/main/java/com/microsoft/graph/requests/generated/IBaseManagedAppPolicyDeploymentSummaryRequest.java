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
 * The interface for the Base Managed App Policy Deployment Summary Request.
 */
public interface IBaseManagedAppPolicyDeploymentSummaryRequest extends IHttpRequest {

    /**
     * Gets the ManagedAppPolicyDeploymentSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ManagedAppPolicyDeploymentSummary> callback);

    /**
     * Gets the ManagedAppPolicyDeploymentSummary from the service
     *
     * @return the ManagedAppPolicyDeploymentSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedAppPolicyDeploymentSummary get() throws ClientException;

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
     * Patches this ManagedAppPolicyDeploymentSummary with a source
     *
     * @param sourceManagedAppPolicyDeploymentSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ManagedAppPolicyDeploymentSummary sourceManagedAppPolicyDeploymentSummary, final ICallback<ManagedAppPolicyDeploymentSummary> callback);

    /**
     * Patches this ManagedAppPolicyDeploymentSummary with a source
     *
     * @param sourceManagedAppPolicyDeploymentSummary the source object with updates
     * @return the updated ManagedAppPolicyDeploymentSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedAppPolicyDeploymentSummary patch(final ManagedAppPolicyDeploymentSummary sourceManagedAppPolicyDeploymentSummary) throws ClientException;

    /**
     * Posts a ManagedAppPolicyDeploymentSummary with a new object
     *
     * @param newManagedAppPolicyDeploymentSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ManagedAppPolicyDeploymentSummary newManagedAppPolicyDeploymentSummary, final ICallback<ManagedAppPolicyDeploymentSummary> callback);

    /**
     * Posts a ManagedAppPolicyDeploymentSummary with a new object
     *
     * @param newManagedAppPolicyDeploymentSummary the new object to create
     * @return the created ManagedAppPolicyDeploymentSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedAppPolicyDeploymentSummary post(final ManagedAppPolicyDeploymentSummary newManagedAppPolicyDeploymentSummary) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseManagedAppPolicyDeploymentSummaryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseManagedAppPolicyDeploymentSummaryRequest expand(final String value);

}

