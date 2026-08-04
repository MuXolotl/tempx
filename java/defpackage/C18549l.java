package defpackage;

/* JADX INFO: renamed from: lۙۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18549l {
    public final int loadAd;
    public final C6570l yandex;

    public C18549l(int i, C6570l c6570l) {
        this.yandex = c6570l;
        this.loadAd = i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AnimationResult(endReason=");
        int i = this.loadAd;
        if (i != 1) {
            str = i != 2 ? "null" : "Finished";
        } else {
            str = "BoundReached";
        }
        sb.append(str);
        sb.append(", endState=");
        sb.append(this.yandex);
        sb.append(")");
        return sb.toString();
    }
}
