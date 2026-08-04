package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٖؑۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0360l implements InterfaceC15829l {
    public final C10685l admob;
    public final C14970l amazon;
    public int billing;
    public final C18662l crashlytics;
    public final C8688l firebase;
    public final C8688l isPro;
    public final InterfaceC0208l loadAd;
    public C7504l mopub;
    public final C4910l purchase;
    public final C10038l smaato;
    public final C11644l subs;
    public final InterfaceC9094l yandex;

    public C0360l(InterfaceC9094l interfaceC9094l, List list, InterfaceC0208l interfaceC0208l, InterfaceC12932l interfaceC12932l) {
        this.yandex = interfaceC9094l;
        this.loadAd = interfaceC0208l;
        InterfaceC7042l interfaceC7042l = (InterfaceC7042l) interfaceC12932l.mo245l(C1083l.f2996l);
        InterfaceC14029l interfaceC14029l = null;
        if (interfaceC7042l == null) {
            C18073l.firebase(interfaceC12932l, "Missing Job on Coroutine context: ");
            throw null;
        }
        C18662l c18662lYandex = AbstractC11990l.yandex(interfaceC12932l.mo246l(interfaceC7042l));
        this.crashlytics = c18662lYandex;
        this.amazon = new C14970l(8, new C7641l(this, interfaceC14029l, 28));
        this.purchase = AbstractC8618l.yandex();
        this.admob = new C10685l(6);
        this.subs = new C11644l(this, list, c18662lYandex.f36440l);
        final byte b = 0;
        this.isPro = new C8688l(new Function0(this) { // from class: lؚ٘ؐ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C0360l f34557l;

            {
                this.f34557l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = b;
                C0360l c0360l = this.f34557l;
                switch (i) {
                    case 0:
                        return c0360l.yandex.yandex();
                    default:
                        return ((InterfaceC5137l) c0360l.isPro.getValue()).crashlytics();
                }
            }
        });
        final int i = 1;
        this.firebase = new C8688l(new Function0(this) { // from class: lؚ٘ؐ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C0360l f34557l;

            {
                this.f34557l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                C0360l c0360l = this.f34557l;
                switch (i2) {
                    case 0:
                        return c0360l.yandex.yandex();
                    default:
                        return ((InterfaceC5137l) c0360l.isPro.getValue()).crashlytics();
                }
            }
        });
        this.smaato = new C10038l(c18662lYandex, new C15079l(7, this), new C12513l(b, 2), new C6637l(this, interfaceC14029l, 19));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object amazon(C0360l c0360l, AbstractC0283l abstractC0283l) {
        C17759l c17759l;
        C4910l c4910l;
        if (abstractC0283l instanceof C17759l) {
            c17759l = (C17759l) abstractC0283l;
            int i = c17759l.f34582l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c17759l.f34582l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c17759l = new C17759l(c0360l, abstractC0283l);
            }
        } else {
            c17759l = new C17759l(c0360l, abstractC0283l);
        }
        Object obj = c17759l.f34583l;
        int i2 = c17759l.f34582l;
        InterfaceC14029l interfaceC14029l = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C4910l c4910l2 = c0360l.purchase;
            c17759l.f34584l = c4910l2;
            c17759l.f34582l = 1;
            Object objYandex = c4910l2.yandex(c17759l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
            c4910l = c4910l2;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c4910l = c17759l.f34584l;
            AbstractC2829l.crashlytics(obj);
        }
        try {
            int i3 = c0360l.billing + 1;
            c0360l.billing = i3;
            if (i3 == 1) {
                c0360l.mopub = AbstractC10999l.mopub(c0360l.crashlytics, null, 0, new C2592l(2, interfaceC14029l, c0360l), 3);
            }
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        } finally {
            c4910l.billing(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object billing(C0360l c0360l, AbstractC0283l abstractC0283l) {
        C18232l c18232l;
        C10685l c10685l = c0360l.admob;
        if (abstractC0283l instanceof C18232l) {
            c18232l = (C18232l) abstractC0283l;
            int i = c18232l.f35741l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c18232l.f35741l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c18232l = new C18232l(c0360l, abstractC0283l);
            }
        } else {
            c18232l = new C18232l(c0360l, abstractC0283l);
        }
        Object obj = c18232l.f35740l;
        int i2 = c18232l.f35741l;
        Object obj2 = EnumC9342l.f19165l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(obj);
                if (c10685l.m2948class() instanceof C15647l) {
                    return c10685l.m2948class();
                }
                c18232l.f35741l = 1;
                Object objAds = AbstractC5088l.ads(new C2407l(c0360l, null), c18232l);
                if (objAds != obj2) {
                    objAds = Unit.INSTANCE;
                }
                if (objAds != obj2) {
                }
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    AbstractC2829l.crashlytics(obj);
                    return obj;
                }
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
            c18232l.f35741l = 2;
            Object objAdmob = c0360l.admob(false, c18232l);
            return objAdmob == obj2 ? obj2 : objAdmob;
        } catch (Throwable th) {
            return new C1046l(-1, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object crashlytics(C0360l c0360l, AbstractC0283l abstractC0283l) {
        C6578l c6578l;
        C4910l c4910l;
        if (abstractC0283l instanceof C6578l) {
            c6578l = (C6578l) abstractC0283l;
            int i = c6578l.f13750l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c6578l.f13750l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c6578l = new C6578l(c0360l, abstractC0283l);
            }
        } else {
            c6578l = new C6578l(c0360l, abstractC0283l);
        }
        Object obj = c6578l.f13751l;
        int i2 = c6578l.f13750l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C4910l c4910l2 = c0360l.purchase;
            c6578l.f13752l = c4910l2;
            c6578l.f13750l = 1;
            Object objYandex = c4910l2.yandex(c6578l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
            c4910l = c4910l2;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c4910l = c6578l.f13752l;
            AbstractC2829l.crashlytics(obj);
        }
        try {
            int i3 = c0360l.billing - 1;
            c0360l.billing = i3;
            if (i3 == 0) {
                C7504l c7504l = c0360l.mopub;
                if (c7504l != null) {
                    c7504l.ads(null);
                }
                c0360l.mopub = null;
            }
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        } finally {
            c4910l.billing(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.functions.Function2] */
    public static final Object purchase(C0360l c0360l, boolean z, Function2 function2, AbstractC0283l abstractC0283l) throws Throwable {
        C7329l c7329l;
        ?? r13;
        if (abstractC0283l instanceof C7329l) {
            c7329l = (C7329l) abstractC0283l;
            int i = c7329l.f15188l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c7329l.f15188l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c7329l = new C7329l(c0360l, abstractC0283l);
            }
        } else {
            c7329l = new C7329l(c0360l, abstractC0283l);
        }
        Object obj = c7329l.f15191l;
        int i2 = c7329l.f15188l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c7329l.f15189l = (AbstractC5563l) function2;
            c7329l.f15190l = z;
            c7329l.f15188l = 1;
            obj = null;
            r13 = function2;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    AbstractC2829l.crashlytics(obj);
                    return obj;
                }
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = c7329l.f15190l;
            Function2 function3 = (Function2) c7329l.f15189l;
            AbstractC2829l.crashlytics(obj);
            r13 = function3;
        }
        boolean z2 = z;
        ?? r9 = r13;
        InterfaceC12932l interfaceC12932l = c0360l.crashlytics.f36440l;
        C8122l c8122l = new C8122l(c0360l, (InterfaceC8282l) obj, z2, (Function2) r9, (InterfaceC14029l) null);
        c7329l.f15189l = null;
        c7329l.f15190l = z2;
        c7329l.f15188l = 2;
        Object objFirebase = AbstractC10999l.firebase(interfaceC12932l, c8122l, c7329l);
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        return objFirebase == enumC9342l ? enumC9342l : objFirebase;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        if (r11 == r7) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        if (r11 == r7) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object admob(boolean r10, defpackage.InterfaceC14029l r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.C8969l
            if (r0 == 0) goto L13
            r0 = r11
            lٌٟ۟ r0 = (defpackage.C8969l) r0
            int r1 = r0.f18498l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18498l = r1
            goto L18
        L13:
            lٌٟ۟ r0 = new lٌٟ۟
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f18501l
            int r1 = r0.f18498l
            lَۤۖ r2 = r9.admob
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            lٍؗؐ r7 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L43
            if (r1 == r5) goto L3b
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            defpackage.AbstractC2829l.crashlytics(r11)
            goto Lab
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r9)
            return r6
        L37:
            defpackage.AbstractC2829l.crashlytics(r11)
            goto L92
        L3b:
            boolean r10 = r0.f18500l
            lّٕ٘ r1 = r0.f18499l
            defpackage.AbstractC2829l.crashlytics(r11)
            goto L5f
        L43:
            defpackage.AbstractC2829l.crashlytics(r11)
            lّٕ٘ r1 = r2.m2948class()
            boolean r11 = r1 instanceof defpackage.C3489l
            if (r11 != 0) goto Lbf
            lؖۗٓ r11 = r9.mopub()
            r0.f18499l = r1
            r0.f18500l = r10
            r0.f18498l = r5
            java.lang.Object r11 = r11.yandex(r0)
            if (r11 != r7) goto L5f
            goto Laa
        L5f:
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            boolean r5 = r1 instanceof defpackage.C2856l
            if (r5 == 0) goto L6f
            r8 = r1
            lٍؔۘ r8 = (defpackage.C2856l) r8
            int r8 = r8.yandex
            goto L70
        L6f:
            r8 = -1
        L70:
            if (r5 == 0) goto L75
            if (r11 != r8) goto L75
            return r1
        L75:
            lؒٚۥ r11 = new lؒٚۥ
            r11.<init>(r8, r6, r9)
            if (r10 == 0) goto L95
            lؖۗٓ r1 = r9.mopub()
            lؙْۢ r3 = new lؙْۢ
            r3.<init>(r9, r11, r10, r6)
            r0.f18499l = r6
            r0.f18500l = r10
            r0.f18498l = r4
            java.lang.Object r11 = r1.loadAd(r3, r0)
            if (r11 != r7) goto L92
            goto Laa
        L92:
            lًۖٔ r11 = (defpackage.C8195l) r11
            goto Lad
        L95:
            lؖۗٓ r1 = r9.mopub()
            lۗۡ r4 = new lۗۡ
            r4.<init>(r9, r11, r6)
            r0.f18499l = r6
            r0.f18500l = r10
            r0.f18498l = r3
            java.lang.Object r11 = r1.amazon(r4, r0)
            if (r11 != r7) goto Lab
        Laa:
            return r7
        Lab:
            lًۖٔ r11 = (defpackage.C8195l) r11
        Lad:
            java.lang.Object r9 = r11.f17098l
            lّٕ٘ r9 = (defpackage.AbstractC12669l) r9
            java.lang.Object r10 = r11.f17097l
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lbe
            r2.m2959public(r9)
        Lbe:
            return r9
        Lbf:
            java.lang.String r9 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            defpackage.C8339l.smaato(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0360l.admob(boolean, lٌؚٓ):java.lang.Object");
    }

    @Override // defpackage.InterfaceC15829l
    public final Object loadAd(Function2 function2, InterfaceC14029l interfaceC14029l) {
        AbstractC11174l.billing(this.crashlytics.f36440l);
        return AbstractC5088l.ads(new C6208l(this, function2, null, 6), interfaceC14029l);
    }

    public final InterfaceC4335l mopub() {
        return (InterfaceC4335l) this.firebase.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object subs(Object obj, boolean z, AbstractC0283l abstractC0283l) {
        C14213l c14213l;
        C9987l c9987l;
        if (abstractC0283l instanceof C14213l) {
            c14213l = (C14213l) abstractC0283l;
            int i = c14213l.f27805l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c14213l.f27805l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c14213l = new C14213l(this, abstractC0283l);
            }
        } else {
            c14213l = new C14213l(this, abstractC0283l);
        }
        Object obj2 = c14213l.f27806l;
        int i2 = c14213l.f27805l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj2);
            C9987l c9987l2 = new C9987l();
            InterfaceC5137l interfaceC5137l = (InterfaceC5137l) this.isPro.getValue();
            C14822l c14822l = new C14822l(this, c9987l2, obj, z, null);
            c14213l.f27807l = c9987l2;
            c14213l.f27805l = 1;
            Object objYandex = interfaceC5137l.yandex(c14822l, c14213l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
            c9987l = c9987l2;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c9987l = c14213l.f27807l;
            AbstractC2829l.crashlytics(obj2);
        }
        return new Integer(c9987l.f20387l);
    }

    @Override // defpackage.InterfaceC15829l
    public final InterfaceC6942l yandex() {
        return this.amazon;
    }
}
