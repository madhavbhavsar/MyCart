<%
User user = (User) session.getAttribute("current-user");
if (user == null) {
	session.setAttribute("message", "You are not logged in !! Login first to access checkout page");
	response.sendRedirect("login.jsp");
	return;
} 
%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Mycart : Checkout</title>
<%@include file="components/common_css_js.jsp"%>
</head>
<body onload="foo()">

	<%@include file="components/navbar.jsp"%>
	<div class="container">
		<div class="row mt-5">
			<div class="col-md-6">
				<!-- card -->

				<div class="card">
					<div class="card-body">
						<h3 class="text-center mb-5">Your selected items</h3>
					  <div class="cart-body"></div> 
					</div>
				</div>


			</div>

			<div class="col-md-6">
				<!-- form details -->
				<div class="card">
				<%@include file="components/message.jsp" %>
					<div class="card-body">
						<h3 class="text-center mb-5">Your details for order</h3>
						<form action="BillsServlet" method="post">
						
						<input value="" type="hidden" id ="itemsnames" name="order_items_names">
						<input value="" type="hidden" id ="itemsquantity" name="order_items_quantity">
						<input value="" type="hidden" id ="itemsprice" name="order_items_price">
						<input value="" type="hidden" id ="itemstprice" name="order_items_tprice">
						
							<div class="form-group">
								<label for="exampleInputEmail1">Email address</label> <input value="<%=user.getUserEmail() %>"
									type="email" class="form-control" name="order_email" id="exampleInputEmail1"
									aria-describedby="emailHelp" placeholder="Enter email">
								<small id="emailHelp" class="form-text text-muted">We'll
									never share your email with anyone else.</small>
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">Your name</label> <input value="<%=user.getUserName() %>"
									type="text" class="form-control" name="order_name" id="name"
									aria-describedby="emailHelp" placeholder="Enter your name">

							</div>
							<div class="form-group">
								<label for="exampleFormControlTextarea1">Your shipping address</label>
								<textarea  class="form-control" id="exampleFormControlTextarea1"
									rows="3" placeholder="Enter your address" name="order_add" ><%=user.getUserAddress() %></textarea>
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">Your Contact Number</label> <input value="<%=user.getUserPhone() %>"
									type="text" class="form-control" id="name"
									aria-describedby="emailHelp" placeholder="Enter your number" name="order_phone">

							</div>
							<div class="container text-center">
							<button class="btn btn-outline-success" onclick="billPlaced();">Order now</button>
							<button class="btn btn-outline-primary">Continue shopping</button>
							
							
						</form>
					
					</div>
				</div>

			</div>

		</div>
	</div>


	<%@include file="components/common_modals.jsp"%>
<script type="text/javascript">
function foo(){
	console.log("fo0r Placed");
	let cartString=localStorage.getItem("cart");
	let cart=JSON.parse(cartString);
	
	let pname = ""
	let pquan = ""
	let ptotal = ""
	let pprice = ""
	cart.map((item) =>{
		pname += item.productName +","
		pquan+= item.productQuantity +","
		pprice +=  item.productPrice+","
		ptotal += item.productQuantity * item.productPrice+","
	})

	
	
	document.getElementById("itemsnames").value = pname;
	document.getElementById("itemsquantity").value = pquan;
	document.getElementById("itemsprice").value = pprice;
	document.getElementById("itemstprice").value = ptotal;
	
}

function billPlaced(){
	console.log("Order Placed");
	
	
	
	
	localStorage.clear();
	alert("Order Placed");
	
}

</script>


	
</body>
</html>
