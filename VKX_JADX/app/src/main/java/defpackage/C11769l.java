package defpackage;

/* JADX INFO: renamed from: lِِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11769l extends AbstractC12724l {
    public final boolean crashlytics;
    public final int loadAd;

    public C11769l(int i, boolean z) {
        super("GRAPH_ERROR");
        this.loadAd = i;
        this.crashlytics = z;
    }

    @Override // defpackage.AbstractC12724l
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.yandex);
        sb.append("(cameraError=");
        sb.append((Object) C6288l.yandex(this.loadAd));
        sb.append(", willAttemptRetry=");
        return AbstractC0653l.tapsense(sb, this.crashlytics, ')');
    }
}
