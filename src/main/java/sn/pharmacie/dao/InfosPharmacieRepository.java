package sn.pharmacie.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import sn.pharmacie.entities.InfosPharmacie;

public interface InfosPharmacieRepository extends JpaRepository<InfosPharmacie, Integer> {

	//InfosPharmacie findOne(Integer id);
	/*
	 * @Query("select i from InfosPharmacie i where i.nom like:x") public
	 * Page<InfosPharmacie> chercher(@Param("x")String mc,PageRequest pageRequest);
	 */

}
