// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.callrecords.models.generated.ClientPlatform;
import com.microsoft.graph.callrecords.models.generated.ProductFamily;
import com.microsoft.graph.callrecords.models.extensions.UserAgent;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Client User Agent.
 */
public class ClientUserAgent extends UserAgent implements IJsonBackedObject {


    /**
     * The Platform.
     * Identifies the platform used by this endpoint. Possible values are: unknown, windows, macOS, iOS, android, web, ipPhone, roomSystem, surfaceHub, holoLens, unknownFutureValue.
     */
    @SerializedName(value = "platform", alternate = {"Platform"})
    @Expose
	@Nullable
    public ClientPlatform platform;

    /**
     * The Product Family.
     * Identifies the family of application software used by this endpoint. Possible values are: unknown, teams, skypeForBusiness, lync, unknownFutureValue.
     */
    @SerializedName(value = "productFamily", alternate = {"ProductFamily"})
    @Expose
	@Nullable
    public ProductFamily productFamily;


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
