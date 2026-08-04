package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* JADX INFO: renamed from: lَٓۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14383l {
    public final C5991l yandex;

    public C14383l(EnumC2564l enumC2564l, EnumC2564l enumC2564l2, Object obj) {
        this.yandex = new C5991l(enumC2564l, enumC2564l2, obj, 13);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x011b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0123  */
    /* JADX WARN: Code duplicated, block: B:46:0x0127  */
    /* JADX WARN: Code duplicated, block: B:47:0x0137  */
    /* JADX WARN: Code duplicated, block: B:48:0x0148  */
    /* JADX WARN: Code duplicated, block: B:49:0x014f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0157  */
    /* JADX WARN: Code duplicated, block: B:53:0x015b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0168  */
    /* JADX WARN: Code duplicated, block: B:55:0x0175  */
    /* JADX WARN: Code duplicated, block: B:56:0x0181  */
    /* JADX WARN: Code duplicated, block: B:58:0x0185  */
    /* JADX WARN: Code duplicated, block: B:60:0x0193  */
    /* JADX WARN: Code duplicated, block: B:61:0x019b  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:70:0x01df  */
    /* JADX WARN: Code duplicated, block: B:71:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:73:0x0201  */
    /* JADX WARN: Code duplicated, block: B:74:0x0208  */
    public static int loadAd(C5991l c5991l, Object obj, Object obj2) {
        int iLoadAd;
        int iLoadAd2;
        int iYandex;
        int i;
        int iYandex2;
        int iLoadAd3;
        int iYandex3;
        EnumC2564l enumC2564l = (EnumC2564l) c5991l.f12716l;
        EnumC2564l enumC2564l2 = (EnumC2564l) c5991l.f12715l;
        int i2 = C1111l.crashlytics;
        int iLoadAd4 = 8;
        int iYandex4 = AbstractC10908l.yandex(8);
        EnumC2564l enumC2564l3 = EnumC2564l.f5571l;
        if (enumC2564l == enumC2564l3) {
            iYandex4 += iYandex4;
        }
        EnumC13744l enumC13744l = EnumC13744l.f26828l;
        switch (enumC2564l.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iLoadAd = 8;
                i = iLoadAd + iYandex4;
                iYandex2 = AbstractC10908l.yandex(16);
                if (enumC2564l2 == enumC2564l3) {
                    iYandex2 += iYandex2;
                }
                switch (enumC2564l2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 2:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 3:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 4:
                        iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iLoadAd4 = 1;
                        return iLoadAd4 + iYandex2 + i;
                    case 8:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = AbstractC13388l.loadAd((String) obj2);
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 9:
                        iLoadAd4 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        return iLoadAd4 + iYandex2 + i;
                    case 10:
                        iLoadAd3 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 11:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = ((byte[]) obj2).length;
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 12:
                        iLoadAd4 = AbstractC10908l.yandex(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC6759l) {
                            iLoadAd4 = AbstractC10908l.loadAd(((InterfaceC6759l) obj2).zza());
                        } else {
                            iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        }
                        return iLoadAd4 + iYandex2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 16:
                        int iIntValue = ((Integer) obj2).intValue();
                        iLoadAd4 = AbstractC10908l.yandex((iIntValue >> 31) ^ (iIntValue + iIntValue));
                        return iLoadAd4 + iYandex2 + i;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        long jLongValue = ((Long) obj2).longValue();
                        iLoadAd4 = AbstractC10908l.loadAd((jLongValue >> 63) ^ (jLongValue + jLongValue));
                        return iLoadAd4 + iYandex2 + i;
                    default:
                        C18073l.license("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 1:
                ((Float) obj).getClass();
                iLoadAd = 4;
                i = iLoadAd + iYandex4;
                iYandex2 = AbstractC10908l.yandex(16);
                if (enumC2564l2 == enumC2564l3) {
                    iYandex2 += iYandex2;
                }
                switch (enumC2564l2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 2:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 3:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 4:
                        iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iLoadAd4 = 1;
                        return iLoadAd4 + iYandex2 + i;
                    case 8:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = AbstractC13388l.loadAd((String) obj2);
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 9:
                        iLoadAd4 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        return iLoadAd4 + iYandex2 + i;
                    case 10:
                        iLoadAd3 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 11:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = ((byte[]) obj2).length;
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 12:
                        iLoadAd4 = AbstractC10908l.yandex(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC6759l) {
                            iLoadAd4 = AbstractC10908l.loadAd(((InterfaceC6759l) obj2).zza());
                        } else {
                            iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        }
                        return iLoadAd4 + iYandex2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 16:
                        int iIntValue2 = ((Integer) obj2).intValue();
                        iLoadAd4 = AbstractC10908l.yandex((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                        return iLoadAd4 + iYandex2 + i;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        long jLongValue2 = ((Long) obj2).longValue();
                        iLoadAd4 = AbstractC10908l.loadAd((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                        return iLoadAd4 + iYandex2 + i;
                    default:
                        C18073l.license("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 2:
                iLoadAd = AbstractC10908l.loadAd(((Long) obj).longValue());
                i = iLoadAd + iYandex4;
                iYandex2 = AbstractC10908l.yandex(16);
                if (enumC2564l2 == enumC2564l3) {
                    iYandex2 += iYandex2;
                }
                switch (enumC2564l2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 2:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 3:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 4:
                        iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iLoadAd4 = 1;
                        return iLoadAd4 + iYandex2 + i;
                    case 8:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = AbstractC13388l.loadAd((String) obj2);
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 9:
                        iLoadAd4 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        return iLoadAd4 + iYandex2 + i;
                    case 10:
                        iLoadAd3 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 11:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = ((byte[]) obj2).length;
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 12:
                        iLoadAd4 = AbstractC10908l.yandex(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC6759l) {
                            iLoadAd4 = AbstractC10908l.loadAd(((InterfaceC6759l) obj2).zza());
                        } else {
                            iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        }
                        return iLoadAd4 + iYandex2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 16:
                        int iIntValue3 = ((Integer) obj2).intValue();
                        iLoadAd4 = AbstractC10908l.yandex((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                        return iLoadAd4 + iYandex2 + i;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        long jLongValue3 = ((Long) obj2).longValue();
                        iLoadAd4 = AbstractC10908l.loadAd((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                        return iLoadAd4 + iYandex2 + i;
                    default:
                        C18073l.license("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 3:
                iLoadAd = AbstractC10908l.loadAd(((Long) obj).longValue());
                i = iLoadAd + iYandex4;
                iYandex2 = AbstractC10908l.yandex(16);
                if (enumC2564l2 == enumC2564l3) {
                    iYandex2 += iYandex2;
                }
                switch (enumC2564l2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 2:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 3:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 4:
                        iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iLoadAd4 = 1;
                        return iLoadAd4 + iYandex2 + i;
                    case 8:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = AbstractC13388l.loadAd((String) obj2);
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 9:
                        iLoadAd4 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        return iLoadAd4 + iYandex2 + i;
                    case 10:
                        iLoadAd3 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 11:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = ((byte[]) obj2).length;
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 12:
                        iLoadAd4 = AbstractC10908l.yandex(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC6759l) {
                            iLoadAd4 = AbstractC10908l.loadAd(((InterfaceC6759l) obj2).zza());
                        } else {
                            iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        }
                        return iLoadAd4 + iYandex2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 16:
                        int iIntValue4 = ((Integer) obj2).intValue();
                        iLoadAd4 = AbstractC10908l.yandex((iIntValue4 >> 31) ^ (iIntValue4 + iIntValue4));
                        return iLoadAd4 + iYandex2 + i;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        long jLongValue4 = ((Long) obj2).longValue();
                        iLoadAd4 = AbstractC10908l.loadAd((jLongValue4 >> 63) ^ (jLongValue4 + jLongValue4));
                        return iLoadAd4 + iYandex2 + i;
                    default:
                        C18073l.license("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 4:
                iLoadAd = AbstractC10908l.loadAd(((Integer) obj).intValue());
                i = iLoadAd + iYandex4;
                iYandex2 = AbstractC10908l.yandex(16);
                if (enumC2564l2 == enumC2564l3) {
                    iYandex2 += iYandex2;
                }
                switch (enumC2564l2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 2:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 3:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 4:
                        iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iLoadAd4 = 1;
                        return iLoadAd4 + iYandex2 + i;
                    case 8:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = AbstractC13388l.loadAd((String) obj2);
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 9:
                        iLoadAd4 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        return iLoadAd4 + iYandex2 + i;
                    case 10:
                        iLoadAd3 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 11:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = ((byte[]) obj2).length;
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 12:
                        iLoadAd4 = AbstractC10908l.yandex(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC6759l) {
                            iLoadAd4 = AbstractC10908l.loadAd(((InterfaceC6759l) obj2).zza());
                        } else {
                            iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        }
                        return iLoadAd4 + iYandex2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 16:
                        int iIntValue5 = ((Integer) obj2).intValue();
                        iLoadAd4 = AbstractC10908l.yandex((iIntValue5 >> 31) ^ (iIntValue5 + iIntValue5));
                        return iLoadAd4 + iYandex2 + i;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        long jLongValue5 = ((Long) obj2).longValue();
                        iLoadAd4 = AbstractC10908l.loadAd((jLongValue5 >> 63) ^ (jLongValue5 + jLongValue5));
                        return iLoadAd4 + iYandex2 + i;
                    default:
                        C18073l.license("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 5:
                ((Long) obj).getClass();
                iLoadAd = 8;
                i = iLoadAd + iYandex4;
                iYandex2 = AbstractC10908l.yandex(16);
                if (enumC2564l2 == enumC2564l3) {
                    iYandex2 += iYandex2;
                }
                switch (enumC2564l2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 2:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 3:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 4:
                        iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iLoadAd4 = 1;
                        return iLoadAd4 + iYandex2 + i;
                    case 8:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = AbstractC13388l.loadAd((String) obj2);
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 9:
                        iLoadAd4 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        return iLoadAd4 + iYandex2 + i;
                    case 10:
                        iLoadAd3 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 11:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = ((byte[]) obj2).length;
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 12:
                        iLoadAd4 = AbstractC10908l.yandex(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC6759l) {
                            iLoadAd4 = AbstractC10908l.loadAd(((InterfaceC6759l) obj2).zza());
                        } else {
                            iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        }
                        return iLoadAd4 + iYandex2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 16:
                        int iIntValue6 = ((Integer) obj2).intValue();
                        iLoadAd4 = AbstractC10908l.yandex((iIntValue6 >> 31) ^ (iIntValue6 + iIntValue6));
                        return iLoadAd4 + iYandex2 + i;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        long jLongValue6 = ((Long) obj2).longValue();
                        iLoadAd4 = AbstractC10908l.loadAd((jLongValue6 >> 63) ^ (jLongValue6 + jLongValue6));
                        return iLoadAd4 + iYandex2 + i;
                    default:
                        C18073l.license("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 6:
                ((Integer) obj).getClass();
                iLoadAd = 4;
                i = iLoadAd + iYandex4;
                iYandex2 = AbstractC10908l.yandex(16);
                if (enumC2564l2 == enumC2564l3) {
                    iYandex2 += iYandex2;
                }
                switch (enumC2564l2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 2:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 3:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 4:
                        iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iLoadAd4 = 1;
                        return iLoadAd4 + iYandex2 + i;
                    case 8:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = AbstractC13388l.loadAd((String) obj2);
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 9:
                        iLoadAd4 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        return iLoadAd4 + iYandex2 + i;
                    case 10:
                        iLoadAd3 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 11:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = ((byte[]) obj2).length;
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 12:
                        iLoadAd4 = AbstractC10908l.yandex(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC6759l) {
                            iLoadAd4 = AbstractC10908l.loadAd(((InterfaceC6759l) obj2).zza());
                        } else {
                            iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        }
                        return iLoadAd4 + iYandex2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 16:
                        int iIntValue7 = ((Integer) obj2).intValue();
                        iLoadAd4 = AbstractC10908l.yandex((iIntValue7 >> 31) ^ (iIntValue7 + iIntValue7));
                        return iLoadAd4 + iYandex2 + i;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        long jLongValue7 = ((Long) obj2).longValue();
                        iLoadAd4 = AbstractC10908l.loadAd((jLongValue7 >> 63) ^ (jLongValue7 + jLongValue7));
                        return iLoadAd4 + iYandex2 + i;
                    default:
                        C18073l.license("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 7:
                ((Boolean) obj).getClass();
                iLoadAd = 1;
                i = iLoadAd + iYandex4;
                iYandex2 = AbstractC10908l.yandex(16);
                if (enumC2564l2 == enumC2564l3) {
                    iYandex2 += iYandex2;
                }
                switch (enumC2564l2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 2:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 3:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 4:
                        iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iLoadAd4 = 1;
                        return iLoadAd4 + iYandex2 + i;
                    case 8:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = AbstractC13388l.loadAd((String) obj2);
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 9:
                        iLoadAd4 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        return iLoadAd4 + iYandex2 + i;
                    case 10:
                        iLoadAd3 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 11:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = ((byte[]) obj2).length;
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 12:
                        iLoadAd4 = AbstractC10908l.yandex(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC6759l) {
                            iLoadAd4 = AbstractC10908l.loadAd(((InterfaceC6759l) obj2).zza());
                        } else {
                            iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        }
                        return iLoadAd4 + iYandex2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 16:
                        int iIntValue8 = ((Integer) obj2).intValue();
                        iLoadAd4 = AbstractC10908l.yandex((iIntValue8 >> 31) ^ (iIntValue8 + iIntValue8));
                        return iLoadAd4 + iYandex2 + i;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        long jLongValue8 = ((Long) obj2).longValue();
                        iLoadAd4 = AbstractC10908l.loadAd((jLongValue8 >> 63) ^ (jLongValue8 + jLongValue8));
                        return iLoadAd4 + iYandex2 + i;
                    default:
                        C18073l.license("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 8:
                if (obj instanceof AbstractC15619l) {
                    iLoadAd2 = ((AbstractC15619l) obj).billing();
                    iYandex = AbstractC10908l.yandex(iLoadAd2);
                } else {
                    iLoadAd2 = AbstractC13388l.loadAd((String) obj);
                    iYandex = AbstractC10908l.yandex(iLoadAd2);
                }
                iLoadAd = iLoadAd2 + iYandex;
                i = iLoadAd + iYandex4;
                iYandex2 = AbstractC10908l.yandex(16);
                if (enumC2564l2 == enumC2564l3) {
                    iYandex2 += iYandex2;
                }
                switch (enumC2564l2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 2:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 3:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 4:
                        iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iLoadAd4 = 1;
                        return iLoadAd4 + iYandex2 + i;
                    case 8:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = AbstractC13388l.loadAd((String) obj2);
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 9:
                        iLoadAd4 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        return iLoadAd4 + iYandex2 + i;
                    case 10:
                        iLoadAd3 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 11:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = ((byte[]) obj2).length;
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 12:
                        iLoadAd4 = AbstractC10908l.yandex(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC6759l) {
                            iLoadAd4 = AbstractC10908l.loadAd(((InterfaceC6759l) obj2).zza());
                        } else {
                            iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        }
                        return iLoadAd4 + iYandex2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 16:
                        int iIntValue9 = ((Integer) obj2).intValue();
                        iLoadAd4 = AbstractC10908l.yandex((iIntValue9 >> 31) ^ (iIntValue9 + iIntValue9));
                        return iLoadAd4 + iYandex2 + i;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        long jLongValue9 = ((Long) obj2).longValue();
                        iLoadAd4 = AbstractC10908l.loadAd((jLongValue9 >> 63) ^ (jLongValue9 + jLongValue9));
                        return iLoadAd4 + iYandex2 + i;
                    default:
                        C18073l.license("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 9:
                iLoadAd = ((AbstractC0288l) ((AbstractC12570l) obj)).remoteconfig();
                i = iLoadAd + iYandex4;
                iYandex2 = AbstractC10908l.yandex(16);
                if (enumC2564l2 == enumC2564l3) {
                    iYandex2 += iYandex2;
                }
                switch (enumC2564l2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 2:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 3:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 4:
                        iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iLoadAd4 = 1;
                        return iLoadAd4 + iYandex2 + i;
                    case 8:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = AbstractC13388l.loadAd((String) obj2);
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 9:
                        iLoadAd4 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        return iLoadAd4 + iYandex2 + i;
                    case 10:
                        iLoadAd3 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 11:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = ((byte[]) obj2).length;
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 12:
                        iLoadAd4 = AbstractC10908l.yandex(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC6759l) {
                            iLoadAd4 = AbstractC10908l.loadAd(((InterfaceC6759l) obj2).zza());
                        } else {
                            iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        }
                        return iLoadAd4 + iYandex2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 16:
                        int iIntValue10 = ((Integer) obj2).intValue();
                        iLoadAd4 = AbstractC10908l.yandex((iIntValue10 >> 31) ^ (iIntValue10 + iIntValue10));
                        return iLoadAd4 + iYandex2 + i;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        long jLongValue10 = ((Long) obj2).longValue();
                        iLoadAd4 = AbstractC10908l.loadAd((jLongValue10 >> 63) ^ (jLongValue10 + jLongValue10));
                        return iLoadAd4 + iYandex2 + i;
                    default:
                        C18073l.license("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 10:
                iLoadAd2 = ((AbstractC0288l) ((AbstractC12570l) obj)).remoteconfig();
                iYandex = AbstractC10908l.yandex(iLoadAd2);
                iLoadAd = iLoadAd2 + iYandex;
                i = iLoadAd + iYandex4;
                iYandex2 = AbstractC10908l.yandex(16);
                if (enumC2564l2 == enumC2564l3) {
                    iYandex2 += iYandex2;
                }
                switch (enumC2564l2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 2:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 3:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 4:
                        iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iLoadAd4 = 1;
                        return iLoadAd4 + iYandex2 + i;
                    case 8:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = AbstractC13388l.loadAd((String) obj2);
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 9:
                        iLoadAd4 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        return iLoadAd4 + iYandex2 + i;
                    case 10:
                        iLoadAd3 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 11:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = ((byte[]) obj2).length;
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 12:
                        iLoadAd4 = AbstractC10908l.yandex(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC6759l) {
                            iLoadAd4 = AbstractC10908l.loadAd(((InterfaceC6759l) obj2).zza());
                        } else {
                            iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        }
                        return iLoadAd4 + iYandex2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 16:
                        int iIntValue11 = ((Integer) obj2).intValue();
                        iLoadAd4 = AbstractC10908l.yandex((iIntValue11 >> 31) ^ (iIntValue11 + iIntValue11));
                        return iLoadAd4 + iYandex2 + i;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        long jLongValue11 = ((Long) obj2).longValue();
                        iLoadAd4 = AbstractC10908l.loadAd((jLongValue11 >> 63) ^ (jLongValue11 + jLongValue11));
                        return iLoadAd4 + iYandex2 + i;
                    default:
                        C18073l.license("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 11:
                if (obj instanceof AbstractC15619l) {
                    iLoadAd2 = ((AbstractC15619l) obj).billing();
                    iYandex = AbstractC10908l.yandex(iLoadAd2);
                } else {
                    iLoadAd2 = ((byte[]) obj).length;
                    iYandex = AbstractC10908l.yandex(iLoadAd2);
                }
                iLoadAd = iLoadAd2 + iYandex;
                i = iLoadAd + iYandex4;
                iYandex2 = AbstractC10908l.yandex(16);
                if (enumC2564l2 == enumC2564l3) {
                    iYandex2 += iYandex2;
                }
                switch (enumC2564l2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 2:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 3:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 4:
                        iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iLoadAd4 = 1;
                        return iLoadAd4 + iYandex2 + i;
                    case 8:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = AbstractC13388l.loadAd((String) obj2);
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 9:
                        iLoadAd4 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        return iLoadAd4 + iYandex2 + i;
                    case 10:
                        iLoadAd3 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 11:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = ((byte[]) obj2).length;
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 12:
                        iLoadAd4 = AbstractC10908l.yandex(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC6759l) {
                            iLoadAd4 = AbstractC10908l.loadAd(((InterfaceC6759l) obj2).zza());
                        } else {
                            iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        }
                        return iLoadAd4 + iYandex2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 16:
                        int iIntValue12 = ((Integer) obj2).intValue();
                        iLoadAd4 = AbstractC10908l.yandex((iIntValue12 >> 31) ^ (iIntValue12 + iIntValue12));
                        return iLoadAd4 + iYandex2 + i;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        long jLongValue12 = ((Long) obj2).longValue();
                        iLoadAd4 = AbstractC10908l.loadAd((jLongValue12 >> 63) ^ (jLongValue12 + jLongValue12));
                        return iLoadAd4 + iYandex2 + i;
                    default:
                        C18073l.license("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 12:
                iLoadAd = AbstractC10908l.yandex(((Integer) obj).intValue());
                i = iLoadAd + iYandex4;
                iYandex2 = AbstractC10908l.yandex(16);
                if (enumC2564l2 == enumC2564l3) {
                    iYandex2 += iYandex2;
                }
                switch (enumC2564l2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 2:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 3:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 4:
                        iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iLoadAd4 = 1;
                        return iLoadAd4 + iYandex2 + i;
                    case 8:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = AbstractC13388l.loadAd((String) obj2);
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 9:
                        iLoadAd4 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        return iLoadAd4 + iYandex2 + i;
                    case 10:
                        iLoadAd3 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 11:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = ((byte[]) obj2).length;
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 12:
                        iLoadAd4 = AbstractC10908l.yandex(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC6759l) {
                            iLoadAd4 = AbstractC10908l.loadAd(((InterfaceC6759l) obj2).zza());
                        } else {
                            iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        }
                        return iLoadAd4 + iYandex2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 16:
                        int iIntValue13 = ((Integer) obj2).intValue();
                        iLoadAd4 = AbstractC10908l.yandex((iIntValue13 >> 31) ^ (iIntValue13 + iIntValue13));
                        return iLoadAd4 + iYandex2 + i;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        long jLongValue13 = ((Long) obj2).longValue();
                        iLoadAd4 = AbstractC10908l.loadAd((jLongValue13 >> 63) ^ (jLongValue13 + jLongValue13));
                        return iLoadAd4 + iYandex2 + i;
                    default:
                        C18073l.license("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 13:
                iLoadAd = obj instanceof InterfaceC6759l ? AbstractC10908l.loadAd(((InterfaceC6759l) obj).zza()) : AbstractC10908l.loadAd(((Integer) obj).intValue());
                i = iLoadAd + iYandex4;
                iYandex2 = AbstractC10908l.yandex(16);
                if (enumC2564l2 == enumC2564l3) {
                    iYandex2 += iYandex2;
                }
                switch (enumC2564l2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 2:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 3:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 4:
                        iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iLoadAd4 = 1;
                        return iLoadAd4 + iYandex2 + i;
                    case 8:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = AbstractC13388l.loadAd((String) obj2);
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 9:
                        iLoadAd4 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        return iLoadAd4 + iYandex2 + i;
                    case 10:
                        iLoadAd3 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 11:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = ((byte[]) obj2).length;
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 12:
                        iLoadAd4 = AbstractC10908l.yandex(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC6759l) {
                            iLoadAd4 = AbstractC10908l.loadAd(((InterfaceC6759l) obj2).zza());
                        } else {
                            iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        }
                        return iLoadAd4 + iYandex2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 16:
                        int iIntValue14 = ((Integer) obj2).intValue();
                        iLoadAd4 = AbstractC10908l.yandex((iIntValue14 >> 31) ^ (iIntValue14 + iIntValue14));
                        return iLoadAd4 + iYandex2 + i;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        long jLongValue14 = ((Long) obj2).longValue();
                        iLoadAd4 = AbstractC10908l.loadAd((jLongValue14 >> 63) ^ (jLongValue14 + jLongValue14));
                        return iLoadAd4 + iYandex2 + i;
                    default:
                        C18073l.license("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 14:
                ((Integer) obj).getClass();
                iLoadAd = 4;
                i = iLoadAd + iYandex4;
                iYandex2 = AbstractC10908l.yandex(16);
                if (enumC2564l2 == enumC2564l3) {
                    iYandex2 += iYandex2;
                }
                switch (enumC2564l2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 2:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 3:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 4:
                        iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iLoadAd4 = 1;
                        return iLoadAd4 + iYandex2 + i;
                    case 8:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = AbstractC13388l.loadAd((String) obj2);
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 9:
                        iLoadAd4 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        return iLoadAd4 + iYandex2 + i;
                    case 10:
                        iLoadAd3 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 11:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = ((byte[]) obj2).length;
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 12:
                        iLoadAd4 = AbstractC10908l.yandex(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC6759l) {
                            iLoadAd4 = AbstractC10908l.loadAd(((InterfaceC6759l) obj2).zza());
                        } else {
                            iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        }
                        return iLoadAd4 + iYandex2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 16:
                        int iIntValue15 = ((Integer) obj2).intValue();
                        iLoadAd4 = AbstractC10908l.yandex((iIntValue15 >> 31) ^ (iIntValue15 + iIntValue15));
                        return iLoadAd4 + iYandex2 + i;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        long jLongValue15 = ((Long) obj2).longValue();
                        iLoadAd4 = AbstractC10908l.loadAd((jLongValue15 >> 63) ^ (jLongValue15 + jLongValue15));
                        return iLoadAd4 + iYandex2 + i;
                    default:
                        C18073l.license("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 15:
                ((Long) obj).getClass();
                iLoadAd = 8;
                i = iLoadAd + iYandex4;
                iYandex2 = AbstractC10908l.yandex(16);
                if (enumC2564l2 == enumC2564l3) {
                    iYandex2 += iYandex2;
                }
                switch (enumC2564l2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 2:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 3:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 4:
                        iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iLoadAd4 = 1;
                        return iLoadAd4 + iYandex2 + i;
                    case 8:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = AbstractC13388l.loadAd((String) obj2);
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 9:
                        iLoadAd4 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        return iLoadAd4 + iYandex2 + i;
                    case 10:
                        iLoadAd3 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 11:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = ((byte[]) obj2).length;
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 12:
                        iLoadAd4 = AbstractC10908l.yandex(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC6759l) {
                            iLoadAd4 = AbstractC10908l.loadAd(((InterfaceC6759l) obj2).zza());
                        } else {
                            iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        }
                        return iLoadAd4 + iYandex2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 16:
                        int iIntValue16 = ((Integer) obj2).intValue();
                        iLoadAd4 = AbstractC10908l.yandex((iIntValue16 >> 31) ^ (iIntValue16 + iIntValue16));
                        return iLoadAd4 + iYandex2 + i;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        long jLongValue16 = ((Long) obj2).longValue();
                        iLoadAd4 = AbstractC10908l.loadAd((jLongValue16 >> 63) ^ (jLongValue16 + jLongValue16));
                        return iLoadAd4 + iYandex2 + i;
                    default:
                        C18073l.license("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 16:
                int iIntValue17 = ((Integer) obj).intValue();
                iLoadAd = AbstractC10908l.yandex((iIntValue17 >> 31) ^ (iIntValue17 + iIntValue17));
                i = iLoadAd + iYandex4;
                iYandex2 = AbstractC10908l.yandex(16);
                if (enumC2564l2 == enumC2564l3) {
                    iYandex2 += iYandex2;
                }
                switch (enumC2564l2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 2:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 3:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 4:
                        iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iLoadAd4 = 1;
                        return iLoadAd4 + iYandex2 + i;
                    case 8:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = AbstractC13388l.loadAd((String) obj2);
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 9:
                        iLoadAd4 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        return iLoadAd4 + iYandex2 + i;
                    case 10:
                        iLoadAd3 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 11:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = ((byte[]) obj2).length;
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 12:
                        iLoadAd4 = AbstractC10908l.yandex(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC6759l) {
                            iLoadAd4 = AbstractC10908l.loadAd(((InterfaceC6759l) obj2).zza());
                        } else {
                            iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        }
                        return iLoadAd4 + iYandex2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 16:
                        int iIntValue18 = ((Integer) obj2).intValue();
                        iLoadAd4 = AbstractC10908l.yandex((iIntValue18 >> 31) ^ (iIntValue18 + iIntValue18));
                        return iLoadAd4 + iYandex2 + i;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        long jLongValue17 = ((Long) obj2).longValue();
                        iLoadAd4 = AbstractC10908l.loadAd((jLongValue17 >> 63) ^ (jLongValue17 + jLongValue17));
                        return iLoadAd4 + iYandex2 + i;
                    default:
                        C18073l.license("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                long jLongValue18 = ((Long) obj).longValue();
                iLoadAd = AbstractC10908l.loadAd((jLongValue18 >> 63) ^ (jLongValue18 + jLongValue18));
                i = iLoadAd + iYandex4;
                iYandex2 = AbstractC10908l.yandex(16);
                if (enumC2564l2 == enumC2564l3) {
                    iYandex2 += iYandex2;
                }
                switch (enumC2564l2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 2:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 3:
                        iLoadAd4 = AbstractC10908l.loadAd(((Long) obj2).longValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 4:
                        iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iLoadAd4 = 1;
                        return iLoadAd4 + iYandex2 + i;
                    case 8:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = AbstractC13388l.loadAd((String) obj2);
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 9:
                        iLoadAd4 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        return iLoadAd4 + iYandex2 + i;
                    case 10:
                        iLoadAd3 = ((AbstractC0288l) ((AbstractC12570l) obj2)).remoteconfig();
                        iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 11:
                        if (obj2 instanceof AbstractC15619l) {
                            iLoadAd3 = ((AbstractC15619l) obj2).billing();
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        } else {
                            iLoadAd3 = ((byte[]) obj2).length;
                            iYandex3 = AbstractC10908l.yandex(iLoadAd3);
                        }
                        iLoadAd4 = iYandex3 + iLoadAd3;
                        return iLoadAd4 + iYandex2 + i;
                    case 12:
                        iLoadAd4 = AbstractC10908l.yandex(((Integer) obj2).intValue());
                        return iLoadAd4 + iYandex2 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC6759l) {
                            iLoadAd4 = AbstractC10908l.loadAd(((InterfaceC6759l) obj2).zza());
                        } else {
                            iLoadAd4 = AbstractC10908l.loadAd(((Integer) obj2).intValue());
                        }
                        return iLoadAd4 + iYandex2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iLoadAd4 = 4;
                        return iLoadAd4 + iYandex2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iLoadAd4 + iYandex2 + i;
                    case 16:
                        int iIntValue19 = ((Integer) obj2).intValue();
                        iLoadAd4 = AbstractC10908l.yandex((iIntValue19 >> 31) ^ (iIntValue19 + iIntValue19));
                        return iLoadAd4 + iYandex2 + i;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        long jLongValue19 = ((Long) obj2).longValue();
                        iLoadAd4 = AbstractC10908l.loadAd((jLongValue19 >> 63) ^ (jLongValue19 + jLongValue19));
                        return iLoadAd4 + iYandex2 + i;
                    default:
                        C18073l.license("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            default:
                C18073l.license("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    public static void yandex(AbstractC10908l abstractC10908l, C5991l c5991l, Object obj, Object obj2) {
        C1111l.loadAd(abstractC10908l, (EnumC2564l) c5991l.f12716l, 1, obj);
        C1111l.loadAd(abstractC10908l, (EnumC2564l) c5991l.f12715l, 2, obj2);
    }

    public final C5991l crashlytics() {
        return this.yandex;
    }
}
