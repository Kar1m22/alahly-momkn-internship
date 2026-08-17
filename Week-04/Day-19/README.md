# Day 19 - Dependency Injection with Hilt

## Task Description
- Refactor the Contact List project to implement Dependency Injection using Google Hilt.
- Inject `ContactRepository` into `ContactViewModel` using `@HiltViewModel` and `@Inject constructor`.
- Eliminate all manual instantiation of dependencies across the project to achieve loose coupling and cleaner code.

---

## 🛠 What I Did
- Created a custom `Application` class annotated with `@HiltAndroidApp` to initialize Hilt at the application level and registered it in `AndroidManifest.xml`.
- Annotated `ContactRepository` with `@Inject constructor()` to allow Hilt to manage its creation and lifecycle automatically.
- Annotated `ContactViewModel` with `@HiltViewModel` and `@Inject constructor` to automatically inject the `ContactRepository` instance.
- Annotated `MainActivity` with `@AndroidEntryPoint` to enable Hilt to inject dependencies into Android framework components.
- Removed all manual creation/instantiation logic for the ViewModel and Repository, relying entirely on Hilt's `by viewModels()` delegate.

---

##  Concepts Learned
- **Dependency Injection Fundamentals:** Understanding why decoupling class creation from execution improves testability, scalability, and code maintainability.
- **Hilt Setup & Scoping:** Utilizing `@HiltAndroidApp` to set up the global dependency graph and managing object lifecycles across the application.
- **Constructor Injection:** Leveraging `@Inject constructor` to let Hilt resolve and inject required dependencies automatically without manual wiring.
- **Android Component Integration:** Using `@AndroidEntryPoint` and `@HiltViewModel` to seamlessly inject dependencies into UI and ViewModel components.

---

