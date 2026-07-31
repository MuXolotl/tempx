package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؑۛؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0580l {
    public float adcel;
    public float admob;
    public float ads;
    public AbstractC9544l advert;
    public float amazon;
    public AbstractC9544l applovin;
    public boolean appmetrica;
    public float billing;

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public float f1998case;

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public float f1999catch;

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public long f2000class;

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public AbstractC8939l f2001continue;
    public float crashlytics;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public long f2002default;

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public float f2003else;

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public float f2004extends;

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public long f2005final;
    public float firebase;

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public float f2006for;

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public float f2007goto;
    public InterfaceC6347l inmobi;

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public AbstractC9544l f2008interface;
    public float isPro;
    public int loadAd;
    public float mopub;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public float f2009native;

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public long f2010new;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public Object f2011package;
    public long premium;

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public float f2012private;
    public float purchase;
    public AbstractC9544l signatures;
    public float startapp;

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public C10068l f2013static;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public float f2014strictfp;
    public float subs;
    public float subscription;

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public int f2015super;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public float f2016switch;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public float f2017synchronized;

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public float f2018throw;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public Object f2019throws;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public float f2020volatile;
    public long yandex;
    public float smaato = Float.NaN;
    public float remoteconfig = Float.NaN;
    public float vip = Float.NaN;
    public float metrica = Float.NaN;
    public float tapsense = Float.NaN;
    public float Signature = Float.NaN;
    public float license = Float.NaN;
    public float pro = Float.NaN;
    public long ad = C9735l.loadAd;
    public long isVip = C9735l.isPro;

    public C0580l() {
        long j = C9735l.firebase;
        this.premium = j;
        this.inmobi = AbstractC16837l.yandex;
        this.f2017synchronized = 1.0f;
        this.f2014strictfp = 1.0f;
        this.f2020volatile = 1.0f;
        long j2 = C1723l.loadAd;
        this.f1999catch = Float.intBitsToFloat((int) (j2 >> 32));
        this.f2003else = Float.intBitsToFloat((int) (j2 & 4294967295L));
        this.f1998case = 1.0f;
        this.f2000class = j;
        this.f2013static = C10068l.crashlytics;
        long j3 = C1794l.crashlytics;
        this.f2002default = j3;
        this.f2005final = j3;
        this.f2010new = j3;
        this.f2007goto = Float.NaN;
    }

    public final int Signature() {
        if ((this.yandex & 4398046511104L) == 0) {
            return 0;
        }
        int i = (this.f2015super & 112) >> 4;
        if (i >= 0 && i < 6) {
            return i;
        }
        AbstractC1786l.yandex("The given value=" + i + " is not recognized by TextDirection.");
        return i;
    }

    public final void ad(int i) {
        this.yandex |= 17592186044416L;
        this.f2015super = ((i << 8) & 768) | (this.f2015super & (-769));
    }

    public final int adcel() {
        if ((this.yandex & 17592186044416L) == 0) {
            return 0;
        }
        int i = (this.f2015super & 768) >> 8;
        if (i >= 0 && i < 3) {
            return i;
        }
        AbstractC1786l.yandex("The given value=" + i + " is not recognized by Hyphens.");
        return i;
    }

    public final int admob(int i, C0580l c0580l) {
        int i2 = this.loadAd;
        int i3 = c0580l.loadAd;
        int i4 = i2 & i3 & i;
        int i5 = i & (i2 ^ i3);
        if (i4 == 0) {
            return i5;
        }
        if ((i4 & 1) != 0 && AbstractC8576l.yandex(this.advert, c0580l.advert)) {
            i4 &= -2;
        }
        if ((i4 & 2) != 0 && AbstractC8576l.yandex(this.signatures, c0580l.signatures)) {
            i4 &= -3;
        }
        if ((i4 & 4) != 0 && AbstractC8576l.yandex(this.applovin, c0580l.applovin)) {
            i4 &= -5;
        }
        if ((i4 & 8) != 0 && AbstractC8576l.yandex(this.inmobi, c0580l.inmobi)) {
            i4 &= -9;
        }
        if ((i4 & 16) != 0 && AbstractC8576l.yandex(this.f2001continue, c0580l.f2001continue)) {
            i4 &= -17;
        }
        if ((i4 & 32) != 0 && AbstractC8576l.yandex(this.f2019throws, c0580l.f2019throws)) {
            i4 &= -33;
        }
        if ((i4 & 64) != 0 && AbstractC8576l.yandex(this.f2011package, c0580l.f2011package)) {
            i4 &= -65;
        }
        if ((i4 & 128) != 0 && AbstractC8576l.yandex(this.f2008interface, c0580l.f2008interface)) {
            i4 &= -129;
        }
        if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            i4 &= -257;
        }
        if ((i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 && AbstractC8576l.yandex(this.f2013static, c0580l.f2013static)) {
            i4 &= -513;
        }
        if ((i4 & 1024) != 0) {
            i4 &= -1025;
        }
        return i4 | i5;
    }

    public final int ads() {
        return AbstractC6512l.purchase(this.loadAd) | AbstractC6512l.mopub(this.yandex);
    }

    public final void advert(int i) {
        this.yandex |= 2199023255552L;
        this.f2015super = ((i << 2) & 28) | (this.f2015super & (-29));
    }

    public final void amazon(long j) {
        this.yandex |= 34359738368L;
        this.loadAd &= -2;
        this.ad = j;
        this.advert = null;
    }

    public final void billing(C0580l c0580l) {
        c0580l.yandex = this.yandex;
        c0580l.loadAd = this.loadAd;
        c0580l.startapp = this.startapp;
        c0580l.adcel = this.adcel;
        c0580l.ads = this.ads;
        c0580l.subscription = this.subscription;
        c0580l.tapsense = this.tapsense;
        c0580l.Signature = this.Signature;
        c0580l.license = this.license;
        c0580l.pro = this.pro;
        c0580l.crashlytics = this.crashlytics;
        c0580l.amazon = this.amazon;
        c0580l.purchase = this.purchase;
        c0580l.billing = this.billing;
        c0580l.mopub = this.mopub;
        c0580l.admob = this.admob;
        c0580l.subs = this.subs;
        c0580l.isPro = this.isPro;
        c0580l.firebase = this.firebase;
        c0580l.inmobi = this.inmobi;
        c0580l.f2017synchronized = this.f2017synchronized;
        c0580l.f2014strictfp = this.f2014strictfp;
        c0580l.f2020volatile = this.f2020volatile;
        c0580l.f2009native = this.f2009native;
        c0580l.f2012private = this.f2012private;
        c0580l.f2004extends = this.f2004extends;
        c0580l.f2006for = this.f2006for;
        c0580l.f2018throw = this.f2018throw;
        c0580l.f1999catch = this.f1999catch;
        c0580l.f2003else = this.f2003else;
        c0580l.f2016switch = this.f2016switch;
        c0580l.f2001continue = this.f2001continue;
        c0580l.f1998case = this.f1998case;
        c0580l.ad = this.ad;
        c0580l.advert = this.advert;
        c0580l.isVip = this.isVip;
        c0580l.signatures = this.signatures;
        c0580l.premium = this.premium;
        c0580l.applovin = this.applovin;
        c0580l.f2019throws = this.f2019throws;
        c0580l.f2011package = this.f2011package;
        c0580l.appmetrica = this.appmetrica;
        c0580l.smaato = this.smaato;
        c0580l.remoteconfig = this.remoteconfig;
        c0580l.vip = this.vip;
        c0580l.metrica = this.metrica;
        c0580l.f2000class = this.f2000class;
        c0580l.f2008interface = this.f2008interface;
        c0580l.f2013static = this.f2013static;
        c0580l.f2002default = this.f2002default;
        c0580l.f2005final = this.f2005final;
        c0580l.f2010new = this.f2010new;
        c0580l.f2007goto = this.f2007goto;
        c0580l.f2015super = this.f2015super;
    }

    public final void crashlytics(AbstractC9544l abstractC9544l) {
        this.yandex &= -34359738369L;
        int i = this.loadAd;
        this.loadAd = abstractC9544l != null ? i | 1 : i & (-2);
        this.advert = abstractC9544l;
        int i2 = C9735l.smaato;
        this.ad = C9735l.firebase;
    }

    public final void firebase(int i) {
        this.yandex |= 35184372088832L;
        this.f2015super = ((i << 10) & 15360) | (this.f2015super & (-15361));
    }

    public final void isPro(int i) {
        this.yandex |= 1099511627776L;
        this.f2015super = ((i | 2) & 3) | (this.f2015super & (-4));
    }

    public final void isVip(C9867l c9867l) {
        this.yandex |= 274877906944L;
        this.f2015super = (((c9867l.yandex | 4) << 14) & 114688) | (this.f2015super & (-114689));
    }

    public final boolean license(byte b) {
        return b < 50 && ((1 << b) & this.yandex) != 0;
    }

    public final void loadAd(long j) {
        this.yandex |= 17179869184L;
        this.loadAd &= -3;
        this.isVip = j;
        this.signatures = null;
    }

    public final int metrica() {
        if ((this.yandex & 35184372088832L) == 0) {
            return 0;
        }
        int i = ((this.f2015super & 15360) >> 10) & 15;
        if (i != 0 && i != 1 && i != 2 && i != 65535) {
            AbstractC1786l.yandex("The given value=" + i + " is not recognized by FontSynthesis.");
        }
        return i;
    }

    public final void mopub(C0580l c0580l, long j, int i) {
        long j2 = j & this.yandex;
        if (j2 != 0) {
            if ((j2 & 8192) != 0) {
                float f = this.startapp;
                c0580l.yandex = 8192 | c0580l.yandex;
                c0580l.startapp = f;
            }
            if ((j2 & 16384) != 0) {
                float f2 = this.adcel;
                c0580l.yandex = 16384 | c0580l.yandex;
                c0580l.adcel = f2;
            }
            if ((j2 & 32768) != 0) {
                float f3 = this.ads;
                c0580l.yandex = 32768 | c0580l.yandex;
                c0580l.ads = f3;
            }
            if ((j2 & 65536) != 0) {
                float f4 = this.subscription;
                c0580l.yandex = 65536 | c0580l.yandex;
                c0580l.subscription = f4;
            }
            if ((j2 & 262144) != 0) {
                float f5 = this.tapsense;
                c0580l.yandex = 262144 | c0580l.yandex;
                c0580l.tapsense = f5;
            }
            if ((j2 & 1048576) != 0) {
                float f6 = this.Signature;
                c0580l.yandex = 1048576 | c0580l.yandex;
                c0580l.Signature = f6;
            }
            if ((j2 & 131072) != 0) {
                float f7 = this.license;
                c0580l.yandex = 131072 | c0580l.yandex;
                c0580l.license = f7;
            }
            if ((j2 & 524288) != 0) {
                float f8 = this.pro;
                c0580l.yandex = 524288 | c0580l.yandex;
                c0580l.pro = f8;
            }
            if ((j2 & 1) != 0) {
                float f9 = this.crashlytics;
                c0580l.yandex = 1 | c0580l.yandex;
                c0580l.crashlytics = f9;
            }
            if ((j2 & 2) != 0) {
                float f10 = this.amazon;
                c0580l.yandex = 2 | c0580l.yandex;
                c0580l.amazon = f10;
            }
            if ((j2 & 4) != 0) {
                float f11 = this.purchase;
                c0580l.yandex = 4 | c0580l.yandex;
                c0580l.purchase = f11;
            }
            if ((j2 & 8) != 0) {
                float f12 = this.billing;
                c0580l.yandex = 8 | c0580l.yandex;
                c0580l.billing = f12;
            }
            if ((j2 & 16) != 0) {
                float f13 = this.mopub;
                c0580l.yandex = 16 | c0580l.yandex;
                c0580l.mopub = f13;
            }
            if ((j2 & 32) != 0) {
                float f14 = this.admob;
                c0580l.yandex = 32 | c0580l.yandex;
                c0580l.admob = f14;
            }
            if ((j2 & 64) != 0) {
                float f15 = this.subs;
                c0580l.yandex = 64 | c0580l.yandex;
                c0580l.subs = f15;
            }
            if ((j2 & 128) != 0) {
                float f16 = this.isPro;
                c0580l.yandex = 128 | c0580l.yandex;
                c0580l.isPro = f16;
            }
            if ((j2 & 256) != 0) {
                float f17 = this.firebase;
                c0580l.yandex = 256 | c0580l.yandex;
                c0580l.firebase = f17;
            }
            if ((j2 & 2097152) != 0) {
                float f18 = this.f2017synchronized;
                c0580l.yandex = 2097152 | c0580l.yandex;
                c0580l.f2017synchronized = f18;
            }
            if ((j2 & 4194304) != 0) {
                float f19 = this.f2014strictfp;
                c0580l.yandex = 4194304 | c0580l.yandex;
                c0580l.f2014strictfp = f19;
            }
            if ((j2 & 8388608) != 0) {
                float f20 = this.f2020volatile;
                c0580l.yandex = 8388608 | c0580l.yandex;
                c0580l.f2020volatile = f20;
            }
            if ((j2 & 16777216) != 0) {
                float f21 = this.f2009native;
                c0580l.yandex = 16777216 | c0580l.yandex;
                c0580l.f2009native = f21;
            }
            if ((j2 & 33554432) != 0) {
                float f22 = this.f2012private;
                c0580l.yandex = 33554432 | c0580l.yandex;
                c0580l.f2012private = f22;
            }
            if ((j2 & 67108864) != 0) {
                float f23 = this.f2004extends;
                c0580l.yandex = 67108864 | c0580l.yandex;
                c0580l.f2004extends = f23;
            }
            if ((j2 & 134217728) != 0) {
                float f24 = this.f2006for;
                c0580l.yandex = 134217728 | c0580l.yandex;
                c0580l.f2006for = f24;
            }
            if ((j2 & 268435456) != 0) {
                float f25 = this.f2018throw;
                c0580l.yandex = 268435456 | c0580l.yandex;
                c0580l.f2018throw = f25;
            }
            if ((j2 & 536870912) != 0) {
                float f26 = this.f1999catch;
                c0580l.yandex = 536870912 | c0580l.yandex;
                c0580l.f1999catch = f26;
            }
            if ((j2 & 1073741824) != 0) {
                float f27 = this.f2003else;
                c0580l.yandex = 1073741824 | c0580l.yandex;
                c0580l.f2003else = f27;
            }
            if ((j2 & 4294967296L) != 0) {
                float f28 = this.f2016switch;
                c0580l.yandex = 4294967296L | c0580l.yandex;
                c0580l.f2016switch = f28;
            }
            if ((j2 & 8589934592L) != 0) {
                float f29 = this.f1998case;
                c0580l.yandex = 8589934592L | c0580l.yandex;
                c0580l.f1998case = f29;
            }
            if ((34359738368L & j2) != 0) {
                c0580l.amazon(this.ad);
            }
            if ((17179869184L & j2) != 0) {
                c0580l.loadAd(this.isVip);
            }
            if ((j2 & 68719476736L) != 0) {
                long j3 = this.premium;
                c0580l.yandex = 68719476736L | c0580l.yandex;
                c0580l.loadAd &= -5;
                c0580l.premium = j3;
                c0580l.applovin = null;
            }
            if ((j2 & 2147483648L) != 0) {
                boolean z = this.appmetrica;
                c0580l.yandex = 2147483648L | c0580l.yandex;
                c0580l.appmetrica = z;
            }
            if ((j2 & 512) != 0) {
                float f30 = this.smaato;
                c0580l.yandex = (512 | c0580l.yandex) & (-2049);
                c0580l.smaato = f30;
                c0580l.vip = Float.NaN;
            }
            if ((j2 & 1024) != 0) {
                float f31 = this.remoteconfig;
                c0580l.yandex = (1024 | c0580l.yandex) & (-4097);
                c0580l.remoteconfig = f31;
                c0580l.metrica = Float.NaN;
            }
            if ((j2 & 2048) != 0) {
                float f32 = this.vip;
                c0580l.yandex = 2048 | (c0580l.yandex & (-513));
                c0580l.vip = f32;
                c0580l.smaato = Float.NaN;
            }
            if ((j2 & 4096) != 0) {
                float f33 = this.metrica;
                c0580l.yandex = 4096 | (c0580l.yandex & (-1025));
                c0580l.metrica = f33;
                c0580l.remoteconfig = Float.NaN;
            }
            if ((j2 & 137438953472L) != 0) {
                long j4 = this.f2000class;
                c0580l.yandex = 137438953472L | c0580l.yandex;
                c0580l.loadAd &= -129;
                c0580l.f2000class = j4;
                c0580l.f2008interface = null;
            }
            if ((j2 & 140737488355328L) != 0) {
                long j5 = this.f2005final;
                c0580l.yandex = 140737488355328L | c0580l.yandex;
                c0580l.f2005final = j5;
            }
            if ((j2 & 281474976710656L) != 0) {
                long j6 = this.f2010new;
                c0580l.yandex = 281474976710656L | c0580l.yandex;
                c0580l.f2010new = j6;
            }
            if ((j2 & 8796093022208L) != 0) {
                float f34 = this.f2007goto;
                c0580l.yandex = 8796093022208L | c0580l.yandex;
                c0580l.f2007goto = f34;
            }
            if ((j2 & 562949953421312L) != 0) {
                c0580l.yandex = 562949953421312L | c0580l.yandex;
            }
            if ((131666517426176L & j2) != 0) {
                if ((274877906944L & j2) != 0) {
                    c0580l.isVip(tapsense());
                }
                if ((j2 & 70368744177664L) != 0) {
                    long j7 = this.f2002default;
                    c0580l.yandex = 70368744177664L | c0580l.yandex;
                    c0580l.f2002default = j7;
                }
                if ((2199023255552L & j2) != 0) {
                    c0580l.advert(subscription());
                }
                if ((4398046511104L & j2) != 0) {
                    c0580l.signatures(Signature());
                }
                if ((17592186044416L & j2) != 0) {
                    c0580l.ad(adcel());
                }
                if ((35184372088832L & j2) != 0) {
                    c0580l.firebase(metrica());
                }
                if ((549755813888L & j2) != 0) {
                    c0580l.smaato(startapp());
                }
                if ((j2 & 1099511627776L) != 0) {
                    c0580l.isPro(vip());
                }
            }
        }
        int i2 = this.loadAd & i;
        if (i2 != 0) {
            if ((i2 & 8) != 0) {
                InterfaceC6347l interfaceC6347l = this.inmobi;
                c0580l.loadAd |= 8;
                c0580l.inmobi = interfaceC6347l;
            }
            if ((i2 & 16) != 0) {
                AbstractC8939l abstractC8939l = this.f2001continue;
                c0580l.loadAd |= 16;
                c0580l.f2001continue = abstractC8939l;
            }
            if ((i2 & 1) != 0) {
                c0580l.crashlytics(this.advert);
            }
            if ((i2 & 2) != 0) {
                c0580l.yandex(this.signatures);
            }
            if ((i2 & 4) != 0) {
                c0580l.remoteconfig(this.applovin);
            }
            if ((i2 & 32) != 0) {
                Object obj = this.f2019throws;
                int i3 = c0580l.loadAd;
                c0580l.loadAd = obj != null ? i3 | 32 : i3 & (-33);
                c0580l.f2019throws = obj;
            }
            if ((i2 & 64) != 0) {
                Object obj2 = this.f2011package;
                int i4 = c0580l.loadAd;
                c0580l.loadAd = obj2 != null ? i4 | 64 : i4 & (-65);
                c0580l.f2011package = obj2;
            }
            if ((i2 & 128) != 0) {
                c0580l.purchase(this.f2008interface);
            }
            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                c0580l.loadAd |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            if ((i2 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                C10068l c10068l = this.f2013static;
                c0580l.loadAd |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                c0580l.f2013static = c10068l;
            }
            if ((i2 & 1024) != 0) {
                c0580l.loadAd |= 1024;
            }
        }
    }

    public final boolean pro(int i) {
        return i >= 50 && (this.loadAd & (1 << (i - 50))) != 0;
    }

    public final void purchase(AbstractC9544l abstractC9544l) {
        this.yandex &= -137438953473L;
        int i = this.loadAd;
        this.loadAd = abstractC9544l != null ? i | 128 : i & (-129);
        this.f2008interface = abstractC9544l;
        int i2 = C9735l.smaato;
        this.f2000class = C9735l.firebase;
    }

    public final void remoteconfig(AbstractC9544l abstractC9544l) {
        this.yandex &= -68719476737L;
        int i = this.loadAd;
        this.loadAd = abstractC9544l != null ? i | 4 : i & (-5);
        this.applovin = abstractC9544l;
        int i2 = C9735l.smaato;
        this.premium = C9735l.firebase;
    }

    public final void signatures(int i) {
        this.yandex |= 4398046511104L;
        this.f2015super = ((i << 4) & 112) | (this.f2015super & (-113));
    }

    public final void smaato(C6886l c6886l) {
        this.yandex |= 549755813888L;
        this.f2015super = ((c6886l.f14426l << 17) & 134086656) | (this.f2015super & (-134086657));
    }

    public final C6886l startapp() {
        if ((this.yandex & 549755813888L) != 0) {
            return new C6886l((this.f2015super & 134086656) >> 17);
        }
        C6886l c6886l = C6886l.f14421l;
        return C6886l.f14425l;
    }

    public final long subs(C0580l c0580l, long j) {
        long j2 = this.yandex;
        long j3 = c0580l.yandex;
        long j4 = j2 & j3 & j;
        long j5 = j & (j2 ^ j3);
        if (j4 == 0) {
            return j5;
        }
        if ((1 & j4) != 0 && Float.floatToRawIntBits(this.crashlytics) == Float.floatToRawIntBits(c0580l.crashlytics)) {
            j4 &= -2;
        }
        if ((2 & j4) != 0 && Float.floatToRawIntBits(this.amazon) == Float.floatToRawIntBits(c0580l.amazon)) {
            j4 &= -3;
        }
        if ((4 & j4) != 0 && Float.floatToRawIntBits(this.purchase) == Float.floatToRawIntBits(c0580l.purchase)) {
            j4 &= -5;
        }
        if ((8 & j4) != 0 && Float.floatToRawIntBits(this.billing) == Float.floatToRawIntBits(c0580l.billing)) {
            j4 &= -9;
        }
        if ((16 & j4) != 0 && Float.floatToRawIntBits(this.mopub) == Float.floatToRawIntBits(c0580l.mopub)) {
            j4 &= -17;
        }
        if ((32 & j4) != 0 && Float.floatToRawIntBits(this.admob) == Float.floatToRawIntBits(c0580l.admob)) {
            j4 &= -33;
        }
        if ((64 & j4) != 0 && Float.floatToRawIntBits(this.subs) == Float.floatToRawIntBits(c0580l.subs)) {
            j4 &= -65;
        }
        if ((128 & j4) != 0 && Float.floatToRawIntBits(this.isPro) == Float.floatToRawIntBits(c0580l.isPro)) {
            j4 &= -129;
        }
        if ((256 & j4) != 0 && Float.floatToRawIntBits(this.firebase) == Float.floatToRawIntBits(c0580l.firebase)) {
            j4 &= -257;
        }
        if ((512 & j4) != 0 && Float.floatToRawIntBits(this.smaato) == Float.floatToRawIntBits(c0580l.smaato)) {
            j4 &= -513;
        }
        if ((1024 & j4) != 0 && Float.floatToRawIntBits(this.remoteconfig) == Float.floatToRawIntBits(c0580l.remoteconfig)) {
            j4 &= -1025;
        }
        if ((2048 & j4) != 0 && Float.floatToRawIntBits(this.vip) == Float.floatToRawIntBits(c0580l.vip)) {
            j4 &= -2049;
        }
        if ((4096 & j4) != 0 && Float.floatToRawIntBits(this.metrica) == Float.floatToRawIntBits(c0580l.metrica)) {
            j4 &= -4097;
        }
        if ((8192 & j4) != 0 && Float.floatToRawIntBits(this.startapp) == Float.floatToRawIntBits(c0580l.startapp)) {
            j4 &= -8193;
        }
        if ((16384 & j4) != 0 && Float.floatToRawIntBits(this.adcel) == Float.floatToRawIntBits(c0580l.adcel)) {
            j4 &= -16385;
        }
        if ((32768 & j4) != 0 && Float.floatToRawIntBits(this.ads) == Float.floatToRawIntBits(c0580l.ads)) {
            j4 &= -32769;
        }
        if ((65536 & j4) != 0 && Float.floatToRawIntBits(this.subscription) == Float.floatToRawIntBits(c0580l.subscription)) {
            j4 &= -65537;
        }
        if ((131072 & j4) != 0 && Float.floatToRawIntBits(this.license) == Float.floatToRawIntBits(c0580l.license)) {
            j4 &= -131073;
        }
        if ((262144 & j4) != 0 && Float.floatToRawIntBits(this.tapsense) == Float.floatToRawIntBits(c0580l.tapsense)) {
            j4 &= -262145;
        }
        if ((524288 & j4) != 0 && Float.floatToRawIntBits(this.pro) == Float.floatToRawIntBits(c0580l.pro)) {
            j4 &= -524289;
        }
        if ((1048576 & j4) != 0 && Float.floatToRawIntBits(this.Signature) == Float.floatToRawIntBits(c0580l.Signature)) {
            j4 &= -1048577;
        }
        if ((2097152 & j4) != 0 && Float.floatToRawIntBits(this.f2017synchronized) == Float.floatToRawIntBits(c0580l.f2017synchronized)) {
            j4 &= -2097153;
        }
        if ((4194304 & j4) != 0 && Float.floatToRawIntBits(this.f2014strictfp) == Float.floatToRawIntBits(c0580l.f2014strictfp)) {
            j4 &= -4194305;
        }
        if ((8388608 & j4) != 0 && Float.floatToRawIntBits(this.f2020volatile) == Float.floatToRawIntBits(c0580l.f2020volatile)) {
            j4 &= -8388609;
        }
        if ((16777216 & j4) != 0 && Float.floatToRawIntBits(this.f2009native) == Float.floatToRawIntBits(c0580l.f2009native)) {
            j4 &= -16777217;
        }
        if ((33554432 & j4) != 0 && Float.floatToRawIntBits(this.f2012private) == Float.floatToRawIntBits(c0580l.f2012private)) {
            j4 &= -33554433;
        }
        if ((67108864 & j4) != 0 && Float.floatToRawIntBits(this.f2004extends) == Float.floatToRawIntBits(c0580l.f2004extends)) {
            j4 &= -67108865;
        }
        if ((134217728 & j4) != 0 && Float.floatToRawIntBits(this.f2006for) == Float.floatToRawIntBits(c0580l.f2006for)) {
            j4 &= -134217729;
        }
        if ((268435456 & j4) != 0 && Float.floatToRawIntBits(this.f2018throw) == Float.floatToRawIntBits(c0580l.f2018throw)) {
            j4 &= -268435457;
        }
        if ((536870912 & j4) != 0 && Float.floatToRawIntBits(this.f1999catch) == Float.floatToRawIntBits(c0580l.f1999catch)) {
            j4 &= -536870913;
        }
        if ((1073741824 & j4) != 0 && Float.floatToRawIntBits(this.f2003else) == Float.floatToRawIntBits(c0580l.f2003else)) {
            j4 &= -1073741825;
        }
        if ((2147483648L & j4) != 0 && this.appmetrica == c0580l.appmetrica) {
            j4 &= -2147483649L;
        }
        if ((4294967296L & j4) != 0 && Float.floatToRawIntBits(this.f2016switch) == Float.floatToRawIntBits(c0580l.f2016switch)) {
            j4 &= -4294967297L;
        }
        if ((8589934592L & j4) != 0 && Float.floatToRawIntBits(this.f1998case) == Float.floatToRawIntBits(c0580l.f1998case)) {
            j4 &= -8589934593L;
        }
        if ((17179869184L & j4) != 0 && C9735l.crashlytics(this.isVip, c0580l.isVip)) {
            j4 &= -17179869185L;
        }
        if ((34359738368L & j4) != 0 && C9735l.crashlytics(this.ad, c0580l.ad)) {
            j4 &= -34359738369L;
        }
        if ((68719476736L & j4) != 0 && C9735l.crashlytics(this.premium, c0580l.premium)) {
            j4 &= -68719476737L;
        }
        if ((137438953472L & j4) != 0 && C9735l.crashlytics(this.f2000class, c0580l.f2000class)) {
            j4 &= -137438953473L;
        }
        if ((274877906944L & j4) != 0 && tapsense().equals(c0580l.tapsense())) {
            j4 &= -274877906945L;
        }
        if ((549755813888L & j4) != 0 && AbstractC8576l.yandex(startapp(), c0580l.startapp())) {
            j4 &= -549755813889L;
        }
        if ((1099511627776L & j4) != 0 && vip() == c0580l.vip()) {
            j4 &= -1099511627777L;
        }
        if ((2199023255552L & j4) != 0 && subscription() == c0580l.subscription()) {
            j4 &= -2199023255553L;
        }
        if ((4398046511104L & j4) != 0 && Signature() == c0580l.Signature()) {
            j4 &= -4398046511105L;
        }
        if ((8796093022208L & j4) != 0 && Float.compare(this.f2007goto, c0580l.f2007goto) == 0) {
            j4 &= -8796093022209L;
        }
        if ((17592186044416L & j4) != 0 && adcel() == c0580l.adcel()) {
            j4 &= -17592186044417L;
        }
        if ((35184372088832L & j4) != 0 && metrica() == c0580l.metrica()) {
            j4 &= -35184372088833L;
        }
        if ((70368744177664L & j4) != 0 && C1794l.yandex(this.f2002default, c0580l.f2002default)) {
            j4 &= -70368744177665L;
        }
        if ((140737488355328L & j4) != 0 && C1794l.yandex(this.f2005final, c0580l.f2005final)) {
            j4 &= -140737488355329L;
        }
        if ((281474976710656L & j4) != 0 && C1794l.yandex(this.f2010new, c0580l.f2010new)) {
            j4 &= -281474976710657L;
        }
        if ((562949953421312L & j4) != 0) {
            j4 &= -562949953421313L;
        }
        return j4 | j5;
    }

    public final int subscription() {
        if ((this.yandex & 2199023255552L) == 0) {
            return 0;
        }
        int i = (this.f2015super & 28) >> 2;
        if (i >= 0 && i < 7) {
            return i;
        }
        AbstractC1786l.yandex("The given value=" + i + " is not recognized by TextAlign.");
        return i;
    }

    public final C9867l tapsense() {
        int i;
        long j = this.yandex & 274877906944L;
        C9867l c9867l = C9867l.loadAd;
        if (j == 0 || (i = ((this.f2015super & 114688) >> 14) & 3) == 0) {
            return c9867l;
        }
        if (i != 1) {
            return i != 2 ? new C9867l(i) : C9867l.amazon;
        }
        return C9867l.crashlytics;
    }

    public final int vip() {
        return ((this.yandex & 1099511627776L) == 0 || (this.f2015super & 1) != 1) ? 0 : 1;
    }

    public final void yandex(AbstractC9544l abstractC9544l) {
        this.yandex &= -17179869185L;
        int i = this.loadAd;
        this.loadAd = abstractC9544l != null ? i | 2 : i & (-3);
        this.signatures = abstractC9544l;
        int i2 = C9735l.smaato;
        this.isVip = C9735l.firebase;
    }
}
