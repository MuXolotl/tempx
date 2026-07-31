package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: lٍۙؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9783l {
    public final ArrayList yandex;

    public C9783l(C10282l c10282l, C10282l c10282l2) throws Throwable {
        float f;
        Throwable th;
        float f2;
        List listRemoteconfig;
        Iterator it;
        float f3;
        int i;
        int i2;
        float fBilling;
        int i3;
        C8195l c8195lYandex;
        C8195l c8195lYandex2;
        float fAdmob;
        int i4 = 5;
        C7893l c7893lMopub = AbstractC9334l.mopub(new C16936l(i4), c10282l);
        C7893l c7893lMopub2 = AbstractC9334l.mopub(new C16936l(i4), c10282l2);
        List list = c7893lMopub.f16464l;
        List list2 = c7893lMopub2.f16464l;
        List list3 = AbstractC16703l.yandex;
        C10227l c10227lAdmob = AbstractC14055l.admob();
        int size = list.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            if (((C11964l) list.get(i6)).loadAd instanceof C3524l) {
                c10227lAdmob.add(list.get(i6));
            }
        }
        C10227l c10227lPurchase = AbstractC14055l.purchase(c10227lAdmob);
        C10227l c10227lAdmob2 = AbstractC14055l.admob();
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            if (((C11964l) list2.get(i7)).loadAd instanceof C3524l) {
                c10227lAdmob2.add(list2.get(i7));
            }
        }
        C10227l c10227lPurchase2 = AbstractC14055l.purchase(c10227lAdmob2);
        C10227l c10227lAdmob3 = AbstractC14055l.admob();
        ListIterator listIterator = c10227lPurchase.listIterator(0);
        while (true) {
            C13376l c13376l = (C13376l) listIterator;
            if (!c13376l.hasNext()) {
                break;
            }
            C11964l c11964l = (C11964l) c13376l.next();
            ListIterator listIterator2 = c10227lPurchase2.listIterator(0);
            while (true) {
                C13376l c13376l2 = (C13376l) listIterator2;
                if (c13376l2.hasNext()) {
                    C11964l c11964l2 = (C11964l) c13376l2.next();
                    AbstractC9278l abstractC9278l = c11964l.loadAd;
                    AbstractC9278l abstractC9278l2 = c11964l2.loadAd;
                    if ((abstractC9278l instanceof C3524l) && (abstractC9278l2 instanceof C3524l) && ((C3524l) abstractC9278l).loadAd != ((C3524l) abstractC9278l2).loadAd) {
                        fAdmob = Float.MAX_VALUE;
                    } else {
                        long jSubs = AbstractC10433l.subs(AbstractC16703l.yandex(abstractC9278l), AbstractC16703l.yandex(abstractC9278l2));
                        fAdmob = (AbstractC10433l.admob(jSubs) * AbstractC10433l.admob(jSubs)) + (AbstractC10433l.mopub(jSubs) * AbstractC10433l.mopub(jSubs));
                    }
                    if (fAdmob != Float.MAX_VALUE) {
                        c10227lAdmob3.add(new C4825l(fAdmob, c11964l, c11964l2));
                    }
                }
            }
        }
        List listM4243this = AbstractC16901l.m4243this(AbstractC14055l.purchase(c10227lAdmob3), new C13617l(21));
        char c = 2;
        float f4 = 1.0f;
        int i8 = 1;
        if (!listM4243this.isEmpty()) {
            if (listM4243this.size() == 1) {
                C4825l c4825l = (C4825l) AbstractC16901l.m4231native(listM4243this);
                float f5 = c4825l.loadAd.yandex;
                float f6 = c4825l.crashlytics.yandex;
                listRemoteconfig = AbstractC14055l.remoteconfig(new C8195l(Float.valueOf(f5), Float.valueOf(f6)), new C8195l(Float.valueOf((f5 + 0.5f) % 1.0f), Float.valueOf((f6 + 0.5f) % 1.0f)));
            } else {
                ArrayList arrayList = new ArrayList();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                Iterator it2 = listM4243this.iterator();
                while (it2.hasNext()) {
                    C4825l c4825l2 = (C4825l) it2.next();
                    C11964l c11964l3 = c4825l2.loadAd;
                    C11964l c11964l4 = c4825l2.crashlytics;
                    float f7 = c11964l3.yandex;
                    char c2 = c;
                    float f8 = c11964l4.yandex;
                    if (linkedHashSet.contains(c11964l3) || linkedHashSet2.contains(c11964l4)) {
                        it = it2;
                        f3 = f4;
                    } else {
                        Float fValueOf = Float.valueOf(f7);
                        int size3 = arrayList.size();
                        f3 = f4;
                        AbstractC14055l.adcel(arrayList.size(), size3);
                        int i9 = size3 - i8;
                        int i10 = i5;
                        while (true) {
                            if (i10 > i9) {
                                i = i8;
                                i2 = -(i10 + 1);
                                break;
                            }
                            i2 = (i10 + i9) >>> 1;
                            i = i8;
                            int iCrashlytics = AbstractC2920l.crashlytics((Float) ((C8195l) arrayList.get(i2)).f17098l, fValueOf);
                            if (iCrashlytics < 0) {
                                i10 = i2 + 1;
                            } else if (iCrashlytics <= 0) {
                                break;
                            } else {
                                i9 = i2 - 1;
                            }
                            i8 = i;
                        }
                        if (i2 >= 0) {
                            C8339l.metrica("There can't be two features with the same progress");
                            throw null;
                        }
                        int i11 = (-i2) - 1;
                        int size4 = arrayList.size();
                        int i12 = i;
                        if (size4 >= i12) {
                            C8195l c8195l = (C8195l) arrayList.get(((i11 + size4) - i12) % size4);
                            float fFloatValue = ((Number) c8195l.f17098l).floatValue();
                            float fFloatValue2 = ((Number) c8195l.f17097l).floatValue();
                            C8195l c8195l2 = (C8195l) arrayList.get(i11 % size4);
                            it = it2;
                            float fFloatValue3 = ((Number) c8195l2.f17098l).floatValue();
                            float fFloatValue4 = ((Number) c8195l2.f17097l).floatValue();
                            if (AbstractC7236l.mopub(f7, fFloatValue) >= 1.0E-4f && AbstractC7236l.mopub(f7, fFloatValue3) >= 1.0E-4f && AbstractC7236l.mopub(f8, fFloatValue2) >= 1.0E-4f && AbstractC7236l.mopub(f8, fFloatValue4) >= 1.0E-4f) {
                                if (size4 > 1) {
                                    if (fFloatValue4 >= fFloatValue2) {
                                        if (fFloatValue2 > f8 || f8 > fFloatValue4) {
                                        }
                                    } else if (f8 >= fFloatValue2 || f8 <= fFloatValue4) {
                                    }
                                }
                            }
                        } else {
                            it = it2;
                        }
                        arrayList.add(i11, new C8195l(Float.valueOf(f7), Float.valueOf(f8)));
                        linkedHashSet.add(c11964l3);
                        linkedHashSet2.add(c11964l4);
                    }
                    c = c2;
                    f4 = f3;
                    it2 = it;
                    i5 = 0;
                    i8 = 1;
                }
                f = f4;
                th = null;
                f2 = 1.0E-4f;
                listRemoteconfig = arrayList;
            }
            C8195l[] c8195lArr = (C8195l[]) listRemoteconfig.toArray(new C8195l[0]);
            C18712l c18712l = new C18712l((C8195l[]) Arrays.copyOf(c8195lArr, c8195lArr.length));
            C4974l c4974l = c18712l.yandex;
            C4974l c4974l2 = c18712l.loadAd;
            fBilling = AbstractC7236l.billing(c4974l, c4974l2, 0.0f);
            ArrayList arrayList2 = c7893lMopub2.f16465l;
            if (0.0f <= fBilling || fBilling > f) {
                C8339l.metrica("Cutting point is expected to be between 0 and 1");
                throw th;
            }
            if (fBilling < f2) {
                i3 = 1;
            } else {
                Iterator it3 = arrayList2.iterator();
                int i13 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i13 = -1;
                        break;
                    }
                    C15565l c15565l = (C15565l) it3.next();
                    float f9 = c15565l.crashlytics;
                    if (fBilling <= c15565l.amazon && f9 <= fBilling) {
                        break;
                    } else {
                        i13++;
                    }
                }
                C8195l c8195lYandex3 = ((C15565l) arrayList2.get(i13)).yandex(fBilling);
                C15565l c15565l2 = (C15565l) c8195lYandex3.f17098l;
                ArrayList arrayListMetrica = AbstractC14055l.metrica(((C15565l) c8195lYandex3.f17097l).yandex);
                int size5 = arrayList2.size();
                for (int i14 = 1; i14 < size5; i14++) {
                    arrayListMetrica.add(((C15565l) arrayList2.get((i14 + i13) % arrayList2.size())).yandex);
                }
                arrayListMetrica.add(c15565l2.yandex);
                C4974l c4974l3 = new C4974l(arrayList2.size() + 2);
                int size6 = arrayList2.size() + 2;
                int i15 = 0;
                while (i15 < size6) {
                    c4974l3.yandex(i15 == 0 ? 0.0f : i15 == arrayList2.size() + 1 ? f : AbstractC12481l.crashlytics(((C15565l) arrayList2.get(((i13 + i15) - 1) % arrayList2.size())).amazon - fBilling));
                    i15++;
                }
                i3 = 1;
                C10227l c10227lAdmob4 = AbstractC14055l.admob();
                int size7 = list2.size();
                for (int i16 = 0; i16 < size7; i16++) {
                    c10227lAdmob4.add(new C11964l(AbstractC12481l.crashlytics(((C11964l) list2.get(i16)).yandex - fBilling), ((C11964l) list2.get(i16)).loadAd));
                }
                c7893lMopub2 = new C7893l(c7893lMopub2.f16466l, AbstractC14055l.purchase(c10227lAdmob4), arrayListMetrica, c4974l3);
            }
            ArrayList arrayList3 = new ArrayList();
            C15565l c15565l3 = (C15565l) AbstractC16901l.m4220for(0, c7893lMopub);
            C15565l c15565l4 = (C15565l) AbstractC16901l.m4220for(0, c7893lMopub2);
            int i17 = i3;
            int i18 = i17;
            while (c15565l3 != null && c15565l4 != null) {
                float f10 = i18 == c7893lMopub.f16465l.size() ? f : c15565l3.amazon;
                float fBilling2 = i17 == c7893lMopub2.f16465l.size() ? f : AbstractC7236l.billing(c4974l2, c4974l, AbstractC12481l.crashlytics(c15565l4.amazon + fBilling));
                float fMin = Math.min(f10, fBilling2);
                float f11 = 1.0E-6f + fMin;
                if (f10 > f11) {
                    c8195lYandex = c15565l3.yandex(fMin);
                } else {
                    C8195l c8195l3 = new C8195l(c15565l3, AbstractC16901l.m4220for(i18, c7893lMopub));
                    i18++;
                    c8195lYandex = c8195l3;
                }
                C15565l c15565l5 = (C15565l) c8195lYandex.f17098l;
                c15565l3 = (C15565l) c8195lYandex.f17097l;
                if (fBilling2 > f11) {
                    c8195lYandex2 = c15565l4.yandex(AbstractC12481l.crashlytics(AbstractC7236l.billing(c4974l, c4974l2, fMin) - fBilling));
                } else {
                    C8195l c8195l4 = new C8195l(c15565l4, AbstractC16901l.m4220for(i17, c7893lMopub2));
                    i17++;
                    c8195lYandex2 = c8195l4;
                }
                C15565l c15565l6 = (C15565l) c8195lYandex2.f17098l;
                c15565l4 = (C15565l) c8195lYandex2.f17097l;
                arrayList3.add(new C8195l(c15565l5.yandex, c15565l6.yandex));
            }
            if (c15565l3 == null && c15565l4 == null) {
                this.yandex = arrayList3;
                return;
            } else {
                C8339l.metrica("Expected both Polygon's Cubic to be fully matched");
                throw th;
            }
        }
        listRemoteconfig = AbstractC16703l.yandex;
        f = 1.0f;
        th = null;
        f2 = 1.0E-4f;
        C8195l[] c8195lArr2 = (C8195l[]) listRemoteconfig.toArray(new C8195l[0]);
        C18712l c18712l2 = new C18712l((C8195l[]) Arrays.copyOf(c8195lArr2, c8195lArr2.length));
        C4974l c4974l4 = c18712l2.yandex;
        C4974l c4974l5 = c18712l2.loadAd;
        fBilling = AbstractC7236l.billing(c4974l4, c4974l5, 0.0f);
        ArrayList arrayList4 = c7893lMopub2.f16465l;
        if (0.0f <= fBilling) {
        }
        C8339l.metrica("Cutting point is expected to be between 0 and 1");
        throw th;
    }
}
