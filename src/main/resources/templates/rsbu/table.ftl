<!DOCTYPE html>
<html>

<head>
<#include "../common/common.jsp"/>
	<#include "../layout/link.ftl"/>
    <title>table</title>
</head>

<body class="hold-transition skin-red sidebar-mini">
	<div class="wrapper">
	<#include "../layout/header.ftl"/>
	<#include "../layout/left.ftl"/>
		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">

			<!-- Main content -->
			<section class="content">
				<div class="row">
					<div class="col-xs-12">
						<div class="box">
							<!-- /.box-header -->
							<div class="box-body">
								<!--  -->
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
										<button type="button" class="btn btn-primary ">新增</button>
									</div>
									<div class="form-group m-r-more p-b">
										<button type="submit" class="btn btn-default">搜索</button>
									</div>
								</form>
								<table class="table table-bordered">
									<tbody>
										<tr>
											<th>预警代码</th>
											<th>逆变器品牌</th>
											<th>预警信息（液晶显示）</th>
											<th>中文描述</th>
											<th>故障紧急度</th>
											<th>推送对象</th>
											<th>操作</th>
										</tr>
										<tr>
											<td>
												11
											</td>
											<td>SMA</td>
											<td>
												communication fails betw
											</td>
											<td>中文描述</td>

											<td>高</td>
											<td>用户，经销商</td>

											<td>
												<a class="jq-disable btn btn-primary">
													编辑 </a>
												<a class="jq-disable btn btn-default delete_warncode">
													删除 </a>

											</td>
										</tr>

									</tbody>
								</table>
							</div>
							<!-- /.box-body -->
							<div class="box-footer clearfix">
								<ul class="pagination pagination-sm no-margin pull-right">
									<li>
										<a href="#">«</a>
									</li>
									<li>
										<a href="#">1</a>
									</li>
									<li>
										<a href="#">2</a>
									</li>
									<li>
										<a href="#">3</a>
									</li>
									<li>
										<a href="#">»</a>
									</li>
								</ul>
							</div>
						</div>
						<!-- /.box -->
					</div>
					<!-- /.col -->
				</div>
				<!-- /.row -->
			</section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->
		<#include "../layout/footer.ftl"/>
		<div class="control-sidebar-bg"></div>
	</div>
	<!-- ./wrapper -->
	<script>
		$(function () {
			$(".delete_warncode").click(function () {
				var dialog = bootbox.confirm({
					size: "small",
					message: "删除这条预警代码？",
					callback: function (result) { /* result is a boolean; true = OK, false = Cancel*/
						if (result) {
							//确认删除
						}
					}
				})
			})
		})
	</script>
</body>

</html>