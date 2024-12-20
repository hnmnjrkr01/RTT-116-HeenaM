<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="../include/header.jsp"/>

<style>
  .form_input_error{
    color: red;
  }
</style>

<section class="bg-light1 py-5">
  <div class="container">
    <div class="row">
    <h1 class="m-0 text-center"> Creating A New Customer</h1>
  </div>
  </div>
</section>

<section class="bg-light2 py-5">
  <div class="container">
    <form action="/customer/createCustomer">

      <input type="hidden" name="id" value="${customerForm.id}"/>

      <div class=" mt-3 row justify-content-center">
        <label for="companyName" class="col-sm-2 col-form-label">Company Name</label>
        <div class="col-sm-10">
          <input type="text" class="form-control" id="companyName" name="companyName" value="${customerForm.companyName}">
        </div>
      </div>


      <c:if test="${bindingResult.hasFieldErrors('companyName')}">
        <div class="row justify-content-center">
          <div class="col-sm-2"></div>
          <div class="col-sm-10 col-lg-6">
            <c:forEach var="error" items="${bindingResult.getFieldErrors('companyName')}">
              <dd class="mb-0 form_input_error">${error.getDefaultMessage()}</dd>
            </c:forEach>
          </div>
        </div>
      </c:if>


    <div class=" mt-3 row justify-content-center">
        <label for="firstName" class="col-sm-2 col-form-label">First Name</label>
        <div class="col-sm-10">
          <input type="text" class="form-control" id="firstName" name="firstName" value="${customerForm.firstName}">
        </div>
    </div>

      <c:if test="${bindingResult.hasFieldErrors('firstName')}">
        <div class="row justify-content-center">
          <div class="col-sm-2"></div>
          <div class="col-sm-10 col-lg-6">
            <c:forEach var="error" items="${bindingResult.getFieldErrors('firstName')}">
              <dd class="mb-0 form_input_error">${error.getDefaultMessage()}</dd>
            </c:forEach>
          </div>
        </div>
      </c:if>

      <div class=" mt-3 row justify-content-center">
      <label for="lastName" class="col-sm-2 col-form-label">Last Name</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="lastName" name="lastName" value="${customerForm.lastName}">
      </div>
      </div>

      <c:if test="${bindingResult.hasFieldErrors('lastName')}">
        <div class="row justify-content-center">
          <div class="col-sm-2"></div>
          <div class="col-sm-10 col-lg-6">
            <c:forEach var="error" items="${bindingResult.getFieldErrors('lastName')}">
              <dd class="mb-0 form_input_error">${error.getDefaultMessage()}</dd>
            </c:forEach>
          </div>
        </div>
      </c:if>

      <div class=" mt-3 row justify-content-center">
        <label for="phone" class="col-sm-2 col-form-label">Phone Number</label>
        <div class="col-sm-10">
          <input type="text" class="form-control" id="phone" name="phone" value="${customerForm.phone}">
        </div>
      </div>

      <c:if test="${bindingResult.hasFieldErrors('phone')}">
        <div class="row justify-content-center">
          <div class="col-sm-2"></div>
          <div class="col-sm-10 col-lg-6">
            <c:forEach var="error" items="${bindingResult.getFieldErrors('phone')}">
              <dd class="mb-0 form_input_error">${error.getDefaultMessage()}</dd>
            </c:forEach>
          </div>
        </div>
      </c:if>

      <div class=" mt-3 row justify-content-center">
        <label for="addressLine1" class="col-sm-2 col-form-label">Address <sub>line1</sub></label>
        <div class="col-sm-10">
          <input type="text" class="form-control" id="addressLine1" name="addressLine1" value="${customerForm.addressLine1}">
        </div>
      </div>

      <c:if test="${bindingResult.hasFieldErrors('addressLine1')}">
        <div class="row justify-content-center">
          <div class="col-sm-2"></div>
          <div class="col-sm-10 col-lg-6">
            <c:forEach var="error" items="${bindingResult.getFieldErrors('addressLine1')}">
              <dd class="mb-0 form_input_error">${error.getDefaultMessage()}</dd>
            </c:forEach>
          </div>
        </div>
      </c:if>

      <div class=" mt-3 row justify-content-center">
        <label for="addressLine2" class="col-sm-2 col-form-label">Address <sub>line2</sub></label>
        <div class="col-sm-10">
          <input type="text" class="form-control" id="addressLine2" name="addressLine2" value="${customerForm.addressLine2}">
        </div>
      </div>

      <c:if test="${bindingResult.hasFieldErrors('addressLine2')}">
        <div class="row justify-content-center">
          <div class="col-sm-2"></div>
          <div class="col-sm-10 col-lg-6">
            <c:forEach var="error" items="${bindingResult.getFieldErrors('addressLine2')}">
              <dd class="mb-0 form_input_error">${error.getDefaultMessage()}</dd>
            </c:forEach>
          </div>
        </div>
      </c:if>

      <div class=" mt-3 row justify-content-center">
        <label for="city" class="col-sm-2 col-form-label">City</label>
        <div class="col-sm-10">
          <input type="text" class="form-control" id="city" name="city" value="${customerForm.city}">
        </div>
      </div>

      <c:if test="${bindingResult.hasFieldErrors('city')}">
        <div class="row justify-content-center">
          <div class="col-sm-2"></div>
          <div class="col-sm-10 col-lg-6">
            <c:forEach var="error" items="${bindingResult.getFieldErrors('city')}">
              <dd class="mb-0 form_input_error">${error.getDefaultMessage()}</dd>
            </c:forEach>
          </div>
        </div>
      </c:if>

      <div class=" mt-3 row justify-content-center">
        <label for="country" class="col-sm-2 col-form-label">Country</label>
        <div class="col-sm-10">
          <input type="text" class="form-control" id="country" name="country" value="${customerForm.country}">
        </div>
      </div>

      <c:if test="${bindingResult.hasFieldErrors('country')}">
        <div class="row justify-content-center">
          <div class="col-sm-2"></div>
          <div class="col-sm-10 col-lg-6">
            <c:forEach var="error" items="${bindingResult.getFieldErrors('country')}">
              <dd class="mb-0 form_input_error">${error.getDefaultMessage()}</dd>
            </c:forEach>
          </div>
        </div>
      </c:if>


      <div class=" mt-3 row justify-content-center">
        <label for="employeeId" class="col-sm-2 col-form-label">Employees</label>
        <div class="col-sm-10">
          <select name="employeeId" id="employeeId" class="form-control">
              <c:forEach var="employee" items="${employeesKey}">
                <option
                        value="${employee.id}"
                        <c:if test="${customerForm.employeeId eq employee.id}">selected</c:if>
                >${employee.firstName} ${employee.lastName}
                </option>
              </c:forEach>
          </select>
        </div>
      </div>


     <div class="mt-3 row justify-content-center ">
       <div class="col-sm-12 col-lg-8">
       <button class="btn btn-primary">Submit</button>
     </div>
     </div>


    </form>
  </div>
</section>

<jsp:include page="../include/footer.jsp"/>