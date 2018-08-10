<div class="container">


	<div class="row">

		<!-- to display sidebar -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>
		<!-- to display actual products -->
		<div class="col-md-9">
			<!-- added breadcrumb -->
			<div class="row">
				<div class="col-lg-12">

					<c:if test="${ userClicksAllProducts == true }">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home ">Home</a></li>
							<li class="active">All Products</li>

						</ol>
					</c:if>

					<c:if test="${ userClicksCatagoryProducts == true }">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home ">Home</a></li>
							<li class="active">Catagory</li> 
                            <li class="active">${catagory.name}</li>
						</ol>
					</c:if>
				</div>
			</div>

		</div>

	</div>

</div>