package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lًؙۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7838l implements InterfaceC11695l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final AbstractC8859l f16358l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f16359l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC11918l f16360l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final BigInteger f16361l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final BigInteger f16362l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public BigInteger f16363l;

    public C7838l(AbstractC11918l abstractC11918l, AbstractC8859l abstractC8859l, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f16363l = null;
        if (abstractC11918l == null) {
            C6541l.subs("curve");
            throw null;
        }
        if (bigInteger == null) {
            C6541l.subs("n");
            throw null;
        }
        this.f16360l = abstractC11918l;
        this.f16358l = yandex(abstractC11918l, abstractC8859l);
        this.f16362l = bigInteger;
        this.f16361l = bigInteger2;
        this.f16359l = AbstractC14024l.crashlytics(bArr);
    }

    public static AbstractC8859l yandex(AbstractC11918l abstractC11918l, AbstractC8859l abstractC8859l) {
        if (abstractC8859l == null) {
            C6541l.subs("Point cannot be null");
            return null;
        }
        if (!abstractC11918l.subs(abstractC8859l.yandex)) {
            C8339l.metrica("Point must be on the same curve");
            return null;
        }
        AbstractC8859l abstractC8859lStartapp = abstractC11918l.vip(abstractC8859l).startapp();
        if (abstractC8859lStartapp.smaato()) {
            C8339l.metrica("Point at infinity");
            return null;
        }
        if (abstractC8859lStartapp.firebase(false, true)) {
            return abstractC8859lStartapp;
        }
        C8339l.metrica("Point not on curve");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7838l)) {
            return false;
        }
        C7838l c7838l = (C7838l) obj;
        return this.f16360l.subs(c7838l.f16360l) && this.f16358l.amazon(c7838l.f16358l) && this.f16362l.equals(c7838l.f16362l);
    }

    public final int hashCode() {
        return this.f16362l.hashCode() ^ ((((this.f16360l.hashCode() ^ 1028) * 257) ^ this.f16358l.hashCode()) * 257);
    }

    public C7838l(C7100l c7100l) {
        this(c7100l.f14871l.f6465l, c7100l.f14870l.vip(), c7100l.f14874l, c7100l.f14873l, c7100l.metrica());
    }
}
