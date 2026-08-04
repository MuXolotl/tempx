package defpackage;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: renamed from: lؚؗٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7065l implements InterfaceC4784l, InterfaceC11885l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C5044l f14805l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C16548l f14806l;

    public C7065l(C5044l c5044l, C16548l c16548l) {
        this.f14805l = c5044l;
        this.f14806l = c16548l;
    }

    @Override // defpackage.InterfaceC4784l
    public final void ad(int i, C5019l c5019l, C13071l c13071l, C2040l c2040l, IOException iOException, boolean z) {
        Pair pairBilling = billing(i, c5019l);
        if (pairBilling != null) {
            ((C14500l) this.f14805l.isPro).amazon(new RunnableC9600l(this, pairBilling, c13071l, c2040l, iOException, z, 1));
        }
    }

    @Override // defpackage.InterfaceC11885l
    public final void amazon(int i, C5019l c5019l, int i2) {
        Pair pairBilling = billing(i, c5019l);
        if (pairBilling != null) {
            ((C14500l) this.f14805l.isPro).amazon(new RunnableC2027l(this, pairBilling, i2, 7));
        }
    }

    public final Pair billing(int i, C5019l c5019l) {
        C5019l c5019lYandex;
        C16548l c16548l = this.f14806l;
        C5019l c5019l2 = null;
        if (c5019l != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= c16548l.crashlytics.size()) {
                    c5019lYandex = null;
                    break;
                }
                if (((C5019l) c16548l.crashlytics.get(i2)).amazon == c5019l.amazon) {
                    Object obj = c5019l.yandex;
                    Object obj2 = c16548l.loadAd;
                    int i3 = C12164l.vip;
                    c5019lYandex = c5019l.yandex(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (c5019lYandex == null) {
                return null;
            }
            c5019l2 = c5019lYandex;
        }
        return Pair.create(Integer.valueOf(i + c16548l.amazon), c5019l2);
    }

    @Override // defpackage.InterfaceC4784l
    /* JADX INFO: renamed from: class */
    public final void mo1600class(int i, C5019l c5019l, C13071l c13071l, C2040l c2040l, int i2) {
        Pair pairBilling = billing(i, c5019l);
        if (pairBilling != null) {
            ((C14500l) this.f14805l.isPro).amazon(new RunnableC4985l(this, pairBilling, c13071l, c2040l, i2, 2));
        }
    }

    @Override // defpackage.InterfaceC4784l
    public final void crashlytics(int i, C5019l c5019l, C2040l c2040l) {
        Pair pairBilling = billing(i, c5019l);
        if (pairBilling != null) {
            ((C14500l) this.f14805l.isPro).amazon(new RunnableC5241l(this, pairBilling, c2040l, 0));
        }
    }

    @Override // defpackage.InterfaceC11885l
    public final void isVip(int i, C5019l c5019l) {
        Pair pairBilling = billing(i, c5019l);
        if (pairBilling != null) {
            ((C14500l) this.f14805l.isPro).amazon(new RunnableC8025l(this, pairBilling, 1));
        }
    }

    @Override // defpackage.InterfaceC4784l
    public final void license(int i, C5019l c5019l, C13071l c13071l, C2040l c2040l) {
        Pair pairBilling = billing(i, c5019l);
        if (pairBilling != null) {
            ((C14500l) this.f14805l.isPro).amazon(new RunnableC0832l(this, pairBilling, c13071l, c2040l, 1));
        }
    }

    @Override // defpackage.InterfaceC4784l
    public final void loadAd(int i, C5019l c5019l, C2040l c2040l) {
        Pair pairBilling = billing(i, c5019l);
        if (pairBilling != null) {
            ((C14500l) this.f14805l.isPro).amazon(new RunnableC5241l(this, pairBilling, c2040l, 1));
        }
    }

    @Override // defpackage.InterfaceC11885l
    public final void purchase(int i, C5019l c5019l, C2183l c2183l) {
        Pair pairBilling = billing(i, c5019l);
        if (pairBilling != null) {
            ((C14500l) this.f14805l.isPro).amazon(new RunnableC15278l(this, pairBilling, c2183l, 0));
        }
    }

    @Override // defpackage.InterfaceC4784l
    public final void subscription(int i, C5019l c5019l, C13071l c13071l, C2040l c2040l) {
        Pair pairBilling = billing(i, c5019l);
        if (pairBilling != null) {
            ((C14500l) this.f14805l.isPro).amazon(new RunnableC0832l(this, pairBilling, c13071l, c2040l, 0));
        }
    }

    @Override // defpackage.InterfaceC11885l
    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final void mo2164throw(int i, C5019l c5019l) {
        Pair pairBilling = billing(i, c5019l);
        if (pairBilling != null) {
            ((C14500l) this.f14805l.isPro).amazon(new RunnableC8025l(this, pairBilling, 0));
        }
    }

    @Override // defpackage.InterfaceC11885l
    public final void yandex(int i, C5019l c5019l, Exception exc) {
        Pair pairBilling = billing(i, c5019l);
        if (pairBilling != null) {
            ((C14500l) this.f14805l.isPro).amazon(new RunnableC15278l(this, pairBilling, exc, 1));
        }
    }
}
