package defpackage;

import androidx.recyclerview.widget.metrica;

/* JADX INFO: renamed from: lًؓؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7738l {
    public final C5128l yandex = new C5128l(0);
    public final C3994l loadAd = new C3994l((Object) null);

    public final void amazon(metrica metricaVar) {
        C3994l c3994l = this.loadAd;
        for (int iFirebase = c3994l.firebase() - 1; iFirebase >= 0; iFirebase--) {
            if (metricaVar == c3994l.smaato(iFirebase)) {
                Object[] objArr = c3994l.f8207l;
                Object obj = objArr[iFirebase];
                Object obj2 = AbstractC3324l.yandex;
                if (obj == obj2) {
                    break;
                }
                objArr[iFirebase] = obj2;
                c3994l.f8209l = true;
                break;
            }
        }
        C16772l c16772l = (C16772l) this.yandex.remove(metricaVar);
        if (c16772l != null) {
            c16772l.yandex = 0;
            c16772l.loadAd = null;
            c16772l.crashlytics = null;
            C16772l.amazon.crashlytics(c16772l);
        }
    }

    public final void crashlytics(metrica metricaVar) {
        C16772l c16772l = (C16772l) this.yandex.get(metricaVar);
        if (c16772l == null) {
            return;
        }
        c16772l.yandex &= -2;
    }

    public final C13279l loadAd(metrica metricaVar, int i) {
        C16772l c16772l;
        C13279l c13279l;
        C5128l c5128l = this.yandex;
        int iAmazon = c5128l.amazon(metricaVar);
        if (iAmazon >= 0 && (c16772l = (C16772l) c5128l.subs(iAmazon)) != null) {
            int i2 = c16772l.yandex;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                c16772l.yandex = i3;
                if (i == 4) {
                    c13279l = c16772l.loadAd;
                } else if (i == 8) {
                    c13279l = c16772l.crashlytics;
                } else {
                    C8339l.metrica("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    c5128l.mopub(iAmazon);
                    c16772l.yandex = 0;
                    c16772l.loadAd = null;
                    c16772l.crashlytics = null;
                    C16772l.amazon.crashlytics(c16772l);
                }
                return c13279l;
            }
        }
        return null;
    }

    public final void yandex(metrica metricaVar, C13279l c13279l) {
        C5128l c5128l = this.yandex;
        C16772l c16772lYandex = (C16772l) c5128l.get(metricaVar);
        if (c16772lYandex == null) {
            c16772lYandex = C16772l.yandex();
            c5128l.put(metricaVar, c16772lYandex);
        }
        c16772lYandex.crashlytics = c13279l;
        c16772lYandex.yandex |= 8;
    }
}
