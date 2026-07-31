package defpackage;

/* JADX INFO: renamed from: lؚ۠ۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7568l {
    public final long admob;
    public final long amazon;
    public final long billing;
    public final long crashlytics;
    public final long loadAd;
    public final long mopub;
    public final long purchase;
    public final long yandex;

    public C7568l(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = j3;
        this.amazon = j4;
        this.purchase = j5;
        this.billing = j6;
        this.mopub = j7;
        this.admob = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7568l.class != obj.getClass()) {
            return false;
        }
        C7568l c7568l = (C7568l) obj;
        return C9735l.crashlytics(this.yandex, c7568l.yandex) && C9735l.crashlytics(this.loadAd, c7568l.loadAd) && C9735l.crashlytics(this.crashlytics, c7568l.crashlytics) && C9735l.crashlytics(this.amazon, c7568l.amazon) && C9735l.crashlytics(this.purchase, c7568l.purchase) && C9735l.crashlytics(this.billing, c7568l.billing) && C9735l.crashlytics(this.mopub, c7568l.mopub) && C9735l.crashlytics(this.admob, c7568l.admob);
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        return C10882l.yandex(this.admob) + AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(C10882l.yandex(this.yandex) * 31, this.loadAd, 31), this.crashlytics, 31), this.amazon, 31), this.purchase, 31), this.billing, 31), this.mopub, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClickableSurfaceColors(containerColor=");
        AbstractC11043l.smaato(this.yandex, ", contentColor=", sb);
        AbstractC11043l.smaato(this.loadAd, ", focusedContainerColor=", sb);
        AbstractC11043l.smaato(this.crashlytics, ", focusedContentColor=", sb);
        AbstractC11043l.smaato(this.amazon, ", pressedContainerColor=", sb);
        AbstractC11043l.smaato(this.purchase, ", pressedContentColor=", sb);
        AbstractC11043l.smaato(this.billing, ", disabledContainerColor=", sb);
        AbstractC11043l.smaato(this.mopub, ", disabledContentColor=", sb);
        sb.append((Object) C9735l.subs(this.admob));
        sb.append(')');
        return sb.toString();
    }
}
