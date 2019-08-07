$(document).ready(function () {
    var data = {
        "pageSize": 20,
        "sord": ""
    };
    console.log("-------------start--------")
    createPageInfo(data);

    $("#btn-search").click(function () {
        search();
    });

});

function search() {
    console.log("-------------search--------")

    $.ajax({
        url: ctx + "/loan/list",
        type: "post",
        dataType: "json",
        contentType: "application/json;charset=utf-8",
        success: function (result) {
            if (result.code = 10000) {
                // 清空数据
                $("#loan-base-info-grid").jqGrid("clearGridData");
                //设定数据
                $("#loan-base-info-grid")[0].addJSONData(result.data);
                //取消选中
                $("#loan-base-info-grid").jqGrid("resetSelection");
            }
        }
    });
}

function btn_detail(id) {
    alert("id-->" + id);
}

//页面初始化
function createPageInfo(data) {
    console.log("-------------create--------");
    //创建jqGrid组件
    jQuery("#loan-base-info-grid").jqGrid(
        {
            jsonReader: {
                root: "data.list",
                page: "data.pageIndex",
                total: "data.total",
                records: "data.pageSize"

            },
            url: ctx + "/loan/list",//组件创建完成之后请求数据的url
            datatype: "json",//请求数据返回的类型。可选json,xml,txt
            colNames: ["id", "loanNo", "name", "tel", "skuName", "loanAmount", "status", "name", "tel", "skuName", "loanAmount", "status", "操作"],//jqGrid的列显示名字
            colModel: [ //jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
                {name: "id", index: "id", width: 80, align: "right"},
                {name: "loanNo", index: "loanNo", width: 80, align: "right"},
                {name: "name", index: "name", width: 55, dataType: "string"},
                {name: "tel", index: "tel", width: 90, dataType: "string"},
                {name: "skuName", index: "skuName asc, invdate", width: 100, sortable: false},
                {name: "loanAmount", index: "loanAmount", width: 80, align: "right", sortable: false},
                {name: "status", index: "status", width: 150, sortable: false},
                {name: "name", index: "name", width: 55, sortable: false},
                {name: "tel", index: "tel", width: 90, sortable: false},
                {name: "skuName", index: "skuName asc, invdate", width: 100, sortable: false},
                {name: "loanAmount", index: "loanAmount", width: 80, align: "right", sortable: false},
                {name: "status", index: "status", width: 150, sortable: true},
                {
                    name: "", index: "operate", width: 50, align: "center",
                    formatter: function (cellvalue, options, rowObject) {
                        var detail = "<button type=\"button\" class=\"btn btn-primary \" onclick=\"btn_detail(" + rowObject.id + ")\">详情</button>";
                        return detail;
                    }
                }
            ],
            height: 360,
            rowNum: 10,//一页显示多少条
            loadonce: false,
            rowList: [10, 20, 30],//可供用户选择一页显示多少条
            pager: "#loan-base-info-pager",//表格页脚的占位符(一般是div)的id
            sortable: true,
            loadonce: false,
            sortname: "id",//初始化的时候排序的字段
            sortorder: "desc",//排序方式,可选desc,asc
            mtype: "post",//向后台请求数据的ajax的类型。可选post,get
            postData: JSON.stringify(data),
            dataType: "json",
            viewrecords: true,
            loadBeforeSend: function (jqXHR) {
                jqXHR.setRequestHeader("Authorization", "bearer D-c5df503c-3a37-4578-98d3-a84f20e0142e");
                jqXHR.setRequestHeader("Content-Type", "application/json; charset=utf-8");
            }
        });
    /*创建jqGrid的操作按钮容器*/
    /*可以控制界面上增删改查的按钮是否显示*/
    jQuery("#loan-base-info-grid").jqGrid("navGrid", "#loan-base-info-pager", {edit: false, add: false, del: false});
}

