/** Generated by the default template from graphql-java-generator */
package com.graphql_java_generator.domain.client.forum;

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
@GraphQLObjectType("__Schema")
public class __Schema {

	/**
	 * This map contains the deserialiazed values for the alias, as parsed from the json response from the GraphQL
	 * server. The key is the alias name, the value is the deserialiazed value (taking into account custom scalars,
	 * lists, ...)
	 */
	@com.graphql_java_generator.annotation.GraphQLIgnore
	Map<String, Object> aliasValues = new HashMap<>();

	public __Schema() {
		// No action
	}

	@JsonProperty("description")
	@GraphQLScalar(fieldName = "description", graphQLTypeSimpleName = "String", javaClass = String.class)
	String description;

	@JsonProperty("types")
	@JsonDeserialize(using = CustomJacksonDeserializers.List__Type.class)
	@GraphQLNonScalar(fieldName = "types", graphQLTypeSimpleName = "__Type", javaClass = __Type.class)
	List<__Type> types;

	@JsonProperty("queryType")
	@GraphQLNonScalar(fieldName = "queryType", graphQLTypeSimpleName = "__Type", javaClass = __Type.class)
	__Type queryType;

	@JsonProperty("mutationType")
	@GraphQLNonScalar(fieldName = "mutationType", graphQLTypeSimpleName = "__Type", javaClass = __Type.class)
	__Type mutationType;

	@JsonProperty("subscriptionType")
	@GraphQLNonScalar(fieldName = "subscriptionType", graphQLTypeSimpleName = "__Type", javaClass = __Type.class)
	__Type subscriptionType;

	@JsonProperty("directives")
	@JsonDeserialize(using = CustomJacksonDeserializers.List__Directive.class)
	@GraphQLNonScalar(fieldName = "directives", graphQLTypeSimpleName = "__Directive", javaClass = __Directive.class)
	List<__Directive> directives;

	@JsonProperty("__typename")
	@GraphQLScalar(fieldName = "__typename", graphQLTypeSimpleName = "String", javaClass = String.class)
	String __typename;

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setTypes(List<__Type> types) {
		this.types = types;
	}

	public List<__Type> getTypes() {
		return types;
	}

	public void setQueryType(__Type queryType) {
		this.queryType = queryType;
	}

	public __Type getQueryType() {
		return queryType;
	}

	public void setMutationType(__Type mutationType) {
		this.mutationType = mutationType;
	}

	public __Type getMutationType() {
		return mutationType;
	}

	public void setSubscriptionType(__Type subscriptionType) {
		this.subscriptionType = subscriptionType;
	}

	public __Type getSubscriptionType() {
		return subscriptionType;
	}

	public void setDirectives(List<__Directive> directives) {
		this.directives = directives;
	}

	public List<__Directive> getDirectives() {
		return directives;
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
		return "__Schema {" + "description: " + description + ", " + "types: " + types + ", " + "queryType: "
				+ queryType + ", " + "mutationType: " + mutationType + ", " + "subscriptionType: " + subscriptionType
				+ ", " + "directives: " + directives + ", " + "__typename: " + __typename + "}";
	}

	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder
	 */
	public static class Builder {
		private String description;
		private List<__Type> types;
		private __Type queryType;
		private __Type mutationType;
		private __Type subscriptionType;
		private List<__Directive> directives;

		public Builder withDescription(String description) {
			this.description = description;
			return this;
		}

		public Builder withTypes(List<__Type> types) {
			this.types = types;
			return this;
		}

		public Builder withQueryType(__Type queryType) {
			this.queryType = queryType;
			return this;
		}

		public Builder withMutationType(__Type mutationType) {
			this.mutationType = mutationType;
			return this;
		}

		public Builder withSubscriptionType(__Type subscriptionType) {
			this.subscriptionType = subscriptionType;
			return this;
		}

		public Builder withDirectives(List<__Directive> directives) {
			this.directives = directives;
			return this;
		}

		public __Schema build() {
			__Schema _object = new __Schema();
			_object.setDescription(description);
			_object.setTypes(types);
			_object.setQueryType(queryType);
			_object.setMutationType(mutationType);
			_object.setSubscriptionType(subscriptionType);
			_object.setDirectives(directives);
			_object.set__typename("__Schema");
			return _object;
		}
	}
}
