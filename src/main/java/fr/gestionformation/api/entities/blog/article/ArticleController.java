package fr.gestionformation.api.entities.blog.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.gestionformation.api.utils.GenericRestController;
import fr.gestionformation.api.utils.RestService;

@RestController
@RequestMapping("/article")
public class ArticleController extends GenericRestController<Article>{
	
	@Autowired
	public ArticleController(RestService<Article> serv) {
		super(serv);
	}
	
}
