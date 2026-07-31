package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؒ٘ٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1120l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0205l f3072l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3073l;

    public /* synthetic */ C1120l(C0205l c0205l, int i) {
        this.f3073l = i;
        this.f3072l = c0205l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC18212l interfaceC18212l;
        List list;
        InterfaceC18212l interfaceC18212l2;
        C8896l c8896l;
        C8896l c8896l2;
        int i;
        InterfaceC18212l interfaceC18212l3;
        List list2;
        InterfaceC18212l interfaceC18212lCrashlytics;
        int[] iArr;
        C18329l c18329l;
        List list3;
        C8896l c8896lLoadAd;
        boolean z;
        long j;
        int iNextIndex;
        InterfaceC2262l interfaceC2262l;
        int i2 = this.f3073l;
        int i3 = 1;
        C0205l c0205l = this.f3072l;
        switch (i2) {
            case 0:
                C1187l c1187l = (C1187l) c0205l.f1174l.getValue();
                return new C1187l(c1187l != null ? c1187l.yandex : 9205357640488583168L);
            case 1:
                C1187l c1187l2 = (C1187l) c0205l.f1167l.getValue();
                return new C1187l(c1187l2 != null ? c1187l2.yandex : 9205357640488583168L);
            case 2:
                c0205l.smaato();
                return Unit.INSTANCE;
            case 3:
                C11611l c11611l = c0205l.f1163l;
                c0205l.f1155l.getValue();
                Unit unit = Unit.INSTANCE;
                if (c0205l.subs() != null && (interfaceC18212l = c0205l.f1170l) != null && interfaceC18212l.mopub()) {
                    ArrayList arrayListPurchase = c11611l.purchase(c0205l.remoteconfig());
                    ArrayList arrayList = new ArrayList(arrayListPurchase.size());
                    int size = arrayListPurchase.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        C18329l c18329l2 = (C18329l) arrayListPurchase.get(i4);
                        C3242l c3242l = (C3242l) c11611l.yandex().purchase(c18329l2.yandex);
                        C8195l c8195l = c3242l != null ? new C8195l(c18329l2, c3242l) : null;
                        if (c8195l != null) {
                            arrayList.add(c8195l);
                        }
                    }
                    int size2 = arrayList.size();
                    int i5 = 2;
                    List listRemoteconfig = arrayList;
                    listRemoteconfig = arrayList;
                    if (size2 != 0 && size2 != 1) {
                        listRemoteconfig = AbstractC14055l.remoteconfig(AbstractC16901l.m4231native(arrayList), AbstractC16901l.m4214continue(arrayList));
                    }
                    if (!listRemoteconfig.isEmpty()) {
                        boolean zIsEmpty = listRemoteconfig.isEmpty();
                        C8896l c8896l3 = AbstractC2044l.yandex;
                        if (zIsEmpty) {
                            interfaceC18212l2 = interfaceC18212l;
                            c8896l2 = c8896l3;
                            c8896l = c8896l2;
                        } else {
                            int size3 = listRemoteconfig.size();
                            int i6 = 0;
                            float fMin = Float.POSITIVE_INFINITY;
                            float fMin2 = Float.POSITIVE_INFINITY;
                            float fMax = Float.NEGATIVE_INFINITY;
                            float fMax2 = Float.NEGATIVE_INFINITY;
                            while (i6 < size3) {
                                C8195l c8195l2 = (C8195l) list.get(i6);
                                C18329l c18329l3 = (C18329l) c8195l2.f17098l;
                                C3242l c3242l2 = (C3242l) c8195l2.f17097l;
                                int i7 = c3242l2.yandex.loadAd;
                                int i8 = c3242l2.loadAd.loadAd;
                                if (i7 == i8 || (interfaceC18212lCrashlytics = c18329l3.crashlytics()) == null) {
                                    list = listRemoteconfig;
                                    list = listRemoteconfig;
                                    i = size3;
                                    interfaceC18212l3 = interfaceC18212l;
                                    list2 = list;
                                } else {
                                    int iMin = Math.min(i7, i8);
                                    int iMax = Math.max(i7, i8) - i3;
                                    if (iMin == iMax) {
                                        list = listRemoteconfig;
                                        iArr = new int[i3];
                                        iArr[0] = iMin;
                                    } else {
                                        list = listRemoteconfig;
                                        int[] iArr2 = new int[i5];
                                        iArr2[0] = iMin;
                                        iArr2[i3] = iMax;
                                        iArr = iArr2;
                                    }
                                    int length = iArr.length;
                                    float fMin3 = Float.POSITIVE_INFINITY;
                                    int i9 = 0;
                                    float fMin4 = Float.POSITIVE_INFINITY;
                                    float fMax3 = Float.NEGATIVE_INFINITY;
                                    float fMax4 = Float.NEGATIVE_INFINITY;
                                    List list4 = list;
                                    while (i9 < length) {
                                        int i10 = iArr[i9];
                                        int i11 = size3;
                                        C0327l c0327l = (C0327l) c18329l3.crashlytics.invoke();
                                        C8896l c8896l4 = C8896l.purchase;
                                        if (c0327l == null) {
                                            c18329l = c18329l3;
                                            list3 = list4;
                                        } else {
                                            c18329l = c18329l3;
                                            int length2 = c0327l.yandex.yandex.f7563l.length();
                                            list3 = list4;
                                            if (length2 >= 1) {
                                                list3 = list3;
                                                c8896lLoadAd = c0327l.loadAd(AbstractC8576l.purchase(i10, 0, length2 - 1));
                                            }
                                            fMin3 = Math.min(fMin3, c8896lLoadAd.yandex);
                                            fMin4 = Math.min(fMin4, c8896lLoadAd.loadAd);
                                            fMax3 = Math.max(fMax3, c8896lLoadAd.crashlytics);
                                            fMax4 = Math.max(fMax4, c8896lLoadAd.amazon);
                                            i9++;
                                            size3 = i11;
                                            c18329l3 = c18329l;
                                            list4 = list3;
                                        }
                                        list3 = list3;
                                        c8896lLoadAd = c8896l4;
                                        fMin3 = Math.min(fMin3, c8896lLoadAd.yandex);
                                        fMin4 = Math.min(fMin4, c8896lLoadAd.loadAd);
                                        fMax3 = Math.max(fMax3, c8896lLoadAd.crashlytics);
                                        fMax4 = Math.max(fMax4, c8896lLoadAd.amazon);
                                        i9++;
                                        size3 = i11;
                                        c18329l3 = c18329l;
                                        list4 = list3;
                                    }
                                    i = size3;
                                    list2 = list4;
                                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin4)) & 4294967295L) | (((long) Float.floatToRawIntBits(fMin3)) << 32);
                                    long jFloatToRawIntBits2 = Float.floatToRawIntBits(fMax3);
                                    interfaceC18212l3 = interfaceC18212l;
                                    long jFloatToRawIntBits3 = ((long) Float.floatToRawIntBits(fMax4)) & 4294967295L;
                                    long jMo2593throws = interfaceC18212l3.mo2593throws(interfaceC18212lCrashlytics, jFloatToRawIntBits);
                                    long jMo2593throws2 = interfaceC18212l3.mo2593throws(interfaceC18212lCrashlytics, jFloatToRawIntBits3 | (jFloatToRawIntBits2 << 32));
                                    fMin = Math.min(fMin, Float.intBitsToFloat((int) (jMo2593throws >> 32)));
                                    fMin2 = Math.min(fMin2, Float.intBitsToFloat((int) (jMo2593throws & 4294967295L)));
                                    fMax = Math.max(fMax, Float.intBitsToFloat((int) (jMo2593throws2 >> 32)));
                                    fMax2 = Math.max(fMax2, Float.intBitsToFloat((int) (jMo2593throws2 & 4294967295L)));
                                }
                                i6++;
                                c8896l3 = c8896l3;
                                interfaceC18212l = interfaceC18212l3;
                                size3 = i;
                                list = list2;
                                i5 = 2;
                                i3 = 1;
                            }
                            list = listRemoteconfig;
                            interfaceC18212l2 = interfaceC18212l;
                            c8896l = c8896l3;
                            c8896l2 = new C8896l(fMin, fMin2, fMax, fMax2);
                        }
                        if (!c8896l2.equals(c8896l)) {
                            C8896l c8896lIsPro = AbstractC2044l.admob(interfaceC18212l2).isPro(c8896l2);
                            if (c8896lIsPro.crashlytics - c8896lIsPro.yandex >= 0.0f && c8896lIsPro.amazon - c8896lIsPro.loadAd >= 0.0f) {
                                C8896l c8896lVip = c8896lIsPro.vip(interfaceC18212l2.mo2591strictfp(0L));
                                float f = c8896lVip.amazon;
                                C4707l c4707l = AbstractC1848l.yandex;
                                return C8896l.loadAd(c8896lVip, 0.0f, 0.0f, f + 100.0f, 7);
                            }
                        }
                    }
                }
                return null;
            case 4:
                C0205l c0205l2 = this.f3072l;
                c0205l2.startapp(true);
                c0205l2.f1161l.setValue(null);
                c0205l2.f1165l.setValue(null);
                c0205l2.f1175l = null;
                if (c0205l2.f1164l && c0205l2.firebase()) {
                    C10700l c10700l = new C10700l();
                    C10700l c10700l2 = new C10700l();
                    C17078l c17078l = new C17078l();
                    C11611l c11611l2 = c0205l2.f1163l;
                    ArrayList arrayListPurchase2 = c11611l2.purchase(c0205l2.remoteconfig());
                    ListIterator listIterator = arrayListPurchase2.listIterator(arrayListPurchase2.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            j = 0;
                            C3242l c3242l3 = (C3242l) c11611l2.yandex().purchase(((C18329l) listIterator.previous()).yandex);
                            if (c3242l3 != null && c3242l3.yandex.loadAd != c3242l3.loadAd.loadAd) {
                                iNextIndex = listIterator.nextIndex();
                            }
                        } else {
                            j = 0;
                            iNextIndex = -1;
                        }
                    }
                    if (iNextIndex != -1) {
                        int size4 = arrayListPurchase2.size();
                        int i12 = 0;
                        while (i12 < size4) {
                            C18329l c18329l4 = (C18329l) arrayListPurchase2.get(i12);
                            C3242l c3242l4 = (C3242l) c11611l2.yandex().purchase(c18329l4.yandex);
                            if (c3242l4 != null) {
                                C3625l c3625lPurchase = c18329l4.purchase();
                                long jLoadAd = AbstractC2296l.loadAd(c3242l4.yandex.loadAd, c3242l4.loadAd.loadAd);
                                i3 = i12 < iNextIndex ? 0 : 1;
                                long j2 = c18329l4.yandex;
                                if (i3 != 0) {
                                    c10700l.f21708l = c3625lPurchase;
                                    c10700l2.f21708l = new C12814l(jLoadAd);
                                    c17078l.f33243l = j2;
                                }
                            } else {
                                i12++;
                            }
                        }
                    }
                    Object obj = c10700l.f21708l;
                    if (obj == null || c10700l2.f21708l == null || c17078l.f33243l == j || ((CharSequence) obj).length() <= 0 || (interfaceC2262l = c0205l2.f1159l) == null) {
                        z = false;
                    } else {
                        z = false;
                        AbstractC10999l.mopub(interfaceC2262l, null, 0, new C8036l(c0205l2, c10700l, c10700l2, c17078l, null, 4), 3);
                    }
                } else {
                    z = false;
                }
                c0205l2.f1164l = z;
                return Unit.INSTANCE;
            case 5:
                c0205l.purchase();
                if (c0205l.isPro()) {
                    c0205l.smaato();
                }
                return Unit.INSTANCE;
            case 6:
                return Boolean.valueOf((c0205l.f1176l && c0205l.isPro()) ? false : true);
            default:
                C11611l c11611l3 = c0205l.f1163l;
                ArrayList arrayListPurchase3 = c11611l3.purchase(c0205l.remoteconfig());
                if (!arrayListPurchase3.isEmpty()) {
                    C18730l c18730l = AbstractC17774l.yandex;
                    C18730l c18730l2 = new C18730l();
                    int size5 = arrayListPurchase3.size();
                    C3242l c3242l5 = null;
                    C3242l c3242l6 = null;
                    for (int i13 = 0; i13 < size5; i13++) {
                        C18329l c18329l5 = (C18329l) arrayListPurchase3.get(i13);
                        C3242l c3242lAmazon = c18329l5.amazon();
                        if (c3242lAmazon != null) {
                            if (c3242l5 == null) {
                                c3242l5 = c3242lAmazon;
                            }
                            long j3 = c18329l5.yandex;
                            int iCrashlytics = c18730l2.crashlytics(j3);
                            Object[] objArr = c18730l2.crashlytics;
                            Object obj2 = objArr[iCrashlytics];
                            c18730l2.loadAd[iCrashlytics] = j3;
                            objArr[iCrashlytics] = c3242lAmazon;
                            c3242l6 = c3242lAmazon;
                        }
                    }
                    if (c18730l2.purchase != 0) {
                        if (c3242l5 != c3242l6) {
                            c3242l5 = new C3242l(c3242l5.yandex, c3242l6.loadAd, false);
                        }
                        c11611l3.firebase.setValue(c18730l2);
                        c0205l.f1169l.invoke(c3242l5);
                        c0205l.f1175l = null;
                        C6523l.loadAd(c0205l.f1160l);
                        c0205l.startapp(true);
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
