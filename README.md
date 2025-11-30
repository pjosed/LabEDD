# 🏪 Supermercado La Estrella — Inventory Management System

**Java | GUI | File Handling | NetBeans Project**

Sistema completo de gestión de inventario y proveedores usando archivos secuenciales en Java. Diseñado para simular el flujo real de un supermercado: productos, proveedores, entregas, reposiciones y control total desde una GUI.

---

## 🚀 Overview

Supermercado *La Estrella* necesitaba controlar su inventario sin bases de datos.  
La solución: un software en Java que maneja productos y proveedores usando archivos `.txt`, con validaciones, automatizaciones, manejo de errores y una interfaz gráfica hecha en NetBeans.

El resultado: un sistema robusto, seguro y fácil de usar, donde el administrador controla todo el inventario desde una sola aplicación.

---

## 🎨 Características Principales

### ✔️ 🔄 Registro de nuevas entregas
- Actualiza automáticamente:
  - Archivo de **Productos** → stock + fecha de reposición  
  - Archivo de **Proveedores** → cantidad y fecha de entrega
- Validación completa antes de registrar.

### ✔️ 🗑️ Eliminación completa de productos
- Elimina el producto del inventario.  
- Borra también los registros relacionados del archivo de proveedores.  
- Garantiza cero datos huérfanos.

### ✔️ 👥 Gestión de Proveedores
- Agregar proveedores (con verificación de duplicados).  
- Eliminar proveedores + productos asociados automáticamente.  
- Validación estricta para evitar inconsistencias.

### ✔️ ⚙️ Reposición automática
El sistema:
- Revisa el stock.
- Detecta productos bajo el umbral.
- Busca su proveedor.
- Genera reposición automática en ambos archivos.

### ✔️ 💸 Actualización de precios
- Modificación individual del precio.
- Validaciones antes de aplicar cambios.

---

## 🖥️ Interfaz Gráfica (GUI)

Diseñada en NetBeans para permitir:
- Navegación intuitiva por menús.
- Formularios validados.
- Mensajes de error/éxito claros.
- Prevención de datos vacíos, inválidos o repetidos.
- Manejo elegante de excepciones:
  - Archivos inexistentes  
  - Registros corruptos  
  - Formatos incorrectos  
  - Intentos de duplicado  


---

## 🧰 Tecnologías Utilizadas

| Herramienta | Uso |
|-------------|-----|
| **Java** | Lógica del sistema |
| **NetBeans** | Construcción de GUI |
| **Archivos .txt** | Persistencia de datos |
| **POO** | Organización modular |
| **Validaciones personalizadas** | Integridad y limpieza del sistema |

---

## 🎯 Objetivo del Proyecto

Desarrollar competencias en:
- Manejo de archivos secuenciales  
- Diseño de sistemas reales  
- Validaciones y control de errores  
- CRUD sincronizado entre múltiples archivos  
- Programación orientada a usuario final  

---

## 📸 Capturas del Sistema
![Capturas del Sistema](https://raw.githubusercontent.com/pjosed/LabEDD/m/Assets/IniciarSesion.png)
![Capturas del Sistema](https://raw.githubusercontent.com/pjosed/LabEDD/m/Assets/ProductosLAB.png)
![Capturas del Sistema](https://raw.githubusercontent.com/pjosed/LabEDD/m/Assets/VenderReponerLAB.png)
![Capturas del Sistema](https://raw.githubusercontent.com/pjosed/LabEDD/m/Assets/AgregarEliminarLAB.png)
![Capturas del Sistema](https://raw.githubusercontent.com/pjosed/LabEDD/m/Assets/ConsultarLAB.png)

---
