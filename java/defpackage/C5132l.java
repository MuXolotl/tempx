package defpackage;

import java.util.Arrays;
import java.util.Collections;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؗۙٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5132l implements InterfaceC17094l {
    public static final byte[] ad = {73, 68, 51};
    public int adcel;
    public InterfaceC8979l admob;
    public boolean ads;
    public final String amazon;
    public final String billing;
    public InterfaceC8979l license;
    public String mopub;
    public long pro;
    public final int purchase;
    public boolean remoteconfig;
    public InterfaceC8979l subs;
    public int tapsense;
    public boolean vip;
    public final boolean yandex;
    public final C5257l loadAd = new C5257l(new byte[7], 7);
    public final C13143l crashlytics = new C13143l(Arrays.copyOf(ad, 10));
    public int metrica = -1;
    public int startapp = -1;
    public long subscription = -9223372036854775807L;
    public long Signature = -9223372036854775807L;
    public int isPro = 0;
    public int firebase = 0;
    public int smaato = PSKKeyManager.MAX_KEY_LENGTH_BYTES;

    public C5132l(int i, String str, String str2, boolean z) {
        this.yandex = z;
        this.amazon = str;
        this.purchase = i;
        this.billing = str2;
    }

    @Override // defpackage.InterfaceC17094l
    public final void billing() {
        this.Signature = -9223372036854775807L;
        this.vip = false;
        this.isPro = 0;
        this.firebase = 0;
        this.smaato = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }

    @Override // defpackage.InterfaceC17094l
    public final void mopub(InterfaceC2053l interfaceC2053l, Cstatic cstatic) {
        cstatic.yandex();
        cstatic.amazon();
        this.mopub = (String) cstatic.purchase;
        cstatic.amazon();
        InterfaceC8979l interfaceC8979lStartapp = interfaceC2053l.startapp(cstatic.crashlytics, 1);
        this.admob = interfaceC8979lStartapp;
        this.license = interfaceC8979lStartapp;
        if (!this.yandex) {
            this.subs = new C6120l();
            return;
        }
        cstatic.yandex();
        cstatic.amazon();
        InterfaceC8979l interfaceC8979lStartapp2 = interfaceC2053l.startapp(cstatic.crashlytics, 5);
        this.subs = interfaceC8979lStartapp2;
        C12984l c12984l = new C12984l();
        cstatic.amazon();
        c12984l.yandex = (String) cstatic.purchase;
        c12984l.remoteconfig = AbstractC3825l.vip(this.billing);
        c12984l.vip = AbstractC3825l.vip("application/id3");
        AbstractC9029l.license(c12984l, interfaceC8979lStartapp2);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0205  */
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
    @Override // defpackage.InterfaceC17094l
    public final void purchase(C13143l c13143l) throws C17655l {
        byte b;
        int i;
        int i2;
        char c;
        int i3;
        char c2;
        int i4;
        int i5;
        int i6;
        this.admob.getClass();
        String str = AbstractC15323l.yandex;
        while (c13143l.yandex() > 0) {
            int i7 = this.isPro;
            byte b2 = -1;
            C13143l c13143l2 = this.crashlytics;
            int i8 = 3;
            C5257l c5257l = this.loadAd;
            int i9 = 0;
            int i10 = 4;
            int i11 = 1;
            if (i7 == 0) {
                byte[] bArr = c13143l.yandex;
                int i12 = c13143l.loadAd;
                int i13 = c13143l.crashlytics;
                while (true) {
                    if (i12 < i13) {
                        int i14 = i12 + 1;
                        int i15 = i8;
                        int i16 = bArr[i12];
                        int i17 = i16 & 255;
                        if (this.smaato == 512 && (((65280 | ((((byte) i17) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520) {
                            if (!this.vip) {
                                int i18 = i12 - 1;
                                c13143l.m3562for(i12);
                                byte[] bArr2 = c5257l.loadAd;
                                if (c13143l.yandex() < i11) {
                                    b = -1;
                                } else {
                                    c13143l.firebase(i9, i11, bArr2);
                                    c5257l.remoteconfig(i10);
                                    int iMopub = c5257l.mopub(i11);
                                    int i19 = this.metrica;
                                    if (i19 == -1 || iMopub == i19) {
                                        if (this.startapp != -1) {
                                            byte[] bArr3 = c5257l.loadAd;
                                            if (c13143l.yandex() >= i11) {
                                                c13143l.firebase(i9, i11, bArr3);
                                                c5257l.remoteconfig(2);
                                                i4 = 4;
                                                if (c5257l.mopub(4) != this.startapp) {
                                                    b = -1;
                                                } else {
                                                    c13143l.m3562for(i14);
                                                }
                                            }
                                        } else {
                                            i4 = 4;
                                        }
                                        byte[] bArr4 = c5257l.loadAd;
                                        if (c13143l.yandex() >= i4) {
                                            c13143l.firebase(i9, i4, bArr4);
                                            c5257l.remoteconfig(14);
                                            int iMopub2 = c5257l.mopub(13);
                                            if (iMopub2 < 7) {
                                                b = -1;
                                            } else {
                                                byte[] bArr5 = c13143l.yandex;
                                                int i20 = c13143l.crashlytics;
                                                int i21 = i18 + iMopub2;
                                                if (i21 < i20) {
                                                    byte b3 = bArr5[i21];
                                                    b = -1;
                                                    if (b3 == -1) {
                                                        int i22 = i21 + 1;
                                                        if (i22 != i20) {
                                                            int i23 = bArr5[i22];
                                                            if ((((65280 | ((i23 & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((i23 & 8) >> 3) == iMopub) {
                                                            }
                                                        }
                                                    } else if (b3 == 73 && ((i5 = i21 + 1) == i20 || (bArr5[i5] == 68 && ((i6 = i21 + 2) == i20 || bArr5[i6] == 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        b = -1;
                                    }
                                }
                                i = 1;
                            }
                            this.adcel = (i16 & 8) >> 3;
                            this.remoteconfig = (i16 & 1) == 0;
                            if (this.vip) {
                                this.isPro = i15;
                                this.firebase = 0;
                            } else {
                                this.isPro = 1;
                                this.firebase = 0;
                            }
                            c13143l.m3562for(i14);
                        } else {
                            b = b2;
                            i = i11;
                        }
                        int i24 = this.smaato;
                        int i25 = i17 | i24;
                        if (i25 == 329) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.smaato = 768;
                        } else if (i25 == 511) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.smaato = AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                        } else if (i25 == 836) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.smaato = 1024;
                        } else if (i25 != 1075) {
                            c = 256;
                            if (i24 != 256) {
                                this.smaato = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                i2 = 3;
                                i3 = 0;
                                c2 = 2;
                            } else {
                                i2 = 3;
                                i3 = 0;
                                c2 = 2;
                            }
                            i11 = i;
                            b2 = b;
                            i10 = 4;
                            i9 = i3;
                            i8 = i2;
                        } else {
                            this.isPro = 2;
                            this.firebase = 3;
                            this.tapsense = 0;
                            c13143l2.m3562for(0);
                            c13143l.m3562for(i14);
                        }
                        i12 = i14;
                        i11 = i;
                        b2 = b;
                        i10 = 4;
                        i9 = i3;
                        i8 = i2;
                    } else {
                        c13143l.m3562for(i12);
                    }
                }
            } else if (i7 != 1) {
                if (i7 == 2) {
                    byte[] bArr6 = c13143l2.yandex;
                    int iMin = Math.min(c13143l.yandex(), 10 - this.firebase);
                    c13143l.firebase(this.firebase, iMin, bArr6);
                    int i26 = this.firebase + iMin;
                    this.firebase = i26;
                    if (i26 == 10) {
                        this.subs.purchase(10, c13143l2);
                        c13143l2.m3562for(6);
                        InterfaceC8979l interfaceC8979l = this.subs;
                        int iIsVip = c13143l2.isVip() + 10;
                        this.isPro = 4;
                        this.firebase = 10;
                        this.license = interfaceC8979l;
                        this.pro = 0L;
                        this.tapsense = iIsVip;
                    }
                } else if (i7 == 3) {
                    int i27 = this.remoteconfig ? 7 : 5;
                    byte[] bArr7 = c5257l.loadAd;
                    int iMin2 = Math.min(c13143l.yandex(), i27 - this.firebase);
                    c13143l.firebase(this.firebase, iMin2, bArr7);
                    int i28 = this.firebase + iMin2;
                    this.firebase = i28;
                    if (i28 == i27) {
                        c5257l.remoteconfig(0);
                        if (this.ads) {
                            c5257l.metrica(10);
                        } else {
                            int iMopub3 = c5257l.mopub(2) + 1;
                            if (iMopub3 != 2) {
                                AbstractC6427l.vip("AdtsReader", "Detected audio object type: " + iMopub3 + ", but assuming AAC LC.");
                                iMopub3 = 2;
                            }
                            c5257l.metrica(5);
                            int iMopub4 = c5257l.mopub(3);
                            int i29 = this.startapp;
                            byte[] bArr8 = {(byte) (((iMopub3 << 3) & 248) | ((i29 >> 1) & 7)), (byte) (((iMopub4 << 3) & 120) | ((i29 << 7) & 128))};
                            Cimport cimportAdmob = AbstractC3234l.admob(new C5257l(bArr8, 2), false);
                            C12984l c12984l = new C12984l();
                            c12984l.yandex = this.mopub;
                            c12984l.remoteconfig = AbstractC3825l.vip(this.billing);
                            c12984l.vip = AbstractC3825l.vip("audio/mp4a-latm");
                            c12984l.isPro = cimportAdmob.yandex;
                            c12984l.f25447throws = cimportAdmob.crashlytics;
                            c12984l.f25442package = cimportAdmob.loadAd;
                            c12984l.adcel = Collections.singletonList(bArr8);
                            c12984l.amazon = this.amazon;
                            c12984l.billing = this.purchase;
                            C5978l c5978l = new C5978l(c12984l);
                            this.subscription = 1024000000 / ((long) c5978l.f12622synchronized);
                            this.admob.mopub(c5978l);
                            this.ads = true;
                        }
                        c5257l.metrica(4);
                        int iMopub5 = c5257l.mopub(13);
                        int i30 = iMopub5 - 7;
                        if (this.remoteconfig) {
                            i30 = iMopub5 - 9;
                        }
                        InterfaceC8979l interfaceC8979l2 = this.admob;
                        long j = this.subscription;
                        this.isPro = 4;
                        this.firebase = 0;
                        this.license = interfaceC8979l2;
                        this.pro = j;
                        this.tapsense = i30;
                    }
                } else {
                    if (i7 != 4) {
                        C18073l.admob();
                        return;
                    }
                    int iMin3 = Math.min(c13143l.yandex(), this.tapsense - this.firebase);
                    this.license.purchase(iMin3, c13143l);
                    int i31 = this.firebase + iMin3;
                    this.firebase = i31;
                    if (i31 == this.tapsense) {
                        AbstractC12442l.subscription(this.Signature != -9223372036854775807L);
                        this.license.yandex(this.Signature, 1, this.tapsense, 0, null);
                        this.Signature += this.pro;
                        this.isPro = 0;
                        this.firebase = 0;
                        this.smaato = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    }
                }
            } else if (c13143l.yandex() != 0) {
                c5257l.loadAd[0] = c13143l.yandex[c13143l.loadAd];
                c5257l.remoteconfig(2);
                int iMopub6 = c5257l.mopub(4);
                int i32 = this.startapp;
                if (i32 == -1 || iMopub6 == i32) {
                    if (!this.vip) {
                        this.vip = true;
                        this.metrica = this.adcel;
                        this.startapp = iMopub6;
                    }
                    this.isPro = 3;
                    this.firebase = 0;
                } else {
                    this.vip = false;
                    this.isPro = 0;
                    this.firebase = 0;
                    this.smaato = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC17094l
    public final void subs(int i, long j) {
        this.Signature = j;
    }

    @Override // defpackage.InterfaceC17094l
    public final void admob(boolean z) {
    }
}
