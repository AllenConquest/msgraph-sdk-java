// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.WorkbookTable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Item At Parameter Set.
 */
public class WorkbookTableItemAtParameterSet {
    /**
     * The index.
     * 
     */
    @SerializedName(value = "index", alternate = {"Index"})
    @Expose
	@Nullable
    public Integer index;


    /**
     * Instiaciates a new WorkbookTableItemAtParameterSet
     */
    public WorkbookTableItemAtParameterSet() {}
    /**
     * Instiaciates a new WorkbookTableItemAtParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookTableItemAtParameterSet(@Nonnull final WorkbookTableItemAtParameterSetBuilder builder) {
        this.index = builder.index;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookTableItemAtParameterSetBuilder newBuilder() {
        return new WorkbookTableItemAtParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookTableItemAtParameterSet
     */
    public static final class WorkbookTableItemAtParameterSetBuilder {
        /**
         * The index parameter value
         */
        @Nullable
        protected Integer index;
        /**
         * Sets the Index
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookTableItemAtParameterSetBuilder withIndex(@Nullable final Integer val) {
            this.index = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookTableItemAtParameterSetBuilder
         */
        @Nullable
        protected WorkbookTableItemAtParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookTableItemAtParameterSet build() {
            return new WorkbookTableItemAtParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.index != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("index", index));
        }
        return result;
    }
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