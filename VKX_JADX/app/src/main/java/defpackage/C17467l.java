package defpackage;

/* JADX INFO: renamed from: lُٗۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17467l {
    public final long amazon;
    public final long crashlytics;
    public final InterfaceC17817l loadAd;
    public final boolean purchase;
    public final C10507l yandex;

    public C17467l(C10507l c10507l, InterfaceC17817l interfaceC17817l, long j, long j2, boolean z) {
        this.yandex = c10507l;
        this.loadAd = interfaceC17817l;
        this.crashlytics = j;
        this.amazon = j2;
        this.purchase = z;
    }

    public static C17467l yandex(C17467l c17467l, C10507l c10507l, InterfaceC17817l interfaceC17817l, long j, long j2, boolean z, int i) {
        if ((i & 1) != 0) {
            c10507l = c17467l.yandex;
        }
        C10507l c10507l2 = c10507l;
        if ((i & 2) != 0) {
            interfaceC17817l = c17467l.loadAd;
        }
        InterfaceC17817l interfaceC17817l2 = interfaceC17817l;
        if ((i & 4) != 0) {
            j = c17467l.crashlytics;
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = c17467l.amazon;
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            z = c17467l.purchase;
        }
        c17467l.getClass();
        return new C17467l(c10507l2, interfaceC17817l2, j3, j4, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17467l)) {
            return false;
        }
        C17467l c17467l = (C17467l) obj;
        return AbstractC8576l.yandex(this.yandex, c17467l.yandex) && AbstractC8576l.yandex(this.loadAd, c17467l.loadAd) && this.crashlytics == c17467l.crashlytics && this.amazon == c17467l.amazon && this.purchase == c17467l.purchase;
    }

    public final int hashCode() {
        C10507l c10507l = this.yandex;
        int iHashCode = (c10507l == null ? 0 : c10507l.hashCode()) * 31;
        InterfaceC17817l interfaceC17817l = this.loadAd;
        int iHashCode2 = interfaceC17817l != null ? interfaceC17817l.hashCode() : 0;
        long j = this.crashlytics;
        int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.amazon;
        return ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.purchase ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackAnalyticsSnapshot(track=");
        sb.append(this.yandex);
        sb.append(", source=");
        sb.append(this.loadAd);
        sb.append(", playbackStartedAt=");
        sb.append(this.crashlytics);
        sb.append(", totalPlayedDuration=");
        sb.append(this.amazon);
        sb.append(", isPlaying=");
        return AbstractC0653l.tapsense(sb, this.purchase, ')');
    }
}
