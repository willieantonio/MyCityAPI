package com.was.MyCityAPI.states.repositories;

import com.was.MyCityAPI.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository  extends JpaRepository<State, Long> {
}
