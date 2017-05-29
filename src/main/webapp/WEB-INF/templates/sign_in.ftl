<#include "base.ftl">

<#macro content>
            <!-- content -->
            <div class="page-heading">
                <h1>Login</h1>
            </div>
            <#if error??>
                <div>
                    <p>${SPRING_SECURITY_LAST_EXCEPTION.message}</p>
                </div>
            </#if>
            <form method="post" action="/login/process" class="form-horizontal">
                <div class="form-group">
                    <div class="col-sm-2"><label for="username">E-mail</label></div>
                    <div class="col-sm-10">
                        <input name="username" type="text" class="form-control" placeholder="Введите-mail"/>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-2"><label for="password">Пароль</label></div>
                    <div class="col-sm-10">
                        <input name="password" type="password" class="form-control" placeholder="Введите пароль"/>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <div class="checkbox">
                            <label>
                                <input type="checkbox" name="remember"> Remember me
                            </label>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default" name="send">Send</button>
                    </div>
                </div>
            </form>
            <p>
                <a href="/sign_up">Registration</a>
            </p>
            <!-- /content -->
</#macro>

<@display_page/>