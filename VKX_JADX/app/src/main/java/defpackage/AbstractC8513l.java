package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٌؚؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8513l {
    public static final C0824l yandex = new C0824l();

    public static final int amazon(boolean z, C13217l c13217l, int i) {
        return z ? ((C9696l) c13217l.remoteconfig.get(i)).advert : ((C9696l) c13217l.remoteconfig.get(i)).isVip;
    }

    public static final int crashlytics(InterfaceC14742l interfaceC14742l, String str) {
        int iLoadAd = loadAd(interfaceC14742l, str);
        if (iLoadAd >= 0) {
            return iLoadAd;
        }
        int columnCount = interfaceC14742l.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(interfaceC14742l.getColumnName(i));
        }
        C8876l.admob("Column '", str, "' does not exist. Available columns: [", AbstractC16901l.m4210case(arrayList, null, null, null, null, 63), 93);
        return 0;
    }

    public static final int loadAd(InterfaceC14742l interfaceC14742l, String str) {
        int columnCount = interfaceC14742l.getColumnCount();
        int i = 0;
        while (true) {
            if (i >= columnCount) {
                i = -1;
                break;
            }
            if (str.equals(interfaceC14742l.getColumnName(i))) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return i;
        }
        String strSmaato = AbstractC14814l.smaato('`', "`", str);
        int columnCount2 = interfaceC14742l.getColumnCount();
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount2) {
                i2 = -1;
                break;
            }
            if (strSmaato.equals(interfaceC14742l.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount3 = interfaceC14742l.getColumnCount();
            String strConcat = ".".concat(str);
            String strSmaato2 = AbstractC14814l.smaato('`', ".", str);
            for (int i3 = 0; i3 < columnCount3; i3++) {
                String columnName = interfaceC14742l.getColumnName(i3);
                if (columnName.length() >= str.length() + 2 && (AbstractC16648l.Signature(columnName, strConcat, false) || (columnName.charAt(0) == '`' && AbstractC16648l.Signature(columnName, strSmaato2, false)))) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static final float yandex(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
