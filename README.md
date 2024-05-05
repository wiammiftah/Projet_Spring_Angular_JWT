# Rapport de Projet Spring Angular JWT
## Projet de Gestion des Comptes Bancaires

### Introduction
Ce projet a pour objectif de créer une application de gestion des comptes bancaires. Chaque compte est lié à un client, et un compte peut subir plusieurs opérations telles que les débits ou les crédits. L'application gère deux types de comptes : les comptes courants et les comptes épargne. Ce projet comprend trois parties : la couche de données (DAO), le client Angular et la sécurité avec Spring Security et Json Web Token (JWT).

### Partie 1 : Couche DAO
#### Création du Projet Spring Boot
Nous avons commencé par créer un projet Spring Boot qui servira de base pour la couche DAO. Le projet inclut des configurations de base pour utiliser Spring Data et JPA.

#### Entités JPA
Nous avons créé les entités suivantes :
- **Customer** : représente le client. Chaque client a des propriétés telles que le nom, le prénom, l'email, etc.
- **Accounts** : représente le compte bancaire. Il a des propriétés comme le numéro de compte, le solde, le type (épargne ou courant).
- **SavingAccount** et **CurrentAccount** : représentent respectivement les comptes épargne et comptes courants.
- **Operations** : représente les opérations effectuées sur un compte, comme le débit ou le crédit.





