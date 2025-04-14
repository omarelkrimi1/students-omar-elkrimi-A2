# 🧪 Atelier 2 - Spring Data JPA - Omar Elkrimi

Ce projet est une application Spring Boot simple qui illustre l’utilisation de **Spring Data JPA**, **H2 Database**, et **Lombok**, dans le cadre de l’atelier 2.

## 🎯 Objectifs

- Utilisation de Spring Initializer avec les dépendances : Spring Web, JPA, H2, Lombok
- Création d’une entité JPA `Product`
- Manipulation de la base H2 (ajout, modification, suppression de produits)
- Utilisation d’un Repository basé sur Spring Data
- Migration vers MySQL
- Mapping des entités (Patient, Médecin, Consultation, etc.)

## 🧱 Structure du projet

- `Product.java` : entité JPA avec les attributs `id`, `name`, `price`, `quantity`
- `ProductRepository.java` : interface JPA Repository
- `ProductRestController.java` : expose les opérations CRUD en API REST
- `data.sql` : script d’insertion initial
- `application.properties` : configuration de la base H2 ou MySQL
- `README.md` : ce fichier

## 💡 Fonctionnalités

- ✅ Ajouter des produits
- ✅ Consulter la liste des produits
- ✅ Rechercher un produit par mot-clé
- ✅ Supprimer un produit
- ✅ Modifier un produit
- 🚀 Migration possible vers MySQL en changeant `application.properties`

## 🔧 Configuration Lombok

Dans le fichier `pom.xml` :

```xml
<dependency>
  <groupId>org.projectlombok</groupId>
  <artifactId>lombok</artifactId>
  <optional>true</optional>
  <version>1.18.34</version> <!-- ligne ajoutée -->
</dependency>
