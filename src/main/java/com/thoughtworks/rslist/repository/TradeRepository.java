package com.thoughtworks.rslist.repository;

import com.thoughtworks.rslist.dto.TradeDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface TradeRepository extends PagingAndSortingRepository<TradeDto, Integer> {
    @Query(value = "select max(t.amount) from trade t where t.rank = ?1", nativeQuery = true)
    Integer findMaxAmountByRank(Integer rank);

    @Override
    List<TradeDto> findAll();

    Optional<TradeDto> findByRank(Integer rank);
}