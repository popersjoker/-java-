<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
        .intro {
            background-color: azure;
        }

        .sample {
            background-color: #f5f5f5;
            line-height: 25px;
        }

        h5 {
            text-align: center;
            font-size: 30px;
            font-weight: initial;
        }

        body {
            padding: 50px;
            font-family: fangsong;
        }
    </style>
<body>
	<br>
	 
 <form action="submit.jsp">
        <h5 style="text-align: center;font-size: 30px;font-weight: initial;">题目编号${prob.pno}&nbsp;${prob.title}</h5>
        <input name="pno" value="${prob.pno}" style="display:none;">
        <hr>
        <p class="intro">
			${prob.intro }
        </p>
        <h6 style="font-size: 20px;">样例</h6>
        <p class="sample">
        ${prob.sample }
        </p>
        <p><input type="submit" value="提交代码"></p> 
    </form>

</body>

</html>