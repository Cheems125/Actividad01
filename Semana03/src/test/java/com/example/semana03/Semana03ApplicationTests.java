package com.example.semana03;
import com.example.semana03.Empleado.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface EmpleadoRepository extends JpaRepository<Empleados, Integer> {
}