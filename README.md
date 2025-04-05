# F1 Programación Funcional

## Organización
Este proyecto es parte de la organización **Kodigo**.

## Descripción
Este repositorio tiene como objetivo enseñar y practicar sobre **Streams** y **Programación Funcional** en Java. El proyecto simula el análisis de resultados de la primera práctica libre (FP1) de la temporada 2024 de la Fórmula 1, utilizando la API pública de F1 para obtener datos en tiempo real y procesarlos utilizando las características de programación funcional de Java, como los streams.
> **_NOTA:_** Al ejecutar el proyecto, se conectará a la API pública de F1 para obtener los resultados de la sesión FP1 de la temporada 2024 y te permitirá interactuar con un menú para ejecutar diferentes ejercicios de programación funcional.

## Tecnologías
- **Lenguaje**: Java 21
- **Dependencias**: 
  - **Jackson**: Para la deserialización de JSON.
  - **Java HTTP Client**: Para realizar solicitudes HTTP asíncronas.

## Objetivo
El propósito de este repositorio es ayudar a aprender y entender el uso de **Streams** en Java y aplicar conceptos de **Programación Funcional** mediante el análisis de datos provenientes de una API.

Los ejercicios incluidos en este proyecto cubren tareas comunes como:
- Filtrar, mapear y agrupar datos.
- Trabajar con funciones de orden superior.
- Manejo de datos nulos con `Optional`.
- Cálculo de valores agregados como promedios.

## Instrucciones para Ejecutar

1. Clonar el repositorio:

   ```bash
   git clone https://github.com/tuusuario/f1-programacion-funcional.git
   ```
2. Accede al proyecto
   ```bash
   cd f1-programacion-funcional
   ```
3. Asegúrate de tener almenos Java 21 instalado en tu sistema.

4. Compilar y ejecutar el proyecto:
  ```bash
  mvn clean compile exec:java
  ```
