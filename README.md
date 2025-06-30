# JARtoEXE Converter
# Download From Here 👇👇
[![Download JarToExe](https://img.shields.io/badge/Download-JarToExe-blue.svg?style=for-the-badge&logo=windows&logoColor=white)](https://github.com/SakhiSahil/JARtoEXE-Installer/raw/refs/heads/main/JARtoEXE-2.0.6.msi) [![Download Wix3](https://img.shields.io/badge/Download-Wix3-red.svg?style=for-the-badge&logo=windows&logoColor=white)](https://github.com/wixtoolset/wix3/releases/download/wix3141rtm/wix314.exe)


This repository contains tools and scripts for converting Java `.jar` files into native Windows `.exe` files. The project simplifies the process of packaging Java applications for Windows distribution, providing an installer for easy setup.

## Features

- **Jar to Exe Conversion**: Easily convert Java `.jar` files to native Windows `.exe` files.
- **Installer Integration**: Provides an installer for distributing `.exe` files.
- **Modern Look and Feel**: Updated UI using the FlatLaf library for a cleaner appearance.
- **Improved Responsiveness**: Long-running conversion process now runs in the background without freezing the UI.
- **Cancelable Conversions**: A "Cancel" button allows stopping an ongoing conversion process.
- **Enhanced Feedback**: Real-time output from the packaging process is displayed, and a more accurate progress bar is provided.
- **Fixed Layout Design**: Non-resizable and fixed-height form for a consistent user interface.
- **Cross-platform**: Java-based, so it can be run on any platform that supports Java (though `jpackage` itself has platform-specific outputs).

## File Structure

- **`build/`**: Contains build-related files, including output after running the Ant build script.
- **`installer/`**: Contains the `.msi` installer for the `.exe` files.
- **`nbproject/`**: NetBeans project files and configurations.
- **`src/jartoexewrapper/`**: Core source files for wrapping the Java `.jar` into an `.exe`.
- **`.gitignore`**: Specifies files to be ignored by Git.
- **`build.xml`**: Ant build script to compile and package the project.
- **`manifest.mf`**: Metadata file for managing the Java application's packaging.

## Installation (Using Pre-built Installer)

If you prefer to use a pre-built version, you can download the installer (link at the top of this README). This does not require building from source.

## Development (Building from Source)

To build the project from source and run it locally, follow these steps:

### 1. Prerequisites:
   - JDK 17 or later (ensure `jpackage` is available in your PATH).
   - Apache Ant.
   - (Optional for MSI) WiX Toolset v3.x.

### 2. Clone the repository:
```bash
git clone https://github.com/SakhiSahil/JarToExeWrapper.git
cd JarToExeWrapper
```

### 3. Add Libraries:
   - This project uses the FlatLaf library for its look and feel.
   - Create a `lib` directory in the project root (e.g., `JarToExeWrapper/lib`).
   - Download `flatlaf-3.4.1.jar` (or the latest compatible version) from [FlatLaf Releases](https://github.com/JFormDesigner/FlatLaf/releases).
   - Place the `flatlaf-3.4.1.jar` file into the `lib` directory. The project's Ant build script (`nbproject/project.properties`) is configured to find it here.

### 4. Build the project using Ant:
   - To compile the source code and create the JAR:
     ```bash
     ant build
     ```
   - This will generate `dist/JarToExeWrapper.jar`.

### 5. Run the JarToExe converter (Development):
   - To run the application after building:
     ```bash
     ant run
     ```
   - Alternatively, you can run the built JAR directly (ensure FlatLaf JAR is accessible, which `ant run` handles via classpath):
     ```bash
     java -cp "dist/JarToExeWrapper.jar:lib/flatlaf-3.4.1.jar" jartoexewrapper.jartoexe
     ```
   - Follow the UI prompts to select the .jar file and generate the .exe file.

### Usage of the Built Tool
Once you have selected your JAR and configured options in the UI, click "Convert". The output (EXE or MSI) will be placed in your specified output directory.

### Other Ant Targets for Development:

#### Clean the project:

```bash
ant clean
```
### Compile the project:

```bash
ant compile
```
### Run the project:

```bash
ant run
```
The project is set up to work with NetBeans IDE, and the necessary configurations are in the nbproject/ folder.
