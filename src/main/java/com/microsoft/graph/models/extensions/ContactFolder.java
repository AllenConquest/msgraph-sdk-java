// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.ContactFolder;
import com.microsoft.graph.models.extensions.Contact;
import com.microsoft.graph.models.extensions.MultiValueLegacyExtendedProperty;
import com.microsoft.graph.models.extensions.SingleValueLegacyExtendedProperty;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ContactFolderCollectionPage;
import com.microsoft.graph.requests.extensions.ContactCollectionPage;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Contact Folder.
 */
public class ContactFolder extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * The folder's display name.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Parent Folder Id.
     * The ID of the folder's parent folder.
     */
    @SerializedName(value = "parentFolderId", alternate = {"ParentFolderId"})
    @Expose
    public String parentFolderId;

    /**
     * The Child Folders.
     * The collection of child folders in the folder. Navigation property. Read-only. Nullable.
     */
    @SerializedName(value = "childFolders", alternate = {"ChildFolders"})
    @Expose
    public ContactFolderCollectionPage childFolders;

    /**
     * The Contacts.
     * The contacts in the folder. Navigation property. Read-only. Nullable.
     */
    @SerializedName(value = "contacts", alternate = {"Contacts"})
    @Expose
    public ContactCollectionPage contacts;

    /**
     * The Multi Value Extended Properties.
     * The collection of multi-value extended properties defined for the contactFolder. Read-only. Nullable.
     */
    @SerializedName(value = "multiValueExtendedProperties", alternate = {"MultiValueExtendedProperties"})
    @Expose
    public MultiValueLegacyExtendedPropertyCollectionPage multiValueExtendedProperties;

    /**
     * The Single Value Extended Properties.
     * The collection of single-value extended properties defined for the contactFolder. Read-only. Nullable.
     */
    @SerializedName(value = "singleValueExtendedProperties", alternate = {"SingleValueExtendedProperties"})
    @Expose
    public SingleValueLegacyExtendedPropertyCollectionPage singleValueExtendedProperties;


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
	@Override
    public ISerializer getSerializer() {
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


        if (json.has("childFolders")) {
            childFolders = serializer.deserializeObject(json.get("childFolders").toString(), ContactFolderCollectionPage.class);
        }

        if (json.has("contacts")) {
            contacts = serializer.deserializeObject(json.get("contacts").toString(), ContactCollectionPage.class);
        }

        if (json.has("multiValueExtendedProperties")) {
            multiValueExtendedProperties = serializer.deserializeObject(json.get("multiValueExtendedProperties").toString(), MultiValueLegacyExtendedPropertyCollectionPage.class);
        }

        if (json.has("singleValueExtendedProperties")) {
            singleValueExtendedProperties = serializer.deserializeObject(json.get("singleValueExtendedProperties").toString(), SingleValueLegacyExtendedPropertyCollectionPage.class);
        }
    }
}
