package cn.controller;

import cn.service.GoodsService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/test")
@Api(value = "test",description="测试接口描述")
public class TestController {
    /*
     * @ApiOperation(value = "接口说明", httpMethod ="接口请求方式", response ="接口返回参数类型", notes ="接口发布说明"
     *
     * @ApiParam(required = "是否必须参数", name ="参数名称", value ="参数具体描述"
     */
    @Autowired
    private GoodsService gs;

    @ResponseBody
    @RequestMapping(value = "/getall")
    @ApiOperation(value="查询全部信息",httpMethod="GET",notes="数据库查询全部信息")
    public String aaa(){
        String all = gs.getAll();
        return all;
    }

}
