<header class="main-header">
    <a href="" class="logo">
        <span class="logo-mini" style="background: rgb(230,16,15);"><b>T</b></span>
        <span class="logo-lg"><b>TrinaSolar</b></span>
    </a>
    <nav class="navbar navbar-static-top">
        <a href="#" class="sidebar-toggle iconfont icon-menu " data-toggle="push-menu" role="button">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </a>
        <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
                <!-- Notifications: style can be found in dropdown.less -->
            <#--去掉通知2018-03-07-->
            <#--<li class="dropdown notifications-menu">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                <i class="iconfont icon-tongzhi"></i>
                <span class="label label-warning">10</span>
              </a>
            </li>-->
                <!-- User Account: style can be found in dropdown.less -->
                <li class="dropdown user user-menu">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <img src="${cpath}/backstage/page/image/user3.jpg" class="user-image" alt="User Image">
                        <span class="hidden-xs">${(currUser.userName)?default('鲁飞')}</span>
                    </a>
                    <ul class="dropdown-menu">
                        <!-- User image -->
                        <li class="user-header">
                            <img src="${cpath}/backstage/page/image/user3.jpg" class="img-circle" alt="User Image">

                            <p>
                            ${(currUser.userName)!''}
                            </p>
                            <p><a href="/logout" style="color:#fff">注销</a></p>
                        </li>
                        <!-- Menu Footer-->

                    </ul>
                </li>
            </ul>
        </div>
    </nav>
</header>
