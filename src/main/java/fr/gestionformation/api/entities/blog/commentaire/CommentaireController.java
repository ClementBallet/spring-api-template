package fr.gestionformation.api.entities.blog.commentaire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.gestionformation.api.utils.GenericRestController;
import fr.gestionformation.api.utils.RestService;

@RestController
@RequestMapping("/commentaire")
public class CommentaireController extends GenericRestController<Commentaire> {

	@Autowired
	public CommentaireController(RestService<Commentaire> serv) {
		super(serv);
	}
	
}
