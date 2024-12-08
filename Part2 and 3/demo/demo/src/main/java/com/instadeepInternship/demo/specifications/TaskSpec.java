package com.instadeepInternship.demo.specifications;

import com.instadeepInternship.demo.model.Task;
import org.springframework.data.jpa.domain.Specification;

public class TaskSpec {

    /**
     * Creates a specification to find job offers by title.
     *
     * @param title the title to search for
     * @return a specification for finding job offers by title
     */
    public static Specification<Task> hasTitle(String title) {
        return (root, query, cb) -> cb.like(root.get("title"), "%" + title + "%");
    }

    /**
     * Creates a specification to find job offers by description.
     *
     * @param description the description to search for
     * @return a specification for finding job offers by description
     */
    public static Specification<Task> hasDescription(String description) {
        return (root, query, cb) -> cb.like(root.get("description"), "%" + description + "%");
    }

    /**
     * Creates a specification to find job offers by place.
     *
     * @param category the place to search for
     * @return a specification for finding job offers by place
     */
    public static Specification<Task> hasCategory(String category) {
        return (root, query, cb) -> cb.like(root.get("place"), "%" + category + "%");
    }

    /**
     * Creates a specification to find job offers by search criteria.
     * The criteria is matched against title, description, and place.
     * If criteria is null or empty, it returns a specification that matches all records.
     *
     * @param criteria the search criteria
     * @return a specification for finding job offers by criteria
     */
    public static Specification<Task> hasCriteria(String criteria) {
        if (criteria == null || criteria.trim().isEmpty()) {
            // Return a specification that matches all records
            return (root, query, cb) -> cb.conjunction();
        } else {
            // Return a specification based on the criteria
            return (root, query, cb) -> cb.or(
                    cb.like(root.get("title"), "%" + criteria + "%"),
                    cb.like(root.get("description"), "%" + criteria + "%"),
                    cb.like(root.get("category"), "%" + criteria + "%")


            );
        }
    }
}
