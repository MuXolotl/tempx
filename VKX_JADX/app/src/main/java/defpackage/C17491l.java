package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: renamed from: lٗۢٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17491l extends Cgoto {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public long f34074l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public long[] f34075l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public long[] f34076l;

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public static String m4392l(C13143l c13143l) {
        int iM3567synchronized = c13143l.m3567synchronized();
        int i = c13143l.loadAd;
        c13143l.m3568throw(iM3567synchronized);
        return new String(c13143l.yandex, i, iM3567synchronized);
    }

    /* JADX INFO: renamed from: lًٔۘ, reason: contains not printable characters */
    public static HashMap m4393l(C13143l c13143l) {
        int iInmobi = c13143l.inmobi();
        HashMap map = new HashMap(iInmobi);
        for (int i = 0; i < iInmobi; i++) {
            String strM4392l = m4392l(c13143l);
            Serializable serializableM4394l = m4394l(c13143l.signatures(), c13143l);
            if (serializableM4394l != null) {
                map.put(strM4392l, serializableM4394l);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: lٕؖؔ, reason: contains not printable characters */
    public static Serializable m4394l(int i, C13143l c13143l) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(c13143l.Signature()));
        }
        if (i == 1) {
            return Boolean.valueOf(c13143l.signatures() == 1);
        }
        if (i == 2) {
            return m4392l(c13143l);
        }
        if (i != 3) {
            if (i == 8) {
                return m4393l(c13143l);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(c13143l.Signature()));
                c13143l.m3568throw(2);
                return date;
            }
            int iInmobi = c13143l.inmobi();
            ArrayList arrayList = new ArrayList(iInmobi);
            for (int i2 = 0; i2 < iInmobi; i2++) {
                Serializable serializableM4394l = m4394l(c13143l.signatures(), c13143l);
                if (serializableM4394l != null) {
                    arrayList.add(serializableM4394l);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strM4392l = m4392l(c13143l);
            int iSignatures = c13143l.signatures();
            if (iSignatures == 9) {
                return map;
            }
            Serializable serializableM4394l2 = m4394l(iSignatures, c13143l);
            if (serializableM4394l2 != null) {
                map.put(strM4392l, serializableM4394l2);
            }
        }
    }
}
