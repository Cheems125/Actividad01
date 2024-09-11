package com.example.semana03.EmpleadoController;
import com.example.semana03.Empleado.Empleados;
import com.example.semana03.ServiciosEmpleados.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping
    public List<Empleados> getAllEmpleados() {
        return empleadoService.getAllEmpleados();
    }

    @GetMapping("/{id}")
    public Empleados getEmpleadoById(@PathVariable int id) {
        return (Empleados) empleadoService.getEmpleadoById(id);
    }

    @PostMapping
    public Empleados saveEmpleado(@RequestBody Empleados empleado) {
        return empleadoService.saveOrUpdateEmpleado(empleado);
    }

    @PutMapping("/{id}")
    public Empleados updateEmpleado(@PathVariable int id, @RequestBody Empleados empleado, Empleados Empleados) {
        Empleados existingEmpleado = empleadoService.getEmpleadoById(id);
        if (existingEmpleado != null) {
            empleado.setId_empleados(id);
            Empleados empleados;
            return empleadoService.saveOrUpdateEmpleado(empleado.saveOrUpdateEmpleado(Empleados));
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteEmpleado(@PathVariable int id) {
        empleadoService.deleteEmpleado(id);
    }
}
