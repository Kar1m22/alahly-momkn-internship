# Day 18 - Project Structure & Clean Architecture

## Task Description
- Reorganize the Contact List project into a clean 3-layer architecture (`data`, `domain`, and `presentation`) to enforce separation of concerns and improve code maintainability.
- Include a directory diagram in the `README.md` to document the architectural layout.

---

##  What I Did
- Restructured the project into three distinct core packages: `data`, `domain`, and `presentation`.
- Moved the `Contact` data model to the `domain` layer to keep business models independent of Android framework dependencies.
- Extracted data retrieval logic into `ContactRepository` inside the `data` layer to serve as a single source of truth.
- Grouped all UI components (`MainActivity`, `DetailActivity`, `ContactAdapter`, and `ContactViewModel`) into the `presentation` layer.

---

##  Concepts Learned
- **Clean Architecture Layers:** Understanding the distinct responsibilities of the `domain` (business models), `data` (data management), and `presentation` (UI logic) layers.
- **Independent Domain Layer:** Why keeping pure Kotlin classes in the `domain` layer without `android.*` imports makes code easily testable and reusable.
- **Repository Pattern:** Separating data source implementation details from the ViewModel layer to ensure a clean data flow.
- **Project Organization:** Transitioning from an unorganized structure to a scalable architecture that prevents code clutter as features grow.

---

##  Project Structure 

```text
com.example.day_18/
│
├── 📂 data/
│   └── ContactRepository.kt
│
├── 📂 domain/
│   └── Contact.kt
│
└── 📂 presentation/
    ├── ContactAdapter.kt
    ├── ContactViewModel.kt
    ├── DetailActivity.kt
    └── MainActivity.kt