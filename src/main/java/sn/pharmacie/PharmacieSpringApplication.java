package sn.pharmacie;

import org.springframework.beans.factory.annotation.Autowired;
import sn.pharmacie.entities.InfosPharmacie;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sn.pharmacie.dao.InfosPharmacieRepository;

@SpringBootApplication(scanBasePackages = "sn.pharmacie")
public class PharmacieSpringApplication implements CommandLineRunner{

	@Autowired
	private InfosPharmacieRepository infosPharmacieRepository; 
	
	public static void main(String[] args) {
		SpringApplication.run(PharmacieSpringApplication.class, args);
	}

	@Override
	public void run(String... arg0 ) throws Exception {

		infosPharmacieRepository.save(new InfosPharmacie(1,"Pharmacie Colobane","colobane","Dakar", 1));
		infosPharmacieRepository.save(new InfosPharmacie(2,"Pharmacie Kaolack","ngane","Kaolack", 1));
		infosPharmacieRepository.save(new InfosPharmacie(4,"Pharmacie Lumiere","Rail","Thies", 1));
		infosPharmacieRepository.findAll().forEach(i->{
			System.out.println(i.getNom());
		});
		
		}

}
