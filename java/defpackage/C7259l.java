package defpackage;

/* JADX INFO: renamed from: lؚٔٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7259l {
    public final long admob;
    public final long amazon;
    public final long billing;
    public final long crashlytics;
    public final long firebase;
    public final long isPro;
    public final long loadAd;
    public final long mopub;
    public final long purchase;
    public final long remoteconfig;
    public final long smaato;
    public final long subs;
    public final long yandex;

    public C7259l(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = j3;
        this.amazon = j4;
        this.purchase = j5;
        this.billing = j6;
        this.mopub = j7;
        this.admob = j8;
        this.subs = j9;
        this.isPro = j10;
        this.firebase = j11;
        this.smaato = j12;
        this.remoteconfig = j13;
    }

    public static InterfaceC17807l yandex(EnumC13846l enumC13846l, C6956l c6956l) {
        if (enumC13846l == EnumC13846l.f27082l) {
            c6956l.m2123default(1539238463);
            InterfaceC17807l interfaceC17807lRemoteconfig = C17423l.remoteconfig(c6956l, 5);
            c6956l.startapp(false);
            return interfaceC17807lRemoteconfig;
        }
        c6956l.m2123default(1539331773);
        InterfaceC17807l interfaceC17807lRemoteconfig2 = C17423l.remoteconfig(c6956l, 4);
        c6956l.startapp(false);
        return interfaceC17807lRemoteconfig2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C7259l)) {
            return false;
        }
        C7259l c7259l = (C7259l) obj;
        return C9735l.crashlytics(this.yandex, c7259l.yandex) && C9735l.crashlytics(this.loadAd, c7259l.loadAd) && C9735l.crashlytics(this.remoteconfig, c7259l.remoteconfig) && C9735l.crashlytics(this.crashlytics, c7259l.crashlytics) && C9735l.crashlytics(this.amazon, c7259l.amazon) && C9735l.crashlytics(this.purchase, c7259l.purchase) && C9735l.crashlytics(this.billing, c7259l.billing) && C9735l.crashlytics(this.mopub, c7259l.mopub) && C9735l.crashlytics(this.admob, c7259l.admob) && C9735l.crashlytics(this.subs, c7259l.subs) && C9735l.crashlytics(this.isPro, c7259l.isPro) && C9735l.crashlytics(this.firebase, c7259l.firebase) && C9735l.crashlytics(this.smaato, c7259l.smaato);
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        return C10882l.yandex(this.smaato) + AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(C10882l.yandex(this.yandex) * 31, this.loadAd, 31), this.remoteconfig, 31), this.crashlytics, 31), this.amazon, 31), this.purchase, 31), this.billing, 31), this.mopub, 31), this.admob, 31), this.subs, 31), this.isPro, 31), this.firebase, 31);
    }
}
