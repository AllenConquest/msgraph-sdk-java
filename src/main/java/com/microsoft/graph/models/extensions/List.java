// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ListInfo;
import com.microsoft.graph.models.extensions.SharepointIds;
import com.microsoft.graph.models.extensions.SystemFacet;
import com.microsoft.graph.models.extensions.ColumnDefinition;
import com.microsoft.graph.models.extensions.ContentType;
import com.microsoft.graph.models.extensions.Drive;
import com.microsoft.graph.models.extensions.ListItem;
import com.microsoft.graph.models.extensions.Subscription;
import com.microsoft.graph.models.extensions.BaseItem;
import com.microsoft.graph.requests.extensions.ColumnDefinitionCollectionResponse;
import com.microsoft.graph.requests.extensions.ColumnDefinitionCollectionPage;
import com.microsoft.graph.requests.extensions.ContentTypeCollectionResponse;
import com.microsoft.graph.requests.extensions.ContentTypeCollectionPage;
import com.microsoft.graph.requests.extensions.ListItemCollectionResponse;
import com.microsoft.graph.requests.extensions.ListItemCollectionPage;
import com.microsoft.graph.requests.extensions.SubscriptionCollectionResponse;
import com.microsoft.graph.requests.extensions.SubscriptionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the List.
 */
public class List extends BaseItem implements IJsonBackedObject {


    /**
     * The Display Name.
     * The displayable title of the list.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The List.
     * Provides additional details about the list.
     */
    @SerializedName("list")
    @Expose
    public ListInfo list;

    /**
     * The Sharepoint Ids.
     * Returns identifiers useful for SharePoint REST compatibility. Read-only.
     */
    @SerializedName("sharepointIds")
    @Expose
    public SharepointIds sharepointIds;

    /**
     * The System.
     * If present, indicates that this is a system-managed list. Read-only.
     */
    @SerializedName("system")
    @Expose
    public SystemFacet system;

    /**
     * The Columns.
     * The collection of field definitions for this list.
     */
    public ColumnDefinitionCollectionPage columns;

    /**
     * The Content Types.
     * The collection of content types present in this list.
     */
    public ContentTypeCollectionPage contentTypes;

    /**
     * The Drive.
     * Only present on document libraries. Allows access to the list as a [drive][] resource with [driveItems][driveItem].
     */
    @SerializedName("drive")
    @Expose
    public Drive drive;

    /**
     * The Items.
     * All items contained in the list.
     */
    public ListItemCollectionPage items;

    /**
     * The Subscriptions.
     * The set of subscriptions on the list.
     */
    public SubscriptionCollectionPage subscriptions;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("columns")) {
            final ColumnDefinitionCollectionResponse response = new ColumnDefinitionCollectionResponse();
            if (json.has("columns@odata.nextLink")) {
                response.nextLink = json.get("columns@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("columns").toString(), JsonObject[].class);
            final ColumnDefinition[] array = new ColumnDefinition[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ColumnDefinition.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            columns = new ColumnDefinitionCollectionPage(response, null);
        }

        if (json.has("contentTypes")) {
            final ContentTypeCollectionResponse response = new ContentTypeCollectionResponse();
            if (json.has("contentTypes@odata.nextLink")) {
                response.nextLink = json.get("contentTypes@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("contentTypes").toString(), JsonObject[].class);
            final ContentType[] array = new ContentType[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ContentType.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            contentTypes = new ContentTypeCollectionPage(response, null);
        }

        if (json.has("items")) {
            final ListItemCollectionResponse response = new ListItemCollectionResponse();
            if (json.has("items@odata.nextLink")) {
                response.nextLink = json.get("items@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("items").toString(), JsonObject[].class);
            final ListItem[] array = new ListItem[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ListItem.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            items = new ListItemCollectionPage(response, null);
        }

        if (json.has("subscriptions")) {
            final SubscriptionCollectionResponse response = new SubscriptionCollectionResponse();
            if (json.has("subscriptions@odata.nextLink")) {
                response.nextLink = json.get("subscriptions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("subscriptions").toString(), JsonObject[].class);
            final Subscription[] array = new Subscription[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Subscription.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            subscriptions = new SubscriptionCollectionPage(response, null);
        }
    }
}
