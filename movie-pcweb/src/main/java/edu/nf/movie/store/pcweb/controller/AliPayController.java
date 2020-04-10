package edu.nf.movie.store.pcweb.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.domain.AlipayTradePagePayModel;
import com.alipay.api.domain.AlipayTradeWapPayModel;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import edu.nf.movie.store.pcweb.config.AlipayConfig;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

/**
 * @author yx
 * @date 2020/4/10 11:02
 */
@RestController
public class AliPayController {

    @PostMapping("/pay")
    public String pay(String out_trade_no,String subject,String total_amount,String body,String timeout_express,String product_code) throws AlipayApiException, UnsupportedEncodingException {
        /**
         * gatewayUrl 请求网关
         * app_id 商家id
         * merchant_private_key 私钥
         * AlipayConfig 返回格式
         * AlipayConfig 支付编码格式
         * alipay_public_key 公钥
         * sign_type 加密方式
         */
        AlipayClient alipayClient=new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, AlipayConfig.format, AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);

        /**
         * 创建request请求
         */
        AlipayTradePagePayRequest request =new AlipayTradePagePayRequest();
        /**
         * 封装传入参数
         */
        AlipayTradePagePayModel model=new AlipayTradePagePayModel();
        String tradeNo=new String(out_trade_no.getBytes("ISO-8859-1"),"UTF-8");
//        String sbj=new String(subject.getBytes("ISO-8859-1"),"UTF-8");
        String total=new String(total_amount.getBytes("ISO-8859-1"),"UTF-8");
//        String pcode=new String(product_code.getBytes("ISO-8859-1"),"UTF-8");
//        model.setOutTradeNo(tradeNo);
//        model.setSubject(sbj);
//        model.setTotalAmount(total);
////        model.setBody(body);
////        model.setTimeExpire(timeout_express);
//        model.setPassbackParams(pcode);

        request.setBizContent("{\"out_trade_no\":\""+ tradeNo +"\","
                + "\"total_amount\":\""+ total +"\","
                + "\"subject\":\""+ subject +"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        request.setReturnUrl(AlipayConfig.return_url);
        request.setNotifyUrl(AlipayConfig.notify_url);

        //生成表单
        String form= alipayClient.pageExecute(request).getBody();
        System.out.println(form);
        return form;
    }
}
