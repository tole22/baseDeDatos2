package util;

import javax.jdo.PersistenceManager;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import modelo.*;

/**
 * Las instancias de esta clase se utilizan para pre-cargar una base de datos
 * para que la ejecución de la aplicación tenga ciertos datos necesarios.
 * 
 * @author Catedra de BBDD2 bbdd2_2012@gruposyahoo.com.ar
 * 
 */
public class DBLoader {

	/**
	 * Constructor.
	 */
	public DBLoader() {

	}

	/**
	 * Crea los objeto esenciales del modelo necesario para arrancar la
	 * aplicación.
	 */
	public static void createObjects()  throws ParseException {
		DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd");

		/* Empleados */
		Date d1 = dfm.parse("1957-05-15");
		Empleado e1 = new Empleado("Santiago Peralta", d1, "25-22502889-5");
		Date d2 = dfm.parse("1953-09-10");
		Empleado e2 = new Empleado("Gustavo Rojas", d2, "25-15163646-7");
		Date d3 = dfm.parse("1959-04-07");
		Empleado e3 = new Empleado("Santino Vazquez", d3, "21-22382627-6");
		Date d4 = dfm.parse("1983-09-05");
		Empleado e4 = new Empleado("Pablo Velazquez", d4, "21-16037824-9");
		Date d5 = dfm.parse("1982-02-25");
		Empleado e5 = new Empleado("Fabian Blanco", d5, "25-18536371-9");
		Date d6 = dfm.parse("1969-04-11");
		Empleado e6 = new Empleado("Lucas Diaz", d6, "21-27266087-7");
		Date d7 = dfm.parse("1982-10-16");
		Empleado e7 = new Empleado("Lautaro Garcia", d7, "23-15843602-2");
		Date d8 = dfm.parse("1951-11-10");
		Empleado e8 = new Empleado("Lautaro Mendoza", d8, "22-29907218-3");
		Date d9 = dfm.parse("1951-04-27");
		Empleado e9 = new Empleado("Diego Montenegro", d9, "24-16643897-4");
		Date d10 = dfm.parse("1978-04-05");
		Empleado e10 = new Empleado("Julian Paez", d10, "20-19608531-3");
		Date d11 = dfm.parse("1962-01-31");
		Empleado e11 = new Empleado("Juan Velazquez", d11, "24-19783752-4");
		Date d12 = dfm.parse("1971-07-04");
		Empleado e12 = new Empleado("Juan Chavez", d12, "25-16072570-7");
		Date d13 = dfm.parse("1985-02-25");
		Empleado e13 = new Empleado("Julian Caceres", d13, "22-25189011-1");
		Date d14 = dfm.parse("1981-05-15");
		Empleado e14 = new Empleado("Sebastian Barrios", d14, "22-11807000-2");
		Date d15 = dfm.parse("1970-09-14");
		Empleado e15 = new Empleado("Matias Gutierrez", d15, "23-28574926-6");
		Date d16 = dfm.parse("1964-08-16");
		Empleado e16 = new Empleado("Daniel Herrera", d16, "21-21744717-6");
		Date d17 = dfm.parse("1957-02-03");
		Empleado e17 = new Empleado("Juan Gonzalez", d17, "20-25403934-9");
		Date d18 = dfm.parse("1961-04-04");
		Empleado e18 = new Empleado("Diego Castillo", d18, "20-13915875-9");
		Date d19 = dfm.parse("1973-05-26");
		Empleado e19 = new Empleado("Fabio Franco", d19, "22-24917278-7");
		Date d20 = dfm.parse("1956-11-19");
		Empleado e20 = new Empleado("Lautaro Gimenez", d20, "22-24223190-7");
		Date d21 = dfm.parse("1971-07-10");
		Empleado e21 = new Empleado("Diego Maldonado", d21, "25-25146961-8");
		Date d22 = dfm.parse("1957-06-13");
		Empleado e22 = new Empleado("Francisco Soria", d22, "22-19031897-3");
		Date d23 = dfm.parse("1977-02-23");
		Empleado e23 = new Empleado("Lucas Cabrera", d23, "24-23777239-9");
		Date d24 = dfm.parse("1975-08-27");
		Empleado e24 = new Empleado("Fabian Moreno", d24, "24-20427906-1");
		Date d25 = dfm.parse("1976-06-10");
		Empleado e25 = new Empleado("Daniel Benitez", d25, "20-16831193-5");
		Date d26 = dfm.parse("1970-03-27");
		Empleado e26 = new Empleado("Juan Ortiz", d26, "20-29966477-3");
		Date d27 = dfm.parse("1954-08-01");
		Empleado e27 = new Empleado("Lautaro Duarte", d27, "22-23426273-9");
		Date d28 = dfm.parse("1970-04-24");
		Empleado e28 = new Empleado("Gabriel Lopez", d28, "21-19556393-2");
		Date d29 = dfm.parse("1974-02-25");
		Empleado e29 = new Empleado("Federico Godoy", d29, "24-22932916-5");
		Date d30 = dfm.parse("1986-08-02");
		Empleado e30 = new Empleado("Ricardo Fernandez", d30, "21-24157974-2");

		/* Jefes */
		Date jd1 = dfm.parse("1986-12-10");
		Empleado j1 = new Empleado("Valentino Molina", jd1, "24-14325133-2");
		Date jd2 = dfm.parse("1967-05-18");
		Empleado j2 = new Empleado("Guillermo Campos", jd2, "20-29520392-9");
		Date jd3 = dfm.parse("1959-09-11");
		Empleado j3 = new Empleado("Marcos Arce", jd3, "20-23123675-8");
		Date jd4 = dfm.parse("1956-06-01");
		Empleado j4 = new Empleado("Guillermo Soto", jd4, "21-16097983-5");

		/* Asignacion de jefes */
		e1.asignarJefe(j3);
		e2.asignarJefe(j2);
		e3.asignarJefe(j1);
		e4.asignarJefe(j3);
		e5.asignarJefe(j2);
		e6.asignarJefe(j1);
		e7.asignarJefe(j2);
		e8.asignarJefe(j3);
		e9.asignarJefe(j4);
		e10.asignarJefe(j3);
		e11.asignarJefe(j1);
		e12.asignarJefe(j2);
		e13.asignarJefe(j4);
		e14.asignarJefe(j1);
		e15.asignarJefe(j3);
		e16.asignarJefe(j2);
		e17.asignarJefe(j1);
		e18.asignarJefe(j3);
		e19.asignarJefe(j1);
		e20.asignarJefe(j3);
		e21.asignarJefe(j1);
		e22.asignarJefe(j1);
		e23.asignarJefe(j1);
		e24.asignarJefe(j2);
		e25.asignarJefe(j4);
		e26.asignarJefe(j4);
		e27.asignarJefe(j1);
		e28.asignarJefe(j4);
		e29.asignarJefe(j3);
		e30.asignarJefe(j1);

		/* Transportes */
		Camioneta transporte1 = new Camioneta();
		transporte1.setPatente("OQZ829");
		transporte1.setPesoMaximo(800);
		Camioneta transporte2 = new Camioneta();
		transporte2.setPatente("BAI851");
		transporte2.setPesoMaximo(700);
		Camioneta transporte3 = new Camioneta();
		transporte3.setPatente("ZTA660");
		transporte3.setPesoMaximo(600);
		Camioneta transporte4 = new Camioneta();
		transporte4.setPatente("XRG635");
		transporte4.setPesoMaximo(800);
		Camion transporte5 = new Camion();
		transporte5.setPatente("VEH494");
		transporte5.setPesoMaximo(3700);
		Camion transporte6 = new Camion();
		transporte6.setPatente("TVA579");
		transporte6.setPesoMaximo(5000);
		Camion transporte7 = new Camion();
		transporte7.setPatente("NOR585");
		transporte7.setPesoMaximo(3400);

		/* Empresa */
		ArrayList<Transporte> transportes = new ArrayList<Transporte>();
		transportes.add(transporte1);
		transportes.add(transporte2);
		transportes.add(transporte3);
		transportes.add(transporte4);
		transportes.add(transporte5);
		transportes.add(transporte6);
		transportes.add(transporte7);
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		empleados.add(e1);
		empleados.add(e2);
		empleados.add(e3);
		empleados.add(e4);
		empleados.add(e5);
		empleados.add(e6);
		empleados.add(e7);
		empleados.add(e8);
		empleados.add(e9);
		empleados.add(e10);
		empleados.add(e11);
		empleados.add(e12);
		empleados.add(e13);
		empleados.add(e14);
		empleados.add(e15);
		empleados.add(e16);
		empleados.add(e17);
		empleados.add(e18);
		empleados.add(e19);
		empleados.add(e20);
		empleados.add(e21);
		empleados.add(e22);
		empleados.add(e23);
		empleados.add(e24);
		empleados.add(e25);
		empleados.add(e26);
		empleados.add(e27);
		empleados.add(e28);
		empleados.add(e29);
		empleados.add(e30);
		empleados.add(j1);
		empleados.add(j2);
		empleados.add(j3);
		empleados.add(j4);
		EmpresaDeMudanzas emp = new EmpresaDeMudanzas(transportes, new ArrayList<Mudanza>(),new ArrayList<Mudanza>(),empleados,j1);

		/************/
		/* Mudanzas */
		/************/

		/* Mudanza 1*/
		ArrayList<RolEmpleado> emple1 = new ArrayList<RolEmpleado>();
		Ayudante a11 = new Ayudante(e10);
		emple1.add(a11);
		Ayudante a12 = new Ayudante(e3);
		emple1.add(a12);
		Ayudante a13 = new Ayudante(e20);
		emple1.add(a13);
		Conductor c11 = new Conductor(e2, transporte6);
		emple1.add(c11);
		Date md1 = dfm.parse("2011-05-12");
		Mudanza m1 = new Mudanza(emple1, "Calle 34 #1691", md1, 7);
		emp.getPendientes().add(m1);
		emp.finalizarMudanza(m1);

		/* Mudanza 2*/
		ArrayList<RolEmpleado> emple2 = new ArrayList<RolEmpleado>();
		Ayudante a21 = new Ayudante(e13);
		emple2.add(a21);
		Ayudante a22 = new Ayudante(e26);
		emple2.add(a22);
		Conductor c21 = new Conductor(e16, transporte5);
		emple2.add(c21);
		Date md2 = dfm.parse("2012-01-01");
		Mudanza m2 = new Mudanza(emple2, "Calle 23 #569", md2, 5);
		emp.getPendientes().add(m2);
		emp.finalizarMudanza(m2);

		/* Mudanza 3*/
		ArrayList<RolEmpleado> emple3 = new ArrayList<RolEmpleado>();
		Ayudante a31 = new Ayudante(e29);
		emple3.add(a31);
		Ayudante a32 = new Ayudante(e10);
		emple3.add(a32);
		Ayudante a33 = new Ayudante(e12);
		emple3.add(a33);
		Conductor c31 = new Conductor(e11, transporte6);
		emple3.add(c31);
		Date md3 = dfm.parse("2010-04-19");
		Mudanza m3 = new Mudanza(emple3, "Calle 62 #1700", md3, 6);
		emp.getPendientes().add(m3);
		emp.finalizarMudanza(m3);

		/* Mudanza 4*/
		ArrayList<RolEmpleado> emple4 = new ArrayList<RolEmpleado>();
		Ayudante a41 = new Ayudante(e16);
		emple4.add(a41);
		Ayudante a42 = new Ayudante(e9);
		emple4.add(a42);
		Ayudante a43 = new Ayudante(e28);
		emple4.add(a43);
		Ayudante a44 = new Ayudante(e22);
		emple4.add(a44);
		Conductor c41 = new Conductor(e1, transporte1);
		emple4.add(c41);
		Date md4 = dfm.parse("2009-04-10");
		Mudanza m4 = new Mudanza(emple4, "Calle 58 #1943", md4, 6);
		emp.getPendientes().add(m4);
		emp.finalizarMudanza(m4);

		/* Mudanza 5*/
		ArrayList<RolEmpleado> emple5 = new ArrayList<RolEmpleado>();
		Ayudante a51 = new Ayudante(e13);
		emple5.add(a51);
		Conductor c51 = new Conductor(e2, transporte4);
		emple5.add(c51);
		Date md5 = dfm.parse("2010-09-28");
		Mudanza m5 = new Mudanza(emple5, "Calle 44 #150", md5, 6);
		emp.getPendientes().add(m5);
		emp.finalizarMudanza(m5);

		/* Mudanza 6*/
		ArrayList<RolEmpleado> emple6 = new ArrayList<RolEmpleado>();
		Ayudante a61 = new Ayudante(e17);
		emple6.add(a61);
		Conductor c61 = new Conductor(e27, transporte5);
		emple6.add(c61);
		Date md6 = dfm.parse("2009-11-27");
		Mudanza m6 = new Mudanza(emple6, "Calle 14 #1817", md6, 3);
		emp.getPendientes().add(m6);
		emp.finalizarMudanza(m6);

		/* Mudanza 7*/
		ArrayList<RolEmpleado> emple7 = new ArrayList<RolEmpleado>();
		Ayudante a71 = new Ayudante(e1);
		emple7.add(a71);
		Conductor c71 = new Conductor(e11, transporte2);
		emple7.add(c71);
		Conductor c72 = new Conductor(e30, transporte6);
		emple7.add(c72);
		Date md7 = dfm.parse("2010-01-27");
		Mudanza m7 = new Mudanza(emple7, "Calle 4 #710", md7, 3);
		emp.getPendientes().add(m7);
		emp.finalizarMudanza(m7);

		/* Mudanza 8*/
		ArrayList<RolEmpleado> emple8 = new ArrayList<RolEmpleado>();
		Ayudante a81 = new Ayudante(e15);
		emple8.add(a81);
		Ayudante a82 = new Ayudante(e26);
		emple8.add(a82);
		Ayudante a83 = new Ayudante(e11);
		emple8.add(a83);
		Conductor c81 = new Conductor(e15, transporte4);
		emple8.add(c81);
		Date md8 = dfm.parse("2012-05-23");
		Mudanza m8 = new Mudanza(emple8, "Calle 40 #812", md8, 1);
		emp.getPendientes().add(m8);

		/* Mudanza 9*/
		ArrayList<RolEmpleado> emple9 = new ArrayList<RolEmpleado>();
		Ayudante a91 = new Ayudante(e3);
		emple9.add(a91);
		Ayudante a92 = new Ayudante(e17);
		emple9.add(a92);
		Ayudante a93 = new Ayudante(e12);
		emple9.add(a93);
		Conductor c91 = new Conductor(e8, transporte1);
		emple9.add(c91);
		Conductor c92 = new Conductor(e16, transporte5);
		emple9.add(c92);
		Date md9 = dfm.parse("2011-05-31");
		Mudanza m9 = new Mudanza(emple9, "Calle 42 #1554", md9, 3);
		emp.getPendientes().add(m9);
		emp.finalizarMudanza(m9);

		/* Mudanza 10*/
		ArrayList<RolEmpleado> emple10 = new ArrayList<RolEmpleado>();
		Ayudante a101 = new Ayudante(e9);
		emple10.add(a101);
		Ayudante a102 = new Ayudante(e12);
		emple10.add(a102);
		Conductor c101 = new Conductor(e17, transporte4);
		emple10.add(c101);
		Date md10 = dfm.parse("2011-08-24");
		Mudanza m10 = new Mudanza(emple10, "Calle 56 #928", md10, 6);
		emp.getPendientes().add(m10);
		emp.finalizarMudanza(m10);

		/* Mudanza 11*/
		ArrayList<RolEmpleado> emple11 = new ArrayList<RolEmpleado>();
		Ayudante a111 = new Ayudante(e30);
		emple11.add(a111);
		Ayudante a112 = new Ayudante(e3);
		emple11.add(a112);
		Conductor c111 = new Conductor(e26, transporte1);
		emple11.add(c111);
		Conductor c112 = new Conductor(e18, transporte4);
		emple11.add(c112);
		Date md11 = dfm.parse("2012-06-03");
		Mudanza m11 = new Mudanza(emple11, "Calle 25 #1303", md11, 7);
		emp.getPendientes().add(m11);

		/* Mudanza 12*/
		ArrayList<RolEmpleado> emple12 = new ArrayList<RolEmpleado>();
		Ayudante a121 = new Ayudante(e20);
		emple12.add(a121);
		Ayudante a122 = new Ayudante(e30);
		emple12.add(a122);
		Conductor c121 = new Conductor(e3, transporte2);
		emple12.add(c121);
		Date md12 = dfm.parse("2012-08-15");
		Mudanza m12 = new Mudanza(emple12, "Calle 19 #1077", md12, 4);
		emp.getPendientes().add(m12);

		/* Mudanza 13*/
		ArrayList<RolEmpleado> emple13 = new ArrayList<RolEmpleado>();
		Ayudante a131 = new Ayudante(e23);
		emple13.add(a131);
		Conductor c131 = new Conductor(e9, transporte2);
		emple13.add(c131);
		Conductor c132 = new Conductor(e26, transporte6);
		emple13.add(c132);
		Date md13 = dfm.parse("2010-02-25");
		Mudanza m13 = new Mudanza(emple13, "Calle 61 #1042", md13, 1);
		emp.getPendientes().add(m13);
		emp.finalizarMudanza(m13);

		/* Mudanza 14*/
		ArrayList<RolEmpleado> emple14 = new ArrayList<RolEmpleado>();
		Ayudante a141 = new Ayudante(e15);
		emple14.add(a141);
		Conductor c141 = new Conductor(e12, transporte5);
		emple14.add(c141);
		Date md14 = dfm.parse("2010-03-09");
		Mudanza m14 = new Mudanza(emple14, "Calle 25 #1498", md14, 7);
		emp.getPendientes().add(m14);
		emp.finalizarMudanza(m14);

		/* Mudanza 15*/
		ArrayList<RolEmpleado> emple15 = new ArrayList<RolEmpleado>();
		Ayudante a151 = new Ayudante(e3);
		emple15.add(a151);
		Ayudante a152 = new Ayudante(e28);
		emple15.add(a152);
		Conductor c151 = new Conductor(e24, transporte5);
		emple15.add(c151);
		Date md15 = dfm.parse("2011-09-15");
		Mudanza m15 = new Mudanza(emple15, "Calle 17 #828", md15, 1);
		emp.getPendientes().add(m15);
		emp.finalizarMudanza(m15);

		/* Mudanza 16*/
		ArrayList<RolEmpleado> emple16 = new ArrayList<RolEmpleado>();
		Ayudante a161 = new Ayudante(e28);
		emple16.add(a161);
		Conductor c161 = new Conductor(e5, transporte2);
		emple16.add(c161);
		Date md16 = dfm.parse("2008-12-29");
		Mudanza m16 = new Mudanza(emple16, "Calle 62 #72", md16, 3);
		emp.getPendientes().add(m16);
		emp.finalizarMudanza(m16);

		/* Mudanza 17*/
		ArrayList<RolEmpleado> emple17 = new ArrayList<RolEmpleado>();
		Ayudante a171 = new Ayudante(e23);
		emple17.add(a171);
		Conductor c171 = new Conductor(e26, transporte6);
		emple17.add(c171);
		Date md17 = dfm.parse("2009-04-04");
		Mudanza m17 = new Mudanza(emple17, "Calle 9 #1662", md17, 2);
		emp.getPendientes().add(m17);
		emp.finalizarMudanza(m17);

		/* Mudanza 18*/
		ArrayList<RolEmpleado> emple18 = new ArrayList<RolEmpleado>();
		Ayudante a181 = new Ayudante(e17);
		emple18.add(a181);
		Ayudante a182 = new Ayudante(e6);
		emple18.add(a182);
		Ayudante a183 = new Ayudante(e14);
		emple18.add(a183);
		Conductor c181 = new Conductor(e15, transporte6);
		emple18.add(c181);
		Date md18 = dfm.parse("2010-04-20");
		Mudanza m18 = new Mudanza(emple18, "Calle 20 #1594", md18, 4);
		emp.getPendientes().add(m18);
		emp.finalizarMudanza(m18);

		/* Mudanza 19*/
		ArrayList<RolEmpleado> emple19 = new ArrayList<RolEmpleado>();
		Ayudante a191 = new Ayudante(e30);
		emple19.add(a191);
		Conductor c191 = new Conductor(e29, transporte5);
		emple19.add(c191);
		Date md19 = dfm.parse("2012-03-01");
		Mudanza m19 = new Mudanza(emple19, "Calle 72 #853", md19, 6);
		emp.getPendientes().add(m19);
		emp.finalizarMudanza(m19);

		/* Mudanza 20*/
		ArrayList<RolEmpleado> emple20 = new ArrayList<RolEmpleado>();
		Ayudante a201 = new Ayudante(e6);
		emple20.add(a201);
		Conductor c201 = new Conductor(e26, transporte6);
		emple20.add(c201);
		Date md20 = dfm.parse("2012-07-17");
		Mudanza m20 = new Mudanza(emple20, "Calle 65 #814", md20, 2);
		emp.getPendientes().add(m20);

		/* Mudanza 21*/
		ArrayList<RolEmpleado> emple21 = new ArrayList<RolEmpleado>();
		Ayudante a211 = new Ayudante(e23);
		emple21.add(a211);
		Ayudante a212 = new Ayudante(e19);
		emple21.add(a212);
		Conductor c211 = new Conductor(e9, transporte6);
		emple21.add(c211);
		Date md21 = dfm.parse("2011-10-06");
		Mudanza m21 = new Mudanza(emple21, "Calle 35 #1071", md21, 5);
		emp.getPendientes().add(m21);
		emp.finalizarMudanza(m21);

		/* Mudanza 22*/
		ArrayList<RolEmpleado> emple22 = new ArrayList<RolEmpleado>();
		Ayudante a221 = new Ayudante(e29);
		emple22.add(a221);
		Ayudante a222 = new Ayudante(e19);
		emple22.add(a222);
		Conductor c221 = new Conductor(e14, transporte2);
		emple22.add(c221);
		Date md22 = dfm.parse("2012-03-20");
		Mudanza m22 = new Mudanza(emple22, "Calle 72 #1572", md22, 2);
		emp.getPendientes().add(m22);
		emp.finalizarMudanza(m22);

		/* Mudanza 23*/
		ArrayList<RolEmpleado> emple23 = new ArrayList<RolEmpleado>();
		Ayudante a231 = new Ayudante(e19);
		emple23.add(a231);
		Conductor c231 = new Conductor(e5, transporte5);
		emple23.add(c231);
		Date md23 = dfm.parse("2011-09-26");
		Mudanza m23 = new Mudanza(emple23, "Calle 32 #1330", md23, 4);
		emp.getPendientes().add(m23);
		emp.finalizarMudanza(m23);

		/* Mudanza 24*/
		ArrayList<RolEmpleado> emple24 = new ArrayList<RolEmpleado>();
		Ayudante a241 = new Ayudante(e6);
		emple24.add(a241);
		Conductor c241 = new Conductor(e10, transporte1);
		emple24.add(c241);
		Date md24 = dfm.parse("2009-04-23");
		Mudanza m24 = new Mudanza(emple24, "Calle 51 #269", md24, 2);
		emp.getPendientes().add(m24);
		emp.finalizarMudanza(m24);

		/* Mudanza 25*/
		ArrayList<RolEmpleado> emple25 = new ArrayList<RolEmpleado>();
		Ayudante a251 = new Ayudante(e30);
		emple25.add(a251);
		Conductor c251 = new Conductor(e11, transporte6);
		emple25.add(c251);
		Date md25 = dfm.parse("2009-09-11");
		Mudanza m25 = new Mudanza(emple25, "Calle 28 #1476", md25, 1);
		emp.getPendientes().add(m25);
		emp.finalizarMudanza(m25);

		/* Mudanza 26*/
		ArrayList<RolEmpleado> emple26 = new ArrayList<RolEmpleado>();
		Ayudante a261 = new Ayudante(e14);
		emple26.add(a261);
		Ayudante a262 = new Ayudante(e14);
		emple26.add(a262);
		Ayudante a263 = new Ayudante(e13);
		emple26.add(a263);
		Conductor c261 = new Conductor(e23, transporte2);
		emple26.add(c261);
		Conductor c262 = new Conductor(e4, transporte6);
		emple26.add(c262);
		Date md26 = dfm.parse("2009-03-31");
		Mudanza m26 = new Mudanza(emple26, "Calle 19 #442", md26, 3);
		emp.getPendientes().add(m26);
		emp.finalizarMudanza(m26);

		/* Mudanza 27*/
		ArrayList<RolEmpleado> emple27 = new ArrayList<RolEmpleado>();
		Ayudante a271 = new Ayudante(e13);
		emple27.add(a271);
		Ayudante a272 = new Ayudante(e18);
		emple27.add(a272);
		Ayudante a273 = new Ayudante(e19);
		emple27.add(a273);
		Ayudante a274 = new Ayudante(e1);
		emple27.add(a274);
		Conductor c271 = new Conductor(e25, transporte3);
		emple27.add(c271);
		Date md27 = dfm.parse("2011-12-04");
		Mudanza m27 = new Mudanza(emple27, "Calle 67 #1499", md27, 5);
		emp.getPendientes().add(m27);
		emp.finalizarMudanza(m27);

		/* Mudanza 28*/
		ArrayList<RolEmpleado> emple28 = new ArrayList<RolEmpleado>();
		Ayudante a281 = new Ayudante(e2);
		emple28.add(a281);
		Ayudante a282 = new Ayudante(e20);
		emple28.add(a282);
		Conductor c281 = new Conductor(e13, transporte3);
		emple28.add(c281);
		Conductor c282 = new Conductor(e22, transporte2);
		emple28.add(c282);
		Date md28 = dfm.parse("2012-01-08");
		Mudanza m28 = new Mudanza(emple28, "Calle 50 #1844", md28, 5);
		emp.getPendientes().add(m28);
		emp.finalizarMudanza(m28);

		/* Mudanza 29*/
		ArrayList<RolEmpleado> emple29 = new ArrayList<RolEmpleado>();
		Ayudante a291 = new Ayudante(e8);
		emple29.add(a291);
		Ayudante a292 = new Ayudante(e17);
		emple29.add(a292);
		Conductor c291 = new Conductor(e24, transporte4);
		emple29.add(c291);
		Conductor c292 = new Conductor(e7, transporte3);
		emple29.add(c292);
		Date md29 = dfm.parse("2009-03-06");
		Mudanza m29 = new Mudanza(emple29, "Calle 57 #1947", md29, 4);
		emp.getPendientes().add(m29);
		emp.finalizarMudanza(m29);

		/* Mudanza 30*/
		ArrayList<RolEmpleado> emple30 = new ArrayList<RolEmpleado>();
		Ayudante a301 = new Ayudante(e13);
		emple30.add(a301);
		Ayudante a302 = new Ayudante(e25);
		emple30.add(a302);
		Conductor c301 = new Conductor(e13, transporte1);
		emple30.add(c301);
		Date md30 = dfm.parse("2011-05-05");
		Mudanza m30 = new Mudanza(emple30, "Calle 18 #1214", md30, 1);
		emp.getPendientes().add(m30);
		emp.finalizarMudanza(m30);

		/* Mudanza 31*/
		ArrayList<RolEmpleado> emple31 = new ArrayList<RolEmpleado>();
		Ayudante a311 = new Ayudante(e20);
		emple31.add(a311);
		Ayudante a312 = new Ayudante(e19);
		emple31.add(a312);
		Conductor c311 = new Conductor(e30, transporte6);
		emple31.add(c311);
		Conductor c312 = new Conductor(e15, transporte6);
		emple31.add(c312);
		Date md31 = dfm.parse("2010-01-22");
		Mudanza m31 = new Mudanza(emple31, "Calle 42 #1722", md31, 3);
		emp.getPendientes().add(m31);
		emp.finalizarMudanza(m31);

		/* Mudanza 32*/
		ArrayList<RolEmpleado> emple32 = new ArrayList<RolEmpleado>();
		Ayudante a321 = new Ayudante(e29);
		emple32.add(a321);
		Ayudante a322 = new Ayudante(e7);
		emple32.add(a322);
		Conductor c321 = new Conductor(e22, transporte1);
		emple32.add(c321);
		Date md32 = dfm.parse("2009-12-21");
		Mudanza m32 = new Mudanza(emple32, "Calle 58 #1954", md32, 3);
		emp.getPendientes().add(m32);
		emp.finalizarMudanza(m32);

		/* Mudanza 33*/
		ArrayList<RolEmpleado> emple33 = new ArrayList<RolEmpleado>();
		Ayudante a331 = new Ayudante(e13);
		emple33.add(a331);
		Ayudante a332 = new Ayudante(e25);
		emple33.add(a332);
		Conductor c331 = new Conductor(e1, transporte2);
		emple33.add(c331);
		Date md33 = dfm.parse("2011-05-14");
		Mudanza m33 = new Mudanza(emple33, "Calle 61 #1919", md33, 4);
		emp.getPendientes().add(m33);
		emp.finalizarMudanza(m33);

		/* Mudanza 34*/
		ArrayList<RolEmpleado> emple34 = new ArrayList<RolEmpleado>();
		Ayudante a341 = new Ayudante(e11);
		emple34.add(a341);
		Ayudante a342 = new Ayudante(e20);
		emple34.add(a342);
		Ayudante a343 = new Ayudante(e26);
		emple34.add(a343);
		Conductor c341 = new Conductor(e11, transporte2);
		emple34.add(c341);
		Conductor c342 = new Conductor(e5, transporte6);
		emple34.add(c342);
		Date md34 = dfm.parse("2010-01-07");
		Mudanza m34 = new Mudanza(emple34, "Calle 55 #808", md34, 6);
		emp.getPendientes().add(m34);
		emp.finalizarMudanza(m34);

		/* Mudanza 35*/
		ArrayList<RolEmpleado> emple35 = new ArrayList<RolEmpleado>();
		Ayudante a351 = new Ayudante(e1);
		emple35.add(a351);
		Ayudante a352 = new Ayudante(e20);
		emple35.add(a352);
		Ayudante a353 = new Ayudante(e4);
		emple35.add(a353);
		Conductor c351 = new Conductor(e24, transporte4);
		emple35.add(c351);
		Date md35 = dfm.parse("2009-08-14");
		Mudanza m35 = new Mudanza(emple35, "Calle 70 #247", md35, 4);
		emp.getPendientes().add(m35);
		emp.finalizarMudanza(m35);

		/* Mudanza 36*/
		ArrayList<RolEmpleado> emple36 = new ArrayList<RolEmpleado>();
		Ayudante a361 = new Ayudante(e21);
		emple36.add(a361);
		Ayudante a362 = new Ayudante(e19);
		emple36.add(a362);
		Ayudante a363 = new Ayudante(e11);
		emple36.add(a363);
		Ayudante a364 = new Ayudante(e14);
		emple36.add(a364);
		Conductor c361 = new Conductor(e1, transporte5);
		emple36.add(c361);
		Date md36 = dfm.parse("2011-10-03");
		Mudanza m36 = new Mudanza(emple36, "Calle 12 #341", md36, 3);
		emp.getPendientes().add(m36);
		emp.finalizarMudanza(m36);

		/* Mudanza 37*/
		ArrayList<RolEmpleado> emple37 = new ArrayList<RolEmpleado>();
		Ayudante a371 = new Ayudante(e14);
		emple37.add(a371);
		Ayudante a372 = new Ayudante(e10);
		emple37.add(a372);
		Conductor c371 = new Conductor(e16, transporte3);
		emple37.add(c371);
		Conductor c372 = new Conductor(e24, transporte6);
		emple37.add(c372);
		Date md37 = dfm.parse("2011-04-12");
		Mudanza m37 = new Mudanza(emple37, "Calle 61 #1799", md37, 4);
		emp.getPendientes().add(m37);
		emp.finalizarMudanza(m37);

		/* Mudanza 38*/
		ArrayList<RolEmpleado> emple38 = new ArrayList<RolEmpleado>();
		Ayudante a381 = new Ayudante(e5);
		emple38.add(a381);
		Ayudante a382 = new Ayudante(e1);
		emple38.add(a382);
		Conductor c381 = new Conductor(e20, transporte1);
		emple38.add(c381);
		Conductor c382 = new Conductor(e14, transporte6);
		emple38.add(c382);
		Date md38 = dfm.parse("2009-08-30");
		Mudanza m38 = new Mudanza(emple38, "Calle 37 #759", md38, 8);
		emp.getPendientes().add(m38);
		emp.finalizarMudanza(m38);

		/* Mudanza 39*/
		ArrayList<RolEmpleado> emple39 = new ArrayList<RolEmpleado>();
		Ayudante a391 = new Ayudante(e24);
		emple39.add(a391);
		Ayudante a392 = new Ayudante(e19);
		emple39.add(a392);
		Ayudante a393 = new Ayudante(e19);
		emple39.add(a393);
		Ayudante a394 = new Ayudante(e4);
		emple39.add(a394);
		Conductor c391 = new Conductor(e19, transporte1);
		emple39.add(c391);
		Date md39 = dfm.parse("2008-12-10");
		Mudanza m39 = new Mudanza(emple39, "Calle 25 #1491", md39, 4);
		emp.getPendientes().add(m39);
		emp.finalizarMudanza(m39);

		/* Mudanza 40*/
		ArrayList<RolEmpleado> emple40 = new ArrayList<RolEmpleado>();
		Ayudante a401 = new Ayudante(e27);
		emple40.add(a401);
		Conductor c401 = new Conductor(e29, transporte1);
		emple40.add(c401);
		Date md40 = dfm.parse("2011-03-04");
		Mudanza m40 = new Mudanza(emple40, "Calle 61 #247", md40, 5);
		emp.getPendientes().add(m40);
		emp.finalizarMudanza(m40);

		/* Mudanza 41*/
		ArrayList<RolEmpleado> emple41 = new ArrayList<RolEmpleado>();
		Ayudante a411 = new Ayudante(e23);
		emple41.add(a411);
		Conductor c411 = new Conductor(e4, transporte2);
		emple41.add(c411);
		Conductor c412 = new Conductor(e10, transporte2);
		emple41.add(c412);
		Date md41 = dfm.parse("2011-01-10");
		Mudanza m41 = new Mudanza(emple41, "Calle 64 #1677", md41, 3);
		emp.getPendientes().add(m41);
		emp.finalizarMudanza(m41);

		/* Mudanza 42*/
		ArrayList<RolEmpleado> emple42 = new ArrayList<RolEmpleado>();
		Ayudante a421 = new Ayudante(e26);
		emple42.add(a421);
		Conductor c421 = new Conductor(e16, transporte3);
		emple42.add(c421);
		Date md42 = dfm.parse("2011-01-24");
		Mudanza m42 = new Mudanza(emple42, "Calle 24 #1726", md42, 6);
		emp.getPendientes().add(m42);
		emp.finalizarMudanza(m42);

		/* Mudanza 43*/
		ArrayList<RolEmpleado> emple43 = new ArrayList<RolEmpleado>();
		Ayudante a431 = new Ayudante(e15);
		emple43.add(a431);
		Ayudante a432 = new Ayudante(e5);
		emple43.add(a432);
		Ayudante a433 = new Ayudante(e23);
		emple43.add(a433);
		Conductor c431 = new Conductor(e4, transporte3);
		emple43.add(c431);
		Conductor c432 = new Conductor(e26, transporte1);
		emple43.add(c432);
		Date md43 = dfm.parse("2010-08-15");
		Mudanza m43 = new Mudanza(emple43, "Calle 14 #1060", md43, 6);
		emp.getPendientes().add(m43);
		emp.finalizarMudanza(m43);

		/* Mudanza 44*/
		ArrayList<RolEmpleado> emple44 = new ArrayList<RolEmpleado>();
		Ayudante a441 = new Ayudante(e6);
		emple44.add(a441);
		Conductor c441 = new Conductor(e6, transporte4);
		emple44.add(c441);
		Date md44 = dfm.parse("2009-11-07");
		Mudanza m44 = new Mudanza(emple44, "Calle 12 #1073", md44, 6);
		emp.getPendientes().add(m44);
		emp.finalizarMudanza(m44);

		/* Mudanza 45*/
		ArrayList<RolEmpleado> emple45 = new ArrayList<RolEmpleado>();
		Ayudante a451 = new Ayudante(e7);
		emple45.add(a451);
		Ayudante a452 = new Ayudante(e18);
		emple45.add(a452);
		Conductor c451 = new Conductor(e18, transporte3);
		emple45.add(c451);
		Date md45 = dfm.parse("2011-01-13");
		Mudanza m45 = new Mudanza(emple45, "Calle 35 #284", md45, 1);
		emp.getPendientes().add(m45);
		emp.finalizarMudanza(m45);

		/* Mudanza 46*/
		ArrayList<RolEmpleado> emple46 = new ArrayList<RolEmpleado>();
		Ayudante a461 = new Ayudante(e20);
		emple46.add(a461);
		Ayudante a462 = new Ayudante(e10);
		emple46.add(a462);
		Ayudante a463 = new Ayudante(e25);
		emple46.add(a463);
		Conductor c461 = new Conductor(e28, transporte6);
		emple46.add(c461);
		Date md46 = dfm.parse("2009-04-21");
		Mudanza m46 = new Mudanza(emple46, "Calle 40 #1662", md46, 4);
		emp.getPendientes().add(m46);
		emp.finalizarMudanza(m46);

		/* Mudanza 47*/
		ArrayList<RolEmpleado> emple47 = new ArrayList<RolEmpleado>();
		Ayudante a471 = new Ayudante(e8);
		emple47.add(a471);
		Ayudante a472 = new Ayudante(e1);
		emple47.add(a472);
		Conductor c471 = new Conductor(e14, transporte2);
		emple47.add(c471);
		Date md47 = dfm.parse("2011-12-02");
		Mudanza m47 = new Mudanza(emple47, "Calle 12 #1992", md47, 4);
		emp.getPendientes().add(m47);
		emp.finalizarMudanza(m47);

		/* Mudanza 48*/
		ArrayList<RolEmpleado> emple48 = new ArrayList<RolEmpleado>();
		Ayudante a481 = new Ayudante(e20);
		emple48.add(a481);
		Ayudante a482 = new Ayudante(e19);
		emple48.add(a482);
		Conductor c481 = new Conductor(e13, transporte1);
		emple48.add(c481);
		Date md48 = dfm.parse("2009-07-30");
		Mudanza m48 = new Mudanza(emple48, "Calle 29 #1980", md48, 1);
		emp.getPendientes().add(m48);
		emp.finalizarMudanza(m48);

		/* Mudanza 49*/
		ArrayList<RolEmpleado> emple49 = new ArrayList<RolEmpleado>();
		Ayudante a491 = new Ayudante(e23);
		emple49.add(a491);
		Ayudante a492 = new Ayudante(e25);
		emple49.add(a492);
		Ayudante a493 = new Ayudante(e9);
		emple49.add(a493);
		Conductor c491 = new Conductor(e24, transporte3);
		emple49.add(c491);
		Conductor c492 = new Conductor(e18, transporte5);
		emple49.add(c492);
		Date md49 = dfm.parse("2010-03-23");
		Mudanza m49 = new Mudanza(emple49, "Calle 56 #1977", md49, 7);
		emp.getPendientes().add(m49);
		emp.finalizarMudanza(m49);

		/* Mudanza 50*/
		ArrayList<RolEmpleado> emple50 = new ArrayList<RolEmpleado>();
		Ayudante a501 = new Ayudante(e10);
		emple50.add(a501);
		Conductor c501 = new Conductor(e20, transporte1);
		emple50.add(c501);
		Conductor c502 = new Conductor(e2, transporte5);
		emple50.add(c502);
		Date md50 = dfm.parse("2011-04-11");
		Mudanza m50 = new Mudanza(emple50, "Calle 13 #1236", md50, 1);
		emp.getPendientes().add(m50);
		emp.finalizarMudanza(m50);

		/* Mudanza 51*/
		ArrayList<RolEmpleado> emple51 = new ArrayList<RolEmpleado>();
		Ayudante a511 = new Ayudante(e11);
		emple51.add(a511);
		Ayudante a512 = new Ayudante(e29);
		emple51.add(a512);
		Conductor c511 = new Conductor(e23, transporte3);
		emple51.add(c511);
		Date md51 = dfm.parse("2009-08-10");
		Mudanza m51 = new Mudanza(emple51, "Calle 65 #1806", md51, 1);
		emp.getPendientes().add(m51);
		emp.finalizarMudanza(m51);

		/* Mudanza 52*/
		ArrayList<RolEmpleado> emple52 = new ArrayList<RolEmpleado>();
		Ayudante a521 = new Ayudante(e4);
		emple52.add(a521);
		Ayudante a522 = new Ayudante(e25);
		emple52.add(a522);
		Ayudante a523 = new Ayudante(e30);
		emple52.add(a523);
		Ayudante a524 = new Ayudante(e13);
		emple52.add(a524);
		Conductor c521 = new Conductor(e11, transporte2);
		emple52.add(c521);
		Conductor c522 = new Conductor(e10, transporte4);
		emple52.add(c522);
		Date md52 = dfm.parse("2010-10-08");
		Mudanza m52 = new Mudanza(emple52, "Calle 26 #1203", md52, 1);
		emp.getPendientes().add(m52);
		emp.finalizarMudanza(m52);

		/* Mudanza 53*/
		ArrayList<RolEmpleado> emple53 = new ArrayList<RolEmpleado>();
		Ayudante a531 = new Ayudante(e1);
		emple53.add(a531);
		Ayudante a532 = new Ayudante(e7);
		emple53.add(a532);
		Conductor c531 = new Conductor(e8, transporte1);
		emple53.add(c531);
		Date md53 = dfm.parse("2012-02-18");
		Mudanza m53 = new Mudanza(emple53, "Calle 1 #345", md53, 6);
		emp.getPendientes().add(m53);
		emp.finalizarMudanza(m53);

		/* Mudanza 54*/
		ArrayList<RolEmpleado> emple54 = new ArrayList<RolEmpleado>();
		Ayudante a541 = new Ayudante(e6);
		emple54.add(a541);
		Ayudante a542 = new Ayudante(e8);
		emple54.add(a542);
		Ayudante a543 = new Ayudante(e15);
		emple54.add(a543);
		Conductor c541 = new Conductor(e24, transporte5);
		emple54.add(c541);
		Date md54 = dfm.parse("2009-06-16");
		Mudanza m54 = new Mudanza(emple54, "Calle 42 #597", md54, 3);
		emp.getPendientes().add(m54);
		emp.finalizarMudanza(m54);

		/* Mudanza 55*/
		ArrayList<RolEmpleado> emple55 = new ArrayList<RolEmpleado>();
		Ayudante a551 = new Ayudante(e7);
		emple55.add(a551);
		Ayudante a552 = new Ayudante(e24);
		emple55.add(a552);
		Conductor c551 = new Conductor(e2, transporte6);
		emple55.add(c551);
		Date md55 = dfm.parse("2012-03-11");
		Mudanza m55 = new Mudanza(emple55, "Calle 27 #1060", md55, 3);
		emp.getPendientes().add(m55);
		emp.finalizarMudanza(m55);

		/* Mudanza 56*/
		ArrayList<RolEmpleado> emple56 = new ArrayList<RolEmpleado>();
		Ayudante a561 = new Ayudante(e24);
		emple56.add(a561);
		Ayudante a562 = new Ayudante(e4);
		emple56.add(a562);
		Conductor c561 = new Conductor(e2, transporte4);
		emple56.add(c561);
		Date md56 = dfm.parse("2012-01-11");
		Mudanza m56 = new Mudanza(emple56, "Calle 41 #1239", md56, 1);
		emp.getPendientes().add(m56);
		emp.finalizarMudanza(m56);

		/* Mudanza 57*/
		ArrayList<RolEmpleado> emple57 = new ArrayList<RolEmpleado>();
		Ayudante a571 = new Ayudante(e6);
		emple57.add(a571);
		Ayudante a572 = new Ayudante(e10);
		emple57.add(a572);
		Ayudante a573 = new Ayudante(e10);
		emple57.add(a573);
		Ayudante a574 = new Ayudante(e1);
		emple57.add(a574);
		Conductor c571 = new Conductor(e7, transporte4);
		emple57.add(c571);
		Conductor c572 = new Conductor(e27, transporte2);
		emple57.add(c572);
		Date md57 = dfm.parse("2009-12-15");
		Mudanza m57 = new Mudanza(emple57, "Calle 56 #422", md57, 8);
		emp.getPendientes().add(m57);
		emp.finalizarMudanza(m57);

		/* Mudanza 58*/
		ArrayList<RolEmpleado> emple58 = new ArrayList<RolEmpleado>();
		Ayudante a581 = new Ayudante(e23);
		emple58.add(a581);
		Ayudante a582 = new Ayudante(e27);
		emple58.add(a582);
		Ayudante a583 = new Ayudante(e27);
		emple58.add(a583);
		Conductor c581 = new Conductor(e21, transporte6);
		emple58.add(c581);
		Date md58 = dfm.parse("2009-10-15");
		Mudanza m58 = new Mudanza(emple58, "Calle 68 #1382", md58, 5);
		emp.getPendientes().add(m58);
		emp.finalizarMudanza(m58);

		/* Mudanza 59*/
		ArrayList<RolEmpleado> emple59 = new ArrayList<RolEmpleado>();
		Ayudante a591 = new Ayudante(e28);
		emple59.add(a591);
		Ayudante a592 = new Ayudante(e10);
		emple59.add(a592);
		Ayudante a593 = new Ayudante(e18);
		emple59.add(a593);
		Conductor c591 = new Conductor(e20, transporte1);
		emple59.add(c591);
		Conductor c592 = new Conductor(e27, transporte5);
		emple59.add(c592);
		Date md59 = dfm.parse("2011-01-22");
		Mudanza m59 = new Mudanza(emple59, "Calle 9 #180", md59, 1);
		emp.getPendientes().add(m59);
		emp.finalizarMudanza(m59);

		/* Mudanza 60*/
		ArrayList<RolEmpleado> emple60 = new ArrayList<RolEmpleado>();
		Ayudante a601 = new Ayudante(e24);
		emple60.add(a601);
		Ayudante a602 = new Ayudante(e21);
		emple60.add(a602);
		Ayudante a603 = new Ayudante(e12);
		emple60.add(a603);
		Ayudante a604 = new Ayudante(e22);
		emple60.add(a604);
		Conductor c601 = new Conductor(e30, transporte2);
		emple60.add(c601);
		Conductor c602 = new Conductor(e27, transporte6);
		emple60.add(c602);
		Date md60 = dfm.parse("2011-05-08");
		Mudanza m60 = new Mudanza(emple60, "Calle 18 #1698", md60, 4);
		emp.getPendientes().add(m60);
		emp.finalizarMudanza(m60);

		/* Mudanza 61*/
		ArrayList<RolEmpleado> emple61 = new ArrayList<RolEmpleado>();
		Ayudante a611 = new Ayudante(e17);
		emple61.add(a611);
		Conductor c611 = new Conductor(e6, transporte3);
		emple61.add(c611);
		Date md61 = dfm.parse("2009-07-12");
		Mudanza m61 = new Mudanza(emple61, "Calle 62 #1246", md61, 8);
		emp.getPendientes().add(m61);
		emp.finalizarMudanza(m61);

		/* Mudanza 62*/
		ArrayList<RolEmpleado> emple62 = new ArrayList<RolEmpleado>();
		Ayudante a621 = new Ayudante(e17);
		emple62.add(a621);
		Ayudante a622 = new Ayudante(e9);
		emple62.add(a622);
		Conductor c621 = new Conductor(e12, transporte6);
		emple62.add(c621);
		Date md62 = dfm.parse("2012-04-05");
		Mudanza m62 = new Mudanza(emple62, "Calle 3 #549", md62, 5);
		emp.getPendientes().add(m62);

		/* Mudanza 63*/
		ArrayList<RolEmpleado> emple63 = new ArrayList<RolEmpleado>();
		Ayudante a631 = new Ayudante(e4);
		emple63.add(a631);
		Ayudante a632 = new Ayudante(e13);
		emple63.add(a632);
		Ayudante a633 = new Ayudante(e1);
		emple63.add(a633);
		Ayudante a634 = new Ayudante(e23);
		emple63.add(a634);
		Conductor c631 = new Conductor(e4, transporte3);
		emple63.add(c631);
		Conductor c632 = new Conductor(e9, transporte6);
		emple63.add(c632);
		Date md63 = dfm.parse("2009-10-18");
		Mudanza m63 = new Mudanza(emple63, "Calle 24 #236", md63, 5);
		emp.getPendientes().add(m63);
		emp.finalizarMudanza(m63);

		/* Mudanza 64*/
		ArrayList<RolEmpleado> emple64 = new ArrayList<RolEmpleado>();
		Ayudante a641 = new Ayudante(e30);
		emple64.add(a641);
		Ayudante a642 = new Ayudante(e30);
		emple64.add(a642);
		Ayudante a643 = new Ayudante(e11);
		emple64.add(a643);
		Conductor c641 = new Conductor(e10, transporte2);
		emple64.add(c641);
		Date md64 = dfm.parse("2010-04-09");
		Mudanza m64 = new Mudanza(emple64, "Calle 60 #1425", md64, 5);
		emp.getPendientes().add(m64);
		emp.finalizarMudanza(m64);

		/* Mudanza 65*/
		ArrayList<RolEmpleado> emple65 = new ArrayList<RolEmpleado>();
		Ayudante a651 = new Ayudante(e18);
		emple65.add(a651);
		Ayudante a652 = new Ayudante(e11);
		emple65.add(a652);
		Conductor c651 = new Conductor(e9, transporte5);
		emple65.add(c651);
		Conductor c652 = new Conductor(e2, transporte5);
		emple65.add(c652);
		Date md65 = dfm.parse("2011-07-15");
		Mudanza m65 = new Mudanza(emple65, "Calle 23 #1422", md65, 5);
		emp.getPendientes().add(m65);
		emp.finalizarMudanza(m65);

		/* Mudanza 66*/
		ArrayList<RolEmpleado> emple66 = new ArrayList<RolEmpleado>();
		Ayudante a661 = new Ayudante(e28);
		emple66.add(a661);
		Ayudante a662 = new Ayudante(e9);
		emple66.add(a662);
		Conductor c661 = new Conductor(e7, transporte4);
		emple66.add(c661);
		Date md66 = dfm.parse("2009-05-17");
		Mudanza m66 = new Mudanza(emple66, "Calle 12 #1053", md66, 7);
		emp.getPendientes().add(m66);
		emp.finalizarMudanza(m66);

		/* Mudanza 67*/
		ArrayList<RolEmpleado> emple67 = new ArrayList<RolEmpleado>();
		Ayudante a671 = new Ayudante(e25);
		emple67.add(a671);
		Ayudante a672 = new Ayudante(e4);
		emple67.add(a672);
		Conductor c671 = new Conductor(e19, transporte6);
		emple67.add(c671);
		Date md67 = dfm.parse("2011-09-23");
		Mudanza m67 = new Mudanza(emple67, "Calle 10 #1892", md67, 4);
		emp.getPendientes().add(m67);
		emp.finalizarMudanza(m67);

		/* Mudanza 68*/
		ArrayList<RolEmpleado> emple68 = new ArrayList<RolEmpleado>();
		Ayudante a681 = new Ayudante(e18);
		emple68.add(a681);
		Ayudante a682 = new Ayudante(e17);
		emple68.add(a682);
		Ayudante a683 = new Ayudante(e19);
		emple68.add(a683);
		Conductor c681 = new Conductor(e10, transporte3);
		emple68.add(c681);
		Date md68 = dfm.parse("2010-11-17");
		Mudanza m68 = new Mudanza(emple68, "Calle 22 #576", md68, 1);
		emp.getPendientes().add(m68);
		emp.finalizarMudanza(m68);

		/* Mudanza 69*/
		ArrayList<RolEmpleado> emple69 = new ArrayList<RolEmpleado>();
		Ayudante a691 = new Ayudante(e16);
		emple69.add(a691);
		Conductor c691 = new Conductor(e27, transporte6);
		emple69.add(c691);
		Date md69 = dfm.parse("2010-10-01");
		Mudanza m69 = new Mudanza(emple69, "Calle 16 #929", md69, 4);
		emp.getPendientes().add(m69);
		emp.finalizarMudanza(m69);

		/* Mudanza 70*/
		ArrayList<RolEmpleado> emple70 = new ArrayList<RolEmpleado>();
		Ayudante a701 = new Ayudante(e4);
		emple70.add(a701);
		Conductor c701 = new Conductor(e27, transporte4);
		emple70.add(c701);
		Date md70 = dfm.parse("2010-10-27");
		Mudanza m70 = new Mudanza(emple70, "Calle 52 #910", md70, 3);
		emp.getPendientes().add(m70);
		emp.finalizarMudanza(m70);

		/* Mudanza 71*/
		ArrayList<RolEmpleado> emple71 = new ArrayList<RolEmpleado>();
		Ayudante a711 = new Ayudante(e29);
		emple71.add(a711);
		Ayudante a712 = new Ayudante(e13);
		emple71.add(a712);
		Ayudante a713 = new Ayudante(e22);
		emple71.add(a713);
		Ayudante a714 = new Ayudante(e4);
		emple71.add(a714);
		Conductor c711 = new Conductor(e24, transporte6);
		emple71.add(c711);
		Date md71 = dfm.parse("2009-06-19");
		Mudanza m71 = new Mudanza(emple71, "Calle 54 #1406", md71, 7);
		emp.getPendientes().add(m71);
		emp.finalizarMudanza(m71);

		/* Mudanza 72*/
		ArrayList<RolEmpleado> emple72 = new ArrayList<RolEmpleado>();
		Ayudante a721 = new Ayudante(e22);
		emple72.add(a721);
		Ayudante a722 = new Ayudante(e16);
		emple72.add(a722);
		Ayudante a723 = new Ayudante(e15);
		emple72.add(a723);
		Ayudante a724 = new Ayudante(e21);
		emple72.add(a724);
		Conductor c721 = new Conductor(e9, transporte5);
		emple72.add(c721);
		Date md72 = dfm.parse("2009-08-15");
		Mudanza m72 = new Mudanza(emple72, "Calle 4 #1130", md72, 2);
		emp.getPendientes().add(m72);
		emp.finalizarMudanza(m72);

		/* Mudanza 73*/
		ArrayList<RolEmpleado> emple73 = new ArrayList<RolEmpleado>();
		Ayudante a731 = new Ayudante(e15);
		emple73.add(a731);
		Ayudante a732 = new Ayudante(e4);
		emple73.add(a732);
		Conductor c731 = new Conductor(e17, transporte5);
		emple73.add(c731);
		Date md73 = dfm.parse("2010-10-10");
		Mudanza m73 = new Mudanza(emple73, "Calle 2 #1909", md73, 3);
		emp.getPendientes().add(m73);
		emp.finalizarMudanza(m73);

		/* Mudanza 74*/
		ArrayList<RolEmpleado> emple74 = new ArrayList<RolEmpleado>();
		Ayudante a741 = new Ayudante(e17);
		emple74.add(a741);
		Ayudante a742 = new Ayudante(e13);
		emple74.add(a742);
		Date md74 = dfm.parse("2012-06-15");
		Mudanza m74 = new Mudanza(emple74, "Calle 71 #966", md74, 4);
		emp.getPendientes().add(m74);

		/* Mudanza 75*/
		ArrayList<RolEmpleado> emple75 = new ArrayList<RolEmpleado>();
		Ayudante a751 = new Ayudante(e19);
		emple75.add(a751);
		Ayudante a752 = new Ayudante(e22);
		emple75.add(a752);
		Ayudante a753 = new Ayudante(e8);
		emple75.add(a753);
		Conductor c751 = new Conductor(e28, transporte2);
		emple75.add(c751);
		Date md75 = dfm.parse("2010-02-24");
		Mudanza m75 = new Mudanza(emple75, "Calle 71 #1483", md75, 7);
		emp.getPendientes().add(m75);
		emp.finalizarMudanza(m75);

		/* Mudanza 76*/
		ArrayList<RolEmpleado> emple76 = new ArrayList<RolEmpleado>();
		Ayudante a761 = new Ayudante(e17);
		emple76.add(a761);
		Ayudante a762 = new Ayudante(e23);
		emple76.add(a762);
		Conductor c761 = new Conductor(e13, transporte1);
		emple76.add(c761);
		Date md76 = dfm.parse("2009-02-19");
		Mudanza m76 = new Mudanza(emple76, "Calle 1 #1625", md76, 2);
		emp.getPendientes().add(m76);
		emp.finalizarMudanza(m76);

		/* Mudanza 77*/
		ArrayList<RolEmpleado> emple77 = new ArrayList<RolEmpleado>();
		Ayudante a771 = new Ayudante(e24);
		emple77.add(a771);
		Ayudante a772 = new Ayudante(e11);
		emple77.add(a772);
		Conductor c771 = new Conductor(e24, transporte1);
		emple77.add(c771);
		Conductor c772 = new Conductor(e15, transporte1);
		emple77.add(c772);
		Date md77 = dfm.parse("2012-09-17");
		Mudanza m77 = new Mudanza(emple77, "Calle 23 #1567", md77, 3);
		emp.getPendientes().add(m77);

		/* Mudanza 78*/
		ArrayList<RolEmpleado> emple78 = new ArrayList<RolEmpleado>();
		Ayudante a781 = new Ayudante(e4);
		emple78.add(a781);
		Ayudante a782 = new Ayudante(e6);
		emple78.add(a782);
		Ayudante a783 = new Ayudante(e20);
		emple78.add(a783);
		Conductor c781 = new Conductor(e22, transporte5);
		emple78.add(c781);
		Date md78 = dfm.parse("2010-08-21");
		Mudanza m78 = new Mudanza(emple78, "Calle 60 #1351", md78, 4);
		emp.getPendientes().add(m78);
		emp.finalizarMudanza(m78);

		/* Mudanza 79*/
		ArrayList<RolEmpleado> emple79 = new ArrayList<RolEmpleado>();
		Ayudante a791 = new Ayudante(e5);
		emple79.add(a791);
		Conductor c791 = new Conductor(e2, transporte4);
		emple79.add(c791);
		Date md79 = dfm.parse("2012-01-13");
		Mudanza m79 = new Mudanza(emple79, "Calle 7 #342", md79, 5);
		emp.getPendientes().add(m79);
		emp.finalizarMudanza(m79);

		/* Mudanza 80*/
		ArrayList<RolEmpleado> emple80 = new ArrayList<RolEmpleado>();
		Ayudante a801 = new Ayudante(e7);
		emple80.add(a801);
		Ayudante a802 = new Ayudante(e27);
		emple80.add(a802);
		Conductor c801 = new Conductor(e3, transporte1);
		emple80.add(c801);
		Date md80 = dfm.parse("2012-01-20");
		Mudanza m80 = new Mudanza(emple80, "Calle 10 #249", md80, 3);
		emp.getPendientes().add(m80);
		emp.finalizarMudanza(m80);

		/* Mudanza 81*/
		ArrayList<RolEmpleado> emple81 = new ArrayList<RolEmpleado>();
		Ayudante a811 = new Ayudante(e24);
		emple81.add(a811);
		Ayudante a812 = new Ayudante(e29);
		emple81.add(a812);
		Ayudante a813 = new Ayudante(e30);
		emple81.add(a813);
		Conductor c811 = new Conductor(e19, transporte6);
		emple81.add(c811);
		Date md81 = dfm.parse("2009-03-04");
		Mudanza m81 = new Mudanza(emple81, "Calle 3 #104", md81, 4);
		emp.getPendientes().add(m81);
		emp.finalizarMudanza(m81);

		/* Mudanza 82*/
		ArrayList<RolEmpleado> emple82 = new ArrayList<RolEmpleado>();
		Ayudante a821 = new Ayudante(e23);
		emple82.add(a821);
		Ayudante a822 = new Ayudante(e19);
		emple82.add(a822);
		Ayudante a823 = new Ayudante(e25);
		emple82.add(a823);
		Conductor c821 = new Conductor(e15, transporte6);
		emple82.add(c821);
		Date md82 = dfm.parse("2009-09-10");
		Mudanza m82 = new Mudanza(emple82, "Calle 12 #745", md82, 8);
		emp.getPendientes().add(m82);
		emp.finalizarMudanza(m82);

		/* Mudanza 83*/
		ArrayList<RolEmpleado> emple83 = new ArrayList<RolEmpleado>();
		Ayudante a831 = new Ayudante(e9);
		emple83.add(a831);
		Ayudante a832 = new Ayudante(e6);
		emple83.add(a832);
		Conductor c831 = new Conductor(e6, transporte6);
		emple83.add(c831);
		Date md83 = dfm.parse("2012-04-15");
		Mudanza m83 = new Mudanza(emple83, "Calle 20 #1367", md83, 1);
		emp.getPendientes().add(m83);

		/* Mudanza 84*/
		ArrayList<RolEmpleado> emple84 = new ArrayList<RolEmpleado>();
		Ayudante a841 = new Ayudante(e30);
		emple84.add(a841);
		Ayudante a842 = new Ayudante(e1);
		emple84.add(a842);
		Ayudante a843 = new Ayudante(e14);
		emple84.add(a843);
		Conductor c841 = new Conductor(e3, transporte1);
		emple84.add(c841);
		Date md84 = dfm.parse("2009-09-06");
		Mudanza m84 = new Mudanza(emple84, "Calle 63 #505", md84, 3);
		emp.getPendientes().add(m84);
		emp.finalizarMudanza(m84);

		/* Mudanza 85*/
		ArrayList<RolEmpleado> emple85 = new ArrayList<RolEmpleado>();
		Ayudante a851 = new Ayudante(e5);
		emple85.add(a851);
		Ayudante a852 = new Ayudante(e11);
		emple85.add(a852);
		Conductor c851 = new Conductor(e29, transporte4);
		emple85.add(c851);
		Conductor c852 = new Conductor(e25, transporte3);
		emple85.add(c852);
		Date md85 = dfm.parse("2010-07-24");
		Mudanza m85 = new Mudanza(emple85, "Calle 51 #1689", md85, 2);
		emp.getPendientes().add(m85);
		emp.finalizarMudanza(m85);

		/* Mudanza 86*/
		ArrayList<RolEmpleado> emple86 = new ArrayList<RolEmpleado>();
		Ayudante a861 = new Ayudante(e30);
		emple86.add(a861);
		Conductor c861 = new Conductor(e5, transporte4);
		emple86.add(c861);
		Date md86 = dfm.parse("2010-08-26");
		Mudanza m86 = new Mudanza(emple86, "Calle 42 #1406", md86, 5);
		emp.getPendientes().add(m86);
		emp.finalizarMudanza(m86);

		/* Mudanza 87*/
		ArrayList<RolEmpleado> emple87 = new ArrayList<RolEmpleado>();
		Ayudante a871 = new Ayudante(e7);
		emple87.add(a871);
		Ayudante a872 = new Ayudante(e26);
		emple87.add(a872);
		Ayudante a873 = new Ayudante(e15);
		emple87.add(a873);
		Ayudante a874 = new Ayudante(e2);
		emple87.add(a874);
		Conductor c871 = new Conductor(e22, transporte4);
		emple87.add(c871);
		Date md87 = dfm.parse("2010-01-31");
		Mudanza m87 = new Mudanza(emple87, "Calle 40 #804", md87, 4);
		emp.getPendientes().add(m87);
		emp.finalizarMudanza(m87);

		/* Mudanza 88*/
		ArrayList<RolEmpleado> emple88 = new ArrayList<RolEmpleado>();
		Ayudante a881 = new Ayudante(e15);
		emple88.add(a881);
		Ayudante a882 = new Ayudante(e18);
		emple88.add(a882);
		Ayudante a883 = new Ayudante(e4);
		emple88.add(a883);
		Ayudante a884 = new Ayudante(e1);
		emple88.add(a884);
		Conductor c881 = new Conductor(e6, transporte2);
		emple88.add(c881);
		Date md88 = dfm.parse("2009-03-09");
		Mudanza m88 = new Mudanza(emple88, "Calle 30 #1263", md88, 8);
		emp.getPendientes().add(m88);
		emp.finalizarMudanza(m88);

		/* Mudanza 89*/
		ArrayList<RolEmpleado> emple89 = new ArrayList<RolEmpleado>();
		Ayudante a891 = new Ayudante(e27);
		emple89.add(a891);
		Ayudante a892 = new Ayudante(e11);
		emple89.add(a892);
		Ayudante a893 = new Ayudante(e5);
		emple89.add(a893);
		Conductor c891 = new Conductor(e19, transporte1);
		emple89.add(c891);
		Date md89 = dfm.parse("2011-04-06");
		Mudanza m89 = new Mudanza(emple89, "Calle 34 #1463", md89, 3);
		emp.getPendientes().add(m89);
		emp.finalizarMudanza(m89);

		/* Mudanza 90*/
		ArrayList<RolEmpleado> emple90 = new ArrayList<RolEmpleado>();
		Ayudante a901 = new Ayudante(e20);
		emple90.add(a901);
		Ayudante a902 = new Ayudante(e5);
		emple90.add(a902);
		Conductor c901 = new Conductor(e12, transporte6);
		emple90.add(c901);
		Date md90 = dfm.parse("2009-11-14");
		Mudanza m90 = new Mudanza(emple90, "Calle 7 #750", md90, 6);
		emp.getPendientes().add(m90);
		emp.finalizarMudanza(m90);

		/* Mudanza 91*/
		ArrayList<RolEmpleado> emple91 = new ArrayList<RolEmpleado>();
		Ayudante a911 = new Ayudante(e28);
		emple91.add(a911);
		Conductor c911 = new Conductor(e4, transporte2);
		emple91.add(c911);
		Conductor c912 = new Conductor(e13, transporte3);
		emple91.add(c912);
		Date md91 = dfm.parse("2012-07-21");
		Mudanza m91 = new Mudanza(emple91, "Calle 45 #625", md91, 5);
		emp.getPendientes().add(m91);

		/* Mudanza 92*/
		ArrayList<RolEmpleado> emple92 = new ArrayList<RolEmpleado>();
		Ayudante a921 = new Ayudante(e17);
		emple92.add(a921);
		Ayudante a922 = new Ayudante(e13);
		emple92.add(a922);
		Ayudante a923 = new Ayudante(e30);
		emple92.add(a923);
		Ayudante a924 = new Ayudante(e11);
		emple92.add(a924);
		Conductor c921 = new Conductor(e17, transporte4);
		emple92.add(c921);
		Date md92 = dfm.parse("2010-11-22");
		Mudanza m92 = new Mudanza(emple92, "Calle 30 #195", md92, 5);
		emp.getPendientes().add(m92);
		emp.finalizarMudanza(m92);

		/* Mudanza 93*/
		ArrayList<RolEmpleado> emple93 = new ArrayList<RolEmpleado>();
		Ayudante a931 = new Ayudante(e12);
		emple93.add(a931);
		Conductor c931 = new Conductor(e19, transporte2);
		emple93.add(c931);
		Conductor c932 = new Conductor(e24, transporte1);
		emple93.add(c932);
		Date md93 = dfm.parse("2011-07-28");
		Mudanza m93 = new Mudanza(emple93, "Calle 54 #943", md93, 2);
		emp.getPendientes().add(m93);
		emp.finalizarMudanza(m93);

		/* Mudanza 94*/
		ArrayList<RolEmpleado> emple94 = new ArrayList<RolEmpleado>();
		Ayudante a941 = new Ayudante(e8);
		emple94.add(a941);
		Ayudante a942 = new Ayudante(e6);
		emple94.add(a942);
		Conductor c941 = new Conductor(e4, transporte3);
		emple94.add(c941);
		Date md94 = dfm.parse("2012-05-24");
		Mudanza m94 = new Mudanza(emple94, "Calle 23 #471", md94, 4);
		emp.getPendientes().add(m94);

		/* Mudanza 95*/
		ArrayList<RolEmpleado> emple95 = new ArrayList<RolEmpleado>();
		Ayudante a951 = new Ayudante(e11);
		emple95.add(a951);
		Ayudante a952 = new Ayudante(e15);
		emple95.add(a952);
		Ayudante a953 = new Ayudante(e27);
		emple95.add(a953);
		Conductor c951 = new Conductor(e15, transporte4);
		emple95.add(c951);
		Date md95 = dfm.parse("2010-06-21");
		Mudanza m95 = new Mudanza(emple95, "Calle 14 #761", md95, 2);
		emp.getPendientes().add(m95);
		emp.finalizarMudanza(m95);

		/* Mudanza 96*/
		ArrayList<RolEmpleado> emple96 = new ArrayList<RolEmpleado>();
		Ayudante a961 = new Ayudante(e28);
		emple96.add(a961);
		Ayudante a962 = new Ayudante(e28);
		emple96.add(a962);
		Conductor c961 = new Conductor(e18, transporte2);
		emple96.add(c961);
		Date md96 = dfm.parse("2011-02-12");
		Mudanza m96 = new Mudanza(emple96, "Calle 63 #1836", md96, 3);
		emp.getPendientes().add(m96);
		emp.finalizarMudanza(m96);

		/* Mudanza 97*/
		ArrayList<RolEmpleado> emple97 = new ArrayList<RolEmpleado>();
		Ayudante a971 = new Ayudante(e20);
		emple97.add(a971);
		Ayudante a972 = new Ayudante(e7);
		emple97.add(a972);
		Ayudante a973 = new Ayudante(e3);
		emple97.add(a973);
		Ayudante a974 = new Ayudante(e7);
		emple97.add(a974);
		Conductor c971 = new Conductor(e22, transporte6);
		emple97.add(c971);
		Date md97 = dfm.parse("2008-12-10");
		Mudanza m97 = new Mudanza(emple97, "Calle 43 #66", md97, 3);
		emp.getPendientes().add(m97);
		emp.finalizarMudanza(m97);

		/* Mudanza 98*/
		ArrayList<RolEmpleado> emple98 = new ArrayList<RolEmpleado>();
		Ayudante a981 = new Ayudante(e3);
		emple98.add(a981);
		Ayudante a982 = new Ayudante(e17);
		emple98.add(a982);
		Ayudante a983 = new Ayudante(e20);
		emple98.add(a983);
		Conductor c981 = new Conductor(e3, transporte1);
		emple98.add(c981);
		Date md98 = dfm.parse("2011-07-17");
		Mudanza m98 = new Mudanza(emple98, "Calle 17 #1144", md98, 2);
		emp.getPendientes().add(m98);
		emp.finalizarMudanza(m98);

		/* Mudanza 99*/
		ArrayList<RolEmpleado> emple99 = new ArrayList<RolEmpleado>();
		Ayudante a991 = new Ayudante(e11);
		emple99.add(a991);
		Ayudante a992 = new Ayudante(e27);
		emple99.add(a992);
		Ayudante a993 = new Ayudante(e13);
		emple99.add(a993);
		Conductor c991 = new Conductor(e22, transporte5);
		emple99.add(c991);
		Date md99 = dfm.parse("2009-02-28");
		Mudanza m99 = new Mudanza(emple99, "Calle 51 #1598", md99, 4);
		emp.getPendientes().add(m99);
		emp.finalizarMudanza(m99);

		/* Mudanza 100*/
		ArrayList<RolEmpleado> emple100 = new ArrayList<RolEmpleado>();
		Ayudante a1001 = new Ayudante(e14);
		emple100.add(a1001);
		Conductor c1001 = new Conductor(e10, transporte4);
		emple100.add(c1001);
		Conductor c1002 = new Conductor(e28, transporte2);
		emple100.add(c1002);
		Date md100 = dfm.parse("2010-12-05");
		Mudanza m100 = new Mudanza(emple100, "Calle 26 #1665", md100, 8);
		emp.getPendientes().add(m100);
		emp.finalizarMudanza(m100);

		/* Mudanza 101*/
		ArrayList<RolEmpleado> emple101 = new ArrayList<RolEmpleado>();
		Ayudante a1011 = new Ayudante(e20);
		emple101.add(a1011);
		Ayudante a1012 = new Ayudante(e26);
		emple101.add(a1012);
		Conductor c1011 = new Conductor(e4, transporte1);
		emple101.add(c1011);
		Date md101 = dfm.parse("2012-02-04");
		Mudanza m101 = new Mudanza(emple101, "Calle 4 #1317", md101, 1);
		emp.getPendientes().add(m101);
		emp.finalizarMudanza(m101);

		/* Mudanza 102*/
		ArrayList<RolEmpleado> emple102 = new ArrayList<RolEmpleado>();
		Ayudante a1021 = new Ayudante(e23);
		emple102.add(a1021);
		Ayudante a1022 = new Ayudante(e3);
		emple102.add(a1022);
		Conductor c1021 = new Conductor(e27, transporte1);
		emple102.add(c1021);
		Conductor c1022 = new Conductor(e16, transporte4);
		emple102.add(c1022);
		Date md102 = dfm.parse("2010-10-28");
		Mudanza m102 = new Mudanza(emple102, "Calle 39 #1985", md102, 8);
		emp.getPendientes().add(m102);
		emp.finalizarMudanza(m102);

		/* Mudanza 103*/
		ArrayList<RolEmpleado> emple103 = new ArrayList<RolEmpleado>();
		Ayudante a1031 = new Ayudante(e12);
		emple103.add(a1031);
		Ayudante a1032 = new Ayudante(e28);
		emple103.add(a1032);
		Conductor c1031 = new Conductor(e21, transporte5);
		emple103.add(c1031);
		Date md103 = dfm.parse("2012-05-20");
		Mudanza m103 = new Mudanza(emple103, "Calle 53 #221", md103, 4);
		emp.getPendientes().add(m103);

		/* Mudanza 104*/
		ArrayList<RolEmpleado> emple104 = new ArrayList<RolEmpleado>();
		Ayudante a1041 = new Ayudante(e6);
		emple104.add(a1041);
		Ayudante a1042 = new Ayudante(e15);
		emple104.add(a1042);
		Conductor c1041 = new Conductor(e1, transporte1);
		emple104.add(c1041);
		Date md104 = dfm.parse("2010-09-12");
		Mudanza m104 = new Mudanza(emple104, "Calle 37 #1693", md104, 4);
		emp.getPendientes().add(m104);
		emp.finalizarMudanza(m104);

		/* Mudanza 105*/
		ArrayList<RolEmpleado> emple105 = new ArrayList<RolEmpleado>();
		Ayudante a1051 = new Ayudante(e7);
		emple105.add(a1051);
		Ayudante a1052 = new Ayudante(e8);
		emple105.add(a1052);
		Conductor c1051 = new Conductor(e10, transporte1);
		emple105.add(c1051);
		Date md105 = dfm.parse("2010-03-15");
		Mudanza m105 = new Mudanza(emple105, "Calle 70 #605", md105, 4);
		emp.getPendientes().add(m105);
		emp.finalizarMudanza(m105);

		/* Mudanza 106*/
		ArrayList<RolEmpleado> emple106 = new ArrayList<RolEmpleado>();
		Ayudante a1061 = new Ayudante(e3);
		emple106.add(a1061);
		Ayudante a1062 = new Ayudante(e1);
		emple106.add(a1062);
		Ayudante a1063 = new Ayudante(e20);
		emple106.add(a1063);
		Conductor c1061 = new Conductor(e25, transporte1);
		emple106.add(c1061);
		Date md106 = dfm.parse("2011-01-30");
		Mudanza m106 = new Mudanza(emple106, "Calle 59 #1503", md106, 8);
		emp.getPendientes().add(m106);
		emp.finalizarMudanza(m106);

		/* Mudanza 107*/
		ArrayList<RolEmpleado> emple107 = new ArrayList<RolEmpleado>();
		Ayudante a1071 = new Ayudante(e18);
		emple107.add(a1071);
		Conductor c1071 = new Conductor(e15, transporte4);
		emple107.add(c1071);
		Conductor c1072 = new Conductor(e3, transporte2);
		emple107.add(c1072);
		Date md107 = dfm.parse("2011-07-15");
		Mudanza m107 = new Mudanza(emple107, "Calle 68 #916", md107, 3);
		emp.getPendientes().add(m107);
		emp.finalizarMudanza(m107);

		/* Mudanza 108*/
		ArrayList<RolEmpleado> emple108 = new ArrayList<RolEmpleado>();
		Ayudante a1081 = new Ayudante(e1);
		emple108.add(a1081);
		Ayudante a1082 = new Ayudante(e20);
		emple108.add(a1082);
		Conductor c1081 = new Conductor(e5, transporte4);
		emple108.add(c1081);
		Conductor c1082 = new Conductor(e13, transporte3);
		emple108.add(c1082);
		Date md108 = dfm.parse("2009-02-12");
		Mudanza m108 = new Mudanza(emple108, "Calle 65 #1311", md108, 8);
		emp.getPendientes().add(m108);
		emp.finalizarMudanza(m108);

		/* Mudanza 109*/
		ArrayList<RolEmpleado> emple109 = new ArrayList<RolEmpleado>();
		Ayudante a1091 = new Ayudante(e5);
		emple109.add(a1091);
		Ayudante a1092 = new Ayudante(e28);
		emple109.add(a1092);
		Conductor c1091 = new Conductor(e19, transporte5);
		emple109.add(c1091);
		Date md109 = dfm.parse("2009-03-29");
		Mudanza m109 = new Mudanza(emple109, "Calle 24 #170", md109, 1);
		emp.getPendientes().add(m109);
		emp.finalizarMudanza(m109);

		/* Mudanza 110*/
		ArrayList<RolEmpleado> emple110 = new ArrayList<RolEmpleado>();
		Ayudante a1101 = new Ayudante(e5);
		emple110.add(a1101);
		Ayudante a1102 = new Ayudante(e13);
		emple110.add(a1102);
		Conductor c1101 = new Conductor(e30, transporte5);
		emple110.add(c1101);
		Conductor c1102 = new Conductor(e5, transporte5);
		emple110.add(c1102);
		Date md110 = dfm.parse("2011-07-23");
		Mudanza m110 = new Mudanza(emple110, "Calle 66 #1902", md110, 5);
		emp.getPendientes().add(m110);
		emp.finalizarMudanza(m110);

		/* Mudanza 111*/
		ArrayList<RolEmpleado> emple111 = new ArrayList<RolEmpleado>();
		Ayudante a1111 = new Ayudante(e6);
		emple111.add(a1111);
		Ayudante a1112 = new Ayudante(e8);
		emple111.add(a1112);
		Ayudante a1113 = new Ayudante(e16);
		emple111.add(a1113);
		Conductor c1111 = new Conductor(e29, transporte6);
		emple111.add(c1111);
		Conductor c1112 = new Conductor(e1, transporte2);
		emple111.add(c1112);
		Date md111 = dfm.parse("2011-02-26");
		Mudanza m111 = new Mudanza(emple111, "Calle 37 #571", md111, 3);
		emp.getPendientes().add(m111);
		emp.finalizarMudanza(m111);

		/* Mudanza 112*/
		ArrayList<RolEmpleado> emple112 = new ArrayList<RolEmpleado>();
		Ayudante a1121 = new Ayudante(e28);
		emple112.add(a1121);
		Ayudante a1122 = new Ayudante(e27);
		emple112.add(a1122);
		Conductor c1121 = new Conductor(e11, transporte1);
		emple112.add(c1121);
		Date md112 = dfm.parse("2010-02-24");
		Mudanza m112 = new Mudanza(emple112, "Calle 61 #882", md112, 1);
		emp.getPendientes().add(m112);
		emp.finalizarMudanza(m112);

		/* Mudanza 113*/
		ArrayList<RolEmpleado> emple113 = new ArrayList<RolEmpleado>();
		Ayudante a1131 = new Ayudante(e2);
		emple113.add(a1131);
		Ayudante a1132 = new Ayudante(e29);
		emple113.add(a1132);
		Ayudante a1133 = new Ayudante(e26);
		emple113.add(a1133);
		Conductor c1131 = new Conductor(e28, transporte2);
		emple113.add(c1131);
		Date md113 = dfm.parse("2011-09-18");
		Mudanza m113 = new Mudanza(emple113, "Calle 33 #1576", md113, 8);
		emp.getPendientes().add(m113);
		emp.finalizarMudanza(m113);

		/* Mudanza 114*/
		ArrayList<RolEmpleado> emple114 = new ArrayList<RolEmpleado>();
		Ayudante a1141 = new Ayudante(e6);
		emple114.add(a1141);
		Ayudante a1142 = new Ayudante(e24);
		emple114.add(a1142);
		Conductor c1141 = new Conductor(e16, transporte3);
		emple114.add(c1141);
		Date md114 = dfm.parse("2010-02-23");
		Mudanza m114 = new Mudanza(emple114, "Calle 54 #1933", md114, 6);
		emp.getPendientes().add(m114);
		emp.finalizarMudanza(m114);

		/* Mudanza 115*/
		ArrayList<RolEmpleado> emple115 = new ArrayList<RolEmpleado>();
		Ayudante a1151 = new Ayudante(e28);
		emple115.add(a1151);
		Ayudante a1152 = new Ayudante(e23);
		emple115.add(a1152);
		Ayudante a1153 = new Ayudante(e8);
		emple115.add(a1153);
		Conductor c1151 = new Conductor(e26, transporte5);
		emple115.add(c1151);
		Conductor c1152 = new Conductor(e9, transporte3);
		emple115.add(c1152);
		Date md115 = dfm.parse("2011-06-05");
		Mudanza m115 = new Mudanza(emple115, "Calle 19 #879", md115, 1);
		emp.getPendientes().add(m115);
		emp.finalizarMudanza(m115);

		/* Mudanza 116*/
		ArrayList<RolEmpleado> emple116 = new ArrayList<RolEmpleado>();
		Ayudante a1161 = new Ayudante(e18);
		emple116.add(a1161);
		Ayudante a1162 = new Ayudante(e4);
		emple116.add(a1162);
		Ayudante a1163 = new Ayudante(e12);
		emple116.add(a1163);
		Conductor c1161 = new Conductor(e4, transporte3);
		emple116.add(c1161);
		Date md116 = dfm.parse("2009-07-13");
		Mudanza m116 = new Mudanza(emple116, "Calle 4 #1956", md116, 7);
		emp.getPendientes().add(m116);
		emp.finalizarMudanza(m116);

		/* Mudanza 117*/
		ArrayList<RolEmpleado> emple117 = new ArrayList<RolEmpleado>();
		Ayudante a1171 = new Ayudante(e5);
		emple117.add(a1171);
		Ayudante a1172 = new Ayudante(e17);
		emple117.add(a1172);
		Ayudante a1173 = new Ayudante(e8);
		emple117.add(a1173);
		Ayudante a1174 = new Ayudante(e9);
		emple117.add(a1174);
		Conductor c1171 = new Conductor(e1, transporte6);
		emple117.add(c1171);
		Conductor c1172 = new Conductor(e14, transporte4);
		emple117.add(c1172);
		Date md117 = dfm.parse("2012-07-08");
		Mudanza m117 = new Mudanza(emple117, "Calle 11 #1925", md117, 3);
		emp.getPendientes().add(m117);

		/* Mudanza 118*/
		ArrayList<RolEmpleado> emple118 = new ArrayList<RolEmpleado>();
		Ayudante a1181 = new Ayudante(e12);
		emple118.add(a1181);
		Ayudante a1182 = new Ayudante(e30);
		emple118.add(a1182);
		Ayudante a1183 = new Ayudante(e19);
		emple118.add(a1183);
		Ayudante a1184 = new Ayudante(e11);
		emple118.add(a1184);
		Conductor c1181 = new Conductor(e27, transporte6);
		emple118.add(c1181);
		Date md118 = dfm.parse("2009-11-03");
		Mudanza m118 = new Mudanza(emple118, "Calle 3 #312", md118, 2);
		emp.getPendientes().add(m118);
		emp.finalizarMudanza(m118);

		/* Mudanza 119*/
		ArrayList<RolEmpleado> emple119 = new ArrayList<RolEmpleado>();
		Ayudante a1191 = new Ayudante(e1);
		emple119.add(a1191);
		Conductor c1191 = new Conductor(e22, transporte3);
		emple119.add(c1191);
		Conductor c1192 = new Conductor(e16, transporte5);
		emple119.add(c1192);
		Date md119 = dfm.parse("2009-04-24");
		Mudanza m119 = new Mudanza(emple119, "Calle 39 #1565", md119, 6);
		emp.getPendientes().add(m119);
		emp.finalizarMudanza(m119);

		/* Mudanza 120*/
		ArrayList<RolEmpleado> emple120 = new ArrayList<RolEmpleado>();
		Ayudante a1201 = new Ayudante(e23);
		emple120.add(a1201);
		Conductor c1201 = new Conductor(e2, transporte3);
		emple120.add(c1201);
		Date md120 = dfm.parse("2009-02-11");
		Mudanza m120 = new Mudanza(emple120, "Calle 6 #790", md120, 2);
		emp.getPendientes().add(m120);
		emp.finalizarMudanza(m120);

		/* Mudanza 121*/
		ArrayList<RolEmpleado> emple121 = new ArrayList<RolEmpleado>();
		Ayudante a1211 = new Ayudante(e13);
		emple121.add(a1211);
		Conductor c1211 = new Conductor(e20, transporte2);
		emple121.add(c1211);
		Date md121 = dfm.parse("2012-03-24");
		Mudanza m121 = new Mudanza(emple121, "Calle 71 #388", md121, 7);
		emp.getPendientes().add(m121);
		emp.finalizarMudanza(m121);

		/* Mudanza 122*/
		ArrayList<RolEmpleado> emple122 = new ArrayList<RolEmpleado>();
		Ayudante a1221 = new Ayudante(e9);
		emple122.add(a1221);
		Ayudante a1222 = new Ayudante(e16);
		emple122.add(a1222);
		Ayudante a1223 = new Ayudante(e17);
		emple122.add(a1223);
		Conductor c1221 = new Conductor(e5, transporte1);
		emple122.add(c1221);
		Date md122 = dfm.parse("2010-04-18");
		Mudanza m122 = new Mudanza(emple122, "Calle 36 #127", md122, 6);
		emp.getPendientes().add(m122);
		emp.finalizarMudanza(m122);

		/* Mudanza 123*/
		ArrayList<RolEmpleado> emple123 = new ArrayList<RolEmpleado>();
		Ayudante a1231 = new Ayudante(e10);
		emple123.add(a1231);
		Conductor c1231 = new Conductor(e8, transporte4);
		emple123.add(c1231);
		Conductor c1232 = new Conductor(e30, transporte6);
		emple123.add(c1232);
		Date md123 = dfm.parse("2011-06-11");
		Mudanza m123 = new Mudanza(emple123, "Calle 31 #918", md123, 1);
		emp.getPendientes().add(m123);
		emp.finalizarMudanza(m123);

		/* Mudanza 124*/
		ArrayList<RolEmpleado> emple124 = new ArrayList<RolEmpleado>();
		Ayudante a1241 = new Ayudante(e12);
		emple124.add(a1241);
		Ayudante a1242 = new Ayudante(e7);
		emple124.add(a1242);
		Conductor c1241 = new Conductor(e12, transporte1);
		emple124.add(c1241);
		Date md124 = dfm.parse("2010-11-09");
		Mudanza m124 = new Mudanza(emple124, "Calle 28 #1033", md124, 2);
		emp.getPendientes().add(m124);
		emp.finalizarMudanza(m124);

		/* Mudanza 125*/
		ArrayList<RolEmpleado> emple125 = new ArrayList<RolEmpleado>();
		Ayudante a1251 = new Ayudante(e21);
		emple125.add(a1251);
		Conductor c1251 = new Conductor(e20, transporte3);
		emple125.add(c1251);
		Conductor c1252 = new Conductor(e9, transporte2);
		emple125.add(c1252);
		Date md125 = dfm.parse("2011-07-15");
		Mudanza m125 = new Mudanza(emple125, "Calle 16 #1955", md125, 6);
		emp.getPendientes().add(m125);
		emp.finalizarMudanza(m125);

		/* Mudanza 126*/
		ArrayList<RolEmpleado> emple126 = new ArrayList<RolEmpleado>();
		Ayudante a1261 = new Ayudante(e17);
		emple126.add(a1261);
		Ayudante a1262 = new Ayudante(e30);
		emple126.add(a1262);
		Conductor c1261 = new Conductor(e5, transporte4);
		emple126.add(c1261);
		Date md126 = dfm.parse("2012-08-19");
		Mudanza m126 = new Mudanza(emple126, "Calle 47 #1738", md126, 6);
		emp.getPendientes().add(m126);

		/* Mudanza 127*/
		ArrayList<RolEmpleado> emple127 = new ArrayList<RolEmpleado>();
		Ayudante a1271 = new Ayudante(e29);
		emple127.add(a1271);
		Conductor c1271 = new Conductor(e19, transporte5);
		emple127.add(c1271);
		Date md127 = dfm.parse("2009-03-21");
		Mudanza m127 = new Mudanza(emple127, "Calle 71 #1710", md127, 7);
		emp.getPendientes().add(m127);
		emp.finalizarMudanza(m127);

		/* Mudanza 128*/
		ArrayList<RolEmpleado> emple128 = new ArrayList<RolEmpleado>();
		Ayudante a1281 = new Ayudante(e25);
		emple128.add(a1281);
		Ayudante a1282 = new Ayudante(e25);
		emple128.add(a1282);
		Conductor c1281 = new Conductor(e15, transporte3);
		emple128.add(c1281);
		Date md128 = dfm.parse("2009-02-28");
		Mudanza m128 = new Mudanza(emple128, "Calle 23 #692", md128, 1);
		emp.getPendientes().add(m128);
		emp.finalizarMudanza(m128);

		/* Mudanza 129*/
		ArrayList<RolEmpleado> emple129 = new ArrayList<RolEmpleado>();
		Ayudante a1291 = new Ayudante(e6);
		emple129.add(a1291);
		Ayudante a1292 = new Ayudante(e8);
		emple129.add(a1292);
		Conductor c1291 = new Conductor(e23, transporte3);
		emple129.add(c1291);
		Date md129 = dfm.parse("2010-03-19");
		Mudanza m129 = new Mudanza(emple129, "Calle 30 #1858", md129, 2);
		emp.getPendientes().add(m129);
		emp.finalizarMudanza(m129);

		/* Mudanza 130*/
		ArrayList<RolEmpleado> emple130 = new ArrayList<RolEmpleado>();
		Ayudante a1301 = new Ayudante(e4);
		emple130.add(a1301);
		Conductor c1301 = new Conductor(e12, transporte6);
		emple130.add(c1301);
		Conductor c1302 = new Conductor(e11, transporte6);
		emple130.add(c1302);
		Date md130 = dfm.parse("2009-11-15");
		Mudanza m130 = new Mudanza(emple130, "Calle 64 #953", md130, 2);
		emp.getPendientes().add(m130);
		emp.finalizarMudanza(m130);

		/* Mudanza 131*/
		ArrayList<RolEmpleado> emple131 = new ArrayList<RolEmpleado>();
		Ayudante a1311 = new Ayudante(e6);
		emple131.add(a1311);
		Ayudante a1312 = new Ayudante(e7);
		emple131.add(a1312);
		Conductor c1311 = new Conductor(e14, transporte2);
		emple131.add(c1311);
		Conductor c1312 = new Conductor(e21, transporte5);
		emple131.add(c1312);
		Date md131 = dfm.parse("2012-08-08");
		Mudanza m131 = new Mudanza(emple131, "Calle 3 #930", md131, 8);
		emp.getPendientes().add(m131);

		/* Mudanza 132*/
		ArrayList<RolEmpleado> emple132 = new ArrayList<RolEmpleado>();
		Ayudante a1321 = new Ayudante(e9);
		emple132.add(a1321);
		Ayudante a1322 = new Ayudante(e10);
		emple132.add(a1322);
		Ayudante a1323 = new Ayudante(e19);
		emple132.add(a1323);
		Ayudante a1324 = new Ayudante(e2);
		emple132.add(a1324);
		Conductor c1321 = new Conductor(e3, transporte5);
		emple132.add(c1321);
		Conductor c1322 = new Conductor(e1, transporte5);
		emple132.add(c1322);
		Date md132 = dfm.parse("2009-07-18");
		Mudanza m132 = new Mudanza(emple132, "Calle 59 #1736", md132, 8);
		emp.getPendientes().add(m132);
		emp.finalizarMudanza(m132);

		/* Mudanza 133*/
		ArrayList<RolEmpleado> emple133 = new ArrayList<RolEmpleado>();
		Ayudante a1331 = new Ayudante(e21);
		emple133.add(a1331);
		Ayudante a1332 = new Ayudante(e12);
		emple133.add(a1332);
		Ayudante a1333 = new Ayudante(e1);
		emple133.add(a1333);
		Ayudante a1334 = new Ayudante(e17);
		emple133.add(a1334);
		Conductor c1331 = new Conductor(e23, transporte5);
		emple133.add(c1331);
		Conductor c1332 = new Conductor(e26, transporte5);
		emple133.add(c1332);
		Date md133 = dfm.parse("2011-11-14");
		Mudanza m133 = new Mudanza(emple133, "Calle 8 #167", md133, 3);
		emp.getPendientes().add(m133);
		emp.finalizarMudanza(m133);

		/* Mudanza 134*/
		ArrayList<RolEmpleado> emple134 = new ArrayList<RolEmpleado>();
		Ayudante a1341 = new Ayudante(e24);
		emple134.add(a1341);
		Ayudante a1342 = new Ayudante(e3);
		emple134.add(a1342);
		Ayudante a1343 = new Ayudante(e21);
		emple134.add(a1343);
		Ayudante a1344 = new Ayudante(e28);
		emple134.add(a1344);
		Conductor c1341 = new Conductor(e17, transporte2);
		emple134.add(c1341);
		Date md134 = dfm.parse("2012-02-20");
		Mudanza m134 = new Mudanza(emple134, "Calle 27 #1035", md134, 1);
		emp.getPendientes().add(m134);
		emp.finalizarMudanza(m134);

		/* Mudanza 135*/
		ArrayList<RolEmpleado> emple135 = new ArrayList<RolEmpleado>();
		Ayudante a1351 = new Ayudante(e9);
		emple135.add(a1351);
		Ayudante a1352 = new Ayudante(e22);
		emple135.add(a1352);
		Conductor c1351 = new Conductor(e15, transporte3);
		emple135.add(c1351);
		Date md135 = dfm.parse("2011-06-23");
		Mudanza m135 = new Mudanza(emple135, "Calle 18 #638", md135, 5);
		emp.getPendientes().add(m135);
		emp.finalizarMudanza(m135);

		/* Mudanza 136*/
		ArrayList<RolEmpleado> emple136 = new ArrayList<RolEmpleado>();
		Ayudante a1361 = new Ayudante(e8);
		emple136.add(a1361);
		Conductor c1361 = new Conductor(e12, transporte6);
		emple136.add(c1361);
		Date md136 = dfm.parse("2009-08-27");
		Mudanza m136 = new Mudanza(emple136, "Calle 3 #713", md136, 1);
		emp.getPendientes().add(m136);
		emp.finalizarMudanza(m136);

		/* Mudanza 137*/
		ArrayList<RolEmpleado> emple137 = new ArrayList<RolEmpleado>();
		Ayudante a1371 = new Ayudante(e26);
		emple137.add(a1371);
		Conductor c1371 = new Conductor(e30, transporte2);
		emple137.add(c1371);
		Date md137 = dfm.parse("2009-10-26");
		Mudanza m137 = new Mudanza(emple137, "Calle 51 #1770", md137, 3);
		emp.getPendientes().add(m137);
		emp.finalizarMudanza(m137);

		/* Mudanza 138*/
		ArrayList<RolEmpleado> emple138 = new ArrayList<RolEmpleado>();
		Ayudante a1381 = new Ayudante(e17);
		emple138.add(a1381);
		Ayudante a1382 = new Ayudante(e16);
		emple138.add(a1382);
		Conductor c1381 = new Conductor(e9, transporte2);
		emple138.add(c1381);
		Conductor c1382 = new Conductor(e5, transporte1);
		emple138.add(c1382);
		Date md138 = dfm.parse("2009-03-10");
		Mudanza m138 = new Mudanza(emple138, "Calle 72 #794", md138, 4);
		emp.getPendientes().add(m138);
		emp.finalizarMudanza(m138);

		/* Mudanza 139*/
		ArrayList<RolEmpleado> emple139 = new ArrayList<RolEmpleado>();
		Ayudante a1391 = new Ayudante(e15);
		emple139.add(a1391);
		Conductor c1391 = new Conductor(e8, transporte2);
		emple139.add(c1391);
		Date md139 = dfm.parse("2012-04-14");
		Mudanza m139 = new Mudanza(emple139, "Calle 64 #1722", md139, 1);
		emp.getPendientes().add(m139);

		/* Mudanza 140*/
		ArrayList<RolEmpleado> emple140 = new ArrayList<RolEmpleado>();
		Ayudante a1401 = new Ayudante(e15);
		emple140.add(a1401);
		Ayudante a1402 = new Ayudante(e16);
		emple140.add(a1402);
		Conductor c1401 = new Conductor(e19, transporte3);
		emple140.add(c1401);
		Conductor c1402 = new Conductor(e13, transporte1);
		emple140.add(c1402);
		Date md140 = dfm.parse("2009-06-12");
		Mudanza m140 = new Mudanza(emple140, "Calle 36 #1961", md140, 8);
		emp.getPendientes().add(m140);
		emp.finalizarMudanza(m140);

		/* Mudanza 141*/
		ArrayList<RolEmpleado> emple141 = new ArrayList<RolEmpleado>();
		Ayudante a1411 = new Ayudante(e30);
		emple141.add(a1411);
		Ayudante a1412 = new Ayudante(e13);
		emple141.add(a1412);
		Conductor c1411 = new Conductor(e22, transporte6);
		emple141.add(c1411);
		Date md141 = dfm.parse("2009-04-01");
		Mudanza m141 = new Mudanza(emple141, "Calle 53 #159", md141, 6);
		emp.getPendientes().add(m141);
		emp.finalizarMudanza(m141);

		/* Mudanza 142*/
		ArrayList<RolEmpleado> emple142 = new ArrayList<RolEmpleado>();
		Ayudante a1421 = new Ayudante(e15);
		emple142.add(a1421);
		Conductor c1421 = new Conductor(e15, transporte4);
		emple142.add(c1421);
		Conductor c1422 = new Conductor(e22, transporte6);
		emple142.add(c1422);
		Date md142 = dfm.parse("2010-09-13");
		Mudanza m142 = new Mudanza(emple142, "Calle 26 #1723", md142, 4);
		emp.getPendientes().add(m142);
		emp.finalizarMudanza(m142);

		/* Mudanza 143*/
		ArrayList<RolEmpleado> emple143 = new ArrayList<RolEmpleado>();
		Ayudante a1431 = new Ayudante(e25);
		emple143.add(a1431);
		Ayudante a1432 = new Ayudante(e18);
		emple143.add(a1432);
		Ayudante a1433 = new Ayudante(e9);
		emple143.add(a1433);
		Conductor c1431 = new Conductor(e28, transporte1);
		emple143.add(c1431);
		Date md143 = dfm.parse("2011-10-16");
		Mudanza m143 = new Mudanza(emple143, "Calle 42 #883", md143, 8);
		emp.getPendientes().add(m143);
		emp.finalizarMudanza(m143);

		/* Mudanza 144*/
		ArrayList<RolEmpleado> emple144 = new ArrayList<RolEmpleado>();
		Ayudante a1441 = new Ayudante(e16);
		emple144.add(a1441);
		Ayudante a1442 = new Ayudante(e7);
		emple144.add(a1442);
		Conductor c1441 = new Conductor(e12, transporte4);
		emple144.add(c1441);
		Conductor c1442 = new Conductor(e30, transporte4);
		emple144.add(c1442);
		Date md144 = dfm.parse("2010-08-21");
		Mudanza m144 = new Mudanza(emple144, "Calle 11 #1816", md144, 4);
		emp.getPendientes().add(m144);
		emp.finalizarMudanza(m144);

		/* Mudanza 145*/
		ArrayList<RolEmpleado> emple145 = new ArrayList<RolEmpleado>();
		Ayudante a1451 = new Ayudante(e7);
		emple145.add(a1451);
		Ayudante a1452 = new Ayudante(e1);
		emple145.add(a1452);
		Conductor c1451 = new Conductor(e3, transporte1);
		emple145.add(c1451);
		Conductor c1452 = new Conductor(e29, transporte4);
		emple145.add(c1452);
		Date md145 = dfm.parse("2011-11-26");
		Mudanza m145 = new Mudanza(emple145, "Calle 32 #1127", md145, 6);
		emp.getPendientes().add(m145);
		emp.finalizarMudanza(m145);

		/* Mudanza 146*/
		ArrayList<RolEmpleado> emple146 = new ArrayList<RolEmpleado>();
		Ayudante a1461 = new Ayudante(e6);
		emple146.add(a1461);
		Ayudante a1462 = new Ayudante(e20);
		emple146.add(a1462);
		Conductor c1461 = new Conductor(e14, transporte4);
		emple146.add(c1461);
		Date md146 = dfm.parse("2012-09-12");
		Mudanza m146 = new Mudanza(emple146, "Calle 37 #1188", md146, 3);
		emp.getPendientes().add(m146);

		/* Mudanza 147*/
		ArrayList<RolEmpleado> emple147 = new ArrayList<RolEmpleado>();
		Ayudante a1471 = new Ayudante(e22);
		emple147.add(a1471);
		Ayudante a1472 = new Ayudante(e27);
		emple147.add(a1472);
		Ayudante a1473 = new Ayudante(e21);
		emple147.add(a1473);
		Ayudante a1474 = new Ayudante(e10);
		emple147.add(a1474);
		Conductor c1471 = new Conductor(e29, transporte2);
		emple147.add(c1471);
		Date md147 = dfm.parse("2012-04-19");
		Mudanza m147 = new Mudanza(emple147, "Calle 43 #1332", md147, 3);
		emp.getPendientes().add(m147);

		/* Mudanza 148*/
		ArrayList<RolEmpleado> emple148 = new ArrayList<RolEmpleado>();
		Ayudante a1481 = new Ayudante(e24);
		emple148.add(a1481);
		Ayudante a1482 = new Ayudante(e5);
		emple148.add(a1482);
		Conductor c1481 = new Conductor(e19, transporte1);
		emple148.add(c1481);
		Date md148 = dfm.parse("2010-05-19");
		Mudanza m148 = new Mudanza(emple148, "Calle 20 #1813", md148, 8);
		emp.getPendientes().add(m148);
		emp.finalizarMudanza(m148);

		/* Mudanza 149*/
		ArrayList<RolEmpleado> emple149 = new ArrayList<RolEmpleado>();
		Ayudante a1491 = new Ayudante(e22);
		emple149.add(a1491);
		Ayudante a1492 = new Ayudante(e30);
		emple149.add(a1492);
		Conductor c1491 = new Conductor(e12, transporte2);
		emple149.add(c1491);
		Date md149 = dfm.parse("2011-09-15");
		Mudanza m149 = new Mudanza(emple149, "Calle 33 #1519", md149, 4);
		emp.getPendientes().add(m149);
		emp.finalizarMudanza(m149);

		/* Mudanza 150*/
		ArrayList<RolEmpleado> emple150 = new ArrayList<RolEmpleado>();
		Ayudante a1501 = new Ayudante(e30);
		emple150.add(a1501);
		Conductor c1501 = new Conductor(e13, transporte3);
		emple150.add(c1501);
		Date md150 = dfm.parse("2011-02-10");
		Mudanza m150 = new Mudanza(emple150, "Calle 10 #500", md150, 8);
		emp.getPendientes().add(m150);
		emp.finalizarMudanza(m150);

		/* Mudanza 151*/
		ArrayList<RolEmpleado> emple151 = new ArrayList<RolEmpleado>();
		Ayudante a1511 = new Ayudante(e5);
		emple151.add(a1511);
		Ayudante a1512 = new Ayudante(e18);
		emple151.add(a1512);
		Ayudante a1513 = new Ayudante(e19);
		emple151.add(a1513);
		Conductor c1511 = new Conductor(e29, transporte2);
		emple151.add(c1511);
		Date md151 = dfm.parse("2010-05-20");
		Mudanza m151 = new Mudanza(emple151, "Calle 65 #1932", md151, 2);
		emp.getPendientes().add(m151);
		emp.finalizarMudanza(m151);

		/* Mudanza 152*/
		ArrayList<RolEmpleado> emple152 = new ArrayList<RolEmpleado>();
		Ayudante a1521 = new Ayudante(e24);
		emple152.add(a1521);
		Conductor c1521 = new Conductor(e9, transporte6);
		emple152.add(c1521);
		Conductor c1522 = new Conductor(e28, transporte2);
		emple152.add(c1522);
		Date md152 = dfm.parse("2009-05-25");
		Mudanza m152 = new Mudanza(emple152, "Calle 15 #626", md152, 1);
		emp.getPendientes().add(m152);
		emp.finalizarMudanza(m152);

		/* Mudanza 153*/
		ArrayList<RolEmpleado> emple153 = new ArrayList<RolEmpleado>();
		Ayudante a1531 = new Ayudante(e4);
		emple153.add(a1531);
		Ayudante a1532 = new Ayudante(e11);
		emple153.add(a1532);
		Ayudante a1533 = new Ayudante(e20);
		emple153.add(a1533);
		Conductor c1531 = new Conductor(e25, transporte4);
		emple153.add(c1531);
		Conductor c1532 = new Conductor(e23, transporte1);
		emple153.add(c1532);
		Date md153 = dfm.parse("2010-10-04");
		Mudanza m153 = new Mudanza(emple153, "Calle 50 #368", md153, 4);
		emp.getPendientes().add(m153);
		emp.finalizarMudanza(m153);

		/* Mudanza 154*/
		ArrayList<RolEmpleado> emple154 = new ArrayList<RolEmpleado>();
		Ayudante a1541 = new Ayudante(e26);
		emple154.add(a1541);
		Ayudante a1542 = new Ayudante(e14);
		emple154.add(a1542);
		Ayudante a1543 = new Ayudante(e15);
		emple154.add(a1543);
		Date md154 = dfm.parse("2012-07-31");
		Mudanza m154 = new Mudanza(emple154, "Calle 64 #200", md154, 2);
		emp.getPendientes().add(m154);

		/* Mudanza 155*/
		ArrayList<RolEmpleado> emple155 = new ArrayList<RolEmpleado>();
		Ayudante a1551 = new Ayudante(e28);
		emple155.add(a1551);
		Conductor c1551 = new Conductor(e25, transporte3);
		emple155.add(c1551);
		Date md155 = dfm.parse("2010-03-01");
		Mudanza m155 = new Mudanza(emple155, "Calle 11 #161", md155, 4);
		emp.getPendientes().add(m155);
		emp.finalizarMudanza(m155);

		/* Mudanza 156*/
		ArrayList<RolEmpleado> emple156 = new ArrayList<RolEmpleado>();
		Ayudante a1561 = new Ayudante(e11);
		emple156.add(a1561);
		Ayudante a1562 = new Ayudante(e26);
		emple156.add(a1562);
		Ayudante a1563 = new Ayudante(e30);
		emple156.add(a1563);
		Conductor c1561 = new Conductor(e3, transporte1);
		emple156.add(c1561);
		Date md156 = dfm.parse("2010-10-20");
		Mudanza m156 = new Mudanza(emple156, "Calle 27 #1709", md156, 5);
		emp.getPendientes().add(m156);
		emp.finalizarMudanza(m156);

		/* Mudanza 157*/
		ArrayList<RolEmpleado> emple157 = new ArrayList<RolEmpleado>();
		Ayudante a1571 = new Ayudante(e29);
		emple157.add(a1571);
		Ayudante a1572 = new Ayudante(e20);
		emple157.add(a1572);
		Ayudante a1573 = new Ayudante(e4);
		emple157.add(a1573);
		Conductor c1571 = new Conductor(e26, transporte3);
		emple157.add(c1571);
		Conductor c1572 = new Conductor(e29, transporte3);
		emple157.add(c1572);
		Date md157 = dfm.parse("2010-02-10");
		Mudanza m157 = new Mudanza(emple157, "Calle 3 #519", md157, 5);
		emp.getPendientes().add(m157);
		emp.finalizarMudanza(m157);

		/* Mudanza 158*/
		ArrayList<RolEmpleado> emple158 = new ArrayList<RolEmpleado>();
		Ayudante a1581 = new Ayudante(e2);
		emple158.add(a1581);
		Ayudante a1582 = new Ayudante(e16);
		emple158.add(a1582);
		Conductor c1581 = new Conductor(e26, transporte4);
		emple158.add(c1581);
		Date md158 = dfm.parse("2010-08-30");
		Mudanza m158 = new Mudanza(emple158, "Calle 5 #269", md158, 1);
		emp.getPendientes().add(m158);
		emp.finalizarMudanza(m158);

		/* Mudanza 159*/
		ArrayList<RolEmpleado> emple159 = new ArrayList<RolEmpleado>();
		Ayudante a1591 = new Ayudante(e18);
		emple159.add(a1591);
		Conductor c1591 = new Conductor(e21, transporte6);
		emple159.add(c1591);
		Date md159 = dfm.parse("2010-07-27");
		Mudanza m159 = new Mudanza(emple159, "Calle 41 #1796", md159, 7);
		emp.getPendientes().add(m159);
		emp.finalizarMudanza(m159);

		/* Mudanza 160*/
		ArrayList<RolEmpleado> emple160 = new ArrayList<RolEmpleado>();
		Ayudante a1601 = new Ayudante(e5);
		emple160.add(a1601);
		Ayudante a1602 = new Ayudante(e2);
		emple160.add(a1602);
		Conductor c1601 = new Conductor(e20, transporte5);
		emple160.add(c1601);
		Date md160 = dfm.parse("2009-10-13");
		Mudanza m160 = new Mudanza(emple160, "Calle 10 #1916", md160, 6);
		emp.getPendientes().add(m160);
		emp.finalizarMudanza(m160);

		/* Mudanza 161*/
		ArrayList<RolEmpleado> emple161 = new ArrayList<RolEmpleado>();
		Ayudante a1611 = new Ayudante(e3);
		emple161.add(a1611);
		Ayudante a1612 = new Ayudante(e12);
		emple161.add(a1612);
		Ayudante a1613 = new Ayudante(e2);
		emple161.add(a1613);
		Conductor c1611 = new Conductor(e11, transporte3);
		emple161.add(c1611);
		Date md161 = dfm.parse("2012-08-20");
		Mudanza m161 = new Mudanza(emple161, "Calle 18 #1108", md161, 5);
		emp.getPendientes().add(m161);

		/* Mudanza 162*/
		ArrayList<RolEmpleado> emple162 = new ArrayList<RolEmpleado>();
		Ayudante a1621 = new Ayudante(e28);
		emple162.add(a1621);
		Ayudante a1622 = new Ayudante(e17);
		emple162.add(a1622);
		Ayudante a1623 = new Ayudante(e5);
		emple162.add(a1623);
		Conductor c1621 = new Conductor(e22, transporte6);
		emple162.add(c1621);
		Conductor c1622 = new Conductor(e20, transporte1);
		emple162.add(c1622);
		Date md162 = dfm.parse("2010-07-15");
		Mudanza m162 = new Mudanza(emple162, "Calle 29 #1057", md162, 7);
		emp.getPendientes().add(m162);
		emp.finalizarMudanza(m162);

		/* Mudanza 163*/
		ArrayList<RolEmpleado> emple163 = new ArrayList<RolEmpleado>();
		Ayudante a1631 = new Ayudante(e8);
		emple163.add(a1631);
		Conductor c1631 = new Conductor(e29, transporte6);
		emple163.add(c1631);
		Conductor c1632 = new Conductor(e13, transporte2);
		emple163.add(c1632);
		Date md163 = dfm.parse("2011-11-28");
		Mudanza m163 = new Mudanza(emple163, "Calle 31 #351", md163, 8);
		emp.getPendientes().add(m163);
		emp.finalizarMudanza(m163);

		/* Mudanza 164*/
		ArrayList<RolEmpleado> emple164 = new ArrayList<RolEmpleado>();
		Ayudante a1641 = new Ayudante(e26);
		emple164.add(a1641);
		Ayudante a1642 = new Ayudante(e3);
		emple164.add(a1642);
		Ayudante a1643 = new Ayudante(e12);
		emple164.add(a1643);
		Ayudante a1644 = new Ayudante(e22);
		emple164.add(a1644);
		Conductor c1641 = new Conductor(e16, transporte5);
		emple164.add(c1641);
		Date md164 = dfm.parse("2012-09-13");
		Mudanza m164 = new Mudanza(emple164, "Calle 11 #1756", md164, 5);
		emp.getPendientes().add(m164);

		/* Mudanza 165*/
		ArrayList<RolEmpleado> emple165 = new ArrayList<RolEmpleado>();
		Ayudante a1651 = new Ayudante(e22);
		emple165.add(a1651);
		Ayudante a1652 = new Ayudante(e19);
		emple165.add(a1652);
		Conductor c1651 = new Conductor(e4, transporte3);
		emple165.add(c1651);
		Date md165 = dfm.parse("2010-06-08");
		Mudanza m165 = new Mudanza(emple165, "Calle 44 #317", md165, 1);
		emp.getPendientes().add(m165);
		emp.finalizarMudanza(m165);

		/* Mudanza 166*/
		ArrayList<RolEmpleado> emple166 = new ArrayList<RolEmpleado>();
		Ayudante a1661 = new Ayudante(e25);
		emple166.add(a1661);
		Ayudante a1662 = new Ayudante(e14);
		emple166.add(a1662);
		Ayudante a1663 = new Ayudante(e20);
		emple166.add(a1663);
		Conductor c1661 = new Conductor(e13, transporte4);
		emple166.add(c1661);
		Date md166 = dfm.parse("2011-12-31");
		Mudanza m166 = new Mudanza(emple166, "Calle 3 #1944", md166, 8);
		emp.getPendientes().add(m166);
		emp.finalizarMudanza(m166);

		/* Mudanza 167*/
		ArrayList<RolEmpleado> emple167 = new ArrayList<RolEmpleado>();
		Ayudante a1671 = new Ayudante(e12);
		emple167.add(a1671);
		Ayudante a1672 = new Ayudante(e27);
		emple167.add(a1672);
		Conductor c1671 = new Conductor(e13, transporte1);
		emple167.add(c1671);
		Date md167 = dfm.parse("2011-04-22");
		Mudanza m167 = new Mudanza(emple167, "Calle 31 #1868", md167, 3);
		emp.getPendientes().add(m167);
		emp.finalizarMudanza(m167);

		/* Mudanza 168*/
		ArrayList<RolEmpleado> emple168 = new ArrayList<RolEmpleado>();
		Ayudante a1681 = new Ayudante(e14);
		emple168.add(a1681);
		Ayudante a1682 = new Ayudante(e24);
		emple168.add(a1682);
		Conductor c1681 = new Conductor(e8, transporte6);
		emple168.add(c1681);
		Date md168 = dfm.parse("2009-12-04");
		Mudanza m168 = new Mudanza(emple168, "Calle 68 #912", md168, 2);
		emp.getPendientes().add(m168);
		emp.finalizarMudanza(m168);

		/* Mudanza 169*/
		ArrayList<RolEmpleado> emple169 = new ArrayList<RolEmpleado>();
		Ayudante a1691 = new Ayudante(e6);
		emple169.add(a1691);
		Ayudante a1692 = new Ayudante(e11);
		emple169.add(a1692);
		Conductor c1691 = new Conductor(e3, transporte1);
		emple169.add(c1691);
		Date md169 = dfm.parse("2012-03-28");
		Mudanza m169 = new Mudanza(emple169, "Calle 41 #1571", md169, 7);
		emp.getPendientes().add(m169);
		emp.finalizarMudanza(m169);

		/* Mudanza 170*/
		ArrayList<RolEmpleado> emple170 = new ArrayList<RolEmpleado>();
		Ayudante a1701 = new Ayudante(e1);
		emple170.add(a1701);
		Conductor c1701 = new Conductor(e10, transporte1);
		emple170.add(c1701);
		Date md170 = dfm.parse("2008-12-03");
		Mudanza m170 = new Mudanza(emple170, "Calle 30 #1890", md170, 3);
		emp.getPendientes().add(m170);
		emp.finalizarMudanza(m170);

		/* Mudanza 171*/
		ArrayList<RolEmpleado> emple171 = new ArrayList<RolEmpleado>();
		Ayudante a1711 = new Ayudante(e12);
		emple171.add(a1711);
		Ayudante a1712 = new Ayudante(e6);
		emple171.add(a1712);
		Ayudante a1713 = new Ayudante(e5);
		emple171.add(a1713);
		Conductor c1711 = new Conductor(e15, transporte5);
		emple171.add(c1711);
		Date md171 = dfm.parse("2009-03-07");
		Mudanza m171 = new Mudanza(emple171, "Calle 51 #1967", md171, 7);
		emp.getPendientes().add(m171);
		emp.finalizarMudanza(m171);

		/* Mudanza 172*/
		ArrayList<RolEmpleado> emple172 = new ArrayList<RolEmpleado>();
		Ayudante a1721 = new Ayudante(e27);
		emple172.add(a1721);
		Ayudante a1722 = new Ayudante(e22);
		emple172.add(a1722);
		Ayudante a1723 = new Ayudante(e21);
		emple172.add(a1723);
		Conductor c1721 = new Conductor(e18, transporte5);
		emple172.add(c1721);
		Date md172 = dfm.parse("2008-11-14");
		Mudanza m172 = new Mudanza(emple172, "Calle 54 #1805", md172, 5);
		emp.getPendientes().add(m172);
		emp.finalizarMudanza(m172);

		/* Mudanza 173*/
		ArrayList<RolEmpleado> emple173 = new ArrayList<RolEmpleado>();
		Ayudante a1731 = new Ayudante(e15);
		emple173.add(a1731);
		Ayudante a1732 = new Ayudante(e15);
		emple173.add(a1732);
		Conductor c1731 = new Conductor(e26, transporte2);
		emple173.add(c1731);
		Date md173 = dfm.parse("2008-11-21");
		Mudanza m173 = new Mudanza(emple173, "Calle 25 #1608", md173, 5);
		emp.getPendientes().add(m173);
		emp.finalizarMudanza(m173);

		/* Mudanza 174*/
		ArrayList<RolEmpleado> emple174 = new ArrayList<RolEmpleado>();
		Ayudante a1741 = new Ayudante(e21);
		emple174.add(a1741);
		Conductor c1741 = new Conductor(e8, transporte3);
		emple174.add(c1741);
		Date md174 = dfm.parse("2009-08-09");
		Mudanza m174 = new Mudanza(emple174, "Calle 55 #717", md174, 2);
		emp.getPendientes().add(m174);
		emp.finalizarMudanza(m174);

		/* Mudanza 175*/
		ArrayList<RolEmpleado> emple175 = new ArrayList<RolEmpleado>();
		Ayudante a1751 = new Ayudante(e8);
		emple175.add(a1751);
		Ayudante a1752 = new Ayudante(e13);
		emple175.add(a1752);
		Ayudante a1753 = new Ayudante(e13);
		emple175.add(a1753);
		Ayudante a1754 = new Ayudante(e26);
		emple175.add(a1754);
		Conductor c1751 = new Conductor(e6, transporte2);
		emple175.add(c1751);
		Date md175 = dfm.parse("2010-11-27");
		Mudanza m175 = new Mudanza(emple175, "Calle 33 #1424", md175, 6);
		emp.getPendientes().add(m175);
		emp.finalizarMudanza(m175);

		/* Mudanza 176*/
		ArrayList<RolEmpleado> emple176 = new ArrayList<RolEmpleado>();
		Ayudante a1761 = new Ayudante(e28);
		emple176.add(a1761);
		Ayudante a1762 = new Ayudante(e16);
		emple176.add(a1762);
		Conductor c1761 = new Conductor(e1, transporte2);
		emple176.add(c1761);
		Date md176 = dfm.parse("2010-04-24");
		Mudanza m176 = new Mudanza(emple176, "Calle 11 #1220", md176, 1);
		emp.getPendientes().add(m176);
		emp.finalizarMudanza(m176);

		/* Mudanza 177*/
		ArrayList<RolEmpleado> emple177 = new ArrayList<RolEmpleado>();
		Ayudante a1771 = new Ayudante(e10);
		emple177.add(a1771);
		Ayudante a1772 = new Ayudante(e15);
		emple177.add(a1772);
		Conductor c1771 = new Conductor(e27, transporte4);
		emple177.add(c1771);
		Date md177 = dfm.parse("2011-12-20");
		Mudanza m177 = new Mudanza(emple177, "Calle 2 #1992", md177, 4);
		emp.getPendientes().add(m177);
		emp.finalizarMudanza(m177);

		/* Mudanza 178*/
		ArrayList<RolEmpleado> emple178 = new ArrayList<RolEmpleado>();
		Ayudante a1781 = new Ayudante(e4);
		emple178.add(a1781);
		Ayudante a1782 = new Ayudante(e9);
		emple178.add(a1782);
		Ayudante a1783 = new Ayudante(e19);
		emple178.add(a1783);
		Date md178 = dfm.parse("2012-06-11");
		Mudanza m178 = new Mudanza(emple178, "Calle 30 #799", md178, 1);
		emp.getPendientes().add(m178);

		/* Mudanza 179*/
		ArrayList<RolEmpleado> emple179 = new ArrayList<RolEmpleado>();
		Ayudante a1791 = new Ayudante(e21);
		emple179.add(a1791);
		Ayudante a1792 = new Ayudante(e12);
		emple179.add(a1792);
		Conductor c1791 = new Conductor(e7, transporte4);
		emple179.add(c1791);
		Conductor c1792 = new Conductor(e20, transporte1);
		emple179.add(c1792);
		Date md179 = dfm.parse("2011-09-27");
		Mudanza m179 = new Mudanza(emple179, "Calle 35 #1711", md179, 3);
		emp.getPendientes().add(m179);
		emp.finalizarMudanza(m179);

		/* Mudanza 180*/
		ArrayList<RolEmpleado> emple180 = new ArrayList<RolEmpleado>();
		Ayudante a1801 = new Ayudante(e2);
		emple180.add(a1801);
		Ayudante a1802 = new Ayudante(e22);
		emple180.add(a1802);
		Conductor c1801 = new Conductor(e9, transporte6);
		emple180.add(c1801);
		Date md180 = dfm.parse("2012-08-21");
		Mudanza m180 = new Mudanza(emple180, "Calle 60 #750", md180, 8);
		emp.getPendientes().add(m180);

		
		System.out.println(emp.getPendientes().size());
		System.out.println(emp.getRealizadas().size());
		JDOSupport.init();

		PersistenceManager pm = JDOSupport.getPM();

		try {

			pm.currentTransaction().begin();

			pm.makePersistent(emp);
			
			pm.currentTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Es el método main de esta clase que permite su ejecución como un
	 * programa.
	 * 
	 * @param args
	 *            es una lista con los argumentos pasados como parámetros.
	 */
	
	public static void main(String[] args) {
		System.out.println("-----START----------");
		try {
			createObjects();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-----FINISH.--------");
	}

}
