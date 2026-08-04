package defpackage;

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٍۜٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9831l {
    public static final int[] yandex = {-6803, -2, -1, -1, -1, -1, -1};
    public static final int[] loadAd = {46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};
    public static final int[] crashlytics = {-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};

    /* JADX WARN: Code duplicated, block: B:9:0x003c  */
    public static void admob(int[] iArr, int i) {
        if (i == 0) {
            if (iArr[6] == -1) {
                return;
            } else {
                return;
            }
        }
        long j = ((long) i) & 4294967295L;
        long j2 = (6803 * j) + (((long) iArr[0]) & 4294967295L);
        iArr[0] = (int) j2;
        long j3 = j + (((long) iArr[1]) & 4294967295L) + (j2 >>> 32);
        iArr[1] = (int) j3;
        long j4 = (j3 >>> 32) + (4294967295L & ((long) iArr[2]));
        iArr[2] = (int) j4;
        if (((j4 >>> 32) != 0 ? AbstractC4952l.Signature(7, 3, iArr) : 0) == 0) {
            if (iArr[6] == -1 || !AbstractC3292l.adcel(iArr, yandex)) {
                return;
            }
        }
        AbstractC4952l.amazon(7, 6803, iArr);
    }

    public static C13660l amazon() {
        long[] jArr = AbstractC12154l.yandex;
        return new C13660l();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x016e A[EDGE_INSN: B:106:0x016e->B:63:0x016e BREAK  A[LOOP:2: B:46:0x0108->B:51:0x0114], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0100  */
    /* JADX WARN: Code duplicated, block: B:48:0x010b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0114 A[LOOP:2: B:46:0x0108->B:51:0x0114, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x011a A[LOOP:3: B:53:0x0118->B:54:0x011a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0136  */
    public static C8485l billing(String str) {
        C3185l c3185l;
        int i;
        int i2;
        int i3;
        C3185l c3185l2;
        int i4;
        C3185l c3185l3 = new C3185l(str, 4, (char) 0);
        c3185l3.loadAd(new C4100l(27));
        Integer num = null;
        Integer num2 = null;
        Integer numValueOf = null;
        Integer numValueOf2 = null;
        Integer numValueOf3 = null;
        EnumC7557l enumC7557l = null;
        while (c3185l3.crashlytics < str.length()) {
            if (c3185l3.crashlytics < str.length() && AbstractC4654l.mopub(str.charAt(c3185l3.crashlytics))) {
                int i5 = c3185l3.crashlytics;
                c3185l3.loadAd(new C4100l(28));
                String strSubstring = str.substring(i5, c3185l3.crashlytics);
                if (num == null || num2 == null || numValueOf == null) {
                    C3185l c3185l4 = new C3185l(strSubstring, 4, (char) 0);
                    int i6 = c3185l4.crashlytics;
                    if (c3185l4.yandex(C2100l.f4715l)) {
                        c3185l4.yandex(C2100l.f4721l);
                        int i7 = Integer.parseInt(strSubstring.substring(i6, c3185l4.crashlytics));
                        if (c3185l4.yandex(C5818l.f12243l)) {
                            int i8 = c3185l4.crashlytics;
                            if (c3185l4.yandex(C2100l.f4701l)) {
                                c3185l4.yandex(C2100l.f4704l);
                                int i9 = Integer.parseInt(strSubstring.substring(i8, c3185l4.crashlytics));
                                if (c3185l4.yandex(C2100l.f4707l)) {
                                    int i10 = c3185l4.crashlytics;
                                    if (c3185l4.yandex(C2100l.f4720l)) {
                                        c3185l4.yandex(C2100l.f4713l);
                                        int i11 = Integer.parseInt(strSubstring.substring(i10, c3185l4.crashlytics));
                                        if (c3185l4.yandex(C2100l.f4700l)) {
                                            c3185l4.loadAd(C2100l.f4716l);
                                        }
                                        Integer numValueOf4 = Integer.valueOf(i7);
                                        Integer numValueOf5 = Integer.valueOf(i9);
                                        numValueOf = Integer.valueOf(i11);
                                        num = numValueOf4;
                                        num2 = numValueOf5;
                                    } else if (numValueOf2 == null) {
                                        c3185l2 = new C3185l(strSubstring, 4, (char) 0);
                                        i4 = c3185l2.crashlytics;
                                        if (!c3185l2.yandex(C5818l.f12250l)) {
                                            c3185l2.yandex(C5818l.f12257l);
                                            int i12 = Integer.parseInt(strSubstring.substring(i4, c3185l2.crashlytics));
                                            if (c3185l2.yandex(C5818l.f12230l)) {
                                                c3185l2.loadAd(C5818l.f12244l);
                                            }
                                            numValueOf2 = Integer.valueOf(i12);
                                        } else if (enumC7557l == null) {
                                            if (numValueOf3 == null) {
                                                c3185l = new C3185l(strSubstring, 4, (char) 0);
                                                i = c3185l.crashlytics;
                                                i2 = 0;
                                                while (true) {
                                                    if (i2 < 2) {
                                                        while (i3 < 2) {
                                                            c3185l.yandex(C2100l.f4723l);
                                                        }
                                                        int i13 = Integer.parseInt(c3185l.loadAd.substring(i, c3185l.crashlytics));
                                                        if (c3185l.yandex(C2100l.f4722l)) {
                                                            c3185l.loadAd(C2100l.f4719l);
                                                        }
                                                        numValueOf3 = Integer.valueOf(i13);
                                                        break;
                                                    }
                                                    if (!c3185l.yandex(C2100l.f4699l)) {
                                                        break;
                                                        break;
                                                    }
                                                    i2++;
                                                }
                                            }
                                        } else if (numValueOf3 == null) {
                                            c3185l = new C3185l(strSubstring, 4, (char) 0);
                                            i = c3185l.crashlytics;
                                            i2 = 0;
                                            while (true) {
                                                if (i2 < 2) {
                                                    while (i3 < 2) {
                                                        c3185l.yandex(C2100l.f4723l);
                                                    }
                                                    int i14 = Integer.parseInt(c3185l.loadAd.substring(i, c3185l.crashlytics));
                                                    if (c3185l.yandex(C2100l.f4722l)) {
                                                        c3185l.loadAd(C2100l.f4719l);
                                                    }
                                                    numValueOf3 = Integer.valueOf(i14);
                                                    break;
                                                }
                                                if (!c3185l.yandex(C2100l.f4699l)) {
                                                    break;
                                                    break;
                                                }
                                                i2++;
                                            }
                                        }
                                    } else if (enumC7557l == null) {
                                        if (numValueOf3 == null) {
                                            c3185l = new C3185l(strSubstring, 4, (char) 0);
                                            i = c3185l.crashlytics;
                                            i2 = 0;
                                            while (true) {
                                                if (i2 < 2) {
                                                    while (i3 < 2) {
                                                        c3185l.yandex(C2100l.f4723l);
                                                    }
                                                    int i15 = Integer.parseInt(c3185l.loadAd.substring(i, c3185l.crashlytics));
                                                    if (c3185l.yandex(C2100l.f4722l)) {
                                                        c3185l.loadAd(C2100l.f4719l);
                                                    }
                                                    numValueOf3 = Integer.valueOf(i15);
                                                    break;
                                                }
                                                if (!c3185l.yandex(C2100l.f4699l)) {
                                                    break;
                                                    break;
                                                }
                                                i2++;
                                            }
                                        }
                                    } else if (numValueOf3 == null) {
                                        c3185l = new C3185l(strSubstring, 4, (char) 0);
                                        i = c3185l.crashlytics;
                                        i2 = 0;
                                        while (true) {
                                            if (i2 < 2) {
                                                while (i3 < 2) {
                                                    c3185l.yandex(C2100l.f4723l);
                                                }
                                                int i16 = Integer.parseInt(c3185l.loadAd.substring(i, c3185l.crashlytics));
                                                if (c3185l.yandex(C2100l.f4722l)) {
                                                    c3185l.loadAd(C2100l.f4719l);
                                                }
                                                numValueOf3 = Integer.valueOf(i16);
                                                break;
                                            }
                                            if (!c3185l.yandex(C2100l.f4699l)) {
                                                break;
                                                break;
                                            }
                                            i2++;
                                        }
                                    }
                                } else if (numValueOf2 == null) {
                                    c3185l2 = new C3185l(strSubstring, 4, (char) 0);
                                    i4 = c3185l2.crashlytics;
                                    if (!c3185l2.yandex(C5818l.f12250l)) {
                                        c3185l2.yandex(C5818l.f12257l);
                                        int i17 = Integer.parseInt(strSubstring.substring(i4, c3185l2.crashlytics));
                                        if (c3185l2.yandex(C5818l.f12230l)) {
                                            c3185l2.loadAd(C5818l.f12244l);
                                        }
                                        numValueOf2 = Integer.valueOf(i17);
                                    } else if (enumC7557l == null) {
                                        if (numValueOf3 == null) {
                                            c3185l = new C3185l(strSubstring, 4, (char) 0);
                                            i = c3185l.crashlytics;
                                            i2 = 0;
                                            while (true) {
                                                if (i2 < 2) {
                                                    while (i3 < 2) {
                                                        c3185l.yandex(C2100l.f4723l);
                                                    }
                                                    int i18 = Integer.parseInt(c3185l.loadAd.substring(i, c3185l.crashlytics));
                                                    if (c3185l.yandex(C2100l.f4722l)) {
                                                        c3185l.loadAd(C2100l.f4719l);
                                                    }
                                                    numValueOf3 = Integer.valueOf(i18);
                                                    break;
                                                }
                                                if (!c3185l.yandex(C2100l.f4699l)) {
                                                    break;
                                                    break;
                                                }
                                                i2++;
                                            }
                                        }
                                    } else if (numValueOf3 == null) {
                                        c3185l = new C3185l(strSubstring, 4, (char) 0);
                                        i = c3185l.crashlytics;
                                        i2 = 0;
                                        while (true) {
                                            if (i2 < 2) {
                                                while (i3 < 2) {
                                                    c3185l.yandex(C2100l.f4723l);
                                                }
                                                int i19 = Integer.parseInt(c3185l.loadAd.substring(i, c3185l.crashlytics));
                                                if (c3185l.yandex(C2100l.f4722l)) {
                                                    c3185l.loadAd(C2100l.f4719l);
                                                }
                                                numValueOf3 = Integer.valueOf(i19);
                                                break;
                                            }
                                            if (!c3185l.yandex(C2100l.f4699l)) {
                                                break;
                                                break;
                                            }
                                            i2++;
                                        }
                                    }
                                } else if (enumC7557l == null) {
                                    if (numValueOf3 == null) {
                                        c3185l = new C3185l(strSubstring, 4, (char) 0);
                                        i = c3185l.crashlytics;
                                        i2 = 0;
                                        while (true) {
                                            if (i2 < 2) {
                                                while (i3 < 2) {
                                                    c3185l.yandex(C2100l.f4723l);
                                                }
                                                int i110 = Integer.parseInt(c3185l.loadAd.substring(i, c3185l.crashlytics));
                                                if (c3185l.yandex(C2100l.f4722l)) {
                                                    c3185l.loadAd(C2100l.f4719l);
                                                }
                                                numValueOf3 = Integer.valueOf(i110);
                                                break;
                                            }
                                            if (!c3185l.yandex(C2100l.f4699l)) {
                                                break;
                                                break;
                                            }
                                            i2++;
                                        }
                                    }
                                } else if (numValueOf3 == null) {
                                    c3185l = new C3185l(strSubstring, 4, (char) 0);
                                    i = c3185l.crashlytics;
                                    i2 = 0;
                                    while (true) {
                                        if (i2 < 2) {
                                            while (i3 < 2) {
                                                c3185l.yandex(C2100l.f4723l);
                                            }
                                            int i111 = Integer.parseInt(c3185l.loadAd.substring(i, c3185l.crashlytics));
                                            if (c3185l.yandex(C2100l.f4722l)) {
                                                c3185l.loadAd(C2100l.f4719l);
                                            }
                                            numValueOf3 = Integer.valueOf(i111);
                                            break;
                                        }
                                        if (!c3185l.yandex(C2100l.f4699l)) {
                                            break;
                                            break;
                                        }
                                        i2++;
                                    }
                                }
                            } else if (numValueOf2 == null) {
                                c3185l2 = new C3185l(strSubstring, 4, (char) 0);
                                i4 = c3185l2.crashlytics;
                                if (!c3185l2.yandex(C5818l.f12250l)) {
                                    c3185l2.yandex(C5818l.f12257l);
                                    int i112 = Integer.parseInt(strSubstring.substring(i4, c3185l2.crashlytics));
                                    if (c3185l2.yandex(C5818l.f12230l)) {
                                        c3185l2.loadAd(C5818l.f12244l);
                                    }
                                    numValueOf2 = Integer.valueOf(i112);
                                } else if (enumC7557l == null) {
                                    if (numValueOf3 == null) {
                                        c3185l = new C3185l(strSubstring, 4, (char) 0);
                                        i = c3185l.crashlytics;
                                        i2 = 0;
                                        while (true) {
                                            if (i2 < 2) {
                                                while (i3 < 2) {
                                                    c3185l.yandex(C2100l.f4723l);
                                                }
                                                int i113 = Integer.parseInt(c3185l.loadAd.substring(i, c3185l.crashlytics));
                                                if (c3185l.yandex(C2100l.f4722l)) {
                                                    c3185l.loadAd(C2100l.f4719l);
                                                }
                                                numValueOf3 = Integer.valueOf(i113);
                                                break;
                                            }
                                            if (!c3185l.yandex(C2100l.f4699l)) {
                                                break;
                                                break;
                                            }
                                            i2++;
                                        }
                                    }
                                } else if (numValueOf3 == null) {
                                    c3185l = new C3185l(strSubstring, 4, (char) 0);
                                    i = c3185l.crashlytics;
                                    i2 = 0;
                                    while (true) {
                                        if (i2 < 2) {
                                            while (i3 < 2) {
                                                c3185l.yandex(C2100l.f4723l);
                                            }
                                            int i114 = Integer.parseInt(c3185l.loadAd.substring(i, c3185l.crashlytics));
                                            if (c3185l.yandex(C2100l.f4722l)) {
                                                c3185l.loadAd(C2100l.f4719l);
                                            }
                                            numValueOf3 = Integer.valueOf(i114);
                                            break;
                                        }
                                        if (!c3185l.yandex(C2100l.f4699l)) {
                                            break;
                                            break;
                                        }
                                        i2++;
                                    }
                                }
                            } else if (enumC7557l == null) {
                                if (numValueOf3 == null) {
                                    c3185l = new C3185l(strSubstring, 4, (char) 0);
                                    i = c3185l.crashlytics;
                                    i2 = 0;
                                    while (true) {
                                        if (i2 < 2) {
                                            while (i3 < 2) {
                                                c3185l.yandex(C2100l.f4723l);
                                            }
                                            int i115 = Integer.parseInt(c3185l.loadAd.substring(i, c3185l.crashlytics));
                                            if (c3185l.yandex(C2100l.f4722l)) {
                                                c3185l.loadAd(C2100l.f4719l);
                                            }
                                            numValueOf3 = Integer.valueOf(i115);
                                            break;
                                        }
                                        if (!c3185l.yandex(C2100l.f4699l)) {
                                            break;
                                            break;
                                        }
                                        i2++;
                                    }
                                }
                            } else if (numValueOf3 == null) {
                                c3185l = new C3185l(strSubstring, 4, (char) 0);
                                i = c3185l.crashlytics;
                                i2 = 0;
                                while (true) {
                                    if (i2 < 2) {
                                        while (i3 < 2) {
                                            c3185l.yandex(C2100l.f4723l);
                                        }
                                        int i116 = Integer.parseInt(c3185l.loadAd.substring(i, c3185l.crashlytics));
                                        if (c3185l.yandex(C2100l.f4722l)) {
                                            c3185l.loadAd(C2100l.f4719l);
                                        }
                                        numValueOf3 = Integer.valueOf(i116);
                                        break;
                                    }
                                    if (!c3185l.yandex(C2100l.f4699l)) {
                                        break;
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        } else if (numValueOf2 == null) {
                            c3185l2 = new C3185l(strSubstring, 4, (char) 0);
                            i4 = c3185l2.crashlytics;
                            if (!c3185l2.yandex(C5818l.f12250l)) {
                                c3185l2.yandex(C5818l.f12257l);
                                int i117 = Integer.parseInt(strSubstring.substring(i4, c3185l2.crashlytics));
                                if (c3185l2.yandex(C5818l.f12230l)) {
                                    c3185l2.loadAd(C5818l.f12244l);
                                }
                                numValueOf2 = Integer.valueOf(i117);
                            } else if (enumC7557l == null) {
                                if (numValueOf3 == null) {
                                    c3185l = new C3185l(strSubstring, 4, (char) 0);
                                    i = c3185l.crashlytics;
                                    i2 = 0;
                                    while (true) {
                                        if (i2 < 2) {
                                            while (i3 < 2) {
                                                c3185l.yandex(C2100l.f4723l);
                                            }
                                            int i118 = Integer.parseInt(c3185l.loadAd.substring(i, c3185l.crashlytics));
                                            if (c3185l.yandex(C2100l.f4722l)) {
                                                c3185l.loadAd(C2100l.f4719l);
                                            }
                                            numValueOf3 = Integer.valueOf(i118);
                                            break;
                                        }
                                        if (!c3185l.yandex(C2100l.f4699l)) {
                                            break;
                                            break;
                                        }
                                        i2++;
                                    }
                                }
                            } else if (numValueOf3 == null) {
                                c3185l = new C3185l(strSubstring, 4, (char) 0);
                                i = c3185l.crashlytics;
                                i2 = 0;
                                while (true) {
                                    if (i2 < 2) {
                                        while (i3 < 2) {
                                            c3185l.yandex(C2100l.f4723l);
                                        }
                                        int i119 = Integer.parseInt(c3185l.loadAd.substring(i, c3185l.crashlytics));
                                        if (c3185l.yandex(C2100l.f4722l)) {
                                            c3185l.loadAd(C2100l.f4719l);
                                        }
                                        numValueOf3 = Integer.valueOf(i119);
                                        break;
                                    }
                                    if (!c3185l.yandex(C2100l.f4699l)) {
                                        break;
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        } else if (enumC7557l == null) {
                            if (numValueOf3 == null) {
                                c3185l = new C3185l(strSubstring, 4, (char) 0);
                                i = c3185l.crashlytics;
                                i2 = 0;
                                while (true) {
                                    if (i2 < 2) {
                                        while (i3 < 2) {
                                            c3185l.yandex(C2100l.f4723l);
                                        }
                                        int i1110 = Integer.parseInt(c3185l.loadAd.substring(i, c3185l.crashlytics));
                                        if (c3185l.yandex(C2100l.f4722l)) {
                                            c3185l.loadAd(C2100l.f4719l);
                                        }
                                        numValueOf3 = Integer.valueOf(i1110);
                                        break;
                                    }
                                    if (!c3185l.yandex(C2100l.f4699l)) {
                                        break;
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        } else if (numValueOf3 == null) {
                            c3185l = new C3185l(strSubstring, 4, (char) 0);
                            i = c3185l.crashlytics;
                            i2 = 0;
                            while (true) {
                                if (i2 < 2) {
                                    while (i3 < 2) {
                                        c3185l.yandex(C2100l.f4723l);
                                    }
                                    int i1111 = Integer.parseInt(c3185l.loadAd.substring(i, c3185l.crashlytics));
                                    if (c3185l.yandex(C2100l.f4722l)) {
                                        c3185l.loadAd(C2100l.f4719l);
                                    }
                                    numValueOf3 = Integer.valueOf(i1111);
                                    break;
                                }
                                if (!c3185l.yandex(C2100l.f4699l)) {
                                    break;
                                    break;
                                }
                                i2++;
                            }
                        }
                    } else if (numValueOf2 == null) {
                        c3185l2 = new C3185l(strSubstring, 4, (char) 0);
                        i4 = c3185l2.crashlytics;
                        if (!c3185l2.yandex(C5818l.f12250l)) {
                            c3185l2.yandex(C5818l.f12257l);
                            int i1112 = Integer.parseInt(strSubstring.substring(i4, c3185l2.crashlytics));
                            if (c3185l2.yandex(C5818l.f12230l)) {
                                c3185l2.loadAd(C5818l.f12244l);
                            }
                            numValueOf2 = Integer.valueOf(i1112);
                        } else if (enumC7557l == null && strSubstring.length() >= 3) {
                            C11521l c11521l = new C11521l(0, EnumC7557l.f15554l);
                            while (true) {
                                if (c11521l.hasNext()) {
                                    EnumC7557l enumC7557l2 = (EnumC7557l) c11521l.next();
                                    if (AbstractC16648l.isVip(strSubstring, enumC7557l2.f15556l, true)) {
                                        enumC7557l = enumC7557l2;
                                    }
                                } else if (numValueOf3 == null) {
                                    c3185l = new C3185l(strSubstring, 4, (char) 0);
                                    i = c3185l.crashlytics;
                                    i2 = 0;
                                    while (true) {
                                        if (i2 < 2) {
                                            while (i3 < 2) {
                                                c3185l.yandex(C2100l.f4723l);
                                            }
                                            int i1113 = Integer.parseInt(c3185l.loadAd.substring(i, c3185l.crashlytics));
                                            if (c3185l.yandex(C2100l.f4722l)) {
                                                c3185l.loadAd(C2100l.f4719l);
                                            }
                                            numValueOf3 = Integer.valueOf(i1113);
                                            break;
                                        }
                                        if (!c3185l.yandex(C2100l.f4699l)) {
                                            break;
                                            break;
                                        }
                                        i2++;
                                    }
                                }
                            }
                        } else if (numValueOf3 == null) {
                            c3185l = new C3185l(strSubstring, 4, (char) 0);
                            i = c3185l.crashlytics;
                            i2 = 0;
                            while (true) {
                                if (i2 < 2) {
                                    while (i3 < 2) {
                                        c3185l.yandex(C2100l.f4723l);
                                    }
                                    int i1114 = Integer.parseInt(c3185l.loadAd.substring(i, c3185l.crashlytics));
                                    if (c3185l.yandex(C2100l.f4722l)) {
                                        c3185l.loadAd(C2100l.f4719l);
                                    }
                                    numValueOf3 = Integer.valueOf(i1114);
                                    break;
                                }
                                if (!c3185l.yandex(C2100l.f4699l)) {
                                    break;
                                }
                                i2++;
                            }
                        }
                    } else if (enumC7557l == null) {
                        if (numValueOf3 == null) {
                            c3185l = new C3185l(strSubstring, 4, (char) 0);
                            i = c3185l.crashlytics;
                            i2 = 0;
                            while (true) {
                                if (i2 < 2) {
                                    while (i3 < 2) {
                                        c3185l.yandex(C2100l.f4723l);
                                    }
                                    int i1115 = Integer.parseInt(c3185l.loadAd.substring(i, c3185l.crashlytics));
                                    if (c3185l.yandex(C2100l.f4722l)) {
                                        c3185l.loadAd(C2100l.f4719l);
                                    }
                                    numValueOf3 = Integer.valueOf(i1115);
                                    break;
                                }
                                if (!c3185l.yandex(C2100l.f4699l)) {
                                    break;
                                    break;
                                }
                                i2++;
                            }
                        }
                    } else if (numValueOf3 == null) {
                        c3185l = new C3185l(strSubstring, 4, (char) 0);
                        i = c3185l.crashlytics;
                        i2 = 0;
                        while (true) {
                            if (i2 < 2) {
                                while (i3 < 2) {
                                    c3185l.yandex(C2100l.f4723l);
                                }
                                int i1116 = Integer.parseInt(c3185l.loadAd.substring(i, c3185l.crashlytics));
                                if (c3185l.yandex(C2100l.f4722l)) {
                                    c3185l.loadAd(C2100l.f4719l);
                                }
                                numValueOf3 = Integer.valueOf(i1116);
                                break;
                            }
                            if (!c3185l.yandex(C2100l.f4699l)) {
                                break;
                                break;
                            }
                            i2++;
                        }
                    }
                } else if (numValueOf2 == null) {
                    c3185l2 = new C3185l(strSubstring, 4, (char) 0);
                    i4 = c3185l2.crashlytics;
                    if (!c3185l2.yandex(C5818l.f12250l)) {
                        c3185l2.yandex(C5818l.f12257l);
                        int i1117 = Integer.parseInt(strSubstring.substring(i4, c3185l2.crashlytics));
                        if (c3185l2.yandex(C5818l.f12230l)) {
                            c3185l2.loadAd(C5818l.f12244l);
                        }
                        numValueOf2 = Integer.valueOf(i1117);
                    } else if (enumC7557l == null) {
                        if (numValueOf3 == null) {
                            c3185l = new C3185l(strSubstring, 4, (char) 0);
                            i = c3185l.crashlytics;
                            i2 = 0;
                            while (true) {
                                if (i2 < 2) {
                                    while (i3 < 2) {
                                        c3185l.yandex(C2100l.f4723l);
                                    }
                                    int i1118 = Integer.parseInt(c3185l.loadAd.substring(i, c3185l.crashlytics));
                                    if (c3185l.yandex(C2100l.f4722l)) {
                                        c3185l.loadAd(C2100l.f4719l);
                                    }
                                    numValueOf3 = Integer.valueOf(i1118);
                                    break;
                                }
                                if (!c3185l.yandex(C2100l.f4699l)) {
                                    break;
                                    break;
                                }
                                i2++;
                            }
                        }
                    } else if (numValueOf3 == null) {
                        c3185l = new C3185l(strSubstring, 4, (char) 0);
                        i = c3185l.crashlytics;
                        i2 = 0;
                        while (true) {
                            if (i2 < 2) {
                                while (i3 < 2) {
                                    c3185l.yandex(C2100l.f4723l);
                                }
                                int i1119 = Integer.parseInt(c3185l.loadAd.substring(i, c3185l.crashlytics));
                                if (c3185l.yandex(C2100l.f4722l)) {
                                    c3185l.loadAd(C2100l.f4719l);
                                }
                                numValueOf3 = Integer.valueOf(i1119);
                                break;
                            }
                            if (!c3185l.yandex(C2100l.f4699l)) {
                                break;
                                break;
                            }
                            i2++;
                        }
                    }
                } else if (enumC7557l == null) {
                    if (numValueOf3 == null) {
                        c3185l = new C3185l(strSubstring, 4, (char) 0);
                        i = c3185l.crashlytics;
                        i2 = 0;
                        while (true) {
                            if (i2 < 2) {
                                for (i3 = 0; i3 < 2; i3++) {
                                    c3185l.yandex(C2100l.f4723l);
                                }
                                int i11110 = Integer.parseInt(c3185l.loadAd.substring(i, c3185l.crashlytics));
                                if (c3185l.yandex(C2100l.f4722l)) {
                                    c3185l.loadAd(C2100l.f4719l);
                                }
                                numValueOf3 = Integer.valueOf(i11110);
                                break;
                            }
                            if (!c3185l.yandex(C2100l.f4699l)) {
                                break;
                                break;
                            }
                            i2++;
                        }
                    }
                } else if (numValueOf3 == null) {
                    c3185l = new C3185l(strSubstring, 4, (char) 0);
                    i = c3185l.crashlytics;
                    i2 = 0;
                    while (true) {
                        if (i2 < 2) {
                            while (i3 < 2) {
                                c3185l.yandex(C2100l.f4723l);
                            }
                            int i11111 = Integer.parseInt(c3185l.loadAd.substring(i, c3185l.crashlytics));
                            if (c3185l.yandex(C2100l.f4722l)) {
                                c3185l.loadAd(C2100l.f4719l);
                            }
                            numValueOf3 = Integer.valueOf(i11111);
                            break;
                        }
                        if (!c3185l.yandex(C2100l.f4699l)) {
                            break;
                            break;
                        }
                        i2++;
                    }
                }
                c3185l3.loadAd(new C4100l(29));
            }
        }
        C8934l c8934l = new C8934l(70, 99, 1);
        if (numValueOf3 == null || !c8934l.amazon(numValueOf3.intValue())) {
            C8934l c8934l2 = new C8934l(0, 69, 1);
            if (numValueOf3 != null && c8934l2.amazon(numValueOf3.intValue())) {
                numValueOf3 = Integer.valueOf(numValueOf3.intValue() + 2000);
            }
        } else {
            numValueOf3 = Integer.valueOf(numValueOf3.intValue() + 1900);
        }
        crashlytics(str, "day-of-month", numValueOf2);
        crashlytics(str, "month", enumC7557l);
        crashlytics(str, "year", numValueOf3);
        crashlytics(str, "time", num);
        crashlytics(str, "time", num2);
        crashlytics(str, "time", numValueOf);
        if (!new C8934l(1, 31, 1).amazon(numValueOf2.intValue())) {
            throw new C7998l(str, "day-of-month not in [1,31]");
        }
        if (numValueOf3.intValue() < 1601) {
            throw new C7998l(str, "year >= 1601");
        }
        if (num.intValue() > 23) {
            throw new C7998l(str, "hours > 23");
        }
        if (num2.intValue() > 59) {
            throw new C7998l(str, "minutes > 59");
        }
        if (numValueOf.intValue() <= 59) {
            return AbstractC7973l.yandex(numValueOf.intValue(), num2.intValue(), num.intValue(), numValueOf2.intValue(), enumC7557l, numValueOf3.intValue());
        }
        throw new C7998l(str, "seconds > 59");
    }

    public static void crashlytics(String str, String str2, Object obj) {
        if (obj == null) {
            throw new C7998l(str, "Could not find ".concat(str2));
        }
    }

    public static void firebase(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        AbstractC3292l.license(iArr, iArr3);
        mopub(iArr3, iArr2);
    }

    public static final void isPro(C13660l c13660l, Object obj) {
        boolean zAdmob;
        long[] jArr = c13660l.yandex;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = c13660l.loadAd[i4];
                        Object obj3 = c13660l.crashlytics[i4];
                        if (obj3 instanceof C6295l) {
                            C6295l c6295l = (C6295l) obj3;
                            c6295l.remoteconfig(obj);
                            zAdmob = c6295l.admob();
                        } else {
                            zAdmob = obj3 == obj;
                        }
                        if (zAdmob) {
                            c13660l.remoteconfig(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final void loadAd(C13660l c13660l, Object obj, Object obj2) {
        int iBilling = c13660l.billing(obj);
        boolean z = iBilling < 0;
        Object obj3 = z ? null : c13660l.crashlytics[iBilling];
        if (obj3 != null) {
            if (obj3 instanceof C6295l) {
                ((C6295l) obj3).yandex(obj2);
            } else if (obj3 != obj2) {
                C6295l c6295l = new C6295l();
                c6295l.yandex(obj3);
                c6295l.yandex(obj2);
                obj2 = c6295l;
            }
            obj2 = obj3;
        }
        if (!z) {
            c13660l.crashlytics[iBilling] = obj2;
            return;
        }
        int i = ~iBilling;
        c13660l.loadAd[i] = obj;
        c13660l.crashlytics[i] = obj2;
    }

    public static void mopub(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[7]) & 4294967295L;
        long j2 = (6803 * j) + (((long) iArr[0]) & 4294967295L);
        int i = (int) j2;
        iArr2[0] = i;
        long j3 = ((long) iArr[8]) & 4294967295L;
        long j4 = (6803 * j3) + j + (((long) iArr[1]) & 4294967295L) + (j2 >>> 32);
        int i2 = (int) j4;
        iArr2[1] = i2;
        long j5 = ((long) iArr[9]) & 4294967295L;
        long j6 = (6803 * j5) + j3 + (((long) iArr[2]) & 4294967295L) + (j4 >>> 32);
        int i3 = (int) j6;
        iArr2[2] = i3;
        long j7 = ((long) iArr[10]) & 4294967295L;
        long j8 = (6803 * j7) + j5 + (((long) iArr[3]) & 4294967295L) + (j6 >>> 32);
        int i4 = (int) j8;
        iArr2[3] = i4;
        long j9 = ((long) iArr[11]) & 4294967295L;
        long j10 = (6803 * j9) + j7 + (((long) iArr[4]) & 4294967295L) + (j8 >>> 32);
        iArr2[4] = (int) j10;
        long j11 = ((long) iArr[12]) & 4294967295L;
        long j12 = (6803 * j11) + j9 + (((long) iArr[5]) & 4294967295L) + (j10 >>> 32);
        iArr2[5] = (int) j12;
        long j13 = ((long) iArr[13]) & 4294967295L;
        long j14 = (6803 * j13) + j11 + (((long) iArr[6]) & 4294967295L) + (j12 >>> 32);
        iArr2[6] = (int) j14;
        long j15 = (j14 >>> 32) + j13;
        long j16 = j15 & 4294967295L;
        long j17 = (6803 * j16) + (((long) i) & 4294967295L);
        iArr2[0] = (int) j17;
        long j18 = j15 >>> 32;
        long j19 = (6803 * j18) + j16 + (((long) i2) & 4294967295L) + (j17 >>> 32);
        iArr2[1] = (int) j19;
        long j20 = j18 + (((long) i3) & 4294967295L) + (j19 >>> 32);
        iArr2[2] = (int) j20;
        long j21 = (j20 >>> 32) + (((long) i4) & 4294967295L);
        iArr2[3] = (int) j21;
        if (((j21 >>> 32) == 0 ? 0 : AbstractC4952l.Signature(7, 4, iArr2)) != 0 || (iArr2[6] == -1 && AbstractC3292l.adcel(iArr2, yandex))) {
            AbstractC4952l.amazon(7, 6803, iArr2);
        }
    }

    public static void purchase(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[14];
        AbstractC3292l.tapsense(iArr, iArr2, iArr4);
        mopub(iArr4, iArr3);
    }

    public static void remoteconfig(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC3292l.pro(iArr, iArr2, iArr3) != 0) {
            AbstractC4952l.m1653throws(7, 6803, iArr3);
        }
    }

    public static void smaato(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        AbstractC3292l.license(iArr, iArr3);
        while (true) {
            mopub(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                AbstractC3292l.license(iArr2, iArr3);
            }
        }
    }

    public static final boolean subs(C13660l c13660l, Object obj, Object obj2) {
        Object objMopub = c13660l.mopub(obj);
        if (objMopub == null) {
            return false;
        }
        if (!(objMopub instanceof C6295l)) {
            if (!objMopub.equals(obj2)) {
                return false;
            }
            c13660l.smaato(obj);
            return true;
        }
        C6295l c6295l = (C6295l) objMopub;
        boolean zRemoteconfig = c6295l.remoteconfig(obj2);
        if (zRemoteconfig && c6295l.admob()) {
            c13660l.smaato(obj);
        }
        return zRemoteconfig;
    }

    public static Map vip(String str, Bundle bundle) {
        Map map = (Map) bundle.getSerializable(str);
        if (map == null) {
            return C14885l.f29271l;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                map2.put((Integer) entry.getKey(), (Integer) entry.getValue());
            }
        }
        return DesugarCollections.unmodifiableMap(map2);
    }

    public static final void yandex(C15578l c15578l, C6956l c6956l, int i) {
        c6956l.m2133new(-709502251);
        byte b = 0;
        if (c6956l.m2127for(i & 1, (i & 3) != 2)) {
            C10707l c10707l = AbstractC16780l.yandex;
            InterfaceC2449l interfaceC2449l = (InterfaceC2449l) c6956l.isPro(c10707l);
            C8874l c8874lMopub = AbstractC1896l.mopub(c6956l);
            Object[] objArr = {interfaceC2449l};
            C13645l c13645l = new C13645l(new C12513l(b, 24), new C3005l(interfaceC2449l, c8874lMopub, 26), 13);
            boolean zAdmob = c6956l.admob(interfaceC2449l) | c6956l.admob(c8874lMopub);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C12242l(interfaceC2449l, c8874lMopub, 28);
                c6956l.m2147try(objM2132native);
            }
            C10641l c10641l = (C10641l) AbstractC0825l.smaato(objArr, c13645l, (Function0) objM2132native, c6956l, 0);
            AbstractC10478l.yandex(c10707l.yandex(c10641l), AbstractC14566l.amazon(-412824043, new C14601l(c15578l, c10641l, 19), c6956l), c6956l, 56);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C15701l(c15578l, i, 7);
        }
    }
}
