package defpackage;

/* JADX INFO: renamed from: lٗۙۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C17383l {
    public static final C8176l Companion = new C8176l();
    public final String crashlytics;
    public final long loadAd;
    public final int yandex;

    public /* synthetic */ C17383l(int i, int i2, long j, String str) {
        if (7 != (i & 7)) {
            AbstractC11036l.isPro(i, 7, C9623l.yandex.purchase());
            throw null;
        }
        this.yandex = i2;
        this.loadAd = j;
        this.crashlytics = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17383l)) {
            return false;
        }
        C17383l c17383l = (C17383l) obj;
        return this.yandex == c17383l.yandex && this.loadAd == c17383l.loadAd && AbstractC8576l.yandex(this.crashlytics, c17383l.crashlytics);
    }

    public final int hashCode() {
        int i = this.yandex * 31;
        long j = this.loadAd;
        return this.crashlytics.hashCode() + ((i + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBooksAudioFileDto(duration=");
        sb.append(this.yandex);
        sb.append(", fileSize=");
        sb.append(this.loadAd);
        sb.append(", url=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }
}
