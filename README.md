# failsafe-demo

# you can do that by:

 a. define properties name envName
 
    <properties>
       <envName>default</envName>
    </properties>
   
 b. use the property in argLine
 
      <configuration>
      <argLine>-Dspring.profiles.active=${envName}</argLine>
      <classesDirectory>${project.build.outputDirectory}</classesDirectory>
      </configuration>

c. run maven command
   mvn clean install -DenvName=dev01 -PMyIT
   
   
# alternative way to do that:   

a. define property in profile section, the name is envName2 here

    <profiles>
        <profile>
        <id>MyIT</id>
        <activation>
            <activeByDefault>false</activeByDefault>
            <property>
                <name>envName2</name>
                <!-- I think you can safely skip the value part below
                     and just pass in -DrunIT. -->
                <value>default</value>
            </property>
        </activation>
   
 b. use the property in argLine
 
      <configuration>
      <argLine>-Dspring.profiles.active=${envName2}</argLine>
      <classesDirectory>${project.build.outputDirectory}</classesDirectory>
      </configuration>

c. run maven command
   mvn clean install -DenvName2=dev01 -PMyIT
   
# reference:
https://stackoverflow.com/questions/5569705/vm-arguments-with-maven-failsafe-plugin
