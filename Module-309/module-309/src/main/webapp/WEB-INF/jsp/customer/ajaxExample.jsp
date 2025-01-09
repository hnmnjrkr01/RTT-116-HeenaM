
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>




<jsp:include page="../include/header.jsp"/>

<section class="bg-light2 pt-5 pb-5">
    <div class="container">
        <h1 class="text-center">Ajax Example</h1>
    </div>
</section>


<script>
    $(document).ready(function(){
        $('#ajaxBtn').on('click', function(){
            console.log("ajax button clicked.");

            let cid = $('#cid').val();
            console.log("cust id = "+cid);

            $.ajax({
                method: "GET",
                url: "/customer/ajaxCall",
                data: {customerId: cid}
            }).done(function(msg){
                console.log(msg);
                let customer = JSON.parse(msg);
                $('#ajaxResult').text(customer.customerName +" "+ customer.city);
            });
        console.log("after json call but before .done")

        });
    });




</script>







<section>
    <div class="container bg-light2">
        <div class="row pt-5 pb-5">
            <div class="col-6">
                <input id="cid">
                <button id="ajaxBtn" class="btn btn-primary">Ajax Trigger</button>
            </div>
            <div class="row">
                <div class="col-6">
                    <div id="ajaxResult"></div>
                </div>
            </div>

        </div>
    </div>
</section>



<jsp:include page="../include/footer.jsp"/>