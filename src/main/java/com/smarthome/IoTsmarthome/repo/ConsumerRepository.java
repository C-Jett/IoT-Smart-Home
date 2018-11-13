package com.smarthome.IoTsmarthome.repo;
import com.smarthome.IoTsmarthome.model.consumers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerRepository extends JpaRepository<consumers, Long> {

}
