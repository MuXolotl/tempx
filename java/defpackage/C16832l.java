package defpackage;

/* JADX INFO: renamed from: lٕٗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C16832l {
    public static final C15963l Companion = new C15963l();
    public final int crashlytics;
    public final long loadAd;
    public final int yandex;

    public /* synthetic */ C16832l(int i, int i2, int i3, long j) {
        if (7 != (i & 7)) {
            AbstractC11036l.isPro(i, 7, C14406l.yandex.purchase());
            throw null;
        }
        this.yandex = i2;
        this.loadAd = j;
        this.crashlytics = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16832l)) {
            return false;
        }
        C16832l c16832l = (C16832l) obj;
        return this.yandex == c16832l.yandex && this.loadAd == c16832l.loadAd && this.crashlytics == c16832l.crashlytics;
    }

    public final int hashCode() {
        int i = this.yandex * 31;
        long j = this.loadAd;
        return ((i + ((int) (j ^ (j >>> 32)))) * 31) + this.crashlytics;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioPlaylistReorderActionDto(trackId=");
        sb.append(this.yandex);
        sb.append(", trackOwnerId=");
        sb.append(this.loadAd);
        sb.append(", newIndex=");
        return AbstractC0653l.adcel(sb, this.crashlytics, ')');
    }

    public C16832l(int i, long j, int i2) {
        this.yandex = i;
        this.loadAd = j;
        this.crashlytics = i2;
    }
}
