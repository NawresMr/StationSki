package tn.esprit.gestionfoyernawres.Repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import tn.esprit.gestionfoyernawres.entities.Cours;

import java.util.List;

public interface CoursRepository extends CrudRepository<Cours,Long> {
@Query(value = "SELECT * " +
        "FROM cours c " +
        "JOIN moniteur_cours_set mc on c.num_cours=mc.cours_set_num_cours " +
        "JOIN moniteur m on m.num_moniteur=mc.moniteur_num_moniteur " +
        "WHERE m.nomm= :nomM and m.prenomm= :prenomM",nativeQuery = true)//1 et 2 sont les nombres des  arguments
//where hnee nchou les att kifech maktoubin fi BD
List<Cours> findByMoniteurNomMSql(@Param("nomM") String nomM,@Param("prenomM") String prenomM);




//Query JPQL : lhnee maadech aana select * bech ywali aana select objet (c) de type cours lezm l'entity cours ykoun majuscule
    //relation unidirectionnelle bin moniteur et cours donc nekhdmou bel member
    // (onetomany(uni) ,ManyToOne(uni) , manytomany(bi wala uni) => nekhdmou bel member)
    //where hne nchou les att kifech maktoubin fi entity
    //kn (manytoone, onetoone, oneToMany (bi) nekhdem bel equal aady )

    @Query("SELECT c " +
            "FROM Cours  c " +
            "JOIN Moniteur  m on c member m.coursSet " +
            "WHERE m.nomM=?1 and m.prenomM=?2")
    List<Cours> findByMoniteurNomMJPQL(String nomM, String prenomM);



}
