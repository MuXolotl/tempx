package defpackage;

/* JADX INFO: renamed from: lْٜۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13621l extends Exception {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f26651l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C13621l(int i, int i2, int i3, int i4, C5978l c5978l, boolean z, C1210l c1210l) {
        StringBuilder sbSubscription = AbstractC14814l.subscription(i, i2, "AudioTrack init failed 0 Config(", ", ", ", ");
        AbstractC12900l.tapsense(sbSubscription, i3, ", ", i4, ") ");
        sbSubscription.append(c5978l);
        sbSubscription.append(z ? " (recoverable)" : "");
        super(sbSubscription.toString(), c1210l);
        this.f26651l = z;
    }
}
