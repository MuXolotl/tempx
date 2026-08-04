package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lُؗ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5183l {
    public final LinkedHashMap yandex;

    public C5183l(int i) {
        switch (i) {
            case 1:
                this.yandex = new LinkedHashMap();
                break;
            case 2:
                this.yandex = new LinkedHashMap();
                break;
            default:
                this.yandex = new LinkedHashMap();
                break;
        }
    }

    public static String loadAd(int i, int i2, String str) {
        return i + '-' + i2 + '-' + str;
    }

    public void amazon(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            crashlytics((String) entry.getKey(), entry.getValue());
        }
    }

    public void crashlytics(String str, Object obj) {
        Object[] objArr;
        if (obj == null) {
            obj = null;
        } else {
            Class<?> cls = obj.getClass();
            C2336l c2336l = AbstractC18202l.yandex;
            InterfaceC1388l interfaceC1388lLoadAd = c2336l.loadAd(cls);
            if (!AbstractC8576l.yandex(interfaceC1388lLoadAd, c2336l.loadAd(Boolean.TYPE)) && !AbstractC8576l.yandex(interfaceC1388lLoadAd, c2336l.loadAd(Byte.TYPE)) && !AbstractC8576l.yandex(interfaceC1388lLoadAd, c2336l.loadAd(Integer.TYPE)) && !AbstractC8576l.yandex(interfaceC1388lLoadAd, c2336l.loadAd(Long.TYPE)) && !AbstractC8576l.yandex(interfaceC1388lLoadAd, c2336l.loadAd(Float.TYPE)) && !AbstractC8576l.yandex(interfaceC1388lLoadAd, c2336l.loadAd(Double.TYPE)) && !AbstractC8576l.yandex(interfaceC1388lLoadAd, c2336l.loadAd(String.class)) && !AbstractC8576l.yandex(interfaceC1388lLoadAd, c2336l.loadAd(Boolean[].class)) && !AbstractC8576l.yandex(interfaceC1388lLoadAd, c2336l.loadAd(Byte[].class)) && !AbstractC8576l.yandex(interfaceC1388lLoadAd, c2336l.loadAd(Integer[].class)) && !AbstractC8576l.yandex(interfaceC1388lLoadAd, c2336l.loadAd(Long[].class)) && !AbstractC8576l.yandex(interfaceC1388lLoadAd, c2336l.loadAd(Float[].class)) && !AbstractC8576l.yandex(interfaceC1388lLoadAd, c2336l.loadAd(Double[].class)) && !AbstractC8576l.yandex(interfaceC1388lLoadAd, c2336l.loadAd(String[].class))) {
                int i = 0;
                if (AbstractC8576l.yandex(interfaceC1388lLoadAd, c2336l.loadAd(boolean[].class))) {
                    boolean[] zArr = (boolean[]) obj;
                    String str2 = AbstractC1696l.yandex;
                    int length = zArr.length;
                    objArr = new Boolean[length];
                    while (i < length) {
                        objArr[i] = Boolean.valueOf(zArr[i]);
                        i++;
                    }
                } else if (AbstractC8576l.yandex(interfaceC1388lLoadAd, c2336l.loadAd(byte[].class))) {
                    byte[] bArr = (byte[]) obj;
                    String str3 = AbstractC1696l.yandex;
                    int length2 = bArr.length;
                    objArr = new Byte[length2];
                    while (i < length2) {
                        objArr[i] = Byte.valueOf(bArr[i]);
                        i++;
                    }
                } else if (AbstractC8576l.yandex(interfaceC1388lLoadAd, c2336l.loadAd(int[].class))) {
                    int[] iArr = (int[]) obj;
                    String str4 = AbstractC1696l.yandex;
                    int length3 = iArr.length;
                    objArr = new Integer[length3];
                    while (i < length3) {
                        objArr[i] = Integer.valueOf(iArr[i]);
                        i++;
                    }
                } else if (AbstractC8576l.yandex(interfaceC1388lLoadAd, c2336l.loadAd(long[].class))) {
                    long[] jArr = (long[]) obj;
                    String str5 = AbstractC1696l.yandex;
                    int length4 = jArr.length;
                    objArr = new Long[length4];
                    while (i < length4) {
                        objArr[i] = Long.valueOf(jArr[i]);
                        i++;
                    }
                } else if (AbstractC8576l.yandex(interfaceC1388lLoadAd, c2336l.loadAd(float[].class))) {
                    float[] fArr = (float[]) obj;
                    String str6 = AbstractC1696l.yandex;
                    int length5 = fArr.length;
                    objArr = new Float[length5];
                    while (i < length5) {
                        objArr[i] = Float.valueOf(fArr[i]);
                        i++;
                    }
                } else {
                    if (!AbstractC8576l.yandex(interfaceC1388lLoadAd, c2336l.loadAd(double[].class))) {
                        C1759l.smaato("Key ", str, " has invalid type ", interfaceC1388lLoadAd);
                        return;
                    }
                    double[] dArr = (double[]) obj;
                    String str7 = AbstractC1696l.yandex;
                    int length6 = dArr.length;
                    objArr = new Double[length6];
                    while (i < length6) {
                        objArr[i] = Double.valueOf(dArr[i]);
                        i++;
                    }
                }
                obj = objArr;
            }
        }
        this.yandex.put(str, obj);
    }

    public C4279l yandex() {
        C4279l c4279l = new C4279l(this.yandex);
        AbstractC7280l.admob(c4279l);
        return c4279l;
    }
}
