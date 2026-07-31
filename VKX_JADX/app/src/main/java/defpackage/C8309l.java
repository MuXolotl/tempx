package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

/* JADX INFO: renamed from: lً۠ؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8309l implements Iterable, InterfaceC2356l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C8309l f17203l = new C8309l(new String[0]);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String[] f17204l;

    public C8309l(String[] strArr) {
        this.f17204l = strArr;
    }

    public final TreeMap admob() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i = 0; i < size; i++) {
            String lowerCase = billing(i).toLowerCase(Locale.US);
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(firebase(i));
        }
        return treeMap;
    }

    public final String amazon(String str) {
        String[] strArr = this.f17204l;
        int length = strArr.length - 2;
        int iAmazon = AbstractC17764l.amazon(length, 0, -2);
        if (iAmazon > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iAmazon) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String billing(int i) {
        String str = (String) AbstractC8669l.m2418throw(i * 2, this.f17204l);
        if (str != null) {
            return str;
        }
        C18262l.adcel(AbstractC12589l.appmetrica("name[", i, ']'));
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8309l) {
            return Arrays.equals(this.f17204l, ((C8309l) obj).f17204l);
        }
        return false;
    }

    public final String firebase(int i) {
        String str = (String) AbstractC8669l.m2418throw((i * 2) + 1, this.f17204l);
        if (str != null) {
            return str;
        }
        C18262l.adcel(AbstractC12589l.appmetrica("value[", i, ']'));
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17204l);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        C8195l[] c8195lArr = new C8195l[size];
        for (int i = 0; i < size; i++) {
            c8195lArr[i] = new C8195l(billing(i), firebase(i));
        }
        return new C11521l(1, c8195lArr);
    }

    public final C16543l mopub() {
        C16543l c16543l = new C16543l((byte) 0, 13);
        AbstractC3984l.pro((ArrayList) c16543l.f32482l, this.f17204l);
        return c16543l;
    }

    public final int size() {
        return this.f17204l.length / 2;
    }

    public final List smaato(String str) {
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(billing(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(firebase(i));
            }
        }
        List listUnmodifiableList = arrayList != null ? DesugarCollections.unmodifiableList(arrayList) : null;
        return listUnmodifiableList == null ? C2580l.f5619l : listUnmodifiableList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strBilling = billing(i);
            String strFirebase = firebase(i);
            sb.append(strBilling);
            sb.append(": ");
            if (AbstractC7712l.firebase(strBilling)) {
                strFirebase = "██";
            }
            sb.append(strFirebase);
            sb.append("\n");
        }
        return sb.toString();
    }
}
