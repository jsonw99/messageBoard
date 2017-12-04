<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
	<table class="table table-striped">
		<caption>Hi ${name}, welcome to join our discussion.</caption>
		<c:forEach items="${topics}" var="topic">
			<thead>
				<tr>
					<th>${topic.content}<br />created by
						${topic.name} on <fmt:formatDate type="both"
							value="${topic.createDate}" /></th>
					<th><a type="button" class="btn btn-success"
						href="/reply-topic?id=${topic.topicId}">reply</a></th>
				</tr>
			</thead>
			<tbody>
				<c:set var="id" value="${topic.topicId}" />
				<c:forEach items="${repos.findByTopicId(id)}" var="reply">
					<tr>
						<td>${reply.content}<br />replied by ${reply.name} on <fmt:formatDate type="both"
								value="${reply.createDate}" /></td>
						<td></td>
					</tr>
				</c:forEach>
				<tr>
					<td></td>
					<td></td>
				</tr>
			</tbody>
		</c:forEach>
	</table>
	<div>
		<a class="button" href="/add-topic">Add a Topic</a>
	</div>
</div>
<%@ include file="common/footer.jspf"%>