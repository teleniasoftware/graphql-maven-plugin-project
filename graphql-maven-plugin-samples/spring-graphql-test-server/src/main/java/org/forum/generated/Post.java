/** Generated by the default template from graphql-java-generator */
package org.forum.generated;

import java.util.HashMap;
import java.util.Map;


import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 *
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@Entity
@GraphQLObjectType("Post")
@SuppressWarnings("unused")
public class Post 
{

	public Post(){
		// No action
	}

	@Id
	@GeneratedValue
	@GraphQLScalar(fieldName = "id", graphQLTypeSimpleName = "ID", javaClass = java.lang.Long.class)
	java.lang.Long id;


	@GraphQLScalar(fieldName = "date", graphQLTypeSimpleName = "Date", javaClass = java.util.Date.class)
	java.util.Date date;


	@Transient
	@GraphQLNonScalar(fieldName = "author", graphQLTypeSimpleName = "Member", javaClass = org.forum.generated.Member.class)
	org.forum.generated.Member author;


	@GraphQLScalar(fieldName = "publiclyAvailable", graphQLTypeSimpleName = "Boolean", javaClass = java.lang.Boolean.class)
	java.lang.Boolean publiclyAvailable;


	@GraphQLScalar(fieldName = "title", graphQLTypeSimpleName = "String", javaClass = java.lang.String.class)
	java.lang.String title;


	@GraphQLScalar(fieldName = "content", graphQLTypeSimpleName = "String", javaClass = java.lang.String.class)
	java.lang.String content;


	
	java.lang.Long authorId;


	
	java.lang.Long topicId;



	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.Long getId() {
		return id;
	}
		

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public java.util.Date getDate() {
		return date;
	}
		

	public void setAuthor(org.forum.generated.Member author) {
		this.author = author;
	}

	public org.forum.generated.Member getAuthor() {
		return author;
	}
		

	public void setPubliclyAvailable(java.lang.Boolean publiclyAvailable) {
		this.publiclyAvailable = publiclyAvailable;
	}

	public java.lang.Boolean getPubliclyAvailable() {
		return publiclyAvailable;
	}
		

	public void setTitle(java.lang.String title) {
		this.title = title;
	}

	public java.lang.String getTitle() {
		return title;
	}
		

	public void setContent(java.lang.String content) {
		this.content = content;
	}

	public java.lang.String getContent() {
		return content;
	}
		

	public void setAuthorId(java.lang.Long authorId) {
		this.authorId = authorId;
	}

	public java.lang.Long getAuthorId() {
		return authorId;
	}
		

	public void setTopicId(java.lang.Long topicId) {
		this.topicId = topicId;
	}

	public java.lang.Long getTopicId() {
		return topicId;
	}
		

     public String toString() {
        return "Post {"
				+ "id: " + id
				+ ", "
				+ "date: " + date
				+ ", "
				+ "author: " + author
				+ ", "
				+ "publiclyAvailable: " + publiclyAvailable
				+ ", "
				+ "title: " + title
				+ ", "
				+ "content: " + content
				+ ", "
				+ "authorId: " + authorId
				+ ", "
				+ "topicId: " + topicId
        		+ "}";
    }

	public static Builder builder() {
		return new Builder();
	}

	/**
	 * The Builder that helps building instance of this POJO. You can get an instance of this class, by calling the
	 * {@link #builder()}
	 */
	public static class Builder {
		private java.lang.Long id;
		private java.util.Date date;
		private org.forum.generated.Member author;
		private java.lang.Boolean publiclyAvailable;
		private java.lang.String title;
		private java.lang.String content;
		private java.lang.Long authorId;
		private java.lang.Long topicId;

		public Builder withId(java.lang.Long id) {
			this.id = id;
			return this;
		}
		public Builder withDate(java.util.Date date) {
			this.date = date;
			return this;
		}
		public Builder withAuthor(org.forum.generated.Member author) {
			this.author = author;
			return this;
		}
		public Builder withPubliclyAvailable(java.lang.Boolean publiclyAvailable) {
			this.publiclyAvailable = publiclyAvailable;
			return this;
		}
		public Builder withTitle(java.lang.String title) {
			this.title = title;
			return this;
		}
		public Builder withContent(java.lang.String content) {
			this.content = content;
			return this;
		}
		public Builder withAuthorId(java.lang.Long authorId) {
			this.authorId = authorId;
			return this;
		}
		public Builder withTopicId(java.lang.Long topicId) {
			this.topicId = topicId;
			return this;
		}

		public Post build() {
			Post _object = new Post();
			_object.setId(id);
			_object.setDate(date);
			_object.setAuthor(author);
			_object.setPubliclyAvailable(publiclyAvailable);
			_object.setTitle(title);
			_object.setContent(content);
			_object.setAuthorId(authorId);
			_object.setTopicId(topicId);
			return _object;
		}
	}
}
