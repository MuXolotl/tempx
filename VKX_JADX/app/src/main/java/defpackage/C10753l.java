package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: renamed from: lُْؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10753l implements Comparator {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final ArrayList f21785l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static C10753l f21786l;

    static {
        ArrayList arrayList = new ArrayList();
        f21785l = arrayList;
        AbstractC5020l.premium(arrayList, "UFI", "TT2", "TP1", "TAL");
        AbstractC5020l.premium(arrayList, "TOR", "TCO", "TCM", "TPE");
        AbstractC5020l.premium(arrayList, "TT1", "TRK", "TYE", "TDA");
        AbstractC5020l.premium(arrayList, "TIM", "TBP", "TRC", "TOR");
        AbstractC5020l.premium(arrayList, "TP2", "TT3", "ULT", "TXX");
        AbstractC5020l.premium(arrayList, "WXX", "WAR", "WCM", "WCP");
        AbstractC5020l.premium(arrayList, "WAF", "WRS", "WPAY", "WPB");
        AbstractC5020l.premium(arrayList, "WCM", "TXT", "TMT", "IPL");
        AbstractC5020l.premium(arrayList, "TLA", "TST", "TDY", "CNT");
        AbstractC5020l.premium(arrayList, "POP", "TPB", "TS2", "TSC");
        AbstractC5020l.premium(arrayList, "TCP", "TST", "TSP", "TSA");
        AbstractC5020l.premium(arrayList, "TS2", "TSC", "COM", "TRD");
        AbstractC5020l.premium(arrayList, "TCR", "TEN", "EQU", "ETC");
        AbstractC5020l.premium(arrayList, "TFT", "TSS", "TKE", "TLE");
        AbstractC5020l.premium(arrayList, "LNK", "TSI", "MLL", "TOA");
        AbstractC5020l.premium(arrayList, "TOF", "TOL", "TOT", "BUF");
        AbstractC5020l.premium(arrayList, "TP4", "REV", "TPA", "SLT");
        AbstractC5020l.premium(arrayList, "STC", "PIC", "MCI", "CRA");
        arrayList.add("GEO");
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        ArrayList arrayList = f21785l;
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
        return obj instanceof C10753l;
    }
}
