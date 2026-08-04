package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: renamed from: lؙؒۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6196l extends AbstractC7454l {
    @Override // defpackage.AbstractC7454l
    /* JADX INFO: renamed from: lٕؖؔ, reason: contains not printable characters */
    public final int mo1968l(String str, String str2, C6096l c6096l, InterfaceC0015l interfaceC0015l) {
        String strMo2021apply = interfaceC0015l.mo2021apply(str);
        String strMo2021apply2 = interfaceC0015l.mo2021apply(str2);
        HashSet hashSet = new HashSet(Arrays.asList(strMo2021apply.split("\\s+")));
        HashSet hashSet2 = new HashSet(Arrays.asList(strMo2021apply2.split("\\s+")));
        HashSet hashSet3 = new HashSet(hashSet);
        hashSet3.retainAll(hashSet2);
        HashSet hashSet4 = new HashSet(hashSet);
        hashSet4.removeAll(hashSet2);
        HashSet hashSet5 = new HashSet(hashSet2);
        hashSet5.removeAll(hashSet);
        String strTrim = AbstractC17764l.admob(new ArrayList(hashSet3)).trim();
        StringBuilder sbAdvert = AbstractC5020l.advert(strTrim, " ");
        sbAdvert.append(AbstractC17764l.admob(new ArrayList(hashSet4)));
        String strTrim2 = sbAdvert.toString().trim();
        StringBuilder sbAdvert2 = AbstractC5020l.advert(strTrim, " ");
        sbAdvert2.append(AbstractC17764l.admob(new ArrayList(hashSet5)));
        String strTrim3 = sbAdvert2.toString().trim();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(c6096l.appmetrica(strTrim, strTrim2)));
        arrayList.add(Integer.valueOf(c6096l.appmetrica(strTrim, strTrim3)));
        arrayList.add(Integer.valueOf(c6096l.appmetrica(strTrim2, strTrim3)));
        return ((Integer) Collections.max(arrayList)).intValue();
    }
}
