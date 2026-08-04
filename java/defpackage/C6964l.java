package defpackage;

/* JADX INFO: renamed from: lؚؑۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6964l {
    public final C5019l amazon;
    public boolean billing;
    public long crashlytics;
    public int loadAd;
    public final /* synthetic */ C6219l mopub;
    public boolean purchase;
    public final String yandex;

    public C6964l(C6219l c6219l, String str, int i, C5019l c5019l) {
        this.mopub = c6219l;
        this.yandex = str;
        this.loadAd = i;
        this.crashlytics = c5019l == null ? -1L : c5019l.amazon;
        if (c5019l == null || !c5019l.loadAd()) {
            return;
        }
        this.amazon = c5019l;
    }

    public final boolean loadAd(AbstractC10759l abstractC10759l, AbstractC10759l abstractC10759l2) {
        C5019l c5019l;
        int i = this.loadAd;
        if (i < abstractC10759l.metrica()) {
            C6219l c6219l = this.mopub;
            C4322l c4322l = c6219l.yandex;
            abstractC10759l.vip(i, c4322l);
            int i2 = c4322l.vip;
            while (true) {
                if (i2 > c4322l.metrica) {
                    i = -1;
                    break;
                }
                int iLoadAd = abstractC10759l2.loadAd(abstractC10759l.smaato(i2));
                if (iLoadAd != -1) {
                    i = abstractC10759l2.billing(iLoadAd, c6219l.loadAd, false).crashlytics;
                    break;
                }
                i2++;
            }
        } else if (i >= abstractC10759l2.metrica()) {
            i = -1;
            break;
        }
        this.loadAd = i;
        return i != -1 && ((c5019l = this.amazon) == null || abstractC10759l2.loadAd(c5019l.yandex) != -1);
    }

    public final boolean yandex(C5597l c5597l) {
        C5019l c5019l = c5597l.amazon;
        AbstractC10759l abstractC10759l = c5597l.loadAd;
        if (c5019l == null) {
            return this.loadAd != c5597l.crashlytics;
        }
        long j = this.crashlytics;
        if (j == -1) {
            return false;
        }
        if (c5019l.amazon > j) {
            return true;
        }
        C5019l c5019l2 = this.amazon;
        if (c5019l2 == null) {
            return false;
        }
        int i = c5019l2.loadAd;
        int iLoadAd = abstractC10759l.loadAd(c5019l.yandex);
        int iLoadAd2 = abstractC10759l.loadAd(c5019l2.yandex);
        if (c5019l.amazon < c5019l2.amazon || iLoadAd < iLoadAd2) {
            return false;
        }
        if (iLoadAd > iLoadAd2) {
            return true;
        }
        if (!c5019l.loadAd()) {
            int i2 = c5019l.purchase;
            return i2 == -1 || i2 > i;
        }
        int i3 = c5019l.loadAd;
        int i4 = c5019l.crashlytics;
        if (i3 <= i) {
            return i3 == i && i4 > c5019l2.crashlytics;
        }
        return true;
    }
}
