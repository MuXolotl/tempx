package defpackage;

/* JADX INFO: renamed from: lًٜٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8127l {
    public final long crashlytics;
    public final long loadAd;
    public final long yandex;

    public C8127l(long j, long j2, long j3) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8127l.class != obj.getClass()) {
            return false;
        }
        C8127l c8127l = (C8127l) obj;
        return C9735l.crashlytics(this.yandex, c8127l.yandex) && C9735l.crashlytics(this.loadAd, c8127l.loadAd) && C9735l.crashlytics(this.crashlytics, c8127l.crashlytics);
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        return C10882l.yandex(this.crashlytics) + AbstractC1757l.m1038strictfp(C10882l.yandex(this.yandex) * 31, this.loadAd, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardContainerContentColor(contentColor=");
        AbstractC11043l.smaato(this.yandex, ", focusedContentColor=", sb);
        AbstractC11043l.smaato(this.loadAd, ", pressedContentColor=", sb);
        sb.append((Object) C9735l.subs(this.crashlytics));
        sb.append(')');
        return sb.toString();
    }
}
