package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؚِؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6956l {
    public boolean adcel;
    public final C6931l admob;
    public boolean ads;
    public boolean advert;
    public final C11686l amazon;
    public boolean applovin;
    public final C8957l appmetrica;
    public final C9552l billing;

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final InterfaceC12932l f14592case;

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public InterfaceC14382l f14593catch;

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public C11619l f14594class;

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public long f14595continue;
    public final C2859l crashlytics;

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final C13154l f14596else;

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final C11275l f14597extends;
    public int firebase;

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public C12317l f14598for;
    public final ArrayList inmobi;
    public C14944l isPro;
    public C16977l license;
    public final AbstractC0306l loadAd;
    public int[] metrica;
    public final C16543l mopub;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public InterfaceC18556l f14599native;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public C5296l f14600package;
    public int premium;

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public C9552l f14601private;
    public boolean pro;
    public final C9552l purchase;
    public int remoteconfig;
    public int signatures;
    public int smaato;
    public C13440l startapp;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public C13006l f14602strictfp;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public boolean f14603switch;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public C2859l f14604synchronized;

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public C13182l f14605throw;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public boolean f14606throws;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public boolean f14607volatile;
    public final AbstractC3031l yandex;
    public final ArrayList subs = new ArrayList();
    public final C16535l vip = new C16535l((byte) 0, 2);
    public final ArrayList subscription = new ArrayList();
    public final C16535l tapsense = new C16535l((byte) 0, 2);
    public InterfaceC18556l Signature = C11890l.f23708l;
    public final C16535l ad = new C16535l((byte) 0, 2);
    public int isVip = -1;

    public C6956l(AbstractC3031l abstractC3031l, AbstractC0306l abstractC0306l, C2859l c2859l, C11686l c11686l, C9552l c9552l, C9552l c9552l2, C16543l c16543l, C6931l c6931l) {
        this.yandex = abstractC3031l;
        this.loadAd = abstractC0306l;
        this.crashlytics = c2859l;
        this.amazon = c11686l;
        this.purchase = c9552l;
        this.billing = c9552l2;
        this.mopub = c16543l;
        this.admob = c6931l;
        this.applovin = abstractC0306l.billing() || abstractC0306l.amazon();
        this.appmetrica = new C8957l(0, this);
        this.inmobi = new ArrayList();
        C5296l c5296lMopub = c2859l.mopub();
        c5296lMopub.crashlytics();
        this.f14600package = c5296lMopub;
        C2859l c2859l2 = new C2859l();
        if (abstractC0306l.billing()) {
            c2859l2.billing();
        }
        if (abstractC0306l.amazon()) {
            c2859l2.f6227l = new C16977l();
        }
        this.f14604synchronized = c2859l2;
        C13006l c13006lAdmob = c2859l2.admob();
        c13006lAdmob.purchase(true);
        this.f14602strictfp = c13006lAdmob;
        this.f14597extends = new C11275l(this, c9552l);
        C5296l c5296lMopub2 = this.f14604synchronized.mopub();
        try {
            C12317l c12317lYandex = c5296lMopub2.yandex(0);
            c5296lMopub2.crashlytics();
            this.f14598for = c12317lYandex;
            this.f14605throw = new C13182l();
            this.f14596else = new C13154l(this);
            InterfaceC12932l interfaceC12932lIsPro = abstractC0306l.isPro();
            InterfaceC12932l interfaceC12932lAdvert = advert();
            this.f14592case = interfaceC12932lIsPro.mo246l(interfaceC12932lAdvert == null ? C17218l.f33421l : interfaceC12932lAdvert);
        } catch (Throwable th) {
            c5296lMopub2.crashlytics();
            throw th;
        }
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static final int m2116extends(C6956l c6956l, int i, boolean z, int i2) throws Throwable {
        int i3;
        long[] jArr;
        int i4;
        int i5;
        C5296l c5296l;
        C5296l c5296l2 = c6956l.f14600package;
        int i6 = 0;
        if (c5296l2.isPro(i)) {
            int iSubs = c5296l2.subs(i);
            Object objStartapp = c5296l2.startapp(c5296l2.loadAd, i);
            if (iSubs == 206 && AbstractC8576l.yandex(objStartapp, AbstractC2032l.purchase)) {
                Object objAdmob = c5296l2.admob(i, 0);
                InterfaceC17142l interfaceC17142l = objAdmob instanceof InterfaceC17142l ? (InterfaceC17142l) objAdmob : null;
                InterfaceC6752l interfaceC6752l = interfaceC17142l != null ? ((C6031l) interfaceC17142l).yandex : null;
                C2450l c2450l = interfaceC6752l instanceof C2450l ? (C2450l) interfaceC6752l : null;
                if (c2450l != null) {
                    C6295l c6295l = c2450l.f5235l.purchase;
                    Object[] objArr = c6295l.loadAd;
                    long[] jArr2 = c6295l.yandex;
                    int length = jArr2.length - 2;
                    if (length >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j = jArr2[i7];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i8 = 8;
                                int i9 = 8 - ((~(i7 - length)) >>> 31);
                                int i10 = i6;
                                while (i10 < i9) {
                                    if ((255 & j) < 128) {
                                        C6956l c6956l2 = (C6956l) objArr[(i7 << 3) + i10];
                                        C2859l c2859l = c6956l2.crashlytics;
                                        if (c2859l.f6220l <= 0 || (c2859l.f6221l[1] & 67108864) == 0) {
                                            i5 = i6;
                                        } else {
                                            C6931l c6931l = c6956l2.admob;
                                            synchronized (c6931l.f14539l) {
                                                try {
                                                    c6931l.startapp();
                                                    C13660l c13660l = c6931l.f14544l;
                                                    c6931l.f14544l = AbstractC9831l.amazon();
                                                    try {
                                                        c6931l.f14523l.m2130instanceof(c13660l);
                                                        Unit unit = Unit.INSTANCE;
                                                    } catch (Throwable th) {
                                                        c6931l.f14544l = c13660l;
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    throw th2;
                                                }
                                            }
                                            C9552l c9552l = new C9552l();
                                            c6956l2.f14601private = c9552l;
                                            C5296l c5296lMopub = c6956l2.crashlytics.mopub();
                                            try {
                                                c6956l2.f14600package = c5296lMopub;
                                                C11275l c11275l = c6956l2.f14597extends;
                                                C9552l c9552l2 = c11275l.loadAd;
                                                try {
                                                    c11275l.loadAd = c9552l;
                                                    c6956l2.m2135private(0);
                                                    C11275l c11275l2 = c6956l2.f14597extends;
                                                    c11275l2.loadAd();
                                                    try {
                                                        if (c11275l2.crashlytics) {
                                                            c5296l = c5296lMopub;
                                                            try {
                                                                c11275l2.loadAd.yandex.isPro(C0510l.amazon);
                                                                if (c11275l2.crashlytics) {
                                                                    c11275l2.amazon(false);
                                                                    c11275l2.amazon(false);
                                                                    c11275l2.loadAd.yandex.isPro(C16010l.amazon);
                                                                    i5 = 0;
                                                                    c11275l2.crashlytics = false;
                                                                }
                                                                c11275l.loadAd = c9552l2;
                                                                c5296l.crashlytics();
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                c11275l.loadAd = c9552l2;
                                                                throw th;
                                                            }
                                                        } else {
                                                            c5296l = c5296lMopub;
                                                        }
                                                        c11275l.loadAd = c9552l2;
                                                        c5296l.crashlytics();
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        c5296l.crashlytics();
                                                        throw th;
                                                    }
                                                    i5 = 0;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    c5296l = c5296lMopub;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                c5296l = c5296lMopub;
                                            }
                                        }
                                        c6956l.loadAd.ads(c6956l2.admob);
                                    } else {
                                        jArr2 = jArr2;
                                        i5 = i6;
                                        i8 = i8;
                                    }
                                    j >>= i8;
                                    i10++;
                                    i8 = i8;
                                    i6 = i5;
                                    jArr2 = jArr2;
                                }
                                jArr = jArr2;
                                i4 = i6;
                                if (i9 != i8) {
                                    break;
                                }
                            } else {
                                jArr = jArr2;
                                i4 = i6;
                            }
                            if (i7 == length) {
                                break;
                            }
                            i7++;
                            i6 = i4;
                            jArr2 = jArr;
                        }
                    }
                }
                return c5296l2.metrica(i);
            }
            i3 = 1;
            if (!c5296l2.smaato(i)) {
                return c5296l2.metrica(i);
            }
        } else {
            i3 = 1;
            if (c5296l2.amazon(i)) {
                int i11 = c5296l2.loadAd[(i * 5) + 3] + i;
                int iM2116extends = 0;
                for (int i12 = i + 1; i12 < i11; i12 += c5296l2.loadAd[(i12 * 5) + 3]) {
                    boolean zSmaato = c5296l2.smaato(i12);
                    if (zSmaato) {
                        c6956l.f14597extends.crashlytics();
                        C11275l c11275l3 = c6956l.f14597extends;
                        Object objVip = c5296l2.vip(i12);
                        c11275l3.crashlytics();
                        c11275l3.admob.add(objVip);
                    }
                    iM2116extends += m2116extends(c6956l, i12, zSmaato || z, zSmaato ? 0 : i2 + iM2116extends);
                    if (zSmaato) {
                        c6956l.f14597extends.crashlytics();
                        c6956l.f14597extends.yandex();
                    }
                }
                if (!c5296l2.smaato(i)) {
                    return iM2116extends;
                }
            } else if (!c5296l2.smaato(i)) {
                return c5296l2.metrica(i);
            }
        }
        return i3;
    }

    public final void Signature() {
        C2859l c2859l = new C2859l();
        if (this.applovin) {
            c2859l.billing();
        }
        if (this.loadAd.amazon()) {
            c2859l.f6227l = new C16977l();
        }
        this.f14604synchronized = c2859l;
        C13006l c13006lAdmob = c2859l.admob();
        c13006lAdmob.purchase(true);
        this.f14602strictfp = c13006lAdmob;
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final boolean m2117abstract(C4224l c4224l, Object obj) {
        C12317l c12317l = c4224l.crashlytics;
        if (c12317l == null) {
            return false;
        }
        int iAmazon = this.f14600package.yandex.amazon(AbstractC0133l.mopub(c12317l));
        if (!this.f14606throws || iAmazon < this.f14600package.mopub) {
            return false;
        }
        ArrayList arrayList = this.subscription;
        int iAmazon2 = AbstractC15684l.amazon(iAmazon, arrayList);
        if (iAmazon2 < 0) {
            int i = -(iAmazon2 + 1);
            if (!(obj instanceof C8610l)) {
                obj = null;
            }
            arrayList.add(i, new C4503l(c4224l, iAmazon, obj));
            return true;
        }
        C4503l c4503l = (C4503l) arrayList.get(iAmazon2);
        if (!(obj instanceof C8610l)) {
            c4503l.crashlytics = null;
            return true;
        }
        Object obj2 = c4503l.crashlytics;
        if (obj2 == null) {
            c4503l.crashlytics = obj;
            return true;
        }
        if (obj2 instanceof C6295l) {
            ((C6295l) obj2).yandex(obj);
            return true;
        }
        C6295l c6295l = AbstractC13087l.yandex;
        C6295l c6295l2 = new C6295l(2);
        c6295l2.smaato(obj2);
        c6295l2.smaato(obj);
        c4503l.crashlytics = c6295l2;
        return true;
    }

    public final boolean ad() {
        if (!isVip() || this.pro) {
            return true;
        }
        C4224l c4224lPro = pro();
        return (c4224lPro == null || (c4224lPro.loadAd & 4) == 0) ? false : true;
    }

    public final void adcel() {
        startapp(false);
        C4224l c4224lPro = pro();
        if (c4224lPro != null) {
            int i = c4224lPro.loadAd;
            if ((i & 1) != 0) {
                c4224lPro.loadAd = i | 2;
            }
        }
    }

    public final boolean admob(Object obj) {
        if (applovin() == obj) {
            return false;
        }
        m2118break(obj);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0080 A[LOOP:0: B:15:0x003e->B:27:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0083 A[EDGE_INSN: B:28:0x0083->B:29:0x0084 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x0080]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:62:0x0083 A[SYNTHETIC] */
    public final C4224l ads() {
        C4224l c4224l;
        C12317l c12317lYandex;
        C8608l c8608l;
        ArrayList arrayList = this.inmobi;
        C4224l c4224l2 = !arrayList.isEmpty() ? (C4224l) arrayList.remove(arrayList.size() - 1) : null;
        if (c4224l2 != null) {
            c4224l2.loadAd &= -9;
            this.mopub.metrica();
            int i = this.premium;
            C7661l c7661l = c4224l2.billing;
            if (c7661l == null || (c4224l2.loadAd & 16) != 0) {
                c8608l = null;
                break;
            }
            Object[] objArr = c7661l.loadAd;
            int[] iArr = c7661l.crashlytics;
            long[] jArr = c7661l.yandex;
            int length = jArr.length - 2;
            if (length < 0) {
                c8608l = null;
                break;
            }
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((j & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            if (iArr[i5] != i) {
                                c8608l = new C8608l(c4224l2, i, c7661l, 4);
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 == 8) {
                        if (i2 == length) {
                            i2++;
                        }
                    }
                    c8608l = null;
                    break;
                }
                if (i2 == length) {
                    c8608l = null;
                    break;
                }
                i2++;
            }
            C11275l c11275l = this.f14597extends;
            if (c8608l != null) {
                C6323l c6323l = c11275l.loadAd.yandex;
                c6323l.isPro(C3209l.amazon);
                AbstractC12225l.remoteconfig(c6323l, 0, c8608l, 1, this.admob);
            }
            int i6 = c4224l2.loadAd;
            if ((i6 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                c4224l2.loadAd = i6 & (-513);
                C6323l c6323l2 = c11275l.loadAd.yandex;
                c6323l2.isPro(C12092l.amazon);
                AbstractC12225l.smaato(c6323l2, 0, c4224l2);
                int i7 = c4224l2.loadAd;
                c4224l2.loadAd = i7 & (-129);
                if ((i7 & 1024) != 0) {
                    c4224l2.loadAd = i7 & (-1153);
                    if (this.isVip == this.f14600package.subs) {
                        this.advert = false;
                        this.isVip = -1;
                    }
                }
            }
        }
        if (c4224l2 != null) {
            int i8 = c4224l2.loadAd;
            if ((i8 & 16) == 0 && ((i8 & 1) != 0 || this.adcel)) {
                if (c4224l2.crashlytics == null) {
                    if (this.f14603switch) {
                        C13006l c13006l = this.f14602strictfp;
                        c12317lYandex = c13006l.loadAd(c13006l.license);
                    } else {
                        C5296l c5296l = this.f14600package;
                        c12317lYandex = c5296l.yandex(c5296l.subs);
                    }
                    c4224l2.crashlytics = c12317lYandex;
                }
                c4224l2.loadAd &= -5;
                c4224l = c4224l2;
            } else {
                c4224l = null;
            }
        } else {
            c4224l = null;
        }
        startapp(false);
        return c4224l;
    }

    public final C13154l advert() {
        if (this.loadAd.firebase()) {
            return this.f14596else;
        }
        return null;
    }

    public final boolean amazon(int i) {
        Object objApplovin = applovin();
        if ((objApplovin instanceof Integer) && i == ((Number) objApplovin).intValue()) {
            return false;
        }
        m2118break(Integer.valueOf(i));
        return true;
    }

    public final Object applovin() {
        boolean z = this.f14603switch;
        C13863l c13863l = C1867l.yandex;
        if (!z) {
            Object objRemoteconfig = this.f14600package.remoteconfig();
            if (!this.advert || (objRemoteconfig instanceof C17420l)) {
                return objRemoteconfig;
            }
        } else if (this.ads) {
            AbstractC2032l.yandex("A call to createNode(), emitNode() or useNode() expected");
            return c13863l;
        }
        return c13863l;
    }

    public final List appmetrica() {
        AbstractC0306l abstractC0306l = this.loadAd;
        InterfaceC12776l interfaceC12776lAdmob = abstractC0306l.admob();
        C6931l c6931l = AbstractC2812l.advert(interfaceC12776lAdmob) ? (C6931l) interfaceC12776lAdmob : null;
        if (c6931l != null) {
            C2859l c2859l = c6931l.f14542l;
            C5296l c5296lMopub = AbstractC0736l.amazon(c2859l).mopub();
            try {
                Integer numAdmob = AbstractC15096l.admob(c5296lMopub, abstractC0306l, 0, c5296lMopub.crashlytics);
                c5296lMopub.crashlytics();
                if (numAdmob != null) {
                    C5296l c5296lMopub2 = AbstractC0736l.amazon(c2859l).mopub();
                    try {
                        return AbstractC16901l.m4232new(AbstractC15096l.subs(c5296lMopub2, numAdmob.intValue(), 0), c6931l.f14523l.appmetrica());
                    } finally {
                        c5296lMopub2.crashlytics();
                    }
                }
            } catch (Throwable th) {
                c5296lMopub.crashlytics();
                throw th;
            }
        }
        return C2580l.f5619l;
    }

    public final boolean billing(Object obj) {
        if (AbstractC8576l.yandex(applovin(), obj)) {
            return false;
        }
        m2118break(obj);
        return true;
    }

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public final void m2118break(Object obj) {
        if (this.f14603switch) {
            C13006l c13006l = this.f14602strictfp;
            if (c13006l.vip <= 0 || c13006l.subs == c13006l.firebase) {
                c13006l.m3529throws(obj);
                return;
            }
            C16977l c16977l = c13006l.subscription;
            if (c16977l == null) {
                c16977l = new C16977l();
            }
            c13006l.subscription = c16977l;
            int i = c13006l.license;
            Object objLoadAd = c16977l.loadAd(i);
            if (objLoadAd == null) {
                objLoadAd = new C12463l();
                c16977l.subs(i, objLoadAd);
            }
            ((C12463l) objLoadAd).yandex(obj);
            return;
        }
        C5296l c5296l = this.f14600package;
        boolean z = c5296l.vip;
        C11275l c11275l = this.f14597extends;
        if (!z) {
            C12317l c12317lYandex = c5296l.yandex(c5296l.subs);
            C6323l c6323l = c11275l.loadAd.yandex;
            c6323l.isPro(C1731l.amazon);
            AbstractC12225l.remoteconfig(c6323l, 0, c12317lYandex, 1, obj);
            return;
        }
        int iLoadAd = (c5296l.smaato - AbstractC0736l.loadAd(c5296l.loadAd, c5296l.subs)) - 1;
        if (c11275l.yandex.f14600package.subs - c11275l.billing >= 0) {
            c11275l.amazon(true);
            C6323l c6323l2 = c11275l.loadAd.yandex;
            c6323l2.isPro(C11021l.admob);
            AbstractC12225l.smaato(c6323l2, 0, obj);
            c6323l2.isPro[c6323l2.firebase - c6323l2.admob[c6323l2.subs - 1].loadAd] = iLoadAd;
            return;
        }
        C5296l c5296l2 = this.f14600package;
        C12317l c12317lYandex2 = c5296l2.yandex(c5296l2.subs);
        C6323l c6323l3 = c11275l.loadAd.yandex;
        c6323l3.isPro(C11021l.mopub);
        AbstractC12225l.remoteconfig(c6323l3, 0, obj, 1, c12317lYandex2);
        c6323l3.isPro[c6323l3.firebase - c6323l3.admob[c6323l3.subs - 1].loadAd] = iLoadAd;
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0325  */
    /* JADX WARN: Code duplicated, block: B:176:0x033b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0356  */
    /* JADX WARN: Code duplicated, block: B:180:0x035c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x035e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x0362  */
    /* JADX WARN: Code duplicated, block: B:185:0x0369  */
    /* JADX WARN: Code duplicated, block: B:187:0x036c  */
    /* JADX WARN: Code duplicated, block: B:188:0x036e  */
    /* JADX WARN: Code duplicated, block: B:192:0x039c  */
    /* JADX WARN: Code duplicated, block: B:193:0x039e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:66:0x010a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0110  */
    /* JADX WARN: Code duplicated, block: B:71:0x0124  */
    /* JADX WARN: Code duplicated, block: B:72:0x0128  */
    /* JADX WARN: Code duplicated, block: B:77:0x014c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0154  */
    /* JADX WARN: Code duplicated, block: B:80:0x015e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0172  */
    /* JADX WARN: Code duplicated, block: B:84:0x0174  */
    /* JADX WARN: Code duplicated, block: B:86:0x0178  */
    /* JADX WARN: Code duplicated, block: B:88:0x0185  */
    /* JADX WARN: Code duplicated, block: B:91:0x018d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0196  */
    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final void m2119case(int i, Object obj, Object obj2, int i2) {
        long jRotateLeft;
        boolean z;
        boolean z2;
        boolean z3;
        C14944l c14944l;
        C14944l c14944l2;
        ArrayList arrayList;
        C16977l c16977l;
        int i3;
        Object objValueOf;
        C13660l c13660l;
        Object objMopub;
        C12463l c12463l;
        C13006l c13006l;
        int i4;
        Object obj3;
        int i5;
        int i6;
        Object[] objArr;
        Object[] objArr2;
        int i7;
        int i8;
        int i9;
        C5296l c5296l;
        int[] iArr;
        ArrayList arrayList2;
        int i10;
        int i11;
        int i12;
        C5296l c5296l2;
        int i13;
        Object objStartapp;
        C13006l c13006l2;
        int i14;
        C14944l c14944l3;
        Object obj4 = obj;
        if (this.ads) {
            AbstractC2032l.yandex("A call to createNode(), emitNode() or useNode() expected");
        }
        int i15 = this.remoteconfig;
        Object obj5 = C1867l.yandex;
        if (obj4 == null) {
            if (obj2 == null || i != 207 || obj2.equals(obj5)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.f14595continue, 3) ^ ((long) i), 3) ^ ((long) i15);
            } else {
                this.f14595continue = Long.rotateLeft(Long.rotateLeft(this.f14595continue, 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i15);
            }
            if (obj4 == null) {
                this.remoteconfig++;
            }
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (this.f14603switch) {
                this.f14600package.firebase++;
                c13006l2 = this.f14602strictfp;
                i14 = c13006l2.tapsense;
                if (z) {
                    c13006l2.m3519else(obj5, obj5, true, i);
                } else if (obj2 != null) {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    c13006l2.m3519else(obj4, obj2, false, i);
                } else {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    c13006l2.m3519else(obj4, obj5, false, i);
                }
                c14944l3 = this.isPro;
                if (c14944l3 != null) {
                    int i16 = (-2) - i14;
                    C1944l c1944l = new C1944l(-1, i, i16, -1);
                    c14944l3.purchase.subs(i16, new C17096l(-1, this.firebase - c14944l3.loadAd, 0));
                    c14944l3.amazon.add(c1944l);
                }
                tapsense(z, null);
                return;
            }
            if (i2 != 1 && this.advert) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.isPro == null) {
                int iMopub = this.f14600package.mopub();
                if (!z2 && iMopub == i) {
                    c5296l2 = this.f14600package;
                    i13 = c5296l2.mopub;
                    if (i13 < c5296l2.admob) {
                        objStartapp = c5296l2.startapp(c5296l2.loadAd, i13);
                    } else {
                        objStartapp = null;
                    }
                    if (AbstractC8576l.yandex(obj4, objStartapp)) {
                        m2138static(obj2, z);
                        z3 = z2;
                    }
                }
                c5296l = this.f14600package;
                iArr = c5296l.loadAd;
                arrayList2 = new ArrayList();
                if (c5296l.firebase <= 0) {
                    i10 = c5296l.mopub;
                    while (i10 < c5296l.admob) {
                        int i17 = i10 * 5;
                        int i18 = iArr[i17];
                        Object objStartapp2 = c5296l.startapp(iArr, i10);
                        i11 = iArr[i17 + 1];
                        if ((i11 & 1073741824) != 0) {
                            i12 = 1;
                        } else {
                            i12 = i11 & 67108863;
                        }
                        arrayList2.add(new C1944l(objStartapp2, i18, i10, i12));
                        i10 += iArr[i17 + 3];
                        z2 = z2;
                    }
                }
                z3 = z2;
                this.isPro = new C14944l(this.firebase, arrayList2);
            } else {
                z3 = z2;
            }
            c14944l = this.isPro;
            if (c14944l != null) {
                arrayList = c14944l.amazon;
                c16977l = c14944l.purchase;
                i3 = c14944l.loadAd;
                if (obj4 != null) {
                    objValueOf = new C4821l(Integer.valueOf(i), obj4);
                } else {
                    objValueOf = Integer.valueOf(i);
                }
                c13660l = ((C13843l) c14944l.billing.getValue()).yandex;
                objMopub = c13660l.mopub(objValueOf);
                if (objMopub == null) {
                    objMopub = null;
                } else if (objMopub instanceof C12463l) {
                    c12463l = (C12463l) objMopub;
                    Object objRemoteconfig = c12463l.remoteconfig(0);
                    if (c12463l.isPro()) {
                        c13660l.smaato(objValueOf);
                    }
                    if (c12463l.loadAd == 1) {
                        c13660l.vip(objValueOf, c12463l.mopub());
                    }
                    objMopub = objRemoteconfig;
                } else {
                    c13660l.smaato(objValueOf);
                }
                C1944l c1944l2 = (C1944l) objMopub;
                if (!z3 || c1944l2 == null) {
                    this.f14600package.firebase++;
                    this.f14603switch = true;
                    this.f14599native = null;
                    if (this.f14602strictfp.pro) {
                        C13006l c13006lAdmob = this.f14604synchronized.admob();
                        this.f14602strictfp = c13006lAdmob;
                        c13006lAdmob.m3520extends();
                        this.f14607volatile = false;
                        this.f14599native = null;
                    }
                    this.f14602strictfp.amazon();
                    c13006l = this.f14602strictfp;
                    int i19 = c13006l.tapsense;
                    if (z) {
                        c13006l.m3519else(obj5, obj5, true, i);
                        i4 = 0;
                    } else if (obj2 != null) {
                        if (obj != null) {
                            obj5 = obj;
                        }
                        i4 = 0;
                        c13006l.m3519else(obj5, obj2, false, i);
                    } else {
                        i4 = 0;
                        if (obj == null) {
                            obj3 = obj5;
                        } else {
                            obj3 = obj;
                        }
                        c13006l.m3519else(obj3, obj5, false, i);
                    }
                    this.f14598for = this.f14602strictfp.loadAd(i19);
                    int i20 = (-2) - i19;
                    C1944l c1944l3 = new C1944l(-1, i, i20, -1);
                    c16977l.subs(i20, new C17096l(-1, this.firebase - i3, i4));
                    arrayList.add(c1944l3);
                    ArrayList arrayList3 = new ArrayList();
                    if (z) {
                        i5 = i4;
                    } else {
                        i5 = this.firebase;
                    }
                    c14944l2 = new C14944l(i5, arrayList3);
                } else {
                    int i21 = c1944l2.crashlytics;
                    arrayList.add(c1944l2);
                    C17096l c17096l = (C17096l) c16977l.loadAd(i21);
                    this.firebase = (c17096l != null ? c17096l.loadAd : -1) + i3;
                    C17096l c17096l2 = (C17096l) c16977l.loadAd(i21);
                    int i22 = c17096l2 != null ? c17096l2.yandex : -1;
                    int i23 = c14944l.crashlytics;
                    int i24 = i22 - i23;
                    int i25 = 8;
                    if (i22 <= i23) {
                        i6 = i24;
                        if (i23 > i22) {
                            Object[] objArr3 = c16977l.crashlytics;
                            long[] jArr = c16977l.yandex;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i26 = 0;
                                while (true) {
                                    long j = jArr[i26];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i27 = 8 - ((~(i26 - length)) >>> 31);
                                        int i28 = 0;
                                        while (i28 < i27) {
                                            if ((j & 255) >= 128) {
                                                objArr2 = objArr3;
                                            } else {
                                                C17096l c17096l3 = (C17096l) objArr3[(i26 << 3) + i28];
                                                int i29 = c17096l3.yandex;
                                                if (i29 == i22) {
                                                    c17096l3.yandex = i23;
                                                    objArr2 = objArr3;
                                                } else {
                                                    objArr2 = objArr3;
                                                    if (i22 + 1 <= i29 && i29 < i23) {
                                                        c17096l3.yandex = i29 - 1;
                                                    }
                                                }
                                            }
                                            j >>= 8;
                                            i28++;
                                            objArr3 = objArr2;
                                        }
                                        objArr = objArr3;
                                        if (i27 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr = objArr3;
                                    }
                                    if (i26 == length) {
                                        break;
                                    }
                                    i26++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                    } else {
                        Object[] objArr4 = c16977l.crashlytics;
                        long[] jArr2 = c16977l.yandex;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i30 = 0;
                            while (true) {
                                long j2 = jArr2[i30];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i31 = 8 - ((~(i30 - length2)) >>> 31);
                                    int i32 = 0;
                                    while (i32 < i31) {
                                        if ((j2 & 255) < 128) {
                                            i9 = i25;
                                            C17096l c17096l4 = (C17096l) objArr4[(i30 << 3) + i32];
                                            i8 = i24;
                                            int i33 = c17096l4.yandex;
                                            if (i33 == i22) {
                                                c17096l4.yandex = i23;
                                            } else if (i23 <= i33 && i33 < i22) {
                                                c17096l4.yandex = i33 + 1;
                                            }
                                        } else {
                                            i8 = i24;
                                            i9 = i25;
                                        }
                                        j2 >>= i9;
                                        i32++;
                                        i25 = i9;
                                        i24 = i8;
                                    }
                                    i6 = i24;
                                    if (i31 != i25) {
                                        break;
                                    }
                                } else {
                                    i6 = i24;
                                }
                                if (i30 == length2) {
                                    break;
                                }
                                i30++;
                                i24 = i6;
                                i25 = 8;
                            }
                        } else {
                            i6 = i24;
                        }
                    }
                    C11275l c11275l = this.f14597extends;
                    int i34 = c11275l.billing;
                    C6956l c6956l = c11275l.yandex;
                    c11275l.billing = (i21 - c6956l.f14600package.mopub) + i34;
                    this.f14600package.ads(i21);
                    if (i6 > 0) {
                        c11275l.amazon(false);
                        C16535l c16535l = c11275l.amazon;
                        C5296l c5296l3 = c6956l.f14600package;
                        if (c5296l3.crashlytics > 0 && c16535l.crashlytics(-2) != (i7 = c5296l3.subs)) {
                            if (!c11275l.crashlytics && c11275l.purchase) {
                                c11275l.amazon(false);
                                c11275l.loadAd.yandex.isPro(C14645l.amazon);
                                c11275l.crashlytics = true;
                            }
                            if (i7 > 0) {
                                C12317l c12317lYandex = c5296l3.yandex(i7);
                                c16535l.purchase(i7);
                                c11275l.amazon(false);
                                C6323l c6323l = c11275l.loadAd.yandex;
                                c6323l.isPro(C6765l.amazon);
                                AbstractC12225l.smaato(c6323l, 0, c12317lYandex);
                                c11275l.crashlytics = true;
                            }
                        }
                        C6323l c6323l2 = c11275l.loadAd.yandex;
                        c6323l2.isPro(C18139l.amazon);
                        c6323l2.isPro[c6323l2.firebase - c6323l2.admob[c6323l2.subs - 1].loadAd] = i6;
                    }
                    m2138static(obj2, z);
                    c14944l2 = null;
                }
            } else {
                c14944l2 = null;
            }
            tapsense(z, c14944l2);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.f14595continue, 3) ^ ((long) (obj4 instanceof Enum ? ((Enum) obj4).ordinal() : obj4.hashCode())), 3);
        this.f14595continue = jRotateLeft;
        if (obj4 == null) {
            this.remoteconfig++;
        }
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f14603switch) {
            this.f14600package.firebase++;
            c13006l2 = this.f14602strictfp;
            i14 = c13006l2.tapsense;
            if (z) {
                c13006l2.m3519else(obj5, obj5, true, i);
            } else if (obj2 != null) {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                c13006l2.m3519else(obj4, obj2, false, i);
            } else {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                c13006l2.m3519else(obj4, obj5, false, i);
            }
            c14944l3 = this.isPro;
            if (c14944l3 != null) {
                int i110 = (-2) - i14;
                C1944l c1944l4 = new C1944l(-1, i, i110, -1);
                c14944l3.purchase.subs(i110, new C17096l(-1, this.firebase - c14944l3.loadAd, 0));
                c14944l3.amazon.add(c1944l4);
            }
            tapsense(z, null);
            return;
        }
        if (i2 != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.isPro == null) {
            int iMopub2 = this.f14600package.mopub();
            if (!z2) {
                c5296l2 = this.f14600package;
                i13 = c5296l2.mopub;
                if (i13 < c5296l2.admob) {
                    objStartapp = c5296l2.startapp(c5296l2.loadAd, i13);
                } else {
                    objStartapp = null;
                }
                if (AbstractC8576l.yandex(obj4, objStartapp)) {
                    m2138static(obj2, z);
                    z3 = z2;
                }
            }
            c5296l = this.f14600package;
            iArr = c5296l.loadAd;
            arrayList2 = new ArrayList();
            if (c5296l.firebase <= 0) {
                i10 = c5296l.mopub;
                while (i10 < c5296l.admob) {
                    int i111 = i10 * 5;
                    int i112 = iArr[i111];
                    Object objStartapp3 = c5296l.startapp(iArr, i10);
                    i11 = iArr[i111 + 1];
                    if ((i11 & 1073741824) != 0) {
                        i12 = 1;
                    } else {
                        i12 = i11 & 67108863;
                    }
                    arrayList2.add(new C1944l(objStartapp3, i112, i10, i12));
                    i10 += iArr[i111 + 3];
                    z2 = z2;
                }
            }
            z3 = z2;
            this.isPro = new C14944l(this.firebase, arrayList2);
        } else {
            z3 = z2;
        }
        c14944l = this.isPro;
        if (c14944l != null) {
            arrayList = c14944l.amazon;
            c16977l = c14944l.purchase;
            i3 = c14944l.loadAd;
            if (obj4 != null) {
                objValueOf = new C4821l(Integer.valueOf(i), obj4);
            } else {
                objValueOf = Integer.valueOf(i);
            }
            c13660l = ((C13843l) c14944l.billing.getValue()).yandex;
            objMopub = c13660l.mopub(objValueOf);
            if (objMopub == null) {
                objMopub = null;
            } else if (objMopub instanceof C12463l) {
                c12463l = (C12463l) objMopub;
                Object objRemoteconfig2 = c12463l.remoteconfig(0);
                if (c12463l.isPro()) {
                    c13660l.smaato(objValueOf);
                }
                if (c12463l.loadAd == 1) {
                    c13660l.vip(objValueOf, c12463l.mopub());
                }
                objMopub = objRemoteconfig2;
            } else {
                c13660l.smaato(objValueOf);
            }
            C1944l c1944l5 = (C1944l) objMopub;
            if (z3) {
            }
            this.f14600package.firebase++;
            this.f14603switch = true;
            this.f14599native = null;
            if (this.f14602strictfp.pro) {
                C13006l c13006lAdmob2 = this.f14604synchronized.admob();
                this.f14602strictfp = c13006lAdmob2;
                c13006lAdmob2.m3520extends();
                this.f14607volatile = false;
                this.f14599native = null;
            }
            this.f14602strictfp.amazon();
            c13006l = this.f14602strictfp;
            int i113 = c13006l.tapsense;
            if (z) {
                c13006l.m3519else(obj5, obj5, true, i);
                i4 = 0;
            } else if (obj2 != null) {
                if (obj != null) {
                    obj5 = obj;
                }
                i4 = 0;
                c13006l.m3519else(obj5, obj2, false, i);
            } else {
                i4 = 0;
                if (obj == null) {
                    obj3 = obj5;
                } else {
                    obj3 = obj;
                }
                c13006l.m3519else(obj3, obj5, false, i);
            }
            this.f14598for = this.f14602strictfp.loadAd(i113);
            int i210 = (-2) - i113;
            C1944l c1944l6 = new C1944l(-1, i, i210, -1);
            c16977l.subs(i210, new C17096l(-1, this.firebase - i3, i4));
            arrayList.add(c1944l6);
            ArrayList arrayList4 = new ArrayList();
            if (z) {
                i5 = i4;
            } else {
                i5 = this.firebase;
            }
            c14944l2 = new C14944l(i5, arrayList4);
        } else {
            c14944l2 = null;
        }
        tapsense(z, c14944l2);
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final void m2120catch() {
        C5296l c5296l = this.f14600package;
        int i = c5296l.subs;
        this.smaato = i >= 0 ? c5296l.loadAd[(i * 5) + 1] & 67108863 : 0;
        c5296l.tapsense();
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public final void m2121class(int i, Object obj) {
        m2119case(i, obj, null, 0);
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final void m2122continue(int i, C2767l c2767l) {
        m2119case(i, c2767l, null, 0);
    }

    public final boolean crashlytics(float f) {
        Object objApplovin = applovin();
        if ((objApplovin instanceof Float) && f == ((Number) objApplovin).floatValue()) {
            return false;
        }
        m2118break(Float.valueOf(f));
        return true;
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final void m2123default(int i) {
        int i2;
        int i3;
        if (this.isPro != null) {
            m2119case(i, null, null, 0);
            return;
        }
        if (this.ads) {
            AbstractC2032l.yandex("A call to createNode(), emitNode() or useNode() expected");
        }
        this.f14595continue = Long.rotateLeft(Long.rotateLeft(this.f14595continue, 3) ^ ((long) i), 3) ^ ((long) this.remoteconfig);
        this.remoteconfig++;
        C5296l c5296l = this.f14600package;
        boolean z = this.f14603switch;
        C13863l c13863l = C1867l.yandex;
        if (z) {
            c5296l.firebase++;
            this.f14602strictfp.m3519else(c13863l, c13863l, false, i);
            tapsense(false, null);
            return;
        }
        if (c5296l.mopub() == i && ((i3 = c5296l.mopub) >= c5296l.admob || (c5296l.loadAd[(i3 * 5) + 1] & 536870912) == 0)) {
            c5296l.Signature();
            tapsense(false, null);
            return;
        }
        if (c5296l.firebase <= 0 && (i2 = c5296l.mopub) != c5296l.admob) {
            int i4 = this.firebase;
            m2142synchronized();
            this.f14597extends.purchase(i4, c5296l.subscription());
            AbstractC15684l.yandex(i2, c5296l.mopub, this.subscription);
        }
        c5296l.firebase++;
        this.f14603switch = true;
        this.f14599native = null;
        if (this.f14602strictfp.pro) {
            C13006l c13006lAdmob = this.f14604synchronized.admob();
            this.f14602strictfp = c13006lAdmob;
            c13006lAdmob.m3520extends();
            this.f14607volatile = false;
            this.f14599native = null;
        }
        C13006l c13006l = this.f14602strictfp;
        c13006l.amazon();
        int i5 = c13006l.tapsense;
        c13006l.m3519else(c13863l, c13863l, false, i);
        this.f14598for = c13006l.loadAd(i5);
        tapsense(false, null);
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final void m2124else() {
        if (this.smaato != 0) {
            AbstractC2032l.yandex("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.f14603switch) {
            return;
        }
        C4224l c4224lPro = pro();
        if (c4224lPro != null) {
            int i = c4224lPro.loadAd;
            if ((i & 128) == 0) {
                c4224lPro.loadAd = i | 16;
            }
        }
        if (this.subscription.isEmpty()) {
            m2120catch();
        } else {
            m2134package();
        }
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public final void m2125final(int i) {
        m2119case(i, null, null, 0);
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final void m2126finally(int i, int i2) {
        int iM2146transient = m2146transient(i);
        if (iM2146transient != i2) {
            int i3 = i2 - iM2146transient;
            ArrayList arrayList = this.subs;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iM2146transient2 = m2146transient(i) + i3;
                m2137public(i, iM2146transient2);
                for (int i4 = size; -1 < i4; i4--) {
                    C14944l c14944l = (C14944l) arrayList.get(i4);
                    if (c14944l != null && c14944l.yandex(i, iM2146transient2)) {
                        size = i4 - 1;
                        break;
                    }
                }
                C5296l c5296l = this.f14600package;
                if (i < 0) {
                    i = c5296l.subs;
                } else if (c5296l.smaato(i)) {
                    return;
                } else {
                    i = this.f14600package.adcel(i);
                }
            }
        }
    }

    public final void firebase(Function0 function0) {
        if (!this.ads) {
            AbstractC2032l.yandex("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.ads = false;
        if (!this.f14603switch) {
            AbstractC2032l.yandex("createNode() can only be called when inserting");
        }
        C16535l c16535l = this.vip;
        int i = c16535l.loadAd[c16535l.crashlytics - 1];
        C13006l c13006l = this.f14602strictfp;
        C12317l c12317lLoadAd = c13006l.loadAd(c13006l.license);
        this.smaato++;
        C13182l c13182l = this.f14605throw;
        C6323l c6323l = c13182l.admob;
        c6323l.isPro(C11021l.purchase);
        AbstractC12225l.smaato(c6323l, 0, function0);
        c6323l.isPro[c6323l.firebase - c6323l.admob[c6323l.subs - 1].loadAd] = i;
        AbstractC12225l.smaato(c6323l, 1, c12317lLoadAd);
        C6323l c6323l2 = c13182l.subs;
        c6323l2.isPro(C11021l.billing);
        c6323l2.isPro[c6323l2.firebase - c6323l2.admob[c6323l2.subs - 1].loadAd] = i;
        AbstractC12225l.smaato(c6323l2, 0, c12317lLoadAd);
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final boolean m2127for(int i, boolean z) {
        C4224l c4224lPro;
        if ((i & 1) == 0 && (this.f14603switch || this.advert)) {
            InterfaceC14382l interfaceC14382l = this.f14593catch;
            if (interfaceC14382l != null && (c4224lPro = pro()) != null && interfaceC14382l.yandex()) {
                int i2 = c4224lPro.loadAd;
                if ((i2 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                c4224lPro.loadAd = i3;
                c4224lPro.loadAd = (this.advert ? i2 | 129 : i3 & (-129)) | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                C6323l c6323l = this.f14597extends.loadAd.yandex;
                c6323l.isPro(C15989l.amazon);
                AbstractC12225l.smaato(c6323l, 0, c4224lPro);
                this.loadAd.adcel(c4224lPro);
                return false;
            }
        } else if (!z && isVip()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public final void m2128goto(Object obj) {
        if (!this.f14603switch && this.f14600package.mopub() == 207 && !AbstractC8576l.yandex(this.f14600package.billing(), obj) && this.isVip < 0) {
            this.isVip = this.f14600package.mopub;
            this.advert = true;
        }
        m2119case(207, null, obj, 0);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m2129import() {
        this.remoteconfig = 0;
        this.f14600package = this.crashlytics.mopub();
        m2119case(100, null, null, 0);
        AbstractC0306l abstractC0306l = this.loadAd;
        abstractC0306l.tapsense();
        InterfaceC18556l interfaceC18556lSubs = abstractC0306l.subs();
        this.ad.purchase(this.pro ? 1 : 0);
        this.pro = billing(interfaceC18556lSubs);
        this.f14599native = null;
        if (!this.adcel) {
            this.adcel = abstractC0306l.purchase();
        }
        if (!this.applovin) {
            this.applovin = abstractC0306l.billing();
        }
        if (this.applovin) {
            interfaceC18556lSubs = ((C11890l) interfaceC18556lSubs).amazon(AbstractC12874l.yandex, new C3482l(advert()));
        }
        this.Signature = interfaceC18556lSubs;
        Set set = (Set) AbstractC9690l.billing(interfaceC18556lSubs, AbstractC6434l.yandex);
        if (set != null) {
            set.add(license());
            abstractC0306l.metrica(set);
        }
        long jMopub = abstractC0306l.mopub();
        m2119case((int) (jMopub ^ (jMopub >>> 32)), null, null, 0);
    }

    public final int inmobi(int i) {
        int iAdcel = this.f14600package.adcel(i) + 1;
        int i2 = 0;
        while (iAdcel < i) {
            if (!this.f14600package.firebase(iAdcel)) {
                i2++;
            }
            iAdcel += this.f14600package.loadAd[(iAdcel * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0090 A[LOOP:1: B:20:0x0043->B:35:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[EDGE_INSN: B:43:0x0093->B:36:0x0093 BREAK  A[LOOP:1: B:20:0x0043->B:35:0x0090], SYNTHETIC] */
    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final void m2130instanceof(C13660l c13660l) {
        ArrayList arrayList = this.subscription;
        for (int iSmaato = AbstractC14055l.smaato(arrayList); -1 < iSmaato; iSmaato--) {
            C4503l c4503l = (C4503l) arrayList.get(iSmaato);
            C12317l c12317l = c4503l.yandex.crashlytics;
            C12317l c12317lMopub = c12317l != null ? AbstractC0133l.mopub(c12317l) : null;
            if (c12317lMopub == null || !c12317lMopub.yandex()) {
                arrayList.remove(iSmaato);
            } else {
                int i = c4503l.loadAd;
                int i2 = c12317lMopub.yandex;
                if (i != i2) {
                    c4503l.loadAd = i2;
                }
            }
        }
        Object[] objArr = c13660l.loadAd;
        Object[] objArr2 = c13660l.crashlytics;
        long[] jArr = c13660l.yandex;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            C4224l c4224l = (C4224l) obj;
                            C12317l c12317l2 = c4224l.crashlytics;
                            if (c12317l2 != null) {
                                int i7 = AbstractC0133l.mopub(c12317l2).yandex;
                                if (obj2 == C18450l.f36031l) {
                                    obj2 = null;
                                }
                                arrayList.add(new C4503l(c4224l, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        AbstractC3826l.Signature(AbstractC15684l.yandex, arrayList);
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public final void m2131interface() {
        m2119case(125, null, null, 1);
        this.ads = true;
    }

    public final Object isPro(AbstractC5189l abstractC5189l) {
        return AbstractC9690l.billing(smaato(), abstractC5189l);
    }

    public final boolean isVip() {
        C4224l c4224lPro;
        return (this.f14603switch || this.advert || this.pro || (c4224lPro = pro()) == null || (c4224lPro.loadAd & 8) != 0) ? false : true;
    }

    public final InterfaceC11483l license() {
        C11619l c11619l = this.f14594class;
        if (c11619l != null) {
            return c11619l;
        }
        C11619l c11619l2 = new C11619l(this.admob);
        this.f14594class = c11619l2;
        return c11619l2;
    }

    public final void loadAd(Object obj, Function2 function2) {
        if (this.f14603switch) {
            C6323l c6323l = this.f14605throw.admob;
            c6323l.isPro(C1581l.amazon);
            AbstractC12225l.smaato(c6323l, 0, obj);
            AbstractC9464l.purchase(2, function2);
            AbstractC12225l.smaato(c6323l, 1, function2);
            return;
        }
        C11275l c11275l = this.f14597extends;
        c11275l.loadAd();
        C6323l c6323l2 = c11275l.loadAd.yandex;
        c6323l2.isPro(C1581l.amazon);
        AbstractC9464l.purchase(2, function2);
        AbstractC12225l.remoteconfig(c6323l2, 0, obj, 1, function2);
    }

    public final void metrica(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        metrica(this.f14600package.adcel(i), i2);
        if (this.f14600package.smaato(i)) {
            Object objVip = this.f14600package.vip(i);
            C11275l c11275l = this.f14597extends;
            c11275l.crashlytics();
            c11275l.admob.add(objVip);
        }
    }

    public final boolean mopub(boolean z) {
        Object objApplovin = applovin();
        if ((objApplovin instanceof Boolean) && z == ((Boolean) objApplovin).booleanValue()) {
            return false;
        }
        m2118break(Boolean.valueOf(z));
        return true;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final Object m2132native() {
        boolean z = this.f14603switch;
        C13863l c13863l = C1867l.yandex;
        if (!z) {
            Object objRemoteconfig = this.f14600package.remoteconfig();
            if (!this.advert || (objRemoteconfig instanceof C17420l)) {
                return objRemoteconfig instanceof InterfaceC17142l ? ((C6031l) ((InterfaceC17142l) objRemoteconfig)).yandex : objRemoteconfig;
            }
        } else if (this.ads) {
            AbstractC2032l.yandex("A call to createNode(), emitNode() or useNode() expected");
            return c13863l;
        }
        return c13863l;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX INFO: renamed from: new, reason: not valid java name */
    public final C6956l m2133new(int i) {
        C4224l c4224l;
        boolean z;
        m2123default(i);
        boolean z2 = this.f14603switch;
        C16543l c16543l = this.mopub;
        ArrayList arrayList = this.inmobi;
        C6931l c6931l = this.admob;
        if (z2) {
            C4224l c4224l2 = new C4224l(c6931l);
            arrayList.add(c4224l2);
            m2118break(c4224l2);
            c4224l2.purchase = this.premium;
            c4224l2.loadAd &= -17;
            c16543l.metrica();
            return this;
        }
        int i2 = this.f14600package.subs;
        ArrayList arrayList2 = this.subscription;
        int iAmazon = AbstractC15684l.amazon(i2, arrayList2);
        C4503l c4503l = iAmazon >= 0 ? (C4503l) arrayList2.remove(iAmazon) : null;
        Object objRemoteconfig = this.f14600package.remoteconfig();
        if (AbstractC8576l.yandex(objRemoteconfig, C1867l.yandex)) {
            c4224l = new C4224l(c6931l);
            m2118break(c4224l);
        } else {
            c4224l = (C4224l) objRemoteconfig;
        }
        if (c4503l == null) {
            int i3 = c4224l.loadAd;
            boolean z3 = (i3 & 64) != 0;
            if (z3) {
                c4224l.loadAd = i3 & (-65);
            }
            if (z3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        int i4 = c4224l.loadAd;
        c4224l.loadAd = z ? i4 | 8 : i4 & (-9);
        arrayList.add(c4224l);
        c4224l.purchase = this.premium;
        c4224l.loadAd &= -17;
        c16543l.metrica();
        int i5 = c4224l.loadAd;
        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            c4224l.loadAd = (i5 & (-257)) | AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
            C6323l c6323l = this.f14597extends.loadAd.yandex;
            c6323l.isPro(C6030l.amazon);
            AbstractC12225l.smaato(c6323l, 0, c4224l);
            if (!this.advert) {
                int i6 = c4224l.loadAd;
                if ((i6 & 128) != 0) {
                    this.advert = true;
                    this.isVip = this.f14600package.subs;
                    c4224l.loadAd = i6 | 1024;
                }
            }
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003e  */
    /* JADX WARN: Code duplicated, block: B:202:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0122 A[LOOP:7: B:37:0x00cb->B:56:0x0122, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x012b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0139  */
    /* JADX WARN: Code duplicated, block: B:68:0x0164  */
    /* JADX WARN: Code duplicated, block: B:69:0x0166  */
    /* JADX WARN: Code duplicated, block: B:72:0x016b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:73:0x0177
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void m2134package() {
        /*
            Method dump skipped, instruction units count: 892
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6956l.m2134package():void");
    }

    public final void premium(InterfaceC18556l interfaceC18556l, Object obj) {
        m2121class(126665345, null);
        applovin();
        m2118break(obj);
        long j = this.f14595continue;
        try {
            this.f14595continue = 126665345L;
            if (this.f14603switch) {
                C13006l.isVip(this.f14602strictfp);
            }
            boolean z = (this.f14603switch || AbstractC8576l.yandex(this.f14600package.billing(), interfaceC18556l)) ? false : true;
            if (z) {
                m2139strictfp(interfaceC18556l);
            }
            m2119case(202, AbstractC2032l.crashlytics, interfaceC18556l, 0);
            this.f14599native = null;
            boolean z2 = this.pro;
            this.pro = z;
            C15578l c15578l = new C15578l(-59194059, true, new C15707l(27, obj));
            AbstractC9464l.purchase(2, c15578l);
            c15578l.invoke(this, 1);
            this.pro = z2;
            startapp(false);
            this.f14599native = null;
            this.f14595continue = j;
            startapp(false);
        } catch (Throwable th) {
            try {
                AbstractC3605l.Signature(th, new C16549l(this, 2));
                throw th;
            } catch (Throwable th2) {
                startapp(false);
                this.f14599native = null;
                this.f14595continue = j;
                startapp(false);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final void m2135private(int i) throws Throwable {
        boolean zSmaato = this.f14600package.smaato(i);
        C11275l c11275l = this.f14597extends;
        if (zSmaato) {
            c11275l.crashlytics();
            Object objVip = this.f14600package.vip(i);
            c11275l.crashlytics();
            c11275l.admob.add(objVip);
        }
        m2116extends(this, i, zSmaato, 0);
        c11275l.crashlytics();
        if (zSmaato) {
            c11275l.yandex();
        }
    }

    public final C4224l pro() {
        if (this.signatures != 0) {
            return null;
        }
        ArrayList arrayList = this.inmobi;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (C4224l) AbstractC14814l.firebase(1, arrayList);
    }

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public final void m2136protected() {
        if (!this.ads) {
            AbstractC2032l.yandex("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.ads = false;
        if (this.f14603switch) {
            AbstractC2032l.yandex("useNode() called while inserting");
        }
        C5296l c5296l = this.f14600package;
        Object objVip = c5296l.vip(c5296l.subs);
        C11275l c11275l = this.f14597extends;
        c11275l.crashlytics();
        c11275l.admob.add(objVip);
        if (this.advert && (objVip instanceof InterfaceC0492l)) {
            c11275l.loadAd();
            c11275l.loadAd.yandex.isPro(C9660l.amazon);
        }
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final void m2137public(int i, int i2) {
        if (m2146transient(i) != i2) {
            if (i < 0) {
                C13440l c13440l = this.startapp;
                if (c13440l == null) {
                    c13440l = new C13440l();
                    this.startapp = c13440l;
                }
                c13440l.billing(i, i2);
                return;
            }
            int[] iArr = this.metrica;
            if (iArr == null) {
                iArr = new int[this.f14600package.crashlytics];
                AbstractC8669l.m2411package(-1, 0, 6, iArr);
                this.metrica = iArr;
            }
            iArr[i] = i2;
        }
    }

    public final boolean purchase(long j) {
        Object objApplovin = applovin();
        if ((objApplovin instanceof Long) && j == ((Number) objApplovin).longValue()) {
            return false;
        }
        m2118break(Long.valueOf(j));
        return true;
    }

    public final C10097l remoteconfig() {
        Collection collection;
        if (!this.loadAd.firebase()) {
            return null;
        }
        C10227l c10227lAdmob = AbstractC14055l.admob();
        C13006l c13006l = this.f14602strictfp;
        c10227lAdmob.addAll(AbstractC15096l.yandex(c13006l, null, c13006l.tapsense, null));
        C5296l c5296l = this.f14600package;
        boolean z = c5296l.billing;
        int[] iArr = c5296l.loadAd;
        if (z || c5296l.crashlytics == 0) {
            collection = C2580l.f5619l;
        } else {
            C15122l c15122l = new C15122l(c5296l);
            int iAdcel = c5296l.subs;
            Object objValueOf = Integer.valueOf(c5296l.smaato - AbstractC0736l.loadAd(iArr, iAdcel));
            while (iAdcel >= 0) {
                c15122l.crashlytics(c5296l.subs(iAdcel), c5296l.firebase(iAdcel) ? c5296l.startapp(iArr, iAdcel) : C1867l.yandex, c5296l.yandex.smaato(iAdcel), objValueOf);
                objValueOf = c5296l.yandex(iAdcel);
                iAdcel = c5296l.adcel(iAdcel);
            }
            collection = c15122l.f27617l;
        }
        c10227lAdmob.addAll(collection);
        c10227lAdmob.addAll(appmetrica());
        return new C10097l(AbstractC14055l.purchase(c10227lAdmob), this.applovin);
    }

    public final void signatures(ArrayList arrayList) {
        C5296l c5296l;
        C6956l c6956l = this;
        C9552l c9552l = c6956l.billing;
        C11275l c11275l = c6956l.f14597extends;
        C9552l c9552l2 = c11275l.loadAd;
        try {
            c11275l.loadAd = c9552l;
            c9552l.yandex.isPro(C12742l.amazon);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                C8195l c8195l = (C8195l) arrayList.get(i);
                AbstractC11411l abstractC11411l = (AbstractC11411l) c8195l.f17098l;
                abstractC11411l.getClass();
                C12317l c12317lMopub = AbstractC0133l.mopub(null);
                C2859l c2859lAmazon = AbstractC0736l.amazon(null);
                int iAmazon = c2859lAmazon.amazon(c12317lMopub);
                C6467l c6467l = new C6467l();
                c11275l.loadAd();
                C6323l c6323l = c11275l.loadAd.yandex;
                c6323l.isPro(C5618l.amazon);
                AbstractC12225l.remoteconfig(c6323l, 0, c6467l, 1, c12317lMopub);
                if (c2859lAmazon == c6956l.f14604synchronized) {
                    if (!c6956l.f14602strictfp.pro) {
                        AbstractC2032l.yandex("Check failed");
                    }
                    c6956l.Signature();
                }
                C5296l c5296lMopub = c2859lAmazon.mopub();
                try {
                    c5296lMopub.ads(iAmazon);
                    c11275l.billing = iAmazon;
                    C9552l c9552l3 = new C9552l();
                    try {
                        c5296l = c5296lMopub;
                        try {
                            m2145throws(null, null, null, C2580l.f5619l, new Cfinally(this, c9552l3, c5296lMopub, abstractC11411l, 14));
                            C9552l c9552l4 = c11275l.loadAd;
                            c9552l4.getClass();
                            if (!c9552l3.yandex.subs()) {
                                C6323l c6323l2 = c9552l4.yandex;
                                c6323l2.isPro(C2503l.amazon);
                                AbstractC12225l.remoteconfig(c6323l2, 0, c9552l3, 1, c6467l);
                            }
                            Unit unit = Unit.INSTANCE;
                            c5296l.crashlytics();
                            c11275l.loadAd.yandex.isPro(C0510l.amazon);
                            i++;
                            c6956l = this;
                        } catch (Throwable th) {
                            th = th;
                            c5296l.crashlytics();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        c5296l = c5296lMopub;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c5296l = c5296lMopub;
                }
            }
            c11275l.loadAd();
            c11275l.loadAd.yandex.isPro(C8140l.amazon);
            c11275l.billing = 0;
            c11275l.loadAd = c9552l2;
        } catch (Throwable th4) {
            c11275l.loadAd = c9552l2;
            throw th4;
        }
    }

    public final InterfaceC18556l smaato() {
        InterfaceC18556l interfaceC18556l;
        InterfaceC18556l interfaceC18556l2 = this.f14599native;
        if (interfaceC18556l2 != null) {
            return interfaceC18556l2;
        }
        int iAdcel = this.f14600package.subs;
        boolean z = this.f14603switch;
        C2767l c2767l = AbstractC2032l.crashlytics;
        if (z && this.f14607volatile) {
            int iInmobi = this.f14602strictfp.license;
            while (iInmobi > 0) {
                if (this.f14602strictfp.subscription(iInmobi) == 202 && AbstractC8576l.yandex(this.f14602strictfp.tapsense(iInmobi), c2767l)) {
                    InterfaceC18556l interfaceC18556l3 = (InterfaceC18556l) this.f14602strictfp.adcel(iInmobi);
                    this.f14599native = interfaceC18556l3;
                    return interfaceC18556l3;
                }
                C13006l c13006l = this.f14602strictfp;
                iInmobi = c13006l.inmobi(c13006l.loadAd, iInmobi);
            }
        }
        if (this.f14600package.crashlytics > 0) {
            while (iAdcel > 0) {
                if (this.f14600package.subs(iAdcel) == 202) {
                    C5296l c5296l = this.f14600package;
                    if (AbstractC8576l.yandex(c5296l.startapp(c5296l.loadAd, iAdcel), c2767l)) {
                        C16977l c16977l = this.license;
                        if (c16977l == null || (interfaceC18556l = (InterfaceC18556l) c16977l.loadAd(iAdcel)) == null) {
                            C5296l c5296l2 = this.f14600package;
                            interfaceC18556l = (InterfaceC18556l) c5296l2.loadAd(c5296l2.loadAd, iAdcel);
                        }
                        this.f14599native = interfaceC18556l;
                        return interfaceC18556l;
                    }
                }
                iAdcel = this.f14600package.adcel(iAdcel);
            }
        }
        InterfaceC18556l interfaceC18556l4 = this.Signature;
        this.f14599native = interfaceC18556l4;
        return interfaceC18556l4;
    }

    /* JADX WARN: Code duplicated, block: B:150:0x039e  */
    /* JADX WARN: Code duplicated, block: B:202:0x0510  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    public final void startapp(boolean z) {
        long jRotateRight;
        C16535l c16535l;
        ArrayList arrayList;
        int i;
        ?? r3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C16535l c16535l2;
        int i7;
        C6295l c6295l;
        int i8;
        int i9;
        ArrayList arrayList2;
        ArrayList arrayList3;
        HashSet hashSet;
        int i10;
        int i11;
        Object[] objArr;
        long[] jArr;
        int i12;
        Object[] objArr2;
        long[] jArr2;
        int i13;
        Object[] objArr3;
        long[] jArr3;
        int i14;
        Object[] objArr4;
        long[] jArr4;
        long jRotateRight2;
        C16535l c16535l3 = this.vip;
        int i15 = c16535l3.loadAd[c16535l3.crashlytics - 2] - 1;
        boolean z2 = this.f14603switch;
        C13863l c13863l = C1867l.yandex;
        if (z2) {
            C13006l c13006l = this.f14602strictfp;
            int i16 = c13006l.license;
            int iSubscription = c13006l.subscription(i16);
            Object objTapsense = this.f14602strictfp.tapsense(i16);
            Object objAdcel = this.f14602strictfp.adcel(i16);
            if (objTapsense != null) {
                jRotateRight2 = Long.rotateRight(Long.rotateRight(this.f14595continue, 3) ^ ((long) (objTapsense instanceof Enum ? ((Enum) objTapsense).ordinal() : objTapsense.hashCode())), 3);
            } else if (objAdcel == null || iSubscription != 207 || objAdcel.equals(c13863l)) {
                jRotateRight2 = Long.rotateRight(Long.rotateRight(this.f14595continue ^ ((long) i15), 3) ^ ((long) iSubscription), 3);
            } else {
                this.f14595continue = Long.rotateRight(Long.rotateRight(this.f14595continue ^ ((long) i15), 3) ^ ((long) objAdcel.hashCode()), 3);
            }
            this.f14595continue = jRotateRight2;
        } else {
            C5296l c5296l = this.f14600package;
            int i17 = c5296l.subs;
            int iSubs = c5296l.subs(i17);
            C5296l c5296l2 = this.f14600package;
            Object objStartapp = c5296l2.startapp(c5296l2.loadAd, i17);
            C5296l c5296l3 = this.f14600package;
            Object objLoadAd = c5296l3.loadAd(c5296l3.loadAd, i17);
            if (objStartapp != null) {
                jRotateRight = Long.rotateRight(Long.rotateRight(this.f14595continue, 3) ^ ((long) (objStartapp instanceof Enum ? ((Enum) objStartapp).ordinal() : objStartapp.hashCode())), 3);
            } else if (objLoadAd == null || iSubs != 207 || objLoadAd.equals(c13863l)) {
                jRotateRight = Long.rotateRight(Long.rotateRight(this.f14595continue ^ ((long) i15), 3) ^ ((long) iSubs), 3);
            } else {
                this.f14595continue = Long.rotateRight(Long.rotateRight(this.f14595continue ^ ((long) i15), 3) ^ ((long) objLoadAd.hashCode()), 3);
            }
            this.f14595continue = jRotateRight;
        }
        int i18 = this.smaato;
        C14944l c14944l = this.isPro;
        ArrayList arrayList4 = this.subscription;
        C11275l c11275l = this.f14597extends;
        if (c14944l != null) {
            C16977l c16977l = c14944l.purchase;
            int i19 = c14944l.loadAd;
            ArrayList arrayList5 = c14944l.yandex;
            if (arrayList5.size() > 0) {
                ArrayList arrayList6 = c14944l.amazon;
                HashSet hashSet2 = new HashSet(arrayList6.size());
                int size = arrayList6.size();
                for (int i20 = 0; i20 < size; i20++) {
                    hashSet2.add(arrayList6.get(i20));
                }
                i = -1;
                C6295l c6295l2 = AbstractC13087l.yandex;
                C6295l c6295l3 = new C6295l();
                int size2 = arrayList6.size();
                int size3 = arrayList5.size();
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                while (i21 < size3) {
                    C1944l c1944l = (C1944l) arrayList5.get(i21);
                    if (hashSet2.contains(c1944l)) {
                        c16535l2 = c16535l3;
                        i7 = i21;
                        if (!c6295l3.crashlytics(c1944l)) {
                            int i24 = i22;
                            if (i24 < size2) {
                                C1944l c1944l2 = (C1944l) arrayList6.get(i24);
                                if (c1944l2 != c1944l) {
                                    C17096l c17096l = (C17096l) c16977l.loadAd(c1944l2.crashlytics);
                                    int i25 = c17096l != null ? c17096l.loadAd : -1;
                                    c6295l3.yandex(c1944l2);
                                    i10 = i23;
                                    if (i25 != i10) {
                                        C17096l c17096l2 = (C17096l) c16977l.loadAd(c1944l2.crashlytics);
                                        int i26 = c17096l2 != null ? c17096l2.crashlytics : c1944l2.amazon;
                                        c6295l = c6295l3;
                                        int i27 = i25 + i19;
                                        i8 = size2;
                                        int i28 = i10 + i19;
                                        if (i26 > 0) {
                                            i9 = i19;
                                            int i29 = c11275l.smaato;
                                            if (i29 > 0) {
                                                arrayList2 = arrayList5;
                                                if (c11275l.isPro == i27 - i29 && c11275l.firebase == i28 - i29) {
                                                    c11275l.smaato = i29 + i26;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                            c11275l.crashlytics();
                                            c11275l.isPro = i27;
                                            c11275l.firebase = i28;
                                            c11275l.smaato = i26;
                                        } else {
                                            i9 = i19;
                                            arrayList2 = arrayList5;
                                            c11275l.getClass();
                                        }
                                        if (i25 <= i10) {
                                            int i30 = i26;
                                            arrayList4 = arrayList4;
                                            arrayList3 = arrayList6;
                                            hashSet = hashSet2;
                                            if (i10 > i25) {
                                                Object[] objArr5 = c16977l.crashlytics;
                                                long[] jArr5 = c16977l.yandex;
                                                int length = jArr5.length - 2;
                                                if (length >= 0) {
                                                    int i31 = 0;
                                                    while (true) {
                                                        long j = jArr5[i31];
                                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i32 = 8 - ((~(i31 - length)) >>> 31);
                                                            int i33 = 0;
                                                            while (i33 < i32) {
                                                                if ((j & 255) < 128) {
                                                                    objArr2 = objArr5;
                                                                    C17096l c17096l3 = (C17096l) objArr5[(i31 << 3) + i33];
                                                                    jArr2 = jArr5;
                                                                    int i34 = c17096l3.loadAd;
                                                                    i13 = i25;
                                                                    if (i25 <= i34 && i34 < i13 + i30) {
                                                                        c17096l3.loadAd = (i34 - i13) + i10;
                                                                    } else if (i13 + 1 <= i34 && i34 < i10) {
                                                                        c17096l3.loadAd = i34 - i30;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr5;
                                                                    jArr2 = jArr5;
                                                                    i13 = i25;
                                                                }
                                                                j >>= 8;
                                                                i33++;
                                                                jArr5 = jArr2;
                                                                objArr5 = objArr2;
                                                                i25 = i13;
                                                            }
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i12 = i25;
                                                            if (i32 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i12 = i25;
                                                        }
                                                        if (i31 == length) {
                                                            break;
                                                        }
                                                        i31++;
                                                        jArr5 = jArr;
                                                        objArr5 = objArr;
                                                        i25 = i12;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr6 = c16977l.crashlytics;
                                            long[] jArr6 = c16977l.yandex;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                arrayList3 = arrayList6;
                                                hashSet = hashSet2;
                                                int i35 = 0;
                                                while (true) {
                                                    long j2 = jArr6[i35];
                                                    int i36 = i26;
                                                    arrayList4 = arrayList4;
                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i37 = 8 - ((~(i35 - length2)) >>> 31);
                                                        int i38 = 0;
                                                        while (i38 < i37) {
                                                            if ((j2 & 255) < 128) {
                                                                i14 = i38;
                                                                C17096l c17096l4 = (C17096l) objArr6[(i35 << 3) + i38];
                                                                objArr4 = objArr6;
                                                                int i39 = c17096l4.loadAd;
                                                                jArr4 = jArr6;
                                                                if (i25 <= i39 && i39 < i25 + i36) {
                                                                    c17096l4.loadAd = (i39 - i25) + i10;
                                                                } else if (i10 <= i39 && i39 < i25) {
                                                                    c17096l4.loadAd = i39 + i36;
                                                                }
                                                            } else {
                                                                i14 = i38;
                                                                objArr4 = objArr6;
                                                                jArr4 = jArr6;
                                                            }
                                                            j2 >>= 8;
                                                            i38 = i14 + 1;
                                                            objArr6 = objArr4;
                                                            jArr6 = jArr4;
                                                        }
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                        if (i37 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                    }
                                                    if (i35 == length2) {
                                                        break;
                                                    }
                                                    i35++;
                                                    arrayList4 = arrayList4;
                                                    i26 = i36;
                                                    objArr6 = objArr3;
                                                    jArr6 = jArr3;
                                                }
                                            }
                                        }
                                        i11 = i7;
                                    } else {
                                        c6295l = c6295l3;
                                        i8 = size2;
                                        i9 = i19;
                                        arrayList2 = arrayList5;
                                    }
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i11 = i7;
                                } else {
                                    arrayList4 = arrayList4;
                                    c6295l = c6295l3;
                                    i8 = size2;
                                    i9 = i19;
                                    arrayList2 = arrayList5;
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i10 = i23;
                                    i11 = i7 + 1;
                                }
                                i22 = i24 + 1;
                                C17096l c17096l5 = (C17096l) c16977l.loadAd(c1944l2.crashlytics);
                                int i40 = i10 + (c17096l5 != null ? c17096l5.crashlytics : c1944l2.amazon);
                                i21 = i11;
                                c14944l = c14944l;
                                c6295l3 = c6295l;
                                size2 = i8;
                                i19 = i9;
                                arrayList5 = arrayList2;
                                arrayList6 = arrayList3;
                                hashSet2 = hashSet;
                                arrayList4 = arrayList4;
                                i23 = i40;
                                c16535l3 = c16535l2;
                            } else {
                                i22 = i24;
                                c16535l3 = c16535l2;
                                i21 = i7;
                            }
                        }
                    } else {
                        c16535l2 = c16535l3;
                        C17096l c17096l6 = (C17096l) c16977l.loadAd(c1944l.crashlytics);
                        int i41 = c17096l6 != null ? c17096l6.loadAd : -1;
                        int i42 = c1944l.crashlytics;
                        i7 = i21;
                        c11275l.purchase(i41 + i19, c1944l.amazon);
                        c14944l.yandex(i42, 0);
                        c11275l.billing = (i42 - c11275l.yandex.f14600package.mopub) + c11275l.billing;
                        this.f14600package.ads(i42);
                        m2142synchronized();
                        this.f14600package.subscription();
                        AbstractC15684l.yandex(i42, this.f14600package.loadAd[(i42 * 5) + 3] + i42, arrayList4);
                    }
                    i21 = i7 + 1;
                    c16535l3 = c16535l2;
                }
                c16535l = c16535l3;
                arrayList = arrayList4;
                c11275l.crashlytics();
                if (arrayList5.size() > 0) {
                    C5296l c5296l4 = this.f14600package;
                    c11275l.billing = (c5296l4.admob - c11275l.yandex.f14600package.mopub) + c11275l.billing;
                    c5296l4.tapsense();
                }
            } else {
                c16535l = c16535l3;
                arrayList = arrayList4;
                i = -1;
            }
        } else {
            c16535l = c16535l3;
            arrayList = arrayList4;
            i = -1;
        }
        boolean z3 = this.f14603switch;
        if (!z3) {
            C5296l c5296l5 = this.f14600package;
            int i43 = c5296l5.remoteconfig - c5296l5.smaato;
            if (i43 > 0) {
                if (i43 > 0) {
                    c11275l.amazon(false);
                    C16535l c16535l4 = c11275l.amazon;
                    C5296l c5296l6 = c11275l.yandex.f14600package;
                    if (c5296l6.crashlytics > 0 && c16535l4.crashlytics(-2) != (i6 = c5296l6.subs)) {
                        if (!c11275l.crashlytics && c11275l.purchase) {
                            c11275l.amazon(false);
                            c11275l.loadAd.yandex.isPro(C14645l.amazon);
                            c11275l.crashlytics = true;
                        }
                        if (i6 > 0) {
                            C12317l c12317lYandex = c5296l6.yandex(i6);
                            c16535l4.purchase(i6);
                            c11275l.amazon(false);
                            C6323l c6323l = c11275l.loadAd.yandex;
                            c6323l.isPro(C6765l.amazon);
                            AbstractC12225l.smaato(c6323l, 0, c12317lYandex);
                            c11275l.crashlytics = true;
                        }
                    }
                    C6323l c6323l2 = c11275l.loadAd.yandex;
                    c6323l2.isPro(C11627l.amazon);
                    c6323l2.isPro[c6323l2.firebase - c6323l2.admob[c6323l2.subs - 1].loadAd] = i43;
                } else {
                    c11275l.getClass();
                }
            }
        }
        int i44 = this.firebase;
        while (true) {
            C5296l c5296l7 = this.f14600package;
            if (c5296l7.firebase > 0 || (i5 = c5296l7.mopub) == c5296l7.admob) {
                break;
            }
            m2142synchronized();
            c11275l.purchase(i44, this.f14600package.subscription());
            AbstractC15684l.yandex(i5, this.f14600package.mopub, arrayList);
        }
        if (z3) {
            if (z) {
                C13182l c13182l = this.f14605throw;
                C6323l c6323l3 = c13182l.subs;
                if (c6323l3.subs == 0) {
                    AbstractC2032l.yandex("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                C6323l c6323l4 = c13182l.admob;
                AbstractC1387l[] abstractC1387lArr = c6323l3.admob;
                int i45 = c6323l3.subs - 1;
                c6323l3.subs = i45;
                AbstractC1387l abstractC1387l = abstractC1387lArr[i45];
                abstractC1387lArr[i45] = null;
                c6323l4.isPro(abstractC1387l);
                Object[] objArr7 = c6323l3.smaato;
                Object[] objArr8 = c6323l4.smaato;
                int i46 = c6323l4.remoteconfig;
                int i47 = abstractC1387l.crashlytics;
                int i48 = c6323l3.remoteconfig;
                int i49 = i48 - i47;
                System.arraycopy(objArr7, i49, objArr8, i46 - i47, i48 - i49);
                Object[] objArr9 = c6323l3.smaato;
                int i50 = c6323l3.remoteconfig;
                Arrays.fill(objArr9, i50 - i47, i50, (Object) null);
                int[] iArr = c6323l3.isPro;
                int[] iArr2 = c6323l4.isPro;
                int i51 = c6323l4.firebase;
                int i52 = abstractC1387l.loadAd;
                int i53 = c6323l3.firebase;
                AbstractC8669l.ad(i51 - i52, i53 - i52, iArr, iArr2, i53);
                c6323l3.remoteconfig -= i47;
                c6323l3.firebase -= i52;
                i18 = 1;
            }
            C5296l c5296l8 = this.f14600package;
            if (c5296l8.firebase <= 0) {
                AbstractC5363l.yandex("Unbalanced begin/end empty");
            }
            c5296l8.firebase--;
            C13006l c13006l2 = this.f14602strictfp;
            int i54 = c13006l2.license;
            c13006l2.isPro();
            if (this.f14600package.firebase <= 0) {
                int i55 = (-2) - i54;
                this.f14602strictfp.firebase();
                this.f14602strictfp.purchase(true);
                C12317l c12317l = this.f14598for;
                boolean zSubs = this.f14605throw.admob.subs();
                C2859l c2859l = this.f14604synchronized;
                if (zSubs) {
                    c11275l.loadAd();
                    c11275l.amazon(false);
                    C16535l c16535l5 = c11275l.amazon;
                    C5296l c5296l9 = c11275l.yandex.f14600package;
                    if (c5296l9.crashlytics <= 0 || c16535l5.crashlytics(-2) == (i4 = c5296l9.subs)) {
                        i3 = 1;
                    } else {
                        if (!c11275l.crashlytics && c11275l.purchase) {
                            c11275l.amazon(false);
                            c11275l.loadAd.yandex.isPro(C14645l.amazon);
                            c11275l.crashlytics = true;
                        }
                        if (i4 > 0) {
                            C12317l c12317lYandex2 = c5296l9.yandex(i4);
                            c16535l5.purchase(i4);
                            c11275l.amazon(false);
                            C6323l c6323l5 = c11275l.loadAd.yandex;
                            c6323l5.isPro(C6765l.amazon);
                            AbstractC12225l.smaato(c6323l5, 0, c12317lYandex2);
                            i3 = 1;
                            c11275l.crashlytics = true;
                        } else {
                            i3 = 1;
                        }
                    }
                    c11275l.crashlytics();
                    C6323l c6323l6 = c11275l.loadAd.yandex;
                    c6323l6.isPro(C2366l.amazon);
                    AbstractC12225l.remoteconfig(c6323l6, 0, c12317l, i3, c2859l);
                    r3 = 0;
                } else {
                    C13182l c13182l2 = this.f14605throw;
                    c11275l.loadAd();
                    c11275l.amazon(false);
                    C16535l c16535l6 = c11275l.amazon;
                    C5296l c5296l10 = c11275l.yandex.f14600package;
                    if (c5296l10.crashlytics > 0 && c16535l6.crashlytics(-2) != (i2 = c5296l10.subs)) {
                        if (!c11275l.crashlytics && c11275l.purchase) {
                            c11275l.amazon(false);
                            c11275l.loadAd.yandex.isPro(C14645l.amazon);
                            c11275l.crashlytics = true;
                        }
                        if (i2 > 0) {
                            C12317l c12317lYandex3 = c5296l10.yandex(i2);
                            c16535l6.purchase(i2);
                            c11275l.amazon(false);
                            C6323l c6323l7 = c11275l.loadAd.yandex;
                            c6323l7.isPro(C6765l.amazon);
                            AbstractC12225l.smaato(c6323l7, 0, c12317lYandex3);
                            c11275l.crashlytics = true;
                        }
                    }
                    c11275l.crashlytics();
                    C6323l c6323l8 = c11275l.loadAd.yandex;
                    c6323l8.isPro(C13923l.amazon);
                    int i56 = c6323l8.remoteconfig - c6323l8.admob[c6323l8.subs - 1].crashlytics;
                    Object[] objArr10 = c6323l8.smaato;
                    objArr10[i56] = c12317l;
                    objArr10[i56 + 1] = c2859l;
                    objArr10[i56 + 2] = c13182l2;
                    this.f14605throw = new C13182l();
                    r3 = 0;
                }
                this.f14603switch = r3;
                if (this.crashlytics.f6220l != 0) {
                    m2137public(i55, r3);
                    m2126finally(i55, i18);
                }
            }
        } else {
            if (z) {
                c11275l.yandex();
            }
            int i57 = c11275l.yandex.f14600package.subs;
            C16535l c16535l7 = c11275l.amazon;
            int i58 = i;
            if (c16535l7.crashlytics(i58) > i57) {
                AbstractC2032l.yandex("Missed recording an endGroup");
            }
            if (c16535l7.crashlytics(i58) == i57) {
                c11275l.amazon(false);
                c16535l7.amazon();
                c11275l.loadAd.yandex.isPro(C16010l.amazon);
            }
            int i59 = this.f14600package.subs;
            if (i18 != m2146transient(i59)) {
                m2126finally(i59, i18);
            }
            if (z) {
                i18 = 1;
            }
            this.f14600package.purchase();
            c11275l.crashlytics();
        }
        ArrayList arrayList7 = this.subs;
        C14944l c14944l2 = (C14944l) arrayList7.remove(arrayList7.size() - 1);
        if (c14944l2 != null && !z3) {
            c14944l2.crashlytics++;
        }
        this.isPro = c14944l2;
        this.firebase = c16535l.amazon() + i18;
        this.remoteconfig = c16535l.amazon();
        this.smaato = c16535l.amazon() + i18;
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public final void m2138static(Object obj, boolean z) {
        if (z) {
            C5296l c5296l = this.f14600package;
            if (c5296l.firebase <= 0) {
                if ((c5296l.loadAd[(c5296l.mopub * 5) + 1] & 1073741824) == 0) {
                    AbstractC5363l.yandex("Expected a node group");
                }
                c5296l.Signature();
                return;
            }
            return;
        }
        if (obj != null && this.f14600package.billing() != obj) {
            C11275l c11275l = this.f14597extends;
            c11275l.getClass();
            c11275l.amazon(false);
            C6323l c6323l = c11275l.loadAd.yandex;
            c6323l.isPro(C12340l.amazon);
            AbstractC12225l.smaato(c6323l, 0, obj);
        }
        this.f14600package.Signature();
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final void m2139strictfp(InterfaceC18556l interfaceC18556l) {
        C16977l c16977l = this.license;
        if (c16977l == null) {
            c16977l = new C16977l();
            this.license = c16977l;
        }
        c16977l.subs(this.f14600package.mopub, interfaceC18556l);
    }

    public final void subs() {
        this.isPro = null;
        this.firebase = 0;
        this.smaato = 0;
        this.f14595continue = 0L;
        this.ads = false;
        C11275l c11275l = this.f14597extends;
        c11275l.crashlytics = false;
        c11275l.amazon.crashlytics = 0;
        c11275l.billing = 0;
        c11275l.purchase = true;
        c11275l.mopub = 0;
        c11275l.admob.clear();
        c11275l.subs = -1;
        c11275l.isPro = -1;
        c11275l.firebase = -1;
        c11275l.smaato = 0;
        this.inmobi.clear();
        this.metrica = null;
        this.startapp = null;
    }

    public final void subscription() {
        startapp(false);
        this.loadAd.crashlytics();
        startapp(false);
        C11275l c11275l = this.f14597extends;
        if (c11275l.crashlytics) {
            c11275l.amazon(false);
            c11275l.amazon(false);
            c11275l.loadAd.yandex.isPro(C16010l.amazon);
            c11275l.crashlytics = false;
        }
        c11275l.loadAd();
        if (c11275l.amazon.crashlytics != 0) {
            AbstractC2032l.yandex("Missed recording an endGroup()");
        }
        if (!this.subs.isEmpty()) {
            AbstractC2032l.yandex("Start/end imbalance");
        }
        subs();
        this.f14600package.crashlytics();
        this.pro = this.ad.amazon() != 0;
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public final void m2140super() {
        m2119case(125, null, null, 2);
        this.ads = true;
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final void m2141switch() {
        m2119case(-127, null, null, 0);
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void m2142synchronized() throws Throwable {
        int i;
        m2135private(this.f14600package.mopub);
        C11275l c11275l = this.f14597extends;
        c11275l.amazon(false);
        C16535l c16535l = c11275l.amazon;
        C6956l c6956l = c11275l.yandex;
        C5296l c5296l = c6956l.f14600package;
        if (c5296l.crashlytics > 0 && c16535l.crashlytics(-2) != (i = c5296l.subs)) {
            if (!c11275l.crashlytics && c11275l.purchase) {
                c11275l.amazon(false);
                c11275l.loadAd.yandex.isPro(C14645l.amazon);
                c11275l.crashlytics = true;
            }
            if (i > 0) {
                C12317l c12317lYandex = c5296l.yandex(i);
                c16535l.purchase(i);
                c11275l.amazon(false);
                C6323l c6323l = c11275l.loadAd.yandex;
                c6323l.isPro(C6765l.amazon);
                AbstractC12225l.smaato(c6323l, 0, c12317lYandex);
                c11275l.crashlytics = true;
            }
        }
        c11275l.loadAd.yandex.isPro(C8740l.amazon);
        int i2 = c11275l.billing;
        C5296l c5296l2 = c6956l.f14600package;
        c11275l.billing = c5296l2.loadAd[(c5296l2.mopub * 5) + 3] + i2;
    }

    public final void tapsense(boolean z, C14944l c14944l) {
        this.subs.add(this.isPro);
        this.isPro = c14944l;
        int i = this.smaato;
        C16535l c16535l = this.vip;
        c16535l.purchase(i);
        c16535l.purchase(this.remoteconfig);
        c16535l.purchase(this.firebase);
        if (z) {
            this.firebase = 0;
        }
        this.smaato = 0;
        this.remoteconfig = 0;
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final C11890l m2143this(InterfaceC18556l interfaceC18556l, C11890l c11890l) {
        C11890l c11890l2 = (C11890l) interfaceC18556l;
        c11890l2.getClass();
        C12992l c12992l = new C12992l(c11890l2);
        c12992l.f25462l = c11890l2;
        c12992l.putAll(c11890l);
        C11890l c11890lSubs = c12992l.build();
        m2122continue(204, AbstractC2032l.amazon);
        applovin();
        m2118break(c11890lSubs);
        applovin();
        m2118break(c11890l);
        startapp(false);
        return c11890lSubs;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0091  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e6  */
    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final void m2144throw() {
        long jRotateLeft;
        if (this.subscription.isEmpty()) {
            this.smaato = this.f14600package.subscription() + this.smaato;
            return;
        }
        C5296l c5296l = this.f14600package;
        int iMopub = c5296l.mopub();
        int[] iArr = c5296l.loadAd;
        int i = c5296l.mopub;
        Object objStartapp = i < c5296l.admob ? c5296l.startapp(iArr, i) : null;
        Object objBilling = c5296l.billing();
        int i2 = this.remoteconfig;
        C13863l c13863l = C1867l.yandex;
        if (objStartapp == null) {
            if (objBilling == null || iMopub != 207 || objBilling.equals(c13863l)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.f14595continue, 3) ^ ((long) iMopub), 3) ^ ((long) i2);
            } else {
                this.f14595continue = Long.rotateLeft(Long.rotateLeft(this.f14595continue, 3) ^ ((long) objBilling.hashCode()), 3) ^ ((long) i2);
            }
            m2138static(null, (iArr[(c5296l.mopub * 5) + 1] & 1073741824) != 0);
            m2134package();
            c5296l.purchase();
            if (objStartapp != null) {
                if (objStartapp instanceof Enum) {
                    this.f14595continue = Long.rotateRight(Long.rotateRight(this.f14595continue, 3) ^ ((long) ((Enum) objStartapp).ordinal()), 3);
                } else {
                    this.f14595continue = Long.rotateRight(Long.rotateRight(this.f14595continue, 3) ^ ((long) objStartapp.hashCode()), 3);
                }
            }
            if (objBilling == null && iMopub == 207 && !objBilling.equals(c13863l)) {
                this.f14595continue = Long.rotateRight(Long.rotateRight(this.f14595continue ^ ((long) i2), 3) ^ ((long) objBilling.hashCode()), 3);
                return;
            } else {
                this.f14595continue = Long.rotateRight(((long) iMopub) ^ Long.rotateRight(this.f14595continue ^ ((long) i2), 3), 3);
            }
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.f14595continue, 3) ^ ((long) (objStartapp instanceof Enum ? ((Enum) objStartapp).ordinal() : objStartapp.hashCode())), 3);
        this.f14595continue = jRotateLeft;
        m2138static(null, (iArr[(c5296l.mopub * 5) + 1] & 1073741824) != 0);
        m2134package();
        c5296l.purchase();
        if (objStartapp != null) {
            if (objBilling == null) {
            }
            this.f14595continue = Long.rotateRight(((long) iMopub) ^ Long.rotateRight(this.f14595continue ^ ((long) i2), 3), 3);
        } else if (objStartapp instanceof Enum) {
            this.f14595continue = Long.rotateRight(Long.rotateRight(this.f14595continue, 3) ^ ((long) ((Enum) objStartapp).ordinal()), 3);
        } else {
            this.f14595continue = Long.rotateRight(Long.rotateRight(this.f14595continue, 3) ^ ((long) objStartapp.hashCode()), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0059 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:18:0x0038, B:21:0x0040, B:23:0x0048, B:25:0x004e, B:26:0x0052, B:27:0x0053, B:29:0x0059, B:22:0x0044), top: B:34:0x0005, inners: #1 }] */
    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final Object m2145throws(C6931l c6931l, C6931l c6931l2, Integer num, List list, Function0 function0) {
        Object objInvoke;
        boolean z = this.f14606throws;
        int i = this.firebase;
        try {
            this.f14606throws = true;
            this.firebase = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C8195l c8195l = (C8195l) list.get(i2);
                C4224l c4224l = (C4224l) c8195l.f17098l;
                Object obj = c8195l.f17097l;
                if (obj != null) {
                    m2117abstract(c4224l, obj);
                } else {
                    m2117abstract(c4224l, null);
                }
            }
            if (c6931l == null) {
                objInvoke = function0.invoke();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (c6931l2 == null || c6931l2.equals(c6931l) || iIntValue < 0) {
                    objInvoke = function0.invoke();
                } else {
                    c6931l.f14545l = c6931l2;
                    c6931l.f14534l = iIntValue;
                    try {
                        objInvoke = function0.invoke();
                        c6931l.f14545l = null;
                        c6931l.f14534l = 0;
                    } catch (Throwable th) {
                        c6931l.f14545l = null;
                        c6931l.f14534l = 0;
                        throw th;
                    }
                }
                if (objInvoke == null) {
                    objInvoke = function0.invoke();
                }
            }
            this.f14606throws = z;
            this.firebase = i;
            return objInvoke;
        } catch (Throwable th2) {
            this.f14606throws = z;
            this.firebase = i;
            throw th2;
        }
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public final int m2146transient(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.metrica;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.f14600package.metrica(i) : i2;
        }
        C13440l c13440l = this.startapp;
        if (c13440l == null || c13440l.crashlytics(i) < 0) {
            return 0;
        }
        int iCrashlytics = c13440l.crashlytics(i);
        if (iCrashlytics >= 0) {
            return c13440l.crashlytics[iCrashlytics];
        }
        AbstractC13082l.purchase("Cannot find value for key " + i);
        throw null;
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public final void m2147try(Object obj) {
        if (obj instanceof InterfaceC6752l) {
            C6031l c6031l = new C6031l((InterfaceC6752l) obj, this.remoteconfig - 1);
            if (this.f14603switch) {
                C6323l c6323l = this.f14597extends.loadAd.yandex;
                c6323l.isPro(C3765l.amazon);
                AbstractC12225l.smaato(c6323l, 0, c6031l);
            }
            this.amazon.add(obj);
            obj = c6031l;
        }
        m2118break(obj);
    }

    public final void vip(C13660l c13660l, Function2 function2) {
        ArrayList arrayList = this.subscription;
        if (this.f14606throws) {
            AbstractC2032l.yandex("Reentrant composition is not supported");
        }
        this.mopub.metrica();
        Trace.beginSection("Compose:recompose");
        try {
            long jMopub = AbstractC9620l.isPro().mopub();
            this.premium = (int) (jMopub ^ (jMopub >>> 32));
            this.license = null;
            m2130instanceof(c13660l);
            this.firebase = 0;
            this.f14606throws = true;
            try {
                m2129import();
                Object objApplovin = applovin();
                if (objApplovin != function2 && function2 != null) {
                    m2118break(function2);
                }
                C8957l c8957l = this.appmetrica;
                C17893l c17893lPurchase = AbstractC8020l.purchase();
                try {
                    c17893lPurchase.crashlytics(c8957l);
                    C2767l c2767l = AbstractC2032l.yandex;
                    if (function2 != null) {
                        m2122continue(200, c2767l);
                        AbstractC9464l.purchase(2, function2);
                        function2.invoke(this, 1);
                        startapp(false);
                    } else if (!this.pro || objApplovin == null || objApplovin.equals(C1867l.yandex)) {
                        m2144throw();
                    } else {
                        m2122continue(200, c2767l);
                        AbstractC9464l.purchase(2, objApplovin);
                        Function2 function3 = (Function2) objApplovin;
                        AbstractC9464l.purchase(2, function3);
                        function3.invoke(this, 1);
                        startapp(false);
                    }
                    c17893lPurchase.vip(c17893lPurchase.f34846l - 1);
                    subscription();
                    this.f14606throws = false;
                    arrayList.clear();
                    if (!this.f14602strictfp.pro) {
                        AbstractC2032l.yandex("Check failed");
                    }
                    Signature();
                    Unit unit = Unit.INSTANCE;
                    Trace.endSection();
                } catch (Throwable th) {
                    c17893lPurchase.vip(c17893lPurchase.f34846l - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    AbstractC3605l.Signature(th2, new C16549l(this, 1));
                    throw th2;
                } catch (Throwable th3) {
                    this.f14606throws = false;
                    arrayList.clear();
                    yandex();
                    if (!this.f14602strictfp.pro) {
                        AbstractC2032l.yandex("Check failed");
                    }
                    Signature();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final void m2148volatile(int i, int i2, int i3) {
        C5296l c5296l = this.f14600package;
        if (i == i2) {
            i3 = i;
        } else if (i != i3 && i2 != i3) {
            if (c5296l.adcel(i) == i2) {
                i3 = i2;
            } else if (c5296l.adcel(i2) == i) {
                i3 = i;
            } else if (c5296l.adcel(i) == c5296l.adcel(i2)) {
                i3 = c5296l.adcel(i);
            } else {
                int iAdcel = i;
                int i4 = 0;
                while (iAdcel > 0 && iAdcel != i3) {
                    iAdcel = c5296l.adcel(iAdcel);
                    i4++;
                }
                int iAdcel2 = i2;
                int i5 = 0;
                while (iAdcel2 > 0 && iAdcel2 != i3) {
                    iAdcel2 = c5296l.adcel(iAdcel2);
                    i5++;
                }
                int i6 = i4 - i5;
                int iAdcel3 = i;
                for (int i7 = 0; i7 < i6; i7++) {
                    iAdcel3 = c5296l.adcel(iAdcel3);
                }
                int i8 = i5 - i4;
                int iAdcel4 = i2;
                for (int i9 = 0; i9 < i8; i9++) {
                    iAdcel4 = c5296l.adcel(iAdcel4);
                }
                i3 = iAdcel3;
                for (int iAdcel5 = iAdcel4; i3 != iAdcel5; iAdcel5 = c5296l.adcel(iAdcel5)) {
                    i3 = c5296l.adcel(i3);
                }
            }
        }
        while (i > 0 && i != i3) {
            if (c5296l.smaato(i)) {
                this.f14597extends.yandex();
            }
            i = c5296l.adcel(i);
        }
        metrica(i2, i3);
    }

    public final void yandex() {
        subs();
        this.subs.clear();
        this.vip.crashlytics = 0;
        this.tapsense.crashlytics = 0;
        this.ad.crashlytics = 0;
        this.license = null;
        C13182l c13182l = this.f14605throw;
        c13182l.subs.mopub();
        c13182l.admob.mopub();
        this.f14595continue = 0L;
        this.signatures = 0;
        this.ads = false;
        this.f14603switch = false;
        this.advert = false;
        this.f14606throws = false;
        this.isVip = -1;
        C5296l c5296l = this.f14600package;
        if (!c5296l.billing) {
            c5296l.crashlytics();
        }
        if (this.f14602strictfp.pro) {
            return;
        }
        Signature();
    }
}
