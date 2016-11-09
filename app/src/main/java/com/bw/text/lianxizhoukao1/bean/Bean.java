package com.bw.text.lianxizhoukao1.bean;

import java.util.List;

/**
 * Created by zhangjie on 2016/11/9.
 */
public class Bean {


    /**
     * error_code : 0
     * reason : Success
     * result : {"data":[{"content":"某天晚上和哥们逛街，哥们突然想小解，于是拉着我去小巷子方便。这哥们不知咋的，嘴一贱，随口一个唾沫飞向暗处。察！你TM敢吐口水在我身上！只见暗处出来十几道身影，满脸怒容的看着我俩。谁知这时候哥们转身就是给我几耳刮子，把我踹在地上，边打边骂：叫你不长眼，叫你乱吐。那一刻我蒙了，那些人也蒙了，甚至我还从哥们身上闻到一股尿烧味","hashId":"831a7555130e0c57cba1fb89ad7bd100","unixtime":1478691830,"updatetime":"2016-11-09 19:43:50"},{"content":"某天，公安局突袭检查网吧，结果有一小孩在上午，网吧老板急死了。正当民警拍小孩肩膀的时候，小破孩站了起来走向老板\u201c爸，给我100块钱，我要去买东西\u201d","hashId":"13fb23d82ef3628a99cf21cdafac0d07","unixtime":1478687630,"updatetime":"2016-11-09 18:33:50"},{"content":"有次去相亲，女孩和照片一样漂亮，我们聊的很开心，心里那个美啊！女孩害羞的问：叔叔，您儿子还没到吗？我风一样的冲进厕所，看着镜子里的自己，不小心的哭了出来。","hashId":"e1030da1e9b1dfa54e6800879148e1d6","unixtime":1478687630,"updatetime":"2016-11-09 18:33:50"},{"content":"小时候我很淘气，磕磕碰碰那是常有的事，要是磕到脑壳了第一反应就是先背一下乘法口诀表，发现很流利就继续玩。","hashId":"7c0501075824aef196024a33e70bab49","unixtime":1478687630,"updatetime":"2016-11-09 18:33:50"},{"content":"上高中的时候，大家都比较纯洁，为了了解喜欢的女生的生理周期，一到夏天就给买冰棍吃，总有那么几天会被拒绝\u2026","hashId":"e21c6f7d2edd1e859df45dce7dea31f1","unixtime":1478687630,"updatetime":"2016-11-09 18:33:50"},{"content":"今天在马路上，看到一个老奶奶摔倒在地，没人扶。哥脑子一热，上去扶了起来，结果看样子她又准备倒下，好吧，估计准备讹我了。哥果断先倒地，在地上不停的抽搐而且口吐白沫。老奶奶一下惊呆了，大概没遇到过这样的。我一边抽搐一边往前蠕动，大概向前蠕动了几米，我瞅了空子，连忙站起来拍拍灰跑了...","hashId":"c0a0d196e6579698cb110edeeaa906c5","unixtime":1478687630,"updatetime":"2016-11-09 18:33:50"},{"content":"甲：教女孩子游泳，用什么方法才好？ 乙：首先，用左手轻轻揽住她的腰，再拉着她的右手，然后\u2026\u2026 甲：她是我妹妹。 乙：那就从池边把她推下去就行了。","hashId":"d618428d6de739ed0eb6ca857941aa6b","unixtime":1478687630,"updatetime":"2016-11-09 18:33:50"},{"content":"妈：有女朋友没？小明：哪能啊！我来学校是学知识的，哪有时间想那些乱七八糟的事。妈：那你的生活费应该够用，不用多给了。小明：别，老妈，我错了...","hashId":"9f87ff0f3a2c61b38a87e7313f2c9d26","unixtime":1478687630,"updatetime":"2016-11-09 18:33:50"},{"content":"刚坐公交车，我给一位大爷让座，大爷连忙说，不用不用，你们年轻人上班也不容易，你自己坐吧！我说，没事，尊老爱幼是我国的传统美德，您坐您坐！这时，司机实在看不下了，大声吼道，你俩能不能别扯犊子了？车上就我们仨人！","hashId":"c2199608c552bf2a6bbca6aee8181424","unixtime":1478687630,"updatetime":"2016-11-09 18:33:50"},{"content":"哥们相亲，对方居然是女神，哥们各种矜持，结果一泡尿愣是憋了一下午，实在是憋不住了，于是靠近女神，轻轻问道:这附近有洗手间吗？谁知道女神红着脸说:别这样，我们才刚认识...","hashId":"38b15399ea1170e62dbcb525beb304a9","unixtime":1478687630,"updatetime":"2016-11-09 18:33:50"}]}
     */

    private int error_code;
    private String reason;
    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * content : 某天晚上和哥们逛街，哥们突然想小解，于是拉着我去小巷子方便。这哥们不知咋的，嘴一贱，随口一个唾沫飞向暗处。察！你TM敢吐口水在我身上！只见暗处出来十几道身影，满脸怒容的看着我俩。谁知这时候哥们转身就是给我几耳刮子，把我踹在地上，边打边骂：叫你不长眼，叫你乱吐。那一刻我蒙了，那些人也蒙了，甚至我还从哥们身上闻到一股尿烧味
         * hashId : 831a7555130e0c57cba1fb89ad7bd100
         * unixtime : 1478691830
         * updatetime : 2016-11-09 19:43:50
         */

        private List<DataBean> data;

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            private String content;
            private String hashId;
            private int unixtime;
            private String updatetime;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getHashId() {
                return hashId;
            }

            public void setHashId(String hashId) {
                this.hashId = hashId;
            }

            public int getUnixtime() {
                return unixtime;
            }

            public void setUnixtime(int unixtime) {
                this.unixtime = unixtime;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(String updatetime) {
                this.updatetime = updatetime;
            }
        }
    }
}
