package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lٟ٘ۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18186l {
    public static final C18186l adcel;
    public static final int admob;
    public static final ArrayList ads;
    public static final int amazon;
    public static final int billing;
    public static final C13772l crashlytics = new C13772l(29);
    public static final int firebase;
    public static final int isPro;
    public static final C18186l metrica;
    public static final int mopub;
    public static final int purchase;
    public static final C18186l remoteconfig;
    public static final int smaato;
    public static final C18186l startapp;
    public static final int subs;
    public static final ArrayList subscription;
    public static final C18186l vip;
    public final int loadAd;
    public final List yandex;

    static {
        int i = amazon;
        int i2 = i << 1;
        purchase = i;
        int i3 = i << 2;
        billing = i2;
        int i4 = i << 3;
        mopub = i3;
        int i5 = i << 4;
        admob = i4;
        int i6 = i << 5;
        subs = i5;
        isPro = i6;
        amazon = i << 7;
        int i7 = (i << 6) - 1;
        firebase = i7;
        int i8 = i | i2 | i3;
        smaato = i8;
        remoteconfig = new C18186l(i7);
        vip = new C18186l(i5 | i6);
        new C18186l(i);
        new C18186l(i2);
        new C18186l(i3);
        metrica = new C18186l(i8);
        new C18186l(i4);
        startapp = new C18186l(i5);
        adcel = new C18186l(i6);
        new C18186l(i2 | i5 | i6);
        Field[] fields = C18186l.class.getFields();
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            C18186l c18186l = obj instanceof C18186l ? (C18186l) obj : null;
            C12114l c12114l = c18186l != null ? new C12114l(c18186l.loadAd, field2.getName()) : null;
            if (c12114l != null) {
                arrayList2.add(c12114l);
            }
        }
        ads = arrayList2;
        Field[] fields2 = C18186l.class.getFields();
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (AbstractC8576l.yandex(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            int iIntValue = ((Integer) field4.get(null)).intValue();
            C12114l c12114l2 = iIntValue == ((-iIntValue) & iIntValue) ? new C12114l(iIntValue, field4.getName()) : null;
            if (c12114l2 != null) {
                arrayList5.add(c12114l2);
            }
        }
        subscription = arrayList5;
    }

    public C18186l(int i, List list) {
        this.yandex = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i &= ~((AbstractC7857l) it.next()).yandex();
        }
        this.loadAd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C18186l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C18186l c18186l = (C18186l) obj;
        return AbstractC8576l.yandex(this.yandex, c18186l.yandex) && this.loadAd == c18186l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + this.loadAd;
    }

    public final String toString() throws IOException {
        Object next;
        Iterator it = ads.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C12114l) next).yandex != this.loadAd);
        C12114l c12114l = (C12114l) next;
        String strM4210case = c12114l != null ? c12114l.loadAd : null;
        if (strM4210case == null) {
            ArrayList arrayList = new ArrayList();
            for (C12114l c12114l2 : subscription) {
                String str = yandex(c12114l2.yandex) ? c12114l2.loadAd : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            strM4210case = AbstractC16901l.m4210case(arrayList, " | ", null, null, null, 62);
        }
        return AbstractC0653l.subscription(AbstractC5020l.isVip("DescriptorKindFilter(", strM4210case, ", "), this.yandex, ')');
    }

    public final boolean yandex(int i) {
        return (this.loadAd & i) != 0;
    }

    public /* synthetic */ C18186l(int i) {
        this(i, C2580l.f5619l);
    }
}
