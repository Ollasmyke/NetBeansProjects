<%-- 
    Document   : index
    Created on : Nov 10, 2017, 3:46:41 PM
    Author     : ollas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Programmers' Statistics</title>
    </head>
    <body>
        <h1>Your Favorite Programming Language </h1>
        <form name="name" action="response.jsp" method="post">
            <div class="">
                <label for="name">Fullname:</label>
                <input type="text" class="" name="name">
            </div>

            <div class="">
                <label for="username">Username:</label>
                <input type="text" class="" name="username" title="length must be between 6 and 20" pattern="([0-9a-zA-Z-_\s]){6,20}" required>
            </div>

            <div class="">
                <label for="field_one">Preferred Programming Language 1
                    <select name="field_one" class="">
                        <option value="Java">Java</option>
                        <option value="PHP">PHP</option>
                        <option value="C++">C++ </option>
                        <option value="Front-End CMS">Front-End CMS</option>
                    </select>
                </label>
            </div>
            <div class="">
                <label for="field_two">Preferred Programming Language 2
                    <select name="field_two" class="">
                        <option value="Java">Java</option>
                        <option value="PHP">PHP</option>
                        <option value="C++">C++ </option>
                        <option value="Front-End CMS">Front-End CMS</option>
                    </select>
                </label>
            </div>
            <!--            <div>   
                <div> <input type= "checkbox" name= "language" value= "Java"> Java </div>
                <div> <input type= "checkbox" name= "language" value= "php" > PHP </div>
                <div> <input type= "checkbox" name= "language" value= "c++" > C++ </div>
                <div> <input type= "checkbox" name= "language" value= "cms" > Front-End CMS </div>
            </div>-->

        </div>
            <input type="submit" value="Submit" />
        <!--<div class="">
                <button type="submit" value="Submit" style="margin-left:38px"> Submit </button>
        </div>-->
        </form>
        
    </body>
</html>
