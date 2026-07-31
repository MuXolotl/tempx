package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lؘۘٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5916l extends AbstractC5070l {
    public byte Signature;
    public boolean ad;
    public int adcel;
    public int ads;
    public long advert;
    public final int firebase;
    public final int isPro;
    public byte license;
    public List metrica;
    public List startapp;
    public final int subs;
    public boolean subscription;
    public boolean tapsense;
    public static final int[] isVip = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] signatures = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] premium = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] applovin = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, EnergyProfile.EVCONNECTOR_TYPE_OTHER, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] appmetrica = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] inmobi = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static final int[] f12463throws = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static final boolean[] f12462package = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final C13143l admob = new C13143l();
    public final ArrayList remoteconfig = new ArrayList();
    public C8787l vip = new C8787l(0, 4);
    public int pro = 0;
    public final long smaato = 16000000;

    public C5916l(String str, int i) {
        this.subs = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.firebase = 0;
            this.isPro = 0;
        } else if (i == 2) {
            this.firebase = 1;
            this.isPro = 0;
        } else if (i == 3) {
            this.firebase = 0;
            this.isPro = 1;
        } else if (i != 4) {
            AbstractC6427l.vip("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.firebase = 0;
            this.isPro = 0;
        } else {
            this.firebase = 1;
            this.isPro = 1;
        }
        smaato(0);
        firebase();
        this.ad = true;
        this.advert = -9223372036854775807L;
    }

    @Override // defpackage.AbstractC5070l, defpackage.InterfaceC12313l
    /* JADX INFO: renamed from: admob */
    public final C10563l crashlytics() {
        C10563l c10563l;
        C10563l c10563lCrashlytics = super.crashlytics();
        if (c10563lCrashlytics != null) {
            return c10563lCrashlytics;
        }
        long j = this.smaato;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j2 = this.advert;
        if (j2 == -9223372036854775807L || this.purchase - j2 < j || (c10563l = (C10563l) this.loadAd.pollFirst()) == null) {
            return null;
        }
        this.metrica = Collections.EMPTY_LIST;
        this.advert = -9223372036854775807L;
        C8341l c8341lBilling = billing();
        long j3 = this.purchase;
        c10563l.f23515l = j3;
        c10563l.f21476l = c8341lBilling;
        c10563l.f21477l = j3;
        return c10563l;
    }

    @Override // defpackage.AbstractC5070l
    public final C8341l billing() {
        List list = this.metrica;
        this.startapp = list;
        list.getClass();
        return new C8341l(list);
    }

    public final void firebase() {
        C8787l c8787l = this.vip;
        c8787l.mopub = this.adcel;
        c8787l.yandex.clear();
        c8787l.loadAd.clear();
        c8787l.crashlytics.setLength(0);
        c8787l.amazon = 15;
        c8787l.purchase = 0;
        c8787l.billing = 0;
        ArrayList arrayList = this.remoteconfig;
        arrayList.clear();
        arrayList.add(this.vip);
    }

    @Override // defpackage.AbstractC5070l, defpackage.InterfaceC12313l
    public final void flush() {
        super.flush();
        this.metrica = null;
        this.startapp = null;
        smaato(0);
        this.ads = 4;
        this.vip.admob = 4;
        firebase();
        this.subscription = false;
        this.tapsense = false;
        this.Signature = (byte) 0;
        this.license = (byte) 0;
        this.pro = 0;
        this.ad = true;
        this.advert = -9223372036854775807L;
    }

    public final ArrayList isPro() {
        ArrayList arrayList = this.remoteconfig;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            C17456l c17456lCrashlytics = ((C8787l) arrayList.get(i)).crashlytics(RecyclerView.UNDEFINED_DURATION);
            arrayList2.add(c17456lCrashlytics);
            if (c17456lCrashlytics != null) {
                iMin = Math.min(iMin, c17456lCrashlytics.subs);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            C17456l c17456lCrashlytics2 = (C17456l) arrayList2.get(i2);
            if (c17456lCrashlytics2 != null) {
                if (c17456lCrashlytics2.subs != iMin) {
                    c17456lCrashlytics2 = ((C8787l) arrayList.get(i2)).crashlytics(iMin);
                    c17456lCrashlytics2.getClass();
                }
                arrayList3.add(c17456lCrashlytics2);
            }
        }
        return arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x019a  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:134:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01da  */
    /* JADX WARN: Code duplicated, block: B:143:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:148:0x0207 A[LOOP:1: B:146:0x0201->B:148:0x0207, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x020b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0211 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0213  */
    /* JADX WARN: Code duplicated, block: B:153:0x0218  */
    /* JADX WARN: Code duplicated, block: B:154:0x021f  */
    /* JADX WARN: Code duplicated, block: B:155:0x022a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0235  */
    /* JADX WARN: Code duplicated, block: B:157:0x0240  */
    /* JADX WARN: Code duplicated, block: B:158:0x0245  */
    /* JADX WARN: Code duplicated, block: B:159:0x024a  */
    /* JADX WARN: Code duplicated, block: B:161:0x025b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x012a  */
    /* JADX WARN: Code duplicated, block: B:93:0x012e  */
    @Override // defpackage.AbstractC5070l
    public final void mopub(C3875l c3875l) {
        boolean z;
        int i;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList;
        int iMin;
        ByteBuffer byteBuffer = c3875l.f8498l;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C13143l c13143l = this.admob;
        c13143l.m3565private(iLimit, bArrArray);
        boolean z2 = false;
        while (true) {
            int iYandex = c13143l.yandex();
            int i5 = this.subs;
            if (iYandex < i5) {
                if (z2) {
                    int i6 = this.adcel;
                    if (i6 == 1 || i6 == 3) {
                        this.metrica = isPro();
                        this.advert = this.purchase;
                        return;
                    }
                    return;
                }
                return;
            }
            int iSignatures = i5 == 2 ? -4 : c13143l.signatures();
            int iSignatures2 = c13143l.signatures();
            int iSignatures3 = c13143l.signatures();
            if ((iSignatures & 2) == 0 && (iSignatures & 1) == this.isPro) {
                byte b = (byte) (iSignatures2 & 127);
                byte b2 = (byte) (iSignatures3 & 127);
                if (b != 0 || b2 != 0) {
                    boolean z3 = this.subscription;
                    if ((iSignatures & 4) == 4) {
                        boolean[] zArr = f12462package;
                        if (zArr[iSignatures2] && zArr[iSignatures3]) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    this.subscription = z;
                    if (!z || (b & 240) != 16) {
                        this.tapsense = false;
                        if (!z) {
                            if (1 > b && b <= 15) {
                                this.ad = false;
                            } else if ((b & 246) == 20) {
                                if (b2 == 32 && b2 != 47) {
                                    switch (b2) {
                                        default:
                                            switch (b2) {
                                                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                                                    this.ad = false;
                                                    break;
                                            }
                                        case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                        case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                        case Maneuver.TYPE_DESTINATION /* 39 */:
                                            this.ad = true;
                                            break;
                                    }
                                } else {
                                    this.ad = true;
                                }
                            }
                            if (this.ad) {
                                i = b & 224;
                                if (i == 0) {
                                    this.pro = (b >> 3) & 1;
                                }
                                if (this.pro != this.firebase) {
                                    if (i == 0) {
                                        i2 = b & 247;
                                        if (i2 == 17 || (b2 & 240) != 48) {
                                            i3 = b & 246;
                                            if (i3 != 18 && (b2 & 224) == 32) {
                                                this.vip.loadAd();
                                                this.vip.yandex((char) ((b & 1) == 0 ? inmobi[b2 & 31] : f12463throws[b2 & 31]));
                                            } else if (i2 != 17 && (b2 & 240) == 32) {
                                                this.vip.yandex(' ');
                                                boolean z4 = (b2 & 1) == 1;
                                                C8787l c8787l = this.vip;
                                                c8787l.yandex.add(new C18258l((b2 >> 1) & 7, c8787l.crashlytics.length(), z4));
                                            } else if ((b & 240) != 16 && (b2 & 192) == 64) {
                                                int i7 = isVip[b & 7];
                                                if ((b2 & 32) != 0) {
                                                    i7++;
                                                }
                                                C8787l c8787l2 = this.vip;
                                                if (i7 != c8787l2.amazon) {
                                                    if (this.adcel != 1 && !c8787l2.purchase()) {
                                                        C8787l c8787l3 = new C8787l(this.adcel, this.ads);
                                                        this.vip = c8787l3;
                                                        this.remoteconfig.add(c8787l3);
                                                    }
                                                    this.vip.amazon = i7;
                                                }
                                                boolean z5 = (b2 & 16) == 16;
                                                boolean z6 = (b2 & 1) == 1;
                                                int i8 = (b2 >> 1) & 7;
                                                C8787l c8787l4 = this.vip;
                                                c8787l4.yandex.add(new C18258l(z5 ? 8 : i8, c8787l4.crashlytics.length(), z6));
                                                if (z5) {
                                                    this.vip.purchase = signatures[i8];
                                                }
                                            } else if (i2 != 23 && b2 >= 33 && b2 <= 35) {
                                                this.vip.billing = b2 - 32;
                                            } else if (i3 == 20 && (b2 & 240) == 32) {
                                                if (b2 == 32) {
                                                    smaato(2);
                                                } else if (b2 != 41) {
                                                    switch (b2) {
                                                        case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                            smaato(1);
                                                            this.ads = 2;
                                                            this.vip.admob = 2;
                                                            break;
                                                        case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                            smaato(1);
                                                            this.ads = 3;
                                                            this.vip.admob = 3;
                                                            break;
                                                        case Maneuver.TYPE_DESTINATION /* 39 */:
                                                            smaato(1);
                                                            this.ads = 4;
                                                            this.vip.admob = 4;
                                                            break;
                                                        default:
                                                            i4 = this.adcel;
                                                            if (i4 != 0) {
                                                                if (b2 != 33) {
                                                                    switch (b2) {
                                                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                            this.metrica = Collections.EMPTY_LIST;
                                                                            if (i4 != 1 || i4 == 3) {
                                                                                firebase();
                                                                            }
                                                                            break;
                                                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                            if (i4 == 1 && !this.vip.purchase()) {
                                                                                C8787l c8787l5 = this.vip;
                                                                                arrayList = c8787l5.loadAd;
                                                                                arrayList.add(c8787l5.amazon());
                                                                                c8787l5.crashlytics.setLength(0);
                                                                                c8787l5.yandex.clear();
                                                                                iMin = Math.min(c8787l5.admob, c8787l5.amazon);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                            firebase();
                                                                            break;
                                                                        case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                            this.metrica = isPro();
                                                                            firebase();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.vip.loadAd();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    smaato(3);
                                                }
                                            }
                                        } else {
                                            this.vip.yandex((char) appmetrica[b2 & 15]);
                                        }
                                    } else {
                                        C8787l c8787l6 = this.vip;
                                        iArr = applovin;
                                        c8787l6.yandex((char) iArr[(b & 127) - 32]);
                                        if ((b2 & 224) != 0) {
                                            this.vip.yandex((char) iArr[(b2 & 127) - 32]);
                                        }
                                    }
                                    z2 = true;
                                }
                            }
                        } else if (z3) {
                            firebase();
                            z2 = true;
                        }
                    } else if (this.tapsense && this.Signature == b && this.license == b2) {
                        this.tapsense = false;
                    } else {
                        this.tapsense = true;
                        this.Signature = b;
                        this.license = b2;
                        if (!z) {
                            if (1 > b) {
                                if ((b & 246) == 20) {
                                    if (b2 == 32) {
                                        this.ad = true;
                                    } else {
                                        this.ad = true;
                                    }
                                }
                            } else if ((b & 246) == 20) {
                                if (b2 == 32) {
                                    this.ad = true;
                                } else {
                                    this.ad = true;
                                }
                            }
                            if (this.ad) {
                                i = b & 224;
                                if (i == 0) {
                                    this.pro = (b >> 3) & 1;
                                }
                                if (this.pro != this.firebase) {
                                    if (i == 0) {
                                        i2 = b & 247;
                                        if (i2 == 17) {
                                            i3 = b & 246;
                                            if (i3 != 18) {
                                                if (i2 != 17) {
                                                    if ((b & 240) != 16) {
                                                        if (i2 != 23) {
                                                            if (i3 == 20) {
                                                                if (b2 == 32) {
                                                                    smaato(2);
                                                                } else if (b2 != 41) {
                                                                    switch (b2) {
                                                                        case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                            smaato(1);
                                                                            this.ads = 2;
                                                                            this.vip.admob = 2;
                                                                            break;
                                                                        case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                            smaato(1);
                                                                            this.ads = 3;
                                                                            this.vip.admob = 3;
                                                                            break;
                                                                        case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                            smaato(1);
                                                                            this.ads = 4;
                                                                            this.vip.admob = 4;
                                                                            break;
                                                                        default:
                                                                            i4 = this.adcel;
                                                                            if (i4 != 0) {
                                                                                if (b2 != 33) {
                                                                                    switch (b2) {
                                                                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                            this.metrica = Collections.EMPTY_LIST;
                                                                                            if (i4 != 1) {
                                                                                                firebase();
                                                                                            } else {
                                                                                                firebase();
                                                                                            }
                                                                                            break;
                                                                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                            if (i4 == 1) {
                                                                                                C8787l c8787l7 = this.vip;
                                                                                                arrayList = c8787l7.loadAd;
                                                                                                arrayList.add(c8787l7.amazon());
                                                                                                c8787l7.crashlytics.setLength(0);
                                                                                                c8787l7.yandex.clear();
                                                                                                iMin = Math.min(c8787l7.admob, c8787l7.amazon);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                            firebase();
                                                                                            break;
                                                                                        case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                            this.metrica = isPro();
                                                                                            firebase();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.vip.loadAd();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    smaato(3);
                                                                }
                                                            }
                                                        } else if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                smaato(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        smaato(1);
                                                                        this.ads = 2;
                                                                        this.vip.admob = 2;
                                                                        break;
                                                                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        smaato(1);
                                                                        this.ads = 3;
                                                                        this.vip.admob = 3;
                                                                        break;
                                                                    case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        smaato(1);
                                                                        this.ads = 4;
                                                                        this.vip.admob = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.adcel;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.metrica = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            firebase();
                                                                                        } else {
                                                                                            firebase();
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            C8787l c8787l8 = this.vip;
                                                                                            arrayList = c8787l8.loadAd;
                                                                                            arrayList.add(c8787l8.amazon());
                                                                                            c8787l8.crashlytics.setLength(0);
                                                                                            c8787l8.yandex.clear();
                                                                                            iMin = Math.min(c8787l8.admob, c8787l8.amazon);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        firebase();
                                                                                        break;
                                                                                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.metrica = isPro();
                                                                                        firebase();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.vip.loadAd();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                smaato(3);
                                                            }
                                                        }
                                                    } else if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                smaato(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        smaato(1);
                                                                        this.ads = 2;
                                                                        this.vip.admob = 2;
                                                                        break;
                                                                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        smaato(1);
                                                                        this.ads = 3;
                                                                        this.vip.admob = 3;
                                                                        break;
                                                                    case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        smaato(1);
                                                                        this.ads = 4;
                                                                        this.vip.admob = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.adcel;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.metrica = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            firebase();
                                                                                        } else {
                                                                                            firebase();
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            C8787l c8787l9 = this.vip;
                                                                                            arrayList = c8787l9.loadAd;
                                                                                            arrayList.add(c8787l9.amazon());
                                                                                            c8787l9.crashlytics.setLength(0);
                                                                                            c8787l9.yandex.clear();
                                                                                            iMin = Math.min(c8787l9.admob, c8787l9.amazon);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        firebase();
                                                                                        break;
                                                                                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.metrica = isPro();
                                                                                        firebase();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.vip.loadAd();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                smaato(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            smaato(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    smaato(1);
                                                                    this.ads = 2;
                                                                    this.vip.admob = 2;
                                                                    break;
                                                                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    smaato(1);
                                                                    this.ads = 3;
                                                                    this.vip.admob = 3;
                                                                    break;
                                                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    smaato(1);
                                                                    this.ads = 4;
                                                                    this.vip.admob = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.adcel;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.metrica = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        firebase();
                                                                                    } else {
                                                                                        firebase();
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        C8787l c8787l10 = this.vip;
                                                                                        arrayList = c8787l10.loadAd;
                                                                                        arrayList.add(c8787l10.amazon());
                                                                                        c8787l10.crashlytics.setLength(0);
                                                                                        c8787l10.yandex.clear();
                                                                                        iMin = Math.min(c8787l10.admob, c8787l10.amazon);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    firebase();
                                                                                    break;
                                                                                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.metrica = isPro();
                                                                                    firebase();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.vip.loadAd();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            smaato(3);
                                                        }
                                                    }
                                                } else if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                smaato(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        smaato(1);
                                                                        this.ads = 2;
                                                                        this.vip.admob = 2;
                                                                        break;
                                                                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        smaato(1);
                                                                        this.ads = 3;
                                                                        this.vip.admob = 3;
                                                                        break;
                                                                    case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        smaato(1);
                                                                        this.ads = 4;
                                                                        this.vip.admob = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.adcel;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.metrica = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            firebase();
                                                                                        } else {
                                                                                            firebase();
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            C8787l c8787l11 = this.vip;
                                                                                            arrayList = c8787l11.loadAd;
                                                                                            arrayList.add(c8787l11.amazon());
                                                                                            c8787l11.crashlytics.setLength(0);
                                                                                            c8787l11.yandex.clear();
                                                                                            iMin = Math.min(c8787l11.admob, c8787l11.amazon);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        firebase();
                                                                                        break;
                                                                                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.metrica = isPro();
                                                                                        firebase();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.vip.loadAd();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                smaato(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            smaato(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    smaato(1);
                                                                    this.ads = 2;
                                                                    this.vip.admob = 2;
                                                                    break;
                                                                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    smaato(1);
                                                                    this.ads = 3;
                                                                    this.vip.admob = 3;
                                                                    break;
                                                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    smaato(1);
                                                                    this.ads = 4;
                                                                    this.vip.admob = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.adcel;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.metrica = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        firebase();
                                                                                    } else {
                                                                                        firebase();
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        C8787l c8787l12 = this.vip;
                                                                                        arrayList = c8787l12.loadAd;
                                                                                        arrayList.add(c8787l12.amazon());
                                                                                        c8787l12.crashlytics.setLength(0);
                                                                                        c8787l12.yandex.clear();
                                                                                        iMin = Math.min(c8787l12.admob, c8787l12.amazon);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    firebase();
                                                                                    break;
                                                                                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.metrica = isPro();
                                                                                    firebase();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.vip.loadAd();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            smaato(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            smaato(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    smaato(1);
                                                                    this.ads = 2;
                                                                    this.vip.admob = 2;
                                                                    break;
                                                                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    smaato(1);
                                                                    this.ads = 3;
                                                                    this.vip.admob = 3;
                                                                    break;
                                                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    smaato(1);
                                                                    this.ads = 4;
                                                                    this.vip.admob = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.adcel;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.metrica = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        firebase();
                                                                                    } else {
                                                                                        firebase();
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        C8787l c8787l13 = this.vip;
                                                                                        arrayList = c8787l13.loadAd;
                                                                                        arrayList.add(c8787l13.amazon());
                                                                                        c8787l13.crashlytics.setLength(0);
                                                                                        c8787l13.yandex.clear();
                                                                                        iMin = Math.min(c8787l13.admob, c8787l13.amazon);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    firebase();
                                                                                    break;
                                                                                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.metrica = isPro();
                                                                                    firebase();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.vip.loadAd();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            smaato(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        smaato(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                smaato(1);
                                                                this.ads = 2;
                                                                this.vip.admob = 2;
                                                                break;
                                                            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                smaato(1);
                                                                this.ads = 3;
                                                                this.vip.admob = 3;
                                                                break;
                                                            case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                smaato(1);
                                                                this.ads = 4;
                                                                this.vip.admob = 4;
                                                                break;
                                                            default:
                                                                i4 = this.adcel;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                this.metrica = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    firebase();
                                                                                } else {
                                                                                    firebase();
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                if (i4 == 1) {
                                                                                    C8787l c8787l14 = this.vip;
                                                                                    arrayList = c8787l14.loadAd;
                                                                                    arrayList.add(c8787l14.amazon());
                                                                                    c8787l14.crashlytics.setLength(0);
                                                                                    c8787l14.yandex.clear();
                                                                                    iMin = Math.min(c8787l14.admob, c8787l14.amazon);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                firebase();
                                                                                break;
                                                                            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                this.metrica = isPro();
                                                                                firebase();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.vip.loadAd();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        smaato(3);
                                                    }
                                                }
                                            } else if (i2 != 17) {
                                                if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                smaato(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        smaato(1);
                                                                        this.ads = 2;
                                                                        this.vip.admob = 2;
                                                                        break;
                                                                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        smaato(1);
                                                                        this.ads = 3;
                                                                        this.vip.admob = 3;
                                                                        break;
                                                                    case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        smaato(1);
                                                                        this.ads = 4;
                                                                        this.vip.admob = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.adcel;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.metrica = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            firebase();
                                                                                        } else {
                                                                                            firebase();
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            C8787l c8787l15 = this.vip;
                                                                                            arrayList = c8787l15.loadAd;
                                                                                            arrayList.add(c8787l15.amazon());
                                                                                            c8787l15.crashlytics.setLength(0);
                                                                                            c8787l15.yandex.clear();
                                                                                            iMin = Math.min(c8787l15.admob, c8787l15.amazon);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        firebase();
                                                                                        break;
                                                                                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.metrica = isPro();
                                                                                        firebase();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.vip.loadAd();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                smaato(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            smaato(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    smaato(1);
                                                                    this.ads = 2;
                                                                    this.vip.admob = 2;
                                                                    break;
                                                                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    smaato(1);
                                                                    this.ads = 3;
                                                                    this.vip.admob = 3;
                                                                    break;
                                                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    smaato(1);
                                                                    this.ads = 4;
                                                                    this.vip.admob = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.adcel;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.metrica = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        firebase();
                                                                                    } else {
                                                                                        firebase();
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        C8787l c8787l16 = this.vip;
                                                                                        arrayList = c8787l16.loadAd;
                                                                                        arrayList.add(c8787l16.amazon());
                                                                                        c8787l16.crashlytics.setLength(0);
                                                                                        c8787l16.yandex.clear();
                                                                                        iMin = Math.min(c8787l16.admob, c8787l16.amazon);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    firebase();
                                                                                    break;
                                                                                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.metrica = isPro();
                                                                                    firebase();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.vip.loadAd();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            smaato(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            smaato(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    smaato(1);
                                                                    this.ads = 2;
                                                                    this.vip.admob = 2;
                                                                    break;
                                                                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    smaato(1);
                                                                    this.ads = 3;
                                                                    this.vip.admob = 3;
                                                                    break;
                                                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    smaato(1);
                                                                    this.ads = 4;
                                                                    this.vip.admob = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.adcel;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.metrica = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        firebase();
                                                                                    } else {
                                                                                        firebase();
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        C8787l c8787l17 = this.vip;
                                                                                        arrayList = c8787l17.loadAd;
                                                                                        arrayList.add(c8787l17.amazon());
                                                                                        c8787l17.crashlytics.setLength(0);
                                                                                        c8787l17.yandex.clear();
                                                                                        iMin = Math.min(c8787l17.admob, c8787l17.amazon);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    firebase();
                                                                                    break;
                                                                                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.metrica = isPro();
                                                                                    firebase();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.vip.loadAd();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            smaato(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        smaato(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                smaato(1);
                                                                this.ads = 2;
                                                                this.vip.admob = 2;
                                                                break;
                                                            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                smaato(1);
                                                                this.ads = 3;
                                                                this.vip.admob = 3;
                                                                break;
                                                            case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                smaato(1);
                                                                this.ads = 4;
                                                                this.vip.admob = 4;
                                                                break;
                                                            default:
                                                                i4 = this.adcel;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                this.metrica = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    firebase();
                                                                                } else {
                                                                                    firebase();
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                if (i4 == 1) {
                                                                                    C8787l c8787l18 = this.vip;
                                                                                    arrayList = c8787l18.loadAd;
                                                                                    arrayList.add(c8787l18.amazon());
                                                                                    c8787l18.crashlytics.setLength(0);
                                                                                    c8787l18.yandex.clear();
                                                                                    iMin = Math.min(c8787l18.admob, c8787l18.amazon);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                firebase();
                                                                                break;
                                                                            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                this.metrica = isPro();
                                                                                firebase();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.vip.loadAd();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        smaato(3);
                                                    }
                                                }
                                            } else if ((b & 240) != 16) {
                                                if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            smaato(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    smaato(1);
                                                                    this.ads = 2;
                                                                    this.vip.admob = 2;
                                                                    break;
                                                                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    smaato(1);
                                                                    this.ads = 3;
                                                                    this.vip.admob = 3;
                                                                    break;
                                                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    smaato(1);
                                                                    this.ads = 4;
                                                                    this.vip.admob = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.adcel;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.metrica = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        firebase();
                                                                                    } else {
                                                                                        firebase();
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        C8787l c8787l19 = this.vip;
                                                                                        arrayList = c8787l19.loadAd;
                                                                                        arrayList.add(c8787l19.amazon());
                                                                                        c8787l19.crashlytics.setLength(0);
                                                                                        c8787l19.yandex.clear();
                                                                                        iMin = Math.min(c8787l19.admob, c8787l19.amazon);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    firebase();
                                                                                    break;
                                                                                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.metrica = isPro();
                                                                                    firebase();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.vip.loadAd();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            smaato(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        smaato(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                smaato(1);
                                                                this.ads = 2;
                                                                this.vip.admob = 2;
                                                                break;
                                                            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                smaato(1);
                                                                this.ads = 3;
                                                                this.vip.admob = 3;
                                                                break;
                                                            case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                smaato(1);
                                                                this.ads = 4;
                                                                this.vip.admob = 4;
                                                                break;
                                                            default:
                                                                i4 = this.adcel;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                this.metrica = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    firebase();
                                                                                } else {
                                                                                    firebase();
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                if (i4 == 1) {
                                                                                    C8787l c8787l110 = this.vip;
                                                                                    arrayList = c8787l110.loadAd;
                                                                                    arrayList.add(c8787l110.amazon());
                                                                                    c8787l110.crashlytics.setLength(0);
                                                                                    c8787l110.yandex.clear();
                                                                                    iMin = Math.min(c8787l110.admob, c8787l110.amazon);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                firebase();
                                                                                break;
                                                                            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                this.metrica = isPro();
                                                                                firebase();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.vip.loadAd();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        smaato(3);
                                                    }
                                                }
                                            } else if (i2 != 23) {
                                                if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        smaato(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                smaato(1);
                                                                this.ads = 2;
                                                                this.vip.admob = 2;
                                                                break;
                                                            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                smaato(1);
                                                                this.ads = 3;
                                                                this.vip.admob = 3;
                                                                break;
                                                            case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                smaato(1);
                                                                this.ads = 4;
                                                                this.vip.admob = 4;
                                                                break;
                                                            default:
                                                                i4 = this.adcel;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                this.metrica = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    firebase();
                                                                                } else {
                                                                                    firebase();
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                if (i4 == 1) {
                                                                                    C8787l c8787l111 = this.vip;
                                                                                    arrayList = c8787l111.loadAd;
                                                                                    arrayList.add(c8787l111.amazon());
                                                                                    c8787l111.crashlytics.setLength(0);
                                                                                    c8787l111.yandex.clear();
                                                                                    iMin = Math.min(c8787l111.admob, c8787l111.amazon);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                firebase();
                                                                                break;
                                                                            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                this.metrica = isPro();
                                                                                firebase();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.vip.loadAd();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        smaato(3);
                                                    }
                                                }
                                            } else if (i3 == 20) {
                                                if (b2 == 32) {
                                                    smaato(2);
                                                } else if (b2 != 41) {
                                                    switch (b2) {
                                                        case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                            smaato(1);
                                                            this.ads = 2;
                                                            this.vip.admob = 2;
                                                            break;
                                                        case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                            smaato(1);
                                                            this.ads = 3;
                                                            this.vip.admob = 3;
                                                            break;
                                                        case Maneuver.TYPE_DESTINATION /* 39 */:
                                                            smaato(1);
                                                            this.ads = 4;
                                                            this.vip.admob = 4;
                                                            break;
                                                        default:
                                                            i4 = this.adcel;
                                                            if (i4 != 0) {
                                                                if (b2 != 33) {
                                                                    switch (b2) {
                                                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                            this.metrica = Collections.EMPTY_LIST;
                                                                            if (i4 != 1) {
                                                                                firebase();
                                                                            } else {
                                                                                firebase();
                                                                            }
                                                                            break;
                                                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                            if (i4 == 1) {
                                                                                C8787l c8787l112 = this.vip;
                                                                                arrayList = c8787l112.loadAd;
                                                                                arrayList.add(c8787l112.amazon());
                                                                                c8787l112.crashlytics.setLength(0);
                                                                                c8787l112.yandex.clear();
                                                                                iMin = Math.min(c8787l112.admob, c8787l112.amazon);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                            firebase();
                                                                            break;
                                                                        case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                            this.metrica = isPro();
                                                                            firebase();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.vip.loadAd();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    smaato(3);
                                                }
                                            }
                                        } else {
                                            i3 = b & 246;
                                            if (i3 != 18) {
                                                if (i2 != 17) {
                                                    if ((b & 240) != 16) {
                                                        if (i2 != 23) {
                                                            if (i3 == 20) {
                                                                if (b2 == 32) {
                                                                    smaato(2);
                                                                } else if (b2 != 41) {
                                                                    switch (b2) {
                                                                        case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                            smaato(1);
                                                                            this.ads = 2;
                                                                            this.vip.admob = 2;
                                                                            break;
                                                                        case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                            smaato(1);
                                                                            this.ads = 3;
                                                                            this.vip.admob = 3;
                                                                            break;
                                                                        case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                            smaato(1);
                                                                            this.ads = 4;
                                                                            this.vip.admob = 4;
                                                                            break;
                                                                        default:
                                                                            i4 = this.adcel;
                                                                            if (i4 != 0) {
                                                                                if (b2 != 33) {
                                                                                    switch (b2) {
                                                                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                            this.metrica = Collections.EMPTY_LIST;
                                                                                            if (i4 != 1) {
                                                                                                firebase();
                                                                                            } else {
                                                                                                firebase();
                                                                                            }
                                                                                            break;
                                                                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                            if (i4 == 1) {
                                                                                                C8787l c8787l113 = this.vip;
                                                                                                arrayList = c8787l113.loadAd;
                                                                                                arrayList.add(c8787l113.amazon());
                                                                                                c8787l113.crashlytics.setLength(0);
                                                                                                c8787l113.yandex.clear();
                                                                                                iMin = Math.min(c8787l113.admob, c8787l113.amazon);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                            firebase();
                                                                                            break;
                                                                                        case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                            this.metrica = isPro();
                                                                                            firebase();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.vip.loadAd();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    smaato(3);
                                                                }
                                                            }
                                                        } else if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                smaato(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        smaato(1);
                                                                        this.ads = 2;
                                                                        this.vip.admob = 2;
                                                                        break;
                                                                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        smaato(1);
                                                                        this.ads = 3;
                                                                        this.vip.admob = 3;
                                                                        break;
                                                                    case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        smaato(1);
                                                                        this.ads = 4;
                                                                        this.vip.admob = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.adcel;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.metrica = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            firebase();
                                                                                        } else {
                                                                                            firebase();
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            C8787l c8787l114 = this.vip;
                                                                                            arrayList = c8787l114.loadAd;
                                                                                            arrayList.add(c8787l114.amazon());
                                                                                            c8787l114.crashlytics.setLength(0);
                                                                                            c8787l114.yandex.clear();
                                                                                            iMin = Math.min(c8787l114.admob, c8787l114.amazon);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        firebase();
                                                                                        break;
                                                                                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.metrica = isPro();
                                                                                        firebase();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.vip.loadAd();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                smaato(3);
                                                            }
                                                        }
                                                    } else if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                smaato(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        smaato(1);
                                                                        this.ads = 2;
                                                                        this.vip.admob = 2;
                                                                        break;
                                                                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        smaato(1);
                                                                        this.ads = 3;
                                                                        this.vip.admob = 3;
                                                                        break;
                                                                    case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        smaato(1);
                                                                        this.ads = 4;
                                                                        this.vip.admob = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.adcel;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.metrica = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            firebase();
                                                                                        } else {
                                                                                            firebase();
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            C8787l c8787l115 = this.vip;
                                                                                            arrayList = c8787l115.loadAd;
                                                                                            arrayList.add(c8787l115.amazon());
                                                                                            c8787l115.crashlytics.setLength(0);
                                                                                            c8787l115.yandex.clear();
                                                                                            iMin = Math.min(c8787l115.admob, c8787l115.amazon);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        firebase();
                                                                                        break;
                                                                                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.metrica = isPro();
                                                                                        firebase();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.vip.loadAd();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                smaato(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            smaato(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    smaato(1);
                                                                    this.ads = 2;
                                                                    this.vip.admob = 2;
                                                                    break;
                                                                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    smaato(1);
                                                                    this.ads = 3;
                                                                    this.vip.admob = 3;
                                                                    break;
                                                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    smaato(1);
                                                                    this.ads = 4;
                                                                    this.vip.admob = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.adcel;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.metrica = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        firebase();
                                                                                    } else {
                                                                                        firebase();
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        C8787l c8787l116 = this.vip;
                                                                                        arrayList = c8787l116.loadAd;
                                                                                        arrayList.add(c8787l116.amazon());
                                                                                        c8787l116.crashlytics.setLength(0);
                                                                                        c8787l116.yandex.clear();
                                                                                        iMin = Math.min(c8787l116.admob, c8787l116.amazon);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    firebase();
                                                                                    break;
                                                                                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.metrica = isPro();
                                                                                    firebase();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.vip.loadAd();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            smaato(3);
                                                        }
                                                    }
                                                } else if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                smaato(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        smaato(1);
                                                                        this.ads = 2;
                                                                        this.vip.admob = 2;
                                                                        break;
                                                                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        smaato(1);
                                                                        this.ads = 3;
                                                                        this.vip.admob = 3;
                                                                        break;
                                                                    case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        smaato(1);
                                                                        this.ads = 4;
                                                                        this.vip.admob = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.adcel;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.metrica = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            firebase();
                                                                                        } else {
                                                                                            firebase();
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            C8787l c8787l117 = this.vip;
                                                                                            arrayList = c8787l117.loadAd;
                                                                                            arrayList.add(c8787l117.amazon());
                                                                                            c8787l117.crashlytics.setLength(0);
                                                                                            c8787l117.yandex.clear();
                                                                                            iMin = Math.min(c8787l117.admob, c8787l117.amazon);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        firebase();
                                                                                        break;
                                                                                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.metrica = isPro();
                                                                                        firebase();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.vip.loadAd();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                smaato(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            smaato(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    smaato(1);
                                                                    this.ads = 2;
                                                                    this.vip.admob = 2;
                                                                    break;
                                                                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    smaato(1);
                                                                    this.ads = 3;
                                                                    this.vip.admob = 3;
                                                                    break;
                                                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    smaato(1);
                                                                    this.ads = 4;
                                                                    this.vip.admob = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.adcel;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.metrica = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        firebase();
                                                                                    } else {
                                                                                        firebase();
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        C8787l c8787l118 = this.vip;
                                                                                        arrayList = c8787l118.loadAd;
                                                                                        arrayList.add(c8787l118.amazon());
                                                                                        c8787l118.crashlytics.setLength(0);
                                                                                        c8787l118.yandex.clear();
                                                                                        iMin = Math.min(c8787l118.admob, c8787l118.amazon);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    firebase();
                                                                                    break;
                                                                                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.metrica = isPro();
                                                                                    firebase();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.vip.loadAd();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            smaato(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            smaato(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    smaato(1);
                                                                    this.ads = 2;
                                                                    this.vip.admob = 2;
                                                                    break;
                                                                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    smaato(1);
                                                                    this.ads = 3;
                                                                    this.vip.admob = 3;
                                                                    break;
                                                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    smaato(1);
                                                                    this.ads = 4;
                                                                    this.vip.admob = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.adcel;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.metrica = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        firebase();
                                                                                    } else {
                                                                                        firebase();
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        C8787l c8787l119 = this.vip;
                                                                                        arrayList = c8787l119.loadAd;
                                                                                        arrayList.add(c8787l119.amazon());
                                                                                        c8787l119.crashlytics.setLength(0);
                                                                                        c8787l119.yandex.clear();
                                                                                        iMin = Math.min(c8787l119.admob, c8787l119.amazon);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    firebase();
                                                                                    break;
                                                                                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.metrica = isPro();
                                                                                    firebase();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.vip.loadAd();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            smaato(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        smaato(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                smaato(1);
                                                                this.ads = 2;
                                                                this.vip.admob = 2;
                                                                break;
                                                            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                smaato(1);
                                                                this.ads = 3;
                                                                this.vip.admob = 3;
                                                                break;
                                                            case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                smaato(1);
                                                                this.ads = 4;
                                                                this.vip.admob = 4;
                                                                break;
                                                            default:
                                                                i4 = this.adcel;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                this.metrica = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    firebase();
                                                                                } else {
                                                                                    firebase();
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                if (i4 == 1) {
                                                                                    C8787l c8787l1110 = this.vip;
                                                                                    arrayList = c8787l1110.loadAd;
                                                                                    arrayList.add(c8787l1110.amazon());
                                                                                    c8787l1110.crashlytics.setLength(0);
                                                                                    c8787l1110.yandex.clear();
                                                                                    iMin = Math.min(c8787l1110.admob, c8787l1110.amazon);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                firebase();
                                                                                break;
                                                                            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                this.metrica = isPro();
                                                                                firebase();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.vip.loadAd();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        smaato(3);
                                                    }
                                                }
                                            } else if (i2 != 17) {
                                                if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                smaato(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                        smaato(1);
                                                                        this.ads = 2;
                                                                        this.vip.admob = 2;
                                                                        break;
                                                                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                        smaato(1);
                                                                        this.ads = 3;
                                                                        this.vip.admob = 3;
                                                                        break;
                                                                    case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                        smaato(1);
                                                                        this.ads = 4;
                                                                        this.vip.admob = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.adcel;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                        this.metrica = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            firebase();
                                                                                        } else {
                                                                                            firebase();
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            C8787l c8787l1111 = this.vip;
                                                                                            arrayList = c8787l1111.loadAd;
                                                                                            arrayList.add(c8787l1111.amazon());
                                                                                            c8787l1111.crashlytics.setLength(0);
                                                                                            c8787l1111.yandex.clear();
                                                                                            iMin = Math.min(c8787l1111.admob, c8787l1111.amazon);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                        firebase();
                                                                                        break;
                                                                                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                        this.metrica = isPro();
                                                                                        firebase();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.vip.loadAd();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                smaato(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            smaato(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    smaato(1);
                                                                    this.ads = 2;
                                                                    this.vip.admob = 2;
                                                                    break;
                                                                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    smaato(1);
                                                                    this.ads = 3;
                                                                    this.vip.admob = 3;
                                                                    break;
                                                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    smaato(1);
                                                                    this.ads = 4;
                                                                    this.vip.admob = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.adcel;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.metrica = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        firebase();
                                                                                    } else {
                                                                                        firebase();
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        C8787l c8787l1112 = this.vip;
                                                                                        arrayList = c8787l1112.loadAd;
                                                                                        arrayList.add(c8787l1112.amazon());
                                                                                        c8787l1112.crashlytics.setLength(0);
                                                                                        c8787l1112.yandex.clear();
                                                                                        iMin = Math.min(c8787l1112.admob, c8787l1112.amazon);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    firebase();
                                                                                    break;
                                                                                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.metrica = isPro();
                                                                                    firebase();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.vip.loadAd();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            smaato(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            smaato(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    smaato(1);
                                                                    this.ads = 2;
                                                                    this.vip.admob = 2;
                                                                    break;
                                                                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    smaato(1);
                                                                    this.ads = 3;
                                                                    this.vip.admob = 3;
                                                                    break;
                                                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    smaato(1);
                                                                    this.ads = 4;
                                                                    this.vip.admob = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.adcel;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.metrica = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        firebase();
                                                                                    } else {
                                                                                        firebase();
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        C8787l c8787l1113 = this.vip;
                                                                                        arrayList = c8787l1113.loadAd;
                                                                                        arrayList.add(c8787l1113.amazon());
                                                                                        c8787l1113.crashlytics.setLength(0);
                                                                                        c8787l1113.yandex.clear();
                                                                                        iMin = Math.min(c8787l1113.admob, c8787l1113.amazon);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    firebase();
                                                                                    break;
                                                                                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.metrica = isPro();
                                                                                    firebase();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.vip.loadAd();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            smaato(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        smaato(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                smaato(1);
                                                                this.ads = 2;
                                                                this.vip.admob = 2;
                                                                break;
                                                            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                smaato(1);
                                                                this.ads = 3;
                                                                this.vip.admob = 3;
                                                                break;
                                                            case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                smaato(1);
                                                                this.ads = 4;
                                                                this.vip.admob = 4;
                                                                break;
                                                            default:
                                                                i4 = this.adcel;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                this.metrica = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    firebase();
                                                                                } else {
                                                                                    firebase();
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                if (i4 == 1) {
                                                                                    C8787l c8787l1114 = this.vip;
                                                                                    arrayList = c8787l1114.loadAd;
                                                                                    arrayList.add(c8787l1114.amazon());
                                                                                    c8787l1114.crashlytics.setLength(0);
                                                                                    c8787l1114.yandex.clear();
                                                                                    iMin = Math.min(c8787l1114.admob, c8787l1114.amazon);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                firebase();
                                                                                break;
                                                                            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                this.metrica = isPro();
                                                                                firebase();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.vip.loadAd();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        smaato(3);
                                                    }
                                                }
                                            } else if ((b & 240) != 16) {
                                                if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            smaato(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                    smaato(1);
                                                                    this.ads = 2;
                                                                    this.vip.admob = 2;
                                                                    break;
                                                                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                    smaato(1);
                                                                    this.ads = 3;
                                                                    this.vip.admob = 3;
                                                                    break;
                                                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                    smaato(1);
                                                                    this.ads = 4;
                                                                    this.vip.admob = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.adcel;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                    this.metrica = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        firebase();
                                                                                    } else {
                                                                                        firebase();
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        C8787l c8787l1115 = this.vip;
                                                                                        arrayList = c8787l1115.loadAd;
                                                                                        arrayList.add(c8787l1115.amazon());
                                                                                        c8787l1115.crashlytics.setLength(0);
                                                                                        c8787l1115.yandex.clear();
                                                                                        iMin = Math.min(c8787l1115.admob, c8787l1115.amazon);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                    firebase();
                                                                                    break;
                                                                                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                    this.metrica = isPro();
                                                                                    firebase();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.vip.loadAd();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            smaato(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        smaato(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                smaato(1);
                                                                this.ads = 2;
                                                                this.vip.admob = 2;
                                                                break;
                                                            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                smaato(1);
                                                                this.ads = 3;
                                                                this.vip.admob = 3;
                                                                break;
                                                            case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                smaato(1);
                                                                this.ads = 4;
                                                                this.vip.admob = 4;
                                                                break;
                                                            default:
                                                                i4 = this.adcel;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                this.metrica = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    firebase();
                                                                                } else {
                                                                                    firebase();
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                if (i4 == 1) {
                                                                                    C8787l c8787l1116 = this.vip;
                                                                                    arrayList = c8787l1116.loadAd;
                                                                                    arrayList.add(c8787l1116.amazon());
                                                                                    c8787l1116.crashlytics.setLength(0);
                                                                                    c8787l1116.yandex.clear();
                                                                                    iMin = Math.min(c8787l1116.admob, c8787l1116.amazon);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                firebase();
                                                                                break;
                                                                            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                this.metrica = isPro();
                                                                                firebase();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.vip.loadAd();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        smaato(3);
                                                    }
                                                }
                                            } else if (i2 != 23) {
                                                if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        smaato(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                                smaato(1);
                                                                this.ads = 2;
                                                                this.vip.admob = 2;
                                                                break;
                                                            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                                smaato(1);
                                                                this.ads = 3;
                                                                this.vip.admob = 3;
                                                                break;
                                                            case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                smaato(1);
                                                                this.ads = 4;
                                                                this.vip.admob = 4;
                                                                break;
                                                            default:
                                                                i4 = this.adcel;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                this.metrica = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    firebase();
                                                                                } else {
                                                                                    firebase();
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                if (i4 == 1) {
                                                                                    C8787l c8787l1117 = this.vip;
                                                                                    arrayList = c8787l1117.loadAd;
                                                                                    arrayList.add(c8787l1117.amazon());
                                                                                    c8787l1117.crashlytics.setLength(0);
                                                                                    c8787l1117.yandex.clear();
                                                                                    iMin = Math.min(c8787l1117.admob, c8787l1117.amazon);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                firebase();
                                                                                break;
                                                                            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                this.metrica = isPro();
                                                                                firebase();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.vip.loadAd();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        smaato(3);
                                                    }
                                                }
                                            } else if (i3 == 20) {
                                                if (b2 == 32) {
                                                    smaato(2);
                                                } else if (b2 != 41) {
                                                    switch (b2) {
                                                        case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                            smaato(1);
                                                            this.ads = 2;
                                                            this.vip.admob = 2;
                                                            break;
                                                        case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                            smaato(1);
                                                            this.ads = 3;
                                                            this.vip.admob = 3;
                                                            break;
                                                        case Maneuver.TYPE_DESTINATION /* 39 */:
                                                            smaato(1);
                                                            this.ads = 4;
                                                            this.vip.admob = 4;
                                                            break;
                                                        default:
                                                            i4 = this.adcel;
                                                            if (i4 != 0) {
                                                                if (b2 != 33) {
                                                                    switch (b2) {
                                                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                            this.metrica = Collections.EMPTY_LIST;
                                                                            if (i4 != 1) {
                                                                                firebase();
                                                                            } else {
                                                                                firebase();
                                                                            }
                                                                            break;
                                                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                            if (i4 == 1) {
                                                                                C8787l c8787l1118 = this.vip;
                                                                                arrayList = c8787l1118.loadAd;
                                                                                arrayList.add(c8787l1118.amazon());
                                                                                c8787l1118.crashlytics.setLength(0);
                                                                                c8787l1118.yandex.clear();
                                                                                iMin = Math.min(c8787l1118.admob, c8787l1118.amazon);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                            firebase();
                                                                            break;
                                                                        case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                            this.metrica = isPro();
                                                                            firebase();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.vip.loadAd();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    smaato(3);
                                                }
                                            }
                                        }
                                    } else {
                                        C8787l c8787l20 = this.vip;
                                        iArr = applovin;
                                        c8787l20.yandex((char) iArr[(b & 127) - 32]);
                                        if ((b2 & 224) != 0) {
                                            this.vip.yandex((char) iArr[(b2 & 127) - 32]);
                                        }
                                    }
                                    z2 = true;
                                }
                            }
                        } else if (z3) {
                            firebase();
                            z2 = true;
                        }
                    }
                }
            }
        }
    }

    public final void smaato(int i) {
        int i2 = this.adcel;
        if (i2 == i) {
            return;
        }
        this.adcel = i;
        if (i != 3) {
            firebase();
            if (i2 == 3 || i == 1 || i == 0) {
                this.metrica = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.remoteconfig;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((C8787l) arrayList.get(i3)).mopub = i;
            i3++;
        }
    }

    @Override // defpackage.AbstractC5070l
    public final boolean subs() {
        return this.metrica != this.startapp;
    }

    @Override // defpackage.AbstractC5070l, defpackage.InterfaceC12313l
    public final void release() {
    }
}
