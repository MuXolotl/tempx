package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٌٍؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8672l {
    public static final C2494l yandex = new C2494l("androidx.media3.session.MediaLibraryService", (Bundle) null);

    public static C16616l amazon(C16616l c16616l, C16616l c16616l2) {
        if (c16616l != null) {
            C4094l c4094l = c16616l.yandex;
            if (c16616l2 != null) {
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i = 0; i < c4094l.yandex.size(); i++) {
                    if (c16616l2.yandex(c4094l.loadAd(i))) {
                        int iLoadAd = c4094l.loadAd(i);
                        AbstractC12442l.subscription(!false);
                        sparseBooleanArray.append(iLoadAd, true);
                    }
                }
                AbstractC12442l.subscription(!false);
                return new C16616l(new C4094l(sparseBooleanArray));
            }
        }
        return C16616l.loadAd;
    }

    public static void billing(InterfaceC9814l interfaceC9814l, C9896l c9896l) {
        int i = c9896l.loadAd;
        long j = c9896l.crashlytics;
        AbstractC1186l abstractC1186l = c9896l.yandex;
        if (i == -1) {
            if (interfaceC9814l.mo2779l(20)) {
                interfaceC9814l.mo2769l(abstractC1186l);
                return;
            } else {
                if (abstractC1186l.isEmpty()) {
                    return;
                }
                interfaceC9814l.mo2767l((C2427l) abstractC1186l.get(0));
                return;
            }
        }
        if (interfaceC9814l.mo2779l(20)) {
            interfaceC9814l.mo2781l(c9896l.loadAd, j, abstractC1186l);
        } else {
            if (abstractC1186l.isEmpty()) {
                return;
            }
            interfaceC9814l.metrica((C2427l) abstractC1186l.get(0), j);
        }
    }

    public static long crashlytics(C1908l c1908l, long j, long j2, long j3) {
        C9009l c9009l = c1908l.crashlytics;
        C9009l c9009l2 = c1908l.crashlytics;
        boolean z = c9009l.equals(C9009l.smaato) || j2 < c9009l2.crashlytics;
        if (c1908l.ad) {
            if (z || j == -9223372036854775807L) {
                if (j3 == -9223372036854775807L) {
                    j3 = SystemClock.elapsedRealtime() - c9009l2.crashlytics;
                }
                long j4 = c9009l2.yandex.billing + ((long) (j3 * c1908l.mopub.yandex));
                long j5 = c9009l2.amazon;
                return j5 != -9223372036854775807L ? Math.min(j4, j5) : j4;
            }
        } else if (z || j == -9223372036854775807L) {
            return c9009l2.yandex.billing;
        }
        return j;
    }

    public static int loadAd(long j, long j2) {
        if (j == -9223372036854775807L || j2 == -9223372036854775807L) {
            return 0;
        }
        if (j2 == 0) {
            return 100;
        }
        return AbstractC15323l.isPro(AbstractC15323l.m3963default(j, j2), 0, 100);
    }

    public static ArrayList mopub(List list) {
        ArrayList arrayList = new ArrayList();
        Parcel parcelObtain = Parcel.obtain();
        for (int i = 0; i < list.size(); i++) {
            try {
                Parcelable parcelable = (Parcelable) list.get(i);
                parcelObtain.writeParcelable(parcelable, 0);
                if (parcelObtain.dataSize() >= 262144) {
                    break;
                }
                arrayList.add(parcelable);
            } catch (Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        parcelObtain.recycle();
        return arrayList;
    }

    public static C1908l purchase(C1908l c1908l, C1908l c1908l2, C3508l c3508l, C16616l c16616l, boolean z, C12962l c12962l) {
        C1908l c1908lLoadAd;
        C1047l c1047l;
        boolean z2;
        if (c3508l.yandex && c16616l.yandex(17)) {
            AbstractC10759l abstractC10759l = c1908l.isPro;
            AbstractC5641l.purchase("Invalid PlayerInfo update, old index: " + c1908l.crashlytics.yandex.loadAd + " (count=" + abstractC10759l.metrica() + "), new index = " + c1908l2.crashlytics.yandex.loadAd + ", sent from " + c12962l.yandex.mopub() + ", interface version=" + c12962l.yandex.billing(), abstractC10759l.startapp() || c1908l2.crashlytics.yandex.loadAd < abstractC10759l.metrica());
            c1908lLoadAd = c1908l2.smaato(abstractC10759l);
        } else {
            c1908lLoadAd = c1908l2;
        }
        if (c3508l.loadAd && c16616l.yandex(30)) {
            c1908lLoadAd = c1908lLoadAd.loadAd(c1908l.f4366throws);
        }
        if (!z || c1908l2.vip != 0.0f) {
            return c1908lLoadAd;
        }
        float f = c1908l.metrica;
        C14723l c14723l = c1908lLoadAd.yandex;
        int i = c1908lLoadAd.loadAd;
        C9009l c9009l = c1908lLoadAd.crashlytics;
        C4262l c4262l = c1908lLoadAd.amazon;
        C4262l c4262l2 = c1908lLoadAd.purchase;
        int i2 = c1908lLoadAd.billing;
        C1372l c1372l = c1908lLoadAd.mopub;
        int i3 = c1908lLoadAd.admob;
        boolean z3 = c1908lLoadAd.subs;
        AbstractC10759l abstractC10759l2 = c1908lLoadAd.isPro;
        int i4 = c1908lLoadAd.firebase;
        C15074l c15074l = c1908lLoadAd.smaato;
        C3852l c3852l = c1908lLoadAd.remoteconfig;
        float f2 = c1908lLoadAd.vip;
        int i5 = c1908lLoadAd.startapp;
        C13736l c13736l = c1908lLoadAd.adcel;
        C16684l c16684l = c1908lLoadAd.ads;
        C2848l c2848l = c1908lLoadAd.subscription;
        int i6 = c1908lLoadAd.tapsense;
        boolean z4 = c1908lLoadAd.Signature;
        boolean z5 = c1908lLoadAd.license;
        int i7 = c1908lLoadAd.pro;
        boolean z6 = c1908lLoadAd.ad;
        boolean z7 = c1908lLoadAd.advert;
        int i8 = c1908lLoadAd.isVip;
        int i9 = c1908lLoadAd.signatures;
        C3852l c3852l2 = c1908lLoadAd.premium;
        long j = c1908lLoadAd.applovin;
        long j2 = c1908lLoadAd.appmetrica;
        long j3 = c1908lLoadAd.inmobi;
        C1047l c1047l2 = c1908lLoadAd.f4366throws;
        C4970l c4970l = c1908lLoadAd.f4365package;
        if (!abstractC10759l2.startapp()) {
            c1047l = c1047l2;
            if (c9009l.yandex.loadAd >= abstractC10759l2.metrica()) {
                z2 = false;
            }
            AbstractC12442l.subscription(z2);
            return new C1908l(c14723l, i, c9009l, c4262l, c4262l2, i2, c1372l, i3, z3, c15074l, abstractC10759l2, i4, c3852l, f2, f, c13736l, i5, c16684l, c2848l, i6, z4, z5, i7, i8, i9, z6, z7, c3852l2, j, j2, j3, c1047l, c4970l);
        }
        c1047l = c1047l2;
        z2 = true;
        AbstractC12442l.subscription(z2);
        return new C1908l(c14723l, i, c9009l, c4262l, c4262l2, i2, c1372l, i3, z3, c15074l, abstractC10759l2, i4, c3852l, f2, f, c13736l, i5, c16684l, c2848l, i6, z4, z5, i7, i8, i9, z6, z7, c3852l2, j, j2, j3, c1047l, c4970l);
    }

    public static boolean yandex(C9009l c9009l, C9009l c9009l2) {
        C4262l c4262l = c9009l.yandex;
        int i = c4262l.loadAd;
        C4262l c4262l2 = c9009l2.yandex;
        return i == c4262l2.loadAd && c4262l.purchase == c4262l2.purchase && c4262l.admob == c4262l2.admob && c4262l.subs == c4262l2.subs;
    }
}
