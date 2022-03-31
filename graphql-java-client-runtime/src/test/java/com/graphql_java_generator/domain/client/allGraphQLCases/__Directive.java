/** Generated by the default template from graphql-java-generator */
package com.graphql_java_generator.domain.client.allGraphQLCases;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;
import com.graphql_java_generator.client.GraphQLObjectMapper;
import com.graphql_java_generator.exception.GraphQLRequestExecutionException;

/**
 *
 * @author generated by graphql-java-generator
 * @see <a href=
 *      "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("__Directive")
public class __Directive {

	/**
	 * This map contains the deserialiazed values for the alias, as parsed from the json response from the GraphQL
	 * server. The key is the alias name, the value is the deserialiazed value (taking into account custom scalars,
	 * lists, ...)
	 */
	@com.graphql_java_generator.annotation.GraphQLIgnore
	Map<String, Object> aliasValues = new HashMap<>();

	public __Directive() {
		// No action
	}

	@JsonProperty("name")
	@GraphQLScalar(fieldName = "name", graphQLTypeSimpleName = "String", javaClass = String.class)
	String name;

	@JsonProperty("description")
	@GraphQLScalar(fieldName = "description", graphQLTypeSimpleName = "String", javaClass = String.class)
	String description;

	@JsonProperty("locations")
	@JsonDeserialize(using = CustomJacksonDeserializers.List__DirectiveLocation.class)
	@GraphQLScalar(fieldName = "locations", graphQLTypeSimpleName = "__DirectiveLocation", javaClass = __DirectiveLocation.class)
	List<__DirectiveLocation> locations;

	@JsonProperty("args")
	@JsonDeserialize(using = CustomJacksonDeserializers.List__InputValue.class)
	@GraphQLNonScalar(fieldName = "args", graphQLTypeSimpleName = "__InputValue", javaClass = __InputValue.class)
	List<__InputValue> args;

	@JsonProperty("isRepeatable")
	@GraphQLScalar(fieldName = "isRepeatable", graphQLTypeSimpleName = "Boolean", javaClass = Boolean.class)
	Boolean isRepeatable;

	@JsonProperty("__typename")
	@GraphQLScalar(fieldName = "__typename", graphQLTypeSimpleName = "String", javaClass = String.class)
	String __typename;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setLocations(List<__DirectiveLocation> locations) {
		this.locations = locations;
	}

	public List<__DirectiveLocation> getLocations() {
		return locations;
	}

	public void setArgs(List<__InputValue> args) {
		this.args = args;
	}

	public List<__InputValue> getArgs() {
		return args;
	}

	public void setIsRepeatable(Boolean isRepeatable) {
		this.isRepeatable = isRepeatable;
	}

	public Boolean getIsRepeatable() {
		return isRepeatable;
	}

	public void set__typename(String __typename) {
		this.__typename = __typename;
	}

	public String get__typename() {
		return __typename;
	}

	/**
	 * This method is called during the json deserialization process, by the {@link GraphQLObjectMapper}, each time an
	 * alias value is read from the json.
	 * 
	 * @param aliasName
	 * @param aliasDeserializedValue
	 */
	public void setAliasValue(String aliasName, Object aliasDeserializedValue) {
		aliasValues.put(aliasName, aliasDeserializedValue);
	}

	/**
	 * Retrieves the value for the given alias, as it has been received for this object in the GraphQL response. <BR/>
	 * This method <B>should not be used for Custom Scalars</B>, as the parser doesn't know if this alias is a custom
	 * scalar, and which custom scalar to use at deserialization time. In most case, a value will then be provided by
	 * this method with a basis json deserialization, but this value won't be the proper custom scalar value.
	 * 
	 * @param alias
	 * @return
	 * @throws GraphQLRequestExecutionException
	 *             If the value can not be parsed
	 */
	public Object getAliasValue(String alias) throws GraphQLRequestExecutionException {
		Object value = aliasValues.get(alias);
		if (value instanceof GraphQLRequestExecutionException)
			throw (GraphQLRequestExecutionException) value;
		else
			return value;
	}

	@Override
	public String toString() {
		return "__Directive {" + "name: " + name + ", " + "description: " + description + ", " + "locations: "
				+ locations + ", " + "args: " + args + ", " + "isRepeatable: " + isRepeatable + ", " + "__typename: "
				+ __typename + "}";
	}

	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder
	 */
	public static class Builder {
		private String name;
		private String description;
		private List<__DirectiveLocation> locations;
		private List<__InputValue> args;
		private Boolean isRepeatable;

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withDescription(String description) {
			this.description = description;
			return this;
		}

		public Builder withLocations(List<__DirectiveLocation> locations) {
			this.locations = locations;
			return this;
		}

		public Builder withArgs(List<__InputValue> args) {
			this.args = args;
			return this;
		}

		public Builder withIsRepeatable(Boolean isRepeatable) {
			this.isRepeatable = isRepeatable;
			return this;
		}

		public __Directive build() {
			__Directive _object = new __Directive();
			_object.setName(name);
			_object.setDescription(description);
			_object.setLocations(locations);
			_object.setArgs(args);
			_object.setIsRepeatable(isRepeatable);
			_object.set__typename("__Directive");
			return _object;
		}
	}
}
