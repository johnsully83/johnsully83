<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">	
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Guestbook</title>
<link rel="icon" href="/img/icon.ico">
<link rel="shortcut icon" href="/img/icon.ico">
<link rel="stylesheet" type="text/css" href="/css/library/bootstrap/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/library/jqueryui/jquery-ui.custom.min.css" />
<link rel="stylesheet" type="text/css" href="/css/custom/core.css" />
<link rel="stylesheet" type="text/css" href="/css/custom/guestbook.css" />
<script type="text/javascript" src="/javascript/library/jquery/jquery.min.js"></script>
<script type="text/javascript" src="/javascript/library/jqueryui/jquery-ui.custom.min.js"></script>
<script type="text/javascript" src="/javascript/custom/core.js"></script>
<script type="text/javascript" src="/javascript/custom/guestbook.js"></script>
<script type="text/javascript">
	$(function() {
		$('#country').val("${unitedStatesCountryID}")
		$('#state').val("${massachusettsStateID}")
	});
</script>
<script type="text/javascript">

  var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'UA-23673631-1']);
  _gaq.push(['_trackPageview']);

  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();

</script>
</head>
<body>
	<jsp:include page="../../tags/navbar.jsp" />
	<jsp:include page="../../tags/header.jsp" />
	<div id="wrapper" class="blue">
		<form:form commandName="loginForm" method="POST" action="/guestbook/admin/login">
			<table id="guestTable">
				<tbody>
					<tr>
						<td class="labelWrapper">
							<div class="label orange">
								<form:label path="username">
									Username:
								</form:label>
							</div>
						</td>
						<td>
							<div class="cellWrapper">
								<form:input path="username" />
							</div>
						</td>
					</tr>
					<tr>
						<td>
						</td>
						<td>
							<form:errors path="username" cssClass="error" />
						</td>
					</tr>
				</tbody>
			<form:input path="password">
			
			</form:input>
			<form:input path="username">
			
			</form:input>
			<form
		</form:form>
	</div>
	<jsp:include page="../../tags/navigation.jsp" />
</body>
</html>