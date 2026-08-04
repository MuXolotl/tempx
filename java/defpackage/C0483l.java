package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؑٞۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0483l implements InterfaceC18298l {
    public final C10086l amazon;
    public final C10086l crashlytics;
    public final C10086l loadAd;
    public final C10086l purchase;
    public final C9879l yandex;

    public C0483l(C9879l c9879l) {
        this.yandex = c9879l;
        EnumC6302l enumC6302l = EnumC6302l.f13255l;
        this.loadAd = AbstractC8020l.smaato(enumC6302l);
        this.crashlytics = AbstractC8020l.smaato(enumC6302l);
        Boolean bool = Boolean.FALSE;
        this.amazon = AbstractC8020l.smaato(bool);
        this.purchase = AbstractC8020l.smaato(bool);
    }

    public final void admob(int i, C15578l c15578l, C6956l c6956l, InterfaceC17242l interfaceC17242l) {
        int i2;
        c6956l.m2133new(558183018);
        if ((i & 6) == 0) {
            i2 = i | (c6956l.admob(c15578l) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? 32 : 16;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36046l, c6956l, 6);
            long j = c6956l.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l, c1853lYandex, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
            InterfaceC17242l interfaceC17242lPurchase = AbstractC10409l.purchase(AbstractC0080l.amazon(C4346l.f8873l, 1.0f));
            C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.billing, C18450l.f36040l, c6956l, 54);
            long j2 = c6956l.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lPurchase);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i4, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            c15578l.invoke(c6956l, Integer.valueOf(i2 & 14));
            c6956l.startapp(true);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5311l(this, c15578l, interfaceC17242l, i, 0);
        }
    }

    public final void amazon(C14974l c14974l, C15578l c15578l, C15578l c15578l2, C15578l c15578l3, C15578l c15578l4, C15578l c15578l5, C15578l c15578l6, C6956l c6956l, int i) {
        c6956l.m2133new(923320485);
        int i2 = i | (c6956l.billing(c14974l) ? 4 : 2) | (c6956l.admob(this) ? 8388608 : 4194304);
        if (c6956l.m2127for(i2 & 1, (4793491 & i2) != 4793490)) {
            AbstractC15576l.crashlytics(AbstractC2697l.subscription(AbstractC0080l.crashlytics(C4346l.f8873l, 1.0f), AbstractC2697l.amazon), c15578l, c15578l4, AbstractC14566l.amazon(-1666407883, new C17130l(c14974l, this), c6956l), AbstractC14566l.amazon(-906273644, new C17130l(this, c14974l), c6956l), c15578l3, c15578l2, c15578l6, c15578l5, c6956l, 115043760);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C14710l(this, c14974l, c15578l, c15578l2, c15578l3, c15578l4, c15578l5, c15578l6, i);
        }
    }

    public final void billing(C0217l c0217l, C6956l c6956l, int i) {
        C0483l c0483l;
        C6956l c6956l2;
        c6956l.m2133new(-747511150);
        int i2 = 2;
        int i3 = (c6956l.billing(c0217l) ? 4 : 2) | i | (c6956l.admob(this) ? 32 : 16);
        if (c6956l.m2127for(i3 & 1, (i3 & 19) != 18)) {
            c0483l = this;
            c6956l2 = c6956l;
            c0483l.purchase(c0217l.yandex, c0217l.loadAd, c0217l.amazon, c0217l.purchase, c6956l2, (i3 << 9) & 57344);
        } else {
            c0483l = this;
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Cpublic(c0483l, c0217l, i, i2);
        }
    }

    public final void crashlytics(final InterfaceC17242l interfaceC17242l, final EnumC12501l enumC12501l, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final boolean z7, C6956l c6956l, final int i) {
        int i2;
        boolean z8;
        boolean z9;
        c6956l.m2133new(46084757);
        if ((i & 6) == 0) {
            i2 = i | (c6956l.billing(interfaceC17242l) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (c6956l.amazon(enumC12501l == null ? -1 : enumC12501l.ordinal()) ? 32 : 16) | (c6956l.mopub(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.mopub(z2) ? 2048 : 1024) | (c6956l.mopub(z3) ? 16384 : 8192) | (c6956l.mopub(z4) ? 131072 : 65536) | (c6956l.mopub(z5) ? 1048576 : 524288) | (c6956l.mopub(z6) ? 8388608 : 4194304) | (c6956l.mopub(z7) ? 67108864 : 33554432) | (c6956l.admob(this) ? 536870912 : 268435456);
        if (c6956l.m2127for(i3 & 1, (306783379 & i3) != 306783378)) {
            C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.billing, C18450l.f36040l, c6956l, 54);
            long j = c6956l.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            C9879l c9879l = this.yandex;
            C4346l c4346l = C4346l.f8873l;
            C13863l c13863l = C1867l.yandex;
            if (z6) {
                c6956l.m2123default(-297212159);
                boolean zAdmob = c6956l.admob(c9879l);
                Object objM2132native = c6956l.m2132native();
                if (zAdmob || objM2132native == c13863l) {
                    objM2132native = new Cconst(0, c9879l, C9879l.class, "cycleRepeat", "cycleRepeat()V", 0, 0, 1);
                    c6956l.m2147try(objM2132native);
                }
                AbstractC17824l.crashlytics(enumC12501l, (Function0) ((InterfaceC5059l) objM2132native), c6956l, (i3 >> 3) & 14);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(-297035583);
                AbstractC9334l.yandex(c6956l, c4346l);
                c6956l.startapp(false);
            }
            if (z5) {
                z8 = false;
                c6956l.m2123default(-346908879);
            } else {
                c6956l.m2123default(-296953464);
                if (z4) {
                    c6956l.m2123default(-296925657);
                    boolean zAdmob2 = c6956l.admob(c9879l);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new Cconst(0, c9879l, C9879l.class, "skipBackwards", "skipBackwards()V", 0, 0, 2);
                        c6956l.m2147try(objM2132native2);
                    }
                    z8 = false;
                    AbstractC17824l.purchase((Function0) ((InterfaceC5059l) objM2132native2), c6956l, 0);
                    c6956l.startapp(false);
                } else {
                    c6956l.m2123default(-296814553);
                    boolean zAdmob3 = c6956l.admob(c9879l);
                    Object objM2132native3 = c6956l.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        objM2132native3 = new Cconst(0, c9879l, C9879l.class, "skipToPrevious", "skipToPrevious()V", 0, 0, 3);
                        c6956l.m2147try(objM2132native3);
                    }
                    z8 = false;
                    AbstractC17824l.admob((Function0) ((InterfaceC5059l) objM2132native3), c6956l, 0);
                    c6956l.startapp(false);
                }
            }
            c6956l.startapp(z8);
            boolean zAdmob4 = c6956l.admob(c9879l);
            Object objM2132native4 = c6956l.m2132native();
            if (zAdmob4 || objM2132native4 == c13863l) {
                objM2132native4 = new Cconst(0, c9879l, C9879l.class, "cyclePlayPause", "cyclePlayPause()V", 0, 0, 4);
                c6956l.m2147try(objM2132native4);
            }
            int i5 = i3 >> 6;
            AbstractC17824l.loadAd(i5 & 1008, c6956l, (Function0) ((InterfaceC5059l) objM2132native4), z2, z3);
            if (z5) {
                z9 = false;
                c6956l.m2123default(-346908879);
            } else {
                c6956l.m2123default(-296479598);
                if (z4) {
                    c6956l.m2123default(-296451543);
                    boolean zAdmob5 = c6956l.admob(c9879l);
                    Object objM2132native5 = c6956l.m2132native();
                    if (zAdmob5 || objM2132native5 == c13863l) {
                        objM2132native5 = new Cconst(0, c9879l, C9879l.class, "skipForwards", "skipForwards()V", 0, 0, 5);
                        c6956l.m2147try(objM2132native5);
                    }
                    z9 = false;
                    AbstractC17824l.billing((Function0) ((InterfaceC5059l) objM2132native5), c6956l, 0);
                    c6956l.startapp(false);
                } else {
                    c6956l.m2123default(-296342609);
                    boolean zAdmob6 = c6956l.admob(c9879l);
                    Object objM2132native6 = c6956l.m2132native();
                    if (zAdmob6 || objM2132native6 == c13863l) {
                        objM2132native6 = new Cconst(0, c9879l, C9879l.class, "skipToNext", "skipToNext()V", 0, 0, 6);
                        c6956l.m2147try(objM2132native6);
                    }
                    z9 = false;
                    AbstractC17824l.mopub((Function0) ((InterfaceC5059l) objM2132native6), c6956l, 0);
                    c6956l.startapp(false);
                }
            }
            c6956l.startapp(z9);
            if (z6) {
                c6956l.m2123default(-296187857);
                boolean zAdmob7 = c6956l.admob(c9879l);
                Object objM2132native7 = c6956l.m2132native();
                if (zAdmob7 || objM2132native7 == c13863l) {
                    objM2132native7 = new Cconst(0, c9879l, C9879l.class, "cycleShuffle", "cycleShuffle()V", 0, 0, 7);
                    c6956l.m2147try(objM2132native7);
                }
                AbstractC17824l.amazon((i5 & 14) | ((i3 >> 21) & 112), c6956l, (Function0) ((InterfaceC5059l) objM2132native7), z, z7);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(-295963231);
                AbstractC9334l.yandex(c6956l, c4346l);
                c6956l.startapp(false);
            }
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lٖؖ۠
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f8534l.crashlytics(interfaceC17242l, enumC12501l, z, z2, z3, z4, z5, z6, z7, (C6956l) obj, AbstractC0545l.purchase(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v8, types: [lؚِؑ] */
    /* JADX WARN: Type inference failed for: r1v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.lang.Object, lؑٞۘ] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v5, types: [lؚِؑ] */
    /* JADX WARN: Type inference failed for: r4v8, types: [lؚِؑ] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void firebase(final EnumC6302l enumC6302l, final boolean z, final boolean z2, final boolean z3, final C15178l c15178l, C6956l c6956l, final int i) {
        ?? r11;
        C13863l c13863l;
        int i2;
        ?? r4;
        ?? r5;
        Object c2176l;
        ?? r13;
        c6956l.m2133new(-1970470144);
        int i3 = i | (c6956l.amazon(enumC6302l.ordinal()) ? 4 : 2) | (c6956l.mopub(z) ? 32 : 16) | (c6956l.mopub(z2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.mopub(z3) ? 2048 : 1024) | (c6956l.admob(c15178l) ? 16384 : 8192) | (c6956l.admob(this) ? 131072 : 65536);
        if (c6956l.m2127for(i3 & 1, (74899 & i3) != 74898)) {
            boolean z4 = enumC6302l == EnumC6302l.f13254l;
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l2 = C1867l.yandex;
            if (zAdmob || objM2132native == c13863l2) {
                r11 = 0;
                c13863l = c13863l2;
                C2176l c2176l2 = new C2176l(1, this, C0483l.class, "switchToLyrics", "switchToLyrics(Z)V", 0, 0, 0);
                c6956l.m2147try(c2176l2);
                objM2132native = c2176l2;
            } else {
                r11 = 0;
                c13863l = c13863l2;
            }
            int i4 = i3 >> 6;
            int i5 = i4 & 7168;
            int i6 = i5 | 384;
            smaato(z4, (Function1) ((InterfaceC5059l) objM2132native), AbstractC15290l.crashlytics, c6956l, i6);
            C14421l c14421lYandex = AbstractC1923l.yandex(c6956l, r11);
            C15578l c15578l = AbstractC15290l.billing;
            boolean zAdmob2 = c6956l.admob(c15178l);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob2 || objM2132native2 == c13863l) {
                objM2132native2 = new C9636l((int) r11, c15178l);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC15645l.amazon(c14421lYandex, c15578l, c15178l, null, (Function0) objM2132native2, false, AbstractC14566l.amazon(755205533, new C8096l(this, 3), c6956l), c6956l, (i4 & 896) | 100663344, 232);
            C9879l c9879l = this.yandex;
            if (z2) {
                c6956l.m2123default(1339028126);
                if (z3) {
                    c6956l.m2123default(1339071061);
                    boolean zAdmob3 = c6956l.admob(c9879l);
                    Object objM2132native3 = c6956l.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        C2176l c2176l3 = new C2176l(1, c9879l, C9879l.class, "openVkMixConfiguration", "openVkMixConfiguration(Z)V", 0, 0, 2);
                        c6956l.m2147try(c2176l3);
                        objM2132native3 = c2176l3;
                    }
                    smaato(false, (Function1) ((InterfaceC5059l) objM2132native3), AbstractC15290l.admob, c6956l, i5 | 390);
                    r13 = c6956l;
                } else {
                    C6956l c6956l2 = c6956l;
                    c6956l2.m2123default(1283426402);
                    r13 = c6956l2;
                }
                r13.startapp(r11);
                r13.startapp(r11);
                i2 = i5;
                r5 = r13;
            } else {
                if (z) {
                    i2 = i5;
                    C6956l c6956l3 = c6956l;
                    c6956l3.m2123default(1283426402);
                    r4 = c6956l3;
                } else {
                    c6956l.m2123default(1339541083);
                    ?? r23 = enumC6302l != EnumC6302l.f13253l ? r11 : 1;
                    boolean zAdmob4 = c6956l.admob(this);
                    Object objM2132native4 = c6956l.m2132native();
                    if (zAdmob4 || objM2132native4 == c13863l) {
                        i2 = i5;
                        C2176l c2176l4 = new C2176l(1, this, C0483l.class, "switchToQueue", "switchToQueue(Z)V", 0, 0, 3);
                        c6956l.m2147try(c2176l4);
                        objM2132native4 = c2176l4;
                    } else {
                        i2 = i5;
                    }
                    C6956l c6956l4 = c6956l;
                    smaato(r23, (Function1) ((InterfaceC5059l) objM2132native4), AbstractC15290l.subs, c6956l4, i6);
                    r4 = c6956l4;
                }
                r4.startapp(r11);
                r5 = r4;
            }
            boolean zAdmob5 = r5.admob(c9879l);
            Object objM2132native5 = r5.m2132native();
            if (zAdmob5 || objM2132native5 == c13863l) {
                c2176l = new C2176l(1, c9879l, C9879l.class, "openTrackMenu", "openTrackMenu(Z)V", 0, 0, 4);
                r5.m2147try(c2176l);
            } else {
                c2176l = objM2132native5;
            }
            smaato(false, (Function1) ((InterfaceC5059l) c2176l), AbstractC15290l.isPro, r5, i2 | 390);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(enumC6302l, z, z2, z3, c15178l, i) { // from class: lْؕ۠

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ boolean f25660l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ EnumC6302l f25661l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ boolean f25663l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ boolean f25664l;

                /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                public final /* synthetic */ C15178l f25665l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(1);
                    this.f25662l.firebase(this.f25661l, this.f25660l, this.f25664l, this.f25663l, this.f25665l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public final void isPro(boolean z, C15578l c15578l, C15578l c15578l2, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(1879550361);
        int i2 = i | (c6956l.mopub(z) ? 4 : 2) | (c6956l.billing(interfaceC17242l) ? 2048 : 1024);
        int i3 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            int iAdmob = AbstractC6363l.admob(0, 1, c6956l);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zAmazon = c6956l.amazon(iAdmob);
            Object objM2132native = c6956l.m2132native();
            if (zAmazon || objM2132native == C1867l.yandex) {
                objM2132native = new C2221l(iAdmob, 0);
                c6956l.m2147try(objM2132native);
            }
            AbstractC7741l.loadAd(boolValueOf, interfaceC17242l, (Function1) objM2132native, null, "[AbsolutionNP] Menu expand", null, AbstractC14566l.amazon(-1379025892, new C11050l(c15578l, c15578l2, i3), c6956l), c6956l, (i2 & 14) | 1597440 | ((i2 >> 6) & 112), 40);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C8076l(this, z, c15578l, c15578l2, interfaceC17242l, i, 1);
        }
    }

    public final void loadAd(boolean z, InterfaceC17242l interfaceC17242l, C15578l c15578l, C6956l c6956l, int i) {
        c6956l.m2133new(39549172);
        int i2 = (c6956l.mopub(z) ? 4 : 2) | i | (c6956l.admob(this) ? 2048 : 1024);
        if (!c6956l.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            c6956l.m2124else();
        } else if (z) {
            c6956l.m2123default(1388534414);
            mopub(((i2 >> 3) & 896) | 54, c15578l, c6956l, interfaceC17242l);
            c6956l.startapp(false);
        } else {
            c6956l.m2123default(1388667311);
            admob(((i2 >> 3) & 896) | 54, c15578l, c6956l, interfaceC17242l);
            c6956l.startapp(false);
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C7159l(this, z, interfaceC17242l, c15578l, i, 0);
        }
    }

    public final void mopub(int i, C15578l c15578l, C6956l c6956l, InterfaceC17242l interfaceC17242l) {
        int i2;
        c6956l.m2133new(-1203396246);
        if ((i & 6) == 0) {
            i2 = i | (c6956l.admob(c15578l) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? 32 : 16;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36044l, c6956l, 6);
            long j = c6956l.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l, c5062lYandex, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
            C11205l c11205l = AbstractC0080l.loadAd;
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.billing, C18450l.f36034l, c6956l, 54);
            long j2 = c6956l.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, c11205l);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c1853lYandex, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i4, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            AbstractC2812l.pro(i2 & 14, c15578l, c6956l, true);
            AbstractC0555l.crashlytics(null, 0.0f, ((C18718l) c6956l.isPro(AbstractC5992l.yandex)).amazon, c6956l, 0, 3);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5311l(this, c15578l, interfaceC17242l, i, 1);
        }
    }

    public final void purchase(final int i, int i2, final float f, final boolean z, C6956l c6956l, final int i3) {
        int i4;
        C0483l c0483l;
        final int i5;
        c6956l.m2133new(-1334066723);
        if ((i3 & 6) == 0) {
            i4 = (c6956l.amazon(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c6956l.amazon(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c6956l.crashlytics(f) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i3 & 24576) == 0) {
            i4 |= c6956l.admob(this) ? 16384 : 8192;
        }
        if (c6956l.m2127for(i4 & 1, (i4 & 8339) != 8338)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = new C13765l(0.0f);
                c6956l.m2147try(objM2132native);
            }
            C13765l c13765l = (C13765l) objM2132native;
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = AbstractC14814l.isPro(c6956l);
            }
            C2403l c2403l = (C2403l) objM2132native2;
            final float fAdmob = (((Boolean) C10053l.crashlytics(c2403l, c6956l, 6).getValue()).booleanValue() || ((Boolean) AbstractC17780l.yandex(c2403l, c6956l, 6).getValue()).booleanValue()) ? c13765l.admob() : i;
            c0483l = this;
            i5 = i2;
            AbstractC14775l.loadAd(AbstractC14566l.amazon(-607101070, new C16771l(i5, fAdmob, c0483l, c2403l, c13765l), c6956l), AbstractC14566l.amazon(-1647392909, new Function2() { // from class: lؘۛؕ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C6956l c6956l2 = (C6956l) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                        InterfaceC12244l interfaceC12244lLoadAd = AbstractC16245l.loadAd(f, null, "", null, c6956l2, 3072, 22);
                        C10707l c10707l = AbstractC5992l.yandex;
                        long j = ((C18718l) c6956l2.isPro(c10707l)).crashlytics;
                        long j2 = ((C18718l) c6956l2.isPro(c10707l)).amazon;
                        InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), 8.0f, 22.0f, 8.0f, 0.0f, 8);
                        boolean zBilling = c6956l2.billing(interfaceC12244lLoadAd);
                        Object objM2132native3 = c6956l2.m2132native();
                        C13863l c13863l2 = C1867l.yandex;
                        if (zBilling || objM2132native3 == c13863l2) {
                            objM2132native3 = new C18355l(interfaceC12244lLoadAd, 0);
                            c6956l2.m2147try(objM2132native3);
                        }
                        Function0 function0 = (Function0) objM2132native3;
                        Object objM2132native4 = c6956l2.m2132native();
                        if (objM2132native4 == c13863l2) {
                            objM2132native4 = new C13206l(1);
                            c6956l2.m2147try(objM2132native4);
                        }
                        AbstractC4332l.loadAd(function0, interfaceC17242lStartapp, j, j2, 1, 0.0f, (Function1) objM2132native4, c6956l2, 1769472, 0);
                    } else {
                        c6956l2.m2124else();
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), AbstractC14566l.amazon(1607282548, new Function2() { // from class: lؘٗۦ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C6956l c6956l2 = (C6956l) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                        AbstractC14775l.yandex((int) fAdmob, i5, c6956l2, 0);
                    } else {
                        c6956l2.m2124else();
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), c6956l, 438);
        } else {
            c0483l = this;
            i5 = i2;
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            final C0483l c0483l2 = c0483l;
            final int i6 = i5;
            c4224lAds.amazon = new Function2() { // from class: lٌّۡ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f17997l.purchase(i, i6, f, z, (C6956l) obj, AbstractC0545l.purchase(i3 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public final void remoteconfig() {
        this.purchase.setValue(Boolean.FALSE);
        EnumC6302l enumC6302l = (EnumC6302l) this.crashlytics.getValue();
        if (enumC6302l == EnumC6302l.f13257l) {
            enumC6302l = null;
        }
        if (enumC6302l == null) {
            enumC6302l = EnumC6302l.f13255l;
        }
        this.loadAd.setValue(enumC6302l);
    }

    public final void smaato(boolean z, Function1 function1, C15578l c15578l, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(-947962726);
        if ((i & 6) == 0) {
            i2 = (c6956l.mopub(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(c15578l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.admob(this) ? 2048 : 1024;
        }
        int i3 = i2;
        if (c6956l.m2127for(i3 & 1, (i3 & 1171) != 1170)) {
            long j = C9735l.isPro;
            C10707l c10707l = AbstractC5992l.yandex;
            AbstractC7470l.amazon(z, function1, AbstractC12442l.inmobi(c6956l), null, false, AbstractC12442l.pro(j, ((C18718l) c6956l.isPro(c10707l)).yandex, ((C18718l) c6956l.isPro(c10707l)).amazon, ((C18718l) c6956l.isPro(c10707l)).yandex, c6956l), AbstractC0676l.purchase(c6956l), c15578l, c6956l, (i3 & 126) | ((i3 << 15) & 29360128), 24);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5485l(this, z, function1, c15578l, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0087  */
    public final void subs(C6956l c6956l, int i) {
        c6956l.m2133new(125264729);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        int i3 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            C9879l c9879l = this.yandex;
            AbstractC18643l abstractC18643l = c9879l.isPro().loadAd;
            if (abstractC18643l instanceof AudioTrack) {
                AudioTrack audioTrack = (AudioTrack) abstractC18643l;
                if (audioTrack.purchase() == 3 || audioTrack.purchase() == 2) {
                    c6956l.m2123default(-606554775);
                } else {
                    c6956l.m2123default(-564822203);
                    boolean zAdmob = c6956l.admob(c9879l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        Object cconst = new Cconst(0, c9879l, C9879l.class, "onShareTapped", "onShareTapped()V", 0, 0, 10);
                        c6956l.m2147try(cconst);
                        objM2132native = cconst;
                    }
                    AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC15290l.loadAd, c6956l, 1572864, 62);
                }
            } else {
                c6956l.m2123default(-606554775);
            }
            c6956l.startapp(false);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C8096l(this, i, i3);
        }
    }

    public final EnumC6302l vip() {
        return (EnumC6302l) this.loadAd.getValue();
    }

    @Override // defpackage.InterfaceC18298l
    public final void yandex(C6956l c6956l, int i) {
        long j;
        c6956l.m2133new(1153530198);
        int i2 = 2;
        int i3 = (c6956l.admob(this) ? 4 : 2) | i;
        int i4 = 0;
        if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
            C1424l c1424l = VKXApplication.f36627l;
            InterfaceC14029l interfaceC14029l = null;
            if (c1424l == null) {
                c1424l = null;
            }
            InterfaceC6942l interfaceC6942lYandex = ((InterfaceC15829l) c1424l.f3602l).yandex();
            C1424l c1424l2 = VKXApplication.f36627l;
            if (c1424l2 == null) {
                c1424l2 = null;
            }
            Object obj = c1424l2.f3602l;
            InterfaceC8714l interfaceC8714lLoadAd = AbstractC3700l.loadAd(interfaceC6942lYandex, (C18554l) ((AbstractC11904l) C8993l.f18539l.f33214l), c6956l, 0);
            int iAdmob = AbstractC6363l.admob(0, 1, c6956l);
            C9879l c9879l = this.yandex;
            C14267l c14267lFirebase = c9879l.firebase();
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = AbstractC12311l.isPro(c6956l);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
            Boolean bool = (Boolean) this.amazon.getValue();
            bool.getClass();
            EnumC6302l enumC6302lVip = vip();
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob || objM2132native2 == c13863l) {
                objM2132native2 = new C14951l(this, interfaceC14029l, i4);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC12311l.purchase(bool, enumC6302lVip, (Function2) objM2132native2, c6956l);
            boolean z = vip() != EnumC6302l.f13255l;
            boolean zAdmob2 = c6956l.admob(this);
            Object objM2132native3 = c6956l.m2132native();
            if (zAdmob2 || objM2132native3 == c13863l) {
                objM2132native3 = new C1657l(this, i2);
                c6956l.m2147try(objM2132native3);
            }
            AbstractC10851l.loadAd(z, (Function0) objM2132native3, c6956l, 0);
            boolean zBooleanValue = ((Boolean) this.purchase.getValue()).booleanValue();
            boolean zAdmob3 = c6956l.admob(this);
            Object objM2132native4 = c6956l.m2132native();
            if (zAdmob3 || objM2132native4 == c13863l) {
                objM2132native4 = new C1657l(this, 3);
                c6956l.m2147try(objM2132native4);
            }
            AbstractC10851l.loadAd(zBooleanValue, (Function0) objM2132native4, c6956l, 0);
            int i5 = AbstractC13382l.yandex[((C18554l) interfaceC8714lLoadAd.getValue()).f36227l.ordinal()];
            if (i5 == 1) {
                c6956l.m2123default(785909665);
                j = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                c6956l.startapp(false);
            } else if (i5 == 2 && ((C18554l) interfaceC8714lLoadAd.getValue()).f36222l == EnumC14810l.LIGHT) {
                c6956l.m2123default(786165849);
                c6956l.startapp(false);
                j = C9735l.loadAd;
            } else {
                c6956l.m2123default(786242233);
                c6956l.startapp(false);
                j = C9735l.purchase;
            }
            long j2 = j;
            AbstractC5992l.yandex(j2, ((C18554l) interfaceC8714lLoadAd.getValue()).f36228l ? c9879l.startapp.m3155l() : j2, AbstractC14566l.amazon(5312848, new C17983l(this, iAdmob, interfaceC8714lLoadAd, c14267lFirebase, interfaceC2262l), c6956l), c6956l, 384);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C8096l(this, i, i2);
        }
    }
}
