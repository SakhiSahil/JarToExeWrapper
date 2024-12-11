# JARtoEXE Converter
# Download From Here 👇👇
[![Download JarToExe](https://img.shields.io/badge/Download-JarToExe-blue.svg?style=for-the-badge&logo=windows&logoColor=white)](https://github.com/SakhiSahil/JARtoEXE-Installer/raw/refs/heads/main/JARtoEXE-2.0.6.msi) [![Download Wix3](https://img.shields.io/badge/Download-Wix3-red.svg?style=for-the-badge&logo=windows&logoColor=white)](https://github.com/wixtoolset/wix3/releases/download/wix3141rtm/wix314.exe)


This repository contains tools and scripts for converting Java `.jar` files into native Windows `.exe` files. The project simplifies the process of packaging Java applications for Windows distribution, providing an installer for easy setup.

## Features

- **Jar to Exe Conversion**: Easily convert Java `.jar` files to native Windows `.exe` files.
- **Installer Integration**: Provides an installer for distributing `.exe` files.
- **Fixed Layout Design**: Non-resizable and fixed-height form for a consistent user interface.
- **Cross-platform**: Java-based, so it can be run on any platform that supports Java.

## File Structure

- **`build/`**: Contains build-related files, including output after running the Ant build script.
- **`installer/`**: Contains the `.msi` installer for the `.exe` files.
- **`nbproject/`**: NetBeans project files and configurations.
- **`src/jartoexewrapper/`**: Core source files for wrapping the Java `.jar` into an `.exe`.
- **`.gitignore`**: Specifies files to be ignored by Git.
- **`build.xml`**: Ant build script to compile and package the project.
- **`manifest.mf`**: Metadata file for managing the Java application's packaging.

## Installation

To build the project and convert a `.jar` file to `.exe`, follow these steps:

### 1. Clone the repository:

```bash
git clone https://github.com/SakhiSahil/JarToExeWrapper.git
```
### 2. Build the project using Ant:

```bash
cd JarToExeWrapper
ant build
```
### 3. Run the JarToExe converter:

```bash
java -jar JarToExeConverter.jar
```
Follow the UI prompts to select the .jar file and generate the .exe file.
Usage
Once you’ve built the executable, you can distribute it using the installer located in the installer/ directory.

Development
For local development, build the project using the included build.xml Ant script:

### Clean the project:

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
