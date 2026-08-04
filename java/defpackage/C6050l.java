package defpackage;

/* JADX INFO: renamed from: lؘۢۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6050l {
    public final long amazon;
    public final long billing;
    public final long crashlytics;
    public final long loadAd;
    public final long purchase;
    public final long yandex;

    public C6050l(long j, long j2, long j3, long j4, long j5, long j6) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = j3;
        this.amazon = j4;
        this.purchase = j5;
        this.billing = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6050l.class != obj.getClass()) {
            return false;
        }
        C6050l c6050l = (C6050l) obj;
        return C9735l.crashlytics(this.yandex, c6050l.yandex) && C9735l.crashlytics(this.loadAd, c6050l.loadAd) && C9735l.crashlytics(this.crashlytics, c6050l.crashlytics) && C9735l.crashlytics(this.amazon, c6050l.amazon) && C9735l.crashlytics(this.purchase, c6050l.purchase) && C9735l.crashlytics(this.billing, c6050l.billing);
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        return C10882l.yandex(this.billing) + AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(C10882l.yandex(this.yandex) * 31, this.loadAd, 31), this.crashlytics, 31), this.amazon, 31), this.purchase, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardColors(containerColor=");
        AbstractC11043l.smaato(this.yandex, ", contentColor=", sb);
        AbstractC11043l.smaato(this.loadAd, ", focusedContainerColor=", sb);
        AbstractC11043l.smaato(this.crashlytics, ", focusedContentColor=", sb);
        AbstractC11043l.smaato(this.amazon, ", pressedContainerColor=", sb);
        AbstractC11043l.smaato(this.purchase, ", pressedContentColor=", sb);
        sb.append((Object) C9735l.subs(this.billing));
        sb.append(')');
        return sb.toString();
    }
}
