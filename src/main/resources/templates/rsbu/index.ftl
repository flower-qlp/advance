<html>
<head>
<#include "../common/common.jsp"/>
<#include "../layout/link.ftl"/>
    <title>ceshi</title>
</head>
<body class="hold-transition skin-red sidebar-mini">
<div class="wrapper">
<#include "../layout/header.ftl"/>
<#include "../layout/left.ftl"/>
    <div class="content-wrapper">

        <button id="btn" value="daochu">导出</button>
        <button id="btn1" value="daochu">导出1</button>
    </div>
    <!-- /.content-wrapper -->
<#include "../layout/footer.ftl"/>
    <div class="control-sidebar-bg"></div>
</div>
<script>
    $("#btn").click(function () {
        alert("开始");
        var xhr = new XMLHttpRequest();
        var url = "http://10.2.26.143:18092/backstage/loan/export";
        //设置响应类型为blob类型
        xhr.responseType = "blob";
        xhr.open("post", url, true);
        xhr.setRequestHeader("Authorization", "bearer d58e6818-f855-4525-a641-f67fa1121ffb");
        xhr.setRequestHeader("Content-Type", "application/json");
        data = JSON.stringify({"customerNo": null});
        xhr.onload = function () {
            console.log("this.status--->" + this.status)
            if (this.status == "200") {
                //获取响应文件流　　
                var blob = this.response;
                var reader = new FileReader();
                reader.readAsDataURL(blob);    // 转换为base64，可以直接放入a表情href
                reader.onload = function (e) {
                    // 转换完成，创建一个a标签用于下载
                    var a = document.createElement('a');
                    a.download = '贷款.xls';
                    a.href = e.target.result;
                    $("body").append(a);    // 修复firefox中无法触发click
                    a.click();
                    $(a).remove();
                }
            }
        };
        xhr.send(data);
    });


    $("#btn1").click(function () {
        var data = {
            "passWord": "Ts@qazxcv",
            "userName": "fei.lu"
        }

        $.ajax({
            url:  "http://10.2.26.143:18092/loginTxByUser",
            type: "post",
            dataType:"json",
            contentType: "application/json;charset=utf-8",
            data: JSON.stringify(data),
            success: function (result) {
                console.log(result.data)
            }
        })
    });
</script>

</body>
</html>