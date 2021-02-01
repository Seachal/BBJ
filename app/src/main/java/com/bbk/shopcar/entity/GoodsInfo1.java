package com.bbk.shopcar.entity;


/**
 * 商品信息
 */

public class GoodsInfo1 {
//    店铺
    private String dianpu;
//    店铺 id
    private String dianpuid;
//    店铺优惠
    private String dianpuyouhui;
    private String list;


    public String getDianpuyouhui() {
        return dianpuyouhui;
    }

    public void setDianpuyouhui(String dianpuyouhui) {
        this.dianpuyouhui = dianpuyouhui;
    }

    public String getDianpuid() {
        return dianpuid;
    }

    public void setDianpuid(String dianpuid) {
        this.dianpuid = dianpuid;
    }

    public String getDianpu() {
        return dianpu;
    }

    public void setDianpu(String dianpu) {
        this.dianpu = dianpu;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }
}
