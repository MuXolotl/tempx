package defpackage;

/* JADX INFO: renamed from: lؚّؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4839l {
    public boolean amazon;
    public boolean crashlytics;
    public boolean loadAd;
    public int yandex = 0;

    public C1608l yandex() {
        if (this.loadAd || !(this.crashlytics || this.amazon)) {
            return new C1608l(this);
        }
        C8339l.smaato("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
        return null;
    }
}
