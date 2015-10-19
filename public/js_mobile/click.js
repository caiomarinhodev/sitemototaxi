/**
 * Created by Caio on 18/10/2015.
 */
function validateEmail(a) {
    var o = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return o.test(a)
}
//function postContactToGoogle() {
//    var a = $("#email").val();
//    "" !== a && validateEmail(a) && $.ajax({
//        url: "https://docs.google.com/forms/d/1S9gbOowiQ-TalLDdIeYoPf5Nqyy60aYGx3JSpNatOZc/formResponse",
//        data: {"entry.505346081": a},
//        type: "POST",
//        dataType: "xml",
//        statusCode: {
//            0: function () {
//                console.log($("#email").text())
//            }, 200: function () {
//                console.log($("#email").text())
//            }
//        }
//    })
//}
function postFormToGoogle() {
    var a = $("#nome").val(), o = $("#email").val(), t = $("#mensagem").val();
    "" !== o && validateEmail(o) && $.ajax({
        url: "https://docs.google.com/forms/d/1YhD8mh-tY458TpRZR09E2T6JgdfifWl7ZnctoymDj0s/formResponse",
        data: {"entry.2012461371": a, "entry.957579203": o, "entry.500540521": t},
        type: "POST",
        dataType: "xml",
        statusCode: {
            0: function () {
            }, 200: function () {
            }
        }
    }).done(function( html ) {
        console.log(html);
    }).error(function(data){
        console.log(data);
    });
}