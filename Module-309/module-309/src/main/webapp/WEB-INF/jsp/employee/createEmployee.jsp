<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<jsp:include page="../include/header.jsp"/>

<style>
    .form_input_error{
        color: red;
    }
</style>

<section class="bg-light1 py-5">
    <div class="container">
        <div class="row">
            <h1 class="m-0 text-center"> Creating A New Employee</h1>
        </div>
    </div>
</section>

<section class="bg-light2 pt-5 pb-5">
    <div class="container">
        <form action="/employee/createEmployee">

            <input type="hidden" name="id" value="${empFormBean.id}"/>


            <div class="mb-3">
                <label for="firstName" class="form-label">First name</label>
                <input type="text" class="form-control" id="firstName" name="firstName" value="${empFormBean.firstName}">
            </div>

            <c:if test="${bindingResult.hasFieldErrors('firstName')}">
                <div class="row justify-content-center">
                    <div mt="3">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('firstName')}">
                            <dd class="mb-0 form_input_error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>

            <div class="mb-3">
                <label for="lastName" class="form-label">Last name</label>
                <input type="text" class="form-control" id="lastName" name="lastName" value="${empFormBean.lastName}">
            </div>

            <c:if test="${bindingResult.hasFieldErrors('lastName')}">
                <div class="row justify-content-center">
                    <div mt="3">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('lastName')}">
                            <dd class="mb-0 form_input_error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>

            <div class="mb-3">
                <label for="extension" class="form-label">Extension</label>
                <input type="text" class="form-control" id="extension" name="extension" value="${empFormBean.extension}">
            </div>

            <c:if test="${bindingResult.hasFieldErrors('extension')}">
                <div class="row justify-content-center">
                    <div mt="3">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('extension')}">
                            <dd class="mb-0 form_input_error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>

            <div class="mb-3">
                <label for="email" class="form-label">Email</label>
                <input type="email" class="form-control" id="email" name="email" value="${empFormBean.email}">
            </div>

            <c:if test="${bindingResult.hasFieldErrors('email')}">
                <div class="row justify-content-center">
                    <div mt="3">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('email')}">
                            <dd class="mb-0 form_input_error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>

            <div class="mb-3">
                <label for="reportsTo" class="form-label">Reports-To</label>
                <input type="text" class="form-control" id="reportsTo" name="reportsTo" value="${empFormBean.reportsTo}">
            </div>

            <c:if test="${bindingResult.hasFieldErrors('reportsTo')}">
                <div class="row justify-content-center">
                    <div mt="3">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('reportsTo')}">
                            <dd class="mb-0 form_input_error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>

            <div class="mb-3">
                <label for="jobTitle" class="form-label">Job-Title</label>
                <input type="text" class="form-control" id="jobTitle" name="jobTitle" value="${empFormBean.jobTitle}">
            </div>

            <c:if test="${bindingResult.hasFieldErrors('jobTitle')}">
                <div class="row justify-content-center">
                    <div mt="3">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('jobTitle')}">
                            <dd class="mb-0 form_input_error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>

            <div class="mb-3">
                <label for="vacationHours" class="form-label">Vacation Hours</label>
                <input type="text" class="form-control" id="vacationHours" name="vacationHours" value="${empFormBean.vacationHours}">
            </div>

            <c:if test="${bindingResult.hasFieldErrors('vacationHours')}">
                <div class="row justify-content-center">
                    <div mt="3">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('vacationHours')}">
                            <dd class="mb-0 form_input_error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>


            <div class="mb-3">
                <label for="officeId" class="form-label">Offices </label>
                <select name="officeId" id="officeId" class="form-control">
                    <c:forEach var="office" items="${offices}">
                        <option
                                value="${office.id}"
                                <c:if test="${empFormBean.officeId eq office.id}">selected</c:if>
                        >${office.city}
                        </option>
                    </c:forEach>
                </select>
            </div>

            <c:if test="${bindingResult.hasFieldErrors('officeId')}">
                <div class="row justify-content-center">
                    <div mt="3">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('officeId')}">
                            <dd class="mb-0 form_input_error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>

            <div class="mb-3">
                <label for="profileImageURL" class="form-label">Profile Image URL</label>
                <input type="file" class="form-control" id="profileImageURL" name="profileImageURL" value="${empFormBean.profileImageURL}">
            </div>

            <div class="mb-3">
               <button type="submit">Submit</button>
            </div>
        </form>
    </div>
</section>































<jsp:include page="../include/footer.jsp"/>
