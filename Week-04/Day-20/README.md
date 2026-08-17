# Day 20 - End-to-End Architecture & Month 1 Review

## Task Description
- Refactor the entire Contact List application into a proper MVVM + Clean Architecture + Hilt setup. Document the architectural evolution through a before/after comparison in the `README.md`.
---

##  Before vs. After Refactoring

### 1. Architectural Structure
* **Before:** Tightly coupled components without clear layer separation. Data instantiations were done directly inside the UI layer.
* **After:** Enforced a strict 3-layer Clean Architecture (`data`, `domain`, `presentation`) following a unidirectional data flow.

### 2. Dependency Management
* **Before:** Manual instantiation of ViewModels and Repositories (`val repo = ContactRepository()`), leading to rigid code and difficult unit testing.
* **After:** Automated Dependency Injection using Google Hilt (`@HiltAndroidApp`, `@HiltViewModel`, `@Inject constructor`, `@AndroidEntryPoint`). Zero manual `new`/instantiation calls.

### 3. Data Source Separation
* **Before:** The Repository was acting as both the data source and the data provider.
* **After:** Separated raw data holding into `ContactDataSource` and data mediation into `ContactRepository`.Consolidation:** Mastering the core building blocks of modern Android app development in Kotlin.

---

##  Project Structure

```text
com.example.day_20/
│
├── 📄 MyApplication.kt (@HiltAndroidApp)
│
├── 📂 data/
│   ├── ContactDataSource.kt (Raw Data Provider)
│   └── ContactRepository.kt (Data Orchestrator)
│
├── 📂 domain/
│   └── Contact.kt 
│
└── 📂 presentation/
    ├── ContactAdapter.kt
    ├── ContactViewModel.kt 
    ├── DetailActivity.kt
    └── MainActivity.kt 