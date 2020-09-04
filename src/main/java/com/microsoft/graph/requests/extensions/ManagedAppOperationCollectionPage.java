// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedAppOperation;
import com.microsoft.graph.requests.extensions.IManagedAppOperationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedAppOperationCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedAppOperationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Operation Collection Page.
 */
public class ManagedAppOperationCollectionPage extends BaseCollectionPage<ManagedAppOperation, IManagedAppOperationCollectionRequestBuilder> implements IManagedAppOperationCollectionPage {

    /**
     * A collection page for ManagedAppOperation
     *
     * @param response the serialized ManagedAppOperationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ManagedAppOperationCollectionPage(final ManagedAppOperationCollectionResponse response, final IManagedAppOperationCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
