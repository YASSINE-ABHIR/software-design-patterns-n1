
# Activité Pratique N°1 : Design Patterns

## Description

Cette activité pratique se concentre sur l'apprentissage et l'implémentation de plusieurs design patterns courants utilisés dans le développement logiciel. L'objectif est de comprendre les concepts sous-jacents, leurs applications, ainsi que leurs avantages dans différentes situations.

---

## Contenu de l'activité

### Première Partie : Implémentation des Design Patterns

L'activité consiste à implémenter plusieurs design patterns en suivant les principes et bonnes pratiques. Les patterns étudiés incluent :

1. **Strategy Pattern**  
   - **Description :** Le pattern Strategy permet de définir une famille d'algorithmes, de les encapsuler dans des classes distinctes et de les rendre interchangeables à l'exécution.  
   - **Utilisation :** Ce pattern est utile pour des situations où plusieurs comportements ou algorithmes similaires doivent être appliqués de manière dynamique.  
   - **Exemple :** Calculer le prix d'un produit en fonction de différentes stratégies de réduction (remise fixe, remise en pourcentage, etc.).

2. **Observer Pattern**  
   - **Description :** L'Observer Pattern permet de notifier plusieurs objets observateurs lorsqu'un sujet change d'état.  
   - **Utilisation :** Idéal pour des applications où un changement dans un objet nécessite la mise à jour d'autres objets (exemple : interfaces utilisateur ou systèmes de notification).  
   - **Exemple :** Une application météo où les différents affichages (température, humidité, etc.) se mettent à jour automatiquement lorsque les données changent.

3. **Decorator Pattern**  
   - **Description :** Le Decorator Pattern permet d'ajouter dynamiquement des responsabilités ou des fonctionnalités à un objet sans modifier son code source.  
   - **Utilisation :** Utile pour étendre les fonctionnalités d'une classe sans avoir besoin de recourir à l'héritage.  
   - **Exemple :** Ajout de fonctionnalités supplémentaires à une commande (comme un supplément de fromage ou une livraison rapide).

4. **Composite Pattern**  
   - **Description :** Le Composite Pattern permet de traiter les objets individuels et les compositions d'objets de manière uniforme.  
   - **Utilisation :** Ce pattern est utilisé dans les structures hiérarchiques où les objets peuvent être composés d'autres objets (exemple : systèmes de fichiers ou menus d'application).  
   - **Exemple :** Une hiérarchie de catégories de produits où chaque catégorie peut contenir des sous-catégories ou des produits.

5. **Adapter et Proxy Patterns**  
   - **Adapter Pattern :**  
     - **Description :** Le pattern Adapter permet de faire fonctionner ensemble deux interfaces incompatibles en créant une interface intermédiaire.  
     - **Utilisation :** Utile pour intégrer des composants existants dans un système sans en modifier le code source.  
     - **Exemple :** Adapter une API externe à votre application avec une interface spécifique.  
   - **Proxy Pattern :**  
     - **Description :** Le pattern Proxy agit comme un intermédiaire pour contrôler l'accès à un autre objet.  
     - **Utilisation :** Idéal pour gérer des fonctionnalités comme le contrôle d'accès, la mise en cache ou le chargement différé (lazy loading).  
     - **Exemple :** Un proxy pour accéder à une ressource distante uniquement si elle est nécessaire.

---

## Structure du Projet

Le repository est organisé en plusieurs dossiers, chacun correspondant à un pattern spécifique :

- **/strategy** : Implémentation du Strategy Pattern.  
- **/observer** : Implémentation du Observer Pattern.  
- **/decorator** : Implémentation du Decorator Pattern.  
- **/composite** : Implémentation du Composite Pattern.  
- **/adapter_proxy** : Implémentation des Adapter et Proxy Patterns.

---

## Prérequis

- **IDE recommandé :** IntelliJ IDEA ou Eclipse.  
- **Outils de build :** Maven ou Gradle (au choix).  

---

## Instructions pour exécuter les exemples

1. **Cloner le repository :**
   ```bash
   git clone <https://github.com/YASSINE-ABHIR/software-design-patterns-n1.git>
   cd Activité-Pratique-N1-Design-Patterns
   ```

2. **Construire le projet (si Maven est utilisé) :**
   ```bash
   mvn clean install
   ```

3. **Exécuter un exemple :**
   Naviguez dans le dossier correspondant au pattern souhaité, puis lancez la classe principale (`Main.java`).

---

## Ressources supplémentaires

- Documentation officielle sur les Design Patterns : [Refactoring Guru](https://refactoring.guru/design-patterns)  
- Livre recommandé : **"Design Patterns: Elements of Reusable Object-Oriented Software"** (Gang of Four).  

---

## Contribution

Les contributions sont les bienvenues ! Si vous souhaitez améliorer les exemples ou ajouter des explications supplémentaires :
1. Forkez ce repository.
2. Créez une branche pour vos modifications (`feature/nouvelle-fonctionnalité`).
3. Soumettez une Pull Request avec une description claire.

---

## Licence

Ce projet est sous licence MIT. Consultez le fichier [LICENSE](LICENSE) pour plus d'informations.
