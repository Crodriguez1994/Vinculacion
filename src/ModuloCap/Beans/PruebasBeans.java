/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloCap.Beans;

import ModuloCap.Dao.AsigProyectoSectorDAO;
import ModuloCap.Dao.AsigProyectosDAO;
import ModuloCap.Dao.BeneficiariosDAO;
import ModuloCap.Dao.CabAgendasDAO;
import ModuloCap.Dao.CabAsistenciasDAO;
import ModuloCap.Dao.CabCapacitacionesDAO;
import ModuloCap.Dao.CabHorariosDAO;
import ModuloCap.Dao.CabInscripcionesDAO;
import ModuloCap.Dao.CoordinadoresDAO;
import ModuloCap.Dao.EspecialidadesDAO;
import ModuloCap.Dao.FacilitadoresDAO;
import ModuloCap.Dao.PlanfActividadDAO;
import ModuloCap.Dao.ProyectosDAO;
import ModuloCap.Dao.SectoresDAO;
import ModuloCap.Dao.UndAtencionDAO;
import ModuloCap.Entidades.AsigProyectoSector;
import ModuloCap.Entidades.AsigProyectos;
import ModuloCap.Entidades.Beneficiarios;
import ModuloCap.Entidades.Bioempleados;
import ModuloCap.Entidades.CabAgendas;
import ModuloCap.Entidades.CabAsistencias;
import ModuloCap.Entidades.CabCapacitaciones;
import ModuloCap.Entidades.CabHorarios;
import ModuloCap.Entidades.CabInscripciones;
import ModuloCap.Entidades.Coordinadores;
import ModuloCap.Entidades.DetaAgendas;
import ModuloCap.Entidades.DetaAgendasPK;
import ModuloCap.Entidades.DetaAsistencias;
import ModuloCap.Entidades.DetaAsistenciasPK;
import ModuloCap.Entidades.DetaCapacitaciones;
import ModuloCap.Entidades.DetaCapacitacionesPK;
import ModuloCap.Entidades.DetaInscripciones;
import ModuloCap.Entidades.DetaInscripcionesPK;
import ModuloCap.Entidades.Especialidades;
import ModuloCap.Entidades.Facilitadores;
import ModuloCap.Entidades.ModulosCapacitaciones;
import ModuloCap.Entidades.ModulosCapacitacionesPK;
import ModuloCap.Entidades.PlanificacionActividades;
import ModuloCap.Entidades.Proyectos;
import ModuloCap.Entidades.Sectores;
import ModuloCap.Entidades.UnidadesAtencion;
import ModuloCap.InterfacesDao.IAsigProyectoSectorDao;
import ModuloCap.InterfacesDao.IAsigProyectosDao;
import ModuloCap.InterfacesDao.IBeneficiariosDao;
import ModuloCap.InterfacesDao.ICabAgendasDao;
import ModuloCap.InterfacesDao.ICabAsistenciasDao;
import ModuloCap.InterfacesDao.ICabCapacitacionesDao;
import ModuloCap.InterfacesDao.ICabHorariosDao;
import ModuloCap.InterfacesDao.ICabInscripcionesDao;
import ModuloCap.InterfacesDao.ICoordinadoresDao;
import ModuloCap.InterfacesDao.IEspecialidadesDao;
import ModuloCap.InterfacesDao.IFacilitadoresDao;
import ModuloCap.InterfacesDao.IPlanfActividadDao;
import ModuloCap.InterfacesDao.IProyectosDao;
import ModuloCap.InterfacesDao.ISectoresDao;
import ModuloCap.InterfacesDao.IUndAtencionDao;
import java.util.List;

/**
 *
 * @author Christian
 */
public class PruebasBeans {

    java.sql.Date hoy = java.sql.Date.valueOf("2019-07-17");
    IProyectosDao proyectodao = new ProyectosDAO();
    ISectoresDao sectordao = new SectoresDAO();
    IUndAtencionDao undatenciondao = new UndAtencionDAO();
    IAsigProyectosDao asigproyectodao = new AsigProyectosDAO();
    IEspecialidadesDao especialidadao = new EspecialidadesDAO();
    IFacilitadoresDao facilitadordao = new FacilitadoresDAO();
    ICoordinadoresDao coordinadordao = new CoordinadoresDAO();
    IBeneficiariosDao beneficiariodao = new BeneficiariosDAO();
    IAsigProyectoSectorDao porsecdao = new AsigProyectoSectorDAO();

    ICabAgendasDao cabagendadao = new CabAgendasDAO();
    ICabCapacitacionesDao cabcapdao = new CabCapacitacionesDAO();
    ICabHorariosDao cabhoradao = new CabHorariosDAO();
    ICabInscripcionesDao cabinscripcion = new CabInscripcionesDAO();
    ICabAsistenciasDao cabasistencia = new CabAsistenciasDAO();

    IPlanfActividadDao planidao = new PlanfActividadDAO();

//-----------------------Proyectos------------------------------------------------------
    public void IngresarProyectos() {

        Proyectos p1 = new Proyectos();

        p1.setEstado("A");
        p1.setFecha(hoy);
        p1.setNombre("Adulto Mayor");

        Proyectos p2 = new Proyectos();

        p2.setEstado("A");
        p2.setFecha(hoy);
        p2.setNombre("Discapacidad");

        Proyectos p3 = new Proyectos();

        p3.setEstado("I");
        p3.setFecha(hoy);
        p3.setNombre("Buen Vivir");

        proyectodao.Guardar(p1);
        proyectodao.Guardar(p2);
        proyectodao.Guardar(p3);
    }

    public void ModificarProyectos() {
        Proyectos p1 = new Proyectos();
        p1.setProyectoid(1);
        p1.setEstado("A");
        p1.setFecha(hoy);
        p1.setFechafin(hoy);
        p1.setFechainicio(hoy);
        p1.setNombre("Adulto Mayor");

        proyectodao.Modificar(p1);
    }

    public void EliminarProyectos() {
        Proyectos p1 = new Proyectos();
        p1.setProyectoid(2);
        proyectodao.Eliminar(p1);
    }

    public void ListaProyectos() {
        List<Proyectos> p = proyectodao.getProyectoslist();

        for (Proyectos pr : p) {
            System.out.println(pr.toString());
        }
    }

//-------------------------Sectores----------------------------------------------------
    public void IngresarSectores() {

        Sectores sc1 = new Sectores();
        sc1.setEstado("A");
        sc1.setFecha(hoy);
        sc1.setNombre("Sur");

        Sectores sc2 = new Sectores();
        sc2.setEstado("A");
        sc2.setFecha(hoy);
        sc2.setNombre("Norte");

        Sectores sc3 = new Sectores();
        sc3.setEstado("A");
        sc3.setFecha(hoy);
        sc3.setNombre("Duran");

        sectordao.Guardar(sc1);
        sectordao.Guardar(sc2);
        sectordao.Guardar(sc3);
    }

    public void ModificarSectores() {
        Sectores sc1 = new Sectores();
        sc1.setSectorid(1);
        sc1.setEstado("A");
        sc1.setFecha(hoy);
        sc1.setNombre("Sur");

        sectordao.Modificar(sc1);
    }

    public void EliminarSectores() {
        Sectores sc1 = new Sectores();
        sc1.setSectorid(2);
        sectordao.Eliminar(sc1);
    }

    public void ListaSectores() {
        List<Sectores> s = sectordao.getSectoreslist();

        for (Sectores sc : s) {
            System.out.println(sc.toString());
        }
    }

//-------------------------Unidad Atencion----------------------------------------------------
    public void IngresarUndAtencion() {

        UnidadesAtencion u1 = new UnidadesAtencion();
        Proyectos p1 = new Proyectos();
        p1.setProyectoid(1);
        Sectores s1 = new Sectores();
        s1.setSectorid(1);

        u1.setEstado("A");
        u1.setFecha(hoy);
        u1.setNombre("Piecitos del suburbio");
        u1.setProyectoid(p1);
        u1.setSectorid(s1);

        undatenciondao.Guardar(u1);
    }

    public void ModificarUndAtencon() {
        UnidadesAtencion u1 = new UnidadesAtencion();
        Proyectos p1 = new Proyectos();
        p1.setProyectoid(3);
        Sectores s1 = new Sectores();
        s1.setSectorid(1);

        u1.setUnidadid(1);
        u1.setEstado("I");
        u1.setFecha(hoy);
        u1.setNombre("Piecitos del saber");
        u1.setSectorid(s1);
        u1.setProyectoid(p1);

        undatenciondao.Modificar(u1);
    }

    public void EliminarUndAtencion() {
        UnidadesAtencion u1 = new UnidadesAtencion();
        u1.setUnidadid(2);
        undatenciondao.Eliminar(u1);
    }

    public void ListaUndAtencion() {
        List<UnidadesAtencion> ulist = undatenciondao.getUndAtencionList();
        for (UnidadesAtencion ua : ulist) {
            System.out.println(ua.toString());
        }
    }

//----------------------CabCapacitaciones-------------------------------------------------------
    public void IngresarCabCapacitacion() {
        CabCapacitaciones cabcap = new CabCapacitaciones();
        AsigProyectos asigp = new AsigProyectos();
        Proyectos pro= new Proyectos();
        pro.setProyectoid(3);
        Coordinadores coor = new Coordinadores();
        coor.setCoordinadorid(1);
        asigp.setAsigproyectoid(1);
        asigp.setProyectoid(pro);
        asigp.setCoordinadorid(coor);
        UnidadesAtencion u1 = new UnidadesAtencion();
        u1.setUnidadid(1);

        cabcap.setEstado("A");
        cabcap.setTipo("I");
        cabcap.setNombre("Buen Vivir");
        cabcap.setAsigproyectoid(asigp);
        cabcap.setUnidadid(u1);
        cabcap.setLugar("Nurtac");
        cabcap.setCupo(30);
        cabcap.setFecha(hoy);
        cabcap.setFechaapertura(hoy);
        cabcap.setFechacierre(hoy);

//-----------DetalleCapacitaciones-------------------------------------
        DetaCapacitaciones detacap1 = new DetaCapacitaciones();
        DetaCapacitaciones detacap2 = new DetaCapacitaciones();
        DetaCapacitaciones detacap3 = new DetaCapacitaciones();

        DetaCapacitacionesPK pk1 = new DetaCapacitacionesPK();
        DetaCapacitacionesPK pk2 = new DetaCapacitacionesPK();
        DetaCapacitacionesPK pk3 = new DetaCapacitacionesPK();

        Facilitadores fa1 = new Facilitadores();
        Facilitadores fa2 = new Facilitadores();
        Facilitadores fa3 = new Facilitadores();

        pk1.setDetacapid(1);
        pk2.setDetacapid(2);
        pk3.setDetacapid(3);

        fa1.setFacilitadorid(1);
        fa2.setFacilitadorid(2);
        fa3.setFacilitadorid(3);

        detacap1.setCabCapid(cabcap);
        detacap1.setDetacapacitacionesPk(pk1);
        detacap1.setFacilitadorid(fa1);

        detacap2.setCabCapid(cabcap);
        detacap2.setDetacapacitacionesPk(pk2);
        detacap2.setFacilitadorid(fa2);

        detacap3.setCabCapid(cabcap);
        detacap3.setDetacapacitacionesPk(pk3);
        detacap3.setFacilitadorid(fa3);

        cabcap.addDetalle(detacap1);
//        cabcap.addDetalle(detacap2);
//        cabcap.addDetalle(detacap3);

//--------------------------Detalle de Modulos----------------------------------------------
        ModulosCapacitaciones modcap = new ModulosCapacitaciones();
        ModulosCapacitaciones modcap1 = new ModulosCapacitaciones();
        ModulosCapacitaciones modcap2 = new ModulosCapacitaciones();
        ModulosCapacitacionesPK mpk = new ModulosCapacitacionesPK();
        ModulosCapacitacionesPK mpk1 = new ModulosCapacitacionesPK();
        ModulosCapacitacionesPK mpk2 = new ModulosCapacitacionesPK();
        mpk.setModuloid(1);
        mpk1.setModuloid(2);
        mpk2.setModuloid(3);

        modcap.setModulocap(mpk);
        modcap.setEstado("A");
        modcap.setFecha(hoy);
        modcap.setNombre("Modulo1");

        modcap1.setModulocap(mpk1);
        modcap1.setEstado("A");
        modcap1.setFecha(hoy);
        modcap1.setNombre("Modulo2");

        modcap2.setModulocap(mpk2);
        modcap2.setEstado("A");
        modcap2.setFecha(hoy);
        modcap2.setNombre("Modulo3");

        cabcap.addDetalleMod(modcap);
        cabcap.addDetalleMod(modcap1);
        cabcap.addDetalleMod(modcap2);

        cabcapdao.Guardar(cabcap);
    }

    public void ListaCabCapacitacion() {
        List<CabCapacitaciones> lista = cabcapdao.getCabcapacitacioneslist();
        for (CabCapacitaciones cap : lista) {
            System.out.println(cap.toString());
        }
    }
    
  
//-----------------------------------------------------------------------------

//-----------------------Especialidades------------------------------------------------------
    public void IngresarEspecialidad() {
        Especialidades especialidad = new Especialidades();
        especialidad.setEstado("A");
        especialidad.setFecha(hoy);
        especialidad.setNombre("Comunicación");

        Especialidades especialidad1 = new Especialidades();
        especialidad1.setEstado("A");
        especialidad1.setFecha(hoy);
        especialidad1.setNombre("Lingustica");

        especialidadao.Guardar(especialidad);
        especialidadao.Guardar(especialidad1);
    }

    public void ModificarEspecialidad() {
        Especialidades especialidad1 = new Especialidades();
        especialidad1.setEspecialidadid(2);
        especialidad1.setEstado("A");
        especialidad1.setFecha(hoy);
        especialidad1.setNombre("Linguística");

        especialidadao.Modificar(especialidad1);
    }

    public void EliminarEspecialidad() {
        Especialidades especialidad1 = new Especialidades();
        especialidad1.setEspecialidadid(1);
        especialidadao.Eliminar(especialidad1);

    }

    public void ListaEspecialidad() {
        List<Especialidades> esplist = especialidadao.getEspecialidadeslist();
        for (Especialidades esp : esplist) {
            System.out.println(esp.toString());
        }

    }

//-----------------------Facilitadores------------------------------------------------------
    public void IngresarFacilitador() {
        Facilitadores faci = new Facilitadores();
        Especialidades especialidad = new Especialidades();
        especialidad.setEspecialidadid(1);
        Bioempleados Be1 = new Bioempleados();
        Be1.setEmpleadoid(1);
        faci.setTipo("I");
        faci.setEmpleadoid(Be1);
        faci.setFechaingreso(hoy);
        faci.setCedula("0976376262");
        faci.setNombres("CARLOS ALBERTO");
        faci.setApellidos("AGUILAR SALINAS");
        faci.setDireccion("sauces 9");
        faci.setCedula("0978376762");
        faci.setEmail("c_@hotmailcom");
        faci.setEspecialidadid(especialidad);
        faci.setEstado("A");

        Facilitadores faci1 = new Facilitadores();
        Especialidades especialidad1 = new Especialidades();
        especialidad1.setEspecialidadid(2);
        Bioempleados Be2 = new Bioempleados();
        Be2.setEmpleadoid(5);
        faci1.setTipo("I");
        faci1.setEmpleadoid(Be2);
        faci1.setFechaingreso(hoy);
        faci1.setCedula("0973655145");
        faci1.setNombres("MARIO ARTURO");
        faci1.setApellidos("ALONSO VANEGAS");
        faci1.setDireccion("la 38 y portete");
        faci1.setCelular("0978376766");
        faci1.setEmail("c_@hotmailcom");
        faci1.setEspecialidadid(especialidad1);
        faci1.setEstado("A");

        Facilitadores faci5 = new Facilitadores();
        Especialidades especialidad5 = new Especialidades();
        especialidad5.setEspecialidadid(2);
        //Bioempleados Be2=new Bioempleados();
        //Be2.setEmpleadoid(5);
        faci5.setTipo("E");
        faci5.setEmpleadoid(null);
        faci5.setFechaingreso(hoy);
        faci5.setCedula("xxxxxx");
        faci5.setNombres("MARIO x");
        faci5.setApellidos("ALONSO x");
        faci5.setDireccion("portete");
        faci5.setCelular("0978376766");
        faci5.setEmail("c_@hotmailcom");
        faci5.setEspecialidadid(especialidad1);
        faci5.setEstado("A");

        facilitadordao.Guardar(faci);
        facilitadordao.Guardar(faci1);
        facilitadordao.Guardar(faci5);

    }

    public void ModificarFacilitador() {
        Facilitadores faci = new Facilitadores();
        Especialidades esp1 = new Especialidades();
        Bioempleados Be1 = new Bioempleados();
        Be1.setEmpleadoid(5);
        esp1.setEspecialidadid(2);
        faci.setFacilitadorid(2);
        faci.setTipo("I");
        faci.setEmpleadoid(Be1);
        faci.setFechaingreso(hoy);
        faci.setCedula("0976376262");
        faci.setNombres("CARLOS ALBERTO");
        faci.setApellidos("AGUILAR SALINAS");
        faci.setDireccion("sauces 9");
        faci.setCelular("0978376762");
        faci.setEmail("c_@hotmailcom");
        faci.setEspecialidadid(esp1);
        faci.setEstado("A");
        facilitadordao.Modificar(faci);
    }

    public void EliminarFacilitador() {
        Facilitadores faci = new Facilitadores();
        faci.setFacilitadorid(2);
        facilitadordao.Eliminar(faci);
    }

    public void ListaFacilitador() {
        List<Facilitadores> listfaci = facilitadordao.getFacilitadoreslist();
        for (Facilitadores fa : listfaci) {
            System.out.println(fa.toString());
        }

    }

    //-----------------------Coordinadores------------------------------------------------------   
    public void IngresarCoordinador() {
        Coordinadores coordinador = new Coordinadores();
        Bioempleados Be1 = new Bioempleados();
        Be1.setEmpleadoid(3);
        coordinador.setTipo("I");
        coordinador.setEmpleadoid(Be1);
        coordinador.setFechaingreso(hoy);
        coordinador.setCedula("0973645352");
        coordinador.setNombres("JESÚS");
        coordinador.setApellidos("AGUIRRE GARCÍA");
        coordinador.setDireccion("mucholote");
        coordinador.setCelular("0978376764");
        coordinador.setEmail("c_@hotmailcom");
        coordinador.setEstado("A");

        Coordinadores coordinador1 = new Coordinadores();
        Bioempleados Be2 = new Bioempleados();
        Be2.setEmpleadoid(9);
        coordinador1.setTipo("I");
        coordinador1.setEmpleadoid(Be2);
        coordinador1.setFechaingreso(hoy);
        coordinador1.setCedula("0973695149");
        coordinador1.setNombres("JUAN EBERTO");
        coordinador1.setApellidos("CALDERÓN COLMENERO");
        coordinador1.setDireccion("alborada 5ta etapa");
        coordinador1.setCelular("0978376770");
        coordinador1.setEmail("c_@hotmailcom");
        coordinador1.setEstado("A");

        coordinadordao.Guardar(coordinador);
        coordinadordao.Guardar(coordinador1);

    }

    public void ModificarCoordinador() {
        Coordinadores coordinador1 = new Coordinadores();
        Bioempleados Be2 = new Bioempleados();
        Be2.setEmpleadoid(15);
        coordinador1.setCoordinadorid(5);
        coordinador1.setTipo("I");
        coordinador1.setEmpleadoid(Be2);
        coordinador1.setFechaingreso(hoy);
        coordinador1.setCedula("0915451552");
        coordinador1.setNombres("ALFONSO");
        coordinador1.setApellidos("ESCOBAR IZQUIERDO");
        coordinador1.setDireccion("Sauces 9");
        coordinador1.setCelular("0978376776");
        coordinador1.setEmail("c_@hotmailcom");
        coordinador1.setEstado("A");

        coordinadordao.Modificar(coordinador1);
    }

    public void EliminarCoordinador() {
        Coordinadores coordinador1 = new Coordinadores();
        coordinador1.setCoordinadorid(2);
        coordinadordao.Eliminar(coordinador1);
    }

    public void ListaCoordinador() {
        List<Coordinadores> listacoordinador = coordinadordao.getCoordinadoreslist();
        for (Coordinadores coor : listacoordinador) {
            System.out.println(coor.toString());
        }
    }

    //------------------------Asignacion Proyectos-----------------------------------------------------   
    public void IngresarAsigProyectos() {
        Coordinadores coordinador = new Coordinadores();
        coordinador.setCoordinadorid(1);
        Proyectos pro = new Proyectos();
        pro.setProyectoid(1);
        AsigProyectos asig = new AsigProyectos();
        asig.setFecha(hoy);
        asig.setEstado("A");
        asig.setProyectoid(pro);
        asig.setCoordinadorid(coordinador);

        Coordinadores coordinador1 = new Coordinadores();
        coordinador1.setCoordinadorid(2);
        Proyectos p2 = new Proyectos();
        p2.setProyectoid(3);
        AsigProyectos asig1 = new AsigProyectos();
        asig1.setFecha(hoy);
        asig1.setEstado("A");
        asig1.setProyectoid(p2);
        asig1.setCoordinadorid(coordinador1);

        Coordinadores coordinador2 = new Coordinadores();
        coordinador2.setCoordinadorid(1);
        Proyectos p1 = new Proyectos();
        p1.setProyectoid(1);
        AsigProyectos asig2 = new AsigProyectos();
        asig2.setFecha(hoy);
        asig2.setEstado("A");
        asig2.setProyectoid(p2);
        asig2.setCoordinadorid(coordinador);

        asigproyectodao.Guardar(asig);
        asigproyectodao.Guardar(asig1);
        asigproyectodao.Guardar(asig2);
    }

    public void ModificarAsigProyectos() {
        Coordinadores coordinador1 = new Coordinadores();
        coordinador1.setCoordinadorid(2);
        Proyectos p2 = new Proyectos();
        p2.setProyectoid(1);
        AsigProyectos asig1 = new AsigProyectos();
        asig1.setFecha(hoy);
        asig1.setEstado("I");
        asig1.setProyectoid(p2);
        asig1.setCoordinadorid(coordinador1);
        asigproyectodao.Modificar(asig1);
    }

    public void EliminarAsigProyectos() {
        AsigProyectos asg1 = new AsigProyectos();
        asg1.setAsigproyectoid(2);
        asigproyectodao.Eliminar(asg1);
    }

    public void ListaAsigProyectos() {
        List<AsigProyectos> listaasigproyecto = asigproyectodao.getAsigProyectoslist();
        for (AsigProyectos asigp : listaasigproyecto) {
            System.out.println(asigp.toString());
        }

    }
    public void ListaProyectoSector(){
        Proyectos p = new Proyectos();
        p.setProyectoid(1);
         List<AsigProyectoSector> listaasigproyecto = porsecdao.getAsigProyectosByProyecto(p.getProyectoid());
        for (AsigProyectoSector asigp : listaasigproyecto) {
            System.out.println(asigp.toString());
        }
    }

    //-----------------Beneficiarios------------------------------------------------------------   
    public void IngresarBeneficiario() {
        Beneficiarios beneficiario = new Beneficiarios();
        beneficiario.setApellidos("Esponiza Murillo");
        beneficiario.setCedula("0973645352");
        beneficiario.setDireccion("Mucho Lote");
        beneficiario.setCelular("0978376764");
        beneficiario.setEmail("c_@hotmailcom");
        beneficiario.setEstado("A");
        beneficiario.setFecha(hoy);
        beneficiario.setNombres("Roony Gonzalo");

        Beneficiarios beneficiario1 = new Beneficiarios();
        beneficiario1.setApellidos("Carpio Martinez");
        beneficiario1.setCedula("0987465432");
        beneficiario1.setDireccion("Mucho Lote");
        beneficiario1.setCelular("0978342561");
        beneficiario1.setEmail("c_@hotmailcom");
        beneficiario1.setEstado("A");
        beneficiario1.setFecha(hoy);
        beneficiario1.setNombres("Jenny");

        Beneficiarios beneficiario2 = new Beneficiarios();
        beneficiario2.setApellidos("Carpio Martinez");
        beneficiario2.setCedula("0960043201");
        beneficiario2.setDireccion("Mucho Lote");
        beneficiario2.setCelular("0980326718");
        beneficiario2.setEmail("c_@hotmailcom");
        beneficiario2.setEstado("A");
        beneficiario2.setFecha(hoy);
        beneficiario2.setNombres("Tania Tamara");

        Beneficiarios beneficiario3 = new Beneficiarios();
        beneficiario3.setApellidos("XXXX");
        beneficiario3.setCedula("09");
        beneficiario3.setDireccion("dddd");
        beneficiario3.setCelular("718");
        beneficiario3.setEmail("c_@hotmailcom");
        beneficiario3.setEstado("I");
        beneficiario3.setFecha(hoy);
        beneficiario3.setNombres("Tania Tamara");

        beneficiariodao.Guardar(beneficiario);
        beneficiariodao.Guardar(beneficiario1);
        beneficiariodao.Guardar(beneficiario2);
        beneficiariodao.Guardar(beneficiario3);
    }

    public void ModificarBeneficiario() {
        Beneficiarios beneficiario1 = new Beneficiarios();
        beneficiario1.setApellidos("Carpio Martinez");
        beneficiario1.setCedula("0987465432");
        beneficiario1.setDireccion("Suces1");
        beneficiario1.setCelular("0978342561");
        beneficiario1.setEmail("c_@hotmailcom");
        beneficiario1.setEstado("I");
        beneficiario1.setFecha(hoy);
        beneficiario1.setNombres("Jose Fernando");
        beneficiariodao.Modificar(beneficiario1);
    }

    public void EliminarBeneficiario() {
        Beneficiarios beneficiario1 = new Beneficiarios();
        beneficiario1.setBeneficiarioid(3);
        beneficiariodao.Eliminar(beneficiario1);
    }

    public void ListaBeneficiario() {
        List<Beneficiarios> listabeneficiario = beneficiariodao.getBeneficiariolist();
        for (Beneficiarios beneficiar : listabeneficiario) {
            System.out.println(beneficiar.toString());
        }
    }

    //-----------------Inscripcion------------------------------------------------------------   
    public void IngresarInscripcion() {
        CabInscripciones cabins = new CabInscripciones();
        CabCapacitaciones cabcap = new CabCapacitaciones();
        CabHorarios cabhorario = new CabHorarios();

        cabhorario.setCabhorarioid(1);
        cabcap.setCabcapid(1);

        cabins.setEstado("A");
        cabins.setFecha(hoy);
        cabins.setResponsable("Johana Chevez");
        cabins.setCabcapid(cabcap);
        cabins.setCabhorariid(cabhorario);

        //-----------------Detalle De Inscripcion-----------------------------------------------------------   
        DetaInscripciones detalleinscrip = new DetaInscripciones();
        DetaInscripciones detalleinscrip1 = new DetaInscripciones();
        DetaInscripciones detalleinscrip2 = new DetaInscripciones();
        DetaInscripciones detalleinscrip3 = new DetaInscripciones();

        DetaInscripcionesPK dipk = new DetaInscripcionesPK();
        DetaInscripcionesPK dipk1 = new DetaInscripcionesPK();
        DetaInscripcionesPK dipk2 = new DetaInscripcionesPK();
        DetaInscripcionesPK dipk3 = new DetaInscripcionesPK();

        Beneficiarios beneficiario = new Beneficiarios();
        Beneficiarios beneficiario1 = new Beneficiarios();
        Beneficiarios beneficiario2 = new Beneficiarios();
        Beneficiarios beneficiario3 = new Beneficiarios();

        beneficiario.setBeneficiarioid(1);
        beneficiario1.setBeneficiarioid(2);
        beneficiario2.setBeneficiarioid(3);
        beneficiario3.setBeneficiarioid(4);

        dipk.setDetainsid(1);
        dipk1.setDetainsid(2);
        dipk2.setDetainsid(3);
        dipk3.setDetainsid(4);

        detalleinscrip.setCabInscr(cabins);
        detalleinscrip.setDetainscripcionesPk(dipk);
        detalleinscrip.setBeneficiarioid(beneficiario);

        detalleinscrip1.setCabInscr(cabins);
        detalleinscrip1.setDetainscripcionesPk(dipk1);
        detalleinscrip1.setBeneficiarioid(beneficiario1);

        detalleinscrip2.setCabInscr(cabins);
        detalleinscrip2.setDetainscripcionesPk(dipk2);
        detalleinscrip2.setBeneficiarioid(beneficiario2);

        detalleinscrip3.setCabInscr(cabins);
        detalleinscrip3.setDetainscripcionesPk(dipk3);
        detalleinscrip3.setBeneficiarioid(beneficiario3);

        cabins.addDetalle(detalleinscrip);
        cabins.addDetalle(detalleinscrip1);
        cabins.addDetalle(detalleinscrip2);
        cabins.addDetalle(detalleinscrip3);

        cabinscripcion.Guardar(cabins);
    }

    public void ListaInscripcion() {
        List<CabInscripciones> lista = cabinscripcion.getCabinscripcioneslist();
        for (CabInscripciones ci : lista) {
            System.out.println(ci.toString());
        }

    }

    //-----------------Asistencia------------------------------------------------------------       
    public void IngresarAsistencia() {
        CabAsistencias asisten = new CabAsistencias();
        CabInscripciones cabins = new CabInscripciones();
        cabins.setCabinscripcionid(1);

        asisten.setEstado("A");
        asisten.setFecha(hoy);
        asisten.setCabinscripcionid(cabins);

        //-----------------Detalle Asistencia--------------------------------------------------------       
        DetaAsistencias deta = new DetaAsistencias();
        DetaAsistencias deta1 = new DetaAsistencias();
        DetaAsistencias deta2 = new DetaAsistencias();
        DetaAsistencias deta3 = new DetaAsistencias();

        DetaAsistenciasPK dapk = new DetaAsistenciasPK();
        DetaAsistenciasPK dapk1 = new DetaAsistenciasPK();
        DetaAsistenciasPK dapk2 = new DetaAsistenciasPK();
        DetaAsistenciasPK dapk3 = new DetaAsistenciasPK();

        Beneficiarios beneficiario = new Beneficiarios();
        Beneficiarios beneficiario1 = new Beneficiarios();
        Beneficiarios beneficiario2 = new Beneficiarios();
        Beneficiarios beneficiario3 = new Beneficiarios();

        beneficiario.setBeneficiarioid(1);
        beneficiario1.setBeneficiarioid(2);
        beneficiario2.setBeneficiarioid(3);
        beneficiario3.setBeneficiarioid(4);

        dapk.setDetasistenciaid(1);
        dapk1.setDetasistenciaid(2);
        dapk2.setDetasistenciaid(3);
        dapk3.setDetasistenciaid(4);

        deta.setCabAsis(asisten);
        deta.setDetasistendiasPk(dapk);
        deta.setAsistencia(true);
        deta.setBeneficiarioid(beneficiario);

        deta1.setCabAsis(asisten);
        deta1.setDetasistendiasPk(dapk1);
        deta1.setAsistencia(true);
        deta1.setBeneficiarioid(beneficiario1);

        deta2.setCabAsis(asisten);
        deta2.setDetasistendiasPk(dapk2);
        deta2.setAsistencia(true);
        deta2.setBeneficiarioid(beneficiario2);

        deta3.setCabAsis(asisten);
        deta3.setDetasistendiasPk(dapk3);
        deta3.setAsistencia(true);
        deta3.setBeneficiarioid(beneficiario3);

        asisten.addDetalle(deta);
        asisten.addDetalle(deta1);
        asisten.addDetalle(deta2);
        asisten.addDetalle(deta3);

        cabasistencia.Guadar(asisten);
    }

    public void ListaAsistencia() {
        List<CabAsistencias> lista = cabasistencia.getCabasistenciaslist();
        for (CabAsistencias ca : lista) {
            System.out.println(ca.toString());
        }
    }

    //-------------------Planificacion Actividad----------------------------------------------------------
    public void IngresarPlanificacion() {
        PlanificacionActividades p = new PlanificacionActividades();
        CabAgendas cabagenda = new CabAgendas();
        cabagenda.setCabagendaid(1);

        p.setActividad("Revisión de documentos de la población con la que se va a trabajar");
        p.setFecha(hoy);
        p.setLugar("Fundación Nurtac");
        p.setObjetivo("Verificación de datos de los usuarios en sus respectivas carpetas y solicitar documentos para actualización");
        p.setResultados("Conocer quienes tienen sus documentos completos y a quienes les falta documentación para armar la información completa");
        p.setTipo("I");
        p.setCabagendaid(cabagenda);

        PlanificacionActividades p1 = new PlanificacionActividades();
        CabAgendas cabagenda1 = new CabAgendas();
        cabagenda1.setCabagendaid(1);

        p1.setActividad("Revisión de documentos de la población con la que se va a trabajar");
        p1.setFecha(hoy);
        p1.setLugar("Fundación Nurtac");
        p1.setObjetivo("Verificación de datos de los usuarios en sus respectivas carpetas y solicitar documentos para actualización");
        p1.setResultados("Conocer quienes tienen sus documentos completos y a quienes les falta documentación para armar la información completa");
        p1.setTipo("E");
        p1.setCabagendaid(cabagenda);
        planidao.Guardar(p1);
    }

    public void ModificarPlanificacion() {
        PlanificacionActividades p = new PlanificacionActividades();
        CabAgendas cabagenda1 = new CabAgendas();
        cabagenda1.setCabagendaid(1);
        p.setPlanificacionid(3);
        p.setActividad("XXXXXXXXXXXXXXX");
        p.setFecha(hoy);
        p.setLugar("Fundación Nurtac");
        p.setObjetivo("Verificación");
        p.setResultados("Conocer");
        p.setTipo("E");
        p.setCabagendaid(cabagenda1);
        planidao.Modificar(p);
    }

    public void EliminarPlanificacion() {
        PlanificacionActividades p = new PlanificacionActividades();
        p.setPlanificacionid(2);
        planidao.Eliminar(p);
    }

    public void ListaPlanificacion() {
        List<PlanificacionActividades> lista = planidao.getPlanfActividadeslist();
        for (PlanificacionActividades ca : lista) {
            System.out.println(ca.toString());
        }
    }

    //-------------------Registro de Agenda----------------------------------------------------------
    public void IngresarAgenda() {
        CabAgendas cabagenda = new CabAgendas();
        ModulosCapacitaciones modcap = new ModulosCapacitaciones();
        ModulosCapacitacionesPK modpk = new ModulosCapacitacionesPK();
        modpk.setCabcapid(1);
        modpk.setModuloid(2);
        modcap.setModulocap(modpk);

        cabagenda.setModuloid(modcap);
        cabagenda.setDia(2);
        cabagenda.setEstado("A");
        cabagenda.setFecha(hoy);

        //--------------------Detalle de Agenda------------------------------------------------------------
        DetaAgendas deta1 = new DetaAgendas();
        DetaAgendas deta2 = new DetaAgendas();
        DetaAgendas deta3 = new DetaAgendas();
        DetaAgendasPK agpk1 = new DetaAgendasPK();
        DetaAgendasPK agpk2 = new DetaAgendasPK();
        DetaAgendasPK agpk3 = new DetaAgendasPK();

        agpk1.setDetagendaid(1);
        agpk2.setDetagendaid(2);
        agpk3.setDetagendaid(3);

        deta1.setDetagendapk(agpk1);
        deta1.setActividad("Bienvenida");
        deta1.setEstrategia("Prsentacion de los tutores");
        deta1.setHorainicio("08:30");
        deta1.setHorafin("09:00");
        deta1.setResponsable("Xavier Moreira");

        deta2.setDetagendapk(agpk2);
        deta2.setActividad("Presentacion de lo Temas");
        deta2.setEstrategia("Dias positivas");
        deta2.setHorainicio("09:10");
        deta2.setHorafin("10:00");
        deta2.setResponsable("Facilicitadores");

        deta3.setDetagendapk(agpk3);
        deta3.setActividad("Refrigerios");
        deta3.setEstrategia("Brindar Alimentos");
        deta3.setHorainicio("10:00");
        deta3.setHorafin("10:30");
        deta3.setResponsable("Facilitadores");

        cabagenda.addDetalle(deta1);
        cabagenda.addDetalle(deta2);
        cabagenda.addDetalle(deta3);

        cabagendadao.Guardar(cabagenda);

    }

}
