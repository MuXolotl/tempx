package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l٘ٝؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18062l implements InterfaceC17094l {
    public final boolean crashlytics;
    public C12666l firebase;
    public InterfaceC8979l isPro;
    public final boolean loadAd;
    public long mopub;
    public boolean smaato;
    public String subs;
    public boolean vip;
    public final C3250l yandex;
    public final boolean[] admob = new boolean[3];
    public final C5453l amazon = new C5453l(7);
    public final C5453l purchase = new C5453l(8);
    public final C5453l billing = new C5453l(6);
    public long remoteconfig = -9223372036854775807L;
    public final C13143l metrica = new C13143l();

    public C18062l(C3250l c3250l, boolean z, boolean z2) {
        this.yandex = c3250l;
        this.loadAd = z;
        this.crashlytics = z2;
    }

    @Override // defpackage.InterfaceC17094l
    public final void admob(boolean z) {
        this.isPro.getClass();
        String str = AbstractC15323l.yandex;
        if (z) {
            this.yandex.amazon.subs(0);
            yandex(0, 0, this.mopub, this.remoteconfig);
            crashlytics(9, this.mopub, this.remoteconfig);
            yandex(0, 0, this.mopub, this.remoteconfig);
        }
    }

    @Override // defpackage.InterfaceC17094l
    public final void billing() {
        this.mopub = 0L;
        this.vip = false;
        this.remoteconfig = -9223372036854775807L;
        AbstractC16763l.purchase(this.admob);
        this.amazon.billing();
        this.purchase.billing();
        this.billing.billing();
        this.yandex.amazon.subs(0);
        C12666l c12666l = this.firebase;
        if (c12666l != null) {
            c12666l.firebase = false;
            c12666l.metrica = false;
            C13715l c13715l = c12666l.vip;
            c13715l.loadAd = false;
            c13715l.yandex = false;
        }
    }

    public final void crashlytics(int i, long j, long j2) {
        if (!this.smaato || this.firebase.crashlytics) {
            this.amazon.mopub(i);
            this.purchase.mopub(i);
        }
        this.billing.mopub(i);
        C12666l c12666l = this.firebase;
        boolean z = this.vip;
        c12666l.subs = i;
        c12666l.smaato = j2;
        c12666l.isPro = j;
        c12666l.subscription = z;
        if (!c12666l.loadAd || i != 1) {
            if (!c12666l.crashlytics) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        C13715l c13715l = c12666l.remoteconfig;
        c12666l.remoteconfig = c12666l.vip;
        c12666l.vip = c13715l;
        c13715l.loadAd = false;
        c13715l.yandex = false;
        c12666l.admob = 0;
        c12666l.firebase = true;
    }

    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0104  */
    /* JADX WARN: Code duplicated, block: B:59:0x0106  */
    /* JADX WARN: Code duplicated, block: B:61:0x0109  */
    /* JADX WARN: Code duplicated, block: B:64:0x0110  */
    /* JADX WARN: Code duplicated, block: B:65:0x0115  */
    /* JADX WARN: Code duplicated, block: B:68:0x011a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0121  */
    /* JADX WARN: Code duplicated, block: B:81:0x013b  */
    public final void loadAd(int i, int i2, byte[] bArr) {
        boolean zAmazon;
        boolean zAmazon2;
        boolean z;
        boolean z2;
        int iBilling;
        int i3;
        int iPurchase;
        int i4;
        int iMopub;
        int iMopub2;
        if (!this.smaato || this.firebase.crashlytics) {
            this.amazon.yandex(i, i2, bArr);
            this.purchase.yandex(i, i2, bArr);
        }
        this.billing.yandex(i, i2, bArr);
        C12666l c12666l = this.firebase;
        SparseArray sparseArray = c12666l.purchase;
        C7200l c7200l = c12666l.billing;
        if (c12666l.firebase) {
            int i5 = i2 - i;
            byte[] bArr2 = c12666l.mopub;
            int length = bArr2.length;
            int i6 = c12666l.admob + i5;
            if (length < i6) {
                c12666l.mopub = Arrays.copyOf(bArr2, i6 * 2);
            }
            System.arraycopy(bArr, i, c12666l.mopub, c12666l.admob, i5);
            int i7 = c12666l.admob + i5;
            c12666l.admob = i7;
            c7200l.purchase = c12666l.mopub;
            c7200l.loadAd = 0;
            c7200l.crashlytics = 0;
            c7200l.yandex = i7;
            c7200l.amazon = 0;
            c7200l.yandex();
            if (c7200l.loadAd(8)) {
                c7200l.subs();
                int iPurchase2 = c7200l.purchase(2);
                c7200l.isPro(5);
                if (c7200l.crashlytics()) {
                    c7200l.billing();
                    if (c7200l.crashlytics()) {
                        int iBilling2 = c7200l.billing();
                        if (!c12666l.crashlytics) {
                            c12666l.firebase = false;
                            C13715l c13715l = c12666l.vip;
                            c13715l.purchase = iBilling2;
                            c13715l.loadAd = true;
                            return;
                        }
                        if (c7200l.crashlytics()) {
                            int iBilling3 = c7200l.billing();
                            if (sparseArray.indexOfKey(iBilling3) < 0) {
                                c12666l.firebase = false;
                                return;
                            }
                            C13230l c13230l = (C13230l) sparseArray.get(iBilling3);
                            SparseArray sparseArray2 = c12666l.amazon;
                            int i8 = c13230l.yandex;
                            boolean z3 = c13230l.loadAd;
                            C15055l c15055l = (C15055l) sparseArray2.get(i8);
                            boolean z4 = c15055l.isPro;
                            int i9 = c15055l.vip;
                            int i10 = c15055l.smaato;
                            if (z4) {
                                if (!c7200l.loadAd(2)) {
                                    return;
                                } else {
                                    c7200l.isPro(2);
                                }
                            }
                            if (c7200l.loadAd(i10)) {
                                int iPurchase3 = c7200l.purchase(i10);
                                if (!c15055l.firebase) {
                                    if (c7200l.loadAd(1)) {
                                        zAmazon = c7200l.amazon();
                                        if (!zAmazon) {
                                            zAmazon2 = false;
                                        } else {
                                            if (!c7200l.loadAd(1)) {
                                                return;
                                            }
                                            zAmazon2 = c7200l.amazon();
                                            z = true;
                                        }
                                        if (c12666l.subs == 5) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            iBilling = 0;
                                        } else if (!c7200l.crashlytics()) {
                                            return;
                                        } else {
                                            iBilling = c7200l.billing();
                                        }
                                        i3 = c15055l.remoteconfig;
                                        if (i3 != 0) {
                                            if (c7200l.loadAd(i9)) {
                                                iPurchase = c7200l.purchase(i9);
                                                if (!z3 && !zAmazon) {
                                                    if (!c7200l.crashlytics()) {
                                                        return;
                                                    }
                                                    iMopub2 = c7200l.mopub();
                                                    i4 = 0;
                                                }
                                                iMopub = 0;
                                                C13715l c13715l2 = c12666l.vip;
                                                c13715l2.crashlytics = c15055l;
                                                c13715l2.amazon = iPurchase2;
                                                c13715l2.purchase = iBilling2;
                                                c13715l2.billing = iPurchase3;
                                                c13715l2.mopub = iBilling3;
                                                c13715l2.admob = zAmazon;
                                                c13715l2.subs = z;
                                                c13715l2.isPro = zAmazon2;
                                                c13715l2.firebase = z2;
                                                c13715l2.smaato = iBilling;
                                                c13715l2.remoteconfig = iPurchase;
                                                c13715l2.vip = iMopub2;
                                                c13715l2.metrica = i4;
                                                c13715l2.startapp = iMopub;
                                                c13715l2.yandex = true;
                                                c13715l2.loadAd = true;
                                                c12666l.firebase = false;
                                            }
                                            return;
                                        }
                                        if (i3 == 1 || c15055l.metrica) {
                                            iPurchase = 0;
                                        } else {
                                            if (!c7200l.crashlytics()) {
                                                return;
                                            }
                                            int iMopub3 = c7200l.mopub();
                                            if (!z3 || zAmazon) {
                                                i4 = iMopub3;
                                                iPurchase = 0;
                                                iMopub2 = 0;
                                                iMopub = 0;
                                            } else {
                                                if (!c7200l.crashlytics()) {
                                                    return;
                                                }
                                                iMopub = c7200l.mopub();
                                                iMopub2 = 0;
                                                i4 = iMopub3;
                                                iPurchase = 0;
                                            }
                                        }
                                        C13715l c13715l3 = c12666l.vip;
                                        c13715l3.crashlytics = c15055l;
                                        c13715l3.amazon = iPurchase2;
                                        c13715l3.purchase = iBilling2;
                                        c13715l3.billing = iPurchase3;
                                        c13715l3.mopub = iBilling3;
                                        c13715l3.admob = zAmazon;
                                        c13715l3.subs = z;
                                        c13715l3.isPro = zAmazon2;
                                        c13715l3.firebase = z2;
                                        c13715l3.smaato = iBilling;
                                        c13715l3.remoteconfig = iPurchase;
                                        c13715l3.vip = iMopub2;
                                        c13715l3.metrica = i4;
                                        c13715l3.startapp = iMopub;
                                        c13715l3.yandex = true;
                                        c13715l3.loadAd = true;
                                        c12666l.firebase = false;
                                        i4 = 0;
                                        iMopub2 = 0;
                                        iMopub = 0;
                                        C13715l c13715l4 = c12666l.vip;
                                        c13715l4.crashlytics = c15055l;
                                        c13715l4.amazon = iPurchase2;
                                        c13715l4.purchase = iBilling2;
                                        c13715l4.billing = iPurchase3;
                                        c13715l4.mopub = iBilling3;
                                        c13715l4.admob = zAmazon;
                                        c13715l4.subs = z;
                                        c13715l4.isPro = zAmazon2;
                                        c13715l4.firebase = z2;
                                        c13715l4.smaato = iBilling;
                                        c13715l4.remoteconfig = iPurchase;
                                        c13715l4.vip = iMopub2;
                                        c13715l4.metrica = i4;
                                        c13715l4.startapp = iMopub;
                                        c13715l4.yandex = true;
                                        c13715l4.loadAd = true;
                                        c12666l.firebase = false;
                                    }
                                    return;
                                }
                                zAmazon = false;
                                zAmazon2 = false;
                                z = zAmazon2;
                                if (c12666l.subs == 5) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    iBilling = 0;
                                } else if (!c7200l.crashlytics()) {
                                    return;
                                } else {
                                    iBilling = c7200l.billing();
                                }
                                i3 = c15055l.remoteconfig;
                                if (i3 != 0) {
                                    if (i3 == 1) {
                                    }
                                    iPurchase = 0;
                                } else {
                                    if (c7200l.loadAd(i9)) {
                                        return;
                                    }
                                    iPurchase = c7200l.purchase(i9);
                                    if (!z3) {
                                    }
                                }
                                i4 = 0;
                                iMopub2 = 0;
                                iMopub = 0;
                                C13715l c13715l5 = c12666l.vip;
                                c13715l5.crashlytics = c15055l;
                                c13715l5.amazon = iPurchase2;
                                c13715l5.purchase = iBilling2;
                                c13715l5.billing = iPurchase3;
                                c13715l5.mopub = iBilling3;
                                c13715l5.admob = zAmazon;
                                c13715l5.subs = z;
                                c13715l5.isPro = zAmazon2;
                                c13715l5.firebase = z2;
                                c13715l5.smaato = iBilling;
                                c13715l5.remoteconfig = iPurchase;
                                c13715l5.vip = iMopub2;
                                c13715l5.metrica = i4;
                                c13715l5.startapp = iMopub;
                                c13715l5.yandex = true;
                                c13715l5.loadAd = true;
                                c12666l.firebase = false;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.InterfaceC17094l
    public final void mopub(InterfaceC2053l interfaceC2053l, Cstatic cstatic) {
        cstatic.yandex();
        cstatic.amazon();
        this.subs = (String) cstatic.purchase;
        cstatic.amazon();
        InterfaceC8979l interfaceC8979lStartapp = interfaceC2053l.startapp(cstatic.crashlytics, 2);
        this.isPro = interfaceC8979lStartapp;
        this.firebase = new C12666l(interfaceC8979lStartapp, this.loadAd, this.crashlytics);
        this.yandex.loadAd(interfaceC2053l, cstatic);
    }

    @Override // defpackage.InterfaceC17094l
    public final void purchase(C13143l c13143l) {
        int i;
        this.isPro.getClass();
        String str = AbstractC15323l.yandex;
        int i2 = c13143l.loadAd;
        int i3 = c13143l.crashlytics;
        byte[] bArr = c13143l.yandex;
        this.mopub += (long) c13143l.yandex();
        this.isPro.purchase(c13143l.yandex(), c13143l);
        while (true) {
            int iAdmob = AbstractC16763l.admob(bArr, i2, i3, this.admob);
            if (iAdmob == i3) {
                this.loadAd(i2, i3, bArr);
                return;
            }
            int i4 = bArr[iAdmob + 3] & 31;
            if (iAdmob <= 0 || bArr[iAdmob - 1] != 0) {
                i = 3;
            } else {
                iAdmob--;
                i = 4;
            }
            int i5 = iAdmob - i2;
            if (i5 > 0) {
                this.loadAd(i2, iAdmob, bArr);
            }
            int i6 = i3 - iAdmob;
            long j = this.mopub - ((long) i6);
            C18062l c18062l = this;
            c18062l.yandex(i6, i5 < 0 ? -i5 : 0, j, this.remoteconfig);
            c18062l.crashlytics(i4, j, c18062l.remoteconfig);
            i2 = iAdmob + i;
            this = c18062l;
        }
    }

    @Override // defpackage.InterfaceC17094l
    public final void subs(int i, long j) {
        this.remoteconfig = j;
        this.vip = ((i & 2) != 0) | this.vip;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0271  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0206  */
    /* JADX WARN: Code duplicated, block: B:69:0x0208  */
    /* JADX WARN: Code duplicated, block: B:73:0x021e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0225  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
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
    public final void yandex(int i, int i2, long j, long j2) {
        int i3;
        boolean z;
        long j3;
        int i4;
        long j4;
        long j5;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z6;
        C1080l c1080l = this.yandex.amazon;
        if (!this.smaato || this.firebase.crashlytics) {
            C5453l c5453l = this.amazon;
            c5453l.amazon(i2);
            C5453l c5453l2 = this.purchase;
            c5453l2.amazon(i2);
            boolean z7 = this.smaato;
            boolean z8 = c5453l.purchase;
            if (z7) {
                i3 = 2;
                z = false;
                if (z8) {
                    C15055l c15055lTapsense = AbstractC16763l.tapsense(3, c5453l.crashlytics, (byte[]) c5453l.billing);
                    c1080l.m801throw(c15055lTapsense.subscription);
                    this.firebase.amazon.append(c15055lTapsense.amazon, c15055lTapsense);
                    c5453l.billing();
                } else if (c5453l2.purchase) {
                    C7200l c7200l = new C7200l((byte[]) c5453l2.billing, 4, c5453l2.crashlytics);
                    int iBilling = c7200l.billing();
                    int iBilling2 = c7200l.billing();
                    c7200l.subs();
                    this.firebase.purchase.append(iBilling, new C13230l(iBilling, iBilling2, c7200l.amazon()));
                    c5453l2.billing();
                }
            } else if (z8 && c5453l2.purchase) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf((byte[]) c5453l.billing, c5453l.crashlytics));
                arrayList.add(Arrays.copyOf((byte[]) c5453l2.billing, c5453l2.crashlytics));
                C15055l c15055lTapsense2 = AbstractC16763l.tapsense(3, c5453l.crashlytics, (byte[]) c5453l.billing);
                int i9 = c15055lTapsense2.subscription;
                C7200l c7200l2 = new C7200l((byte[]) c5453l2.billing, 4, c5453l2.crashlytics);
                int iBilling3 = c7200l2.billing();
                int iBilling4 = c7200l2.billing();
                c7200l2.subs();
                i3 = 2;
                C13230l c13230l = new C13230l(iBilling3, iBilling4, c7200l2.amazon());
                int i10 = c15055lTapsense2.yandex;
                int i11 = c15055lTapsense2.loadAd;
                z = false;
                int i12 = c15055lTapsense2.crashlytics;
                byte[] bArr = AbstractC14501l.yandex;
                String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
                InterfaceC8979l interfaceC8979l = this.isPro;
                C12984l c12984l = new C12984l();
                c12984l.yandex = this.subs;
                c12984l.remoteconfig = AbstractC3825l.vip("video/mp2t");
                c12984l.vip = AbstractC3825l.vip("video/avc");
                c12984l.isPro = str;
                c12984l.Signature = c15055lTapsense2.purchase;
                c12984l.license = c15055lTapsense2.billing;
                c12984l.appmetrica = new C1591l(c15055lTapsense2.startapp, c15055lTapsense2.adcel, c15055lTapsense2.ads, null, c15055lTapsense2.admob + 8, c15055lTapsense2.subs + 8);
                c12984l.signatures = c15055lTapsense2.mopub;
                c12984l.adcel = arrayList;
                c12984l.startapp = i9;
                AbstractC9029l.license(c12984l, interfaceC8979l);
                this.smaato = true;
                c1080l.m801throw(i9);
                this.firebase.amazon.append(c15055lTapsense2.amazon, c15055lTapsense2);
                this.firebase.purchase.append(iBilling3, c13230l);
                c5453l.billing();
                c5453l2.billing();
            } else {
                i3 = 2;
                z = false;
            }
        } else {
            i3 = 2;
            z = false;
        }
        C5453l c5453l3 = this.billing;
        if (c5453l3.amazon(i2)) {
            int iLicense = AbstractC16763l.license(c5453l3.crashlytics, (byte[]) c5453l3.billing);
            byte[] bArr2 = (byte[]) c5453l3.billing;
            C13143l c13143l = this.metrica;
            c13143l.m3565private(iLicense, bArr2);
            c13143l.m3562for(4);
            c1080l.amazon(j2, c13143l);
        }
        C12666l c12666l = this.firebase;
        boolean z9 = this.smaato;
        if (c12666l.subs == 9) {
            if (z9 && c12666l.metrica) {
                j3 = c12666l.isPro;
                i4 = i + ((int) (j - j3));
                j4 = c12666l.adcel;
                if (j4 != -9223372036854775807L) {
                    j5 = c12666l.startapp;
                    if (j3 != j5) {
                        c12666l.yandex.yandex(j4, c12666l.ads ? 1 : 0, (int) (j3 - j5), i4, null);
                    }
                }
            }
            c12666l.startapp = c12666l.isPro;
            c12666l.adcel = c12666l.smaato;
            c12666l.ads = z;
            c12666l.metrica = true;
        } else if (c12666l.crashlytics) {
            C13715l c13715l = c12666l.vip;
            C13715l c13715l2 = c12666l.remoteconfig;
            if (c13715l.yandex) {
                if (c13715l2.yandex) {
                    C15055l c15055l = c13715l.crashlytics;
                    c15055l.getClass();
                    C15055l c15055l2 = c13715l2.crashlytics;
                    c15055l2.getClass();
                    int i13 = c15055l2.remoteconfig;
                    if (c13715l.billing != c13715l2.billing || c13715l.mopub != c13715l2.mopub || c13715l.admob != c13715l2.admob || ((c13715l.subs && c13715l2.subs && c13715l.isPro != c13715l2.isPro) || (((i6 = c13715l.amazon) != (i7 = c13715l2.amazon) && (i6 == 0 || i7 == 0)) || (((i8 = c15055l.remoteconfig) == 0 && i13 == 0 && (c13715l.remoteconfig != c13715l2.remoteconfig || c13715l.vip != c13715l2.vip)) || ((i8 == 1 && i13 == 1 && (c13715l.metrica != c13715l2.metrica || c13715l.startapp != c13715l2.startapp)) || (z6 = c13715l.firebase) != c13715l2.firebase || (z6 && c13715l.smaato != c13715l2.smaato)))))) {
                        if (z9) {
                            j3 = c12666l.isPro;
                            i4 = i + ((int) (j - j3));
                            j4 = c12666l.adcel;
                            if (j4 != -9223372036854775807L) {
                                j5 = c12666l.startapp;
                                if (j3 != j5) {
                                    c12666l.yandex.yandex(j4, c12666l.ads ? 1 : 0, (int) (j3 - j5), i4, null);
                                }
                            }
                        }
                        c12666l.startapp = c12666l.isPro;
                        c12666l.adcel = c12666l.smaato;
                        c12666l.ads = z;
                        c12666l.metrica = true;
                    }
                } else {
                    if (z9) {
                        j3 = c12666l.isPro;
                        i4 = i + ((int) (j - j3));
                        j4 = c12666l.adcel;
                        if (j4 != -9223372036854775807L) {
                            j5 = c12666l.startapp;
                            if (j3 != j5) {
                                c12666l.yandex.yandex(j4, c12666l.ads ? 1 : 0, (int) (j3 - j5), i4, null);
                            }
                        }
                    }
                    c12666l.startapp = c12666l.isPro;
                    c12666l.adcel = c12666l.smaato;
                    c12666l.ads = z;
                    c12666l.metrica = true;
                }
            }
        }
        if (c12666l.loadAd) {
            C13715l c13715l3 = c12666l.vip;
            z2 = c13715l3.loadAd && ((i5 = c13715l3.purchase) == 7 || i5 == i3);
        } else {
            z2 = c12666l.subscription;
        }
        boolean z10 = c12666l.ads;
        int i14 = c12666l.subs;
        if (i14 != 5) {
            if (z2) {
                z3 = true;
                if (i14 == 1) {
                }
                z5 = z10 | z4;
                c12666l.ads = z5;
                c12666l.subs = 24;
                if (z5) {
                    this.vip = false;
                }
            }
            z4 = false;
            z5 = z10 | z4;
            c12666l.ads = z5;
            c12666l.subs = 24;
            if (z5) {
                this.vip = false;
            }
        }
        z3 = true;
        z4 = z3;
        z5 = z10 | z4;
        c12666l.ads = z5;
        c12666l.subs = 24;
        if (z5) {
            this.vip = false;
        }
    }
}
