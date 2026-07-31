package defpackage;

/* JADX INFO: renamed from: lٌۧۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9216l {
    public final long amazon;
    public final InterfaceC9014l billing;
    public final long crashlytics;
    public final long loadAd;
    public final C18474l mopub = AbstractC1805l.yandex(false);
    public final long purchase;
    public final boolean yandex;

    public C9216l(boolean z, long j, long j2, long j3, long j4, InterfaceC9014l interfaceC9014l) {
        this.yandex = z;
        this.loadAd = j;
        this.crashlytics = j2;
        this.amazon = j3;
        this.purchase = j4;
        this.billing = interfaceC9014l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9216l) {
            C9216l c9216l = (C9216l) obj;
            if (this.yandex == c9216l.yandex && this.loadAd == c9216l.loadAd && this.crashlytics == c9216l.crashlytics && this.amazon == c9216l.amazon && this.purchase == c9216l.purchase && AbstractC8576l.yandex(this.billing, c9216l.billing)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.yandex ? 1231 : 1237;
        long j = this.loadAd;
        long j2 = this.crashlytics;
        int i2 = (((((int) (j ^ (j >>> 32))) + (i * 31)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.amazon;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.purchase;
        return this.billing.hashCode() + ((i3 + ((int) ((j4 >>> 32) ^ j4))) * 31);
    }

    public final String toString() {
        return "StartedOutput(isOutOfOrder=" + this.yandex + ", cameraFrameNumber=" + ((Object) C1266l.yandex(this.loadAd)) + ", cameraTimestamp=" + ((Object) ("CameraTimestamp(value=" + this.crashlytics + ')')) + ", cameraOutputSequence=" + this.amazon + ", cameraOutputNumber=" + this.purchase + ", outputListener=" + this.billing + ')';
    }

    public final void yandex(long j, Object obj) {
        if (this.mopub.yandex()) {
            this.billing.mo272l(obj);
            return;
        }
        StringBuilder sb = new StringBuilder("Output ");
        sb.append(this.amazon);
        sb.append(" at ");
        sb.append((Object) C1266l.yandex(this.loadAd));
        sb.append(" for ");
        C8936l.subs(AbstractC15560l.ads(j, " was completed multiple times!", sb));
    }
}
