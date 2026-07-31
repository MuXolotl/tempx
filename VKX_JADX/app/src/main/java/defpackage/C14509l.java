package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lۣٓٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14509l {
    public final C17019l admob;
    public final C10086l amazon;
    public final C5616l billing;
    public final C17724l crashlytics = new C17724l(this);
    public final C14632l loadAd;
    public boolean mopub;
    public final C10086l purchase;
    public final C17019l subs;
    public final String yandex;

    public C14509l(String str, C14632l c14632l) {
        this.yandex = str;
        this.loadAd = c14632l;
        C2580l c2580l = C2580l.f5619l;
        this.amazon = AbstractC8020l.smaato(c2580l);
        this.purchase = AbstractC8020l.smaato(c2580l);
        this.billing = new C5616l(new C1187l(0L), AbstractC3483l.isPro, null, 12);
        this.admob = new C17019l(this, 0);
        this.subs = new C17019l(this, 1);
    }

    public final boolean amazon() {
        List listCrashlytics = crashlytics();
        int size = listCrashlytics.size();
        for (int i = 0; i < size; i++) {
            C18656l c18656l = ((C0633l) listCrashlytics.get(i)).amazon().loadAd;
            while (true) {
                C18656l c18656l2 = c18656l.loadAd;
                if (c18656l2 == null) {
                    break;
                }
                c18656l = c18656l2;
            }
            if (!AbstractC8576l.yandex(c18656l.crashlytics(), c18656l.amazon.getValue())) {
                return true;
            }
        }
        return false;
    }

    public final List crashlytics() {
        return (List) this.purchase.getValue();
    }

    public final List loadAd() {
        return (List) this.amazon.getValue();
    }

    public final void purchase() {
        this.loadAd.getClass();
        List listLoadAd = loadAd();
        ArrayList arrayList = new ArrayList();
        int size = listLoadAd.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C0633l c0633l = (C0633l) listLoadAd.get(i);
            if (c0633l.admob()) {
                arrayList.add(c0633l);
                if (c0633l.amazon().loadAd()) {
                    z = true;
                }
            }
        }
        this.purchase.setValue(arrayList);
        C17724l c17724l = this.crashlytics;
        C14509l c14509l = (C14509l) c17724l.amazon;
        C15308l c15308l = (C15308l) c17724l.billing;
        if (c14509l.crashlytics().size() > 1 && z) {
            c17724l.loadAd = 2;
            c15308l.subs(c17724l.yandex + 1);
        } else if (!c14509l.loadAd.loadAd()) {
            c17724l.loadAd = 1;
            c17724l.yandex = c15308l.admob();
            ((C10086l) c17724l.purchase).setValue(C10323l.yandex);
        } else if (!z) {
            c17724l.loadAd = 3;
            c15308l.subs(c17724l.yandex + 1);
        }
        c17724l.Signature();
    }

    public final boolean yandex() {
        C17724l c17724l = this.crashlytics;
        return c17724l.tapsense().loadAd() || c17724l.tapsense().amazon() || c17724l.loadAd == 2;
    }
}
