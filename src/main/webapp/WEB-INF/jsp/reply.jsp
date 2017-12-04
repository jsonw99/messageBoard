<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<form:form method="post" modelAttribute="reply">
		<form:hidden path="topicId" />
		<fieldset class="form-group">
			<form:label path="content">Add Your Reply</form:label>
			<form:input path="content" type="text" class="form-control"
				required="required" />
			<form:errors path="content" cssClass="text-warning" />
		</fieldset>
		<button type="submit" class="btn btn-success">Add</button>
	</form:form>
</div>
<%@ include file="common/footer.jspf"%>