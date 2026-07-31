package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: renamed from: lؘؓ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5400l implements Comparator {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final ArrayList f11576l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static C5400l f11577l;

    static {
        ArrayList arrayList = new ArrayList();
        f11576l = arrayList;
        AbstractC5020l.premium(arrayList, "UFID", "TIT2", "TPE1", "TALB");
        AbstractC5020l.premium(arrayList, "TORY", "TCON", "TCOM", "TPE3");
        AbstractC5020l.premium(arrayList, "TIT1", "TRCK", "TYER", "TDAT");
        AbstractC5020l.premium(arrayList, "TIME", "TBPM", "TSRC", "TORY");
        AbstractC5020l.premium(arrayList, "TPE2", "TIT3", "USLT", "TXXX");
        AbstractC5020l.premium(arrayList, "WXXX", "WOAR", "WCOM", "WCOP");
        AbstractC5020l.premium(arrayList, "WOAF", "WORS", "WPAY", "WPUB");
        AbstractC5020l.premium(arrayList, "WCOM", "TEXT", "TMED", "IPLS");
        AbstractC5020l.premium(arrayList, "TLAN", "TSOT", "TDLY", "PCNT");
        AbstractC5020l.premium(arrayList, "POPM", "TPUB", "TSO2", "TSOC");
        AbstractC5020l.premium(arrayList, "TCMP", "TSOT", "TSOP", "TSOA");
        AbstractC5020l.premium(arrayList, "XSOT", "XSOP", "XSOA", "TSO2");
        AbstractC5020l.premium(arrayList, "TSOC", "COMM", "TRDA", "COMR");
        AbstractC5020l.premium(arrayList, "TCOP", "TENC", "ENCR", "EQUA");
        AbstractC5020l.premium(arrayList, "ETCO", "TOWN", "TFLT", "GRID");
        AbstractC5020l.premium(arrayList, "TSSE", "TKEY", "TLEN", "LINK");
        AbstractC5020l.premium(arrayList, "TSIZ", "MLLT", "TOPE", "TOFN");
        AbstractC5020l.premium(arrayList, "TOLY", "TOAL", "OWNE", "POSS");
        AbstractC5020l.premium(arrayList, "TRSN", "TRSO", "RBUF", "TPE4");
        AbstractC5020l.premium(arrayList, "RVRB", "TPOS", "SYLT", "SYTC");
        AbstractC5020l.premium(arrayList, "USER", "APIC", "PRIV", "MCDI");
        arrayList.add("AENC");
        arrayList.add("GEOB");
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        ArrayList arrayList = f11576l;
        int iIndexOf = arrayList.indexOf(str);
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        if (iIndexOf == -1) {
            iIndexOf = Integer.MAX_VALUE;
        }
        int iIndexOf2 = arrayList.indexOf(str2);
        if (iIndexOf2 != -1) {
            i = iIndexOf2;
        }
        return iIndexOf == i ? str.compareTo(str2) : iIndexOf - i;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return obj instanceof C5400l;
    }
}
