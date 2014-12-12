<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet/less" type="text/css"
	href="<c:url value="/resources/css/main.less" />" />
<script>
	  less = {
	    env: "development",
	    async: false,
	    fileAsync: false,
	    poll: 1000,
	    functions: {},
	    dumpLineNumbers: "comments",
	    relativeUrls: false,
	    rootpath: ":/a.com/"
	  };
	</script>
<script src="<c:url value="/resources/js/less.js" />"
	type="text/javascript"></script>
	<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js">
      </script>
    <![endif]-->
</head>

<html>
<body>
	<h2>SoImmo</h2>
	${encoding}
	<div class="main-wrap">
		<p>List of accommodations</p>

		<section class="accommodations_list">

			<c:forEach var="i" begin="0" end="2">

				<article class="accommodation_card">

					<header>
						<div class="accommodation_card_title">
							Appartement
							${accommodations[i].rooms} pièces,
							${accommodations[i].address.city}
						</div>

						<div class="price">
							<c:out value="${accommodations[i].rent} €" />
							<sup>(+charge)</sup>
						</div>
					</header>

					<div class="ref ">
						<ul class="property_list">
							<li><c:out value="${accommodations[i].surface} m²" /></li>
						</ul>
					</div>
				</article>
			</c:forEach>

		</section>
	</div>
</body>
</html>