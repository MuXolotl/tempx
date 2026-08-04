package defpackage;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: lٍؕۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3297l implements InterfaceC14833l {
    public long admob;
    public final C8565l amazon;
    public InterfaceC2053l billing;
    public final boolean crashlytics;
    public C6189l firebase;
    public long isPro;
    public final C15380l loadAd;
    public int metrica;
    public C3735l mopub;
    public int purchase;
    public long remoteconfig;
    public int smaato;
    public boolean startapp;
    public C6189l[] subs;
    public long vip;
    public final C13143l yandex;

    public C3297l(int i, C8565l c8565l) {
        this.amazon = c8565l;
        this.crashlytics = (i & 1) == 0;
        this.yandex = new C13143l(12);
        this.loadAd = new C15380l(1);
        this.billing = new C2183l(6);
        this.subs = new C6189l[0];
        this.remoteconfig = -1L;
        this.vip = -1L;
        this.smaato = -1;
        this.admob = -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC14833l
    public final void amazon(long j, long j2) {
        this.isPro = -1L;
        this.firebase = null;
        for (C6189l c6189l : this.subs) {
            if (c6189l.firebase == 0) {
                c6189l.subs = 0;
            } else {
                c6189l.subs = c6189l.vip[AbstractC15323l.billing(c6189l.remoteconfig, j, true)];
            }
        }
        if (j != 0) {
            this.purchase = 6;
        } else if (this.subs.length == 0) {
            this.purchase = 0;
        } else {
            this.purchase = 3;
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final void billing(InterfaceC2053l interfaceC2053l) {
        this.purchase = 0;
        if (this.crashlytics) {
            interfaceC2053l = new C11919l(interfaceC2053l, this.amazon);
        }
        this.billing = interfaceC2053l;
        this.isPro = -1L;
    }

    @Override // defpackage.InterfaceC14833l
    public final boolean crashlytics(InterfaceC10430l interfaceC10430l) {
        C13143l c13143l = this.yandex;
        interfaceC10430l.yandex(0, 12, c13143l.yandex);
        c13143l.m3562for(0);
        if (c13143l.metrica() != 1179011410) {
            return false;
        }
        c13143l.m3568throw(4);
        return c13143l.metrica() == 541677121;
    }

    /* JADX WARN: Code duplicated, block: B:178:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x0105  */
    /* JADX WARN: Code duplicated, block: B:67:0x010e  */
    @Override // defpackage.InterfaceC14833l
    public final int loadAd(InterfaceC10430l interfaceC10430l, C1014l c1014l) throws C17655l {
        boolean z;
        int i;
        C6189l c6189l;
        long j;
        int i2;
        C6189l c6189l2;
        int i3 = 0;
        if (this.isPro != -1) {
            long position = interfaceC10430l.getPosition();
            long j2 = this.isPro;
            if (j2 < position || j2 > 262144 + position) {
                c1014l.f2761l = j2;
                z = true;
            } else {
                interfaceC10430l.remoteconfig((int) (j2 - position));
                z = false;
            }
        } else {
            z = false;
        }
        this.isPro = -1L;
        if (z) {
            return 1;
        }
        int i4 = this.purchase;
        int i5 = 4;
        C6189l c6189l3 = null;
        C15380l c15380l = this.loadAd;
        int i6 = 2;
        C13143l c13143l = this.yandex;
        switch (i4) {
            case 0:
                if (!crashlytics(interfaceC10430l)) {
                    throw C17655l.yandex(null, "AVI Header List not found");
                }
                interfaceC10430l.remoteconfig(12);
                this.purchase = 1;
                return 0;
            case 1:
                interfaceC10430l.readFully(c13143l.yandex, 0, 12);
                c13143l.m3562for(0);
                c15380l.getClass();
                c15380l.loadAd = c13143l.metrica();
                c15380l.crashlytics = c13143l.metrica();
                c15380l.amazon = 0;
                if (c15380l.loadAd != 1414744396) {
                    throw C17655l.yandex(null, "LIST expected, found: " + c15380l.loadAd);
                }
                int iMetrica = c13143l.metrica();
                c15380l.amazon = iMetrica;
                if (iMetrica == 1819436136) {
                    this.smaato = c15380l.crashlytics;
                    this.purchase = 2;
                    return 0;
                }
                throw C17655l.yandex(null, "hdrl expected, found: " + c15380l.amazon);
            case 2:
                int i7 = this.smaato - 4;
                C13143l c13143l2 = new C13143l(i7);
                interfaceC10430l.readFully(c13143l2.yandex, 0, i7);
                C15292l c15292lCrashlytics = C15292l.crashlytics(1819436136, c13143l2);
                int i8 = c15292lCrashlytics.loadAd;
                if (i8 != 1819436136) {
                    throw C17655l.yandex(null, "Unexpected header list type " + i8);
                }
                C3735l c3735l = (C3735l) c15292lCrashlytics.loadAd(C3735l.class);
                if (c3735l == null) {
                    throw C17655l.yandex(null, "AviHeader not found");
                }
                this.mopub = c3735l;
                this.admob = ((long) c3735l.crashlytics) * ((long) c3735l.yandex);
                ArrayList arrayList = new ArrayList();
                C9258l c9258lListIterator = c15292lCrashlytics.yandex.listIterator(0);
                int i9 = 0;
                while (c9258lListIterator.hasNext()) {
                    InterfaceC15967l interfaceC15967l = (InterfaceC15967l) c9258lListIterator.next();
                    if (interfaceC15967l.yandex() == 1819440243) {
                        C15292l c15292l = (C15292l) interfaceC15967l;
                        int i10 = i9 + 1;
                        C18019l c18019l = (C18019l) c15292l.loadAd(C18019l.class);
                        C13837l c13837l = (C13837l) c15292l.loadAd(C13837l.class);
                        if (c18019l == null) {
                            AbstractC6427l.vip("AviExtractor", "Missing Stream Header");
                        } else {
                            if (c13837l == null) {
                                AbstractC6427l.vip("AviExtractor", "Missing Stream Format");
                            } else {
                                long j3 = c18019l.amazon;
                                long j4 = ((long) c18019l.loadAd) * 1000000;
                                i = i10;
                                long j5 = c18019l.crashlytics;
                                String str = AbstractC15323l.yandex;
                                long jM3970import = AbstractC15323l.m3970import(j3, j4, j5, RoundingMode.DOWN);
                                C5978l c5978l = c13837l.yandex;
                                C12984l c12984lYandex = c5978l.yandex();
                                c12984lYandex.yandex = Integer.toString(i9);
                                int i11 = c18019l.purchase;
                                if (i11 != 0) {
                                    c12984lYandex.metrica = i11;
                                }
                                C10605l c10605l = (C10605l) c15292l.loadAd(C10605l.class);
                                if (c10605l != null) {
                                    c12984lYandex.loadAd = c10605l.yandex;
                                }
                                int iAdmob = AbstractC3825l.admob(c5978l.metrica);
                                if (iAdmob == 1 || iAdmob == i6) {
                                    InterfaceC8979l interfaceC8979lStartapp = this.billing.startapp(i9, iAdmob);
                                    interfaceC8979lStartapp.mopub(new C5978l(c12984lYandex));
                                    interfaceC8979lStartapp.amazon(jM3970import);
                                    this.admob = Math.max(this.admob, jM3970import);
                                    c6189l = new C6189l(i9, c18019l, interfaceC8979lStartapp);
                                } else {
                                    c6189l = null;
                                }
                            }
                            if (c6189l != null) {
                                arrayList.add(c6189l);
                            }
                            i9 = i;
                        }
                        i = i10;
                        c6189l = null;
                        if (c6189l != null) {
                            arrayList.add(c6189l);
                        }
                        i9 = i;
                    }
                    i3 = 0;
                    i6 = 2;
                }
                int i12 = i3;
                this.subs = (C6189l[]) arrayList.toArray(new C6189l[i12]);
                this.billing.firebase();
                this.purchase = 3;
                return i12;
            case 3:
                if (this.remoteconfig != -1) {
                    long position2 = interfaceC10430l.getPosition();
                    long j6 = this.remoteconfig;
                    if (position2 != j6) {
                        this.isPro = j6;
                        return 0;
                    }
                }
                interfaceC10430l.yandex(0, 12, c13143l.yandex);
                interfaceC10430l.smaato();
                c13143l.m3562for(0);
                c15380l.getClass();
                c15380l.loadAd = c13143l.metrica();
                c15380l.crashlytics = c13143l.metrica();
                c15380l.amazon = 0;
                int iMetrica2 = c13143l.metrica();
                int i13 = c15380l.loadAd;
                if (i13 == 1179011410) {
                    interfaceC10430l.remoteconfig(12);
                    return 0;
                }
                if (i13 != 1414744396 || iMetrica2 != 1769369453) {
                    this.isPro = interfaceC10430l.getPosition() + ((long) c15380l.crashlytics) + 8;
                    return 0;
                }
                long position3 = interfaceC10430l.getPosition();
                this.remoteconfig = position3;
                this.vip = position3 + ((long) c15380l.crashlytics) + 8;
                if (!this.startapp) {
                    C3735l c3735l2 = this.mopub;
                    c3735l2.getClass();
                    if ((c3735l2.loadAd & 16) == 16) {
                        this.purchase = 4;
                        this.isPro = this.vip;
                        return 0;
                    }
                    this.billing.tapsense(new C9828l(this.admob));
                    this.startapp = true;
                }
                this.isPro = interfaceC10430l.getPosition() + 12;
                this.purchase = 6;
                return 0;
            case 4:
                interfaceC10430l.readFully(c13143l.yandex, 0, 8);
                c13143l.m3562for(0);
                int iMetrica3 = c13143l.metrica();
                int iMetrica4 = c13143l.metrica();
                if (iMetrica3 != 829973609) {
                    this.isPro = interfaceC10430l.getPosition() + ((long) iMetrica4);
                    return 0;
                }
                this.purchase = 5;
                this.metrica = iMetrica4;
                return 0;
            case 5:
                C13143l c13143l3 = new C13143l(this.metrica);
                interfaceC10430l.readFully(c13143l3.yandex, 0, this.metrica);
                if (c13143l3.yandex() < 16) {
                    j = 0;
                } else {
                    int i14 = c13143l3.loadAd;
                    c13143l3.m3568throw(8);
                    long jMetrica = c13143l3.metrica();
                    long j7 = this.remoteconfig;
                    j = jMetrica > j7 ? 0L : j7 + 8;
                    c13143l3.m3562for(i14);
                }
                while (c13143l3.yandex() >= 16) {
                    int iMetrica5 = c13143l3.metrica();
                    int iMetrica6 = c13143l3.metrica();
                    long jMetrica2 = ((long) c13143l3.metrica()) + j;
                    c13143l3.m3568throw(i5);
                    C6189l[] c6189lArr = this.subs;
                    int length = c6189lArr.length;
                    int i15 = 0;
                    while (true) {
                        if (i15 < length) {
                            c6189l2 = c6189lArr[i15];
                            if (c6189l2.crashlytics != iMetrica5 && c6189l2.amazon != iMetrica5) {
                                i15++;
                            }
                        } else {
                            c6189l2 = null;
                        }
                    }
                    if (c6189l2 != null) {
                        boolean z2 = (iMetrica6 & 16) == 16;
                        if (c6189l2.smaato == -1) {
                            c6189l2.smaato = jMetrica2;
                        }
                        if (z2) {
                            if (c6189l2.firebase == c6189l2.vip.length) {
                                long[] jArr = c6189l2.remoteconfig;
                                c6189l2.remoteconfig = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = c6189l2.vip;
                                c6189l2.vip = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = c6189l2.remoteconfig;
                            int i16 = c6189l2.firebase;
                            jArr2[i16] = jMetrica2;
                            c6189l2.vip[i16] = c6189l2.isPro;
                            c6189l2.firebase = i16 + 1;
                        }
                        c6189l2.isPro++;
                    }
                    i5 = 4;
                }
                for (C6189l c6189l4 : this.subs) {
                    c6189l4.remoteconfig = Arrays.copyOf(c6189l4.remoteconfig, c6189l4.firebase);
                    c6189l4.vip = Arrays.copyOf(c6189l4.vip, c6189l4.firebase);
                    if ((c6189l4.crashlytics & 1651965952) == 1651965952 && c6189l4.yandex.billing != 0 && (i2 = c6189l4.firebase) > 0) {
                        c6189l4.billing = i2;
                    }
                }
                this.startapp = true;
                int length2 = this.subs.length;
                InterfaceC2053l interfaceC2053l = this.billing;
                long j8 = this.admob;
                if (length2 == 0) {
                    interfaceC2053l.tapsense(new C9828l(j8));
                } else {
                    interfaceC2053l.tapsense(new C9828l(this, j8, 0));
                }
                this.purchase = 6;
                this.isPro = this.remoteconfig;
                return 0;
            case 6:
                if (interfaceC10430l.getPosition() >= this.vip) {
                    return -1;
                }
                C6189l c6189l5 = this.firebase;
                if (c6189l5 != null) {
                    int i17 = c6189l5.admob;
                    int iBilling = i17 - c6189l5.loadAd.billing(interfaceC10430l, i17, false);
                    c6189l5.admob = iBilling;
                    boolean z3 = iBilling == 0;
                    if (z3) {
                        if (c6189l5.mopub > 0) {
                            InterfaceC8979l interfaceC8979l = c6189l5.loadAd;
                            int i18 = c6189l5.subs;
                            interfaceC8979l.yandex((c6189l5.purchase * ((long) i18)) / ((long) c6189l5.billing), Arrays.binarySearch(c6189l5.vip, i18) >= 0 ? 1 : 0, c6189l5.mopub, 0, null);
                        }
                        c6189l5.subs++;
                    }
                    if (z3) {
                        this.firebase = null;
                    }
                    return 0;
                }
                if ((interfaceC10430l.getPosition() & 1) == 1) {
                    interfaceC10430l.remoteconfig(1);
                }
                interfaceC10430l.yandex(0, 12, c13143l.yandex);
                c13143l.m3562for(0);
                int iMetrica7 = c13143l.metrica();
                if (iMetrica7 == 1414744396) {
                    c13143l.m3562for(8);
                    interfaceC10430l.remoteconfig(c13143l.metrica() == 1769369453 ? 12 : 8);
                    interfaceC10430l.smaato();
                    return 0;
                }
                int iMetrica8 = c13143l.metrica();
                if (iMetrica7 == 1263424842) {
                    this.isPro = interfaceC10430l.getPosition() + ((long) iMetrica8) + 8;
                    return 0;
                }
                interfaceC10430l.remoteconfig(8);
                interfaceC10430l.smaato();
                for (C6189l c6189l6 : this.subs) {
                    if (c6189l6.crashlytics == iMetrica7 || c6189l6.amazon == iMetrica7) {
                        c6189l3 = c6189l6;
                        if (c6189l3 == null) {
                            this.isPro = interfaceC10430l.getPosition() + ((long) iMetrica8);
                            return 0;
                        }
                        c6189l3.mopub = iMetrica8;
                        c6189l3.admob = iMetrica8;
                        this.firebase = c6189l3;
                        return 0;
                    }
                }
                if (c6189l3 == null) {
                    this.isPro = interfaceC10430l.getPosition() + ((long) iMetrica8);
                    return 0;
                }
                c6189l3.mopub = iMetrica8;
                c6189l3.admob = iMetrica8;
                this.firebase = c6189l3;
                return 0;
            default:
                C11586l.yandex();
                return 0;
        }
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
