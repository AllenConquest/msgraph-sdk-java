// Template Source: Templates\Java\models_extensions\BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AndroidMinimumOperatingSystem;
import com.microsoft.graph.models.extensions.ManagedMobileLobApp;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Android Lob App.
 */
public class ManagedAndroidLobApp extends ManagedMobileLobApp implements IJsonBackedObject {


    /**
     * The Minimum Supported Operating System.
     * The value for the minimum applicable operating system.
     */
    @SerializedName(value = "minimumSupportedOperatingSystem", alternate = {"MinimumSupportedOperatingSystem"})
    @Expose
	@Nullable
    public AndroidMinimumOperatingSystem minimumSupportedOperatingSystem;

    /**
     * The Package Id.
     * The package identifier.
     */
    @SerializedName(value = "packageId", alternate = {"PackageId"})
    @Expose
	@Nullable
    public String packageId;

    /**
     * The Version Code.
     * The version code of managed Android Line of Business (LoB) app.
     */
    @SerializedName(value = "versionCode", alternate = {"VersionCode"})
    @Expose
	@Nullable
    public String versionCode;

    /**
     * The Version Name.
     * The version name of managed Android Line of Business (LoB) app.
     */
    @SerializedName(value = "versionName", alternate = {"VersionName"})
    @Expose
	@Nullable
    public String versionName;


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
	@Override
    @Nullable
    public ISerializer getSerializer() {
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

    }
}
