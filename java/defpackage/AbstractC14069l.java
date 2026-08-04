package defpackage;

/* JADX INFO: renamed from: lَٓۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14069l implements InterfaceC5068l {
    public final int amazon;
    public final Integer crashlytics;
    public final int loadAd;
    public final C3350l yandex;

    public AbstractC14069l(C3350l c3350l, int i, Integer num) {
        this.yandex = c3350l;
        this.loadAd = i;
        this.crashlytics = num;
        int i2 = c3350l.purchase;
        this.amazon = i2;
        if (i < 0) {
            C10754l.metrica(AbstractC15560l.tapsense("The minimum number of digits (", i, ") is negative"));
            throw null;
        }
        if (i2 < i) {
            C18353l.smaato(i2, i, ") is less than the minimum number of digits (", "The maximum number of digits (");
            throw null;
        }
        if (num == null || num.intValue() > i) {
            return;
        }
        C18073l.vip("The space padding (", num, ") should be more than the minimum number of digits (", i, 41);
        throw null;
    }

    @Override // defpackage.InterfaceC5068l
    public final /* bridge */ /* synthetic */ AbstractC2523l crashlytics() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC5068l
    public final C14329l loadAd() {
        Integer numValueOf = Integer.valueOf(this.loadAd);
        Integer numValueOf2 = Integer.valueOf(this.amazon);
        C3350l c3350l = this.yandex;
        return AbstractC11308l.loadAd(numValueOf, numValueOf2, this.crashlytics, c3350l.yandex, c3350l.loadAd, false);
    }

    @Override // defpackage.InterfaceC5068l
    public final C1094l yandex() {
        C1243l c1243l = this.yandex.yandex;
        C1094l c1094l = new C1094l();
        int i = this.loadAd;
        if (i < 0) {
            C10754l.metrica(AbstractC15560l.tapsense("The minimum number of digits (", i, ") is negative"));
            return null;
        }
        if (i <= 9) {
            return this.crashlytics != null ? new C1094l() : c1094l;
        }
        C10754l.metrica(AbstractC15560l.tapsense("The minimum number of digits (", i, ") exceeds the length of an Int"));
        return null;
    }
}
