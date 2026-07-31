package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٓٛۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14267l {
    public final boolean admob;
    public final String amazon;
    public final boolean billing;
    public final EnumC11447l crashlytics;
    public final String firebase;
    public final boolean isPro;
    public final int loadAd;
    public final int metrica;
    public final boolean mopub;
    public final EnumC12501l purchase;
    public final boolean remoteconfig;
    public final boolean smaato;
    public final boolean subs;
    public final int vip;
    public final C14974l yandex;

    public C14267l(C14974l c14974l, int i, EnumC11447l enumC11447l, String str, EnumC12501l enumC12501l, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2, boolean z6, boolean z7, int i2, int i3) {
        this.yandex = c14974l;
        this.loadAd = i;
        this.crashlytics = enumC11447l;
        this.amazon = str;
        this.purchase = enumC12501l;
        this.billing = z;
        this.mopub = z2;
        this.admob = z3;
        this.subs = z4;
        this.isPro = z5;
        this.firebase = str2;
        this.smaato = z6;
        this.remoteconfig = z7;
        this.vip = i2;
        this.metrica = i3;
    }

    public static C14267l yandex(C14267l c14267l, C14974l c14974l, int i, EnumC11447l enumC11447l, String str, EnumC12501l enumC12501l, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2, boolean z6, boolean z7, int i2, int i3, int i4) {
        C14974l c14974l2 = (i4 & 1) != 0 ? c14267l.yandex : c14974l;
        int i5 = (i4 & 2) != 0 ? c14267l.loadAd : i;
        EnumC11447l enumC11447l2 = (i4 & 4) != 0 ? c14267l.crashlytics : enumC11447l;
        String str3 = (i4 & 8) != 0 ? c14267l.amazon : str;
        EnumC12501l enumC12501l2 = (i4 & 16) != 0 ? c14267l.purchase : enumC12501l;
        boolean z8 = (i4 & 32) != 0 ? c14267l.billing : z;
        boolean z9 = (i4 & 64) != 0 ? c14267l.mopub : z2;
        boolean z10 = (i4 & 128) != 0 ? c14267l.admob : z3;
        boolean z11 = (i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? c14267l.subs : z4;
        boolean z12 = (i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? c14267l.isPro : z5;
        String str4 = (i4 & 1024) != 0 ? c14267l.firebase : str2;
        boolean z13 = (i4 & 2048) != 0 ? c14267l.smaato : z6;
        boolean z14 = (i4 & 4096) != 0 ? c14267l.remoteconfig : z7;
        int i6 = (i4 & 8192) != 0 ? c14267l.vip : i2;
        int i7 = (i4 & 16384) != 0 ? c14267l.metrica : i3;
        c14267l.getClass();
        return new C14267l(c14974l2, i5, enumC11447l2, str3, enumC12501l2, z8, z9, z10, z11, z12, str4, z13, z14, i6, i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14267l)) {
            return false;
        }
        C14267l c14267l = (C14267l) obj;
        return this.yandex.equals(c14267l.yandex) && this.loadAd == c14267l.loadAd && this.crashlytics == c14267l.crashlytics && this.amazon.equals(c14267l.amazon) && this.purchase == c14267l.purchase && this.billing == c14267l.billing && this.mopub == c14267l.mopub && this.admob == c14267l.admob && this.subs == c14267l.subs && this.isPro == c14267l.isPro && AbstractC8576l.yandex(this.firebase, c14267l.firebase) && this.smaato == c14267l.smaato && this.remoteconfig == c14267l.remoteconfig && this.vip == c14267l.vip && this.metrica == c14267l.metrica;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((this.purchase.hashCode() + AbstractC12589l.advert((this.crashlytics.hashCode() + (((this.yandex.hashCode() * 31) + this.loadAd) * 31)) * 31, 31, this.amazon)) * 31) + (this.billing ? 1231 : 1237)) * 31) + (this.mopub ? 1231 : 1237)) * 31) + (this.admob ? 1231 : 1237)) * 31) + (this.subs ? 1231 : 1237)) * 31) + (this.isPro ? 1231 : 1237)) * 31;
        String str = this.firebase;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.smaato ? 1231 : 1237)) * 31) + (this.remoteconfig ? 1231 : 1237)) * 31) + this.vip) * 31) + this.metrica;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NowPlayingState(track=");
        sb.append(this.yandex);
        sb.append(", trackIndex=");
        sb.append(this.loadAd);
        sb.append(", state=");
        sb.append(this.crashlytics);
        sb.append(", sourceDisplayName=");
        sb.append(this.amazon);
        sb.append(", repeatMode=");
        sb.append(this.purchase);
        sb.append(", shuffleMode=");
        sb.append(this.billing);
        sb.append(", isBuffering=");
        sb.append(this.mopub);
        sb.append(", isPodcast=");
        sb.append(this.admob);
        sb.append(", isRadio=");
        sb.append(this.subs);
        sb.append(", isInfinitePlayback=");
        sb.append(this.isPro);
        sb.append(", vkStreamMixId=");
        sb.append(this.firebase);
        sb.append(", isConfigurableVkStreamMix=");
        sb.append(this.smaato);
        sb.append(", isShuffleInProgress=");
        sb.append(this.remoteconfig);
        sb.append(", deviceVolume=");
        sb.append(this.vip);
        sb.append(", deviceMaxVolume=");
        return AbstractC0653l.adcel(sb, this.metrica, ')');
    }
}
