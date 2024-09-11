package com.example.semana03.Empleado;

import com.example.semana03.ServiciosEmpleados.EmpleadoService;
import com.example.semana03.ServiciosEmpleados.EmpleadoService;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Empleados")
public class Empleados extends EmpleadoService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_empleado;

    private String nombre;
    private String apellido;
    private String puesto;
    private String departamento;

    @Temporal(TemporalType.DATE)
    private Date fecha_nacimiento;

    @Temporal(TemporalType.DATE)
    private Date fecha_ingreso;

    private Double salario;
    private String telefono;
    private String correo_electronico;
    private String direccion;
    private String estado_cuenta;

    @Temporal(TemporalType.DATE)
    private Date fecha_ultimo_aumento;

    @ManyToOne
    @JoinColumn(name = "jefe_directo")
    private Empleados jefeDirecto;

    private Boolean activo;

    public void setId_empleados(int id) {
    }

    // Getters and setters
}
