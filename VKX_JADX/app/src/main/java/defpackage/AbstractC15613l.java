package defpackage;

/* JADX INFO: renamed from: lِٕؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15613l {
    public static final int yandex = Float.floatToIntBits(0.5f);

    public static final String amazon(int i) {
        int i2 = i & 224;
        if (i2 == 0) {
            return "unsigned integer";
        }
        if (i2 == 32) {
            return "negative integer";
        }
        if (i2 == 64) {
            return "byte string";
        }
        if (i2 == 96) {
            return "string";
        }
        if (i2 == 128) {
            return "array";
        }
        if (i2 != 160) {
            return i2 != 192 ? "<unknown>" : "tag";
        }
        return "map";
    }

    public static final String crashlytics(InterfaceC18035l interfaceC18035l, long j) {
        int iMopub = interfaceC18035l.mopub();
        while (iMopub > 0) {
            int i = iMopub - 1;
            String strAdmob = interfaceC18035l.admob(interfaceC18035l.mopub() - iMopub);
            Long lAmazon = AbstractC1295l.amazon(interfaceC18035l, interfaceC18035l.amazon(strAdmob));
            if (lAmazon != null && lAmazon.longValue() == j) {
                return strAdmob;
            }
            iMopub = i;
        }
        return null;
    }

    public static final int loadAd(InterfaceC18035l interfaceC18035l, String str) {
        int iAmazon = interfaceC18035l.amazon(str);
        if (iAmazon != -3) {
            return iAmazon;
        }
        throw new C14747l(interfaceC18035l.yandex() + " does not contain element with name '" + str + ". You can enable 'CborBuilder.ignoreUnknownKeys' property to ignore unknown keys");
    }

    public static final float yandex(short s) {
        int i = 0;
        boolean z = (Short.MIN_VALUE & s) != 0;
        int i2 = (s >> 10) & 31;
        int i3 = s & 1023;
        if (i2 != 0) {
            i = i2 != 31 ? i2 + 112 : 255;
        } else {
            if (i3 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(yandex + i3) - 0.5f;
                return z ? -fIntBitsToFloat : fIntBitsToFloat;
            }
            i3 = 0;
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((i3 << 13) | (i << 23));
        return z ? -fIntBitsToFloat2 : fIntBitsToFloat2;
    }
}
