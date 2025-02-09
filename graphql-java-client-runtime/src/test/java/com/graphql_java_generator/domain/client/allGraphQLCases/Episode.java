/** Generated by the default template from graphql-java-generator */
package com.graphql_java_generator.domain.client.allGraphQLCases;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.graphql_java_generator.annotation.GraphQLEnumType;

/**
 * #############################################################################################################
 * ###############  STAR WARS SCHEMA  ##########################################################################
 * #############################################################################################################
 * <BR/>
 * 
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLEnumType("Episode")
@SuppressWarnings("unused")
public enum Episode {
	NEWHOPE("NEWHOPE"), 
	EMPIRE("EMPIRE"), 
	JEDI("JEDI"), 
	DOES_NOT_EXIST("DOES_NOT_EXIST");

	// The graphQlValue is needed on server side, to map the enum value to the value defined in the GraphQL schema. They are different
	// when the value in the GraphQL schema is a java reserved keyword.
	private final String graphQlValue;

	public String graphQlValue() {
		return graphQlValue;
	}
	
	static public Episode fromGraphQlValue(String graphQlValue) {
		for (Episode e : Episode.values()) {
			if (e.graphQlValue().equals(graphQlValue)) {
				return e;
			}
		}
		throw new IllegalArgumentException("No Episode exists with '" + graphQlValue + "' as a GraphQL value");
	}

	Episode(String graphQlValue) {
		this.graphQlValue = graphQlValue;
	}
}
