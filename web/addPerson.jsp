<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:baseTemplate pageName="Home">
    <div class="row">
        <div class="col-lg-8 col-lg-offset-2 col-md-8 col-md-offset-2">

            <!-- Trigger the modal with a button -->
            <button type="button" class="btn btn-info btn-lg col-lg-2 col-lg-offset-5" data-toggle="modal" data-target="#myModal">Add Person</button>

            <!-- Modal -->
            <div id="myModal" class="modal fade" role="dialog">
                <div class="modal-dialog">

                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title">Add Person</h4>
                        </div>
                        <div class="modal-body">

                            <form id="myAjaxRequestForm">
                                <fieldset>
                                    <legend>Post funktion</legend>
                                    <p>

                                        <label for="firstname">Firstname: </label>
                                    <input id="firstname" type="text" name="firstname" /><p>

                                        <label for="lastname">Lastname: </label>
                                    <input id="lastname" type="text" name="lastname" /><p>

                                        <label for="email">Email: </label>
                                    <input id="email" type="text" name="email" /><p>

                                        <label for="phone">Phone: </label>
                                    <input id="phone" type="text" name="phone" /><p>

                                        <label for="street">Street: </label>
                                    <input id="street" type="text" name="street" /><p>

                                        <label for="zip">Zip code: </label>
                                    <input id="zip" type="text" name="zip" /><p>

                                        <label for="hobby">Hobby: </label>
                                    <input id="hobby" type="text" name="hobby" /><p>

                                    </p>

                                    <p>
                                        <button id="myButton" class="btn btn-info col-lg-10 col-lg-offset-1 col-md-10 col-md-offset-1" type="button" value="Submit" click="sendInfo()">Add</button>
                                    </p>

                                </fieldset>
                                <p>
                            </form>

                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        </div>
                    </div>

                </div>
            </div>

        </div>
    </div>

    <div class="row">
        <div class="col-lg-8 col-lg-offset-2 col-md-8 col-md-offset-2">
            <div id="responseSection">
                <fieldset>
                    <legend>Response</legend>
                    <div class="personContent">

                        <div id="firstname">Firstname: </div>
                        <div id="lastname">Lastname:</div>
                        <div id="email">Email: </div>
                        <!--
                        <div id="phone">Phone: </div>
                        <div id="street">Street: </div>
                        <div id="zip">Zip: </div>
                        <div id="hobby">Hobby: </div>
                        -->
                    </div>
                </fieldset>
            </div> 
        </div>
    </div>
</t:baseTemplate>