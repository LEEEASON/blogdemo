/**
 * Created by AL on 0005 05 05.
 */
function check_value() {
    if($('#username').val().length !=0 && $('#password').val().length!=0){
        $('#loginbtn').animate({left:'0',duration:'slow'});
        $('#lockbtn').animate({left:'260px',duration:'slow'});
    }
}
$(function () {
    $('#loginbtn').click(function () {
        $('#loading').removeClass('hidden');
    });
});