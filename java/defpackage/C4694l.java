package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.conscrypt.PSKKeyManager;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: lؘؗؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4694l implements InterfaceC9608l {
    public final int admob;
    public final int amazon;
    public final boolean billing;
    public final int crashlytics;
    public final C5018l firebase;
    public final C4736l isPro;
    public final Object[] loadAd;
    public final int[] mopub;
    public final AbstractC9446l purchase;
    public final C18328l remoteconfig;
    public final C2195l smaato;
    public final int subs;
    public final int[] yandex;
    public static final int[] vip = new int[0];
    public static final Unsafe metrica = AbstractC10176l.isPro();

    public C4694l(int[] iArr, Object[] objArr, int i, int i2, AbstractC9446l abstractC9446l, int[] iArr2, int i3, int i4, C4736l c4736l, C5018l c5018l, C2195l c2195l, C0264l c0264l, C18328l c18328l) {
        this.yandex = iArr;
        this.loadAd = objArr;
        this.crashlytics = i;
        this.amazon = i2;
        this.billing = abstractC9446l instanceof AbstractC12946l;
        this.mopub = iArr2;
        this.admob = i3;
        this.subs = i4;
        this.isPro = c4736l;
        this.firebase = c5018l;
        this.smaato = c2195l;
        this.purchase = abstractC9446l;
        this.remoteconfig = c18328l;
    }

    public static long applovin(long j, Object obj) {
        return ((Long) AbstractC10176l.crashlytics.subs(j, obj)).longValue();
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public static int m1570case(int i) {
        return (i & 267386880) >>> 20;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x035a  */
    /* JADX WARN: Code duplicated, block: B:182:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:185:0x03bb  */
    public static C4694l isVip(C15293l c15293l, C4736l c4736l, C5018l c5018l, C2195l c2195l, C0264l c0264l, C18328l c18328l) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        Object[] objArr;
        int i16;
        int i17;
        int i18;
        int i19;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i20;
        int i21;
        Field fieldM1571private;
        int i22;
        char cCharAt9;
        int i23;
        Field fieldM1571private2;
        Field fieldM1571private3;
        int i24;
        char cCharAt10;
        int i25;
        char cCharAt11;
        int i26;
        int i27;
        char cCharAt12;
        int i28;
        char cCharAt13;
        String str = c15293l.loadAd;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i29 = 1;
            while (true) {
                i = i29 + 1;
                if (str.charAt(i29) < 55296) {
                    break;
                }
                i29 = i;
            }
        } else {
            i = 1;
        }
        int i30 = i + 1;
        int iCharAt2 = str.charAt(i);
        if (iCharAt2 >= 55296) {
            int i31 = iCharAt2 & 8191;
            int i32 = 13;
            while (true) {
                i28 = i30 + 1;
                cCharAt13 = str.charAt(i30);
                if (cCharAt13 < 55296) {
                    break;
                }
                i31 |= (cCharAt13 & 8191) << i32;
                i32 += 13;
                i30 = i28;
            }
            iCharAt2 = i31 | (cCharAt13 << i32);
            i30 = i28;
        }
        if (iCharAt2 == 0) {
            i3 = 0;
            i6 = 0;
            iCharAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = vip;
            i4 = 0;
        } else {
            int i33 = i30 + 1;
            int iCharAt3 = str.charAt(i30);
            if (iCharAt3 >= 55296) {
                int i34 = iCharAt3 & 8191;
                int i35 = 13;
                while (true) {
                    i15 = i33 + 1;
                    cCharAt8 = str.charAt(i33);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i34 |= (cCharAt8 & 8191) << i35;
                    i35 += 13;
                    i33 = i15;
                }
                iCharAt3 = i34 | (cCharAt8 << i35);
                i33 = i15;
            }
            int i36 = i33 + 1;
            int iCharAt4 = str.charAt(i33);
            if (iCharAt4 >= 55296) {
                int i37 = iCharAt4 & 8191;
                int i38 = 13;
                while (true) {
                    i14 = i36 + 1;
                    cCharAt7 = str.charAt(i36);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt7 & 8191) << i38;
                    i38 += 13;
                    i36 = i14;
                }
                iCharAt4 = i37 | (cCharAt7 << i38);
                i36 = i14;
            }
            int i39 = i36 + 1;
            int iCharAt5 = str.charAt(i36);
            if (iCharAt5 >= 55296) {
                int i40 = iCharAt5 & 8191;
                int i41 = 13;
                while (true) {
                    i13 = i39 + 1;
                    cCharAt6 = str.charAt(i39);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt6 & 8191) << i41;
                    i41 += 13;
                    i39 = i13;
                }
                iCharAt5 = i40 | (cCharAt6 << i41);
                i39 = i13;
            }
            int i42 = i39 + 1;
            int iCharAt6 = str.charAt(i39);
            if (iCharAt6 >= 55296) {
                int i43 = iCharAt6 & 8191;
                int i44 = 13;
                while (true) {
                    i12 = i42 + 1;
                    cCharAt5 = str.charAt(i42);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt5 & 8191) << i44;
                    i44 += 13;
                    i42 = i12;
                }
                iCharAt6 = i43 | (cCharAt5 << i44);
                i42 = i12;
            }
            int i45 = i42 + 1;
            iCharAt = str.charAt(i42);
            if (iCharAt >= 55296) {
                int i46 = iCharAt & 8191;
                int i47 = 13;
                while (true) {
                    i11 = i45 + 1;
                    cCharAt4 = str.charAt(i45);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt4 & 8191) << i47;
                    i47 += 13;
                    i45 = i11;
                }
                iCharAt = i46 | (cCharAt4 << i47);
                i45 = i11;
            }
            int i48 = i45 + 1;
            int iCharAt7 = str.charAt(i45);
            if (iCharAt7 >= 55296) {
                int i49 = iCharAt7 & 8191;
                int i50 = 13;
                while (true) {
                    i10 = i48 + 1;
                    cCharAt3 = str.charAt(i48);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt3 & 8191) << i50;
                    i50 += 13;
                    i48 = i10;
                }
                iCharAt7 = i49 | (cCharAt3 << i50);
                i48 = i10;
            }
            int i51 = i48 + 1;
            int iCharAt8 = str.charAt(i48);
            if (iCharAt8 >= 55296) {
                int i52 = iCharAt8 & 8191;
                int i53 = 13;
                while (true) {
                    i9 = i51 + 1;
                    cCharAt2 = str.charAt(i51);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt2 & 8191) << i53;
                    i53 += 13;
                    i51 = i9;
                }
                iCharAt8 = i52 | (cCharAt2 << i53);
                i51 = i9;
            }
            int i54 = i51 + 1;
            int iCharAt9 = str.charAt(i51);
            if (iCharAt9 >= 55296) {
                int i55 = iCharAt9 & 8191;
                int i56 = 13;
                while (true) {
                    i8 = i54 + 1;
                    cCharAt = str.charAt(i54);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i55 |= (cCharAt & 8191) << i56;
                    i56 += 13;
                    i54 = i8;
                }
                iCharAt9 = i55 | (cCharAt << i56);
                i54 = i8;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i57 = (iCharAt3 * 2) + iCharAt4;
            int i58 = iCharAt7;
            i2 = iCharAt5;
            i3 = i58;
            i4 = iCharAt3;
            i30 = i54;
            iArr = iArr2;
            i5 = iCharAt6;
            i6 = i57;
            i7 = iCharAt9;
        }
        Unsafe unsafe = metrica;
        Object[] objArr2 = c15293l.crashlytics;
        Class<?> cls = c15293l.yandex.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[iCharAt * 2];
        int i59 = i7 + i3;
        int i60 = i59;
        int i61 = i7;
        int i62 = 0;
        int i63 = 0;
        while (i30 < length) {
            int i64 = i30 + 1;
            int iCharAt10 = str.charAt(i30);
            int i65 = length;
            if (iCharAt10 >= 55296) {
                int i66 = iCharAt10 & 8191;
                int i67 = i64;
                int i68 = 13;
                while (true) {
                    i27 = i67 + 1;
                    cCharAt12 = str.charAt(i67);
                    objArr = objArr2;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i66 |= (cCharAt12 & 8191) << i68;
                    i68 += 13;
                    i67 = i27;
                    objArr2 = objArr;
                }
                iCharAt10 = i66 | (cCharAt12 << i68);
                i16 = i27;
            } else {
                objArr = objArr2;
                i16 = i64;
            }
            int i69 = i16 + 1;
            int iCharAt11 = str.charAt(i16);
            if (iCharAt11 >= 55296) {
                int i70 = iCharAt11 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i25 = i71 + 1;
                    cCharAt11 = str.charAt(i71);
                    i26 = i70;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i70 = i26 | ((cCharAt11 & 8191) << i72);
                    i72 += 13;
                    i71 = i25;
                }
                iCharAt11 = i26 | (cCharAt11 << i72);
                i17 = i25;
            } else {
                i17 = i69;
            }
            int i73 = iCharAt10;
            int i74 = iCharAt11 & 255;
            int[] iArr4 = iArr3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i63] = i62;
                i63++;
            }
            int i75 = i4;
            if (i74 >= 51) {
                int i76 = i17 + 1;
                int iCharAt12 = str.charAt(i17);
                char c = 55296;
                if (iCharAt12 >= 55296) {
                    int i77 = iCharAt12 & 8191;
                    int i78 = 13;
                    while (true) {
                        i24 = i76 + 1;
                        cCharAt10 = str.charAt(i76);
                        if (cCharAt10 < c) {
                            break;
                        }
                        i77 |= (cCharAt10 & 8191) << i78;
                        i78 += 13;
                        i76 = i24;
                        c = 55296;
                    }
                    iCharAt12 = i77 | (cCharAt10 << i78);
                    i76 = i24;
                }
                int i79 = i74 - 51;
                int i80 = iCharAt12;
                if (i79 == 9 || i79 == 17) {
                    objArr3[AbstractC15560l.remoteconfig(i62, 3, 2, 1)] = objArr[i6];
                    i6++;
                } else if (i79 == 12 && (AbstractC5020l.firebase(c15293l.yandex(), 1) || (iCharAt11 & 2048) != 0)) {
                    objArr3[AbstractC15560l.remoteconfig(i62, 3, 2, 1)] = objArr[i6];
                    i6++;
                }
                int i81 = i80 * 2;
                Object obj = objArr[i81];
                if (obj instanceof Field) {
                    fieldM1571private2 = (Field) obj;
                } else {
                    fieldM1571private2 = m1571private(cls, (String) obj);
                    objArr[i81] = fieldM1571private2;
                }
                int i82 = i59;
                i19 = i6;
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM1571private2);
                int i83 = i81 + 1;
                Object obj2 = objArr[i83];
                if (obj2 instanceof Field) {
                    fieldM1571private3 = (Field) obj2;
                } else {
                    fieldM1571private3 = m1571private(cls, (String) obj2);
                    objArr[i83] = fieldM1571private3;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM1571private3);
                str = str;
                iObjectFieldOffset = iObjectFieldOffset3;
                i62 = i62;
                i20 = i76;
                iObjectFieldOffset2 = iObjectFieldOffset4;
                i18 = i82;
                i21 = 0;
            } else {
                i18 = i59;
                int i84 = i6 + 1;
                Field fieldM1571private4 = m1571private(cls, (String) objArr[i6]);
                if (i74 == 9 || i74 == 17) {
                    i18 = i18;
                    objArr3[AbstractC15560l.remoteconfig(i62, 3, 2, 1)] = fieldM1571private4.getType();
                } else {
                    if (i74 == 27 || i74 == 49) {
                        i18 = i18;
                        i23 = i6 + 2;
                        objArr3[AbstractC15560l.remoteconfig(i62, 3, 2, 1)] = objArr[i84];
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        i18 = i18;
                        if (c15293l.yandex() == 1 || (iCharAt11 & 2048) != 0) {
                            i23 = i6 + 2;
                            objArr3[AbstractC15560l.remoteconfig(i62, 3, 2, 1)] = objArr[i84];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM1571private4);
                        if ((iCharAt11 & 4096) != 0 || i74 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i20 = i17;
                            i21 = 0;
                        } else {
                            i20 = i17 + 1;
                            int iCharAt13 = str.charAt(i17);
                            if (iCharAt13 >= 55296) {
                                int i85 = iCharAt13 & 8191;
                                int i86 = 13;
                                while (true) {
                                    i22 = i20 + 1;
                                    cCharAt9 = str.charAt(i20);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i85 |= (cCharAt9 & 8191) << i86;
                                    i86 += 13;
                                    i20 = i22;
                                }
                                iCharAt13 = i85 | (cCharAt9 << i86);
                                i20 = i22;
                            }
                            int i87 = (iCharAt13 / 32) + (i75 * 2);
                            Object obj3 = objArr[i87];
                            if (obj3 instanceof Field) {
                                fieldM1571private = (Field) obj3;
                            } else {
                                fieldM1571private = m1571private(cls, (String) obj3);
                                objArr[i87] = fieldM1571private;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM1571private);
                            i21 = iCharAt13 % 32;
                        }
                        if (i74 >= 18 && i74 <= 49) {
                            iArr[i60] = iObjectFieldOffset;
                            i60++;
                        }
                    } else {
                        if (i74 == 50) {
                            int i88 = i61 + 1;
                            iArr[i61] = i62;
                            int i89 = (i62 / 3) * 2;
                            int i90 = i6 + 2;
                            objArr3[i89] = objArr[i84];
                            i61 = i88;
                            if ((iCharAt11 & 2048) != 0) {
                                i19 = i6 + 3;
                                objArr3[i89 + 1] = objArr[i90];
                            } else {
                                i19 = i90;
                            }
                        } else {
                            i18 = i18;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM1571private4);
                        if ((iCharAt11 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i20 = i17;
                            i21 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i20 = i17;
                            i21 = 0;
                        }
                        if (i74 >= 18) {
                            iArr[i60] = iObjectFieldOffset;
                            i60++;
                        }
                    }
                    i19 = i23;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM1571private4);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i20 = i17;
                        i21 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i20 = i17;
                        i21 = 0;
                    }
                    if (i74 >= 18) {
                        iArr[i60] = iObjectFieldOffset;
                        i60++;
                    }
                }
                i19 = i84;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM1571private4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i20 = i17;
                    i21 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i20 = i17;
                    i21 = 0;
                }
                if (i74 >= 18) {
                    iArr[i60] = iObjectFieldOffset;
                    i60++;
                }
            }
            int i91 = i62 + 1;
            iArr4[i62] = i73;
            int i92 = i62 + 2;
            int i93 = i62;
            iArr4[i91] = ((iCharAt11 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? 536870912 : 0) | ((iCharAt11 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? RecyclerView.UNDEFINED_DURATION : 0) | (i74 << 20) | iObjectFieldOffset;
            i62 = i93 + 3;
            iArr4[i92] = (i21 << 20) | iObjectFieldOffset2;
            i30 = i20;
            length = i65;
            iArr3 = iArr4;
            objArr2 = objArr;
            i59 = i18;
            i6 = i19;
            i4 = i75;
            str = str;
        }
        return new C4694l(iArr3, objArr3, i2, i5, c15293l.yandex, iArr, i7, i59, c4736l, c5018l, c2195l, c0264l, c18328l);
    }

    public static int premium(long j, Object obj) {
        return ((Integer) AbstractC10176l.crashlytics.subs(j, obj)).intValue();
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static Field m1571private(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbIsVip = AbstractC5020l.isVip("Field ", str, " for ");
            sbIsVip.append(cls.getName());
            sbIsVip.append(" not found. Known fields are ");
            sbIsVip.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbIsVip.toString());
        }
    }

    public static long signatures(int i) {
        return i & 1048575;
    }

    public static void smaato(Object obj) {
        if (subscription(obj)) {
            return;
        }
        C8339l.metrica(AbstractC15560l.subscription(obj, "Mutating immutable message: "));
    }

    public static boolean subscription(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC12946l) {
            return ((AbstractC12946l) obj).admob();
        }
        return true;
    }

    public final void Signature(int i, Object obj, Object obj2) {
        long jM1580switch = m1580switch(i) & 1048575;
        Object objSubs = AbstractC10176l.crashlytics.subs(jM1580switch, obj);
        C18328l c18328l = this.remoteconfig;
        if (objSubs != null) {
            c18328l.getClass();
            if (!((C10228l) objSubs).f20848l) {
                c18328l.getClass();
                C10228l c10228lCrashlytics = C10228l.f20847l.crashlytics();
                c18328l.yandex(c10228lCrashlytics, objSubs);
                AbstractC10176l.startapp(jM1580switch, obj, c10228lCrashlytics);
                objSubs = c10228lCrashlytics;
            }
        } else {
            c18328l.getClass();
            objSubs = C10228l.f20847l.crashlytics();
            AbstractC10176l.startapp(jM1580switch, obj, objSubs);
        }
        c18328l.getClass();
        c18328l.getClass();
        AbstractC12589l.m3424strictfp(obj2);
        throw null;
    }

    public final Object ad(int i, Object obj) {
        InterfaceC9608l interfaceC9608lStartapp = startapp(i);
        long jM1580switch = m1580switch(i) & 1048575;
        if (!adcel(i, obj)) {
            return interfaceC9608lStartapp.amazon();
        }
        Object object = metrica.getObject(obj, jM1580switch);
        if (subscription(object)) {
            return object;
        }
        AbstractC12946l abstractC12946lAmazon = interfaceC9608lStartapp.amazon();
        if (object != null) {
            interfaceC9608lStartapp.yandex(abstractC12946lAmazon, object);
        }
        return abstractC12946lAmazon;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0110 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0111 A[RETURN] */
    public final boolean adcel(int i, Object obj) {
        int i2 = this.yandex[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & AbstractC10176l.crashlytics.mopub(j, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iM1580switch = m1580switch(i);
        long j2 = iM1580switch & 1048575;
        switch (m1570case(iM1580switch)) {
            case 0:
                if (Double.doubleToRawLongBits(AbstractC10176l.crashlytics.purchase(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(AbstractC10176l.crashlytics.billing(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (AbstractC10176l.crashlytics.admob(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (AbstractC10176l.crashlytics.admob(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (AbstractC10176l.crashlytics.mopub(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (AbstractC10176l.crashlytics.admob(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (AbstractC10176l.crashlytics.mopub(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return AbstractC10176l.crashlytics.crashlytics(j2, obj);
            case 8:
                Object objSubs = AbstractC10176l.crashlytics.subs(j2, obj);
                if (objSubs instanceof String) {
                    return !((String) objSubs).isEmpty();
                }
                if (objSubs instanceof AbstractC16071l) {
                    return !AbstractC16071l.f31494l.equals(objSubs);
                }
                C11983l.crashlytics();
                return false;
            case 9:
                if (AbstractC10176l.crashlytics.subs(j2, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                return !AbstractC16071l.f31494l.equals(AbstractC10176l.crashlytics.subs(j2, obj));
            case 11:
                if (AbstractC10176l.crashlytics.mopub(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (AbstractC10176l.crashlytics.mopub(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (AbstractC10176l.crashlytics.mopub(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (AbstractC10176l.crashlytics.admob(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (AbstractC10176l.crashlytics.mopub(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (AbstractC10176l.crashlytics.admob(j2, obj) != 0) {
                    return true;
                }
                return false;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                if (AbstractC10176l.crashlytics.subs(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                C11983l.crashlytics();
                return false;
        }
    }

    @Override // defpackage.InterfaceC9608l
    public final void admob(Object obj, byte[] bArr, int i, int i2, C16292l c16292l) throws C0803l {
        inmobi(obj, bArr, i, i2, 0, c16292l);
    }

    public final boolean ads(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return adcel(i, obj);
        }
        return (i3 & i4) != 0;
    }

    public final Object advert(int i, int i2, Object obj) {
        InterfaceC9608l interfaceC9608lStartapp = startapp(i2);
        if (!tapsense(i, i2, obj)) {
            return interfaceC9608lStartapp.amazon();
        }
        Object object = metrica.getObject(obj, m1580switch(i2) & 1048575);
        if (subscription(object)) {
            return object;
        }
        AbstractC12946l abstractC12946lAmazon = interfaceC9608lStartapp.amazon();
        if (object != null) {
            interfaceC9608lStartapp.yandex(abstractC12946lAmazon, object);
        }
        return abstractC12946lAmazon;
    }

    @Override // defpackage.InterfaceC9608l
    public final AbstractC12946l amazon() {
        this.isPro.getClass();
        return ((AbstractC12946l) this.purchase).isPro();
    }

    public final void appmetrica(long j, Object obj, int i) {
        Unsafe unsafe = metrica;
        Object objMetrica = metrica(i);
        Object object = unsafe.getObject(obj, j);
        C18328l c18328l = this.remoteconfig;
        c18328l.getClass();
        if (!((C10228l) object).f20848l) {
            c18328l.getClass();
            C10228l c10228lCrashlytics = C10228l.f20847l.crashlytics();
            c18328l.yandex(c10228lCrashlytics, object);
            unsafe.putObject(obj, j, c10228lCrashlytics);
        }
        c18328l.getClass();
        AbstractC12589l.m3424strictfp(objMetrica);
        throw null;
    }

    @Override // defpackage.InterfaceC9608l
    public final void billing(C13161l c13161l, Object obj) {
        c13161l.getClass();
        m1573continue(c13161l, obj);
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final void m1572catch(int i, Object obj, Object obj2) {
        metrica.putObject(obj, m1580switch(i) & 1048575, obj2);
        m1575extends(i, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final void m1573continue(C13161l c13161l, Object obj) {
        int i;
        boolean z;
        C4694l c4694l = this;
        int[] iArr = c4694l.yandex;
        int length = iArr.length;
        Unsafe unsafe = metrica;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int iM1580switch = c4694l.m1580switch(i4);
            int i6 = iArr[i4];
            int iM1570case = m1570case(iM1580switch);
            if (iM1570case <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = iM1580switch & i2;
            switch (iM1570case) {
                case 0:
                    if (c4694l.ads(obj, i4, i3, i5, i)) {
                        double dPurchase = AbstractC10176l.crashlytics.purchase(j, obj);
                        AbstractC11078l abstractC11078l = (AbstractC11078l) c13161l.f25776l;
                        abstractC11078l.getClass();
                        abstractC11078l.vip(i6, Double.doubleToRawLongBits(dPurchase));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if (c4694l.ads(obj, i4, i3, i5, i)) {
                        float fBilling = AbstractC10176l.crashlytics.billing(j, obj);
                        AbstractC11078l abstractC11078l2 = (AbstractC11078l) c13161l.f25776l;
                        abstractC11078l2.getClass();
                        abstractC11078l2.smaato(i6, Float.floatToRawIntBits(fBilling));
                    }
                    c4694l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if (c4694l.ads(obj, i4, i3, i5, i)) {
                        ((AbstractC11078l) c13161l.f25776l).ad(i6, unsafe.getLong(obj, j));
                    }
                    c4694l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if (c4694l.ads(obj, i4, i3, i5, i)) {
                        ((AbstractC11078l) c13161l.f25776l).ad(i6, unsafe.getLong(obj, j));
                    }
                    c4694l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if (c4694l.ads(obj, i4, i3, i5, i)) {
                        ((AbstractC11078l) c13161l.f25776l).startapp(i6, unsafe.getInt(obj, j));
                    }
                    c4694l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if (c4694l.ads(obj, i4, i3, i5, i)) {
                        ((AbstractC11078l) c13161l.f25776l).vip(i6, unsafe.getLong(obj, j));
                    }
                    c4694l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if (c4694l.ads(obj, i4, i3, i5, i)) {
                        ((AbstractC11078l) c13161l.f25776l).smaato(i6, unsafe.getInt(obj, j));
                    }
                    c4694l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if (c4694l.ads(obj, i4, i3, i5, i)) {
                        ((AbstractC11078l) c13161l.f25776l).isPro(i6, AbstractC10176l.crashlytics.crashlytics(j, obj));
                    }
                    c4694l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if (c4694l.ads(obj, i4, i3, i5, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((AbstractC11078l) c13161l.f25776l).tapsense(i6, (String) object);
                        } else {
                            ((AbstractC11078l) c13161l.f25776l).firebase(i6, (AbstractC16071l) object);
                        }
                    }
                    c4694l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if (c4694l.ads(obj, i4, i3, i5, i)) {
                        ((AbstractC11078l) c13161l.f25776l).subscription(i6, (AbstractC9446l) unsafe.getObject(obj, j), c4694l.startapp(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if (c4694l.ads(obj, i4, i3, i5, i)) {
                        ((AbstractC11078l) c13161l.f25776l).firebase(i6, (AbstractC16071l) unsafe.getObject(obj, j));
                    }
                    c4694l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if (c4694l.ads(obj, i4, i3, i5, i)) {
                        ((AbstractC11078l) c13161l.f25776l).license(i6, unsafe.getInt(obj, j));
                    }
                    c4694l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if (c4694l.ads(obj, i4, i3, i5, i)) {
                        ((AbstractC11078l) c13161l.f25776l).startapp(i6, unsafe.getInt(obj, j));
                    }
                    c4694l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if (c4694l.ads(obj, i4, i3, i5, i)) {
                        ((AbstractC11078l) c13161l.f25776l).smaato(i6, unsafe.getInt(obj, j));
                    }
                    c4694l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if (c4694l.ads(obj, i4, i3, i5, i)) {
                        ((AbstractC11078l) c13161l.f25776l).vip(i6, unsafe.getLong(obj, j));
                    }
                    c4694l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if (c4694l.ads(obj, i4, i3, i5, i)) {
                        int i9 = unsafe.getInt(obj, j);
                        ((AbstractC11078l) c13161l.f25776l).license(i6, (i9 >> 31) ^ (i9 << 1));
                    }
                    c4694l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if (c4694l.ads(obj, i4, i3, i5, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((AbstractC11078l) c13161l.f25776l).ad(i6, (j2 >> 63) ^ (j2 << 1));
                    }
                    c4694l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (c4694l.ads(obj, i4, i3, i5, i)) {
                        c13161l.m3579continue(i6, unsafe.getObject(obj, j), c4694l.startapp(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    AbstractC9883l.vip(iArr[i4], (List) unsafe.getObject(obj, j), c13161l, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    AbstractC9883l.ads(iArr[i4], (List) unsafe.getObject(obj, j), c13161l, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    AbstractC9883l.tapsense(iArr[i4], (List) unsafe.getObject(obj, j), c13161l, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    AbstractC9883l.isVip(iArr[i4], (List) unsafe.getObject(obj, j), c13161l, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    AbstractC9883l.subscription(iArr[i4], (List) unsafe.getObject(obj, j), c13161l, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    AbstractC9883l.adcel(iArr[i4], (List) unsafe.getObject(obj, j), c13161l, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    AbstractC9883l.startapp(iArr[i4], (List) unsafe.getObject(obj, j), c13161l, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    AbstractC9883l.remoteconfig(iArr[i4], (List) unsafe.getObject(obj, j), c13161l, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    int i10 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = AbstractC9883l.yandex;
                    if (list != null && !list.isEmpty()) {
                        c13161l.getClass();
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            ((AbstractC11078l) c13161l.f25776l).tapsense(i10, (String) list.get(i11));
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    int i12 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    InterfaceC9608l interfaceC9608lStartapp = c4694l.startapp(i4);
                    Class cls2 = AbstractC9883l.yandex;
                    if (list2 != null && !list2.isEmpty()) {
                        c13161l.getClass();
                        for (int i13 = 0; i13 < list2.size(); i13++) {
                            ((AbstractC11078l) c13161l.f25776l).subscription(i12, (AbstractC9446l) list2.get(i13), interfaceC9608lStartapp);
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    int i14 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = AbstractC9883l.yandex;
                    if (list3 != null && !list3.isEmpty()) {
                        c13161l.getClass();
                        for (int i15 = 0; i15 < list3.size(); i15++) {
                            ((AbstractC11078l) c13161l.f25776l).firebase(i14, (AbstractC16071l) list3.get(i15));
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    z = false;
                    AbstractC9883l.advert(iArr[i4], (List) unsafe.getObject(obj, j), c13161l, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 30:
                    z = false;
                    AbstractC9883l.metrica(iArr[i4], (List) unsafe.getObject(obj, j), c13161l, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 31:
                    z = false;
                    AbstractC9883l.Signature(iArr[i4], (List) unsafe.getObject(obj, j), c13161l, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 32:
                    z = false;
                    AbstractC9883l.license(iArr[i4], (List) unsafe.getObject(obj, j), c13161l, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    z = false;
                    AbstractC9883l.pro(iArr[i4], (List) unsafe.getObject(obj, j), c13161l, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    z = false;
                    AbstractC9883l.ad(iArr[i4], (List) unsafe.getObject(obj, j), c13161l, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    AbstractC9883l.vip(iArr[i4], (List) unsafe.getObject(obj, j), c13161l, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    AbstractC9883l.ads(iArr[i4], (List) unsafe.getObject(obj, j), c13161l, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    AbstractC9883l.tapsense(iArr[i4], (List) unsafe.getObject(obj, j), c13161l, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    AbstractC9883l.isVip(iArr[i4], (List) unsafe.getObject(obj, j), c13161l, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    AbstractC9883l.subscription(iArr[i4], (List) unsafe.getObject(obj, j), c13161l, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    AbstractC9883l.adcel(iArr[i4], (List) unsafe.getObject(obj, j), c13161l, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    AbstractC9883l.startapp(iArr[i4], (List) unsafe.getObject(obj, j), c13161l, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    AbstractC9883l.remoteconfig(iArr[i4], (List) unsafe.getObject(obj, j), c13161l, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    AbstractC9883l.advert(iArr[i4], (List) unsafe.getObject(obj, j), c13161l, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    AbstractC9883l.metrica(iArr[i4], (List) unsafe.getObject(obj, j), c13161l, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    AbstractC9883l.Signature(iArr[i4], (List) unsafe.getObject(obj, j), c13161l, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    AbstractC9883l.license(iArr[i4], (List) unsafe.getObject(obj, j), c13161l, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    AbstractC9883l.pro(iArr[i4], (List) unsafe.getObject(obj, j), c13161l, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 48:
                    AbstractC9883l.ad(iArr[i4], (List) unsafe.getObject(obj, j), c13161l, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    int i16 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    InterfaceC9608l interfaceC9608lStartapp2 = c4694l.startapp(i4);
                    Class cls4 = AbstractC9883l.yandex;
                    if (list4 != null && !list4.isEmpty()) {
                        c13161l.getClass();
                        for (int i17 = 0; i17 < list4.size(); i17++) {
                            c13161l.m3579continue(i16, list4.get(i17), interfaceC9608lStartapp2);
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    if (unsafe.getObject(obj, j) != null) {
                        Object objMetrica = c4694l.metrica(i4);
                        c4694l.remoteconfig.getClass();
                        AbstractC12589l.m3424strictfp(objMetrica);
                        throw null;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 51:
                    if (c4694l.tapsense(i6, i4, obj)) {
                        double dDoubleValue = ((Double) AbstractC10176l.crashlytics.subs(j, obj)).doubleValue();
                        AbstractC11078l abstractC11078l3 = (AbstractC11078l) c13161l.f25776l;
                        abstractC11078l3.getClass();
                        abstractC11078l3.vip(i6, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 52:
                    if (c4694l.tapsense(i6, i4, obj)) {
                        float fFloatValue = ((Float) AbstractC10176l.crashlytics.subs(j, obj)).floatValue();
                        AbstractC11078l abstractC11078l4 = (AbstractC11078l) c13161l.f25776l;
                        abstractC11078l4.getClass();
                        abstractC11078l4.smaato(i6, Float.floatToRawIntBits(fFloatValue));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 53:
                    if (c4694l.tapsense(i6, i4, obj)) {
                        ((AbstractC11078l) c13161l.f25776l).ad(i6, applovin(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 54:
                    if (c4694l.tapsense(i6, i4, obj)) {
                        ((AbstractC11078l) c13161l.f25776l).ad(i6, applovin(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 55:
                    if (c4694l.tapsense(i6, i4, obj)) {
                        ((AbstractC11078l) c13161l.f25776l).startapp(i6, premium(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 56:
                    if (c4694l.tapsense(i6, i4, obj)) {
                        ((AbstractC11078l) c13161l.f25776l).vip(i6, applovin(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 57:
                    if (c4694l.tapsense(i6, i4, obj)) {
                        ((AbstractC11078l) c13161l.f25776l).smaato(i6, premium(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 58:
                    if (c4694l.tapsense(i6, i4, obj)) {
                        ((AbstractC11078l) c13161l.f25776l).isPro(i6, ((Boolean) AbstractC10176l.crashlytics.subs(j, obj)).booleanValue());
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 59:
                    if (c4694l.tapsense(i6, i4, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof String) {
                            ((AbstractC11078l) c13161l.f25776l).tapsense(i6, (String) object2);
                        } else {
                            ((AbstractC11078l) c13161l.f25776l).firebase(i6, (AbstractC16071l) object2);
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 60:
                    if (c4694l.tapsense(i6, i4, obj)) {
                        ((AbstractC11078l) c13161l.f25776l).subscription(i6, (AbstractC9446l) unsafe.getObject(obj, j), c4694l.startapp(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 61:
                    if (c4694l.tapsense(i6, i4, obj)) {
                        ((AbstractC11078l) c13161l.f25776l).firebase(i6, (AbstractC16071l) unsafe.getObject(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 62:
                    if (c4694l.tapsense(i6, i4, obj)) {
                        ((AbstractC11078l) c13161l.f25776l).license(i6, premium(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 63:
                    if (c4694l.tapsense(i6, i4, obj)) {
                        ((AbstractC11078l) c13161l.f25776l).startapp(i6, premium(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    if (c4694l.tapsense(i6, i4, obj)) {
                        ((AbstractC11078l) c13161l.f25776l).smaato(i6, premium(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 65:
                    if (c4694l.tapsense(i6, i4, obj)) {
                        ((AbstractC11078l) c13161l.f25776l).vip(i6, applovin(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 66:
                    if (c4694l.tapsense(i6, i4, obj)) {
                        int iPremium = premium(j, obj);
                        ((AbstractC11078l) c13161l.f25776l).license(i6, (iPremium >> 31) ^ (iPremium << 1));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 67:
                    if (c4694l.tapsense(i6, i4, obj)) {
                        long jApplovin = applovin(j, obj);
                        ((AbstractC11078l) c13161l.f25776l).ad(i6, (jApplovin << 1) ^ (jApplovin >> 63));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 68:
                    if (c4694l.tapsense(i6, i4, obj)) {
                        c13161l.m3579continue(i6, unsafe.getObject(obj, j), c4694l.startapp(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                default:
                    i4 += 3;
                    i2 = 1048575;
                    break;
            }
        }
        c4694l.smaato.getClass();
        ((AbstractC12946l) obj).unknownFields.purchase(c13161l);
    }

    @Override // defpackage.InterfaceC9608l
    public final boolean crashlytics(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.admob) {
            int i6 = this.mopub[i5];
            int[] iArr = this.yandex;
            int i7 = iArr[i6];
            int iM1580switch = m1580switch(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = metrica.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                int i11 = i4;
                i = i3;
                i2 = i11;
            }
            if ((268435456 & iM1580switch) == 0 || ads(obj, i6, i, i2, i10)) {
                int iM1570case = m1570case(iM1580switch);
                if (iM1570case == 9 || iM1570case == 17) {
                    if (ads(obj, i6, i, i2, i10)) {
                        if (!startapp(i6).crashlytics(AbstractC10176l.crashlytics.subs(iM1580switch & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                } else {
                    if (iM1570case != 27) {
                        if (iM1570case == 60 || iM1570case == 68) {
                            if (tapsense(i7, i6, obj)) {
                                if (!startapp(i6).crashlytics(AbstractC10176l.crashlytics.subs(iM1580switch & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                        } else if (iM1570case != 49) {
                            if (iM1570case != 50) {
                                continue;
                            } else {
                                Object objSubs = AbstractC10176l.crashlytics.subs(iM1580switch & 1048575, obj);
                                this.remoteconfig.getClass();
                                if (!((C10228l) objSubs).isEmpty()) {
                                    AbstractC12589l.m3424strictfp(metrica(i6));
                                    throw null;
                                }
                            }
                        }
                        i5++;
                        i3 = i;
                        i4 = i2;
                    }
                    List list = (List) AbstractC10176l.crashlytics.subs(iM1580switch & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC9608l interfaceC9608lStartapp = startapp(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (interfaceC9608lStartapp.crashlytics(list.get(i12))) {
                            }
                        }
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final void m1574else(int i, Object obj, Object obj2, int i2) {
        metrica.putObject(obj, m1580switch(i2) & 1048575, obj2);
        m1576for(i, i2, obj);
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final void m1575extends(int i, Object obj) {
        int i2 = this.yandex[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        AbstractC10176l.vip(j, obj, (1 << (i2 >>> 20)) | AbstractC10176l.crashlytics.mopub(j, obj));
    }

    public final boolean firebase(AbstractC12946l abstractC12946l, AbstractC12946l abstractC12946l2, int i) {
        return adcel(i, abstractC12946l) == adcel(i, abstractC12946l2);
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final void m1576for(int i, int i2, Object obj) {
        AbstractC10176l.vip(this.yandex[i2 + 2] & 1048575, obj, i);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12761. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int inmobi(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, defpackage.C16292l r35) throws defpackage.C0803l {
        /*
            Method dump skipped, instruction units count: 1276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4694l.inmobi(java.lang.Object, byte[], int, int, int, lٍٖٕ):int");
    }

    /* JADX WARN: Code duplicated, block: B:150:0x06be A[Catch: all -> 0x0423, TryCatch #0 {all -> 0x0423, blocks: (B:148:0x06b9, B:150:0x06be, B:151:0x06c3, B:110:0x041e, B:113:0x0426, B:114:0x0438, B:115:0x044a, B:116:0x045c, B:117:0x046e, B:118:0x0480, B:119:0x0492, B:120:0x04a4, B:121:0x04b6, B:122:0x04d0, B:123:0x04ec, B:124:0x0509, B:125:0x0526, B:126:0x0543, B:127:0x0563, B:128:0x0580, B:129:0x0595, B:130:0x05b0, B:131:0x05bd, B:132:0x05dc, B:133:0x05f9, B:134:0x0616, B:135:0x0633, B:136:0x0650, B:137:0x066d, B:138:0x068b, B:142:0x06a9), top: B:168:0x06b9 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x06ce A[LOOP:2: B:154:0x06cc->B:155:0x06ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:162:0x06e7 A[LOOP:3: B:161:0x06e5->B:162:0x06e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:164:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:197:0x06ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.InterfaceC9608l
    public final void isPro(Object obj, C12676l c12676l, C1466l c1466l) throws Throwable {
        int i;
        int i2;
        C12676l c12676l2;
        int i3;
        C4694l c4694l = this;
        Object obj2 = obj;
        C12676l c12676l3 = c12676l;
        C1466l c1466l2 = c1466l;
        c1466l2.getClass();
        smaato(obj2);
        C2195l c2195l = c4694l.smaato;
        int[] iArr = c4694l.mopub;
        int i4 = c4694l.subs;
        int i5 = c4694l.admob;
        C11788l c11788lYandex = null;
        while (true) {
            try {
                int iBilling = c12676l3.billing();
                int iM1582throw = (iBilling < c4694l.crashlytics || iBilling > c4694l.amazon) ? -1 : c4694l.m1582throw(iBilling, 0);
                if (iM1582throw >= 0) {
                    int iM1580switch = c4694l.m1580switch(iM1582throw);
                    try {
                        int iM1570case = m1570case(iM1580switch);
                        C5018l c5018l = c4694l.firebase;
                        switch (iM1570case) {
                            case 0:
                                i = i5;
                                c4694l = c4694l;
                                c12676l2 = c12676l3;
                                long jSignatures = signatures(iM1580switch);
                                c12676l2.m3487return(1);
                                Object obj3 = obj2;
                                try {
                                    AbstractC10176l.crashlytics.remoteconfig(obj3, jSignatures, ((AbstractC15029l) c12676l2.purchase).license());
                                    obj2 = obj3;
                                    c4694l.m1575extends(iM1582throw, obj2);
                                } catch (C8352l unused) {
                                    obj2 = obj3;
                                    try {
                                        c2195l.getClass();
                                        if (c11788lYandex == null) {
                                            c11788lYandex = C2195l.yandex(obj2);
                                        }
                                        if (!C2195l.loadAd(0, c12676l2, c11788lYandex)) {
                                            for (i3 = i; i3 < i4; i3++) {
                                                c4694l.remoteconfig(iArr[i3], obj2, c11788lYandex);
                                            }
                                            if (c11788lYandex == null) {
                                                return;
                                            }
                                            ((AbstractC12946l) obj2).unknownFields = c11788lYandex;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        for (i2 = i; i2 < i4; i2++) {
                                            c4694l.remoteconfig(iArr[i2], obj2, c11788lYandex);
                                        }
                                        if (c11788lYandex != null) {
                                            c2195l.getClass();
                                            ((AbstractC12946l) obj2).unknownFields = c11788lYandex;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj2 = obj3;
                                    while (i2 < i4) {
                                        c4694l.remoteconfig(iArr[i2], obj2, c11788lYandex);
                                    }
                                    if (c11788lYandex != null) {
                                        c2195l.getClass();
                                        ((AbstractC12946l) obj2).unknownFields = c11788lYandex;
                                    }
                                    throw th;
                                }
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 1:
                                i = i5;
                                c4694l = c4694l;
                                c12676l2 = c12676l3;
                                long jSignatures2 = signatures(iM1580switch);
                                c12676l2.m3487return(5);
                                AbstractC10176l.crashlytics.vip(obj2, jSignatures2, ((AbstractC15029l) c12676l2.purchase).isVip());
                                c4694l.m1575extends(iM1582throw, obj2);
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 2:
                                i = i5;
                                c4694l = c4694l;
                                c12676l2 = c12676l3;
                                long jSignatures3 = signatures(iM1580switch);
                                c12676l2.m3487return(0);
                                AbstractC10176l.metrica(jSignatures3, ((AbstractC15029l) c12676l2.purchase).premium(), obj2);
                                c4694l.m1575extends(iM1582throw, obj2);
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 3:
                                i = i5;
                                c4694l = c4694l;
                                c12676l2 = c12676l3;
                                long jSignatures4 = signatures(iM1580switch);
                                c12676l2.m3487return(0);
                                AbstractC10176l.metrica(jSignatures4, ((AbstractC15029l) c12676l2.purchase).mo1020native(), obj2);
                                c4694l.m1575extends(iM1582throw, obj2);
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 4:
                                i = i5;
                                c4694l = c4694l;
                                c12676l2 = c12676l3;
                                long jSignatures5 = signatures(iM1580switch);
                                c12676l2.m3487return(0);
                                AbstractC10176l.vip(jSignatures5, obj2, ((AbstractC15029l) c12676l2.purchase).signatures());
                                c4694l.m1575extends(iM1582throw, obj2);
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 5:
                                i = i5;
                                c4694l = c4694l;
                                c12676l2 = c12676l3;
                                long jSignatures6 = signatures(iM1580switch);
                                c12676l2.m3487return(1);
                                AbstractC10176l.metrica(jSignatures6, ((AbstractC15029l) c12676l2.purchase).advert(), obj2);
                                c4694l.m1575extends(iM1582throw, obj2);
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 6:
                                i = i5;
                                c4694l = c4694l;
                                c12676l2 = c12676l3;
                                long jSignatures7 = signatures(iM1580switch);
                                c12676l2.m3487return(5);
                                AbstractC10176l.vip(jSignatures7, obj2, ((AbstractC15029l) c12676l2.purchase).ad());
                                c4694l.m1575extends(iM1582throw, obj2);
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 7:
                                i = i5;
                                c4694l = c4694l;
                                c12676l2 = c12676l3;
                                long jSignatures8 = signatures(iM1580switch);
                                c12676l2.m3487return(0);
                                AbstractC10176l.crashlytics.firebase(obj2, jSignatures8, ((AbstractC15029l) c12676l2.purchase).subscription());
                                c4694l.m1575extends(iM1582throw, obj2);
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 8:
                                i = i5;
                                c4694l = c4694l;
                                c12676l2 = c12676l3;
                                c4694l.m1584volatile(iM1580switch, c12676l2, obj2);
                                c4694l.m1575extends(iM1582throw, obj2);
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 9:
                                C1466l c1466l3 = c1466l2;
                                i = i5;
                                c4694l = c4694l;
                                c12676l2 = c12676l3;
                                AbstractC9446l abstractC9446l = (AbstractC9446l) c4694l.ad(iM1582throw, obj2);
                                InterfaceC9608l interfaceC9608lStartapp = c4694l.startapp(iM1582throw);
                                c12676l2.m3487return(2);
                                c12676l2.smaato(abstractC9446l, interfaceC9608lStartapp, c1466l3);
                                c4694l.m1572catch(iM1582throw, obj2, abstractC9446l);
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 10:
                                i = i5;
                                c4694l = c4694l;
                                c12676l2 = c12676l3;
                                AbstractC10176l.startapp(signatures(iM1580switch), obj2, c12676l2.subscription());
                                c4694l.m1575extends(iM1582throw, obj2);
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 11:
                                i = i5;
                                c4694l = c4694l;
                                c12676l2 = c12676l3;
                                long jSignatures9 = signatures(iM1580switch);
                                c12676l2.m3487return(0);
                                AbstractC10176l.vip(jSignatures9, obj2, ((AbstractC15029l) c12676l2.purchase).mo1028volatile());
                                c4694l.m1575extends(iM1582throw, obj2);
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 12:
                                i = i5;
                                c4694l = c4694l;
                                c12676l2 = c12676l3;
                                c12676l2.m3487return(0);
                                int iPro = ((AbstractC15029l) c12676l2.purchase).pro();
                                c4694l.vip(iM1582throw);
                                AbstractC10176l.vip(signatures(iM1580switch), obj2, iPro);
                                c4694l.m1575extends(iM1582throw, obj2);
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 13:
                                i = i5;
                                c4694l = c4694l;
                                c12676l2 = c12676l3;
                                long jSignatures10 = signatures(iM1580switch);
                                c12676l2.m3487return(5);
                                AbstractC10176l.vip(jSignatures10, obj2, ((AbstractC15029l) c12676l2.purchase).applovin());
                                c4694l.m1575extends(iM1582throw, obj2);
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 14:
                                i = i5;
                                c4694l = c4694l;
                                c12676l2 = c12676l3;
                                long jSignatures11 = signatures(iM1580switch);
                                c12676l2.m3487return(1);
                                AbstractC10176l.metrica(jSignatures11, ((AbstractC15029l) c12676l2.purchase).appmetrica(), obj2);
                                c4694l.m1575extends(iM1582throw, obj2);
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 15:
                                i = i5;
                                c4694l = c4694l;
                                c12676l2 = c12676l3;
                                long jSignatures12 = signatures(iM1580switch);
                                c12676l2.m3487return(0);
                                AbstractC10176l.vip(jSignatures12, obj2, ((AbstractC15029l) c12676l2.purchase).inmobi());
                                c4694l.m1575extends(iM1582throw, obj2);
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 16:
                                i = i5;
                                c4694l = c4694l;
                                c12676l2 = c12676l3;
                                long jSignatures13 = signatures(iM1580switch);
                                c12676l2.m3487return(0);
                                AbstractC10176l.metrica(jSignatures13, ((AbstractC15029l) c12676l2.purchase).mo1027throws(), obj2);
                                c4694l.m1575extends(iM1582throw, obj2);
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                                C1466l c1466l4 = c1466l2;
                                i = i5;
                                c4694l = c4694l;
                                c12676l2 = c12676l3;
                                AbstractC9446l abstractC9446l2 = (AbstractC9446l) c4694l.ad(iM1582throw, obj2);
                                InterfaceC9608l interfaceC9608lStartapp2 = c4694l.startapp(iM1582throw);
                                c12676l2.m3487return(3);
                                c12676l2.subs(abstractC9446l2, interfaceC9608lStartapp2, c1466l4);
                                c4694l.m1572catch(iM1582throw, obj2, abstractC9446l2);
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                                i = i5;
                                c4694l = c4694l;
                                c12676l2 = c12676l3;
                                c12676l2.ad(c5018l.yandex(signatures(iM1580switch), obj2));
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                                i = i5;
                                c4694l = c4694l;
                                c12676l2 = c12676l3;
                                c12676l2.m3481native(c5018l.yandex(signatures(iM1580switch), obj2));
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 20:
                                i = i5;
                                c4694l = c4694l;
                                c12676l2 = c12676l3;
                                c12676l2.m3444else(c5018l.yandex(signatures(iM1580switch), obj2));
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 21:
                                i = i5;
                                c4694l = c4694l;
                                c12676l2 = c12676l3;
                                c12676l2.m3485protected(c5018l.yandex(signatures(iM1580switch), obj2));
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 22:
                                i = i5;
                                c4694l = c4694l;
                                c12676l2 = c12676l3;
                                c12676l2.m3448for(c5018l.yandex(signatures(iM1580switch), obj2));
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 23:
                                i = i5;
                                c4694l = c4694l;
                                c12676l2 = c12676l3;
                                c12676l2.m3492synchronized(c5018l.yandex(signatures(iM1580switch), obj2));
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                                i = i5;
                                c4694l = c4694l;
                                c12676l2 = c12676l3;
                                c12676l2.inmobi(c5018l.yandex(signatures(iM1580switch), obj2));
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                                i = i5;
                                c4694l = c4694l;
                                c12676l2 = c12676l3;
                                c12676l2.metrica(c5018l.yandex(signatures(iM1580switch), obj2));
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                                i = i5;
                                c4694l = c4694l;
                                c12676l2 = c12676l3;
                                try {
                                    c4694l.m1577native(iM1580switch, c12676l2, obj2);
                                } catch (C8352l unused2) {
                                    c2195l.getClass();
                                    if (c11788lYandex == null) {
                                        c11788lYandex = C2195l.yandex(obj2);
                                    }
                                    if (!C2195l.loadAd(0, c12676l2, c11788lYandex)) {
                                        while (i3 < i4) {
                                            c4694l.remoteconfig(iArr[i3], obj2, c11788lYandex);
                                        }
                                        if (c11788lYandex == null) {
                                            return;
                                        }
                                        ((AbstractC12946l) obj2).unknownFields = c11788lYandex;
                                    }
                                }
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                                i = i5;
                                try {
                                    try {
                                        c4694l.m1579strictfp(obj2, iM1580switch, c12676l3, c4694l.startapp(iM1582throw), c1466l);
                                        c12676l2 = c12676l3;
                                        c4694l = c4694l;
                                    } catch (C8352l unused3) {
                                        c12676l2 = c12676l3;
                                        c4694l = c4694l;
                                        c2195l.getClass();
                                        if (c11788lYandex == null) {
                                            c11788lYandex = C2195l.yandex(obj2);
                                        }
                                        if (!C2195l.loadAd(0, c12676l2, c11788lYandex)) {
                                            while (i3 < i4) {
                                                c4694l.remoteconfig(iArr[i3], obj2, c11788lYandex);
                                            }
                                            if (c11788lYandex == null) {
                                                return;
                                            }
                                            ((AbstractC12946l) obj2).unknownFields = c11788lYandex;
                                        }
                                    }
                                } catch (C8352l unused4) {
                                    c12676l2 = c12676l3;
                                    c2195l.getClass();
                                    if (c11788lYandex == null) {
                                        c11788lYandex = C2195l.yandex(obj2);
                                    }
                                    if (!C2195l.loadAd(0, c12676l2, c11788lYandex)) {
                                        while (i3 < i4) {
                                            c4694l.remoteconfig(iArr[i3], obj2, c11788lYandex);
                                        }
                                        if (c11788lYandex == null) {
                                            return;
                                        }
                                        ((AbstractC12946l) obj2).unknownFields = c11788lYandex;
                                    }
                                }
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                                i = i5;
                                c12676l3.Signature(c5018l.yandex(signatures(iM1580switch), obj2));
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                                i = i5;
                                c12676l3.m3497try(c5018l.yandex(signatures(iM1580switch), obj2));
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 30:
                                i = i5;
                                InterfaceC10996l interfaceC10996lYandex = c5018l.yandex(signatures(iM1580switch), obj2);
                                c12676l3.signatures(interfaceC10996lYandex);
                                c4694l.vip(iM1582throw);
                                AbstractC9883l.isPro(obj2, iBilling, interfaceC10996lYandex, c11788lYandex, c2195l);
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 31:
                                i = i5;
                                c12676l3.m3442continue(c5018l.yandex(signatures(iM1580switch), obj2));
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 32:
                                i = i5;
                                c12676l3.m3488static(c5018l.yandex(signatures(iM1580switch), obj2));
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                i = i5;
                                c12676l3.m3482new(c5018l.yandex(signatures(iM1580switch), obj2));
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                                i = i5;
                                c12676l3.m3451import(c5018l.yandex(signatures(iM1580switch), obj2));
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                                i = i5;
                                c12676l3.ad(c5018l.yandex(signatures(iM1580switch), obj2));
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case Maneuver.TYPE_STRAIGHT /* 36 */:
                                i = i5;
                                c12676l3.m3481native(c5018l.yandex(signatures(iM1580switch), obj2));
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                i = i5;
                                c12676l3.m3444else(c5018l.yandex(signatures(iM1580switch), obj2));
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                i = i5;
                                c12676l3.m3485protected(c5018l.yandex(signatures(iM1580switch), obj2));
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case Maneuver.TYPE_DESTINATION /* 39 */:
                                i = i5;
                                c12676l3.m3448for(c5018l.yandex(signatures(iM1580switch), obj2));
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                i = i5;
                                c12676l3.m3492synchronized(c5018l.yandex(signatures(iM1580switch), obj2));
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                i = i5;
                                c12676l3.inmobi(c5018l.yandex(signatures(iM1580switch), obj2));
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                i = i5;
                                c12676l3.metrica(c5018l.yandex(signatures(iM1580switch), obj2));
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                                i = i5;
                                c12676l3.m3497try(c5018l.yandex(signatures(iM1580switch), obj2));
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                i = i5;
                                InterfaceC10996l interfaceC10996lYandex2 = c5018l.yandex(signatures(iM1580switch), obj2);
                                c12676l3.signatures(interfaceC10996lYandex2);
                                c4694l.vip(iM1582throw);
                                AbstractC9883l.isPro(obj2, iBilling, interfaceC10996lYandex2, c11788lYandex, c2195l);
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                i = i5;
                                c12676l3.m3442continue(c5018l.yandex(signatures(iM1580switch), obj2));
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                i = i5;
                                c12676l3.m3488static(c5018l.yandex(signatures(iM1580switch), obj2));
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                i = i5;
                                c12676l3.m3482new(c5018l.yandex(signatures(iM1580switch), obj2));
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 48:
                                i = i5;
                                c12676l3.m3451import(c5018l.yandex(signatures(iM1580switch), obj2));
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                i = i5;
                                try {
                                    try {
                                        c4694l.m1581synchronized(obj2, signatures(iM1580switch), c12676l, c4694l.startapp(iM1582throw), c1466l);
                                        c12676l3 = c12676l;
                                        c12676l2 = c12676l3;
                                    } catch (C8352l unused5) {
                                        c4694l = c4694l;
                                        c12676l2 = c12676l;
                                        c2195l.getClass();
                                        if (c11788lYandex == null) {
                                            c11788lYandex = C2195l.yandex(obj2);
                                        }
                                        if (!C2195l.loadAd(0, c12676l2, c11788lYandex)) {
                                            while (i3 < i4) {
                                                c4694l.remoteconfig(iArr[i3], obj2, c11788lYandex);
                                            }
                                            if (c11788lYandex == null) {
                                                return;
                                            }
                                            ((AbstractC12946l) obj2).unknownFields = c11788lYandex;
                                        }
                                    }
                                } catch (C8352l unused6) {
                                    c12676l2 = c12676l;
                                    c4694l = c4694l;
                                    c2195l.getClass();
                                    if (c11788lYandex == null) {
                                        c11788lYandex = C2195l.yandex(obj2);
                                    }
                                    if (!C2195l.loadAd(0, c12676l2, c11788lYandex)) {
                                        while (i3 < i4) {
                                            c4694l.remoteconfig(iArr[i3], obj2, c11788lYandex);
                                        }
                                        if (c11788lYandex == null) {
                                            return;
                                        }
                                        ((AbstractC12946l) obj2).unknownFields = c11788lYandex;
                                    }
                                    c4694l = c4694l;
                                    c12676l3 = c12676l2;
                                    i5 = i;
                                    c1466l2 = c1466l;
                                    break;
                                }
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                i = i5;
                                c4694l.Signature(iM1582throw, obj2, c4694l.metrica(iM1582throw));
                                throw null;
                            case 51:
                                i = i5;
                                long jSignatures14 = signatures(iM1580switch);
                                c12676l3.m3487return(1);
                                AbstractC10176l.startapp(jSignatures14, obj2, Double.valueOf(((AbstractC15029l) c12676l3.purchase).license()));
                                c4694l.m1576for(iBilling, iM1582throw, obj2);
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 52:
                                i = i5;
                                long jSignatures15 = signatures(iM1580switch);
                                c12676l3.m3487return(5);
                                AbstractC10176l.startapp(jSignatures15, obj2, Float.valueOf(((AbstractC15029l) c12676l3.purchase).isVip()));
                                c4694l.m1576for(iBilling, iM1582throw, obj2);
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 53:
                                i = i5;
                                long jSignatures16 = signatures(iM1580switch);
                                c12676l3.m3487return(0);
                                AbstractC10176l.startapp(jSignatures16, obj2, Long.valueOf(((AbstractC15029l) c12676l3.purchase).premium()));
                                c4694l.m1576for(iBilling, iM1582throw, obj2);
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 54:
                                i = i5;
                                long jSignatures17 = signatures(iM1580switch);
                                c12676l3.m3487return(0);
                                AbstractC10176l.startapp(jSignatures17, obj2, Long.valueOf(((AbstractC15029l) c12676l3.purchase).mo1020native()));
                                c4694l.m1576for(iBilling, iM1582throw, obj2);
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 55:
                                i = i5;
                                long jSignatures18 = signatures(iM1580switch);
                                c12676l3.m3487return(0);
                                AbstractC10176l.startapp(jSignatures18, obj2, Integer.valueOf(((AbstractC15029l) c12676l3.purchase).signatures()));
                                c4694l.m1576for(iBilling, iM1582throw, obj2);
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 56:
                                i = i5;
                                long jSignatures19 = signatures(iM1580switch);
                                c12676l3.m3487return(1);
                                AbstractC10176l.startapp(jSignatures19, obj2, Long.valueOf(((AbstractC15029l) c12676l3.purchase).advert()));
                                c4694l.m1576for(iBilling, iM1582throw, obj2);
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 57:
                                i = i5;
                                long jSignatures20 = signatures(iM1580switch);
                                c12676l3.m3487return(5);
                                AbstractC10176l.startapp(jSignatures20, obj2, Integer.valueOf(((AbstractC15029l) c12676l3.purchase).ad()));
                                c4694l.m1576for(iBilling, iM1582throw, obj2);
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 58:
                                i = i5;
                                long jSignatures21 = signatures(iM1580switch);
                                c12676l3.m3487return(0);
                                AbstractC10176l.startapp(jSignatures21, obj2, Boolean.valueOf(((AbstractC15029l) c12676l3.purchase).subscription()));
                                c4694l.m1576for(iBilling, iM1582throw, obj2);
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 59:
                                i = i5;
                                c4694l.m1584volatile(iM1580switch, c12676l3, obj2);
                                c4694l.m1576for(iBilling, iM1582throw, obj2);
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 60:
                                i = i5;
                                AbstractC9446l abstractC9446l3 = (AbstractC9446l) c4694l.advert(iBilling, iM1582throw, obj2);
                                InterfaceC9608l interfaceC9608lStartapp3 = c4694l.startapp(iM1582throw);
                                c12676l3.m3487return(2);
                                c12676l3.smaato(abstractC9446l3, interfaceC9608lStartapp3, c1466l2);
                                c4694l.m1574else(iBilling, obj2, abstractC9446l3, iM1582throw);
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 61:
                                i = i5;
                                AbstractC10176l.startapp(signatures(iM1580switch), obj2, c12676l3.subscription());
                                c4694l.m1576for(iBilling, iM1582throw, obj2);
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 62:
                                i = i5;
                                long jSignatures22 = signatures(iM1580switch);
                                c12676l3.m3487return(0);
                                AbstractC10176l.startapp(jSignatures22, obj2, Integer.valueOf(((AbstractC15029l) c12676l3.purchase).mo1028volatile()));
                                c4694l.m1576for(iBilling, iM1582throw, obj2);
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 63:
                                i = i5;
                                c12676l3.m3487return(0);
                                int iPro2 = ((AbstractC15029l) c12676l3.purchase).pro();
                                c4694l.vip(iM1582throw);
                                AbstractC10176l.startapp(signatures(iM1580switch), obj2, Integer.valueOf(iPro2));
                                c4694l.m1576for(iBilling, iM1582throw, obj2);
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                                i = i5;
                                long jSignatures23 = signatures(iM1580switch);
                                c12676l3.m3487return(5);
                                AbstractC10176l.startapp(jSignatures23, obj2, Integer.valueOf(((AbstractC15029l) c12676l3.purchase).applovin()));
                                c4694l.m1576for(iBilling, iM1582throw, obj2);
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 65:
                                i = i5;
                                long jSignatures24 = signatures(iM1580switch);
                                c12676l3.m3487return(1);
                                AbstractC10176l.startapp(jSignatures24, obj2, Long.valueOf(((AbstractC15029l) c12676l3.purchase).appmetrica()));
                                c4694l.m1576for(iBilling, iM1582throw, obj2);
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 66:
                                i = i5;
                                long jSignatures25 = signatures(iM1580switch);
                                c12676l3.m3487return(0);
                                AbstractC10176l.startapp(jSignatures25, obj2, Integer.valueOf(((AbstractC15029l) c12676l3.purchase).inmobi()));
                                c4694l.m1576for(iBilling, iM1582throw, obj2);
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 67:
                                i = i5;
                                try {
                                    try {
                                        long jSignatures26 = signatures(iM1580switch);
                                        c12676l3.m3487return(0);
                                        AbstractC10176l.startapp(jSignatures26, obj2, Long.valueOf(((AbstractC15029l) c12676l3.purchase).mo1027throws()));
                                        c4694l.m1576for(iBilling, iM1582throw, obj2);
                                        c12676l2 = c12676l3;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        c4694l = c4694l;
                                        while (i2 < i4) {
                                            c4694l.remoteconfig(iArr[i2], obj2, c11788lYandex);
                                        }
                                        if (c11788lYandex != null) {
                                            c2195l.getClass();
                                            ((AbstractC12946l) obj2).unknownFields = c11788lYandex;
                                        }
                                        throw th;
                                    }
                                } catch (C8352l unused7) {
                                    c12676l2 = c12676l3;
                                    c2195l.getClass();
                                    if (c11788lYandex == null) {
                                        c11788lYandex = C2195l.yandex(obj2);
                                    }
                                    if (!C2195l.loadAd(0, c12676l2, c11788lYandex)) {
                                        while (i3 < i4) {
                                            c4694l.remoteconfig(iArr[i3], obj2, c11788lYandex);
                                        }
                                        if (c11788lYandex == null) {
                                            return;
                                        }
                                        ((AbstractC12946l) obj2).unknownFields = c11788lYandex;
                                    }
                                }
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            case 68:
                                AbstractC9446l abstractC9446l4 = (AbstractC9446l) c4694l.advert(iBilling, iM1582throw, obj2);
                                InterfaceC9608l interfaceC9608lStartapp4 = c4694l.startapp(iM1582throw);
                                c12676l3.m3487return(3);
                                c12676l3.subs(abstractC9446l4, interfaceC9608lStartapp4, c1466l2);
                                c4694l.m1574else(iBilling, obj2, abstractC9446l4, iM1582throw);
                                i = i5;
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                            default:
                                if (c11788lYandex == null) {
                                    try {
                                        c2195l.getClass();
                                        c11788lYandex = C2195l.yandex(obj2);
                                    } catch (C8352l unused8) {
                                        i = i5;
                                        c12676l2 = c12676l3;
                                        c2195l.getClass();
                                        if (c11788lYandex == null) {
                                            c11788lYandex = C2195l.yandex(obj2);
                                        }
                                        if (!C2195l.loadAd(0, c12676l2, c11788lYandex)) {
                                            while (i3 < i4) {
                                                c4694l.remoteconfig(iArr[i3], obj2, c11788lYandex);
                                            }
                                            if (c11788lYandex == null) {
                                                return;
                                            }
                                            ((AbstractC12946l) obj2).unknownFields = c11788lYandex;
                                        }
                                    }
                                }
                                c2195l.getClass();
                                if (!C2195l.loadAd(0, c12676l3, c11788lYandex)) {
                                    while (i5 < i4) {
                                        c4694l.remoteconfig(iArr[i5], obj2, c11788lYandex);
                                        i5++;
                                    }
                                    if (c11788lYandex == null) {
                                        return;
                                    }
                                }
                                i = i5;
                                c12676l2 = c12676l3;
                                c4694l = c4694l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c1466l2 = c1466l;
                                break;
                        }
                    } catch (C8352l unused9) {
                        i = i5;
                    }
                } else if (iBilling == Integer.MAX_VALUE) {
                    while (i5 < i4) {
                        c4694l.remoteconfig(iArr[i5], obj2, c11788lYandex);
                        i5++;
                    }
                    if (c11788lYandex == null) {
                        return;
                    } else {
                        c2195l.getClass();
                    }
                } else {
                    c2195l.getClass();
                    if (c11788lYandex == null) {
                        c11788lYandex = C2195l.yandex(obj2);
                    }
                    if (!C2195l.loadAd(0, c12676l3, c11788lYandex)) {
                        while (i5 < i4) {
                            c4694l.remoteconfig(iArr[i5], obj2, c11788lYandex);
                            i5++;
                        }
                        if (c11788lYandex == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                c4694l = c4694l;
                i = i5;
            }
        }
        ((AbstractC12946l) obj2).unknownFields = c11788lYandex;
    }

    public final void license(int i, Object obj, Object obj2) {
        if (adcel(i, obj2)) {
            long jM1580switch = m1580switch(i) & 1048575;
            Unsafe unsafe = metrica;
            Object object = unsafe.getObject(obj2, jM1580switch);
            if (object == null) {
                C6541l.billing(this.yandex[i], obj2);
                return;
            }
            InterfaceC9608l interfaceC9608lStartapp = startapp(i);
            if (!adcel(i, obj)) {
                if (subscription(object)) {
                    AbstractC12946l abstractC12946lAmazon = interfaceC9608lStartapp.amazon();
                    interfaceC9608lStartapp.yandex(abstractC12946lAmazon, object);
                    unsafe.putObject(obj, jM1580switch, abstractC12946lAmazon);
                } else {
                    unsafe.putObject(obj, jM1580switch, object);
                }
                m1575extends(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM1580switch);
            if (!subscription(object2)) {
                AbstractC12946l abstractC12946lAmazon2 = interfaceC9608lStartapp.amazon();
                interfaceC9608lStartapp.yandex(abstractC12946lAmazon2, object2);
                unsafe.putObject(obj, jM1580switch, abstractC12946lAmazon2);
                object2 = abstractC12946lAmazon2;
            }
            interfaceC9608lStartapp.yandex(object2, object);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[SYNTHETIC] */
    @Override // defpackage.InterfaceC9608l
    public final void loadAd(Object obj) {
        if (subscription(obj)) {
            if (obj instanceof AbstractC12946l) {
                AbstractC12946l abstractC12946l = (AbstractC12946l) obj;
                abstractC12946l.smaato(Alert.DURATION_SHOW_INDEFINITELY);
                abstractC12946l.memoizedHashCode = 0;
                abstractC12946l.subs();
            }
            int[] iArr = this.yandex;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iM1580switch = m1580switch(i);
                long j = 1048575 & iM1580switch;
                int iM1570case = m1570case(iM1580switch);
                if (iM1570case != 9) {
                    if (iM1570case != 60 && iM1570case != 68) {
                        switch (iM1570case) {
                            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                                if (adcel(i, obj)) {
                                    startapp(i).loadAd(metrica.getObject(obj, j));
                                }
                                break;
                            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                            case 30:
                            case 31:
                            case 32:
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                            case Maneuver.TYPE_STRAIGHT /* 36 */:
                            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                            case Maneuver.TYPE_DESTINATION /* 39 */:
                            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                            case 48:
                            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                this.firebase.getClass();
                                AbstractC0853l abstractC0853l = (AbstractC0853l) ((InterfaceC10996l) AbstractC10176l.crashlytics.subs(j, obj));
                                if (abstractC0853l.f2503l) {
                                    abstractC0853l.f2503l = false;
                                }
                                break;
                            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                Unsafe unsafe = metrica;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.remoteconfig.getClass();
                                    ((C10228l) object).f20848l = false;
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (tapsense(iArr[i], i, obj)) {
                        startapp(i).loadAd(metrica.getObject(obj, j));
                    }
                } else if (adcel(i, obj)) {
                    startapp(i).loadAd(metrica.getObject(obj, j));
                }
            }
            this.smaato.getClass();
            C11788l c11788l = ((AbstractC12946l) obj).unknownFields;
            if (c11788l.purchase) {
                c11788l.purchase = false;
            }
        }
    }

    public final Object metrica(int i) {
        return this.loadAd[(i / 3) * 2];
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.InterfaceC9608l
    public final int mopub(AbstractC12946l abstractC12946l) {
        int i;
        int iLoadAd;
        int i2;
        int[] iArr = this.yandex;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iM1580switch = m1580switch(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iM1580switch;
            int i6 = 1237;
            int iHashCode = 37;
            switch (m1570case(iM1580switch)) {
                case 0:
                    i = i3 * 53;
                    iLoadAd = AbstractC6320l.loadAd(Double.doubleToLongBits(AbstractC10176l.crashlytics.purchase(j, abstractC12946l)));
                    i3 = iLoadAd + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iLoadAd = Float.floatToIntBits(AbstractC10176l.crashlytics.billing(j, abstractC12946l));
                    i3 = iLoadAd + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iLoadAd = AbstractC6320l.loadAd(AbstractC10176l.crashlytics.admob(j, abstractC12946l));
                    i3 = iLoadAd + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iLoadAd = AbstractC6320l.loadAd(AbstractC10176l.crashlytics.admob(j, abstractC12946l));
                    i3 = iLoadAd + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iLoadAd = AbstractC10176l.crashlytics.mopub(j, abstractC12946l);
                    i3 = iLoadAd + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iLoadAd = AbstractC6320l.loadAd(AbstractC10176l.crashlytics.admob(j, abstractC12946l));
                    i3 = iLoadAd + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iLoadAd = AbstractC10176l.crashlytics.mopub(j, abstractC12946l);
                    i3 = iLoadAd + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zCrashlytics = AbstractC10176l.crashlytics.crashlytics(j, abstractC12946l);
                    Charset charset = AbstractC6320l.yandex;
                    if (zCrashlytics) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iLoadAd = ((String) AbstractC10176l.crashlytics.subs(j, abstractC12946l)).hashCode();
                    i3 = iLoadAd + i;
                    break;
                case 9:
                    Object objSubs = AbstractC10176l.crashlytics.subs(j, abstractC12946l);
                    if (objSubs != null) {
                        iHashCode = objSubs.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iLoadAd = AbstractC10176l.crashlytics.subs(j, abstractC12946l).hashCode();
                    i3 = iLoadAd + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iLoadAd = AbstractC10176l.crashlytics.mopub(j, abstractC12946l);
                    i3 = iLoadAd + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iLoadAd = AbstractC10176l.crashlytics.mopub(j, abstractC12946l);
                    i3 = iLoadAd + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iLoadAd = AbstractC10176l.crashlytics.mopub(j, abstractC12946l);
                    i3 = iLoadAd + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iLoadAd = AbstractC6320l.loadAd(AbstractC10176l.crashlytics.admob(j, abstractC12946l));
                    i3 = iLoadAd + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iLoadAd = AbstractC10176l.crashlytics.mopub(j, abstractC12946l);
                    i3 = iLoadAd + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iLoadAd = AbstractC6320l.loadAd(AbstractC10176l.crashlytics.admob(j, abstractC12946l));
                    i3 = iLoadAd + i;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    Object objSubs2 = AbstractC10176l.crashlytics.subs(j, abstractC12946l);
                    if (objSubs2 != null) {
                        iHashCode = objSubs2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                case 20:
                case 21:
                case 22:
                case 23:
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                case 30:
                case 31:
                case 32:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                case 48:
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    i = i3 * 53;
                    iLoadAd = AbstractC10176l.crashlytics.subs(j, abstractC12946l).hashCode();
                    i3 = iLoadAd + i;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    i = i3 * 53;
                    iLoadAd = AbstractC10176l.crashlytics.subs(j, abstractC12946l).hashCode();
                    i3 = iLoadAd + i;
                    break;
                case 51:
                    if (tapsense(i5, i4, abstractC12946l)) {
                        i = i3 * 53;
                        iLoadAd = AbstractC6320l.loadAd(Double.doubleToLongBits(((Double) AbstractC10176l.crashlytics.subs(j, abstractC12946l)).doubleValue()));
                        i3 = iLoadAd + i;
                    }
                    break;
                case 52:
                    if (tapsense(i5, i4, abstractC12946l)) {
                        i = i3 * 53;
                        iLoadAd = Float.floatToIntBits(((Float) AbstractC10176l.crashlytics.subs(j, abstractC12946l)).floatValue());
                        i3 = iLoadAd + i;
                    }
                    break;
                case 53:
                    if (tapsense(i5, i4, abstractC12946l)) {
                        i = i3 * 53;
                        iLoadAd = AbstractC6320l.loadAd(applovin(j, abstractC12946l));
                        i3 = iLoadAd + i;
                    }
                    break;
                case 54:
                    if (tapsense(i5, i4, abstractC12946l)) {
                        i = i3 * 53;
                        iLoadAd = AbstractC6320l.loadAd(applovin(j, abstractC12946l));
                        i3 = iLoadAd + i;
                    }
                    break;
                case 55:
                    if (tapsense(i5, i4, abstractC12946l)) {
                        i = i3 * 53;
                        iLoadAd = premium(j, abstractC12946l);
                        i3 = iLoadAd + i;
                    }
                    break;
                case 56:
                    if (tapsense(i5, i4, abstractC12946l)) {
                        i = i3 * 53;
                        iLoadAd = AbstractC6320l.loadAd(applovin(j, abstractC12946l));
                        i3 = iLoadAd + i;
                    }
                    break;
                case 57:
                    if (tapsense(i5, i4, abstractC12946l)) {
                        i = i3 * 53;
                        iLoadAd = premium(j, abstractC12946l);
                        i3 = iLoadAd + i;
                    }
                    break;
                case 58:
                    if (tapsense(i5, i4, abstractC12946l)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) AbstractC10176l.crashlytics.subs(j, abstractC12946l)).booleanValue();
                        Charset charset2 = AbstractC6320l.yandex;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (tapsense(i5, i4, abstractC12946l)) {
                        i = i3 * 53;
                        iLoadAd = ((String) AbstractC10176l.crashlytics.subs(j, abstractC12946l)).hashCode();
                        i3 = iLoadAd + i;
                    }
                    break;
                case 60:
                    if (tapsense(i5, i4, abstractC12946l)) {
                        i = i3 * 53;
                        iLoadAd = AbstractC10176l.crashlytics.subs(j, abstractC12946l).hashCode();
                        i3 = iLoadAd + i;
                    }
                    break;
                case 61:
                    if (tapsense(i5, i4, abstractC12946l)) {
                        i = i3 * 53;
                        iLoadAd = AbstractC10176l.crashlytics.subs(j, abstractC12946l).hashCode();
                        i3 = iLoadAd + i;
                    }
                    break;
                case 62:
                    if (tapsense(i5, i4, abstractC12946l)) {
                        i = i3 * 53;
                        iLoadAd = premium(j, abstractC12946l);
                        i3 = iLoadAd + i;
                    }
                    break;
                case 63:
                    if (tapsense(i5, i4, abstractC12946l)) {
                        i = i3 * 53;
                        iLoadAd = premium(j, abstractC12946l);
                        i3 = iLoadAd + i;
                    }
                    break;
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    if (tapsense(i5, i4, abstractC12946l)) {
                        i = i3 * 53;
                        iLoadAd = premium(j, abstractC12946l);
                        i3 = iLoadAd + i;
                    }
                    break;
                case 65:
                    if (tapsense(i5, i4, abstractC12946l)) {
                        i = i3 * 53;
                        iLoadAd = AbstractC6320l.loadAd(applovin(j, abstractC12946l));
                        i3 = iLoadAd + i;
                    }
                    break;
                case 66:
                    if (tapsense(i5, i4, abstractC12946l)) {
                        i = i3 * 53;
                        iLoadAd = premium(j, abstractC12946l);
                        i3 = iLoadAd + i;
                    }
                    break;
                case 67:
                    if (tapsense(i5, i4, abstractC12946l)) {
                        i = i3 * 53;
                        iLoadAd = AbstractC6320l.loadAd(applovin(j, abstractC12946l));
                        i3 = iLoadAd + i;
                    }
                    break;
                case 68:
                    if (tapsense(i5, i4, abstractC12946l)) {
                        i = i3 * 53;
                        iLoadAd = AbstractC10176l.crashlytics.subs(j, abstractC12946l).hashCode();
                        i3 = iLoadAd + i;
                    }
                    break;
            }
        }
        this.smaato.getClass();
        return abstractC12946l.unknownFields.hashCode() + (i3 * 53);
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final void m1577native(int i, C12676l c12676l, Object obj) throws C8236l, C5347l, C8352l {
        boolean z = (536870912 & i) != 0;
        C5018l c5018l = this.firebase;
        if (z) {
            c12676l.m3486public(c5018l.yandex(i & 1048575, obj), true);
        } else {
            c12676l.m3486public(c5018l.yandex(i & 1048575, obj), false);
        }
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final int m1578package(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, long j, int i6, long j2, C16292l c16292l) throws C0803l {
        int iFirebase;
        int i7;
        int i8;
        int iSmaato;
        Unsafe unsafe = metrica;
        InterfaceC10996l interfaceC10996lYandex = (InterfaceC10996l) unsafe.getObject(obj, j2);
        if (!((AbstractC0853l) interfaceC10996lYandex).f2503l) {
            int size = interfaceC10996lYandex.size();
            interfaceC10996lYandex = interfaceC10996lYandex.yandex(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, interfaceC10996lYandex);
        }
        InterfaceC10996l interfaceC10996l = interfaceC10996lYandex;
        switch (i6) {
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                if (i4 == 2) {
                    AbstractC2583l abstractC2583l = (AbstractC2583l) interfaceC10996l;
                    int iFirebase2 = AbstractC11184l.firebase(bArr, i, c16292l);
                    int i9 = c16292l.yandex + iFirebase2;
                    while (iFirebase2 < i9) {
                        abstractC2583l.billing(Double.longBitsToDouble(AbstractC11184l.mopub(iFirebase2, bArr)));
                        iFirebase2 += 8;
                    }
                    if (iFirebase2 == i9) {
                        return iFirebase2;
                    }
                    throw C0803l.mopub();
                }
                if (i4 != 1) {
                    return i;
                }
                AbstractC2583l abstractC2583l2 = (AbstractC2583l) interfaceC10996l;
                abstractC2583l2.billing(Double.longBitsToDouble(AbstractC11184l.mopub(i, bArr)));
                int i10 = i + 8;
                while (i10 < i2) {
                    int iFirebase3 = AbstractC11184l.firebase(bArr, i10, c16292l);
                    if (i3 != c16292l.yandex) {
                        return i10;
                    }
                    abstractC2583l2.billing(Double.longBitsToDouble(AbstractC11184l.mopub(iFirebase3, bArr)));
                    i10 = iFirebase3 + 8;
                }
                return i10;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case Maneuver.TYPE_STRAIGHT /* 36 */:
                if (i4 == 2) {
                    AbstractC3191l abstractC3191l = (AbstractC3191l) interfaceC10996l;
                    int iFirebase4 = AbstractC11184l.firebase(bArr, i, c16292l);
                    int i11 = c16292l.yandex + iFirebase4;
                    while (iFirebase4 < i11) {
                        abstractC3191l.billing(Float.intBitsToFloat(AbstractC11184l.billing(iFirebase4, bArr)));
                        iFirebase4 += 4;
                    }
                    if (iFirebase4 == i11) {
                        return iFirebase4;
                    }
                    throw C0803l.mopub();
                }
                if (i4 != 5) {
                    return i;
                }
                AbstractC3191l abstractC3191l2 = (AbstractC3191l) interfaceC10996l;
                abstractC3191l2.billing(Float.intBitsToFloat(AbstractC11184l.billing(i, bArr)));
                int i12 = i + 4;
                while (i12 < i2) {
                    int iFirebase5 = AbstractC11184l.firebase(bArr, i12, c16292l);
                    if (i3 != c16292l.yandex) {
                        return i12;
                    }
                    abstractC3191l2.billing(Float.intBitsToFloat(AbstractC11184l.billing(iFirebase5, bArr)));
                    i12 = iFirebase5 + 4;
                }
                return i12;
            case 20:
            case 21:
            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                if (i4 == 2) {
                    AbstractC8563l abstractC8563l = (AbstractC8563l) interfaceC10996l;
                    int iFirebase6 = AbstractC11184l.firebase(bArr, i, c16292l);
                    int i13 = c16292l.yandex + iFirebase6;
                    while (iFirebase6 < i13) {
                        iFirebase6 = AbstractC11184l.remoteconfig(bArr, iFirebase6, c16292l);
                        abstractC8563l.billing(c16292l.loadAd);
                    }
                    if (iFirebase6 == i13) {
                        return iFirebase6;
                    }
                    throw C0803l.mopub();
                }
                if (i4 != 0) {
                    return i;
                }
                AbstractC8563l abstractC8563l2 = (AbstractC8563l) interfaceC10996l;
                int iRemoteconfig = AbstractC11184l.remoteconfig(bArr, i, c16292l);
                abstractC8563l2.billing(c16292l.loadAd);
                while (iRemoteconfig < i2) {
                    int iFirebase7 = AbstractC11184l.firebase(bArr, iRemoteconfig, c16292l);
                    if (i3 != c16292l.yandex) {
                        return iRemoteconfig;
                    }
                    iRemoteconfig = AbstractC11184l.remoteconfig(bArr, iFirebase7, c16292l);
                    abstractC8563l2.billing(c16292l.loadAd);
                }
                return iRemoteconfig;
            case 22:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case Maneuver.TYPE_DESTINATION /* 39 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                iFirebase = i;
                if (i4 == 2) {
                    C2577l c2577l = (C2577l) interfaceC10996l;
                    int iFirebase8 = AbstractC11184l.firebase(bArr, i, c16292l);
                    int i14 = c16292l.yandex + iFirebase8;
                    while (iFirebase8 < i14) {
                        iFirebase8 = AbstractC11184l.firebase(bArr, iFirebase8, c16292l);
                        c2577l.billing(c16292l.yandex);
                    }
                    if (iFirebase8 == i14) {
                        return iFirebase8;
                    }
                    throw C0803l.mopub();
                }
                if (i4 == 0) {
                    return AbstractC11184l.smaato(i3, bArr, iFirebase, i2, interfaceC10996l, c16292l);
                }
                break;
            case 23:
            case 32:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                iFirebase = i;
                if (i4 == 2) {
                    AbstractC8563l abstractC8563l3 = (AbstractC8563l) interfaceC10996l;
                    int iFirebase9 = AbstractC11184l.firebase(bArr, i, c16292l);
                    int i15 = c16292l.yandex + iFirebase9;
                    while (iFirebase9 < i15) {
                        abstractC8563l3.billing(AbstractC11184l.mopub(iFirebase9, bArr));
                        iFirebase9 += 8;
                    }
                    if (iFirebase9 == i15) {
                        return iFirebase9;
                    }
                    throw C0803l.mopub();
                }
                if (i4 == 1) {
                    AbstractC8563l abstractC8563l4 = (AbstractC8563l) interfaceC10996l;
                    abstractC8563l4.billing(AbstractC11184l.mopub(i, bArr));
                    while (true) {
                        i7 = iFirebase + 8;
                        if (i7 < i2) {
                            iFirebase = AbstractC11184l.firebase(bArr, i7, c16292l);
                            if (i3 == c16292l.yandex) {
                                abstractC8563l4.billing(AbstractC11184l.mopub(iFirebase, bArr));
                            }
                        }
                    }
                    return i7;
                }
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case 31:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                iFirebase = i;
                if (i4 == 2) {
                    C2577l c2577l2 = (C2577l) interfaceC10996l;
                    int iFirebase10 = AbstractC11184l.firebase(bArr, i, c16292l);
                    int i16 = c16292l.yandex + iFirebase10;
                    while (iFirebase10 < i16) {
                        c2577l2.billing(AbstractC11184l.billing(iFirebase10, bArr));
                        iFirebase10 += 4;
                    }
                    if (iFirebase10 == i16) {
                        return iFirebase10;
                    }
                    throw C0803l.mopub();
                }
                if (i4 == 5) {
                    C2577l c2577l3 = (C2577l) interfaceC10996l;
                    c2577l3.billing(AbstractC11184l.billing(i, bArr));
                    while (true) {
                        i8 = iFirebase + 4;
                        if (i8 < i2) {
                            iFirebase = AbstractC11184l.firebase(bArr, i8, c16292l);
                            if (i3 == c16292l.yandex) {
                                c2577l3.billing(AbstractC11184l.billing(iFirebase, bArr));
                            }
                        }
                    }
                    return i8;
                }
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                iFirebase = i;
                if (i4 == 2) {
                    AbstractC16329l abstractC16329l = (AbstractC16329l) interfaceC10996l;
                    int iFirebase11 = AbstractC11184l.firebase(bArr, i, c16292l);
                    int i17 = c16292l.yandex + iFirebase11;
                    while (iFirebase11 < i17) {
                        iFirebase11 = AbstractC11184l.remoteconfig(bArr, iFirebase11, c16292l);
                        abstractC16329l.billing(c16292l.loadAd != 0);
                    }
                    if (iFirebase11 == i17) {
                        return iFirebase11;
                    }
                    throw C0803l.mopub();
                }
                if (i4 == 0) {
                    AbstractC16329l abstractC16329l2 = (AbstractC16329l) interfaceC10996l;
                    int iRemoteconfig2 = AbstractC11184l.remoteconfig(bArr, i, c16292l);
                    abstractC16329l2.billing(c16292l.loadAd != 0);
                    while (iRemoteconfig2 < i2) {
                        int iFirebase12 = AbstractC11184l.firebase(bArr, iRemoteconfig2, c16292l);
                        if (i3 != c16292l.yandex) {
                            return iRemoteconfig2;
                        }
                        iRemoteconfig2 = AbstractC11184l.remoteconfig(bArr, iFirebase12, c16292l);
                        abstractC16329l2.billing(c16292l.loadAd != 0);
                    }
                    return iRemoteconfig2;
                }
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                iFirebase = i;
                if (i4 == 2) {
                    if ((j & 536870912) == 0) {
                        int iFirebase13 = AbstractC11184l.firebase(bArr, i, c16292l);
                        int i18 = c16292l.yandex;
                        if (i18 < 0) {
                            throw C0803l.purchase();
                        }
                        if (i18 == 0) {
                            interfaceC10996l.add("");
                        } else {
                            interfaceC10996l.add(new String(bArr, iFirebase13, i18, AbstractC6320l.yandex));
                            iFirebase13 += i18;
                        }
                        while (iFirebase13 < i2) {
                            int iFirebase14 = AbstractC11184l.firebase(bArr, iFirebase13, c16292l);
                            if (i3 != c16292l.yandex) {
                                return iFirebase13;
                            }
                            iFirebase13 = AbstractC11184l.firebase(bArr, iFirebase14, c16292l);
                            int i19 = c16292l.yandex;
                            if (i19 < 0) {
                                throw C0803l.purchase();
                            }
                            if (i19 == 0) {
                                interfaceC10996l.add("");
                            } else {
                                interfaceC10996l.add(new String(bArr, iFirebase13, i19, AbstractC6320l.yandex));
                                iFirebase13 += i19;
                            }
                        }
                        return iFirebase13;
                    }
                    int iFirebase15 = AbstractC11184l.firebase(bArr, i, c16292l);
                    int i20 = c16292l.yandex;
                    if (i20 < 0) {
                        throw C0803l.purchase();
                    }
                    if (i20 == 0) {
                        interfaceC10996l.add("");
                    } else {
                        int i21 = iFirebase15 + i20;
                        if (AbstractC11523l.yandex.mopub(iFirebase15, i21, bArr) != 0) {
                            throw C0803l.loadAd();
                        }
                        interfaceC10996l.add(new String(bArr, iFirebase15, i20, AbstractC6320l.yandex));
                        iFirebase15 = i21;
                    }
                    while (iFirebase15 < i2) {
                        int iFirebase16 = AbstractC11184l.firebase(bArr, iFirebase15, c16292l);
                        if (i3 != c16292l.yandex) {
                            return iFirebase15;
                        }
                        iFirebase15 = AbstractC11184l.firebase(bArr, iFirebase16, c16292l);
                        int i22 = c16292l.yandex;
                        if (i22 < 0) {
                            throw C0803l.purchase();
                        }
                        if (i22 == 0) {
                            interfaceC10996l.add("");
                        } else {
                            int i23 = iFirebase15 + i22;
                            if (AbstractC11523l.yandex.mopub(iFirebase15, i23, bArr) != 0) {
                                throw C0803l.loadAd();
                            }
                            interfaceC10996l.add(new String(bArr, iFirebase15, i22, AbstractC6320l.yandex));
                            iFirebase15 = i23;
                        }
                    }
                    return iFirebase15;
                }
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return i4 == 2 ? AbstractC11184l.admob(startapp(i5), i3, bArr, i, i2, interfaceC10996l, c16292l) : i;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                if (i4 != 2) {
                    return i;
                }
                int iFirebase17 = AbstractC11184l.firebase(bArr, i, c16292l);
                int i24 = c16292l.yandex;
                if (i24 < 0) {
                    throw C0803l.purchase();
                }
                if (i24 > bArr.length - iFirebase17) {
                    throw C0803l.mopub();
                }
                if (i24 == 0) {
                    interfaceC10996l.add(AbstractC16071l.f31494l);
                } else {
                    interfaceC10996l.add(AbstractC16071l.mopub(iFirebase17, i24, bArr));
                    iFirebase17 += i24;
                }
                while (iFirebase17 < i2) {
                    int iFirebase18 = AbstractC11184l.firebase(bArr, iFirebase17, c16292l);
                    if (i3 != c16292l.yandex) {
                        return iFirebase17;
                    }
                    iFirebase17 = AbstractC11184l.firebase(bArr, iFirebase18, c16292l);
                    int i25 = c16292l.yandex;
                    if (i25 < 0) {
                        throw C0803l.purchase();
                    }
                    if (i25 > bArr.length - iFirebase17) {
                        throw C0803l.mopub();
                    }
                    if (i25 == 0) {
                        interfaceC10996l.add(AbstractC16071l.f31494l);
                    } else {
                        interfaceC10996l.add(AbstractC16071l.mopub(iFirebase17, i25, bArr));
                        iFirebase17 += i25;
                    }
                }
                return iFirebase17;
            case 30:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                if (i4 == 2) {
                    C2577l c2577l4 = (C2577l) interfaceC10996l;
                    iSmaato = AbstractC11184l.firebase(bArr, i, c16292l);
                    int i26 = c16292l.yandex + iSmaato;
                    while (iSmaato < i26) {
                        iSmaato = AbstractC11184l.firebase(bArr, iSmaato, c16292l);
                        c2577l4.billing(c16292l.yandex);
                    }
                    if (iSmaato != i26) {
                        throw C0803l.mopub();
                    }
                } else {
                    if (i4 != 0) {
                        return i;
                    }
                    iSmaato = AbstractC11184l.smaato(i3, bArr, i, i2, interfaceC10996l, c16292l);
                }
                vip(i5);
                Class cls = AbstractC9883l.yandex;
                return iSmaato;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                if (i4 == 2) {
                    C2577l c2577l5 = (C2577l) interfaceC10996l;
                    int iFirebase19 = AbstractC11184l.firebase(bArr, i, c16292l);
                    int i27 = c16292l.yandex + iFirebase19;
                    while (iFirebase19 < i27) {
                        iFirebase19 = AbstractC11184l.firebase(bArr, iFirebase19, c16292l);
                        c2577l5.billing(AbstractC15029l.amazon(c16292l.yandex));
                    }
                    if (iFirebase19 == i27) {
                        return iFirebase19;
                    }
                    throw C0803l.mopub();
                }
                if (i4 != 0) {
                    return i;
                }
                C2577l c2577l6 = (C2577l) interfaceC10996l;
                int iFirebase20 = AbstractC11184l.firebase(bArr, i, c16292l);
                c2577l6.billing(AbstractC15029l.amazon(c16292l.yandex));
                while (iFirebase20 < i2) {
                    int iFirebase21 = AbstractC11184l.firebase(bArr, iFirebase20, c16292l);
                    if (i3 != c16292l.yandex) {
                        return iFirebase20;
                    }
                    iFirebase20 = AbstractC11184l.firebase(bArr, iFirebase21, c16292l);
                    c2577l6.billing(AbstractC15029l.amazon(c16292l.yandex));
                }
                return iFirebase20;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
            case 48:
                if (i4 == 2) {
                    AbstractC8563l abstractC8563l5 = (AbstractC8563l) interfaceC10996l;
                    int iFirebase22 = AbstractC11184l.firebase(bArr, i, c16292l);
                    int i28 = c16292l.yandex + iFirebase22;
                    while (iFirebase22 < i28) {
                        iFirebase22 = AbstractC11184l.remoteconfig(bArr, iFirebase22, c16292l);
                        abstractC8563l5.billing(AbstractC15029l.billing(c16292l.loadAd));
                    }
                    if (iFirebase22 == i28) {
                        return iFirebase22;
                    }
                    throw C0803l.mopub();
                }
                if (i4 != 0) {
                    return i;
                }
                AbstractC8563l abstractC8563l6 = (AbstractC8563l) interfaceC10996l;
                int iRemoteconfig3 = AbstractC11184l.remoteconfig(bArr, i, c16292l);
                abstractC8563l6.billing(AbstractC15029l.billing(c16292l.loadAd));
                while (iRemoteconfig3 < i2) {
                    int iFirebase23 = AbstractC11184l.firebase(bArr, iRemoteconfig3, c16292l);
                    if (i3 != c16292l.yandex) {
                        return iRemoteconfig3;
                    }
                    iRemoteconfig3 = AbstractC11184l.remoteconfig(bArr, iFirebase23, c16292l);
                    abstractC8563l6.billing(AbstractC15029l.billing(c16292l.loadAd));
                }
                return iRemoteconfig3;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                if (i4 == 3) {
                    InterfaceC9608l interfaceC9608lStartapp = startapp(i5);
                    int i29 = (i3 & (-8)) | 4;
                    AbstractC12946l abstractC12946lAmazon = interfaceC9608lStartapp.amazon();
                    int iStartapp = AbstractC11184l.startapp(abstractC12946lAmazon, interfaceC9608lStartapp, bArr, i, i2, i29, c16292l);
                    InterfaceC9608l interfaceC9608l = interfaceC9608lStartapp;
                    int i30 = i29;
                    interfaceC9608l.loadAd(abstractC12946lAmazon);
                    c16292l.crashlytics = abstractC12946lAmazon;
                    interfaceC10996l.add(abstractC12946lAmazon);
                    while (iStartapp < i2) {
                        int iFirebase24 = AbstractC11184l.firebase(bArr, iStartapp, c16292l);
                        if (i3 != c16292l.yandex) {
                            return iStartapp;
                        }
                        AbstractC12946l abstractC12946lAmazon2 = interfaceC9608l.amazon();
                        InterfaceC9608l interfaceC9608l2 = interfaceC9608l;
                        int i31 = i30;
                        iStartapp = AbstractC11184l.startapp(abstractC12946lAmazon2, interfaceC9608l2, bArr, iFirebase24, i2, i31, c16292l);
                        interfaceC9608l2.loadAd(abstractC12946lAmazon2);
                        c16292l.crashlytics = abstractC12946lAmazon2;
                        interfaceC10996l.add(abstractC12946lAmazon2);
                        interfaceC9608l = interfaceC9608l2;
                        i30 = i31;
                    }
                    return iStartapp;
                }
            default:
                return i;
        }
        return iFirebase;
    }

    public final void pro(int i, Object obj, Object obj2) {
        int[] iArr = this.yandex;
        int i2 = iArr[i];
        if (tapsense(i2, i, obj2)) {
            long jM1580switch = m1580switch(i) & 1048575;
            Unsafe unsafe = metrica;
            Object object = unsafe.getObject(obj2, jM1580switch);
            if (object == null) {
                C6541l.billing(iArr[i], obj2);
                return;
            }
            InterfaceC9608l interfaceC9608lStartapp = startapp(i);
            if (!tapsense(i2, i, obj)) {
                if (subscription(object)) {
                    AbstractC12946l abstractC12946lAmazon = interfaceC9608lStartapp.amazon();
                    interfaceC9608lStartapp.yandex(abstractC12946lAmazon, object);
                    unsafe.putObject(obj, jM1580switch, abstractC12946lAmazon);
                } else {
                    unsafe.putObject(obj, jM1580switch, object);
                }
                m1576for(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM1580switch);
            if (!subscription(object2)) {
                AbstractC12946l abstractC12946lAmazon2 = interfaceC9608lStartapp.amazon();
                interfaceC9608lStartapp.yandex(abstractC12946lAmazon2, object2);
                unsafe.putObject(obj, jM1580switch, abstractC12946lAmazon2);
                object2 = abstractC12946lAmazon2;
            }
            interfaceC9608lStartapp.yandex(object2, object);
        }
    }

    /* JADX WARN: Code duplicated, block: B:149:0x036c  */
    @Override // defpackage.InterfaceC9608l
    public final int purchase(AbstractC12946l abstractC12946l) {
        int i;
        int iPurchase;
        int iPurchase2;
        int iPurchase3;
        int iMopub;
        int iPurchase4;
        int iMopub2;
        int iPurchase5;
        int iPurchase6;
        int iPurchase7;
        int iLoadAd;
        int iBilling;
        int iYandex;
        int iPurchase8;
        int iLoadAd2;
        int iCrashlytics;
        int iPurchase9;
        int size;
        int iSubs;
        int iPurchase10;
        int iPurchase11;
        int size2;
        int iPurchase12;
        int iBilling2;
        int iLoadAd3;
        int iPurchase13;
        int iPurchase14;
        int iMopub3;
        int iPurchase15;
        int iMopub4;
        int i2;
        C4694l c4694l = this;
        AbstractC12946l abstractC12946l2 = abstractC12946l;
        Unsafe unsafe = metrica;
        int i3 = 0;
        int i4 = 0;
        int iYandex2 = 0;
        int i5 = 1048575;
        while (true) {
            int[] iArr = c4694l.yandex;
            if (i3 >= iArr.length) {
                c4694l.smaato.getClass();
                return abstractC12946l2.unknownFields.loadAd() + iYandex2;
            }
            int iM1580switch = c4694l.m1580switch(i3);
            int iM1570case = m1570case(iM1580switch);
            int i6 = iArr[i3];
            int i7 = iArr[i3 + 2];
            int i8 = i7 & 1048575;
            if (iM1570case <= 17) {
                if (i8 != i5) {
                    i4 = i8 == 1048575 ? 0 : unsafe.getInt(abstractC12946l2, i8);
                    i5 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = iM1580switch & 1048575;
            if (iM1570case >= EnumC7486l.f15482l.f15485l) {
                int i9 = EnumC7486l.f15481l.f15485l;
            }
            switch (iM1570case) {
                case 0:
                    if (c4694l.ads(abstractC12946l2, i3, i5, i4, i)) {
                        iPurchase = AbstractC11078l.purchase(i6);
                        iCrashlytics = iPurchase + 8;
                        iYandex2 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                case 1:
                    if (c4694l.ads(abstractC12946l2, i3, i5, i4, i)) {
                        iPurchase2 = AbstractC11078l.purchase(i6);
                        iPurchase6 = iPurchase2 + 4;
                        iYandex2 += iPurchase6;
                    }
                    c4694l = this;
                    abstractC12946l2 = abstractC12946l;
                    i3 += 3;
                    break;
                case 2:
                    if (c4694l.ads(abstractC12946l2, i3, i5, i4, i)) {
                        long j2 = unsafe.getLong(abstractC12946l2, j);
                        iPurchase3 = AbstractC11078l.purchase(i6);
                        iMopub = AbstractC11078l.mopub(j2);
                        iYandex2 += iMopub + iPurchase3;
                    }
                    c4694l = this;
                    i3 += 3;
                    break;
                case 3:
                    if (c4694l.ads(abstractC12946l2, i3, i5, i4, i)) {
                        long j3 = unsafe.getLong(abstractC12946l2, j);
                        iPurchase3 = AbstractC11078l.purchase(i6);
                        iMopub = AbstractC11078l.mopub(j3);
                        iYandex2 += iMopub + iPurchase3;
                    }
                    c4694l = this;
                    i3 += 3;
                    break;
                case 4:
                    if (c4694l.ads(abstractC12946l2, i3, i5, i4, i)) {
                        int i10 = unsafe.getInt(abstractC12946l2, j);
                        iPurchase4 = AbstractC11078l.purchase(i6);
                        iMopub2 = AbstractC11078l.mopub(i10);
                        iYandex = iMopub2 + iPurchase4;
                        iYandex2 += iYandex;
                    }
                    c4694l = this;
                    i3 += 3;
                    break;
                case 5:
                    if (c4694l.ads(abstractC12946l2, i3, i5, i4, i)) {
                        iPurchase5 = AbstractC11078l.purchase(i6);
                        iPurchase6 = iPurchase5 + 8;
                        iYandex2 += iPurchase6;
                    }
                    c4694l = this;
                    abstractC12946l2 = abstractC12946l;
                    i3 += 3;
                    break;
                case 6:
                    if (c4694l.ads(abstractC12946l2, i3, i5, i4, i)) {
                        iPurchase2 = AbstractC11078l.purchase(i6);
                        iPurchase6 = iPurchase2 + 4;
                        iYandex2 += iPurchase6;
                    }
                    c4694l = this;
                    abstractC12946l2 = abstractC12946l;
                    i3 += 3;
                    break;
                case 7:
                    if (c4694l.ads(abstractC12946l2, i3, i5, i4, i)) {
                        iPurchase6 = AbstractC11078l.purchase(i6) + 1;
                        iYandex2 += iPurchase6;
                    }
                    c4694l = this;
                    abstractC12946l2 = abstractC12946l;
                    i3 += 3;
                    break;
                case 8:
                    if (c4694l.ads(abstractC12946l2, i3, i5, i4, i)) {
                        Object object = unsafe.getObject(abstractC12946l2, j);
                        iYandex2 = (object instanceof AbstractC16071l ? AbstractC11078l.yandex(i6, (AbstractC16071l) object) : AbstractC11078l.amazon((String) object) + AbstractC11078l.purchase(i6)) + iYandex2;
                    }
                    c4694l = this;
                    i3 += 3;
                    break;
                case 9:
                    if (c4694l.ads(abstractC12946l2, i3, i5, i4, i)) {
                        Object object2 = unsafe.getObject(abstractC12946l2, j);
                        InterfaceC9608l interfaceC9608lStartapp = c4694l.startapp(i3);
                        Class cls = AbstractC9883l.yandex;
                        iPurchase7 = AbstractC11078l.purchase(i6);
                        iLoadAd = ((AbstractC9446l) object2).loadAd(interfaceC9608lStartapp);
                        iBilling = AbstractC11078l.billing(iLoadAd);
                        i2 = iBilling + iLoadAd + iPurchase7;
                        iYandex2 += i2;
                    }
                    i3 += 3;
                    break;
                case 10:
                    if (c4694l.ads(abstractC12946l2, i3, i5, i4, i)) {
                        iYandex = AbstractC11078l.yandex(i6, (AbstractC16071l) unsafe.getObject(abstractC12946l2, j));
                        iYandex2 += iYandex;
                    }
                    c4694l = this;
                    i3 += 3;
                    break;
                case 11:
                    if (c4694l.ads(abstractC12946l2, i3, i5, i4, i)) {
                        int i11 = unsafe.getInt(abstractC12946l2, j);
                        iPurchase4 = AbstractC11078l.purchase(i6);
                        iMopub2 = AbstractC11078l.billing(i11);
                        iYandex = iMopub2 + iPurchase4;
                        iYandex2 += iYandex;
                    }
                    c4694l = this;
                    i3 += 3;
                    break;
                case 12:
                    if (c4694l.ads(abstractC12946l2, i3, i5, i4, i)) {
                        int i12 = unsafe.getInt(abstractC12946l2, j);
                        iPurchase4 = AbstractC11078l.purchase(i6);
                        iMopub2 = AbstractC11078l.mopub(i12);
                        iYandex = iMopub2 + iPurchase4;
                        iYandex2 += iYandex;
                    }
                    c4694l = this;
                    i3 += 3;
                    break;
                case 13:
                    if (c4694l.ads(abstractC12946l2, i3, i5, i4, i)) {
                        iPurchase2 = AbstractC11078l.purchase(i6);
                        iPurchase6 = iPurchase2 + 4;
                        iYandex2 += iPurchase6;
                    }
                    c4694l = this;
                    abstractC12946l2 = abstractC12946l;
                    i3 += 3;
                    break;
                case 14:
                    if (c4694l.ads(abstractC12946l2, i3, i5, i4, i)) {
                        iPurchase5 = AbstractC11078l.purchase(i6);
                        iPurchase6 = iPurchase5 + 8;
                        iYandex2 += iPurchase6;
                    }
                    c4694l = this;
                    abstractC12946l2 = abstractC12946l;
                    i3 += 3;
                    break;
                case 15:
                    if (c4694l.ads(abstractC12946l2, i3, i5, i4, i)) {
                        int i13 = unsafe.getInt(abstractC12946l2, j);
                        iPurchase4 = AbstractC11078l.purchase(i6);
                        iMopub2 = AbstractC11078l.loadAd(i13);
                        iYandex = iMopub2 + iPurchase4;
                        iYandex2 += iYandex;
                    }
                    c4694l = this;
                    i3 += 3;
                    break;
                case 16:
                    if (c4694l.ads(abstractC12946l2, i3, i5, i4, i)) {
                        long j4 = unsafe.getLong(abstractC12946l2, j);
                        iPurchase3 = AbstractC11078l.purchase(i6);
                        iMopub = AbstractC11078l.crashlytics(j4);
                        iYandex2 += iMopub + iPurchase3;
                    }
                    c4694l = this;
                    i3 += 3;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (c4694l.ads(abstractC12946l2, i3, i5, i4, i)) {
                        AbstractC9446l abstractC9446l = (AbstractC9446l) unsafe.getObject(abstractC12946l2, j);
                        InterfaceC9608l interfaceC9608lStartapp2 = c4694l.startapp(i3);
                        iPurchase8 = AbstractC11078l.purchase(i6) * 2;
                        iLoadAd2 = abstractC9446l.loadAd(interfaceC9608lStartapp2);
                        iCrashlytics = iLoadAd2 + iPurchase8;
                        iYandex2 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    iCrashlytics = AbstractC9883l.crashlytics(i6, (List) unsafe.getObject(abstractC12946l2, j));
                    iYandex2 += iCrashlytics;
                    i3 += 3;
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    iCrashlytics = AbstractC9883l.loadAd(i6, (List) unsafe.getObject(abstractC12946l2, j));
                    iYandex2 += iCrashlytics;
                    i3 += 3;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(abstractC12946l2, j);
                    Class cls2 = AbstractC9883l.yandex;
                    if (list.size() == 0) {
                        iPurchase9 = 0;
                    } else {
                        iPurchase9 = (AbstractC11078l.purchase(i6) * list.size()) + AbstractC9883l.purchase(list);
                    }
                    iYandex2 += iPurchase9;
                    i3 += 3;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC12946l2, j);
                    Class cls3 = AbstractC9883l.yandex;
                    size = list2.size();
                    if (size == 0) {
                        iPurchase9 = 0;
                    } else {
                        iSubs = AbstractC9883l.subs(list2);
                        iPurchase10 = AbstractC11078l.purchase(i6);
                        iPurchase9 = (iPurchase10 * size) + iSubs;
                    }
                    iYandex2 += iPurchase9;
                    i3 += 3;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC12946l2, j);
                    Class cls4 = AbstractC9883l.yandex;
                    size = list3.size();
                    if (size == 0) {
                        iPurchase9 = 0;
                    } else {
                        iSubs = AbstractC9883l.amazon(list3);
                        iPurchase10 = AbstractC11078l.purchase(i6);
                        iPurchase9 = (iPurchase10 * size) + iSubs;
                    }
                    iYandex2 += iPurchase9;
                    i3 += 3;
                    break;
                case 23:
                    iCrashlytics = AbstractC9883l.crashlytics(i6, (List) unsafe.getObject(abstractC12946l2, j));
                    iYandex2 += iCrashlytics;
                    i3 += 3;
                    break;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    iCrashlytics = AbstractC9883l.loadAd(i6, (List) unsafe.getObject(abstractC12946l2, j));
                    iYandex2 += iCrashlytics;
                    i3 += 3;
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    List list4 = (List) unsafe.getObject(abstractC12946l2, j);
                    Class cls5 = AbstractC9883l.yandex;
                    int size3 = list4.size();
                    iYandex2 += size3 == 0 ? 0 : (AbstractC11078l.purchase(i6) + 1) * size3;
                    i3 += 3;
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    List list5 = (List) unsafe.getObject(abstractC12946l2, j);
                    Class cls6 = AbstractC9883l.yandex;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iPurchase9 = 0;
                    } else {
                        iPurchase9 = AbstractC11078l.purchase(i6) * size4;
                        for (int i14 = 0; i14 < size4; i14++) {
                            Object obj = list5.get(i14);
                            if (obj instanceof AbstractC16071l) {
                                int size5 = ((AbstractC16071l) obj).size();
                                iPurchase9 = AbstractC11078l.billing(size5) + size5 + iPurchase9;
                            } else {
                                iPurchase9 = AbstractC11078l.amazon((String) obj) + iPurchase9;
                            }
                        }
                    }
                    iYandex2 += iPurchase9;
                    i3 += 3;
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    List list6 = (List) unsafe.getObject(abstractC12946l2, j);
                    InterfaceC9608l interfaceC9608lStartapp3 = c4694l.startapp(i3);
                    Class cls7 = AbstractC9883l.yandex;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iPurchase11 = 0;
                    } else {
                        iPurchase11 = AbstractC11078l.purchase(i6) * size6;
                        for (int i15 = 0; i15 < size6; i15++) {
                            int iLoadAd4 = ((AbstractC9446l) list6.get(i15)).loadAd(interfaceC9608lStartapp3);
                            iPurchase11 += AbstractC11078l.billing(iLoadAd4) + iLoadAd4;
                        }
                    }
                    iYandex2 += iPurchase11;
                    i3 += 3;
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    List list7 = (List) unsafe.getObject(abstractC12946l2, j);
                    Class cls8 = AbstractC9883l.yandex;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iPurchase9 = 0;
                    } else {
                        iPurchase9 = AbstractC11078l.purchase(i6) * size7;
                        for (int i16 = 0; i16 < list7.size(); i16++) {
                            int size8 = ((AbstractC16071l) list7.get(i16)).size();
                            iPurchase9 += AbstractC11078l.billing(size8) + size8;
                        }
                    }
                    iYandex2 += iPurchase9;
                    i3 += 3;
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    List list8 = (List) unsafe.getObject(abstractC12946l2, j);
                    Class cls9 = AbstractC9883l.yandex;
                    size = list8.size();
                    if (size == 0) {
                        iPurchase9 = 0;
                    } else {
                        iSubs = AbstractC9883l.admob(list8);
                        iPurchase10 = AbstractC11078l.purchase(i6);
                        iPurchase9 = (iPurchase10 * size) + iSubs;
                    }
                    iYandex2 += iPurchase9;
                    i3 += 3;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC12946l2, j);
                    Class cls10 = AbstractC9883l.yandex;
                    size = list9.size();
                    if (size == 0) {
                        iPurchase9 = 0;
                    } else {
                        iSubs = AbstractC9883l.yandex(list9);
                        iPurchase10 = AbstractC11078l.purchase(i6);
                        iPurchase9 = (iPurchase10 * size) + iSubs;
                    }
                    iYandex2 += iPurchase9;
                    i3 += 3;
                    break;
                case 31:
                    iCrashlytics = AbstractC9883l.loadAd(i6, (List) unsafe.getObject(abstractC12946l2, j));
                    iYandex2 += iCrashlytics;
                    i3 += 3;
                    break;
                case 32:
                    iCrashlytics = AbstractC9883l.crashlytics(i6, (List) unsafe.getObject(abstractC12946l2, j));
                    iYandex2 += iCrashlytics;
                    i3 += 3;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    List list10 = (List) unsafe.getObject(abstractC12946l2, j);
                    Class cls11 = AbstractC9883l.yandex;
                    size = list10.size();
                    if (size == 0) {
                        iPurchase9 = 0;
                    } else {
                        iSubs = AbstractC9883l.billing(list10);
                        iPurchase10 = AbstractC11078l.purchase(i6);
                        iPurchase9 = (iPurchase10 * size) + iSubs;
                    }
                    iYandex2 += iPurchase9;
                    i3 += 3;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    List list11 = (List) unsafe.getObject(abstractC12946l2, j);
                    Class cls12 = AbstractC9883l.yandex;
                    size = list11.size();
                    if (size == 0) {
                        iPurchase9 = 0;
                    } else {
                        iSubs = AbstractC9883l.mopub(list11);
                        iPurchase10 = AbstractC11078l.purchase(i6);
                        iPurchase9 = (iPurchase10 * size) + iSubs;
                    }
                    iYandex2 += iPurchase9;
                    i3 += 3;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    List list12 = (List) unsafe.getObject(abstractC12946l2, j);
                    Class cls13 = AbstractC9883l.yandex;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iPurchase12 = AbstractC11078l.purchase(i6);
                        iBilling2 = AbstractC11078l.billing(size2);
                        iYandex2 += iBilling2 + iPurchase12 + size2;
                    }
                    i3 += 3;
                    break;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    List list13 = (List) unsafe.getObject(abstractC12946l2, j);
                    Class cls14 = AbstractC9883l.yandex;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iPurchase12 = AbstractC11078l.purchase(i6);
                        iBilling2 = AbstractC11078l.billing(size2);
                        iYandex2 += iBilling2 + iPurchase12 + size2;
                    }
                    i3 += 3;
                    break;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    size2 = AbstractC9883l.purchase((List) unsafe.getObject(abstractC12946l2, j));
                    if (size2 > 0) {
                        iPurchase12 = AbstractC11078l.purchase(i6);
                        iBilling2 = AbstractC11078l.billing(size2);
                        iYandex2 += iBilling2 + iPurchase12 + size2;
                    }
                    i3 += 3;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    size2 = AbstractC9883l.subs((List) unsafe.getObject(abstractC12946l2, j));
                    if (size2 > 0) {
                        iPurchase12 = AbstractC11078l.purchase(i6);
                        iBilling2 = AbstractC11078l.billing(size2);
                        iYandex2 += iBilling2 + iPurchase12 + size2;
                    }
                    i3 += 3;
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    size2 = AbstractC9883l.amazon((List) unsafe.getObject(abstractC12946l2, j));
                    if (size2 > 0) {
                        iPurchase12 = AbstractC11078l.purchase(i6);
                        iBilling2 = AbstractC11078l.billing(size2);
                        iYandex2 += iBilling2 + iPurchase12 + size2;
                    }
                    i3 += 3;
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    List list14 = (List) unsafe.getObject(abstractC12946l2, j);
                    Class cls15 = AbstractC9883l.yandex;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iPurchase12 = AbstractC11078l.purchase(i6);
                        iBilling2 = AbstractC11078l.billing(size2);
                        iYandex2 += iBilling2 + iPurchase12 + size2;
                    }
                    i3 += 3;
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    List list15 = (List) unsafe.getObject(abstractC12946l2, j);
                    Class cls16 = AbstractC9883l.yandex;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iPurchase12 = AbstractC11078l.purchase(i6);
                        iBilling2 = AbstractC11078l.billing(size2);
                        iYandex2 += iBilling2 + iPurchase12 + size2;
                    }
                    i3 += 3;
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    List list16 = (List) unsafe.getObject(abstractC12946l2, j);
                    Class cls17 = AbstractC9883l.yandex;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iPurchase12 = AbstractC11078l.purchase(i6);
                        iBilling2 = AbstractC11078l.billing(size2);
                        iYandex2 += iBilling2 + iPurchase12 + size2;
                    }
                    i3 += 3;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    size2 = AbstractC9883l.admob((List) unsafe.getObject(abstractC12946l2, j));
                    if (size2 > 0) {
                        iPurchase12 = AbstractC11078l.purchase(i6);
                        iBilling2 = AbstractC11078l.billing(size2);
                        iYandex2 += iBilling2 + iPurchase12 + size2;
                    }
                    i3 += 3;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    size2 = AbstractC9883l.yandex((List) unsafe.getObject(abstractC12946l2, j));
                    if (size2 > 0) {
                        iPurchase12 = AbstractC11078l.purchase(i6);
                        iBilling2 = AbstractC11078l.billing(size2);
                        iYandex2 += iBilling2 + iPurchase12 + size2;
                    }
                    i3 += 3;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    List list17 = (List) unsafe.getObject(abstractC12946l2, j);
                    Class cls18 = AbstractC9883l.yandex;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iPurchase12 = AbstractC11078l.purchase(i6);
                        iBilling2 = AbstractC11078l.billing(size2);
                        iYandex2 += iBilling2 + iPurchase12 + size2;
                    }
                    i3 += 3;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    List list18 = (List) unsafe.getObject(abstractC12946l2, j);
                    Class cls19 = AbstractC9883l.yandex;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iPurchase12 = AbstractC11078l.purchase(i6);
                        iBilling2 = AbstractC11078l.billing(size2);
                        iYandex2 += iBilling2 + iPurchase12 + size2;
                    }
                    i3 += 3;
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    size2 = AbstractC9883l.billing((List) unsafe.getObject(abstractC12946l2, j));
                    if (size2 > 0) {
                        iPurchase12 = AbstractC11078l.purchase(i6);
                        iBilling2 = AbstractC11078l.billing(size2);
                        iYandex2 += iBilling2 + iPurchase12 + size2;
                    }
                    i3 += 3;
                    break;
                case 48:
                    size2 = AbstractC9883l.mopub((List) unsafe.getObject(abstractC12946l2, j));
                    if (size2 > 0) {
                        iPurchase12 = AbstractC11078l.purchase(i6);
                        iBilling2 = AbstractC11078l.billing(size2);
                        iYandex2 += iBilling2 + iPurchase12 + size2;
                    }
                    i3 += 3;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    List list19 = (List) unsafe.getObject(abstractC12946l2, j);
                    InterfaceC9608l interfaceC9608lStartapp4 = c4694l.startapp(i3);
                    Class cls20 = AbstractC9883l.yandex;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        iLoadAd3 = 0;
                    } else {
                        iLoadAd3 = 0;
                        for (int i17 = 0; i17 < size9; i17++) {
                            iLoadAd3 += ((AbstractC9446l) list19.get(i17)).loadAd(interfaceC9608lStartapp4) + (AbstractC11078l.purchase(i6) * 2);
                        }
                    }
                    iYandex2 += iLoadAd3;
                    i3 += 3;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Object object3 = unsafe.getObject(abstractC12946l2, j);
                    Object objMetrica = c4694l.metrica(i3);
                    c4694l.remoteconfig.getClass();
                    C10228l c10228l = (C10228l) object3;
                    if (objMetrica != null) {
                        C18725l.loadAd();
                        return 0;
                    }
                    if (c10228l.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = c10228l.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i3 += 3;
                    break;
                case 51:
                    if (c4694l.tapsense(i6, i3, abstractC12946l2)) {
                        iPurchase = AbstractC11078l.purchase(i6);
                        iCrashlytics = iPurchase + 8;
                        iYandex2 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                case 52:
                    if (c4694l.tapsense(i6, i3, abstractC12946l2)) {
                        iPurchase13 = AbstractC11078l.purchase(i6);
                        iCrashlytics = iPurchase13 + 4;
                        iYandex2 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                case 53:
                    if (c4694l.tapsense(i6, i3, abstractC12946l2)) {
                        long jApplovin = applovin(j, abstractC12946l2);
                        iPurchase14 = AbstractC11078l.purchase(i6);
                        iMopub3 = AbstractC11078l.mopub(jApplovin);
                        i2 = iMopub3 + iPurchase14;
                        iYandex2 += i2;
                    }
                    i3 += 3;
                    break;
                case 54:
                    if (c4694l.tapsense(i6, i3, abstractC12946l2)) {
                        long jApplovin2 = applovin(j, abstractC12946l2);
                        iPurchase14 = AbstractC11078l.purchase(i6);
                        iMopub3 = AbstractC11078l.mopub(jApplovin2);
                        i2 = iMopub3 + iPurchase14;
                        iYandex2 += i2;
                    }
                    i3 += 3;
                    break;
                case 55:
                    if (c4694l.tapsense(i6, i3, abstractC12946l2)) {
                        int iPremium = premium(j, abstractC12946l2);
                        iPurchase15 = AbstractC11078l.purchase(i6);
                        iMopub4 = AbstractC11078l.mopub(iPremium);
                        iCrashlytics = iMopub4 + iPurchase15;
                        iYandex2 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                case 56:
                    if (c4694l.tapsense(i6, i3, abstractC12946l2)) {
                        iPurchase = AbstractC11078l.purchase(i6);
                        iCrashlytics = iPurchase + 8;
                        iYandex2 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                case 57:
                    if (c4694l.tapsense(i6, i3, abstractC12946l2)) {
                        iPurchase13 = AbstractC11078l.purchase(i6);
                        iCrashlytics = iPurchase13 + 4;
                        iYandex2 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                case 58:
                    if (c4694l.tapsense(i6, i3, abstractC12946l2)) {
                        iCrashlytics = AbstractC11078l.purchase(i6) + 1;
                        iYandex2 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                case 59:
                    if (c4694l.tapsense(i6, i3, abstractC12946l2)) {
                        Object object4 = unsafe.getObject(abstractC12946l2, j);
                        iYandex2 = (object4 instanceof AbstractC16071l ? AbstractC11078l.yandex(i6, (AbstractC16071l) object4) : AbstractC11078l.amazon((String) object4) + AbstractC11078l.purchase(i6)) + iYandex2;
                    }
                    i3 += 3;
                    break;
                case 60:
                    if (c4694l.tapsense(i6, i3, abstractC12946l2)) {
                        Object object5 = unsafe.getObject(abstractC12946l2, j);
                        InterfaceC9608l interfaceC9608lStartapp5 = c4694l.startapp(i3);
                        Class cls21 = AbstractC9883l.yandex;
                        iPurchase7 = AbstractC11078l.purchase(i6);
                        iLoadAd = ((AbstractC9446l) object5).loadAd(interfaceC9608lStartapp5);
                        iBilling = AbstractC11078l.billing(iLoadAd);
                        i2 = iBilling + iLoadAd + iPurchase7;
                        iYandex2 += i2;
                    }
                    i3 += 3;
                    break;
                case 61:
                    if (c4694l.tapsense(i6, i3, abstractC12946l2)) {
                        iCrashlytics = AbstractC11078l.yandex(i6, (AbstractC16071l) unsafe.getObject(abstractC12946l2, j));
                        iYandex2 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                case 62:
                    if (c4694l.tapsense(i6, i3, abstractC12946l2)) {
                        int iPremium2 = premium(j, abstractC12946l2);
                        iPurchase15 = AbstractC11078l.purchase(i6);
                        iMopub4 = AbstractC11078l.billing(iPremium2);
                        iCrashlytics = iMopub4 + iPurchase15;
                        iYandex2 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                case 63:
                    if (c4694l.tapsense(i6, i3, abstractC12946l2)) {
                        int iPremium3 = premium(j, abstractC12946l2);
                        iPurchase15 = AbstractC11078l.purchase(i6);
                        iMopub4 = AbstractC11078l.mopub(iPremium3);
                        iCrashlytics = iMopub4 + iPurchase15;
                        iYandex2 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    if (c4694l.tapsense(i6, i3, abstractC12946l2)) {
                        iPurchase13 = AbstractC11078l.purchase(i6);
                        iCrashlytics = iPurchase13 + 4;
                        iYandex2 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                case 65:
                    if (c4694l.tapsense(i6, i3, abstractC12946l2)) {
                        iPurchase = AbstractC11078l.purchase(i6);
                        iCrashlytics = iPurchase + 8;
                        iYandex2 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                case 66:
                    if (c4694l.tapsense(i6, i3, abstractC12946l2)) {
                        int iPremium4 = premium(j, abstractC12946l2);
                        iPurchase15 = AbstractC11078l.purchase(i6);
                        iMopub4 = AbstractC11078l.loadAd(iPremium4);
                        iCrashlytics = iMopub4 + iPurchase15;
                        iYandex2 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                case 67:
                    if (c4694l.tapsense(i6, i3, abstractC12946l2)) {
                        long jApplovin3 = applovin(j, abstractC12946l2);
                        iPurchase14 = AbstractC11078l.purchase(i6);
                        iMopub3 = AbstractC11078l.crashlytics(jApplovin3);
                        i2 = iMopub3 + iPurchase14;
                        iYandex2 += i2;
                    }
                    i3 += 3;
                    break;
                case 68:
                    if (c4694l.tapsense(i6, i3, abstractC12946l2)) {
                        AbstractC9446l abstractC9446l2 = (AbstractC9446l) unsafe.getObject(abstractC12946l2, j);
                        InterfaceC9608l interfaceC9608lStartapp6 = c4694l.startapp(i3);
                        iPurchase8 = AbstractC11078l.purchase(i6) * 2;
                        iLoadAd2 = abstractC9446l2.loadAd(interfaceC9608lStartapp6);
                        iCrashlytics = iLoadAd2 + iPurchase8;
                        iYandex2 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                default:
                    i3 += 3;
                    break;
            }
        }
    }

    public final void remoteconfig(int i, Object obj, Object obj2) {
        int i2 = this.yandex[i];
        if (AbstractC10176l.crashlytics.subs(m1580switch(i) & 1048575, obj) == null) {
            return;
        }
        vip(i);
    }

    public final InterfaceC9608l startapp(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.loadAd;
        InterfaceC9608l interfaceC9608l = (InterfaceC9608l) objArr[i2];
        if (interfaceC9608l != null) {
            return interfaceC9608l;
        }
        InterfaceC9608l interfaceC9608lYandex = C10738l.crashlytics.yandex((Class) objArr[i2 + 1]);
        objArr[i2] = interfaceC9608lYandex;
        return interfaceC9608lYandex;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final void m1579strictfp(Object obj, int i, C12676l c12676l, InterfaceC9608l interfaceC9608l, C1466l c1466l) throws C0803l {
        int iMo1023strictfp;
        InterfaceC10996l interfaceC10996lYandex = this.firebase.yandex(i & 1048575, obj);
        AbstractC15029l abstractC15029l = (AbstractC15029l) c12676l.purchase;
        int i2 = c12676l.loadAd;
        if ((i2 & 7) != 2) {
            throw C0803l.crashlytics();
        }
        do {
            AbstractC12946l abstractC12946lAmazon = interfaceC9608l.amazon();
            c12676l.smaato(abstractC12946lAmazon, interfaceC9608l, c1466l);
            interfaceC9608l.loadAd(abstractC12946lAmazon);
            interfaceC10996lYandex.add(abstractC12946lAmazon);
            if (abstractC15029l.subs() || c12676l.amazon != 0) {
                return;
            } else {
                iMo1023strictfp = abstractC15029l.mo1023strictfp();
            }
        } while (iMo1023strictfp == i2);
        c12676l.amazon = iMo1023strictfp;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // defpackage.InterfaceC9608l
    public final boolean subs(AbstractC12946l abstractC12946l, AbstractC12946l abstractC12946l2) {
        int[] iArr = this.yandex;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zSmaato = true;
            if (i < length) {
                int iM1580switch = m1580switch(i);
                long j = iM1580switch & 1048575;
                switch (m1570case(iM1580switch)) {
                    case 0:
                        if (!firebase(abstractC12946l, abstractC12946l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC8941l abstractC8941l = AbstractC10176l.crashlytics;
                            if (Double.doubleToLongBits(abstractC8941l.purchase(j, abstractC12946l)) != Double.doubleToLongBits(abstractC8941l.purchase(j, abstractC12946l2))) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 1:
                        if (!firebase(abstractC12946l, abstractC12946l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC8941l abstractC8941l2 = AbstractC10176l.crashlytics;
                            if (Float.floatToIntBits(abstractC8941l2.billing(j, abstractC12946l)) != Float.floatToIntBits(abstractC8941l2.billing(j, abstractC12946l2))) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 2:
                        if (!firebase(abstractC12946l, abstractC12946l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC8941l abstractC8941l3 = AbstractC10176l.crashlytics;
                            if (abstractC8941l3.admob(j, abstractC12946l) != abstractC8941l3.admob(j, abstractC12946l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 3:
                        if (!firebase(abstractC12946l, abstractC12946l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC8941l abstractC8941l4 = AbstractC10176l.crashlytics;
                            if (abstractC8941l4.admob(j, abstractC12946l) != abstractC8941l4.admob(j, abstractC12946l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 4:
                        if (!firebase(abstractC12946l, abstractC12946l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC8941l abstractC8941l5 = AbstractC10176l.crashlytics;
                            if (abstractC8941l5.mopub(j, abstractC12946l) != abstractC8941l5.mopub(j, abstractC12946l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 5:
                        if (!firebase(abstractC12946l, abstractC12946l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC8941l abstractC8941l6 = AbstractC10176l.crashlytics;
                            if (abstractC8941l6.admob(j, abstractC12946l) != abstractC8941l6.admob(j, abstractC12946l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 6:
                        if (!firebase(abstractC12946l, abstractC12946l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC8941l abstractC8941l7 = AbstractC10176l.crashlytics;
                            if (abstractC8941l7.mopub(j, abstractC12946l) != abstractC8941l7.mopub(j, abstractC12946l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 7:
                        if (!firebase(abstractC12946l, abstractC12946l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC8941l abstractC8941l8 = AbstractC10176l.crashlytics;
                            if (abstractC8941l8.crashlytics(j, abstractC12946l) != abstractC8941l8.crashlytics(j, abstractC12946l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 8:
                        if (!firebase(abstractC12946l, abstractC12946l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC8941l abstractC8941l9 = AbstractC10176l.crashlytics;
                            if (!AbstractC9883l.smaato(abstractC8941l9.subs(j, abstractC12946l), abstractC8941l9.subs(j, abstractC12946l2))) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 9:
                        if (!firebase(abstractC12946l, abstractC12946l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC8941l abstractC8941l10 = AbstractC10176l.crashlytics;
                            if (!AbstractC9883l.smaato(abstractC8941l10.subs(j, abstractC12946l), abstractC8941l10.subs(j, abstractC12946l2))) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 10:
                        if (!firebase(abstractC12946l, abstractC12946l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC8941l abstractC8941l11 = AbstractC10176l.crashlytics;
                            if (!AbstractC9883l.smaato(abstractC8941l11.subs(j, abstractC12946l), abstractC8941l11.subs(j, abstractC12946l2))) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 11:
                        if (!firebase(abstractC12946l, abstractC12946l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC8941l abstractC8941l12 = AbstractC10176l.crashlytics;
                            if (abstractC8941l12.mopub(j, abstractC12946l) != abstractC8941l12.mopub(j, abstractC12946l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 12:
                        if (!firebase(abstractC12946l, abstractC12946l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC8941l abstractC8941l13 = AbstractC10176l.crashlytics;
                            if (abstractC8941l13.mopub(j, abstractC12946l) != abstractC8941l13.mopub(j, abstractC12946l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 13:
                        if (!firebase(abstractC12946l, abstractC12946l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC8941l abstractC8941l14 = AbstractC10176l.crashlytics;
                            if (abstractC8941l14.mopub(j, abstractC12946l) != abstractC8941l14.mopub(j, abstractC12946l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 14:
                        if (!firebase(abstractC12946l, abstractC12946l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC8941l abstractC8941l15 = AbstractC10176l.crashlytics;
                            if (abstractC8941l15.admob(j, abstractC12946l) != abstractC8941l15.admob(j, abstractC12946l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 15:
                        if (!firebase(abstractC12946l, abstractC12946l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC8941l abstractC8941l16 = AbstractC10176l.crashlytics;
                            if (abstractC8941l16.mopub(j, abstractC12946l) != abstractC8941l16.mopub(j, abstractC12946l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 16:
                        if (!firebase(abstractC12946l, abstractC12946l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC8941l abstractC8941l17 = AbstractC10176l.crashlytics;
                            if (abstractC8941l17.admob(j, abstractC12946l) != abstractC8941l17.admob(j, abstractC12946l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        if (!firebase(abstractC12946l, abstractC12946l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC8941l abstractC8941l18 = AbstractC10176l.crashlytics;
                            if (!AbstractC9883l.smaato(abstractC8941l18.subs(j, abstractC12946l), abstractC8941l18.subs(j, abstractC12946l2))) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    case 30:
                    case 31:
                    case 32:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    case Maneuver.TYPE_STRAIGHT /* 36 */:
                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                    case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    case 48:
                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                        AbstractC8941l abstractC8941l19 = AbstractC10176l.crashlytics;
                        zSmaato = AbstractC9883l.smaato(abstractC8941l19.subs(j, abstractC12946l), abstractC8941l19.subs(j, abstractC12946l2));
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        AbstractC8941l abstractC8941l20 = AbstractC10176l.crashlytics;
                        zSmaato = AbstractC9883l.smaato(abstractC8941l20.subs(j, abstractC12946l), abstractC8941l20.subs(j, abstractC12946l2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j2 = iArr[i + 2] & 1048575;
                        AbstractC8941l abstractC8941l21 = AbstractC10176l.crashlytics;
                        if (abstractC8941l21.mopub(j2, abstractC12946l) != abstractC8941l21.mopub(j2, abstractC12946l2) || !AbstractC9883l.smaato(abstractC8941l21.subs(j, abstractC12946l), abstractC8941l21.subs(j, abstractC12946l2))) {
                            zSmaato = false;
                        }
                        break;
                }
                if (zSmaato) {
                    i += 3;
                }
            } else {
                this.smaato.getClass();
                if (abstractC12946l.unknownFields.equals(abstractC12946l2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final int m1580switch(int i) {
        return this.yandex[i + 1];
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void m1581synchronized(Object obj, long j, C12676l c12676l, InterfaceC9608l interfaceC9608l, C1466l c1466l) throws C8352l {
        int iMo1023strictfp;
        InterfaceC10996l interfaceC10996lYandex = this.firebase.yandex(j, obj);
        AbstractC15029l abstractC15029l = (AbstractC15029l) c12676l.purchase;
        int i = c12676l.loadAd;
        if ((i & 7) != 3) {
            throw C0803l.crashlytics();
        }
        do {
            AbstractC12946l abstractC12946lAmazon = interfaceC9608l.amazon();
            c12676l.subs(abstractC12946lAmazon, interfaceC9608l, c1466l);
            interfaceC9608l.loadAd(abstractC12946lAmazon);
            interfaceC10996lYandex.add(abstractC12946lAmazon);
            if (abstractC15029l.subs() || c12676l.amazon != 0) {
                return;
            } else {
                iMo1023strictfp = abstractC15029l.mo1023strictfp();
            }
        } while (iMo1023strictfp == i);
        c12676l.amazon = iMo1023strictfp;
    }

    public final boolean tapsense(int i, int i2, Object obj) {
        return AbstractC10176l.crashlytics.mopub((long) (this.yandex[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final int m1582throw(int i, int i2) {
        int[] iArr = this.yandex;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final int m1583throws(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C16292l c16292l) throws C0803l {
        int i9;
        Unsafe unsafe = metrica;
        long j2 = this.yandex[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(AbstractC11184l.mopub(i, bArr))));
                int i10 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(AbstractC11184l.billing(i, bArr))));
                int i11 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iRemoteconfig = AbstractC11184l.remoteconfig(bArr, i, c16292l);
                unsafe.putObject(obj, j, Long.valueOf(c16292l.loadAd));
                unsafe.putInt(obj, j2, i4);
                return iRemoteconfig;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iFirebase = AbstractC11184l.firebase(bArr, i, c16292l);
                unsafe.putObject(obj, j, Integer.valueOf(c16292l.yandex));
                unsafe.putInt(obj, j2, i4);
                return iFirebase;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(AbstractC11184l.mopub(i, bArr)));
                int i12 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 57:
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(AbstractC11184l.billing(i, bArr)));
                int i13 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i13;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iRemoteconfig2 = AbstractC11184l.remoteconfig(bArr, i, c16292l);
                unsafe.putObject(obj, j, Boolean.valueOf(c16292l.loadAd != 0));
                unsafe.putInt(obj, j2, i4);
                return iRemoteconfig2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iFirebase2 = AbstractC11184l.firebase(bArr, i, c16292l);
                int i14 = c16292l.yandex;
                if (i14 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (AbstractC11523l.yandex.mopub(iFirebase2, iFirebase2 + i14, bArr) != 0) {
                            throw C0803l.loadAd();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, iFirebase2, i14, AbstractC6320l.yandex));
                    iFirebase2 += i14;
                }
                unsafe.putInt(obj, j2, i4);
                return iFirebase2;
            case 60:
                i9 = i;
                if (i5 == 2) {
                    Object objAdvert = advert(i4, i8, obj);
                    int iAdcel = AbstractC11184l.adcel(objAdvert, startapp(i8), bArr, i9, i2, c16292l);
                    m1574else(i4, obj, objAdvert, i8);
                    return iAdcel;
                }
                return i9;
            case 61:
                i9 = i;
                if (i5 == 2) {
                    int iPurchase = AbstractC11184l.purchase(bArr, i9, c16292l);
                    unsafe.putObject(obj, j, c16292l.crashlytics);
                    unsafe.putInt(obj, j2, i4);
                    return iPurchase;
                }
                return i9;
            case 63:
                i9 = i;
                if (i5 == 0) {
                    int iFirebase3 = AbstractC11184l.firebase(bArr, i9, c16292l);
                    int i15 = c16292l.yandex;
                    vip(i8);
                    unsafe.putObject(obj, j, Integer.valueOf(i15));
                    unsafe.putInt(obj, j2, i4);
                    return iFirebase3;
                }
                return i9;
            case 66:
                i9 = i;
                if (i5 == 0) {
                    int iFirebase4 = AbstractC11184l.firebase(bArr, i9, c16292l);
                    unsafe.putObject(obj, j, Integer.valueOf(AbstractC15029l.amazon(c16292l.yandex)));
                    unsafe.putInt(obj, j2, i4);
                    return iFirebase4;
                }
                return i9;
            case 67:
                i9 = i;
                if (i5 == 0) {
                    int iRemoteconfig3 = AbstractC11184l.remoteconfig(bArr, i9, c16292l);
                    unsafe.putObject(obj, j, Long.valueOf(AbstractC15029l.billing(c16292l.loadAd)));
                    unsafe.putInt(obj, j2, i4);
                    return iRemoteconfig3;
                }
                return i9;
            case 68:
                if (i5 == 3) {
                    Object objAdvert2 = advert(i4, i8, obj);
                    int iStartapp = AbstractC11184l.startapp(objAdvert2, startapp(i8), bArr, i, i2, (i3 & (-8)) | 4, c16292l);
                    m1574else(i4, obj, objAdvert2, i8);
                    return iStartapp;
                }
            default:
                return i;
        }
    }

    public final void vip(int i) {
        if (this.loadAd[AbstractC15560l.remoteconfig(i, 3, 2, 1)] == null) {
            return;
        }
        C18725l.loadAd();
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final void m1584volatile(int i, C12676l c12676l, Object obj) throws C8236l, C5347l, C8352l {
        if ((536870912 & i) != 0) {
            c12676l.m3487return(2);
            AbstractC10176l.startapp(i & 1048575, obj, ((AbstractC15029l) c12676l.purchase).mo1025synchronized());
        } else if (!this.billing) {
            AbstractC10176l.startapp(i & 1048575, obj, c12676l.subscription());
        } else {
            c12676l.m3487return(2);
            AbstractC10176l.startapp(i & 1048575, obj, ((AbstractC15029l) c12676l.purchase).mo1021package());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.InterfaceC9608l
    public final void yandex(Object obj, Object obj2) {
        Object obj3;
        smaato(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.yandex;
            if (i >= iArr.length) {
                AbstractC9883l.firebase(this.smaato, obj, obj2);
                return;
            }
            int iM1580switch = m1580switch(i);
            long j = 1048575 & iM1580switch;
            int i2 = iArr[i];
            switch (m1570case(iM1580switch)) {
                case 0:
                    if (!adcel(i, obj2)) {
                        obj3 = obj;
                    } else {
                        AbstractC8941l abstractC8941l = AbstractC10176l.crashlytics;
                        obj3 = obj;
                        abstractC8941l.remoteconfig(obj3, j, abstractC8941l.purchase(j, obj2));
                        m1575extends(i, obj3);
                    }
                    break;
                case 1:
                    if (adcel(i, obj2)) {
                        AbstractC8941l abstractC8941l2 = AbstractC10176l.crashlytics;
                        abstractC8941l2.vip(obj, j, abstractC8941l2.billing(j, obj2));
                        m1575extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (adcel(i, obj2)) {
                        AbstractC10176l.metrica(j, AbstractC10176l.crashlytics.admob(j, obj2), obj);
                        m1575extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (adcel(i, obj2)) {
                        AbstractC10176l.metrica(j, AbstractC10176l.crashlytics.admob(j, obj2), obj);
                        m1575extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (adcel(i, obj2)) {
                        AbstractC10176l.vip(j, obj, AbstractC10176l.crashlytics.mopub(j, obj2));
                        m1575extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (adcel(i, obj2)) {
                        AbstractC10176l.metrica(j, AbstractC10176l.crashlytics.admob(j, obj2), obj);
                        m1575extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (adcel(i, obj2)) {
                        AbstractC10176l.vip(j, obj, AbstractC10176l.crashlytics.mopub(j, obj2));
                        m1575extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (adcel(i, obj2)) {
                        AbstractC8941l abstractC8941l3 = AbstractC10176l.crashlytics;
                        abstractC8941l3.firebase(obj, j, abstractC8941l3.crashlytics(j, obj2));
                        m1575extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (adcel(i, obj2)) {
                        AbstractC10176l.startapp(j, obj, AbstractC10176l.crashlytics.subs(j, obj2));
                        m1575extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    license(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (adcel(i, obj2)) {
                        AbstractC10176l.startapp(j, obj, AbstractC10176l.crashlytics.subs(j, obj2));
                        m1575extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (adcel(i, obj2)) {
                        AbstractC10176l.vip(j, obj, AbstractC10176l.crashlytics.mopub(j, obj2));
                        m1575extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (adcel(i, obj2)) {
                        AbstractC10176l.vip(j, obj, AbstractC10176l.crashlytics.mopub(j, obj2));
                        m1575extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (adcel(i, obj2)) {
                        AbstractC10176l.vip(j, obj, AbstractC10176l.crashlytics.mopub(j, obj2));
                        m1575extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (adcel(i, obj2)) {
                        AbstractC10176l.metrica(j, AbstractC10176l.crashlytics.admob(j, obj2), obj);
                        m1575extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (adcel(i, obj2)) {
                        AbstractC10176l.vip(j, obj, AbstractC10176l.crashlytics.mopub(j, obj2));
                        m1575extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (adcel(i, obj2)) {
                        AbstractC10176l.metrica(j, AbstractC10176l.crashlytics.admob(j, obj2), obj);
                        m1575extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    license(i, obj, obj2);
                    obj3 = obj;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                case 20:
                case 21:
                case 22:
                case 23:
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                case 30:
                case 31:
                case 32:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                case 48:
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    this.firebase.getClass();
                    AbstractC8941l abstractC8941l4 = AbstractC10176l.crashlytics;
                    InterfaceC10996l interfaceC10996lYandex = (InterfaceC10996l) abstractC8941l4.subs(j, obj);
                    InterfaceC10996l interfaceC10996l = (InterfaceC10996l) abstractC8941l4.subs(j, obj2);
                    int size = interfaceC10996lYandex.size();
                    int size2 = interfaceC10996l.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AbstractC0853l) interfaceC10996lYandex).f2503l) {
                            interfaceC10996lYandex = interfaceC10996lYandex.yandex(size2 + size);
                        }
                        interfaceC10996lYandex.addAll(interfaceC10996l);
                    }
                    if (size > 0) {
                        interfaceC10996l = interfaceC10996lYandex;
                    }
                    AbstractC10176l.startapp(j, obj, interfaceC10996l);
                    obj3 = obj;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Class cls = AbstractC9883l.yandex;
                    AbstractC8941l abstractC8941l5 = AbstractC10176l.crashlytics;
                    AbstractC10176l.startapp(j, obj, this.remoteconfig.yandex(abstractC8941l5.subs(j, obj), abstractC8941l5.subs(j, obj2)));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (tapsense(i2, i, obj2)) {
                        AbstractC10176l.startapp(j, obj, AbstractC10176l.crashlytics.subs(j, obj2));
                        m1576for(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    pro(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (tapsense(i2, i, obj2)) {
                        AbstractC10176l.startapp(j, obj, AbstractC10176l.crashlytics.subs(j, obj2));
                        m1576for(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    pro(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }
}
