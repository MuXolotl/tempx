package defpackage;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;

/* JADX INFO: renamed from: lَؚٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7244l implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final HashMap f15067l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public byte[] f15068l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public byte[] f15069l;

    static {
        HashMap map = new HashMap();
        f15067l = map;
        map.put(InterfaceC11987l.mopub, "E-A");
        map.put(InterfaceC11987l.admob, "E-B");
        map.put(InterfaceC11987l.subs, "E-C");
        map.put(InterfaceC11987l.isPro, "E-D");
        map.put(InterfaceC18410l.ads, "Param-Z");
    }

    public C7244l(Cfor cfor, byte[] bArr) {
        String str = (String) f15067l.get(cfor);
        if (str == null) {
            C8339l.metrica(AbstractC9361l.license("unknown OID: ", cfor));
            throw null;
        }
        this.f15069l = null;
        this.f15068l = null;
        this.f15068l = C10358l.amazon(str);
        this.f15069l = AbstractC14024l.crashlytics(bArr);
    }
}
