package defpackage;

import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: renamed from: lؙٜؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6230l implements AlgorithmParameterSpec, InterfaceC9935l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f13160l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f13161l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C0419l f13162l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f13163l;

    public C6230l(String str, String str2, String str3) {
        Cfor cforM190private = Cfor.m190private(str);
        if (cforM190private == null && (cforM190private = (Cfor) AbstractC17674l.yandex.get(str)) != null) {
            str = cforM190private.inmobi();
        }
        C18040l c18040l = cforM190private != null ? (C18040l) AbstractC17674l.loadAd.get(cforM190private) : null;
        if (c18040l == null) {
            C8339l.metrica("no key parameter set for passed in name/OID.");
            throw null;
        }
        this.f13162l = new C0419l(c18040l.f35334l.applovin(), c18040l.f35333l.applovin(), c18040l.f35332l.applovin());
        this.f13161l = str;
        this.f13160l = str2;
        this.f13163l = str3;
    }

    public static C6230l yandex(C13777l c13777l) {
        Cfor cfor = c13777l.f26891l;
        Cfor cfor2 = c13777l.f26893l;
        Cfor cfor3 = c13777l.f26892l;
        if (cfor != null) {
            return new C6230l(cfor2.inmobi(), cfor3.inmobi(), c13777l.f26891l.inmobi());
        }
        String strInmobi = cfor2.inmobi();
        return cfor3 != null ? new C6230l(strInmobi, cfor3.inmobi(), null) : new C6230l(strInmobi, null, null);
    }

    public final boolean equals(Object obj) {
        Object obj2;
        String str;
        if (obj instanceof C6230l) {
            C6230l c6230l = (C6230l) obj;
            if (this.f13162l.equals(c6230l.f13162l) && ((str = this.f13160l) == (obj2 = c6230l.f13160l) || (str != null && str.equals(obj2)))) {
                Object obj3 = c6230l.f13163l;
                String str2 = this.f13163l;
                if (str2 == obj3) {
                    return true;
                }
                if (str2 != null && str2.equals(obj3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f13162l.hashCode() ^ this.f13160l.hashCode();
        String str = this.f13163l;
        return (str != null ? str.hashCode() : 0) ^ iHashCode;
    }

    public C6230l(C0419l c0419l) {
        this.f13162l = c0419l;
        this.f13160l = InterfaceC11987l.metrica.inmobi();
        this.f13163l = null;
    }
}
