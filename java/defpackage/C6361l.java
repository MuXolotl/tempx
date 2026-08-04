package defpackage;

/* JADX INFO: renamed from: lٍؙۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6361l {
    public int admob;
    public int amazon;
    public int billing;
    public int[] crashlytics;
    public int isPro;
    public int loadAd;
    public int mopub;
    public int purchase;
    public int subs;
    public int yandex;

    public final void yandex() {
        if (this.mopub >= 0) {
            return;
        }
        C8339l.metrica("indicatorTrackGapSize must be >= 0.");
    }
}
