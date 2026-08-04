package defpackage;

/* JADX INFO: renamed from: lؘۖۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5890l {
    public final String crashlytics;
    public final int loadAd;
    public final /* synthetic */ int yandex = 1;

    public AbstractC5890l(int i, String str) {
        this.loadAd = i;
        this.crashlytics = str;
    }

    public abstract void loadAd(C16535l c16535l);

    public String toString() {
        switch (this.yandex) {
            case 0:
                return String.format("%s(0x%04x)", this.crashlytics, Integer.valueOf(this.loadAd));
            default:
                return super.toString();
        }
    }

    public abstract int yandex();

    public AbstractC5890l(String str, int i) {
        this.crashlytics = str;
        this.loadAd = i;
    }
}
