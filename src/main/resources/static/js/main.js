$(document).ready();

function addNewAccount() {

    let newAccount = {
        username: $("#exampleInputEmail1").val(),
        password: $("#exampleInputPassword1").val()
    }

    $.ajax({
        url: "/api/account",
        type: "POST",
        contentType: "application/json",

    });

}