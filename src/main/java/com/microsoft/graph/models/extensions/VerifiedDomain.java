// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Verified Domain.
 */
public class VerifiedDomain implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Capabilities.
     * For example, 'Email', 'OfficeCommunicationsOnline'.
     */
    @SerializedName(value = "capabilities", alternate = {"Capabilities"})
    @Expose
	@Nullable
    public String capabilities;

    /**
     * The Is Default.
     * true if this is the default domain associated with the tenant; otherwise, false.
     */
    @SerializedName(value = "isDefault", alternate = {"IsDefault"})
    @Expose
	@Nullable
    public Boolean isDefault;

    /**
     * The Is Initial.
     * true if this is the initial domain associated with the tenant; otherwise, false
     */
    @SerializedName(value = "isInitial", alternate = {"IsInitial"})
    @Expose
	@Nullable
    public Boolean isInitial;

    /**
     * The Name.
     * The domain name; for example, 'contoso.onmicrosoft.com'
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Type.
     * For example, 'Managed'.
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public String type;


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

    }
}
