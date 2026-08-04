package defpackage;

/* JADX INFO: renamed from: lٌَؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0198l {
    public final AbstractC18026l amazon;
    public final C16918l crashlytics;
    public final int loadAd;
    public final C18666l yandex;

    public C0198l(C18666l c18666l, int i, C16918l c16918l, AbstractC18026l abstractC18026l) {
        this.yandex = c18666l;
        this.loadAd = i;
        this.crashlytics = c16918l;
        this.amazon = abstractC18026l;
    }

    public final String toString() {
        return "ScrollCaptureCandidate(node=" + this.yandex + ", depth=" + this.loadAd + ", viewportBoundsInWindow=" + this.crashlytics + ", coordinates=" + this.amazon + ")";
    }
}
