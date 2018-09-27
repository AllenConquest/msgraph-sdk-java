// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.ManagedEBook;
import com.microsoft.graph.requests.extensions.IManagedEBookCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Managed EBook Collection Page.
 */
public class BaseManagedEBookCollectionPage extends BaseCollectionPage<ManagedEBook, IManagedEBookCollectionRequestBuilder> implements IBaseManagedEBookCollectionPage {

    /**
     * A collection page for ManagedEBook
     *
     * @param response the serialized BaseManagedEBookCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseManagedEBookCollectionPage(final BaseManagedEBookCollectionResponse response, final IManagedEBookCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}