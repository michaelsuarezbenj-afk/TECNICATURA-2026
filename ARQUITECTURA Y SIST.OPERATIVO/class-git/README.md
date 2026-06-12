# 📚 Clase Git - Parte 4

## Analizar cambios en los archivos de tu proyecto Git

### 🔹 Cómo ingresar

Abrir **Git Bash** en Windows, o la **terminal** en Linux o Mac.

> ⚠️ Al abrir Git Bash hacerlo como administrador. En la terminal también, o usar `sudo` para permisos especiales.

---

## 🎯 TAREA
> Agregar los comentarios en los comandos, para saber qué pasa con cada uno.

---

## 📂 Navegar a la carpeta del proyecto

```bash
cd tecnicatura      # Entramos a la carpeta tecnicatura
cd class-git        # Entramos a la carpeta class-git
ls                  # Listamos los archivos de la carpeta actual
```

## 📝 Crear y editar un archivo

```bash
touch historia.txt  # Creamos un archivo vacío llamado historia.txt
code .              # Abrimos la carpeta actual en Visual Studio Code
```

> Modificamos el archivo `historia.txt` colocando lo siguiente:
> **"Bienvenido, mi nombre es Ariel"** (coloca tu nombre)

```
Ctrl + S            # Guardamos los cambios en el archivo
```

## 🔍 Verificar el estado del repositorio

```bash
git status          # Vemos el estado actual del repositorio (archivos modificados, sin trackear, etc.)
git add .           # Agregamos todos los cambios al área de preparación (staging)
git status          # Volvemos a verificar el estado, ahora deberían estar en verde
```

## 💾 Hacer un commit (sin -m)

```bash
git commit          # Sin agregar -m veremos que pasa: se abre el editor de texto vim
```

### Para salir de vim:

```bash
Esc                 # Presionamos Escape para salir del modo edición
:wq! + Enter        # Guardamos y salimos (Git Bash en Windows)
Esc + Shift + Z + Z # Otra forma de salir (funciona en algunas terminales de Linux)
```

---

## ✏️ Segundo cambio

> Agregamos otra línea de mensaje en `historia.txt` desde VS Code:
> **"estoy estudiando programación"**

```bash
Ctrl + S            # Guardamos los cambios
git add .           # Agregamos los cambios al staging
git commit          # Hacemos el commit (se abre nuevamente el editor vim)
```

### Comandos dentro del editor:

```bash
Esc + i             # Para comenzar a escribir el mensaje del commit (no suele ser necesario)
Ctrl + X            # Para salir en Linux
s + Enter           # Para decir "sí" al cambio y aceptar el nombre (s = sí, y = yes)
```

---

## 🔎 Ver los cambios realizados

```bash
git show                # Vemos todos los cambios del último commit
git log historia.txt    # Vemos todos los commits que afectaron historia.txt
q                       # Para salir del registro de commits
```

## 🔄 Comparar commits

> Copiamos un hash más antiguo y otro más reciente, e ingresamos:

```bash
git diff hash_commit_viejo hash_commit_nuevo  # Comparamos diferentes commits y sus cambios
# ⚠️ Importante: poner primero la versión más vieja, luego la más nueva
q                                              # Para salir
```

## ⬅️ Volver atrás en las carpetas

```bash
cd ..               # Subimos un nivel en el árbol de carpetas
cd ..               # Subimos otro nivel más
```

---

## ✅ Resumen de comandos vistos

| Comando | Descripción |
|---------|-------------|
| `cd carpeta` | Entrar a una carpeta |
| `cd ..` | Salir de una carpeta |
| `ls` | Listar archivos |
| `touch archivo` | Crear un archivo vacío |
| `code .` | Abrir VS Code en la carpeta actual |
| `git status` | Ver estado del repositorio |
| `git add .` | Agregar cambios al staging |
| `git commit` | Confirmar los cambios |
| `git show` | Ver el último commit |
| `git log archivo` | Ver historial de un archivo |
| `git diff hash1 hash2` | Comparar dos commits |

---

📌 **Autor:** Tu Nombre
📅 **Clase:** Git - Parte 4
