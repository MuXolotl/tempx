package defpackage;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;

/* JADX INFO: renamed from: lٖۧٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16791l implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C16791l f32808l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C16791l f32809l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final HashMap f32810l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C16791l f32811l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C16791l f32812l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C16791l f32813l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C16791l f32814l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f32815l;

    static {
        C16791l c16791l = new C16791l("ML-DSA-44");
        f32811l = c16791l;
        C16791l c16791l2 = new C16791l("ML-DSA-65");
        f32808l = c16791l2;
        C16791l c16791l3 = new C16791l("ML-DSA-87");
        f32813l = c16791l3;
        C16791l c16791l4 = new C16791l("ML-DSA-44-WITH-SHA512");
        f32812l = c16791l4;
        C16791l c16791l5 = new C16791l("ML-DSA-65-WITH-SHA512");
        f32814l = c16791l5;
        C16791l c16791l6 = new C16791l("ML-DSA-87-WITH-SHA512");
        f32809l = c16791l6;
        HashMap map = new HashMap();
        f32810l = map;
        map.put("ml-dsa-44", c16791l);
        map.put("ml-dsa-65", c16791l2);
        map.put("ml-dsa-87", c16791l3);
        map.put("ml-dsa-44-with-sha512", c16791l4);
        map.put("ml-dsa-65-with-sha512", c16791l5);
        map.put("ml-dsa-87-with-sha512", c16791l6);
    }

    public C16791l(String str) {
        this.f32815l = str;
    }

    public static C16791l yandex(String str) {
        if (str == null) {
            C6541l.subs("name cannot be null");
            return null;
        }
        C16791l c16791l = (C16791l) f32810l.get(AbstractC9008l.amazon(str));
        if (c16791l != null) {
            return c16791l;
        }
        C8339l.metrica("unknown parameter name: ".concat(str));
        return null;
    }
}
