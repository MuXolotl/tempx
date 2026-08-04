package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: lَٕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0963l {
    public static final C0772l loadAd;
    public static final Comparator[] yandex;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new C0323l(7, new C0323l(i == 0 ? C13617l.f26644l : C13617l.f26646l));
            i++;
        }
        yandex = comparatorArr;
        loadAd = C0772l.f2351l;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d0  */
    public static final ArrayList loadAd(C18666l c18666l, C3006l c3006l, C3006l c3006l2, List list) {
        int i;
        C16977l c16977l = AbstractC6903l.yandex;
        C16977l c16977l2 = new C16977l();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            yandex((C18666l) list.get(i2), arrayList, c3006l, c3006l2, c16977l2);
        }
        char c = c18666l.crashlytics.f7691l == EnumC9931l.f20222l ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int iSmaato = AbstractC14055l.smaato(arrayList);
        if (iSmaato >= 0) {
            int i3 = 0;
            while (true) {
                C18666l c18666l2 = (C18666l) arrayList.get(i3);
                if (i3 == 0) {
                    i = 0;
                    C8896l c8896lAdmob = c18666l2.admob();
                    C18666l[] c18666lArr = new C18666l[1];
                    c18666lArr[i] = c18666l2;
                    arrayList2.add(new C8195l(c8896lAdmob, AbstractC14055l.metrica(c18666lArr)));
                    break;
                }
                float f = c18666l2.admob().loadAd;
                float f2 = c18666l2.admob().amazon;
                boolean z = f >= f2;
                int iSmaato2 = AbstractC14055l.smaato(arrayList2);
                if (iSmaato2 >= 0) {
                    int i4 = 0;
                    while (true) {
                        C8896l c8896l = (C8896l) ((C8195l) arrayList2.get(i4)).f17098l;
                        i = 0;
                        float f3 = c8896l.loadAd;
                        float f4 = c8896l.amazon;
                        boolean z2 = f3 >= f4;
                        if (!z && !z2 && Math.max(f, f3) < Math.min(f2, f4)) {
                            arrayList2.set(i4, new C8195l(new C8896l(Math.max(c8896l.yandex, 0.0f), Math.max(c8896l.loadAd, f), Math.min(c8896l.crashlytics, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((C8195l) arrayList2.get(i4)).f17097l));
                            ((List) ((C8195l) arrayList2.get(i4)).f17097l).add(c18666l2);
                            break;
                        }
                        if (i4 != iSmaato2) {
                            i4++;
                        }
                    }
                } else {
                    i = 0;
                }
                C8896l c8896lAdmob2 = c18666l2.admob();
                C18666l[] c18666lArr2 = new C18666l[1];
                c18666lArr2[i] = c18666l2;
                arrayList2.add(new C8195l(c8896lAdmob2, AbstractC14055l.metrica(c18666lArr2)));
                break;
                if (i3 == iSmaato) {
                    break;
                }
                i3++;
            }
        } else {
            i = 0;
        }
        AbstractC3826l.Signature(C13617l.f26648l, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = yandex[c ^ 1];
        int size2 = arrayList2.size();
        for (int i5 = i; i5 < size2; i5++) {
            C8195l c8195l = (C8195l) arrayList2.get(i5);
            AbstractC3826l.Signature(comparator, (List) c8195l.f17097l);
            arrayList3.addAll((Collection) c8195l.f17097l);
        }
        AbstractC3826l.Signature(new C9933l(3, loadAd), arrayList3);
        int size3 = i;
        while (size3 <= AbstractC14055l.smaato(arrayList3)) {
            List list2 = (List) c16977l2.loadAd(((C18666l) arrayList3.get(size3)).billing);
            if (list2 != null) {
                if (((Boolean) c3006l2.invoke(arrayList3.get(size3))).booleanValue()) {
                    size3++;
                } else {
                    arrayList3.remove(size3);
                }
                arrayList3.addAll(size3, list2);
                size3 += list2.size();
            } else {
                size3++;
            }
        }
        return arrayList3;
    }

    public static final void yandex(C18666l c18666l, ArrayList arrayList, C3006l c3006l, C3006l c3006l2, C16977l c16977l) {
        C6264l c6264l = c18666l.amazon;
        Object objMopub = c6264l.f13225l.mopub(AbstractC0424l.vip);
        if (objMopub == null) {
            objMopub = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objMopub).booleanValue();
        if ((zBooleanValue || ((Boolean) c3006l2.invoke(c18666l)).booleanValue()) && ((Boolean) c3006l.invoke(c18666l)).booleanValue()) {
            arrayList.add(c18666l);
        }
        if (zBooleanValue) {
            c16977l.subs(c18666l.billing, loadAd(c18666l, c3006l, c3006l2, C18666l.isPro(7, c18666l)));
            return;
        }
        List listIsPro = C18666l.isPro(7, c18666l);
        int size = listIsPro.size();
        for (int i = 0; i < size; i++) {
            yandex((C18666l) listIsPro.get(i), arrayList, c3006l, c3006l2, c16977l);
        }
    }
}
