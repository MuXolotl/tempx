package defpackage;

import java.nio.ByteOrder;
import java.util.Collections;

/* JADX INFO: renamed from: lؘؘؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5478l {
    public final int admob;
    public final int amazon;
    public final int billing;
    public final int crashlytics;
    public final C18595l firebase;
    public final long isPro;
    public final int loadAd;
    public final int mopub;
    public final int purchase;
    public final C7417l smaato;
    public final int subs;
    public final int yandex;

    public C5478l(byte[] bArr, int i) {
        C5257l c5257l = new C5257l(bArr, bArr.length);
        c5257l.remoteconfig(i * 8);
        this.yandex = c5257l.mopub(16);
        this.loadAd = c5257l.mopub(16);
        this.crashlytics = c5257l.mopub(24);
        this.amazon = c5257l.mopub(24);
        int iMopub = c5257l.mopub(20);
        this.purchase = iMopub;
        this.billing = amazon(iMopub);
        this.mopub = c5257l.mopub(3) + 1;
        int iMopub2 = c5257l.mopub(5) + 1;
        this.admob = iMopub2;
        this.subs = yandex(iMopub2);
        this.isPro = c5257l.subs(36);
        this.firebase = null;
        this.smaato = null;
    }

    public static int amazon(int i) {
        switch (i) {
            case 8000:
                return 4;
            case AbstractC12994l.AUDIO_CONTENT_SAMPLING_RATE /* 16000 */:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public static int yandex(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public final C5978l crashlytics(byte[] bArr, C7417l c7417l) {
        bArr[4] = -128;
        int i = this.amazon;
        if (i <= 0) {
            i = -1;
        }
        C7417l c7417l2 = this.smaato;
        if (c7417l2 != null) {
            c7417l = c7417l2.loadAd(c7417l);
        }
        C12984l c12984l = new C12984l();
        c12984l.vip = AbstractC3825l.vip("audio/flac");
        c12984l.metrica = i;
        c12984l.f25447throws = this.mopub;
        c12984l.f25442package = this.purchase;
        String str = AbstractC15323l.yandex;
        c12984l.f25445synchronized = AbstractC15323l.m3985throws(this.admob, ByteOrder.LITTLE_ENDIAN);
        c12984l.adcel = Collections.singletonList(bArr);
        c12984l.firebase = c7417l;
        return new C5978l(c12984l);
    }

    public final long loadAd() {
        long j = this.isPro;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.purchase);
    }

    public C5478l(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, C18595l c18595l, C7417l c7417l) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = i3;
        this.amazon = i4;
        this.purchase = i5;
        this.billing = amazon(i5);
        this.mopub = i6;
        this.admob = i7;
        this.subs = yandex(i7);
        this.isPro = j;
        this.firebase = c18595l;
        this.smaato = c7417l;
    }
}
