package defpackage;

/* JADX INFO: renamed from: lَٞٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10458l {
    public boolean amazon;
    public boolean crashlytics;
    public boolean loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C10458l(int i, boolean z, boolean z2, boolean z3) {
        this.yandex = i;
        this.loadAd = z;
        this.crashlytics = z2;
        this.amazon = z3;
    }

    public String toString() {
        switch (this.yandex) {
            case 3:
                return "IsInfoTagFirst:" + this.loadAd + ":isContiguous:" + this.crashlytics + ":isAtEnd:" + this.amazon;
            default:
                return super.toString();
        }
    }

    public C15934l yandex() {
        if (this.loadAd || !(this.crashlytics || this.amazon)) {
            return new C15934l(this);
        }
        C8339l.smaato("Secondary offload attribute fields are true but primary isFormatSupported is false");
        return null;
    }
}
