package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: lٓٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14299l {
    public boolean adcel;
    public final C11916l admob;
    public InterfaceC10376l ads;
    public final C5501l amazon;
    public final C5978l[] billing;
    public final InterfaceC14090l crashlytics;
    public final C17849l firebase;
    public final InterfaceC14090l loadAd;
    public Uri metrica;
    public final C6827l mopub;
    public final C16091l[] purchase;
    public boolean smaato;
    public Uri startapp;
    public final List subs;
    public C0456l vip;
    public final appmetrica yandex;
    public final C10975l isPro = new C10975l(12);
    public byte[] remoteconfig = AbstractC15323l.loadAd;
    public long subscription = -9223372036854775807L;

    public C14299l(appmetrica appmetricaVar, C6827l c6827l, C16091l[] c16091lArr, C5978l[] c5978lArr, C1770l c1770l, C7713l c7713l, C5501l c5501l, List list, C17849l c17849l) {
        this.yandex = appmetricaVar;
        this.mopub = c6827l;
        this.purchase = c16091lArr;
        this.billing = c5978lArr;
        this.amazon = c5501l;
        this.subs = list;
        this.firebase = c17849l;
        InterfaceC14090l interfaceC14090lPro = ((InterfaceC0587l) c1770l.f4179l).pro();
        this.loadAd = interfaceC14090lPro;
        if (c7713l != null) {
            interfaceC14090lPro.metrica(c7713l);
        }
        this.crashlytics = ((InterfaceC0587l) c1770l.f4179l).pro();
        this.admob = new C11916l("", c5978lArr);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < c16091lArr.length; i2++) {
            if ((c5978lArr[i2].billing & 16384) == 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        C11916l c11916l = this.admob;
        int[] iArrSubscription = AbstractC9966l.subscription(arrayList);
        C8569l c8569l = new C8569l(c11916l, iArrSubscription);
        C5978l c5978l = c11916l.amazon[iArrSubscription[0]];
        while (i < c8569l.loadAd) {
            if (c8569l.amazon[i] == c5978l) {
                c8569l.mopub = i;
                this.ads = c8569l;
            }
            i++;
        }
        i = -1;
        c8569l.mopub = i;
        this.ads = c8569l;
    }

    public static C12568l billing(C16272l c16272l, long j, int i) {
        long j2 = c16272l.firebase;
        AbstractC1186l abstractC1186l = c16272l.subscription;
        int i2 = (int) (j - j2);
        AbstractC1186l abstractC1186l2 = c16272l.ads;
        if (i2 == abstractC1186l2.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < abstractC1186l.size()) {
                return new C12568l((AbstractC10042l) abstractC1186l.get(i), j, i);
            }
            return null;
        }
        C4234l c4234l = (C4234l) abstractC1186l2.get(i2);
        if (i == -1) {
            return new C12568l(c4234l, j, -1);
        }
        if (i < c4234l.f8669l.size()) {
            return new C12568l((AbstractC10042l) c4234l.f8669l.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < abstractC1186l2.size()) {
            return new C12568l((AbstractC10042l) abstractC1186l2.get(i3), j + 1, -1);
        }
        if (abstractC1186l.isEmpty()) {
            return null;
        }
        return new C12568l((AbstractC10042l) abstractC1186l.get(0), j + 1, 0);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    public final int amazon(long j) {
        InterfaceC10376l interfaceC10376l = this.ads;
        int length = interfaceC10376l.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int iAdcel = interfaceC10376l.adcel(i2);
            if (interfaceC10376l.subs(i2, j)) {
                i++;
            } else {
                if (this.mopub.mopub(this.purchase[iAdcel], j)) {
                    i++;
                }
            }
        }
        return i;
    }

    public final int crashlytics(C7377l c7377l) {
        int i = c7377l.metrica;
        if (i == -1) {
            return 1;
        }
        C16272l c16272lAmazon = this.mopub.amazon(false, c7377l.remoteconfig);
        c16272lAmazon.getClass();
        AbstractC1186l abstractC1186l = c16272lAmazon.ads;
        int i2 = (int) (c7377l.isPro - c16272lAmazon.firebase);
        if (i2 < 0) {
            return 1;
        }
        AbstractC1186l abstractC1186l2 = i2 < abstractC1186l.size() ? ((C4234l) abstractC1186l.get(i2)).f8669l : c16272lAmazon.subscription;
        if (i >= abstractC1186l2.size()) {
            return 2;
        }
        C6823l c6823l = (C6823l) abstractC1186l2.get(i);
        if (c6823l.f14248l) {
            return 0;
        }
        return Objects.equals(Uri.parse(AbstractC12442l.premium(c16272lAmazon.yandex, c6823l.f20474l)), c7377l.loadAd.yandex) ? 1 : 2;
    }

    public final InterfaceC7405l[] loadAd(C7377l c7377l, long j) {
        List listUnmodifiableList;
        C14299l c14299l = this;
        C7377l c7377l2 = c7377l;
        int iLoadAd = c7377l2 == null ? -1 : c14299l.admob.loadAd(c7377l2.amazon);
        int length = c14299l.ads.length();
        InterfaceC7405l[] interfaceC7405lArr = new InterfaceC7405l[length];
        boolean z = false;
        int i = 0;
        while (i < length) {
            int iAdcel = c14299l.ads.adcel(i);
            Uri uriCrashlytics = c14299l.purchase[iAdcel].crashlytics();
            C6827l c6827l = c14299l.mopub;
            if (c6827l.admob(uriCrashlytics)) {
                C16272l c16272lAmazon = c6827l.amazon(z, uriCrashlytics);
                c16272lAmazon.getClass();
                long j2 = c16272lAmazon.admob - c6827l.f14262l;
                Pair pairPurchase = c14299l.purchase(c7377l2, iAdcel != iLoadAd ? true : z, c16272lAmazon, j2, j);
                long jLongValue = ((Long) pairPurchase.first).longValue();
                int iIntValue = ((Integer) pairPurchase.second).intValue();
                long j3 = c16272lAmazon.firebase;
                AbstractC1186l abstractC1186l = c16272lAmazon.subscription;
                AbstractC1186l abstractC1186l2 = c16272lAmazon.ads;
                int i2 = (int) (jLongValue - j3);
                if (i2 < 0 || abstractC1186l2.size() < i2) {
                    C9258l c9258l = AbstractC1186l.f3181l;
                    listUnmodifiableList = C13708l.f26763l;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i2 < abstractC1186l2.size()) {
                        if (iIntValue != -1) {
                            C4234l c4234l = (C4234l) abstractC1186l2.get(i2);
                            if (iIntValue == 0) {
                                arrayList.add(c4234l);
                            } else if (iIntValue < c4234l.f8669l.size()) {
                                AbstractC1186l abstractC1186l3 = c4234l.f8669l;
                                arrayList.addAll(abstractC1186l3.subList(iIntValue, abstractC1186l3.size()));
                            }
                            i2++;
                        }
                        arrayList.addAll(abstractC1186l2.subList(i2, abstractC1186l2.size()));
                        iIntValue = 0;
                    }
                    if (c16272lAmazon.vip != -9223372036854775807L) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < abstractC1186l.size()) {
                            arrayList.addAll(abstractC1186l.subList(iIntValue, abstractC1186l.size()));
                        }
                    }
                    listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
                }
                interfaceC7405lArr[i] = new C5426l(j2, listUnmodifiableList);
            } else {
                interfaceC7405lArr[i] = InterfaceC7405l.f15344extends;
            }
            i++;
            c14299l = this;
            c7377l2 = c7377l;
            z = false;
        }
        return interfaceC7405lArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C11286l mopub(Uri uri, int i, boolean z) {
        if (uri == null) {
            return null;
        }
        C10975l c10975l = this.isPro;
        byte[] bArr = (byte[]) ((C14558l) c10975l.f22121l).remove(uri);
        if (bArr != null) {
            return null;
        }
        C2432l c2432l = new C2432l(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1, null);
        C5978l c5978l = this.billing[i];
        int iSignature = this.ads.Signature();
        Object objAd = this.ads.ad();
        byte[] bArr2 = this.remoteconfig;
        C11286l c11286l = new C11286l(this.crashlytics, c2432l, 3, c5978l, iSignature, objAd, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = AbstractC15323l.loadAd;
        }
        c11286l.isPro = bArr2;
        return c11286l;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00b4  */
    public final Pair purchase(C7377l c7377l, boolean z, C16272l c16272l, long j, long j2) {
        int i;
        AbstractC1186l abstractC1186l;
        boolean z2 = true;
        if (c7377l != null) {
            long j3 = c7377l.isPro;
            int i2 = c7377l.metrica;
            if (!z) {
                if (!c7377l.f15303synchronized) {
                    return new Pair(Long.valueOf(j3), Integer.valueOf(i2));
                }
                if (i2 == -1) {
                    j3 = j3 != -1 ? j3 + 1 : -1L;
                }
                return new Pair(Long.valueOf(j3), Integer.valueOf(i2 != -1 ? i2 + 1 : -1));
            }
        }
        long j4 = c16272l.Signature;
        long j5 = c16272l.firebase;
        AbstractC1186l abstractC1186l2 = c16272l.subscription;
        AbstractC1186l abstractC1186l3 = c16272l.ads;
        long j6 = j + j4;
        long j7 = (c7377l == null || this.adcel) ? j2 : c7377l.mopub;
        if (!c16272l.metrica && j7 >= j6) {
            return new Pair(Long.valueOf(j5 + ((long) abstractC1186l3.size())), -1);
        }
        long j8 = j7 - j;
        Long lValueOf = Long.valueOf(j8);
        C6827l c6827l = this.mopub;
        if (c6827l.f14273l && c7377l != null) {
            z2 = false;
        }
        int iAmazon = AbstractC15323l.amazon(abstractC1186l3, lValueOf, z2);
        long j9 = ((long) iAmazon) + j5;
        if (!c6827l.f14273l) {
            return new Pair(Long.valueOf(j9), -1);
        }
        if (iAmazon < 0) {
            i = -1;
        } else {
            if (abstractC1186l3.isEmpty()) {
                abstractC1186l = abstractC1186l2;
            } else {
                C4234l c4234l = (C4234l) abstractC1186l3.get(iAmazon);
                if (j8 < c4234l.f20476l + c4234l.f20470l) {
                    abstractC1186l = c4234l.f8669l;
                } else {
                    abstractC1186l = abstractC1186l2;
                }
            }
            for (int i3 = 0; i3 < abstractC1186l.size(); i3++) {
                C6823l c6823l = (C6823l) abstractC1186l.get(i3);
                if (j8 < c6823l.f20476l + c6823l.f20470l) {
                    if (c6823l.f14249l) {
                        j9 += (abstractC1186l != abstractC1186l2 || abstractC1186l3.isEmpty()) ? 0L : 1L;
                        i = i3;
                    }
                }
            }
            i = -1;
        }
        return new Pair(Long.valueOf(j9), Integer.valueOf(i));
    }

    public final C13531l yandex(Uri uri) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C6827l c6827l = this.mopub;
        C16293l c16293l = (C16293l) c6827l.f14267l.get(uri);
        C16091l c16091l = c16293l != null ? c16293l.yandex : null;
        c16091l.getClass();
        HashMap map = c16091l.loadAd;
        int size = map.size();
        AbstractC10199l it = AbstractC8481l.ads(map.values()).iterator();
        int i = 0;
        while (it.hasNext()) {
            Uri uri2 = (Uri) it.next();
            C16293l c16293l2 = (C16293l) c6827l.f14267l.get(uri2);
            if (c16293l2 != null) {
                C16456l c16456l = (C16456l) AbstractC2812l.adcel(c16293l2.loadAd, uri2, uri2);
                c16456l.getClass();
                if (jElapsedRealtime <= c16456l.f32174l) {
                    i++;
                }
            }
        }
        return new C13531l(size, i, this.ads.length(), amazon(jElapsedRealtime));
    }
}
