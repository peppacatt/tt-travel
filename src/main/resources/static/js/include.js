// $(function () {
//     $.get("header.html",function (data) {
//         $("#header").html(data);
//     });
//     $.get("footer.html",function (data) {
//         $("#footer").html(data);
//     });
// });
$(function () {
    $("#header").load("header")
    $("#footer").load("footer")
})