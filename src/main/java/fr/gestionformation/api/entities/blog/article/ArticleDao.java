package fr.gestionformation.api.entities.blog.article;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleDao extends JpaRepository<Article, Long> {

}
