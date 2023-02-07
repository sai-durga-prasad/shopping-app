package com.sdp.warehouseservice;

import com.sdp.warehouseservice.model.WareHouse;
import com.sdp.warehouseservice.repository.WareHouseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WarehouseServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(WarehouseServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(WareHouseRepository wareHouseRepository){
		return args -> {
			WareHouse wareHouse = new WareHouse();
			wareHouse.setItemCode("realme 6");
			wareHouse.setQuantity(1L);

			WareHouse wareHouse2 = new WareHouse();
			wareHouse2.setItemCode("realme 7");
			wareHouse2.setQuantity(0L);

			wareHouseRepository.save(wareHouse);
			wareHouseRepository.save(wareHouse2);
		};
	}

}
