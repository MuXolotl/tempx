package defpackage;

import j$.util.Objects;
import java.util.List;

/* JADX INFO: renamed from: lٌۥٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9173l {
    public final C2421l admob;
    public final int amazon;
    public final boolean billing;
    public final int crashlytics;
    public final List loadAd;
    public final EnumC12305l mopub;
    public final boolean purchase;
    public final List yandex;

    public C9173l(List list, List list2, int i, C2421l c2421l, int i2, boolean z, boolean z2, EnumC12305l enumC12305l) {
        this.yandex = AbstractC9905l.loadAd(list);
        this.loadAd = AbstractC9905l.loadAd(list2);
        this.crashlytics = i;
        this.amazon = i2;
        this.purchase = z;
        this.billing = z2;
        this.admob = c2421l;
        this.mopub = enumC12305l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9173l)) {
            return false;
        }
        C9173l c9173l = (C9173l) obj;
        return Objects.equals(this.yandex, c9173l.yandex) && Objects.equals(this.loadAd, c9173l.loadAd) && this.crashlytics == c9173l.crashlytics && this.amazon == c9173l.amazon && this.purchase == c9173l.purchase && this.billing == c9173l.billing && Objects.equals(this.mopub, c9173l.mopub) && Objects.equals(this.admob, c9173l.admob);
    }

    public final int hashCode() {
        return Objects.hash(this.yandex, this.loadAd, Integer.valueOf(this.crashlytics), Integer.valueOf(this.amazon), Boolean.valueOf(this.purchase), Boolean.valueOf(this.billing), this.mopub, this.admob);
    }

    public final String toString() {
        return "(MediaPlaylist mTracks=" + this.yandex + " mUnknownTags=" + this.loadAd + " mTargetDuration=" + this.crashlytics + " mMediaSequenceNumber=" + this.amazon + " mIsIframesOnly=" + this.purchase + " mIsOngoing=" + this.billing + " mPlaylistType=" + this.mopub + " mStartData=" + this.admob + ")";
    }

    public final C6469l yandex() {
        C6469l c6469l = new C6469l();
        c6469l.f13506l = this.loadAd;
        c6469l.f13505l = this.crashlytics;
        c6469l.f13504l = this.amazon;
        c6469l.f13502l = this.purchase;
        c6469l.f13507l = this.billing;
        c6469l.f13508l = this.mopub;
        c6469l.f13503l = this.admob;
        return c6469l;
    }
}
