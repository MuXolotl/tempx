package defpackage;

import android.util.Log;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٌ٘ٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18014l extends AbstractC11801l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C15308l f35201l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C15308l f35202l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C10086l f35203l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C17178l f35204l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C10086l f35205l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C8688l f35206l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final C18730l f35207l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C10086l f35208l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C12647l f35209l;

    public C18014l() {
        super(0);
        this.f35206l = new C8688l(new C7787l(this, 2));
        this.f35208l = AbstractC8020l.smaato(C9301l.yandex);
        this.f35205l = AbstractC8020l.smaato(null);
        this.f35203l = AbstractC8020l.smaato(null);
        this.f35202l = new C15308l(0);
        this.f35201l = new C15308l(0);
        this.f35209l = new C12647l(this, 0);
        this.f35204l = new C17178l(this, 0);
        C18730l c18730l = AbstractC17774l.yandex;
        this.f35207l = new C18730l();
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m4455abstract(Function0 function0, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(685366503);
        int i2 = i | (c6956l2.admob(function0) ? 4 : 2);
        if (c6956l2.m2127for(i2 & 1, (i2 & 3) != 2)) {
            C15089l c15089l = C18450l.f36034l;
            C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(c4346l, 16.0f);
            C1853l c1853lYandex = AbstractC1001l.yandex(c7537l, c15089l, c6956l2, 54);
            long j = c6956l2.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lSmaato);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c1853lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i3), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_check, 0, c6956l2), null, AbstractC0080l.isPro(c4346l, 72.0f), 0L, c6956l2, 440, 8);
            AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, R.string.cdcm_wizard_complete), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
            AbstractC17457l.loadAd(function0, null, false, null, null, null, null, null, AbstractC11028l.purchase, c6956l, (i2 & 14) | 805306368, 510);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9772l(this, function0, i, 8);
        }
    }

    @Override // defpackage.AbstractC11801l, defpackage.AbstractC2484l, defpackage.AbstractC17777l
    public final void appmetrica() {
        super.appmetrica();
        C1062l c1062lM4459public = m4459public();
        c1062lM4459public.firebase.crashlytics(c1062lM4459public, "advertising");
        m4459public().subs();
    }

    @Override // defpackage.AbstractC2484l
    /* JADX INFO: renamed from: default */
    public final void mo1143default() {
        if (AbstractC8576l.yandex(m4456finally(), C10126l.yandex) || AbstractC8576l.yandex(m4456finally(), C9388l.yandex)) {
            return;
        }
        super.mo1143default();
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final InterfaceC13779l m4456finally() {
        return (InterfaceC13779l) this.f35208l.getValue();
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m4457import(C14598l c14598l, Function0 function0, C6956l c6956l, int i) {
        c6956l.m2133new(2044958647);
        int i2 = i | (c6956l.billing(c14598l) ? 4 : 2) | (c6956l.admob(function0) ? 32 : 16) | (c6956l.admob(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        int i3 = 0;
        int i4 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            AbstractC15497l.loadAd(null, null, AbstractC14566l.amazon(-606203268, new C0454l(i4, function0), c6956l), null, null, 0, 0L, 0L, AbstractC10439l.yandex, AbstractC14566l.amazon(-394996922, new C13130l(c14598l, this, i3), c6956l), c6956l, 805306752, 251);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12755l(this, c14598l, function0, i, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004b A[LOOP:0: B:5:0x000d->B:17:0x004b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x004e A[EDGE_INSN: B:21:0x004e->B:18:0x004e BREAK  A[LOOP:0: B:5:0x000d->B:17:0x004b], SYNTHETIC] */
    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final void m4458instanceof() {
        C18730l c18730l = this.f35207l;
        Object[] objArr = c18730l.crashlytics;
        long[] jArr = c18730l.yandex;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            InterfaceC7042l interfaceC7042l = (InterfaceC7042l) objArr[(i << 3) + i3];
                            if (interfaceC7042l.mopub()) {
                                interfaceC7042l.ads(null);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        c18730l.yandex();
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        byte b;
        int i2;
        C18014l c18014l = this;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-1560259242);
        int i3 = i | (c6956l2.admob(c18014l) ? 4 : 2);
        if (c6956l2.m2127for(i3 & 1, (i3 & 3) != 2)) {
            int iAdmob = AbstractC6363l.admob(0, 1, c6956l2);
            AbstractC11028l.billing(c6956l2, 0);
            boolean z = AbstractC8576l.yandex(c18014l.m4456finally(), C10126l.yandex) || AbstractC8576l.yandex(c18014l.m4456finally(), C9388l.yandex);
            Object objM2132native = c6956l2.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = new C11200l(1);
                c6956l2.m2147try(objM2132native);
            }
            AbstractC10851l.loadAd(z, (Function0) objM2132native, c6956l2, 48);
            C8195l c8195l = (C8195l) c18014l.f35205l.getValue();
            if (c8195l == null) {
                c6956l2.m2123default(-1546637045);
                c6956l2.startapp(false);
                i2 = iAdmob;
                b = 0;
            } else {
                c6956l2.m2123default(-1546637044);
                String str = (String) c8195l.f17098l;
                C3713l c3713l = (C3713l) c8195l.f17097l;
                boolean zAdmob = c6956l2.admob(c18014l) | c6956l2.billing(str);
                Object objM2132native2 = c6956l2.m2132native();
                if (zAdmob || objM2132native2 == c13863l) {
                    objM2132native2 = new C3192l(c18014l, str, 2);
                    c6956l2.m2147try(objM2132native2);
                }
                long j = ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.startapp;
                C15578l c15578lAmazon = AbstractC14566l.amazon(-2053824695, new Cprotected(c3713l, c18014l, str, 13), c6956l2);
                b = 0;
                i2 = iAdmob;
                AbstractC2426l.crashlytics((Function0) objM2132native2, null, null, 0.0f, false, null, j, 0L, 0L, null, null, null, c15578lAmazon, c6956l, 0, 8126);
                c6956l2 = c6956l;
                c6956l2.startapp(false);
            }
            c18014l = this;
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(-1951015918, new C0931l(this, 1, b), c6956l2), null, null, null, 0, 0L, 0L, ((C15700l) c6956l2.isPro(AbstractC18678l.yandex)).amazon(c6956l2), AbstractC14566l.amazon(-597437721, new C1866l(this, i2, 2), c6956l2), c6956l2, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0931l(c18014l, i);
        }
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final C1062l m4459public() {
        return (C1062l) this.f35206l.getValue();
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final void m4460this(String str, InterfaceC3997l interfaceC3997l) {
        C9385l c9385l = AbstractC2617l.yandex;
        c9385l.getClass();
        byte[] bArrLoadAd = c9385l.loadAd(InterfaceC3997l.Companion.serializer(), interfaceC3997l);
        C6490l c6490l = C10815l.subs;
        m4459public().admob(str, new C10815l(UUID.randomUUID().getLeastSignificantBits(), 1, bArrLoadAd, null, null));
    }

    @Override // defpackage.AbstractC17777l
    /* JADX INFO: renamed from: throws */
    public final void mo2005throws() {
        super.mo2005throws();
        m4461try(C9301l.yandex);
        C1062l c1062lM4459public = m4459public();
        String strYandex = AbstractC2617l.yandex();
        C13469l c13469l = new C13469l();
        c13469l.f26419l = true;
        c13469l.f26412l = true;
        c13469l.f26429l = true;
        c13469l.f26428l = true;
        c13469l.f26413l = false;
        c13469l.f26434l = true;
        c13469l.f26426l = true;
        c13469l.f26436l = true;
        c13469l.f26432l = false;
        c13469l.f26411l = false;
        c13469l.f26438l = false;
        c13469l.f26427l = 0;
        c13469l.f26417l = 0;
        c13469l.f26440l = 0L;
        c13469l.f26415l = false;
        c13469l.f26414l = true;
        c13469l.f26410l = false;
        c13469l.f26441l = true;
        c13469l.f26431l = true;
        c13469l.f26409l = 0;
        c13469l.f26430l = true;
        c13469l.f26439l = 0;
        c13469l.f26423l = false;
        c13469l.f26433l = true;
        c13469l.f26408l = true;
        c13469l.f26437l = true;
        c13469l.f26420l = C9701l.f19785l;
        int[] iArr = c13469l.f26418l;
        int i = 11;
        if (iArr != null && iArr.length > 0) {
            c13469l.f26428l = false;
            c13469l.f26429l = false;
            c13469l.f26426l = false;
            c13469l.f26436l = false;
            c13469l.f26434l = false;
            c13469l.f26411l = false;
            for (int i2 : iArr) {
                if (i2 == 2) {
                    c13469l.f26429l = true;
                } else if (i2 == 9) {
                    c13469l.f26411l = true;
                } else if (i2 != 11) {
                    if (i2 == 4) {
                        c13469l.f26428l = true;
                    } else if (i2 == 5) {
                        c13469l.f26434l = true;
                    } else if (i2 == 6) {
                        c13469l.f26436l = true;
                    } else if (i2 != 7) {
                        Log.d("NearbyConnections", "Illegal advertising medium " + i2);
                    } else {
                        c13469l.f26426l = true;
                    }
                }
            }
        }
        int[] iArr2 = c13469l.f26425l;
        if (iArr2 != null && iArr2.length > 0) {
            c13469l.f26410l = false;
            int i3 = 0;
            while (true) {
                int[] iArr3 = c13469l.f26425l;
                if (i3 >= iArr3.length) {
                    break;
                }
                if (iArr3[i3] == 9) {
                    c13469l.f26410l = true;
                    break;
                }
                i3++;
            }
        }
        int i4 = c13469l.f26409l;
        if (i4 == 0) {
            c13469l.f26409l = true == c13469l.f26413l ? 1 : 3;
        } else {
            c13469l.f26413l = i4 != 3;
        }
        int i5 = c13469l.f26439l;
        if (i5 != 0) {
            c13469l.f26414l = i5 == 1;
        } else if (!c13469l.f26414l) {
            c13469l.f26439l = 2;
        }
        c1062lM4459public.getClass();
        C18096l c18096lAmazon = c1062lM4459public.amazon(new C18409l(c1062lM4459public, this.f35209l), AbstractC12216l.class.getName());
        C18096l c18096lYandex = c1062lM4459public.firebase.yandex(c1062lM4459public, new Object(), "advertising");
        C3224l c3224l = c1062lM4459public.firebase;
        C13904l c13904lCrashlytics = C13568l.crashlytics();
        c13904lCrashlytics.f27205l = c18096lYandex;
        c13904lCrashlytics.f27204l = new C12418l(c1062lM4459public, strYandex, c18096lAmazon, c13469l);
        c13904lCrashlytics.f27203l = C6168l.f12987l;
        c13904lCrashlytics.f27201l = 1266;
        C3823l c3823lLoadAd = c3224l.loadAd(c1062lM4459public, c13904lCrashlytics.loadAd());
        c3823lLoadAd.billing(AbstractC8333l.yandex, new C2683l(10, new C1412l(24, this)));
        c3823lLoadAd.crashlytics(new C2683l(i, this));
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public final void m4461try(InterfaceC13779l interfaceC13779l) {
        this.f35208l.setValue(interfaceC13779l);
    }
}
