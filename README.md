<h1>Maven core service project</h1>

This is a maven multi module project that contain 2 sub modules as core and service.
service sub module content a the code in multiple files of sorting algorithms and it can bn execute by core's jar file.

<h2>Table  of content<h2>

<a href=#Create-parent-module>1. Create parent module</a>

<a href=#Create-sub-module>2. Create sub module</a>

<a href=#Create-a-executable-jar>3.Create a executable jar</a>


<h2><a href=#Create-parent-module></a>Create parent module</h2>

There are 2 ways to build a parent project.

* By not using interactive mode
<pre>
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
</pre>
In this way we have to give groupId,archtypeid,artifactid,... in same code in begining.

* By using interactive mode

<pre>
mvn archetype:generate
</pre>
In this we have to give aboveinformation while building the project.

* Understand the factors in generating

artifactId-
Defines the unique name of the project. If you generate a new project via Maven this is also used as root folder for the project.

groupId-
Defines a unique base name of the organization or group that created the project. This is normally a reverse domain name. For the generation the groupId also defines the package of the main class.

packaging-
Defines the packaging method. This could be e.g. a jar, war or ear file. If the packaging type is pom, Maven does not create anything for this project, it is just meta-data.

version-
This defines the version of the project.

archtypeid:
The module structure define by archtype there are many archtypes.

Mostly for single module projects use "quickstart" archtype.Search “quickstart” in terminal and enter the relevant number quick start is the general archetype for this
.And mostly parent project use "pom-root" archtype.There for give the archtype as "pom-root" archtype like below.
<pre>
search “pom-root” in terminal and enter the relevant number
</pre>

Enter,Enter...

<h2><a href=#Create-sub-module></a>Create sub module</h2>
* cd into parent project
* Generate sub modules by same way that create parent project by using “mvn archetype:generate”
* Give default or “quickstart” archetype and Groupid,artifactid,.... As above(groupid should same to parent’s groupid )
* open the pom.xml file located in the parent’s directory and change the packaging to pom  <packaging>pom</packaging>
* Building the Project
<pre>
  mvn package
</pre>


<h2><a href=#Create-a-executable-jar></a>Create a executable jar</h2>

For that add “assembly” plugin to pom file 
<td><pre>
 
 	
 	<plugins>
           <plugin>
             <artifactId>maven-assembly-plugin</artifactId>
             <version>3.1.1</version>
     	<configuration>
     	<appendAssemblyId>false</appendAssemblyId>
     		<descriptorRefs>
     		    <descriptorRef>jar-with-dependencies</descriptorRef>
     		</descriptorRefs>
     	<archive>
 		   <manifest>
 		      <mainClass>com.mycompany.app.App</mainClass>
 		   </manifest>
 		</archive>
         </configuration>
         <executions>
           <execution>
             <id>make-assembly</id> <!-- this is used for inheritance merges -->
             <phase>package</phase> <!-- bind to the packaging phase -->
 
             <goals>
               <goal>single</goal>
             </goals>
           </execution>
         </executions>
 
       </plugin>
     </plugins>

</pre></td>

 in main class groupid,main class name should add.
 
 * Run a jar file
 jar file will create again after 
 <pre>
  mvn package
  </pre>
  in the target folder.go there open a terminal and
<pre>
   java -jar Example.jar.
 </pre>
 
 * Run multi module project
 service by core should contain the implementations for algorithms and utilities to be used