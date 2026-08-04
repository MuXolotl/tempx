package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import org.conscrypt.PSKKeyManager;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: lُؖٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4048l implements InterfaceC0101l {
    public final int[] amazon;
    public final C16222l billing;
    public final AbstractC6909l crashlytics;
    public final Object[] loadAd;
    public final int purchase;
    public final int[] yandex;
    public static final int[] mopub = new int[0];
    public static final Unsafe admob = AbstractC1851l.smaato();

    public C4048l(int[] iArr, Object[] objArr, AbstractC6909l abstractC6909l, int[] iArr2, int i, C16222l c16222l, C2183l c2183l) {
        this.yandex = iArr;
        this.loadAd = objArr;
        this.amazon = iArr2;
        this.purchase = i;
        this.billing = c16222l;
        this.crashlytics = abstractC6909l;
    }

    public static int adcel(int i) {
        return (i >>> 20) & 255;
    }

    public static boolean ads(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC17187l) {
            return ((AbstractC17187l) obj).isPro();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0241  */
    /* JADX WARN: Code duplicated, block: B:126:0x0247  */
    /* JADX WARN: Code duplicated, block: B:129:0x025f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0262  */
    /* JADX WARN: Code duplicated, block: B:184:0x0379  */
    public static C4048l firebase(C4687l c4687l, C16222l c16222l, C2183l c2183l) {
        int i;
        int iCharAt;
        int iCharAt2;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        char cCharAt;
        int i6;
        char cCharAt2;
        int i7;
        char cCharAt3;
        int i8;
        char cCharAt4;
        int i9;
        int i10;
        int i11;
        char cCharAt5;
        int i12;
        char cCharAt6;
        int i13;
        int i14;
        int i15;
        Object[] objArr;
        int i16;
        int i17;
        int i18;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        char c;
        int i19;
        int i20;
        int i21;
        int i22;
        Field fieldSmaato;
        char cCharAt7;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Object obj;
        Field fieldSmaato2;
        int i29;
        Object obj2;
        Field fieldSmaato3;
        int i30;
        char cCharAt8;
        int i31;
        int i32;
        char cCharAt9;
        int i33;
        char cCharAt10;
        int i34;
        char cCharAt11;
        if (!(c4687l instanceof C4687l)) {
            C18725l.loadAd();
            return null;
        }
        String str = c4687l.loadAd;
        int length = str.length();
        char c2 = 55296;
        if (str.charAt(0) >= 55296) {
            int i35 = 1;
            while (true) {
                i = i35 + 1;
                if (str.charAt(i35) < 55296) {
                    break;
                }
                i35 = i;
            }
        } else {
            i = 1;
        }
        int i36 = i + 1;
        int iCharAt3 = str.charAt(i);
        if (iCharAt3 >= 55296) {
            int i37 = iCharAt3 & 8191;
            int i38 = 13;
            while (true) {
                i34 = i36 + 1;
                cCharAt11 = str.charAt(i36);
                if (cCharAt11 < 55296) {
                    break;
                }
                i37 |= (cCharAt11 & 8191) << i38;
                i38 += 13;
                i36 = i34;
            }
            iCharAt3 = i37 | (cCharAt11 << i38);
            i36 = i34;
        }
        if (iCharAt3 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            i2 = 0;
            i4 = 0;
            iArr = mopub;
            i3 = 0;
        } else {
            int i39 = i36 + 1;
            int iCharAt4 = str.charAt(i36);
            if (iCharAt4 >= 55296) {
                int i40 = iCharAt4 & 8191;
                int i41 = 13;
                while (true) {
                    i12 = i39 + 1;
                    cCharAt6 = str.charAt(i39);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt6 & 8191) << i41;
                    i41 += 13;
                    i39 = i12;
                }
                iCharAt4 = i40 | (cCharAt6 << i41);
                i39 = i12;
            }
            int i42 = i39 + 1;
            int iCharAt5 = str.charAt(i39);
            if (iCharAt5 >= 55296) {
                int i43 = iCharAt5 & 8191;
                int i44 = 13;
                while (true) {
                    i11 = i42 + 1;
                    cCharAt5 = str.charAt(i42);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt5 & 8191) << i44;
                    i44 += 13;
                    i42 = i11;
                }
                iCharAt5 = i43 | (cCharAt5 << i44);
                i42 = i11;
            }
            int i45 = i42 + 1;
            if (str.charAt(i42) >= 55296) {
                while (true) {
                    i10 = i45 + 1;
                    if (str.charAt(i45) < 55296) {
                        break;
                    }
                    i45 = i10;
                }
                i45 = i10;
            }
            int i46 = i45 + 1;
            if (str.charAt(i45) >= 55296) {
                while (true) {
                    i9 = i46 + 1;
                    if (str.charAt(i46) < 55296) {
                        break;
                    }
                    i46 = i9;
                }
                i46 = i9;
            }
            int i47 = i46 + 1;
            iCharAt = str.charAt(i46);
            if (iCharAt >= 55296) {
                int i48 = iCharAt & 8191;
                int i49 = 13;
                while (true) {
                    i8 = i47 + 1;
                    cCharAt4 = str.charAt(i47);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt4 & 8191) << i49;
                    i49 += 13;
                    i47 = i8;
                }
                iCharAt = i48 | (cCharAt4 << i49);
                i47 = i8;
            }
            int i50 = i47 + 1;
            iCharAt2 = str.charAt(i47);
            if (iCharAt2 >= 55296) {
                int i51 = iCharAt2 & 8191;
                int i52 = 13;
                while (true) {
                    i7 = i50 + 1;
                    cCharAt3 = str.charAt(i50);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt3 & 8191) << i52;
                    i52 += 13;
                    i50 = i7;
                }
                iCharAt2 = i51 | (cCharAt3 << i52);
                i50 = i7;
            }
            int i53 = i50 + 1;
            int iCharAt6 = str.charAt(i50);
            if (iCharAt6 >= 55296) {
                int i54 = iCharAt6 & 8191;
                int i55 = 13;
                while (true) {
                    i6 = i53 + 1;
                    cCharAt2 = str.charAt(i53);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt2 & 8191) << i55;
                    i55 += 13;
                    i53 = i6;
                }
                iCharAt6 = i54 | (cCharAt2 << i55);
                i53 = i6;
            }
            int i56 = i53 + 1;
            int iCharAt7 = str.charAt(i53);
            if (iCharAt7 >= 55296) {
                int i57 = iCharAt7 & 8191;
                int i58 = 13;
                while (true) {
                    i5 = i56 + 1;
                    cCharAt = str.charAt(i56);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i57 |= (cCharAt & 8191) << i58;
                    i58 += 13;
                    i56 = i5;
                }
                iCharAt7 = i57 | (cCharAt << i58);
                i56 = i5;
            }
            int i59 = iCharAt7 + iCharAt2 + iCharAt6;
            i2 = iCharAt4 + iCharAt4 + iCharAt5;
            i3 = iCharAt4;
            i36 = i56;
            iArr = new int[i59];
            i4 = iCharAt7;
        }
        Unsafe unsafe = admob;
        Object[] objArr2 = c4687l.crashlytics;
        Class<?> cls = c4687l.yandex.getClass();
        int i60 = iCharAt2 + i4;
        int i61 = iCharAt + iCharAt;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[i61];
        int i62 = i4;
        int i63 = 0;
        int i64 = 0;
        while (i36 < length) {
            int i65 = i36 + 1;
            int iCharAt8 = str.charAt(i36);
            if (iCharAt8 >= c2) {
                int i66 = iCharAt8 & 8191;
                int i67 = i65;
                int i68 = 13;
                while (true) {
                    i33 = i67 + 1;
                    cCharAt10 = str.charAt(i67);
                    if (cCharAt10 < c2) {
                        break;
                    }
                    i66 |= (cCharAt10 & 8191) << i68;
                    i68 += 13;
                    i67 = i33;
                }
                iCharAt8 = i66 | (cCharAt10 << i68);
                i13 = i33;
            } else {
                i13 = i65;
            }
            int i69 = i13 + 1;
            int iCharAt9 = str.charAt(i13);
            if (iCharAt9 >= c2) {
                int i70 = iCharAt9 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i32 = i71 + 1;
                    cCharAt9 = str.charAt(i71);
                    i14 = length;
                    if (cCharAt9 < 55296) {
                        break;
                    }
                    i70 |= (cCharAt9 & 8191) << i72;
                    i72 += 13;
                    i71 = i32;
                    length = i14;
                }
                iCharAt9 = i70 | (cCharAt9 << i72);
                i15 = i32;
            } else {
                i14 = length;
                i15 = i69;
            }
            if ((iCharAt9 & 1024) != 0) {
                iArr[i63] = i64;
                i63++;
            }
            int i73 = iCharAt9 & 255;
            int i74 = iCharAt8;
            int i75 = iCharAt9 & 2048;
            if (i73 >= 51) {
                int i76 = i15 + 1;
                int iCharAt10 = str.charAt(i15);
                if (iCharAt10 >= 55296) {
                    int i77 = iCharAt10 & 8191;
                    int i78 = i76;
                    int i79 = 13;
                    while (true) {
                        i30 = i78 + 1;
                        cCharAt8 = str.charAt(i78);
                        i31 = i77;
                        if (cCharAt8 < 55296) {
                            break;
                        }
                        i77 = i31 | ((cCharAt8 & 8191) << i79);
                        i79 += 13;
                        i78 = i30;
                    }
                    iCharAt10 = i31 | (cCharAt8 << i79);
                    i25 = i30;
                } else {
                    i25 = i76;
                }
                int i80 = iCharAt10;
                int i81 = i73 - 51;
                int i82 = i25;
                if (i81 == 9 || i81 == 17) {
                    i26 = i2 + 1;
                    int i83 = i64 / 3;
                    objArr3[i83 + i83 + 1] = objArr2[i2];
                } else {
                    if (i81 != 12) {
                        i27 = i75;
                    } else if (c4687l.yandex() == 1 || i75 != 0) {
                        i26 = i2 + 1;
                        int i84 = i64 / 3;
                        objArr3[i84 + i84 + 1] = objArr2[i2];
                    } else {
                        i27 = 0;
                    }
                    i28 = i80 + i80;
                    obj = objArr2[i28];
                    int i85 = i27;
                    if (obj instanceof Field) {
                        fieldSmaato2 = (Field) obj;
                    } else {
                        fieldSmaato2 = smaato(cls, (String) obj);
                        objArr2[i28] = fieldSmaato2;
                    }
                    int i86 = i3;
                    objArr = objArr3;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldSmaato2);
                    i29 = i28 + 1;
                    obj2 = objArr2[i29];
                    if (obj2 instanceof Field) {
                        fieldSmaato3 = (Field) obj2;
                    } else {
                        fieldSmaato3 = smaato(cls, (String) obj2);
                        objArr2[i29] = fieldSmaato3;
                    }
                    i16 = i86;
                    i18 = i85;
                    str = str;
                    i17 = i2;
                    i21 = 0;
                    c = 55296;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldSmaato3);
                    i22 = iObjectFieldOffset3;
                    i19 = i82;
                }
                i2 = i26;
                i27 = i75;
                i28 = i80 + i80;
                obj = objArr2[i28];
                int i87 = i27;
                if (obj instanceof Field) {
                    fieldSmaato2 = (Field) obj;
                } else {
                    fieldSmaato2 = smaato(cls, (String) obj);
                    objArr2[i28] = fieldSmaato2;
                }
                int i88 = i3;
                objArr = objArr3;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldSmaato2);
                i29 = i28 + 1;
                obj2 = objArr2[i29];
                if (obj2 instanceof Field) {
                    fieldSmaato3 = (Field) obj2;
                } else {
                    fieldSmaato3 = smaato(cls, (String) obj2);
                    objArr2[i29] = fieldSmaato3;
                }
                i16 = i88;
                i18 = i87;
                str = str;
                i17 = i2;
                i21 = 0;
                c = 55296;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldSmaato3);
                i22 = iObjectFieldOffset4;
                i19 = i82;
            } else {
                int i89 = i3;
                objArr = objArr3;
                int i90 = i2 + 1;
                Field fieldSmaato4 = smaato(cls, (String) objArr2[i2]);
                i16 = i89;
                if (i73 == 9 || i73 == 17) {
                    i17 = i90;
                    int i91 = i64 / 3;
                    objArr[i91 + i91 + 1] = fieldSmaato4.getType();
                } else {
                    if (i73 != 27) {
                        if (i73 == 49) {
                            i24 = i2 + 2;
                            i23 = 1;
                        } else {
                            if (i73 == 12 || i73 == 30 || i73 == 44) {
                                i17 = i90;
                                if (c4687l.yandex() == 1 || i75 != 0) {
                                    i24 = i2 + 2;
                                    int i92 = i64 / 3;
                                    objArr[i92 + i92 + 1] = objArr2[i17];
                                    i17 = i24;
                                }
                            } else if (i73 == 50) {
                                int i93 = i2 + 2;
                                int i94 = i62 + 1;
                                iArr[i62] = i64;
                                int i95 = i64 / 3;
                                int i96 = i95 + i95;
                                objArr[i96] = objArr2[i90];
                                if (i75 != 0) {
                                    objArr[i96 + 1] = objArr2[i93];
                                    i18 = i75;
                                    i62 = i94;
                                    i17 = i2 + 3;
                                } else {
                                    i62 = i94;
                                    i17 = i93;
                                }
                            } else {
                                i17 = i90;
                            }
                            i18 = 0;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldSmaato4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt9 & 4096) != 0 || i73 > 17) {
                            c = 55296;
                            i19 = i15;
                            i20 = 0;
                        } else {
                            int i97 = i15 + 1;
                            int iCharAt11 = str.charAt(i15);
                            if (iCharAt11 >= 55296) {
                                int i98 = iCharAt11 & 8191;
                                int i99 = 13;
                                while (true) {
                                    i19 = i97 + 1;
                                    cCharAt7 = str.charAt(i97);
                                    if (cCharAt7 < 55296) {
                                        break;
                                    }
                                    i98 |= (cCharAt7 & 8191) << i99;
                                    i99 += 13;
                                    i97 = i19;
                                }
                                iCharAt11 = i98 | (cCharAt7 << i99);
                            } else {
                                i19 = i97;
                            }
                            int i100 = (iCharAt11 / 32) + i16 + i16;
                            Object obj3 = objArr2[i100];
                            if (obj3 instanceof Field) {
                                fieldSmaato = (Field) obj3;
                            } else {
                                fieldSmaato = smaato(cls, (String) obj3);
                                objArr2[i100] = fieldSmaato;
                            }
                            i20 = iCharAt11 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldSmaato);
                            c = 55296;
                        }
                        if (i73 >= 18 && i73 <= 49) {
                            iArr[i60] = iObjectFieldOffset;
                            i60++;
                        }
                        i21 = i20;
                        i22 = iObjectFieldOffset;
                    } else {
                        i23 = 1;
                        i24 = i2 + 2;
                    }
                    int i101 = i64 / 3;
                    objArr[i101 + i101 + i23] = objArr2[i90];
                    i17 = i24;
                }
                i18 = i75;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldSmaato4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt9 & 4096) != 0) {
                    c = 55296;
                    i19 = i15;
                    i20 = 0;
                } else {
                    c = 55296;
                    i19 = i15;
                    i20 = 0;
                }
                if (i73 >= 18) {
                    iArr[i60] = iObjectFieldOffset;
                    i60++;
                }
                i21 = i20;
                i22 = iObjectFieldOffset;
            }
            int i102 = i64 + 1;
            iArr2[i64] = i74;
            int i103 = i64 + 2;
            int i104 = i21;
            iArr2[i102] = ((iCharAt9 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? 536870912 : 0) | ((iCharAt9 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 268435456 : 0) | (i18 != 0 ? RecyclerView.UNDEFINED_DURATION : 0) | (i73 << 20) | i22;
            i64 += 3;
            iArr2[i103] = (i104 << 20) | iObjectFieldOffset2;
            str = str;
            i36 = i19;
            length = i14;
            i3 = i16;
            i2 = i17;
            c2 = c;
            objArr3 = objArr;
        }
        return new C4048l(iArr2, objArr3, c4687l.yandex, iArr, i4, c16222l, c2183l);
    }

    public static Field smaato(Class cls, String str) {
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
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            AbstractC9361l.appmetrica(sb, "Field ", str, " for ", name);
            C18073l.Signature(AbstractC0653l.ads(sb, " not found. Known fields are ", string), e);
            return null;
        }
    }

    public static int subscription(long j, Object obj) {
        return ((Integer) AbstractC1851l.isPro(j, obj)).intValue();
    }

    public static long tapsense(long j, Object obj) {
        return ((Long) AbstractC1851l.isPro(j, obj)).longValue();
    }

    public final boolean Signature(AbstractC17187l abstractC17187l, AbstractC17187l abstractC17187l2, int i) {
        return admob(i, abstractC17187l) == admob(i, abstractC17187l2);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f6 A[RETURN] */
    public final boolean admob(int i, Object obj) {
        int i2 = this.yandex[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & AbstractC1851l.billing(j, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iStartapp = startapp(i);
        long j2 = iStartapp & 1048575;
        switch (adcel(iStartapp)) {
            case 0:
                if (Double.doubleToRawLongBits(AbstractC1851l.crashlytics.isPro(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(AbstractC1851l.crashlytics.billing(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (AbstractC1851l.admob(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (AbstractC1851l.admob(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (AbstractC1851l.billing(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (AbstractC1851l.admob(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (AbstractC1851l.billing(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return AbstractC1851l.crashlytics.amazon(j2, obj);
            case 8:
                Object objIsPro = AbstractC1851l.isPro(j2, obj);
                if (objIsPro instanceof String) {
                    if (((String) objIsPro).isEmpty()) {
                        return false;
                    }
                    return true;
                }
                if (!(objIsPro instanceof C1998l)) {
                    C11983l.crashlytics();
                    return false;
                }
                if (C1998l.f4517l.equals(objIsPro)) {
                    return false;
                }
                return true;
            case 9:
                if (AbstractC1851l.isPro(j2, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                if (C1998l.f4517l.equals(AbstractC1851l.isPro(j2, obj))) {
                    return false;
                }
                return true;
            case 11:
                if (AbstractC1851l.billing(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (AbstractC1851l.billing(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (AbstractC1851l.billing(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (AbstractC1851l.admob(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (AbstractC1851l.billing(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (AbstractC1851l.admob(j2, obj) != 0) {
                    return true;
                }
                return false;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                if (AbstractC1851l.isPro(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                C11983l.crashlytics();
                return false;
        }
    }

    @Override // defpackage.InterfaceC0101l
    public final boolean amazon(AbstractC17187l abstractC17187l, AbstractC17187l abstractC17187l2) {
        boolean zYandex;
        int i = 0;
        while (true) {
            int[] iArr = this.yandex;
            if (i < iArr.length) {
                int iStartapp = startapp(i);
                long j = iStartapp & 1048575;
                switch (adcel(iStartapp)) {
                    case 0:
                        if (Signature(abstractC17187l, abstractC17187l2, i)) {
                            AbstractC6809l abstractC6809l = AbstractC1851l.crashlytics;
                            if (Double.doubleToLongBits(abstractC6809l.isPro(j, abstractC17187l)) == Double.doubleToLongBits(abstractC6809l.isPro(j, abstractC17187l2))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 1:
                        if (Signature(abstractC17187l, abstractC17187l2, i)) {
                            AbstractC6809l abstractC6809l2 = AbstractC1851l.crashlytics;
                            if (Float.floatToIntBits(abstractC6809l2.billing(j, abstractC17187l)) == Float.floatToIntBits(abstractC6809l2.billing(j, abstractC17187l2))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 2:
                        if (Signature(abstractC17187l, abstractC17187l2, i) && AbstractC1851l.admob(j, abstractC17187l) == AbstractC1851l.admob(j, abstractC17187l2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (Signature(abstractC17187l, abstractC17187l2, i) && AbstractC1851l.admob(j, abstractC17187l) == AbstractC1851l.admob(j, abstractC17187l2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (Signature(abstractC17187l, abstractC17187l2, i) && AbstractC1851l.billing(j, abstractC17187l) == AbstractC1851l.billing(j, abstractC17187l2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (Signature(abstractC17187l, abstractC17187l2, i) && AbstractC1851l.admob(j, abstractC17187l) == AbstractC1851l.admob(j, abstractC17187l2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (Signature(abstractC17187l, abstractC17187l2, i) && AbstractC1851l.billing(j, abstractC17187l) == AbstractC1851l.billing(j, abstractC17187l2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (Signature(abstractC17187l, abstractC17187l2, i)) {
                            AbstractC6809l abstractC6809l3 = AbstractC1851l.crashlytics;
                            if (abstractC6809l3.amazon(j, abstractC17187l) == abstractC6809l3.amazon(j, abstractC17187l2)) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 8:
                        if (Signature(abstractC17187l, abstractC17187l2, i) && AbstractC3622l.yandex(AbstractC1851l.isPro(j, abstractC17187l), AbstractC1851l.isPro(j, abstractC17187l2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (Signature(abstractC17187l, abstractC17187l2, i) && AbstractC3622l.yandex(AbstractC1851l.isPro(j, abstractC17187l), AbstractC1851l.isPro(j, abstractC17187l2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (Signature(abstractC17187l, abstractC17187l2, i) && AbstractC3622l.yandex(AbstractC1851l.isPro(j, abstractC17187l), AbstractC1851l.isPro(j, abstractC17187l2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (Signature(abstractC17187l, abstractC17187l2, i) && AbstractC1851l.billing(j, abstractC17187l) == AbstractC1851l.billing(j, abstractC17187l2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (Signature(abstractC17187l, abstractC17187l2, i) && AbstractC1851l.billing(j, abstractC17187l) == AbstractC1851l.billing(j, abstractC17187l2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (Signature(abstractC17187l, abstractC17187l2, i) && AbstractC1851l.billing(j, abstractC17187l) == AbstractC1851l.billing(j, abstractC17187l2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (Signature(abstractC17187l, abstractC17187l2, i) && AbstractC1851l.admob(j, abstractC17187l) == AbstractC1851l.admob(j, abstractC17187l2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (Signature(abstractC17187l, abstractC17187l2, i) && AbstractC1851l.billing(j, abstractC17187l) == AbstractC1851l.billing(j, abstractC17187l2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (Signature(abstractC17187l, abstractC17187l2, i) && AbstractC1851l.admob(j, abstractC17187l) == AbstractC1851l.admob(j, abstractC17187l2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        if (Signature(abstractC17187l, abstractC17187l2, i) && AbstractC3622l.yandex(AbstractC1851l.isPro(j, abstractC17187l), AbstractC1851l.isPro(j, abstractC17187l2))) {
                            continue;
                            i += 3;
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
                        zYandex = AbstractC3622l.yandex(AbstractC1851l.isPro(j, abstractC17187l), AbstractC1851l.isPro(j, abstractC17187l2));
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        zYandex = AbstractC3622l.yandex(AbstractC1851l.isPro(j, abstractC17187l), AbstractC1851l.isPro(j, abstractC17187l2));
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
                        if (AbstractC1851l.billing(j2, abstractC17187l) == AbstractC1851l.billing(j2, abstractC17187l2) && AbstractC3622l.yandex(AbstractC1851l.isPro(j, abstractC17187l), AbstractC1851l.isPro(j, abstractC17187l2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        continue;
                        i += 3;
                        break;
                }
                if (zYandex) {
                    i += 3;
                }
            } else if (abstractC17187l.zzc.equals(abstractC17187l2.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC0101l
    public final boolean billing(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.purchase) {
            int i6 = this.amazon[i4];
            int[] iArr = this.yandex;
            int i7 = iArr[i6];
            int iStartapp = startapp(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = admob.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                int i11 = i3;
                i = i5;
                i2 = i11;
            }
            if ((268435456 & iStartapp) == 0 || license(obj, i6, i, i2, i10)) {
                int iAdcel = adcel(iStartapp);
                if (iAdcel != 9 && iAdcel != 17) {
                    if (iAdcel != 27) {
                        if (iAdcel == 60 || iAdcel == 68) {
                            if (!isPro(i7, i6, obj) || metrica(i6).billing(AbstractC1851l.isPro(iStartapp & 1048575, obj))) {
                            }
                        } else if (iAdcel != 49) {
                            if (iAdcel == 50) {
                                AbstractC1851l.isPro(iStartapp & 1048575, obj).getClass();
                                C18725l.loadAd();
                                return false;
                            }
                        }
                        i4++;
                        i5 = i;
                        i3 = i2;
                    }
                    List list = (List) AbstractC1851l.isPro(iStartapp & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC0101l interfaceC0101lMetrica = metrica(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (interfaceC0101lMetrica.billing(list.get(i12))) {
                            }
                        }
                    }
                    i4++;
                    i5 = i;
                    i3 = i2;
                } else if (!license(obj, i6, i, i2, i10) || metrica(i6).billing(AbstractC1851l.isPro(iStartapp & 1048575, obj))) {
                    i4++;
                    i5 = i;
                    i3 = i2;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.InterfaceC0101l
    public final void crashlytics(Object obj, C2290l c2290l) throws C8413l {
        int i;
        C9720l c9720l = (C9720l) c2290l.f4983l;
        Unsafe unsafe = admob;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.yandex;
            if (i4 >= iArr.length) {
                C6378l c6378l = ((AbstractC17187l) obj).zzc;
                return;
            }
            int iStartapp = startapp(i4);
            int iAdcel = adcel(iStartapp);
            int i6 = iArr[i4];
            if (iAdcel <= 17) {
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
            long j = iStartapp & i2;
            switch (iAdcel) {
                case 0:
                    if (license(obj, i4, i3, i5, i)) {
                        c9720l.ads(i6, Double.doubleToRawLongBits(AbstractC1851l.crashlytics.isPro(j, obj)));
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if (license(obj, i4, i3, i5, i)) {
                        c9720l.startapp(i6, Float.floatToRawIntBits(AbstractC1851l.crashlytics.billing(j, obj)));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if (license(obj, i4, i3, i5, i)) {
                        c9720l.adcel(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if (license(obj, i4, i3, i5, i)) {
                        c9720l.adcel(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if (license(obj, i4, i3, i5, i)) {
                        c9720l.vip(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if (license(obj, i4, i3, i5, i)) {
                        c9720l.ads(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if (license(obj, i4, i3, i5, i)) {
                        c9720l.startapp(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if (license(obj, i4, i3, i5, i)) {
                        byte bAmazon = AbstractC1851l.crashlytics.amazon(j, obj);
                        c9720l.Signature(i6 << 3);
                        int i9 = c9720l.billing;
                        try {
                            int i10 = i9 + 1;
                            try {
                                c9720l.amazon[i9] = bAmazon;
                                c9720l.billing = i10;
                            } catch (IndexOutOfBoundsException e) {
                                e = e;
                                i9 = i10;
                                throw new C8413l(i9, c9720l.purchase, 1, e, 18);
                            }
                        } catch (IndexOutOfBoundsException e2) {
                            e = e2;
                        }
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if (license(obj, i4, i3, i5, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            c9720l.subscription(i6, (String) object);
                        } else {
                            C1998l c1998l = (C1998l) object;
                            c9720l.Signature((i6 << 3) | 2);
                            c9720l.Signature(c1998l.mopub());
                            c9720l.advert(c1998l.mopub(), c1998l.f4518l);
                        }
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if (license(obj, i4, i3, i5, i)) {
                        c2290l.yandex(i6, unsafe.getObject(obj, j), metrica(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if (license(obj, i4, i3, i5, i)) {
                        C1998l c1998l2 = (C1998l) unsafe.getObject(obj, j);
                        c9720l.Signature((i6 << 3) | 2);
                        c9720l.Signature(c1998l2.mopub());
                        c9720l.advert(c1998l2.mopub(), c1998l2.f4518l);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if (license(obj, i4, i3, i5, i)) {
                        c9720l.metrica(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if (license(obj, i4, i3, i5, i)) {
                        c9720l.vip(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if (license(obj, i4, i3, i5, i)) {
                        c9720l.startapp(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if (license(obj, i4, i3, i5, i)) {
                        c9720l.ads(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if (license(obj, i4, i3, i5, i)) {
                        int i11 = unsafe.getInt(obj, j);
                        c9720l.metrica(i6, (i11 >> 31) ^ (i11 + i11));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if (license(obj, i4, i3, i5, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        c9720l.adcel(i6, (j2 >> 63) ^ (j2 + j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (license(obj, i4, i3, i5, i)) {
                        Object object2 = unsafe.getObject(obj, j);
                        c9720l.remoteconfig(i6, 3);
                        metrica(i4).crashlytics((AbstractC6909l) object2, c2290l);
                        c9720l.remoteconfig(i6, 4);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    AbstractC3622l.crashlytics(iArr[i4], (List) unsafe.getObject(obj, j), c2290l, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    AbstractC3622l.amazon(iArr[i4], (List) unsafe.getObject(obj, j), c2290l, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    AbstractC3622l.purchase(iArr[i4], (List) unsafe.getObject(obj, j), c2290l, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    AbstractC3622l.billing(iArr[i4], (List) unsafe.getObject(obj, j), c2290l, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    AbstractC3622l.isPro(iArr[i4], (List) unsafe.getObject(obj, j), c2290l, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    AbstractC3622l.admob(iArr[i4], (List) unsafe.getObject(obj, j), c2290l, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    AbstractC3622l.remoteconfig(iArr[i4], (List) unsafe.getObject(obj, j), c2290l, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    AbstractC3622l.startapp(iArr[i4], (List) unsafe.getObject(obj, j), c2290l, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    int i12 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    C16222l c16222l = AbstractC3622l.yandex;
                    if (list != null && !list.isEmpty()) {
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            c9720l.subscription(i12, (String) list.get(i13));
                        }
                    }
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    int i14 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    InterfaceC0101l interfaceC0101lMetrica = metrica(i4);
                    C16222l c16222l2 = AbstractC3622l.yandex;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            c2290l.yandex(i14, list2.get(i15), interfaceC0101lMetrica);
                        }
                    }
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    int i16 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    C16222l c16222l3 = AbstractC3622l.yandex;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i17 = 0; i17 < list3.size(); i17++) {
                            C1998l c1998l3 = (C1998l) list3.get(i17);
                            c9720l.Signature((i16 << 3) | 2);
                            c9720l.Signature(c1998l3.mopub());
                            c9720l.advert(c1998l3.mopub(), c1998l3.f4518l);
                        }
                    }
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    AbstractC3622l.firebase(iArr[i4], (List) unsafe.getObject(obj, j), c2290l, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 30:
                    AbstractC3622l.metrica(iArr[i4], (List) unsafe.getObject(obj, j), c2290l, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 31:
                    AbstractC3622l.vip(iArr[i4], (List) unsafe.getObject(obj, j), c2290l, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 32:
                    AbstractC3622l.subs(iArr[i4], (List) unsafe.getObject(obj, j), c2290l, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    AbstractC3622l.smaato(iArr[i4], (List) unsafe.getObject(obj, j), c2290l, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    AbstractC3622l.mopub(iArr[i4], (List) unsafe.getObject(obj, j), c2290l, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    AbstractC3622l.crashlytics(iArr[i4], (List) unsafe.getObject(obj, j), c2290l, true);
                    break;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    AbstractC3622l.amazon(iArr[i4], (List) unsafe.getObject(obj, j), c2290l, true);
                    break;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    AbstractC3622l.purchase(iArr[i4], (List) unsafe.getObject(obj, j), c2290l, true);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    AbstractC3622l.billing(iArr[i4], (List) unsafe.getObject(obj, j), c2290l, true);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    AbstractC3622l.isPro(iArr[i4], (List) unsafe.getObject(obj, j), c2290l, true);
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    AbstractC3622l.admob(iArr[i4], (List) unsafe.getObject(obj, j), c2290l, true);
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    AbstractC3622l.remoteconfig(iArr[i4], (List) unsafe.getObject(obj, j), c2290l, true);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    AbstractC3622l.startapp(iArr[i4], (List) unsafe.getObject(obj, j), c2290l, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    AbstractC3622l.firebase(iArr[i4], (List) unsafe.getObject(obj, j), c2290l, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    AbstractC3622l.metrica(iArr[i4], (List) unsafe.getObject(obj, j), c2290l, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    AbstractC3622l.vip(iArr[i4], (List) unsafe.getObject(obj, j), c2290l, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    AbstractC3622l.subs(iArr[i4], (List) unsafe.getObject(obj, j), c2290l, true);
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    AbstractC3622l.smaato(iArr[i4], (List) unsafe.getObject(obj, j), c2290l, true);
                    break;
                case 48:
                    AbstractC3622l.mopub(iArr[i4], (List) unsafe.getObject(obj, j), c2290l, true);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    int i18 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    InterfaceC0101l interfaceC0101lMetrica2 = metrica(i4);
                    C16222l c16222l4 = AbstractC3622l.yandex;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i19 = 0; i19 < list4.size(); i19++) {
                            AbstractC6909l abstractC6909l = (AbstractC6909l) list4.get(i19);
                            c9720l.remoteconfig(i18, 3);
                            interfaceC0101lMetrica2.crashlytics(abstractC6909l, c2290l);
                            c9720l.remoteconfig(i18, 4);
                        }
                    }
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    if (unsafe.getObject(obj, j) != null) {
                        int i20 = i4 / 3;
                        throw AbstractC12589l.signatures(this.loadAd[i20 + i20]);
                    }
                    break;
                case 51:
                    if (isPro(i6, i4, obj)) {
                        c9720l.ads(i6, Double.doubleToRawLongBits(((Double) AbstractC1851l.isPro(j, obj)).doubleValue()));
                    }
                    break;
                case 52:
                    if (isPro(i6, i4, obj)) {
                        c9720l.startapp(i6, Float.floatToRawIntBits(((Float) AbstractC1851l.isPro(j, obj)).floatValue()));
                    }
                    break;
                case 53:
                    if (isPro(i6, i4, obj)) {
                        c9720l.adcel(i6, tapsense(j, obj));
                    }
                    break;
                case 54:
                    if (isPro(i6, i4, obj)) {
                        c9720l.adcel(i6, tapsense(j, obj));
                    }
                    break;
                case 55:
                    if (isPro(i6, i4, obj)) {
                        c9720l.vip(i6, subscription(j, obj));
                    }
                    break;
                case 56:
                    if (isPro(i6, i4, obj)) {
                        c9720l.ads(i6, tapsense(j, obj));
                    }
                    break;
                case 57:
                    if (isPro(i6, i4, obj)) {
                        c9720l.startapp(i6, subscription(j, obj));
                    }
                    break;
                case 58:
                    if (isPro(i6, i4, obj)) {
                        byte bBooleanValue = ((Boolean) AbstractC1851l.isPro(j, obj)).booleanValue();
                        c9720l.Signature(i6 << 3);
                        int i21 = c9720l.billing;
                        try {
                            int i22 = i21 + 1;
                            try {
                                c9720l.amazon[i21] = bBooleanValue;
                                c9720l.billing = i22;
                            } catch (IndexOutOfBoundsException e3) {
                                e = e3;
                                i21 = i22;
                                throw new C8413l(i21, c9720l.purchase, 1, e, 18);
                            }
                        } catch (IndexOutOfBoundsException e4) {
                            e = e4;
                        }
                    }
                    break;
                case 59:
                    if (isPro(i6, i4, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            c9720l.subscription(i6, (String) object3);
                        } else {
                            C1998l c1998l4 = (C1998l) object3;
                            c9720l.Signature((i6 << 3) | 2);
                            c9720l.Signature(c1998l4.mopub());
                            c9720l.advert(c1998l4.mopub(), c1998l4.f4518l);
                        }
                    }
                    break;
                case 60:
                    if (isPro(i6, i4, obj)) {
                        c2290l.yandex(i6, unsafe.getObject(obj, j), metrica(i4));
                    }
                    break;
                case 61:
                    if (isPro(i6, i4, obj)) {
                        C1998l c1998l5 = (C1998l) unsafe.getObject(obj, j);
                        c9720l.Signature((i6 << 3) | 2);
                        c9720l.Signature(c1998l5.mopub());
                        c9720l.advert(c1998l5.mopub(), c1998l5.f4518l);
                    }
                    break;
                case 62:
                    if (isPro(i6, i4, obj)) {
                        c9720l.metrica(i6, subscription(j, obj));
                    }
                    break;
                case 63:
                    if (isPro(i6, i4, obj)) {
                        c9720l.vip(i6, subscription(j, obj));
                    }
                    break;
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    if (isPro(i6, i4, obj)) {
                        c9720l.startapp(i6, subscription(j, obj));
                    }
                    break;
                case 65:
                    if (isPro(i6, i4, obj)) {
                        c9720l.ads(i6, tapsense(j, obj));
                    }
                    break;
                case 66:
                    if (isPro(i6, i4, obj)) {
                        int iSubscription = subscription(j, obj);
                        c9720l.metrica(i6, (iSubscription >> 31) ^ (iSubscription + iSubscription));
                    }
                    break;
                case 67:
                    if (isPro(i6, i4, obj)) {
                        long jTapsense = tapsense(j, obj);
                        c9720l.adcel(i6, (jTapsense >> 63) ^ (jTapsense + jTapsense));
                    }
                    break;
                case 68:
                    if (isPro(i6, i4, obj)) {
                        Object object4 = unsafe.getObject(obj, j);
                        c9720l.remoteconfig(i6, 3);
                        metrica(i4).crashlytics((AbstractC6909l) object4, c2290l);
                        c9720l.remoteconfig(i6, 4);
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
    }

    public final boolean isPro(int i, int i2, Object obj) {
        return AbstractC1851l.billing((long) (this.yandex[i2 + 2] & 1048575), obj) == i;
    }

    public final boolean license(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return admob(i, obj);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x0343  */
    /* JADX WARN: Code duplicated, block: B:185:0x0461  */
    /* JADX WARN: Code duplicated, block: B:217:0x0552  */
    /* JADX WARN: Code duplicated, block: B:220:0x0560  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    @Override // defpackage.InterfaceC0101l
    public final int loadAd(AbstractC6909l abstractC6909l) {
        int i;
        int iIsVip;
        int iSignatures;
        int iIsVip2;
        int iMopub;
        int iIsVip3;
        int iYandex;
        int i2;
        int iIsVip4;
        int iAdvert;
        int i3;
        int iYandex2;
        int iIsVip5;
        int size;
        int iAds;
        int iIsVip6;
        int iIsVip7;
        int iIsVip8;
        int size2;
        int iIsVip9;
        int iYandex3;
        int iIsVip10;
        int iSignatures2;
        int iIsVip11;
        int iMopub2;
        int iSubscription;
        int iIsVip12;
        Unsafe unsafe = admob;
        int i4 = 0;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int iPremium = 0;
        int i8 = 1048575;
        while (true) {
            int[] iArr = this.yandex;
            if (i6 >= iArr.length) {
                C6378l c6378l = ((AbstractC17187l) abstractC6909l).zzc;
                int i9 = c6378l.crashlytics;
                if (i9 == -1) {
                    c6378l.crashlytics = 0;
                } else {
                    i4 = i9;
                }
                return i4 + iPremium;
            }
            int iStartapp = startapp(i6);
            int iAdcel = adcel(iStartapp);
            int i10 = iArr[i6];
            int i11 = iArr[i6 + 2];
            int i12 = i11 & i5;
            if (iAdcel <= 17) {
                if (i12 != i8) {
                    i7 = i12 == i5 ? 0 : unsafe.getInt(abstractC6909l, i12);
                    i8 = i12;
                }
                i = 1 << (i11 >>> 20);
            } else {
                i = 0;
            }
            int i13 = iStartapp & i5;
            if (iAdcel >= EnumC9505l.f19393l.f19396l) {
                EnumC9505l.f19392l.getClass();
            }
            long j = i13;
            switch (iAdcel) {
                case 0:
                    if (license(abstractC6909l, i6, i8, i7, i)) {
                        iPremium = AbstractC9029l.premium(i10 << 3, 8, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 1:
                    if (license(abstractC6909l, i6, i8, i7, i)) {
                        iPremium = AbstractC9029l.premium(i10 << 3, 4, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 2:
                    if (license(abstractC6909l, i6, i8, i7, i)) {
                        long j2 = unsafe.getLong(abstractC6909l, j);
                        iIsVip = C9720l.isVip(i10 << 3);
                        iSignatures = C9720l.signatures(j2);
                        iAdvert = iSignatures + iIsVip;
                        iPremium += iAdvert;
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 3:
                    if (license(abstractC6909l, i6, i8, i7, i)) {
                        long j3 = unsafe.getLong(abstractC6909l, j);
                        iIsVip = C9720l.isVip(i10 << 3);
                        iSignatures = C9720l.signatures(j3);
                        iAdvert = iSignatures + iIsVip;
                        iPremium += iAdvert;
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 4:
                    if (license(abstractC6909l, i6, i8, i7, i)) {
                        long j4 = unsafe.getInt(abstractC6909l, j);
                        iIsVip = C9720l.isVip(i10 << 3);
                        iSignatures = C9720l.signatures(j4);
                        iAdvert = iSignatures + iIsVip;
                        iPremium += iAdvert;
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 5:
                    if (license(abstractC6909l, i6, i8, i7, i)) {
                        iPremium = AbstractC9029l.premium(i10 << 3, 8, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 6:
                    if (license(abstractC6909l, i6, i8, i7, i)) {
                        iPremium = AbstractC9029l.premium(i10 << 3, 4, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 7:
                    if (license(abstractC6909l, i6, i8, i7, i)) {
                        iPremium = AbstractC9029l.premium(i10 << 3, 1, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 8:
                    if (license(abstractC6909l, i6, i8, i7, i)) {
                        int i14 = i10 << 3;
                        Object object = unsafe.getObject(abstractC6909l, j);
                        if (object instanceof C1998l) {
                            iIsVip2 = C9720l.isVip(i14);
                            iMopub = ((C1998l) object).mopub();
                            iPremium = AbstractC4582l.yandex(iMopub, iMopub, iIsVip2, iPremium);
                        } else {
                            iIsVip = C9720l.isVip(i14);
                            iSignatures = C9720l.premium((String) object);
                            iAdvert = iSignatures + iIsVip;
                            iPremium += iAdvert;
                        }
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 9:
                    if (license(abstractC6909l, i6, i8, i7, i)) {
                        Object object2 = unsafe.getObject(abstractC6909l, j);
                        InterfaceC0101l interfaceC0101lMetrica = metrica(i6);
                        C16222l c16222l = AbstractC3622l.yandex;
                        iIsVip3 = C9720l.isVip(i10 << 3);
                        iYandex = ((AbstractC6909l) object2).yandex(interfaceC0101lMetrica);
                        iPremium = AbstractC4582l.yandex(iYandex, iYandex, iIsVip3, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 10:
                    if (license(abstractC6909l, i6, i8, i7, i)) {
                        C1998l c1998l = (C1998l) unsafe.getObject(abstractC6909l, j);
                        iIsVip2 = C9720l.isVip(i10 << 3);
                        iMopub = c1998l.mopub();
                        iPremium = AbstractC4582l.yandex(iMopub, iMopub, iIsVip2, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 11:
                    if (license(abstractC6909l, i6, i8, i7, i)) {
                        i2 = unsafe.getInt(abstractC6909l, j);
                        iIsVip4 = C9720l.isVip(i10 << 3);
                        iPremium = AbstractC9029l.premium(i2, iIsVip4, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 12:
                    if (license(abstractC6909l, i6, i8, i7, i)) {
                        long j5 = unsafe.getInt(abstractC6909l, j);
                        iIsVip = C9720l.isVip(i10 << 3);
                        iSignatures = C9720l.signatures(j5);
                        iAdvert = iSignatures + iIsVip;
                        iPremium += iAdvert;
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 13:
                    if (license(abstractC6909l, i6, i8, i7, i)) {
                        iPremium = AbstractC9029l.premium(i10 << 3, 4, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 14:
                    if (license(abstractC6909l, i6, i8, i7, i)) {
                        iPremium = AbstractC9029l.premium(i10 << 3, 8, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 15:
                    if (license(abstractC6909l, i6, i8, i7, i)) {
                        int i15 = unsafe.getInt(abstractC6909l, j);
                        iIsVip4 = C9720l.isVip(i10 << 3);
                        i2 = (i15 >> 31) ^ (i15 + i15);
                        iPremium = AbstractC9029l.premium(i2, iIsVip4, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 16:
                    if (license(abstractC6909l, i6, i8, i7, i)) {
                        long j6 = unsafe.getLong(abstractC6909l, j);
                        iIsVip = C9720l.isVip(i10 << 3);
                        iSignatures = C9720l.signatures((j6 >> 63) ^ (j6 + j6));
                        iAdvert = iSignatures + iIsVip;
                        iPremium += iAdvert;
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (license(abstractC6909l, i6, i8, i7, i)) {
                        AbstractC6909l abstractC6909l2 = (AbstractC6909l) unsafe.getObject(abstractC6909l, j);
                        InterfaceC0101l interfaceC0101lMetrica2 = metrica(i6);
                        C16222l c16222l2 = AbstractC3622l.yandex;
                        int iIsVip13 = C9720l.isVip(i10 << 3);
                        i3 = iIsVip13 + iIsVip13;
                        iYandex2 = abstractC6909l2.yandex(interfaceC0101lMetrica2);
                        iAdvert = iYandex2 + i3;
                        iPremium += iAdvert;
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    iAdvert = AbstractC3622l.advert(i10, (List) unsafe.getObject(abstractC6909l, j));
                    iPremium += iAdvert;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    iAdvert = AbstractC3622l.ad(i10, (List) unsafe.getObject(abstractC6909l, j));
                    iPremium += iAdvert;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(abstractC6909l, j);
                    C16222l c16222l3 = AbstractC3622l.yandex;
                    if (list.size() == 0) {
                        iIsVip5 = 0;
                    } else {
                        iIsVip5 = (C9720l.isVip(i10 << 3) * list.size()) + AbstractC3622l.adcel(list);
                    }
                    iPremium += iIsVip5;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC6909l, j);
                    C16222l c16222l4 = AbstractC3622l.yandex;
                    size = list2.size();
                    if (size == 0) {
                        iIsVip7 = 0;
                    } else {
                        iAds = AbstractC3622l.ads(list2);
                        iIsVip6 = C9720l.isVip(i10 << 3);
                        iIsVip7 = (iIsVip6 * size) + iAds;
                    }
                    iPremium += iIsVip7;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC6909l, j);
                    C16222l c16222l5 = AbstractC3622l.yandex;
                    size = list3.size();
                    if (size == 0) {
                        iIsVip7 = 0;
                    } else {
                        iAds = AbstractC3622l.Signature(list3);
                        iIsVip6 = C9720l.isVip(i10 << 3);
                        iIsVip7 = (iIsVip6 * size) + iAds;
                    }
                    iPremium += iIsVip7;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 23:
                    iAdvert = AbstractC3622l.advert(i10, (List) unsafe.getObject(abstractC6909l, j));
                    iPremium += iAdvert;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    iAdvert = AbstractC3622l.ad(i10, (List) unsafe.getObject(abstractC6909l, j));
                    iPremium += iAdvert;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    List list4 = (List) unsafe.getObject(abstractC6909l, j);
                    C16222l c16222l6 = AbstractC3622l.yandex;
                    int size3 = list4.size();
                    if (size3 == 0) {
                        iIsVip5 = 0;
                    } else {
                        iIsVip5 = (C9720l.isVip(i10 << 3) + 1) * size3;
                    }
                    iPremium += iIsVip5;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    List list5 = (List) unsafe.getObject(abstractC6909l, j);
                    C16222l c16222l7 = AbstractC3622l.yandex;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iIsVip7 = 0;
                    } else {
                        iIsVip7 = C9720l.isVip(i10 << 3) * size4;
                        for (int i16 = 0; i16 < size4; i16++) {
                            Object obj = list5.get(i16);
                            if (obj instanceof C1998l) {
                                int iMopub3 = ((C1998l) obj).mopub();
                                iIsVip7 = AbstractC9029l.premium(iMopub3, iMopub3, iIsVip7);
                            } else {
                                iIsVip7 = C9720l.premium((String) obj) + iIsVip7;
                            }
                        }
                    }
                    iPremium += iIsVip7;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    List list6 = (List) unsafe.getObject(abstractC6909l, j);
                    InterfaceC0101l interfaceC0101lMetrica3 = metrica(i6);
                    C16222l c16222l8 = AbstractC3622l.yandex;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iIsVip8 = 0;
                    } else {
                        iIsVip8 = C9720l.isVip(i10 << 3) * size5;
                        for (int i17 = 0; i17 < size5; i17++) {
                            int iYandex4 = ((AbstractC6909l) list6.get(i17)).yandex(interfaceC0101lMetrica3);
                            iIsVip8 = AbstractC9029l.premium(iYandex4, iYandex4, iIsVip8);
                        }
                    }
                    iPremium += iIsVip8;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    List list7 = (List) unsafe.getObject(abstractC6909l, j);
                    C16222l c16222l9 = AbstractC3622l.yandex;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iIsVip7 = 0;
                    } else {
                        iIsVip7 = C9720l.isVip(i10 << 3) * size6;
                        for (int i18 = 0; i18 < list7.size(); i18++) {
                            int iMopub4 = ((C1998l) list7.get(i18)).mopub();
                            iIsVip7 = AbstractC9029l.premium(iMopub4, iMopub4, iIsVip7);
                        }
                    }
                    iPremium += iIsVip7;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    List list8 = (List) unsafe.getObject(abstractC6909l, j);
                    C16222l c16222l10 = AbstractC3622l.yandex;
                    size = list8.size();
                    if (size == 0) {
                        iIsVip7 = 0;
                    } else {
                        iAds = AbstractC3622l.license(list8);
                        iIsVip6 = C9720l.isVip(i10 << 3);
                        iIsVip7 = (iIsVip6 * size) + iAds;
                    }
                    iPremium += iIsVip7;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC6909l, j);
                    C16222l c16222l11 = AbstractC3622l.yandex;
                    size = list9.size();
                    if (size == 0) {
                        iIsVip7 = 0;
                    } else {
                        iAds = AbstractC3622l.tapsense(list9);
                        iIsVip6 = C9720l.isVip(i10 << 3);
                        iIsVip7 = (iIsVip6 * size) + iAds;
                    }
                    iPremium += iIsVip7;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 31:
                    iAdvert = AbstractC3622l.ad(i10, (List) unsafe.getObject(abstractC6909l, j));
                    iPremium += iAdvert;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 32:
                    iAdvert = AbstractC3622l.advert(i10, (List) unsafe.getObject(abstractC6909l, j));
                    iPremium += iAdvert;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    List list10 = (List) unsafe.getObject(abstractC6909l, j);
                    C16222l c16222l12 = AbstractC3622l.yandex;
                    size = list10.size();
                    if (size == 0) {
                        iIsVip7 = 0;
                    } else {
                        iAds = AbstractC3622l.pro(list10);
                        iIsVip6 = C9720l.isVip(i10 << 3);
                        iIsVip7 = (iIsVip6 * size) + iAds;
                    }
                    iPremium += iIsVip7;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    List list11 = (List) unsafe.getObject(abstractC6909l, j);
                    C16222l c16222l13 = AbstractC3622l.yandex;
                    size = list11.size();
                    if (size == 0) {
                        iIsVip7 = 0;
                    } else {
                        iAds = AbstractC3622l.subscription(list11);
                        iIsVip6 = C9720l.isVip(i10 << 3);
                        iIsVip7 = (iIsVip6 * size) + iAds;
                    }
                    iPremium += iIsVip7;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    List list12 = (List) unsafe.getObject(abstractC6909l, j);
                    C16222l c16222l14 = AbstractC3622l.yandex;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iIsVip9 = C9720l.isVip(i10 << 3);
                        iPremium = AbstractC4582l.yandex(size2, iIsVip9, size2, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    List list13 = (List) unsafe.getObject(abstractC6909l, j);
                    C16222l c16222l15 = AbstractC3622l.yandex;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iIsVip9 = C9720l.isVip(i10 << 3);
                        iPremium = AbstractC4582l.yandex(size2, iIsVip9, size2, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    size2 = AbstractC3622l.adcel((List) unsafe.getObject(abstractC6909l, j));
                    if (size2 > 0) {
                        iIsVip9 = C9720l.isVip(i10 << 3);
                        iPremium = AbstractC4582l.yandex(size2, iIsVip9, size2, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    size2 = AbstractC3622l.ads((List) unsafe.getObject(abstractC6909l, j));
                    if (size2 > 0) {
                        iIsVip9 = C9720l.isVip(i10 << 3);
                        iPremium = AbstractC4582l.yandex(size2, iIsVip9, size2, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    size2 = AbstractC3622l.Signature((List) unsafe.getObject(abstractC6909l, j));
                    if (size2 > 0) {
                        iIsVip9 = C9720l.isVip(i10 << 3);
                        iPremium = AbstractC4582l.yandex(size2, iIsVip9, size2, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    List list14 = (List) unsafe.getObject(abstractC6909l, j);
                    C16222l c16222l16 = AbstractC3622l.yandex;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iIsVip9 = C9720l.isVip(i10 << 3);
                        iPremium = AbstractC4582l.yandex(size2, iIsVip9, size2, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    List list15 = (List) unsafe.getObject(abstractC6909l, j);
                    C16222l c16222l17 = AbstractC3622l.yandex;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iIsVip9 = C9720l.isVip(i10 << 3);
                        iPremium = AbstractC4582l.yandex(size2, iIsVip9, size2, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    List list16 = (List) unsafe.getObject(abstractC6909l, j);
                    C16222l c16222l18 = AbstractC3622l.yandex;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iIsVip9 = C9720l.isVip(i10 << 3);
                        iPremium = AbstractC4582l.yandex(size2, iIsVip9, size2, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    size2 = AbstractC3622l.license((List) unsafe.getObject(abstractC6909l, j));
                    if (size2 > 0) {
                        iIsVip9 = C9720l.isVip(i10 << 3);
                        iPremium = AbstractC4582l.yandex(size2, iIsVip9, size2, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    size2 = AbstractC3622l.tapsense((List) unsafe.getObject(abstractC6909l, j));
                    if (size2 > 0) {
                        iIsVip9 = C9720l.isVip(i10 << 3);
                        iPremium = AbstractC4582l.yandex(size2, iIsVip9, size2, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    List list17 = (List) unsafe.getObject(abstractC6909l, j);
                    C16222l c16222l19 = AbstractC3622l.yandex;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iIsVip9 = C9720l.isVip(i10 << 3);
                        iPremium = AbstractC4582l.yandex(size2, iIsVip9, size2, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    List list18 = (List) unsafe.getObject(abstractC6909l, j);
                    C16222l c16222l20 = AbstractC3622l.yandex;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iIsVip9 = C9720l.isVip(i10 << 3);
                        iPremium = AbstractC4582l.yandex(size2, iIsVip9, size2, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    size2 = AbstractC3622l.pro((List) unsafe.getObject(abstractC6909l, j));
                    if (size2 > 0) {
                        iIsVip9 = C9720l.isVip(i10 << 3);
                        iPremium = AbstractC4582l.yandex(size2, iIsVip9, size2, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 48:
                    size2 = AbstractC3622l.subscription((List) unsafe.getObject(abstractC6909l, j));
                    if (size2 > 0) {
                        iIsVip9 = C9720l.isVip(i10 << 3);
                        iPremium = AbstractC4582l.yandex(size2, iIsVip9, size2, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    List list19 = (List) unsafe.getObject(abstractC6909l, j);
                    InterfaceC0101l interfaceC0101lMetrica4 = metrica(i6);
                    C16222l c16222l21 = AbstractC3622l.yandex;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        iYandex3 = 0;
                    } else {
                        iYandex3 = 0;
                        for (int i19 = 0; i19 < size7; i19++) {
                            AbstractC6909l abstractC6909l3 = (AbstractC6909l) list19.get(i19);
                            int iIsVip14 = C9720l.isVip(i10 << 3);
                            iYandex3 += abstractC6909l3.yandex(interfaceC0101lMetrica4) + iIsVip14 + iIsVip14;
                        }
                    }
                    iPremium += iYandex3;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Object object3 = unsafe.getObject(abstractC6909l, j);
                    int i20 = i6 / 3;
                    Object obj2 = this.loadAd[i20 + i20];
                    if (object3 == null) {
                        throw AbstractC12589l.signatures(obj2);
                    }
                    C18725l.loadAd();
                    return 0;
                case 51:
                    if (isPro(i10, i6, abstractC6909l)) {
                        iPremium = AbstractC9029l.premium(i10 << 3, 8, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 52:
                    if (isPro(i10, i6, abstractC6909l)) {
                        iPremium = AbstractC9029l.premium(i10 << 3, 4, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 53:
                    if (isPro(i10, i6, abstractC6909l)) {
                        long jTapsense = tapsense(j, abstractC6909l);
                        iIsVip10 = C9720l.isVip(i10 << 3);
                        iSignatures2 = C9720l.signatures(jTapsense);
                        iPremium += iSignatures2 + iIsVip10;
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 54:
                    if (isPro(i10, i6, abstractC6909l)) {
                        long jTapsense2 = tapsense(j, abstractC6909l);
                        iIsVip10 = C9720l.isVip(i10 << 3);
                        iSignatures2 = C9720l.signatures(jTapsense2);
                        iPremium += iSignatures2 + iIsVip10;
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 55:
                    if (isPro(i10, i6, abstractC6909l)) {
                        long jSubscription = subscription(j, abstractC6909l);
                        iIsVip10 = C9720l.isVip(i10 << 3);
                        iSignatures2 = C9720l.signatures(jSubscription);
                        iPremium += iSignatures2 + iIsVip10;
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 56:
                    if (isPro(i10, i6, abstractC6909l)) {
                        iPremium = AbstractC9029l.premium(i10 << 3, 8, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 57:
                    if (isPro(i10, i6, abstractC6909l)) {
                        iPremium = AbstractC9029l.premium(i10 << 3, 4, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 58:
                    if (isPro(i10, i6, abstractC6909l)) {
                        iPremium = AbstractC9029l.premium(i10 << 3, 1, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 59:
                    if (isPro(i10, i6, abstractC6909l)) {
                        int i21 = i10 << 3;
                        Object object4 = unsafe.getObject(abstractC6909l, j);
                        if (object4 instanceof C1998l) {
                            iIsVip11 = C9720l.isVip(i21);
                            iMopub2 = ((C1998l) object4).mopub();
                            iPremium = AbstractC4582l.yandex(iMopub2, iMopub2, iIsVip11, iPremium);
                        } else {
                            iIsVip10 = C9720l.isVip(i21);
                            iSignatures2 = C9720l.premium((String) object4);
                            iPremium += iSignatures2 + iIsVip10;
                        }
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 60:
                    if (isPro(i10, i6, abstractC6909l)) {
                        Object object5 = unsafe.getObject(abstractC6909l, j);
                        InterfaceC0101l interfaceC0101lMetrica5 = metrica(i6);
                        C16222l c16222l22 = AbstractC3622l.yandex;
                        iIsVip3 = C9720l.isVip(i10 << 3);
                        iYandex = ((AbstractC6909l) object5).yandex(interfaceC0101lMetrica5);
                        iPremium = AbstractC4582l.yandex(iYandex, iYandex, iIsVip3, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 61:
                    if (isPro(i10, i6, abstractC6909l)) {
                        C1998l c1998l2 = (C1998l) unsafe.getObject(abstractC6909l, j);
                        iIsVip11 = C9720l.isVip(i10 << 3);
                        iMopub2 = c1998l2.mopub();
                        iPremium = AbstractC4582l.yandex(iMopub2, iMopub2, iIsVip11, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 62:
                    if (isPro(i10, i6, abstractC6909l)) {
                        iSubscription = subscription(j, abstractC6909l);
                        iIsVip12 = C9720l.isVip(i10 << 3);
                        iPremium = AbstractC9029l.premium(iSubscription, iIsVip12, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 63:
                    if (isPro(i10, i6, abstractC6909l)) {
                        long jSubscription2 = subscription(j, abstractC6909l);
                        iIsVip10 = C9720l.isVip(i10 << 3);
                        iSignatures2 = C9720l.signatures(jSubscription2);
                        iPremium += iSignatures2 + iIsVip10;
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    if (isPro(i10, i6, abstractC6909l)) {
                        iPremium = AbstractC9029l.premium(i10 << 3, 4, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 65:
                    if (isPro(i10, i6, abstractC6909l)) {
                        iPremium = AbstractC9029l.premium(i10 << 3, 8, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 66:
                    if (isPro(i10, i6, abstractC6909l)) {
                        int iSubscription2 = subscription(j, abstractC6909l);
                        iIsVip12 = C9720l.isVip(i10 << 3);
                        iSubscription = (iSubscription2 >> 31) ^ (iSubscription2 + iSubscription2);
                        iPremium = AbstractC9029l.premium(iSubscription, iIsVip12, iPremium);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 67:
                    if (isPro(i10, i6, abstractC6909l)) {
                        long jTapsense3 = tapsense(j, abstractC6909l);
                        iIsVip10 = C9720l.isVip(i10 << 3);
                        iSignatures2 = C9720l.signatures((jTapsense3 >> 63) ^ (jTapsense3 + jTapsense3));
                        iPremium += iSignatures2 + iIsVip10;
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 68:
                    if (isPro(i10, i6, abstractC6909l)) {
                        AbstractC6909l abstractC6909l4 = (AbstractC6909l) unsafe.getObject(abstractC6909l, j);
                        InterfaceC0101l interfaceC0101lMetrica6 = metrica(i6);
                        C16222l c16222l23 = AbstractC3622l.yandex;
                        int iIsVip15 = C9720l.isVip(i10 << 3);
                        i3 = iIsVip15 + iIsVip15;
                        iYandex2 = abstractC6909l4.yandex(interfaceC0101lMetrica6);
                        iAdvert = iYandex2 + i3;
                        iPremium += iAdvert;
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                default:
                    i6 += 3;
                    i5 = 1048575;
                    break;
            }
        }
    }

    public final InterfaceC0101l metrica(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.loadAd;
        InterfaceC0101l interfaceC0101l = (InterfaceC0101l) objArr[i3];
        if (interfaceC0101l != null) {
            return interfaceC0101l;
        }
        InterfaceC0101l interfaceC0101lYandex = C12765l.crashlytics.yandex((Class) objArr[i3 + 1]);
        objArr[i3] = interfaceC0101lYandex;
        return interfaceC0101lYandex;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080 A[SYNTHETIC] */
    @Override // defpackage.InterfaceC0101l
    public final void mopub(Object obj) {
        if (!ads(obj)) {
            return;
        }
        if (obj instanceof AbstractC17187l) {
            AbstractC17187l abstractC17187l = (AbstractC17187l) obj;
            abstractC17187l.amazon();
            abstractC17187l.zza = 0;
            abstractC17187l.firebase();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.yandex;
            if (i >= iArr.length) {
                this.billing.getClass();
                C6378l c6378l = ((AbstractC17187l) obj).zzc;
                if (c6378l.amazon) {
                    c6378l.amazon = false;
                    return;
                }
                return;
            }
            int iStartapp = startapp(i);
            int i2 = 1048575 & iStartapp;
            int iAdcel = adcel(iStartapp);
            long j = i2;
            if (iAdcel != 9) {
                if (iAdcel != 60 && iAdcel != 68) {
                    switch (iAdcel) {
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            if (admob(i, obj)) {
                                metrica(i).mopub(admob.getObject(obj, j));
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
                            AbstractC13676l abstractC13676l = (AbstractC13676l) ((InterfaceC12239l) AbstractC1851l.isPro(j, obj));
                            if (abstractC13676l.f26706l) {
                                abstractC13676l.f26706l = false;
                            }
                            break;
                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                            if (admob.getObject(obj, j) != null) {
                                C18725l.loadAd();
                                return;
                            }
                            break;
                            break;
                    }
                } else if (isPro(iArr[i], i, obj)) {
                    metrica(i).mopub(admob.getObject(obj, j));
                }
            } else if (admob(i, obj)) {
                metrica(i).mopub(admob.getObject(obj, j));
            }
            i += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00db A[PHI: r1
  0x00db: PHI (r1v35 int) = (r1v11 int), (r1v36 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.InterfaceC0101l
    public final int purchase(AbstractC17187l abstractC17187l) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.yandex;
            if (i5 >= iArr.length) {
                abstractC17187l.zzc.getClass();
                return (i6 * 53) + 506991;
            }
            int iStartapp = startapp(i5);
            int i7 = 1048575 & iStartapp;
            int iAdcel = adcel(iStartapp);
            int i8 = iArr[i5];
            long j = i7;
            int i9 = 1237;
            int iHashCode = 37;
            switch (iAdcel) {
                case 0:
                    i = i6 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(AbstractC1851l.crashlytics.isPro(j, abstractC17187l));
                    Charset charset = AbstractC11966l.yandex;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i6 * 53;
                    iFloatToIntBits = Float.floatToIntBits(AbstractC1851l.crashlytics.billing(j, abstractC17187l));
                    i6 = iFloatToIntBits + i2;
                    break;
                case 2:
                    i = i6 * 53;
                    jDoubleToLongBits = AbstractC1851l.admob(j, abstractC17187l);
                    Charset charset2 = AbstractC11966l.yandex;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i6 * 53;
                    jDoubleToLongBits = AbstractC1851l.admob(j, abstractC17187l);
                    Charset charset3 = AbstractC11966l.yandex;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i6 * 53;
                    iFloatToIntBits = AbstractC1851l.billing(j, abstractC17187l);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 5:
                    i = i6 * 53;
                    jDoubleToLongBits = AbstractC1851l.admob(j, abstractC17187l);
                    Charset charset4 = AbstractC11966l.yandex;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i6 * 53;
                    iFloatToIntBits = AbstractC1851l.billing(j, abstractC17187l);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 7:
                    i3 = i6 * 53;
                    boolean zAmazon = AbstractC1851l.crashlytics.amazon(j, abstractC17187l);
                    Charset charset5 = AbstractC11966l.yandex;
                    if (zAmazon) {
                        i9 = 1231;
                    }
                    i6 = i9 + i3;
                    break;
                case 8:
                    i2 = i6 * 53;
                    iFloatToIntBits = ((String) AbstractC1851l.isPro(j, abstractC17187l)).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 9:
                    i4 = i6 * 53;
                    Object objIsPro = AbstractC1851l.isPro(j, abstractC17187l);
                    if (objIsPro != null) {
                        iHashCode = objIsPro.hashCode();
                    }
                    i6 = i4 + iHashCode;
                    break;
                case 10:
                    i2 = i6 * 53;
                    iFloatToIntBits = AbstractC1851l.isPro(j, abstractC17187l).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 11:
                    i2 = i6 * 53;
                    iFloatToIntBits = AbstractC1851l.billing(j, abstractC17187l);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 12:
                    i2 = i6 * 53;
                    iFloatToIntBits = AbstractC1851l.billing(j, abstractC17187l);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 13:
                    i2 = i6 * 53;
                    iFloatToIntBits = AbstractC1851l.billing(j, abstractC17187l);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 14:
                    i = i6 * 53;
                    jDoubleToLongBits = AbstractC1851l.admob(j, abstractC17187l);
                    Charset charset6 = AbstractC11966l.yandex;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i6 * 53;
                    iFloatToIntBits = AbstractC1851l.billing(j, abstractC17187l);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 16:
                    i = i6 * 53;
                    jDoubleToLongBits = AbstractC1851l.admob(j, abstractC17187l);
                    Charset charset7 = AbstractC11966l.yandex;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    i4 = i6 * 53;
                    Object objIsPro2 = AbstractC1851l.isPro(j, abstractC17187l);
                    if (objIsPro2 != null) {
                        iHashCode = objIsPro2.hashCode();
                    }
                    i6 = i4 + iHashCode;
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
                    i2 = i6 * 53;
                    iFloatToIntBits = AbstractC1851l.isPro(j, abstractC17187l).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    i2 = i6 * 53;
                    iFloatToIntBits = AbstractC1851l.isPro(j, abstractC17187l).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 51:
                    if (isPro(i8, i5, abstractC17187l)) {
                        i = i6 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) AbstractC1851l.isPro(j, abstractC17187l)).doubleValue());
                        Charset charset8 = AbstractC11966l.yandex;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 52:
                    if (isPro(i8, i5, abstractC17187l)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) AbstractC1851l.isPro(j, abstractC17187l)).floatValue());
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 53:
                    if (isPro(i8, i5, abstractC17187l)) {
                        i = i6 * 53;
                        jDoubleToLongBits = tapsense(j, abstractC17187l);
                        Charset charset9 = AbstractC11966l.yandex;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 54:
                    if (isPro(i8, i5, abstractC17187l)) {
                        i = i6 * 53;
                        jDoubleToLongBits = tapsense(j, abstractC17187l);
                        Charset charset10 = AbstractC11966l.yandex;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 55:
                    if (isPro(i8, i5, abstractC17187l)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = subscription(j, abstractC17187l);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 56:
                    if (isPro(i8, i5, abstractC17187l)) {
                        i = i6 * 53;
                        jDoubleToLongBits = tapsense(j, abstractC17187l);
                        Charset charset11 = AbstractC11966l.yandex;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 57:
                    if (isPro(i8, i5, abstractC17187l)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = subscription(j, abstractC17187l);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 58:
                    if (isPro(i8, i5, abstractC17187l)) {
                        i3 = i6 * 53;
                        boolean zBooleanValue = ((Boolean) AbstractC1851l.isPro(j, abstractC17187l)).booleanValue();
                        Charset charset12 = AbstractC11966l.yandex;
                        if (zBooleanValue) {
                            i9 = 1231;
                        }
                        i6 = i9 + i3;
                    }
                    break;
                case 59:
                    if (isPro(i8, i5, abstractC17187l)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = ((String) AbstractC1851l.isPro(j, abstractC17187l)).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 60:
                    if (isPro(i8, i5, abstractC17187l)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = AbstractC1851l.isPro(j, abstractC17187l).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 61:
                    if (isPro(i8, i5, abstractC17187l)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = AbstractC1851l.isPro(j, abstractC17187l).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 62:
                    if (isPro(i8, i5, abstractC17187l)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = subscription(j, abstractC17187l);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 63:
                    if (isPro(i8, i5, abstractC17187l)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = subscription(j, abstractC17187l);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    if (isPro(i8, i5, abstractC17187l)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = subscription(j, abstractC17187l);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 65:
                    if (isPro(i8, i5, abstractC17187l)) {
                        i = i6 * 53;
                        jDoubleToLongBits = tapsense(j, abstractC17187l);
                        Charset charset13 = AbstractC11966l.yandex;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 66:
                    if (isPro(i8, i5, abstractC17187l)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = subscription(j, abstractC17187l);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 67:
                    if (isPro(i8, i5, abstractC17187l)) {
                        i = i6 * 53;
                        jDoubleToLongBits = tapsense(j, abstractC17187l);
                        Charset charset14 = AbstractC11966l.yandex;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 68:
                    if (isPro(i8, i5, abstractC17187l)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = AbstractC1851l.isPro(j, abstractC17187l).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
            }
            i5 += 3;
        }
    }

    public final void remoteconfig(int i, Object obj, Object obj2) {
        if (admob(i, obj2)) {
            int iStartapp = startapp(i) & 1048575;
            Unsafe unsafe = admob;
            long j = iStartapp;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.yandex[i];
                String string = obj2.toString();
                C11586l.amazon(String.valueOf(i2).length() + 38 + string.length(), i2, string);
                return;
            }
            InterfaceC0101l interfaceC0101lMetrica = metrica(i);
            if (!admob(i, obj)) {
                if (ads(object)) {
                    AbstractC17187l abstractC17187lZza = interfaceC0101lMetrica.zza();
                    interfaceC0101lMetrica.yandex(abstractC17187lZza, object);
                    unsafe.putObject(obj, j, abstractC17187lZza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                subs(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!ads(object2)) {
                AbstractC17187l abstractC17187lZza2 = interfaceC0101lMetrica.zza();
                interfaceC0101lMetrica.yandex(abstractC17187lZza2, object2);
                unsafe.putObject(obj, j, abstractC17187lZza2);
                object2 = abstractC17187lZza2;
            }
            interfaceC0101lMetrica.yandex(object2, object);
        }
    }

    public final int startapp(int i) {
        return this.yandex[i + 1];
    }

    public final void subs(int i, Object obj) {
        int i2 = this.yandex[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        AbstractC1851l.mopub(j, obj, (1 << (i2 >>> 20)) | AbstractC1851l.billing(j, obj));
    }

    public final void vip(int i, Object obj, Object obj2) {
        int[] iArr = this.yandex;
        int i2 = iArr[i];
        if (isPro(i2, i, obj2)) {
            int iStartapp = startapp(i) & 1048575;
            Unsafe unsafe = admob;
            long j = iStartapp;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = iArr[i];
                String string = obj2.toString();
                C11586l.amazon(String.valueOf(i3).length() + 38 + string.length(), i3, string);
                return;
            }
            InterfaceC0101l interfaceC0101lMetrica = metrica(i);
            if (!isPro(i2, i, obj)) {
                if (ads(object)) {
                    AbstractC17187l abstractC17187lZza = interfaceC0101lMetrica.zza();
                    interfaceC0101lMetrica.yandex(abstractC17187lZza, object);
                    unsafe.putObject(obj, j, abstractC17187lZza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                AbstractC1851l.mopub(iArr[i + 2] & 1048575, obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!ads(object2)) {
                AbstractC17187l abstractC17187lZza2 = interfaceC0101lMetrica.zza();
                interfaceC0101lMetrica.yandex(abstractC17187lZza2, object2);
                unsafe.putObject(obj, j, abstractC17187lZza2);
                object2 = abstractC17187lZza2;
            }
            interfaceC0101lMetrica.yandex(object2, object);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.InterfaceC0101l
    public final void yandex(Object obj, Object obj2) {
        Object obj3;
        if (!ads(obj)) {
            C8339l.metrica("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.yandex;
            if (i >= iArr.length) {
                AbstractC3622l.loadAd(obj, obj2);
                return;
            }
            int iStartapp = startapp(i);
            int i2 = iStartapp & 1048575;
            int iAdcel = adcel(iStartapp);
            int i3 = iArr[i];
            long j = i2;
            switch (iAdcel) {
                case 0:
                    if (admob(i, obj2)) {
                        AbstractC6809l abstractC6809l = AbstractC1851l.crashlytics;
                        obj3 = obj;
                        abstractC6809l.smaato(obj3, j, abstractC6809l.isPro(j, obj2));
                        subs(i, obj3);
                    } else {
                        obj3 = obj;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 1:
                    if (admob(i, obj2)) {
                        AbstractC6809l abstractC6809l2 = AbstractC1851l.crashlytics;
                        abstractC6809l2.subs(obj, j, abstractC6809l2.billing(j, obj2));
                        subs(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                    break;
                case 2:
                    if (admob(i, obj2)) {
                        AbstractC1851l.subs(j, AbstractC1851l.admob(j, obj2), obj);
                        subs(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                    break;
                case 3:
                    if (admob(i, obj2)) {
                        AbstractC1851l.subs(j, AbstractC1851l.admob(j, obj2), obj);
                        subs(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                    break;
                case 4:
                    if (admob(i, obj2)) {
                        AbstractC1851l.mopub(j, obj, AbstractC1851l.billing(j, obj2));
                        subs(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                    break;
                case 5:
                    if (admob(i, obj2)) {
                        AbstractC1851l.subs(j, AbstractC1851l.admob(j, obj2), obj);
                        subs(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                    break;
                case 6:
                    if (admob(i, obj2)) {
                        AbstractC1851l.mopub(j, obj, AbstractC1851l.billing(j, obj2));
                        subs(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                    break;
                case 7:
                    if (admob(i, obj2)) {
                        AbstractC6809l abstractC6809l3 = AbstractC1851l.crashlytics;
                        abstractC6809l3.purchase(obj, j, abstractC6809l3.amazon(j, obj2));
                        subs(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                    break;
                case 8:
                    if (admob(i, obj2)) {
                        AbstractC1851l.firebase(j, obj, AbstractC1851l.isPro(j, obj2));
                        subs(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                    break;
                case 9:
                    remoteconfig(i, obj, obj2);
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                    break;
                case 10:
                    if (admob(i, obj2)) {
                        AbstractC1851l.firebase(j, obj, AbstractC1851l.isPro(j, obj2));
                        subs(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                    break;
                case 11:
                    if (admob(i, obj2)) {
                        AbstractC1851l.mopub(j, obj, AbstractC1851l.billing(j, obj2));
                        subs(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                    break;
                case 12:
                    if (admob(i, obj2)) {
                        AbstractC1851l.mopub(j, obj, AbstractC1851l.billing(j, obj2));
                        subs(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                    break;
                case 13:
                    if (admob(i, obj2)) {
                        AbstractC1851l.mopub(j, obj, AbstractC1851l.billing(j, obj2));
                        subs(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                    break;
                case 14:
                    if (admob(i, obj2)) {
                        AbstractC1851l.subs(j, AbstractC1851l.admob(j, obj2), obj);
                        subs(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                    break;
                case 15:
                    if (admob(i, obj2)) {
                        AbstractC1851l.mopub(j, obj, AbstractC1851l.billing(j, obj2));
                        subs(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                    break;
                case 16:
                    if (admob(i, obj2)) {
                        AbstractC1851l.subs(j, AbstractC1851l.admob(j, obj2), obj);
                        subs(i, obj);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    remoteconfig(i, obj, obj2);
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
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
                    InterfaceC12239l interfaceC12239lSubs = (InterfaceC12239l) AbstractC1851l.isPro(j, obj);
                    InterfaceC12239l interfaceC12239l = (InterfaceC12239l) AbstractC1851l.isPro(j, obj2);
                    int size = interfaceC12239lSubs.size();
                    int size2 = interfaceC12239l.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AbstractC13676l) interfaceC12239lSubs).f26706l) {
                            interfaceC12239lSubs = interfaceC12239lSubs.subs(size2 + size);
                        }
                        interfaceC12239lSubs.addAll(interfaceC12239l);
                    }
                    if (size > 0) {
                        interfaceC12239l = interfaceC12239lSubs;
                    }
                    AbstractC1851l.firebase(j, obj, interfaceC12239l);
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    C16222l c16222l = AbstractC3622l.yandex;
                    Object objIsPro = AbstractC1851l.isPro(j, obj);
                    Object objIsPro2 = AbstractC1851l.isPro(j, obj2);
                    if (objIsPro == null) {
                        throw AbstractC12589l.signatures(objIsPro2);
                    }
                    C18725l.loadAd();
                    return;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (isPro(i3, i, obj2)) {
                        AbstractC1851l.firebase(j, obj, AbstractC1851l.isPro(j, obj2));
                        AbstractC1851l.mopub(iArr[i + 2] & 1048575, obj, i3);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                    break;
                case 60:
                    vip(i, obj, obj2);
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                    break;
                case 61:
                case 62:
                case 63:
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (isPro(i3, i, obj2)) {
                        AbstractC1851l.firebase(j, obj, AbstractC1851l.isPro(j, obj2));
                        AbstractC1851l.mopub(iArr[i + 2] & 1048575, obj, i3);
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                    break;
                case 68:
                    vip(i, obj, obj2);
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                    break;
                default:
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                    break;
            }
        }
    }

    @Override // defpackage.InterfaceC0101l
    public final AbstractC17187l zza() {
        return (AbstractC17187l) ((AbstractC17187l) this.crashlytics).subs(4, null);
    }
}
