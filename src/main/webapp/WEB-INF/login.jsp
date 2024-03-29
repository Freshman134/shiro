<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="layui/css/layui.css">
    <link rel="stylesheet" href="css/login/login.css">
</head>
<body>
<form class="layui-form" action="login" method="post">
    <div class="container">
        <button class="close" title="关闭">X</button>
        <div class="layui-form-mid layui-word-aux">
            <!-- <img id="logoid" src="06.png" height="35"> -->
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">用户名</label>
            <div class="layui-input-block">
                <input type="text" name="username" required  lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">密 &nbsp;&nbsp;码</label>
            <div class="layui-input-inline">
                <input type="password" name="password" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
            </div>
            <!-- <div class="layui-form-mid layui-word-aux">辅助文字</div> -->
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">验证码</label>
            <div class="layui-input-inline">
                <input type="text" name="title" required  lay-verify="required" placeholder="请输入验证码" autocomplete="off" class="layui-input verity">
            </div>
            <!-- <div class="layui-form-mid layui-word-aux">辅助文字</div> -->

        </div>
        <!-- 			  <div class="layui-form-item">
                            <label class="layui-form-label">记住密码</label>
                            <div class="layui-input-block">
                              <input type="checkbox" name="close" lay-skin="switch" lay-text="ON|OFF">
                            </div>
                      </div> -->

        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit lay-filter="formDemo">登陆</button>
            </div>
        </div>
        <a href="" class="font-set">忘记密码?</a>  <a href="" class="font-set">立即注册</a>
    </div>
</form>
<script type="text/javascript" src="layui/layui.js"></script>
<script>
    layui.use(['form', 'layedit', 'laydate'], function() {
        var form = layui.form
            ,layer = layui.layer
            ,layedit = layui.layedit
            ,laydate = layui.laydate;

        //日期
        /* laydate.render({
           elem: '#date'
         });
         laydate.render({
           elem: '#date1'
         });

         //创建一个编辑器
         var editIndex = layedit.build('LAY_demo_editor');

         //自定义验证规则
         form.verify({
           title: function(value){
             if(value.length < 5){
               return '标题至少得5个字符啊';
             }
           }
           ,pass: [
             /^[\S]{6,12}$/
             ,'密码必须6到12位，且不能出现空格'
           ]
           ,content: function(value){
             layedit.sync(editIndex);
           }
         });

         //监听指定开关
         form.on('switch(switchTest)', function(data){
           layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
             offset: '6px'
           });
           layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
         });*/

        //监听提交
        form.on('submit(demo1)', function(data){
            layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            })
            return false;
        });

        //表单初始赋值
        /* form.val('example', {
           "username": "贤心" // "name": "value"
           ,"password": "123456"
           ,"interest": 1
           ,"like[write]": true //复选框选中状态
           ,"close": true //开关状态
           ,"sex": "女"
           ,"desc": "我爱 layui"
         })*/
    });
</script>
</body>
</html>
