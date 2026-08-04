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

/* JADX INFO: renamed from: lؑ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0372l implements InterfaceC0060l {
    public final int admob;
    public final int amazon;
    public final boolean billing;
    public final int crashlytics;
    public final C4863l firebase;
    public final C17664l isPro;
    public final Object[] loadAd;
    public final int[] mopub;
    public final AbstractC15944l purchase;
    public final C0035l remoteconfig;
    public final C18155l smaato;
    public final int subs;
    public final int[] yandex;
    public static final int[] vip = new int[0];
    public static final Unsafe metrica = AbstractC1900l.isPro();

    public C0372l(int[] iArr, Object[] objArr, int i, int i2, AbstractC15944l abstractC15944l, int[] iArr2, int i3, int i4, C17664l c17664l, C4863l c4863l, C18155l c18155l, C8705l c8705l, C0035l c0035l) {
        this.yandex = iArr;
        this.loadAd = objArr;
        this.crashlytics = i;
        this.amazon = i2;
        this.billing = abstractC15944l instanceof AbstractC13399l;
        this.mopub = iArr2;
        this.admob = i3;
        this.subs = i4;
        this.isPro = c17664l;
        this.firebase = c4863l;
        this.smaato = c18155l;
        this.purchase = abstractC15944l;
        this.remoteconfig = c0035l;
    }

    public static long applovin(long j, Object obj) {
        return ((Long) AbstractC1900l.crashlytics.subs(j, obj)).longValue();
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public static int m474case(int i) {
        return (i & 267386880) >>> 20;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x035a  */
    /* JADX WARN: Code duplicated, block: B:182:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:185:0x03bb  */
    public static C0372l isVip(C1861l c1861l, C17664l c17664l, C4863l c4863l, C18155l c18155l, C8705l c8705l, C0035l c0035l) {
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
        Field fieldM475private;
        int i22;
        char cCharAt9;
        int i23;
        Field fieldM475private2;
        Field fieldM475private3;
        int i24;
        char cCharAt10;
        int i25;
        char cCharAt11;
        int i26;
        int i27;
        char cCharAt12;
        int i28;
        char cCharAt13;
        String str = c1861l.loadAd;
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
        Object[] objArr2 = c1861l.crashlytics;
        Class<?> cls = c1861l.yandex.getClass();
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
                } else if (i79 == 12 && (AbstractC5020l.firebase(c1861l.yandex(), 1) || (iCharAt11 & 2048) != 0)) {
                    objArr3[AbstractC15560l.remoteconfig(i62, 3, 2, 1)] = objArr[i6];
                    i6++;
                }
                int i81 = i80 * 2;
                Object obj = objArr[i81];
                if (obj instanceof Field) {
                    fieldM475private2 = (Field) obj;
                } else {
                    fieldM475private2 = m475private(cls, (String) obj);
                    objArr[i81] = fieldM475private2;
                }
                int i82 = i59;
                i19 = i6;
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM475private2);
                int i83 = i81 + 1;
                Object obj2 = objArr[i83];
                if (obj2 instanceof Field) {
                    fieldM475private3 = (Field) obj2;
                } else {
                    fieldM475private3 = m475private(cls, (String) obj2);
                    objArr[i83] = fieldM475private3;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM475private3);
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
                Field fieldM475private4 = m475private(cls, (String) objArr[i6]);
                if (i74 == 9 || i74 == 17) {
                    i18 = i18;
                    objArr3[AbstractC15560l.remoteconfig(i62, 3, 2, 1)] = fieldM475private4.getType();
                } else {
                    if (i74 == 27 || i74 == 49) {
                        i18 = i18;
                        i23 = i6 + 2;
                        objArr3[AbstractC15560l.remoteconfig(i62, 3, 2, 1)] = objArr[i84];
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        i18 = i18;
                        if (c1861l.yandex() == 1 || (iCharAt11 & 2048) != 0) {
                            i23 = i6 + 2;
                            objArr3[AbstractC15560l.remoteconfig(i62, 3, 2, 1)] = objArr[i84];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM475private4);
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
                                fieldM475private = (Field) obj3;
                            } else {
                                fieldM475private = m475private(cls, (String) obj3);
                                objArr[i87] = fieldM475private;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM475private);
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM475private4);
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
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM475private4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM475private4);
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
        return new C0372l(iArr3, objArr3, i2, i5, c1861l.yandex, iArr, i7, i59, c17664l, c4863l, c18155l, c8705l, c0035l);
    }

    public static int premium(long j, Object obj) {
        return ((Integer) AbstractC1900l.crashlytics.subs(j, obj)).intValue();
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static Field m475private(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbLicense = AbstractC14814l.license("Field ", str, " for ", name, " not found. Known fields are ");
            sbLicense.append(string);
            throw new RuntimeException(sbLicense.toString(), e);
        }
    }

    public static long signatures(int i) {
        return i & 1048575;
    }

    public static void smaato(Object obj) {
        if (subscription(obj)) {
            return;
        }
        C8339l.metrica("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    public static boolean subscription(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC13399l) {
            return ((AbstractC13399l) obj).metrica();
        }
        return true;
    }

    public final void Signature(int i, Object obj, Object obj2) {
        long jM484switch = m484switch(i) & 1048575;
        Object objSubs = AbstractC1900l.crashlytics.subs(jM484switch, obj);
        C0035l c0035l = this.remoteconfig;
        if (objSubs != null) {
            c0035l.getClass();
            if (!((C9704l) objSubs).f19790l) {
                c0035l.getClass();
                C9704l c9704lCrashlytics = C9704l.f19789l.crashlytics();
                c0035l.yandex(c9704lCrashlytics, objSubs);
                AbstractC1900l.startapp(jM484switch, obj, c9704lCrashlytics);
                objSubs = c9704lCrashlytics;
            }
        } else {
            c0035l.getClass();
            objSubs = C9704l.f19789l.crashlytics();
            AbstractC1900l.startapp(jM484switch, obj, objSubs);
        }
        c0035l.getClass();
        c0035l.getClass();
        AbstractC12589l.m3424strictfp(obj2);
        throw null;
    }

    public final Object ad(int i, Object obj) {
        InterfaceC0060l interfaceC0060lStartapp = startapp(i);
        long jM484switch = m484switch(i) & 1048575;
        if (!adcel(i, obj)) {
            return interfaceC0060lStartapp.amazon();
        }
        Object object = metrica.getObject(obj, jM484switch);
        if (subscription(object)) {
            return object;
        }
        Object objAmazon = interfaceC0060lStartapp.amazon();
        if (object != null) {
            interfaceC0060lStartapp.yandex(objAmazon, object);
        }
        return objAmazon;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0110 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0111 A[RETURN] */
    public final boolean adcel(int i, Object obj) {
        int i2 = this.yandex[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & AbstractC1900l.crashlytics.mopub(j, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iM484switch = m484switch(i);
        long j2 = iM484switch & 1048575;
        switch (m474case(iM484switch)) {
            case 0:
                if (Double.doubleToRawLongBits(AbstractC1900l.crashlytics.purchase(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(AbstractC1900l.crashlytics.billing(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (AbstractC1900l.crashlytics.admob(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (AbstractC1900l.crashlytics.admob(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (AbstractC1900l.crashlytics.mopub(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (AbstractC1900l.crashlytics.admob(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (AbstractC1900l.crashlytics.mopub(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return AbstractC1900l.crashlytics.crashlytics(j2, obj);
            case 8:
                Object objSubs = AbstractC1900l.crashlytics.subs(j2, obj);
                if (objSubs instanceof String) {
                    return !((String) objSubs).isEmpty();
                }
                if (objSubs instanceof AbstractC15257l) {
                    return !AbstractC15257l.f29847l.equals(objSubs);
                }
                C11983l.crashlytics();
                return false;
            case 9:
                if (AbstractC1900l.crashlytics.subs(j2, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                return !AbstractC15257l.f29847l.equals(AbstractC1900l.crashlytics.subs(j2, obj));
            case 11:
                if (AbstractC1900l.crashlytics.mopub(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (AbstractC1900l.crashlytics.mopub(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (AbstractC1900l.crashlytics.mopub(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (AbstractC1900l.crashlytics.admob(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (AbstractC1900l.crashlytics.mopub(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (AbstractC1900l.crashlytics.admob(j2, obj) != 0) {
                    return true;
                }
                return false;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                if (AbstractC1900l.crashlytics.subs(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                C11983l.crashlytics();
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // defpackage.InterfaceC0060l
    public final boolean admob(AbstractC13399l abstractC13399l, AbstractC13399l abstractC13399l2) {
        int[] iArr = this.yandex;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zSmaato = true;
            if (i < length) {
                int iM484switch = m484switch(i);
                long j = iM484switch & 1048575;
                switch (m474case(iM484switch)) {
                    case 0:
                        if (!firebase(abstractC13399l, abstractC13399l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC11402l abstractC11402l = AbstractC1900l.crashlytics;
                            if (Double.doubleToLongBits(abstractC11402l.purchase(j, abstractC13399l)) != Double.doubleToLongBits(abstractC11402l.purchase(j, abstractC13399l2))) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 1:
                        if (!firebase(abstractC13399l, abstractC13399l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC11402l abstractC11402l2 = AbstractC1900l.crashlytics;
                            if (Float.floatToIntBits(abstractC11402l2.billing(j, abstractC13399l)) != Float.floatToIntBits(abstractC11402l2.billing(j, abstractC13399l2))) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 2:
                        if (!firebase(abstractC13399l, abstractC13399l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC11402l abstractC11402l3 = AbstractC1900l.crashlytics;
                            if (abstractC11402l3.admob(j, abstractC13399l) != abstractC11402l3.admob(j, abstractC13399l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 3:
                        if (!firebase(abstractC13399l, abstractC13399l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC11402l abstractC11402l4 = AbstractC1900l.crashlytics;
                            if (abstractC11402l4.admob(j, abstractC13399l) != abstractC11402l4.admob(j, abstractC13399l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 4:
                        if (!firebase(abstractC13399l, abstractC13399l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC11402l abstractC11402l5 = AbstractC1900l.crashlytics;
                            if (abstractC11402l5.mopub(j, abstractC13399l) != abstractC11402l5.mopub(j, abstractC13399l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 5:
                        if (!firebase(abstractC13399l, abstractC13399l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC11402l abstractC11402l6 = AbstractC1900l.crashlytics;
                            if (abstractC11402l6.admob(j, abstractC13399l) != abstractC11402l6.admob(j, abstractC13399l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 6:
                        if (!firebase(abstractC13399l, abstractC13399l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC11402l abstractC11402l7 = AbstractC1900l.crashlytics;
                            if (abstractC11402l7.mopub(j, abstractC13399l) != abstractC11402l7.mopub(j, abstractC13399l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 7:
                        if (!firebase(abstractC13399l, abstractC13399l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC11402l abstractC11402l8 = AbstractC1900l.crashlytics;
                            if (abstractC11402l8.crashlytics(j, abstractC13399l) != abstractC11402l8.crashlytics(j, abstractC13399l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 8:
                        if (!firebase(abstractC13399l, abstractC13399l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC11402l abstractC11402l9 = AbstractC1900l.crashlytics;
                            if (!AbstractC5067l.smaato(abstractC11402l9.subs(j, abstractC13399l), abstractC11402l9.subs(j, abstractC13399l2))) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 9:
                        if (!firebase(abstractC13399l, abstractC13399l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC11402l abstractC11402l10 = AbstractC1900l.crashlytics;
                            if (!AbstractC5067l.smaato(abstractC11402l10.subs(j, abstractC13399l), abstractC11402l10.subs(j, abstractC13399l2))) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 10:
                        if (!firebase(abstractC13399l, abstractC13399l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC11402l abstractC11402l11 = AbstractC1900l.crashlytics;
                            if (!AbstractC5067l.smaato(abstractC11402l11.subs(j, abstractC13399l), abstractC11402l11.subs(j, abstractC13399l2))) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 11:
                        if (!firebase(abstractC13399l, abstractC13399l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC11402l abstractC11402l12 = AbstractC1900l.crashlytics;
                            if (abstractC11402l12.mopub(j, abstractC13399l) != abstractC11402l12.mopub(j, abstractC13399l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 12:
                        if (!firebase(abstractC13399l, abstractC13399l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC11402l abstractC11402l13 = AbstractC1900l.crashlytics;
                            if (abstractC11402l13.mopub(j, abstractC13399l) != abstractC11402l13.mopub(j, abstractC13399l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 13:
                        if (!firebase(abstractC13399l, abstractC13399l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC11402l abstractC11402l14 = AbstractC1900l.crashlytics;
                            if (abstractC11402l14.mopub(j, abstractC13399l) != abstractC11402l14.mopub(j, abstractC13399l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 14:
                        if (!firebase(abstractC13399l, abstractC13399l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC11402l abstractC11402l15 = AbstractC1900l.crashlytics;
                            if (abstractC11402l15.admob(j, abstractC13399l) != abstractC11402l15.admob(j, abstractC13399l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 15:
                        if (!firebase(abstractC13399l, abstractC13399l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC11402l abstractC11402l16 = AbstractC1900l.crashlytics;
                            if (abstractC11402l16.mopub(j, abstractC13399l) != abstractC11402l16.mopub(j, abstractC13399l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 16:
                        if (!firebase(abstractC13399l, abstractC13399l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC11402l abstractC11402l17 = AbstractC1900l.crashlytics;
                            if (abstractC11402l17.admob(j, abstractC13399l) != abstractC11402l17.admob(j, abstractC13399l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        if (!firebase(abstractC13399l, abstractC13399l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC11402l abstractC11402l18 = AbstractC1900l.crashlytics;
                            if (!AbstractC5067l.smaato(abstractC11402l18.subs(j, abstractC13399l), abstractC11402l18.subs(j, abstractC13399l2))) {
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
                        AbstractC11402l abstractC11402l19 = AbstractC1900l.crashlytics;
                        zSmaato = AbstractC5067l.smaato(abstractC11402l19.subs(j, abstractC13399l), abstractC11402l19.subs(j, abstractC13399l2));
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        AbstractC11402l abstractC11402l20 = AbstractC1900l.crashlytics;
                        zSmaato = AbstractC5067l.smaato(abstractC11402l20.subs(j, abstractC13399l), abstractC11402l20.subs(j, abstractC13399l2));
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
                        AbstractC11402l abstractC11402l21 = AbstractC1900l.crashlytics;
                        if (abstractC11402l21.mopub(j2, abstractC13399l) != abstractC11402l21.mopub(j2, abstractC13399l2) || !AbstractC5067l.smaato(abstractC11402l21.subs(j, abstractC13399l), abstractC11402l21.subs(j, abstractC13399l2))) {
                            zSmaato = false;
                        }
                        break;
                }
                if (zSmaato) {
                    i += 3;
                }
            } else {
                this.smaato.getClass();
                if (abstractC13399l.unknownFields.equals(abstractC13399l2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean ads(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return adcel(i, obj);
        }
        return (i3 & i4) != 0;
    }

    public final Object advert(int i, int i2, Object obj) {
        InterfaceC0060l interfaceC0060lStartapp = startapp(i2);
        if (!tapsense(i, i2, obj)) {
            return interfaceC0060lStartapp.amazon();
        }
        Object object = metrica.getObject(obj, m484switch(i2) & 1048575);
        if (subscription(object)) {
            return object;
        }
        Object objAmazon = interfaceC0060lStartapp.amazon();
        if (object != null) {
            interfaceC0060lStartapp.yandex(objAmazon, object);
        }
        return objAmazon;
    }

    @Override // defpackage.InterfaceC0060l
    public final Object amazon() {
        this.isPro.getClass();
        return ((AbstractC13399l) this.purchase).ads();
    }

    public final void appmetrica(long j, Object obj, int i) {
        Unsafe unsafe = metrica;
        Object objMetrica = metrica(i);
        Object object = unsafe.getObject(obj, j);
        C0035l c0035l = this.remoteconfig;
        c0035l.getClass();
        if (!((C9704l) object).f19790l) {
            c0035l.getClass();
            C9704l c9704lCrashlytics = C9704l.f19789l.crashlytics();
            c0035l.yandex(c9704lCrashlytics, object);
            unsafe.putObject(obj, j, c9704lCrashlytics);
        }
        c0035l.getClass();
        AbstractC12589l.m3424strictfp(objMetrica);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x036c  */
    @Override // defpackage.InterfaceC0060l
    public final int billing(AbstractC13399l abstractC13399l) {
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
        int iYandex;
        int iBilling;
        int iYandex2;
        int iPurchase8;
        int iYandex3;
        int iCrashlytics;
        int iPurchase9;
        int size;
        int iSubs;
        int iPurchase10;
        int iPurchase11;
        int size2;
        int iPurchase12;
        int iBilling2;
        int iYandex4;
        int iPurchase13;
        int iPurchase14;
        int iMopub3;
        int iPurchase15;
        int iMopub4;
        int i2;
        C0372l c0372l = this;
        AbstractC13399l abstractC13399l2 = abstractC13399l;
        Unsafe unsafe = metrica;
        int i3 = 0;
        int i4 = 0;
        int iYandex5 = 0;
        int i5 = 1048575;
        while (true) {
            int[] iArr = c0372l.yandex;
            if (i3 >= iArr.length) {
                c0372l.smaato.getClass();
                return abstractC13399l2.unknownFields.loadAd() + iYandex5;
            }
            int iM484switch = c0372l.m484switch(i3);
            int iM474case = m474case(iM484switch);
            int i6 = iArr[i3];
            int i7 = iArr[i3 + 2];
            int i8 = i7 & 1048575;
            if (iM474case <= 17) {
                if (i8 != i5) {
                    i4 = i8 == 1048575 ? 0 : unsafe.getInt(abstractC13399l2, i8);
                    i5 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = iM484switch & 1048575;
            if (iM474case >= EnumC0222l.f1191l.f1194l) {
                int i9 = EnumC0222l.f1190l.f1194l;
            }
            switch (iM474case) {
                case 0:
                    if (c0372l.ads(abstractC13399l2, i3, i5, i4, i)) {
                        iPurchase = AbstractC15335l.purchase(i6);
                        iCrashlytics = iPurchase + 8;
                        iYandex5 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                case 1:
                    if (c0372l.ads(abstractC13399l2, i3, i5, i4, i)) {
                        iPurchase2 = AbstractC15335l.purchase(i6);
                        iPurchase6 = iPurchase2 + 4;
                        iYandex5 += iPurchase6;
                    }
                    c0372l = this;
                    abstractC13399l2 = abstractC13399l;
                    i3 += 3;
                    break;
                case 2:
                    if (c0372l.ads(abstractC13399l2, i3, i5, i4, i)) {
                        long j2 = unsafe.getLong(abstractC13399l2, j);
                        iPurchase3 = AbstractC15335l.purchase(i6);
                        iMopub = AbstractC15335l.mopub(j2);
                        iYandex5 += iMopub + iPurchase3;
                    }
                    c0372l = this;
                    i3 += 3;
                    break;
                case 3:
                    if (c0372l.ads(abstractC13399l2, i3, i5, i4, i)) {
                        long j3 = unsafe.getLong(abstractC13399l2, j);
                        iPurchase3 = AbstractC15335l.purchase(i6);
                        iMopub = AbstractC15335l.mopub(j3);
                        iYandex5 += iMopub + iPurchase3;
                    }
                    c0372l = this;
                    i3 += 3;
                    break;
                case 4:
                    if (c0372l.ads(abstractC13399l2, i3, i5, i4, i)) {
                        int i10 = unsafe.getInt(abstractC13399l2, j);
                        iPurchase4 = AbstractC15335l.purchase(i6);
                        iMopub2 = AbstractC15335l.mopub(i10);
                        iYandex2 = iMopub2 + iPurchase4;
                        iYandex5 += iYandex2;
                    }
                    c0372l = this;
                    i3 += 3;
                    break;
                case 5:
                    if (c0372l.ads(abstractC13399l2, i3, i5, i4, i)) {
                        iPurchase5 = AbstractC15335l.purchase(i6);
                        iPurchase6 = iPurchase5 + 8;
                        iYandex5 += iPurchase6;
                    }
                    c0372l = this;
                    abstractC13399l2 = abstractC13399l;
                    i3 += 3;
                    break;
                case 6:
                    if (c0372l.ads(abstractC13399l2, i3, i5, i4, i)) {
                        iPurchase2 = AbstractC15335l.purchase(i6);
                        iPurchase6 = iPurchase2 + 4;
                        iYandex5 += iPurchase6;
                    }
                    c0372l = this;
                    abstractC13399l2 = abstractC13399l;
                    i3 += 3;
                    break;
                case 7:
                    if (c0372l.ads(abstractC13399l2, i3, i5, i4, i)) {
                        iPurchase6 = AbstractC15335l.purchase(i6) + 1;
                        iYandex5 += iPurchase6;
                    }
                    c0372l = this;
                    abstractC13399l2 = abstractC13399l;
                    i3 += 3;
                    break;
                case 8:
                    if (c0372l.ads(abstractC13399l2, i3, i5, i4, i)) {
                        Object object = unsafe.getObject(abstractC13399l2, j);
                        iYandex5 = (object instanceof AbstractC15257l ? AbstractC15335l.yandex(i6, (AbstractC15257l) object) : AbstractC15335l.amazon((String) object) + AbstractC15335l.purchase(i6)) + iYandex5;
                    }
                    c0372l = this;
                    i3 += 3;
                    break;
                case 9:
                    if (c0372l.ads(abstractC13399l2, i3, i5, i4, i)) {
                        Object object2 = unsafe.getObject(abstractC13399l2, j);
                        InterfaceC0060l interfaceC0060lStartapp = c0372l.startapp(i3);
                        Class cls = AbstractC5067l.yandex;
                        iPurchase7 = AbstractC15335l.purchase(i6);
                        iYandex = ((AbstractC15944l) object2).yandex(interfaceC0060lStartapp);
                        iBilling = AbstractC15335l.billing(iYandex);
                        i2 = iBilling + iYandex + iPurchase7;
                        iYandex5 += i2;
                    }
                    i3 += 3;
                    break;
                case 10:
                    if (c0372l.ads(abstractC13399l2, i3, i5, i4, i)) {
                        iYandex2 = AbstractC15335l.yandex(i6, (AbstractC15257l) unsafe.getObject(abstractC13399l2, j));
                        iYandex5 += iYandex2;
                    }
                    c0372l = this;
                    i3 += 3;
                    break;
                case 11:
                    if (c0372l.ads(abstractC13399l2, i3, i5, i4, i)) {
                        int i11 = unsafe.getInt(abstractC13399l2, j);
                        iPurchase4 = AbstractC15335l.purchase(i6);
                        iMopub2 = AbstractC15335l.billing(i11);
                        iYandex2 = iMopub2 + iPurchase4;
                        iYandex5 += iYandex2;
                    }
                    c0372l = this;
                    i3 += 3;
                    break;
                case 12:
                    if (c0372l.ads(abstractC13399l2, i3, i5, i4, i)) {
                        int i12 = unsafe.getInt(abstractC13399l2, j);
                        iPurchase4 = AbstractC15335l.purchase(i6);
                        iMopub2 = AbstractC15335l.mopub(i12);
                        iYandex2 = iMopub2 + iPurchase4;
                        iYandex5 += iYandex2;
                    }
                    c0372l = this;
                    i3 += 3;
                    break;
                case 13:
                    if (c0372l.ads(abstractC13399l2, i3, i5, i4, i)) {
                        iPurchase2 = AbstractC15335l.purchase(i6);
                        iPurchase6 = iPurchase2 + 4;
                        iYandex5 += iPurchase6;
                    }
                    c0372l = this;
                    abstractC13399l2 = abstractC13399l;
                    i3 += 3;
                    break;
                case 14:
                    if (c0372l.ads(abstractC13399l2, i3, i5, i4, i)) {
                        iPurchase5 = AbstractC15335l.purchase(i6);
                        iPurchase6 = iPurchase5 + 8;
                        iYandex5 += iPurchase6;
                    }
                    c0372l = this;
                    abstractC13399l2 = abstractC13399l;
                    i3 += 3;
                    break;
                case 15:
                    if (c0372l.ads(abstractC13399l2, i3, i5, i4, i)) {
                        int i13 = unsafe.getInt(abstractC13399l2, j);
                        iPurchase4 = AbstractC15335l.purchase(i6);
                        iMopub2 = AbstractC15335l.loadAd(i13);
                        iYandex2 = iMopub2 + iPurchase4;
                        iYandex5 += iYandex2;
                    }
                    c0372l = this;
                    i3 += 3;
                    break;
                case 16:
                    if (c0372l.ads(abstractC13399l2, i3, i5, i4, i)) {
                        long j4 = unsafe.getLong(abstractC13399l2, j);
                        iPurchase3 = AbstractC15335l.purchase(i6);
                        iMopub = AbstractC15335l.crashlytics(j4);
                        iYandex5 += iMopub + iPurchase3;
                    }
                    c0372l = this;
                    i3 += 3;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (c0372l.ads(abstractC13399l2, i3, i5, i4, i)) {
                        AbstractC15944l abstractC15944l = (AbstractC15944l) unsafe.getObject(abstractC13399l2, j);
                        InterfaceC0060l interfaceC0060lStartapp2 = c0372l.startapp(i3);
                        iPurchase8 = AbstractC15335l.purchase(i6) * 2;
                        iYandex3 = abstractC15944l.yandex(interfaceC0060lStartapp2);
                        iCrashlytics = iYandex3 + iPurchase8;
                        iYandex5 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    iCrashlytics = AbstractC5067l.crashlytics(i6, (List) unsafe.getObject(abstractC13399l2, j));
                    iYandex5 += iCrashlytics;
                    i3 += 3;
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    iCrashlytics = AbstractC5067l.loadAd(i6, (List) unsafe.getObject(abstractC13399l2, j));
                    iYandex5 += iCrashlytics;
                    i3 += 3;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(abstractC13399l2, j);
                    Class cls2 = AbstractC5067l.yandex;
                    if (list.size() == 0) {
                        iPurchase9 = 0;
                    } else {
                        iPurchase9 = (AbstractC15335l.purchase(i6) * list.size()) + AbstractC5067l.purchase(list);
                    }
                    iYandex5 += iPurchase9;
                    i3 += 3;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC13399l2, j);
                    Class cls3 = AbstractC5067l.yandex;
                    size = list2.size();
                    if (size == 0) {
                        iPurchase9 = 0;
                    } else {
                        iSubs = AbstractC5067l.subs(list2);
                        iPurchase10 = AbstractC15335l.purchase(i6);
                        iPurchase9 = (iPurchase10 * size) + iSubs;
                    }
                    iYandex5 += iPurchase9;
                    i3 += 3;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC13399l2, j);
                    Class cls4 = AbstractC5067l.yandex;
                    size = list3.size();
                    if (size == 0) {
                        iPurchase9 = 0;
                    } else {
                        iSubs = AbstractC5067l.amazon(list3);
                        iPurchase10 = AbstractC15335l.purchase(i6);
                        iPurchase9 = (iPurchase10 * size) + iSubs;
                    }
                    iYandex5 += iPurchase9;
                    i3 += 3;
                    break;
                case 23:
                    iCrashlytics = AbstractC5067l.crashlytics(i6, (List) unsafe.getObject(abstractC13399l2, j));
                    iYandex5 += iCrashlytics;
                    i3 += 3;
                    break;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    iCrashlytics = AbstractC5067l.loadAd(i6, (List) unsafe.getObject(abstractC13399l2, j));
                    iYandex5 += iCrashlytics;
                    i3 += 3;
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    List list4 = (List) unsafe.getObject(abstractC13399l2, j);
                    Class cls5 = AbstractC5067l.yandex;
                    int size3 = list4.size();
                    iYandex5 += size3 == 0 ? 0 : (AbstractC15335l.purchase(i6) + 1) * size3;
                    i3 += 3;
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    List list5 = (List) unsafe.getObject(abstractC13399l2, j);
                    Class cls6 = AbstractC5067l.yandex;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iPurchase9 = 0;
                    } else {
                        iPurchase9 = AbstractC15335l.purchase(i6) * size4;
                        for (int i14 = 0; i14 < size4; i14++) {
                            Object obj = list5.get(i14);
                            if (obj instanceof AbstractC15257l) {
                                int size5 = ((AbstractC15257l) obj).size();
                                iPurchase9 = AbstractC15335l.billing(size5) + size5 + iPurchase9;
                            } else {
                                iPurchase9 = AbstractC15335l.amazon((String) obj) + iPurchase9;
                            }
                        }
                    }
                    iYandex5 += iPurchase9;
                    i3 += 3;
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    List list6 = (List) unsafe.getObject(abstractC13399l2, j);
                    InterfaceC0060l interfaceC0060lStartapp3 = c0372l.startapp(i3);
                    Class cls7 = AbstractC5067l.yandex;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iPurchase11 = 0;
                    } else {
                        iPurchase11 = AbstractC15335l.purchase(i6) * size6;
                        for (int i15 = 0; i15 < size6; i15++) {
                            int iYandex6 = ((AbstractC15944l) list6.get(i15)).yandex(interfaceC0060lStartapp3);
                            iPurchase11 += AbstractC15335l.billing(iYandex6) + iYandex6;
                        }
                    }
                    iYandex5 += iPurchase11;
                    i3 += 3;
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    List list7 = (List) unsafe.getObject(abstractC13399l2, j);
                    Class cls8 = AbstractC5067l.yandex;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iPurchase9 = 0;
                    } else {
                        iPurchase9 = AbstractC15335l.purchase(i6) * size7;
                        for (int i16 = 0; i16 < list7.size(); i16++) {
                            int size8 = ((AbstractC15257l) list7.get(i16)).size();
                            iPurchase9 += AbstractC15335l.billing(size8) + size8;
                        }
                    }
                    iYandex5 += iPurchase9;
                    i3 += 3;
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    List list8 = (List) unsafe.getObject(abstractC13399l2, j);
                    Class cls9 = AbstractC5067l.yandex;
                    size = list8.size();
                    if (size == 0) {
                        iPurchase9 = 0;
                    } else {
                        iSubs = AbstractC5067l.admob(list8);
                        iPurchase10 = AbstractC15335l.purchase(i6);
                        iPurchase9 = (iPurchase10 * size) + iSubs;
                    }
                    iYandex5 += iPurchase9;
                    i3 += 3;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC13399l2, j);
                    Class cls10 = AbstractC5067l.yandex;
                    size = list9.size();
                    if (size == 0) {
                        iPurchase9 = 0;
                    } else {
                        iSubs = AbstractC5067l.yandex(list9);
                        iPurchase10 = AbstractC15335l.purchase(i6);
                        iPurchase9 = (iPurchase10 * size) + iSubs;
                    }
                    iYandex5 += iPurchase9;
                    i3 += 3;
                    break;
                case 31:
                    iCrashlytics = AbstractC5067l.loadAd(i6, (List) unsafe.getObject(abstractC13399l2, j));
                    iYandex5 += iCrashlytics;
                    i3 += 3;
                    break;
                case 32:
                    iCrashlytics = AbstractC5067l.crashlytics(i6, (List) unsafe.getObject(abstractC13399l2, j));
                    iYandex5 += iCrashlytics;
                    i3 += 3;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    List list10 = (List) unsafe.getObject(abstractC13399l2, j);
                    Class cls11 = AbstractC5067l.yandex;
                    size = list10.size();
                    if (size == 0) {
                        iPurchase9 = 0;
                    } else {
                        iSubs = AbstractC5067l.billing(list10);
                        iPurchase10 = AbstractC15335l.purchase(i6);
                        iPurchase9 = (iPurchase10 * size) + iSubs;
                    }
                    iYandex5 += iPurchase9;
                    i3 += 3;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    List list11 = (List) unsafe.getObject(abstractC13399l2, j);
                    Class cls12 = AbstractC5067l.yandex;
                    size = list11.size();
                    if (size == 0) {
                        iPurchase9 = 0;
                    } else {
                        iSubs = AbstractC5067l.mopub(list11);
                        iPurchase10 = AbstractC15335l.purchase(i6);
                        iPurchase9 = (iPurchase10 * size) + iSubs;
                    }
                    iYandex5 += iPurchase9;
                    i3 += 3;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    List list12 = (List) unsafe.getObject(abstractC13399l2, j);
                    Class cls13 = AbstractC5067l.yandex;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iPurchase12 = AbstractC15335l.purchase(i6);
                        iBilling2 = AbstractC15335l.billing(size2);
                        iYandex5 += iBilling2 + iPurchase12 + size2;
                    }
                    i3 += 3;
                    break;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    List list13 = (List) unsafe.getObject(abstractC13399l2, j);
                    Class cls14 = AbstractC5067l.yandex;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iPurchase12 = AbstractC15335l.purchase(i6);
                        iBilling2 = AbstractC15335l.billing(size2);
                        iYandex5 += iBilling2 + iPurchase12 + size2;
                    }
                    i3 += 3;
                    break;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    size2 = AbstractC5067l.purchase((List) unsafe.getObject(abstractC13399l2, j));
                    if (size2 > 0) {
                        iPurchase12 = AbstractC15335l.purchase(i6);
                        iBilling2 = AbstractC15335l.billing(size2);
                        iYandex5 += iBilling2 + iPurchase12 + size2;
                    }
                    i3 += 3;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    size2 = AbstractC5067l.subs((List) unsafe.getObject(abstractC13399l2, j));
                    if (size2 > 0) {
                        iPurchase12 = AbstractC15335l.purchase(i6);
                        iBilling2 = AbstractC15335l.billing(size2);
                        iYandex5 += iBilling2 + iPurchase12 + size2;
                    }
                    i3 += 3;
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    size2 = AbstractC5067l.amazon((List) unsafe.getObject(abstractC13399l2, j));
                    if (size2 > 0) {
                        iPurchase12 = AbstractC15335l.purchase(i6);
                        iBilling2 = AbstractC15335l.billing(size2);
                        iYandex5 += iBilling2 + iPurchase12 + size2;
                    }
                    i3 += 3;
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    List list14 = (List) unsafe.getObject(abstractC13399l2, j);
                    Class cls15 = AbstractC5067l.yandex;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iPurchase12 = AbstractC15335l.purchase(i6);
                        iBilling2 = AbstractC15335l.billing(size2);
                        iYandex5 += iBilling2 + iPurchase12 + size2;
                    }
                    i3 += 3;
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    List list15 = (List) unsafe.getObject(abstractC13399l2, j);
                    Class cls16 = AbstractC5067l.yandex;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iPurchase12 = AbstractC15335l.purchase(i6);
                        iBilling2 = AbstractC15335l.billing(size2);
                        iYandex5 += iBilling2 + iPurchase12 + size2;
                    }
                    i3 += 3;
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    List list16 = (List) unsafe.getObject(abstractC13399l2, j);
                    Class cls17 = AbstractC5067l.yandex;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iPurchase12 = AbstractC15335l.purchase(i6);
                        iBilling2 = AbstractC15335l.billing(size2);
                        iYandex5 += iBilling2 + iPurchase12 + size2;
                    }
                    i3 += 3;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    size2 = AbstractC5067l.admob((List) unsafe.getObject(abstractC13399l2, j));
                    if (size2 > 0) {
                        iPurchase12 = AbstractC15335l.purchase(i6);
                        iBilling2 = AbstractC15335l.billing(size2);
                        iYandex5 += iBilling2 + iPurchase12 + size2;
                    }
                    i3 += 3;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    size2 = AbstractC5067l.yandex((List) unsafe.getObject(abstractC13399l2, j));
                    if (size2 > 0) {
                        iPurchase12 = AbstractC15335l.purchase(i6);
                        iBilling2 = AbstractC15335l.billing(size2);
                        iYandex5 += iBilling2 + iPurchase12 + size2;
                    }
                    i3 += 3;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    List list17 = (List) unsafe.getObject(abstractC13399l2, j);
                    Class cls18 = AbstractC5067l.yandex;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iPurchase12 = AbstractC15335l.purchase(i6);
                        iBilling2 = AbstractC15335l.billing(size2);
                        iYandex5 += iBilling2 + iPurchase12 + size2;
                    }
                    i3 += 3;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    List list18 = (List) unsafe.getObject(abstractC13399l2, j);
                    Class cls19 = AbstractC5067l.yandex;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iPurchase12 = AbstractC15335l.purchase(i6);
                        iBilling2 = AbstractC15335l.billing(size2);
                        iYandex5 += iBilling2 + iPurchase12 + size2;
                    }
                    i3 += 3;
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    size2 = AbstractC5067l.billing((List) unsafe.getObject(abstractC13399l2, j));
                    if (size2 > 0) {
                        iPurchase12 = AbstractC15335l.purchase(i6);
                        iBilling2 = AbstractC15335l.billing(size2);
                        iYandex5 += iBilling2 + iPurchase12 + size2;
                    }
                    i3 += 3;
                    break;
                case 48:
                    size2 = AbstractC5067l.mopub((List) unsafe.getObject(abstractC13399l2, j));
                    if (size2 > 0) {
                        iPurchase12 = AbstractC15335l.purchase(i6);
                        iBilling2 = AbstractC15335l.billing(size2);
                        iYandex5 += iBilling2 + iPurchase12 + size2;
                    }
                    i3 += 3;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    List list19 = (List) unsafe.getObject(abstractC13399l2, j);
                    InterfaceC0060l interfaceC0060lStartapp4 = c0372l.startapp(i3);
                    Class cls20 = AbstractC5067l.yandex;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        iYandex4 = 0;
                    } else {
                        iYandex4 = 0;
                        for (int i17 = 0; i17 < size9; i17++) {
                            iYandex4 += ((AbstractC15944l) list19.get(i17)).yandex(interfaceC0060lStartapp4) + (AbstractC15335l.purchase(i6) * 2);
                        }
                    }
                    iYandex5 += iYandex4;
                    i3 += 3;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Object object3 = unsafe.getObject(abstractC13399l2, j);
                    Object objMetrica = c0372l.metrica(i3);
                    c0372l.remoteconfig.getClass();
                    C9704l c9704l = (C9704l) object3;
                    if (objMetrica != null) {
                        C18725l.loadAd();
                        return 0;
                    }
                    if (c9704l.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = c9704l.entrySet().iterator();
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
                    if (c0372l.tapsense(i6, i3, abstractC13399l2)) {
                        iPurchase = AbstractC15335l.purchase(i6);
                        iCrashlytics = iPurchase + 8;
                        iYandex5 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                case 52:
                    if (c0372l.tapsense(i6, i3, abstractC13399l2)) {
                        iPurchase13 = AbstractC15335l.purchase(i6);
                        iCrashlytics = iPurchase13 + 4;
                        iYandex5 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                case 53:
                    if (c0372l.tapsense(i6, i3, abstractC13399l2)) {
                        long jApplovin = applovin(j, abstractC13399l2);
                        iPurchase14 = AbstractC15335l.purchase(i6);
                        iMopub3 = AbstractC15335l.mopub(jApplovin);
                        i2 = iMopub3 + iPurchase14;
                        iYandex5 += i2;
                    }
                    i3 += 3;
                    break;
                case 54:
                    if (c0372l.tapsense(i6, i3, abstractC13399l2)) {
                        long jApplovin2 = applovin(j, abstractC13399l2);
                        iPurchase14 = AbstractC15335l.purchase(i6);
                        iMopub3 = AbstractC15335l.mopub(jApplovin2);
                        i2 = iMopub3 + iPurchase14;
                        iYandex5 += i2;
                    }
                    i3 += 3;
                    break;
                case 55:
                    if (c0372l.tapsense(i6, i3, abstractC13399l2)) {
                        int iPremium = premium(j, abstractC13399l2);
                        iPurchase15 = AbstractC15335l.purchase(i6);
                        iMopub4 = AbstractC15335l.mopub(iPremium);
                        iCrashlytics = iMopub4 + iPurchase15;
                        iYandex5 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                case 56:
                    if (c0372l.tapsense(i6, i3, abstractC13399l2)) {
                        iPurchase = AbstractC15335l.purchase(i6);
                        iCrashlytics = iPurchase + 8;
                        iYandex5 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                case 57:
                    if (c0372l.tapsense(i6, i3, abstractC13399l2)) {
                        iPurchase13 = AbstractC15335l.purchase(i6);
                        iCrashlytics = iPurchase13 + 4;
                        iYandex5 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                case 58:
                    if (c0372l.tapsense(i6, i3, abstractC13399l2)) {
                        iCrashlytics = AbstractC15335l.purchase(i6) + 1;
                        iYandex5 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                case 59:
                    if (c0372l.tapsense(i6, i3, abstractC13399l2)) {
                        Object object4 = unsafe.getObject(abstractC13399l2, j);
                        iYandex5 = (object4 instanceof AbstractC15257l ? AbstractC15335l.yandex(i6, (AbstractC15257l) object4) : AbstractC15335l.amazon((String) object4) + AbstractC15335l.purchase(i6)) + iYandex5;
                    }
                    i3 += 3;
                    break;
                case 60:
                    if (c0372l.tapsense(i6, i3, abstractC13399l2)) {
                        Object object5 = unsafe.getObject(abstractC13399l2, j);
                        InterfaceC0060l interfaceC0060lStartapp5 = c0372l.startapp(i3);
                        Class cls21 = AbstractC5067l.yandex;
                        iPurchase7 = AbstractC15335l.purchase(i6);
                        iYandex = ((AbstractC15944l) object5).yandex(interfaceC0060lStartapp5);
                        iBilling = AbstractC15335l.billing(iYandex);
                        i2 = iBilling + iYandex + iPurchase7;
                        iYandex5 += i2;
                    }
                    i3 += 3;
                    break;
                case 61:
                    if (c0372l.tapsense(i6, i3, abstractC13399l2)) {
                        iCrashlytics = AbstractC15335l.yandex(i6, (AbstractC15257l) unsafe.getObject(abstractC13399l2, j));
                        iYandex5 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                case 62:
                    if (c0372l.tapsense(i6, i3, abstractC13399l2)) {
                        int iPremium2 = premium(j, abstractC13399l2);
                        iPurchase15 = AbstractC15335l.purchase(i6);
                        iMopub4 = AbstractC15335l.billing(iPremium2);
                        iCrashlytics = iMopub4 + iPurchase15;
                        iYandex5 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                case 63:
                    if (c0372l.tapsense(i6, i3, abstractC13399l2)) {
                        int iPremium3 = premium(j, abstractC13399l2);
                        iPurchase15 = AbstractC15335l.purchase(i6);
                        iMopub4 = AbstractC15335l.mopub(iPremium3);
                        iCrashlytics = iMopub4 + iPurchase15;
                        iYandex5 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    if (c0372l.tapsense(i6, i3, abstractC13399l2)) {
                        iPurchase13 = AbstractC15335l.purchase(i6);
                        iCrashlytics = iPurchase13 + 4;
                        iYandex5 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                case 65:
                    if (c0372l.tapsense(i6, i3, abstractC13399l2)) {
                        iPurchase = AbstractC15335l.purchase(i6);
                        iCrashlytics = iPurchase + 8;
                        iYandex5 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                case 66:
                    if (c0372l.tapsense(i6, i3, abstractC13399l2)) {
                        int iPremium4 = premium(j, abstractC13399l2);
                        iPurchase15 = AbstractC15335l.purchase(i6);
                        iMopub4 = AbstractC15335l.loadAd(iPremium4);
                        iCrashlytics = iMopub4 + iPurchase15;
                        iYandex5 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                case 67:
                    if (c0372l.tapsense(i6, i3, abstractC13399l2)) {
                        long jApplovin3 = applovin(j, abstractC13399l2);
                        iPurchase14 = AbstractC15335l.purchase(i6);
                        iMopub3 = AbstractC15335l.crashlytics(jApplovin3);
                        i2 = iMopub3 + iPurchase14;
                        iYandex5 += i2;
                    }
                    i3 += 3;
                    break;
                case 68:
                    if (c0372l.tapsense(i6, i3, abstractC13399l2)) {
                        AbstractC15944l abstractC15944l2 = (AbstractC15944l) unsafe.getObject(abstractC13399l2, j);
                        InterfaceC0060l interfaceC0060lStartapp6 = c0372l.startapp(i3);
                        iPurchase8 = AbstractC15335l.purchase(i6) * 2;
                        iYandex3 = abstractC15944l2.yandex(interfaceC0060lStartapp6);
                        iCrashlytics = iYandex3 + iPurchase8;
                        iYandex5 += iCrashlytics;
                    }
                    i3 += 3;
                    break;
                default:
                    i3 += 3;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final void m476catch(int i, Object obj, Object obj2) {
        metrica.putObject(obj, m484switch(i) & 1048575, obj2);
        m479extends(i, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final void m477continue(C5138l c5138l, Object obj) {
        int i;
        boolean z;
        C0372l c0372l = this;
        int[] iArr = c0372l.yandex;
        int length = iArr.length;
        Unsafe unsafe = metrica;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int iM484switch = c0372l.m484switch(i4);
            int i6 = iArr[i4];
            int iM474case = m474case(iM484switch);
            if (iM474case <= 17) {
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
            long j = iM484switch & i2;
            switch (iM474case) {
                case 0:
                    if (c0372l.ads(obj, i4, i3, i5, i)) {
                        double dPurchase = AbstractC1900l.crashlytics.purchase(j, obj);
                        AbstractC15335l abstractC15335l = (AbstractC15335l) c5138l.f11181l;
                        abstractC15335l.getClass();
                        abstractC15335l.vip(i6, Double.doubleToRawLongBits(dPurchase));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if (c0372l.ads(obj, i4, i3, i5, i)) {
                        float fBilling = AbstractC1900l.crashlytics.billing(j, obj);
                        AbstractC15335l abstractC15335l2 = (AbstractC15335l) c5138l.f11181l;
                        abstractC15335l2.getClass();
                        abstractC15335l2.smaato(i6, Float.floatToRawIntBits(fBilling));
                    }
                    c0372l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if (c0372l.ads(obj, i4, i3, i5, i)) {
                        ((AbstractC15335l) c5138l.f11181l).pro(i6, unsafe.getLong(obj, j));
                    }
                    c0372l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if (c0372l.ads(obj, i4, i3, i5, i)) {
                        ((AbstractC15335l) c5138l.f11181l).pro(i6, unsafe.getLong(obj, j));
                    }
                    c0372l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if (c0372l.ads(obj, i4, i3, i5, i)) {
                        ((AbstractC15335l) c5138l.f11181l).startapp(i6, unsafe.getInt(obj, j));
                    }
                    c0372l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if (c0372l.ads(obj, i4, i3, i5, i)) {
                        ((AbstractC15335l) c5138l.f11181l).vip(i6, unsafe.getLong(obj, j));
                    }
                    c0372l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if (c0372l.ads(obj, i4, i3, i5, i)) {
                        ((AbstractC15335l) c5138l.f11181l).smaato(i6, unsafe.getInt(obj, j));
                    }
                    c0372l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if (c0372l.ads(obj, i4, i3, i5, i)) {
                        ((AbstractC15335l) c5138l.f11181l).isPro(i6, AbstractC1900l.crashlytics.crashlytics(j, obj));
                    }
                    c0372l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if (c0372l.ads(obj, i4, i3, i5, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((AbstractC15335l) c5138l.f11181l).subscription(i6, (String) object);
                        } else {
                            ((AbstractC15335l) c5138l.f11181l).firebase(i6, (AbstractC15257l) object);
                        }
                    }
                    c0372l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if (c0372l.ads(obj, i4, i3, i5, i)) {
                        c5138l.m1716l(i6, unsafe.getObject(obj, j), c0372l.startapp(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if (c0372l.ads(obj, i4, i3, i5, i)) {
                        ((AbstractC15335l) c5138l.f11181l).firebase(i6, (AbstractC15257l) unsafe.getObject(obj, j));
                    }
                    c0372l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if (c0372l.ads(obj, i4, i3, i5, i)) {
                        ((AbstractC15335l) c5138l.f11181l).Signature(i6, unsafe.getInt(obj, j));
                    }
                    c0372l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if (c0372l.ads(obj, i4, i3, i5, i)) {
                        ((AbstractC15335l) c5138l.f11181l).startapp(i6, unsafe.getInt(obj, j));
                    }
                    c0372l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if (c0372l.ads(obj, i4, i3, i5, i)) {
                        ((AbstractC15335l) c5138l.f11181l).smaato(i6, unsafe.getInt(obj, j));
                    }
                    c0372l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if (c0372l.ads(obj, i4, i3, i5, i)) {
                        ((AbstractC15335l) c5138l.f11181l).vip(i6, unsafe.getLong(obj, j));
                    }
                    c0372l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if (c0372l.ads(obj, i4, i3, i5, i)) {
                        int i9 = unsafe.getInt(obj, j);
                        ((AbstractC15335l) c5138l.f11181l).Signature(i6, (i9 >> 31) ^ (i9 << 1));
                    }
                    c0372l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if (c0372l.ads(obj, i4, i3, i5, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((AbstractC15335l) c5138l.f11181l).pro(i6, (j2 >> 63) ^ (j2 << 1));
                    }
                    c0372l = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (c0372l.ads(obj, i4, i3, i5, i)) {
                        c5138l.m1712l(i6, unsafe.getObject(obj, j), c0372l.startapp(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    AbstractC5067l.vip(iArr[i4], (List) unsafe.getObject(obj, j), c5138l, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    AbstractC5067l.ads(iArr[i4], (List) unsafe.getObject(obj, j), c5138l, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    AbstractC5067l.tapsense(iArr[i4], (List) unsafe.getObject(obj, j), c5138l, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    AbstractC5067l.isVip(iArr[i4], (List) unsafe.getObject(obj, j), c5138l, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    AbstractC5067l.subscription(iArr[i4], (List) unsafe.getObject(obj, j), c5138l, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    AbstractC5067l.adcel(iArr[i4], (List) unsafe.getObject(obj, j), c5138l, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    AbstractC5067l.startapp(iArr[i4], (List) unsafe.getObject(obj, j), c5138l, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    AbstractC5067l.remoteconfig(iArr[i4], (List) unsafe.getObject(obj, j), c5138l, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    int i10 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = AbstractC5067l.yandex;
                    if (list != null && !list.isEmpty()) {
                        c5138l.getClass();
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            ((AbstractC15335l) c5138l.f11181l).subscription(i10, (String) list.get(i11));
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    int i12 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    InterfaceC0060l interfaceC0060lStartapp = c0372l.startapp(i4);
                    Class cls2 = AbstractC5067l.yandex;
                    if (list2 != null && !list2.isEmpty()) {
                        c5138l.getClass();
                        for (int i13 = 0; i13 < list2.size(); i13++) {
                            c5138l.m1716l(i12, list2.get(i13), interfaceC0060lStartapp);
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    int i14 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = AbstractC5067l.yandex;
                    if (list3 != null && !list3.isEmpty()) {
                        c5138l.getClass();
                        for (int i15 = 0; i15 < list3.size(); i15++) {
                            ((AbstractC15335l) c5138l.f11181l).firebase(i14, (AbstractC15257l) list3.get(i15));
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    z = false;
                    AbstractC5067l.advert(iArr[i4], (List) unsafe.getObject(obj, j), c5138l, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 30:
                    z = false;
                    AbstractC5067l.metrica(iArr[i4], (List) unsafe.getObject(obj, j), c5138l, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 31:
                    z = false;
                    AbstractC5067l.Signature(iArr[i4], (List) unsafe.getObject(obj, j), c5138l, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 32:
                    z = false;
                    AbstractC5067l.license(iArr[i4], (List) unsafe.getObject(obj, j), c5138l, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    z = false;
                    AbstractC5067l.pro(iArr[i4], (List) unsafe.getObject(obj, j), c5138l, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    z = false;
                    AbstractC5067l.ad(iArr[i4], (List) unsafe.getObject(obj, j), c5138l, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    AbstractC5067l.vip(iArr[i4], (List) unsafe.getObject(obj, j), c5138l, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    AbstractC5067l.ads(iArr[i4], (List) unsafe.getObject(obj, j), c5138l, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    AbstractC5067l.tapsense(iArr[i4], (List) unsafe.getObject(obj, j), c5138l, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    AbstractC5067l.isVip(iArr[i4], (List) unsafe.getObject(obj, j), c5138l, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    AbstractC5067l.subscription(iArr[i4], (List) unsafe.getObject(obj, j), c5138l, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    AbstractC5067l.adcel(iArr[i4], (List) unsafe.getObject(obj, j), c5138l, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    AbstractC5067l.startapp(iArr[i4], (List) unsafe.getObject(obj, j), c5138l, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    AbstractC5067l.remoteconfig(iArr[i4], (List) unsafe.getObject(obj, j), c5138l, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    AbstractC5067l.advert(iArr[i4], (List) unsafe.getObject(obj, j), c5138l, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    AbstractC5067l.metrica(iArr[i4], (List) unsafe.getObject(obj, j), c5138l, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    AbstractC5067l.Signature(iArr[i4], (List) unsafe.getObject(obj, j), c5138l, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    AbstractC5067l.license(iArr[i4], (List) unsafe.getObject(obj, j), c5138l, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    AbstractC5067l.pro(iArr[i4], (List) unsafe.getObject(obj, j), c5138l, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 48:
                    AbstractC5067l.ad(iArr[i4], (List) unsafe.getObject(obj, j), c5138l, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    int i16 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    InterfaceC0060l interfaceC0060lStartapp2 = c0372l.startapp(i4);
                    Class cls4 = AbstractC5067l.yandex;
                    if (list4 != null && !list4.isEmpty()) {
                        c5138l.getClass();
                        for (int i17 = 0; i17 < list4.size(); i17++) {
                            c5138l.m1712l(i16, list4.get(i17), interfaceC0060lStartapp2);
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    if (unsafe.getObject(obj, j) != null) {
                        Object objMetrica = c0372l.metrica(i4);
                        c0372l.remoteconfig.getClass();
                        AbstractC12589l.m3424strictfp(objMetrica);
                        throw null;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 51:
                    if (c0372l.tapsense(i6, i4, obj)) {
                        double dDoubleValue = ((Double) AbstractC1900l.crashlytics.subs(j, obj)).doubleValue();
                        AbstractC15335l abstractC15335l3 = (AbstractC15335l) c5138l.f11181l;
                        abstractC15335l3.getClass();
                        abstractC15335l3.vip(i6, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 52:
                    if (c0372l.tapsense(i6, i4, obj)) {
                        float fFloatValue = ((Float) AbstractC1900l.crashlytics.subs(j, obj)).floatValue();
                        AbstractC15335l abstractC15335l4 = (AbstractC15335l) c5138l.f11181l;
                        abstractC15335l4.getClass();
                        abstractC15335l4.smaato(i6, Float.floatToRawIntBits(fFloatValue));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 53:
                    if (c0372l.tapsense(i6, i4, obj)) {
                        ((AbstractC15335l) c5138l.f11181l).pro(i6, applovin(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 54:
                    if (c0372l.tapsense(i6, i4, obj)) {
                        ((AbstractC15335l) c5138l.f11181l).pro(i6, applovin(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 55:
                    if (c0372l.tapsense(i6, i4, obj)) {
                        ((AbstractC15335l) c5138l.f11181l).startapp(i6, premium(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 56:
                    if (c0372l.tapsense(i6, i4, obj)) {
                        ((AbstractC15335l) c5138l.f11181l).vip(i6, applovin(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 57:
                    if (c0372l.tapsense(i6, i4, obj)) {
                        ((AbstractC15335l) c5138l.f11181l).smaato(i6, premium(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 58:
                    if (c0372l.tapsense(i6, i4, obj)) {
                        ((AbstractC15335l) c5138l.f11181l).isPro(i6, ((Boolean) AbstractC1900l.crashlytics.subs(j, obj)).booleanValue());
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 59:
                    if (c0372l.tapsense(i6, i4, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof String) {
                            ((AbstractC15335l) c5138l.f11181l).subscription(i6, (String) object2);
                        } else {
                            ((AbstractC15335l) c5138l.f11181l).firebase(i6, (AbstractC15257l) object2);
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 60:
                    if (c0372l.tapsense(i6, i4, obj)) {
                        c5138l.m1716l(i6, unsafe.getObject(obj, j), c0372l.startapp(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 61:
                    if (c0372l.tapsense(i6, i4, obj)) {
                        ((AbstractC15335l) c5138l.f11181l).firebase(i6, (AbstractC15257l) unsafe.getObject(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 62:
                    if (c0372l.tapsense(i6, i4, obj)) {
                        ((AbstractC15335l) c5138l.f11181l).Signature(i6, premium(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 63:
                    if (c0372l.tapsense(i6, i4, obj)) {
                        ((AbstractC15335l) c5138l.f11181l).startapp(i6, premium(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    if (c0372l.tapsense(i6, i4, obj)) {
                        ((AbstractC15335l) c5138l.f11181l).smaato(i6, premium(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 65:
                    if (c0372l.tapsense(i6, i4, obj)) {
                        ((AbstractC15335l) c5138l.f11181l).vip(i6, applovin(j, obj));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 66:
                    if (c0372l.tapsense(i6, i4, obj)) {
                        int iPremium = premium(j, obj);
                        ((AbstractC15335l) c5138l.f11181l).Signature(i6, (iPremium >> 31) ^ (iPremium << 1));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 67:
                    if (c0372l.tapsense(i6, i4, obj)) {
                        long jApplovin = applovin(j, obj);
                        ((AbstractC15335l) c5138l.f11181l).pro(i6, (jApplovin << 1) ^ (jApplovin >> 63));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 68:
                    if (c0372l.tapsense(i6, i4, obj)) {
                        c5138l.m1712l(i6, unsafe.getObject(obj, j), c0372l.startapp(i4));
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
        c0372l.smaato.getClass();
        ((AbstractC13399l) obj).unknownFields.purchase(c5138l);
    }

    @Override // defpackage.InterfaceC0060l
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
            int iM484switch = m484switch(i6);
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
            if ((268435456 & iM484switch) == 0 || ads(obj, i6, i, i2, i10)) {
                int iM474case = m474case(iM484switch);
                if (iM474case == 9 || iM474case == 17) {
                    if (ads(obj, i6, i, i2, i10)) {
                        if (!startapp(i6).crashlytics(AbstractC1900l.crashlytics.subs(iM484switch & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                } else {
                    if (iM474case != 27) {
                        if (iM474case == 60 || iM474case == 68) {
                            if (tapsense(i7, i6, obj)) {
                                if (!startapp(i6).crashlytics(AbstractC1900l.crashlytics.subs(iM484switch & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                        } else if (iM474case != 49) {
                            if (iM474case != 50) {
                                continue;
                            } else {
                                Object objSubs = AbstractC1900l.crashlytics.subs(iM484switch & 1048575, obj);
                                this.remoteconfig.getClass();
                                if (!((C9704l) objSubs).isEmpty()) {
                                    AbstractC12589l.m3424strictfp(metrica(i6));
                                    throw null;
                                }
                            }
                        }
                        i5++;
                        i3 = i;
                        i4 = i2;
                    }
                    List list = (List) AbstractC1900l.crashlytics.subs(iM484switch & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC0060l interfaceC0060lStartapp = startapp(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (interfaceC0060lStartapp.crashlytics(list.get(i12))) {
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
    public final void m478else(int i, Object obj, Object obj2, int i2) {
        metrica.putObject(obj, m484switch(i2) & 1048575, obj2);
        m480for(i, i2, obj);
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final void m479extends(int i, Object obj) {
        int i2 = this.yandex[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        AbstractC1900l.vip(j, obj, (1 << (i2 >>> 20)) | AbstractC1900l.crashlytics.mopub(j, obj));
    }

    public final boolean firebase(AbstractC13399l abstractC13399l, AbstractC13399l abstractC13399l2, int i) {
        return adcel(i, abstractC13399l) == adcel(i, abstractC13399l2);
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final void m480for(int i, int i2, Object obj) {
        AbstractC1900l.vip(this.yandex[i2 + 2] & 1048575, obj, i);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12761. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int inmobi(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, defpackage.C16292l r35) {
        /*
            Method dump skipped, instruction units count: 1276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0372l.inmobi(java.lang.Object, byte[], int, int, int, lٍٖٕ):int");
    }

    @Override // defpackage.InterfaceC0060l
    public final void isPro(C5138l c5138l, Object obj) {
        c5138l.getClass();
        m477continue(c5138l, obj);
    }

    public final void license(int i, Object obj, Object obj2) {
        if (adcel(i, obj2)) {
            long jM484switch = m484switch(i) & 1048575;
            Unsafe unsafe = metrica;
            Object object = unsafe.getObject(obj2, jM484switch);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.yandex[i] + " is present but null: " + String.valueOf(obj2));
            }
            InterfaceC0060l interfaceC0060lStartapp = startapp(i);
            if (!adcel(i, obj)) {
                if (subscription(object)) {
                    Object objAmazon = interfaceC0060lStartapp.amazon();
                    interfaceC0060lStartapp.yandex(objAmazon, object);
                    unsafe.putObject(obj, jM484switch, objAmazon);
                } else {
                    unsafe.putObject(obj, jM484switch, object);
                }
                m479extends(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM484switch);
            if (!subscription(object2)) {
                Object objAmazon2 = interfaceC0060lStartapp.amazon();
                interfaceC0060lStartapp.yandex(objAmazon2, object2);
                unsafe.putObject(obj, jM484switch, objAmazon2);
                object2 = objAmazon2;
            }
            interfaceC0060lStartapp.yandex(object2, object);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[SYNTHETIC] */
    @Override // defpackage.InterfaceC0060l
    public final void loadAd(Object obj) {
        if (subscription(obj)) {
            if (obj instanceof AbstractC13399l) {
                AbstractC13399l abstractC13399l = (AbstractC13399l) obj;
                abstractC13399l.pro(Alert.DURATION_SHOW_INDEFINITELY);
                abstractC13399l.memoizedHashCode = 0;
                abstractC13399l.startapp();
            }
            int[] iArr = this.yandex;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iM484switch = m484switch(i);
                long j = 1048575 & iM484switch;
                int iM474case = m474case(iM484switch);
                if (iM474case != 9) {
                    if (iM474case != 60 && iM474case != 68) {
                        switch (iM474case) {
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
                                AbstractC7021l abstractC7021l = (AbstractC7021l) ((InterfaceC9858l) AbstractC1900l.crashlytics.subs(j, obj));
                                if (abstractC7021l.f14716l) {
                                    abstractC7021l.f14716l = false;
                                }
                                break;
                            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                Unsafe unsafe = metrica;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.remoteconfig.getClass();
                                    ((C9704l) object).f19790l = false;
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
            C7565l c7565l = ((AbstractC13399l) obj).unknownFields;
            if (c7565l.purchase) {
                c7565l.purchase = false;
            }
        }
    }

    public final Object metrica(int i) {
        return this.loadAd[(i / 3) * 2];
    }

    @Override // defpackage.InterfaceC0060l
    public final void mopub(Object obj, byte[] bArr, int i, int i2, C16292l c16292l) {
        inmobi(obj, bArr, i, i2, 0, c16292l);
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final void m481native(int i, C12676l c12676l, Object obj) throws C8236l, C5347l, C8352l {
        boolean z = (536870912 & i) != 0;
        C4863l c4863l = this.firebase;
        if (z) {
            c12676l.m3447finally(c4863l.yandex(i & 1048575, obj), true);
        } else {
            c12676l.m3447finally(c4863l.yandex(i & 1048575, obj), false);
        }
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final int m482package(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, long j, int i6, long j2, C16292l c16292l) throws C2297l {
        int i7;
        int iAdmob;
        Unsafe unsafe = metrica;
        InterfaceC9858l interfaceC9858lYandex = (InterfaceC9858l) unsafe.getObject(obj, j2);
        if (!((AbstractC7021l) interfaceC9858lYandex).f14716l) {
            interfaceC9858lYandex = interfaceC9858lYandex.yandex(interfaceC9858lYandex.size() * 2);
            unsafe.putObject(obj, j2, interfaceC9858lYandex);
        }
        InterfaceC9858l interfaceC9858l = interfaceC9858lYandex;
        switch (i6) {
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                if (i4 != 2) {
                    if (i4 != 1) {
                        return i;
                    }
                    AbstractC9488l abstractC9488l = (AbstractC9488l) interfaceC9858l;
                    abstractC9488l.billing(Double.longBitsToDouble(AbstractC5646l.crashlytics(i, bArr)));
                    int i8 = i + 8;
                    while (i8 < i2) {
                        int iMopub = AbstractC5646l.mopub(bArr, i8, c16292l);
                        if (i3 != c16292l.yandex) {
                            return i8;
                        }
                        abstractC9488l.billing(Double.longBitsToDouble(AbstractC5646l.crashlytics(iMopub, bArr)));
                        i8 = iMopub + 8;
                    }
                    return i8;
                }
                AbstractC9488l abstractC9488l2 = (AbstractC9488l) interfaceC9858l;
                int iMopub2 = AbstractC5646l.mopub(bArr, i, c16292l);
                int i9 = c16292l.yandex;
                int i10 = iMopub2 + i9;
                if (i10 > bArr.length) {
                    throw C2297l.mopub();
                }
                int i11 = (i9 / 8) + 0;
                double[] dArr = abstractC9488l2.f19374l;
                if (i11 > dArr.length) {
                    if (dArr.length == 0) {
                        abstractC9488l2.f19374l = new double[Math.max(i11, 10)];
                    } else {
                        int length = dArr.length;
                        while (length < i11) {
                            length = AbstractC15560l.vip(length, 3, 2, 1, 10);
                        }
                        abstractC9488l2.f19374l = Arrays.copyOf(abstractC9488l2.f19374l, length);
                    }
                }
                while (iMopub2 < i10) {
                    abstractC9488l2.billing(Double.longBitsToDouble(AbstractC5646l.crashlytics(iMopub2, bArr)));
                    iMopub2 += 8;
                }
                if (iMopub2 == i10) {
                    return iMopub2;
                }
                throw C2297l.mopub();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case Maneuver.TYPE_STRAIGHT /* 36 */:
                if (i4 != 2) {
                    if (i4 != 5) {
                        return i;
                    }
                    AbstractC14281l abstractC14281l = (AbstractC14281l) interfaceC9858l;
                    abstractC14281l.billing(Float.intBitsToFloat(AbstractC5646l.loadAd(i, bArr)));
                    int i12 = i + 4;
                    while (i12 < i2) {
                        int iMopub3 = AbstractC5646l.mopub(bArr, i12, c16292l);
                        if (i3 != c16292l.yandex) {
                            return i12;
                        }
                        abstractC14281l.billing(Float.intBitsToFloat(AbstractC5646l.loadAd(iMopub3, bArr)));
                        i12 = iMopub3 + 4;
                    }
                    return i12;
                }
                AbstractC14281l abstractC14281l2 = (AbstractC14281l) interfaceC9858l;
                int iMopub4 = AbstractC5646l.mopub(bArr, i, c16292l);
                int i13 = c16292l.yandex;
                int i14 = iMopub4 + i13;
                if (i14 > bArr.length) {
                    throw C2297l.mopub();
                }
                int i15 = (i13 / 4) + 0;
                float[] fArr = abstractC14281l2.f27963l;
                if (i15 > fArr.length) {
                    if (fArr.length == 0) {
                        abstractC14281l2.f27963l = new float[Math.max(i15, 10)];
                    } else {
                        int length2 = fArr.length;
                        while (length2 < i15) {
                            length2 = AbstractC15560l.vip(length2, 3, 2, 1, 10);
                        }
                        abstractC14281l2.f27963l = Arrays.copyOf(abstractC14281l2.f27963l, length2);
                    }
                }
                while (iMopub4 < i14) {
                    abstractC14281l2.billing(Float.intBitsToFloat(AbstractC5646l.loadAd(iMopub4, bArr)));
                    iMopub4 += 4;
                }
                if (iMopub4 == i14) {
                    return iMopub4;
                }
                throw C2297l.mopub();
            case 20:
            case 21:
            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                if (i4 == 2) {
                    AbstractC13401l abstractC13401l = (AbstractC13401l) interfaceC9858l;
                    int iMopub5 = AbstractC5646l.mopub(bArr, i, c16292l);
                    int i16 = c16292l.yandex + iMopub5;
                    while (iMopub5 < i16) {
                        iMopub5 = AbstractC5646l.subs(bArr, iMopub5, c16292l);
                        abstractC13401l.billing(c16292l.loadAd);
                    }
                    if (iMopub5 == i16) {
                        return iMopub5;
                    }
                    throw C2297l.mopub();
                }
                if (i4 != 0) {
                    return i;
                }
                AbstractC13401l abstractC13401l2 = (AbstractC13401l) interfaceC9858l;
                int iSubs = AbstractC5646l.subs(bArr, i, c16292l);
                abstractC13401l2.billing(c16292l.loadAd);
                while (iSubs < i2) {
                    int iMopub6 = AbstractC5646l.mopub(bArr, iSubs, c16292l);
                    if (i3 != c16292l.yandex) {
                        return iSubs;
                    }
                    iSubs = AbstractC5646l.subs(bArr, iMopub6, c16292l);
                    abstractC13401l2.billing(c16292l.loadAd);
                }
                return iSubs;
            case 22:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case Maneuver.TYPE_DESTINATION /* 39 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                i7 = i;
                if (i4 == 2) {
                    AbstractC13800l abstractC13800l = (AbstractC13800l) interfaceC9858l;
                    int iMopub7 = AbstractC5646l.mopub(bArr, i7, c16292l);
                    int i17 = c16292l.yandex + iMopub7;
                    while (iMopub7 < i17) {
                        iMopub7 = AbstractC5646l.mopub(bArr, iMopub7, c16292l);
                        abstractC13800l.billing(c16292l.yandex);
                    }
                    if (iMopub7 == i17) {
                        return iMopub7;
                    }
                    throw C2297l.mopub();
                }
                if (i4 == 0) {
                    return AbstractC5646l.admob(i3, bArr, i7, i2, interfaceC9858l, c16292l);
                }
                break;
            case 23:
            case 32:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                i7 = i;
                if (i4 == 2) {
                    AbstractC13401l abstractC13401l3 = (AbstractC13401l) interfaceC9858l;
                    int iMopub8 = AbstractC5646l.mopub(bArr, i7, c16292l);
                    int i18 = c16292l.yandex;
                    int i19 = iMopub8 + i18;
                    if (i19 > bArr.length) {
                        throw C2297l.mopub();
                    }
                    int i20 = (i18 / 8) + 0;
                    long[] jArr = abstractC13401l3.f26307l;
                    if (i20 > jArr.length) {
                        if (jArr.length == 0) {
                            abstractC13401l3.f26307l = new long[Math.max(i20, 10)];
                        } else {
                            int length3 = jArr.length;
                            while (length3 < i20) {
                                length3 = AbstractC15560l.vip(length3, 3, 2, 1, 10);
                            }
                            abstractC13401l3.f26307l = Arrays.copyOf(abstractC13401l3.f26307l, length3);
                        }
                    }
                    while (iMopub8 < i19) {
                        abstractC13401l3.billing(AbstractC5646l.crashlytics(iMopub8, bArr));
                        iMopub8 += 8;
                    }
                    if (iMopub8 == i19) {
                        return iMopub8;
                    }
                    throw C2297l.mopub();
                }
                if (i4 == 1) {
                    AbstractC13401l abstractC13401l4 = (AbstractC13401l) interfaceC9858l;
                    abstractC13401l4.billing(AbstractC5646l.crashlytics(i7, bArr));
                    int i21 = i7 + 8;
                    while (i21 < i2) {
                        int iMopub9 = AbstractC5646l.mopub(bArr, i21, c16292l);
                        if (i3 != c16292l.yandex) {
                            return i21;
                        }
                        abstractC13401l4.billing(AbstractC5646l.crashlytics(iMopub9, bArr));
                        i21 = iMopub9 + 8;
                    }
                    return i21;
                }
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case 31:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                i7 = i;
                if (i4 == 2) {
                    AbstractC13800l abstractC13800l2 = (AbstractC13800l) interfaceC9858l;
                    int iMopub10 = AbstractC5646l.mopub(bArr, i7, c16292l);
                    int i22 = c16292l.yandex;
                    int i23 = iMopub10 + i22;
                    if (i23 > bArr.length) {
                        throw C2297l.mopub();
                    }
                    int i24 = (i22 / 4) + 0;
                    int[] iArr = abstractC13800l2.f26933l;
                    if (i24 > iArr.length) {
                        if (iArr.length == 0) {
                            abstractC13800l2.f26933l = new int[Math.max(i24, 10)];
                        } else {
                            int length4 = iArr.length;
                            while (length4 < i24) {
                                length4 = AbstractC15560l.vip(length4, 3, 2, 1, 10);
                            }
                            abstractC13800l2.f26933l = Arrays.copyOf(abstractC13800l2.f26933l, length4);
                        }
                    }
                    while (iMopub10 < i23) {
                        abstractC13800l2.billing(AbstractC5646l.loadAd(iMopub10, bArr));
                        iMopub10 += 4;
                    }
                    if (iMopub10 == i23) {
                        return iMopub10;
                    }
                    throw C2297l.mopub();
                }
                if (i4 == 5) {
                    AbstractC13800l abstractC13800l3 = (AbstractC13800l) interfaceC9858l;
                    abstractC13800l3.billing(AbstractC5646l.loadAd(i7, bArr));
                    int i25 = i7 + 4;
                    while (i25 < i2) {
                        int iMopub11 = AbstractC5646l.mopub(bArr, i25, c16292l);
                        if (i3 != c16292l.yandex) {
                            return i25;
                        }
                        abstractC13800l3.billing(AbstractC5646l.loadAd(iMopub11, bArr));
                        i25 = iMopub11 + 4;
                    }
                    return i25;
                }
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                i7 = i;
                if (i4 == 2) {
                    AbstractC16587l abstractC16587l = (AbstractC16587l) interfaceC9858l;
                    int iMopub12 = AbstractC5646l.mopub(bArr, i7, c16292l);
                    int i26 = c16292l.yandex + iMopub12;
                    while (iMopub12 < i26) {
                        iMopub12 = AbstractC5646l.subs(bArr, iMopub12, c16292l);
                        abstractC16587l.billing(c16292l.loadAd != 0);
                    }
                    if (iMopub12 == i26) {
                        return iMopub12;
                    }
                    throw C2297l.mopub();
                }
                if (i4 == 0) {
                    AbstractC16587l abstractC16587l2 = (AbstractC16587l) interfaceC9858l;
                    int iSubs2 = AbstractC5646l.subs(bArr, i7, c16292l);
                    abstractC16587l2.billing(c16292l.loadAd != 0);
                    while (iSubs2 < i2) {
                        int iMopub13 = AbstractC5646l.mopub(bArr, iSubs2, c16292l);
                        if (i3 != c16292l.yandex) {
                            return iSubs2;
                        }
                        iSubs2 = AbstractC5646l.subs(bArr, iMopub13, c16292l);
                        abstractC16587l2.billing(c16292l.loadAd != 0);
                    }
                    return iSubs2;
                }
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                i7 = i;
                if (i4 == 2) {
                    if ((j & 536870912) == 0) {
                        int iMopub14 = AbstractC5646l.mopub(bArr, i7, c16292l);
                        int i27 = c16292l.yandex;
                        if (i27 < 0) {
                            throw C2297l.purchase();
                        }
                        if (i27 == 0) {
                            interfaceC9858l.add("");
                        } else {
                            interfaceC9858l.add(new String(bArr, iMopub14, i27, AbstractC6061l.yandex));
                            iMopub14 += i27;
                        }
                        while (iMopub14 < i2) {
                            int iMopub15 = AbstractC5646l.mopub(bArr, iMopub14, c16292l);
                            if (i3 != c16292l.yandex) {
                                return iMopub14;
                            }
                            iMopub14 = AbstractC5646l.mopub(bArr, iMopub15, c16292l);
                            int i28 = c16292l.yandex;
                            if (i28 < 0) {
                                throw C2297l.purchase();
                            }
                            if (i28 == 0) {
                                interfaceC9858l.add("");
                            } else {
                                interfaceC9858l.add(new String(bArr, iMopub14, i28, AbstractC6061l.yandex));
                                iMopub14 += i28;
                            }
                        }
                        return iMopub14;
                    }
                    int iMopub16 = AbstractC5646l.mopub(bArr, i7, c16292l);
                    int i29 = c16292l.yandex;
                    if (i29 < 0) {
                        throw C2297l.purchase();
                    }
                    if (i29 == 0) {
                        interfaceC9858l.add("");
                    } else {
                        int i30 = iMopub16 + i29;
                        if (AbstractC3472l.yandex.mopub(iMopub16, i30, bArr) != 0) {
                            throw C2297l.loadAd();
                        }
                        interfaceC9858l.add(new String(bArr, iMopub16, i29, AbstractC6061l.yandex));
                        iMopub16 = i30;
                    }
                    while (iMopub16 < i2) {
                        int iMopub17 = AbstractC5646l.mopub(bArr, iMopub16, c16292l);
                        if (i3 != c16292l.yandex) {
                            return iMopub16;
                        }
                        iMopub16 = AbstractC5646l.mopub(bArr, iMopub17, c16292l);
                        int i31 = c16292l.yandex;
                        if (i31 < 0) {
                            throw C2297l.purchase();
                        }
                        if (i31 == 0) {
                            interfaceC9858l.add("");
                        } else {
                            int i32 = iMopub16 + i31;
                            if (AbstractC3472l.yandex.mopub(iMopub16, i32, bArr) != 0) {
                                throw C2297l.loadAd();
                            }
                            interfaceC9858l.add(new String(bArr, iMopub16, i31, AbstractC6061l.yandex));
                            iMopub16 = i32;
                        }
                    }
                    return iMopub16;
                }
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return i4 == 2 ? AbstractC5646l.amazon(startapp(i5), i3, bArr, i, i2, interfaceC9858l, c16292l) : i;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                if (i4 != 2) {
                    return i;
                }
                int iMopub18 = AbstractC5646l.mopub(bArr, i, c16292l);
                int i33 = c16292l.yandex;
                if (i33 < 0) {
                    throw C2297l.purchase();
                }
                if (i33 > bArr.length - iMopub18) {
                    throw C2297l.mopub();
                }
                if (i33 == 0) {
                    interfaceC9858l.add(AbstractC15257l.f29847l);
                } else {
                    interfaceC9858l.add(AbstractC15257l.mopub(iMopub18, i33, bArr));
                    iMopub18 += i33;
                }
                while (iMopub18 < i2) {
                    int iMopub19 = AbstractC5646l.mopub(bArr, iMopub18, c16292l);
                    if (i3 != c16292l.yandex) {
                        return iMopub18;
                    }
                    iMopub18 = AbstractC5646l.mopub(bArr, iMopub19, c16292l);
                    int i34 = c16292l.yandex;
                    if (i34 < 0) {
                        throw C2297l.purchase();
                    }
                    if (i34 > bArr.length - iMopub18) {
                        throw C2297l.mopub();
                    }
                    if (i34 == 0) {
                        interfaceC9858l.add(AbstractC15257l.f29847l);
                    } else {
                        interfaceC9858l.add(AbstractC15257l.mopub(iMopub18, i34, bArr));
                        iMopub18 += i34;
                    }
                }
                return iMopub18;
            case 30:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                if (i4 == 2) {
                    AbstractC13800l abstractC13800l4 = (AbstractC13800l) interfaceC9858l;
                    iAdmob = AbstractC5646l.mopub(bArr, i, c16292l);
                    int i35 = c16292l.yandex + iAdmob;
                    while (iAdmob < i35) {
                        iAdmob = AbstractC5646l.mopub(bArr, iAdmob, c16292l);
                        abstractC13800l4.billing(c16292l.yandex);
                    }
                    if (iAdmob != i35) {
                        throw C2297l.mopub();
                    }
                } else {
                    if (i4 != 0) {
                        return i;
                    }
                    iAdmob = AbstractC5646l.admob(i3, bArr, i, i2, interfaceC9858l, c16292l);
                }
                vip(i5);
                Class cls = AbstractC5067l.yandex;
                return iAdmob;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                if (i4 == 2) {
                    AbstractC13800l abstractC13800l5 = (AbstractC13800l) interfaceC9858l;
                    int iMopub20 = AbstractC5646l.mopub(bArr, i, c16292l);
                    int i36 = c16292l.yandex + iMopub20;
                    while (iMopub20 < i36) {
                        iMopub20 = AbstractC5646l.mopub(bArr, iMopub20, c16292l);
                        abstractC13800l5.billing(AbstractC15029l.purchase(c16292l.yandex));
                    }
                    if (iMopub20 == i36) {
                        return iMopub20;
                    }
                    throw C2297l.mopub();
                }
                if (i4 != 0) {
                    return i;
                }
                AbstractC13800l abstractC13800l6 = (AbstractC13800l) interfaceC9858l;
                int iMopub21 = AbstractC5646l.mopub(bArr, i, c16292l);
                abstractC13800l6.billing(AbstractC15029l.purchase(c16292l.yandex));
                while (iMopub21 < i2) {
                    int iMopub22 = AbstractC5646l.mopub(bArr, iMopub21, c16292l);
                    if (i3 != c16292l.yandex) {
                        return iMopub21;
                    }
                    iMopub21 = AbstractC5646l.mopub(bArr, iMopub22, c16292l);
                    abstractC13800l6.billing(AbstractC15029l.purchase(c16292l.yandex));
                }
                return iMopub21;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
            case 48:
                if (i4 == 2) {
                    AbstractC13401l abstractC13401l5 = (AbstractC13401l) interfaceC9858l;
                    int iMopub23 = AbstractC5646l.mopub(bArr, i, c16292l);
                    int i37 = c16292l.yandex + iMopub23;
                    while (iMopub23 < i37) {
                        iMopub23 = AbstractC5646l.subs(bArr, iMopub23, c16292l);
                        abstractC13401l5.billing(AbstractC15029l.mopub(c16292l.loadAd));
                    }
                    if (iMopub23 == i37) {
                        return iMopub23;
                    }
                    throw C2297l.mopub();
                }
                if (i4 != 0) {
                    return i;
                }
                AbstractC13401l abstractC13401l6 = (AbstractC13401l) interfaceC9858l;
                int iSubs3 = AbstractC5646l.subs(bArr, i, c16292l);
                abstractC13401l6.billing(AbstractC15029l.mopub(c16292l.loadAd));
                while (iSubs3 < i2) {
                    int iMopub24 = AbstractC5646l.mopub(bArr, iSubs3, c16292l);
                    if (i3 != c16292l.yandex) {
                        return iSubs3;
                    }
                    iSubs3 = AbstractC5646l.subs(bArr, iMopub24, c16292l);
                    abstractC13401l6.billing(AbstractC15029l.mopub(c16292l.loadAd));
                }
                return iSubs3;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                if (i4 == 3) {
                    InterfaceC0060l interfaceC0060lStartapp = startapp(i5);
                    int i38 = (i3 & (-8)) | 4;
                    Object objAmazon = interfaceC0060lStartapp.amazon();
                    int iRemoteconfig = AbstractC5646l.remoteconfig(objAmazon, interfaceC0060lStartapp, bArr, i, i2, i38, c16292l);
                    interfaceC0060lStartapp.loadAd(objAmazon);
                    c16292l.crashlytics = objAmazon;
                    interfaceC9858l.add(objAmazon);
                    while (iRemoteconfig < i2) {
                        int iMopub25 = AbstractC5646l.mopub(bArr, iRemoteconfig, c16292l);
                        if (i3 != c16292l.yandex) {
                            return iRemoteconfig;
                        }
                        Object objAmazon2 = interfaceC0060lStartapp.amazon();
                        iRemoteconfig = AbstractC5646l.remoteconfig(objAmazon2, interfaceC0060lStartapp, bArr, iMopub25, i2, i38, c16292l);
                        interfaceC0060lStartapp.loadAd(objAmazon2);
                        c16292l.crashlytics = objAmazon2;
                        interfaceC9858l.add(objAmazon2);
                    }
                    return iRemoteconfig;
                }
            default:
                return i;
        }
        return i7;
    }

    public final void pro(int i, Object obj, Object obj2) {
        int[] iArr = this.yandex;
        int i2 = iArr[i];
        if (tapsense(i2, i, obj2)) {
            long jM484switch = m484switch(i) & 1048575;
            Unsafe unsafe = metrica;
            Object object = unsafe.getObject(obj2, jM484switch);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + String.valueOf(obj2));
            }
            InterfaceC0060l interfaceC0060lStartapp = startapp(i);
            if (!tapsense(i2, i, obj)) {
                if (subscription(object)) {
                    Object objAmazon = interfaceC0060lStartapp.amazon();
                    interfaceC0060lStartapp.yandex(objAmazon, object);
                    unsafe.putObject(obj, jM484switch, objAmazon);
                } else {
                    unsafe.putObject(obj, jM484switch, object);
                }
                m480for(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM484switch);
            if (!subscription(object2)) {
                Object objAmazon2 = interfaceC0060lStartapp.amazon();
                interfaceC0060lStartapp.yandex(objAmazon2, object2);
                unsafe.putObject(obj, jM484switch, objAmazon2);
                object2 = objAmazon2;
            }
            interfaceC0060lStartapp.yandex(object2, object);
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x06be A[Catch: all -> 0x0423, TryCatch #0 {all -> 0x0423, blocks: (B:148:0x06b9, B:150:0x06be, B:151:0x06c3, B:110:0x041e, B:113:0x0426, B:114:0x0438, B:115:0x044a, B:116:0x045c, B:117:0x046e, B:118:0x0480, B:119:0x0492, B:120:0x04a4, B:121:0x04b6, B:122:0x04d0, B:123:0x04ec, B:124:0x0509, B:125:0x0526, B:126:0x0543, B:127:0x0563, B:128:0x0580, B:129:0x0595, B:130:0x05b0, B:131:0x05bd, B:132:0x05dc, B:133:0x05f9, B:134:0x0616, B:135:0x0633, B:136:0x0650, B:137:0x066d, B:138:0x068b, B:142:0x06a9), top: B:168:0x06b9 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x06ce A[LOOP:2: B:154:0x06cc->B:155:0x06ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:162:0x06e7 A[LOOP:3: B:161:0x06e5->B:162:0x06e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:164:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:197:0x06ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.InterfaceC0060l
    public final void purchase(Object obj, C12676l c12676l, C7597l c7597l) throws Throwable {
        int i;
        int i2;
        C12676l c12676l2;
        int i3;
        C0372l c0372l = this;
        Object obj2 = obj;
        C12676l c12676l3 = c12676l;
        C7597l c7597l2 = c7597l;
        c7597l2.getClass();
        smaato(obj2);
        C18155l c18155l = c0372l.smaato;
        int[] iArr = c0372l.mopub;
        int i4 = c0372l.subs;
        int i5 = c0372l.admob;
        C7565l c7565lYandex = null;
        while (true) {
            try {
                int iBilling = c12676l3.billing();
                int iM486throw = (iBilling < c0372l.crashlytics || iBilling > c0372l.amazon) ? -1 : c0372l.m486throw(iBilling, 0);
                if (iM486throw >= 0) {
                    int iM484switch = c0372l.m484switch(iM486throw);
                    try {
                        int iM474case = m474case(iM484switch);
                        C4863l c4863l = c0372l.firebase;
                        switch (iM474case) {
                            case 0:
                                i = i5;
                                c0372l = c0372l;
                                c12676l2 = c12676l3;
                                long jSignatures = signatures(iM484switch);
                                c12676l2.m3487return(1);
                                Object obj3 = obj2;
                                try {
                                    AbstractC1900l.crashlytics.remoteconfig(obj3, jSignatures, ((AbstractC15029l) c12676l2.purchase).license());
                                    obj2 = obj3;
                                    c0372l.m479extends(iM486throw, obj2);
                                } catch (C8236l unused) {
                                    obj2 = obj3;
                                    try {
                                        c18155l.getClass();
                                        if (c7565lYandex == null) {
                                            c7565lYandex = C18155l.yandex(obj2);
                                        }
                                        if (!C18155l.loadAd(0, c12676l2, c7565lYandex)) {
                                            for (i3 = i; i3 < i4; i3++) {
                                                c0372l.remoteconfig(iArr[i3], obj2, c7565lYandex);
                                            }
                                            if (c7565lYandex == null) {
                                                return;
                                            }
                                            ((AbstractC13399l) obj2).unknownFields = c7565lYandex;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        for (i2 = i; i2 < i4; i2++) {
                                            c0372l.remoteconfig(iArr[i2], obj2, c7565lYandex);
                                        }
                                        if (c7565lYandex != null) {
                                            c18155l.getClass();
                                            ((AbstractC13399l) obj2).unknownFields = c7565lYandex;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj2 = obj3;
                                    while (i2 < i4) {
                                        c0372l.remoteconfig(iArr[i2], obj2, c7565lYandex);
                                    }
                                    if (c7565lYandex != null) {
                                        c18155l.getClass();
                                        ((AbstractC13399l) obj2).unknownFields = c7565lYandex;
                                    }
                                    throw th;
                                }
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 1:
                                i = i5;
                                c0372l = c0372l;
                                c12676l2 = c12676l3;
                                long jSignatures2 = signatures(iM484switch);
                                c12676l2.m3487return(5);
                                AbstractC1900l.crashlytics.vip(obj2, jSignatures2, ((AbstractC15029l) c12676l2.purchase).isVip());
                                c0372l.m479extends(iM486throw, obj2);
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 2:
                                i = i5;
                                c0372l = c0372l;
                                c12676l2 = c12676l3;
                                long jSignatures3 = signatures(iM484switch);
                                c12676l2.m3487return(0);
                                AbstractC1900l.metrica(jSignatures3, ((AbstractC15029l) c12676l2.purchase).premium(), obj2);
                                c0372l.m479extends(iM486throw, obj2);
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 3:
                                i = i5;
                                c0372l = c0372l;
                                c12676l2 = c12676l3;
                                long jSignatures4 = signatures(iM484switch);
                                c12676l2.m3487return(0);
                                AbstractC1900l.metrica(jSignatures4, ((AbstractC15029l) c12676l2.purchase).mo1020native(), obj2);
                                c0372l.m479extends(iM486throw, obj2);
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 4:
                                i = i5;
                                c0372l = c0372l;
                                c12676l2 = c12676l3;
                                long jSignatures5 = signatures(iM484switch);
                                c12676l2.m3487return(0);
                                AbstractC1900l.vip(jSignatures5, obj2, ((AbstractC15029l) c12676l2.purchase).signatures());
                                c0372l.m479extends(iM486throw, obj2);
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 5:
                                i = i5;
                                c0372l = c0372l;
                                c12676l2 = c12676l3;
                                long jSignatures6 = signatures(iM484switch);
                                c12676l2.m3487return(1);
                                AbstractC1900l.metrica(jSignatures6, ((AbstractC15029l) c12676l2.purchase).advert(), obj2);
                                c0372l.m479extends(iM486throw, obj2);
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 6:
                                i = i5;
                                c0372l = c0372l;
                                c12676l2 = c12676l3;
                                long jSignatures7 = signatures(iM484switch);
                                c12676l2.m3487return(5);
                                AbstractC1900l.vip(jSignatures7, obj2, ((AbstractC15029l) c12676l2.purchase).ad());
                                c0372l.m479extends(iM486throw, obj2);
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 7:
                                i = i5;
                                c0372l = c0372l;
                                c12676l2 = c12676l3;
                                long jSignatures8 = signatures(iM484switch);
                                c12676l2.m3487return(0);
                                AbstractC1900l.crashlytics.firebase(obj2, jSignatures8, ((AbstractC15029l) c12676l2.purchase).subscription());
                                c0372l.m479extends(iM486throw, obj2);
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 8:
                                i = i5;
                                c0372l = c0372l;
                                c12676l2 = c12676l3;
                                c0372l.m488volatile(iM484switch, c12676l2, obj2);
                                c0372l.m479extends(iM486throw, obj2);
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 9:
                                C7597l c7597l3 = c7597l2;
                                i = i5;
                                c0372l = c0372l;
                                c12676l2 = c12676l3;
                                AbstractC15944l abstractC15944l = (AbstractC15944l) c0372l.ad(iM486throw, obj2);
                                InterfaceC0060l interfaceC0060lStartapp = c0372l.startapp(iM486throw);
                                c12676l2.m3487return(2);
                                c12676l2.remoteconfig(abstractC15944l, interfaceC0060lStartapp, c7597l3);
                                c0372l.m476catch(iM486throw, obj2, abstractC15944l);
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 10:
                                i = i5;
                                c0372l = c0372l;
                                c12676l2 = c12676l3;
                                AbstractC1900l.startapp(signatures(iM484switch), obj2, c12676l2.tapsense());
                                c0372l.m479extends(iM486throw, obj2);
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 11:
                                i = i5;
                                c0372l = c0372l;
                                c12676l2 = c12676l3;
                                long jSignatures9 = signatures(iM484switch);
                                c12676l2.m3487return(0);
                                AbstractC1900l.vip(jSignatures9, obj2, ((AbstractC15029l) c12676l2.purchase).mo1028volatile());
                                c0372l.m479extends(iM486throw, obj2);
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 12:
                                i = i5;
                                c0372l = c0372l;
                                c12676l2 = c12676l3;
                                c12676l2.m3487return(0);
                                int iPro = ((AbstractC15029l) c12676l2.purchase).pro();
                                c0372l.vip(iM486throw);
                                AbstractC1900l.vip(signatures(iM484switch), obj2, iPro);
                                c0372l.m479extends(iM486throw, obj2);
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 13:
                                i = i5;
                                c0372l = c0372l;
                                c12676l2 = c12676l3;
                                long jSignatures10 = signatures(iM484switch);
                                c12676l2.m3487return(5);
                                AbstractC1900l.vip(jSignatures10, obj2, ((AbstractC15029l) c12676l2.purchase).applovin());
                                c0372l.m479extends(iM486throw, obj2);
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 14:
                                i = i5;
                                c0372l = c0372l;
                                c12676l2 = c12676l3;
                                long jSignatures11 = signatures(iM484switch);
                                c12676l2.m3487return(1);
                                AbstractC1900l.metrica(jSignatures11, ((AbstractC15029l) c12676l2.purchase).appmetrica(), obj2);
                                c0372l.m479extends(iM486throw, obj2);
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 15:
                                i = i5;
                                c0372l = c0372l;
                                c12676l2 = c12676l3;
                                long jSignatures12 = signatures(iM484switch);
                                c12676l2.m3487return(0);
                                AbstractC1900l.vip(jSignatures12, obj2, ((AbstractC15029l) c12676l2.purchase).inmobi());
                                c0372l.m479extends(iM486throw, obj2);
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 16:
                                i = i5;
                                c0372l = c0372l;
                                c12676l2 = c12676l3;
                                long jSignatures13 = signatures(iM484switch);
                                c12676l2.m3487return(0);
                                AbstractC1900l.metrica(jSignatures13, ((AbstractC15029l) c12676l2.purchase).mo1027throws(), obj2);
                                c0372l.m479extends(iM486throw, obj2);
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                                C7597l c7597l4 = c7597l2;
                                i = i5;
                                c0372l = c0372l;
                                c12676l2 = c12676l3;
                                AbstractC15944l abstractC15944l2 = (AbstractC15944l) c0372l.ad(iM486throw, obj2);
                                InterfaceC0060l interfaceC0060lStartapp2 = c0372l.startapp(iM486throw);
                                c12676l2.m3487return(3);
                                c12676l2.isPro(abstractC15944l2, interfaceC0060lStartapp2, c7597l4);
                                c0372l.m476catch(iM486throw, obj2, abstractC15944l2);
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                                i = i5;
                                c0372l = c0372l;
                                c12676l2 = c12676l3;
                                c12676l2.advert(c4863l.yandex(signatures(iM484switch), obj2));
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                                i = i5;
                                c0372l = c0372l;
                                c12676l2 = c12676l3;
                                c12676l2.m3484private(c4863l.yandex(signatures(iM484switch), obj2));
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 20:
                                i = i5;
                                c0372l = c0372l;
                                c12676l2 = c12676l3;
                                c12676l2.m3438case(c4863l.yandex(signatures(iM484switch), obj2));
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 21:
                                i = i5;
                                c0372l = c0372l;
                                c12676l2 = c12676l3;
                                c12676l2.m3499while(c4863l.yandex(signatures(iM484switch), obj2));
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 22:
                                i = i5;
                                c0372l = c0372l;
                                c12676l2 = c12676l3;
                                c12676l2.m3494throw(c4863l.yandex(signatures(iM484switch), obj2));
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 23:
                                i = i5;
                                c0372l = c0372l;
                                c12676l2 = c12676l3;
                                c12676l2.m3489strictfp(c4863l.yandex(signatures(iM484switch), obj2));
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                                i = i5;
                                c0372l = c0372l;
                                c12676l2 = c12676l3;
                                c12676l2.m3495throws(c4863l.yandex(signatures(iM484switch), obj2));
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                                i = i5;
                                c0372l = c0372l;
                                c12676l2 = c12676l3;
                                c12676l2.startapp(c4863l.yandex(signatures(iM484switch), obj2));
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                                i = i5;
                                c0372l = c0372l;
                                c12676l2 = c12676l3;
                                try {
                                    c0372l.m481native(iM484switch, c12676l2, obj2);
                                } catch (C8236l unused2) {
                                    c18155l.getClass();
                                    if (c7565lYandex == null) {
                                        c7565lYandex = C18155l.yandex(obj2);
                                    }
                                    if (!C18155l.loadAd(0, c12676l2, c7565lYandex)) {
                                        while (i3 < i4) {
                                            c0372l.remoteconfig(iArr[i3], obj2, c7565lYandex);
                                        }
                                        if (c7565lYandex == null) {
                                            return;
                                        }
                                        ((AbstractC13399l) obj2).unknownFields = c7565lYandex;
                                    }
                                }
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                                i = i5;
                                try {
                                    try {
                                        c0372l.m483strictfp(obj2, iM484switch, c12676l3, c0372l.startapp(iM486throw), c7597l);
                                        c12676l2 = c12676l3;
                                        c0372l = c0372l;
                                    } catch (C8236l unused3) {
                                        c12676l2 = c12676l3;
                                        c0372l = c0372l;
                                        c18155l.getClass();
                                        if (c7565lYandex == null) {
                                            c7565lYandex = C18155l.yandex(obj2);
                                        }
                                        if (!C18155l.loadAd(0, c12676l2, c7565lYandex)) {
                                            while (i3 < i4) {
                                                c0372l.remoteconfig(iArr[i3], obj2, c7565lYandex);
                                            }
                                            if (c7565lYandex == null) {
                                                return;
                                            }
                                            ((AbstractC13399l) obj2).unknownFields = c7565lYandex;
                                        }
                                    }
                                } catch (C8236l unused4) {
                                    c12676l2 = c12676l3;
                                    c18155l.getClass();
                                    if (c7565lYandex == null) {
                                        c7565lYandex = C18155l.yandex(obj2);
                                    }
                                    if (!C18155l.loadAd(0, c12676l2, c7565lYandex)) {
                                        while (i3 < i4) {
                                            c0372l.remoteconfig(iArr[i3], obj2, c7565lYandex);
                                        }
                                        if (c7565lYandex == null) {
                                            return;
                                        }
                                        ((AbstractC13399l) obj2).unknownFields = c7565lYandex;
                                    }
                                }
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                                i = i5;
                                c12676l3.license(c4863l.yandex(signatures(iM484switch), obj2));
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                                i = i5;
                                c12676l3.m3437break(c4863l.yandex(signatures(iM484switch), obj2));
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 30:
                                i = i5;
                                InterfaceC9858l interfaceC9858lYandex = c4863l.yandex(signatures(iM484switch), obj2);
                                c12676l3.premium(interfaceC9858lYandex);
                                c0372l.vip(iM486throw);
                                AbstractC5067l.isPro(obj2, iBilling, interfaceC9858lYandex, c7565lYandex, c18155l);
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 31:
                                i = i5;
                                c12676l3.m3440class(c4863l.yandex(signatures(iM484switch), obj2));
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 32:
                                i = i5;
                                c12676l3.m3443default(c4863l.yandex(signatures(iM484switch), obj2));
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                i = i5;
                                c12676l3.m3449goto(c4863l.yandex(signatures(iM484switch), obj2));
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                                i = i5;
                                c12676l3.m3436abstract(c4863l.yandex(signatures(iM484switch), obj2));
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                                i = i5;
                                c12676l3.advert(c4863l.yandex(signatures(iM484switch), obj2));
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case Maneuver.TYPE_STRAIGHT /* 36 */:
                                i = i5;
                                c12676l3.m3484private(c4863l.yandex(signatures(iM484switch), obj2));
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                i = i5;
                                c12676l3.m3438case(c4863l.yandex(signatures(iM484switch), obj2));
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                i = i5;
                                c12676l3.m3499while(c4863l.yandex(signatures(iM484switch), obj2));
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case Maneuver.TYPE_DESTINATION /* 39 */:
                                i = i5;
                                c12676l3.m3494throw(c4863l.yandex(signatures(iM484switch), obj2));
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                i = i5;
                                c12676l3.m3489strictfp(c4863l.yandex(signatures(iM484switch), obj2));
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                i = i5;
                                c12676l3.m3495throws(c4863l.yandex(signatures(iM484switch), obj2));
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                i = i5;
                                c12676l3.startapp(c4863l.yandex(signatures(iM484switch), obj2));
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                                i = i5;
                                c12676l3.m3437break(c4863l.yandex(signatures(iM484switch), obj2));
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                i = i5;
                                InterfaceC9858l interfaceC9858lYandex2 = c4863l.yandex(signatures(iM484switch), obj2);
                                c12676l3.premium(interfaceC9858lYandex2);
                                c0372l.vip(iM486throw);
                                AbstractC5067l.isPro(obj2, iBilling, interfaceC9858lYandex2, c7565lYandex, c18155l);
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                i = i5;
                                c12676l3.m3440class(c4863l.yandex(signatures(iM484switch), obj2));
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                i = i5;
                                c12676l3.m3443default(c4863l.yandex(signatures(iM484switch), obj2));
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                i = i5;
                                c12676l3.m3449goto(c4863l.yandex(signatures(iM484switch), obj2));
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 48:
                                i = i5;
                                c12676l3.m3436abstract(c4863l.yandex(signatures(iM484switch), obj2));
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                i = i5;
                                try {
                                    try {
                                        c0372l.m485synchronized(obj2, signatures(iM484switch), c12676l, c0372l.startapp(iM486throw), c7597l);
                                        c12676l3 = c12676l;
                                        c12676l2 = c12676l3;
                                    } catch (C8236l unused5) {
                                        c0372l = c0372l;
                                        c12676l2 = c12676l;
                                        c18155l.getClass();
                                        if (c7565lYandex == null) {
                                            c7565lYandex = C18155l.yandex(obj2);
                                        }
                                        if (!C18155l.loadAd(0, c12676l2, c7565lYandex)) {
                                            while (i3 < i4) {
                                                c0372l.remoteconfig(iArr[i3], obj2, c7565lYandex);
                                            }
                                            if (c7565lYandex == null) {
                                                return;
                                            }
                                            ((AbstractC13399l) obj2).unknownFields = c7565lYandex;
                                        }
                                    }
                                } catch (C8236l unused6) {
                                    c12676l2 = c12676l;
                                    c0372l = c0372l;
                                    c18155l.getClass();
                                    if (c7565lYandex == null) {
                                        c7565lYandex = C18155l.yandex(obj2);
                                    }
                                    if (!C18155l.loadAd(0, c12676l2, c7565lYandex)) {
                                        while (i3 < i4) {
                                            c0372l.remoteconfig(iArr[i3], obj2, c7565lYandex);
                                        }
                                        if (c7565lYandex == null) {
                                            return;
                                        }
                                        ((AbstractC13399l) obj2).unknownFields = c7565lYandex;
                                    }
                                    c0372l = c0372l;
                                    c12676l3 = c12676l2;
                                    i5 = i;
                                    c7597l2 = c7597l;
                                    break;
                                }
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                i = i5;
                                c0372l.Signature(iM486throw, obj2, c0372l.metrica(iM486throw));
                                throw null;
                            case 51:
                                i = i5;
                                long jSignatures14 = signatures(iM484switch);
                                c12676l3.m3487return(1);
                                AbstractC1900l.startapp(jSignatures14, obj2, Double.valueOf(((AbstractC15029l) c12676l3.purchase).license()));
                                c0372l.m480for(iBilling, iM486throw, obj2);
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 52:
                                i = i5;
                                long jSignatures15 = signatures(iM484switch);
                                c12676l3.m3487return(5);
                                AbstractC1900l.startapp(jSignatures15, obj2, Float.valueOf(((AbstractC15029l) c12676l3.purchase).isVip()));
                                c0372l.m480for(iBilling, iM486throw, obj2);
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 53:
                                i = i5;
                                long jSignatures16 = signatures(iM484switch);
                                c12676l3.m3487return(0);
                                AbstractC1900l.startapp(jSignatures16, obj2, Long.valueOf(((AbstractC15029l) c12676l3.purchase).premium()));
                                c0372l.m480for(iBilling, iM486throw, obj2);
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 54:
                                i = i5;
                                long jSignatures17 = signatures(iM484switch);
                                c12676l3.m3487return(0);
                                AbstractC1900l.startapp(jSignatures17, obj2, Long.valueOf(((AbstractC15029l) c12676l3.purchase).mo1020native()));
                                c0372l.m480for(iBilling, iM486throw, obj2);
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 55:
                                i = i5;
                                long jSignatures18 = signatures(iM484switch);
                                c12676l3.m3487return(0);
                                AbstractC1900l.startapp(jSignatures18, obj2, Integer.valueOf(((AbstractC15029l) c12676l3.purchase).signatures()));
                                c0372l.m480for(iBilling, iM486throw, obj2);
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 56:
                                i = i5;
                                long jSignatures19 = signatures(iM484switch);
                                c12676l3.m3487return(1);
                                AbstractC1900l.startapp(jSignatures19, obj2, Long.valueOf(((AbstractC15029l) c12676l3.purchase).advert()));
                                c0372l.m480for(iBilling, iM486throw, obj2);
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 57:
                                i = i5;
                                long jSignatures20 = signatures(iM484switch);
                                c12676l3.m3487return(5);
                                AbstractC1900l.startapp(jSignatures20, obj2, Integer.valueOf(((AbstractC15029l) c12676l3.purchase).ad()));
                                c0372l.m480for(iBilling, iM486throw, obj2);
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 58:
                                i = i5;
                                long jSignatures21 = signatures(iM484switch);
                                c12676l3.m3487return(0);
                                AbstractC1900l.startapp(jSignatures21, obj2, Boolean.valueOf(((AbstractC15029l) c12676l3.purchase).subscription()));
                                c0372l.m480for(iBilling, iM486throw, obj2);
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 59:
                                i = i5;
                                c0372l.m488volatile(iM484switch, c12676l3, obj2);
                                c0372l.m480for(iBilling, iM486throw, obj2);
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 60:
                                i = i5;
                                AbstractC15944l abstractC15944l3 = (AbstractC15944l) c0372l.advert(iBilling, iM486throw, obj2);
                                InterfaceC0060l interfaceC0060lStartapp3 = c0372l.startapp(iM486throw);
                                c12676l3.m3487return(2);
                                c12676l3.remoteconfig(abstractC15944l3, interfaceC0060lStartapp3, c7597l2);
                                c0372l.m478else(iBilling, obj2, abstractC15944l3, iM486throw);
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 61:
                                i = i5;
                                AbstractC1900l.startapp(signatures(iM484switch), obj2, c12676l3.tapsense());
                                c0372l.m480for(iBilling, iM486throw, obj2);
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 62:
                                i = i5;
                                long jSignatures22 = signatures(iM484switch);
                                c12676l3.m3487return(0);
                                AbstractC1900l.startapp(jSignatures22, obj2, Integer.valueOf(((AbstractC15029l) c12676l3.purchase).mo1028volatile()));
                                c0372l.m480for(iBilling, iM486throw, obj2);
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 63:
                                i = i5;
                                c12676l3.m3487return(0);
                                int iPro2 = ((AbstractC15029l) c12676l3.purchase).pro();
                                c0372l.vip(iM486throw);
                                AbstractC1900l.startapp(signatures(iM484switch), obj2, Integer.valueOf(iPro2));
                                c0372l.m480for(iBilling, iM486throw, obj2);
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                                i = i5;
                                long jSignatures23 = signatures(iM484switch);
                                c12676l3.m3487return(5);
                                AbstractC1900l.startapp(jSignatures23, obj2, Integer.valueOf(((AbstractC15029l) c12676l3.purchase).applovin()));
                                c0372l.m480for(iBilling, iM486throw, obj2);
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 65:
                                i = i5;
                                long jSignatures24 = signatures(iM484switch);
                                c12676l3.m3487return(1);
                                AbstractC1900l.startapp(jSignatures24, obj2, Long.valueOf(((AbstractC15029l) c12676l3.purchase).appmetrica()));
                                c0372l.m480for(iBilling, iM486throw, obj2);
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 66:
                                i = i5;
                                long jSignatures25 = signatures(iM484switch);
                                c12676l3.m3487return(0);
                                AbstractC1900l.startapp(jSignatures25, obj2, Integer.valueOf(((AbstractC15029l) c12676l3.purchase).inmobi()));
                                c0372l.m480for(iBilling, iM486throw, obj2);
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 67:
                                i = i5;
                                try {
                                    try {
                                        long jSignatures26 = signatures(iM484switch);
                                        c12676l3.m3487return(0);
                                        AbstractC1900l.startapp(jSignatures26, obj2, Long.valueOf(((AbstractC15029l) c12676l3.purchase).mo1027throws()));
                                        c0372l.m480for(iBilling, iM486throw, obj2);
                                        c12676l2 = c12676l3;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        c0372l = c0372l;
                                        while (i2 < i4) {
                                            c0372l.remoteconfig(iArr[i2], obj2, c7565lYandex);
                                        }
                                        if (c7565lYandex != null) {
                                            c18155l.getClass();
                                            ((AbstractC13399l) obj2).unknownFields = c7565lYandex;
                                        }
                                        throw th;
                                    }
                                } catch (C8236l unused7) {
                                    c12676l2 = c12676l3;
                                    c18155l.getClass();
                                    if (c7565lYandex == null) {
                                        c7565lYandex = C18155l.yandex(obj2);
                                    }
                                    if (!C18155l.loadAd(0, c12676l2, c7565lYandex)) {
                                        while (i3 < i4) {
                                            c0372l.remoteconfig(iArr[i3], obj2, c7565lYandex);
                                        }
                                        if (c7565lYandex == null) {
                                            return;
                                        }
                                        ((AbstractC13399l) obj2).unknownFields = c7565lYandex;
                                    }
                                }
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            case 68:
                                AbstractC15944l abstractC15944l4 = (AbstractC15944l) c0372l.advert(iBilling, iM486throw, obj2);
                                InterfaceC0060l interfaceC0060lStartapp4 = c0372l.startapp(iM486throw);
                                c12676l3.m3487return(3);
                                c12676l3.isPro(abstractC15944l4, interfaceC0060lStartapp4, c7597l2);
                                c0372l.m478else(iBilling, obj2, abstractC15944l4, iM486throw);
                                i = i5;
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                            default:
                                if (c7565lYandex == null) {
                                    try {
                                        c18155l.getClass();
                                        c7565lYandex = C18155l.yandex(obj2);
                                    } catch (C8236l unused8) {
                                        i = i5;
                                        c12676l2 = c12676l3;
                                        c18155l.getClass();
                                        if (c7565lYandex == null) {
                                            c7565lYandex = C18155l.yandex(obj2);
                                        }
                                        if (!C18155l.loadAd(0, c12676l2, c7565lYandex)) {
                                            while (i3 < i4) {
                                                c0372l.remoteconfig(iArr[i3], obj2, c7565lYandex);
                                            }
                                            if (c7565lYandex == null) {
                                                return;
                                            }
                                            ((AbstractC13399l) obj2).unknownFields = c7565lYandex;
                                        }
                                    }
                                }
                                c18155l.getClass();
                                if (!C18155l.loadAd(0, c12676l3, c7565lYandex)) {
                                    while (i5 < i4) {
                                        c0372l.remoteconfig(iArr[i5], obj2, c7565lYandex);
                                        i5++;
                                    }
                                    if (c7565lYandex == null) {
                                        return;
                                    }
                                }
                                i = i5;
                                c12676l2 = c12676l3;
                                c0372l = c0372l;
                                c12676l3 = c12676l2;
                                i5 = i;
                                c7597l2 = c7597l;
                                break;
                        }
                    } catch (C8236l unused9) {
                        i = i5;
                    }
                } else if (iBilling == Integer.MAX_VALUE) {
                    while (i5 < i4) {
                        c0372l.remoteconfig(iArr[i5], obj2, c7565lYandex);
                        i5++;
                    }
                    if (c7565lYandex == null) {
                        return;
                    } else {
                        c18155l.getClass();
                    }
                } else {
                    c18155l.getClass();
                    if (c7565lYandex == null) {
                        c7565lYandex = C18155l.yandex(obj2);
                    }
                    if (!C18155l.loadAd(0, c12676l3, c7565lYandex)) {
                        while (i5 < i4) {
                            c0372l.remoteconfig(iArr[i5], obj2, c7565lYandex);
                            i5++;
                        }
                        if (c7565lYandex == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                c0372l = c0372l;
                i = i5;
            }
        }
        ((AbstractC13399l) obj2).unknownFields = c7565lYandex;
    }

    public final void remoteconfig(int i, Object obj, Object obj2) {
        int i2 = this.yandex[i];
        if (AbstractC1900l.crashlytics.subs(m484switch(i) & 1048575, obj) == null) {
            return;
        }
        vip(i);
    }

    public final InterfaceC0060l startapp(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.loadAd;
        InterfaceC0060l interfaceC0060l = (InterfaceC0060l) objArr[i2];
        if (interfaceC0060l != null) {
            return interfaceC0060l;
        }
        InterfaceC0060l interfaceC0060lYandex = C17073l.crashlytics.yandex((Class) objArr[i2 + 1]);
        objArr[i2] = interfaceC0060lYandex;
        return interfaceC0060lYandex;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final void m483strictfp(Object obj, int i, C12676l c12676l, InterfaceC0060l interfaceC0060l, C7597l c7597l) throws C2297l {
        int iMo1023strictfp;
        InterfaceC9858l interfaceC9858lYandex = this.firebase.yandex(i & 1048575, obj);
        AbstractC15029l abstractC15029l = (AbstractC15029l) c12676l.purchase;
        int i2 = c12676l.loadAd;
        if ((i2 & 7) != 2) {
            throw C2297l.crashlytics();
        }
        do {
            Object objAmazon = interfaceC0060l.amazon();
            c12676l.remoteconfig(objAmazon, interfaceC0060l, c7597l);
            interfaceC0060l.loadAd(objAmazon);
            interfaceC9858lYandex.add(objAmazon);
            if (abstractC15029l.subs() || c12676l.amazon != 0) {
                return;
            } else {
                iMo1023strictfp = abstractC15029l.mo1023strictfp();
            }
        } while (iMo1023strictfp == i2);
        c12676l.amazon = iMo1023strictfp;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.InterfaceC0060l
    public final int subs(AbstractC13399l abstractC13399l) {
        int i;
        int iLoadAd;
        int i2;
        int[] iArr = this.yandex;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iM484switch = m484switch(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iM484switch;
            int i6 = 1237;
            int iHashCode = 37;
            switch (m474case(iM484switch)) {
                case 0:
                    i = i3 * 53;
                    iLoadAd = AbstractC6061l.loadAd(Double.doubleToLongBits(AbstractC1900l.crashlytics.purchase(j, abstractC13399l)));
                    i3 = iLoadAd + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iLoadAd = Float.floatToIntBits(AbstractC1900l.crashlytics.billing(j, abstractC13399l));
                    i3 = iLoadAd + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iLoadAd = AbstractC6061l.loadAd(AbstractC1900l.crashlytics.admob(j, abstractC13399l));
                    i3 = iLoadAd + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iLoadAd = AbstractC6061l.loadAd(AbstractC1900l.crashlytics.admob(j, abstractC13399l));
                    i3 = iLoadAd + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iLoadAd = AbstractC1900l.crashlytics.mopub(j, abstractC13399l);
                    i3 = iLoadAd + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iLoadAd = AbstractC6061l.loadAd(AbstractC1900l.crashlytics.admob(j, abstractC13399l));
                    i3 = iLoadAd + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iLoadAd = AbstractC1900l.crashlytics.mopub(j, abstractC13399l);
                    i3 = iLoadAd + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zCrashlytics = AbstractC1900l.crashlytics.crashlytics(j, abstractC13399l);
                    Charset charset = AbstractC6061l.yandex;
                    if (zCrashlytics) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iLoadAd = ((String) AbstractC1900l.crashlytics.subs(j, abstractC13399l)).hashCode();
                    i3 = iLoadAd + i;
                    break;
                case 9:
                    Object objSubs = AbstractC1900l.crashlytics.subs(j, abstractC13399l);
                    if (objSubs != null) {
                        iHashCode = objSubs.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iLoadAd = AbstractC1900l.crashlytics.subs(j, abstractC13399l).hashCode();
                    i3 = iLoadAd + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iLoadAd = AbstractC1900l.crashlytics.mopub(j, abstractC13399l);
                    i3 = iLoadAd + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iLoadAd = AbstractC1900l.crashlytics.mopub(j, abstractC13399l);
                    i3 = iLoadAd + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iLoadAd = AbstractC1900l.crashlytics.mopub(j, abstractC13399l);
                    i3 = iLoadAd + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iLoadAd = AbstractC6061l.loadAd(AbstractC1900l.crashlytics.admob(j, abstractC13399l));
                    i3 = iLoadAd + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iLoadAd = AbstractC1900l.crashlytics.mopub(j, abstractC13399l);
                    i3 = iLoadAd + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iLoadAd = AbstractC6061l.loadAd(AbstractC1900l.crashlytics.admob(j, abstractC13399l));
                    i3 = iLoadAd + i;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    Object objSubs2 = AbstractC1900l.crashlytics.subs(j, abstractC13399l);
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
                    iLoadAd = AbstractC1900l.crashlytics.subs(j, abstractC13399l).hashCode();
                    i3 = iLoadAd + i;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    i = i3 * 53;
                    iLoadAd = AbstractC1900l.crashlytics.subs(j, abstractC13399l).hashCode();
                    i3 = iLoadAd + i;
                    break;
                case 51:
                    if (tapsense(i5, i4, abstractC13399l)) {
                        i = i3 * 53;
                        iLoadAd = AbstractC6061l.loadAd(Double.doubleToLongBits(((Double) AbstractC1900l.crashlytics.subs(j, abstractC13399l)).doubleValue()));
                        i3 = iLoadAd + i;
                    }
                    break;
                case 52:
                    if (tapsense(i5, i4, abstractC13399l)) {
                        i = i3 * 53;
                        iLoadAd = Float.floatToIntBits(((Float) AbstractC1900l.crashlytics.subs(j, abstractC13399l)).floatValue());
                        i3 = iLoadAd + i;
                    }
                    break;
                case 53:
                    if (tapsense(i5, i4, abstractC13399l)) {
                        i = i3 * 53;
                        iLoadAd = AbstractC6061l.loadAd(applovin(j, abstractC13399l));
                        i3 = iLoadAd + i;
                    }
                    break;
                case 54:
                    if (tapsense(i5, i4, abstractC13399l)) {
                        i = i3 * 53;
                        iLoadAd = AbstractC6061l.loadAd(applovin(j, abstractC13399l));
                        i3 = iLoadAd + i;
                    }
                    break;
                case 55:
                    if (tapsense(i5, i4, abstractC13399l)) {
                        i = i3 * 53;
                        iLoadAd = premium(j, abstractC13399l);
                        i3 = iLoadAd + i;
                    }
                    break;
                case 56:
                    if (tapsense(i5, i4, abstractC13399l)) {
                        i = i3 * 53;
                        iLoadAd = AbstractC6061l.loadAd(applovin(j, abstractC13399l));
                        i3 = iLoadAd + i;
                    }
                    break;
                case 57:
                    if (tapsense(i5, i4, abstractC13399l)) {
                        i = i3 * 53;
                        iLoadAd = premium(j, abstractC13399l);
                        i3 = iLoadAd + i;
                    }
                    break;
                case 58:
                    if (tapsense(i5, i4, abstractC13399l)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) AbstractC1900l.crashlytics.subs(j, abstractC13399l)).booleanValue();
                        Charset charset2 = AbstractC6061l.yandex;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (tapsense(i5, i4, abstractC13399l)) {
                        i = i3 * 53;
                        iLoadAd = ((String) AbstractC1900l.crashlytics.subs(j, abstractC13399l)).hashCode();
                        i3 = iLoadAd + i;
                    }
                    break;
                case 60:
                    if (tapsense(i5, i4, abstractC13399l)) {
                        i = i3 * 53;
                        iLoadAd = AbstractC1900l.crashlytics.subs(j, abstractC13399l).hashCode();
                        i3 = iLoadAd + i;
                    }
                    break;
                case 61:
                    if (tapsense(i5, i4, abstractC13399l)) {
                        i = i3 * 53;
                        iLoadAd = AbstractC1900l.crashlytics.subs(j, abstractC13399l).hashCode();
                        i3 = iLoadAd + i;
                    }
                    break;
                case 62:
                    if (tapsense(i5, i4, abstractC13399l)) {
                        i = i3 * 53;
                        iLoadAd = premium(j, abstractC13399l);
                        i3 = iLoadAd + i;
                    }
                    break;
                case 63:
                    if (tapsense(i5, i4, abstractC13399l)) {
                        i = i3 * 53;
                        iLoadAd = premium(j, abstractC13399l);
                        i3 = iLoadAd + i;
                    }
                    break;
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    if (tapsense(i5, i4, abstractC13399l)) {
                        i = i3 * 53;
                        iLoadAd = premium(j, abstractC13399l);
                        i3 = iLoadAd + i;
                    }
                    break;
                case 65:
                    if (tapsense(i5, i4, abstractC13399l)) {
                        i = i3 * 53;
                        iLoadAd = AbstractC6061l.loadAd(applovin(j, abstractC13399l));
                        i3 = iLoadAd + i;
                    }
                    break;
                case 66:
                    if (tapsense(i5, i4, abstractC13399l)) {
                        i = i3 * 53;
                        iLoadAd = premium(j, abstractC13399l);
                        i3 = iLoadAd + i;
                    }
                    break;
                case 67:
                    if (tapsense(i5, i4, abstractC13399l)) {
                        i = i3 * 53;
                        iLoadAd = AbstractC6061l.loadAd(applovin(j, abstractC13399l));
                        i3 = iLoadAd + i;
                    }
                    break;
                case 68:
                    if (tapsense(i5, i4, abstractC13399l)) {
                        i = i3 * 53;
                        iLoadAd = AbstractC1900l.crashlytics.subs(j, abstractC13399l).hashCode();
                        i3 = iLoadAd + i;
                    }
                    break;
            }
        }
        this.smaato.getClass();
        return abstractC13399l.unknownFields.hashCode() + (i3 * 53);
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final int m484switch(int i) {
        return this.yandex[i + 1];
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void m485synchronized(Object obj, long j, C12676l c12676l, InterfaceC0060l interfaceC0060l, C7597l c7597l) throws C8236l {
        int iMo1023strictfp;
        InterfaceC9858l interfaceC9858lYandex = this.firebase.yandex(j, obj);
        AbstractC15029l abstractC15029l = (AbstractC15029l) c12676l.purchase;
        int i = c12676l.loadAd;
        if ((i & 7) != 3) {
            throw C2297l.crashlytics();
        }
        do {
            Object objAmazon = interfaceC0060l.amazon();
            c12676l.isPro(objAmazon, interfaceC0060l, c7597l);
            interfaceC0060l.loadAd(objAmazon);
            interfaceC9858lYandex.add(objAmazon);
            if (abstractC15029l.subs() || c12676l.amazon != 0) {
                return;
            } else {
                iMo1023strictfp = abstractC15029l.mo1023strictfp();
            }
        } while (iMo1023strictfp == i);
        c12676l.amazon = iMo1023strictfp;
    }

    public final boolean tapsense(int i, int i2, Object obj) {
        return AbstractC1900l.crashlytics.mopub((long) (this.yandex[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final int m486throw(int i, int i2) {
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
    public final int m487throws(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C16292l c16292l) throws C2297l {
        int i9;
        Unsafe unsafe = metrica;
        long j2 = this.yandex[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(AbstractC5646l.crashlytics(i, bArr))));
                int i10 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(AbstractC5646l.loadAd(i, bArr))));
                int i11 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iSubs = AbstractC5646l.subs(bArr, i, c16292l);
                unsafe.putObject(obj, j, Long.valueOf(c16292l.loadAd));
                unsafe.putInt(obj, j2, i4);
                return iSubs;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iMopub = AbstractC5646l.mopub(bArr, i, c16292l);
                unsafe.putObject(obj, j, Integer.valueOf(c16292l.yandex));
                unsafe.putInt(obj, j2, i4);
                return iMopub;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(AbstractC5646l.crashlytics(i, bArr)));
                int i12 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 57:
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(AbstractC5646l.loadAd(i, bArr)));
                int i13 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i13;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iSubs2 = AbstractC5646l.subs(bArr, i, c16292l);
                unsafe.putObject(obj, j, Boolean.valueOf(c16292l.loadAd != 0));
                unsafe.putInt(obj, j2, i4);
                return iSubs2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iMopub2 = AbstractC5646l.mopub(bArr, i, c16292l);
                int i14 = c16292l.yandex;
                if (i14 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (AbstractC3472l.yandex.mopub(iMopub2, iMopub2 + i14, bArr) != 0) {
                            throw C2297l.loadAd();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, iMopub2, i14, AbstractC6061l.yandex));
                    iMopub2 += i14;
                }
                unsafe.putInt(obj, j2, i4);
                return iMopub2;
            case 60:
                i9 = i;
                if (i5 == 2) {
                    Object objAdvert = advert(i4, i8, obj);
                    int iVip = AbstractC5646l.vip(objAdvert, startapp(i8), bArr, i9, i2, c16292l);
                    m478else(i4, obj, objAdvert, i8);
                    return iVip;
                }
                return i9;
            case 61:
                i9 = i;
                if (i5 == 2) {
                    int iYandex = AbstractC5646l.yandex(bArr, i9, c16292l);
                    unsafe.putObject(obj, j, c16292l.crashlytics);
                    unsafe.putInt(obj, j2, i4);
                    return iYandex;
                }
                return i9;
            case 63:
                i9 = i;
                if (i5 == 0) {
                    int iMopub3 = AbstractC5646l.mopub(bArr, i9, c16292l);
                    int i15 = c16292l.yandex;
                    vip(i8);
                    unsafe.putObject(obj, j, Integer.valueOf(i15));
                    unsafe.putInt(obj, j2, i4);
                    return iMopub3;
                }
                return i9;
            case 66:
                i9 = i;
                if (i5 == 0) {
                    int iMopub4 = AbstractC5646l.mopub(bArr, i9, c16292l);
                    unsafe.putObject(obj, j, Integer.valueOf(AbstractC15029l.purchase(c16292l.yandex)));
                    unsafe.putInt(obj, j2, i4);
                    return iMopub4;
                }
                return i9;
            case 67:
                i9 = i;
                if (i5 == 0) {
                    int iSubs3 = AbstractC5646l.subs(bArr, i9, c16292l);
                    unsafe.putObject(obj, j, Long.valueOf(AbstractC15029l.mopub(c16292l.loadAd)));
                    unsafe.putInt(obj, j2, i4);
                    return iSubs3;
                }
                return i9;
            case 68:
                if (i5 == 3) {
                    Object objAdvert2 = advert(i4, i8, obj);
                    int iRemoteconfig = AbstractC5646l.remoteconfig(objAdvert2, startapp(i8), bArr, i, i2, (i3 & (-8)) | 4, c16292l);
                    m478else(i4, obj, objAdvert2, i8);
                    return iRemoteconfig;
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
    public final void m488volatile(int i, C12676l c12676l, Object obj) throws C8236l, C5347l, C8352l {
        if ((536870912 & i) != 0) {
            c12676l.m3487return(2);
            AbstractC1900l.startapp(i & 1048575, obj, ((AbstractC15029l) c12676l.purchase).mo1025synchronized());
        } else if (!this.billing) {
            AbstractC1900l.startapp(i & 1048575, obj, c12676l.tapsense());
        } else {
            c12676l.m3487return(2);
            AbstractC1900l.startapp(i & 1048575, obj, ((AbstractC15029l) c12676l.purchase).mo1021package());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.InterfaceC0060l
    public final void yandex(Object obj, Object obj2) {
        Object obj3;
        smaato(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.yandex;
            if (i >= iArr.length) {
                AbstractC5067l.firebase(this.smaato, obj, obj2);
                return;
            }
            int iM484switch = m484switch(i);
            long j = 1048575 & iM484switch;
            int i2 = iArr[i];
            switch (m474case(iM484switch)) {
                case 0:
                    if (!adcel(i, obj2)) {
                        obj3 = obj;
                    } else {
                        AbstractC11402l abstractC11402l = AbstractC1900l.crashlytics;
                        obj3 = obj;
                        abstractC11402l.remoteconfig(obj3, j, abstractC11402l.purchase(j, obj2));
                        m479extends(i, obj3);
                    }
                    break;
                case 1:
                    if (adcel(i, obj2)) {
                        AbstractC11402l abstractC11402l2 = AbstractC1900l.crashlytics;
                        abstractC11402l2.vip(obj, j, abstractC11402l2.billing(j, obj2));
                        m479extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (adcel(i, obj2)) {
                        AbstractC1900l.metrica(j, AbstractC1900l.crashlytics.admob(j, obj2), obj);
                        m479extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (adcel(i, obj2)) {
                        AbstractC1900l.metrica(j, AbstractC1900l.crashlytics.admob(j, obj2), obj);
                        m479extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (adcel(i, obj2)) {
                        AbstractC1900l.vip(j, obj, AbstractC1900l.crashlytics.mopub(j, obj2));
                        m479extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (adcel(i, obj2)) {
                        AbstractC1900l.metrica(j, AbstractC1900l.crashlytics.admob(j, obj2), obj);
                        m479extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (adcel(i, obj2)) {
                        AbstractC1900l.vip(j, obj, AbstractC1900l.crashlytics.mopub(j, obj2));
                        m479extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (adcel(i, obj2)) {
                        AbstractC11402l abstractC11402l3 = AbstractC1900l.crashlytics;
                        abstractC11402l3.firebase(obj, j, abstractC11402l3.crashlytics(j, obj2));
                        m479extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (adcel(i, obj2)) {
                        AbstractC1900l.startapp(j, obj, AbstractC1900l.crashlytics.subs(j, obj2));
                        m479extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    license(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (adcel(i, obj2)) {
                        AbstractC1900l.startapp(j, obj, AbstractC1900l.crashlytics.subs(j, obj2));
                        m479extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (adcel(i, obj2)) {
                        AbstractC1900l.vip(j, obj, AbstractC1900l.crashlytics.mopub(j, obj2));
                        m479extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (adcel(i, obj2)) {
                        AbstractC1900l.vip(j, obj, AbstractC1900l.crashlytics.mopub(j, obj2));
                        m479extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (adcel(i, obj2)) {
                        AbstractC1900l.vip(j, obj, AbstractC1900l.crashlytics.mopub(j, obj2));
                        m479extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (adcel(i, obj2)) {
                        AbstractC1900l.metrica(j, AbstractC1900l.crashlytics.admob(j, obj2), obj);
                        m479extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (adcel(i, obj2)) {
                        AbstractC1900l.vip(j, obj, AbstractC1900l.crashlytics.mopub(j, obj2));
                        m479extends(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (adcel(i, obj2)) {
                        AbstractC1900l.metrica(j, AbstractC1900l.crashlytics.admob(j, obj2), obj);
                        m479extends(i, obj);
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
                    AbstractC11402l abstractC11402l4 = AbstractC1900l.crashlytics;
                    InterfaceC9858l interfaceC9858lYandex = (InterfaceC9858l) abstractC11402l4.subs(j, obj);
                    InterfaceC9858l interfaceC9858l = (InterfaceC9858l) abstractC11402l4.subs(j, obj2);
                    int size = interfaceC9858lYandex.size();
                    int size2 = interfaceC9858l.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AbstractC7021l) interfaceC9858lYandex).f14716l) {
                            interfaceC9858lYandex = interfaceC9858lYandex.yandex(size2 + size);
                        }
                        interfaceC9858lYandex.addAll(interfaceC9858l);
                    }
                    if (size > 0) {
                        interfaceC9858l = interfaceC9858lYandex;
                    }
                    AbstractC1900l.startapp(j, obj, interfaceC9858l);
                    obj3 = obj;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Class cls = AbstractC5067l.yandex;
                    AbstractC11402l abstractC11402l5 = AbstractC1900l.crashlytics;
                    AbstractC1900l.startapp(j, obj, this.remoteconfig.yandex(abstractC11402l5.subs(j, obj), abstractC11402l5.subs(j, obj2)));
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
                        AbstractC1900l.startapp(j, obj, AbstractC1900l.crashlytics.subs(j, obj2));
                        m480for(i2, i, obj);
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
                        AbstractC1900l.startapp(j, obj, AbstractC1900l.crashlytics.subs(j, obj2));
                        m480for(i2, i, obj);
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
