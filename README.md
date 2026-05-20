# PROYECTO ENTORNOS DE DESARROLLO #
---

<h1 align="center">ÍNDICE</h1>

## INTRODUCCIÓN.
  *  Avance y dominio de nuevas herramientas.
  *  Un proyecto implica una gran capacidad del desarrollador para justificar cada decisión que toma.

## CONTROL DE VERSIONES.
<table>
  <tr>
    <td width="60%" style="vertical-align:top;">
      <ul>
        <li><strong>Definición.</strong></li>
		  <ol>
           <li>Esqueleto de cualquier proyecto de ingeniería de software moderno.  </li>	 
			<li>Registro histórico inmutable.</li>
			  <ol>TIPOS DE CONTROL DE VERSIONES.
			  	<li>Sistemas Locales.</li>
			  	<li>Sistemas Centralizados.</li>
			  	<li>Sistemas Distribuidos.</li>
				  </ol>
		  </ol>
        <li><strong>Evolución.</strong></li>
		  <ol>
			  <li>Copias manuales en discos duros, conlleva pérdida de datos.</li>
			  <li>Nuevo concepto de servido único, pero si se caía el servidor o no había conexión a internet, el desarrollo se detenía.</li>
			  <li>Sistemas de Control de Versiones Distribuidos (DVCS) liderado por Git. Cada desarrollador dispone de un clon del repositorio.</li>
		  </ol>
		<li><ol><strong>Funcionamiento.</strong></li>
		  	<li>Detecta y evita problemas.</li>
		  	<li>Los programadores trabajan sobre el mismo archivo.</li>
			</ol>
		  <ol>
			  <ol>FUNCIONES.
			  	<li>Seguimiento de cambios.</li>
			  	<li>Compartir trabajo de forma simultánea.</li>
			  	<li>Volver atrás a cualquier punto del desarrollo.</li>
			  	<li>Quién y cuándo modificó el código.</li>
			  	<li>Historial de cambios.</li>
				  </ol>
		  </ol>
		<ol>
			  <ol>TERMINOLOGÍA.
			  	<li>Repositorio.</li>
			  	<li>Rama (Branch).</li>
			  	<li>Merge.</li>
				<li>Conflicto.</li>
			  	<li>Commit.</li>
			  	<li>HEAD.</li>
				<li>Tag.</li>
			  	<li>Sincronización.</li>
				  </ol>
		  </ol>
      </ul>
    </td>
    <td width="40%">
      <img src="https://codideep.com/img/blogpost/imagenportada/201811200000001.png" alt= "Control de Versiones" width="100%">
    </td>
  </tr>
</table>

---

## GIT. 

<table>
  <tr>
    <td width="40%" style="vertical-align:top;">
		<ul>
			Herramienta de control de versiones de software libre, desarrollada por Linus Torvalds.
				<ol>FUNCIONES.
					<li>Trabajo en equipo.</li>
					<li>Controlar cambios de código.</li>
					<li>Mezclar y fusionar cambios.</li>
					<li>Listado de commits y movernos por ellos.</li>
				</ol>
				<ol>ARQUITECTURA INTERNA DE GIT Y ÁREAS DE TRABAJO.
					<li>Directorio de Trabajo(Working Directory).</li>
					<li>Área de Preparación (Staging Area o Index).</li>
					<li>Repositorio Local (Local Repo).</li>
					<li>Repositorio Remoto (Remote Repo).</li>
				</ol>
				<ol>IMPLEMENTACIÓN DE GIT EN EL FLUJO DE DESARROLLO DEL PROYECTO.
					** Existe una evolución lógica y secuencial.
					<li>Rama Principal (main/trunk).</li>
					<li>Rama de Desarrollo (develop).</li>
					<li>Ramas de Funcionlaidad (feature/xxx).</li>
				</ol>
				<ol>OPERACIONES DE SINCRONIZACIÓN: PUSH, PULL Y FETCH.
					** La sincronización del trabajo local con el repositorio central en la nube es indispensable para el desarrollo colaborativo.
					<li>Push Origin (git push origin)/rama.</li>
					<li>Fetch Origin (git fetch origin).</li>
				</ol>
		</ul>
    </td>
    <td width="40%">
      <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdd25hyNQOMs4Xx1Cv_A_oaT0zagfSWlXMBA&s" alt= "Git" width="100%">
    </td>
  </tr>
</table>

---

## DOCUMENTACIÓN.

<table>
  <tr>
    <td width="40%" style="vertical-align:top;">
      <ul>
        <li>Código Fuente.</li>
		  	Comentarios internos para el equipo de desarrollo.
        <li>JavaDoc.</li>
		  	Herramienta que integra la explicación del código dentro del propio código fuente.
		  	<ol>FASES.
				<li>Especificaciones.</li>
				<li>Diseño.</li>
				<li>Código Fuente.</li>
				<li>Usuario Final.</li>
			</ol>
        <li>JavaDoc con Netbeans.</li>
      </ul>
    </td>
    <td width="40%">
      <img src="https://javalangnullpointer.wordpress.com/wp-content/uploads/2007/04/add_in_editor.gif" alt= "Git" width="100%">
    </td>
  </tr>
</table>

---

## REFACTORIZACIÓN.

<table>
  <tr>
    <td width="40%" style="vertical-align:top;">
		Técnica de la ingeniería de software que permite la optimización de un código previamente escrito. Proceso que transforma el diseño interno del código para hacerlo más legible y mantenible sin alterar su comportamiento externo.
      <ul>
        <li>Cuando refactorizar. Code Smells.</li>
		  	Durante el desarrollo del código de un programa, aparecen síntomas visuales que sugieren un problema de diseño, lo que implica la necesidad de refactorizar, esto se conoce como CODE SMELLS.
		  <ol>SÍNTOMAS GENERALES.
			  	<li>Repetición.</li>
			  	<li>Rigidez.</li>
			  	<li>Fragilidad.</li>
			  	<li>Complejidad innecesaria.</li>
			  	<li>Código difícil de entender.</li>
			  	<li>Distintos lenguajes en un mismo código.</li>
			  	<li>Aspecto del código.</li>
		  </ol>
		  <ol>SINTOMAS ESPECÍFICOS.
			  <li>Métodos muy largos.</li>
			  <li>Código Duplicado.</li>
			  <li>Clases Grandes.</li>
			  <li>Demasiados Parámetros.</li>
			  <li>Números Mágicos.</li>
			  <li>Imports.</li>
			  <li>Nombres que no indican propósito.</li>
			  <li>Código obsoleto.</li>
			  <li>Sólo datos.</li>
			  <li>Envidia de funcionalidad.</li>
			  <li>Cirugía de escopeta.</li>
			  <li>Legado Rechazado.</li>
		  </ol>
        <li>Refactorización en Netbeans.</li>
        <li>Patrones de factorización.</li>
      </ul>
    </td>
    <td width="40%">
      <img src="https://cdn-icons-png.flaticon.com/512/2621/2621041.png" alt= "Git" width="100%">
    </td>
  </tr>
</table>
 
---

## TRABAJO REALIZADO POR:
* [David Mengual](https://github.com/mengualbarragandavid-wq)
* [David Pacheco](https://github.com/Themyth0)
* [Alejandro Ramírez](https://github.com/ARNieves)
* [Sergio Alcántara](https://github.com/seralcesc)
