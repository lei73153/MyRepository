package com.demo.dao;

import com.demo.domain.Order;
import com.demo.domain.TxLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TxLogDao extends JpaRepository<TxLog, String> {
}
