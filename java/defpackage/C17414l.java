package defpackage;

import androidx.car.app.hardware.common.CarZone;
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

/* JADX INFO: renamed from: lٗۛۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17414l implements InterfaceC12353l {
    public final int admob;
    public final int amazon;
    public final boolean billing;
    public final int crashlytics;
    public final C6096l firebase;
    public final C6162l isPro;
    public final Object[] loadAd;
    public final int[] mopub;
    public final AbstractC1251l purchase;
    public final int subs;
    public final int[] yandex;
    public static final int[] smaato = new int[0];
    public static final Unsafe remoteconfig = AbstractC10611l.subs();

    public C17414l(int[] iArr, Object[] objArr, int i, int i2, AbstractC1251l abstractC1251l, int[] iArr2, int i3, int i4, C6162l c6162l, C6096l c6096l) {
        this.yandex = iArr;
        this.loadAd = objArr;
        this.crashlytics = i;
        this.amazon = i2;
        boolean z = false;
        if (c6096l != null && (abstractC1251l instanceof AbstractC13398l)) {
            z = true;
        }
        this.billing = z;
        this.mopub = iArr2;
        this.admob = i3;
        this.subs = i4;
        this.isPro = c6162l;
        this.firebase = c6096l;
        this.purchase = abstractC1251l;
    }

    public static C2886l Signature(Object obj) {
        AbstractC15603l abstractC15603l = (AbstractC15603l) obj;
        C2886l c2886l = abstractC15603l.zzc;
        if (c2886l != C2886l.billing) {
            return c2886l;
        }
        C2886l c2886lLoadAd = C2886l.loadAd();
        abstractC15603l.zzc = c2886lLoadAd;
        return c2886lLoadAd;
    }

    public static boolean ads(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC15603l) {
            return ((AbstractC15603l) obj).firebase();
        }
        return true;
    }

    public static int advert(int i) {
        return (i >>> 20) & 255;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0274  */
    /* JADX WARN: Code duplicated, block: B:126:0x0277  */
    /* JADX WARN: Code duplicated, block: B:129:0x0290  */
    /* JADX WARN: Code duplicated, block: B:130:0x0293  */
    /* JADX WARN: Code duplicated, block: B:171:0x035d  */
    /* JADX WARN: Code duplicated, block: B:186:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b5  */
    public static C17414l license(C9025l c9025l, C6162l c6162l, C6096l c6096l) {
        int i;
        int iCharAt;
        int i2;
        int[] iArr;
        int i3;
        int i4;
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
        int i16;
        int i17;
        Object[] objArr;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Field fieldM4391throws;
        char cCharAt9;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Object obj;
        Field fieldM4391throws2;
        int i28;
        Object obj2;
        Field fieldM4391throws3;
        int i29;
        char cCharAt10;
        int i30;
        char cCharAt11;
        int i31;
        char cCharAt12;
        int i32;
        char cCharAt13;
        if (!(c9025l instanceof C9025l)) {
            C18725l.loadAd();
            return null;
        }
        String str = c9025l.loadAd;
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
                cCharAt13 = str.charAt(i35);
                if (cCharAt13 < 55296) {
                    break;
                }
                i36 |= (cCharAt13 & 8191) << i37;
                i37 += 13;
                i35 = i32;
            }
            iCharAt2 = i36 | (cCharAt13 << i37);
            i35 = i32;
        }
        if (iCharAt2 == 0) {
            i4 = 0;
            i6 = 0;
            iCharAt = 0;
            i3 = 0;
            i5 = 0;
            i7 = 0;
            iArr = smaato;
            i2 = 0;
        } else {
            int i38 = i35 + 1;
            int iCharAt3 = str.charAt(i35);
            if (iCharAt3 >= 55296) {
                int i39 = iCharAt3 & 8191;
                int i40 = 13;
                while (true) {
                    i15 = i38 + 1;
                    cCharAt8 = str.charAt(i38);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt8 & 8191) << i40;
                    i40 += 13;
                    i38 = i15;
                }
                iCharAt3 = i39 | (cCharAt8 << i40);
                i38 = i15;
            }
            int i41 = i38 + 1;
            int iCharAt4 = str.charAt(i38);
            if (iCharAt4 >= 55296) {
                int i42 = iCharAt4 & 8191;
                int i43 = 13;
                while (true) {
                    i14 = i41 + 1;
                    cCharAt7 = str.charAt(i41);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt7 & 8191) << i43;
                    i43 += 13;
                    i41 = i14;
                }
                iCharAt4 = i42 | (cCharAt7 << i43);
                i41 = i14;
            }
            int i44 = i41 + 1;
            int iCharAt5 = str.charAt(i41);
            if (iCharAt5 >= 55296) {
                int i45 = iCharAt5 & 8191;
                int i46 = 13;
                while (true) {
                    i13 = i44 + 1;
                    cCharAt6 = str.charAt(i44);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt6 & 8191) << i46;
                    i46 += 13;
                    i44 = i13;
                }
                iCharAt5 = i45 | (cCharAt6 << i46);
                i44 = i13;
            }
            int i47 = i44 + 1;
            int iCharAt6 = str.charAt(i44);
            if (iCharAt6 >= 55296) {
                int i48 = iCharAt6 & 8191;
                int i49 = 13;
                while (true) {
                    i12 = i47 + 1;
                    cCharAt5 = str.charAt(i47);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt5 & 8191) << i49;
                    i49 += 13;
                    i47 = i12;
                }
                iCharAt6 = i48 | (cCharAt5 << i49);
                i47 = i12;
            }
            int i50 = i47 + 1;
            iCharAt = str.charAt(i47);
            if (iCharAt >= 55296) {
                int i51 = iCharAt & 8191;
                int i52 = 13;
                while (true) {
                    i11 = i50 + 1;
                    cCharAt4 = str.charAt(i50);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt4 & 8191) << i52;
                    i52 += 13;
                    i50 = i11;
                }
                iCharAt = i51 | (cCharAt4 << i52);
                i50 = i11;
            }
            int i53 = i50 + 1;
            int iCharAt7 = str.charAt(i50);
            if (iCharAt7 >= 55296) {
                int i54 = iCharAt7 & 8191;
                int i55 = 13;
                while (true) {
                    i10 = i53 + 1;
                    cCharAt3 = str.charAt(i53);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt3 & 8191) << i55;
                    i55 += 13;
                    i53 = i10;
                }
                iCharAt7 = i54 | (cCharAt3 << i55);
                i53 = i10;
            }
            int i56 = i53 + 1;
            int iCharAt8 = str.charAt(i53);
            if (iCharAt8 >= 55296) {
                int i57 = iCharAt8 & 8191;
                int i58 = 13;
                while (true) {
                    i9 = i56 + 1;
                    cCharAt2 = str.charAt(i56);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt2 & 8191) << i58;
                    i58 += 13;
                    i56 = i9;
                }
                iCharAt8 = i57 | (cCharAt2 << i58);
                i56 = i9;
            }
            int i59 = i56 + 1;
            int iCharAt9 = str.charAt(i56);
            if (iCharAt9 >= 55296) {
                int i60 = iCharAt9 & 8191;
                int i61 = 13;
                while (true) {
                    i8 = i59 + 1;
                    cCharAt = str.charAt(i59);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i60 |= (cCharAt & 8191) << i61;
                    i61 += 13;
                    i59 = i8;
                }
                iCharAt9 = i60 | (cCharAt << i61);
                i59 = i8;
            }
            int i62 = iCharAt3 + iCharAt3 + iCharAt4;
            i2 = iCharAt3;
            i35 = i59;
            iArr = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i63 = iCharAt7;
            i3 = iCharAt5;
            i4 = i63;
            i5 = iCharAt6;
            i6 = i62;
            i7 = iCharAt9;
        }
        Unsafe unsafe = remoteconfig;
        Object[] objArr2 = c9025l.crashlytics;
        Class<?> cls = c9025l.yandex.getClass();
        int i64 = i7 + i4;
        int i65 = iCharAt + iCharAt;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[i65];
        int i66 = i64;
        int i67 = i7;
        int i68 = 0;
        int i69 = 0;
        while (i35 < length) {
            int i70 = i35 + 1;
            int iCharAt10 = str.charAt(i35);
            if (iCharAt10 >= i33) {
                int i71 = iCharAt10 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i31 = i72 + 1;
                    cCharAt12 = str.charAt(i72);
                    i16 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i71 |= (cCharAt12 & 8191) << i73;
                    i73 += 13;
                    i72 = i31;
                    length = i16;
                }
                iCharAt10 = i71 | (cCharAt12 << i73);
                i17 = i31;
            } else {
                i16 = length;
                i17 = i70;
            }
            int i74 = i17 + 1;
            int iCharAt11 = str.charAt(i17);
            Object[] objArr4 = objArr2;
            char c = 55296;
            if (iCharAt11 >= 55296) {
                int i75 = iCharAt11 & 8191;
                int i76 = 13;
                while (true) {
                    i30 = i74 + 1;
                    cCharAt11 = str.charAt(i74);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i75 |= (cCharAt11 & 8191) << i76;
                    i76 += 13;
                    i74 = i30;
                    c = 55296;
                }
                iCharAt11 = i75 | (cCharAt11 << i76);
                i74 = i30;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i68] = i69;
                i68++;
            }
            int i77 = iCharAt11 & 255;
            int i78 = iCharAt10;
            int i79 = iCharAt11 & 2048;
            if (i77 >= 51) {
                int i80 = i74 + 1;
                int iCharAt12 = str.charAt(i74);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i81 = iCharAt12 & 8191;
                    int i82 = i80;
                    int i83 = 13;
                    while (true) {
                        i29 = i82 + 1;
                        cCharAt10 = str.charAt(i82);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i81 |= (cCharAt10 & 8191) << i83;
                        i83 += 13;
                        i82 = i29;
                        c2 = 55296;
                    }
                    iCharAt12 = i81 | (cCharAt10 << i83);
                    i24 = i29;
                } else {
                    i24 = i80;
                }
                int i84 = i24;
                int i85 = i77 - 51;
                int i86 = iCharAt12;
                if (i85 == 9 || i85 == 17) {
                    i25 = i6 + 1;
                    int i87 = i69 / 3;
                    objArr3[i87 + i87 + 1] = objArr4[i6];
                } else {
                    if (i85 != 12) {
                        i26 = i79;
                    } else if (c9025l.yandex() == 1 || i79 != 0) {
                        i25 = i6 + 1;
                        int i88 = i69 / 3;
                        objArr3[i88 + i88 + 1] = objArr4[i6];
                    } else {
                        i26 = 0;
                    }
                    i27 = i86 + i86;
                    i79 = i26;
                    obj = objArr4[i27];
                    if (obj instanceof Field) {
                        fieldM4391throws2 = (Field) obj;
                    } else {
                        fieldM4391throws2 = m4391throws(cls, (String) obj);
                        objArr4[i27] = fieldM4391throws2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM4391throws2);
                    i28 = i27 + 1;
                    obj2 = objArr4[i28];
                    if (obj2 instanceof Field) {
                        fieldM4391throws3 = (Field) obj2;
                    } else {
                        fieldM4391throws3 = m4391throws(cls, (String) obj2);
                        objArr4[i28] = fieldM4391throws3;
                    }
                    i19 = i84;
                    i22 = iObjectFieldOffset3;
                    i18 = 55296;
                    objArr = objArr3;
                    i2 = i2;
                    cls = cls;
                    i21 = 0;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM4391throws3);
                }
                i6 = i25;
                i26 = i79;
                i27 = i86 + i86;
                i79 = i26;
                obj = objArr4[i27];
                if (obj instanceof Field) {
                    fieldM4391throws2 = (Field) obj;
                } else {
                    fieldM4391throws2 = m4391throws(cls, (String) obj);
                    objArr4[i27] = fieldM4391throws2;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM4391throws2);
                i28 = i27 + 1;
                obj2 = objArr4[i28];
                if (obj2 instanceof Field) {
                    fieldM4391throws3 = (Field) obj2;
                } else {
                    fieldM4391throws3 = m4391throws(cls, (String) obj2);
                    objArr4[i28] = fieldM4391throws3;
                }
                i19 = i84;
                i22 = iObjectFieldOffset4;
                i18 = 55296;
                objArr = objArr3;
                i2 = i2;
                cls = cls;
                i21 = 0;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM4391throws3);
            } else {
                int i89 = i6 + 1;
                Field fieldM4391throws4 = m4391throws(cls, (String) objArr4[i6]);
                objArr = objArr3;
                if (i77 == 9 || i77 == 17) {
                    int i90 = i69 / 3;
                    objArr[i90 + i90 + 1] = fieldM4391throws4.getType();
                } else {
                    if (i77 != 27) {
                        if (i77 == 49) {
                            i6 += 2;
                            i23 = 1;
                        } else if (i77 == 12 || i77 == 30 || i77 == 44) {
                            i2 = i2;
                            if (c9025l.yandex() == 1 || i79 != 0) {
                                i6 += 2;
                                int i91 = i69 / 3;
                                objArr[i91 + i91 + 1] = objArr4[i89];
                                cls = cls;
                            } else {
                                cls = cls;
                                i6 = i89;
                                i79 = 0;
                            }
                        } else if (i77 == 50) {
                            int i92 = i6 + 2;
                            i67++;
                            iArr[i67] = i69;
                            int i93 = i69 / 3;
                            int i94 = i93 + i93;
                            objArr[i94] = objArr4[i89];
                            if (i79 != 0) {
                                i6 += 3;
                                objArr[i94 + 1] = objArr4[i92];
                            } else {
                                i6 = i92;
                                i79 = 0;
                            }
                            i2 = i2;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4391throws4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt11 & 4096) != 0 || i77 > 17) {
                            i18 = 55296;
                            i19 = i74;
                            i20 = 0;
                        } else {
                            int i95 = i74 + 1;
                            int iCharAt13 = str.charAt(i74);
                            if (iCharAt13 >= 55296) {
                                int i96 = iCharAt13 & 8191;
                                int i97 = 13;
                                while (true) {
                                    i19 = i95 + 1;
                                    cCharAt9 = str.charAt(i95);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i96 |= (cCharAt9 & 8191) << i97;
                                    i97 += 13;
                                    i95 = i19;
                                }
                                iCharAt13 = i96 | (cCharAt9 << i97);
                            } else {
                                i19 = i95;
                            }
                            int i98 = (iCharAt13 / 32) + i2 + i2;
                            Object obj3 = objArr4[i98];
                            if (obj3 instanceof Field) {
                                fieldM4391throws = (Field) obj3;
                            } else {
                                fieldM4391throws = m4391throws(cls, (String) obj3);
                                objArr4[i98] = fieldM4391throws;
                            }
                            i20 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM4391throws);
                            i18 = 55296;
                        }
                        if (i77 >= 18 && i77 <= 49) {
                            iArr[i66] = iObjectFieldOffset;
                            i66++;
                        }
                        i21 = i20;
                        i22 = iObjectFieldOffset;
                    } else {
                        i23 = 1;
                        i6 += 2;
                    }
                    int i99 = i69 / 3;
                    objArr[i99 + i99 + i23] = objArr4[i89];
                    cls = cls;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4391throws4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt11 & 4096) != 0) {
                        i18 = 55296;
                        i19 = i74;
                        i20 = 0;
                    } else {
                        i18 = 55296;
                        i19 = i74;
                        i20 = 0;
                    }
                    if (i77 >= 18) {
                        iArr[i66] = iObjectFieldOffset;
                        i66++;
                    }
                    i21 = i20;
                    i22 = iObjectFieldOffset;
                }
                cls = cls;
                i6 = i89;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4391throws4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt11 & 4096) != 0) {
                    i18 = 55296;
                    i19 = i74;
                    i20 = 0;
                } else {
                    i18 = 55296;
                    i19 = i74;
                    i20 = 0;
                }
                if (i77 >= 18) {
                    iArr[i66] = iObjectFieldOffset;
                    i66++;
                }
                i21 = i20;
                i22 = iObjectFieldOffset;
            }
            int i100 = i79;
            int i101 = i69 + 1;
            iArr2[i69] = i78;
            int i102 = i69 + 2;
            String str2 = str;
            iArr2[i101] = ((iCharAt11 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? 536870912 : 0) | ((iCharAt11 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 268435456 : 0) | (i100 != 0 ? RecyclerView.UNDEFINED_DURATION : 0) | (i77 << 20) | i22;
            i69 += 3;
            iArr2[i102] = (i21 << 20) | iObjectFieldOffset2;
            cls = cls;
            objArr2 = objArr4;
            i33 = i18;
            length = i16;
            objArr3 = objArr;
            i2 = i2;
            i35 = i19;
            str = str2;
        }
        return new C17414l(iArr2, objArr3, i3, i5, c9025l.yandex, iArr, i7, i64, c6162l, c6096l);
    }

    public static int pro(long j, Object obj) {
        return ((Integer) AbstractC10611l.admob(j, obj)).intValue();
    }

    public static long signatures(long j, Object obj) {
        return ((Long) AbstractC10611l.admob(j, obj)).longValue();
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static Field m4391throws(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
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
            throw new RuntimeException(sbLicense.toString());
        }
    }

    public final int ad(int i, int i2) {
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

    public final boolean adcel(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return startapp(i, obj);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0366  */
    /* JADX WARN: Code duplicated, block: B:190:0x0489  */
    /* JADX WARN: Code duplicated, block: B:223:0x057b  */
    /* JADX WARN: Code duplicated, block: B:226:0x0588  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    @Override // defpackage.InterfaceC12353l
    public final int admob(AbstractC1251l abstractC1251l) {
        int i;
        int iYandex;
        int iLoadAd;
        int iYandex2;
        int iAdmob;
        int iYandex3;
        int iLoadAd2;
        int i2;
        int iYandex4;
        int i3;
        int iLoadAd3;
        int iAdmob2;
        int iYandex5;
        int size;
        int iVip;
        int iYandex6;
        int iYandex7;
        int iYandex8;
        int size2;
        int iYandex9;
        int iLoadAd4;
        int iYandex10;
        int iLoadAd5;
        int iYandex11;
        int iAdmob3;
        int iPro;
        int iYandex12;
        C17414l c17414l = this;
        Unsafe unsafe = remoteconfig;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int iIsVip = 0;
        while (true) {
            int[] iArr = c17414l.yandex;
            if (i6 < iArr.length) {
                int iIsVip2 = c17414l.isVip(i6);
                int iAdvert = advert(iIsVip2);
                int i8 = iArr[i6];
                int i9 = iArr[i6 + 2];
                int i10 = i9 & i4;
                if (iAdvert <= 17) {
                    if (i10 != i5) {
                        i7 = i10 == i4 ? 0 : unsafe.getInt(abstractC1251l, i10);
                        i5 = i10;
                    }
                    i = 1 << (i9 >>> 20);
                } else {
                    i = 0;
                }
                int i11 = iIsVip2 & i4;
                if (iAdvert >= EnumC2874l.f6239l.f6242l) {
                    EnumC2874l.f6238l.getClass();
                }
                long j = i11;
                switch (iAdvert) {
                    case 0:
                        if (c17414l.adcel(abstractC1251l, i6, i5, i7, i)) {
                            iIsVip = AbstractC9029l.isVip(i8 << 3, 8, iIsVip);
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 1:
                        if (c17414l.adcel(abstractC1251l, i6, i5, i7, i)) {
                            iIsVip = AbstractC9029l.isVip(i8 << 3, 4, iIsVip);
                        }
                        c17414l = this;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 2:
                        if (c17414l.adcel(abstractC1251l, i6, i5, i7, i)) {
                            long j2 = unsafe.getLong(abstractC1251l, j);
                            iYandex = C9747l.yandex(i8 << 3);
                            iLoadAd = C9747l.loadAd(j2);
                            iIsVip += iLoadAd + iYandex;
                        }
                        c17414l = this;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 3:
                        if (c17414l.adcel(abstractC1251l, i6, i5, i7, i)) {
                            long j3 = unsafe.getLong(abstractC1251l, j);
                            iYandex = C9747l.yandex(i8 << 3);
                            iLoadAd = C9747l.loadAd(j3);
                            iIsVip += iLoadAd + iYandex;
                        }
                        c17414l = this;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 4:
                        if (c17414l.adcel(abstractC1251l, i6, i5, i7, i)) {
                            long j4 = unsafe.getInt(abstractC1251l, j);
                            iYandex = C9747l.yandex(i8 << 3);
                            iLoadAd = C9747l.loadAd(j4);
                            iIsVip += iLoadAd + iYandex;
                        }
                        c17414l = this;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 5:
                        if (c17414l.adcel(abstractC1251l, i6, i5, i7, i)) {
                            iIsVip = AbstractC9029l.isVip(i8 << 3, 8, iIsVip);
                        }
                        c17414l = this;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 6:
                        if (c17414l.adcel(abstractC1251l, i6, i5, i7, i)) {
                            iIsVip = AbstractC9029l.isVip(i8 << 3, 4, iIsVip);
                        }
                        c17414l = this;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 7:
                        if (c17414l.adcel(abstractC1251l, i6, i5, i7, i)) {
                            iIsVip = AbstractC9029l.isVip(i8 << 3, 1, iIsVip);
                        }
                        c17414l = this;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 8:
                        if (c17414l.adcel(abstractC1251l, i6, i5, i7, i)) {
                            int i12 = i8 << 3;
                            Object object = unsafe.getObject(abstractC1251l, j);
                            if (object instanceof AbstractC1096l) {
                                iYandex2 = C9747l.yandex(i12);
                                iAdmob = ((AbstractC1096l) object).admob();
                                iIsVip = AbstractC9029l.signatures(iAdmob, iAdmob, iYandex2, iIsVip);
                            } else {
                                iYandex = C9747l.yandex(i12);
                                iLoadAd = C9747l.ads((String) object);
                                iIsVip += iLoadAd + iYandex;
                            }
                        }
                        c17414l = this;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 9:
                        if (c17414l.adcel(abstractC1251l, i6, i5, i7, i)) {
                            Object object2 = unsafe.getObject(abstractC1251l, j);
                            InterfaceC12353l interfaceC12353lApplovin = c17414l.applovin(i6);
                            C6162l c6162l = AbstractC17663l.yandex;
                            iYandex3 = C9747l.yandex(i8 << 3);
                            iLoadAd2 = ((AbstractC1251l) object2).loadAd(interfaceC12353lApplovin);
                            iIsVip = AbstractC9029l.signatures(iLoadAd2, iLoadAd2, iYandex3, iIsVip);
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 10:
                        if (c17414l.adcel(abstractC1251l, i6, i5, i7, i)) {
                            AbstractC1096l abstractC1096l = (AbstractC1096l) unsafe.getObject(abstractC1251l, j);
                            iYandex2 = C9747l.yandex(i8 << 3);
                            iAdmob = abstractC1096l.admob();
                            iIsVip = AbstractC9029l.signatures(iAdmob, iAdmob, iYandex2, iIsVip);
                        }
                        c17414l = this;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 11:
                        if (c17414l.adcel(abstractC1251l, i6, i5, i7, i)) {
                            i2 = unsafe.getInt(abstractC1251l, j);
                            iYandex4 = C9747l.yandex(i8 << 3);
                            iIsVip = AbstractC9029l.isVip(i2, iYandex4, iIsVip);
                        }
                        c17414l = this;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 12:
                        if (c17414l.adcel(abstractC1251l, i6, i5, i7, i)) {
                            long j5 = unsafe.getInt(abstractC1251l, j);
                            iYandex = C9747l.yandex(i8 << 3);
                            iLoadAd = C9747l.loadAd(j5);
                            iIsVip += iLoadAd + iYandex;
                        }
                        c17414l = this;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 13:
                        if (c17414l.adcel(abstractC1251l, i6, i5, i7, i)) {
                            iIsVip = AbstractC9029l.isVip(i8 << 3, 4, iIsVip);
                        }
                        c17414l = this;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 14:
                        if (c17414l.adcel(abstractC1251l, i6, i5, i7, i)) {
                            iIsVip = AbstractC9029l.isVip(i8 << 3, 8, iIsVip);
                        }
                        c17414l = this;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 15:
                        if (c17414l.adcel(abstractC1251l, i6, i5, i7, i)) {
                            int i13 = unsafe.getInt(abstractC1251l, j);
                            iYandex4 = C9747l.yandex(i8 << 3);
                            i2 = (i13 >> 31) ^ (i13 + i13);
                            iIsVip = AbstractC9029l.isVip(i2, iYandex4, iIsVip);
                        }
                        c17414l = this;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 16:
                        if (c17414l.adcel(abstractC1251l, i6, i5, i7, i)) {
                            long j6 = unsafe.getLong(abstractC1251l, j);
                            iYandex = C9747l.yandex(i8 << 3);
                            iLoadAd = C9747l.loadAd((j6 >> 63) ^ (j6 + j6));
                            iIsVip += iLoadAd + iYandex;
                        }
                        c17414l = this;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        if (c17414l.adcel(abstractC1251l, i6, i5, i7, i)) {
                            AbstractC1251l abstractC1251l2 = (AbstractC1251l) unsafe.getObject(abstractC1251l, j);
                            InterfaceC12353l interfaceC12353lApplovin2 = c17414l.applovin(i6);
                            int iYandex13 = C9747l.yandex(i8 << 3);
                            i3 = iYandex13 + iYandex13;
                            iLoadAd3 = abstractC1251l2.loadAd(interfaceC12353lApplovin2);
                            iAdmob2 = iLoadAd3 + i3;
                            iIsVip += iAdmob2;
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        iAdmob2 = AbstractC17663l.admob(i8, (List) unsafe.getObject(abstractC1251l, j));
                        iIsVip += iAdmob2;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        iAdmob2 = AbstractC17663l.mopub(i8, (List) unsafe.getObject(abstractC1251l, j));
                        iIsVip += iAdmob2;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 20:
                        List list = (List) unsafe.getObject(abstractC1251l, j);
                        C6162l c6162l2 = AbstractC17663l.yandex;
                        if (list.size() == 0) {
                            iYandex5 = 0;
                        } else {
                            iYandex5 = (C9747l.yandex(i8 << 3) * list.size()) + AbstractC17663l.isPro(list);
                        }
                        iIsVip += iYandex5;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 21:
                        List list2 = (List) unsafe.getObject(abstractC1251l, j);
                        C6162l c6162l3 = AbstractC17663l.yandex;
                        size = list2.size();
                        if (size == 0) {
                            iYandex7 = 0;
                        } else {
                            iVip = AbstractC17663l.vip(list2);
                            iYandex6 = C9747l.yandex(i8 << 3);
                            iYandex7 = (iYandex6 * size) + iVip;
                        }
                        iIsVip += iYandex7;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 22:
                        List list3 = (List) unsafe.getObject(abstractC1251l, j);
                        C6162l c6162l4 = AbstractC17663l.yandex;
                        size = list3.size();
                        if (size == 0) {
                            iYandex7 = 0;
                        } else {
                            iVip = AbstractC17663l.subs(list3);
                            iYandex6 = C9747l.yandex(i8 << 3);
                            iYandex7 = (iYandex6 * size) + iVip;
                        }
                        iIsVip += iYandex7;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 23:
                        iAdmob2 = AbstractC17663l.admob(i8, (List) unsafe.getObject(abstractC1251l, j));
                        iIsVip += iAdmob2;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                        iAdmob2 = AbstractC17663l.mopub(i8, (List) unsafe.getObject(abstractC1251l, j));
                        iIsVip += iAdmob2;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case Maneuver.TYPE_FORK_LEFT /* 25 */:
                        List list4 = (List) unsafe.getObject(abstractC1251l, j);
                        C6162l c6162l5 = AbstractC17663l.yandex;
                        int size3 = list4.size();
                        if (size3 == 0) {
                            iYandex5 = 0;
                        } else {
                            iYandex5 = (C9747l.yandex(i8 << 3) + 1) * size3;
                        }
                        iIsVip += iYandex5;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                        List list5 = (List) unsafe.getObject(abstractC1251l, j);
                        C6162l c6162l6 = AbstractC17663l.yandex;
                        int size4 = list5.size();
                        if (size4 == 0) {
                            iYandex7 = 0;
                        } else {
                            iYandex7 = C9747l.yandex(i8 << 3) * size4;
                            for (int i14 = 0; i14 < size4; i14++) {
                                Object obj = list5.get(i14);
                                if (obj instanceof AbstractC1096l) {
                                    int iAdmob4 = ((AbstractC1096l) obj).admob();
                                    iYandex7 = AbstractC9029l.isVip(iAdmob4, iAdmob4, iYandex7);
                                } else {
                                    iYandex7 = C9747l.ads((String) obj) + iYandex7;
                                }
                            }
                        }
                        iIsVip += iYandex7;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                        List list6 = (List) unsafe.getObject(abstractC1251l, j);
                        InterfaceC12353l interfaceC12353lApplovin3 = c17414l.applovin(i6);
                        C6162l c6162l7 = AbstractC17663l.yandex;
                        int size5 = list6.size();
                        if (size5 == 0) {
                            iYandex8 = 0;
                        } else {
                            iYandex8 = C9747l.yandex(i8 << 3) * size5;
                            for (int i15 = 0; i15 < size5; i15++) {
                                int iLoadAd6 = ((AbstractC1251l) list6.get(i15)).loadAd(interfaceC12353lApplovin3);
                                iYandex8 = AbstractC9029l.isVip(iLoadAd6, iLoadAd6, iYandex8);
                            }
                        }
                        iIsVip += iYandex8;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        List list7 = (List) unsafe.getObject(abstractC1251l, j);
                        C6162l c6162l8 = AbstractC17663l.yandex;
                        int size6 = list7.size();
                        if (size6 == 0) {
                            iYandex7 = 0;
                        } else {
                            iYandex7 = C9747l.yandex(i8 << 3) * size6;
                            for (int i16 = 0; i16 < list7.size(); i16++) {
                                int iAdmob5 = ((AbstractC1096l) list7.get(i16)).admob();
                                iYandex7 = AbstractC9029l.isVip(iAdmob5, iAdmob5, iYandex7);
                            }
                        }
                        iIsVip += iYandex7;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                        List list8 = (List) unsafe.getObject(abstractC1251l, j);
                        C6162l c6162l9 = AbstractC17663l.yandex;
                        size = list8.size();
                        if (size == 0) {
                            iYandex7 = 0;
                        } else {
                            iVip = AbstractC17663l.remoteconfig(list8);
                            iYandex6 = C9747l.yandex(i8 << 3);
                            iYandex7 = (iYandex6 * size) + iVip;
                        }
                        iIsVip += iYandex7;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 30:
                        List list9 = (List) unsafe.getObject(abstractC1251l, j);
                        C6162l c6162l10 = AbstractC17663l.yandex;
                        size = list9.size();
                        if (size == 0) {
                            iYandex7 = 0;
                        } else {
                            iVip = AbstractC17663l.billing(list9);
                            iYandex6 = C9747l.yandex(i8 << 3);
                            iYandex7 = (iYandex6 * size) + iVip;
                        }
                        iIsVip += iYandex7;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 31:
                        iAdmob2 = AbstractC17663l.mopub(i8, (List) unsafe.getObject(abstractC1251l, j));
                        iIsVip += iAdmob2;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 32:
                        iAdmob2 = AbstractC17663l.admob(i8, (List) unsafe.getObject(abstractC1251l, j));
                        iIsVip += iAdmob2;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                        List list10 = (List) unsafe.getObject(abstractC1251l, j);
                        C6162l c6162l11 = AbstractC17663l.yandex;
                        size = list10.size();
                        if (size == 0) {
                            iYandex7 = 0;
                        } else {
                            iVip = AbstractC17663l.firebase(list10);
                            iYandex6 = C9747l.yandex(i8 << 3);
                            iYandex7 = (iYandex6 * size) + iVip;
                        }
                        iIsVip += iYandex7;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                        List list11 = (List) unsafe.getObject(abstractC1251l, j);
                        C6162l c6162l12 = AbstractC17663l.yandex;
                        size = list11.size();
                        if (size == 0) {
                            iYandex7 = 0;
                        } else {
                            iVip = AbstractC17663l.smaato(list11);
                            iYandex6 = C9747l.yandex(i8 << 3);
                            iYandex7 = (iYandex6 * size) + iVip;
                        }
                        iIsVip += iYandex7;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                        List list12 = (List) unsafe.getObject(abstractC1251l, j);
                        C6162l c6162l13 = AbstractC17663l.yandex;
                        size2 = list12.size() * 8;
                        if (size2 > 0) {
                            iYandex9 = C9747l.yandex(i8 << 3);
                            iIsVip = AbstractC9029l.signatures(size2, iYandex9, size2, iIsVip);
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case Maneuver.TYPE_STRAIGHT /* 36 */:
                        List list13 = (List) unsafe.getObject(abstractC1251l, j);
                        C6162l c6162l14 = AbstractC17663l.yandex;
                        size2 = list13.size() * 4;
                        if (size2 > 0) {
                            iYandex9 = C9747l.yandex(i8 << 3);
                            iIsVip = AbstractC9029l.signatures(size2, iYandex9, size2, iIsVip);
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                        size2 = AbstractC17663l.isPro((List) unsafe.getObject(abstractC1251l, j));
                        if (size2 > 0) {
                            iYandex9 = C9747l.yandex(i8 << 3);
                            iIsVip = AbstractC9029l.signatures(size2, iYandex9, size2, iIsVip);
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                        size2 = AbstractC17663l.vip((List) unsafe.getObject(abstractC1251l, j));
                        if (size2 > 0) {
                            iYandex9 = C9747l.yandex(i8 << 3);
                            iIsVip = AbstractC9029l.signatures(size2, iYandex9, size2, iIsVip);
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                        size2 = AbstractC17663l.subs((List) unsafe.getObject(abstractC1251l, j));
                        if (size2 > 0) {
                            iYandex9 = C9747l.yandex(i8 << 3);
                            iIsVip = AbstractC9029l.signatures(size2, iYandex9, size2, iIsVip);
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                        List list14 = (List) unsafe.getObject(abstractC1251l, j);
                        C6162l c6162l15 = AbstractC17663l.yandex;
                        size2 = list14.size() * 8;
                        if (size2 > 0) {
                            iYandex9 = C9747l.yandex(i8 << 3);
                            iIsVip = AbstractC9029l.signatures(size2, iYandex9, size2, iIsVip);
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                        List list15 = (List) unsafe.getObject(abstractC1251l, j);
                        C6162l c6162l16 = AbstractC17663l.yandex;
                        size2 = list15.size() * 4;
                        if (size2 > 0) {
                            iYandex9 = C9747l.yandex(i8 << 3);
                            iIsVip = AbstractC9029l.signatures(size2, iYandex9, size2, iIsVip);
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                        List list16 = (List) unsafe.getObject(abstractC1251l, j);
                        C6162l c6162l17 = AbstractC17663l.yandex;
                        size2 = list16.size();
                        if (size2 > 0) {
                            iYandex9 = C9747l.yandex(i8 << 3);
                            iIsVip = AbstractC9029l.signatures(size2, iYandex9, size2, iIsVip);
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                        size2 = AbstractC17663l.remoteconfig((List) unsafe.getObject(abstractC1251l, j));
                        if (size2 > 0) {
                            iYandex9 = C9747l.yandex(i8 << 3);
                            iIsVip = AbstractC9029l.signatures(size2, iYandex9, size2, iIsVip);
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                        size2 = AbstractC17663l.billing((List) unsafe.getObject(abstractC1251l, j));
                        if (size2 > 0) {
                            iYandex9 = C9747l.yandex(i8 << 3);
                            iIsVip = AbstractC9029l.signatures(size2, iYandex9, size2, iIsVip);
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                        List list17 = (List) unsafe.getObject(abstractC1251l, j);
                        C6162l c6162l18 = AbstractC17663l.yandex;
                        size2 = list17.size() * 4;
                        if (size2 > 0) {
                            iYandex9 = C9747l.yandex(i8 << 3);
                            iIsVip = AbstractC9029l.signatures(size2, iYandex9, size2, iIsVip);
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                        List list18 = (List) unsafe.getObject(abstractC1251l, j);
                        C6162l c6162l19 = AbstractC17663l.yandex;
                        size2 = list18.size() * 8;
                        if (size2 > 0) {
                            iYandex9 = C9747l.yandex(i8 << 3);
                            iIsVip = AbstractC9029l.signatures(size2, iYandex9, size2, iIsVip);
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                        size2 = AbstractC17663l.firebase((List) unsafe.getObject(abstractC1251l, j));
                        if (size2 > 0) {
                            iYandex9 = C9747l.yandex(i8 << 3);
                            iIsVip = AbstractC9029l.signatures(size2, iYandex9, size2, iIsVip);
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 48:
                        size2 = AbstractC17663l.smaato((List) unsafe.getObject(abstractC1251l, j));
                        if (size2 > 0) {
                            iYandex9 = C9747l.yandex(i8 << 3);
                            iIsVip = AbstractC9029l.signatures(size2, iYandex9, size2, iIsVip);
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                        List list19 = (List) unsafe.getObject(abstractC1251l, j);
                        InterfaceC12353l interfaceC12353lApplovin4 = c17414l.applovin(i6);
                        C6162l c6162l20 = AbstractC17663l.yandex;
                        int size7 = list19.size();
                        if (size7 == 0) {
                            iLoadAd4 = 0;
                        } else {
                            iLoadAd4 = 0;
                            for (int i17 = 0; i17 < size7; i17++) {
                                AbstractC1251l abstractC1251l3 = (AbstractC1251l) list19.get(i17);
                                int iYandex14 = C9747l.yandex(i8 << 3);
                                iLoadAd4 += abstractC1251l3.loadAd(interfaceC12353lApplovin4) + iYandex14 + iYandex14;
                            }
                        }
                        iIsVip += iLoadAd4;
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        Object object3 = unsafe.getObject(abstractC1251l, j);
                        int i18 = i6 / 3;
                        C17935l c17935l = (C17935l) object3;
                        if (c17414l.loadAd[i18 + i18] != null) {
                            C18725l.loadAd();
                            return 0;
                        }
                        if (c17935l.isEmpty()) {
                            continue;
                        } else {
                            Iterator it = c17935l.entrySet().iterator();
                            if (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                entry.getKey();
                                entry.getValue();
                                throw null;
                            }
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 51:
                        if (c17414l.subscription(i8, i6, abstractC1251l)) {
                            iIsVip = AbstractC9029l.isVip(i8 << 3, 8, iIsVip);
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 52:
                        if (c17414l.subscription(i8, i6, abstractC1251l)) {
                            iIsVip = AbstractC9029l.isVip(i8 << 3, 4, iIsVip);
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 53:
                        if (c17414l.subscription(i8, i6, abstractC1251l)) {
                            long jSignatures = signatures(j, abstractC1251l);
                            iYandex10 = C9747l.yandex(i8 << 3);
                            iLoadAd5 = C9747l.loadAd(jSignatures);
                            iIsVip += iLoadAd5 + iYandex10;
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 54:
                        if (c17414l.subscription(i8, i6, abstractC1251l)) {
                            long jSignatures2 = signatures(j, abstractC1251l);
                            iYandex10 = C9747l.yandex(i8 << 3);
                            iLoadAd5 = C9747l.loadAd(jSignatures2);
                            iIsVip += iLoadAd5 + iYandex10;
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 55:
                        if (c17414l.subscription(i8, i6, abstractC1251l)) {
                            long jPro = pro(j, abstractC1251l);
                            iYandex10 = C9747l.yandex(i8 << 3);
                            iLoadAd5 = C9747l.loadAd(jPro);
                            iIsVip += iLoadAd5 + iYandex10;
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 56:
                        if (c17414l.subscription(i8, i6, abstractC1251l)) {
                            iIsVip = AbstractC9029l.isVip(i8 << 3, 8, iIsVip);
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 57:
                        if (c17414l.subscription(i8, i6, abstractC1251l)) {
                            iIsVip = AbstractC9029l.isVip(i8 << 3, 4, iIsVip);
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 58:
                        if (c17414l.subscription(i8, i6, abstractC1251l)) {
                            iIsVip = AbstractC9029l.isVip(i8 << 3, 1, iIsVip);
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 59:
                        if (c17414l.subscription(i8, i6, abstractC1251l)) {
                            int i19 = i8 << 3;
                            Object object4 = unsafe.getObject(abstractC1251l, j);
                            if (object4 instanceof AbstractC1096l) {
                                iYandex11 = C9747l.yandex(i19);
                                iAdmob3 = ((AbstractC1096l) object4).admob();
                                iIsVip = AbstractC9029l.signatures(iAdmob3, iAdmob3, iYandex11, iIsVip);
                            } else {
                                iYandex10 = C9747l.yandex(i19);
                                iLoadAd5 = C9747l.ads((String) object4);
                                iIsVip += iLoadAd5 + iYandex10;
                            }
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 60:
                        if (c17414l.subscription(i8, i6, abstractC1251l)) {
                            Object object5 = unsafe.getObject(abstractC1251l, j);
                            InterfaceC12353l interfaceC12353lApplovin5 = c17414l.applovin(i6);
                            C6162l c6162l21 = AbstractC17663l.yandex;
                            iYandex3 = C9747l.yandex(i8 << 3);
                            iLoadAd2 = ((AbstractC1251l) object5).loadAd(interfaceC12353lApplovin5);
                            iIsVip = AbstractC9029l.signatures(iLoadAd2, iLoadAd2, iYandex3, iIsVip);
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 61:
                        if (c17414l.subscription(i8, i6, abstractC1251l)) {
                            AbstractC1096l abstractC1096l2 = (AbstractC1096l) unsafe.getObject(abstractC1251l, j);
                            iYandex11 = C9747l.yandex(i8 << 3);
                            iAdmob3 = abstractC1096l2.admob();
                            iIsVip = AbstractC9029l.signatures(iAdmob3, iAdmob3, iYandex11, iIsVip);
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 62:
                        if (c17414l.subscription(i8, i6, abstractC1251l)) {
                            iPro = pro(j, abstractC1251l);
                            iYandex12 = C9747l.yandex(i8 << 3);
                            iIsVip = AbstractC9029l.isVip(iPro, iYandex12, iIsVip);
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 63:
                        if (c17414l.subscription(i8, i6, abstractC1251l)) {
                            long jPro2 = pro(j, abstractC1251l);
                            iYandex10 = C9747l.yandex(i8 << 3);
                            iLoadAd5 = C9747l.loadAd(jPro2);
                            iIsVip += iLoadAd5 + iYandex10;
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                        if (c17414l.subscription(i8, i6, abstractC1251l)) {
                            iIsVip = AbstractC9029l.isVip(i8 << 3, 4, iIsVip);
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 65:
                        if (c17414l.subscription(i8, i6, abstractC1251l)) {
                            iIsVip = AbstractC9029l.isVip(i8 << 3, 8, iIsVip);
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 66:
                        if (c17414l.subscription(i8, i6, abstractC1251l)) {
                            int iPro2 = pro(j, abstractC1251l);
                            iYandex12 = C9747l.yandex(i8 << 3);
                            iPro = (iPro2 >> 31) ^ (iPro2 + iPro2);
                            iIsVip = AbstractC9029l.isVip(iPro, iYandex12, iIsVip);
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 67:
                        if (c17414l.subscription(i8, i6, abstractC1251l)) {
                            long jSignatures3 = signatures(j, abstractC1251l);
                            iYandex10 = C9747l.yandex(i8 << 3);
                            iLoadAd5 = C9747l.loadAd((jSignatures3 >> 63) ^ (jSignatures3 + jSignatures3));
                            iIsVip += iLoadAd5 + iYandex10;
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    case 68:
                        if (c17414l.subscription(i8, i6, abstractC1251l)) {
                            AbstractC1251l abstractC1251l4 = (AbstractC1251l) unsafe.getObject(abstractC1251l, j);
                            InterfaceC12353l interfaceC12353lApplovin6 = c17414l.applovin(i6);
                            int iYandex15 = C9747l.yandex(i8 << 3);
                            i3 = iYandex15 + iYandex15;
                            iLoadAd3 = abstractC1251l4.loadAd(interfaceC12353lApplovin6);
                            iAdmob2 = iLoadAd3 + i3;
                            iIsVip += iAdmob2;
                        }
                        i6 += 3;
                        i4 = 1048575;
                        break;
                    default:
                        i6 += 3;
                        i4 = 1048575;
                        break;
                }
            } else {
                int iYandex16 = 0;
                int iYandex17 = ((AbstractC15603l) abstractC1251l).zzc.yandex() + iIsVip;
                if (!c17414l.billing) {
                    return iYandex17;
                }
                C5519l c5519l = ((AbstractC13398l) abstractC1251l).zzb;
                int i20 = c5519l.yandex.f26665l;
                int i21 = 0;
                while (true) {
                    C13639l c13639l = c5519l.yandex;
                    if (i21 >= i20) {
                        for (Map.Entry entry2 : c13639l.yandex()) {
                            iYandex16 = C5519l.yandex((AbstractC1552l) entry2.getKey(), entry2.getValue()) + iYandex16;
                        }
                        return iYandex17 + iYandex16;
                    }
                    C0900l c0900lCrashlytics = c13639l.crashlytics(i21);
                    iYandex16 = C5519l.yandex((AbstractC1552l) c0900lCrashlytics.f2553l, c0900lCrashlytics.f2552l) + iYandex16;
                    i21++;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC12353l
    public final void amazon(Object obj, byte[] bArr, int i, int i2, C13275l c13275l) throws C18299l {
        tapsense(obj, bArr, i, i2, 0, c13275l);
    }

    public final InterfaceC12353l applovin(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.loadAd;
        InterfaceC12353l interfaceC12353l = (InterfaceC12353l) objArr[i3];
        if (interfaceC12353l != null) {
            return interfaceC12353l;
        }
        InterfaceC12353l interfaceC12353lYandex = C13940l.crashlytics.yandex((Class) objArr[i3 + 1]);
        objArr[i3] = interfaceC12353lYandex;
        return interfaceC12353lYandex;
    }

    public final Object appmetrica(int i, Object obj) {
        InterfaceC12353l interfaceC12353lApplovin = applovin(i);
        int iIsVip = isVip(i) & 1048575;
        if (!startapp(i, obj)) {
            return interfaceC12353lApplovin.billing();
        }
        Object object = remoteconfig.getObject(obj, iIsVip);
        if (ads(object)) {
            return object;
        }
        Object objBilling = interfaceC12353lApplovin.billing();
        if (object != null) {
            interfaceC12353lApplovin.mopub(objBilling, object);
        }
        return objBilling;
    }

    @Override // defpackage.InterfaceC12353l
    public final Object billing() {
        return (AbstractC15603l) ((AbstractC15603l) this.purchase).remoteconfig(4, null);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00db A[PHI: r1
  0x00db: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.InterfaceC12353l
    public final int crashlytics(AbstractC15603l abstractC15603l) {
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
                int iHashCode = abstractC15603l.zzc.hashCode() + (i6 * 53);
                if (!this.billing) {
                    return iHashCode;
                }
                return ((AbstractC13398l) abstractC15603l).zzb.yandex.hashCode() + (iHashCode * 53);
            }
            int iIsVip = isVip(i5);
            int i7 = 1048575 & iIsVip;
            int iAdvert = advert(iIsVip);
            int i8 = iArr[i5];
            long j = i7;
            int i9 = 1237;
            int iHashCode2 = 37;
            switch (iAdvert) {
                case 0:
                    i = i6 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(AbstractC10611l.crashlytics.yandex(j, abstractC15603l));
                    Charset charset = AbstractC11565l.yandex;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i6 * 53;
                    iFloatToIntBits = Float.floatToIntBits(AbstractC10611l.crashlytics.crashlytics(j, abstractC15603l));
                    i6 = iFloatToIntBits + i2;
                    break;
                case 2:
                    i = i6 * 53;
                    jDoubleToLongBits = AbstractC10611l.billing(j, abstractC15603l);
                    Charset charset2 = AbstractC11565l.yandex;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i6 * 53;
                    jDoubleToLongBits = AbstractC10611l.billing(j, abstractC15603l);
                    Charset charset3 = AbstractC11565l.yandex;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i6 * 53;
                    iFloatToIntBits = AbstractC10611l.purchase(j, abstractC15603l);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 5:
                    i = i6 * 53;
                    jDoubleToLongBits = AbstractC10611l.billing(j, abstractC15603l);
                    Charset charset4 = AbstractC11565l.yandex;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i6 * 53;
                    iFloatToIntBits = AbstractC10611l.purchase(j, abstractC15603l);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 7:
                    i3 = i6 * 53;
                    boolean zRemoteconfig = AbstractC10611l.crashlytics.remoteconfig(j, abstractC15603l);
                    Charset charset5 = AbstractC11565l.yandex;
                    if (zRemoteconfig) {
                        i9 = 1231;
                    }
                    i6 = i9 + i3;
                    break;
                case 8:
                    i2 = i6 * 53;
                    iFloatToIntBits = ((String) AbstractC10611l.admob(j, abstractC15603l)).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 9:
                    i4 = i6 * 53;
                    Object objAdmob = AbstractC10611l.admob(j, abstractC15603l);
                    if (objAdmob != null) {
                        iHashCode2 = objAdmob.hashCode();
                    }
                    i6 = i4 + iHashCode2;
                    break;
                case 10:
                    i2 = i6 * 53;
                    iFloatToIntBits = AbstractC10611l.admob(j, abstractC15603l).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 11:
                    i2 = i6 * 53;
                    iFloatToIntBits = AbstractC10611l.purchase(j, abstractC15603l);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 12:
                    i2 = i6 * 53;
                    iFloatToIntBits = AbstractC10611l.purchase(j, abstractC15603l);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 13:
                    i2 = i6 * 53;
                    iFloatToIntBits = AbstractC10611l.purchase(j, abstractC15603l);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 14:
                    i = i6 * 53;
                    jDoubleToLongBits = AbstractC10611l.billing(j, abstractC15603l);
                    Charset charset6 = AbstractC11565l.yandex;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i6 * 53;
                    iFloatToIntBits = AbstractC10611l.purchase(j, abstractC15603l);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 16:
                    i = i6 * 53;
                    jDoubleToLongBits = AbstractC10611l.billing(j, abstractC15603l);
                    Charset charset7 = AbstractC11565l.yandex;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    i4 = i6 * 53;
                    Object objAdmob2 = AbstractC10611l.admob(j, abstractC15603l);
                    if (objAdmob2 != null) {
                        iHashCode2 = objAdmob2.hashCode();
                    }
                    i6 = i4 + iHashCode2;
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
                    iFloatToIntBits = AbstractC10611l.admob(j, abstractC15603l).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    i2 = i6 * 53;
                    iFloatToIntBits = AbstractC10611l.admob(j, abstractC15603l).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 51:
                    if (subscription(i8, i5, abstractC15603l)) {
                        i = i6 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) AbstractC10611l.admob(j, abstractC15603l)).doubleValue());
                        Charset charset8 = AbstractC11565l.yandex;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 52:
                    if (subscription(i8, i5, abstractC15603l)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) AbstractC10611l.admob(j, abstractC15603l)).floatValue());
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 53:
                    if (subscription(i8, i5, abstractC15603l)) {
                        i = i6 * 53;
                        jDoubleToLongBits = signatures(j, abstractC15603l);
                        Charset charset9 = AbstractC11565l.yandex;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 54:
                    if (subscription(i8, i5, abstractC15603l)) {
                        i = i6 * 53;
                        jDoubleToLongBits = signatures(j, abstractC15603l);
                        Charset charset10 = AbstractC11565l.yandex;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 55:
                    if (subscription(i8, i5, abstractC15603l)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = pro(j, abstractC15603l);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 56:
                    if (subscription(i8, i5, abstractC15603l)) {
                        i = i6 * 53;
                        jDoubleToLongBits = signatures(j, abstractC15603l);
                        Charset charset11 = AbstractC11565l.yandex;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 57:
                    if (subscription(i8, i5, abstractC15603l)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = pro(j, abstractC15603l);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 58:
                    if (subscription(i8, i5, abstractC15603l)) {
                        i3 = i6 * 53;
                        boolean zBooleanValue = ((Boolean) AbstractC10611l.admob(j, abstractC15603l)).booleanValue();
                        Charset charset12 = AbstractC11565l.yandex;
                        if (zBooleanValue) {
                            i9 = 1231;
                        }
                        i6 = i9 + i3;
                    }
                    break;
                case 59:
                    if (subscription(i8, i5, abstractC15603l)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = ((String) AbstractC10611l.admob(j, abstractC15603l)).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 60:
                    if (subscription(i8, i5, abstractC15603l)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = AbstractC10611l.admob(j, abstractC15603l).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 61:
                    if (subscription(i8, i5, abstractC15603l)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = AbstractC10611l.admob(j, abstractC15603l).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 62:
                    if (subscription(i8, i5, abstractC15603l)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = pro(j, abstractC15603l);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 63:
                    if (subscription(i8, i5, abstractC15603l)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = pro(j, abstractC15603l);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    if (subscription(i8, i5, abstractC15603l)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = pro(j, abstractC15603l);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 65:
                    if (subscription(i8, i5, abstractC15603l)) {
                        i = i6 * 53;
                        jDoubleToLongBits = signatures(j, abstractC15603l);
                        Charset charset13 = AbstractC11565l.yandex;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 66:
                    if (subscription(i8, i5, abstractC15603l)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = pro(j, abstractC15603l);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 67:
                    if (subscription(i8, i5, abstractC15603l)) {
                        i = i6 * 53;
                        jDoubleToLongBits = signatures(j, abstractC15603l);
                        Charset charset14 = AbstractC11565l.yandex;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 68:
                    if (subscription(i8, i5, abstractC15603l)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = AbstractC10611l.admob(j, abstractC15603l).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
            }
            i5 += 3;
        }
    }

    public final void firebase(int i, Object obj, Object obj2) {
        int[] iArr = this.yandex;
        int i2 = iArr[i];
        if (subscription(i2, i, obj2)) {
            int iIsVip = isVip(i) & 1048575;
            Unsafe unsafe = remoteconfig;
            long j = iIsVip;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            InterfaceC12353l interfaceC12353lApplovin = applovin(i);
            if (!subscription(i2, i, obj)) {
                if (ads(object)) {
                    Object objBilling = interfaceC12353lApplovin.billing();
                    interfaceC12353lApplovin.mopub(objBilling, object);
                    unsafe.putObject(obj, j, objBilling);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                AbstractC10611l.isPro(iArr[i + 2] & 1048575, obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!ads(object2)) {
                Object objBilling2 = interfaceC12353lApplovin.billing();
                interfaceC12353lApplovin.mopub(objBilling2, object2);
                unsafe.putObject(obj, j, objBilling2);
                object2 = objBilling2;
            }
            interfaceC12353lApplovin.mopub(object2, object);
        }
    }

    public final Object inmobi(int i, int i2, Object obj) {
        InterfaceC12353l interfaceC12353lApplovin = applovin(i2);
        if (!subscription(i, i2, obj)) {
            return interfaceC12353lApplovin.billing();
        }
        Object object = remoteconfig.getObject(obj, isVip(i2) & 1048575);
        if (ads(object)) {
            return object;
        }
        Object objBilling = interfaceC12353lApplovin.billing();
        if (object != null) {
            interfaceC12353lApplovin.mopub(objBilling, object);
        }
        return objBilling;
    }

    public final void isPro(int i, Object obj, Object obj2) {
        if (startapp(i, obj2)) {
            int iIsVip = isVip(i) & 1048575;
            Unsafe unsafe = remoteconfig;
            long j = iIsVip;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.yandex[i] + " is present but null: " + obj2.toString());
            }
            InterfaceC12353l interfaceC12353lApplovin = applovin(i);
            if (!startapp(i, obj)) {
                if (ads(object)) {
                    Object objBilling = interfaceC12353lApplovin.billing();
                    interfaceC12353lApplovin.mopub(objBilling, object);
                    unsafe.putObject(obj, j, objBilling);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                smaato(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!ads(object2)) {
                Object objBilling2 = interfaceC12353lApplovin.billing();
                interfaceC12353lApplovin.mopub(objBilling2, object2);
                unsafe.putObject(obj, j, objBilling2);
                object2 = objBilling2;
            }
            interfaceC12353lApplovin.mopub(object2, object);
        }
    }

    public final int isVip(int i) {
        return this.yandex[i + 1];
    }

    @Override // defpackage.InterfaceC12353l
    public final boolean loadAd(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.admob) {
            int i6 = this.mopub[i4];
            int[] iArr = this.yandex;
            int i7 = iArr[i6];
            int iIsVip = isVip(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = remoteconfig.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                int i11 = i3;
                i = i5;
                i2 = i11;
            }
            if ((268435456 & iIsVip) == 0 || adcel(obj, i6, i, i2, i10)) {
                int iAdvert = advert(iIsVip);
                if (iAdvert != 9 && iAdvert != 17) {
                    if (iAdvert != 27) {
                        if (iAdvert == 60 || iAdvert == 68) {
                            if (!subscription(i7, i6, obj) || applovin(i6).loadAd(AbstractC10611l.admob(iIsVip & 1048575, obj))) {
                            }
                        } else if (iAdvert != 49) {
                            if (iAdvert == 50 && !((C17935l) AbstractC10611l.admob(iIsVip & 1048575, obj)).isEmpty()) {
                                int i12 = i6 / 3;
                                throw AbstractC12589l.signatures(this.loadAd[i12 + i12]);
                            }
                        }
                        i4++;
                        i5 = i;
                        i3 = i2;
                    }
                    List list = (List) AbstractC10611l.admob(iIsVip & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC12353l interfaceC12353lApplovin = applovin(i6);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (interfaceC12353lApplovin.loadAd(list.get(i13))) {
                            }
                        }
                    }
                    i4++;
                    i5 = i;
                    i3 = i2;
                } else if (!adcel(obj, i6, i, i2, i10) || applovin(i6).loadAd(AbstractC10611l.admob(iIsVip & 1048575, obj))) {
                    i4++;
                    i5 = i;
                    i3 = i2;
                }
            }
        }
        return !this.billing || ((AbstractC13398l) obj).zzb.billing();
    }

    public final boolean metrica(AbstractC15603l abstractC15603l, AbstractC15603l abstractC15603l2, int i) {
        return startapp(i, abstractC15603l) == startapp(i, abstractC15603l2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.InterfaceC12353l
    public final void mopub(Object obj, Object obj2) {
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
                Object obj4 = obj;
                AbstractC17663l.startapp(obj4, obj2);
                if (this.billing) {
                    AbstractC17663l.metrica(obj4, obj2);
                    return;
                }
                return;
            }
            int iIsVip = isVip(i);
            int i2 = iIsVip & 1048575;
            int iAdvert = advert(iIsVip);
            int i3 = iArr[i];
            long j = i2;
            switch (iAdvert) {
                case 0:
                    if (!startapp(i, obj2)) {
                        obj3 = obj;
                    } else {
                        AbstractC6809l abstractC6809l = AbstractC10611l.crashlytics;
                        obj3 = obj;
                        abstractC6809l.admob(obj3, j, abstractC6809l.yandex(j, obj2));
                        smaato(i, obj3);
                    }
                    break;
                case 1:
                    if (startapp(i, obj2)) {
                        AbstractC6809l abstractC6809l2 = AbstractC10611l.crashlytics;
                        abstractC6809l2.firebase(obj, j, abstractC6809l2.crashlytics(j, obj2));
                        smaato(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (startapp(i, obj2)) {
                        AbstractC10611l.firebase(j, AbstractC10611l.billing(j, obj2), obj);
                        smaato(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (startapp(i, obj2)) {
                        AbstractC10611l.firebase(j, AbstractC10611l.billing(j, obj2), obj);
                        smaato(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (startapp(i, obj2)) {
                        AbstractC10611l.isPro(j, obj, AbstractC10611l.purchase(j, obj2));
                        smaato(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (startapp(i, obj2)) {
                        AbstractC10611l.firebase(j, AbstractC10611l.billing(j, obj2), obj);
                        smaato(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (startapp(i, obj2)) {
                        AbstractC10611l.isPro(j, obj, AbstractC10611l.purchase(j, obj2));
                        smaato(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (startapp(i, obj2)) {
                        AbstractC6809l abstractC6809l3 = AbstractC10611l.crashlytics;
                        abstractC6809l3.purchase(obj, j, abstractC6809l3.remoteconfig(j, obj2));
                        smaato(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (startapp(i, obj2)) {
                        AbstractC10611l.smaato(j, obj, AbstractC10611l.admob(j, obj2));
                        smaato(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    isPro(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (startapp(i, obj2)) {
                        AbstractC10611l.smaato(j, obj, AbstractC10611l.admob(j, obj2));
                        smaato(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (startapp(i, obj2)) {
                        AbstractC10611l.isPro(j, obj, AbstractC10611l.purchase(j, obj2));
                        smaato(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (startapp(i, obj2)) {
                        AbstractC10611l.isPro(j, obj, AbstractC10611l.purchase(j, obj2));
                        smaato(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (startapp(i, obj2)) {
                        AbstractC10611l.isPro(j, obj, AbstractC10611l.purchase(j, obj2));
                        smaato(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (startapp(i, obj2)) {
                        AbstractC10611l.firebase(j, AbstractC10611l.billing(j, obj2), obj);
                        smaato(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (startapp(i, obj2)) {
                        AbstractC10611l.isPro(j, obj, AbstractC10611l.purchase(j, obj2));
                        smaato(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (startapp(i, obj2)) {
                        AbstractC10611l.firebase(j, AbstractC10611l.billing(j, obj2), obj);
                        smaato(i, obj);
                    }
                    obj3 = obj;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    isPro(i, obj, obj2);
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
                    InterfaceC14009l interfaceC14009lPurchase = (InterfaceC14009l) AbstractC10611l.admob(j, obj);
                    InterfaceC14009l interfaceC14009l = (InterfaceC14009l) AbstractC10611l.admob(j, obj2);
                    int size = interfaceC14009lPurchase.size();
                    int size2 = interfaceC14009l.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AbstractC3486l) interfaceC14009lPurchase).f7371l) {
                            interfaceC14009lPurchase = interfaceC14009lPurchase.purchase(size2 + size);
                        }
                        interfaceC14009lPurchase.addAll(interfaceC14009l);
                    }
                    if (size > 0) {
                        interfaceC14009l = interfaceC14009lPurchase;
                    }
                    AbstractC10611l.smaato(j, obj, interfaceC14009l);
                    obj3 = obj;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    C6162l c6162l = AbstractC17663l.yandex;
                    AbstractC10611l.smaato(j, obj, C16222l.subs(AbstractC10611l.admob(j, obj), AbstractC10611l.admob(j, obj2)));
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
                    if (subscription(i3, i, obj2)) {
                        AbstractC10611l.smaato(j, obj, AbstractC10611l.admob(j, obj2));
                        AbstractC10611l.isPro(iArr[i + 2] & 1048575, obj, i3);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    firebase(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (subscription(i3, i, obj2)) {
                        AbstractC10611l.smaato(j, obj, AbstractC10611l.admob(j, obj2));
                        AbstractC10611l.isPro(iArr[i + 2] & 1048575, obj, i3);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    firebase(i, obj, obj2);
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

    public final C8042l premium(int i) {
        int i2 = i / 3;
        return (C8042l) this.loadAd[i2 + i2 + 1];
    }

    @Override // defpackage.InterfaceC12353l
    public final boolean purchase(AbstractC15603l abstractC15603l, AbstractC15603l abstractC15603l2) {
        boolean zPurchase;
        int i = 0;
        while (true) {
            int[] iArr = this.yandex;
            if (i < iArr.length) {
                int iIsVip = isVip(i);
                long j = iIsVip & 1048575;
                switch (advert(iIsVip)) {
                    case 0:
                        if (metrica(abstractC15603l, abstractC15603l2, i)) {
                            AbstractC6809l abstractC6809l = AbstractC10611l.crashlytics;
                            if (Double.doubleToLongBits(abstractC6809l.yandex(j, abstractC15603l)) == Double.doubleToLongBits(abstractC6809l.yandex(j, abstractC15603l2))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 1:
                        if (metrica(abstractC15603l, abstractC15603l2, i)) {
                            AbstractC6809l abstractC6809l2 = AbstractC10611l.crashlytics;
                            if (Float.floatToIntBits(abstractC6809l2.crashlytics(j, abstractC15603l)) == Float.floatToIntBits(abstractC6809l2.crashlytics(j, abstractC15603l2))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 2:
                        if (metrica(abstractC15603l, abstractC15603l2, i) && AbstractC10611l.billing(j, abstractC15603l) == AbstractC10611l.billing(j, abstractC15603l2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (metrica(abstractC15603l, abstractC15603l2, i) && AbstractC10611l.billing(j, abstractC15603l) == AbstractC10611l.billing(j, abstractC15603l2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (metrica(abstractC15603l, abstractC15603l2, i) && AbstractC10611l.purchase(j, abstractC15603l) == AbstractC10611l.purchase(j, abstractC15603l2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (metrica(abstractC15603l, abstractC15603l2, i) && AbstractC10611l.billing(j, abstractC15603l) == AbstractC10611l.billing(j, abstractC15603l2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (metrica(abstractC15603l, abstractC15603l2, i) && AbstractC10611l.purchase(j, abstractC15603l) == AbstractC10611l.purchase(j, abstractC15603l2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (metrica(abstractC15603l, abstractC15603l2, i)) {
                            AbstractC6809l abstractC6809l3 = AbstractC10611l.crashlytics;
                            if (abstractC6809l3.remoteconfig(j, abstractC15603l) == abstractC6809l3.remoteconfig(j, abstractC15603l2)) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 8:
                        if (metrica(abstractC15603l, abstractC15603l2, i) && AbstractC17663l.purchase(AbstractC10611l.admob(j, abstractC15603l), AbstractC10611l.admob(j, abstractC15603l2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (metrica(abstractC15603l, abstractC15603l2, i) && AbstractC17663l.purchase(AbstractC10611l.admob(j, abstractC15603l), AbstractC10611l.admob(j, abstractC15603l2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (metrica(abstractC15603l, abstractC15603l2, i) && AbstractC17663l.purchase(AbstractC10611l.admob(j, abstractC15603l), AbstractC10611l.admob(j, abstractC15603l2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (metrica(abstractC15603l, abstractC15603l2, i) && AbstractC10611l.purchase(j, abstractC15603l) == AbstractC10611l.purchase(j, abstractC15603l2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (metrica(abstractC15603l, abstractC15603l2, i) && AbstractC10611l.purchase(j, abstractC15603l) == AbstractC10611l.purchase(j, abstractC15603l2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (metrica(abstractC15603l, abstractC15603l2, i) && AbstractC10611l.purchase(j, abstractC15603l) == AbstractC10611l.purchase(j, abstractC15603l2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (metrica(abstractC15603l, abstractC15603l2, i) && AbstractC10611l.billing(j, abstractC15603l) == AbstractC10611l.billing(j, abstractC15603l2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (metrica(abstractC15603l, abstractC15603l2, i) && AbstractC10611l.purchase(j, abstractC15603l) == AbstractC10611l.purchase(j, abstractC15603l2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (metrica(abstractC15603l, abstractC15603l2, i) && AbstractC10611l.billing(j, abstractC15603l) == AbstractC10611l.billing(j, abstractC15603l2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        if (metrica(abstractC15603l, abstractC15603l2, i) && AbstractC17663l.purchase(AbstractC10611l.admob(j, abstractC15603l), AbstractC10611l.admob(j, abstractC15603l2))) {
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
                        zPurchase = AbstractC17663l.purchase(AbstractC10611l.admob(j, abstractC15603l), AbstractC10611l.admob(j, abstractC15603l2));
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        zPurchase = AbstractC17663l.purchase(AbstractC10611l.admob(j, abstractC15603l), AbstractC10611l.admob(j, abstractC15603l2));
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
                        if (AbstractC10611l.purchase(j2, abstractC15603l) == AbstractC10611l.purchase(j2, abstractC15603l2) && AbstractC17663l.purchase(AbstractC10611l.admob(j, abstractC15603l), AbstractC10611l.admob(j, abstractC15603l2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        continue;
                        i += 3;
                        break;
                }
                if (zPurchase) {
                    i += 3;
                }
            } else if (abstractC15603l.zzc.equals(abstractC15603l2.zzc)) {
                if (this.billing) {
                    return ((AbstractC13398l) abstractC15603l).zzb.equals(((AbstractC13398l) abstractC15603l2).zzb);
                }
                return true;
            }
        }
        return false;
    }

    public final void remoteconfig(int i, Object obj, Object obj2) {
        remoteconfig.putObject(obj, isVip(i) & 1048575, obj2);
        smaato(i, obj);
    }

    public final void smaato(int i, Object obj) {
        int i2 = this.yandex[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        AbstractC10611l.isPro(j, obj, (1 << (i2 >>> 20)) | AbstractC10611l.purchase(j, obj));
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f6 A[RETURN] */
    public final boolean startapp(int i, Object obj) {
        int i2 = this.yandex[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & AbstractC10611l.purchase(j, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iIsVip = isVip(i);
        long j2 = iIsVip & 1048575;
        switch (advert(iIsVip)) {
            case 0:
                if (Double.doubleToRawLongBits(AbstractC10611l.crashlytics.yandex(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(AbstractC10611l.crashlytics.crashlytics(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (AbstractC10611l.billing(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (AbstractC10611l.billing(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (AbstractC10611l.purchase(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (AbstractC10611l.billing(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (AbstractC10611l.purchase(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return AbstractC10611l.crashlytics.remoteconfig(j2, obj);
            case 8:
                Object objAdmob = AbstractC10611l.admob(j2, obj);
                if (objAdmob instanceof String) {
                    if (((String) objAdmob).isEmpty()) {
                        return false;
                    }
                    return true;
                }
                if (!(objAdmob instanceof AbstractC1096l)) {
                    C11983l.crashlytics();
                    return false;
                }
                if (AbstractC1096l.f3033l.equals(objAdmob)) {
                    return false;
                }
                return true;
            case 9:
                if (AbstractC10611l.admob(j2, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                if (AbstractC1096l.f3033l.equals(AbstractC10611l.admob(j2, obj))) {
                    return false;
                }
                return true;
            case 11:
                if (AbstractC10611l.purchase(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (AbstractC10611l.purchase(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (AbstractC10611l.purchase(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (AbstractC10611l.billing(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (AbstractC10611l.purchase(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (AbstractC10611l.billing(j2, obj) != 0) {
                    return true;
                }
                return false;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                if (AbstractC10611l.admob(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                C11983l.crashlytics();
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x023b A[LOOP:2: B:99:0x0235->B:101:0x023b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:102:0x0245  */
    /* JADX WARN: Code duplicated, block: B:103:0x0254  */
    /* JADX WARN: Code duplicated, block: B:104:0x0263  */
    /* JADX WARN: Code duplicated, block: B:105:0x0272  */
    /* JADX WARN: Code duplicated, block: B:106:0x0281  */
    /* JADX WARN: Code duplicated, block: B:107:0x0290  */
    /* JADX WARN: Code duplicated, block: B:108:0x029f  */
    /* JADX WARN: Code duplicated, block: B:109:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:110:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:111:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:112:0x02db  */
    /* JADX WARN: Code duplicated, block: B:113:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:114:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:115:0x0308  */
    /* JADX WARN: Code duplicated, block: B:116:0x0317  */
    /* JADX WARN: Code duplicated, block: B:118:0x0326  */
    /* JADX WARN: Code duplicated, block: B:119:0x0333  */
    /* JADX WARN: Code duplicated, block: B:120:0x0340  */
    /* JADX WARN: Code duplicated, block: B:121:0x034d  */
    /* JADX WARN: Code duplicated, block: B:122:0x035a  */
    /* JADX WARN: Code duplicated, block: B:123:0x0367  */
    /* JADX WARN: Code duplicated, block: B:130:0x0383 A[LOOP:3: B:128:0x037d->B:130:0x0383, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x0391  */
    /* JADX WARN: Code duplicated, block: B:138:0x03ae A[LOOP:4: B:136:0x03a8->B:138:0x03ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:146:0x03d4 A[LOOP:5: B:144:0x03ce->B:146:0x03d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:147:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:148:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:149:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:150:0x040c  */
    /* JADX WARN: Code duplicated, block: B:151:0x041a  */
    /* JADX WARN: Code duplicated, block: B:152:0x0428  */
    /* JADX WARN: Code duplicated, block: B:153:0x0436  */
    /* JADX WARN: Code duplicated, block: B:154:0x0444  */
    /* JADX WARN: Code duplicated, block: B:155:0x0452  */
    /* JADX WARN: Code duplicated, block: B:157:0x0459  */
    /* JADX WARN: Code duplicated, block: B:158:0x0466  */
    /* JADX WARN: Code duplicated, block: B:160:0x046d  */
    /* JADX WARN: Code duplicated, block: B:161:0x047e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0485  */
    /* JADX WARN: Code duplicated, block: B:164:0x0495  */
    /* JADX WARN: Code duplicated, block: B:166:0x049c  */
    /* JADX WARN: Code duplicated, block: B:167:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:169:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:170:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:172:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:173:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:175:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:176:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:178:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:179:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:181:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:182:0x0505  */
    /* JADX WARN: Code duplicated, block: B:184:0x050c  */
    /* JADX WARN: Code duplicated, block: B:186:0x0514  */
    /* JADX WARN: Code duplicated, block: B:187:0x051d  */
    /* JADX WARN: Code duplicated, block: B:188:0x0526  */
    /* JADX WARN: Code duplicated, block: B:190:0x052d  */
    /* JADX WARN: Code duplicated, block: B:191:0x053f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0546  */
    /* JADX WARN: Code duplicated, block: B:194:0x0551  */
    /* JADX WARN: Code duplicated, block: B:196:0x0558  */
    /* JADX WARN: Code duplicated, block: B:197:0x0562  */
    /* JADX WARN: Code duplicated, block: B:199:0x0569  */
    /* JADX WARN: Code duplicated, block: B:200:0x0573  */
    /* JADX WARN: Code duplicated, block: B:202:0x057a  */
    /* JADX WARN: Code duplicated, block: B:203:0x0584  */
    /* JADX WARN: Code duplicated, block: B:205:0x058b  */
    /* JADX WARN: Code duplicated, block: B:206:0x0595  */
    /* JADX WARN: Code duplicated, block: B:208:0x059c  */
    /* JADX WARN: Code duplicated, block: B:209:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:211:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:222:0x0212 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x05c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x05c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x05c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x05c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x05c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x05c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x05c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x05c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x05c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x05c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x05c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x05c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x05c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x05c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x05c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x05c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x05c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x05c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:49:0x0103  */
    /* JADX WARN: Code duplicated, block: B:50:0x010d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0113  */
    /* JADX WARN: Code duplicated, block: B:53:0x011d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0123  */
    /* JADX WARN: Code duplicated, block: B:56:0x0130  */
    /* JADX WARN: Code duplicated, block: B:58:0x0136  */
    /* JADX WARN: Code duplicated, block: B:59:0x0143  */
    /* JADX WARN: Code duplicated, block: B:61:0x0149  */
    /* JADX WARN: Code duplicated, block: B:63:0x0151  */
    /* JADX WARN: Code duplicated, block: B:64:0x015a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0163  */
    /* JADX WARN: Code duplicated, block: B:67:0x0169  */
    /* JADX WARN: Code duplicated, block: B:68:0x017f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0185  */
    /* JADX WARN: Code duplicated, block: B:71:0x0190  */
    /* JADX WARN: Code duplicated, block: B:73:0x0196  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:85:0x01da  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x020a  */
    /* JADX WARN: Code duplicated, block: B:94:0x021e  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.InterfaceC12353l
    public final void subs(Object obj, C0770l c0770l) throws C8413l {
        Map.Entry entry;
        Iterator it;
        boolean z;
        int i;
        int i2;
        Map.Entry entry2;
        int i3;
        long j;
        Object object;
        int i4;
        List list;
        int i5;
        int i6;
        List list2;
        InterfaceC12353l interfaceC12353lApplovin;
        int i7;
        int i8;
        List list3;
        int i9;
        boolean z2;
        int i10;
        List list4;
        InterfaceC12353l interfaceC12353lApplovin2;
        int i11;
        Object object2;
        C17414l c17414l = this;
        if (c17414l.billing) {
            C5519l c5519l = ((AbstractC13398l) obj).zzb;
            if (c5519l.yandex.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itCrashlytics = c5519l.crashlytics();
                entry = (Map.Entry) itCrashlytics.next();
                it = itCrashlytics;
            }
        } else {
            entry = null;
            it = null;
        }
        Unsafe unsafe = remoteconfig;
        int i12 = 0;
        int i13 = 1048575;
        int i14 = 0;
        while (true) {
            int[] iArr = c17414l.yandex;
            int length = iArr.length;
            C6096l c6096l = c17414l.firebase;
            if (i12 >= length) {
                while (entry != null) {
                    c6096l.getClass();
                    C6096l.purchase(c0770l, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                ((AbstractC15603l) obj).zzc.amazon(c0770l);
                return;
            }
            int iIsVip = c17414l.isVip(i12);
            int iAdvert = advert(iIsVip);
            int i15 = iArr[i12];
            if (iAdvert <= 17) {
                int i16 = iArr[i12 + 2];
                z = true;
                int i17 = i16 & 1048575;
                Map.Entry entry3 = entry;
                if (i17 != i13) {
                    i14 = i17 == 1048575 ? 0 : unsafe.getInt(obj, i17);
                    i13 = i17;
                }
                int i18 = i14;
                i3 = 1 << (i16 >>> 20);
                i = i13;
                i2 = i18;
                entry2 = entry3;
            } else {
                Map.Entry entry4 = entry;
                z = true;
                i = i13;
                i2 = i14;
                entry2 = entry4;
                i3 = 0;
            }
            while (entry2 != null) {
                ((AbstractC1552l) entry2.getKey()).getClass();
                if (i15 < 0) {
                    j = iIsVip & 1048575;
                    switch (iAdvert) {
                        case 0:
                            if (c17414l.adcel(obj, i12, i, i2, i3)) {
                                c0770l.yandex.admob(i15, Double.doubleToRawLongBits(AbstractC10611l.crashlytics.yandex(j, obj)));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 1:
                            if (c17414l.adcel(obj, i12, i, i2, i3)) {
                                c0770l.yandex.billing(i15, Float.floatToRawIntBits(AbstractC10611l.crashlytics.crashlytics(j, obj)));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 2:
                            if (c17414l.adcel(obj, i12, i, i2, i3)) {
                                c0770l.yandex.startapp(i15, unsafe.getLong(obj, j));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 3:
                            if (c17414l.adcel(obj, i12, i, i2, i3)) {
                                c0770l.yandex.startapp(i15, unsafe.getLong(obj, j));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 4:
                            if (c17414l.adcel(obj, i12, i, i2, i3)) {
                                c0770l.yandex.isPro(i15, unsafe.getInt(obj, j));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 5:
                            if (c17414l.adcel(obj, i12, i, i2, i3)) {
                                c0770l.yandex.admob(i15, unsafe.getLong(obj, j));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 6:
                            if (c17414l.adcel(obj, i12, i, i2, i3)) {
                                c0770l.yandex.billing(i15, unsafe.getInt(obj, j));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 7:
                            if (c17414l.adcel(obj, i12, i, i2, i3)) {
                                boolean zRemoteconfig = AbstractC10611l.crashlytics.remoteconfig(j, obj);
                                C9747l c9747l = c0770l.yandex;
                                c9747l.metrica(i15 << 3);
                                c9747l.crashlytics(zRemoteconfig ? (byte) 1 : (byte) 0);
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 8:
                            if (c17414l.adcel(obj, i12, i, i2, i3)) {
                                object = unsafe.getObject(obj, j);
                                if (object instanceof String) {
                                    c0770l.yandex.smaato(i15, (String) object);
                                } else {
                                    c0770l.yandex.purchase(i15, (AbstractC1096l) object);
                                }
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 9:
                            if (c17414l.adcel(obj, i12, i, i2, i3)) {
                                c0770l.loadAd(i15, unsafe.getObject(obj, j), c17414l.applovin(i12));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 10:
                            if (c17414l.adcel(obj, i12, i, i2, i3)) {
                                c0770l.yandex.purchase(i15, (AbstractC1096l) unsafe.getObject(obj, j));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 11:
                            if (c17414l.adcel(obj, i12, i, i2, i3)) {
                                c0770l.yandex.vip(i15, unsafe.getInt(obj, j));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 12:
                            if (c17414l.adcel(obj, i12, i, i2, i3)) {
                                c0770l.yandex.isPro(i15, unsafe.getInt(obj, j));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 13:
                            if (c17414l.adcel(obj, i12, i, i2, i3)) {
                                c0770l.yandex.billing(i15, unsafe.getInt(obj, j));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 14:
                            if (c17414l.adcel(obj, i12, i, i2, i3)) {
                                c0770l.yandex.admob(i15, unsafe.getLong(obj, j));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 15:
                            if (c17414l.adcel(obj, i12, i, i2, i3)) {
                                int i19 = unsafe.getInt(obj, j);
                                c0770l.yandex.vip(i15, (i19 >> 31) ^ (i19 + i19));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 16:
                            if (c17414l.adcel(obj, i12, i, i2, i3)) {
                                long j2 = unsafe.getLong(obj, j);
                                c0770l.yandex.startapp(i15, (j2 + j2) ^ (j2 >> 63));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            if (c17414l.adcel(obj, i12, i, i2, i3)) {
                                c0770l.yandex(i15, unsafe.getObject(obj, j), c17414l.applovin(i12));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            AbstractC17663l.ads(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, false);
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            AbstractC17663l.license(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, false);
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 20:
                            AbstractC17663l.ad(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, false);
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 21:
                            AbstractC17663l.amazon(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, false);
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 22:
                            AbstractC17663l.pro(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, false);
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 23:
                            AbstractC17663l.Signature(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, false);
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                            AbstractC17663l.tapsense(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, false);
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case Maneuver.TYPE_FORK_LEFT /* 25 */:
                            AbstractC17663l.adcel(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, false);
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                            i4 = iArr[i12];
                            list = (List) unsafe.getObject(obj, j);
                            C6162l c6162l = AbstractC17663l.yandex;
                            if (list != null && !list.isEmpty()) {
                                c0770l.getClass();
                                for (i5 = 0; i5 < list.size(); i5++) {
                                    c0770l.yandex.smaato(i4, (String) list.get(i5));
                                }
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                            i6 = iArr[i12];
                            list2 = (List) unsafe.getObject(obj, j);
                            interfaceC12353lApplovin = c17414l.applovin(i12);
                            C6162l c6162l2 = AbstractC17663l.yandex;
                            if (list2 != null && !list2.isEmpty()) {
                                for (i7 = 0; i7 < list2.size(); i7++) {
                                    c0770l.loadAd(i6, list2.get(i7), interfaceC12353lApplovin);
                                }
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                            i8 = iArr[i12];
                            list3 = (List) unsafe.getObject(obj, j);
                            C6162l c6162l3 = AbstractC17663l.yandex;
                            if (list3 != null && !list3.isEmpty()) {
                                c0770l.getClass();
                                for (i9 = 0; i9 < list3.size(); i9++) {
                                    c0770l.yandex.purchase(i8, (AbstractC1096l) list3.get(i9));
                                }
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                            z2 = false;
                            AbstractC17663l.crashlytics(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, false);
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 30:
                            z2 = false;
                            AbstractC17663l.subscription(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, false);
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 31:
                            z2 = false;
                            AbstractC17663l.advert(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, false);
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 32:
                            z2 = false;
                            AbstractC17663l.isVip(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, false);
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                            z2 = false;
                            AbstractC17663l.yandex(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, false);
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                            z2 = false;
                            AbstractC17663l.loadAd(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, false);
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                            AbstractC17663l.ads(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, z);
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case Maneuver.TYPE_STRAIGHT /* 36 */:
                            AbstractC17663l.license(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, z);
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                            AbstractC17663l.ad(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, z);
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                            AbstractC17663l.amazon(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, z);
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case Maneuver.TYPE_DESTINATION /* 39 */:
                            AbstractC17663l.pro(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, z);
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                            AbstractC17663l.Signature(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, z);
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                            AbstractC17663l.tapsense(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, z);
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                            AbstractC17663l.adcel(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, z);
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                            AbstractC17663l.crashlytics(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, z);
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                            AbstractC17663l.subscription(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, z);
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                            AbstractC17663l.advert(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, z);
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                            AbstractC17663l.isVip(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, z);
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                            AbstractC17663l.yandex(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, z);
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 48:
                            AbstractC17663l.loadAd(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, z);
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                            i10 = iArr[i12];
                            list4 = (List) unsafe.getObject(obj, j);
                            interfaceC12353lApplovin2 = c17414l.applovin(i12);
                            C6162l c6162l4 = AbstractC17663l.yandex;
                            if (list4 != null && !list4.isEmpty()) {
                                for (i11 = 0; i11 < list4.size(); i11++) {
                                    c0770l.yandex(i10, list4.get(i11), interfaceC12353lApplovin2);
                                }
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                            if (unsafe.getObject(obj, j) != null) {
                                int i20 = i12 / 3;
                                throw AbstractC12589l.signatures(c17414l.loadAd[i20 + i20]);
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 51:
                            if (c17414l.subscription(i15, i12, obj)) {
                                c0770l.yandex.admob(i15, Double.doubleToRawLongBits(((Double) AbstractC10611l.admob(j, obj)).doubleValue()));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 52:
                            if (c17414l.subscription(i15, i12, obj)) {
                                c0770l.yandex.billing(i15, Float.floatToRawIntBits(((Float) AbstractC10611l.admob(j, obj)).floatValue()));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 53:
                            if (c17414l.subscription(i15, i12, obj)) {
                                c0770l.yandex.startapp(i15, signatures(j, obj));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 54:
                            if (c17414l.subscription(i15, i12, obj)) {
                                c0770l.yandex.startapp(i15, signatures(j, obj));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 55:
                            if (c17414l.subscription(i15, i12, obj)) {
                                c0770l.yandex.isPro(i15, pro(j, obj));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 56:
                            if (c17414l.subscription(i15, i12, obj)) {
                                c0770l.yandex.admob(i15, signatures(j, obj));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 57:
                            if (c17414l.subscription(i15, i12, obj)) {
                                c0770l.yandex.billing(i15, pro(j, obj));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 58:
                            if (c17414l.subscription(i15, i12, obj)) {
                                boolean zBooleanValue = ((Boolean) AbstractC10611l.admob(j, obj)).booleanValue();
                                C9747l c9747l2 = c0770l.yandex;
                                c9747l2.metrica(i15 << 3);
                                c9747l2.crashlytics(zBooleanValue ? (byte) 1 : (byte) 0);
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 59:
                            if (c17414l.subscription(i15, i12, obj)) {
                                object2 = unsafe.getObject(obj, j);
                                if (object2 instanceof String) {
                                    c0770l.yandex.smaato(i15, (String) object2);
                                } else {
                                    c0770l.yandex.purchase(i15, (AbstractC1096l) object2);
                                }
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 60:
                            if (c17414l.subscription(i15, i12, obj)) {
                                c0770l.loadAd(i15, unsafe.getObject(obj, j), c17414l.applovin(i12));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 61:
                            if (c17414l.subscription(i15, i12, obj)) {
                                c0770l.yandex.purchase(i15, (AbstractC1096l) unsafe.getObject(obj, j));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 62:
                            if (c17414l.subscription(i15, i12, obj)) {
                                c0770l.yandex.vip(i15, pro(j, obj));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 63:
                            if (c17414l.subscription(i15, i12, obj)) {
                                c0770l.yandex.isPro(i15, pro(j, obj));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                            if (c17414l.subscription(i15, i12, obj)) {
                                c0770l.yandex.billing(i15, pro(j, obj));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 65:
                            if (c17414l.subscription(i15, i12, obj)) {
                                c0770l.yandex.admob(i15, signatures(j, obj));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 66:
                            if (c17414l.subscription(i15, i12, obj)) {
                                int iPro = pro(j, obj);
                                c0770l.yandex.vip(i15, (iPro >> 31) ^ (iPro + iPro));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 67:
                            if (c17414l.subscription(i15, i12, obj)) {
                                long jSignatures = signatures(j, obj);
                                c0770l.yandex.startapp(i15, (jSignatures >> 63) ^ (jSignatures + jSignatures));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        case 68:
                            if (c17414l.subscription(i15, i12, obj)) {
                                c0770l.yandex(i15, unsafe.getObject(obj, j), c17414l.applovin(i12));
                            }
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                        default:
                            i12 += 3;
                            c17414l = this;
                            i14 = i2;
                            i13 = i;
                            entry = entry2;
                            break;
                    }
                } else {
                    c6096l.getClass();
                    C6096l.purchase(c0770l, entry2);
                    entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                }
            }
            j = iIsVip & 1048575;
            switch (iAdvert) {
                case 0:
                    if (c17414l.adcel(obj, i12, i, i2, i3)) {
                        c0770l.yandex.admob(i15, Double.doubleToRawLongBits(AbstractC10611l.crashlytics.yandex(j, obj)));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 1:
                    if (c17414l.adcel(obj, i12, i, i2, i3)) {
                        c0770l.yandex.billing(i15, Float.floatToRawIntBits(AbstractC10611l.crashlytics.crashlytics(j, obj)));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 2:
                    if (c17414l.adcel(obj, i12, i, i2, i3)) {
                        c0770l.yandex.startapp(i15, unsafe.getLong(obj, j));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 3:
                    if (c17414l.adcel(obj, i12, i, i2, i3)) {
                        c0770l.yandex.startapp(i15, unsafe.getLong(obj, j));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 4:
                    if (c17414l.adcel(obj, i12, i, i2, i3)) {
                        c0770l.yandex.isPro(i15, unsafe.getInt(obj, j));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 5:
                    if (c17414l.adcel(obj, i12, i, i2, i3)) {
                        c0770l.yandex.admob(i15, unsafe.getLong(obj, j));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 6:
                    if (c17414l.adcel(obj, i12, i, i2, i3)) {
                        c0770l.yandex.billing(i15, unsafe.getInt(obj, j));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 7:
                    if (c17414l.adcel(obj, i12, i, i2, i3)) {
                        boolean zRemoteconfig2 = AbstractC10611l.crashlytics.remoteconfig(j, obj);
                        C9747l c9747l3 = c0770l.yandex;
                        c9747l3.metrica(i15 << 3);
                        c9747l3.crashlytics(zRemoteconfig2 ? (byte) 1 : (byte) 0);
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 8:
                    if (c17414l.adcel(obj, i12, i, i2, i3)) {
                        object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            c0770l.yandex.smaato(i15, (String) object);
                        } else {
                            c0770l.yandex.purchase(i15, (AbstractC1096l) object);
                        }
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 9:
                    if (c17414l.adcel(obj, i12, i, i2, i3)) {
                        c0770l.loadAd(i15, unsafe.getObject(obj, j), c17414l.applovin(i12));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 10:
                    if (c17414l.adcel(obj, i12, i, i2, i3)) {
                        c0770l.yandex.purchase(i15, (AbstractC1096l) unsafe.getObject(obj, j));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 11:
                    if (c17414l.adcel(obj, i12, i, i2, i3)) {
                        c0770l.yandex.vip(i15, unsafe.getInt(obj, j));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 12:
                    if (c17414l.adcel(obj, i12, i, i2, i3)) {
                        c0770l.yandex.isPro(i15, unsafe.getInt(obj, j));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 13:
                    if (c17414l.adcel(obj, i12, i, i2, i3)) {
                        c0770l.yandex.billing(i15, unsafe.getInt(obj, j));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 14:
                    if (c17414l.adcel(obj, i12, i, i2, i3)) {
                        c0770l.yandex.admob(i15, unsafe.getLong(obj, j));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 15:
                    if (c17414l.adcel(obj, i12, i, i2, i3)) {
                        int i110 = unsafe.getInt(obj, j);
                        c0770l.yandex.vip(i15, (i110 >> 31) ^ (i110 + i110));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 16:
                    if (c17414l.adcel(obj, i12, i, i2, i3)) {
                        long j3 = unsafe.getLong(obj, j);
                        c0770l.yandex.startapp(i15, (j3 + j3) ^ (j3 >> 63));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (c17414l.adcel(obj, i12, i, i2, i3)) {
                        c0770l.yandex(i15, unsafe.getObject(obj, j), c17414l.applovin(i12));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    AbstractC17663l.ads(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, false);
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    AbstractC17663l.license(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, false);
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 20:
                    AbstractC17663l.ad(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, false);
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 21:
                    AbstractC17663l.amazon(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, false);
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 22:
                    AbstractC17663l.pro(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, false);
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 23:
                    AbstractC17663l.Signature(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, false);
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    AbstractC17663l.tapsense(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, false);
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    AbstractC17663l.adcel(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, false);
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    i4 = iArr[i12];
                    list = (List) unsafe.getObject(obj, j);
                    C6162l c6162l5 = AbstractC17663l.yandex;
                    if (list != null) {
                        c0770l.getClass();
                        while (i5 < list.size()) {
                            c0770l.yandex.smaato(i4, (String) list.get(i5));
                        }
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    i6 = iArr[i12];
                    list2 = (List) unsafe.getObject(obj, j);
                    interfaceC12353lApplovin = c17414l.applovin(i12);
                    C6162l c6162l6 = AbstractC17663l.yandex;
                    if (list2 != null) {
                        while (i7 < list2.size()) {
                            c0770l.loadAd(i6, list2.get(i7), interfaceC12353lApplovin);
                        }
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    i8 = iArr[i12];
                    list3 = (List) unsafe.getObject(obj, j);
                    C6162l c6162l7 = AbstractC17663l.yandex;
                    if (list3 != null) {
                        c0770l.getClass();
                        while (i9 < list3.size()) {
                            c0770l.yandex.purchase(i8, (AbstractC1096l) list3.get(i9));
                        }
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    z2 = false;
                    AbstractC17663l.crashlytics(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, false);
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 30:
                    z2 = false;
                    AbstractC17663l.subscription(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, false);
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 31:
                    z2 = false;
                    AbstractC17663l.advert(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, false);
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 32:
                    z2 = false;
                    AbstractC17663l.isVip(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, false);
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    z2 = false;
                    AbstractC17663l.yandex(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, false);
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    z2 = false;
                    AbstractC17663l.loadAd(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, false);
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    AbstractC17663l.ads(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, z);
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    AbstractC17663l.license(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, z);
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    AbstractC17663l.ad(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, z);
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    AbstractC17663l.amazon(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, z);
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    AbstractC17663l.pro(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, z);
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    AbstractC17663l.Signature(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, z);
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    AbstractC17663l.tapsense(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, z);
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    AbstractC17663l.adcel(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, z);
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    AbstractC17663l.crashlytics(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, z);
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    AbstractC17663l.subscription(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, z);
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    AbstractC17663l.advert(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, z);
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    AbstractC17663l.isVip(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, z);
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    AbstractC17663l.yandex(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, z);
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 48:
                    AbstractC17663l.loadAd(iArr[i12], (List) unsafe.getObject(obj, j), c0770l, z);
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    i10 = iArr[i12];
                    list4 = (List) unsafe.getObject(obj, j);
                    interfaceC12353lApplovin2 = c17414l.applovin(i12);
                    C6162l c6162l8 = AbstractC17663l.yandex;
                    if (list4 != null) {
                        while (i11 < list4.size()) {
                            c0770l.yandex(i10, list4.get(i11), interfaceC12353lApplovin2);
                        }
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    if (unsafe.getObject(obj, j) != null) {
                        int i21 = i12 / 3;
                        throw AbstractC12589l.signatures(c17414l.loadAd[i21 + i21]);
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 51:
                    if (c17414l.subscription(i15, i12, obj)) {
                        c0770l.yandex.admob(i15, Double.doubleToRawLongBits(((Double) AbstractC10611l.admob(j, obj)).doubleValue()));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 52:
                    if (c17414l.subscription(i15, i12, obj)) {
                        c0770l.yandex.billing(i15, Float.floatToRawIntBits(((Float) AbstractC10611l.admob(j, obj)).floatValue()));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 53:
                    if (c17414l.subscription(i15, i12, obj)) {
                        c0770l.yandex.startapp(i15, signatures(j, obj));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 54:
                    if (c17414l.subscription(i15, i12, obj)) {
                        c0770l.yandex.startapp(i15, signatures(j, obj));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 55:
                    if (c17414l.subscription(i15, i12, obj)) {
                        c0770l.yandex.isPro(i15, pro(j, obj));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 56:
                    if (c17414l.subscription(i15, i12, obj)) {
                        c0770l.yandex.admob(i15, signatures(j, obj));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 57:
                    if (c17414l.subscription(i15, i12, obj)) {
                        c0770l.yandex.billing(i15, pro(j, obj));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 58:
                    if (c17414l.subscription(i15, i12, obj)) {
                        boolean zBooleanValue2 = ((Boolean) AbstractC10611l.admob(j, obj)).booleanValue();
                        C9747l c9747l4 = c0770l.yandex;
                        c9747l4.metrica(i15 << 3);
                        c9747l4.crashlytics(zBooleanValue2 ? (byte) 1 : (byte) 0);
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 59:
                    if (c17414l.subscription(i15, i12, obj)) {
                        object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof String) {
                            c0770l.yandex.smaato(i15, (String) object2);
                        } else {
                            c0770l.yandex.purchase(i15, (AbstractC1096l) object2);
                        }
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 60:
                    if (c17414l.subscription(i15, i12, obj)) {
                        c0770l.loadAd(i15, unsafe.getObject(obj, j), c17414l.applovin(i12));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 61:
                    if (c17414l.subscription(i15, i12, obj)) {
                        c0770l.yandex.purchase(i15, (AbstractC1096l) unsafe.getObject(obj, j));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 62:
                    if (c17414l.subscription(i15, i12, obj)) {
                        c0770l.yandex.vip(i15, pro(j, obj));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 63:
                    if (c17414l.subscription(i15, i12, obj)) {
                        c0770l.yandex.isPro(i15, pro(j, obj));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    if (c17414l.subscription(i15, i12, obj)) {
                        c0770l.yandex.billing(i15, pro(j, obj));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 65:
                    if (c17414l.subscription(i15, i12, obj)) {
                        c0770l.yandex.admob(i15, signatures(j, obj));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 66:
                    if (c17414l.subscription(i15, i12, obj)) {
                        int iPro2 = pro(j, obj);
                        c0770l.yandex.vip(i15, (iPro2 >> 31) ^ (iPro2 + iPro2));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 67:
                    if (c17414l.subscription(i15, i12, obj)) {
                        long jSignatures2 = signatures(j, obj);
                        c0770l.yandex.startapp(i15, (jSignatures2 >> 63) ^ (jSignatures2 + jSignatures2));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                case 68:
                    if (c17414l.subscription(i15, i12, obj)) {
                        c0770l.yandex(i15, unsafe.getObject(obj, j), c17414l.applovin(i12));
                    }
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
                default:
                    i12 += 3;
                    c17414l = this;
                    i14 = i2;
                    i13 = i;
                    entry = entry2;
                    break;
            }
        }
    }

    public final boolean subscription(int i, int i2, Object obj) {
        return AbstractC10611l.purchase((long) (this.yandex[i2 + 2] & 1048575), obj) == i;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 38041. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int tapsense(java.lang.Object r41, byte[] r42, int r43, int r44, int r45, defpackage.C13275l r46) throws defpackage.C18299l {
        /*
            Method dump skipped, instruction units count: 3804
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17414l.tapsense(java.lang.Object, byte[], int, int, int, lَْۛ):int");
    }

    public final void vip(int i, Object obj, Object obj2, int i2) {
        remoteconfig.putObject(obj, isVip(i2) & 1048575, obj2);
        AbstractC10611l.isPro(this.yandex[i2 + 2] & 1048575, obj, i);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084 A[SYNTHETIC] */
    @Override // defpackage.InterfaceC12353l
    public final void yandex(Object obj) {
        if (!ads(obj)) {
            return;
        }
        if (obj instanceof AbstractC15603l) {
            AbstractC15603l abstractC15603l = (AbstractC15603l) obj;
            abstractC15603l.subs();
            abstractC15603l.zza = 0;
            abstractC15603l.mopub();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.yandex;
            if (i >= iArr.length) {
                this.isPro.getClass();
                C2886l c2886l = ((AbstractC15603l) obj).zzc;
                if (c2886l.purchase) {
                    c2886l.purchase = false;
                }
                if (this.billing) {
                    this.firebase.getClass();
                    ((AbstractC13398l) obj).zzb.amazon();
                    return;
                }
                return;
            }
            int iIsVip = isVip(i);
            int i2 = 1048575 & iIsVip;
            int iAdvert = advert(iIsVip);
            long j = i2;
            if (iAdvert != 9) {
                if (iAdvert != 60 && iAdvert != 68) {
                    switch (iAdvert) {
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            if (startapp(i, obj)) {
                                applovin(i).yandex(remoteconfig.getObject(obj, j));
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
                            AbstractC3486l abstractC3486l = (AbstractC3486l) ((InterfaceC14009l) AbstractC10611l.admob(j, obj));
                            if (abstractC3486l.f7371l) {
                                abstractC3486l.f7371l = false;
                            }
                            break;
                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                            Unsafe unsafe = remoteconfig;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((C17935l) object).f34907l = false;
                                unsafe.putObject(obj, j, object);
                            }
                            break;
                    }
                } else if (subscription(iArr[i], i, obj)) {
                    applovin(i).yandex(remoteconfig.getObject(obj, j));
                }
            } else if (startapp(i, obj)) {
                applovin(i).yandex(remoteconfig.getObject(obj, j));
            }
            i += 3;
        }
    }
}
