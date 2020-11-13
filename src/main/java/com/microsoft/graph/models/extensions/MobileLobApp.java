// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.MobileAppContent;
import com.microsoft.graph.models.extensions.MobileApp;
import com.microsoft.graph.requests.extensions.MobileAppContentCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile Lob App.
 */
public class MobileLobApp extends MobileApp implements IJsonBackedObject {


    /**
     * The Committed Content Version.
     * The internal committed content version.
     */
    @SerializedName(value = "committedContentVersion", alternate = {"CommittedContentVersion"})
    @Expose
	@Nullable
    public String committedContentVersion;

    /**
     * The File Name.
     * The name of the main Lob application file.
     */
    @SerializedName(value = "fileName", alternate = {"FileName"})
    @Expose
	@Nullable
    public String fileName;

    /**
     * The Size.
     * The total size, including all uploaded files.
     */
    @SerializedName(value = "size", alternate = {"Size"})
    @Expose
	@Nullable
    public Long size;

    /**
     * The Content Versions.
     * The list of content versions for this app.
     */
    @SerializedName(value = "contentVersions", alternate = {"ContentVersions"})
    @Expose
	@Nullable
    public MobileAppContentCollectionPage contentVersions;


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
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    @Nullable
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("contentVersions")) {
            contentVersions = serializer.deserializeObject(json.get("contentVersions").toString(), MobileAppContentCollectionPage.class);
        }
    }
}
