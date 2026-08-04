package defpackage;

import android.media.AudioTrack;

/* JADX INFO: renamed from: lَۣٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10350l {
    public long admob;
    public int amazon;
    public long billing;
    public final C16543l crashlytics;
    public final int loadAd;
    public long mopub;
    public long purchase;
    public long subs;
    public final C9252l yandex;

    public C10350l(AudioTrack audioTrack, C16543l c16543l) {
        this.yandex = new C9252l(audioTrack);
        this.loadAd = audioTrack.getSampleRate();
        this.crashlytics = c16543l;
        yandex(0);
    }

    public final void yandex(int i) {
        this.amazon = i;
        if (i == 0) {
            this.mopub = 0L;
            this.admob = -1L;
            this.subs = -9223372036854775807L;
            this.purchase = System.nanoTime() / 1000;
            this.billing = 10000L;
            return;
        }
        if (i == 1) {
            this.billing = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.billing = 10000000L;
        } else if (i == 4) {
            this.billing = 500000L;
        } else {
            C18073l.admob();
        }
    }
}
