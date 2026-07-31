package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lّۗؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12782l implements InterfaceC18384l {
    public final String yandex;

    public C12782l(String str) {
        this.yandex = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12782l) {
            return AbstractC8576l.yandex(this.yandex, ((C12782l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    @Override // defpackage.InterfaceC16243l
    public final C14329l loadAd() {
        List listPurchase;
        String strSubstring;
        String strSubstring2 = this.yandex;
        int length = strSubstring2.length();
        C2580l c2580l = C2580l.f5619l;
        if (length == 0) {
            listPurchase = c2580l;
        } else {
            C10227l c10227lAdmob = AbstractC14055l.admob();
            String strSubstring3 = "";
            if (AbstractC3230l.purchase(strSubstring2.charAt(0))) {
                int length2 = strSubstring2.length();
                int i = 0;
                while (true) {
                    if (i >= length2) {
                        strSubstring = strSubstring2;
                        break;
                    }
                    if (!AbstractC3230l.purchase(strSubstring2.charAt(i))) {
                        strSubstring = strSubstring2.substring(0, i);
                        break;
                    }
                    i++;
                }
                c10227lAdmob.add(new C6994l(Collections.singletonList(new C0868l(strSubstring))));
                int length3 = strSubstring2.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length3) {
                        strSubstring2 = "";
                        break;
                    }
                    if (!AbstractC3230l.purchase(strSubstring2.charAt(i2))) {
                        strSubstring2 = strSubstring2.substring(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (strSubstring2.length() > 0) {
                if (AbstractC3230l.purchase(strSubstring2.charAt(strSubstring2.length() - 1))) {
                    for (int iM3350volatile = AbstractC12024l.m3350volatile(strSubstring2); -1 < iM3350volatile; iM3350volatile--) {
                        if (!AbstractC3230l.purchase(strSubstring2.charAt(iM3350volatile))) {
                            strSubstring3 = strSubstring2.substring(0, iM3350volatile + 1);
                            break;
                        }
                    }
                    c10227lAdmob.add(new C15699l(strSubstring3));
                    for (int iM3350volatile2 = AbstractC12024l.m3350volatile(strSubstring2); -1 < iM3350volatile2; iM3350volatile2--) {
                        if (!AbstractC3230l.purchase(strSubstring2.charAt(iM3350volatile2))) {
                            strSubstring2 = strSubstring2.substring(iM3350volatile2 + 1);
                            break;
                        }
                    }
                    c10227lAdmob.add(new C6994l(Collections.singletonList(new C0868l(strSubstring2))));
                } else {
                    c10227lAdmob.add(new C15699l(strSubstring2));
                }
            }
            listPurchase = AbstractC14055l.purchase(c10227lAdmob);
        }
        return new C14329l(listPurchase, c2580l);
    }

    public final String toString() {
        return AbstractC2812l.tapsense(new StringBuilder("ConstantFormatStructure("), this.yandex, ')');
    }

    @Override // defpackage.InterfaceC16243l
    public final C1094l yandex() {
        return new C1094l();
    }
}
