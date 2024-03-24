<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$(function() {
		// 게시물 클릭 시작
		$("section>table >tr>td").click(function(event) {
			var board_no = $(event.target).parent().children("td.board_no").html().trim();
			$("section>form>input[name=board_no]").val(board_no);
			var $formObj = $("form");
			$formObj.attr("method", "get");
			$formObj.attr("action", "${contextPath}/detail");
			$formObj.submit();
			return false;
		})
		
		// 검색버튼 클릭 시작
		$("section>form>input[type=button]").click(function() {
			var $formObj = $("form");
			$formObj.attr("method", "get");
			$formObj.attr("action", "${contextPath}/list");
			$formObj.submit();
			return false;
		})
	})
</script>
</head>

<body>
</body>
</html>