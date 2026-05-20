# PROYECTO ENTORNOS DE DESARROLLO

---

<h1 align="center">ÍNDICE</h1>

<!-- BADGES PROFESIONALES -->
<p align="center">
  <img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white" alt="Git" />
  <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" alt="GitHub" />
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans&logoColor=white" alt="NetBeans" />
  <img src="https://img.shields.io/badge/Markdown-000000?style=for-the-badge&logo=markdown&logoColor=white" alt="Markdown" />
</p>

---

## INTRODUCCIÓN.
* Avance y dominio de nuevas herramientas.
* Un proyecto implica una gran capacidad del desarrollador para justificar cada decisión que toma.

---

## CONTROL DE VERSIONES.
<table>
  <tr>
    <td width="60%" style="vertical-align:top;">
      <ul>
        <li><strong>Definición.</strong>
          <ol>
            <li>Esqueleto de cualquier proyecto de ingeniería de software moderno.</li>   
            <li>Registro histórico inmutable.</li>
          </ol>
          <br>
          <strong>TIPOS DE CONTROL DE VERSIONES:</strong>
          <ol>
            <li>Sistemas Locales.</li>
            <li>Sistemas Centralizados.</li>
            <li>Sistemas Distribuidos.</li>
          </ol>
        </li>
        <hr>
        <li><strong>Evolución.</strong>
          <ol>
            <li>Copias manuales en discos duros, conlleva pérdida de datos.</li>
            <li>Nuevo concepto de servidor único, pero si se caía el servidor o no había conexión a internet, el desarrollo se detenía.</li>
            <li>Sistemas de Control de Versiones Distribuidos (DVCS) liderado por Git. Cada desarrollador dispone de un clon del repositorio.</li>
          </ol>
        </li>
        <hr>
        <li><strong>Funcionamiento.</strong>
          <ol>
            <li>Detecta y evita problemas.</li>
            <li>Los programadores trabajan sobre el mismo archivo.</li>
          </ol>
        </li>
        <hr>
        <li><strong>FUNCIONES.</strong>
          <ol>
            <li>Seguimiento de cambios.</li>
            <li>Compartir trabajo de forma simultánea.</li>
            <li>Volver atrás a cualquier punto del desarrollo.</li>
            <li>Quién y cuándo modificó el código.</li>
            <li>Historial de cambios.</li>
          </ol>
        </li>
        <hr>
        <li><strong>TERMINOLOGÍA.</strong>
          <ol>
            <li>Repositorio.</li>
            <li>Rama (Branch).</li>
            <li>Merge.</li>
            <li>Conflicto.</li>
            <li>Commit.</li>
            <li>HEAD.</li>
            <li>Tag.</li>
            <li>Sincronización.</li>
          </ol>
        </li>
      </ul>
    </td>
    <td width="40%" style="vertical-align:middle;">
      <img src="https://codideep.com/img/blogpost/imagenportada/201811200000001.png" alt="Control de Versiones" width="100%">
    </td>
  </tr>
</table>

---

## GIT. 

<table>
  <tr>
    <td width="60%" style="vertical-align:top;">
      <p>Herramienta de control de versiones de software libre, desarrollada por Linus Torvalds.</p>
      <hr>
      <ul>
        <li><strong>FUNCIONES.</strong>
          <ol>
            <li>Trabajo en equipo.</li>
            <li>Controlar cambios de código.</li>
            <li>Mezclar y fusionar cambios.</li>
            <li>Listado de commits y movernos por ellos.</li>
          </ol>
        </li>
        <hr>
        <li><strong>ARQUITECTURA INTERNA DE GIT Y ÁREAS DE TRABAJO.</strong>
          <ol>
            <li>Directorio de Trabajo (Working Directory).</li>
            <li>Área de Preparación (Staging Area o Index).</li>
            <li>Repositorio Local (Local Repo).</li>
            <li>Repositorio Remoto (Remote Repo).</li>
          </ol>
        </li>
        <hr>
        <li><strong>IMPLEMENTACIÓN DE GIT EN EL FLUJO DE DESARROLLO DEL PROYECTO.</strong>
          <p><em>Existe una evolución lógica y secuencial.</em></p>
          <ol>
            <li>Rama Principal (main/trunk).</li>
            <li>Rama de Desarrollo (develop).</li>
            <li>Ramas de Funcionalidad (feature/xxx).</li>
          </ol>
        </li>
        <hr>
        <li><strong>OPERACIONES DE SINCRONIZACIÓN: PUSH, PULL Y FETCH.</strong>
          <p><em>La sincronización del trabajo local con el repositorio central en la nube es indispensable para el desarrollo colaborativo.</em></p>
          <ol>
            <li>Push Origin (git push origin [rama]).</li>
            <li>Fetch Origin (git fetch origin).</li>
            <li>Pull Origin (git pull origin [rama]).</li>
          </ol>
        </li>
        <hr>
        <li><strong>EL FLUJO DE INTEGRACIÓN AVANZADO: CREACIÓN, REVISIÓN Y FUSIÓN DE PULL REQUESTS.</strong>
          <p><em>La fusión directa de ramas en main se hace mediante Pull Requests, que no es un comando nativo del CLI de Git.</em></p>
          <ol>
            <li>Bifurcación y Desarrollo.</li>
            <li>Publicación de la Rama.</li>
            <li>Apertura del Pull Request.</li>
            <li>Auditoría y Revisión de Código.</li>
            <li>Ejecución de Integración Continua.</li>
            <li>Fusión Final.</li>
            <li>Sincronización y Limpieza.</li>
          </ol>
        </li>
        <hr>
        <li><strong>TAGS Y .GITIGNORE.</strong>
          <p><em>Un tag es un puntero fijo y estático en la historia del repositorio.</em></p>
          <ol>
            <li>Implementación en Github Desktop.</li>
          </ol>
          <p><em>.GITIGNORE es la raíz del proyecto local, utilizando patrones semánticos y comodines.</em></p>
          <ol>
            <li>target/ o build/</li>
            <li>*.class</li>
            <li>nbproject/ y *.nbaction</li>
          </ol>
        </li>
        <hr>
        <li><strong>PROCEDIMIENTO PARA DESHACER CAMBIOS ANTE ERRORES.</strong>
          <p><em>Volver atrás con seguridad es vital para evitar riesgos. Por eso, se han implementado tres herramientas de Git para la recuperación de código en caso de fallo.</em></p>
          <ol>
            <li>Descartar Cambios Locales.</li>
            <li>Sacar del Staging.</li>
            <li>Revertir commits de forma segura.</li>
          </ol>
        </li>
      </ul>
    </td>
    <td width="40%" style="vertical-align:middle;">
      <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdd25hyNQOMs4Xx1Cv_A_oaT0zagfSWlXMBA&s" alt="Git" width="100%"><br><br>
      <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/a/ae/Github-desktop-logo-symbol.svg/3840px-Github-desktop-logo-symbol.svg.png" alt="GitDesktop" width="100%"><br><br>
      <img src="https://logos-world.net/wp-content/uploads/2022/07/Java-Logo.jpg" alt="Java" width="100%"><br><br>
      <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/Apache_NetBeans_Logo.svg/1280px-Apache_NetBeans_Logo.svg.png" alt="NetBeans" width="100%">
    </td>
  </tr>
</table>

---

## DOCUMENTACIÓN.

<table>
  <tr>
    <td width="60%" style="vertical-align:top;">
      <p>La documentación es la parte más descuidada del desarrollo de software. En Java, Javadoc no es solo una herramienta, sino una filosofía de diseño que integra la explicación del código dentro del código fuente.</p>
      <hr>
      <ul>
        <li><strong>FASES.</strong>
          <ol>
            <li>Especificaciones.</li>
            <li>Diseño.</li>
            <li>Código Fuente.</li>
            <li>Usuario Final.</li>
          </ol>
        </li>
        <hr>
        <li><strong>SINTAXIS Y ETIQUETAS ESTÁNDAR EN JAVADOC</strong>
          <ol>
            <li>@author</li>
            <li>@version</li>
            <li>@param</li>
            <li>@return</li>
          </ol>
        </li>
      </ul>
    </td>
    <td width="40%" style="vertical-align:middle;">
      <img src="https://javalangnullpointer.wordpress.com/wp-content/uploads/2007/04/add_in_editor.gif" alt="Javadoc" width="100%">
    </td>
  </tr>
</table>

---

## REFACTORIZACIÓN.

<table>
  <tr>
    <td width="60%" style="vertical-align:top;">
      <p>Técnica de la ingeniería de software que permite la optimización de un código previamente escrito. Proceso que transforma el diseño interno del código para hacerlo más legible y mantenible sin alterar su comportamiento externo.</p>
      <hr>
      <ul>
        <li><strong>EL CONCEPTO DE CODE SMELLS.</strong>
          <p>Durante el desarrollo del código de un programa, aparecen síntomas visuales que sugieren un problema de diseño, lo que implica la necesidad de refactorizar. Esto se conoce como CODE SMELLS.</p>
        </li>
        <hr>
        <li><strong>SÍNTOMAS GENERALES.</strong>
          <ol>
            <li>Repetición.</li>
            <li>Rigidez.</li>
            <li>Fragilidad.</li>
            <li>Complejidad innecesaria.</li>
            <li>Código difícil de entender.</li>
            <li>Distintos lenguajes en un mismo código.</li>
            <li>Aspecto del código.</li>
          </ol>
        </li>
        <hr>
        <li><strong>SÍNTOMAS ESPECÍFICOS.</strong>
          <ol>
            <li>Métodos muy largos.</li>
            <li>Código Duplicado.</li>
            <li>Clases Grandes.</li>
            <li>Demasiados Parámetros.</li>
            <li>Números Mágicos.</li>
            <li>Nombres que no indican propósito.</li>
            <li>Código obsoleto.</li>
            <li>Sólo datos.</li>
          </ol>
        </li>
        <hr>
        <li><strong>FASES DE UNA REFACTORIZACIÓN SEGURA.</strong>
          <ol>
            <li><strong>Paso Cero:</strong> Realizar pruebas para confirmar el error.</li>
            <li><strong>Paso Uno:</strong> Hacer cambios pequeños realizando un único patrón de refactorización a la vez.</li>
            <li><strong>Paso Dos:</strong> Verificar lo que hemos hecho realizando pruebas unitarias.</li>
            <li><strong>Paso Tres:</strong> Documentar y hacer Commit. Una vez se ha refactorizado, se actualizará el Javadoc y se hará un commit en el repositorio.</li>
          </ol>
        </li>
      </ul>
    </td>
    <td width="40%" style="vertical-align:middle;">
      <img src="https://cdn-icons-png.flaticon.com/512/2621/2621041.png" alt="Refactorización" width="100%">
    </td>
  </tr>
</table>
 
---

## TRABAJO REALIZADO POR:
* [David Mengual](https://github.com/mengualbarragandavid-wq)
* [David Pacheco](https://github.com/Themyth0)
* [Alejandro Ramírez](https://github.com/ARNieves)
* [Sergio Alcántara](https://github.com/seralcesc)
