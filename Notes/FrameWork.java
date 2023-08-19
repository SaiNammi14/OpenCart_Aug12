package day40;

public class FrameWork {

	/*
	 * Framework :
	 * ---------
	 * we organize automation project files/folders in structured manner.
	 * 
	 * Objective:
	 * ---------
	 * 1. Re-Usability
	 * 2. Maintainbality
	 * 3. Readability
	 * 
	 * Types of Framework :
	 * --------------------
	 * 1 . Built-in Frameworks--Which means existing tools
	 *     * By using these frameworks , we cannot achieve everything 
	 *     *Ex : Junit,testng,Cucumber etc...
	 *     
	 * 2 . Customized Frameworks/User Defined Frameworks
	 *     *Ex : Data driven--Fetching data from excel,modular driven----will write our own modules for the features,keyword driven, hybrid driven(which includes everything...Data driven and keywor driven/modular) ,etc.....
	 *    
	 *   
	 *  Phases :
	 *  --------
	 *  1.Analysing AUT(Application under testing) : 
	 *     * No.of Pages
	 *     * No.of elements
	 *     * Test cases
	 *     * What to automate/What we cannot automate
	 *     
	 *  2.Choosing the test cases for automation : 
	 *      
	 *      100 TC's----->90 automatable 10 tc not automatable
	 *      
	 *      90 test--->100%
	 *      
	 *      * 2.1)Sanity test cases-->Basic functionality-->high priority(P1)
	 *      * 2.2)Data driven/re-test cases--->Second priority(P2)--Positive/Negative Scenarios
	 *      * 2.3)Regression Test Cases--(P3)
	 *      * 2.4)Any other test cases--(P4)
	 *    
	 *  3.Design and Development of framework : 
	 *  
	 *  4. Execution--Jenkins.CI/CD
	 *     * We have to use pom.xml for execution remotely(through jenkins,cmd prompt,pom.xml) for that we have 
	 *       to add some plugins in pom.xml---without using tool like eclipse
	 *  
	 *  5. Maintainance
	 *  
	 *  
	 *  eCommerce Project -- Domain
	 *  
	 *  Front-End Operations(User)
	 *    *Register
	 *    *login
	 *    *Search
	 *    *Add/delete/edit Products Cart
	 *    *Track the items
	 *    Etc...
	 *    
	 *  Back-End Operations(Admin)s
	 *     *Product information/details
	 *     *Customer Details
	 *     *Store Details
	 *     Etc....
	 *  
	 * If you executed the 100test cases , only 90 passed and 10 failed.So if you want only failed test cases
	 * after you fixed them(by removing errors). There is a xml file will automatically created when you run 100 testcases its called
	 * testng-failed.xml in test - output folder . you can execute that xml file to re-run only failed testcases.
	 *  
	 *  
	 *  Day 46 :
	 *  -------
	 *  pom.xml 
	 *  cmd prompt
	 *  
	 *  git
	 *  github
	 *  
	 *  jenkins
	 *  
	 *  1.Execute pom.xml:
	 *  ---------------
	 *  we can use pom.xml for dependencies and plugins 
	 *   we have already added dependencies , now going to add below plugins
	 *   *maven compiler plugin
	 *   *maven surefile plugin
	 *   
	 *  2.to execute pom.xml through cmd prompt:
	 *  --------------------------------------
	 *  maven is available in 2 flavors :
	 *   1.plugin in eclipse
	 *   2.os 
	 *     *download the maven tar file from maven official website
	 *     *extract and copy the file c drive and set env variables
	 *     *check the version of maven by  giving mvn -version in cmd
	 *     *now take the project location from eclipse project
	 *     *in cmd , cd path(project path)
	 *     *mvn test and hit enter 
	 *     
	 *     now create run.bat file....in that file we should have this info : cd path(project path) and mvn test
	 *       
	 *  3.Jenkins
	 *  ---------
	 *  GIT -- local repository--commit 
	 *  GITHUB -- remote repository
	 *  
	 *    Devops : 1.Build creation 2.Run Automation 3.Build Certification
	 *    Maven--Use for build creation
	 *    Jenkins - run automation/build
	 *    
	 *  Steps :
	 *  1.Download git 
	 *  2.login into github
	 *  then 
	 *   *Adding 
	 *   *Staging/indexing
	 *   *commit
	 *   *push
	 *   by using pull command , we can get things from remote repository to local repository.
	 *   
	 *  Workflow :
	 *  ---------
	 *  workspace : path of our project(C:\Users\sai37\Automation Scripts\OpenCart_Aug12)
	 *  1.git init --create empty repository
	 *  step 2 and 3 have to provide only once
	 *  2.$ git config --global user.name "sai"
        3.$ git config --global user.email "sai37534@gmail.com"
        4.git status -- it gives untracked files
        5.git add -A -- add all files and folders to staging area
           git add file.txt
           git add *.java --for java files
           git add foldername
        6.git commit -m "message"
        7.create remote repo in git hub (https://github.com/SaiNammi14/OpenCart_Aug12.git)
        8.git remote add origin "https://github.com/SaiNammi14/OpenCart_Aug12.git"/github url 
        9.git push -u origin master
        
        if you want add more after first commit .....then need to execute from step 5 6 9.
        
        *to get files from remote/githug repo :
        ---------------------------------
        git pull 
     *we can have also branches as child of master branch
     *if you don't have project available in your local/eclipse then you have to execute clone.
     *git clone "repo url" <folder>.
     *
     Jenkins:
     --------
     *it is a tool for CI
     *CI -- dev-test-devops
     *CD -- devops-prod
     * CI - is our(QA) responsibility
     * CD - is devops responsibility
     *
     *
        
        
        
	 */
}
