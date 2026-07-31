package defpackage;

/* JADX INFO: renamed from: lٕۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15920l {
    public int amazon;
    public boolean billing;
    public final C16141l loadAd;
    public C15920l purchase;
    public final Object yandex;
    public int crashlytics = -1;
    public final C10086l mopub = AbstractC8020l.smaato(null);

    public C15920l(Object obj, C16141l c16141l) {
        this.yandex = obj;
        this.loadAd = c16141l;
    }

    public final void loadAd() {
        if (this.billing) {
            return;
        }
        if (this.amazon <= 0) {
            AbstractC14825l.crashlytics("Release should only be called once");
        }
        int i = this.amazon - 1;
        this.amazon = i;
        if (i == 0) {
            this.loadAd.f31608l.remove(this);
            C15920l c15920l = this.purchase;
            if (c15920l != null) {
                c15920l.loadAd();
            }
            this.purchase = null;
        }
    }

    public final C15920l yandex() {
        if (this.billing) {
            AbstractC14825l.crashlytics("Pin should not be called on an already disposed item ");
        }
        if (this.amazon == 0) {
            this.loadAd.f31608l.add(this);
            C15920l c15920l = (C15920l) this.mopub.getValue();
            if (c15920l != null) {
                c15920l.yandex();
            } else {
                c15920l = null;
            }
            this.purchase = c15920l;
        }
        this.amazon++;
        return this;
    }
}
