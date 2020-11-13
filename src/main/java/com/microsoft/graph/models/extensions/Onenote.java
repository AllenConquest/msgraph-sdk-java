// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Notebook;
import com.microsoft.graph.models.extensions.OnenoteOperation;
import com.microsoft.graph.models.extensions.OnenotePage;
import com.microsoft.graph.models.extensions.OnenoteResource;
import com.microsoft.graph.models.extensions.SectionGroup;
import com.microsoft.graph.models.extensions.OnenoteSection;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.NotebookCollectionPage;
import com.microsoft.graph.requests.extensions.OnenoteOperationCollectionPage;
import com.microsoft.graph.requests.extensions.OnenotePageCollectionPage;
import com.microsoft.graph.requests.extensions.OnenoteResourceCollectionPage;
import com.microsoft.graph.requests.extensions.SectionGroupCollectionPage;
import com.microsoft.graph.requests.extensions.OnenoteSectionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote.
 */
public class Onenote extends Entity implements IJsonBackedObject {


    /**
     * The Notebooks.
     * The collection of OneNote notebooks that are owned by the user or group. Read-only. Nullable.
     */
    @SerializedName(value = "notebooks", alternate = {"Notebooks"})
    @Expose
	@Nullable
    public NotebookCollectionPage notebooks;

    /**
     * The Operations.
     * The status of OneNote operations. Getting an operations collection is not supported, but you can get the status of long-running operations if the Operation-Location header is returned in the response. Read-only. Nullable.
     */
    @SerializedName(value = "operations", alternate = {"Operations"})
    @Expose
	@Nullable
    public OnenoteOperationCollectionPage operations;

    /**
     * The Pages.
     * The pages in all OneNote notebooks that are owned by the user or group.  Read-only. Nullable.
     */
    @SerializedName(value = "pages", alternate = {"Pages"})
    @Expose
	@Nullable
    public OnenotePageCollectionPage pages;

    /**
     * The Resources.
     * The image and other file resources in OneNote pages. Getting a resources collection is not supported, but you can get the binary content of a specific resource. Read-only. Nullable.
     */
    @SerializedName(value = "resources", alternate = {"Resources"})
    @Expose
	@Nullable
    public OnenoteResourceCollectionPage resources;

    /**
     * The Section Groups.
     * The section groups in all OneNote notebooks that are owned by the user or group.  Read-only. Nullable.
     */
    @SerializedName(value = "sectionGroups", alternate = {"SectionGroups"})
    @Expose
	@Nullable
    public SectionGroupCollectionPage sectionGroups;

    /**
     * The Sections.
     * The sections in all OneNote notebooks that are owned by the user or group.  Read-only. Nullable.
     */
    @SerializedName(value = "sections", alternate = {"Sections"})
    @Expose
	@Nullable
    public OnenoteSectionCollectionPage sections;


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


        if (json.has("notebooks")) {
            notebooks = serializer.deserializeObject(json.get("notebooks").toString(), NotebookCollectionPage.class);
        }

        if (json.has("operations")) {
            operations = serializer.deserializeObject(json.get("operations").toString(), OnenoteOperationCollectionPage.class);
        }

        if (json.has("pages")) {
            pages = serializer.deserializeObject(json.get("pages").toString(), OnenotePageCollectionPage.class);
        }

        if (json.has("resources")) {
            resources = serializer.deserializeObject(json.get("resources").toString(), OnenoteResourceCollectionPage.class);
        }

        if (json.has("sectionGroups")) {
            sectionGroups = serializer.deserializeObject(json.get("sectionGroups").toString(), SectionGroupCollectionPage.class);
        }

        if (json.has("sections")) {
            sections = serializer.deserializeObject(json.get("sections").toString(), OnenoteSectionCollectionPage.class);
        }
    }
}
