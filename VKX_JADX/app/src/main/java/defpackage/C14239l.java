package defpackage;

/* JADX INFO: renamed from: lٖٓٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C14239l {
    public static final C3123l Companion = new C3123l();
    public final long crashlytics;
    public final int loadAd;
    public final String yandex;

    public /* synthetic */ C14239l(int i, int i2, long j, String str) {
        this.yandex = (i & 1) == 0 ? "" : str;
        this.loadAd = (i & 2) == 0 ? 0 : i2;
        if ((i & 4) == 0) {
            this.crashlytics = 0L;
        } else {
            this.crashlytics = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14239l)) {
            return false;
        }
        C14239l c14239l = (C14239l) obj;
        return AbstractC8576l.yandex(this.yandex, c14239l.yandex) && this.loadAd == c14239l.loadAd && this.crashlytics == c14239l.crashlytics;
    }

    public final int hashCode() {
        int iHashCode = ((this.yandex.hashCode() * 31) + this.loadAd) * 31;
        long j = this.crashlytics;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAddResponseNewIdDto(rawId=");
        sb.append(this.yandex);
        sb.append(", newAudioId=");
        sb.append(this.loadAd);
        sb.append(", newOwnerId=");
        return AbstractC12900l.smaato(sb, this.crashlytics, ')');
    }
}
