<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />  
<title>spring-microservices: Data test</title>
</head>
<body>
	<div>I got this data from the other microservice as root stuff: <b>${rootstuff}</b></div>
	<div>I got this data from the other microservice as string: <b>${hello}</b></div>
	<div>I got this data from the other microservice as json: <b>${hellojson.message}</b></div>
</body>
</html>