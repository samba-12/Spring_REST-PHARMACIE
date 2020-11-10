package sn.pharmacie.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sn.pharmacie.dao.InfosPharmacieRepository;
import sn.pharmacie.entities.InfosPharmacie;

@RestController

public class InfosPharmacieRestService {
 
	@Autowired
	private InfosPharmacieRepository infosPharmacieRepository; 

	@RequestMapping(value="/infospharmacie", method = RequestMethod.GET)
	public List<InfosPharmacie> getInfosPharmacies(){
		return infosPharmacieRepository.findAll();
	}
//
//	@RequestMapping(value="/chercherpharmacie", method = RequestMethod.GET)
//	public Page<InfosPharmacie> chercher(
//			@RequestParam(name="mc",defaultValue="") String mc, 			
//			@RequestParam(name="page",defaultValue="0") int page,
//			@RequestParam(name="size",defaultValue="5")int size){
//		return infosPharmacieRepository.chercher(mc, PageRequest);
//	}
	
	@RequestMapping(value="/infospharmacie/{id}", method = RequestMethod.GET)
	public Optional<InfosPharmacie> getInfosPharmacie(@PathVariable Integer id){
		return infosPharmacieRepository.findById(id);
	}
	
	@RequestMapping(value="/infospharmacie", method=RequestMethod.POST)
	public InfosPharmacie save(@RequestBody InfosPharmacie i){
		return infosPharmacieRepository.save(i);
	}
	
	@RequestMapping(value="/infospharmacie/{id}", method = RequestMethod.DELETE)
	public boolean supprimer (@PathVariable Integer id){
		infosPharmacieRepository.deleteById(id);
		return true;
	}
	@RequestMapping(value="/infospharmacie/{id}", method = RequestMethod.PUT )
	public InfosPharmacie save(@PathVariable Integer id,@RequestBody InfosPharmacie i){
		i.setId(id);
		return infosPharmacieRepository.save(i);
	}
}
