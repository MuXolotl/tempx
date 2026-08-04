package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.conscrypt.PSKKeyManager;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: lَٕۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10736l implements InterfaceC5100l {
    public final int admob;
    public final int amazon;
    public final boolean billing;
    public final int crashlytics;
    public final C9899l firebase;
    public final C2823l isPro;
    public final Object[] loadAd;
    public final int[] mopub;
    public final AbstractC1200l purchase;
    public final C3682l remoteconfig;
    public final C5382l smaato;
    public final int subs;
    public final int[] yandex;
    public static final int[] vip = new int[0];
    public static final Unsafe metrica = AbstractC0357l.subs();

    public C10736l(int[] iArr, Object[] objArr, int i, int i2, AbstractC1200l abstractC1200l, int[] iArr2, int i3, int i4, C2823l c2823l, C9899l c9899l, C5382l c5382l, C1558l c1558l, C3682l c3682l) {
        this.yandex = iArr;
        this.loadAd = objArr;
        this.crashlytics = i;
        this.amazon = i2;
        this.billing = abstractC1200l instanceof AbstractC8760l;
        this.mopub = iArr2;
        this.admob = i3;
        this.subs = i4;
        this.isPro = c2823l;
        this.firebase = c9899l;
        this.smaato = c5382l;
        this.purchase = abstractC1200l;
        this.remoteconfig = c3682l;
    }

    public static long ad(int i) {
        return i & 1048575;
    }

    public static int advert(long j, Object obj) {
        return ((Integer) AbstractC0357l.crashlytics.admob(j, obj)).intValue();
    }

    public static long isVip(long j, Object obj) {
        return ((Long) AbstractC0357l.crashlytics.admob(j, obj)).longValue();
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static int m2970native(int i) {
        return (i & 267386880) >>> 20;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x035a  */
    /* JADX WARN: Code duplicated, block: B:182:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:185:0x03bb  */
    public static C10736l pro(C13673l c13673l, C2823l c2823l, C9899l c9899l, C5382l c5382l, C1558l c1558l, C3682l c3682l) {
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
        Field fieldM2971throws;
        int i22;
        char cCharAt9;
        int i23;
        Field fieldM2971throws2;
        Field fieldM2971throws3;
        int i24;
        char cCharAt10;
        int i25;
        char cCharAt11;
        int i26;
        int i27;
        char cCharAt12;
        int i28;
        char cCharAt13;
        String str = c13673l.loadAd;
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
        Object[] objArr2 = c13673l.crashlytics;
        Class<?> cls = c13673l.yandex.getClass();
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
                } else if (i79 == 12 && (AbstractC5020l.firebase(c13673l.yandex(), 1) || (iCharAt11 & 2048) != 0)) {
                    objArr3[AbstractC15560l.remoteconfig(i62, 3, 2, 1)] = objArr[i6];
                    i6++;
                }
                int i81 = i80 * 2;
                Object obj = objArr[i81];
                if (obj instanceof Field) {
                    fieldM2971throws2 = (Field) obj;
                } else {
                    fieldM2971throws2 = m2971throws(cls, (String) obj);
                    objArr[i81] = fieldM2971throws2;
                }
                int i82 = i59;
                i19 = i6;
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM2971throws2);
                int i83 = i81 + 1;
                Object obj2 = objArr[i83];
                if (obj2 instanceof Field) {
                    fieldM2971throws3 = (Field) obj2;
                } else {
                    fieldM2971throws3 = m2971throws(cls, (String) obj2);
                    objArr[i83] = fieldM2971throws3;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM2971throws3);
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
                Field fieldM2971throws4 = m2971throws(cls, (String) objArr[i6]);
                if (i74 == 9 || i74 == 17) {
                    i18 = i18;
                    objArr3[AbstractC15560l.remoteconfig(i62, 3, 2, 1)] = fieldM2971throws4.getType();
                } else {
                    if (i74 == 27 || i74 == 49) {
                        i18 = i18;
                        i23 = i6 + 2;
                        objArr3[AbstractC15560l.remoteconfig(i62, 3, 2, 1)] = objArr[i84];
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        i18 = i18;
                        if (c13673l.yandex() == 1 || (iCharAt11 & 2048) != 0) {
                            i23 = i6 + 2;
                            objArr3[AbstractC15560l.remoteconfig(i62, 3, 2, 1)] = objArr[i84];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM2971throws4);
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
                                fieldM2971throws = (Field) obj3;
                            } else {
                                fieldM2971throws = m2971throws(cls, (String) obj3);
                                objArr[i87] = fieldM2971throws;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM2971throws);
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM2971throws4);
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
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM2971throws4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM2971throws4);
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
        return new C10736l(iArr3, objArr3, i2, i5, c13673l.yandex, iArr, i7, i59, c2823l, c9899l, c5382l, c1558l, c3682l);
    }

    public static boolean startapp(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC8760l) {
            return ((AbstractC8760l) obj).billing();
        }
        return true;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static Field m2971throws(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
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
            throw new RuntimeException(sbIsVip.toString(), e);
        }
    }

    public final Object Signature(int i, Object obj) {
        InterfaceC5100l interfaceC5100lRemoteconfig = remoteconfig(i);
        long jM2974private = m2974private(i) & 1048575;
        if (!vip(i, obj)) {
            return interfaceC5100lRemoteconfig.amazon();
        }
        Object object = metrica.getObject(obj, jM2974private);
        if (startapp(object)) {
            return object;
        }
        AbstractC8760l abstractC8760lAmazon = interfaceC5100lRemoteconfig.amazon();
        if (object != null) {
            interfaceC5100lRemoteconfig.yandex(abstractC8760lAmazon, object);
        }
        return abstractC8760lAmazon;
    }

    public final boolean adcel(int i, int i2, Object obj) {
        return AbstractC0357l.crashlytics.billing((long) (this.yandex[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x038d  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ce  */
    @Override // defpackage.InterfaceC5100l
    public final int admob(AbstractC8760l abstractC8760l) {
        int i;
        int iAdmob;
        int iAdmob2;
        int iAdmob3;
        int iIsPro;
        int iAdmob4;
        int iIsPro2;
        int iAdmob5;
        int iAdmob6;
        int iBilling;
        int iAdmob7;
        int iYandex;
        int iCrashlytics;
        int iAdmob8;
        int size;
        int iSubs;
        int iAdmob9;
        int iAdmob10;
        int size2;
        int iAdmob11;
        int iSubs2;
        int iIsPro3;
        int iYandex2;
        int iAdmob12;
        int iSubs3;
        C10736l c10736l = this;
        AbstractC8760l abstractC8760l2 = abstractC8760l;
        Unsafe unsafe = metrica;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int iBilling2 = 0;
        while (true) {
            int[] iArr = c10736l.yandex;
            if (i3 >= iArr.length) {
                c10736l.smaato.getClass();
                return abstractC8760l2.unknownFields.loadAd() + iBilling2;
            }
            int iM2974private = c10736l.m2974private(i3);
            int iM2970native = m2970native(iM2974private);
            int i5 = iArr[i3];
            int i6 = iArr[i3 + 2];
            int i7 = i6 & 1048575;
            if (iM2970native <= 17) {
                if (i7 != i2) {
                    i4 = i7 == 1048575 ? 0 : unsafe.getInt(abstractC8760l2, i7);
                    i2 = i7;
                }
                i = 1 << (i6 >>> 20);
            } else {
                i = 0;
            }
            long j = iM2974private & 1048575;
            if (iM2970native >= EnumC5847l.f12336l.f12339l) {
                int i8 = EnumC5847l.f12335l.f12339l;
            }
            switch (iM2970native) {
                case 0:
                    if (c10736l.metrica(abstractC8760l2, i3, i2, i4, i)) {
                        iAdmob = C10107l.admob(i5);
                        iCrashlytics = iAdmob + 8;
                        iBilling2 += iCrashlytics;
                    }
                    break;
                case 1:
                    if (c10736l.metrica(abstractC8760l2, i3, i2, i4, i)) {
                        iAdmob2 = C10107l.admob(i5);
                        iAdmob6 = iAdmob2 + 4;
                        iBilling2 += iAdmob6;
                    }
                    c10736l = this;
                    abstractC8760l2 = abstractC8760l;
                    break;
                case 2:
                    if (c10736l.metrica(abstractC8760l2, i3, i2, i4, i)) {
                        long j2 = unsafe.getLong(abstractC8760l2, j);
                        iAdmob3 = C10107l.admob(i5);
                        iIsPro = C10107l.isPro(j2);
                        iBilling2 += iIsPro + iAdmob3;
                    }
                    c10736l = this;
                    break;
                case 3:
                    if (c10736l.metrica(abstractC8760l2, i3, i2, i4, i)) {
                        long j3 = unsafe.getLong(abstractC8760l2, j);
                        iAdmob3 = C10107l.admob(i5);
                        iIsPro = C10107l.isPro(j3);
                        iBilling2 += iIsPro + iAdmob3;
                    }
                    c10736l = this;
                    break;
                case 4:
                    if (c10736l.metrica(abstractC8760l2, i3, i2, i4, i)) {
                        int i9 = unsafe.getInt(abstractC8760l2, j);
                        iAdmob4 = C10107l.admob(i5);
                        iIsPro2 = C10107l.isPro(i9);
                        iBilling = iIsPro2 + iAdmob4;
                        iBilling2 += iBilling;
                    }
                    c10736l = this;
                    break;
                case 5:
                    if (c10736l.metrica(abstractC8760l2, i3, i2, i4, i)) {
                        iAdmob5 = C10107l.admob(i5);
                        iAdmob6 = iAdmob5 + 8;
                        iBilling2 += iAdmob6;
                    }
                    c10736l = this;
                    abstractC8760l2 = abstractC8760l;
                    break;
                case 6:
                    if (c10736l.metrica(abstractC8760l2, i3, i2, i4, i)) {
                        iAdmob2 = C10107l.admob(i5);
                        iAdmob6 = iAdmob2 + 4;
                        iBilling2 += iAdmob6;
                    }
                    c10736l = this;
                    abstractC8760l2 = abstractC8760l;
                    break;
                case 7:
                    if (c10736l.metrica(abstractC8760l2, i3, i2, i4, i)) {
                        iAdmob6 = C10107l.admob(i5) + 1;
                        iBilling2 += iAdmob6;
                    }
                    c10736l = this;
                    abstractC8760l2 = abstractC8760l;
                    break;
                case 8:
                    if (c10736l.metrica(abstractC8760l2, i3, i2, i4, i)) {
                        Object object = unsafe.getObject(abstractC8760l2, j);
                        iBilling2 = (object instanceof C4966l ? C10107l.billing(i5, (C4966l) object) : C10107l.mopub((String) object) + C10107l.admob(i5)) + iBilling2;
                    }
                    c10736l = this;
                    break;
                case 9:
                    if (c10736l.metrica(abstractC8760l2, i3, i2, i4, i)) {
                        Object object2 = unsafe.getObject(abstractC8760l2, j);
                        InterfaceC5100l interfaceC5100lRemoteconfig = c10736l.remoteconfig(i3);
                        Class cls = AbstractC0183l.yandex;
                        int iAdmob13 = C10107l.admob(i5);
                        int iYandex3 = ((AbstractC1200l) object2).yandex(interfaceC5100lRemoteconfig);
                        iBilling2 += C10107l.subs(iYandex3) + iYandex3 + iAdmob13;
                    }
                    break;
                case 10:
                    if (c10736l.metrica(abstractC8760l2, i3, i2, i4, i)) {
                        iBilling = C10107l.billing(i5, (C4966l) unsafe.getObject(abstractC8760l2, j));
                        iBilling2 += iBilling;
                    }
                    c10736l = this;
                    break;
                case 11:
                    if (c10736l.metrica(abstractC8760l2, i3, i2, i4, i)) {
                        int i10 = unsafe.getInt(abstractC8760l2, j);
                        iAdmob4 = C10107l.admob(i5);
                        iIsPro2 = C10107l.subs(i10);
                        iBilling = iIsPro2 + iAdmob4;
                        iBilling2 += iBilling;
                    }
                    c10736l = this;
                    break;
                case 12:
                    if (c10736l.metrica(abstractC8760l2, i3, i2, i4, i)) {
                        int i11 = unsafe.getInt(abstractC8760l2, j);
                        iAdmob4 = C10107l.admob(i5);
                        iIsPro2 = C10107l.isPro(i11);
                        iBilling = iIsPro2 + iAdmob4;
                        iBilling2 += iBilling;
                    }
                    c10736l = this;
                    break;
                case 13:
                    if (c10736l.metrica(abstractC8760l2, i3, i2, i4, i)) {
                        iAdmob2 = C10107l.admob(i5);
                        iAdmob6 = iAdmob2 + 4;
                        iBilling2 += iAdmob6;
                    }
                    c10736l = this;
                    abstractC8760l2 = abstractC8760l;
                    break;
                case 14:
                    if (c10736l.metrica(abstractC8760l2, i3, i2, i4, i)) {
                        iAdmob5 = C10107l.admob(i5);
                        iAdmob6 = iAdmob5 + 8;
                        iBilling2 += iAdmob6;
                    }
                    c10736l = this;
                    abstractC8760l2 = abstractC8760l;
                    break;
                case 15:
                    if (c10736l.metrica(abstractC8760l2, i3, i2, i4, i)) {
                        int i12 = unsafe.getInt(abstractC8760l2, j);
                        iAdmob4 = C10107l.admob(i5);
                        iIsPro2 = C10107l.subs((i12 >> 31) ^ (i12 << 1));
                        iBilling = iIsPro2 + iAdmob4;
                        iBilling2 += iBilling;
                    }
                    c10736l = this;
                    break;
                case 16:
                    if (c10736l.metrica(abstractC8760l2, i3, i2, i4, i)) {
                        long j4 = unsafe.getLong(abstractC8760l2, j);
                        iAdmob3 = C10107l.admob(i5);
                        iIsPro = C10107l.isPro((j4 << 1) ^ (j4 >> 63));
                        iBilling2 += iIsPro + iAdmob3;
                    }
                    c10736l = this;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (c10736l.metrica(abstractC8760l2, i3, i2, i4, i)) {
                        AbstractC1200l abstractC1200l = (AbstractC1200l) unsafe.getObject(abstractC8760l2, j);
                        InterfaceC5100l interfaceC5100lRemoteconfig2 = c10736l.remoteconfig(i3);
                        Class cls2 = AbstractC0183l.yandex;
                        iAdmob7 = C10107l.admob(i5) * 2;
                        iYandex = abstractC1200l.yandex(interfaceC5100lRemoteconfig2);
                        iCrashlytics = iYandex + iAdmob7;
                        iBilling2 += iCrashlytics;
                    }
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    iCrashlytics = AbstractC0183l.crashlytics(i5, (List) unsafe.getObject(abstractC8760l2, j));
                    iBilling2 += iCrashlytics;
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    iCrashlytics = AbstractC0183l.loadAd(i5, (List) unsafe.getObject(abstractC8760l2, j));
                    iBilling2 += iCrashlytics;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(abstractC8760l2, j);
                    Class cls3 = AbstractC0183l.yandex;
                    if (list.size() == 0) {
                        iAdmob8 = 0;
                    } else {
                        iAdmob8 = (C10107l.admob(i5) * list.size()) + AbstractC0183l.purchase(list);
                    }
                    iBilling2 += iAdmob8;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC8760l2, j);
                    Class cls4 = AbstractC0183l.yandex;
                    size = list2.size();
                    if (size == 0) {
                        iAdmob8 = 0;
                    } else {
                        iSubs = AbstractC0183l.subs(list2);
                        iAdmob9 = C10107l.admob(i5);
                        iAdmob8 = (iAdmob9 * size) + iSubs;
                    }
                    iBilling2 += iAdmob8;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC8760l2, j);
                    Class cls5 = AbstractC0183l.yandex;
                    size = list3.size();
                    if (size == 0) {
                        iAdmob8 = 0;
                    } else {
                        iSubs = AbstractC0183l.amazon(list3);
                        iAdmob9 = C10107l.admob(i5);
                        iAdmob8 = (iAdmob9 * size) + iSubs;
                    }
                    iBilling2 += iAdmob8;
                    break;
                case 23:
                    iCrashlytics = AbstractC0183l.crashlytics(i5, (List) unsafe.getObject(abstractC8760l2, j));
                    iBilling2 += iCrashlytics;
                    break;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    iCrashlytics = AbstractC0183l.loadAd(i5, (List) unsafe.getObject(abstractC8760l2, j));
                    iBilling2 += iCrashlytics;
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    List list4 = (List) unsafe.getObject(abstractC8760l2, j);
                    Class cls6 = AbstractC0183l.yandex;
                    int size3 = list4.size();
                    iBilling2 += size3 == 0 ? 0 : (C10107l.admob(i5) + 1) * size3;
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    List list5 = (List) unsafe.getObject(abstractC8760l2, j);
                    Class cls7 = AbstractC0183l.yandex;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iAdmob8 = 0;
                    } else {
                        iAdmob8 = C10107l.admob(i5) * size4;
                        for (int i13 = 0; i13 < size4; i13++) {
                            Object obj = list5.get(i13);
                            if (obj instanceof C4966l) {
                                int size5 = ((C4966l) obj).size();
                                iAdmob8 = C10107l.subs(size5) + size5 + iAdmob8;
                            } else {
                                iAdmob8 = C10107l.mopub((String) obj) + iAdmob8;
                            }
                        }
                    }
                    iBilling2 += iAdmob8;
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    List list6 = (List) unsafe.getObject(abstractC8760l2, j);
                    InterfaceC5100l interfaceC5100lRemoteconfig3 = c10736l.remoteconfig(i3);
                    Class cls8 = AbstractC0183l.yandex;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iAdmob10 = 0;
                    } else {
                        iAdmob10 = C10107l.admob(i5) * size6;
                        for (int i14 = 0; i14 < size6; i14++) {
                            int iYandex4 = ((AbstractC1200l) list6.get(i14)).yandex(interfaceC5100lRemoteconfig3);
                            iAdmob10 += C10107l.subs(iYandex4) + iYandex4;
                        }
                    }
                    iBilling2 += iAdmob10;
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    List list7 = (List) unsafe.getObject(abstractC8760l2, j);
                    Class cls9 = AbstractC0183l.yandex;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iAdmob8 = 0;
                    } else {
                        iAdmob8 = C10107l.admob(i5) * size7;
                        for (int i15 = 0; i15 < list7.size(); i15++) {
                            int size8 = ((C4966l) list7.get(i15)).size();
                            iAdmob8 += C10107l.subs(size8) + size8;
                        }
                    }
                    iBilling2 += iAdmob8;
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    List list8 = (List) unsafe.getObject(abstractC8760l2, j);
                    Class cls10 = AbstractC0183l.yandex;
                    size = list8.size();
                    if (size == 0) {
                        iAdmob8 = 0;
                    } else {
                        iSubs = AbstractC0183l.admob(list8);
                        iAdmob9 = C10107l.admob(i5);
                        iAdmob8 = (iAdmob9 * size) + iSubs;
                    }
                    iBilling2 += iAdmob8;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC8760l2, j);
                    Class cls11 = AbstractC0183l.yandex;
                    size = list9.size();
                    if (size == 0) {
                        iAdmob8 = 0;
                    } else {
                        iSubs = AbstractC0183l.yandex(list9);
                        iAdmob9 = C10107l.admob(i5);
                        iAdmob8 = (iAdmob9 * size) + iSubs;
                    }
                    iBilling2 += iAdmob8;
                    break;
                case 31:
                    iCrashlytics = AbstractC0183l.loadAd(i5, (List) unsafe.getObject(abstractC8760l2, j));
                    iBilling2 += iCrashlytics;
                    break;
                case 32:
                    iCrashlytics = AbstractC0183l.crashlytics(i5, (List) unsafe.getObject(abstractC8760l2, j));
                    iBilling2 += iCrashlytics;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    List list10 = (List) unsafe.getObject(abstractC8760l2, j);
                    Class cls12 = AbstractC0183l.yandex;
                    size = list10.size();
                    if (size == 0) {
                        iAdmob8 = 0;
                    } else {
                        iSubs = AbstractC0183l.billing(list10);
                        iAdmob9 = C10107l.admob(i5);
                        iAdmob8 = (iAdmob9 * size) + iSubs;
                    }
                    iBilling2 += iAdmob8;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    List list11 = (List) unsafe.getObject(abstractC8760l2, j);
                    Class cls13 = AbstractC0183l.yandex;
                    size = list11.size();
                    if (size == 0) {
                        iAdmob8 = 0;
                    } else {
                        iSubs = AbstractC0183l.mopub(list11);
                        iAdmob9 = C10107l.admob(i5);
                        iAdmob8 = (iAdmob9 * size) + iSubs;
                    }
                    iBilling2 += iAdmob8;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    List list12 = (List) unsafe.getObject(abstractC8760l2, j);
                    Class cls14 = AbstractC0183l.yandex;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iAdmob11 = C10107l.admob(i5);
                        iSubs2 = C10107l.subs(size2);
                        iIsPro3 = iSubs2 + iAdmob11;
                        iSubs3 = iIsPro3 + size2;
                        iBilling2 += iSubs3;
                    }
                    break;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    List list13 = (List) unsafe.getObject(abstractC8760l2, j);
                    Class cls15 = AbstractC0183l.yandex;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iAdmob11 = C10107l.admob(i5);
                        iSubs2 = C10107l.subs(size2);
                        iIsPro3 = iSubs2 + iAdmob11;
                        iSubs3 = iIsPro3 + size2;
                        iBilling2 += iSubs3;
                    }
                    break;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    size2 = AbstractC0183l.purchase((List) unsafe.getObject(abstractC8760l2, j));
                    if (size2 > 0) {
                        iAdmob11 = C10107l.admob(i5);
                        iSubs2 = C10107l.subs(size2);
                        iIsPro3 = iSubs2 + iAdmob11;
                        iSubs3 = iIsPro3 + size2;
                        iBilling2 += iSubs3;
                    }
                    break;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    size2 = AbstractC0183l.subs((List) unsafe.getObject(abstractC8760l2, j));
                    if (size2 > 0) {
                        iAdmob11 = C10107l.admob(i5);
                        iSubs2 = C10107l.subs(size2);
                        iIsPro3 = iSubs2 + iAdmob11;
                        iSubs3 = iIsPro3 + size2;
                        iBilling2 += iSubs3;
                    }
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    size2 = AbstractC0183l.amazon((List) unsafe.getObject(abstractC8760l2, j));
                    if (size2 > 0) {
                        iAdmob11 = C10107l.admob(i5);
                        iSubs2 = C10107l.subs(size2);
                        iIsPro3 = iSubs2 + iAdmob11;
                        iSubs3 = iIsPro3 + size2;
                        iBilling2 += iSubs3;
                    }
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    List list14 = (List) unsafe.getObject(abstractC8760l2, j);
                    Class cls16 = AbstractC0183l.yandex;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iAdmob11 = C10107l.admob(i5);
                        iSubs2 = C10107l.subs(size2);
                        iIsPro3 = iSubs2 + iAdmob11;
                        iSubs3 = iIsPro3 + size2;
                        iBilling2 += iSubs3;
                    }
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    List list15 = (List) unsafe.getObject(abstractC8760l2, j);
                    Class cls17 = AbstractC0183l.yandex;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iAdmob11 = C10107l.admob(i5);
                        iSubs2 = C10107l.subs(size2);
                        iIsPro3 = iSubs2 + iAdmob11;
                        iSubs3 = iIsPro3 + size2;
                        iBilling2 += iSubs3;
                    }
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    List list16 = (List) unsafe.getObject(abstractC8760l2, j);
                    Class cls18 = AbstractC0183l.yandex;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iAdmob11 = C10107l.admob(i5);
                        iSubs2 = C10107l.subs(size2);
                        iIsPro3 = iSubs2 + iAdmob11;
                        iSubs3 = iIsPro3 + size2;
                        iBilling2 += iSubs3;
                    }
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    size2 = AbstractC0183l.admob((List) unsafe.getObject(abstractC8760l2, j));
                    if (size2 > 0) {
                        iAdmob11 = C10107l.admob(i5);
                        iSubs2 = C10107l.subs(size2);
                        iIsPro3 = iSubs2 + iAdmob11;
                        iSubs3 = iIsPro3 + size2;
                        iBilling2 += iSubs3;
                    }
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    size2 = AbstractC0183l.yandex((List) unsafe.getObject(abstractC8760l2, j));
                    if (size2 > 0) {
                        iAdmob11 = C10107l.admob(i5);
                        iSubs2 = C10107l.subs(size2);
                        iIsPro3 = iSubs2 + iAdmob11;
                        iSubs3 = iIsPro3 + size2;
                        iBilling2 += iSubs3;
                    }
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    List list17 = (List) unsafe.getObject(abstractC8760l2, j);
                    Class cls19 = AbstractC0183l.yandex;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iAdmob11 = C10107l.admob(i5);
                        iSubs2 = C10107l.subs(size2);
                        iIsPro3 = iSubs2 + iAdmob11;
                        iSubs3 = iIsPro3 + size2;
                        iBilling2 += iSubs3;
                    }
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    List list18 = (List) unsafe.getObject(abstractC8760l2, j);
                    Class cls20 = AbstractC0183l.yandex;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iAdmob11 = C10107l.admob(i5);
                        iSubs2 = C10107l.subs(size2);
                        iIsPro3 = iSubs2 + iAdmob11;
                        iSubs3 = iIsPro3 + size2;
                        iBilling2 += iSubs3;
                    }
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    size2 = AbstractC0183l.billing((List) unsafe.getObject(abstractC8760l2, j));
                    if (size2 > 0) {
                        iAdmob11 = C10107l.admob(i5);
                        iSubs2 = C10107l.subs(size2);
                        iIsPro3 = iSubs2 + iAdmob11;
                        iSubs3 = iIsPro3 + size2;
                        iBilling2 += iSubs3;
                    }
                    break;
                case 48:
                    size2 = AbstractC0183l.mopub((List) unsafe.getObject(abstractC8760l2, j));
                    if (size2 > 0) {
                        iAdmob11 = C10107l.admob(i5);
                        iSubs2 = C10107l.subs(size2);
                        iIsPro3 = iSubs2 + iAdmob11;
                        iSubs3 = iIsPro3 + size2;
                        iBilling2 += iSubs3;
                    }
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    List list19 = (List) unsafe.getObject(abstractC8760l2, j);
                    InterfaceC5100l interfaceC5100lRemoteconfig4 = c10736l.remoteconfig(i3);
                    Class cls21 = AbstractC0183l.yandex;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        iYandex2 = 0;
                    } else {
                        iYandex2 = 0;
                        for (int i16 = 0; i16 < size9; i16++) {
                            iYandex2 += ((AbstractC1200l) list19.get(i16)).yandex(interfaceC5100lRemoteconfig4) + (C10107l.admob(i5) * 2);
                        }
                    }
                    iBilling2 += iYandex2;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Object object3 = unsafe.getObject(abstractC8760l2, j);
                    Object obj2 = c10736l.loadAd[(i3 / 3) * 2];
                    c10736l.remoteconfig.getClass();
                    C7394l c7394l = (C7394l) object3;
                    C2382l c2382l = (C2382l) obj2;
                    if (c7394l.isEmpty()) {
                        iAdmob10 = 0;
                    } else {
                        iAdmob10 = 0;
                        for (Map.Entry entry : c7394l.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            c2382l.getClass();
                            int iAdmob14 = C10107l.admob(i5);
                            int iYandex5 = C2382l.yandex(c2382l.yandex, key, value);
                            iAdmob10 += C10107l.subs(iYandex5) + iYandex5 + iAdmob14;
                        }
                    }
                    iBilling2 += iAdmob10;
                    break;
                case 51:
                    if (c10736l.adcel(i5, i3, abstractC8760l2)) {
                        iAdmob = C10107l.admob(i5);
                        iCrashlytics = iAdmob + 8;
                        iBilling2 += iCrashlytics;
                    }
                    break;
                case 52:
                    if (c10736l.adcel(i5, i3, abstractC8760l2)) {
                        iAdmob12 = C10107l.admob(i5);
                        iCrashlytics = iAdmob12 + 4;
                        iBilling2 += iCrashlytics;
                    }
                    break;
                case 53:
                    if (c10736l.adcel(i5, i3, abstractC8760l2)) {
                        long jIsVip = isVip(j, abstractC8760l2);
                        size2 = C10107l.admob(i5);
                        iIsPro3 = C10107l.isPro(jIsVip);
                        iSubs3 = iIsPro3 + size2;
                        iBilling2 += iSubs3;
                    }
                    break;
                case 54:
                    if (c10736l.adcel(i5, i3, abstractC8760l2)) {
                        long jIsVip2 = isVip(j, abstractC8760l2);
                        size2 = C10107l.admob(i5);
                        iIsPro3 = C10107l.isPro(jIsVip2);
                        iSubs3 = iIsPro3 + size2;
                        iBilling2 += iSubs3;
                    }
                    break;
                case 55:
                    if (c10736l.adcel(i5, i3, abstractC8760l2)) {
                        int iAdvert = advert(j, abstractC8760l2);
                        iAdmob7 = C10107l.admob(i5);
                        iYandex = C10107l.isPro(iAdvert);
                        iCrashlytics = iYandex + iAdmob7;
                        iBilling2 += iCrashlytics;
                    }
                    break;
                case 56:
                    if (c10736l.adcel(i5, i3, abstractC8760l2)) {
                        iAdmob = C10107l.admob(i5);
                        iCrashlytics = iAdmob + 8;
                        iBilling2 += iCrashlytics;
                    }
                    break;
                case 57:
                    if (c10736l.adcel(i5, i3, abstractC8760l2)) {
                        iAdmob12 = C10107l.admob(i5);
                        iCrashlytics = iAdmob12 + 4;
                        iBilling2 += iCrashlytics;
                    }
                    break;
                case 58:
                    if (c10736l.adcel(i5, i3, abstractC8760l2)) {
                        iCrashlytics = C10107l.admob(i5) + 1;
                        iBilling2 += iCrashlytics;
                    }
                    break;
                case 59:
                    if (c10736l.adcel(i5, i3, abstractC8760l2)) {
                        Object object4 = unsafe.getObject(abstractC8760l2, j);
                        iBilling2 = (object4 instanceof C4966l ? C10107l.billing(i5, (C4966l) object4) : C10107l.mopub((String) object4) + C10107l.admob(i5)) + iBilling2;
                    }
                    break;
                case 60:
                    if (c10736l.adcel(i5, i3, abstractC8760l2)) {
                        Object object5 = unsafe.getObject(abstractC8760l2, j);
                        InterfaceC5100l interfaceC5100lRemoteconfig5 = c10736l.remoteconfig(i3);
                        Class cls22 = AbstractC0183l.yandex;
                        int iAdmob15 = C10107l.admob(i5);
                        int iYandex6 = ((AbstractC1200l) object5).yandex(interfaceC5100lRemoteconfig5);
                        iSubs3 = C10107l.subs(iYandex6) + iYandex6 + iAdmob15;
                        iBilling2 += iSubs3;
                    }
                    break;
                case 61:
                    if (c10736l.adcel(i5, i3, abstractC8760l2)) {
                        iCrashlytics = C10107l.billing(i5, (C4966l) unsafe.getObject(abstractC8760l2, j));
                        iBilling2 += iCrashlytics;
                    }
                    break;
                case 62:
                    if (c10736l.adcel(i5, i3, abstractC8760l2)) {
                        int iAdvert2 = advert(j, abstractC8760l2);
                        iAdmob7 = C10107l.admob(i5);
                        iYandex = C10107l.subs(iAdvert2);
                        iCrashlytics = iYandex + iAdmob7;
                        iBilling2 += iCrashlytics;
                    }
                    break;
                case 63:
                    if (c10736l.adcel(i5, i3, abstractC8760l2)) {
                        int iAdvert3 = advert(j, abstractC8760l2);
                        iAdmob7 = C10107l.admob(i5);
                        iYandex = C10107l.isPro(iAdvert3);
                        iCrashlytics = iYandex + iAdmob7;
                        iBilling2 += iCrashlytics;
                    }
                    break;
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    if (c10736l.adcel(i5, i3, abstractC8760l2)) {
                        iAdmob12 = C10107l.admob(i5);
                        iCrashlytics = iAdmob12 + 4;
                        iBilling2 += iCrashlytics;
                    }
                    break;
                case 65:
                    if (c10736l.adcel(i5, i3, abstractC8760l2)) {
                        iAdmob = C10107l.admob(i5);
                        iCrashlytics = iAdmob + 8;
                        iBilling2 += iCrashlytics;
                    }
                    break;
                case 66:
                    if (c10736l.adcel(i5, i3, abstractC8760l2)) {
                        int iAdvert4 = advert(j, abstractC8760l2);
                        iAdmob7 = C10107l.admob(i5);
                        iYandex = C10107l.subs((iAdvert4 >> 31) ^ (iAdvert4 << 1));
                        iCrashlytics = iYandex + iAdmob7;
                        iBilling2 += iCrashlytics;
                    }
                    break;
                case 67:
                    if (c10736l.adcel(i5, i3, abstractC8760l2)) {
                        long jIsVip3 = isVip(j, abstractC8760l2);
                        size2 = C10107l.admob(i5);
                        iIsPro3 = C10107l.isPro((jIsVip3 << 1) ^ (jIsVip3 >> 63));
                        iSubs3 = iIsPro3 + size2;
                        iBilling2 += iSubs3;
                    }
                    break;
                case 68:
                    if (c10736l.adcel(i5, i3, abstractC8760l2)) {
                        AbstractC1200l abstractC1200l2 = (AbstractC1200l) unsafe.getObject(abstractC8760l2, j);
                        InterfaceC5100l interfaceC5100lRemoteconfig6 = c10736l.remoteconfig(i3);
                        Class cls23 = AbstractC0183l.yandex;
                        iCrashlytics = abstractC1200l2.yandex(interfaceC5100lRemoteconfig6) + (C10107l.admob(i5) * 2);
                        iBilling2 += iCrashlytics;
                    }
                    break;
            }
            i3 += 3;
        }
    }

    public final void ads(Object obj, int i, Object obj2, C5225l c5225l, C12676l c12676l) throws C8236l, C5347l, C8352l {
        long jM2974private = m2974private(i) & 1048575;
        Object objAdmob = AbstractC0357l.crashlytics.admob(jM2974private, obj);
        C3682l c3682l = this.remoteconfig;
        if (objAdmob == null) {
            c3682l.getClass();
            objAdmob = C7394l.f15320l.loadAd();
            AbstractC0357l.metrica(jM2974private, obj, objAdmob);
        } else {
            c3682l.getClass();
            if (!((C7394l) objAdmob).f15321l) {
                c3682l.getClass();
                C7394l c7394lLoadAd = C7394l.f15320l.loadAd();
                c3682l.yandex(c7394lLoadAd, objAdmob);
                AbstractC0357l.metrica(jM2974private, obj, c7394lLoadAd);
                objAdmob = c7394lLoadAd;
            }
        }
        c3682l.getClass();
        C7394l c7394l = (C7394l) objAdmob;
        c3682l.getClass();
        C0554l c0554l = ((C2382l) obj2).yandex;
        c12676l.m3487return(2);
        AbstractC9284l abstractC9284l = (AbstractC9284l) c12676l.purchase;
        int iPurchase = abstractC9284l.purchase(abstractC9284l.license());
        Object obj3 = c0554l.f1956l;
        Object objAppmetrica = "";
        Object objAppmetrica2 = obj3;
        while (true) {
            try {
                int iBilling = c12676l.billing();
                if (iBilling == Integer.MAX_VALUE || abstractC9284l.crashlytics()) {
                    break;
                }
                if (iBilling == 1) {
                    objAppmetrica = c12676l.appmetrica((EnumC3932l) c0554l.f1958l, null, null);
                } else if (iBilling != 2) {
                    try {
                        if (!c12676l.m3480l()) {
                            throw new C5957l("Unable to parse map entry.");
                        }
                    } catch (C5347l e) {
                        if (!c12676l.m3480l()) {
                            throw new C5957l("Unable to parse map entry.", e);
                        }
                    }
                } else {
                    objAppmetrica2 = c12676l.appmetrica((EnumC3932l) c0554l.f1957l, obj3.getClass(), c5225l);
                }
            } catch (Throwable th) {
                abstractC9284l.amazon(iPurchase);
                throw th;
            }
        }
        c7394l.put(objAppmetrica, objAppmetrica2);
        abstractC9284l.amazon(iPurchase);
    }

    @Override // defpackage.InterfaceC5100l
    public final AbstractC8760l amazon() {
        this.isPro.getClass();
        return ((AbstractC8760l) this.purchase).subs();
    }

    public final void applovin(Object obj, int i, C12676l c12676l, InterfaceC5100l interfaceC5100l, C5225l c5225l) throws C5957l {
        int iSignature;
        InterfaceC0400l interfaceC0400lYandex = this.firebase.yandex(i & 1048575, obj);
        AbstractC9284l abstractC9284l = (AbstractC9284l) c12676l.purchase;
        int i2 = c12676l.loadAd;
        if ((i2 & 7) != 2) {
            throw C5957l.loadAd();
        }
        do {
            AbstractC8760l abstractC8760lAmazon = interfaceC5100l.amazon();
            c12676l.vip(abstractC8760lAmazon, interfaceC5100l, c5225l);
            interfaceC5100l.loadAd(abstractC8760lAmazon);
            ((C10268l) interfaceC0400lYandex).add(abstractC8760lAmazon);
            if (abstractC9284l.crashlytics() || c12676l.amazon != 0) {
                return;
            } else {
                iSignature = abstractC9284l.Signature();
            }
        } while (iSignature == i2);
        c12676l.amazon = iSignature;
    }

    public final void appmetrica(int i, C12676l c12676l, Object obj) throws C8236l, C5347l, C8352l {
        if ((536870912 & i) != 0) {
            c12676l.m3487return(2);
            AbstractC0357l.metrica(i & 1048575, obj, ((AbstractC9284l) c12676l.purchase).tapsense());
        } else if (!this.billing) {
            AbstractC0357l.metrica(i & 1048575, obj, c12676l.ads());
        } else {
            c12676l.m3487return(2);
            AbstractC0357l.metrica(i & 1048575, obj, ((AbstractC9284l) c12676l.purchase).subscription());
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.InterfaceC5100l
    public final int billing(AbstractC8760l abstractC8760l) {
        int i;
        int iLoadAd;
        int i2;
        int[] iArr = this.yandex;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iM2974private = m2974private(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iM2974private;
            int i6 = 1237;
            int iHashCode = 37;
            switch (m2970native(iM2974private)) {
                case 0:
                    i = i3 * 53;
                    iLoadAd = AbstractC4579l.loadAd(Double.doubleToLongBits(AbstractC0357l.crashlytics.amazon(j, abstractC8760l)));
                    i3 = iLoadAd + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iLoadAd = Float.floatToIntBits(AbstractC0357l.crashlytics.purchase(j, abstractC8760l));
                    i3 = iLoadAd + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iLoadAd = AbstractC4579l.loadAd(AbstractC0357l.crashlytics.mopub(j, abstractC8760l));
                    i3 = iLoadAd + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iLoadAd = AbstractC4579l.loadAd(AbstractC0357l.crashlytics.mopub(j, abstractC8760l));
                    i3 = iLoadAd + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iLoadAd = AbstractC0357l.crashlytics.billing(j, abstractC8760l);
                    i3 = iLoadAd + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iLoadAd = AbstractC4579l.loadAd(AbstractC0357l.crashlytics.mopub(j, abstractC8760l));
                    i3 = iLoadAd + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iLoadAd = AbstractC0357l.crashlytics.billing(j, abstractC8760l);
                    i3 = iLoadAd + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zCrashlytics = AbstractC0357l.crashlytics.crashlytics(j, abstractC8760l);
                    Charset charset = AbstractC4579l.yandex;
                    if (zCrashlytics) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iLoadAd = ((String) AbstractC0357l.crashlytics.admob(j, abstractC8760l)).hashCode();
                    i3 = iLoadAd + i;
                    break;
                case 9:
                    Object objAdmob = AbstractC0357l.crashlytics.admob(j, abstractC8760l);
                    if (objAdmob != null) {
                        iHashCode = objAdmob.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iLoadAd = AbstractC0357l.crashlytics.admob(j, abstractC8760l).hashCode();
                    i3 = iLoadAd + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iLoadAd = AbstractC0357l.crashlytics.billing(j, abstractC8760l);
                    i3 = iLoadAd + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iLoadAd = AbstractC0357l.crashlytics.billing(j, abstractC8760l);
                    i3 = iLoadAd + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iLoadAd = AbstractC0357l.crashlytics.billing(j, abstractC8760l);
                    i3 = iLoadAd + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iLoadAd = AbstractC4579l.loadAd(AbstractC0357l.crashlytics.mopub(j, abstractC8760l));
                    i3 = iLoadAd + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iLoadAd = AbstractC0357l.crashlytics.billing(j, abstractC8760l);
                    i3 = iLoadAd + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iLoadAd = AbstractC4579l.loadAd(AbstractC0357l.crashlytics.mopub(j, abstractC8760l));
                    i3 = iLoadAd + i;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    Object objAdmob2 = AbstractC0357l.crashlytics.admob(j, abstractC8760l);
                    if (objAdmob2 != null) {
                        iHashCode = objAdmob2.hashCode();
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
                    iLoadAd = AbstractC0357l.crashlytics.admob(j, abstractC8760l).hashCode();
                    i3 = iLoadAd + i;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    i = i3 * 53;
                    iLoadAd = AbstractC0357l.crashlytics.admob(j, abstractC8760l).hashCode();
                    i3 = iLoadAd + i;
                    break;
                case 51:
                    if (adcel(i5, i4, abstractC8760l)) {
                        i = i3 * 53;
                        iLoadAd = AbstractC4579l.loadAd(Double.doubleToLongBits(((Double) AbstractC0357l.crashlytics.admob(j, abstractC8760l)).doubleValue()));
                        i3 = iLoadAd + i;
                    }
                    break;
                case 52:
                    if (adcel(i5, i4, abstractC8760l)) {
                        i = i3 * 53;
                        iLoadAd = Float.floatToIntBits(((Float) AbstractC0357l.crashlytics.admob(j, abstractC8760l)).floatValue());
                        i3 = iLoadAd + i;
                    }
                    break;
                case 53:
                    if (adcel(i5, i4, abstractC8760l)) {
                        i = i3 * 53;
                        iLoadAd = AbstractC4579l.loadAd(isVip(j, abstractC8760l));
                        i3 = iLoadAd + i;
                    }
                    break;
                case 54:
                    if (adcel(i5, i4, abstractC8760l)) {
                        i = i3 * 53;
                        iLoadAd = AbstractC4579l.loadAd(isVip(j, abstractC8760l));
                        i3 = iLoadAd + i;
                    }
                    break;
                case 55:
                    if (adcel(i5, i4, abstractC8760l)) {
                        i = i3 * 53;
                        iLoadAd = advert(j, abstractC8760l);
                        i3 = iLoadAd + i;
                    }
                    break;
                case 56:
                    if (adcel(i5, i4, abstractC8760l)) {
                        i = i3 * 53;
                        iLoadAd = AbstractC4579l.loadAd(isVip(j, abstractC8760l));
                        i3 = iLoadAd + i;
                    }
                    break;
                case 57:
                    if (adcel(i5, i4, abstractC8760l)) {
                        i = i3 * 53;
                        iLoadAd = advert(j, abstractC8760l);
                        i3 = iLoadAd + i;
                    }
                    break;
                case 58:
                    if (adcel(i5, i4, abstractC8760l)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) AbstractC0357l.crashlytics.admob(j, abstractC8760l)).booleanValue();
                        Charset charset2 = AbstractC4579l.yandex;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (adcel(i5, i4, abstractC8760l)) {
                        i = i3 * 53;
                        iLoadAd = ((String) AbstractC0357l.crashlytics.admob(j, abstractC8760l)).hashCode();
                        i3 = iLoadAd + i;
                    }
                    break;
                case 60:
                    if (adcel(i5, i4, abstractC8760l)) {
                        i = i3 * 53;
                        iLoadAd = AbstractC0357l.crashlytics.admob(j, abstractC8760l).hashCode();
                        i3 = iLoadAd + i;
                    }
                    break;
                case 61:
                    if (adcel(i5, i4, abstractC8760l)) {
                        i = i3 * 53;
                        iLoadAd = AbstractC0357l.crashlytics.admob(j, abstractC8760l).hashCode();
                        i3 = iLoadAd + i;
                    }
                    break;
                case 62:
                    if (adcel(i5, i4, abstractC8760l)) {
                        i = i3 * 53;
                        iLoadAd = advert(j, abstractC8760l);
                        i3 = iLoadAd + i;
                    }
                    break;
                case 63:
                    if (adcel(i5, i4, abstractC8760l)) {
                        i = i3 * 53;
                        iLoadAd = advert(j, abstractC8760l);
                        i3 = iLoadAd + i;
                    }
                    break;
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    if (adcel(i5, i4, abstractC8760l)) {
                        i = i3 * 53;
                        iLoadAd = advert(j, abstractC8760l);
                        i3 = iLoadAd + i;
                    }
                    break;
                case 65:
                    if (adcel(i5, i4, abstractC8760l)) {
                        i = i3 * 53;
                        iLoadAd = AbstractC4579l.loadAd(isVip(j, abstractC8760l));
                        i3 = iLoadAd + i;
                    }
                    break;
                case 66:
                    if (adcel(i5, i4, abstractC8760l)) {
                        i = i3 * 53;
                        iLoadAd = advert(j, abstractC8760l);
                        i3 = iLoadAd + i;
                    }
                    break;
                case 67:
                    if (adcel(i5, i4, abstractC8760l)) {
                        i = i3 * 53;
                        iLoadAd = AbstractC4579l.loadAd(isVip(j, abstractC8760l));
                        i3 = iLoadAd + i;
                    }
                    break;
                case 68:
                    if (adcel(i5, i4, abstractC8760l)) {
                        i = i3 * 53;
                        iLoadAd = AbstractC0357l.crashlytics.admob(j, abstractC8760l).hashCode();
                        i3 = iLoadAd + i;
                    }
                    break;
            }
        }
        this.smaato.getClass();
        return abstractC8760l.unknownFields.hashCode() + (i3 * 53);
    }

    @Override // defpackage.InterfaceC5100l
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
            int iM2974private = m2974private(i6);
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
            if ((268435456 & iM2974private) == 0 || metrica(obj, i6, i, i2, i10)) {
                int iM2970native = m2970native(iM2974private);
                if (iM2970native == 9 || iM2970native == 17) {
                    if (metrica(obj, i6, i, i2, i10)) {
                        if (!remoteconfig(i6).crashlytics(AbstractC0357l.crashlytics.admob(iM2974private & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                } else {
                    if (iM2970native != 27) {
                        if (iM2970native == 60 || iM2970native == 68) {
                            if (adcel(i7, i6, obj)) {
                                if (!remoteconfig(i6).crashlytics(AbstractC0357l.crashlytics.admob(iM2974private & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        } else if (iM2970native != 49) {
                            if (iM2970native != 50) {
                                continue;
                            } else {
                                Object objAdmob = AbstractC0357l.crashlytics.admob(iM2974private & 1048575, obj);
                                this.remoteconfig.getClass();
                                C7394l c7394l = (C7394l) objAdmob;
                                if (c7394l.isEmpty()) {
                                    continue;
                                } else {
                                    if (((EnumC3932l) ((C2382l) this.loadAd[(i6 / 3) * 2]).yandex.f1957l).f8109l != EnumC14480l.MESSAGE) {
                                        continue;
                                    } else {
                                        InterfaceC5100l interfaceC5100lYandex = null;
                                        for (Object obj2 : c7394l.values()) {
                                            if (interfaceC5100lYandex == null) {
                                                interfaceC5100lYandex = C16946l.crashlytics.yandex(obj2.getClass());
                                            }
                                            if (!interfaceC5100lYandex.crashlytics(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) AbstractC0357l.crashlytics.admob(iM2974private & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC5100l interfaceC5100lRemoteconfig = remoteconfig(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (interfaceC5100lRemoteconfig.crashlytics(list.get(i12))) {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final void m2972extends(Object obj, C7972l c7972l) {
        int i;
        int i2;
        int i3;
        boolean z;
        C10736l c10736l = this;
        C10107l c10107l = (C10107l) c7972l.f16631l;
        int[] iArr = c10736l.yandex;
        int length = iArr.length;
        Unsafe unsafe = metrica;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            int iM2974private = c10736l.m2974private(i6);
            int i8 = iArr[i6];
            int iM2970native = m2970native(iM2974private);
            if (iM2970native <= 17) {
                int i9 = iArr[i6 + 2];
                i = 1;
                int i10 = i9 & i4;
                if (i10 != i5) {
                    i7 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i2 = 1 << (i9 >>> 20);
            } else {
                i = 1;
                i2 = 0;
            }
            long j = iM2974private & i4;
            switch (iM2970native) {
                case 0:
                    if (c10736l.metrica(obj, i6, i5, i7, i2)) {
                        double dAmazon = AbstractC0357l.crashlytics.amazon(j, obj);
                        c10107l.getClass();
                        c10107l.tapsense(i8, Double.doubleToRawLongBits(dAmazon));
                    }
                    break;
                case 1:
                    if (c10736l.metrica(obj, i6, i5, i7, i2)) {
                        float fPurchase = AbstractC0357l.crashlytics.purchase(j, obj);
                        c10107l.getClass();
                        c10107l.ads(i8, Float.floatToRawIntBits(fPurchase));
                    }
                    c10736l = this;
                    break;
                case 2:
                    if (c10736l.metrica(obj, i6, i5, i7, i2)) {
                        c10107l.appmetrica(i8, unsafe.getLong(obj, j));
                    }
                    c10736l = this;
                    break;
                case 3:
                    if (c10736l.metrica(obj, i6, i5, i7, i2)) {
                        c10107l.appmetrica(i8, unsafe.getLong(obj, j));
                    }
                    c10736l = this;
                    break;
                case 4:
                    if (c10736l.metrica(obj, i6, i5, i7, i2)) {
                        c10107l.license(i8, unsafe.getInt(obj, j));
                    }
                    c10736l = this;
                    break;
                case 5:
                    if (c10736l.metrica(obj, i6, i5, i7, i2)) {
                        c10107l.tapsense(i8, unsafe.getLong(obj, j));
                    }
                    c10736l = this;
                    break;
                case 6:
                    if (c10736l.metrica(obj, i6, i5, i7, i2)) {
                        c10107l.ads(i8, unsafe.getInt(obj, j));
                    }
                    c10736l = this;
                    break;
                case 7:
                    if (c10736l.metrica(obj, i6, i5, i7, i2)) {
                        c10107l.metrica(i8, AbstractC0357l.crashlytics.crashlytics(j, obj));
                    }
                    c10736l = this;
                    break;
                case 8:
                    if (c10736l.metrica(obj, i6, i5, i7, i2)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            c10107l.advert(i8, (String) object);
                        } else {
                            c10107l.startapp(i8, (C4966l) object);
                        }
                    }
                    c10736l = this;
                    break;
                case 9:
                    if (c10736l.metrica(obj, i6, i5, i7, i2)) {
                        c7972l.m2247transient(i8, unsafe.getObject(obj, j), c10736l.remoteconfig(i6));
                    }
                    break;
                case 10:
                    if (c10736l.metrica(obj, i6, i5, i7, i2)) {
                        c10107l.startapp(i8, (C4966l) unsafe.getObject(obj, j));
                    }
                    c10736l = this;
                    break;
                case 11:
                    if (c10736l.metrica(obj, i6, i5, i7, i2)) {
                        c10107l.premium(i8, unsafe.getInt(obj, j));
                    }
                    c10736l = this;
                    break;
                case 12:
                    if (c10736l.metrica(obj, i6, i5, i7, i2)) {
                        c10107l.license(i8, unsafe.getInt(obj, j));
                    }
                    c10736l = this;
                    break;
                case 13:
                    if (c10736l.metrica(obj, i6, i5, i7, i2)) {
                        c10107l.ads(i8, unsafe.getInt(obj, j));
                    }
                    c10736l = this;
                    break;
                case 14:
                    if (c10736l.metrica(obj, i6, i5, i7, i2)) {
                        c10107l.tapsense(i8, unsafe.getLong(obj, j));
                    }
                    c10736l = this;
                    break;
                case 15:
                    if (c10736l.metrica(obj, i6, i5, i7, i2)) {
                        int i11 = unsafe.getInt(obj, j);
                        c10107l.premium(i8, (i11 >> 31) ^ (i11 << 1));
                    }
                    c10736l = this;
                    break;
                case 16:
                    if (c10736l.metrica(obj, i6, i5, i7, i2)) {
                        long j2 = unsafe.getLong(obj, j);
                        c10107l.appmetrica(i8, (j2 >> 63) ^ (j2 << 1));
                    }
                    c10736l = this;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    if (c10736l.metrica(obj, i6, i5, i7, i2)) {
                        Object object2 = unsafe.getObject(obj, j);
                        c10107l.signatures(i8, 3);
                        c10736l.remoteconfig(i6).subs((AbstractC1200l) object2, c7972l);
                        c10107l.signatures(i8, 4);
                    }
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    i5 = i5;
                    AbstractC0183l.vip(iArr[i6], (List) unsafe.getObject(obj, j), c7972l, false);
                    i5 = i5;
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    i5 = i5;
                    AbstractC0183l.ads(iArr[i6], (List) unsafe.getObject(obj, j), c7972l, false);
                    i5 = i5;
                    break;
                case 20:
                    i5 = i5;
                    AbstractC0183l.tapsense(iArr[i6], (List) unsafe.getObject(obj, j), c7972l, false);
                    i5 = i5;
                    break;
                case 21:
                    i5 = i5;
                    AbstractC0183l.isVip(iArr[i6], (List) unsafe.getObject(obj, j), c7972l, false);
                    i5 = i5;
                    break;
                case 22:
                    i5 = i5;
                    AbstractC0183l.subscription(iArr[i6], (List) unsafe.getObject(obj, j), c7972l, false);
                    i5 = i5;
                    break;
                case 23:
                    i5 = i5;
                    AbstractC0183l.adcel(iArr[i6], (List) unsafe.getObject(obj, j), c7972l, false);
                    i5 = i5;
                    break;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    i5 = i5;
                    AbstractC0183l.startapp(iArr[i6], (List) unsafe.getObject(obj, j), c7972l, false);
                    i5 = i5;
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    i5 = i5;
                    AbstractC0183l.remoteconfig(iArr[i6], (List) unsafe.getObject(obj, j), c7972l, false);
                    i5 = i5;
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    i3 = i5;
                    int i12 = iArr[i6];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = AbstractC0183l.yandex;
                    if (list != null && !list.isEmpty()) {
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            c10107l.advert(i12, (String) list.get(i13));
                        }
                    }
                    i5 = i3;
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    i3 = i5;
                    int i14 = iArr[i6];
                    List list2 = (List) unsafe.getObject(obj, j);
                    InterfaceC5100l interfaceC5100lRemoteconfig = c10736l.remoteconfig(i6);
                    Class cls2 = AbstractC0183l.yandex;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            c7972l.m2247transient(i14, list2.get(i15), interfaceC5100lRemoteconfig);
                        }
                    }
                    i5 = i3;
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    i3 = i5;
                    int i16 = iArr[i6];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = AbstractC0183l.yandex;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i17 = 0; i17 < list3.size(); i17++) {
                            c10107l.startapp(i16, (C4966l) list3.get(i17));
                        }
                    }
                    i5 = i3;
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    z = false;
                    AbstractC0183l.advert(iArr[i6], (List) unsafe.getObject(obj, j), c7972l, false);
                    i5 = i5;
                    break;
                case 30:
                    z = false;
                    AbstractC0183l.metrica(iArr[i6], (List) unsafe.getObject(obj, j), c7972l, false);
                    i5 = i5;
                    break;
                case 31:
                    z = false;
                    AbstractC0183l.Signature(iArr[i6], (List) unsafe.getObject(obj, j), c7972l, false);
                    i5 = i5;
                    break;
                case 32:
                    z = false;
                    AbstractC0183l.license(iArr[i6], (List) unsafe.getObject(obj, j), c7972l, false);
                    i5 = i5;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    z = false;
                    AbstractC0183l.pro(iArr[i6], (List) unsafe.getObject(obj, j), c7972l, false);
                    i5 = i5;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    z = false;
                    AbstractC0183l.ad(iArr[i6], (List) unsafe.getObject(obj, j), c7972l, false);
                    i5 = i5;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    i3 = i5;
                    AbstractC0183l.vip(iArr[i6], (List) unsafe.getObject(obj, j), c7972l, i);
                    i5 = i3;
                    break;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    i3 = i5;
                    AbstractC0183l.ads(iArr[i6], (List) unsafe.getObject(obj, j), c7972l, i);
                    i5 = i3;
                    break;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    i3 = i5;
                    AbstractC0183l.tapsense(iArr[i6], (List) unsafe.getObject(obj, j), c7972l, i);
                    i5 = i3;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    i3 = i5;
                    AbstractC0183l.isVip(iArr[i6], (List) unsafe.getObject(obj, j), c7972l, i);
                    i5 = i3;
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    i3 = i5;
                    AbstractC0183l.subscription(iArr[i6], (List) unsafe.getObject(obj, j), c7972l, i);
                    i5 = i3;
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    i3 = i5;
                    AbstractC0183l.adcel(iArr[i6], (List) unsafe.getObject(obj, j), c7972l, i);
                    i5 = i3;
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    i3 = i5;
                    AbstractC0183l.startapp(iArr[i6], (List) unsafe.getObject(obj, j), c7972l, i);
                    i5 = i3;
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    i3 = i5;
                    AbstractC0183l.remoteconfig(iArr[i6], (List) unsafe.getObject(obj, j), c7972l, i);
                    i5 = i3;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    i3 = i5;
                    AbstractC0183l.advert(iArr[i6], (List) unsafe.getObject(obj, j), c7972l, i);
                    i5 = i3;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    i3 = i5;
                    AbstractC0183l.metrica(iArr[i6], (List) unsafe.getObject(obj, j), c7972l, i);
                    i5 = i3;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    i3 = i5;
                    AbstractC0183l.Signature(iArr[i6], (List) unsafe.getObject(obj, j), c7972l, i);
                    i5 = i3;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    i3 = i5;
                    AbstractC0183l.license(iArr[i6], (List) unsafe.getObject(obj, j), c7972l, i);
                    i5 = i3;
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    i3 = i5;
                    AbstractC0183l.pro(iArr[i6], (List) unsafe.getObject(obj, j), c7972l, i);
                    i5 = i3;
                    break;
                case 48:
                    i3 = i5;
                    AbstractC0183l.ad(iArr[i6], (List) unsafe.getObject(obj, j), c7972l, true);
                    i5 = i3;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    i3 = i5;
                    int i18 = iArr[i6];
                    List list4 = (List) unsafe.getObject(obj, j);
                    InterfaceC5100l interfaceC5100lRemoteconfig2 = c10736l.remoteconfig(i6);
                    Class cls4 = AbstractC0183l.yandex;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i19 = 0; i19 < list4.size(); i19++) {
                            AbstractC1200l abstractC1200l = (AbstractC1200l) list4.get(i19);
                            c10107l.signatures(i18, 3);
                            interfaceC5100lRemoteconfig2.subs(abstractC1200l, c7972l);
                            c10107l.signatures(i18, 4);
                        }
                    }
                    i5 = i3;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Object object3 = unsafe.getObject(obj, j);
                    if (object3 != null) {
                        int i20 = 2;
                        Object obj2 = c10736l.loadAd[(i6 / 3) * 2];
                        c10736l.remoteconfig.getClass();
                        C0554l c0554l = ((C2382l) obj2).yandex;
                        c10107l.getClass();
                        for (Map.Entry entry : ((C7394l) object3).entrySet()) {
                            c10107l.signatures(i8, i20);
                            c10107l.applovin(C2382l.yandex(c0554l, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            C14306l.crashlytics(c10107l, (EnumC3932l) c0554l.f1958l, i, key);
                            i20 = 2;
                            C14306l.crashlytics(c10107l, (EnumC3932l) c0554l.f1957l, 2, value);
                            i5 = i5;
                            i = 1;
                        }
                    }
                    i3 = i5;
                    i5 = i3;
                    break;
                case 51:
                    if (c10736l.adcel(i8, i6, obj)) {
                        double dDoubleValue = ((Double) AbstractC0357l.crashlytics.admob(j, obj)).doubleValue();
                        c10107l.getClass();
                        c10107l.tapsense(i8, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (c10736l.adcel(i8, i6, obj)) {
                        float fFloatValue = ((Float) AbstractC0357l.crashlytics.admob(j, obj)).floatValue();
                        c10107l.getClass();
                        c10107l.ads(i8, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (c10736l.adcel(i8, i6, obj)) {
                        c10107l.appmetrica(i8, isVip(j, obj));
                    }
                    break;
                case 54:
                    if (c10736l.adcel(i8, i6, obj)) {
                        c10107l.appmetrica(i8, isVip(j, obj));
                    }
                    break;
                case 55:
                    if (c10736l.adcel(i8, i6, obj)) {
                        c10107l.license(i8, advert(j, obj));
                    }
                    break;
                case 56:
                    if (c10736l.adcel(i8, i6, obj)) {
                        c10107l.tapsense(i8, isVip(j, obj));
                    }
                    break;
                case 57:
                    if (c10736l.adcel(i8, i6, obj)) {
                        c10107l.ads(i8, advert(j, obj));
                    }
                    break;
                case 58:
                    if (c10736l.adcel(i8, i6, obj)) {
                        c10107l.metrica(i8, ((Boolean) AbstractC0357l.crashlytics.admob(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (c10736l.adcel(i8, i6, obj)) {
                        Object object4 = unsafe.getObject(obj, j);
                        if (object4 instanceof String) {
                            c10107l.advert(i8, (String) object4);
                        } else {
                            c10107l.startapp(i8, (C4966l) object4);
                        }
                    }
                    break;
                case 60:
                    if (c10736l.adcel(i8, i6, obj)) {
                        c7972l.m2247transient(i8, unsafe.getObject(obj, j), c10736l.remoteconfig(i6));
                    }
                    break;
                case 61:
                    if (c10736l.adcel(i8, i6, obj)) {
                        c10107l.startapp(i8, (C4966l) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (c10736l.adcel(i8, i6, obj)) {
                        c10107l.premium(i8, advert(j, obj));
                    }
                    break;
                case 63:
                    if (c10736l.adcel(i8, i6, obj)) {
                        c10107l.license(i8, advert(j, obj));
                    }
                    break;
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    if (c10736l.adcel(i8, i6, obj)) {
                        c10107l.ads(i8, advert(j, obj));
                    }
                    break;
                case 65:
                    if (c10736l.adcel(i8, i6, obj)) {
                        c10107l.tapsense(i8, isVip(j, obj));
                    }
                    break;
                case 66:
                    if (c10736l.adcel(i8, i6, obj)) {
                        int iAdvert = advert(j, obj);
                        c10107l.premium(i8, (iAdvert >> 31) ^ (iAdvert << 1));
                    }
                    break;
                case 67:
                    if (c10736l.adcel(i8, i6, obj)) {
                        long jIsVip = isVip(j, obj);
                        c10107l.appmetrica(i8, (jIsVip >> 63) ^ (jIsVip << i));
                    }
                    break;
                case 68:
                    if (c10736l.adcel(i8, i6, obj)) {
                        Object object5 = unsafe.getObject(obj, j);
                        c10107l.signatures(i8, 3);
                        c10736l.remoteconfig(i6).subs((AbstractC1200l) object5, c7972l);
                        c10107l.signatures(i8, 4);
                    }
                    break;
                default:
                    break;
            }
            i6 += 3;
            i4 = 1048575;
        }
        c10736l.smaato.getClass();
        ((AbstractC8760l) obj).unknownFields.amazon(c7972l);
    }

    public final void firebase(int i, Object obj, Object obj2) {
        int i2 = this.yandex[i];
        if (AbstractC0357l.crashlytics.admob(m2974private(i) & 1048575, obj) == null) {
            return;
        }
        smaato(i);
    }

    public final void inmobi(int i, C12676l c12676l, Object obj) throws C8236l, C5347l, C8352l {
        boolean z = (536870912 & i) != 0;
        C9899l c9899l = this.firebase;
        if (z) {
            c12676l.m3493this(c9899l.yandex(i & 1048575, obj), true);
        } else {
            c12676l.m3493this(c9899l.yandex(i & 1048575, obj), false);
        }
    }

    public final boolean isPro(AbstractC8760l abstractC8760l, AbstractC8760l abstractC8760l2, int i) {
        return vip(i, abstractC8760l) == vip(i, abstractC8760l2);
    }

    public final Object license(int i, int i2, Object obj) {
        InterfaceC5100l interfaceC5100lRemoteconfig = remoteconfig(i2);
        if (!adcel(i, i2, obj)) {
            return interfaceC5100lRemoteconfig.amazon();
        }
        Object object = metrica.getObject(obj, m2974private(i2) & 1048575);
        if (startapp(object)) {
            return object;
        }
        AbstractC8760l abstractC8760lAmazon = interfaceC5100lRemoteconfig.amazon();
        if (object != null) {
            interfaceC5100lRemoteconfig.yandex(abstractC8760lAmazon, object);
        }
        return abstractC8760lAmazon;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[SYNTHETIC] */
    @Override // defpackage.InterfaceC5100l
    public final void loadAd(Object obj) {
        if (startapp(obj)) {
            if (obj instanceof AbstractC8760l) {
                AbstractC8760l abstractC8760l = (AbstractC8760l) obj;
                abstractC8760l.firebase(Alert.DURATION_SHOW_INDEFINITELY);
                abstractC8760l.memoizedHashCode = 0;
                abstractC8760l.admob();
            }
            int[] iArr = this.yandex;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iM2974private = m2974private(i);
                long j = 1048575 & iM2974private;
                int iM2970native = m2970native(iM2974private);
                if (iM2970native != 9) {
                    if (iM2970native != 60 && iM2970native != 68) {
                        switch (iM2970native) {
                            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                                if (vip(i, obj)) {
                                    remoteconfig(i).loadAd(metrica.getObject(obj, j));
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
                                C10268l c10268l = (C10268l) ((InterfaceC0400l) AbstractC0357l.crashlytics.admob(j, obj));
                                if (c10268l.f20905l) {
                                    c10268l.f20905l = false;
                                }
                                break;
                            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                Unsafe unsafe = metrica;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.remoteconfig.getClass();
                                    ((C7394l) object).f15321l = false;
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (adcel(iArr[i], i, obj)) {
                        remoteconfig(i).loadAd(metrica.getObject(obj, j));
                    }
                } else if (vip(i, obj)) {
                    remoteconfig(i).loadAd(metrica.getObject(obj, j));
                }
            }
            this.smaato.getClass();
            C0774l c0774l = ((AbstractC8760l) obj).unknownFields;
            if (c0774l.purchase) {
                c0774l.purchase = false;
            }
        }
    }

    public final boolean metrica(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return vip(i, obj);
        }
        return (i3 & i4) != 0;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 18321. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // defpackage.InterfaceC5100l
    public final void mopub(java.lang.Object r19, defpackage.C12676l r20, defpackage.C5225l r21) {
        /*
            Method dump skipped, instruction units count: 1832
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10736l.mopub(java.lang.Object, lّ٘ۦ, lؘؗۢ):void");
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void m2973package(int i, Object obj) {
        int i2 = this.yandex[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        AbstractC0357l.remoteconfig(j, obj, (1 << (i2 >>> 20)) | AbstractC0357l.crashlytics.billing(j, obj));
    }

    public final void premium(Object obj, long j, C12676l c12676l, InterfaceC5100l interfaceC5100l, C5225l c5225l) throws C5347l {
        int iSignature;
        InterfaceC0400l interfaceC0400lYandex = this.firebase.yandex(j, obj);
        AbstractC9284l abstractC9284l = (AbstractC9284l) c12676l.purchase;
        int i = c12676l.loadAd;
        if ((i & 7) != 3) {
            throw C5957l.loadAd();
        }
        do {
            AbstractC8760l abstractC8760lAmazon = interfaceC5100l.amazon();
            c12676l.firebase(abstractC8760lAmazon, interfaceC5100l, c5225l);
            interfaceC5100l.loadAd(abstractC8760lAmazon);
            ((C10268l) interfaceC0400lYandex).add(abstractC8760lAmazon);
            if (abstractC9284l.crashlytics() || c12676l.amazon != 0) {
                return;
            } else {
                iSignature = abstractC9284l.Signature();
            }
        } while (iSignature == i);
        c12676l.amazon = iSignature;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final int m2974private(int i) {
        return this.yandex[i + 1];
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // defpackage.InterfaceC5100l
    public final boolean purchase(AbstractC8760l abstractC8760l, AbstractC8760l abstractC8760l2) {
        int[] iArr = this.yandex;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zSmaato = true;
            if (i < length) {
                int iM2974private = m2974private(i);
                long j = iM2974private & 1048575;
                switch (m2970native(iM2974private)) {
                    case 0:
                        if (!isPro(abstractC8760l, abstractC8760l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC16819l abstractC16819l = AbstractC0357l.crashlytics;
                            if (Double.doubleToLongBits(abstractC16819l.amazon(j, abstractC8760l)) != Double.doubleToLongBits(abstractC16819l.amazon(j, abstractC8760l2))) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 1:
                        if (!isPro(abstractC8760l, abstractC8760l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC16819l abstractC16819l2 = AbstractC0357l.crashlytics;
                            if (Float.floatToIntBits(abstractC16819l2.purchase(j, abstractC8760l)) != Float.floatToIntBits(abstractC16819l2.purchase(j, abstractC8760l2))) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 2:
                        if (!isPro(abstractC8760l, abstractC8760l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC16819l abstractC16819l3 = AbstractC0357l.crashlytics;
                            if (abstractC16819l3.mopub(j, abstractC8760l) != abstractC16819l3.mopub(j, abstractC8760l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 3:
                        if (!isPro(abstractC8760l, abstractC8760l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC16819l abstractC16819l4 = AbstractC0357l.crashlytics;
                            if (abstractC16819l4.mopub(j, abstractC8760l) != abstractC16819l4.mopub(j, abstractC8760l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 4:
                        if (!isPro(abstractC8760l, abstractC8760l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC16819l abstractC16819l5 = AbstractC0357l.crashlytics;
                            if (abstractC16819l5.billing(j, abstractC8760l) != abstractC16819l5.billing(j, abstractC8760l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 5:
                        if (!isPro(abstractC8760l, abstractC8760l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC16819l abstractC16819l6 = AbstractC0357l.crashlytics;
                            if (abstractC16819l6.mopub(j, abstractC8760l) != abstractC16819l6.mopub(j, abstractC8760l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 6:
                        if (!isPro(abstractC8760l, abstractC8760l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC16819l abstractC16819l7 = AbstractC0357l.crashlytics;
                            if (abstractC16819l7.billing(j, abstractC8760l) != abstractC16819l7.billing(j, abstractC8760l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 7:
                        if (!isPro(abstractC8760l, abstractC8760l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC16819l abstractC16819l8 = AbstractC0357l.crashlytics;
                            if (abstractC16819l8.crashlytics(j, abstractC8760l) != abstractC16819l8.crashlytics(j, abstractC8760l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 8:
                        if (!isPro(abstractC8760l, abstractC8760l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC16819l abstractC16819l9 = AbstractC0357l.crashlytics;
                            if (!AbstractC0183l.smaato(abstractC16819l9.admob(j, abstractC8760l), abstractC16819l9.admob(j, abstractC8760l2))) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 9:
                        if (!isPro(abstractC8760l, abstractC8760l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC16819l abstractC16819l10 = AbstractC0357l.crashlytics;
                            if (!AbstractC0183l.smaato(abstractC16819l10.admob(j, abstractC8760l), abstractC16819l10.admob(j, abstractC8760l2))) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 10:
                        if (!isPro(abstractC8760l, abstractC8760l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC16819l abstractC16819l11 = AbstractC0357l.crashlytics;
                            if (!AbstractC0183l.smaato(abstractC16819l11.admob(j, abstractC8760l), abstractC16819l11.admob(j, abstractC8760l2))) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 11:
                        if (!isPro(abstractC8760l, abstractC8760l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC16819l abstractC16819l12 = AbstractC0357l.crashlytics;
                            if (abstractC16819l12.billing(j, abstractC8760l) != abstractC16819l12.billing(j, abstractC8760l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 12:
                        if (!isPro(abstractC8760l, abstractC8760l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC16819l abstractC16819l13 = AbstractC0357l.crashlytics;
                            if (abstractC16819l13.billing(j, abstractC8760l) != abstractC16819l13.billing(j, abstractC8760l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 13:
                        if (!isPro(abstractC8760l, abstractC8760l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC16819l abstractC16819l14 = AbstractC0357l.crashlytics;
                            if (abstractC16819l14.billing(j, abstractC8760l) != abstractC16819l14.billing(j, abstractC8760l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 14:
                        if (!isPro(abstractC8760l, abstractC8760l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC16819l abstractC16819l15 = AbstractC0357l.crashlytics;
                            if (abstractC16819l15.mopub(j, abstractC8760l) != abstractC16819l15.mopub(j, abstractC8760l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 15:
                        if (!isPro(abstractC8760l, abstractC8760l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC16819l abstractC16819l16 = AbstractC0357l.crashlytics;
                            if (abstractC16819l16.billing(j, abstractC8760l) != abstractC16819l16.billing(j, abstractC8760l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case 16:
                        if (!isPro(abstractC8760l, abstractC8760l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC16819l abstractC16819l17 = AbstractC0357l.crashlytics;
                            if (abstractC16819l17.mopub(j, abstractC8760l) != abstractC16819l17.mopub(j, abstractC8760l2)) {
                                zSmaato = false;
                            }
                        }
                        break;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        if (!isPro(abstractC8760l, abstractC8760l2, i)) {
                            zSmaato = false;
                        } else {
                            AbstractC16819l abstractC16819l18 = AbstractC0357l.crashlytics;
                            if (!AbstractC0183l.smaato(abstractC16819l18.admob(j, abstractC8760l), abstractC16819l18.admob(j, abstractC8760l2))) {
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
                        AbstractC16819l abstractC16819l19 = AbstractC0357l.crashlytics;
                        zSmaato = AbstractC0183l.smaato(abstractC16819l19.admob(j, abstractC8760l), abstractC16819l19.admob(j, abstractC8760l2));
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        AbstractC16819l abstractC16819l20 = AbstractC0357l.crashlytics;
                        zSmaato = AbstractC0183l.smaato(abstractC16819l20.admob(j, abstractC8760l), abstractC16819l20.admob(j, abstractC8760l2));
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
                        AbstractC16819l abstractC16819l21 = AbstractC0357l.crashlytics;
                        if (abstractC16819l21.billing(j2, abstractC8760l) != abstractC16819l21.billing(j2, abstractC8760l2) || !AbstractC0183l.smaato(abstractC16819l21.admob(j, abstractC8760l), abstractC16819l21.admob(j, abstractC8760l2))) {
                            zSmaato = false;
                        }
                        break;
                }
                if (zSmaato) {
                    i += 3;
                }
            } else {
                C5382l c5382l = this.smaato;
                c5382l.getClass();
                C0774l c0774l = abstractC8760l.unknownFields;
                c5382l.getClass();
                if (c0774l.equals(abstractC8760l2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final InterfaceC5100l remoteconfig(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.loadAd;
        InterfaceC5100l interfaceC5100l = (InterfaceC5100l) objArr[i2];
        if (interfaceC5100l != null) {
            return interfaceC5100l;
        }
        InterfaceC5100l interfaceC5100lYandex = C16946l.crashlytics.yandex((Class) objArr[i2 + 1]);
        objArr[i2] = interfaceC5100lYandex;
        return interfaceC5100lYandex;
    }

    public final int signatures(int i) {
        if (i < this.crashlytics || i > this.amazon) {
            return -1;
        }
        int[] iArr = this.yandex;
        int length = (iArr.length / 3) - 1;
        int i2 = 0;
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

    public final void smaato(int i) {
        if (this.loadAd[AbstractC15560l.remoteconfig(i, 3, 2, 1)] == null) {
            return;
        }
        C18725l.loadAd();
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final void m2975strictfp(Object obj, int i, AbstractC1200l abstractC1200l) {
        metrica.putObject(obj, m2974private(i) & 1048575, abstractC1200l);
        m2973package(i, obj);
    }

    @Override // defpackage.InterfaceC5100l
    public final void subs(Object obj, C7972l c7972l) {
        m2972extends(obj, c7972l);
    }

    public final void subscription(int i, Object obj, Object obj2) {
        if (vip(i, obj2)) {
            long jM2974private = m2974private(i) & 1048575;
            Unsafe unsafe = metrica;
            Object object = unsafe.getObject(obj2, jM2974private);
            if (object == null) {
                C6541l.billing(this.yandex[i], obj2);
                return;
            }
            InterfaceC5100l interfaceC5100lRemoteconfig = remoteconfig(i);
            if (!vip(i, obj)) {
                if (startapp(object)) {
                    AbstractC8760l abstractC8760lAmazon = interfaceC5100lRemoteconfig.amazon();
                    interfaceC5100lRemoteconfig.yandex(abstractC8760lAmazon, object);
                    unsafe.putObject(obj, jM2974private, abstractC8760lAmazon);
                } else {
                    unsafe.putObject(obj, jM2974private, object);
                }
                m2973package(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM2974private);
            if (!startapp(object2)) {
                AbstractC8760l abstractC8760lAmazon2 = interfaceC5100lRemoteconfig.amazon();
                interfaceC5100lRemoteconfig.yandex(abstractC8760lAmazon2, object2);
                unsafe.putObject(obj, jM2974private, abstractC8760lAmazon2);
                object2 = abstractC8760lAmazon2;
            }
            interfaceC5100lRemoteconfig.yandex(object2, object);
        }
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void m2976synchronized(int i, int i2, Object obj) {
        AbstractC0357l.remoteconfig(this.yandex[i2 + 2] & 1048575, obj, i);
    }

    public final void tapsense(int i, Object obj, Object obj2) {
        int[] iArr = this.yandex;
        int i2 = iArr[i];
        if (adcel(i2, i, obj2)) {
            long jM2974private = m2974private(i) & 1048575;
            Unsafe unsafe = metrica;
            Object object = unsafe.getObject(obj2, jM2974private);
            if (object == null) {
                C6541l.billing(iArr[i], obj2);
                return;
            }
            InterfaceC5100l interfaceC5100lRemoteconfig = remoteconfig(i);
            if (!adcel(i2, i, obj)) {
                if (startapp(object)) {
                    AbstractC8760l abstractC8760lAmazon = interfaceC5100lRemoteconfig.amazon();
                    interfaceC5100lRemoteconfig.yandex(abstractC8760lAmazon, object);
                    unsafe.putObject(obj, jM2974private, abstractC8760lAmazon);
                } else {
                    unsafe.putObject(obj, jM2974private, object);
                }
                m2976synchronized(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM2974private);
            if (!startapp(object2)) {
                AbstractC8760l abstractC8760lAmazon2 = interfaceC5100lRemoteconfig.amazon();
                interfaceC5100lRemoteconfig.yandex(abstractC8760lAmazon2, object2);
                unsafe.putObject(obj, jM2974private, abstractC8760lAmazon2);
                object2 = abstractC8760lAmazon2;
            }
            interfaceC5100lRemoteconfig.yandex(object2, object);
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0110 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0111 A[RETURN] */
    public final boolean vip(int i, Object obj) {
        int i2 = this.yandex[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & AbstractC0357l.crashlytics.billing(j, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iM2974private = m2974private(i);
        long j2 = iM2974private & 1048575;
        switch (m2970native(iM2974private)) {
            case 0:
                if (Double.doubleToRawLongBits(AbstractC0357l.crashlytics.amazon(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(AbstractC0357l.crashlytics.purchase(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (AbstractC0357l.crashlytics.mopub(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (AbstractC0357l.crashlytics.mopub(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (AbstractC0357l.crashlytics.billing(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (AbstractC0357l.crashlytics.mopub(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (AbstractC0357l.crashlytics.billing(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return AbstractC0357l.crashlytics.crashlytics(j2, obj);
            case 8:
                Object objAdmob = AbstractC0357l.crashlytics.admob(j2, obj);
                if (objAdmob instanceof String) {
                    return !((String) objAdmob).isEmpty();
                }
                if (objAdmob instanceof C4966l) {
                    return !C4966l.f10110l.equals(objAdmob);
                }
                C11983l.crashlytics();
                return false;
            case 9:
                if (AbstractC0357l.crashlytics.admob(j2, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                return !C4966l.f10110l.equals(AbstractC0357l.crashlytics.admob(j2, obj));
            case 11:
                if (AbstractC0357l.crashlytics.billing(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (AbstractC0357l.crashlytics.billing(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (AbstractC0357l.crashlytics.billing(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (AbstractC0357l.crashlytics.mopub(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (AbstractC0357l.crashlytics.billing(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (AbstractC0357l.crashlytics.mopub(j2, obj) != 0) {
                    return true;
                }
                return false;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                if (AbstractC0357l.crashlytics.admob(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                C11983l.crashlytics();
                return false;
        }
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final void m2977volatile(Object obj, int i, int i2, AbstractC1200l abstractC1200l) {
        metrica.putObject(obj, m2974private(i2) & 1048575, abstractC1200l);
        m2976synchronized(i, i2, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // defpackage.InterfaceC5100l
    public final void yandex(Object obj, Object obj2) {
        Object obj3;
        if (!startapp(obj)) {
            C8339l.metrica(AbstractC15560l.subscription(obj, "Mutating immutable message: "));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.yandex;
            if (i >= iArr.length) {
                AbstractC0183l.firebase(this.smaato, obj, obj2);
                return;
            }
            int iM2974private = m2974private(i);
            long j = 1048575 & iM2974private;
            int i2 = iArr[i];
            switch (m2970native(iM2974private)) {
                case 0:
                    if (!vip(i, obj2)) {
                        obj3 = obj;
                    } else {
                        AbstractC16819l abstractC16819l = AbstractC0357l.crashlytics;
                        obj3 = obj;
                        abstractC16819l.smaato(obj3, j, abstractC16819l.amazon(j, obj2));
                        m2973package(i, obj3);
                    }
                    break;
                case 1:
                    if (vip(i, obj2)) {
                        AbstractC16819l abstractC16819l2 = AbstractC0357l.crashlytics;
                        abstractC16819l2.remoteconfig(obj, j, abstractC16819l2.purchase(j, obj2));
                        m2973package(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (vip(i, obj2)) {
                        AbstractC0357l.vip(j, AbstractC0357l.crashlytics.mopub(j, obj2), obj);
                        m2973package(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (vip(i, obj2)) {
                        AbstractC0357l.vip(j, AbstractC0357l.crashlytics.mopub(j, obj2), obj);
                        m2973package(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (vip(i, obj2)) {
                        AbstractC0357l.remoteconfig(j, obj, AbstractC0357l.crashlytics.billing(j, obj2));
                        m2973package(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (vip(i, obj2)) {
                        AbstractC0357l.vip(j, AbstractC0357l.crashlytics.mopub(j, obj2), obj);
                        m2973package(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (vip(i, obj2)) {
                        AbstractC0357l.remoteconfig(j, obj, AbstractC0357l.crashlytics.billing(j, obj2));
                        m2973package(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (vip(i, obj2)) {
                        AbstractC16819l abstractC16819l3 = AbstractC0357l.crashlytics;
                        abstractC16819l3.isPro(obj, j, abstractC16819l3.crashlytics(j, obj2));
                        m2973package(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (vip(i, obj2)) {
                        AbstractC0357l.metrica(j, obj, AbstractC0357l.crashlytics.admob(j, obj2));
                        m2973package(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    subscription(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (vip(i, obj2)) {
                        AbstractC0357l.metrica(j, obj, AbstractC0357l.crashlytics.admob(j, obj2));
                        m2973package(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (vip(i, obj2)) {
                        AbstractC0357l.remoteconfig(j, obj, AbstractC0357l.crashlytics.billing(j, obj2));
                        m2973package(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (vip(i, obj2)) {
                        AbstractC0357l.remoteconfig(j, obj, AbstractC0357l.crashlytics.billing(j, obj2));
                        m2973package(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (vip(i, obj2)) {
                        AbstractC0357l.remoteconfig(j, obj, AbstractC0357l.crashlytics.billing(j, obj2));
                        m2973package(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (vip(i, obj2)) {
                        AbstractC0357l.vip(j, AbstractC0357l.crashlytics.mopub(j, obj2), obj);
                        m2973package(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (vip(i, obj2)) {
                        AbstractC0357l.remoteconfig(j, obj, AbstractC0357l.crashlytics.billing(j, obj2));
                        m2973package(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (vip(i, obj2)) {
                        AbstractC0357l.vip(j, AbstractC0357l.crashlytics.mopub(j, obj2), obj);
                        m2973package(i, obj);
                    }
                    obj3 = obj;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    subscription(i, obj, obj2);
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
                    AbstractC16819l abstractC16819l4 = AbstractC0357l.crashlytics;
                    InterfaceC0400l interfaceC0400lMopub = (InterfaceC0400l) abstractC16819l4.admob(j, obj);
                    InterfaceC0400l interfaceC0400l = (InterfaceC0400l) abstractC16819l4.admob(j, obj2);
                    int i3 = ((C10268l) interfaceC0400lMopub).f20903l;
                    int i4 = ((C10268l) interfaceC0400l).f20903l;
                    if (i3 > 0 && i4 > 0) {
                        if (!((C10268l) interfaceC0400lMopub).f20905l) {
                            interfaceC0400lMopub = ((C10268l) interfaceC0400lMopub).mopub(i4 + i3);
                        }
                        ((C10268l) interfaceC0400lMopub).addAll(interfaceC0400l);
                    }
                    if (i3 > 0) {
                        interfaceC0400l = interfaceC0400lMopub;
                    }
                    AbstractC0357l.metrica(j, obj, interfaceC0400l);
                    obj3 = obj;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Class cls = AbstractC0183l.yandex;
                    AbstractC16819l abstractC16819l5 = AbstractC0357l.crashlytics;
                    AbstractC0357l.metrica(j, obj, this.remoteconfig.yandex(abstractC16819l5.admob(j, obj), abstractC16819l5.admob(j, obj2)));
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
                    if (adcel(i2, i, obj2)) {
                        AbstractC0357l.metrica(j, obj, AbstractC0357l.crashlytics.admob(j, obj2));
                        m2976synchronized(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    tapsense(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (adcel(i2, i, obj2)) {
                        AbstractC0357l.metrica(j, obj, AbstractC0357l.crashlytics.admob(j, obj2));
                        m2976synchronized(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    tapsense(i, obj, obj2);
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
