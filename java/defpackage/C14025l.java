package defpackage;

import java.io.File;
import java.util.ArrayList;

/* JADX INFO: renamed from: lًٓۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14025l implements Comparable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final String f27330l = File.separator;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C3844l f27331l;

    public C14025l(C3844l c3844l) {
        this.f27331l = c3844l;
    }

    public final C14025l amazon(C14025l c14025l) {
        C3844l c3844l = c14025l.f27331l;
        int iYandex = billing.yandex(this);
        C3844l c3844l2 = this.f27331l;
        C14025l c14025l2 = iYandex == -1 ? null : new C14025l(c3844l2.startapp(0, iYandex));
        int iYandex2 = billing.yandex(c14025l);
        if (!AbstractC8576l.yandex(c14025l2, iYandex2 == -1 ? null : new C14025l(c3844l.startapp(0, iYandex2)))) {
            C18073l.tapsense("Paths of different roots cannot be relative to each other: ", this, " and ", c14025l);
            return null;
        }
        ArrayList arrayListYandex = yandex();
        ArrayList arrayListYandex2 = c14025l.yandex();
        int iMin = Math.min(arrayListYandex.size(), arrayListYandex2.size());
        int i = 0;
        while (i < iMin && AbstractC8576l.yandex(arrayListYandex.get(i), arrayListYandex2.get(i))) {
            i++;
        }
        if (i == iMin && c3844l2.purchase() == c3844l.purchase()) {
            return C6162l.adcel(".", false);
        }
        if (arrayListYandex2.subList(i, arrayListYandex2.size()).indexOf(billing.purchase) != -1) {
            C18073l.tapsense("Impossible relative path to resolve: ", this, " and ", c14025l);
            return null;
        }
        if (AbstractC8576l.yandex(c3844l, billing.amazon)) {
            return this;
        }
        C0869l c0869l = new C0869l();
        C3844l c3844lCrashlytics = billing.crashlytics(c14025l);
        if (c3844lCrashlytics == null && (c3844lCrashlytics = billing.crashlytics(this)) == null) {
            c3844lCrashlytics = billing.billing(f27330l);
        }
        int size = arrayListYandex2.size();
        for (int i2 = i; i2 < size; i2++) {
            c0869l.m708import(billing.purchase);
            c0869l.m708import(c3844lCrashlytics);
        }
        int size2 = arrayListYandex.size();
        while (i < size2) {
            c0869l.m708import((C3844l) arrayListYandex.get(i));
            c0869l.m708import(c3844lCrashlytics);
            i++;
        }
        return billing.amazon(c0869l, false);
    }

    public final Character billing() {
        C3844l c3844l = billing.yandex;
        C3844l c3844l2 = this.f27331l;
        if (C3844l.admob(c3844l2, c3844l) != -1 || c3844l2.purchase() < 2 || c3844l2.isPro(1) != 58) {
            return null;
        }
        char cIsPro = (char) c3844l2.isPro(0);
        if (('a' > cIsPro || cIsPro >= '{') && ('A' > cIsPro || cIsPro >= '[')) {
            return null;
        }
        return Character.valueOf(cIsPro);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f27331l.compareTo(((C14025l) obj).f27331l);
    }

    public final C14025l crashlytics() {
        C3844l c3844l = billing.amazon;
        C3844l c3844l2 = this.f27331l;
        if (AbstractC8576l.yandex(c3844l2, c3844l)) {
            return null;
        }
        C3844l c3844l3 = billing.yandex;
        if (AbstractC8576l.yandex(c3844l2, c3844l3)) {
            return null;
        }
        C3844l c3844l4 = billing.loadAd;
        if (AbstractC8576l.yandex(c3844l2, c3844l4)) {
            return null;
        }
        C3844l c3844l5 = billing.purchase;
        int iPurchase = c3844l2.purchase();
        byte[] bArr = c3844l5.f7953l;
        if (c3844l2.remoteconfig(iPurchase - bArr.length, bArr.length, c3844l5) && (c3844l2.purchase() == 2 || c3844l2.remoteconfig(c3844l2.purchase() - 3, 1, c3844l3) || c3844l2.remoteconfig(c3844l2.purchase() - 3, 1, c3844l4))) {
            return null;
        }
        int iSmaato = C3844l.smaato(c3844l2, c3844l3);
        if (iSmaato == -1) {
            iSmaato = C3844l.smaato(c3844l2, c3844l4);
        }
        if (iSmaato == 2 && billing() != null) {
            if (c3844l2.purchase() == 3) {
                return null;
            }
            return new C14025l(C3844l.adcel(c3844l2, 0, 3, 1));
        }
        if (iSmaato == 1 && c3844l2.remoteconfig(0, c3844l4.purchase(), c3844l4)) {
            return null;
        }
        if (iSmaato != -1 || billing() == null) {
            if (iSmaato == -1) {
                return new C14025l(c3844l);
            }
            return iSmaato == 0 ? new C14025l(C3844l.adcel(c3844l2, 0, 1, 1)) : new C14025l(C3844l.adcel(c3844l2, 0, iSmaato, 1));
        }
        if (c3844l2.purchase() == 2) {
            return null;
        }
        return new C14025l(C3844l.adcel(c3844l2, 0, 2, 1));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C14025l) && AbstractC8576l.yandex(((C14025l) obj).f27331l, this.f27331l);
    }

    public final int hashCode() {
        return this.f27331l.hashCode();
    }

    public final String loadAd() {
        C3844l c3844l = billing.yandex;
        C3844l c3844lAdcel = this.f27331l;
        int iSmaato = C3844l.smaato(c3844lAdcel, c3844l);
        if (iSmaato == -1) {
            iSmaato = C3844l.smaato(c3844lAdcel, billing.loadAd);
        }
        if (iSmaato != -1) {
            c3844lAdcel = C3844l.adcel(c3844lAdcel, iSmaato + 1, 0, 2);
        } else if (billing() != null && c3844lAdcel.purchase() == 2) {
            c3844lAdcel = C3844l.f7950l;
        }
        return c3844lAdcel.tapsense();
    }

    public final C14025l purchase(String str) {
        C0869l c0869l = new C0869l();
        c0869l.m718l(str);
        return billing.loadAd(this, billing.amazon(c0869l, false), false);
    }

    public final File toFile() {
        return new File(this.f27331l.tapsense());
    }

    public final String toString() {
        return this.f27331l.tapsense();
    }

    public final ArrayList yandex() {
        ArrayList arrayList = new ArrayList();
        int iYandex = billing.yandex(this);
        C3844l c3844l = this.f27331l;
        if (iYandex == -1) {
            iYandex = 0;
        } else if (iYandex < c3844l.purchase() && c3844l.isPro(iYandex) == 92) {
            iYandex++;
        }
        int iPurchase = c3844l.purchase();
        int i = iYandex;
        while (iYandex < iPurchase) {
            if (c3844l.isPro(iYandex) == 47 || c3844l.isPro(iYandex) == 92) {
                arrayList.add(c3844l.startapp(i, iYandex));
                i = iYandex + 1;
            }
            iYandex++;
        }
        if (i < c3844l.purchase()) {
            arrayList.add(c3844l.startapp(i, c3844l.purchase()));
        }
        return arrayList;
    }
}
