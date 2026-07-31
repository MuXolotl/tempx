package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: renamed from: lؙّٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6607l implements Comparator {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final ArrayList f13846l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static C6607l f13847l;

    static {
        ArrayList arrayList = new ArrayList();
        f13846l = arrayList;
        AbstractC5020l.premium(arrayList, "UFID", "TIT2", "TPE1", "TALB");
        AbstractC5020l.premium(arrayList, "TSOA", "TCON", "TCOM", "TPE3");
        AbstractC5020l.premium(arrayList, "TIT1", "TRCK", "TDRC", "TPE2");
        AbstractC5020l.premium(arrayList, "TBPM", "TSRC", "TSOT", "TIT3");
        AbstractC5020l.premium(arrayList, "USLT", "TXXX", "WXXX", "WOAR");
        AbstractC5020l.premium(arrayList, "WCOM", "WCOP", "WOAF", "WORS");
        AbstractC5020l.premium(arrayList, "WPAY", "WPUB", "WCOM", "TEXT");
        AbstractC5020l.premium(arrayList, "TMED", "TIPL", "TLAN", "TSOP");
        AbstractC5020l.premium(arrayList, "TDLY", "PCNT", "POPM", "TPUB");
        AbstractC5020l.premium(arrayList, "TSO2", "TSOC", "TCMP", "COMM");
        AbstractC5020l.premium(arrayList, "ASPI", "COMR", "TCOP", "TENC");
        AbstractC5020l.premium(arrayList, "TDEN", "ENCR", "EQU2", "ETCO");
        AbstractC5020l.premium(arrayList, "TOWN", "TFLT", "GRID", "TSSE");
        AbstractC5020l.premium(arrayList, "TKEY", "TLEN", "LINK", "TMOO");
        AbstractC5020l.premium(arrayList, "MLLT", "TMCL", "TOPE", "TDOR");
        AbstractC5020l.premium(arrayList, "TOFN", "TOLY", "TOAL", "OWNE");
        AbstractC5020l.premium(arrayList, "POSS", "TPRO", "TRSN", "TRSO");
        AbstractC5020l.premium(arrayList, "RBUF", "RVA2", "TDRL", "TPE4");
        AbstractC5020l.premium(arrayList, "RVRB", "SEEK", "TPOS", "TSST");
        AbstractC5020l.premium(arrayList, "SIGN", "SYLT", "SYTC", "TDTG");
        AbstractC5020l.premium(arrayList, "USER", "APIC", "PRIV", "MCDI");
        arrayList.add("AENC");
        arrayList.add("GEOB");
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        ArrayList arrayList = f13846l;
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
        return obj instanceof C6607l;
    }
}
