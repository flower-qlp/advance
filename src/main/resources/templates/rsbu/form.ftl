<!DOCTYPE html>
<html>

<head>
<#include "../common/common.jsp"/>
<#include "../layout/link.ftl"/>
    <title>form</title>

    <style type="text/css">
        .list{
            width:100%;
            overflow-x: auto;
        }
    </style>

</head>

<body class="hold-transition skin-red sidebar-mini">
<div class="wrapper">
<#include "../layout/header.ftl"/>
<#include "../layout/left.ftl"/>

    <div class="content-wrapper">


        <section class="content-header">
            <div class="row">
                <div class="col-xs-12">
                    <div class="box">
                        <!-- /.box-header -->
                        <div class="box-body">
                            <form class="form-inline filter">
                                <div class="form-group m-r-more p-b">
                                    <label class="control-label">预警代码</label>
                                    <input type="text" class="form-control" placeholder="预警代码">
                                </div>
                                <div class="form-group m-r-more p-b">
                                    <label class="control-label">预警信息</label>
                                    <input type="text" class="form-control" placeholder="预警信息">
                                </div>
                                <div class="form-group m-r-more p-b">
                                    <label class="control-label">中文描述</label>
                                    <input type="text" class="form-control" placeholder="中文描述">
                                </div>
                                <div class="form-group m-r-more p-b">
                                    <label class="control-label">逆变器品牌</label>
                                    <input type="hidden" class="form-control">
                                    <select class="form-control">
                                        <option value="">全部</option>
                                        <option value="key1">固德威</option>
                                        <option value="key2">谷瑞瓦特</option>
                                        <option value="key3">锦浪</option>
                                        <option value="key2">SMA</option>
                                        <option value="key3">Kstar</option>
                                    </select>
                                </div>

                                <div class="form-group m-r-more p-b">
                                    <label class="control-label">故障紧急度</label>
                                    <input type="hidden" class="form-control">
                                    <select class="form-control">
                                        <option value="">全部</option>
                                        <option value="key1">高</option>
                                        <option value="key2">中</option>
                                        <option value="key3">低</option>
                                        <option value="key4">忽略</option>
                                    </select>
                                </div>
                                <div class="form-group m-r-more p-b">
                                    <label class="control-label">推送对象</label>
                                    <div class="checkbox">
                                        <label>
                                            <input type="checkbox"> 用户
                                        </label>
                                    </div>
                                    <div class="checkbox">
                                        <label>
                                            <input type="checkbox"> 经销商
                                        </label>
                                    </div>
                                </div>

                                <div class="form-group m-r-more p-b">
                                    <button type="submit" class="btn btn-default" id="btn-search">搜索</button>
                                </div>
                            </form>
                            <div class="list">
                            <table id="loan-base-info-grid"></table>
                                <div id="loan-base-info-pager"></div>
                            </div>
                        </div>
                    </div>
                    <!-- /.box -->
                </div>
                <!-- /.col -->
            </div>
        </section>

    </div>
<#include "../layout/footer.ftl"/>
    <div class="control-sidebar-bg"></div>
</div>
<script type="text/javascript" src="${cpath}/backstage/page/js/rsbu/loan-base-info.js"></script>
</body>

</html>