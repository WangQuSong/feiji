function getRootPath() {
    //获取当前网址，如： http://localhost:8088/test/test.jsp
    var curPath = window.document.location.href;
    //获取主机地址之后的目录，如： test/test.jsp
    var pathName = window.document.location.pathname;
    var pos = curPath.indexOf(pathName);
    //获取主机地址，如： http://localhost:8088
    var localhostPath = curPath.substring(0, pos);
    //获取带"/"的项目名，如：/test
    var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
    return (localhostPath + projectName);//发布前用此
}

var  path = getRootPath();

$(function () {

        console.log(path);

    $.getJSON(
        path+"/show/citydata",
            function (data) {
                var html =template("citys",{"data":data});

                $("#cityShow").html(html);
            }


    )

});


function jsonDateFormat(jsonDate) {//json日期格式转换为正常格式

    var year = jsonDate.year+1900;
    var month = jsonDate.month+1;
    var day = jsonDate.date;
    month=(month>9)?(""+month):("0"+month);  //如果得到的数字小于9要在前面加'0'
    day=(day>9)?(""+day):("0"+day);
    return year + "-" + month + "-" + day;

}


/*  查询 顺便 进行校验*/

function verifyQuery() {

    var chuFa = $("select[name=show]").val();
    var daoDa = $("select[name=showx]").val();

    console.log(chuFa);
    console.log(daoDa);

    if (chuFa == daoDa){
        alert("出发地，不能和到达地重复！")
        return;
    }


    $.getJSON(
            path+"/show/queryflight",
        {"departureCity":chuFa,"arrivalCity":daoDa},
        function (data) {
                            if (data[0] != null){
                /* 在js 中个一个对象 直接创造一个没有的属性 就当前对象点属性名！*/
                        var fData=data[0]; // 集合 他没有 daoDaName | chuFaName 属性！ 但是可以创造
                        var cName=data[1].cityName;
                        var dName=data[2].cityName;
                        fData.daoDaName=dName;
                        fData.chuFaName=cName;
                        var html=template("flightData",{"flights":fData})

                            }


            $("#showFlight").html(html);

            }


)


}


