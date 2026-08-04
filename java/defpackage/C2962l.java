package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: lؔۡؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2962l implements InterfaceC3588l {
    public static final List amazon;
    public final ArrayList crashlytics;
    public final Set loadAd;
    public final String[] yandex;

    static {
        String strM4210case = AbstractC16901l.m4210case(AbstractC14055l.remoteconfig('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List listRemoteconfig = AbstractC14055l.remoteconfig(strM4210case.concat("/Any"), strM4210case.concat("/Nothing"), strM4210case.concat("/Unit"), strM4210case.concat("/Throwable"), strM4210case.concat("/Number"), strM4210case.concat("/Byte"), strM4210case.concat("/Double"), strM4210case.concat("/Float"), strM4210case.concat("/Int"), strM4210case.concat("/Long"), strM4210case.concat("/Short"), strM4210case.concat("/Boolean"), strM4210case.concat("/Char"), strM4210case.concat("/CharSequence"), strM4210case.concat("/String"), strM4210case.concat("/Comparable"), strM4210case.concat("/Enum"), strM4210case.concat("/Array"), strM4210case.concat("/ByteArray"), strM4210case.concat("/DoubleArray"), strM4210case.concat("/FloatArray"), strM4210case.concat("/IntArray"), strM4210case.concat("/LongArray"), strM4210case.concat("/ShortArray"), strM4210case.concat("/BooleanArray"), strM4210case.concat("/CharArray"), strM4210case.concat("/Cloneable"), strM4210case.concat("/Annotation"), strM4210case.concat("/collections/Iterable"), strM4210case.concat("/collections/MutableIterable"), strM4210case.concat("/collections/Collection"), strM4210case.concat("/collections/MutableCollection"), strM4210case.concat("/collections/List"), strM4210case.concat("/collections/MutableList"), strM4210case.concat("/collections/Set"), strM4210case.concat("/collections/MutableSet"), strM4210case.concat("/collections/Map"), strM4210case.concat("/collections/MutableMap"), strM4210case.concat("/collections/Map.Entry"), strM4210case.concat("/collections/MutableMap.MutableEntry"), strM4210case.concat("/collections/Iterator"), strM4210case.concat("/collections/MutableIterator"), strM4210case.concat("/collections/ListIterator"), strM4210case.concat("/collections/MutableListIterator"));
        amazon = listRemoteconfig;
        C14297l c14297lM4228l = AbstractC16901l.m4228l(listRemoteconfig);
        int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(c14297lM4228l, 10));
        if (iFirebase < 16) {
            iFirebase = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iFirebase);
        Iterator it = c14297lM4228l.iterator();
        while (true) {
            C14596l c14596l = (C14596l) it;
            if (!c14596l.f28578l.hasNext()) {
                return;
            }
            C1143l c1143l = (C1143l) c14596l.next();
            linkedHashMap.put((String) c1143l.loadAd, Integer.valueOf(c1143l.yandex));
        }
    }

    public C2962l(C3186l c3186l, String[] strArr) {
        List list = c3186l.f6845l;
        Set setM4229l = list.isEmpty() ? C5746l.f12138l : AbstractC16901l.m4229l(list);
        List<C8732l> list2 = c3186l.f6846l;
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (C8732l c8732l : list2) {
            int i = c8732l.f17966l;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(c8732l);
            }
        }
        arrayList.trimToSize();
        this.yandex = strArr;
        this.loadAd = setM4229l;
        this.crashlytics = arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    @Override // defpackage.InterfaceC3588l
    public final String getString(int i) {
        String strM1035native;
        C8732l c8732l = (C8732l) this.crashlytics.get(i);
        int i2 = c8732l.f17969l;
        if ((i2 & 4) == 4) {
            Object obj = c8732l.f17972l;
            if (obj instanceof String) {
                strM1035native = (String) obj;
            } else {
                AbstractC7735l abstractC7735l = (AbstractC7735l) obj;
                String strAd = abstractC7735l.ad();
                if (abstractC7735l.remoteconfig()) {
                    c8732l.f17972l = strAd;
                }
                strM1035native = strAd;
            }
        } else if ((i2 & 2) == 2) {
            List list = amazon;
            int size = list.size();
            int i3 = c8732l.f17973l;
            if (i3 < 0 || i3 >= size) {
                strM1035native = this.yandex[i];
            } else {
                strM1035native = (String) list.get(i3);
            }
        } else {
            strM1035native = this.yandex[i];
        }
        if (c8732l.f17967l.size() >= 2) {
            List list2 = c8732l.f17967l;
            Integer num = (Integer) list2.get(0);
            Integer num2 = (Integer) list2.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= strM1035native.length()) {
                strM1035native = strM1035native.substring(num.intValue(), num2.intValue());
            }
        }
        if (c8732l.f17975l.size() >= 2) {
            List list3 = c8732l.f17975l;
            strM1035native = strM1035native.replace((char) ((Integer) list3.get(0)).intValue(), (char) ((Integer) list3.get(1)).intValue());
        }
        EnumC8965l enumC8965l = c8732l.f17976l;
        if (enumC8965l == null) {
            enumC8965l = EnumC8965l.NONE;
        }
        int iOrdinal = enumC8965l.ordinal();
        if (iOrdinal == 0) {
            return strM1035native;
        }
        if (iOrdinal == 1) {
            return strM1035native.replace('$', '.');
        }
        if (iOrdinal != 2) {
            C18725l.billing();
            return null;
        }
        if (strM1035native.length() >= 2) {
            strM1035native = AbstractC1757l.m1035native(1, 1, strM1035native);
        }
        return strM1035native.replace('$', '.');
    }

    @Override // defpackage.InterfaceC3588l
    public final boolean loadAd(int i) {
        return this.loadAd.contains(Integer.valueOf(i));
    }

    @Override // defpackage.InterfaceC3588l
    public final String yandex(int i) {
        return getString(i);
    }
}
