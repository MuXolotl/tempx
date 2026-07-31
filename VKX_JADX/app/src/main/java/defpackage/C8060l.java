package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lً٘ٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8060l implements InterfaceC14833l {
    public boolean admob;
    public InterfaceC2053l billing;
    public int firebase;
    public int isPro;
    public C17177l metrica;
    public int mopub;
    public final C17491l purchase;
    public long remoteconfig;
    public int smaato;
    public C0163l startapp;
    public long subs;
    public boolean vip;
    public final C13143l yandex = new C13143l(4);
    public final C13143l loadAd = new C13143l(9);
    public final C13143l crashlytics = new C13143l(11);
    public final C13143l amazon = new C13143l();

    public C8060l() {
        C17491l c17491l = new C17491l(14, new C6120l());
        c17491l.f34074l = -9223372036854775807L;
        c17491l.f34076l = new long[0];
        c17491l.f34075l = new long[0];
        this.purchase = c17491l;
        this.mopub = 1;
    }

    @Override // defpackage.InterfaceC14833l
    public final void amazon(long j, long j2) {
        if (j == 0) {
            this.mopub = 1;
            this.admob = false;
        } else {
            this.mopub = 3;
        }
        this.isPro = 0;
    }

    @Override // defpackage.InterfaceC14833l
    public final void billing(InterfaceC2053l interfaceC2053l) {
        this.billing = interfaceC2053l;
    }

    @Override // defpackage.InterfaceC14833l
    public final boolean crashlytics(InterfaceC10430l interfaceC10430l) throws EOFException, InterruptedIOException {
        C13143l c13143l = this.yandex;
        C11826l c11826l = (C11826l) interfaceC10430l;
        c11826l.billing(c13143l.yandex, 0, 3, false);
        c13143l.m3562for(0);
        if (c13143l.appmetrica() == 4607062) {
            c11826l.billing(c13143l.yandex, 0, 2, false);
            c13143l.m3562for(0);
            if ((c13143l.m3567synchronized() & 250) == 0) {
                c11826l.billing(c13143l.yandex, 0, 4, false);
                c13143l.m3562for(0);
                int iRemoteconfig = c13143l.remoteconfig();
                c11826l.f23660l = 0;
                c11826l.firebase(iRemoteconfig, false);
                c11826l.billing(c13143l.yandex, 0, 4, false);
                c13143l.m3562for(0);
                if (c13143l.remoteconfig() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:144:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:145:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:184:0x03c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0170  */
    /* JADX WARN: Code duplicated, block: B:58:0x0178  */
    /* JADX WARN: Code duplicated, block: B:94:0x029d  */
    /* JADX WARN: Code duplicated, block: B:99:0x02b2  */
    @Override // defpackage.InterfaceC14833l
    public final int loadAd(InterfaceC10430l interfaceC10430l, C1014l c1014l) throws C17655l {
        long j;
        long j2;
        int i;
        boolean z;
        boolean z2;
        long j3;
        int i2;
        this.billing.getClass();
        while (true) {
            int i3 = this.mopub;
            boolean z3 = true;
            if (i3 == 1) {
                C13143l c13143l = this.loadAd;
                if (!interfaceC10430l.loadAd(c13143l.yandex, 0, 9, true)) {
                    return -1;
                }
                c13143l.m3562for(0);
                c13143l.m3568throw(4);
                int iSignatures = c13143l.signatures();
                boolean z4 = (iSignatures & 4) != 0;
                boolean z5 = (iSignatures & 1) != 0;
                if (z4 && this.metrica == null) {
                    this.metrica = new C17177l(14, this.billing.startapp(8, 1));
                }
                if (z5 && this.startapp == null) {
                    i2 = 2;
                    this.startapp = new C0163l(this.billing.startapp(9, 2));
                } else {
                    i2 = 2;
                }
                this.billing.firebase();
                this.isPro = c13143l.remoteconfig() - 5;
                this.mopub = i2;
            } else if (i3 == 2) {
                interfaceC10430l.remoteconfig(this.isPro);
                this.isPro = 0;
                this.mopub = 3;
            } else if (i3 == 3) {
                C13143l c13143l2 = this.crashlytics;
                if (!interfaceC10430l.loadAd(c13143l2.yandex, 0, 11, true)) {
                    return -1;
                }
                c13143l2.m3562for(0);
                this.firebase = c13143l2.signatures();
                this.smaato = c13143l2.appmetrica();
                this.remoteconfig = c13143l2.appmetrica();
                this.remoteconfig = (((long) (c13143l2.signatures() << 24)) | this.remoteconfig) * 1000;
                c13143l2.m3568throw(3);
                this.mopub = 4;
            } else {
                if (i3 != 4) {
                    C18073l.admob();
                    return 0;
                }
                boolean z6 = this.admob;
                C17491l c17491l = this.purchase;
                if (z6) {
                    j = this.subs + this.remoteconfig;
                } else {
                    if (c17491l.f34074l == -9223372036854775807L) {
                        j2 = 0;
                    } else {
                        j = this.remoteconfig;
                    }
                    i = this.firebase;
                    if (i == 8 || this.metrica == null) {
                        int i4 = 4;
                        if (i != 9 && this.startapp != null) {
                            if (!this.vip) {
                                this.billing.tapsense(new C9828l(-9223372036854775807L));
                                this.vip = true;
                            }
                            C0163l c0163l = this.startapp;
                            C13143l c13143lMopub = mopub(interfaceC10430l);
                            c0163l.getClass();
                            int iSignatures2 = c13143lMopub.signatures();
                            int i5 = (iSignatures2 >> 4) & 15;
                            int i6 = iSignatures2 & 15;
                            if (i6 != 7) {
                                throw new C1427l(AbstractC0653l.vip(i6, "Video format not supported: "));
                            }
                            c0163l.f1108l = i5;
                            if (i5 != 5) {
                                C13143l c13143l3 = c0163l.f1106l;
                                InterfaceC8979l interfaceC8979l = (InterfaceC8979l) c0163l.f833l;
                                C13143l c13143l4 = c0163l.f1110l;
                                int iSignatures3 = c13143lMopub.signatures();
                                c13143lMopub.billing(3);
                                byte[] bArr = c13143lMopub.yandex;
                                int i7 = c13143lMopub.loadAd;
                                int i8 = i7 + 1;
                                c13143lMopub.loadAd = i8;
                                int i9 = ((bArr[i7] & 255) << 24) >> 8;
                                int i10 = i7 + 2;
                                c13143lMopub.loadAd = i10;
                                int i11 = ((bArr[i8] & 255) << 8) | i9;
                                c13143lMopub.loadAd = i7 + 3;
                                long j4 = (((long) (i11 | (bArr[i10] & 255))) * 1000) + j2;
                                if (iSignatures3 != 0 || c0163l.f1111l) {
                                    if (iSignatures3 == 1 && c0163l.f1111l) {
                                        int i12 = c0163l.f1108l == 1 ? 1 : 0;
                                        if (c0163l.f1107l || i12 != 0) {
                                            byte[] bArr2 = c13143l4.yandex;
                                            bArr2[0] = 0;
                                            bArr2[1] = 0;
                                            bArr2[2] = 0;
                                            int i13 = 4 - c0163l.f1109l;
                                            int i14 = 0;
                                            while (c13143lMopub.yandex() > 0) {
                                                c13143lMopub.firebase(i13, c0163l.f1109l, c13143l4.yandex);
                                                c13143l4.m3562for(0);
                                                int iInmobi = c13143l4.inmobi();
                                                c13143l3.m3562for(0);
                                                interfaceC8979l.purchase(i4, c13143l3);
                                                interfaceC8979l.purchase(iInmobi, c13143lMopub);
                                                i14 = i14 + 4 + iInmobi;
                                                i4 = 4;
                                            }
                                            ((InterfaceC8979l) c0163l.f833l).yandex(j4, i12, i14, 0, null);
                                            c0163l.f1107l = true;
                                            z2 = true;
                                        }
                                    }
                                    z = z2;
                                    z3 = true;
                                } else {
                                    byte[] bArr3 = new byte[c13143lMopub.yandex()];
                                    C13143l c13143l5 = new C13143l(bArr3);
                                    c13143lMopub.firebase(0, c13143lMopub.yandex(), bArr3);
                                    C15307l c15307lYandex = C15307l.yandex(c13143l5);
                                    c0163l.f1109l = c15307lYandex.loadAd;
                                    C12984l c12984l = new C12984l();
                                    c12984l.remoteconfig = AbstractC3825l.vip("video/x-flv");
                                    c12984l.vip = AbstractC3825l.vip("video/avc");
                                    c12984l.isPro = c15307lYandex.smaato;
                                    c12984l.Signature = c15307lYandex.crashlytics;
                                    c12984l.license = c15307lYandex.amazon;
                                    c12984l.signatures = c15307lYandex.firebase;
                                    c12984l.adcel = c15307lYandex.yandex;
                                    AbstractC9029l.license(c12984l, interfaceC8979l);
                                    c0163l.f1111l = true;
                                }
                                z2 = false;
                                if (z2) {
                                }
                                z3 = true;
                            }
                        } else if (i == 18 || this.vip) {
                            interfaceC10430l.remoteconfig(this.smaato);
                            z = false;
                            z3 = false;
                        } else {
                            C13143l c13143lMopub2 = mopub(interfaceC10430l);
                            c17491l.getClass();
                            if (c13143lMopub2.signatures() == 2 && "onMetaData".equals(C17491l.m4392l(c13143lMopub2)) && c13143lMopub2.yandex() != 0 && c13143lMopub2.signatures() == 8) {
                                HashMap mapM4393l = C17491l.m4393l(c13143lMopub2);
                                Object obj = mapM4393l.get("duration");
                                if (obj instanceof Double) {
                                    double dDoubleValue = ((Double) obj).doubleValue();
                                    if (dDoubleValue > 0.0d) {
                                        c17491l.f34074l = (long) (dDoubleValue * 1000000.0d);
                                    }
                                }
                                Object obj2 = mapM4393l.get("keyframes");
                                if (obj2 instanceof Map) {
                                    Map map = (Map) obj2;
                                    Object obj3 = map.get("filepositions");
                                    Object obj4 = map.get("times");
                                    if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                        List list = (List) obj3;
                                        List list2 = (List) obj4;
                                        int size = list2.size();
                                        c17491l.f34076l = new long[size];
                                        c17491l.f34075l = new long[size];
                                        for (int i15 = 0; i15 < size; i15++) {
                                            Object obj5 = list.get(i15);
                                            Object obj6 = list2.get(i15);
                                            if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                c17491l.f34076l = new long[0];
                                                c17491l.f34075l = new long[0];
                                                break;
                                            }
                                            c17491l.f34076l[i15] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                            c17491l.f34075l[i15] = ((Double) obj5).longValue();
                                        }
                                    }
                                }
                            }
                            long j5 = c17491l.f34074l;
                            if (j5 != -9223372036854775807L) {
                                this.billing.tapsense(new C3762l(j5, c17491l.f34075l, c17491l.f34076l));
                                this.vip = true;
                            }
                        }
                        z3 = true;
                    } else {
                        if (!this.vip) {
                            this.billing.tapsense(new C9828l(-9223372036854775807L));
                            this.vip = true;
                        }
                        C17177l c17177l = this.metrica;
                        C13143l c13143lMopub3 = mopub(interfaceC10430l);
                        InterfaceC8979l interfaceC8979l2 = (InterfaceC8979l) c17177l.f833l;
                        if (c17177l.f33364l) {
                            c13143lMopub3.m3568throw(1);
                        } else {
                            int iSignatures4 = c13143lMopub3.signatures();
                            int i16 = (iSignatures4 >> 4) & 15;
                            c17177l.f33365l = i16;
                            if (i16 == 2) {
                                int i17 = C17177l.f33363l[(iSignatures4 >> 2) & 3];
                                C12984l c12984l2 = new C12984l();
                                c12984l2.remoteconfig = AbstractC3825l.vip("video/x-flv");
                                c12984l2.vip = AbstractC3825l.vip("audio/mpeg");
                                c12984l2.f25447throws = 1;
                                c12984l2.f25442package = i17;
                                AbstractC9029l.license(c12984l2, interfaceC8979l2);
                                c17177l.f33366l = true;
                            } else if (i16 == 7 || i16 == 8) {
                                String str = i16 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                C12984l c12984l3 = new C12984l();
                                c12984l3.remoteconfig = AbstractC3825l.vip("video/x-flv");
                                c12984l3.vip = AbstractC3825l.vip(str);
                                c12984l3.f25447throws = 1;
                                c12984l3.f25442package = 8000;
                                AbstractC9029l.license(c12984l3, interfaceC8979l2);
                                c17177l.f33366l = true;
                            } else if (i16 != 10) {
                                throw new C1427l("Audio format not supported: " + c17177l.f33365l);
                            }
                            c17177l.f33364l = true;
                        }
                        InterfaceC8979l interfaceC8979l3 = (InterfaceC8979l) c17177l.f833l;
                        if (c17177l.f33365l == 2) {
                            int iYandex = c13143lMopub3.yandex();
                            interfaceC8979l3.purchase(iYandex, c13143lMopub3);
                            ((InterfaceC8979l) c17177l.f833l).yandex(j2, 1, iYandex, 0, null);
                        } else {
                            int iSignatures5 = c13143lMopub3.signatures();
                            if (iSignatures5 == 0 && !c17177l.f33366l) {
                                int iYandex2 = c13143lMopub3.yandex();
                                byte[] bArr4 = new byte[iYandex2];
                                c13143lMopub3.firebase(0, iYandex2, bArr4);
                                Cimport cimportAdmob = AbstractC3234l.admob(new C5257l(bArr4, iYandex2), false);
                                C12984l c12984l4 = new C12984l();
                                c12984l4.remoteconfig = AbstractC3825l.vip("video/x-flv");
                                c12984l4.vip = AbstractC3825l.vip("audio/mp4a-latm");
                                c12984l4.isPro = cimportAdmob.yandex;
                                c12984l4.f25447throws = cimportAdmob.crashlytics;
                                c12984l4.f25442package = cimportAdmob.loadAd;
                                c12984l4.adcel = Collections.singletonList(bArr4);
                                AbstractC9029l.license(c12984l4, interfaceC8979l3);
                                c17177l.f33366l = true;
                            } else if (c17177l.f33365l != 10 || iSignatures5 == 1) {
                                int iYandex3 = c13143lMopub3.yandex();
                                interfaceC8979l3.purchase(iYandex3, c13143lMopub3);
                                ((InterfaceC8979l) c17177l.f833l).yandex(j2, 1, iYandex3, 0, null);
                            }
                            z = false;
                        }
                        z = true;
                    }
                    if (!this.admob && z) {
                        this.admob = true;
                        if (c17491l.f34074l == -9223372036854775807L) {
                            j3 = -this.remoteconfig;
                        } else {
                            j3 = 0;
                        }
                        this.subs = j3;
                    }
                    this.isPro = 4;
                    this.mopub = 2;
                    if (z3) {
                        return 0;
                    }
                }
                j2 = j;
                i = this.firebase;
                if (i == 8) {
                    int i18 = 4;
                    if (i != 9) {
                        if (i == 18) {
                        }
                        interfaceC10430l.remoteconfig(this.smaato);
                        z = false;
                        z3 = false;
                    } else {
                        if (i == 18) {
                        }
                        interfaceC10430l.remoteconfig(this.smaato);
                        z = false;
                        z3 = false;
                    }
                } else {
                    int i19 = 4;
                    if (i != 9) {
                        if (i == 18) {
                        }
                        interfaceC10430l.remoteconfig(this.smaato);
                        z = false;
                        z3 = false;
                    } else {
                        if (i == 18) {
                        }
                        interfaceC10430l.remoteconfig(this.smaato);
                        z = false;
                        z3 = false;
                    }
                }
                if (!this.admob) {
                    this.admob = true;
                    if (c17491l.f34074l == -9223372036854775807L) {
                        j3 = -this.remoteconfig;
                    } else {
                        j3 = 0;
                    }
                    this.subs = j3;
                }
                this.isPro = 4;
                this.mopub = 2;
                if (z3) {
                    return 0;
                }
            }
        }
    }

    public final C13143l mopub(InterfaceC10430l interfaceC10430l) {
        int i = this.smaato;
        C13143l c13143l = this.amazon;
        byte[] bArr = c13143l.yandex;
        if (i > bArr.length) {
            c13143l.m3565private(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            c13143l.m3562for(0);
        }
        c13143l.m3561extends(this.smaato);
        interfaceC10430l.readFully(c13143l.yandex, 0, this.smaato);
        return c13143l;
    }

    @Override // defpackage.InterfaceC14833l
    public final List purchase() {
        C9258l c9258l = AbstractC1186l.f3181l;
        return C13708l.f26763l;
    }

    @Override // defpackage.InterfaceC14833l
    public final void release() {
    }

    @Override // defpackage.InterfaceC14833l
    public final InterfaceC14833l yandex() {
        return this;
    }
}
