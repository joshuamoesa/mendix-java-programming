<a name="readme-top"></a>

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <h2 align="center">Mendix Java Programming</h2>

  <p align="center">
    Examples how Java extends the functionality of a Mendix application.
    <br />
    <a href="https://github.com/joshuamoesa/mendix-java-programming"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/joshuamoesa/mendix-java-programming">View Demo</a>
    ·
    <a href="https://github.com/joshuamoesa/mendix-java-programming/issues">Report Bug</a>
    ·
    <a href="https://github.com/joshuamoesa/mendix-java-programming/issues">Request Feature</a>
  </p>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

Examples how Java extends the functionality of a Mendix application.

Use the `README.md` to get started.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Built With

* [Mendix][Mendix-url]
* [Eclipse][Eclipse-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- GETTING STARTED -->
## Getting Started

To get a local copy up and running follow these simple example steps.

### Prerequisites

* Mendix Studio Pro low-code IDE - Version 10 and above.
* Eclipse IDE - Web Developers - 2023-06 and above.

### Installation

1. Get a free [Mendix Studio Pro copy][Mendix-download-url] and install.
2. Get a free [Eclipse copy][Eclipse-download-url] and install.
3. Configure Eclipse to make sure it is compatible with the Java version Mendix is using. In Eclipse, go to Windows/Preferences:
   * Add the JRE that came with Mendix installation at Java/Installed JREs. Add location: C:\Program Files\AdoptOpenJDK\jdk-11.0.3.7-hotspot
   * Set the Compiler compliance level back to "11" at Java/Compiler
4. In Eclipse, import the Mendix project into the workspace. Go to File>Import>Existing Projects into Workspace and select the Mendix project folder (pull /code/ExtensibilityDemo first) as the root directory.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- USAGE EXAMPLES -->
## Usage

The main demo app uses custom java to carry out randomization. 
To view the JavaAction config in Mendix Studio Pro, go to MyFirstModule/JavaActions/PickRandomPersonFromList
To view the actual Java source code, in Eclipse go to ExtensibilityDemo_main/Javasource/myfirstmodule.actions/PickRandomPersonFromList.java

### Run the app

1. Run the app in Eclipse
2. Go to http://localhost:8080
3. Click on button "Coffee Break!"
4. Press "Add person" and type a name. Again, press "Add person" and type a different name.
5. Press  "Get coffee!". The gives back a random name based on the provided list of names. The randomization is carried out by the piece of java code.

### Debug java code

1. Run the app in Eclipse in debug mode.
2. In Eclipse, set breakpoints in the Java code in the part that can be customized.
3. Go to http://localhost:8080
4. Click on button "Coffee Break!"
5. Press "Add person" and type a name. Again, press "Add person" and type a different name.
6. Press  "Get coffee!". The app halts at the given breakpoint.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- ROADMAP -->
## Roadmap

- [ ] Document API call from Java
- [ ] Document Java in Visual Studio Code


See the [open issues](https://github.com/joshuamoesa/mendix-java-programming/issues) for a full list of proposed features (and known issues).

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- CONTACT -->
## Contact

Your Name - [@joshuamoesa](https://twitter.com/joshuamoesa) - github@joshuamoesa.com

Project Link: [https://github.com/joshuamoesa/mendix-java-programming](https://github.com/joshuamoesa/mendix-java-programming)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- ACKNOWLEDGMENTS -->
## Acknowledgments

* [Mendix docs - Java Programming](https://code.visualstudio.com/docs/languages/java#:~:text=In%20order%20to%20run%20Java,Amazon%20Corretto)
* [Medium post at Mendix Community - Customizing Java Actions](https://medium.com/mendix/customizing-java-actions-mendix-25ec5cc14f24)
* [Java in Visual Studio Code](https://code.visualstudio.com/docs/languages/java#:~:text=In%20order%20to%20run%20Java,Amazon%20Corretto)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->

[Mendix-url]: https://mendix.com
[Mendix-download-url]: https://marketplace.mendix.com/link/studiopro/
[Eclipse-url]: https://www.eclipse.org
[Eclipse-download-url]: https://www.eclipse.org/downloads/