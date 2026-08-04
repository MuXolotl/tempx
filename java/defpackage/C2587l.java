package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.metrica;
import java.util.ArrayList;

/* JADX INFO: renamed from: lُْؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2587l extends AbstractC13735l {
    public static TimeInterpolator subscription;
    public ArrayList adcel;
    public ArrayList admob;
    public ArrayList ads;
    public ArrayList firebase;
    public ArrayList isPro;
    public ArrayList metrica;
    public boolean mopub;
    public ArrayList remoteconfig;
    public ArrayList smaato;
    public ArrayList startapp;
    public ArrayList subs;
    public ArrayList vip;

    public static void admob(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((metrica) arrayList.get(size)).yandex.animate().cancel();
        }
    }

    @Override // defpackage.AbstractC13735l
    public final void amazon(metrica metricaVar) {
        ArrayList arrayList = this.smaato;
        ArrayList arrayList2 = this.remoteconfig;
        ArrayList arrayList3 = this.vip;
        View view = metricaVar.yandex;
        view.animate().cancel();
        ArrayList arrayList4 = this.isPro;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C17616l) arrayList4.get(size)).yandex == metricaVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                crashlytics(metricaVar);
                arrayList4.remove(size);
            }
        }
        isPro(this.firebase, metricaVar);
        if (this.admob.remove(metricaVar)) {
            view.setAlpha(1.0f);
            crashlytics(metricaVar);
        }
        if (this.subs.remove(metricaVar)) {
            view.setAlpha(1.0f);
            crashlytics(metricaVar);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            isPro(arrayList5, metricaVar);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            for (int size4 = arrayList6.size() - 1; size4 >= 0; size4--) {
                if (((C17616l) arrayList6.get(size4)).yandex == metricaVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    crashlytics(metricaVar);
                    arrayList6.remove(size4);
                    if (!arrayList6.isEmpty()) {
                        break;
                    }
                    arrayList2.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(metricaVar)) {
                view.setAlpha(1.0f);
                crashlytics(metricaVar);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.adcel.remove(metricaVar);
        this.metrica.remove(metricaVar);
        this.ads.remove(metricaVar);
        this.startapp.remove(metricaVar);
        subs();
    }

    @Override // defpackage.AbstractC13735l
    public final boolean billing() {
        return (this.subs.isEmpty() && this.firebase.isEmpty() && this.isPro.isEmpty() && this.admob.isEmpty() && this.startapp.isEmpty() && this.adcel.isEmpty() && this.metrica.isEmpty() && this.ads.isEmpty() && this.remoteconfig.isEmpty() && this.smaato.isEmpty() && this.vip.isEmpty()) ? false : true;
    }

    public final boolean firebase(C3989l c3989l, metrica metricaVar) {
        if (c3989l.loadAd == metricaVar) {
            c3989l.loadAd = null;
        } else {
            if (c3989l.yandex != metricaVar) {
                return false;
            }
            c3989l.yandex = null;
        }
        View view = metricaVar.yandex;
        View view2 = metricaVar.yandex;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        crashlytics(metricaVar);
        return true;
    }

    public final void isPro(ArrayList arrayList, metrica metricaVar) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C3989l c3989l = (C3989l) arrayList.get(size);
            if (firebase(c3989l, metricaVar) && c3989l.yandex == null && c3989l.loadAd == null) {
                arrayList.remove(c3989l);
            }
        }
    }

    public final boolean mopub(metrica metricaVar, int i, int i2, int i3, int i4) {
        View view = metricaVar.yandex;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) view.getTranslationY());
        smaato(metricaVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            crashlytics(metricaVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.isPro;
        C17616l c17616l = new C17616l();
        c17616l.yandex = metricaVar;
        c17616l.loadAd = translationX;
        c17616l.crashlytics = translationY;
        c17616l.amazon = i3;
        c17616l.purchase = i4;
        arrayList.add(c17616l);
        return true;
    }

    @Override // defpackage.AbstractC13735l
    public final void purchase() {
        ArrayList arrayList = this.firebase;
        ArrayList arrayList2 = this.vip;
        ArrayList arrayList3 = this.smaato;
        ArrayList arrayList4 = this.remoteconfig;
        ArrayList arrayList5 = this.subs;
        ArrayList arrayList6 = this.admob;
        ArrayList arrayList7 = this.isPro;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C17616l c17616l = (C17616l) arrayList7.get(size);
            View view = c17616l.yandex.yandex;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            crashlytics(c17616l.yandex);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            crashlytics((metrica) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            metrica metricaVar = (metrica) arrayList5.get(size3);
            metricaVar.yandex.setAlpha(1.0f);
            crashlytics(metricaVar);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            C3989l c3989l = (C3989l) arrayList.get(size4);
            metrica metricaVar2 = c3989l.yandex;
            if (metricaVar2 != null) {
                firebase(c3989l, metricaVar2);
            }
            metrica metricaVar3 = c3989l.loadAd;
            if (metricaVar3 != null) {
                firebase(c3989l, metricaVar3);
            }
        }
        arrayList.clear();
        if (billing()) {
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    C17616l c17616l2 = (C17616l) arrayList8.get(size6);
                    View view2 = c17616l2.yandex.yandex;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    crashlytics(c17616l2.yandex);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList4.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    metrica metricaVar4 = (metrica) arrayList9.get(size8);
                    metricaVar4.yandex.setAlpha(1.0f);
                    crashlytics(metricaVar4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList3.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C3989l c3989l2 = (C3989l) arrayList10.get(size10);
                    metrica metricaVar5 = c3989l2.yandex;
                    if (metricaVar5 != null) {
                        firebase(c3989l2, metricaVar5);
                    }
                    metrica metricaVar6 = c3989l2.loadAd;
                    if (metricaVar6 != null) {
                        firebase(c3989l2, metricaVar6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList2.remove(arrayList10);
                    }
                }
            }
            admob(this.adcel);
            admob(this.startapp);
            admob(this.metrica);
            admob(this.ads);
            ArrayList arrayList11 = this.loadAd;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                arrayList11.get(0).getClass();
                C18725l.loadAd();
            }
        }
    }

    public final void smaato(metrica metricaVar) {
        if (subscription == null) {
            subscription = new ValueAnimator().getInterpolator();
        }
        metricaVar.yandex.animate().setInterpolator(subscription);
        amazon(metricaVar);
    }

    public final void subs() {
        if (billing()) {
            return;
        }
        ArrayList arrayList = this.loadAd;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            C18725l.loadAd();
        }
    }

    @Override // defpackage.AbstractC13735l
    public final boolean yandex(metrica metricaVar, metrica metricaVar2, C13279l c13279l, C13279l c13279l2) {
        int i;
        int i2;
        int i3 = c13279l.yandex;
        int i4 = c13279l.loadAd;
        if (metricaVar2.adcel()) {
            int i5 = c13279l.yandex;
            i2 = c13279l.loadAd;
            i = i5;
        } else {
            i = c13279l2.yandex;
            i2 = c13279l2.loadAd;
        }
        if (metricaVar == metricaVar2) {
            return mopub(metricaVar, i3, i4, i, i2);
        }
        View view = metricaVar.yandex;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        smaato(metricaVar);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = metricaVar2.yandex;
        smaato(metricaVar2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.firebase;
        C3989l c3989l = new C3989l();
        c3989l.yandex = metricaVar;
        c3989l.loadAd = metricaVar2;
        c3989l.crashlytics = i3;
        c3989l.amazon = i4;
        c3989l.purchase = i;
        c3989l.billing = i2;
        arrayList.add(c3989l);
        return true;
    }
}
