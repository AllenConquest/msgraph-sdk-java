// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ItemActivity;
import com.microsoft.graph.requests.extensions.ItemActivityCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.ItemActivityCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Activity Collection Page.
 */
public class ItemActivityCollectionPage extends BaseCollectionPage<ItemActivity, ItemActivityCollectionRequestBuilder> {

    /**
     * A collection page for ItemActivity
     *
     * @param response the serialized ItemActivityCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ItemActivityCollectionPage(@Nonnull final ItemActivityCollectionResponse response, @Nonnull final ItemActivityCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ItemActivity
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ItemActivityCollectionPage(@Nonnull final java.util.List<ItemActivity> pageContents, @Nullable final ItemActivityCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
