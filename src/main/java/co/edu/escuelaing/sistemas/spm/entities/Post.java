package co.edu.escuelaing.sistemas.spm.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.google.common.collect.ImmutableList;


public class Post {

	private final String id;

	private final PostType postType;

	private final String name;

	private final String description;

	private final LocalDateTime publishDate;

	private final LocalDateTime resolvedDate;

	private final ImmutableList<Item> items;

	public Post(String id, PostType postType, String name,
				String description, LocalDateTime publishDate,
				LocalDateTime resolvedDate, List<Item> items) {

		this.id = id;
		this.postType = postType;
		this.name = name;
		this.description = description;
		this.publishDate = publishDate;
		this.resolvedDate = resolvedDate;
		this.items = ImmutableList.copyOf(items);
	}

	public String getId() {
		return id;
	}

	public PostType getPostType() {
		return postType;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public LocalDateTime getPublishDate() {
		return publishDate;
	}

	public LocalDateTime getResolvedDate() {
		return resolvedDate;
	}

	public List<Item> getItems() {
		return items;
	}

	public Post addItem(Item item) {
		ArrayList<Item> newItems = new ArrayList<>(this.items);
		newItems.add(item);

		return new Post(id, postType, name, description, publishDate, resolvedDate, newItems);
	}

	public Post removeItem(Item item) {
		List<Item> newElements = new ArrayList<>(items);

		Optional<Item> first = items.stream()
				.filter(x -> x.getName().equals(item.getName()))
				.findFirst();

		first.ifPresent(newElements::remove);

		return new Post(id, postType, name, description, publishDate, resolvedDate, newElements);
	}

}
