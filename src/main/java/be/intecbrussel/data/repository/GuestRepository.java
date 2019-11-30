package be.intecbrussel.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import be.intecbrussel.data.entity.Guest;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}