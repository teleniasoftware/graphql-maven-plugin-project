/** Generated by the default template from graphql-java-generator */
package com.graphql_java_generator.domain.server.allGraphQLCases;

import java.util.List;

import com.graphql_java_generator.annotation.GraphQLInputType;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 *
 * @author generated by graphql-java-generator
 * @see <a href=
 *      "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLInputType("DroidInput")
public class DroidInput {

	public DroidInput() {
		// No action
	}

	@GraphQLScalar(fieldName = "name", graphQLTypeSimpleName = "String", javaClass = String.class)
	String name;

	@GraphQLNonScalar(fieldName = "friends", graphQLTypeSimpleName = "CharacterInput", javaClass = CharacterInput.class)
	List<CharacterInput> friends;

	@GraphQLScalar(fieldName = "appearsIn", graphQLTypeSimpleName = "Episode", javaClass = Episode.class)
	List<Episode> appearsIn;

	@GraphQLScalar(fieldName = "primaryFunction", graphQLTypeSimpleName = "String", javaClass = String.class)
	String primaryFunction;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setFriends(List<CharacterInput> friends) {
		this.friends = friends;
	}

	public List<CharacterInput> getFriends() {
		return friends;
	}

	public void setAppearsIn(List<Episode> appearsIn) {
		this.appearsIn = appearsIn;
	}

	public List<Episode> getAppearsIn() {
		return appearsIn;
	}

	public void setPrimaryFunction(String primaryFunction) {
		this.primaryFunction = primaryFunction;
	}

	public String getPrimaryFunction() {
		return primaryFunction;
	}

	@Override
	public String toString() {
		return "DroidInput {" + "name: " + name + ", " + "friends: " + friends + ", " + "appearsIn: " + appearsIn + ", "
				+ "primaryFunction: " + primaryFunction + "}";
	}

	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder
	 */
	public static class Builder {
		private String name;
		private List<CharacterInput> friends;
		private List<Episode> appearsIn;
		private String primaryFunction;

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withFriends(List<CharacterInput> friends) {
			this.friends = friends;
			return this;
		}

		public Builder withAppearsIn(List<Episode> appearsIn) {
			this.appearsIn = appearsIn;
			return this;
		}

		public Builder withPrimaryFunction(String primaryFunction) {
			this.primaryFunction = primaryFunction;
			return this;
		}

		public DroidInput build() {
			DroidInput _object = new DroidInput();
			_object.setName(name);
			_object.setFriends(friends);
			_object.setAppearsIn(appearsIn);
			_object.setPrimaryFunction(primaryFunction);
			return _object;
		}
	}
}
