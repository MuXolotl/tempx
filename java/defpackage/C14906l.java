package defpackage;

/* JADX INFO: renamed from: lؘٕٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14906l {
    public Object amazon;
    public boolean crashlytics;
    public boolean loadAd;
    public int yandex;

    public C14906l(C8118l c8118l, int i, boolean z, boolean z2) {
        this.amazon = c8118l;
        this.yandex = i;
        this.loadAd = z;
        this.crashlytics = z2;
    }

    public void amazon(String str, Object obj, Object obj2, Object obj3) {
        ((C8118l) this.amazon).m2268l(this.yandex, this.loadAd, this.crashlytics, str, obj, obj2, obj3);
    }

    public void crashlytics(Object obj, Object obj2, String str) {
        ((C8118l) this.amazon).m2268l(this.yandex, this.loadAd, this.crashlytics, str, obj, obj2, null);
    }

    public void loadAd(Object obj, String str) {
        ((C8118l) this.amazon).m2268l(this.yandex, this.loadAd, this.crashlytics, str, obj, null, null);
    }

    public void yandex(String str) {
        ((C8118l) this.amazon).m2268l(this.yandex, this.loadAd, this.crashlytics, str, null, null, null);
    }
}
