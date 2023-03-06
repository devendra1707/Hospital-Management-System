<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="init.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<style type="text/css">
    /* .main-div1{
  
        background-color:#172A38;
        padding-top:20px;
        padding-left:20px;
        padding-right:20px;
        padding-bottom:80px;
        } */
    .mq{
        
        color:white;
        text-align:center;
        }
        .nmc{
        width:31.50%;
        height:31px;
        }
        #te{
        
        height:35px;
        width:40px;
        }
      </style>

<body>

<!-- Add Enquiry -->

 <portlet:renderURL var="addEnquiryRenderURL">
    <portlet:param name="mvcPath" value="/add-enquiry.jsp"/>
</portlet:renderURL>

<div class="mb-5">
    <a href="<%= addEnquiryRenderURL %>" class="btn  btn-primary btn-default">
        <i class="glyphicon glyphicon-plus"></i> Add Enquiry
    </a>
</div>


	<form>
      <div class="main-div1">
      
      
     <input class="nmc" placeholder="Name" type="text" />
     &nbsp;&nbsp; 
     <input class="nmc" placeholder="Mobile No." type="number" /> &nbsp;&nbsp;
     <input class="nmc" placeholder="Concern" type="text" />
      
      <h4 class="mq">Math question 9 + 0 = <input id="te" type="number" /></h4>
      
      <h4 class="mq">Solve this simple math problem and enter the result. E.g. for 1+3, enter 4.</h4>
      
     
      
      <div style="text-align:center"><button>Submit</button></div>
      
      <p>&nbsp; &nbsp; &nbsp;</p>
      </div>
    </form>
</body>
</html>