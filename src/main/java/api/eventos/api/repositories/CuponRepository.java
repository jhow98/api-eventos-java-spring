package api.eventos.api.repositories;

import api.eventos.api.domain.coupon.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CuponRepository extends JpaRepository<Coupon, UUID> {
}
