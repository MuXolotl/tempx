package defpackage;

import java.io.EOFException;
import java.math.BigDecimal;

/* JADX INFO: renamed from: lؚْۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13635l extends AbstractC7188l {
    public final /* synthetic */ int yandex;

    public /* synthetic */ C13635l(int i) {
        this.yandex = i;
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        switch (this.yandex) {
            case 0:
                c3631l.m1367throw((String) obj);
                return;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (c3631l.f7577l) {
                    C8339l.smaato("Boolean cannot be used as a map key in JSON at path ".concat(c3631l.ads()));
                    return;
                }
                c3631l.m1366switch();
                c3631l.yandex();
                c3631l.f7573l.mo706finally(zBooleanValue ? "true" : "false");
                int[] iArr = c3631l.f7578l;
                int i = c3631l.f7576l - 1;
                iArr[i] = iArr[i] + 1;
                return;
            case 2:
                c3631l.m1365private(((Byte) obj).intValue() & 255);
                return;
            case 3:
                c3631l.m1367throw(((Character) obj).toString());
                return;
            case 4:
                double dDoubleValue = ((Double) obj).doubleValue();
                c3631l.getClass();
                if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was " + dDoubleValue);
                }
                if (c3631l.f7577l) {
                    c3631l.f7577l = false;
                    c3631l.isVip(Double.toString(dDoubleValue));
                    return;
                }
                c3631l.m1366switch();
                c3631l.yandex();
                c3631l.f7573l.mo706finally(Double.toString(dDoubleValue));
                int[] iArr2 = c3631l.f7578l;
                int i2 = c3631l.f7576l - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return;
            case 5:
                Float f = (Float) obj;
                f.getClass();
                c3631l.getClass();
                String string = f.toString();
                if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                    C1759l.ads(f, "Numeric values must be finite, but was ");
                    return;
                }
                if (c3631l.f7577l) {
                    c3631l.f7577l = false;
                    c3631l.isVip(string);
                    return;
                }
                c3631l.m1366switch();
                c3631l.yandex();
                c3631l.f7573l.mo706finally(string);
                int[] iArr3 = c3631l.f7578l;
                int i3 = c3631l.f7576l - 1;
                iArr3[i3] = iArr3[i3] + 1;
                return;
            case 6:
                c3631l.m1365private(((Integer) obj).intValue());
                return;
            case 7:
                c3631l.m1365private(((Long) obj).longValue());
                return;
            default:
                c3631l.m1365private(((Short) obj).intValue());
                return;
        }
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        long jLongValueExact;
        long j;
        boolean z = true;
        switch (this.yandex) {
            case 0:
                return c0396l.m494import();
            case 1:
                int iVip = c0396l.f1504l;
                if (iVip == 0) {
                    iVip = c0396l.vip();
                }
                if (iVip == 5) {
                    c0396l.f1504l = 0;
                    int[] iArr = c0396l.f1510l;
                    int i = c0396l.f1507l - 1;
                    iArr[i] = iArr[i] + 1;
                } else {
                    if (iVip != 6) {
                        C11467l.firebase(AbstractC2812l.premium(c0396l.m510while()), c0396l.inmobi(), "Expected a boolean but was ");
                        return null;
                    }
                    c0396l.f1504l = 0;
                    int[] iArr2 = c0396l.f1510l;
                    int i2 = c0396l.f1507l - 1;
                    iArr2[i2] = iArr2[i2] + 1;
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                return Byte.valueOf((byte) AbstractC8320l.amazon(c0396l, "a byte", -128, 255));
            case 3:
                String strM494import = c0396l.m494import();
                if (strM494import.length() <= 1) {
                    return Character.valueOf(strM494import.charAt(0));
                }
                C11467l.subscription(AbstractC14814l.adcel("Expected a char but was ", AbstractC14814l.smaato('\"', "\"", strM494import), " at path ", c0396l.inmobi()));
                return null;
            case 4:
                return Double.valueOf(c0396l.m505private());
            case 5:
                float fM505private = (float) c0396l.m505private();
                if (!Float.isInfinite(fM505private)) {
                    return Float.valueOf(fM505private);
                }
                throw new C6451l("JSON forbids NaN and infinities: " + fM505private + " at path " + c0396l.inmobi(), 8, (byte) 0);
            case 6:
                return Integer.valueOf(c0396l.m509throw());
            case 7:
                int iVip2 = c0396l.f1504l;
                if (iVip2 == 0) {
                    iVip2 = c0396l.vip();
                }
                if (iVip2 != 16) {
                    try {
                        if (iVip2 == 17) {
                            C0869l c0869l = c0396l.f1512l;
                            long j2 = c0396l.f1511l;
                            c0869l.getClass();
                            c0396l.f1508l = c0869l.mo712l(j2, AbstractC9050l.yandex);
                        } else if (iVip2 == 9 || iVip2 == 8) {
                            String strM506super = iVip2 == 9 ? c0396l.m506super(C0396l.f1501l) : c0396l.m506super(C0396l.f1502l);
                            c0396l.f1508l = strM506super;
                            try {
                                jLongValueExact = Long.parseLong(strM506super);
                                c0396l.f1504l = 0;
                                int[] iArr3 = c0396l.f1510l;
                                int i3 = c0396l.f1507l - 1;
                                iArr3[i3] = iArr3[i3] + 1;
                            } catch (NumberFormatException unused) {
                                c0396l.f1504l = 11;
                                jLongValueExact = new BigDecimal(c0396l.f1508l).longValueExact();
                                c0396l.f1508l = null;
                                c0396l.f1504l = 0;
                                int[] iArr4 = c0396l.f1510l;
                                int i4 = c0396l.f1507l - 1;
                                iArr4[i4] = iArr4[i4] + 1;
                            }
                            j = jLongValueExact;
                        } else if (iVip2 != 11) {
                            C11467l.firebase(AbstractC2812l.premium(c0396l.m510while()), c0396l.inmobi(), "Expected a long but was ");
                            return null;
                        }
                        jLongValueExact = new BigDecimal(c0396l.f1508l).longValueExact();
                        c0396l.f1508l = null;
                        c0396l.f1504l = 0;
                        int[] iArr5 = c0396l.f1510l;
                        int i5 = c0396l.f1507l - 1;
                        iArr5[i5] = iArr5[i5] + 1;
                        j = jLongValueExact;
                    } catch (ArithmeticException | NumberFormatException unused2) {
                        C11467l.firebase(c0396l.f1508l, c0396l.inmobi(), "Expected a long but was ");
                        return null;
                    }
                    c0396l.f1504l = 11;
                    break;
                } else {
                    c0396l.f1504l = 0;
                    int[] iArr6 = c0396l.f1510l;
                    int i6 = c0396l.f1507l - 1;
                    iArr6[i6] = iArr6[i6] + 1;
                    j = c0396l.f1505l;
                }
                return Long.valueOf(j);
            default:
                return Short.valueOf((short) AbstractC8320l.amazon(c0396l, "a short", -32768, 32767));
        }
    }

    public final String toString() {
        switch (this.yandex) {
            case 0:
                return "JsonAdapter(String)";
            case 1:
                return "JsonAdapter(Boolean)";
            case 2:
                return "JsonAdapter(Byte)";
            case 3:
                return "JsonAdapter(Character)";
            case 4:
                return "JsonAdapter(Double)";
            case 5:
                return "JsonAdapter(Float)";
            case 6:
                return "JsonAdapter(Integer)";
            case 7:
                return "JsonAdapter(Long)";
            default:
                return "JsonAdapter(Short)";
        }
    }
}
