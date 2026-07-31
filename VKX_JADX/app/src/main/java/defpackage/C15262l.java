package defpackage;

/* JADX INFO: renamed from: lٔۢ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15262l {
    public final C17555l yandex;

    public C15262l(C17555l c17555l) {
        this.yandex = c17555l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15262l)) {
            return false;
        }
        C17555l c17555l = this.yandex;
        C3625l c3625l = c17555l.yandex;
        C17555l c17555l2 = ((C15262l) obj).yandex;
        return AbstractC8576l.yandex(c3625l, c17555l2.yandex) && c17555l.loadAd.amazon(c17555l2.loadAd) && AbstractC8576l.yandex(c17555l.crashlytics, c17555l2.crashlytics) && c17555l.amazon == c17555l2.amazon && c17555l.purchase == c17555l2.purchase && c17555l.billing == c17555l2.billing && AbstractC8576l.yandex(c17555l.mopub, c17555l2.mopub) && c17555l.admob == c17555l2.admob && c17555l.subs == c17555l2.subs && C15519l.loadAd(c17555l.isPro, c17555l2.isPro);
    }

    public final int hashCode() {
        C17555l c17555l = this.yandex;
        int iHashCode = c17555l.yandex.hashCode() * 31;
        C11090l c11090l = c17555l.loadAd;
        C14264l c14264l = c11090l.yandex;
        int iAmazon = C1794l.amazon(c14264l.loadAd) * 31;
        C6886l c6886l = c14264l.crashlytics;
        int i = (iAmazon + (c6886l != null ? c6886l.f14426l : 0)) * 31;
        C11617l c11617l = c14264l.amazon;
        int i2 = (i + (c11617l != null ? c11617l.yandex : 0)) * 31;
        C8689l c8689l = c14264l.purchase;
        int i3 = (i2 + (c8689l != null ? c8689l.yandex : 0)) * 31;
        AbstractC17569l abstractC17569l = c14264l.billing;
        int iHashCode2 = (i3 + (abstractC17569l != null ? abstractC17569l.hashCode() : 0)) * 31;
        String str = c14264l.mopub;
        int iAmazon2 = (C1794l.amazon(c14264l.admob) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        C10524l c10524l = c14264l.subs;
        int iFloatToIntBits = (iAmazon2 + (c10524l != null ? Float.floatToIntBits(c10524l.yandex) : 0)) * 31;
        C16810l c16810l = c14264l.isPro;
        int iHashCode3 = (iFloatToIntBits + (c16810l != null ? c16810l.hashCode() : 0)) * 31;
        C10537l c10537l = c14264l.firebase;
        int iHashCode4 = (iHashCode3 + (c10537l != null ? c10537l.f21449l.hashCode() : 0)) * 31;
        long j = c14264l.smaato;
        int i4 = C9735l.smaato;
        int iM1038strictfp = AbstractC1757l.m1038strictfp(iHashCode4, j, 31);
        C1354l c1354l = c14264l.metrica;
        int iHashCode5 = (c11090l.loadAd.hashCode() + ((iM1038strictfp + (c1354l != null ? c1354l.hashCode() : 0)) * 31)) * 31;
        C10891l c10891l = c11090l.crashlytics;
        int iHashCode6 = (c17555l.subs.hashCode() + ((c17555l.admob.hashCode() + ((c17555l.mopub.hashCode() + ((((((AbstractC14814l.admob((iHashCode5 + (c10891l != null ? c10891l.hashCode() : 0) + iHashCode) * 31, 31, c17555l.crashlytics) + c17555l.amazon) * 31) + (c17555l.purchase ? 1231 : 1237)) * 31) + c17555l.billing) * 31)) * 31)) * 31)) * 31;
        long j2 = c17555l.isPro;
        return ((int) (j2 ^ (j2 >>> 32))) + iHashCode6;
    }
}
