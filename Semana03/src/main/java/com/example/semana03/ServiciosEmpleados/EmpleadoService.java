package com.example.semana03.ServiciosEmpleados;

import com.example.semana03.Empleado.Empleados;
import com.example.semana03.EmpleadoRepository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    public List<Empleados> getAllEmpleados() {
        return empleadoRepository.findAll();
    }

    public Empleados getEmpleadoById(int id) {
        return empleadoRepository.findById(id).orElse(null);
    }

    public Empleados saveOrUpdateEmpleado(Empleados empleados) {
        return empleadoRepository.save(empleados);
    }

    public void deleteEmpleado(int id) {
        empleadoRepository.deleteById(id);
    }
}
