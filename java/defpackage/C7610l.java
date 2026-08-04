package defpackage;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;

/* JADX INFO: renamed from: lؚۣ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7610l implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C7610l f15654l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C7610l f15655l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final HashMap f15656l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C7610l f15657l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f15658l;

    static {
        C7610l c7610l = new C7610l("ML-KEM-512");
        f15655l = c7610l;
        C7610l c7610l2 = new C7610l("ML-KEM-768");
        f15654l = c7610l2;
        C7610l c7610l3 = new C7610l("ML-KEM-1024");
        f15657l = c7610l3;
        HashMap map = new HashMap();
        f15656l = map;
        map.put("ml-kem-512", c7610l);
        map.put("ml-kem-768", c7610l2);
        map.put("ml-kem-1024", c7610l3);
        map.put("kyber512", c7610l);
        map.put("kyber768", c7610l2);
        map.put("kyber1024", c7610l3);
    }

    public C7610l(String str) {
        this.f15658l = str;
    }

    public static C7610l yandex(String str) {
        C7610l c7610l = (C7610l) f15656l.get(AbstractC9008l.amazon(str));
        if (c7610l != null) {
            return c7610l;
        }
        C8339l.metrica("unknown parameter name: ".concat(str));
        return null;
    }
}
