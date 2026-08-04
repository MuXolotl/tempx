package defpackage;

/* JADX INFO: renamed from: lؗٝ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5041l {
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
    public final long vip;
    public final long yandex;

    public C5041l(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
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
        this.vip = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5041l.class != obj.getClass()) {
            return false;
        }
        C5041l c5041l = (C5041l) obj;
        return C9735l.crashlytics(this.yandex, c5041l.yandex) && C9735l.crashlytics(this.loadAd, c5041l.loadAd) && C9735l.crashlytics(this.crashlytics, c5041l.crashlytics) && C9735l.crashlytics(this.amazon, c5041l.amazon) && C9735l.crashlytics(this.purchase, c5041l.purchase) && C9735l.crashlytics(this.billing, c5041l.billing) && C9735l.crashlytics(this.mopub, c5041l.mopub) && C9735l.crashlytics(this.admob, c5041l.admob) && C9735l.crashlytics(this.subs, c5041l.subs) && C9735l.crashlytics(this.isPro, c5041l.isPro) && C9735l.crashlytics(this.firebase, c5041l.firebase) && C9735l.crashlytics(this.smaato, c5041l.smaato) && C9735l.crashlytics(this.remoteconfig, c5041l.remoteconfig) && C9735l.crashlytics(this.vip, c5041l.vip);
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        return C10882l.yandex(this.vip) + AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(C10882l.yandex(this.yandex) * 31, this.loadAd, 31), this.crashlytics, 31), this.amazon, 31), this.purchase, 31), this.billing, 31), this.mopub, 31), this.admob, 31), this.subs, 31), this.isPro, 31), this.firebase, 31), this.smaato, 31), this.remoteconfig, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListItemColors(containerColor=");
        AbstractC11043l.smaato(this.yandex, ", contentColor=", sb);
        AbstractC11043l.smaato(this.loadAd, ", focusedContainerColor=", sb);
        AbstractC11043l.smaato(this.crashlytics, ", focusedContentColor=", sb);
        AbstractC11043l.smaato(this.amazon, ", pressedContainerColor=", sb);
        AbstractC11043l.smaato(this.purchase, ", pressedContentColor=", sb);
        AbstractC11043l.smaato(this.billing, ", selectedContainerColor=", sb);
        AbstractC11043l.smaato(this.mopub, ", selectedContentColor=", sb);
        AbstractC11043l.smaato(this.admob, ", disabledContainerColor=", sb);
        AbstractC11043l.smaato(this.subs, ", disabledContentColor=", sb);
        AbstractC11043l.smaato(this.isPro, ", focusedSelectedContainerColor=", sb);
        AbstractC11043l.smaato(this.firebase, ", focusedSelectedContentColor=", sb);
        AbstractC11043l.smaato(this.smaato, ", pressedSelectedContainerColor=", sb);
        AbstractC11043l.smaato(this.remoteconfig, ", pressedSelectedContentColor=", sb);
        sb.append((Object) C9735l.subs(this.vip));
        sb.append(')');
        return sb.toString();
    }
}
