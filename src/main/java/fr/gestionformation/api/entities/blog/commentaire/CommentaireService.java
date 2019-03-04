package fr.gestionformation.api.entities.blog.commentaire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import fr.gestionformation.api.utils.RestService;

@Service
public class CommentaireService implements RestService<Commentaire> {

	@Autowired
	CommentaireDao dao;
	
	@Override
	public JpaRepository<Commentaire, Long> getDao() {
		return dao;
	}

}
