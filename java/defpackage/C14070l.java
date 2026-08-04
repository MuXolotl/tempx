package defpackage;

/* JADX INFO: renamed from: lَٓۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14070l {
    public C4020l adcel;
    public int admob;
    public boolean billing;
    public boolean crashlytics;
    public boolean firebase;
    public boolean isPro;
    public boolean loadAd;
    public int metrica;
    public boolean mopub;
    public boolean purchase;
    public boolean remoteconfig;
    public int smaato;
    public int subs;
    public boolean vip;
    public final C3654l yandex;
    public int amazon = 5;
    public final C14903l startapp = new C14903l(this);

    public C14070l(C3654l c3654l) {
        this.yandex = c3654l;
    }

    public final void admob(boolean z) {
        if (this.vip != z) {
            this.vip = z;
            if (z && !this.remoteconfig) {
                purchase(this.metrica + 1);
            } else {
                if (z || this.remoteconfig) {
                    return;
                }
                purchase(this.metrica - 1);
            }
        }
    }

    public final void amazon(int i) {
        int i2 = this.smaato;
        this.smaato = i;
        if ((i2 == 0) != (i == 0)) {
            C3654l c3654lLicense = this.yandex.license();
            C14070l c14070l = c3654lLicense != null ? c3654lLicense.f7667l : null;
            if (c14070l != null) {
                int i3 = c14070l.smaato;
                if (i == 0) {
                    c14070l.amazon(i3 - 1);
                } else {
                    c14070l.amazon(i3 + 1);
                }
            }
        }
    }

    public final void billing(boolean z) {
        if (this.firebase != z) {
            this.firebase = z;
            if (z && !this.isPro) {
                amazon(this.smaato + 1);
            } else {
                if (z || this.isPro) {
                    return;
                }
                amazon(this.smaato - 1);
            }
        }
    }

    public final void crashlytics(long j) {
        C4020l c4020l = this.adcel;
        if (c4020l != null) {
            C14070l c14070l = c4020l.f8282l;
            c14070l.amazon = 2;
            C3654l c3654l = c14070l.yandex;
            c14070l.purchase = false;
            c4020l.f8279l = j;
            C5227l snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(c3654l)).getSnapshotObserver();
            C15839l c15839l = c4020l.f8263l;
            snapshotObserver.yandex.crashlytics(c3654l, snapshotObserver.loadAd, c15839l);
            c14070l.billing = true;
            c14070l.mopub = true;
            boolean zLoadAd = AbstractC13082l.loadAd(c3654l);
            C14903l c14903l = c14070l.startapp;
            if (zLoadAd) {
                c14903l.f29318l = true;
                c14903l.f29348l = true;
            } else {
                c14903l.f29321l = true;
            }
            c14070l.amazon = 5;
        }
    }

    public final void isPro() {
        C14903l c14903l = this.startapp;
        C14070l c14070l = c14903l.f29342l;
        Object obj = c14903l.f29347l;
        C3654l c3654l = this.yandex;
        if ((obj != null || c14070l.yandex().Signature() != null) && c14903l.f29329l) {
            c14903l.f29329l = false;
            c14903l.f29347l = c14070l.yandex().Signature();
            C3654l c3654lLicense = c3654l.license();
            if (c3654lLicense != null) {
                C3654l.m1371goto(c3654lLicense, false, 7);
            }
        }
        C4020l c4020l = this.adcel;
        if (c4020l != null) {
            C14070l c14070l2 = c4020l.f8282l;
            if (!(c4020l.f8275l == null && c14070l2.yandex().mo2645l().f4026l.Signature() == null) && c4020l.f8271l) {
                c4020l.f8271l = false;
                c4020l.f8275l = c14070l2.yandex().mo2645l().f4026l.Signature();
                if (AbstractC13082l.loadAd(c3654l)) {
                    C3654l c3654lLicense2 = c3654l.license();
                    if (c3654lLicense2 != null) {
                        C3654l.m1371goto(c3654lLicense2, false, 7);
                        return;
                    }
                    return;
                }
                C3654l c3654lLicense3 = c3654l.license();
                if (c3654lLicense3 != null) {
                    C3654l.m1370final(c3654lLicense3, false, 7);
                }
            }
        }
    }

    public final void loadAd() {
        int i = this.yandex.f7667l.amazon;
        if (i == 3 || i == 4) {
            if (this.startapp.f29316l) {
                mopub(true);
            } else {
                billing(true);
            }
        }
        if (i == 4) {
            C4020l c4020l = this.adcel;
            if (c4020l == null || !c4020l.f8264l) {
                admob(true);
            } else {
                subs(true);
            }
        }
    }

    public final void mopub(boolean z) {
        if (this.isPro != z) {
            this.isPro = z;
            if (z && !this.firebase) {
                amazon(this.smaato + 1);
            } else {
                if (z || this.firebase) {
                    return;
                }
                amazon(this.smaato - 1);
            }
        }
    }

    public final void purchase(int i) {
        int i2 = this.metrica;
        this.metrica = i;
        if ((i2 == 0) != (i == 0)) {
            C3654l c3654lLicense = this.yandex.license();
            C14070l c14070l = c3654lLicense != null ? c3654lLicense.f7667l : null;
            if (c14070l != null) {
                int i3 = c14070l.metrica;
                if (i == 0) {
                    c14070l.purchase(i3 - 1);
                } else {
                    c14070l.purchase(i3 + 1);
                }
            }
        }
    }

    public final void subs(boolean z) {
        if (this.remoteconfig != z) {
            this.remoteconfig = z;
            if (z && !this.vip) {
                purchase(this.metrica + 1);
            } else {
                if (z || this.vip) {
                    return;
                }
                purchase(this.metrica - 1);
            }
        }
    }

    public final AbstractC18026l yandex() {
        return (AbstractC18026l) this.yandex.f7703l.purchase;
    }
}
