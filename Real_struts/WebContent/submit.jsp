<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
   
    <style>
        .code {
            background-color: black;
            color: blue;
        	height:700px;
        }
        form{
            width: 50%;
   			margin: auto;
		}

    </style>
</head>

<body>
<form action="WSA" method="post" >
	语言:<input type="text" class="tit" style="
    border: 2px solid black;
    width: 630px;
" value="java"><br>
    <textarea name="code" id="" cols="100" rows="50" class="code">
    </textarea><br>
    <input name="no" value=<%=request.getParameter("pno") %> style="display:none">
    <div class="no"></div>
    <input type="submit" value="上传" class="subm">
</form>
</body>

</html>