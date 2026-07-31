package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lؓۙۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2090l {
    public static final C2090l crashlytics = new C2090l(0);
    public boolean loadAd;
    public final C16515l yandex = new C16515l(16);

    public C2090l(int i) {
        billing();
    }

    public static Object admob(C1718l c1718l, EnumC17998l enumC17998l) {
        switch (enumC17998l.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(c1718l.firebase()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(c1718l.isPro()));
            case 2:
                return Long.valueOf(c1718l.remoteconfig());
            case 3:
                return Long.valueOf(c1718l.remoteconfig());
            case 4:
                return Integer.valueOf(c1718l.smaato());
            case 5:
                return Long.valueOf(c1718l.firebase());
            case 6:
                return Integer.valueOf(c1718l.isPro());
            case 7:
                return Boolean.valueOf(c1718l.remoteconfig() != 0);
            case 8:
                int iSmaato = c1718l.smaato();
                int i = c1718l.loadAd;
                int i2 = c1718l.amazon;
                if (iSmaato > i - i2 || iSmaato <= 0) {
                    return iSmaato == 0 ? "" : new String(c1718l.subs(iSmaato), "UTF-8");
                }
                String str = new String(c1718l.yandex, i2, iSmaato, "UTF-8");
                c1718l.amazon += iSmaato;
                return str;
            case 9:
                C8339l.metrica("readPrimitiveField() cannot handle nested groups.");
                return null;
            case 10:
                C8339l.metrica("readPrimitiveField() cannot handle embedded messages.");
                return null;
            case 11:
                return c1718l.billing();
            case 12:
                return Integer.valueOf(c1718l.smaato());
            case 13:
                C8339l.metrica("readPrimitiveField() cannot handle enums.");
                return null;
            case 14:
                return Integer.valueOf(c1718l.isPro());
            case 15:
                return Long.valueOf(c1718l.firebase());
            case 16:
                int iSmaato2 = c1718l.smaato();
                return Integer.valueOf((-(iSmaato2 & 1)) ^ (iSmaato2 >>> 1));
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                long jRemoteconfig = c1718l.remoteconfig();
                return Long.valueOf((-(jRemoteconfig & 1)) ^ (jRemoteconfig >>> 1));
            default:
                C18073l.license("There is no way to get here, but the compiler thinks otherwise.");
                return null;
        }
    }

    public static int amazon(C7367l c7367l, Object obj) {
        EnumC17998l enumC17998l = c7367l.f15279l;
        int i = c7367l.f15280l;
        if (!c7367l.f15278l) {
            int iTapsense = C11522l.tapsense(i);
            if (enumC17998l == EnumC17998l.f35190l) {
                iTapsense *= 2;
            }
            return crashlytics(enumC17998l, obj) + iTapsense;
        }
        int iCrashlytics = 0;
        for (Object obj2 : (List) obj) {
            int iTapsense2 = C11522l.tapsense(i);
            if (enumC17998l == EnumC17998l.f35190l) {
                iTapsense2 *= 2;
            }
            iCrashlytics += crashlytics(enumC17998l, obj2) + iTapsense2;
        }
        return iCrashlytics;
    }

    public static int crashlytics(EnumC17998l enumC17998l, Object obj) {
        switch (enumC17998l.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return C11522l.subscription(((Long) obj).longValue());
            case 3:
                return C11522l.subscription(((Long) obj).longValue());
            case 4:
                return C11522l.metrica(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return C11522l.ads(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e) {
                    C18073l.Signature("UTF-8 not supported.", e);
                    return 0;
                }
            case 9:
                return ((AbstractC14080l) obj).crashlytics();
            case 10:
                return C11522l.adcel((AbstractC14080l) obj);
            case 11:
                if (obj instanceof AbstractC7735l) {
                    AbstractC7735l abstractC7735l = (AbstractC7735l) obj;
                    return abstractC7735l.size() + C11522l.ads(abstractC7735l.size());
                }
                byte[] bArr = (byte[]) obj;
                return C11522l.ads(bArr.length) + bArr.length;
            case 12:
                return C11522l.ads(((Integer) obj).intValue());
            case 13:
                return obj instanceof InterfaceC1421l ? C11522l.metrica(((InterfaceC1421l) obj).yandex()) : C11522l.metrica(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return C11522l.ads((iIntValue >> 31) ^ (iIntValue << 1));
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                long jLongValue = ((Long) obj).longValue();
                return C11522l.subscription((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                C18073l.license("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    public static void firebase(C11522l c11522l, EnumC17998l enumC17998l, Object obj) {
        switch (enumC17998l.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                c11522l.getClass();
                c11522l.m3119protected(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                c11522l.getClass();
                c11522l.m3128transient(Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                c11522l.m3111implements(((Long) obj).longValue());
                break;
            case 3:
                c11522l.m3111implements(((Long) obj).longValue());
                break;
            case 4:
                c11522l.m3113instanceof(((Integer) obj).intValue());
                break;
            case 5:
                c11522l.m3119protected(((Long) obj).longValue());
                break;
            case 6:
                c11522l.m3128transient(((Integer) obj).intValue());
                break;
            case 7:
                c11522l.m3125this(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 8:
                c11522l.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                c11522l.m3130while(bytes.length);
                c11522l.m3098break(bytes);
                break;
            case 9:
                c11522l.getClass();
                ((AbstractC14080l) obj).billing(c11522l);
                break;
            case 10:
                c11522l.m3108finally((AbstractC14080l) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC7735l)) {
                    byte[] bArr = (byte[]) obj;
                    c11522l.getClass();
                    c11522l.m3130while(bArr.length);
                    c11522l.m3098break(bArr);
                } else {
                    AbstractC7735l abstractC7735l = (AbstractC7735l) obj;
                    c11522l.getClass();
                    c11522l.m3130while(abstractC7735l.size());
                    c11522l.m3129try(abstractC7735l);
                }
                break;
            case 12:
                c11522l.m3130while(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof InterfaceC1421l)) {
                    c11522l.m3113instanceof(((Integer) obj).intValue());
                } else {
                    c11522l.m3113instanceof(((InterfaceC1421l) obj).yandex());
                }
                break;
            case 14:
                c11522l.m3128transient(((Integer) obj).intValue());
                break;
            case 15:
                c11522l.m3119protected(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c11522l.m3130while((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                long jLongValue = ((Long) obj).longValue();
                c11522l.m3111implements((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    public static void isPro(EnumC17998l enumC17998l, Object obj) {
        obj.getClass();
        boolean z = true;
        boolean z2 = false;
        switch (enumC17998l.f35194l.ordinal()) {
            case 0:
                z2 = obj instanceof Integer;
                break;
            case 1:
                z2 = obj instanceof Long;
                break;
            case 2:
                z2 = obj instanceof Float;
                break;
            case 3:
                z2 = obj instanceof Double;
                break;
            case 4:
                z2 = obj instanceof Boolean;
                break;
            case 5:
                z2 = obj instanceof String;
                break;
            case 6:
                if (!(obj instanceof AbstractC7735l) && !(obj instanceof byte[])) {
                    z = false;
                }
                z2 = z;
                break;
            case 7:
                if (!(obj instanceof Integer) && !(obj instanceof InterfaceC1421l)) {
                    z = false;
                }
                z2 = z;
                break;
            case 8:
                z2 = obj instanceof AbstractC14080l;
                break;
        }
        if (z2) {
            return;
        }
        C8339l.metrica("Wrong object type used with protocol message reflection.");
    }

    public static boolean purchase(Map.Entry entry) {
        C7367l c7367l = (C7367l) entry.getKey();
        if (c7367l.f15279l.f35194l != EnumC17173l.f33350l) {
            return true;
        }
        if (c7367l.f15278l) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!((AbstractC14080l) it.next()).yandex()) {
                }
            }
            return true;
        }
        Object value = entry.getValue();
        if (!(value instanceof AbstractC14080l)) {
            C8339l.metrica("Wrong object type used with protocol message reflection.");
            return false;
        }
        if (((AbstractC14080l) value).yandex()) {
            return true;
        }
        return false;
    }

    public final void billing() {
        if (this.loadAd) {
            return;
        }
        C16515l c16515l = this.yandex;
        if (!c16515l.f32286l) {
            for (int i = 0; i < c16515l.f32283l.size(); i++) {
                Map.Entry entry = (Map.Entry) c16515l.f32283l.get(i);
                if (((C7367l) entry.getKey()).f15278l) {
                    entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : c16515l.crashlytics()) {
                if (((C7367l) entry2.getKey()).f15278l) {
                    entry2.setValue(DesugarCollections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!c16515l.f32286l) {
            c16515l.f32282l = c16515l.f32282l.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(c16515l.f32282l);
            c16515l.f32286l = true;
        }
        this.loadAd = true;
    }

    /* JADX INFO: renamed from: loadAd, reason: merged with bridge method [inline-methods] */
    public final C2090l clone() {
        C16515l c16515l;
        C2090l c2090l = new C2090l();
        int i = 0;
        while (true) {
            c16515l = this.yandex;
            if (i >= c16515l.f32283l.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c16515l.f32283l.get(i);
            c2090l.subs((C7367l) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : c16515l.crashlytics()) {
            c2090l.subs((C7367l) entry2.getKey(), entry2.getValue());
        }
        return c2090l;
    }

    public final void mopub(Map.Entry entry) {
        C7367l c7367l = (C7367l) entry.getKey();
        Object value = entry.getValue();
        boolean z = c7367l.f15278l;
        C16515l c16515l = this.yandex;
        if (z) {
            Object arrayList = c16515l.get(c7367l);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            c16515l.put(c7367l, arrayList);
            return;
        }
        if (c7367l.f15279l.f35194l != EnumC17173l.f33350l) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            c16515l.put(c7367l, value);
            return;
        }
        Object obj2 = c16515l.get(c7367l);
        if (obj2 != null) {
            c16515l.put(c7367l, ((AbstractC14080l) obj2).purchase().purchase((AbstractC4730l) ((AbstractC14080l) value)).crashlytics());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        c16515l.put(c7367l, value);
    }

    public final void subs(C7367l c7367l, Object obj) {
        if (!c7367l.f15278l) {
            isPro(c7367l.f15279l, obj);
        } else {
            if (!(obj instanceof List)) {
                C8339l.metrica("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                isPro(c7367l.f15279l, it.next());
            }
            obj = arrayList;
        }
        this.yandex.put(c7367l, obj);
    }

    public final void yandex(C7367l c7367l, Object obj) {
        List arrayList;
        if (!c7367l.f15278l) {
            C8339l.metrica("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        isPro(c7367l.f15279l, obj);
        C16515l c16515l = this.yandex;
        Object obj2 = c16515l.get(c7367l);
        if (obj2 == null) {
            arrayList = new ArrayList();
            c16515l.put(c7367l, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    public C2090l() {
    }
}
