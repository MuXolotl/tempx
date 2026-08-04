package defpackage;

/* JADX INFO: renamed from: lًۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8439l {
    public final C2397l loadAd;
    public final C17934l yandex;

    public C8439l(C17934l c17934l, C2397l c2397l) {
        this.yandex = c17934l;
        this.loadAd = c2397l;
    }

    public final String toString() {
        C2397l c2397l = this.loadAd;
        C0499l c0499l = (C0499l) c2397l.f5166l.mo245l(C0499l.f1807l);
        String str = c0499l != null ? c0499l.f1808l : null;
        int iHashCode = hashCode();
        AbstractC8576l.loadAd(16);
        return "Request@" + Integer.toString(iHashCode, 16) + (str != null ? AbstractC15560l.Signature("[", str, "](") : "(") + "currentBounds()=" + this.yandex.invoke() + ", continuation=" + c2397l + ")";
    }
}
