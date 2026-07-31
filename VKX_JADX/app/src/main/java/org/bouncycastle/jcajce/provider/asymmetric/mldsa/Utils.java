package org.bouncycastle.jcajce.provider.asymmetric.mldsa;

import defpackage.C13812l;
import defpackage.C16791l;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class Utils {
    private static Map parameters;

    static {
        HashMap map = new HashMap();
        parameters = map;
        C16791l c16791l = C16791l.f32811l;
        map.put("ML-DSA-44", C13812l.amazon);
        Map map2 = parameters;
        C16791l c16791l2 = C16791l.f32811l;
        map2.put("ML-DSA-65", C13812l.purchase);
        Map map3 = parameters;
        C16791l c16791l3 = C16791l.f32811l;
        map3.put("ML-DSA-87", C13812l.billing);
        Map map4 = parameters;
        C16791l c16791l4 = C16791l.f32811l;
        map4.put("ML-DSA-44-WITH-SHA512", C13812l.mopub);
        Map map5 = parameters;
        C16791l c16791l5 = C16791l.f32811l;
        map5.put("ML-DSA-65-WITH-SHA512", C13812l.admob);
        Map map6 = parameters;
        C16791l c16791l6 = C16791l.f32811l;
        map6.put("ML-DSA-87-WITH-SHA512", C13812l.subs);
    }

    public static C13812l getParameters(String str) {
        return (C13812l) parameters.get(str);
    }
}
