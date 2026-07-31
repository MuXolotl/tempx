package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٟؓۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2021l {
    public static final C2966l crashlytics = new C2966l(0);
    public static final float loadAd = 4.0f;
    public final /* synthetic */ int yandex = 4;

    public static C16565l amazon(InterfaceC12932l interfaceC12932l, Function2 function2) {
        return AbstractC11064l.purchase(new C0743l(interfaceC12932l, 1, function2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object billing(AbstractC15781l abstractC15781l, boolean z, C8125l c8125l, AbstractC0283l abstractC0283l) throws Throwable {
        C7957l c7957l;
        if (abstractC0283l instanceof C7957l) {
            c7957l = (C7957l) abstractC0283l;
            int i = c7957l.f16575l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c7957l.f16575l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c7957l = new C7957l(abstractC0283l);
            }
        } else {
            c7957l = new C7957l(abstractC0283l);
        }
        Object objCrashlytics = c7957l.f16574l;
        int i2 = c7957l.f16575l;
        Object obj = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objCrashlytics);
            if (abstractC15781l.subs() && abstractC15781l.smaato() && abstractC15781l.isPro()) {
                C14822l c14822l = new C14822l(null, abstractC15781l, c8125l, z);
                c7957l.f16575l = 1;
                Object objMetrica = abstractC15781l.metrica(z, c14822l, c7957l);
                if (objMetrica != obj) {
                    return objMetrica;
                }
            } else {
                c7957l.f16577l = abstractC15781l;
                c7957l.f16576l = c8125l;
                c7957l.f16578l = z;
                c7957l.f16575l = 2;
                objCrashlytics = crashlytics(abstractC15781l, c7957l);
                if (objCrashlytics != obj) {
                }
            }
        }
        if (i2 == 1) {
            AbstractC2829l.crashlytics(objCrashlytics);
            return objCrashlytics;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                AbstractC2829l.crashlytics(objCrashlytics);
                return objCrashlytics;
            }
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = c7957l.f16578l;
        c8125l = c7957l.f16576l;
        abstractC15781l = c7957l.f16577l;
        AbstractC2829l.crashlytics(objCrashlytics);
        C8122l c8122l = new C8122l((InterfaceC14029l) null, abstractC15781l, c8125l, z);
        c7957l.f16577l = null;
        c7957l.f16576l = null;
        c7957l.f16575l = 3;
        Object objFirebase = AbstractC10999l.firebase((InterfaceC12932l) objCrashlytics, c8122l, c7957l);
        return objFirebase == obj ? obj : objFirebase;
    }

    public static final InterfaceC12932l crashlytics(AbstractC15781l abstractC15781l, AbstractC0283l abstractC0283l) {
        if (!abstractC15781l.subs()) {
            C18662l c18662l = abstractC15781l.yandex;
            return (c18662l != null ? c18662l : null).f36440l;
        }
        if (abstractC0283l.metrica().mo245l(AbstractC4903l.f9999l) == null) {
            C18662l c18662l2 = abstractC15781l.yandex;
            return (c18662l2 != null ? c18662l2 : null).f36440l;
        }
        C18725l.loadAd();
        return null;
    }

    public static final void loadAd(final InterfaceC17242l interfaceC17242l, final boolean z, final boolean z2, final C17290l c17290l, final C2403l c2403l, final InterfaceC6347l interfaceC6347l, C6956l c6956l, final int i) {
        int i2;
        char c;
        long j;
        char c2;
        long j2;
        C8540l c8540l;
        long j3;
        c6956l.m2133new(-670917213);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.mopub(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.mopub(z2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.billing(c17290l) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l.admob(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c6956l.billing(c2403l) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c6956l.billing(interfaceC6347l) ? 1048576 : 524288;
        }
        if (c6956l.m2127for(i2 & 1, (599187 & i2) != 599186)) {
            if (!z2) {
                c = ' ';
                j = z ? c17290l.isPro : c17290l.vip;
            } else if (z) {
                c = ' ';
                j = c17290l.loadAd;
            } else {
                c = ' ';
                j = c17290l.billing;
            }
            if (z2) {
                c2 = c;
                j2 = z ? c17290l.yandex : c17290l.purchase;
            } else {
                c2 = c;
                j2 = z ? c17290l.subs : c17290l.remoteconfig;
            }
            InterfaceC6347l interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 7);
            char c3 = c2;
            C8540l c8540l2 = AbstractC10493l.yandex;
            C2109l c2109l = ((C1504l) c6956l.isPro(c8540l2)).yandex;
            if (z2) {
                c8540l = c8540l2;
                j3 = z ? c17290l.crashlytics : c17290l.mopub;
            } else {
                c8540l = c8540l2;
                j3 = z ? c17290l.firebase : c17290l.metrica;
            }
            InterfaceC17242l interfaceC17242lAmazon = AbstractC4927l.amazon(AbstractC17551l.loadAd(interfaceC17242l, 2.0f, j3, interfaceC6347lLoadAd), j, interfaceC6347lLoadAd);
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lPremium = interfaceC17242lAmazon.premium(c4346l);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j4 = c6956l.f14595continue;
            int i3 = (int) (j4 ^ (j4 >>> c3));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lPremium);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
            InterfaceC17242l interfaceC17242lPremium2 = C16170l.yandex.yandex(c4346l, C18450l.f36035l).premium(new C7305l(c2403l, z, C17423l.remoteconfig(c6956l, 2)));
            C2109l c2109l2 = ((C1504l) c6956l.isPro(c8540l)).yandex;
            InterfaceC17242l interfaceC17242lAmazon2 = AbstractC4927l.amazon(AbstractC14631l.yandex(interfaceC17242lPremium2, c2403l, AbstractC10493l.yandex(false, 20.0f, 0L, null, 220)), j2, interfaceC6347l);
            InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(C18450l.f36043l, false);
            long j5 = c6956l.f14595continue;
            int i4 = (int) (j5 ^ (j5 >>> c3));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lAmazon2);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon2, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i4, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            c6956l.m2123default(1236071411);
            c6956l.startapp(false);
            c6956l.startapp(true);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lِٙؒ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC2021l.loadAd(interfaceC17242l, z, z2, c17290l, c2403l, interfaceC6347l, (C6956l) obj, AbstractC0545l.purchase(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static int mopub(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static final Object purchase(AbstractC15781l abstractC15781l, boolean z, boolean z2, Function1 function1) {
        abstractC15781l.yandex();
        InterfaceC14029l interfaceC14029l = null;
        if (abstractC15781l.subs() && !abstractC15781l.isPro() && abstractC15781l.admob.get() != null) {
            C8339l.smaato("Cannot access database on a different coroutine context inherited from a suspending transaction.");
            return null;
        }
        C12307l c12307l = new C12307l((InterfaceC14029l) null, abstractC15781l, function1, z, z2);
        Thread.interrupted();
        return AbstractC10999l.subs(C17218l.f33421l, new C7864l(c12307l, interfaceC14029l, 13));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00af  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:61:0x0157  */
    /* JADX WARN: Code duplicated, block: B:66:0x0171  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0195  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public static final void yandex(final boolean z, final Function1 function1, InterfaceC17242l interfaceC17242l, boolean z2, C17290l c17290l, C6956l c6956l, final int i, final int i2) {
        InterfaceC17242l interfaceC17242l2;
        int i3;
        boolean z3;
        int i4;
        C17290l c17290l2;
        int i5;
        boolean z4;
        final boolean z5;
        final InterfaceC17242l interfaceC17242l3;
        final C17290l c17290l3;
        C4224l c4224lAds;
        int i6;
        InterfaceC17242l interfaceC17242lIsPro;
        InterfaceC17242l interfaceC17242l4;
        int i7;
        boolean z6;
        C0764l c0764l;
        C17290l c17290l4;
        long j;
        C17290l c17290l5;
        Object objM2132native;
        C2403l c2403l;
        boolean z7;
        C2403l c2403l2;
        c6956l.m2133new(-263339167);
        int i8 = i | (c6956l.mopub(z) ? 4 : 2);
        if ((i & 48) == 0) {
            i8 |= c6956l.admob(function1) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 = i8 | 384;
            interfaceC17242l2 = interfaceC17242l;
        } else {
            interfaceC17242l2 = interfaceC17242l;
            i3 = i8 | (c6956l.billing(interfaceC17242l2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        }
        int i10 = i3 | 3072;
        int i11 = i2 & 16;
        if (i11 != 0) {
            i4 = i3 | 27648;
            z3 = z2;
        } else {
            z3 = z2;
            i4 = i10 | (c6956l.mopub(z3) ? 16384 : 8192);
        }
        if ((i2 & 32) == 0) {
            c17290l2 = c17290l;
            int i12 = c6956l.billing(c17290l2) ? 131072 : 65536;
            i5 = i4 | i12 | 1572864;
            if ((599187 & i5) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c6956l.m2127for(i5 & 1, z4)) {
                c6956l.m2141switch();
                i6 = i & 1;
                interfaceC17242lIsPro = C4346l.f8873l;
                if (i6 != 0 || c6956l.ad()) {
                    if (i9 != 0) {
                        interfaceC17242l2 = interfaceC17242lIsPro;
                    }
                    boolean z8 = i11 == 0 ? z3 : true;
                    if ((i2 & 32) != 0) {
                        c0764l = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex;
                        c17290l4 = c0764l.f2291const;
                        j = c0764l.startapp;
                        if (c17290l4 == null) {
                            long jAmazon = AbstractC15038l.amazon(c0764l, 10);
                            long jAmazon2 = AbstractC15038l.amazon(c0764l, 26);
                            long j2 = C9735l.isPro;
                            c17290l5 = new C17290l(jAmazon, jAmazon2, j2, AbstractC15038l.amazon(c0764l, 11), AbstractC15038l.amazon(c0764l, 24), AbstractC15038l.amazon(c0764l, 39), AbstractC15038l.amazon(c0764l, 24), AbstractC15038l.amazon(c0764l, 39), AbstractC12953l.firebase(C9735l.loadAd(1.0f, AbstractC15038l.amazon(c0764l, 35)), j), AbstractC12953l.firebase(C9735l.loadAd(0.12f, AbstractC15038l.amazon(c0764l, 18)), j), j2, AbstractC12953l.firebase(C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), j), AbstractC12953l.firebase(C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), j), AbstractC12953l.firebase(C9735l.loadAd(0.12f, AbstractC15038l.amazon(c0764l, 39)), j), AbstractC12953l.firebase(C9735l.loadAd(0.12f, AbstractC15038l.amazon(c0764l, 18)), j), AbstractC12953l.firebase(C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 39)), j));
                            c0764l.f2291const = c17290l5;
                        } else {
                            c17290l5 = c17290l4;
                        }
                        i5 &= -458753;
                        c17290l2 = c17290l5;
                    }
                    interfaceC17242l4 = interfaceC17242l2;
                    i7 = i5;
                    z6 = z8;
                } else {
                    c6956l.m2124else();
                    if ((i2 & 32) != 0) {
                        i5 &= -458753;
                    }
                    z6 = z3;
                    interfaceC17242l4 = interfaceC17242l2;
                    i7 = i5;
                }
                c6956l.adcel();
                c6956l.m2123default(1768510810);
                objM2132native = c6956l.m2132native();
                if (objM2132native == C1867l.yandex) {
                    objM2132native = AbstractC14814l.isPro(c6956l);
                }
                c2403l = (C2403l) objM2132native;
                c6956l.startapp(false);
                if (function1 != null) {
                    C17857l c17857l = AbstractC16434l.yandex;
                    interfaceC17242lIsPro = AbstractC3234l.isPro(C18158l.f35556l, z, c2403l, null, z6, new C6402l(2), function1);
                    boolean z9 = z6;
                    c2403l2 = c2403l;
                    z7 = z9;
                } else {
                    z7 = z6;
                    c2403l2 = c2403l;
                }
                int i13 = i7 >> 6;
                int i14 = ((i7 << 3) & 112) | (i13 & 896) | (i13 & 7168) | 24576;
                C17290l c17290l6 = c17290l2;
                loadAd(AbstractC0080l.adcel(interfaceC17242l4.premium(interfaceC17242lIsPro), C18450l.f36043l).premium(new C16662l(52.0f, 32.0f, 52.0f, 32.0f, false)), z, z7, c17290l6, c2403l2, AbstractC2610l.loadAd(c6956l, 7), c6956l, i14);
                z5 = z7;
                c17290l3 = c17290l6;
                interfaceC17242l3 = interfaceC17242l4;
            } else {
                c6956l.m2124else();
                z5 = z3;
                interfaceC17242l3 = interfaceC17242l2;
                c17290l3 = c17290l2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lٌؓٔ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC2021l.yandex(z, function1, interfaceC17242l3, z5, c17290l3, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        c17290l2 = c17290l;
        i5 = i4 | i12 | 1572864;
        if ((599187 & i5) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c6956l.m2127for(i5 & 1, z4)) {
            c6956l.m2141switch();
            i6 = i & 1;
            interfaceC17242lIsPro = C4346l.f8873l;
            if (i6 != 0) {
                if (i9 != 0) {
                    interfaceC17242l2 = interfaceC17242lIsPro;
                }
                if (i11 == 0) {
                }
                if ((i2 & 32) != 0) {
                    c0764l = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex;
                    c17290l4 = c0764l.f2291const;
                    j = c0764l.startapp;
                    if (c17290l4 == null) {
                        long jAmazon3 = AbstractC15038l.amazon(c0764l, 10);
                        long jAmazon4 = AbstractC15038l.amazon(c0764l, 26);
                        long j3 = C9735l.isPro;
                        c17290l5 = new C17290l(jAmazon3, jAmazon4, j3, AbstractC15038l.amazon(c0764l, 11), AbstractC15038l.amazon(c0764l, 24), AbstractC15038l.amazon(c0764l, 39), AbstractC15038l.amazon(c0764l, 24), AbstractC15038l.amazon(c0764l, 39), AbstractC12953l.firebase(C9735l.loadAd(1.0f, AbstractC15038l.amazon(c0764l, 35)), j), AbstractC12953l.firebase(C9735l.loadAd(0.12f, AbstractC15038l.amazon(c0764l, 18)), j), j3, AbstractC12953l.firebase(C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), j), AbstractC12953l.firebase(C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), j), AbstractC12953l.firebase(C9735l.loadAd(0.12f, AbstractC15038l.amazon(c0764l, 39)), j), AbstractC12953l.firebase(C9735l.loadAd(0.12f, AbstractC15038l.amazon(c0764l, 18)), j), AbstractC12953l.firebase(C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 39)), j));
                        c0764l.f2291const = c17290l5;
                    } else {
                        c17290l5 = c17290l4;
                    }
                    i5 &= -458753;
                    c17290l2 = c17290l5;
                }
                interfaceC17242l4 = interfaceC17242l2;
                i7 = i5;
                z6 = z8;
            } else {
                if (i9 != 0) {
                    interfaceC17242l2 = interfaceC17242lIsPro;
                }
                if (i11 == 0) {
                }
                if ((i2 & 32) != 0) {
                    c0764l = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex;
                    c17290l4 = c0764l.f2291const;
                    j = c0764l.startapp;
                    if (c17290l4 == null) {
                        long jAmazon5 = AbstractC15038l.amazon(c0764l, 10);
                        long jAmazon6 = AbstractC15038l.amazon(c0764l, 26);
                        long j4 = C9735l.isPro;
                        c17290l5 = new C17290l(jAmazon5, jAmazon6, j4, AbstractC15038l.amazon(c0764l, 11), AbstractC15038l.amazon(c0764l, 24), AbstractC15038l.amazon(c0764l, 39), AbstractC15038l.amazon(c0764l, 24), AbstractC15038l.amazon(c0764l, 39), AbstractC12953l.firebase(C9735l.loadAd(1.0f, AbstractC15038l.amazon(c0764l, 35)), j), AbstractC12953l.firebase(C9735l.loadAd(0.12f, AbstractC15038l.amazon(c0764l, 18)), j), j4, AbstractC12953l.firebase(C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), j), AbstractC12953l.firebase(C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), j), AbstractC12953l.firebase(C9735l.loadAd(0.12f, AbstractC15038l.amazon(c0764l, 39)), j), AbstractC12953l.firebase(C9735l.loadAd(0.12f, AbstractC15038l.amazon(c0764l, 18)), j), AbstractC12953l.firebase(C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 39)), j));
                        c0764l.f2291const = c17290l5;
                    } else {
                        c17290l5 = c17290l4;
                    }
                    i5 &= -458753;
                    c17290l2 = c17290l5;
                }
                interfaceC17242l4 = interfaceC17242l2;
                i7 = i5;
                z6 = z8;
            }
            c6956l.adcel();
            c6956l.m2123default(1768510810);
            objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = AbstractC14814l.isPro(c6956l);
            }
            c2403l = (C2403l) objM2132native;
            c6956l.startapp(false);
            if (function1 != null) {
                C17857l c17857l2 = AbstractC16434l.yandex;
                interfaceC17242lIsPro = AbstractC3234l.isPro(C18158l.f35556l, z, c2403l, null, z6, new C6402l(2), function1);
                boolean z10 = z6;
                c2403l2 = c2403l;
                z7 = z10;
            } else {
                z7 = z6;
                c2403l2 = c2403l;
            }
            int i15 = i7 >> 6;
            int i16 = ((i7 << 3) & 112) | (i15 & 896) | (i15 & 7168) | 24576;
            C17290l c17290l7 = c17290l2;
            loadAd(AbstractC0080l.adcel(interfaceC17242l4.premium(interfaceC17242lIsPro), C18450l.f36043l).premium(new C16662l(52.0f, 32.0f, 52.0f, 32.0f, false)), z, z7, c17290l7, c2403l2, AbstractC2610l.loadAd(c6956l, 7), c6956l, i16);
            z5 = z7;
            c17290l3 = c17290l7;
            interfaceC17242l3 = interfaceC17242l4;
        } else {
            c6956l.m2124else();
            z5 = z3;
            interfaceC17242l3 = interfaceC17242l2;
            c17290l3 = c17290l2;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lٌؓٔ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC2021l.yandex(z, function1, interfaceC17242l3, z5, c17290l3, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public int hashCode() {
        switch (this.yandex) {
            case 4:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.yandex) {
            case 4:
                return AbstractC18202l.yandex.loadAd(getClass()).license();
            default:
                return super.toString();
        }
    }
}
