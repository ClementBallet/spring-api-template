package fr.gestionformation.api.entities.blog.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import fr.gestionformation.api.utils.RestService;

@Service
public class ArticleService implements RestService<Article> {
	
	@Autowired
	ArticleDao dao;

	@Override
	public JpaRepository<Article, Long> getDao() {
		return dao;
	}

}
