# Spigot plugin template

### Description

Spigot plugin template is a simple plugin template, quick to set up with automated actions as much as possible.

### Installation

In order to prepare your working environment, create a Github repository using the green "Use this template" button. after that clone your repository locally to start working.

If you only want to work locally you can also download the template locally via [this link](https://github.com/Disk-MTH/Spigot-plugin-template/archive/refs/heads/master.zip).

### Usage

1) **Edit plugin information**

Start by modifying the information in the [gradle.properties](https://github.com/Disk-MTH/Spigot-plugin-template/blob/master/gradle.properties) file by replacing them with your own.

Here is the detail information of this file:

- **group**: the main package name containing your source code. For more information on nomenclature look [here]().


- **mainClass**: The main class of the plugin (the one that extends JavaPlugin and that contains the methods for activating and deactivating the plugin). It is often at the root of the main package and is usually named Main or the name of the plugin.


- **plugin_name**: The name of the plugin. It usually starts with a capital letter and can contain the following characters: "a-z - A-Z - 0-9 - _". The plugin name will also be the name of the plugin configuration folder.


- **version**: The plugin version. [Here](https://semver.org/) you find the semantic conventions provided by Spigot.


- **spigotVersion**: The version of Spigot you want to work with. [Here](https://getbukkit.org/download/spigot) you will find the versions supported by this template.


- **javaVersion**: The version of Java used for the project.


- **authors**: A coma-separated list of the authors of the plugin.


- **credits**: Just a text for the plugin credits (who developed it, who improved it...)


- **description**: A short description of the plugin.


- **serverGui**: Defines if the server should start with the GUI.


- **minRam**: The minimum amount of ram allocated to the Java process running the server (in Mo).


- **maxRam**: The maximum amount of ram allocated to the Java process running the server (in Mo).


Continued in writing...