# Garment Simulator — Abstract Factory Design Pattern

## 📌 Project Overview
This project is a garment simulator application designed to assemble perfectly matching outfits across different styles (Professional, Casual, and Party). Customers get frustrated when they receive non-matching clothing items. This system ensures that a customer requesting a specific variant family will *always* receive a synchronized set of matching garments (`Top`, `Pants`, and `Shoes`).

Additionally, garment catalogs update frequently. The system architecture is built to fully comply with the **Open/Closed Principle (OCP)**, allowing vendors to add brand new clothing families (e.g., `Sporty`, `Vintage`) without changing a single line of the core application code.

---

## 🏗️ Design Pattern Analysis
The **Abstract Factory Pattern** was selected as the optimal creational design pattern for this problem for several distinct reasons:

* **Product Families Consistency:** It enforces a constraint that objects belonging to the same style variant must be created and used together, eliminating the risk of a "non-matching garment" bug.
* **Decoupling / High Flexibility:** The client simulator (`GarmentSimulator`) relies strictly on abstract product interfaces (`Top`, `Pants`, `Shoes`) and the generic factory contract (`GarmentFactory`). It has absolutely zero knowledge of concrete variants like `CasualTop` or `ProfessionalShoes`.
* **Extensibility:** To introduce a new collection variant later, developers only need to create new product classes and a corresponding concrete factory. The core simulator logic remains completely untouched.

---

## 🛠️ Class Architecture & Components

The implementation consists of the following components organized by structural role:

1. **Abstract Products (Interfaces):**
   * `Top`: The blueprint behavior for all shirt items.
   * `Pants`: The blueprint behavior for all legwear items.
   * `Shoes`: The blueprint behavior for all footwear items.

2. **Concrete Products (Variant Families):**
   * **Professional:** `ProfessionalTop`, `ProfessionalPants`, `ProfessionalShoes`
   * **Casual:** `CasualTop`, `CasualPants`, `CasualShoes`
   * **Party:** `PartyTop`, `PartyPants`, `PartyShoes`

3. **Abstract Factory (`GarmentFactory`):**
   * An interface declaring creation methods for the abstract products.

4. **Concrete Factories:**
   * `ProfessionalGarmentFactory`: Instantiates and returns the Professional variant family.
   * `CasualGarmentFactory`: Instantiates and returns the Casual variant family.
   * `PartyGarmentFactory`: Instantiates and returns the Party variant family.

5. **Client Engine (`GarmentSimulator`):**
   * Orchestrates the setup and assembly process utilizing passed-in factory objects.

---

## 🚀 How to Run the Project

### Prerequisites
* Java Development Kit (JDK) 8 or higher installed.
* An IDE such as IntelliJ IDEA, Eclipse, or NetBeans.

### Execution Steps
1. Clone the repository to your local system.
2. Open the project directory within your IDE.
3. Locate the `Main.java` class file.
4. Run the `main` method.

### Expected Console Output
Upon successful execution, the driver class will dynamically simulate clothing creation and produce the following output:

```text
=== GARMENT SIMULATOR OUTFIT TESTS ===

[Customer requests a Professional Outfit]
Wearing: A sharp Professional Blazer.
Wearing: Pressed Professional Slacks.
Wearing: Polished Professional Oxford Shoes.
----------------------------------------
[Customer requests a Casual Outfit]
Wearing: A comfortable Casual T-Shirt.
Wearing: Relaxed Casual Jeans.
Wearing: Comfy Casual Sneakers.
----------------------------------------
[Customer requests a Party Outfit]
Wearing: A flashy Party Sequined Top.
Wearing: Stylish Party Leather Pants.
Wearing: Designer Party High Heels/Shoes.
----------------------------------------
