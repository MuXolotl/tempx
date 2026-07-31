package org.bouncycastle.jcajce.provider.asymmetric.mlkem;

import defpackage.C18493l;
import defpackage.C7610l;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class Utils {
    private static Map parameters;

    static {
        HashMap map = new HashMap();
        parameters = map;
        C7610l c7610l = C7610l.f15655l;
        map.put("ML-KEM-512", C18493l.f36119l);
        Map map2 = parameters;
        C7610l c7610l2 = C7610l.f15655l;
        map2.put("ML-KEM-768", C18493l.f36121l);
        Map map3 = parameters;
        C7610l c7610l3 = C7610l.f15655l;
        map3.put("ML-KEM-1024", C18493l.f36120l);
    }

    public static C18493l getParameters(String str) {
        return (C18493l) parameters.get(str);
    }
}
