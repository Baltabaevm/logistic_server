package kz.logistic.logistic_server.repositories;

import kz.logistic.logistic_server.models.entities.ItemOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemOrderRepository extends JpaRepository<ItemOrder,Long> {

    List<ItemOrder> findAllByDeletedAtIsNull();

}
