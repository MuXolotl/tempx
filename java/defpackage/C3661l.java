package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.conscrypt.PSKKeyManager;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: lؕۜٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3661l implements InterfaceC12940l {
    public static final int[] firebase = new int[0];
    public static final Unsafe smaato = AbstractC1823l.smaato();
    public final int admob;
    public final int amazon;
    public final boolean billing;
    public final int crashlytics;
    public final C8565l isPro;
    public final Object[] loadAd;
    public final int[] mopub;
    public final AbstractC12570l purchase;
    public final int subs;
    public final int[] yandex;

    public C3661l(int[] iArr, Object[] objArr, int i, int i2, AbstractC12570l abstractC12570l, int[] iArr2, int i3, int i4, C8565l c8565l, C6096l c6096l) {
        this.yandex = iArr;
        this.loadAd = objArr;
        this.crashlytics = i;
        this.amazon = i2;
        this.billing = abstractC12570l instanceof AbstractC0288l;
        this.mopub = iArr2;
        this.admob = i3;
        this.subs = i4;
        this.isPro = c8565l;
        this.purchase = abstractC12570l;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0262  */
    /* JADX WARN: Code duplicated, block: B:125:0x0265  */
    /* JADX WARN: Code duplicated, block: B:128:0x0284  */
    /* JADX WARN: Code duplicated, block: B:129:0x0287  */
    /* JADX WARN: Code duplicated, block: B:169:0x0354  */
    /* JADX WARN: Code duplicated, block: B:184:0x03ab  */
    public static C3661l advert(C15683l c15683l, C8565l c8565l, C6096l c6096l) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        int i10;
        char cCharAt2;
        int i11;
        char cCharAt3;
        int i12;
        char cCharAt4;
        int i13;
        char cCharAt5;
        int i14;
        char cCharAt6;
        int i15;
        char cCharAt7;
        int i16;
        int i17;
        Object[] objArr;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i18;
        int i19;
        int i20;
        int i21;
        Field fieldIsVip;
        int i22;
        char cCharAt8;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Object obj;
        Field fieldIsVip2;
        int i28;
        Object obj2;
        Field fieldIsVip3;
        int i29;
        char cCharAt9;
        int i30;
        char cCharAt10;
        int i31;
        char cCharAt11;
        int i32;
        char cCharAt12;
        if (!(c15683l instanceof C15683l)) {
            C18725l.loadAd();
            return null;
        }
        String str = c15683l.loadAd;
        int length = str.length();
        int i33 = 55296;
        if (str.charAt(0) >= 55296) {
            int i34 = 1;
            while (true) {
                i = i34 + 1;
                if (str.charAt(i34) < 55296) {
                    break;
                }
                i34 = i;
            }
        } else {
            i = 1;
        }
        int i35 = i + 1;
        int iCharAt2 = str.charAt(i);
        if (iCharAt2 >= 55296) {
            int i36 = iCharAt2 & 8191;
            int i37 = 13;
            while (true) {
                i32 = i35 + 1;
                cCharAt12 = str.charAt(i35);
                if (cCharAt12 < 55296) {
                    break;
                }
                i36 |= (cCharAt12 & 8191) << i37;
                i37 += 13;
                i35 = i32;
            }
            iCharAt2 = i36 | (cCharAt12 << i37);
            i35 = i32;
        }
        if (iCharAt2 == 0) {
            i3 = 0;
            i6 = 0;
            iCharAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = firebase;
            i4 = 0;
        } else {
            int i38 = i35 + 1;
            int iCharAt3 = str.charAt(i35);
            if (iCharAt3 >= 55296) {
                int i39 = iCharAt3 & 8191;
                int i40 = 13;
                while (true) {
                    i15 = i38 + 1;
                    cCharAt7 = str.charAt(i38);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt7 & 8191) << i40;
                    i40 += 13;
                    i38 = i15;
                }
                iCharAt3 = i39 | (cCharAt7 << i40);
                i38 = i15;
            }
            int i41 = i38 + 1;
            int iCharAt4 = str.charAt(i38);
            if (iCharAt4 >= 55296) {
                int i42 = iCharAt4 & 8191;
                int i43 = 13;
                while (true) {
                    i14 = i41 + 1;
                    cCharAt6 = str.charAt(i41);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt6 & 8191) << i43;
                    i43 += 13;
                    i41 = i14;
                }
                iCharAt4 = i42 | (cCharAt6 << i43);
                i41 = i14;
            }
            int i44 = i41 + 1;
            int iCharAt5 = str.charAt(i41);
            if (iCharAt5 >= 55296) {
                int i45 = iCharAt5 & 8191;
                int i46 = 13;
                while (true) {
                    i13 = i44 + 1;
                    cCharAt5 = str.charAt(i44);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt5 & 8191) << i46;
                    i46 += 13;
                    i44 = i13;
                }
                iCharAt5 = i45 | (cCharAt5 << i46);
                i44 = i13;
            }
            int i47 = i44 + 1;
            int iCharAt6 = str.charAt(i44);
            if (iCharAt6 >= 55296) {
                int i48 = iCharAt6 & 8191;
                int i49 = 13;
                while (true) {
                    i12 = i47 + 1;
                    cCharAt4 = str.charAt(i47);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt4 & 8191) << i49;
                    i49 += 13;
                    i47 = i12;
                }
                iCharAt6 = i48 | (cCharAt4 << i49);
                i47 = i12;
            }
            int i50 = i47 + 1;
            iCharAt = str.charAt(i47);
            if (iCharAt >= 55296) {
                int i51 = iCharAt & 8191;
                int i52 = 13;
                while (true) {
                    i11 = i50 + 1;
                    cCharAt3 = str.charAt(i50);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt3 & 8191) << i52;
                    i52 += 13;
                    i50 = i11;
                }
                iCharAt = i51 | (cCharAt3 << i52);
                i50 = i11;
            }
            int i53 = i50 + 1;
            int iCharAt7 = str.charAt(i50);
            if (iCharAt7 >= 55296) {
                int i54 = iCharAt7 & 8191;
                int i55 = 13;
                while (true) {
                    i10 = i53 + 1;
                    cCharAt2 = str.charAt(i53);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt2 & 8191) << i55;
                    i55 += 13;
                    i53 = i10;
                }
                iCharAt7 = i54 | (cCharAt2 << i55);
                i53 = i10;
            }
            int i56 = i53 + 1;
            if (str.charAt(i53) >= 55296) {
                while (true) {
                    i9 = i56 + 1;
                    if (str.charAt(i56) < 55296) {
                        break;
                    }
                    i56 = i9;
                }
                i56 = i9;
            }
            int i57 = i56 + 1;
            int iCharAt8 = str.charAt(i56);
            if (iCharAt8 >= 55296) {
                int i58 = iCharAt8 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    cCharAt = str.charAt(i57);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i58 |= (cCharAt & 8191) << i59;
                    i59 += 13;
                    i57 = i8;
                }
                iCharAt8 = i58 | (cCharAt << i59);
                i57 = i8;
            }
            int i60 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt8 + iCharAt7 + iCharAt3];
            int i61 = iCharAt7;
            i2 = iCharAt5;
            i3 = i61;
            iArr = iArr2;
            i4 = iCharAt3;
            i35 = i57;
            i5 = iCharAt6;
            i6 = i60;
            i7 = iCharAt8;
        }
        Unsafe unsafe = smaato;
        Object[] objArr2 = c15683l.crashlytics;
        Class<?> cls = c15683l.yandex.getClass();
        int i62 = i7 + i3;
        int i63 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[i63];
        int i64 = i62;
        int i65 = i7;
        int i66 = 0;
        int i67 = 0;
        while (i35 < length) {
            int i68 = i35 + 1;
            int iCharAt9 = str.charAt(i35);
            if (iCharAt9 >= i33) {
                int i69 = iCharAt9 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i31 = i70 + 1;
                    cCharAt11 = str.charAt(i70);
                    i16 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt11 & 8191) << i71;
                    i71 += 13;
                    i70 = i31;
                    length = i16;
                }
                iCharAt9 = i69 | (cCharAt11 << i71);
                i17 = i31;
            } else {
                i16 = length;
                i17 = i68;
            }
            int i72 = i17 + 1;
            int iCharAt10 = str.charAt(i17);
            Object[] objArr4 = objArr2;
            char c = 55296;
            if (iCharAt10 >= 55296) {
                int i73 = iCharAt10 & 8191;
                int i74 = 13;
                while (true) {
                    i30 = i72 + 1;
                    cCharAt10 = str.charAt(i72);
                    if (cCharAt10 < c) {
                        break;
                    }
                    i73 |= (cCharAt10 & 8191) << i74;
                    i74 += 13;
                    i72 = i30;
                    c = 55296;
                }
                iCharAt10 = i73 | (cCharAt10 << i74);
                i72 = i30;
            }
            if ((iCharAt10 & 1024) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            int i75 = iCharAt10 & 255;
            int i76 = iCharAt9;
            int i77 = iCharAt10 & 2048;
            if (i75 >= 51) {
                int i78 = i72 + 1;
                int iCharAt11 = str.charAt(i72);
                char c2 = 55296;
                if (iCharAt11 >= 55296) {
                    int i79 = iCharAt11 & 8191;
                    int i80 = i78;
                    int i81 = 13;
                    while (true) {
                        i29 = i80 + 1;
                        cCharAt9 = str.charAt(i80);
                        if (cCharAt9 < c2) {
                            break;
                        }
                        i79 |= (cCharAt9 & 8191) << i81;
                        i81 += 13;
                        i80 = i29;
                        c2 = 55296;
                    }
                    iCharAt11 = i79 | (cCharAt9 << i81);
                    i24 = i29;
                } else {
                    i24 = i78;
                }
                int i82 = i24;
                int i83 = i75 - 51;
                int i84 = iCharAt11;
                if (i83 == 9 || i83 == 17) {
                    i25 = i6 + 1;
                    int i85 = i67 / 3;
                    objArr3[i85 + i85 + 1] = objArr4[i6];
                } else {
                    if (i83 != 12) {
                        i26 = i77;
                    } else if (c15683l.yandex() == 1 || i77 != 0) {
                        i25 = i6 + 1;
                        int i86 = i67 / 3;
                        objArr3[i86 + i86 + 1] = objArr4[i6];
                    } else {
                        i26 = 0;
                    }
                    i27 = i84 + i84;
                    int i87 = i26;
                    obj = objArr4[i27];
                    if (obj instanceof Field) {
                        fieldIsVip2 = (Field) obj;
                    } else {
                        fieldIsVip2 = isVip(cls, (String) obj);
                        objArr4[i27] = fieldIsVip2;
                        iArr[i64] = i67;
                        i64++;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldIsVip2);
                    i28 = i27 + 1;
                    obj2 = objArr4[i28];
                    if (obj2 instanceof Field) {
                        fieldIsVip3 = (Field) obj2;
                    } else {
                        fieldIsVip3 = isVip(cls, (String) obj2);
                        objArr4[i28] = fieldIsVip3;
                    }
                    i72 = i82;
                    i18 = iObjectFieldOffset3;
                    i21 = 0;
                    i19 = 55296;
                    objArr = objArr3;
                    i4 = i4;
                    cls = cls;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldIsVip3);
                    i20 = i87;
                }
                i6 = i25;
                i26 = i77;
                i27 = i84 + i84;
                int i88 = i26;
                obj = objArr4[i27];
                if (obj instanceof Field) {
                    fieldIsVip2 = (Field) obj;
                } else {
                    fieldIsVip2 = isVip(cls, (String) obj);
                    objArr4[i27] = fieldIsVip2;
                    iArr[i64] = i67;
                    i64++;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldIsVip2);
                i28 = i27 + 1;
                obj2 = objArr4[i28];
                if (obj2 instanceof Field) {
                    fieldIsVip3 = (Field) obj2;
                } else {
                    fieldIsVip3 = isVip(cls, (String) obj2);
                    objArr4[i28] = fieldIsVip3;
                }
                i72 = i82;
                i18 = iObjectFieldOffset4;
                i21 = 0;
                i19 = 55296;
                objArr = objArr3;
                i4 = i4;
                cls = cls;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldIsVip3);
                i20 = i88;
            } else {
                int i89 = i6 + 1;
                Field fieldIsVip4 = isVip(cls, (String) objArr4[i6]);
                objArr = objArr3;
                if (i75 == 9 || i75 == 17) {
                    int i90 = i67 / 3;
                    objArr[i90 + i90 + 1] = fieldIsVip4.getType();
                } else {
                    if (i75 != 27) {
                        if (i75 == 49) {
                            i6 += 2;
                            i23 = 1;
                        } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                            i4 = i4;
                            if (c15683l.yandex() == 1 || i77 != 0) {
                                i6 += 2;
                                int i91 = i67 / 3;
                                objArr[i91 + i91 + 1] = objArr4[i89];
                                cls = cls;
                            } else {
                                cls = cls;
                                i6 = i89;
                                i77 = 0;
                            }
                        } else if (i75 == 50) {
                            int i92 = i6 + 2;
                            i65++;
                            iArr[i65] = i67;
                            int i93 = i67 / 3;
                            int i94 = i93 + i93;
                            objArr[i94] = objArr4[i89];
                            if (i77 != 0) {
                                i6 += 3;
                                objArr[i94 + 1] = objArr4[i92];
                            } else {
                                i6 = i92;
                                i77 = 0;
                            }
                            i4 = i4;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldIsVip4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt10 & 4096) != 0 || i75 > 17) {
                            i18 = iObjectFieldOffset;
                            i19 = 55296;
                            i20 = i77;
                            i21 = 0;
                        } else {
                            int i95 = i72 + 1;
                            int iCharAt12 = str.charAt(i72);
                            if (iCharAt12 >= 55296) {
                                int i96 = iCharAt12 & 8191;
                                int i97 = 13;
                                while (true) {
                                    i22 = i95 + 1;
                                    cCharAt8 = str.charAt(i95);
                                    if (cCharAt8 < 55296) {
                                        break;
                                    }
                                    i96 |= (cCharAt8 & 8191) << i97;
                                    i97 += 13;
                                    i95 = i22;
                                }
                                iCharAt12 = i96 | (cCharAt8 << i97);
                                i95 = i22;
                            }
                            int i98 = (iCharAt12 / 32) + i4 + i4;
                            Object obj3 = objArr4[i98];
                            if (obj3 instanceof Field) {
                                fieldIsVip = (Field) obj3;
                            } else {
                                fieldIsVip = isVip(cls, (String) obj3);
                                objArr4[i98] = fieldIsVip;
                            }
                            i18 = iObjectFieldOffset;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldIsVip);
                            i21 = iCharAt12 % 32;
                            i72 = i95;
                            i20 = i77;
                            i19 = 55296;
                        }
                    } else {
                        i23 = 1;
                        i6 += 2;
                    }
                    int i99 = i67 / 3;
                    objArr[i99 + i99 + i23] = objArr4[i89];
                    cls = cls;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldIsVip4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt10 & 4096) != 0) {
                        i18 = iObjectFieldOffset;
                        i19 = 55296;
                        i20 = i77;
                        i21 = 0;
                    } else {
                        i18 = iObjectFieldOffset;
                        i19 = 55296;
                        i20 = i77;
                        i21 = 0;
                    }
                }
                cls = cls;
                i6 = i89;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldIsVip4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt10 & 4096) != 0) {
                    i18 = iObjectFieldOffset;
                    i19 = 55296;
                    i20 = i77;
                    i21 = 0;
                } else {
                    i18 = iObjectFieldOffset;
                    i19 = 55296;
                    i20 = i77;
                    i21 = 0;
                }
            }
            int i100 = i67 + 1;
            iArr3[i67] = i76;
            int i101 = i67 + 2;
            iArr3[i100] = ((iCharAt10 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? 536870912 : 0) | ((iCharAt10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 268435456 : 0) | (i20 != 0 ? RecyclerView.UNDEFINED_DURATION : 0) | (i75 << 20) | i18;
            i67 += 3;
            iArr3[i101] = (i21 << 20) | iObjectFieldOffset2;
            i35 = i72;
            cls = cls;
            objArr2 = objArr4;
            i33 = i19;
            length = i16;
            objArr3 = objArr;
            i4 = i4;
            str = str;
        }
        return new C3661l(iArr3, objArr3, i2, i5, c15683l.yandex, iArr, i7, i62, c8565l, c6096l);
    }

    public static int firebase(int i) {
        return (i >>> 20) & 255;
    }

    public static Field isVip(Class cls, String str) {
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

    public static long metrica(long j, Object obj) {
        return ((Long) AbstractC1823l.subs(j, obj)).longValue();
    }

    public static final int pro(byte[] bArr, int i, int i2, EnumC2564l enumC2564l, Class cls, C16292l c16292l) throws C9893l {
        EnumC2564l enumC2564l2 = EnumC2564l.f5569l;
        switch (enumC2564l.ordinal()) {
            case 0:
                int i3 = i + 8;
                c16292l.crashlytics = Double.valueOf(Double.longBitsToDouble(AbstractC18377l.subs(i, bArr)));
                return i3;
            case 1:
                int i4 = i + 4;
                c16292l.crashlytics = Float.valueOf(Float.intBitsToFloat(AbstractC18377l.admob(i, bArr)));
                return i4;
            case 2:
            case 3:
                int iMopub = AbstractC18377l.mopub(bArr, i, c16292l);
                c16292l.crashlytics = Long.valueOf(c16292l.loadAd);
                return iMopub;
            case 4:
            case 12:
            case 13:
                int iPurchase = AbstractC18377l.purchase(bArr, i, c16292l);
                c16292l.crashlytics = Integer.valueOf(c16292l.yandex);
                return iPurchase;
            case 5:
            case 15:
                int i5 = i + 8;
                c16292l.crashlytics = Long.valueOf(AbstractC18377l.subs(i, bArr));
                return i5;
            case 6:
            case 14:
                int i6 = i + 4;
                c16292l.crashlytics = Integer.valueOf(AbstractC18377l.admob(i, bArr));
                return i6;
            case 7:
                int iMopub2 = AbstractC18377l.mopub(bArr, i, c16292l);
                c16292l.crashlytics = Boolean.valueOf(c16292l.loadAd != 0);
                return iMopub2;
            case 8:
                return AbstractC18377l.isPro(bArr, i, c16292l);
            case 9:
            default:
                C18073l.license("unsupported field type.");
                return 0;
            case 10:
                InterfaceC12940l interfaceC12940lYandex = C8307l.crashlytics.yandex(cls);
                AbstractC0288l abstractC0288lZza = interfaceC12940lYandex.zza();
                int iSmaato = AbstractC18377l.smaato(abstractC0288lZza, interfaceC12940lYandex, bArr, i, i2, c16292l);
                interfaceC12940lYandex.loadAd(abstractC0288lZza);
                c16292l.crashlytics = abstractC0288lZza;
                return iSmaato;
            case 11:
                return AbstractC18377l.firebase(bArr, i, c16292l);
            case 16:
                int iPurchase2 = AbstractC18377l.purchase(bArr, i, c16292l);
                c16292l.crashlytics = Integer.valueOf(AbstractC9284l.m2631strictfp(c16292l.yandex));
                return iPurchase2;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                int iMopub3 = AbstractC18377l.mopub(bArr, i, c16292l);
                c16292l.crashlytics = Long.valueOf(AbstractC9284l.m2632volatile(c16292l.loadAd));
                return iMopub3;
        }
    }

    public static void remoteconfig(Object obj) {
        if (smaato(obj)) {
            return;
        }
        C8339l.metrica("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    public static boolean smaato(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0288l) {
            return ((AbstractC0288l) obj).mopub();
        }
        return true;
    }

    public static int vip(long j, Object obj) {
        return ((Integer) AbstractC1823l.subs(j, obj)).intValue();
    }

    public final void Signature(int i, int i2, Object obj) {
        AbstractC1823l.billing(this.yandex[i2 + 2] & 1048575, obj, i);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 36121. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int ad(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, defpackage.C16292l r40) {
        /*
            Method dump skipped, instruction units count: 3612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3661l.ad(java.lang.Object, byte[], int, int, int, lٍٖٕ):int");
    }

    public final boolean adcel(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return ads(i, obj);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:207:0x07c2 A[LOOP:3: B:206:0x07c0->B:207:0x07c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:209:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:211:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:217:0x07ef A[LOOP:1: B:216:0x07ed->B:217:0x07ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:219:0x0800  */
    /* JADX WARN: Code duplicated, block: B:228:0x07ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x07bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.InterfaceC12940l
    public final void admob(Object obj, C12676l c12676l, C11337l c11337l) throws Throwable {
        Object obj2;
        Object objM1407volatile;
        Object objM1407volatile2;
        C3661l c3661l;
        C8565l c8565l;
        Object obj3;
        C3661l c3661l2;
        Object objSignatures;
        Object obj4;
        C3661l c3661l3 = this;
        AbstractC9284l abstractC9284l = (AbstractC9284l) c12676l.purchase;
        int[] iArr = c3661l3.mopub;
        int i = c3661l3.subs;
        int i2 = c3661l3.admob;
        c11337l.getClass();
        remoteconfig(obj);
        C8565l c8565l2 = c3661l3.isPro;
        Object objSignatures2 = null;
        while (true) {
            try {
                int iM3460l = c12676l.m3460l();
                int iLicense = (iM3460l < c3661l3.crashlytics || iM3460l > c3661l3.amazon) ? -1 : c3661l3.license(iM3460l, 0);
                if (iLicense >= 0) {
                    int iIsPro = c3661l3.isPro(iLicense);
                    try {
                        try {
                            switch (firebase(iIsPro)) {
                                case 0:
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    C3661l c3661l4 = c3661l3;
                                    int i3 = iIsPro & 1048575;
                                    try {
                                        c12676l.m3459l(1);
                                        c3661l = c3661l4;
                                        AbstractC1823l.crashlytics.smaato(obj, i3, abstractC9284l.mo1078for());
                                        c3661l.subscription(iLicense, obj);
                                        c3661l3 = c3661l;
                                        c8565l2 = c8565l;
                                        objSignatures2 = obj2;
                                    } catch (Throwable th) {
                                        th = th;
                                        c8565l2 = c8565l;
                                        objSignatures2 = obj2;
                                        objM1407volatile = objSignatures2;
                                        while (i2 < i) {
                                            objM1407volatile = m1407volatile(obj, iArr[i2], objM1407volatile, c8565l2, obj);
                                            i2++;
                                        }
                                        if (objM1407volatile != null) {
                                            c8565l2.getClass();
                                            ((AbstractC0288l) obj).zzc = (C10096l) objM1407volatile;
                                        }
                                        throw th;
                                    }
                                    break;
                                case 1:
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l2 = c3661l3;
                                    c12676l.m3459l(5);
                                    AbstractC1823l.crashlytics.subs(obj, iIsPro & 1048575, abstractC9284l.mo1092throw());
                                    c3661l2.subscription(iLicense, obj);
                                    c3661l = c3661l2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 2:
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l2 = c3661l3;
                                    c12676l.m3459l(0);
                                    AbstractC1823l.admob(iIsPro & 1048575, abstractC9284l.mo1074else(), obj);
                                    c3661l2.subscription(iLicense, obj);
                                    c3661l = c3661l2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 3:
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l2 = c3661l3;
                                    c12676l.m3459l(0);
                                    AbstractC1823l.admob(iIsPro & 1048575, abstractC9284l.mo1070catch(), obj);
                                    c3661l2.subscription(iLicense, obj);
                                    c3661l = c3661l2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 4:
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l2 = c3661l3;
                                    c12676l.m3459l(0);
                                    AbstractC1823l.billing(iIsPro & 1048575, obj, abstractC9284l.mo1069case());
                                    c3661l2.subscription(iLicense, obj);
                                    c3661l = c3661l2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 5:
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l2 = c3661l3;
                                    c12676l.m3459l(1);
                                    AbstractC1823l.admob(iIsPro & 1048575, abstractC9284l.mo1090switch(), obj);
                                    c3661l2.subscription(iLicense, obj);
                                    c3661l = c3661l2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 6:
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l2 = c3661l3;
                                    c12676l.m3459l(5);
                                    AbstractC1823l.billing(iIsPro & 1048575, obj, abstractC9284l.mo1072continue());
                                    c3661l2.subscription(iLicense, obj);
                                    c3661l = c3661l2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 7:
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l2 = c3661l3;
                                    c12676l.m3459l(0);
                                    AbstractC1823l.crashlytics.purchase(obj, iIsPro & 1048575, abstractC9284l.mo1071class());
                                    c3661l2.subscription(iLicense, obj);
                                    c3661l = c3661l2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 8:
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l2 = c3661l3;
                                    c3661l2.m1402native(iIsPro, c12676l, obj);
                                    c3661l2.subscription(iLicense, obj);
                                    c3661l = c3661l2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 9:
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l2 = c3661l3;
                                    AbstractC12570l abstractC12570l = (AbstractC12570l) c3661l2.m1406throws(iLicense, obj);
                                    InterfaceC12940l interfaceC12940lApplovin = c3661l2.applovin(iLicense);
                                    c12676l.m3459l(2);
                                    c12676l.m3461l(abstractC12570l, interfaceC12940lApplovin, c11337l);
                                    c3661l2.m1403package(iLicense, obj, abstractC12570l);
                                    c3661l = c3661l2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 10:
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l2 = c3661l3;
                                    AbstractC1823l.isPro(iIsPro & 1048575, obj, c12676l.m3462l());
                                    c3661l2.subscription(iLicense, obj);
                                    c3661l = c3661l2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 11:
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l2 = c3661l3;
                                    c12676l.m3459l(0);
                                    AbstractC1823l.billing(iIsPro & 1048575, obj, abstractC9284l.mo1084new());
                                    c3661l2.subscription(iLicense, obj);
                                    c3661l = c3661l2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 12:
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l2 = c3661l3;
                                    c12676l.m3459l(0);
                                    int iMo1079goto = abstractC9284l.mo1079goto();
                                    C1037l c1037lInmobi = c3661l2.inmobi(iLicense);
                                    if (c1037lInmobi != null && !c1037lInmobi.yandex(iMo1079goto)) {
                                        C8565l c8565l3 = AbstractC9626l.yandex;
                                        if (obj2 == null) {
                                            c8565l.getClass();
                                            objSignatures = C8565l.signatures(obj);
                                        } else {
                                            objSignatures = obj2;
                                        }
                                        c8565l.getClass();
                                        ((C10096l) objSignatures).amazon(iM3460l << 3, Long.valueOf(iMo1079goto));
                                        c3661l3 = c3661l2;
                                        objSignatures2 = objSignatures;
                                        c8565l2 = c8565l;
                                    }
                                    AbstractC1823l.billing(iIsPro & 1048575, obj, iMo1079goto);
                                    c3661l2.subscription(iLicense, obj);
                                    c3661l = c3661l2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 13:
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l2 = c3661l3;
                                    c12676l.m3459l(5);
                                    AbstractC1823l.billing(iIsPro & 1048575, obj, abstractC9284l.mo1089super());
                                    c3661l2.subscription(iLicense, obj);
                                    c3661l = c3661l2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 14:
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l2 = c3661l3;
                                    c12676l.m3459l(1);
                                    AbstractC1823l.admob(iIsPro & 1048575, abstractC9284l.mo1080import(), obj);
                                    c3661l2.subscription(iLicense, obj);
                                    c3661l = c3661l2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 15:
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l2 = c3661l3;
                                    c12676l.m3459l(0);
                                    AbstractC1823l.billing(iIsPro & 1048575, obj, abstractC9284l.mo1067abstract());
                                    c3661l2.subscription(iLicense, obj);
                                    c3661l = c3661l2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 16:
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l2 = c3661l3;
                                    c12676l.m3459l(0);
                                    AbstractC1823l.admob(iIsPro & 1048575, abstractC9284l.mo1081instanceof(), obj);
                                    c3661l2.subscription(iLicense, obj);
                                    c3661l = c3661l2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l2 = c3661l3;
                                    obj3 = obj;
                                    try {
                                        AbstractC12570l abstractC12570l2 = (AbstractC12570l) c3661l2.m1406throws(iLicense, obj3);
                                        InterfaceC12940l interfaceC12940lApplovin2 = c3661l2.applovin(iLicense);
                                        c12676l.m3459l(3);
                                        c12676l.m3467l(abstractC12570l2, interfaceC12940lApplovin2, c11337l);
                                        c3661l2.m1403package(iLicense, obj3, abstractC12570l2);
                                        c3661l = c3661l2;
                                        c3661l3 = c3661l;
                                        c8565l2 = c8565l;
                                        objSignatures2 = obj2;
                                    } catch (C13529l unused) {
                                        c3661l = c3661l2;
                                        objSignatures2 = obj2;
                                        if (objSignatures2 == null) {
                                            try {
                                                c8565l.getClass();
                                                objSignatures2 = C8565l.signatures(obj3);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                c8565l2 = c8565l;
                                                objM1407volatile = objSignatures2;
                                                while (i2 < i) {
                                                    objM1407volatile = m1407volatile(obj, iArr[i2], objM1407volatile, c8565l2, obj);
                                                    i2++;
                                                }
                                                if (objM1407volatile != null) {
                                                    c8565l2.getClass();
                                                    ((AbstractC0288l) obj).zzc = (C10096l) objM1407volatile;
                                                }
                                                throw th;
                                            }
                                        }
                                        c8565l.getClass();
                                        if (!C8565l.premium(0, c12676l, objSignatures2)) {
                                            objM1407volatile2 = objSignatures2;
                                            while (i2 < i) {
                                                objM1407volatile2 = c3661l.m1407volatile(obj3, iArr[i2], objM1407volatile2, c8565l, obj);
                                                i2++;
                                                c3661l = this;
                                                obj3 = obj;
                                            }
                                            c8565l2 = c8565l;
                                            if (objM1407volatile2 != null) {
                                                c8565l2.getClass();
                                                ((AbstractC0288l) obj).zzc = (C10096l) objM1407volatile2;
                                            }
                                        }
                                        c3661l3 = this;
                                        c8565l2 = c8565l;
                                    }
                                    break;
                                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c12676l.m3479l(C2582l.license(iIsPro & 1048575, obj));
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c12676l.m3478l(C2582l.license(iIsPro & 1048575, obj));
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 20:
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c12676l.m3458l(C2582l.license(iIsPro & 1048575, obj));
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 21:
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c12676l.m3464l(C2582l.license(iIsPro & 1048575, obj));
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 22:
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c12676l.m3477l(C2582l.license(iIsPro & 1048575, obj));
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 23:
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c12676l.m3470l(C2582l.license(iIsPro & 1048575, obj));
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c12676l.m3471l(C2582l.license(iIsPro & 1048575, obj));
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c12676l.m3454l(C2582l.license(iIsPro & 1048575, obj));
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    if ((536870912 & iIsPro) != 0) {
                                        c12676l.m3456l(C2582l.license(iIsPro & 1048575, obj), true);
                                    } else {
                                        c12676l.m3456l(C2582l.license(iIsPro & 1048575, obj), false);
                                    }
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c12676l.m3474l(C2582l.license(iIsPro & 1048575, obj), c3661l.applovin(iLicense), c11337l);
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c12676l.m3455l(C2582l.license(iIsPro & 1048575, obj));
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    obj3 = obj;
                                    try {
                                        try {
                                            c12676l.m3469l(C2582l.license(iIsPro & 1048575, obj3));
                                            c3661l3 = c3661l;
                                            c8565l2 = c8565l;
                                            objSignatures2 = obj2;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            c8565l2 = c8565l;
                                            objSignatures2 = obj2;
                                            objM1407volatile = objSignatures2;
                                            while (i2 < i) {
                                                objM1407volatile = m1407volatile(obj, iArr[i2], objM1407volatile, c8565l2, obj);
                                                i2++;
                                            }
                                            if (objM1407volatile != null) {
                                                c8565l2.getClass();
                                                ((AbstractC0288l) obj).zzc = (C10096l) objM1407volatile;
                                            }
                                            throw th;
                                        }
                                    } catch (C13529l unused2) {
                                        objSignatures2 = obj2;
                                        if (objSignatures2 == null) {
                                            c8565l.getClass();
                                            objSignatures2 = C8565l.signatures(obj3);
                                        }
                                        c8565l.getClass();
                                        if (!C8565l.premium(0, c12676l, objSignatures2)) {
                                            objM1407volatile2 = objSignatures2;
                                            while (i2 < i) {
                                                objM1407volatile2 = c3661l.m1407volatile(obj3, iArr[i2], objM1407volatile2, c8565l, obj);
                                                i2++;
                                                c3661l = this;
                                                obj3 = obj;
                                            }
                                            c8565l2 = c8565l;
                                            if (objM1407volatile2 != null) {
                                                c8565l2.getClass();
                                                ((AbstractC0288l) obj).zzc = (C10096l) objM1407volatile2;
                                            }
                                        }
                                        c3661l3 = this;
                                        c8565l2 = c8565l;
                                        break;
                                    }
                                    break;
                                case 30:
                                    c3661l = c3661l3;
                                    c8565l = c8565l2;
                                    obj3 = obj;
                                    Object obj5 = objSignatures2;
                                    try {
                                        InterfaceC9971l interfaceC9971lLicense = C2582l.license(iIsPro & 1048575, obj3);
                                        c12676l.m3468l(interfaceC9971lLicense);
                                        try {
                                            objSignatures2 = AbstractC9626l.crashlytics(obj3, iM3460l, interfaceC9971lLicense, c3661l.inmobi(iLicense), obj5, c8565l);
                                            c8565l = c8565l;
                                            c3661l3 = c3661l;
                                            c8565l2 = c8565l;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            obj2 = obj5;
                                            c8565l = c8565l;
                                            c8565l2 = c8565l;
                                            objSignatures2 = obj2;
                                            objM1407volatile = objSignatures2;
                                            while (i2 < i) {
                                                objM1407volatile = m1407volatile(obj, iArr[i2], objM1407volatile, c8565l2, obj);
                                                i2++;
                                            }
                                            if (objM1407volatile != null) {
                                                c8565l2.getClass();
                                                ((AbstractC0288l) obj).zzc = (C10096l) objM1407volatile;
                                            }
                                            throw th;
                                        }
                                    } catch (C13529l unused3) {
                                        obj2 = obj5;
                                        objSignatures2 = obj2;
                                        if (objSignatures2 == null) {
                                            c8565l.getClass();
                                            objSignatures2 = C8565l.signatures(obj3);
                                        }
                                        c8565l.getClass();
                                        if (!C8565l.premium(0, c12676l, objSignatures2)) {
                                            objM1407volatile2 = objSignatures2;
                                            while (i2 < i) {
                                                objM1407volatile2 = c3661l.m1407volatile(obj3, iArr[i2], objM1407volatile2, c8565l, obj);
                                                i2++;
                                                c3661l = this;
                                                obj3 = obj;
                                            }
                                            c8565l2 = c8565l;
                                            if (objM1407volatile2 != null) {
                                                c8565l2.getClass();
                                                ((AbstractC0288l) obj).zzc = (C10096l) objM1407volatile2;
                                            }
                                        }
                                        c3661l3 = this;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        obj2 = obj5;
                                    }
                                    break;
                                case 31:
                                    c3661l = c3661l3;
                                    c12676l.m3463l(C2582l.license(iIsPro & 1048575, obj));
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 32:
                                    c3661l = c3661l3;
                                    c12676l.m3472l(C2582l.license(iIsPro & 1048575, obj));
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                    c3661l = c3661l3;
                                    c12676l.m3473l(C2582l.license(iIsPro & 1048575, obj));
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                                    c3661l = c3661l3;
                                    c12676l.m3465l(C2582l.license(iIsPro & 1048575, obj));
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                                    c3661l = c3661l3;
                                    c12676l.m3479l(C2582l.license(iIsPro & 1048575, obj));
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case Maneuver.TYPE_STRAIGHT /* 36 */:
                                    c3661l = c3661l3;
                                    c12676l.m3478l(C2582l.license(iIsPro & 1048575, obj));
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                    c3661l = c3661l3;
                                    c12676l.m3458l(C2582l.license(iIsPro & 1048575, obj));
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                    c3661l = c3661l3;
                                    c12676l.m3464l(C2582l.license(iIsPro & 1048575, obj));
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                    c3661l = c3661l3;
                                    c12676l.m3477l(C2582l.license(iIsPro & 1048575, obj));
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                    c3661l = c3661l3;
                                    c12676l.m3470l(C2582l.license(iIsPro & 1048575, obj));
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                    c3661l = c3661l3;
                                    c12676l.m3471l(C2582l.license(iIsPro & 1048575, obj));
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                    c3661l = c3661l3;
                                    c12676l.m3454l(C2582l.license(iIsPro & 1048575, obj));
                                    obj2 = objSignatures2;
                                    c8565l = c8565l2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                                    c3661l = c3661l3;
                                    obj3 = obj;
                                    try {
                                        c12676l.m3469l(C2582l.license(iIsPro & 1048575, obj3));
                                        obj2 = objSignatures2;
                                        c8565l = c8565l2;
                                        c3661l3 = c3661l;
                                        c8565l2 = c8565l;
                                        objSignatures2 = obj2;
                                    } catch (C13529l unused4) {
                                        obj2 = objSignatures2;
                                        c8565l = c8565l2;
                                        objSignatures2 = obj2;
                                        if (objSignatures2 == null) {
                                            c8565l.getClass();
                                            objSignatures2 = C8565l.signatures(obj3);
                                        }
                                        c8565l.getClass();
                                        if (!C8565l.premium(0, c12676l, objSignatures2)) {
                                            objM1407volatile2 = objSignatures2;
                                            while (i2 < i) {
                                                objM1407volatile2 = c3661l.m1407volatile(obj3, iArr[i2], objM1407volatile2, c8565l, obj);
                                                i2++;
                                                c3661l = this;
                                                obj3 = obj;
                                            }
                                            c8565l2 = c8565l;
                                            if (objM1407volatile2 != null) {
                                                c8565l2.getClass();
                                                ((AbstractC0288l) obj).zzc = (C10096l) objM1407volatile2;
                                            }
                                        }
                                        c3661l3 = this;
                                        c8565l2 = c8565l;
                                    }
                                    break;
                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                    c8565l = c8565l2;
                                    try {
                                        InterfaceC9971l interfaceC9971lLicense2 = C2582l.license(iIsPro & 1048575, obj);
                                        c12676l.m3468l(interfaceC9971lLicense2);
                                        C1037l c1037lInmobi2 = c3661l3.inmobi(iLicense);
                                        c3661l = c3661l3;
                                        obj3 = obj;
                                        Object obj6 = objSignatures2;
                                        try {
                                            try {
                                                objSignatures2 = AbstractC9626l.crashlytics(obj3, iM3460l, interfaceC9971lLicense2, c1037lInmobi2, obj6, c8565l);
                                                c8565l2 = c8565l;
                                                c3661l3 = c3661l;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                objSignatures2 = obj6;
                                                c8565l2 = c8565l;
                                                obj2 = objSignatures2;
                                                objSignatures2 = obj2;
                                                objM1407volatile = objSignatures2;
                                                while (i2 < i) {
                                                    objM1407volatile = m1407volatile(obj, iArr[i2], objM1407volatile, c8565l2, obj);
                                                    i2++;
                                                }
                                                if (objM1407volatile != null) {
                                                    c8565l2.getClass();
                                                    ((AbstractC0288l) obj).zzc = (C10096l) objM1407volatile;
                                                }
                                                throw th;
                                            }
                                        } catch (C13529l unused5) {
                                            obj2 = obj6;
                                            c8565l = c8565l;
                                            objSignatures2 = obj2;
                                            if (objSignatures2 == null) {
                                                c8565l.getClass();
                                                objSignatures2 = C8565l.signatures(obj3);
                                            }
                                            c8565l.getClass();
                                            if (!C8565l.premium(0, c12676l, objSignatures2)) {
                                                objM1407volatile2 = objSignatures2;
                                                while (i2 < i) {
                                                    objM1407volatile2 = c3661l.m1407volatile(obj3, iArr[i2], objM1407volatile2, c8565l, obj);
                                                    i2++;
                                                    c3661l = this;
                                                    obj3 = obj;
                                                }
                                                c8565l2 = c8565l;
                                                if (objM1407volatile2 != null) {
                                                    c8565l2.getClass();
                                                    ((AbstractC0288l) obj).zzc = (C10096l) objM1407volatile2;
                                                }
                                            }
                                            c3661l3 = this;
                                            c8565l2 = c8565l;
                                            break;
                                        }
                                    } catch (C13529l unused6) {
                                        c3661l = c3661l3;
                                        obj3 = obj;
                                        obj2 = objSignatures2;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        c8565l2 = c8565l;
                                    }
                                    break;
                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                    c8565l = c8565l2;
                                    obj4 = obj;
                                    c12676l.m3463l(C2582l.license(iIsPro & 1048575, obj4));
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                    c8565l = c8565l2;
                                    obj4 = obj;
                                    c12676l.m3472l(C2582l.license(iIsPro & 1048575, obj4));
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                    c8565l = c8565l2;
                                    obj4 = obj;
                                    c12676l.m3473l(C2582l.license(iIsPro & 1048575, obj4));
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 48:
                                    c8565l = c8565l2;
                                    obj4 = obj;
                                    c12676l.m3465l(C2582l.license(iIsPro & 1048575, obj4));
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                    c8565l = c8565l2;
                                    obj4 = obj;
                                    c12676l.m3475l(C2582l.license(iIsPro & 1048575, obj4), c3661l3.applovin(iLicense), c11337l);
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                    c8565l = c8565l2;
                                    obj4 = obj;
                                    Object objAppmetrica = c3661l3.appmetrica(iLicense);
                                    long jIsPro = c3661l3.isPro(iLicense) & 1048575;
                                    Object objSubs = AbstractC1823l.subs(jIsPro, obj4);
                                    if (objSubs == null) {
                                        objSubs = C12643l.f24869l.yandex();
                                        AbstractC1823l.isPro(jIsPro, obj4, objSubs);
                                    } else if (!((C12643l) objSubs).f24870l) {
                                        Object objYandex = C12643l.f24869l.yandex();
                                        C4269l.startapp(objYandex, objSubs);
                                        AbstractC1823l.isPro(jIsPro, obj4, objYandex);
                                        objSubs = objYandex;
                                    }
                                    c12676l.m3466l((C12643l) objSubs, ((C14383l) objAppmetrica).crashlytics(), c11337l);
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 51:
                                    c8565l = c8565l2;
                                    obj4 = obj;
                                    c12676l.m3459l(1);
                                    AbstractC1823l.isPro(iIsPro & 1048575, obj4, Double.valueOf(abstractC9284l.mo1078for()));
                                    c3661l3.Signature(iM3460l, iLicense, obj4);
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 52:
                                    c8565l = c8565l2;
                                    obj4 = obj;
                                    c12676l.m3459l(5);
                                    AbstractC1823l.isPro(iIsPro & 1048575, obj4, Float.valueOf(abstractC9284l.mo1092throw()));
                                    c3661l3.Signature(iM3460l, iLicense, obj4);
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 53:
                                    c8565l = c8565l2;
                                    obj4 = obj;
                                    c12676l.m3459l(0);
                                    AbstractC1823l.isPro(iIsPro & 1048575, obj4, Long.valueOf(abstractC9284l.mo1074else()));
                                    c3661l3.Signature(iM3460l, iLicense, obj4);
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 54:
                                    c8565l = c8565l2;
                                    obj4 = obj;
                                    c12676l.m3459l(0);
                                    AbstractC1823l.isPro(iIsPro & 1048575, obj4, Long.valueOf(abstractC9284l.mo1070catch()));
                                    c3661l3.Signature(iM3460l, iLicense, obj4);
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 55:
                                    c8565l = c8565l2;
                                    obj4 = obj;
                                    c12676l.m3459l(0);
                                    AbstractC1823l.isPro(iIsPro & 1048575, obj4, Integer.valueOf(abstractC9284l.mo1069case()));
                                    c3661l3.Signature(iM3460l, iLicense, obj4);
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 56:
                                    c8565l = c8565l2;
                                    obj4 = obj;
                                    c12676l.m3459l(1);
                                    AbstractC1823l.isPro(iIsPro & 1048575, obj4, Long.valueOf(abstractC9284l.mo1090switch()));
                                    c3661l3.Signature(iM3460l, iLicense, obj4);
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 57:
                                    c8565l = c8565l2;
                                    obj4 = obj;
                                    c12676l.m3459l(5);
                                    AbstractC1823l.isPro(iIsPro & 1048575, obj4, Integer.valueOf(abstractC9284l.mo1072continue()));
                                    c3661l3.Signature(iM3460l, iLicense, obj4);
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 58:
                                    c8565l = c8565l2;
                                    obj4 = obj;
                                    c12676l.m3459l(0);
                                    AbstractC1823l.isPro(iIsPro & 1048575, obj4, Boolean.valueOf(abstractC9284l.mo1071class()));
                                    c3661l3.Signature(iM3460l, iLicense, obj4);
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 59:
                                    c8565l = c8565l2;
                                    obj4 = obj;
                                    c3661l3.m1402native(iIsPro, c12676l, obj4);
                                    c3661l3.Signature(iM3460l, iLicense, obj4);
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 60:
                                    c8565l = c8565l2;
                                    obj4 = obj;
                                    AbstractC12570l abstractC12570l3 = (AbstractC12570l) c3661l3.m1405synchronized(iM3460l, iLicense, obj4);
                                    InterfaceC12940l interfaceC12940lApplovin3 = c3661l3.applovin(iLicense);
                                    c12676l.m3459l(2);
                                    c12676l.m3461l(abstractC12570l3, interfaceC12940lApplovin3, c11337l);
                                    c3661l3.m1404strictfp(iM3460l, obj4, abstractC12570l3, iLicense);
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 61:
                                    c8565l = c8565l2;
                                    obj4 = obj;
                                    AbstractC1823l.isPro(iIsPro & 1048575, obj4, c12676l.m3462l());
                                    c3661l3.Signature(iM3460l, iLicense, obj4);
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 62:
                                    c8565l = c8565l2;
                                    obj4 = obj;
                                    c12676l.m3459l(0);
                                    AbstractC1823l.isPro(iIsPro & 1048575, obj4, Integer.valueOf(abstractC9284l.mo1084new()));
                                    c3661l3.Signature(iM3460l, iLicense, obj4);
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 63:
                                    c8565l = c8565l2;
                                    obj4 = obj;
                                    c12676l.m3459l(0);
                                    int iMo1079goto2 = abstractC9284l.mo1079goto();
                                    C1037l c1037lInmobi3 = c3661l3.inmobi(iLicense);
                                    if (c1037lInmobi3 != null && !c1037lInmobi3.yandex(iMo1079goto2)) {
                                        C8565l c8565l4 = AbstractC9626l.yandex;
                                        if (objSignatures2 == null) {
                                            c8565l.getClass();
                                            objSignatures = C8565l.signatures(obj4);
                                        } else {
                                            objSignatures = objSignatures2;
                                        }
                                        c8565l.getClass();
                                        ((C10096l) objSignatures).amazon(iM3460l << 3, Long.valueOf(iMo1079goto2));
                                        objSignatures2 = objSignatures;
                                        c8565l2 = c8565l;
                                    }
                                    AbstractC1823l.isPro(iIsPro & 1048575, obj4, Integer.valueOf(iMo1079goto2));
                                    c3661l3.Signature(iM3460l, iLicense, obj4);
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                                    c8565l = c8565l2;
                                    obj4 = obj;
                                    c12676l.m3459l(5);
                                    AbstractC1823l.isPro(iIsPro & 1048575, obj4, Integer.valueOf(abstractC9284l.mo1089super()));
                                    c3661l3.Signature(iM3460l, iLicense, obj4);
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 65:
                                    c8565l = c8565l2;
                                    obj4 = obj;
                                    c12676l.m3459l(1);
                                    AbstractC1823l.isPro(iIsPro & 1048575, obj4, Long.valueOf(abstractC9284l.mo1080import()));
                                    c3661l3.Signature(iM3460l, iLicense, obj4);
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 66:
                                    c8565l = c8565l2;
                                    obj4 = obj;
                                    c12676l.m3459l(0);
                                    AbstractC1823l.isPro(iIsPro & 1048575, obj4, Integer.valueOf(abstractC9284l.mo1067abstract()));
                                    c3661l3.Signature(iM3460l, iLicense, obj4);
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 67:
                                    c8565l = c8565l2;
                                    obj4 = obj;
                                    c12676l.m3459l(0);
                                    AbstractC1823l.isPro(iIsPro & 1048575, obj4, Long.valueOf(abstractC9284l.mo1081instanceof()));
                                    c3661l3.Signature(iM3460l, iLicense, obj4);
                                    c3661l = c3661l3;
                                    obj2 = objSignatures2;
                                    c3661l3 = c3661l;
                                    c8565l2 = c8565l;
                                    objSignatures2 = obj2;
                                    break;
                                case 68:
                                    c8565l = c8565l2;
                                    obj4 = obj;
                                    try {
                                        AbstractC12570l abstractC12570l4 = (AbstractC12570l) c3661l3.m1405synchronized(iM3460l, iLicense, obj4);
                                        InterfaceC12940l interfaceC12940lApplovin4 = c3661l3.applovin(iLicense);
                                        c12676l.m3459l(3);
                                        c12676l.m3467l(abstractC12570l4, interfaceC12940lApplovin4, c11337l);
                                        c3661l3.m1404strictfp(iM3460l, obj4, abstractC12570l4, iLicense);
                                        c3661l = c3661l3;
                                        obj2 = objSignatures2;
                                        c3661l3 = c3661l;
                                        c8565l2 = c8565l;
                                        objSignatures2 = obj2;
                                    } catch (C13529l unused7) {
                                        c3661l = c3661l3;
                                        obj2 = objSignatures2;
                                        obj3 = obj4;
                                        objSignatures2 = obj2;
                                        if (objSignatures2 == null) {
                                            c8565l.getClass();
                                            objSignatures2 = C8565l.signatures(obj3);
                                        }
                                        c8565l.getClass();
                                        if (!C8565l.premium(0, c12676l, objSignatures2)) {
                                            objM1407volatile2 = objSignatures2;
                                            while (i2 < i) {
                                                objM1407volatile2 = c3661l.m1407volatile(obj3, iArr[i2], objM1407volatile2, c8565l, obj);
                                                i2++;
                                                c3661l = this;
                                                obj3 = obj;
                                            }
                                            c8565l2 = c8565l;
                                            if (objM1407volatile2 != null) {
                                                c8565l2.getClass();
                                                ((AbstractC0288l) obj).zzc = (C10096l) objM1407volatile2;
                                            }
                                        }
                                        c3661l3 = this;
                                        c8565l2 = c8565l;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        obj2 = objSignatures2;
                                        c8565l2 = c8565l;
                                        objSignatures2 = obj2;
                                        objM1407volatile = objSignatures2;
                                        while (i2 < i) {
                                            objM1407volatile = m1407volatile(obj, iArr[i2], objM1407volatile, c8565l2, obj);
                                            i2++;
                                        }
                                        if (objM1407volatile != null) {
                                            c8565l2.getClass();
                                            ((AbstractC0288l) obj).zzc = (C10096l) objM1407volatile;
                                        }
                                        throw th;
                                    }
                                    break;
                                default:
                                    if (objSignatures2 == null) {
                                        c8565l2.getClass();
                                        objSignatures2 = C8565l.signatures(obj);
                                    }
                                    try {
                                        c8565l2.getClass();
                                        if (C8565l.premium(0, c12676l, objSignatures2)) {
                                            c8565l = c8565l2;
                                            c8565l2 = c8565l;
                                        } else {
                                            objM1407volatile2 = objSignatures2;
                                            while (i2 < i) {
                                                objM1407volatile2 = c3661l3.m1407volatile(obj, iArr[i2], objM1407volatile2, c8565l2, obj);
                                                i2++;
                                                c8565l2 = c8565l2;
                                            }
                                            c8565l = c8565l2;
                                            c8565l2 = c8565l;
                                        }
                                    } catch (C13529l unused8) {
                                        c8565l = c8565l2;
                                        c3661l = c3661l3;
                                        obj3 = obj;
                                        if (objSignatures2 == null) {
                                            c8565l.getClass();
                                            objSignatures2 = C8565l.signatures(obj3);
                                        }
                                        c8565l.getClass();
                                        if (!C8565l.premium(0, c12676l, objSignatures2)) {
                                            objM1407volatile2 = objSignatures2;
                                            while (i2 < i) {
                                                objM1407volatile2 = c3661l.m1407volatile(obj3, iArr[i2], objM1407volatile2, c8565l, obj);
                                                i2++;
                                                c3661l = this;
                                                obj3 = obj;
                                            }
                                            c8565l2 = c8565l;
                                            if (objM1407volatile2 != null) {
                                                c8565l2.getClass();
                                                ((AbstractC0288l) obj).zzc = (C10096l) objM1407volatile2;
                                            }
                                        }
                                        c3661l3 = this;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        c8565l = c8565l2;
                                        c8565l2 = c8565l;
                                        objM1407volatile = objSignatures2;
                                        while (i2 < i) {
                                            objM1407volatile = m1407volatile(obj, iArr[i2], objM1407volatile, c8565l2, obj);
                                            i2++;
                                        }
                                        if (objM1407volatile != null) {
                                            c8565l2.getClass();
                                            ((AbstractC0288l) obj).zzc = (C10096l) objM1407volatile;
                                        }
                                        throw th;
                                    }
                                    break;
                            }
                        } catch (C13529l unused9) {
                            c3661l = c3661l3;
                            obj2 = objSignatures2;
                            c8565l = c8565l2;
                            obj3 = obj;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        obj2 = objSignatures2;
                    }
                } else if (iM3460l == Integer.MAX_VALUE) {
                    objM1407volatile2 = objSignatures2;
                    while (i2 < i) {
                        objM1407volatile2 = c3661l3.m1407volatile(obj, iArr[i2], objM1407volatile2, c8565l2, obj);
                        i2++;
                        c3661l3 = this;
                    }
                } else {
                    if (objSignatures2 == null) {
                        c8565l2.getClass();
                        objSignatures2 = C8565l.signatures(obj);
                    }
                    try {
                        c8565l2.getClass();
                        if (C8565l.premium(0, c12676l, objSignatures2)) {
                            c3661l3 = this;
                        } else {
                            objM1407volatile2 = objSignatures2;
                            while (i2 < i) {
                                objM1407volatile2 = m1407volatile(obj, iArr[i2], objM1407volatile2, c8565l2, obj);
                                i2++;
                            }
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        objM1407volatile = objSignatures2;
                        while (i2 < i) {
                            objM1407volatile = m1407volatile(obj, iArr[i2], objM1407volatile, c8565l2, obj);
                            i2++;
                        }
                        if (objM1407volatile != null) {
                            c8565l2.getClass();
                            ((AbstractC0288l) obj).zzc = (C10096l) objM1407volatile;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th12) {
                th = th12;
            }
        }
        if (objM1407volatile2 != null) {
            c8565l2.getClass();
            ((AbstractC0288l) obj).zzc = (C10096l) objM1407volatile2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f6 A[RETURN] */
    public final boolean ads(int i, Object obj) {
        int i2 = this.yandex[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & AbstractC1823l.purchase(j, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iIsPro = isPro(i);
        long j2 = iIsPro & 1048575;
        switch (firebase(iIsPro)) {
            case 0:
                if (Double.doubleToRawLongBits(AbstractC1823l.crashlytics.isPro(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(AbstractC1823l.crashlytics.billing(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (AbstractC1823l.mopub(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (AbstractC1823l.mopub(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (AbstractC1823l.purchase(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (AbstractC1823l.mopub(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (AbstractC1823l.purchase(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return AbstractC1823l.crashlytics.amazon(j2, obj);
            case 8:
                Object objSubs = AbstractC1823l.subs(j2, obj);
                if (objSubs instanceof String) {
                    if (((String) objSubs).isEmpty()) {
                        return false;
                    }
                    return true;
                }
                if (!(objSubs instanceof AbstractC15619l)) {
                    C11983l.crashlytics();
                    return false;
                }
                if (AbstractC15619l.f30516l.equals(objSubs)) {
                    return false;
                }
                return true;
            case 9:
                if (AbstractC1823l.subs(j2, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                if (AbstractC15619l.f30516l.equals(AbstractC1823l.subs(j2, obj))) {
                    return false;
                }
                return true;
            case 11:
                if (AbstractC1823l.purchase(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (AbstractC1823l.purchase(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (AbstractC1823l.purchase(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (AbstractC1823l.mopub(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (AbstractC1823l.purchase(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (AbstractC1823l.mopub(j2, obj) != 0) {
                    return true;
                }
                return false;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                if (AbstractC1823l.subs(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                C11983l.crashlytics();
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:187:0x048e  */
    /* JADX WARN: Code duplicated, block: B:219:0x057e  */
    /* JADX WARN: Code duplicated, block: B:222:0x058c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d3  */
    @Override // defpackage.InterfaceC12940l
    public final int amazon(AbstractC12570l abstractC12570l) {
        int i;
        int iYandex;
        int iLoadAd;
        int iYandex2;
        int iLoadAd2;
        int iYandex3;
        int iCrashlytics;
        int i2;
        int iYandex4;
        int iIsVip;
        int i3;
        int iCrashlytics2;
        int iYandex5;
        int size;
        int iSubscription;
        int iYandex6;
        int iYandex7;
        int iYandex8;
        int size2;
        int iYandex9;
        int iCrashlytics3;
        int iYandex10;
        int iLoadAd3;
        int iYandex11;
        int iLoadAd4;
        int iVip;
        int iYandex12;
        Unsafe unsafe = smaato;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int iAdmob = 0;
        while (true) {
            int[] iArr = this.yandex;
            if (i6 >= iArr.length) {
                return ((AbstractC0288l) abstractC12570l).zzc.crashlytics() + iAdmob;
            }
            int iIsPro = isPro(i6);
            int iFirebase = firebase(iIsPro);
            int i8 = iArr[i6];
            int i9 = iArr[i6 + 2];
            int i10 = i9 & i4;
            if (iFirebase <= 17) {
                if (i10 != i5) {
                    i7 = i10 == i4 ? 0 : unsafe.getInt(abstractC12570l, i10);
                    i5 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            int i11 = iIsPro & i4;
            if (iFirebase >= EnumC10344l.f21068l.f21071l) {
                EnumC10344l.f21067l.getClass();
            }
            long j = i11;
            switch (iFirebase) {
                case 0:
                    if (adcel(abstractC12570l, i6, i5, i7, i)) {
                        iAdmob = AbstractC9029l.admob(i8 << 3, 8, iAdmob);
                    }
                    break;
                case 1:
                    if (adcel(abstractC12570l, i6, i5, i7, i)) {
                        iAdmob = AbstractC9029l.admob(i8 << 3, 4, iAdmob);
                    }
                    break;
                case 2:
                    if (adcel(abstractC12570l, i6, i5, i7, i)) {
                        long j2 = unsafe.getLong(abstractC12570l, j);
                        iYandex = AbstractC10908l.yandex(i8 << 3);
                        iLoadAd = AbstractC10908l.loadAd(j2);
                        iIsVip = iLoadAd + iYandex;
                        iAdmob += iIsVip;
                    }
                    break;
                case 3:
                    if (adcel(abstractC12570l, i6, i5, i7, i)) {
                        long j3 = unsafe.getLong(abstractC12570l, j);
                        iYandex = AbstractC10908l.yandex(i8 << 3);
                        iLoadAd = AbstractC10908l.loadAd(j3);
                        iIsVip = iLoadAd + iYandex;
                        iAdmob += iIsVip;
                    }
                    break;
                case 4:
                    if (adcel(abstractC12570l, i6, i5, i7, i)) {
                        long j4 = unsafe.getInt(abstractC12570l, j);
                        iYandex = AbstractC10908l.yandex(i8 << 3);
                        iLoadAd = AbstractC10908l.loadAd(j4);
                        iIsVip = iLoadAd + iYandex;
                        iAdmob += iIsVip;
                    }
                    break;
                case 5:
                    if (adcel(abstractC12570l, i6, i5, i7, i)) {
                        iAdmob = AbstractC9029l.admob(i8 << 3, 8, iAdmob);
                    }
                    break;
                case 6:
                    if (adcel(abstractC12570l, i6, i5, i7, i)) {
                        iAdmob = AbstractC9029l.admob(i8 << 3, 4, iAdmob);
                    }
                    break;
                case 7:
                    if (adcel(abstractC12570l, i6, i5, i7, i)) {
                        iAdmob = AbstractC9029l.admob(i8 << 3, 1, iAdmob);
                    }
                    break;
                case 8:
                    if (adcel(abstractC12570l, i6, i5, i7, i)) {
                        int i12 = i8 << 3;
                        Object object = unsafe.getObject(abstractC12570l, j);
                        if (object instanceof AbstractC15619l) {
                            iYandex2 = AbstractC10908l.yandex(i12);
                            iLoadAd2 = ((AbstractC15619l) object).billing();
                        } else {
                            iYandex2 = AbstractC10908l.yandex(i12);
                            iLoadAd2 = AbstractC13388l.loadAd((String) object);
                        }
                        iAdmob = AbstractC9029l.subs(iLoadAd2, iLoadAd2, iYandex2, iAdmob);
                    }
                    break;
                case 9:
                    if (adcel(abstractC12570l, i6, i5, i7, i)) {
                        Object object2 = unsafe.getObject(abstractC12570l, j);
                        InterfaceC12940l interfaceC12940lApplovin = applovin(i6);
                        C8565l c8565l = AbstractC9626l.yandex;
                        iYandex3 = AbstractC10908l.yandex(i8 << 3);
                        iCrashlytics = ((AbstractC12570l) object2).crashlytics(interfaceC12940lApplovin);
                        iAdmob = AbstractC9029l.subs(iCrashlytics, iCrashlytics, iYandex3, iAdmob);
                    }
                    break;
                case 10:
                    if (adcel(abstractC12570l, i6, i5, i7, i)) {
                        AbstractC15619l abstractC15619l = (AbstractC15619l) unsafe.getObject(abstractC12570l, j);
                        iYandex2 = AbstractC10908l.yandex(i8 << 3);
                        iLoadAd2 = abstractC15619l.billing();
                        iAdmob = AbstractC9029l.subs(iLoadAd2, iLoadAd2, iYandex2, iAdmob);
                    }
                    break;
                case 11:
                    if (adcel(abstractC12570l, i6, i5, i7, i)) {
                        i2 = unsafe.getInt(abstractC12570l, j);
                        iYandex4 = AbstractC10908l.yandex(i8 << 3);
                        iAdmob = AbstractC9029l.admob(i2, iYandex4, iAdmob);
                    }
                    break;
                case 12:
                    if (adcel(abstractC12570l, i6, i5, i7, i)) {
                        long j5 = unsafe.getInt(abstractC12570l, j);
                        iYandex = AbstractC10908l.yandex(i8 << 3);
                        iLoadAd = AbstractC10908l.loadAd(j5);
                        iIsVip = iLoadAd + iYandex;
                        iAdmob += iIsVip;
                    }
                    break;
                case 13:
                    if (adcel(abstractC12570l, i6, i5, i7, i)) {
                        iAdmob = AbstractC9029l.admob(i8 << 3, 4, iAdmob);
                    }
                    break;
                case 14:
                    if (adcel(abstractC12570l, i6, i5, i7, i)) {
                        iAdmob = AbstractC9029l.admob(i8 << 3, 8, iAdmob);
                    }
                    break;
                case 15:
                    if (adcel(abstractC12570l, i6, i5, i7, i)) {
                        int i13 = unsafe.getInt(abstractC12570l, j);
                        iYandex4 = AbstractC10908l.yandex(i8 << 3);
                        i2 = (i13 >> 31) ^ (i13 + i13);
                        iAdmob = AbstractC9029l.admob(i2, iYandex4, iAdmob);
                    }
                    break;
                case 16:
                    if (adcel(abstractC12570l, i6, i5, i7, i)) {
                        long j6 = unsafe.getLong(abstractC12570l, j);
                        iYandex = AbstractC10908l.yandex(i8 << 3);
                        iLoadAd = AbstractC10908l.loadAd((j6 >> 63) ^ (j6 + j6));
                        iIsVip = iLoadAd + iYandex;
                        iAdmob += iIsVip;
                    }
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (adcel(abstractC12570l, i6, i5, i7, i)) {
                        AbstractC12570l abstractC12570l2 = (AbstractC12570l) unsafe.getObject(abstractC12570l, j);
                        InterfaceC12940l interfaceC12940lApplovin2 = applovin(i6);
                        C8565l c8565l2 = AbstractC9626l.yandex;
                        int iYandex13 = AbstractC10908l.yandex(i8 << 3);
                        i3 = iYandex13 + iYandex13;
                        iCrashlytics2 = abstractC12570l2.crashlytics(interfaceC12940lApplovin2);
                        iIsVip = iCrashlytics2 + i3;
                        iAdmob += iIsVip;
                    }
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    iIsVip = AbstractC9626l.isVip(i8, (List) unsafe.getObject(abstractC12570l, j));
                    iAdmob += iIsVip;
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    iIsVip = AbstractC9626l.advert(i8, (List) unsafe.getObject(abstractC12570l, j));
                    iAdmob += iIsVip;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(abstractC12570l, j);
                    C8565l c8565l3 = AbstractC9626l.yandex;
                    if (list.size() == 0) {
                        iYandex5 = 0;
                    } else {
                        iYandex5 = (AbstractC10908l.yandex(i8 << 3) * list.size()) + AbstractC9626l.ads(list);
                    }
                    iAdmob += iYandex5;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC12570l, j);
                    C8565l c8565l4 = AbstractC9626l.yandex;
                    size = list2.size();
                    if (size == 0) {
                        iYandex7 = 0;
                    } else {
                        iSubscription = AbstractC9626l.subscription(list2);
                        iYandex6 = AbstractC10908l.yandex(i8 << 3);
                        iYandex7 = (iYandex6 * size) + iSubscription;
                    }
                    iAdmob += iYandex7;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC12570l, j);
                    C8565l c8565l5 = AbstractC9626l.yandex;
                    size = list3.size();
                    if (size == 0) {
                        iYandex7 = 0;
                    } else {
                        iSubscription = AbstractC9626l.license(list3);
                        iYandex6 = AbstractC10908l.yandex(i8 << 3);
                        iYandex7 = (iYandex6 * size) + iSubscription;
                    }
                    iAdmob += iYandex7;
                    break;
                case 23:
                    iIsVip = AbstractC9626l.isVip(i8, (List) unsafe.getObject(abstractC12570l, j));
                    iAdmob += iIsVip;
                    break;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    iIsVip = AbstractC9626l.advert(i8, (List) unsafe.getObject(abstractC12570l, j));
                    iAdmob += iIsVip;
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    List list4 = (List) unsafe.getObject(abstractC12570l, j);
                    C8565l c8565l6 = AbstractC9626l.yandex;
                    int size3 = list4.size();
                    if (size3 == 0) {
                        iYandex5 = 0;
                    } else {
                        iYandex5 = (AbstractC10908l.yandex(i8 << 3) + 1) * size3;
                    }
                    iAdmob += iYandex5;
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    List list5 = (List) unsafe.getObject(abstractC12570l, j);
                    C8565l c8565l7 = AbstractC9626l.yandex;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iYandex7 = 0;
                    } else {
                        iYandex7 = AbstractC10908l.yandex(i8 << 3) * size4;
                        for (int i14 = 0; i14 < size4; i14++) {
                            Object obj = list5.get(i14);
                            int iBilling = obj instanceof AbstractC15619l ? ((AbstractC15619l) obj).billing() : AbstractC13388l.loadAd((String) obj);
                            iYandex7 = AbstractC9029l.admob(iBilling, iBilling, iYandex7);
                        }
                    }
                    iAdmob += iYandex7;
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    List list6 = (List) unsafe.getObject(abstractC12570l, j);
                    InterfaceC12940l interfaceC12940lApplovin3 = applovin(i6);
                    C8565l c8565l8 = AbstractC9626l.yandex;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iYandex8 = 0;
                    } else {
                        iYandex8 = AbstractC10908l.yandex(i8 << 3) * size5;
                        for (int i15 = 0; i15 < size5; i15++) {
                            int iCrashlytics4 = ((AbstractC12570l) list6.get(i15)).crashlytics(interfaceC12940lApplovin3);
                            iYandex8 = AbstractC9029l.admob(iCrashlytics4, iCrashlytics4, iYandex8);
                        }
                    }
                    iAdmob += iYandex8;
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    List list7 = (List) unsafe.getObject(abstractC12570l, j);
                    C8565l c8565l9 = AbstractC9626l.yandex;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iYandex7 = 0;
                    } else {
                        iYandex7 = AbstractC10908l.yandex(i8 << 3) * size6;
                        for (int i16 = 0; i16 < list7.size(); i16++) {
                            int iBilling2 = ((AbstractC15619l) list7.get(i16)).billing();
                            iYandex7 = AbstractC9029l.admob(iBilling2, iBilling2, iYandex7);
                        }
                    }
                    iAdmob += iYandex7;
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    List list8 = (List) unsafe.getObject(abstractC12570l, j);
                    C8565l c8565l10 = AbstractC9626l.yandex;
                    size = list8.size();
                    if (size == 0) {
                        iYandex7 = 0;
                    } else {
                        iSubscription = AbstractC9626l.pro(list8);
                        iYandex6 = AbstractC10908l.yandex(i8 << 3);
                        iYandex7 = (iYandex6 * size) + iSubscription;
                    }
                    iAdmob += iYandex7;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC12570l, j);
                    C8565l c8565l11 = AbstractC9626l.yandex;
                    size = list9.size();
                    if (size == 0) {
                        iYandex7 = 0;
                    } else {
                        iSubscription = AbstractC9626l.Signature(list9);
                        iYandex6 = AbstractC10908l.yandex(i8 << 3);
                        iYandex7 = (iYandex6 * size) + iSubscription;
                    }
                    iAdmob += iYandex7;
                    break;
                case 31:
                    iIsVip = AbstractC9626l.advert(i8, (List) unsafe.getObject(abstractC12570l, j));
                    iAdmob += iIsVip;
                    break;
                case 32:
                    iIsVip = AbstractC9626l.isVip(i8, (List) unsafe.getObject(abstractC12570l, j));
                    iAdmob += iIsVip;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    List list10 = (List) unsafe.getObject(abstractC12570l, j);
                    C8565l c8565l12 = AbstractC9626l.yandex;
                    size = list10.size();
                    if (size == 0) {
                        iYandex7 = 0;
                    } else {
                        iSubscription = AbstractC9626l.ad(list10);
                        iYandex6 = AbstractC10908l.yandex(i8 << 3);
                        iYandex7 = (iYandex6 * size) + iSubscription;
                    }
                    iAdmob += iYandex7;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    List list11 = (List) unsafe.getObject(abstractC12570l, j);
                    C8565l c8565l13 = AbstractC9626l.yandex;
                    size = list11.size();
                    if (size == 0) {
                        iYandex7 = 0;
                    } else {
                        iSubscription = AbstractC9626l.tapsense(list11);
                        iYandex6 = AbstractC10908l.yandex(i8 << 3);
                        iYandex7 = (iYandex6 * size) + iSubscription;
                    }
                    iAdmob += iYandex7;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    List list12 = (List) unsafe.getObject(abstractC12570l, j);
                    C8565l c8565l14 = AbstractC9626l.yandex;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iYandex9 = AbstractC10908l.yandex(i8 << 3);
                        iAdmob = AbstractC9029l.subs(size2, iYandex9, size2, iAdmob);
                    }
                    break;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    List list13 = (List) unsafe.getObject(abstractC12570l, j);
                    C8565l c8565l15 = AbstractC9626l.yandex;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iYandex9 = AbstractC10908l.yandex(i8 << 3);
                        iAdmob = AbstractC9029l.subs(size2, iYandex9, size2, iAdmob);
                    }
                    break;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    size2 = AbstractC9626l.ads((List) unsafe.getObject(abstractC12570l, j));
                    if (size2 > 0) {
                        iYandex9 = AbstractC10908l.yandex(i8 << 3);
                        iAdmob = AbstractC9029l.subs(size2, iYandex9, size2, iAdmob);
                    }
                    break;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    size2 = AbstractC9626l.subscription((List) unsafe.getObject(abstractC12570l, j));
                    if (size2 > 0) {
                        iYandex9 = AbstractC10908l.yandex(i8 << 3);
                        iAdmob = AbstractC9029l.subs(size2, iYandex9, size2, iAdmob);
                    }
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    size2 = AbstractC9626l.license((List) unsafe.getObject(abstractC12570l, j));
                    if (size2 > 0) {
                        iYandex9 = AbstractC10908l.yandex(i8 << 3);
                        iAdmob = AbstractC9029l.subs(size2, iYandex9, size2, iAdmob);
                    }
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    List list14 = (List) unsafe.getObject(abstractC12570l, j);
                    C8565l c8565l16 = AbstractC9626l.yandex;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iYandex9 = AbstractC10908l.yandex(i8 << 3);
                        iAdmob = AbstractC9029l.subs(size2, iYandex9, size2, iAdmob);
                    }
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    List list15 = (List) unsafe.getObject(abstractC12570l, j);
                    C8565l c8565l17 = AbstractC9626l.yandex;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iYandex9 = AbstractC10908l.yandex(i8 << 3);
                        iAdmob = AbstractC9029l.subs(size2, iYandex9, size2, iAdmob);
                    }
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    List list16 = (List) unsafe.getObject(abstractC12570l, j);
                    C8565l c8565l18 = AbstractC9626l.yandex;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iYandex9 = AbstractC10908l.yandex(i8 << 3);
                        iAdmob = AbstractC9029l.subs(size2, iYandex9, size2, iAdmob);
                    }
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    size2 = AbstractC9626l.pro((List) unsafe.getObject(abstractC12570l, j));
                    if (size2 > 0) {
                        iYandex9 = AbstractC10908l.yandex(i8 << 3);
                        iAdmob = AbstractC9029l.subs(size2, iYandex9, size2, iAdmob);
                    }
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    size2 = AbstractC9626l.Signature((List) unsafe.getObject(abstractC12570l, j));
                    if (size2 > 0) {
                        iYandex9 = AbstractC10908l.yandex(i8 << 3);
                        iAdmob = AbstractC9029l.subs(size2, iYandex9, size2, iAdmob);
                    }
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    List list17 = (List) unsafe.getObject(abstractC12570l, j);
                    C8565l c8565l19 = AbstractC9626l.yandex;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iYandex9 = AbstractC10908l.yandex(i8 << 3);
                        iAdmob = AbstractC9029l.subs(size2, iYandex9, size2, iAdmob);
                    }
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    List list18 = (List) unsafe.getObject(abstractC12570l, j);
                    C8565l c8565l20 = AbstractC9626l.yandex;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iYandex9 = AbstractC10908l.yandex(i8 << 3);
                        iAdmob = AbstractC9029l.subs(size2, iYandex9, size2, iAdmob);
                    }
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    size2 = AbstractC9626l.ad((List) unsafe.getObject(abstractC12570l, j));
                    if (size2 > 0) {
                        iYandex9 = AbstractC10908l.yandex(i8 << 3);
                        iAdmob = AbstractC9029l.subs(size2, iYandex9, size2, iAdmob);
                    }
                    break;
                case 48:
                    size2 = AbstractC9626l.tapsense((List) unsafe.getObject(abstractC12570l, j));
                    if (size2 > 0) {
                        iYandex9 = AbstractC10908l.yandex(i8 << 3);
                        iAdmob = AbstractC9029l.subs(size2, iYandex9, size2, iAdmob);
                    }
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    List list19 = (List) unsafe.getObject(abstractC12570l, j);
                    InterfaceC12940l interfaceC12940lApplovin4 = applovin(i6);
                    C8565l c8565l21 = AbstractC9626l.yandex;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        iCrashlytics3 = 0;
                    } else {
                        iCrashlytics3 = 0;
                        for (int i17 = 0; i17 < size7; i17++) {
                            AbstractC12570l abstractC12570l3 = (AbstractC12570l) list19.get(i17);
                            int iYandex14 = AbstractC10908l.yandex(i8 << 3);
                            iCrashlytics3 += abstractC12570l3.crashlytics(interfaceC12940lApplovin4) + iYandex14 + iYandex14;
                        }
                    }
                    iAdmob += iCrashlytics3;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    C12643l c12643l = (C12643l) unsafe.getObject(abstractC12570l, j);
                    C14383l c14383l = (C14383l) appmetrica(i6);
                    if (c12643l.isEmpty()) {
                        iYandex7 = 0;
                    } else {
                        iYandex7 = 0;
                        for (Map.Entry entry : c12643l.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            C5991l c5991l = c14383l.yandex;
                            int iYandex15 = AbstractC10908l.yandex(i8 << 3);
                            int iLoadAd5 = C14383l.loadAd(c5991l, key, value);
                            iYandex7 = AbstractC9029l.subs(iLoadAd5, iLoadAd5, iYandex15, iYandex7);
                        }
                    }
                    iAdmob += iYandex7;
                    break;
                case 51:
                    if (tapsense(i8, i6, abstractC12570l)) {
                        iAdmob = AbstractC9029l.admob(i8 << 3, 8, iAdmob);
                    }
                    break;
                case 52:
                    if (tapsense(i8, i6, abstractC12570l)) {
                        iAdmob = AbstractC9029l.admob(i8 << 3, 4, iAdmob);
                    }
                    break;
                case 53:
                    if (tapsense(i8, i6, abstractC12570l)) {
                        long jMetrica = metrica(j, abstractC12570l);
                        iYandex10 = AbstractC10908l.yandex(i8 << 3);
                        iLoadAd3 = AbstractC10908l.loadAd(jMetrica);
                        iAdmob += iLoadAd3 + iYandex10;
                    }
                    break;
                case 54:
                    if (tapsense(i8, i6, abstractC12570l)) {
                        long jMetrica2 = metrica(j, abstractC12570l);
                        iYandex10 = AbstractC10908l.yandex(i8 << 3);
                        iLoadAd3 = AbstractC10908l.loadAd(jMetrica2);
                        iAdmob += iLoadAd3 + iYandex10;
                    }
                    break;
                case 55:
                    if (tapsense(i8, i6, abstractC12570l)) {
                        long jVip = vip(j, abstractC12570l);
                        iYandex10 = AbstractC10908l.yandex(i8 << 3);
                        iLoadAd3 = AbstractC10908l.loadAd(jVip);
                        iAdmob += iLoadAd3 + iYandex10;
                    }
                    break;
                case 56:
                    if (tapsense(i8, i6, abstractC12570l)) {
                        iAdmob = AbstractC9029l.admob(i8 << 3, 8, iAdmob);
                    }
                    break;
                case 57:
                    if (tapsense(i8, i6, abstractC12570l)) {
                        iAdmob = AbstractC9029l.admob(i8 << 3, 4, iAdmob);
                    }
                    break;
                case 58:
                    if (tapsense(i8, i6, abstractC12570l)) {
                        iAdmob = AbstractC9029l.admob(i8 << 3, 1, iAdmob);
                    }
                    break;
                case 59:
                    if (tapsense(i8, i6, abstractC12570l)) {
                        int i18 = i8 << 3;
                        Object object3 = unsafe.getObject(abstractC12570l, j);
                        if (object3 instanceof AbstractC15619l) {
                            iYandex11 = AbstractC10908l.yandex(i18);
                            iLoadAd4 = ((AbstractC15619l) object3).billing();
                        } else {
                            iYandex11 = AbstractC10908l.yandex(i18);
                            iLoadAd4 = AbstractC13388l.loadAd((String) object3);
                        }
                        iAdmob = AbstractC9029l.subs(iLoadAd4, iLoadAd4, iYandex11, iAdmob);
                    }
                    break;
                case 60:
                    if (tapsense(i8, i6, abstractC12570l)) {
                        Object object4 = unsafe.getObject(abstractC12570l, j);
                        InterfaceC12940l interfaceC12940lApplovin5 = applovin(i6);
                        C8565l c8565l22 = AbstractC9626l.yandex;
                        iYandex3 = AbstractC10908l.yandex(i8 << 3);
                        iCrashlytics = ((AbstractC12570l) object4).crashlytics(interfaceC12940lApplovin5);
                        iAdmob = AbstractC9029l.subs(iCrashlytics, iCrashlytics, iYandex3, iAdmob);
                    }
                    break;
                case 61:
                    if (tapsense(i8, i6, abstractC12570l)) {
                        AbstractC15619l abstractC15619l2 = (AbstractC15619l) unsafe.getObject(abstractC12570l, j);
                        iYandex11 = AbstractC10908l.yandex(i8 << 3);
                        iLoadAd4 = abstractC15619l2.billing();
                        iAdmob = AbstractC9029l.subs(iLoadAd4, iLoadAd4, iYandex11, iAdmob);
                    }
                    break;
                case 62:
                    if (tapsense(i8, i6, abstractC12570l)) {
                        iVip = vip(j, abstractC12570l);
                        iYandex12 = AbstractC10908l.yandex(i8 << 3);
                        iAdmob = AbstractC9029l.admob(iVip, iYandex12, iAdmob);
                    }
                    break;
                case 63:
                    if (tapsense(i8, i6, abstractC12570l)) {
                        long jVip2 = vip(j, abstractC12570l);
                        iYandex10 = AbstractC10908l.yandex(i8 << 3);
                        iLoadAd3 = AbstractC10908l.loadAd(jVip2);
                        iAdmob += iLoadAd3 + iYandex10;
                    }
                    break;
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    if (tapsense(i8, i6, abstractC12570l)) {
                        iAdmob = AbstractC9029l.admob(i8 << 3, 4, iAdmob);
                    }
                    break;
                case 65:
                    if (tapsense(i8, i6, abstractC12570l)) {
                        iAdmob = AbstractC9029l.admob(i8 << 3, 8, iAdmob);
                    }
                    break;
                case 66:
                    if (tapsense(i8, i6, abstractC12570l)) {
                        int iVip2 = vip(j, abstractC12570l);
                        iYandex12 = AbstractC10908l.yandex(i8 << 3);
                        iVip = (iVip2 >> 31) ^ (iVip2 + iVip2);
                        iAdmob = AbstractC9029l.admob(iVip, iYandex12, iAdmob);
                    }
                    break;
                case 67:
                    if (tapsense(i8, i6, abstractC12570l)) {
                        long jMetrica3 = metrica(j, abstractC12570l);
                        iYandex10 = AbstractC10908l.yandex(i8 << 3);
                        iLoadAd3 = AbstractC10908l.loadAd((jMetrica3 >> 63) ^ (jMetrica3 + jMetrica3));
                        iAdmob += iLoadAd3 + iYandex10;
                    }
                    break;
                case 68:
                    if (tapsense(i8, i6, abstractC12570l)) {
                        AbstractC12570l abstractC12570l4 = (AbstractC12570l) unsafe.getObject(abstractC12570l, j);
                        InterfaceC12940l interfaceC12940lApplovin6 = applovin(i6);
                        C8565l c8565l23 = AbstractC9626l.yandex;
                        int iYandex16 = AbstractC10908l.yandex(i8 << 3);
                        i3 = iYandex16 + iYandex16;
                        iCrashlytics2 = abstractC12570l4.crashlytics(interfaceC12940lApplovin6);
                        iIsVip = iCrashlytics2 + i3;
                        iAdmob += iIsVip;
                    }
                    break;
            }
            i6 += 3;
            i4 = 1048575;
        }
    }

    public final InterfaceC12940l applovin(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.loadAd;
        InterfaceC12940l interfaceC12940l = (InterfaceC12940l) objArr[i3];
        if (interfaceC12940l != null) {
            return interfaceC12940l;
        }
        InterfaceC12940l interfaceC12940lYandex = C8307l.crashlytics.yandex((Class) objArr[i3 + 1]);
        objArr[i3] = interfaceC12940lYandex;
        return interfaceC12940lYandex;
    }

    public final Object appmetrica(int i) {
        int i2 = i / 3;
        return this.loadAd[i2 + i2];
    }

    @Override // defpackage.InterfaceC12940l
    public final void billing(Object obj, byte[] bArr, int i, int i2, C16292l c16292l) {
        ad(obj, bArr, i, i2, 0, c16292l);
    }

    @Override // defpackage.InterfaceC12940l
    public final void crashlytics(Object obj, C15714l c15714l) {
        int i;
        AbstractC10908l abstractC10908l = (AbstractC10908l) c15714l.f30857l;
        Unsafe unsafe = smaato;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.yandex;
            if (i4 >= iArr.length) {
                ((AbstractC0288l) obj).zzc.loadAd(c15714l);
                return;
            }
            int iIsPro = isPro(i4);
            int iFirebase = firebase(iIsPro);
            int i6 = iArr[i4];
            if (iFirebase <= 17) {
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
            long j = iIsPro & i2;
            switch (iFirebase) {
                case 0:
                    if (adcel(obj, i4, i3, i5, i)) {
                        abstractC10908l.subs(i6, Double.doubleToRawLongBits(AbstractC1823l.crashlytics.isPro(j, obj)));
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if (adcel(obj, i4, i3, i5, i)) {
                        abstractC10908l.mopub(i6, Float.floatToRawIntBits(AbstractC1823l.crashlytics.billing(j, obj)));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if (adcel(obj, i4, i3, i5, i)) {
                        abstractC10908l.admob(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if (adcel(obj, i4, i3, i5, i)) {
                        abstractC10908l.admob(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if (adcel(obj, i4, i3, i5, i)) {
                        abstractC10908l.purchase(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if (adcel(obj, i4, i3, i5, i)) {
                        abstractC10908l.subs(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if (adcel(obj, i4, i3, i5, i)) {
                        abstractC10908l.mopub(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if (adcel(obj, i4, i3, i5, i)) {
                        abstractC10908l.isPro(i6, AbstractC1823l.crashlytics.amazon(j, obj));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if (adcel(obj, i4, i3, i5, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            abstractC10908l.firebase(i6, (String) object);
                        } else {
                            abstractC10908l.smaato(i6, (AbstractC15619l) object);
                        }
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if (adcel(obj, i4, i3, i5, i)) {
                        c15714l.loadAd(i6, unsafe.getObject(obj, j), applovin(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if (adcel(obj, i4, i3, i5, i)) {
                        abstractC10908l.smaato(i6, (AbstractC15619l) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if (adcel(obj, i4, i3, i5, i)) {
                        abstractC10908l.billing(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if (adcel(obj, i4, i3, i5, i)) {
                        abstractC10908l.purchase(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if (adcel(obj, i4, i3, i5, i)) {
                        abstractC10908l.mopub(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if (adcel(obj, i4, i3, i5, i)) {
                        abstractC10908l.subs(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if (adcel(obj, i4, i3, i5, i)) {
                        int i9 = unsafe.getInt(obj, j);
                        abstractC10908l.billing(i6, (i9 >> 31) ^ (i9 + i9));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if (adcel(obj, i4, i3, i5, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        abstractC10908l.admob(i6, (j2 >> 63) ^ (j2 + j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (adcel(obj, i4, i3, i5, i)) {
                        Object object2 = unsafe.getObject(obj, j);
                        abstractC10908l.amazon(i6, 3);
                        applovin(i4).crashlytics((AbstractC12570l) object2, c15714l);
                        abstractC10908l.amazon(i6, 4);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    AbstractC9626l.amazon(iArr[i4], (List) unsafe.getObject(obj, j), c15714l, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    AbstractC9626l.purchase(iArr[i4], (List) unsafe.getObject(obj, j), c15714l, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    AbstractC9626l.billing(iArr[i4], (List) unsafe.getObject(obj, j), c15714l, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    AbstractC9626l.mopub(iArr[i4], (List) unsafe.getObject(obj, j), c15714l, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    AbstractC9626l.firebase(iArr[i4], (List) unsafe.getObject(obj, j), c15714l, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    AbstractC9626l.subs(iArr[i4], (List) unsafe.getObject(obj, j), c15714l, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    AbstractC9626l.vip(iArr[i4], (List) unsafe.getObject(obj, j), c15714l, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    AbstractC9626l.adcel(iArr[i4], (List) unsafe.getObject(obj, j), c15714l, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    int i10 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    C8565l c8565l = AbstractC9626l.yandex;
                    if (list != null && !list.isEmpty()) {
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            abstractC10908l.firebase(i10, (String) list.get(i11));
                        }
                    }
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    int i12 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    InterfaceC12940l interfaceC12940lApplovin = applovin(i4);
                    C8565l c8565l2 = AbstractC9626l.yandex;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i13 = 0; i13 < list2.size(); i13++) {
                            c15714l.loadAd(i12, list2.get(i13), interfaceC12940lApplovin);
                        }
                    }
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    int i14 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    C8565l c8565l3 = AbstractC9626l.yandex;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i15 = 0; i15 < list3.size(); i15++) {
                            abstractC10908l.smaato(i14, (AbstractC15619l) list3.get(i15));
                        }
                    }
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    AbstractC9626l.smaato(iArr[i4], (List) unsafe.getObject(obj, j), c15714l, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 30:
                    AbstractC9626l.startapp(iArr[i4], (List) unsafe.getObject(obj, j), c15714l, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 31:
                    AbstractC9626l.metrica(iArr[i4], (List) unsafe.getObject(obj, j), c15714l, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 32:
                    AbstractC9626l.isPro(iArr[i4], (List) unsafe.getObject(obj, j), c15714l, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    AbstractC9626l.remoteconfig(iArr[i4], (List) unsafe.getObject(obj, j), c15714l, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    AbstractC9626l.admob(iArr[i4], (List) unsafe.getObject(obj, j), c15714l, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    AbstractC9626l.amazon(iArr[i4], (List) unsafe.getObject(obj, j), c15714l, true);
                    break;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    AbstractC9626l.purchase(iArr[i4], (List) unsafe.getObject(obj, j), c15714l, true);
                    break;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    AbstractC9626l.billing(iArr[i4], (List) unsafe.getObject(obj, j), c15714l, true);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    AbstractC9626l.mopub(iArr[i4], (List) unsafe.getObject(obj, j), c15714l, true);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    AbstractC9626l.firebase(iArr[i4], (List) unsafe.getObject(obj, j), c15714l, true);
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    AbstractC9626l.subs(iArr[i4], (List) unsafe.getObject(obj, j), c15714l, true);
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    AbstractC9626l.vip(iArr[i4], (List) unsafe.getObject(obj, j), c15714l, true);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    AbstractC9626l.adcel(iArr[i4], (List) unsafe.getObject(obj, j), c15714l, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    AbstractC9626l.smaato(iArr[i4], (List) unsafe.getObject(obj, j), c15714l, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    AbstractC9626l.startapp(iArr[i4], (List) unsafe.getObject(obj, j), c15714l, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    AbstractC9626l.metrica(iArr[i4], (List) unsafe.getObject(obj, j), c15714l, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    AbstractC9626l.isPro(iArr[i4], (List) unsafe.getObject(obj, j), c15714l, true);
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    AbstractC9626l.remoteconfig(iArr[i4], (List) unsafe.getObject(obj, j), c15714l, true);
                    break;
                case 48:
                    AbstractC9626l.admob(iArr[i4], (List) unsafe.getObject(obj, j), c15714l, true);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    int i16 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    InterfaceC12940l interfaceC12940lApplovin2 = applovin(i4);
                    C8565l c8565l4 = AbstractC9626l.yandex;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i17 = 0; i17 < list4.size(); i17++) {
                            AbstractC12570l abstractC12570l = (AbstractC12570l) list4.get(i17);
                            abstractC10908l.amazon(i16, 3);
                            interfaceC12940lApplovin2.crashlytics(abstractC12570l, c15714l);
                            abstractC10908l.amazon(i16, 4);
                        }
                    }
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Object object3 = unsafe.getObject(obj, j);
                    if (object3 != null) {
                        C5991l c5991l = ((C14383l) appmetrica(i4)).yandex;
                        for (Map.Entry entry : ((C12643l) object3).entrySet()) {
                            abstractC10908l.amazon(i6, 2);
                            abstractC10908l.ads(C14383l.loadAd(c5991l, entry.getKey(), entry.getValue()));
                            C14383l.yandex(abstractC10908l, c5991l, entry.getKey(), entry.getValue());
                        }
                    }
                    break;
                case 51:
                    if (tapsense(i6, i4, obj)) {
                        abstractC10908l.subs(i6, Double.doubleToRawLongBits(((Double) AbstractC1823l.subs(j, obj)).doubleValue()));
                    }
                    break;
                case 52:
                    if (tapsense(i6, i4, obj)) {
                        abstractC10908l.mopub(i6, Float.floatToRawIntBits(((Float) AbstractC1823l.subs(j, obj)).floatValue()));
                    }
                    break;
                case 53:
                    if (tapsense(i6, i4, obj)) {
                        abstractC10908l.admob(i6, metrica(j, obj));
                    }
                    break;
                case 54:
                    if (tapsense(i6, i4, obj)) {
                        abstractC10908l.admob(i6, metrica(j, obj));
                    }
                    break;
                case 55:
                    if (tapsense(i6, i4, obj)) {
                        abstractC10908l.purchase(i6, vip(j, obj));
                    }
                    break;
                case 56:
                    if (tapsense(i6, i4, obj)) {
                        abstractC10908l.subs(i6, metrica(j, obj));
                    }
                    break;
                case 57:
                    if (tapsense(i6, i4, obj)) {
                        abstractC10908l.mopub(i6, vip(j, obj));
                    }
                    break;
                case 58:
                    if (tapsense(i6, i4, obj)) {
                        abstractC10908l.isPro(i6, ((Boolean) AbstractC1823l.subs(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (tapsense(i6, i4, obj)) {
                        Object object4 = unsafe.getObject(obj, j);
                        if (object4 instanceof String) {
                            abstractC10908l.firebase(i6, (String) object4);
                        } else {
                            abstractC10908l.smaato(i6, (AbstractC15619l) object4);
                        }
                    }
                    break;
                case 60:
                    if (tapsense(i6, i4, obj)) {
                        c15714l.loadAd(i6, unsafe.getObject(obj, j), applovin(i4));
                    }
                    break;
                case 61:
                    if (tapsense(i6, i4, obj)) {
                        abstractC10908l.smaato(i6, (AbstractC15619l) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (tapsense(i6, i4, obj)) {
                        abstractC10908l.billing(i6, vip(j, obj));
                    }
                    break;
                case 63:
                    if (tapsense(i6, i4, obj)) {
                        abstractC10908l.purchase(i6, vip(j, obj));
                    }
                    break;
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    if (tapsense(i6, i4, obj)) {
                        abstractC10908l.mopub(i6, vip(j, obj));
                    }
                    break;
                case 65:
                    if (tapsense(i6, i4, obj)) {
                        abstractC10908l.subs(i6, metrica(j, obj));
                    }
                    break;
                case 66:
                    if (tapsense(i6, i4, obj)) {
                        int iVip = vip(j, obj);
                        abstractC10908l.billing(i6, (iVip >> 31) ^ (iVip + iVip));
                    }
                    break;
                case 67:
                    if (tapsense(i6, i4, obj)) {
                        long jMetrica = metrica(j, obj);
                        abstractC10908l.admob(i6, (jMetrica >> 63) ^ (jMetrica + jMetrica));
                    }
                    break;
                case 68:
                    if (tapsense(i6, i4, obj)) {
                        Object object5 = unsafe.getObject(obj, j);
                        abstractC10908l.amazon(i6, 3);
                        applovin(i4).crashlytics((AbstractC12570l) object5, c15714l);
                        abstractC10908l.amazon(i6, 4);
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
    }

    public final C1037l inmobi(int i) {
        int i2 = i / 3;
        return (C1037l) this.loadAd[i2 + i2 + 1];
    }

    public final int isPro(int i) {
        return this.yandex[i + 1];
    }

    public final int license(int i, int i2) {
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

    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084 A[SYNTHETIC] */
    @Override // defpackage.InterfaceC12940l
    public final void loadAd(Object obj) {
        if (!smaato(obj)) {
            return;
        }
        if (obj instanceof AbstractC0288l) {
            AbstractC0288l abstractC0288l = (AbstractC0288l) obj;
            abstractC0288l.smaato();
            abstractC0288l.zza = 0;
            abstractC0288l.admob();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.yandex;
            if (i >= iArr.length) {
                this.isPro.getClass();
                C10096l c10096l = ((AbstractC0288l) obj).zzc;
                if (c10096l.purchase) {
                    c10096l.purchase = false;
                    return;
                }
                return;
            }
            int iIsPro = isPro(i);
            int i2 = 1048575 & iIsPro;
            int iFirebase = firebase(iIsPro);
            long j = i2;
            if (iFirebase != 9) {
                if (iFirebase != 60 && iFirebase != 68) {
                    switch (iFirebase) {
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            if (ads(i, obj)) {
                                applovin(i).loadAd(smaato.getObject(obj, j));
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
                            AbstractC1277l abstractC1277l = (AbstractC1277l) ((InterfaceC9971l) AbstractC1823l.subs(j, obj));
                            if (abstractC1277l.f3328l) {
                                abstractC1277l.f3328l = false;
                            }
                            break;
                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                            Unsafe unsafe = smaato;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((C12643l) object).f24870l = false;
                                unsafe.putObject(obj, j, object);
                            }
                            break;
                    }
                } else if (tapsense(iArr[i], i, obj)) {
                    applovin(i).loadAd(smaato.getObject(obj, j));
                }
            } else if (ads(i, obj)) {
                applovin(i).loadAd(smaato.getObject(obj, j));
            }
            i += 3;
        }
    }

    @Override // defpackage.InterfaceC12940l
    public final int mopub(AbstractC0288l abstractC0288l) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int i4;
        int iHashCode = 0;
        for (int i5 = 0; i5 < this.yandex.length; i5 += 3) {
            int iIsPro = isPro(i5);
            int iFirebase = firebase(iIsPro);
            if (iFirebase <= 50 || iFirebase >= 69) {
                long j = iIsPro & 1048575;
                int iHashCode2 = 37;
                switch (iFirebase) {
                    case 0:
                        i = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(AbstractC1823l.crashlytics.isPro(j, abstractC0288l));
                        byte[] bArr = AbstractC16728l.yandex;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 1:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(AbstractC1823l.crashlytics.billing(j, abstractC0288l));
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 2:
                        i = iHashCode * 53;
                        jDoubleToLongBits = AbstractC1823l.mopub(j, abstractC0288l);
                        byte[] bArr2 = AbstractC16728l.yandex;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 3:
                        i = iHashCode * 53;
                        jDoubleToLongBits = AbstractC1823l.mopub(j, abstractC0288l);
                        byte[] bArr3 = AbstractC16728l.yandex;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 4:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = AbstractC1823l.purchase(j, abstractC0288l);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 5:
                        i = iHashCode * 53;
                        jDoubleToLongBits = AbstractC1823l.mopub(j, abstractC0288l);
                        byte[] bArr4 = AbstractC16728l.yandex;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 6:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = AbstractC1823l.purchase(j, abstractC0288l);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 7:
                        i = iHashCode * 53;
                        boolean zAmazon = AbstractC1823l.crashlytics.amazon(j, abstractC0288l);
                        byte[] bArr5 = AbstractC16728l.yandex;
                        i3 = zAmazon ? 1231 : 1237;
                        iHashCode = i + i3;
                        break;
                    case 8:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = ((String) AbstractC1823l.subs(j, abstractC0288l)).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 9:
                        i4 = iHashCode * 53;
                        Object objSubs = AbstractC1823l.subs(j, abstractC0288l);
                        if (objSubs != null) {
                            iHashCode2 = objSubs.hashCode();
                        }
                        iHashCode = i4 + iHashCode2;
                        break;
                    case 10:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = AbstractC1823l.subs(j, abstractC0288l).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 11:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = AbstractC1823l.purchase(j, abstractC0288l);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 12:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = AbstractC1823l.purchase(j, abstractC0288l);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 13:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = AbstractC1823l.purchase(j, abstractC0288l);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 14:
                        i = iHashCode * 53;
                        jDoubleToLongBits = AbstractC1823l.mopub(j, abstractC0288l);
                        byte[] bArr6 = AbstractC16728l.yandex;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 15:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = AbstractC1823l.purchase(j, abstractC0288l);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 16:
                        i = iHashCode * 53;
                        jDoubleToLongBits = AbstractC1823l.mopub(j, abstractC0288l);
                        byte[] bArr7 = AbstractC16728l.yandex;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        i4 = iHashCode * 53;
                        Object objSubs2 = AbstractC1823l.subs(j, abstractC0288l);
                        if (objSubs2 != null) {
                            iHashCode2 = objSubs2.hashCode();
                        }
                        iHashCode = i4 + iHashCode2;
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
                        i2 = iHashCode * 53;
                        iFloatToIntBits = AbstractC1823l.subs(j, abstractC0288l).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = AbstractC1823l.subs(j, abstractC0288l).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i6 = this.subs;
        while (true) {
            int[] iArr = this.mopub;
            if (i6 >= iArr.length) {
                return abstractC0288l.zzc.hashCode() + (iHashCode * 53);
            }
            int i7 = iArr[i6];
            if (!tapsense(0, i7, abstractC0288l)) {
                iHashCode = AbstractC1823l.subs(isPro(i7) & 1048575, abstractC0288l).hashCode() + (iHashCode * 53);
            }
            i6++;
        }
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final void m1402native(int i, C12676l c12676l, Object obj) {
        AbstractC9284l abstractC9284l = (AbstractC9284l) c12676l.purchase;
        long j = i & 1048575;
        if ((536870912 & i) != 0) {
            c12676l.m3459l(2);
            AbstractC1823l.isPro(j, obj, abstractC9284l.mo1088static());
        } else if (!this.billing) {
            AbstractC1823l.isPro(j, obj, c12676l.m3462l());
        } else {
            c12676l.m3459l(2);
            AbstractC1823l.isPro(j, obj, abstractC9284l.mo1082interface());
        }
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void m1403package(int i, Object obj, Object obj2) {
        smaato.putObject(obj, isPro(i) & 1048575, obj2);
        subscription(i, obj);
    }

    public final void premium(int i, Object obj, Object obj2) {
        int[] iArr = this.yandex;
        int i2 = iArr[i];
        if (tapsense(i2, i, obj2)) {
            int iIsPro = isPro(i) & 1048575;
            Unsafe unsafe = smaato;
            long j = iIsPro;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = iArr[i];
                String string = obj2.toString();
                C11586l.amazon(String.valueOf(i3).length() + 38 + string.length(), i3, string);
                return;
            }
            InterfaceC12940l interfaceC12940lApplovin = applovin(i);
            if (!tapsense(i2, i, obj)) {
                if (smaato(object)) {
                    AbstractC0288l abstractC0288lZza = interfaceC12940lApplovin.zza();
                    interfaceC12940lApplovin.yandex(abstractC0288lZza, object);
                    unsafe.putObject(obj, j, abstractC0288lZza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                Signature(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!smaato(object2)) {
                AbstractC0288l abstractC0288lZza2 = interfaceC12940lApplovin.zza();
                interfaceC12940lApplovin.yandex(abstractC0288lZza2, object2);
                unsafe.putObject(obj, j, abstractC0288lZza2);
                object2 = abstractC0288lZza2;
            }
            interfaceC12940lApplovin.yandex(object2, object);
        }
    }

    @Override // defpackage.InterfaceC12940l
    public final boolean purchase(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < this.admob) {
            int i6 = this.mopub[i3];
            int iIsPro = this.isPro(i6);
            int[] iArr = this.yandex;
            int i7 = iArr[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i5) {
                if (i8 != 1048575) {
                    i4 = smaato.getInt(obj, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i5;
                i2 = i4;
            }
            C3661l c3661l = this;
            Object obj2 = obj;
            if ((268435456 & iIsPro) == 0 || c3661l.adcel(obj2, i6, i, i2, i9)) {
                int iFirebase = firebase(iIsPro);
                if (iFirebase != 9 && iFirebase != 17) {
                    if (iFirebase != 27) {
                        if (iFirebase == 60 || iFirebase == 68) {
                            if (!c3661l.tapsense(iArr[i6], i6, obj2) || c3661l.applovin(i6).purchase(AbstractC1823l.subs(iIsPro & 1048575, obj2))) {
                                i3++;
                                this = c3661l;
                                obj = obj2;
                                i5 = i;
                                i4 = i2;
                            }
                        } else if (iFirebase != 49) {
                            if (iFirebase != 50) {
                                continue;
                            } else {
                                C12643l c12643l = (C12643l) AbstractC1823l.subs(iIsPro & 1048575, obj2);
                                if (!c12643l.isEmpty() && ((EnumC2564l) ((C14383l) c3661l.appmetrica(i6)).yandex.f12715l).f5574l == EnumC13744l.f26832l) {
                                    InterfaceC12940l interfaceC12940lYandex = null;
                                    for (Object obj3 : c12643l.values()) {
                                        if (interfaceC12940lYandex == null) {
                                            interfaceC12940lYandex = C8307l.crashlytics.yandex(obj3.getClass());
                                        }
                                        if (!interfaceC12940lYandex.purchase(obj3)) {
                                        }
                                    }
                                }
                            }
                            i3++;
                            this = c3661l;
                            obj = obj2;
                            i5 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) AbstractC1823l.subs(iIsPro & 1048575, obj2);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC12940l interfaceC12940lApplovin = c3661l.applovin(i6);
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            if (interfaceC12940lApplovin.purchase(list.get(i10))) {
                            }
                        }
                    }
                    i3++;
                    this = c3661l;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                } else if (!c3661l.adcel(obj2, i6, i, i2, i9) || c3661l.applovin(i6).purchase(AbstractC1823l.subs(iIsPro & 1048575, obj2))) {
                    i3++;
                    this = c3661l;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }

    public final void signatures(int i, Object obj, Object obj2) {
        if (ads(i, obj2)) {
            int iIsPro = isPro(i) & 1048575;
            Unsafe unsafe = smaato;
            long j = iIsPro;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.yandex[i];
                String string = obj2.toString();
                C11586l.amazon(String.valueOf(i2).length() + 38 + string.length(), i2, string);
                return;
            }
            InterfaceC12940l interfaceC12940lApplovin = applovin(i);
            if (!ads(i, obj)) {
                if (smaato(object)) {
                    AbstractC0288l abstractC0288lZza = interfaceC12940lApplovin.zza();
                    interfaceC12940lApplovin.yandex(abstractC0288lZza, object);
                    unsafe.putObject(obj, j, abstractC0288lZza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                subscription(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!smaato(object2)) {
                AbstractC0288l abstractC0288lZza2 = interfaceC12940lApplovin.zza();
                interfaceC12940lApplovin.yandex(abstractC0288lZza2, object2);
                unsafe.putObject(obj, j, abstractC0288lZza2);
                object2 = abstractC0288lZza2;
            }
            interfaceC12940lApplovin.yandex(object2, object);
        }
    }

    public final boolean startapp(AbstractC0288l abstractC0288l, AbstractC0288l abstractC0288l2, int i) {
        return ads(i, abstractC0288l) == ads(i, abstractC0288l2);
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final void m1404strictfp(int i, Object obj, Object obj2, int i2) {
        smaato.putObject(obj, isPro(i2) & 1048575, obj2);
        Signature(i, i2, obj);
    }

    /* JADX WARN: Code duplicated, block: B:136:0x021d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x01d1 A[SYNTHETIC] */
    @Override // defpackage.InterfaceC12940l
    public final boolean subs(AbstractC0288l abstractC0288l, AbstractC0288l abstractC0288l2) {
        boolean zYandex;
        int i = 0;
        while (true) {
            int[] iArr = this.yandex;
            if (i < iArr.length) {
                int iIsPro = isPro(i);
                int iFirebase = firebase(iIsPro);
                if (iFirebase <= 50 || iFirebase >= 69) {
                    long j = iIsPro & 1048575;
                    switch (iFirebase) {
                        case 0:
                            if (startapp(abstractC0288l, abstractC0288l2, i)) {
                                AbstractC6809l abstractC6809l = AbstractC1823l.crashlytics;
                                if (Double.doubleToLongBits(abstractC6809l.isPro(j, abstractC0288l)) != Double.doubleToLongBits(abstractC6809l.isPro(j, abstractC0288l2))) {
                                }
                            }
                            break;
                        case 1:
                            if (startapp(abstractC0288l, abstractC0288l2, i)) {
                                AbstractC6809l abstractC6809l2 = AbstractC1823l.crashlytics;
                                if (Float.floatToIntBits(abstractC6809l2.billing(j, abstractC0288l)) != Float.floatToIntBits(abstractC6809l2.billing(j, abstractC0288l2))) {
                                }
                            }
                            break;
                        case 2:
                            if (!startapp(abstractC0288l, abstractC0288l2, i) || AbstractC1823l.mopub(j, abstractC0288l) != AbstractC1823l.mopub(j, abstractC0288l2)) {
                            }
                            break;
                        case 3:
                            if (!startapp(abstractC0288l, abstractC0288l2, i) || AbstractC1823l.mopub(j, abstractC0288l) != AbstractC1823l.mopub(j, abstractC0288l2)) {
                            }
                            break;
                        case 4:
                            if (!startapp(abstractC0288l, abstractC0288l2, i) || AbstractC1823l.purchase(j, abstractC0288l) != AbstractC1823l.purchase(j, abstractC0288l2)) {
                            }
                            break;
                        case 5:
                            if (!startapp(abstractC0288l, abstractC0288l2, i) || AbstractC1823l.mopub(j, abstractC0288l) != AbstractC1823l.mopub(j, abstractC0288l2)) {
                            }
                            break;
                        case 6:
                            if (!startapp(abstractC0288l, abstractC0288l2, i) || AbstractC1823l.purchase(j, abstractC0288l) != AbstractC1823l.purchase(j, abstractC0288l2)) {
                            }
                            break;
                        case 7:
                            if (startapp(abstractC0288l, abstractC0288l2, i)) {
                                AbstractC6809l abstractC6809l3 = AbstractC1823l.crashlytics;
                                if (abstractC6809l3.amazon(j, abstractC0288l) != abstractC6809l3.amazon(j, abstractC0288l2)) {
                                }
                            }
                            break;
                        case 8:
                            if (!startapp(abstractC0288l, abstractC0288l2, i) || !AbstractC9626l.yandex(AbstractC1823l.subs(j, abstractC0288l), AbstractC1823l.subs(j, abstractC0288l2))) {
                            }
                            break;
                        case 9:
                            if (!startapp(abstractC0288l, abstractC0288l2, i) || !AbstractC9626l.yandex(AbstractC1823l.subs(j, abstractC0288l), AbstractC1823l.subs(j, abstractC0288l2))) {
                            }
                            break;
                        case 10:
                            if (!startapp(abstractC0288l, abstractC0288l2, i) || !AbstractC9626l.yandex(AbstractC1823l.subs(j, abstractC0288l), AbstractC1823l.subs(j, abstractC0288l2))) {
                            }
                            break;
                        case 11:
                            if (!startapp(abstractC0288l, abstractC0288l2, i) || AbstractC1823l.purchase(j, abstractC0288l) != AbstractC1823l.purchase(j, abstractC0288l2)) {
                            }
                            break;
                        case 12:
                            if (!startapp(abstractC0288l, abstractC0288l2, i) || AbstractC1823l.purchase(j, abstractC0288l) != AbstractC1823l.purchase(j, abstractC0288l2)) {
                            }
                            break;
                        case 13:
                            if (!startapp(abstractC0288l, abstractC0288l2, i) || AbstractC1823l.purchase(j, abstractC0288l) != AbstractC1823l.purchase(j, abstractC0288l2)) {
                            }
                            break;
                        case 14:
                            if (!startapp(abstractC0288l, abstractC0288l2, i) || AbstractC1823l.mopub(j, abstractC0288l) != AbstractC1823l.mopub(j, abstractC0288l2)) {
                            }
                            break;
                        case 15:
                            if (!startapp(abstractC0288l, abstractC0288l2, i) || AbstractC1823l.purchase(j, abstractC0288l) != AbstractC1823l.purchase(j, abstractC0288l2)) {
                            }
                            break;
                        case 16:
                            if (!startapp(abstractC0288l, abstractC0288l2, i) || AbstractC1823l.mopub(j, abstractC0288l) != AbstractC1823l.mopub(j, abstractC0288l2)) {
                            }
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            if (!startapp(abstractC0288l, abstractC0288l2, i) || !AbstractC9626l.yandex(AbstractC1823l.subs(j, abstractC0288l), AbstractC1823l.subs(j, abstractC0288l2))) {
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
                            zYandex = AbstractC9626l.yandex(AbstractC1823l.subs(j, abstractC0288l), AbstractC1823l.subs(j, abstractC0288l2));
                            if (zYandex) {
                            }
                            break;
                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                            zYandex = AbstractC9626l.yandex(AbstractC1823l.subs(j, abstractC0288l), AbstractC1823l.subs(j, abstractC0288l2));
                            if (zYandex) {
                            }
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
                            if (AbstractC1823l.purchase(j2, abstractC0288l) == AbstractC1823l.purchase(j2, abstractC0288l2) && AbstractC9626l.yandex(AbstractC1823l.subs(j, abstractC0288l), AbstractC1823l.subs(j, abstractC0288l2))) {
                            }
                            break;
                        default:
                            continue;
                    }
                }
                i += 3;
            } else {
                int i2 = this.subs;
                while (true) {
                    int[] iArr2 = this.mopub;
                    if (i2 < iArr2.length) {
                        int i3 = iArr2[i2];
                        long j3 = iArr[i3 + 2] & 1048575;
                        if (AbstractC1823l.purchase(j3, abstractC0288l) == AbstractC1823l.purchase(j3, abstractC0288l2)) {
                            if (!tapsense(0, i3, abstractC0288l)) {
                                long jIsPro = isPro(i3) & 1048575;
                                if (!AbstractC9626l.yandex(AbstractC1823l.subs(jIsPro, abstractC0288l), AbstractC1823l.subs(jIsPro, abstractC0288l2))) {
                                }
                            }
                            i2++;
                        }
                    } else if (abstractC0288l.zzc.equals(abstractC0288l2.zzc)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void subscription(int i, Object obj) {
        int i2 = this.yandex[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        AbstractC1823l.billing(j, obj, (1 << (i2 >>> 20)) | AbstractC1823l.purchase(j, obj));
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final Object m1405synchronized(int i, int i2, Object obj) {
        InterfaceC12940l interfaceC12940lApplovin = applovin(i2);
        if (!tapsense(i, i2, obj)) {
            return interfaceC12940lApplovin.zza();
        }
        Object object = smaato.getObject(obj, isPro(i2) & 1048575);
        if (smaato(object)) {
            return object;
        }
        AbstractC0288l abstractC0288lZza = interfaceC12940lApplovin.zza();
        if (object != null) {
            interfaceC12940lApplovin.yandex(abstractC0288lZza, object);
        }
        return abstractC0288lZza;
    }

    public final boolean tapsense(int i, int i2, Object obj) {
        return AbstractC1823l.purchase((long) (this.yandex[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final Object m1406throws(int i, Object obj) {
        InterfaceC12940l interfaceC12940lApplovin = applovin(i);
        int iIsPro = isPro(i) & 1048575;
        if (!ads(i, obj)) {
            return interfaceC12940lApplovin.zza();
        }
        Object object = smaato.getObject(obj, iIsPro);
        if (smaato(object)) {
            return object;
        }
        AbstractC0288l abstractC0288lZza = interfaceC12940lApplovin.zza();
        if (object != null) {
            interfaceC12940lApplovin.yandex(abstractC0288lZza, object);
        }
        return abstractC0288lZza;
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final Object m1407volatile(Object obj, int i, Object obj2, C8565l c8565l, Object obj3) {
        C1037l c1037lInmobi;
        int i2 = this.yandex[i];
        Object objSubs = AbstractC1823l.subs(isPro(i) & 1048575, obj);
        if (objSubs == null || (c1037lInmobi = inmobi(i)) == null) {
            return obj2;
        }
        C5991l c5991l = ((C14383l) appmetrica(i)).yandex;
        Iterator it = ((C12643l) objSubs).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!c1037lInmobi.yandex(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    c8565l.getClass();
                    obj2 = C8565l.signatures(obj3);
                }
                int iLoadAd = C14383l.loadAd(c5991l, entry.getKey(), entry.getValue());
                C2530l c2530l = AbstractC15619l.f30516l;
                byte[] bArr = new byte[iLoadAd];
                boolean z = AbstractC10908l.loadAd;
                C8716l c8716l = new C8716l(bArr, iLoadAd);
                try {
                    C14383l.yandex(c8716l, c5991l, entry.getKey(), entry.getValue());
                    if (c8716l.ad() > 0) {
                        C8339l.smaato("Did not write as much data as expected.");
                        return null;
                    }
                    if (c8716l.ad() < 0) {
                        C8339l.smaato("Wrote more data than expected.");
                        return null;
                    }
                    C2530l c2530l2 = new C2530l(bArr);
                    c8565l.getClass();
                    ((C10096l) obj2).amazon((i2 << 3) | 2, c2530l2);
                    it.remove();
                } catch (IOException e) {
                    C11467l.metrica(e);
                    return null;
                }
            }
        }
        return obj2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // defpackage.InterfaceC12940l
    public final void yandex(Object obj, Object obj2) {
        Object obj3;
        remoteconfig(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.yandex;
            if (i >= iArr.length) {
                AbstractC9626l.loadAd(obj, obj2);
                return;
            }
            int iIsPro = isPro(i);
            int i2 = 1048575 & iIsPro;
            int iFirebase = firebase(iIsPro);
            int i3 = iArr[i];
            long j = i2;
            switch (iFirebase) {
                case 0:
                    if (!ads(i, obj2)) {
                        obj3 = obj;
                    } else {
                        AbstractC6809l abstractC6809l = AbstractC1823l.crashlytics;
                        obj3 = obj;
                        abstractC6809l.smaato(obj3, j, abstractC6809l.isPro(j, obj2));
                        subscription(i, obj3);
                    }
                    break;
                case 1:
                    if (ads(i, obj2)) {
                        AbstractC6809l abstractC6809l2 = AbstractC1823l.crashlytics;
                        abstractC6809l2.subs(obj, j, abstractC6809l2.billing(j, obj2));
                        subscription(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (ads(i, obj2)) {
                        AbstractC1823l.admob(j, AbstractC1823l.mopub(j, obj2), obj);
                        subscription(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (ads(i, obj2)) {
                        AbstractC1823l.admob(j, AbstractC1823l.mopub(j, obj2), obj);
                        subscription(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (ads(i, obj2)) {
                        AbstractC1823l.billing(j, obj, AbstractC1823l.purchase(j, obj2));
                        subscription(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (ads(i, obj2)) {
                        AbstractC1823l.admob(j, AbstractC1823l.mopub(j, obj2), obj);
                        subscription(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (ads(i, obj2)) {
                        AbstractC1823l.billing(j, obj, AbstractC1823l.purchase(j, obj2));
                        subscription(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (ads(i, obj2)) {
                        AbstractC6809l abstractC6809l3 = AbstractC1823l.crashlytics;
                        abstractC6809l3.purchase(obj, j, abstractC6809l3.amazon(j, obj2));
                        subscription(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (ads(i, obj2)) {
                        AbstractC1823l.isPro(j, obj, AbstractC1823l.subs(j, obj2));
                        subscription(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    signatures(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (ads(i, obj2)) {
                        AbstractC1823l.isPro(j, obj, AbstractC1823l.subs(j, obj2));
                        subscription(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (ads(i, obj2)) {
                        AbstractC1823l.billing(j, obj, AbstractC1823l.purchase(j, obj2));
                        subscription(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (ads(i, obj2)) {
                        AbstractC1823l.billing(j, obj, AbstractC1823l.purchase(j, obj2));
                        subscription(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (ads(i, obj2)) {
                        AbstractC1823l.billing(j, obj, AbstractC1823l.purchase(j, obj2));
                        subscription(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (ads(i, obj2)) {
                        AbstractC1823l.admob(j, AbstractC1823l.mopub(j, obj2), obj);
                        subscription(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (ads(i, obj2)) {
                        AbstractC1823l.billing(j, obj, AbstractC1823l.purchase(j, obj2));
                        subscription(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (ads(i, obj2)) {
                        AbstractC1823l.admob(j, AbstractC1823l.mopub(j, obj2), obj);
                        subscription(i, obj);
                    }
                    obj3 = obj;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    signatures(i, obj, obj2);
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
                    InterfaceC9971l interfaceC9971lLicense = (InterfaceC9971l) AbstractC1823l.subs(j, obj);
                    InterfaceC9971l interfaceC9971l = (InterfaceC9971l) AbstractC1823l.subs(j, obj2);
                    int size = interfaceC9971lLicense.size();
                    int size2 = interfaceC9971l.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AbstractC1277l) interfaceC9971lLicense).f3328l) {
                            interfaceC9971lLicense = interfaceC9971lLicense.license(size2 + size);
                        }
                        interfaceC9971lLicense.addAll(interfaceC9971l);
                    }
                    if (size > 0) {
                        interfaceC9971l = interfaceC9971lLicense;
                    }
                    AbstractC1823l.isPro(j, obj, interfaceC9971l);
                    obj3 = obj;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    C8565l c8565l = AbstractC9626l.yandex;
                    AbstractC1823l.isPro(j, obj, C4269l.startapp(AbstractC1823l.subs(j, obj), AbstractC1823l.subs(j, obj2)));
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
                    if (tapsense(i3, i, obj2)) {
                        AbstractC1823l.isPro(j, obj, AbstractC1823l.subs(j, obj2));
                        Signature(i3, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    premium(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (tapsense(i3, i, obj2)) {
                        AbstractC1823l.isPro(j, obj, AbstractC1823l.subs(j, obj2));
                        Signature(i3, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    premium(i, obj, obj2);
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

    @Override // defpackage.InterfaceC12940l
    public final AbstractC0288l zza() {
        return ((AbstractC0288l) this.purchase).subs();
    }
}
