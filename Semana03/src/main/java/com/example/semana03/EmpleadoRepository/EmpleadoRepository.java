package com.example.semana03.EmpleadoRepository;

import com.example.semana03.Empleado.Empleados;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleados, Integer> {
}
