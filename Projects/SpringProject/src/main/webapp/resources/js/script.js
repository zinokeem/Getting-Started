/**
 * 샘플 스크립트
 * @info jQuery 라이브러리에 의존하고 있음
 */

var sampleGlobal = "znkim";

$(document).ready(function() {
    printSample();
});

function printSample() {
    alert("auth : " + sampleGlobal);
    console.log("샘플로그 : " + sampleGlobal);
}

function get() {
    $.ajax({
        url : "/getSample",
        type : "GET",
        success: function(res) {
            alert("삭제되었습니다.");
            requestCount();
            showList();
        }
    });
}

function post() {
    $.ajax({
        url : "/postSample",
        type : "POST",
        dataType : "json",
        data: {num : "90", name : "bravo"},
        success: function(res) {
            console.log(res);
        }
    });
}