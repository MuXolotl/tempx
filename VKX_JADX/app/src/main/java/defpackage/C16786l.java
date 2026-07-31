package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import j$.time.Duration;
import j$.time.Instant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: lٖۦۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16786l extends AbstractC7532l {
    public final /* synthetic */ int Signature;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16786l() {
        super(3, AbstractC18202l.yandex.loadAd(Void.class), 1, null);
        this.Signature = 2;
    }

    public static long remoteconfig(Duration duration) {
        return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getSeconds() : duration.getSeconds() + 1;
    }

    public static int smaato(Duration duration) {
        return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getNano() : duration.getNano() - 1000000000;
    }

    @Override // defpackage.AbstractC7532l
    public void admob(C13161l c13161l, int i, Object obj) {
        int i2 = this.Signature;
        int i3 = this.amazon;
        switch (i2) {
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                c13161l.m3578class((i << 3) | AbstractC9361l.subscription(i3));
                c13161l.m3578class(0);
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                if (obj != null) {
                    super.admob(c13161l, i, obj);
                } else {
                    c13161l.m3578class((i << 3) | AbstractC9361l.subscription(i3));
                    c13161l.m3578class(isPro(obj));
                    purchase(c13161l, obj);
                }
                break;
            default:
                super.admob(c13161l, i, obj);
                break;
        }
    }

    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        int i = this.Signature;
        C16786l c16786l = AbstractC7532l.isPro;
        C16786l c16786l2 = AbstractC7532l.mopub;
        C16786l c16786l3 = AbstractC7532l.tapsense;
        C16786l c16786l4 = AbstractC7532l.startapp;
        switch (i) {
            case 0:
                c1080l.m798static(Double.doubleToLongBits(((Number) obj).doubleValue()));
                return;
            case 1:
                c1080l.m795interface(Float.floatToIntBits(((Number) obj).floatValue()));
                return;
            case 2:
                throw new IllegalStateException("Operation not supported.");
            case 3:
                c1080l.m790default(((Boolean) obj).booleanValue() ? 1 : 0);
                return;
            case 4:
                c1080l.m788class((C3844l) obj);
                return;
            case 5:
                Duration duration = (Duration) obj;
                int iSmaato = smaato(duration);
                if (iSmaato != 0) {
                    c16786l2.subs(c1080l, 2, Integer.valueOf(iSmaato));
                }
                long jRemoteconfig = remoteconfig(duration);
                if (jRemoteconfig != 0) {
                    c16786l.subs(c1080l, 1, Long.valueOf(jRemoteconfig));
                    return;
                }
                return;
            case 6:
                return;
            case 7:
                c1080l.m795interface(((Number) obj).intValue());
                return;
            case 8:
                c1080l.m798static(((Number) obj).longValue());
                return;
            case 9:
                Instant instant = (Instant) obj;
                long epochSecond = instant.getEpochSecond();
                int nano = instant.getNano();
                if (-62135596800L > epochSecond || epochSecond >= 253402300800L) {
                    C10754l.metrica(AbstractC2812l.subscription(epochSecond, "Timestamp seconds (", ") must be in range [-62135596800, 253402300799]"));
                    return;
                }
                if (nano < 0 || nano >= 1000000000) {
                    C10754l.metrica(AbstractC15560l.tapsense("Timestamp nanos (", nano, ") must be in range [0, 999999999]"));
                    return;
                }
                if (nano != 0) {
                    c16786l2.subs(c1080l, 2, Integer.valueOf(nano));
                }
                if (epochSecond != 0) {
                    c16786l.subs(c1080l, 1, Long.valueOf(epochSecond));
                    return;
                }
                return;
            case 10:
                int iIntValue = ((Number) obj).intValue();
                if (iIntValue >= 0) {
                    c1080l.m790default(iIntValue);
                    return;
                } else {
                    c1080l.m793final(iIntValue);
                    return;
                }
            case 11:
                c1080l.m793final(((Number) obj).longValue());
                return;
            case 12:
                int iIntValue2 = ((Number) obj).intValue();
                c1080l.m790default((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                return;
            case 13:
                long jLongValue = ((Number) obj).longValue();
                c1080l.m793final((jLongValue >> 63) ^ (jLongValue << 1));
                return;
            case 14:
                String str = (String) obj;
                int length = str.length() - 1;
                while (length >= 0) {
                    int i2 = length - 1;
                    char cCharAt = str.charAt(length);
                    if (cCharAt < 128) {
                        c1080l.m800synchronized(1);
                        int i3 = c1080l.f2972l;
                        byte[] bArr = (byte[]) c1080l.f2976l;
                        int i4 = i3 - 1;
                        bArr[i4] = (byte) cCharAt;
                        int iMax = Math.max(-1, i2 - i4);
                        int i5 = i4;
                        length = i2;
                        while (length > iMax) {
                            char cCharAt2 = str.charAt(length);
                            if (cCharAt2 < 128) {
                                length--;
                                i5--;
                                bArr[i5] = (byte) cCharAt2;
                            } else {
                                c1080l.f2972l = i5;
                            }
                        }
                        c1080l.f2972l = i5;
                    } else {
                        if (cCharAt < 2048) {
                            c1080l.m800synchronized(2);
                            byte[] bArr2 = (byte[]) c1080l.f2976l;
                            int i6 = c1080l.f2972l;
                            int i7 = i6 - 1;
                            c1080l.f2972l = i7;
                            bArr2[i7] = (byte) (128 | (cCharAt & '?'));
                            int i8 = i6 - 2;
                            c1080l.f2972l = i8;
                            bArr2[i8] = (byte) ((cCharAt >> 6) | 192);
                        } else if (cCharAt < 55296 || cCharAt > 57343) {
                            c1080l.m800synchronized(3);
                            byte[] bArr3 = (byte[]) c1080l.f2976l;
                            int i9 = c1080l.f2972l;
                            int i10 = i9 - 1;
                            c1080l.f2972l = i10;
                            bArr3[i10] = (byte) ((cCharAt & '?') | 128);
                            int i11 = i9 - 2;
                            c1080l.f2972l = i11;
                            bArr3[i11] = (byte) (128 | ((cCharAt >> 6) & 63));
                            int i12 = i9 - 3;
                            c1080l.f2972l = i12;
                            bArr3[i12] = (byte) ((cCharAt >> '\f') | 224);
                        } else {
                            char cCharAt3 = i2 >= 0 ? str.charAt(i2) : (char) 65535;
                            if (cCharAt3 > 56319 || 56320 > cCharAt || cCharAt >= 57344) {
                                c1080l.m800synchronized(1);
                                byte[] bArr4 = (byte[]) c1080l.f2976l;
                                int i13 = c1080l.f2972l - 1;
                                c1080l.f2972l = i13;
                                bArr4[i13] = 63;
                            } else {
                                length -= 2;
                                int i14 = (((cCharAt3 & 1023) << 10) | (cCharAt & 1023)) + 65536;
                                c1080l.m800synchronized(4);
                                byte[] bArr5 = (byte[]) c1080l.f2976l;
                                int i15 = c1080l.f2972l;
                                int i16 = i15 - 1;
                                c1080l.f2972l = i16;
                                bArr5[i16] = (byte) ((i14 & 63) | 128);
                                int i17 = i15 - 2;
                                c1080l.f2972l = i17;
                                bArr5[i17] = (byte) (((i14 >> 6) & 63) | 128);
                                int i18 = i15 - 3;
                                c1080l.f2972l = i18;
                                bArr5[i18] = (byte) (128 | ((i14 >> 12) & 63));
                                int i19 = i15 - 4;
                                c1080l.f2972l = i19;
                                bArr5[i19] = (byte) ((i14 >> 18) | 240);
                            }
                        }
                        length = i2;
                    }
                }
                return;
            case 15:
                List list = (List) obj;
                if (list == null) {
                    return;
                }
                for (int size = list.size() - 1; -1 < size; size--) {
                    c16786l3.subs(c1080l, 1, list.get(size));
                }
                return;
            case 16:
                Map map = (Map) obj;
                if (map == null) {
                    return;
                }
                Map.Entry[] entryArr = (Map.Entry[]) map.entrySet().toArray(new Map.Entry[0]);
                AbstractC8669l.m2413static(entryArr);
                for (Map.Entry entry : entryArr) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    int iLicense = c1080l.license();
                    c16786l3.subs(c1080l, 2, value);
                    c16786l4.subs(c1080l, 1, str2);
                    c1080l.m790default(c1080l.license() - iLicense);
                    c1080l.m790default(8 | AbstractC9361l.subscription(3));
                }
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                c1080l.m790default(0);
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                if (obj == null) {
                    AbstractC7532l.subscription.subs(c1080l, 1, obj);
                    return;
                }
                if (obj instanceof Number) {
                    AbstractC7532l.vip.subs(c1080l, 2, Double.valueOf(((Number) obj).doubleValue()));
                    return;
                }
                if (obj instanceof String) {
                    c16786l4.subs(c1080l, 3, obj);
                    return;
                }
                if (obj instanceof Boolean) {
                    AbstractC7532l.billing.subs(c1080l, 4, obj);
                    return;
                }
                if (obj instanceof Map) {
                    AbstractC7532l.adcel.subs(c1080l, 5, (Map) obj);
                    return;
                } else if (obj instanceof List) {
                    AbstractC7532l.ads.subs(c1080l, 6, obj);
                    return;
                } else {
                    C8339l.metrica(AbstractC15560l.subscription(obj, "unexpected struct value: "));
                    return;
                }
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                c1080l.m790default(((Number) obj).intValue());
                return;
            default:
                c1080l.m793final(((Number) obj).longValue());
                return;
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        int i = this.Signature;
        C16786l c16786l = AbstractC7532l.isPro;
        C16786l c16786l2 = AbstractC7532l.mopub;
        long jLongValue = 0;
        C16786l c16786l3 = AbstractC7532l.tapsense;
        C16786l c16786l4 = AbstractC7532l.startapp;
        int iIntValue = 0;
        int iIntValue2 = 0;
        switch (i) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(c7084l.firebase()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(c7084l.isPro()));
            case 2:
                throw new IllegalStateException("Operation not supported.");
            case 3:
                return Boolean.valueOf(c7084l.vip() != 0);
            case 4:
                return c7084l.subs();
            case 5:
                long jAmazon = c7084l.amazon();
                while (true) {
                    int iMopub = c7084l.mopub();
                    if (iMopub == -1) {
                        c7084l.purchase(jAmazon);
                        return Duration.ofSeconds(jLongValue, iIntValue2);
                    }
                    if (iMopub == 1) {
                        jLongValue = ((Number) c16786l.crashlytics(c7084l)).longValue();
                    } else if (iMopub != 2) {
                        c7084l.remoteconfig(iMopub);
                    } else {
                        iIntValue2 = ((Number) c16786l2.crashlytics(c7084l)).intValue();
                    }
                }
                break;
            case 6:
                long jAmazon2 = c7084l.amazon();
                while (true) {
                    int iMopub2 = c7084l.mopub();
                    if (iMopub2 == -1) {
                        c7084l.purchase(jAmazon2);
                        return Unit.INSTANCE;
                    }
                    c7084l.remoteconfig(iMopub2);
                }
                break;
            case 7:
                return Integer.valueOf(c7084l.isPro());
            case 8:
                return Long.valueOf(c7084l.firebase());
            case 9:
                long jAmazon3 = c7084l.amazon();
                while (true) {
                    int iMopub3 = c7084l.mopub();
                    if (iMopub3 == -1) {
                        c7084l.purchase(jAmazon3);
                        return Instant.ofEpochSecond(jLongValue, iIntValue);
                    }
                    if (iMopub3 == 1) {
                        jLongValue = ((Number) c16786l.crashlytics(c7084l)).longValue();
                    } else if (iMopub3 != 2) {
                        c7084l.remoteconfig(iMopub3);
                    } else {
                        iIntValue = ((Number) c16786l2.crashlytics(c7084l)).intValue();
                    }
                }
                break;
            case 10:
                return Integer.valueOf(c7084l.vip());
            case 11:
                return Long.valueOf(c7084l.metrica());
            case 12:
                int iVip = c7084l.vip();
                return Integer.valueOf((-(iVip & 1)) ^ (iVip >>> 1));
            case 13:
                long jMetrica = c7084l.metrica();
                return Long.valueOf((-(jMetrica & 1)) ^ (jMetrica >>> 1));
            case 14:
                return c7084l.smaato();
            case 15:
                ArrayList arrayList = new ArrayList();
                long jAmazon4 = c7084l.amazon();
                while (true) {
                    int iMopub4 = c7084l.mopub();
                    if (iMopub4 == -1) {
                        c7084l.purchase(jAmazon4);
                        return arrayList;
                    }
                    if (iMopub4 != 1) {
                        c7084l.startapp();
                    } else {
                        arrayList.add(c16786l3.crashlytics(c7084l));
                    }
                }
                break;
            case 16:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                long jAmazon5 = c7084l.amazon();
                while (true) {
                    int iMopub5 = c7084l.mopub();
                    if (iMopub5 == -1) {
                        c7084l.purchase(jAmazon5);
                        return linkedHashMap;
                    }
                    if (iMopub5 != 1) {
                        c7084l.startapp();
                    } else {
                        long jAmazon6 = c7084l.amazon();
                        String strSmaato = null;
                        Object objCrashlytics = null;
                        while (true) {
                            int iMopub6 = c7084l.mopub();
                            if (iMopub6 == -1) {
                                c7084l.purchase(jAmazon6);
                                if (strSmaato != null) {
                                    linkedHashMap.put(strSmaato, objCrashlytics);
                                }
                            } else if (iMopub6 == 1) {
                                c16786l4.getClass();
                                strSmaato = c7084l.smaato();
                            } else if (iMopub6 != 2) {
                                c7084l.remoteconfig(iMopub6);
                            } else {
                                objCrashlytics = c16786l3.crashlytics(c7084l);
                            }
                        }
                    }
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                int iVip2 = c7084l.vip();
                if (iVip2 != 0) {
                    C18262l.metrica(AbstractC0653l.vip(iVip2, "expected 0 but was "));
                }
                return null;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                long jAmazon7 = c7084l.amazon();
                while (true) {
                    Object objCrashlytics2 = null;
                    while (true) {
                        int iMopub7 = c7084l.mopub();
                        if (iMopub7 == -1) {
                            c7084l.purchase(jAmazon7);
                            return objCrashlytics2;
                        }
                        switch (iMopub7) {
                            case 1:
                                break;
                            case 2:
                                objCrashlytics2 = AbstractC7532l.vip.crashlytics(c7084l);
                                break;
                            case 3:
                                c16786l4.getClass();
                                objCrashlytics2 = c7084l.smaato();
                                break;
                            case 4:
                                objCrashlytics2 = AbstractC7532l.billing.crashlytics(c7084l);
                                break;
                            case 5:
                                objCrashlytics2 = AbstractC7532l.adcel.crashlytics(c7084l);
                                break;
                            case 6:
                                objCrashlytics2 = AbstractC7532l.ads.crashlytics(c7084l);
                                break;
                            default:
                                c7084l.startapp();
                                break;
                        }
                    }
                    AbstractC7532l.subscription.crashlytics(c7084l);
                }
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return Integer.valueOf(c7084l.vip());
            default:
                return Long.valueOf(c7084l.metrica());
        }
    }

    @Override // defpackage.AbstractC7532l
    public int firebase(int i, Object obj) {
        switch (this.Signature) {
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return AbstractC10547l.purchase(1) + AbstractC10547l.purchase((i << 3) | AbstractC9361l.subscription(1));
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                if (obj != null) {
                    return super.firebase(i, obj);
                }
                int iIsPro = isPro(obj);
                return AbstractC10547l.purchase(iIsPro) + AbstractC10547l.purchase((i << 3) | AbstractC9361l.subscription(1)) + iIsPro;
            default:
                return super.firebase(i, obj);
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        int i = this.Signature;
        C16786l c16786l = AbstractC7532l.mopub;
        C16786l c16786l2 = AbstractC7532l.isPro;
        C16786l c16786l3 = AbstractC7532l.tapsense;
        C16786l c16786l4 = AbstractC7532l.startapp;
        int iFirebase = 0;
        switch (i) {
            case 0:
                ((Number) obj).doubleValue();
                return 8;
            case 1:
                ((Number) obj).floatValue();
                return 4;
            case 2:
                throw new IllegalStateException("Operation not supported.");
            case 3:
                ((Boolean) obj).getClass();
                return 1;
            case 4:
                return ((C3844l) obj).purchase();
            case 5:
                Duration duration = (Duration) obj;
                long jRemoteconfig = remoteconfig(duration);
                iFirebase = jRemoteconfig != 0 ? c16786l2.firebase(1, Long.valueOf(jRemoteconfig)) : 0;
                int iSmaato = smaato(duration);
                return iSmaato != 0 ? AbstractC9029l.isPro(iSmaato, c16786l, 2, iFirebase) : iFirebase;
            case 6:
                return 0;
            case 7:
                ((Number) obj).intValue();
                return 4;
            case 8:
                ((Number) obj).longValue();
                return 8;
            case 9:
                Instant instant = (Instant) obj;
                long epochSecond = instant.getEpochSecond();
                int nano = instant.getNano();
                if (-62135596800L > epochSecond || epochSecond >= 253402300800L) {
                    C10754l.metrica(AbstractC2812l.subscription(epochSecond, "Timestamp seconds (", ") must be in range [-62135596800, 253402300799]"));
                    return 0;
                }
                if (nano < 0 || nano >= 1000000000) {
                    C10754l.metrica(AbstractC15560l.tapsense("Timestamp nanos (", nano, ") must be in range [0, 999999999]"));
                    return 0;
                }
                iFirebase = epochSecond != 0 ? c16786l2.firebase(1, Long.valueOf(epochSecond)) : 0;
                return nano != 0 ? AbstractC9029l.isPro(nano, c16786l, 2, iFirebase) : iFirebase;
            case 10:
                int iIntValue = ((Number) obj).intValue();
                if (iIntValue < 0) {
                    return 10;
                }
                if ((iIntValue & (-128)) == 0) {
                    return 1;
                }
                if ((iIntValue & (-16384)) == 0) {
                    return 2;
                }
                if ((iIntValue & (-2097152)) == 0) {
                    return 3;
                }
                return (iIntValue & (-268435456)) == 0 ? 4 : 5;
            case 11:
                return AbstractC10547l.billing(((Number) obj).longValue());
            case 12:
                int iIntValue2 = ((Number) obj).intValue();
                int i2 = (iIntValue2 >> 31) ^ (iIntValue2 << 1);
                if ((i2 & (-128)) == 0) {
                    return 1;
                }
                if ((i2 & (-16384)) == 0) {
                    return 2;
                }
                if ((i2 & (-2097152)) == 0) {
                    return 3;
                }
                return (i2 & (-268435456)) == 0 ? 4 : 5;
            case 13:
                long jLongValue = ((Number) obj).longValue();
                return AbstractC10547l.billing((jLongValue >> 63) ^ (jLongValue << 1));
            case 14:
                return (int) AbstractC7799l.amazon((String) obj);
            case 15:
                List list = (List) obj;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        iFirebase += c16786l3.firebase(1, it.next());
                    }
                }
                return iFirebase;
            case 16:
                Map map = (Map) obj;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        int iFirebase2 = c16786l3.firebase(2, entry.getValue()) + c16786l4.firebase(1, (String) entry.getKey());
                        iFirebase += AbstractC10547l.purchase(iFirebase2) + AbstractC10547l.purchase(AbstractC9361l.subscription(1) | 8) + iFirebase2;
                    }
                }
                return iFirebase;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return 1;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                if (obj == null) {
                    return AbstractC7532l.subscription.firebase(1, obj);
                }
                if (obj instanceof Number) {
                    return AbstractC7532l.vip.firebase(2, Double.valueOf(((Number) obj).doubleValue()));
                }
                if (obj instanceof String) {
                    return c16786l4.firebase(3, obj);
                }
                if (obj instanceof Boolean) {
                    return AbstractC7532l.billing.firebase(4, obj);
                }
                if (obj instanceof Map) {
                    return AbstractC7532l.adcel.firebase(5, (Map) obj);
                }
                if (obj instanceof List) {
                    return AbstractC7532l.ads.firebase(6, obj);
                }
                C8339l.metrica(AbstractC15560l.subscription(obj, "unexpected struct value: "));
                return 0;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                int iIntValue3 = ((Number) obj).intValue();
                if ((iIntValue3 & (-128)) == 0) {
                    return 1;
                }
                if ((iIntValue3 & (-16384)) == 0) {
                    return 2;
                }
                if ((iIntValue3 & (-2097152)) == 0) {
                    return 3;
                }
                return (iIntValue3 & (-268435456)) == 0 ? 4 : 5;
            default:
                return AbstractC10547l.billing(((Number) obj).longValue());
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object loadAd(C2881l c2881l) throws IOException {
        int i = this.Signature;
        C16786l c16786l = AbstractC7532l.isPro;
        C16786l c16786l2 = AbstractC7532l.mopub;
        long jLongValue = 0;
        C16786l c16786l3 = AbstractC7532l.tapsense;
        C16786l c16786l4 = AbstractC7532l.startapp;
        int iIntValue = 0;
        int iIntValue2 = 0;
        switch (i) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(c2881l.isPro()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(c2881l.subs()));
            case 2:
                throw new IllegalStateException("Operation not supported.");
            case 3:
                return Boolean.valueOf(c2881l.remoteconfig() != 0);
            case 4:
                return c2881l.admob();
            case 5:
                int iCrashlytics = c2881l.crashlytics();
                while (true) {
                    int iBilling = c2881l.billing();
                    if (iBilling == -1) {
                        c2881l.amazon(iCrashlytics);
                        return Duration.ofSeconds(jLongValue, iIntValue2);
                    }
                    if (iBilling == 1) {
                        jLongValue = ((Number) c16786l.loadAd(c2881l)).longValue();
                    } else if (iBilling != 2) {
                        c2881l.smaato(iBilling);
                    } else {
                        iIntValue2 = ((Number) c16786l2.loadAd(c2881l)).intValue();
                    }
                }
                break;
            case 6:
                int iCrashlytics2 = c2881l.crashlytics();
                while (true) {
                    int iBilling2 = c2881l.billing();
                    if (iBilling2 == -1) {
                        c2881l.amazon(iCrashlytics2);
                        return Unit.INSTANCE;
                    }
                    c2881l.smaato(iBilling2);
                }
                break;
            case 7:
                return Integer.valueOf(c2881l.subs());
            case 8:
                return Long.valueOf(c2881l.isPro());
            case 9:
                int iCrashlytics3 = c2881l.crashlytics();
                while (true) {
                    int iBilling3 = c2881l.billing();
                    if (iBilling3 == -1) {
                        c2881l.amazon(iCrashlytics3);
                        return Instant.ofEpochSecond(jLongValue, iIntValue);
                    }
                    if (iBilling3 == 1) {
                        jLongValue = ((Number) c16786l.loadAd(c2881l)).longValue();
                    } else if (iBilling3 != 2) {
                        c2881l.smaato(iBilling3);
                    } else {
                        iIntValue = ((Number) c16786l2.loadAd(c2881l)).intValue();
                    }
                }
                break;
            case 10:
                return Integer.valueOf(c2881l.remoteconfig());
            case 11:
                return Long.valueOf(c2881l.vip());
            case 12:
                int iRemoteconfig = c2881l.remoteconfig();
                return Integer.valueOf((-(iRemoteconfig & 1)) ^ (iRemoteconfig >>> 1));
            case 13:
                long jVip = c2881l.vip();
                return Long.valueOf((-(jVip & 1)) ^ (jVip >>> 1));
            case 14:
                return c2881l.firebase();
            case 15:
                ArrayList arrayList = new ArrayList();
                int iCrashlytics4 = c2881l.crashlytics();
                while (true) {
                    int iBilling4 = c2881l.billing();
                    if (iBilling4 == -1) {
                        c2881l.amazon(iCrashlytics4);
                        return arrayList;
                    }
                    if (iBilling4 != 1) {
                        c2881l.metrica();
                    } else {
                        arrayList.add(c16786l3.loadAd(c2881l));
                    }
                }
                break;
            case 16:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int iCrashlytics5 = c2881l.crashlytics();
                while (true) {
                    int iBilling5 = c2881l.billing();
                    if (iBilling5 == -1) {
                        c2881l.amazon(iCrashlytics5);
                        return linkedHashMap;
                    }
                    if (iBilling5 != 1) {
                        c2881l.metrica();
                    } else {
                        int iCrashlytics6 = c2881l.crashlytics();
                        String strFirebase = null;
                        Object objLoadAd = null;
                        while (true) {
                            int iBilling6 = c2881l.billing();
                            if (iBilling6 == -1) {
                                c2881l.amazon(iCrashlytics6);
                                if (strFirebase != null) {
                                    linkedHashMap.put(strFirebase, objLoadAd);
                                }
                            } else if (iBilling6 == 1) {
                                c16786l4.getClass();
                                strFirebase = c2881l.firebase();
                            } else if (iBilling6 != 2) {
                                c2881l.smaato(iBilling6);
                            } else {
                                objLoadAd = c16786l3.loadAd(c2881l);
                            }
                        }
                    }
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                int iRemoteconfig2 = c2881l.remoteconfig();
                if (iRemoteconfig2 != 0) {
                    C18262l.metrica(AbstractC0653l.vip(iRemoteconfig2, "expected 0 but was "));
                }
                return null;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                int iCrashlytics7 = c2881l.crashlytics();
                while (true) {
                    Object objLoadAd2 = null;
                    while (true) {
                        int iBilling7 = c2881l.billing();
                        if (iBilling7 == -1) {
                            c2881l.amazon(iCrashlytics7);
                            return objLoadAd2;
                        }
                        switch (iBilling7) {
                            case 1:
                                break;
                            case 2:
                                objLoadAd2 = AbstractC7532l.vip.loadAd(c2881l);
                                break;
                            case 3:
                                c16786l4.getClass();
                                objLoadAd2 = c2881l.firebase();
                                break;
                            case 4:
                                objLoadAd2 = AbstractC7532l.billing.loadAd(c2881l);
                                break;
                            case 5:
                                objLoadAd2 = AbstractC7532l.adcel.loadAd(c2881l);
                                break;
                            case 6:
                                objLoadAd2 = AbstractC7532l.ads.loadAd(c2881l);
                                break;
                            default:
                                c2881l.metrica();
                                break;
                        }
                    }
                    AbstractC7532l.subscription.loadAd(c2881l);
                }
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return Integer.valueOf(c2881l.remoteconfig());
            default:
                return Long.valueOf(c2881l.vip());
        }
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        int i = this.Signature;
        C16786l c16786l = AbstractC7532l.mopub;
        C16786l c16786l2 = AbstractC7532l.isPro;
        C16786l c16786l3 = AbstractC7532l.tapsense;
        C16786l c16786l4 = AbstractC7532l.startapp;
        switch (i) {
            case 0:
                ((InterfaceC16805l) c13161l.f25776l).mo734throws(Double.doubleToLongBits(((Number) obj).doubleValue()));
                return;
            case 1:
                ((InterfaceC16805l) c13161l.f25776l).mo707for(Float.floatToIntBits(((Number) obj).floatValue()));
                return;
            case 2:
                throw new IllegalStateException("Operation not supported.");
            case 3:
                c13161l.m3578class(((Boolean) obj).booleanValue() ? 1 : 0);
                return;
            case 4:
                c13161l.m3586switch((C3844l) obj);
                return;
            case 5:
                Duration duration = (Duration) obj;
                long jRemoteconfig = remoteconfig(duration);
                if (jRemoteconfig != 0) {
                    c16786l2.admob(c13161l, 1, Long.valueOf(jRemoteconfig));
                }
                int iSmaato = smaato(duration);
                if (iSmaato != 0) {
                    c16786l.admob(c13161l, 2, Integer.valueOf(iSmaato));
                    return;
                }
                return;
            case 6:
                return;
            case 7:
                ((InterfaceC16805l) c13161l.f25776l).mo707for(((Number) obj).intValue());
                return;
            case 8:
                ((InterfaceC16805l) c13161l.f25776l).mo734throws(((Number) obj).longValue());
                return;
            case 9:
                Instant instant = (Instant) obj;
                long epochSecond = instant.getEpochSecond();
                int nano = instant.getNano();
                if (-62135596800L > epochSecond || epochSecond >= 253402300800L) {
                    C10754l.metrica(AbstractC2812l.subscription(epochSecond, "Timestamp seconds (", ") must be in range [-62135596800, 253402300799]"));
                    return;
                }
                if (nano < 0 || nano >= 1000000000) {
                    C10754l.metrica(AbstractC15560l.tapsense("Timestamp nanos (", nano, ") must be in range [0, 999999999]"));
                    return;
                }
                if (epochSecond != 0) {
                    c16786l2.admob(c13161l, 1, Long.valueOf(epochSecond));
                }
                if (nano != 0) {
                    c16786l.admob(c13161l, 2, Integer.valueOf(nano));
                    return;
                }
                return;
            case 10:
                int iIntValue = ((Number) obj).intValue();
                if (iIntValue >= 0) {
                    c13161l.m3578class(iIntValue);
                    return;
                } else {
                    c13161l.m3582interface(iIntValue);
                    return;
                }
            case 11:
                c13161l.m3582interface(((Number) obj).longValue());
                return;
            case 12:
                int iIntValue2 = ((Number) obj).intValue();
                c13161l.m3578class((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                return;
            case 13:
                long jLongValue = ((Number) obj).longValue();
                c13161l.m3582interface((jLongValue >> 63) ^ (jLongValue << 1));
                return;
            case 14:
                ((InterfaceC16805l) c13161l.f25776l).mo706finally((String) obj);
                return;
            case 15:
                List list = (List) obj;
                if (list == null) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c16786l3.admob(c13161l, 1, it.next());
                }
                return;
            case 16:
                Map map = (Map) obj;
                if (map == null) {
                    return;
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    int iFirebase = c16786l3.firebase(2, value) + c16786l4.firebase(1, str);
                    c13161l.m3578class(8 | AbstractC9361l.subscription(3));
                    c13161l.m3578class(iFirebase);
                    c16786l4.admob(c13161l, 1, str);
                    c16786l3.admob(c13161l, 2, value);
                }
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                c13161l.m3578class(0);
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                if (obj == null) {
                    AbstractC7532l.subscription.admob(c13161l, 1, obj);
                    return;
                }
                if (obj instanceof Number) {
                    AbstractC7532l.vip.admob(c13161l, 2, Double.valueOf(((Number) obj).doubleValue()));
                    return;
                }
                if (obj instanceof String) {
                    c16786l4.admob(c13161l, 3, obj);
                    return;
                }
                if (obj instanceof Boolean) {
                    AbstractC7532l.billing.admob(c13161l, 4, obj);
                    return;
                }
                if (obj instanceof Map) {
                    AbstractC7532l.adcel.admob(c13161l, 5, (Map) obj);
                    return;
                } else if (obj instanceof List) {
                    AbstractC7532l.ads.admob(c13161l, 6, obj);
                    return;
                } else {
                    C8339l.metrica(AbstractC15560l.subscription(obj, "unexpected struct value: "));
                    return;
                }
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                c13161l.m3578class(((Number) obj).intValue());
                return;
            default:
                c13161l.m3582interface(((Number) obj).longValue());
                return;
        }
    }

    @Override // defpackage.AbstractC7532l
    public void subs(C1080l c1080l, int i, Object obj) {
        int i2 = this.Signature;
        int i3 = this.amazon;
        switch (i2) {
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                c1080l.m790default(0);
                c1080l.m790default((i << 3) | AbstractC9361l.subscription(i3));
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                if (obj != null) {
                    super.subs(c1080l, i, obj);
                } else {
                    int iLicense = c1080l.license();
                    billing(c1080l, obj);
                    c1080l.m790default(c1080l.license() - iLicense);
                    c1080l.m790default((i << 3) | AbstractC9361l.subscription(i3));
                }
                break;
            default:
                super.subs(c1080l, i, obj);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16786l(int i, InterfaceC1388l interfaceC1388l, int i2, Object obj, int i3, int i4) {
        super(i, interfaceC1388l, i2, obj, i3);
        this.Signature = i4;
    }
}
