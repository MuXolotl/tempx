package defpackage;

import android.os.Build;
import androidx.car.app.model.Alert;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: l٘ٚۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18026l extends AbstractC11754l implements InterfaceC6357l, InterfaceC18212l {

    /* JADX INFO: renamed from: lؚؕؒ, reason: contains not printable characters */
    public static final C16367l f35264l;

    /* JADX INFO: renamed from: lؕۗؗ, reason: contains not printable characters */
    public static final C6565l f35265l;

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public float f35268l;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public InterfaceC13490l f35269l;

    /* JADX INFO: renamed from: lؒٓؐ, reason: contains not printable characters */
    public C11925l f35270l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public AbstractC18026l f35271l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public boolean f35273l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public boolean f35274l;

    /* JADX INFO: renamed from: lؕۦؓ, reason: contains not printable characters */
    public InterfaceC14859l f35275l;

    /* JADX INFO: renamed from: lؖ۠ٙ, reason: contains not printable characters */
    public boolean f35276l;

    /* JADX INFO: renamed from: lؚؗٞ, reason: contains not printable characters */
    public C17671l f35277l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public C16803l f35278l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public boolean f35279l;

    /* JADX INFO: renamed from: lؗ۟ۤ, reason: contains not printable characters */
    public boolean f35280l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C3654l f35281l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public C7661l f35282l;

    /* JADX INFO: renamed from: lُؚؓ, reason: contains not printable characters */
    public C11925l f35283l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public EnumC9931l f35284l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public boolean f35285l;

    /* JADX INFO: renamed from: lِِٞ, reason: contains not printable characters */
    public InterfaceC10702l f35287l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public Function1 f35289l;

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public boolean f35290l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public C10006l f35292l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public InterfaceC17792l f35293l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public AbstractC18026l f35294l;

    /* JADX INFO: renamed from: lؔؕؖ, reason: contains not printable characters */
    public static final C6148l f35263l = new C6148l();

    /* JADX INFO: renamed from: lٖ٘ۘ, reason: contains not printable characters */
    public static final C16803l f35266l = new C16803l();

    /* JADX INFO: renamed from: l٘ٚؒ, reason: contains not printable characters */
    public static final float[] f35267l = C10924l.yandex();

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public float f35288l = 0.8f;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public long f35291l = 0;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public InterfaceC6347l f35286l = AbstractC16837l.yandex;

    /* JADX INFO: renamed from: lٟؓٔ, reason: contains not printable characters */
    public final C10446l f35272l = new C10446l(this, 1);

    static {
        int i = 6;
        f35265l = new C6565l(i);
        f35264l = new C16367l(i);
    }

    public AbstractC18026l(C3654l c3654l) {
        this.f35281l = c3654l;
        this.f35269l = c3654l.f7668l;
        this.f35284l = c3654l.f7691l;
    }

    /* JADX INFO: renamed from: lؓۤٚ, reason: contains not printable characters */
    public static AbstractC18026l m4462l(InterfaceC18212l interfaceC18212l) {
        AbstractC18026l abstractC18026l;
        C9083l c9083l = interfaceC18212l instanceof C9083l ? (C9083l) interfaceC18212l : null;
        return (c9083l == null || (abstractC18026l = c9083l.f18667l.f4026l) == null) ? (AbstractC18026l) interfaceC18212l : abstractC18026l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // defpackage.AbstractC10113l, defpackage.InterfaceC6357l
    public final Object Signature() {
        C3654l c3654l = this.f35281l;
        if (!c3654l.f7703l.admob(64)) {
            return null;
        }
        mo2643l();
        Object objCrashlytics = null;
        for (AbstractC14971l abstractC14971l = (C13924l) c3654l.f7703l.billing; abstractC14971l != null; abstractC14971l = abstractC14971l.f29456l) {
            if ((abstractC14971l.f29450l & 64) != 0) {
                ?? LoadAd = abstractC14971l;
                ?? c17893l = 0;
                while (LoadAd != 0) {
                    if (LoadAd instanceof InterfaceC2653l) {
                        objCrashlytics = ((InterfaceC2653l) LoadAd).crashlytics(c3654l.f7668l, objCrashlytics);
                    } else if ((LoadAd.f29450l & 64) != 0 && (LoadAd instanceof AbstractC11340l)) {
                        AbstractC14971l abstractC14971l2 = ((AbstractC11340l) LoadAd).f22875l;
                        int i = 0;
                        LoadAd = LoadAd;
                        c17893l = c17893l;
                        while (abstractC14971l2 != null) {
                            if ((abstractC14971l2.f29450l & 64) != 0) {
                                i++;
                                if (i == 1) {
                                    c17893l = c17893l;
                                    LoadAd = abstractC14971l2;
                                } else {
                                    if (c17893l == 0) {
                                        c17893l = new C17893l(0, new AbstractC14971l[16]);
                                    }
                                    if (LoadAd != 0) {
                                        c17893l.crashlytics(LoadAd);
                                        LoadAd = 0;
                                    }
                                    c17893l.crashlytics(abstractC14971l2);
                                }
                            }
                            abstractC14971l2 = abstractC14971l2.f29460l;
                            LoadAd = LoadAd;
                            c17893l = c17893l;
                        }
                        if (i == 1) {
                        }
                    }
                    LoadAd = AbstractC5573l.loadAd(c17893l);
                }
            }
        }
        return objCrashlytics;
    }

    @Override // defpackage.AbstractC11754l, defpackage.InterfaceC0827l
    public final boolean ad() {
        return (this.f35287l == null || this.f35279l || !this.f35281l.m1386native()) ? false : true;
    }

    @Override // defpackage.InterfaceC18212l
    public final long amazon(long j) {
        long jMo2591strictfp = mo2591strictfp(j);
        ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = (ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(this.f35281l);
        viewTreeObserverOnGlobalLayoutListenerC13840l.applovin();
        return C10924l.loadAd(jMo2591strictfp, viewTreeObserverOnGlobalLayoutListenerC13840l.f27069l);
    }

    @Override // defpackage.AbstractC10113l
    /* JADX INFO: renamed from: class */
    public abstract void mo1459class(long j, float f, C11925l c11925l);

    @Override // defpackage.InterfaceC12822l
    public final EnumC9931l getLayoutDirection() {
        return this.f35281l.f7691l;
    }

    @Override // defpackage.AbstractC11754l
    /* JADX INFO: renamed from: implements */
    public final boolean mo991implements() {
        return this.f35293l != null;
    }

    @Override // defpackage.InterfaceC18212l
    public final void isPro(InterfaceC18212l interfaceC18212l, float[] fArr) {
        AbstractC18026l abstractC18026lM4462l = m4462l(interfaceC18212l);
        abstractC18026lM4462l.m4494l();
        AbstractC18026l abstractC18026lM4466l = m4466l(abstractC18026lM4462l);
        C10924l.amazon(fArr);
        abstractC18026lM4462l.m4468l(abstractC18026lM4466l, fArr);
        m4484l(abstractC18026lM4466l, fArr);
    }

    @Override // defpackage.InterfaceC13490l
    public final float loadAd() {
        return this.f35281l.f7668l.loadAd();
    }

    /* JADX INFO: renamed from: lؑؓۙ, reason: contains not printable characters */
    public final void m4463l(boolean z) {
        char c;
        int i;
        boolean z2;
        InterfaceC11218l interfaceC11218l;
        Function0 function0;
        int i2;
        Function0 function1;
        if (this.f35283l != null) {
            return;
        }
        InterfaceC10702l interfaceC10702l = this.f35287l;
        Function1 function2 = this.f35289l;
        if (interfaceC10702l == null) {
            if (function2 == null) {
                return;
            }
            AbstractC0081l.crashlytics("null layer with a non-null layerBlock");
            return;
        }
        if (function2 == null) {
            throw AbstractC5020l.metrica("updateLayerParameters requires a non-null layerBlock");
        }
        C6148l c6148l = f35263l;
        c6148l.yandex();
        C3654l c3654l = this.f35281l;
        c6148l.f12941l = c3654l.f7668l;
        c6148l.f12940l = c3654l.f7691l;
        c6148l.f12958l = AbstractC14707l.mopub(this.f20590l);
        ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(c3654l)).getSnapshotObserver().yandex.crashlytics(this, C16274l.f31874l, new C4307l(function2, this, 8));
        C16803l c16803l = this.f35278l;
        if (c16803l == null) {
            c16803l = new C16803l();
            this.f35278l = c16803l;
        }
        C16803l c16803l2 = f35266l;
        c16803l2.getClass();
        c16803l2.yandex = c16803l.yandex;
        c16803l2.loadAd = c16803l.loadAd;
        c16803l2.crashlytics = c16803l.crashlytics;
        c16803l2.amazon = c16803l.amazon;
        c16803l2.purchase = c16803l.purchase;
        c16803l2.billing = c16803l.billing;
        c16803l2.mopub = c16803l.mopub;
        c16803l2.admob = c16803l.admob;
        c16803l2.subs = c16803l.subs;
        c16803l.yandex = c6148l.f12945l;
        c16803l.loadAd = c6148l.f12938l;
        c16803l.crashlytics = c6148l.f12951l;
        c16803l.amazon = c6148l.f12955l;
        c16803l.purchase = c6148l.f12949l;
        c16803l.billing = c6148l.f12956l;
        c16803l.mopub = c6148l.f12953l;
        c16803l.admob = c6148l.f12937l;
        c16803l.subs = c6148l.f12957l;
        C6577l c6577l = (C6577l) interfaceC10702l;
        ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = c6577l.f13730l;
        int i3 = c6148l.f12946l | c6577l.f13748l;
        c6577l.f13744l = c6148l.f12940l;
        InterfaceC13490l interfaceC13490l = c6148l.f12941l;
        c6577l.f13747l = interfaceC13490l;
        if ((1048576 & i3) != 0) {
            C11925l c11925l = c6577l.f13737l;
            c6148l.f12947l.getClass();
            int iMo870l = interfaceC13490l.mo870l(0.0f);
            c6148l.f12947l.getClass();
            int iMo870l2 = interfaceC13490l.mo870l(0.0f);
            c6148l.f12947l.getClass();
            int iMo870l3 = interfaceC13490l.mo870l(0.0f);
            c6148l.f12947l.getClass();
            int iMo870l4 = interfaceC13490l.mo870l(0.0f);
            c11925l.license = iMo870l;
            c11925l.pro = iMo870l2;
            c11925l.ad = iMo870l3;
            c11925l.advert = iMo870l4;
            c11925l.yandex.pro(iMo870l, iMo870l2, iMo870l3, iMo870l4);
            c6577l.crashlytics();
        }
        int i4 = i3 & 4096;
        if (i4 != 0) {
            c6577l.f13741l = c6148l.f12957l;
        }
        if ((i3 & 1) != 0) {
            C11925l c11925l2 = c6577l.f13737l;
            float f = c6148l.f12945l;
            InterfaceC0285l interfaceC0285l = c11925l2.yandex;
            if (interfaceC0285l.crashlytics() != f) {
                interfaceC0285l.signatures(f);
            }
        }
        if ((i3 & 2) != 0) {
            C11925l c11925l3 = c6577l.f13737l;
            float f2 = c6148l.f12938l;
            InterfaceC0285l interfaceC0285l2 = c11925l3.yandex;
            if (interfaceC0285l2.mo395for() != f2) {
                interfaceC0285l2.metrica(f2);
            }
        }
        if ((i3 & 4) != 0) {
            c6577l.f13737l.billing(c6148l.f12952l);
        }
        if ((i3 & 8) != 0) {
            C11925l c11925l4 = c6577l.f13737l;
            float f3 = c6148l.f12951l;
            InterfaceC0285l interfaceC0285l3 = c11925l4.yandex;
            if (interfaceC0285l3.appmetrica() != f3) {
                interfaceC0285l3.mo399strictfp(f3);
            }
        }
        if ((i3 & 16) != 0) {
            C11925l c11925l5 = c6577l.f13737l;
            float f4 = c6148l.f12955l;
            InterfaceC0285l interfaceC0285l4 = c11925l5.yandex;
            if (interfaceC0285l4.ad() != f4) {
                interfaceC0285l4.mopub(f4);
            }
        }
        if ((i3 & 32) != 0) {
            C11925l c11925l6 = c6577l.f13737l;
            float f5 = c6148l.f12939l;
            InterfaceC0285l interfaceC0285l5 = c11925l6.yandex;
            if (interfaceC0285l5.mo394extends() != f5) {
                interfaceC0285l5.amazon(f5);
                c11925l6.mopub = true;
                c11925l6.yandex();
            }
            if (c6148l.f12939l > 0.0f && !c6577l.f13733l && (function1 = c6577l.f13742l) != null) {
                function1.invoke();
            }
        }
        if ((i3 & 64) != 0) {
            C11925l c11925l7 = c6577l.f13737l;
            long j = c6148l.f12942l;
            InterfaceC0285l interfaceC0285l6 = c11925l7.yandex;
            if (!C9735l.crashlytics(j, interfaceC0285l6.tapsense())) {
                interfaceC0285l6.isVip(j);
            }
        }
        if ((i3 & 128) != 0) {
            C11925l c11925l8 = c6577l.f13737l;
            long j2 = c6148l.f12954l;
            InterfaceC0285l interfaceC0285l7 = c11925l8.yandex;
            if (!C9735l.crashlytics(j2, interfaceC0285l7.advert())) {
                interfaceC0285l7.mo403volatile(j2);
            }
        }
        if ((i3 & 1024) != 0) {
            C11925l c11925l9 = c6577l.f13737l;
            float f6 = c6148l.f12953l;
            InterfaceC0285l interfaceC0285l8 = c11925l9.yandex;
            if (interfaceC0285l8.ads() != f6) {
                interfaceC0285l8.billing(f6);
            }
        }
        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            C11925l c11925l10 = c6577l.f13737l;
            float f7 = c6148l.f12949l;
            InterfaceC0285l interfaceC0285l9 = c11925l10.yandex;
            if (interfaceC0285l9.mo402throws() != f7) {
                interfaceC0285l9.mo401throw(f7);
            }
        }
        if ((i3 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
            C11925l c11925l11 = c6577l.f13737l;
            float f8 = c6148l.f12956l;
            InterfaceC0285l interfaceC0285l10 = c11925l11.yandex;
            if (interfaceC0285l10.startapp() != f8) {
                interfaceC0285l10.loadAd(f8);
            }
        }
        if ((i3 & 2048) != 0) {
            C11925l c11925l12 = c6577l.f13737l;
            float f9 = c6148l.f12937l;
            InterfaceC0285l interfaceC0285l11 = c11925l12.yandex;
            if (interfaceC0285l11.premium() != f9) {
                interfaceC0285l11.mo398private(f9);
            }
        }
        if (i4 != 0) {
            c = ' ';
            boolean zYandex = C1723l.yandex(c6577l.f13741l, C1723l.loadAd);
            C11925l c11925l13 = c6577l.f13737l;
            if (!zYandex) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c6577l.f13741l >> 32)) * ((int) (c6577l.f13746l >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c6577l.f13741l & 4294967295L)) * ((int) (c6577l.f13746l & 4294967295L)))) & 4294967295L);
                if (!C1187l.loadAd(c11925l13.isVip, jFloatToRawIntBits)) {
                    c11925l13.isVip = jFloatToRawIntBits;
                    c11925l13.yandex.subscription(jFloatToRawIntBits);
                }
            } else if (!C1187l.loadAd(c11925l13.isVip, 9205357640488583168L)) {
                c11925l13.isVip = 9205357640488583168L;
                c11925l13.yandex.subscription(9205357640488583168L);
            }
        } else {
            c = ' ';
        }
        if ((i3 & 16384) != 0) {
            c6577l.f13737l.mopub(c6148l.f12943l);
        }
        if ((131072 & i3) != 0) {
            c6577l.f13737l.subs(null);
        }
        if ((262144 & i3) != 0) {
            C11925l c11925l14 = c6577l.f13737l;
            AbstractC8939l abstractC8939l = c6148l.f12936l;
            InterfaceC0285l interfaceC0285l12 = c11925l14.yandex;
            if (!AbstractC8576l.yandex(interfaceC0285l12.vip(), abstractC8939l)) {
                interfaceC0285l12.license(abstractC8939l);
            }
        }
        if ((524288 & i3) != 0) {
            C11925l c11925l15 = c6577l.f13737l;
            int i5 = c6148l.f12959l;
            InterfaceC0285l interfaceC0285l13 = c11925l15.yandex;
            if (interfaceC0285l13.mo393catch() != i5) {
                interfaceC0285l13.subs(i5);
            }
        }
        if ((32768 & i3) != 0) {
            C11925l c11925l16 = c6577l.f13737l;
            int i6 = c6148l.f12948l;
            if (i6 == 0) {
                i2 = 0;
            } else if (i6 == 1) {
                i2 = 1;
            } else {
                i2 = 2;
                if (i6 != 2) {
                    C8339l.smaato("Not supported composition strategy");
                    return;
                }
            }
            c11925l16.admob(i2);
        }
        if ((i3 & 7963) != 0) {
            c6577l.f13739l = true;
            c6577l.f13749l = true;
        }
        if (AbstractC8576l.yandex(c6577l.f13735l, c6148l.f12944l)) {
            i = i3;
            z2 = false;
        } else {
            AbstractC15342l abstractC15342l = c6148l.f12944l;
            c6577l.f13735l = abstractC15342l;
            if (abstractC15342l == null) {
                i = i3;
            } else {
                C11925l c11925l17 = c6577l.f13737l;
                if (abstractC15342l instanceof C13080l) {
                    C8896l c8896l = ((C13080l) abstractC15342l).amazon;
                    float f10 = c8896l.yandex;
                    float f11 = c8896l.loadAd;
                    i = i3;
                    c11925l17.isPro((((long) Float.floatToRawIntBits(f10)) << c) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L), (((long) Float.floatToRawIntBits(c8896l.crashlytics - f10)) << c) | (((long) Float.floatToRawIntBits(c8896l.amazon - f11)) & 4294967295L), 0.0f);
                } else {
                    i = i3;
                    if (abstractC15342l instanceof C13616l) {
                        C9902l c9902l = ((C13616l) abstractC15342l).amazon;
                        c11925l17.firebase = null;
                        c11925l17.subs = 9205357640488583168L;
                        c11925l17.admob = 0L;
                        c11925l17.isPro = 0.0f;
                        c11925l17.mopub = true;
                        c11925l17.vip = false;
                        c11925l17.smaato = c9902l;
                        c11925l17.yandex();
                    } else {
                        if (!(abstractC15342l instanceof C18521l)) {
                            C18725l.billing();
                            return;
                        }
                        C18521l c18521l = (C18521l) abstractC15342l;
                        C9902l c9902l2 = c18521l.purchase;
                        if (c9902l2 != null) {
                            c11925l17.firebase = null;
                            c11925l17.subs = 9205357640488583168L;
                            c11925l17.admob = 0L;
                            c11925l17.isPro = 0.0f;
                            c11925l17.mopub = true;
                            c11925l17.vip = false;
                            c11925l17.smaato = c9902l2;
                            c11925l17.yandex();
                        } else {
                            C3903l c3903l = c18521l.amazon;
                            c11925l17.isPro((((long) Float.floatToRawIntBits(c3903l.yandex)) << c) | (((long) Float.floatToRawIntBits(c3903l.loadAd)) & 4294967295L), (((long) Float.floatToRawIntBits(c3903l.loadAd())) << c) | (((long) Float.floatToRawIntBits(c3903l.yandex())) & 4294967295L), Float.intBitsToFloat((int) (c3903l.admob >> c)));
                        }
                    }
                }
                if (Build.VERSION.SDK_INT < 33 && (((abstractC15342l instanceof C13616l) || ((abstractC15342l instanceof C18521l) && !AbstractC8238l.purchase(((C18521l) abstractC15342l).amazon))) && (function0 = c6577l.f13742l) != null)) {
                    function0.invoke();
                }
            }
            z2 = true;
        }
        c6577l.f13748l = c6148l.f12946l;
        if (i != 0 || z2) {
            if (Build.VERSION.SDK_INT >= 26) {
                AbstractC11829l.billing(viewTreeObserverOnGlobalLayoutListenerC13840l);
            } else {
                viewTreeObserverOnGlobalLayoutListenerC13840l.invalidate();
            }
            if (ViewTreeObserverOnGlobalLayoutListenerC13840l.remoteconfig()) {
                viewTreeObserverOnGlobalLayoutListenerC13840l.m3775throw(0.0f);
            }
        }
        boolean z3 = this.f35285l;
        this.f35285l = c6148l.f12943l;
        this.f35288l = c6148l.f12952l;
        boolean z4 = c16803l2.yandex == c16803l.yandex && c16803l2.loadAd == c16803l.loadAd && c16803l2.crashlytics == c16803l.crashlytics && c16803l2.amazon == c16803l.amazon && c16803l2.purchase == c16803l.purchase && c16803l2.billing == c16803l.billing && c16803l2.mopub == c16803l.mopub && c16803l2.admob == c16803l.admob && C1723l.yandex(c16803l2.subs, c16803l.subs);
        if (z && ((!z4 || z3 != this.f35285l) && (interfaceC11218l = c3654l.f7680l) != null)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC13840l) interfaceC11218l).ad(c3654l);
        }
        if (z4) {
            return;
        }
        c3654l.m1379else(this);
        if (c3654l.f7672l > 0) {
            ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l2 = (ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(c3654l);
            C18396l c18396l = viewTreeObserverOnGlobalLayoutListenerC13840l2.f27005l.purchase;
            c18396l.getClass();
            if (c3654l.f7672l > 0) {
                ((C17893l) c18396l.f35934l).crashlytics(c3654l);
                c3654l.f7681l = true;
            }
            viewTreeObserverOnGlobalLayoutListenerC13840l2.m3774synchronized(null);
        }
    }

    /* JADX INFO: renamed from: lًؑٝ, reason: contains not printable characters */
    public final boolean m4464l() {
        if (this.f35287l != null && this.f35288l <= 0.0f) {
            return true;
        }
        AbstractC18026l abstractC18026l = this.f35294l;
        if (abstractC18026l != null) {
            return abstractC18026l.m4464l();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01dd A[PHI: r4
  0x01dd: PHI (r4v12 ??) = (r4v1 ??), (r4v1 ??), (r4v14 ??) binds: [B:55:0x01a6, B:57:0x01aa, B:71:0x01d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r3v19, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX INFO: renamed from: lؑۨٝ, reason: contains not printable characters */
    public final void m4465l(AbstractC14971l abstractC14971l, InterfaceC4789l interfaceC4789l, long j, C18333l c18333l, int i, boolean z, float f, boolean z2) {
        ?? LoadAd;
        if (abstractC14971l == null) {
            mo3040l(interfaceC4789l, j, c18333l, i, z);
            return;
        }
        if (!interfaceC4789l.admob(abstractC14971l)) {
            m4465l(AbstractC0509l.yandex(abstractC14971l, interfaceC4789l.mopub()), interfaceC4789l, j, c18333l, i, z, f, z2);
            return;
        }
        int i2 = i;
        char c = 3;
        if (i2 == 3 || i2 == 4) {
            ?? r3 = abstractC14971l;
            ?? c17893l = 0;
            while (r3 != 0) {
                if (r3 instanceof InterfaceC13202l) {
                    long jTapsense = ((InterfaceC13202l) r3).tapsense();
                    int i3 = (int) (j >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i3);
                    C3654l c3654l = this.f35281l;
                    EnumC9931l enumC9931l = c3654l.f7691l;
                    int i4 = AbstractC10549l.loadAd;
                    long j2 = Long.MIN_VALUE & jTapsense;
                    EnumC9931l enumC9931l2 = EnumC9931l.f20223l;
                    if (fIntBitsToFloat < (-((j2 == 0 || enumC9931l == enumC9931l2) ? C6760l.billing(0, jTapsense) : C6760l.billing(2, jTapsense)))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i3) >= mo1466switch() + ((j2 == 0 || c3654l.f7691l == enumC9931l2) ? C6760l.billing(2, jTapsense) : C6760l.billing(0, jTapsense))) {
                        break;
                    }
                    int i5 = (int) (j & 4294967295L);
                    float fIntBitsToFloat2 = Float.intBitsToFloat(i5);
                    int i6 = AbstractC10549l.loadAd;
                    if (fIntBitsToFloat2 < (-C6760l.billing(1, jTapsense))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i5) >= C6760l.billing(3, jTapsense) + mo1458catch()) {
                        break;
                    }
                    C9571l c9571l = c18333l.f35843l;
                    C12463l c12463l = c18333l.f35844l;
                    if (c18333l.f35842l == AbstractC14055l.smaato(c18333l)) {
                        int i7 = c18333l.f35842l;
                        c18333l.billing(i7 + 1, c12463l.loadAd);
                        c18333l.f35842l++;
                        c12463l.yandex(abstractC14971l);
                        c9571l.yandex(AbstractC12300l.loadAd(0.0f, z, true));
                        m4465l(AbstractC0509l.yandex(abstractC14971l, interfaceC4789l.mopub()), interfaceC4789l, j, c18333l, i2, z, f, z2);
                        Unit unit = Unit.INSTANCE;
                        c18333l.f35842l = i7;
                        return;
                    }
                    long jAmazon = c18333l.amazon();
                    int i8 = c18333l.f35842l;
                    if (!AbstractC10733l.purchase(jAmazon)) {
                        if (AbstractC10733l.crashlytics(jAmazon) > 0.0f) {
                            int i9 = c18333l.f35842l;
                            c18333l.billing(i9 + 1, c12463l.loadAd);
                            c18333l.f35842l++;
                            c12463l.yandex(abstractC14971l);
                            c9571l.yandex(AbstractC12300l.loadAd(0.0f, z, true));
                            m4465l(AbstractC0509l.yandex(abstractC14971l, interfaceC4789l.mopub()), interfaceC4789l, j, c18333l, i, z, f, z2);
                            Unit unit2 = Unit.INSTANCE;
                            c18333l.f35842l = i9;
                            return;
                        }
                        return;
                    }
                    int iSmaato = AbstractC14055l.smaato(c18333l);
                    c18333l.f35842l = iSmaato;
                    c18333l.billing(iSmaato + 1, c12463l.loadAd);
                    c18333l.f35842l++;
                    c12463l.yandex(abstractC14971l);
                    c9571l.yandex(AbstractC12300l.loadAd(0.0f, z, true));
                    m4465l(AbstractC0509l.yandex(abstractC14971l, interfaceC4789l.mopub()), interfaceC4789l, j, c18333l, i, z, f, z2);
                    Unit unit3 = Unit.INSTANCE;
                    c18333l.f35842l = iSmaato;
                    if (AbstractC10733l.crashlytics(c18333l.amazon()) < 0.0f) {
                        c18333l.billing(i8 + 1, c18333l.f35842l + 1);
                    }
                    c18333l.f35842l = i8;
                    return;
                }
                char c2 = c;
                if ((r3.f29450l & 16) == 0 || !(r3 instanceof AbstractC11340l)) {
                    LoadAd = r3;
                    c17893l = c17893l;
                    LoadAd = AbstractC5573l.loadAd(c17893l);
                } else {
                    AbstractC14971l abstractC14971l2 = ((AbstractC11340l) r3).f22875l;
                    int i10 = 0;
                    while (abstractC14971l2 != null) {
                        if ((abstractC14971l2.f29450l & 16) != 0) {
                            i10++;
                            if (i10 == 1) {
                                LoadAd = r3;
                                c17893l = c17893l;
                                c17893l = c17893l;
                                LoadAd = abstractC14971l2;
                            } else {
                                if (c17893l == 0) {
                                    c17893l = new C17893l(0, new AbstractC14971l[16]);
                                }
                                if (LoadAd != 0) {
                                    c17893l.crashlytics(LoadAd);
                                    LoadAd = 0;
                                }
                                c17893l.crashlytics(abstractC14971l2);
                            }
                        } else {
                            LoadAd = r3;
                            c17893l = c17893l;
                        }
                        abstractC14971l2 = abstractC14971l2.f29460l;
                        LoadAd = LoadAd;
                        c17893l = c17893l;
                    }
                    if (i10 == 1) {
                        LoadAd = r3;
                        c17893l = c17893l;
                    } else {
                        LoadAd = r3;
                        c17893l = c17893l;
                        LoadAd = AbstractC5573l.loadAd(c17893l);
                    }
                }
                i2 = i;
                c = c2;
                r3 = LoadAd;
                c17893l = c17893l;
            }
        }
        if (z2) {
            m4474l(abstractC14971l, interfaceC4789l, j, c18333l, i, z, f);
        } else {
            m4480l(abstractC14971l, interfaceC4789l, j, c18333l, i, z, f);
        }
    }

    /* JADX INFO: renamed from: lؘؓؖ, reason: contains not printable characters */
    public final AbstractC18026l m4466l(AbstractC18026l abstractC18026l) {
        C3654l c3654lLicense = abstractC18026l.f35281l;
        C3654l c3654l = this.f35281l;
        if (c3654lLicense == c3654l) {
            AbstractC14971l abstractC14971lMo2643l = abstractC18026l.mo2643l();
            AbstractC14971l abstractC14971lMo2643l2 = mo2643l();
            if (!abstractC14971lMo2643l2.f29454l.f29462l) {
                AbstractC0081l.crashlytics("visitLocalAncestors called on an unattached node");
            }
            for (AbstractC14971l abstractC14971l = abstractC14971lMo2643l2.f29454l.f29456l; abstractC14971l != null; abstractC14971l = abstractC14971l.f29456l) {
                if ((abstractC14971l.f29450l & 2) != 0 && abstractC14971l == abstractC14971lMo2643l) {
                    return abstractC18026l;
                }
            }
            return this;
        }
        while (c3654lLicense.f7710l > c3654l.f7710l) {
            c3654lLicense = c3654lLicense.license();
        }
        C3654l c3654lLicense2 = c3654l;
        while (c3654lLicense2.f7710l > c3654lLicense.f7710l) {
            c3654lLicense2 = c3654lLicense2.license();
        }
        while (c3654lLicense != c3654lLicense2) {
            c3654lLicense = c3654lLicense.license();
            c3654lLicense2 = c3654lLicense2.license();
            if (c3654lLicense == null || c3654lLicense2 == null) {
                C8339l.metrica("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (c3654lLicense2 != c3654l) {
            if (c3654lLicense != abstractC18026l.f35281l) {
                return (C11103l) c3654lLicense.f7703l.amazon;
            }
            return abstractC18026l;
        }
        return this;
    }

    /* JADX INFO: renamed from: lؓۚ۟, reason: contains not printable characters */
    public final void m4467l() {
        if (this.f35287l != null) {
            if (this.f35283l != null) {
                this.f35283l = null;
            }
            m4486l(null, false);
            this.f35281l.m1387new(false);
        }
    }

    /* JADX INFO: renamed from: lٕؓۡ, reason: contains not printable characters */
    public final void m4468l(AbstractC18026l abstractC18026l, float[] fArr) {
        while (!AbstractC8576l.yandex(this, abstractC18026l)) {
            InterfaceC10702l interfaceC10702l = this.f35287l;
            if (interfaceC10702l != null) {
                C10924l.subs(fArr, ((C6577l) interfaceC10702l).loadAd());
            }
            long j = this.f35291l;
            if (!C5177l.loadAd(j, 0L)) {
                float[] fArr2 = f35267l;
                C10924l.amazon(fArr2);
                C10924l.isPro(fArr2, (int) (j >> 32), (int) (j & 4294967295L));
                C10924l.subs(fArr, fArr2);
            }
            this = this.f35294l;
        }
    }

    /* JADX INFO: renamed from: lؙؔؑ, reason: contains not printable characters */
    public final void m4469l(InterfaceC14859l interfaceC14859l, C11925l c11925l) {
        InterfaceC10702l interfaceC10702l = this.f35287l;
        if (interfaceC10702l == null) {
            long j = this.f35291l;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            interfaceC14859l.startapp(f, f2);
            m4470l(interfaceC14859l, c11925l);
            interfaceC14859l.startapp(-f, -f2);
            return;
        }
        C6577l c6577l = (C6577l) interfaceC10702l;
        C13601l c13601l = c6577l.f13729l;
        c6577l.mopub();
        c6577l.f13733l = c6577l.f13737l.yandex.mo394extends() > 0.0f;
        C18449l c18449l = c13601l.f26629l;
        c18449l.m4544goto(interfaceC14859l);
        c18449l.f36009l = c11925l;
        AbstractC2576l.loadAd(c13601l, c6577l.f13737l);
    }

    /* JADX INFO: renamed from: lٖؖ۠ */
    public abstract AbstractC14971l mo2643l();

    /* JADX INFO: renamed from: lّؗؑ, reason: contains not printable characters */
    public final void m4470l(InterfaceC14859l interfaceC14859l, C11925l c11925l) {
        AbstractC18026l abstractC18026l;
        InterfaceC14859l interfaceC14859l2;
        C11925l c11925l2;
        AbstractC14971l abstractC14971lM4472l = m4472l(4);
        if (abstractC14971lM4472l == null) {
            mo2647l(interfaceC14859l, c11925l);
            return;
        }
        C3654l c3654l = this.f35281l;
        c3654l.getClass();
        C6742l sharedDrawScope = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(c3654l)).getSharedDrawScope();
        long jMopub = AbstractC14707l.mopub(this.f20590l);
        sharedDrawScope.getClass();
        C17893l c17893l = null;
        while (abstractC14971lM4472l != null) {
            if (abstractC14971lM4472l instanceof InterfaceC16388l) {
                abstractC18026l = this;
                interfaceC14859l2 = interfaceC14859l;
                c11925l2 = c11925l;
                sharedDrawScope.crashlytics(interfaceC14859l2, jMopub, abstractC18026l, (InterfaceC16388l) abstractC14971lM4472l, c11925l2);
            } else {
                abstractC18026l = this;
                interfaceC14859l2 = interfaceC14859l;
                c11925l2 = c11925l;
                if ((abstractC14971lM4472l.f29450l & 4) != 0 && (abstractC14971lM4472l instanceof AbstractC11340l)) {
                    int i = 0;
                    for (AbstractC14971l abstractC14971l = ((AbstractC11340l) abstractC14971lM4472l).f22875l; abstractC14971l != null; abstractC14971l = abstractC14971l.f29460l) {
                        if ((abstractC14971l.f29450l & 4) != 0) {
                            i++;
                            if (i == 1) {
                                abstractC14971lM4472l = abstractC14971l;
                            } else {
                                if (c17893l == null) {
                                    c17893l = new C17893l(0, new AbstractC14971l[16]);
                                }
                                if (abstractC14971lM4472l != null) {
                                    c17893l.crashlytics(abstractC14971lM4472l);
                                    abstractC14971lM4472l = null;
                                }
                                c17893l.crashlytics(abstractC14971l);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                interfaceC14859l = interfaceC14859l2;
                this = abstractC18026l;
                c11925l = c11925l2;
            }
            abstractC14971lM4472l = AbstractC5573l.loadAd(c17893l);
            interfaceC14859l = interfaceC14859l2;
            this = abstractC18026l;
            c11925l = c11925l2;
        }
    }

    /* JADX INFO: renamed from: lؗۨؑ, reason: contains not printable characters */
    public final long m4471l() {
        return this.f35269l.mo869l(this.f35281l.f7699l.amazon());
    }

    /* JADX INFO: renamed from: lٍؘؘ, reason: contains not printable characters */
    public final AbstractC14971l m4472l(int i) {
        boolean zMopub = AbstractC3068l.mopub(i);
        AbstractC14971l abstractC14971lMo2643l = mo2643l();
        if (!zMopub && (abstractC14971lMo2643l = abstractC14971lMo2643l.f29456l) == null) {
            return null;
        }
        for (AbstractC14971l abstractC14971lM4493l = m4493l(zMopub); abstractC14971lM4493l != null && (abstractC14971lM4493l.f29457l & i) != 0; abstractC14971lM4493l = abstractC14971lM4493l.f29460l) {
            if ((abstractC14971lM4493l.f29450l & i) != 0) {
                return abstractC14971lM4493l;
            }
            if (abstractC14971lM4493l == abstractC14971lMo2643l) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: lؘِٞ, reason: contains not printable characters */
    public final void m4473l(AbstractC18026l abstractC18026l, C10006l c10006l, boolean z) {
        if (abstractC18026l == this) {
            return;
        }
        AbstractC18026l abstractC18026l2 = this.f35294l;
        if (abstractC18026l2 != null) {
            abstractC18026l2.m4473l(abstractC18026l, c10006l, z);
        }
        long j = this.f35291l;
        float f = (int) (j >> 32);
        c10006l.loadAd -= f;
        c10006l.amazon -= f;
        float f2 = (int) (j & 4294967295L);
        c10006l.crashlytics -= f2;
        c10006l.purchase -= f2;
        InterfaceC10702l interfaceC10702l = this.f35287l;
        if (interfaceC10702l != null) {
            C6577l c6577l = (C6577l) interfaceC10702l;
            float[] fArrYandex = c6577l.yandex();
            if (!c6577l.f13738l) {
                if (fArrYandex == null) {
                    c10006l.loadAd = 0.0f;
                    c10006l.crashlytics = 0.0f;
                    c10006l.amazon = 0.0f;
                    c10006l.purchase = 0.0f;
                } else {
                    C10924l.crashlytics(fArrYandex, c10006l);
                }
            }
            if (this.f35285l && z) {
                long j2 = this.f20590l;
                c10006l.yandex(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final void m4474l(AbstractC14971l abstractC14971l, InterfaceC4789l interfaceC4789l, long j, C18333l c18333l, int i, boolean z, float f) {
        if (abstractC14971l == null) {
            mo3040l(interfaceC4789l, j, c18333l, i, z);
            return;
        }
        if (!interfaceC4789l.admob(abstractC14971l)) {
            m4474l(AbstractC0509l.yandex(abstractC14971l, interfaceC4789l.mopub()), interfaceC4789l, j, c18333l, i, z, f);
            return;
        }
        int i2 = c18333l.f35842l;
        C12463l c12463l = c18333l.f35844l;
        c18333l.billing(i2 + 1, c12463l.loadAd);
        c18333l.f35842l++;
        c12463l.yandex(abstractC14971l);
        c18333l.f35843l.yandex(AbstractC12300l.loadAd(f, z, false));
        m4465l(AbstractC0509l.yandex(abstractC14971l, interfaceC4789l.mopub()), interfaceC4789l, j, c18333l, i, z, f, true);
        c18333l.f35842l = i2;
    }

    /* JADX INFO: renamed from: lؙؗٗ, reason: contains not printable characters */
    public final C8896l m4475l() {
        if (mo2643l().f29462l) {
            InterfaceC18212l interfaceC18212lCrashlytics = AbstractC9690l.crashlytics(this);
            C10006l c10006l = this.f35292l;
            if (c10006l == null) {
                c10006l = new C10006l();
                this.f35292l = c10006l;
            }
            long jM4476l = m4476l(m4471l());
            int i = (int) (jM4476l >> 32);
            c10006l.loadAd = -Float.intBitsToFloat(i);
            int i2 = (int) (jM4476l & 4294967295L);
            c10006l.crashlytics = -Float.intBitsToFloat(i2);
            c10006l.amazon = Float.intBitsToFloat(i) + mo1466switch();
            c10006l.purchase = Float.intBitsToFloat(i2) + mo1458catch();
            while (this != interfaceC18212lCrashlytics) {
                this.m4482l(c10006l, false, true);
                if (!c10006l.loadAd()) {
                    this = this.f35294l;
                }
            }
            return new C8896l(c10006l.loadAd, c10006l.crashlytics, c10006l.amazon, c10006l.purchase);
        }
        return C8896l.purchase;
    }

    /* JADX INFO: renamed from: lؙٗۛ, reason: contains not printable characters */
    public final long m4476l(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - mo1466switch();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - mo1458catch();
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L);
    }

    /* JADX INFO: renamed from: lؙ۟ٙ, reason: contains not printable characters */
    public final float m4477l(long j, long j2) {
        if (mo1466switch() >= Float.intBitsToFloat((int) (j2 >> 32)) && mo1458catch() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jM4476l = m4476l(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM4476l >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM4476l & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - mo1466switch());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - mo1458catch()))) & 4294967295L);
        if ((fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) && Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) <= fIntBitsToFloat && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) <= fIntBitsToFloat2) {
            return C1187l.amazon(jFloatToRawIntBits);
        }
        return Float.POSITIVE_INFINITY;
    }

    /* JADX INFO: renamed from: lؚؚؔ, reason: contains not printable characters */
    public final void m4478l(long j, float f, Function1 function1, C11925l c11925l) {
        int i = 0;
        C3654l c3654l = this.f35281l;
        if (c11925l != null) {
            if (function1 != null) {
                AbstractC0081l.yandex("both ways to create layers shouldn't be used together");
            }
            if (this.f35283l != c11925l) {
                this.f35283l = null;
                m4486l(null, false);
                this.f35283l = c11925l;
            }
            if (this.f35287l == null) {
                InterfaceC11218l interfaceC11218lYandex = AbstractC5672l.yandex(c3654l);
                C17671l c17671l = this.f35277l;
                if (c17671l == null) {
                    C17671l c17671l2 = new C17671l(this, new C10446l(this, i), 4);
                    this.f35277l = c17671l2;
                    c17671l = c17671l2;
                }
                C10446l c10446l = this.f35272l;
                InterfaceC10702l interfaceC10702lAdmob = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) interfaceC11218lYandex).admob(c17671l, c10446l, c11925l);
                C6577l c6577l = (C6577l) interfaceC10702lAdmob;
                c6577l.purchase(this.f20590l);
                c6577l.amazon(j);
                this.f35287l = interfaceC10702lAdmob;
                c3654l.f7694l = true;
                c10446l.invoke();
            }
        } else {
            if (this.f35283l != null) {
                this.f35283l = null;
                m4486l(null, false);
            }
            m4486l(function1, false);
        }
        if (!C5177l.loadAd(this.f35291l, j)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(c3654l)).m3775throw(-4.0f);
            this.f35291l = j;
            InterfaceC10702l interfaceC10702l = this.f35287l;
            if (interfaceC10702l != null) {
                ((C6577l) interfaceC10702l).amazon(j);
            } else {
                AbstractC18026l abstractC18026l = this.f35294l;
                if (abstractC18026l != null) {
                    abstractC18026l.m4495l();
                }
            }
            c3654l.m1379else(this);
            AbstractC11754l.m3243l(this);
            InterfaceC11218l interfaceC11218l = c3654l.f7680l;
            if (interfaceC11218l != null) {
                ((ViewTreeObserverOnGlobalLayoutListenerC13840l) interfaceC11218l).ad(c3654l);
            }
        }
        this.f35268l = f;
        if (this == ((AbstractC18026l) c3654l.f7703l.purchase)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(c3654l)).getRectManager().admob(c3654l);
        }
        if (this.f23549l) {
            return;
        }
        m3249try(mo1000l());
    }

    /* JADX INFO: renamed from: lٍؚۖ */
    public abstract void mo2644l();

    @Override // defpackage.AbstractC11754l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public final AbstractC11754l mo996l() {
        return this.f35294l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [lْ٘ۖ] */
    /* JADX INFO: renamed from: lًَٙ, reason: contains not printable characters */
    public final void m4479l(InterfaceC17792l interfaceC17792l) {
        AbstractC18026l abstractC18026l;
        InterfaceC17792l interfaceC17792l2 = this.f35293l;
        if (interfaceC17792l != interfaceC17792l2) {
            this.f35293l = interfaceC17792l;
            C3654l c3654l = this.f35281l;
            int i = 0;
            if (interfaceC17792l2 == null || interfaceC17792l.purchase() != interfaceC17792l2.purchase() || interfaceC17792l.loadAd() != interfaceC17792l2.loadAd()) {
                int iPurchase = interfaceC17792l.purchase();
                int iLoadAd = interfaceC17792l.loadAd();
                InterfaceC10702l interfaceC10702l = this.f35287l;
                if (interfaceC10702l != null) {
                    ((C6577l) interfaceC10702l).purchase((((long) iPurchase) << 32) | (((long) iLoadAd) & 4294967295L));
                } else if (c3654l.m1389private() && (abstractC18026l = this.f35294l) != null) {
                    abstractC18026l.m4495l();
                }
                m2887default((((long) iLoadAd) & 4294967295L) | (((long) iPurchase) << 32));
                if (this.f35289l != null) {
                    m4463l(false);
                }
                boolean zMopub = AbstractC3068l.mopub(4);
                AbstractC14971l abstractC14971lMo2643l = mo2643l();
                if (zMopub || (abstractC14971lMo2643l = abstractC14971lMo2643l.f29456l) != null) {
                    for (AbstractC14971l abstractC14971lM4493l = m4493l(zMopub); abstractC14971lM4493l != null && (abstractC14971lM4493l.f29457l & 4) != 0; abstractC14971lM4493l = abstractC14971lM4493l.f29460l) {
                        if ((abstractC14971lM4493l.f29450l & 4) != 0) {
                            ?? LoadAd = abstractC14971lM4493l;
                            ?? c17893l = 0;
                            while (LoadAd != 0) {
                                if (LoadAd instanceof InterfaceC16388l) {
                                    ((InterfaceC16388l) LoadAd).mo533continue();
                                } else if ((LoadAd.f29450l & 4) != 0 && (LoadAd instanceof AbstractC11340l)) {
                                    AbstractC14971l abstractC14971l = ((AbstractC11340l) LoadAd).f22875l;
                                    int i2 = 0;
                                    LoadAd = LoadAd;
                                    c17893l = c17893l;
                                    while (abstractC14971l != null) {
                                        if ((abstractC14971l.f29450l & 4) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                c17893l = c17893l;
                                                LoadAd = abstractC14971l;
                                            } else {
                                                if (c17893l == 0) {
                                                    c17893l = new C17893l(0, new AbstractC14971l[16]);
                                                }
                                                if (LoadAd != 0) {
                                                    c17893l.crashlytics(LoadAd);
                                                    LoadAd = 0;
                                                }
                                                c17893l.crashlytics(abstractC14971l);
                                            }
                                        }
                                        abstractC14971l = abstractC14971l.f29460l;
                                        LoadAd = LoadAd;
                                        c17893l = c17893l;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                LoadAd = AbstractC5573l.loadAd(c17893l);
                            }
                        }
                        if (abstractC14971lM4493l == abstractC14971lMo2643l) {
                            break;
                        }
                    }
                }
                InterfaceC11218l interfaceC11218l = c3654l.f7680l;
                if (interfaceC11218l != null) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC13840l) interfaceC11218l).ad(c3654l);
                }
                c3654l.m1379else(this);
            }
            C7661l c7661l = this.f35282l;
            if ((c7661l == null || c7661l.purchase == 0) && interfaceC17792l.yandex().isEmpty()) {
                return;
            }
            C7661l c7661l2 = this.f35282l;
            Map mapYandex = interfaceC17792l.yandex();
            if (c7661l2 != null && c7661l2.purchase == mapYandex.size()) {
                Object[] objArr = c7661l2.loadAd;
                int[] iArr = c7661l2.crashlytics;
                long[] jArr = c7661l2.yandex;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) mapYandex.get((AbstractC12914l) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            c3654l.f7667l.startapp.f29327l.billing();
            C7661l c7661l3 = this.f35282l;
            if (c7661l3 == null) {
                C7661l c7661l4 = AbstractC4785l.yandex;
                c7661l3 = new C7661l();
                this.f35282l = c7661l3;
            }
            c7661l3.yandex();
            for (Map.Entry entry : interfaceC17792l.yandex().entrySet()) {
                c7661l3.mopub(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    /* JADX INFO: renamed from: lًٚٔ */
    public abstract AbstractC1668l mo2645l();

    /* JADX INFO: renamed from: lٌّۡ */
    public void mo3040l(InterfaceC4789l interfaceC4789l, long j, C18333l c18333l, int i, boolean z) {
        AbstractC18026l abstractC18026l = this.f35271l;
        if (abstractC18026l != null) {
            abstractC18026l.m4492l(interfaceC4789l, abstractC18026l.m4488l(j, true), c18333l, i, z);
        }
    }

    /* JADX INFO: renamed from: lٍٙؐ, reason: contains not printable characters */
    public final void m4480l(AbstractC14971l abstractC14971l, InterfaceC4789l interfaceC4789l, long j, C18333l c18333l, int i, boolean z, float f) {
        int i2;
        if (abstractC14971l == null) {
            mo3040l(interfaceC4789l, j, c18333l, i, z);
            return;
        }
        if (!interfaceC4789l.admob(abstractC14971l)) {
            m4480l(AbstractC0509l.yandex(abstractC14971l, interfaceC4789l.mopub()), interfaceC4789l, j, c18333l, i, z, f);
            return;
        }
        if (!interfaceC4789l.billing(abstractC14971l)) {
            m4465l(AbstractC0509l.yandex(abstractC14971l, interfaceC4789l.mopub()), interfaceC4789l, j, c18333l, i, z, f, false);
            return;
        }
        C9571l c9571l = c18333l.f35843l;
        C12463l c12463l = c18333l.f35844l;
        if (c18333l.f35842l != AbstractC14055l.smaato(c18333l)) {
            long jAmazon = c18333l.amazon();
            int i3 = c18333l.f35842l;
            int iSmaato = AbstractC14055l.smaato(c18333l);
            c18333l.f35842l = iSmaato;
            c18333l.billing(iSmaato + 1, c12463l.loadAd);
            c18333l.f35842l++;
            c12463l.yandex(abstractC14971l);
            c9571l.yandex(AbstractC12300l.loadAd(f, z, false));
            m4465l(AbstractC0509l.yandex(abstractC14971l, interfaceC4789l.mopub()), interfaceC4789l, j, c18333l, i, z, f, false);
            Unit unit = Unit.INSTANCE;
            c18333l.f35842l = iSmaato;
            long jAmazon2 = c18333l.amazon();
            if (c18333l.f35842l + 1 >= AbstractC14055l.smaato(c18333l) || AbstractC10733l.yandex(jAmazon, jAmazon2) <= 0) {
                c18333l.billing(c18333l.f35842l + 1, c12463l.loadAd);
            } else {
                int i4 = i3 + 1;
                boolean zPurchase = AbstractC10733l.purchase(jAmazon2);
                int i5 = c18333l.f35842l;
                c18333l.billing(i4, zPurchase ? i5 + 2 : i5 + 1);
            }
            c18333l.f35842l = i3;
            return;
        }
        int i6 = c18333l.f35842l;
        int i7 = i6 + 1;
        c18333l.billing(i7, c12463l.loadAd);
        c18333l.f35842l++;
        c12463l.yandex(abstractC14971l);
        c9571l.yandex(AbstractC12300l.loadAd(f, z, false));
        m4465l(AbstractC0509l.yandex(abstractC14971l, interfaceC4789l.mopub()), interfaceC4789l, j, c18333l, i, z, f, false);
        Unit unit2 = Unit.INSTANCE;
        c18333l.f35842l = i6;
        if (i7 == AbstractC14055l.smaato(c18333l) || AbstractC10733l.purchase(c18333l.amazon())) {
            int i8 = c18333l.f35842l;
            int i9 = i8 + 1;
            c12463l.remoteconfig(i9);
            if (i9 < 0 || i9 >= (i2 = c9571l.loadAd)) {
                AbstractC13082l.amazon("Index must be between 0 and size");
                throw null;
            }
            long[] jArr = c9571l.yandex;
            long j2 = jArr[i9];
            if (i9 != i2 - 1) {
                AbstractC8669l.license(i9, i8 + 2, i2, jArr, jArr);
            }
            c9571l.loadAd--;
        }
    }

    /* JADX INFO: renamed from: lٍۤٙ, reason: contains not printable characters */
    public final void m4481l() {
        this.f35279l = true;
        this.f35272l.invoke();
        m4467l();
        if (C5177l.loadAd(this.f35291l, 0L)) {
            return;
        }
        this.f35281l.m1379else(this);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX INFO: renamed from: lُٔۨ, reason: contains not printable characters */
    public final void m4482l(C10006l c10006l, boolean z, boolean z2) {
        long jFloatToRawIntBits;
        InterfaceC10702l interfaceC10702l = this.f35287l;
        if (interfaceC10702l != null) {
            if (this.f35285l) {
                if (z2) {
                    long jM4471l = m4471l();
                    float f = c10006l.loadAd;
                    float f2 = c10006l.crashlytics;
                    if (c10006l.amazon >= 0.0f) {
                        long j = this.f20590l;
                        if (f > ((int) (j >> 32)) || c10006l.purchase < 0.0f || f2 > ((int) (j & 4294967295L))) {
                            jFloatToRawIntBits = 0;
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jM4471l >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM4471l & 4294967295L));
                            float f3 = (fIntBitsToFloat - (c10006l.amazon - c10006l.loadAd)) / 2.0f;
                            if (f3 > 0.0f) {
                                f -= f3;
                            } else {
                                float f4 = (-fIntBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (fIntBitsToFloat2 - (c10006l.purchase - c10006l.crashlytics)) / 2.0f;
                            if (f5 > 0.0f) {
                                f2 -= f5;
                            } else {
                                float f6 = (-fIntBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                        }
                    } else {
                        jFloatToRawIntBits = 0;
                    }
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                    long j2 = this.f20590l;
                    float f7 = (int) (j2 >> 32);
                    int i = (int) (jM4471l >> 32);
                    float f8 = (int) (j2 & 4294967295L);
                    int i2 = (int) (jM4471l & 4294967295L);
                    c10006l.yandex(fIntBitsToFloat3, fIntBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + fIntBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + fIntBitsToFloat4)));
                } else if (z) {
                    long j3 = this.f20590l;
                    c10006l.yandex(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L));
                }
                if (c10006l.loadAd()) {
                    return;
                }
            }
            C6577l c6577l = (C6577l) interfaceC10702l;
            float[] fArrLoadAd = c6577l.loadAd();
            if (!c6577l.f13738l) {
                if (fArrLoadAd == null) {
                    c10006l.loadAd = 0.0f;
                    c10006l.crashlytics = 0.0f;
                    c10006l.amazon = 0.0f;
                    c10006l.purchase = 0.0f;
                } else {
                    C10924l.crashlytics(fArrLoadAd, c10006l);
                }
            }
        }
        long j4 = this.f35291l;
        float f9 = (int) (j4 >> 32);
        c10006l.loadAd += f9;
        c10006l.amazon += f9;
        float f10 = (int) (j4 & 4294967295L);
        c10006l.crashlytics += f10;
        c10006l.purchase += f10;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x017c  */
    /* JADX INFO: renamed from: lِۙٞ, reason: contains not printable characters */
    public final boolean m4483l(long j) {
        boolean z;
        boolean z2;
        boolean zAdmob;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        InterfaceC10702l interfaceC10702l = this.f35287l;
        if (interfaceC10702l == null || !this.f35285l) {
            return true;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        C11925l c11925l = ((C6577l) interfaceC10702l).f13737l;
        if (c11925l.signatures) {
            AbstractC15342l abstractC15342lAmazon = c11925l.amazon();
            if (abstractC15342lAmazon instanceof C13080l) {
                C8896l c8896l = ((C13080l) abstractC15342lAmazon).amazon;
                if (c8896l.yandex > fIntBitsToFloat || fIntBitsToFloat >= c8896l.crashlytics || c8896l.loadAd > fIntBitsToFloat2 || fIntBitsToFloat2 >= c8896l.amazon) {
                    z = false;
                    z2 = true;
                }
                z = false;
                z2 = true;
            } else if (abstractC15342lAmazon instanceof C18521l) {
                C3903l c3903l = ((C18521l) abstractC15342lAmazon).amazon;
                float f = c3903l.yandex;
                long j2 = c3903l.billing;
                long j3 = c3903l.admob;
                long j4 = c3903l.mopub;
                float f2 = c3903l.amazon;
                float f3 = c3903l.loadAd;
                z = false;
                float f4 = c3903l.crashlytics;
                z2 = true;
                long j5 = c3903l.purchase;
                if (fIntBitsToFloat >= f && fIntBitsToFloat < f4 && fIntBitsToFloat2 >= f3 && fIntBitsToFloat2 < f2) {
                    int i = (int) (j5 >> 32);
                    int i2 = (int) (j2 >> 32);
                    if (Float.intBitsToFloat(i2) + Float.intBitsToFloat(i) <= c3903l.loadAd()) {
                        int i3 = (int) (j3 >> 32);
                        int i4 = (int) (j4 >> 32);
                        if (Float.intBitsToFloat(i4) + Float.intBitsToFloat(i3) <= c3903l.loadAd()) {
                            int i5 = (int) (j5 & 4294967295L);
                            int i6 = (int) (j3 & 4294967295L);
                            if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= c3903l.yandex()) {
                                int i7 = (int) (j2 & 4294967295L);
                                int i8 = (int) (j4 & 4294967295L);
                                if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= c3903l.yandex()) {
                                    float fIntBitsToFloat3 = Float.intBitsToFloat(i) + f;
                                    float fIntBitsToFloat4 = Float.intBitsToFloat(i5) + f3;
                                    float fIntBitsToFloat5 = f4 - Float.intBitsToFloat(i2);
                                    float fIntBitsToFloat6 = Float.intBitsToFloat(i7) + f3;
                                    float fIntBitsToFloat7 = f4 - Float.intBitsToFloat(i4);
                                    float fIntBitsToFloat8 = f2 - Float.intBitsToFloat(i8);
                                    float fIntBitsToFloat9 = f2 - Float.intBitsToFloat(i6);
                                    float fIntBitsToFloat10 = Float.intBitsToFloat(i3) + f;
                                    if (fIntBitsToFloat < fIntBitsToFloat3 && fIntBitsToFloat2 < fIntBitsToFloat4) {
                                        zAdmob = AbstractC3105l.admob(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, c3903l.purchase);
                                    } else if (fIntBitsToFloat < fIntBitsToFloat10 && fIntBitsToFloat2 > fIntBitsToFloat9) {
                                        zAdmob = AbstractC3105l.admob(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat10, fIntBitsToFloat9, c3903l.admob);
                                    } else if (fIntBitsToFloat <= fIntBitsToFloat5 || fIntBitsToFloat2 >= fIntBitsToFloat6) {
                                        zAdmob = (fIntBitsToFloat <= fIntBitsToFloat7 || fIntBitsToFloat2 <= fIntBitsToFloat8) ? z2 : AbstractC3105l.admob(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat7, fIntBitsToFloat8, c3903l.mopub);
                                    } else {
                                        zAdmob = AbstractC3105l.admob(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat5, fIntBitsToFloat6, c3903l.billing);
                                    }
                                } else {
                                    C9902l c9902lYandex = AbstractC3478l.yandex();
                                    AbstractC15560l.firebase(c9902lYandex, c3903l);
                                    zAdmob = AbstractC3105l.mopub(fIntBitsToFloat, fIntBitsToFloat2, c9902lYandex);
                                }
                            } else {
                                C9902l c9902lYandex2 = AbstractC3478l.yandex();
                                AbstractC15560l.firebase(c9902lYandex2, c3903l);
                                zAdmob = AbstractC3105l.mopub(fIntBitsToFloat, fIntBitsToFloat2, c9902lYandex2);
                            }
                        } else {
                            C9902l c9902lYandex3 = AbstractC3478l.yandex();
                            AbstractC15560l.firebase(c9902lYandex3, c3903l);
                            zAdmob = AbstractC3105l.mopub(fIntBitsToFloat, fIntBitsToFloat2, c9902lYandex3);
                        }
                    } else {
                        C9902l c9902lYandex4 = AbstractC3478l.yandex();
                        AbstractC15560l.firebase(c9902lYandex4, c3903l);
                        zAdmob = AbstractC3105l.mopub(fIntBitsToFloat, fIntBitsToFloat2, c9902lYandex4);
                    }
                }
            } else {
                z = false;
                z2 = true;
                if (!(abstractC15342lAmazon instanceof C13616l)) {
                    C18725l.billing();
                    return false;
                }
                zAdmob = AbstractC3105l.mopub(fIntBitsToFloat, fIntBitsToFloat2, ((C13616l) abstractC15342lAmazon).amazon);
            }
            zAdmob = z;
        } else {
            z = false;
            z2 = true;
        }
        return zAdmob ? z2 : z;
    }

    /* JADX INFO: renamed from: lْؕ۠, reason: contains not printable characters */
    public final void m4484l(AbstractC18026l abstractC18026l, float[] fArr) {
        float[] fArrYandex;
        if (AbstractC8576l.yandex(abstractC18026l, this)) {
            return;
        }
        this.f35294l.m4484l(abstractC18026l, fArr);
        if (!C5177l.loadAd(this.f35291l, 0L)) {
            float[] fArr2 = f35267l;
            C10924l.amazon(fArr2);
            long j = this.f35291l;
            C10924l.isPro(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            C10924l.subs(fArr, fArr2);
        }
        InterfaceC10702l interfaceC10702l = this.f35287l;
        if (interfaceC10702l == null || (fArrYandex = ((C6577l) interfaceC10702l).yandex()) == null) {
            return;
        }
        C10924l.subs(fArr, fArrYandex);
    }

    @Override // defpackage.AbstractC11754l
    /* JADX INFO: renamed from: lؚْٟ */
    public final void mo997l() {
        C11925l c11925l = this.f35283l;
        long j = this.f35291l;
        if (c11925l != null) {
            mo1459class(j, this.f35268l, c11925l);
        } else {
            mo883interface(j, this.f35268l, this.f35289l);
        }
    }

    /* JADX INFO: renamed from: lؘْٔ, reason: contains not printable characters */
    public final void m4485l() {
        boolean zMopub = AbstractC3068l.mopub(1048576);
        AbstractC14971l abstractC14971lM4493l = m4493l(zMopub);
        if (abstractC14971lM4493l == null || (abstractC14971lM4493l.f29454l.f29457l & 1048576) == 0) {
            return;
        }
        AbstractC14971l abstractC14971lMo2643l = mo2643l();
        if (!zMopub && (abstractC14971lMo2643l = abstractC14971lMo2643l.f29456l) == null) {
            return;
        }
        for (AbstractC14971l abstractC14971lM4493l2 = m4493l(zMopub); abstractC14971lM4493l2 != null && (abstractC14971lM4493l2.f29457l & 1048576) != 0; abstractC14971lM4493l2 = abstractC14971lM4493l2.f29460l) {
            if ((abstractC14971lM4493l2.f29450l & 1048576) != 0) {
                AbstractC14971l abstractC14971lLoadAd = abstractC14971lM4493l2;
                C17893l c17893l = null;
                while (abstractC14971lLoadAd != null) {
                    if (abstractC14971lLoadAd instanceof C6543l) {
                    } else if ((abstractC14971lLoadAd.f29450l & 1048576) != 0 && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                        int i = 0;
                        for (AbstractC14971l abstractC14971l = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l != null; abstractC14971l = abstractC14971l.f29460l) {
                            if ((abstractC14971l.f29450l & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    abstractC14971lLoadAd = abstractC14971l;
                                } else {
                                    if (c17893l == null) {
                                        c17893l = new C17893l(0, new AbstractC14971l[16]);
                                    }
                                    if (abstractC14971lLoadAd != null) {
                                        c17893l.crashlytics(abstractC14971lLoadAd);
                                        abstractC14971lLoadAd = null;
                                    }
                                    c17893l.crashlytics(abstractC14971l);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l);
                }
            }
            if (abstractC14971lM4493l2 == abstractC14971lMo2643l) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: lّٔ٘, reason: contains not printable characters */
    public final void m4486l(Function1 function1, boolean z) {
        InterfaceC11218l interfaceC11218l;
        C17893l c17893l;
        Reference referencePoll;
        if (function1 != null && this.f35283l != null) {
            AbstractC0081l.yandex("layerBlock can't be provided when explicitLayer is provided");
        }
        int i = 0;
        C3654l c3654l = this.f35281l;
        boolean z2 = (!z && this.f35289l == function1 && AbstractC8576l.yandex(this.f35269l, c3654l.f7668l) && this.f35284l == c3654l.f7691l) ? false : true;
        this.f35269l = c3654l.f7668l;
        this.f35284l = c3654l.f7691l;
        boolean zM1386native = c3654l.m1386native();
        C10446l c10446l = this.f35272l;
        if (zM1386native && function1 != null) {
            this.f35289l = function1;
            if (this.f35287l != null) {
                if (z2) {
                    m4463l(true);
                    return;
                }
                return;
            }
            InterfaceC11218l interfaceC11218lYandex = AbstractC5672l.yandex(c3654l);
            C17671l c17671l = this.f35277l;
            if (c17671l == null) {
                C17671l c17671l2 = new C17671l(this, new C10446l(this, i), 4);
                this.f35277l = c17671l2;
                c17671l = c17671l2;
            }
            InterfaceC10702l interfaceC10702lAdmob = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) interfaceC11218lYandex).admob(c17671l, c10446l, null);
            C6577l c6577l = (C6577l) interfaceC10702lAdmob;
            c6577l.purchase(this.f20590l);
            c6577l.amazon(this.f35291l);
            this.f35287l = interfaceC10702lAdmob;
            m4463l(true);
            c3654l.f7694l = true;
            c10446l.invoke();
            return;
        }
        this.f35289l = null;
        InterfaceC10702l interfaceC10702l = this.f35287l;
        if (interfaceC10702l != null) {
            C6577l c6577l2 = (C6577l) interfaceC10702l;
            if (!AbstractC2533l.crashlytics(c6577l2.loadAd())) {
                c3654l.m1379else(this);
            }
            c6577l2.f13743l = null;
            c6577l2.f13742l = null;
            c6577l2.f13731l = true;
            c6577l2.billing(false);
            InterfaceC3685l interfaceC3685l = c6577l2.f13736l;
            if (interfaceC3685l != null) {
                interfaceC3685l.yandex(c6577l2.f13737l);
                ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = c6577l2.f13730l;
                C0848l c0848l = viewTreeObserverOnGlobalLayoutListenerC13840l.f27042l;
                do {
                    ReferenceQueue referenceQueue = (ReferenceQueue) c0848l.f2498l;
                    c17893l = (C17893l) c0848l.f2499l;
                    referencePoll = referenceQueue.poll();
                    if (referencePoll != null) {
                        c17893l.remoteconfig(referencePoll);
                    }
                } while (referencePoll != null);
                c17893l.crashlytics(new WeakReference(c6577l2, (ReferenceQueue) c0848l.f2498l));
                viewTreeObserverOnGlobalLayoutListenerC13840l.f27054l.smaato(c6577l2);
            }
            this.f35287l = null;
            c3654l.f7694l = true;
            c10446l.invoke();
            if (mo2643l().f29462l && c3654l.m1389private() && (interfaceC11218l = c3654l.f7680l) != null) {
                ((ViewTreeObserverOnGlobalLayoutListenerC13840l) interfaceC11218l).ad(c3654l);
            }
        }
        this.f35280l = false;
    }

    /* JADX INFO: renamed from: lٔٙٝ, reason: contains not printable characters */
    public final long m4487l(AbstractC18026l abstractC18026l, long j, boolean z) {
        if (abstractC18026l == this) {
            return j;
        }
        AbstractC18026l abstractC18026l2 = this.f35294l;
        return (abstractC18026l2 == null || AbstractC8576l.yandex(abstractC18026l, abstractC18026l2)) ? m4488l(j, z) : m4488l(abstractC18026l2.m4487l(abstractC18026l, j, z), z);
    }

    /* JADX INFO: renamed from: lٕٕۤ, reason: contains not printable characters */
    public final long m4488l(long j, boolean z) {
        if (z || !this.f23550l) {
            long j2 = this.f35291l;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
            j = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        }
        InterfaceC10702l interfaceC10702l = this.f35287l;
        if (interfaceC10702l != null) {
            C6577l c6577l = (C6577l) interfaceC10702l;
            float[] fArrYandex = c6577l.yandex();
            if (fArrYandex == null) {
                return 9187343241974906880L;
            }
            if (!c6577l.f13738l) {
                return C10924l.loadAd(j, fArrYandex);
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: lٕۗٞ */
    public abstract void mo2647l(InterfaceC14859l interfaceC14859l, C11925l c11925l);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r7v7, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: lٌٖؖ, reason: contains not printable characters */
    public final void m4489l() {
        AbstractC14971l abstractC14971lMo2643l;
        boolean zMopub = AbstractC3068l.mopub(128);
        AbstractC14971l abstractC14971lM4493l = m4493l(zMopub);
        if (abstractC14971lM4493l == null || (abstractC14971lM4493l.f29454l.f29457l & 128) == 0) {
            return;
        }
        AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
        Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
        AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
        try {
            if (!zMopub) {
                abstractC14971lMo2643l = mo2643l().f29456l;
                if (abstractC14971lMo2643l == null) {
                }
                Unit unit = Unit.INSTANCE;
                AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
            }
            abstractC14971lMo2643l = mo2643l();
            for (AbstractC14971l abstractC14971lM4493l2 = m4493l(zMopub); abstractC14971lM4493l2 != null && (abstractC14971lM4493l2.f29457l & 128) != 0; abstractC14971lM4493l2 = abstractC14971lM4493l2.f29460l) {
                if ((abstractC14971lM4493l2.f29450l & 128) != 0) {
                    ?? LoadAd = abstractC14971lM4493l2;
                    ?? c17893l = 0;
                    while (LoadAd != 0) {
                        if (LoadAd instanceof InterfaceC4325l) {
                            ((InterfaceC4325l) LoadAd).Signature(this.f20590l);
                        } else if ((LoadAd.f29450l & 128) != 0 && (LoadAd instanceof AbstractC11340l)) {
                            AbstractC14971l abstractC14971l = ((AbstractC11340l) LoadAd).f22875l;
                            int i = 0;
                            LoadAd = LoadAd;
                            c17893l = c17893l;
                            while (abstractC14971l != null) {
                                if ((abstractC14971l.f29450l & 128) != 0) {
                                    i++;
                                    if (i == 1) {
                                        c17893l = c17893l;
                                        LoadAd = abstractC14971l;
                                    } else {
                                        if (c17893l == 0) {
                                            c17893l = new C17893l(0, new AbstractC14971l[16]);
                                        }
                                        if (LoadAd != 0) {
                                            c17893l.crashlytics(LoadAd);
                                            LoadAd = 0;
                                        }
                                        c17893l.crashlytics(abstractC14971l);
                                    }
                                }
                                abstractC14971l = abstractC14971l.f29460l;
                                LoadAd = LoadAd;
                                c17893l = c17893l;
                            }
                            if (i == 1) {
                            }
                        }
                        LoadAd = AbstractC5573l.loadAd(c17893l);
                    }
                }
                if (abstractC14971lM4493l2 == abstractC14971lMo2643l) {
                    break;
                }
            }
            Unit unit2 = Unit.INSTANCE;
            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
        } catch (Throwable th) {
            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
            throw th;
        }
    }

    @Override // defpackage.AbstractC11754l
    /* JADX INFO: renamed from: lَٖؕ */
    public final long mo999l() {
        return this.f35291l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: lٖۡٓ, reason: contains not printable characters */
    public final void m4490l() {
        boolean zMopub = AbstractC3068l.mopub(4194304);
        AbstractC14971l abstractC14971lMo2643l = mo2643l();
        if (!zMopub && (abstractC14971lMo2643l = abstractC14971lMo2643l.f29456l) == null) {
            return;
        }
        for (AbstractC14971l abstractC14971lM4493l = m4493l(zMopub); abstractC14971lM4493l != null && (abstractC14971lM4493l.f29457l & 4194304) != 0; abstractC14971lM4493l = abstractC14971lM4493l.f29460l) {
            if ((abstractC14971lM4493l.f29450l & 4194304) != 0) {
                ?? LoadAd = abstractC14971lM4493l;
                ?? c17893l = 0;
                while (LoadAd != 0) {
                    if (LoadAd instanceof InterfaceC15641l) {
                        ((InterfaceC15641l) LoadAd).startapp(this);
                    } else if ((LoadAd.f29450l & 4194304) != 0 && (LoadAd instanceof AbstractC11340l)) {
                        AbstractC14971l abstractC14971l = ((AbstractC11340l) LoadAd).f22875l;
                        int i = 0;
                        LoadAd = LoadAd;
                        c17893l = c17893l;
                        while (abstractC14971l != null) {
                            if ((abstractC14971l.f29450l & 4194304) != 0) {
                                i++;
                                if (i == 1) {
                                    c17893l = c17893l;
                                    LoadAd = abstractC14971l;
                                } else {
                                    if (c17893l == 0) {
                                        c17893l = new C17893l(0, new AbstractC14971l[16]);
                                    }
                                    if (LoadAd != 0) {
                                        c17893l.crashlytics(LoadAd);
                                        LoadAd = 0;
                                    }
                                    c17893l.crashlytics(abstractC14971l);
                                }
                            }
                            abstractC14971l = abstractC14971l.f29460l;
                            LoadAd = LoadAd;
                            c17893l = c17893l;
                        }
                        if (i == 1) {
                        }
                    }
                    LoadAd = AbstractC5573l.loadAd(c17893l);
                }
            }
            if (abstractC14971lM4493l == abstractC14971lMo2643l) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: lٖۥۡ, reason: contains not printable characters */
    public final void m4491l(AbstractC14971l abstractC14971l, InterfaceC4789l interfaceC4789l, long j, C18333l c18333l, int i, boolean z) {
        if (abstractC14971l == null) {
            mo3040l(interfaceC4789l, j, c18333l, i, z);
            return;
        }
        if (!interfaceC4789l.admob(abstractC14971l)) {
            m4491l(AbstractC0509l.yandex(abstractC14971l, interfaceC4789l.mopub()), interfaceC4789l, j, c18333l, i, z);
            return;
        }
        int i2 = c18333l.f35842l;
        C12463l c12463l = c18333l.f35844l;
        c18333l.billing(i2 + 1, c12463l.loadAd);
        c18333l.f35842l++;
        c12463l.yandex(abstractC14971l);
        c18333l.f35843l.yandex(AbstractC12300l.loadAd(-1.0f, z, false));
        m4491l(AbstractC0509l.yandex(abstractC14971l, interfaceC4789l.mopub()), interfaceC4789l, j, c18333l, i, z);
        c18333l.f35842l = i2;
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public final void m4492l(InterfaceC4789l interfaceC4789l, long j, C18333l c18333l, int i, boolean z) {
        boolean z2;
        boolean z3;
        AbstractC14971l abstractC14971lM4472l = m4472l(interfaceC4789l.mopub());
        if (!m4483l(j)) {
            if (i == 1) {
                float fM4477l = m4477l(j, m4471l());
                if ((Float.floatToRawIntBits(fM4477l) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040) {
                    if (c18333l.f35842l != AbstractC14055l.smaato(c18333l)) {
                        if (AbstractC10733l.yandex(c18333l.amazon(), AbstractC12300l.loadAd(fM4477l, false, false)) <= 0) {
                            return;
                        }
                    }
                    m4474l(abstractC14971lM4472l, interfaceC4789l, j, c18333l, i, false, fM4477l);
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC14971lM4472l == null) {
            mo3040l(interfaceC4789l, j, c18333l, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < mo1466switch() && fIntBitsToFloat2 < mo1458catch()) {
            m4491l(abstractC14971lM4472l, interfaceC4789l, j, c18333l, i, z);
            return;
        }
        float fM4477l2 = i == 1 ? m4477l(j, m4471l()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fM4477l2) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040) {
            if (c18333l.f35842l != AbstractC14055l.smaato(c18333l)) {
                z2 = z;
                if (AbstractC10733l.yandex(c18333l.amazon(), AbstractC12300l.loadAd(fM4477l2, z2, false)) > 0) {
                }
                m4465l(abstractC14971lM4472l, interfaceC4789l, j, c18333l, i, z2, fM4477l2, z3);
            }
            z2 = z;
            z3 = true;
            m4465l(abstractC14971lM4472l, interfaceC4789l, j, c18333l, i, z2, fM4477l2, z3);
        }
        z2 = z;
        z3 = false;
        m4465l(abstractC14971lM4472l, interfaceC4789l, j, c18333l, i, z2, fM4477l2, z3);
    }

    /* JADX INFO: renamed from: lْٗٔ, reason: contains not printable characters */
    public final AbstractC14971l m4493l(boolean z) {
        AbstractC14971l abstractC14971lMo2643l;
        C18289l c18289l = this.f35281l.f7703l;
        if (((AbstractC18026l) c18289l.purchase) == this) {
            return (AbstractC14971l) c18289l.mopub;
        }
        AbstractC18026l abstractC18026l = this.f35294l;
        if (!z) {
            if (abstractC18026l != null) {
                return abstractC18026l.mo2643l();
            }
            return null;
        }
        if (abstractC18026l == null || (abstractC14971lMo2643l = abstractC18026l.mo2643l()) == null) {
            return null;
        }
        return abstractC14971lMo2643l.f29460l;
    }

    /* JADX INFO: renamed from: l٘ٗ۟, reason: contains not printable characters */
    public final void m4494l() {
        this.f35281l.f7667l.loadAd();
    }

    @Override // defpackage.AbstractC11754l
    /* JADX INFO: renamed from: l٘ٚۥ */
    public final InterfaceC17792l mo1000l() {
        InterfaceC17792l interfaceC17792l = this.f35293l;
        if (interfaceC17792l != null) {
            return interfaceC17792l;
        }
        C8339l.smaato("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    /* JADX INFO: renamed from: l٘ۦۢ, reason: contains not printable characters */
    public final void m4495l() {
        InterfaceC10702l interfaceC10702l = this.f35287l;
        if (interfaceC10702l != null) {
            ((C6577l) interfaceC10702l).crashlytics();
            return;
        }
        AbstractC18026l abstractC18026l = this.f35294l;
        if (abstractC18026l != null) {
            abstractC18026l.m4495l();
        }
    }

    @Override // defpackage.InterfaceC18212l
    public final boolean mopub() {
        return mo2643l().f29462l;
    }

    @Override // defpackage.InterfaceC18212l
    /* JADX INFO: renamed from: native */
    public final long mo2589native(InterfaceC18212l interfaceC18212l, long j, boolean z) {
        if (interfaceC18212l instanceof C9083l) {
            C9083l c9083l = (C9083l) interfaceC18212l;
            c9083l.f18667l.f4026l.m4494l();
            return c9083l.mo2589native(this, j ^ (-9223372034707292160L), z) ^ (-9223372034707292160L);
        }
        AbstractC18026l abstractC18026lM4462l = m4462l(interfaceC18212l);
        abstractC18026lM4462l.m4494l();
        AbstractC18026l abstractC18026lM4466l = m4466l(abstractC18026lM4462l);
        while (abstractC18026lM4462l != abstractC18026lM4466l) {
            InterfaceC10702l interfaceC10702l = abstractC18026lM4462l.f35287l;
            if (interfaceC10702l != null) {
                C6577l c6577l = (C6577l) interfaceC10702l;
                float[] fArrLoadAd = c6577l.loadAd();
                if (!c6577l.f13738l) {
                    j = C10924l.loadAd(j, fArrLoadAd);
                }
            }
            if (z || !abstractC18026lM4462l.f23550l) {
                j = AbstractC3383l.subs(j, abstractC18026lM4462l.f35291l);
            }
            abstractC18026lM4462l = abstractC18026lM4462l.f35294l;
        }
        return m4487l(abstractC18026lM4466l, j, z);
    }

    @Override // defpackage.InterfaceC18212l
    /* JADX INFO: renamed from: package */
    public final long mo2590package(long j) {
        if (!mo2643l().f29462l) {
            AbstractC0081l.crashlytics("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return mo2589native(AbstractC9690l.crashlytics(this), ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(this.f35281l)).m3773strictfp(j), true);
    }

    @Override // defpackage.InterfaceC18212l
    public final InterfaceC18212l pro() {
        boolean z = mo2643l().f29462l;
        C3654l c3654l = this.f35281l;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (C3654l c3654lLicense = c3654l; c3654lLicense != null; c3654lLicense = c3654lLicense.license()) {
                sb.append("\n|");
                sb.append(c3654lLicense);
                sb.append(" isAttached=");
                sb.append(c3654lLicense.m1386native());
                sb.append(" modifier=");
                sb.append(c3654lLicense.f7701l);
                sb.append(" tail=");
                sb.append(mo2643l());
            }
            AbstractC0081l.crashlytics(sb.toString());
        }
        m4494l();
        return ((AbstractC18026l) c3654l.f7703l.purchase).f35294l;
    }

    @Override // defpackage.AbstractC11754l
    /* JADX INFO: renamed from: protected */
    public final AbstractC11754l mo1001protected() {
        return this.f35271l;
    }

    @Override // defpackage.AbstractC11754l
    /* JADX INFO: renamed from: return */
    public final C3654l mo1002return() {
        return this.f35281l;
    }

    @Override // defpackage.InterfaceC18212l
    public final long smaato() {
        return this.f20590l;
    }

    @Override // defpackage.InterfaceC18212l
    public final long startapp(long j) {
        if (!mo2643l().f29462l) {
            AbstractC0081l.crashlytics("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(this.f35281l)).subscription(mo2591strictfp(j));
    }

    @Override // defpackage.InterfaceC18212l
    /* JADX INFO: renamed from: strictfp */
    public final long mo2591strictfp(long j) {
        if (!mo2643l().f29462l) {
            AbstractC0081l.crashlytics("LayoutCoordinate operations are only valid when isAttached is true");
        }
        m4494l();
        while (this != null) {
            C3654l c3654l = this.f35281l;
            if (this == ((AbstractC18026l) c3654l.f7703l.purchase) && !c3654l.f7673l) {
                long jLoadAd = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(c3654l)).getRectManager().loadAd(c3654l);
                if (!C5177l.loadAd(jLoadAd, 9223372034707292159L)) {
                    return AbstractC3383l.subs(j, jLoadAd);
                }
            }
            InterfaceC10702l interfaceC10702l = this.f35287l;
            if (interfaceC10702l != null) {
                C6577l c6577l = (C6577l) interfaceC10702l;
                float[] fArrLoadAd = c6577l.loadAd();
                if (!c6577l.f13738l) {
                    j = C10924l.loadAd(j, fArrLoadAd);
                }
            }
            j = AbstractC3383l.subs(j, this.f35291l);
            this = this.f35294l;
        }
        return j;
    }

    @Override // defpackage.InterfaceC18212l
    public final void subs(float[] fArr) {
        InterfaceC11218l interfaceC11218lYandex = AbstractC5672l.yandex(this.f35281l);
        AbstractC18026l abstractC18026lM4462l = m4462l(AbstractC9690l.crashlytics(this));
        m4468l(abstractC18026lM4462l, fArr);
        if (interfaceC11218lYandex instanceof InterfaceC1403l) {
            ((ViewTreeObserverOnGlobalLayoutListenerC13840l) ((InterfaceC1403l) interfaceC11218lYandex)).adcel(fArr);
            return;
        }
        long jStartapp = abstractC18026lM4462l.startapp(0L);
        if ((9223372034707292159L & jStartapp) != 9205357640488583168L) {
            C10924l.isPro(fArr, Float.intBitsToFloat((int) (jStartapp >> 32)), Float.intBitsToFloat((int) (jStartapp & 4294967295L)));
        }
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: super */
    public final float mo873super() {
        return this.f35281l.f7668l.mo873super();
    }

    @Override // defpackage.InterfaceC18212l
    /* JADX INFO: renamed from: synchronized */
    public final C8896l mo2592synchronized(InterfaceC18212l interfaceC18212l, boolean z) {
        if (!mo2643l().f29462l) {
            AbstractC0081l.crashlytics("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!interfaceC18212l.mopub()) {
            AbstractC0081l.crashlytics("LayoutCoordinates " + interfaceC18212l + " is not attached!");
        }
        AbstractC18026l abstractC18026lM4462l = m4462l(interfaceC18212l);
        abstractC18026lM4462l.m4494l();
        AbstractC18026l abstractC18026lM4466l = m4466l(abstractC18026lM4462l);
        C10006l c10006l = this.f35292l;
        if (c10006l == null) {
            c10006l = new C10006l();
            this.f35292l = c10006l;
        }
        c10006l.loadAd = 0.0f;
        c10006l.crashlytics = 0.0f;
        c10006l.amazon = (int) (interfaceC18212l.smaato() >> 32);
        c10006l.purchase = (int) (interfaceC18212l.smaato() & 4294967295L);
        while (abstractC18026lM4462l != abstractC18026lM4466l) {
            abstractC18026lM4462l.m4482l(c10006l, z, false);
            if (c10006l.loadAd()) {
                return C8896l.purchase;
            }
            abstractC18026lM4462l = abstractC18026lM4462l.f35294l;
        }
        m4473l(abstractC18026lM4466l, c10006l, z);
        return new C8896l(c10006l.loadAd, c10006l.crashlytics, c10006l.amazon, c10006l.purchase);
    }

    @Override // defpackage.InterfaceC18212l
    public final long tapsense(long j) {
        if (!mo2643l().f29462l) {
            AbstractC0081l.crashlytics("LayoutCoordinate operations are only valid when isAttached is true");
        }
        InterfaceC18212l interfaceC18212lCrashlytics = AbstractC9690l.crashlytics(this);
        ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = (ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(this.f35281l);
        viewTreeObserverOnGlobalLayoutListenerC13840l.applovin();
        return mo2589native(interfaceC18212lCrashlytics, C1187l.admob(C10924l.loadAd(j, viewTreeObserverOnGlobalLayoutListenerC13840l.f27076l), interfaceC18212lCrashlytics.mo2591strictfp(0L)), true);
    }

    @Override // defpackage.InterfaceC18212l
    /* JADX INFO: renamed from: throws */
    public final long mo2593throws(InterfaceC18212l interfaceC18212l, long j) {
        return mo2589native(interfaceC18212l, j, true);
    }

    @Override // defpackage.AbstractC11754l
    /* JADX INFO: renamed from: while */
    public final InterfaceC18212l mo1003while() {
        return this;
    }
}
