package defpackage;

/* JADX INFO: renamed from: lٍؘْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13159l extends AbstractC14039l {
    public final /* synthetic */ C16150l yandex;

    public C13159l(C16150l c16150l) {
        this.yandex = c16150l;
    }

    @Override // defpackage.AbstractC14039l
    public final void amazon(int i, int i2) {
        C16150l c16150l = this.yandex;
        C13170l c13170l = c16150l.amazon;
        int iPurchase = c13170l.purchase(c16150l);
        ((C2045l) c13170l.purchase).smaato(i + iPurchase, i2 + iPurchase);
    }

    @Override // defpackage.AbstractC14039l
    public final void billing() {
        this.yandex.amazon.amazon();
    }

    @Override // defpackage.AbstractC14039l
    public final void crashlytics(int i, int i2) {
        C16150l c16150l = this.yandex;
        c16150l.purchase += i2;
        C13170l c13170l = c16150l.amazon;
        ((C2045l) c13170l.purchase).remoteconfig(i + c13170l.purchase(c16150l), i2);
        if (c16150l.purchase <= 0 || c16150l.crashlytics.f463l != 2) {
            return;
        }
        c13170l.amazon();
    }

    @Override // defpackage.AbstractC14039l
    public final void loadAd(int i, int i2, Object obj) {
        C16150l c16150l = this.yandex;
        C13170l c13170l = c16150l.amazon;
        ((C2045l) c13170l.purchase).f465l.amazon(i + c13170l.purchase(c16150l), i2, obj);
    }

    @Override // defpackage.AbstractC14039l
    public final void purchase(int i, int i2) {
        C16150l c16150l = this.yandex;
        c16150l.purchase -= i2;
        C13170l c13170l = c16150l.amazon;
        ((C2045l) c13170l.purchase).metrica(i + c13170l.purchase(c16150l), i2);
        if (c16150l.purchase >= 1 || c16150l.crashlytics.f463l != 2) {
            return;
        }
        c13170l.amazon();
    }

    @Override // defpackage.AbstractC14039l
    public final void yandex() {
        C16150l c16150l = this.yandex;
        c16150l.purchase = c16150l.crashlytics.mopub();
        C13170l c13170l = c16150l.amazon;
        ((C2045l) c13170l.purchase).isPro();
        c13170l.amazon();
    }
}
