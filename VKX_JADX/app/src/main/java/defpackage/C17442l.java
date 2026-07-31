package defpackage;

/* JADX INFO: renamed from: lٗ۟ۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17442l {
    public final long loadAd;
    public final long yandex;

    public C17442l(long j, long j2) {
        this.yandex = j;
        this.loadAd = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17442l.class != obj.getClass()) {
            return false;
        }
        C17442l c17442l = (C17442l) obj;
        return C9735l.crashlytics(this.yandex, c17442l.yandex) && C9735l.crashlytics(this.loadAd, c17442l.loadAd);
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        return C10882l.yandex(this.loadAd) + (C10882l.yandex(this.yandex) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceColors(containerColor=");
        AbstractC11043l.smaato(this.yandex, ", contentColor=", sb);
        sb.append((Object) C9735l.subs(this.loadAd));
        sb.append(')');
        return sb.toString();
    }
}
