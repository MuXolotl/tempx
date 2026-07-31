package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًِۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8232l implements InterfaceC17955l {
    public static final C13645l pro = AbstractC15212l.purchase(new C2613l(19), new C12513l((byte) 0, 22));
    public final C10086l Signature;
    public final C16141l adcel;
    public final C7239l admob;
    public final InterfaceC8714l ads;
    public final C15387l amazon;
    public final C2403l billing;
    public C13217l crashlytics;
    public final C6188l firebase;
    public C3654l isPro;
    public final C13568l license;
    public boolean loadAd;
    public final C14541l metrica;
    public float mopub;
    public final C10086l purchase;
    public final C12660l remoteconfig;
    public final C3877l smaato;
    public final C13161l startapp;
    public final boolean subs;
    public final InterfaceC8714l subscription;
    public final C10086l tapsense;
    public final C5138l vip;
    public final C18145l yandex;

    public C8232l(int i, int i2) {
        C18145l c18145l = new C18145l();
        c18145l.yandex = -1;
        int i3 = 0;
        c18145l.purchase = new C17893l(0, new InterfaceC13921l[16]);
        c18145l.crashlytics = -1;
        this.yandex = c18145l;
        this.amazon = new C15387l(i, i2, 0);
        this.purchase = new C10086l(AbstractC18088l.yandex, C18450l.f36015l);
        this.billing = new C2403l();
        this.admob = new C7239l(new C17015l(16, this));
        this.subs = true;
        this.firebase = new C6188l(this, i3);
        this.smaato = new C3877l();
        this.remoteconfig = new C12660l();
        this.vip = new C5138l((byte) 0, 18);
        this.metrica = new C14541l(new C7365l(this, i, i3));
        this.startapp = new C13161l(this);
        this.adcel = new C16141l();
        this.ads = AbstractC11184l.amazon();
        this.subscription = AbstractC11184l.amazon();
        Boolean bool = Boolean.FALSE;
        this.tapsense = AbstractC8020l.smaato(bool);
        this.Signature = AbstractC8020l.smaato(bool);
        this.license = new C13568l(1);
    }

    public final void admob(float f, C13217l c13217l) {
        if (this.subs) {
            C18145l c18145l = this.yandex;
            C17893l c17893l = (C17893l) c18145l.purchase;
            if (!c13217l.remoteconfig.isEmpty()) {
                int i = 0;
                boolean z = f < 0.0f;
                int iCrashlytics = C18145l.crashlytics(c13217l, z);
                int iYandex = C18145l.yandex(c13217l, z);
                if (iYandex >= 0) {
                    EnumC7283l enumC7283l = c13217l.adcel;
                    if (iYandex < c13217l.startapp) {
                        if (iCrashlytics != c18145l.yandex && iCrashlytics >= 0) {
                            if (c18145l.loadAd != z) {
                                Object[] objArr = c17893l.f34848l;
                                int i2 = c17893l.f34846l;
                                for (int i3 = 0; i3 < i2; i3++) {
                                    ((InterfaceC13921l) objArr[i3]).cancel();
                                }
                            }
                            c18145l.loadAd = z;
                            c18145l.yandex = iCrashlytics;
                            c17893l.isPro();
                            c17893l.billing(c17893l.f34846l, this.startapp.m3585strictfp(iCrashlytics));
                        }
                        List list = c13217l.remoteconfig;
                        if (z) {
                            C9696l c9696l = (C9696l) AbstractC16901l.m4214continue(list);
                            if (((AbstractC10033l.mopub(c9696l, enumC7283l) + ((int) (enumC7283l == EnumC7283l.f15126l ? c9696l.pro & 4294967295L : c9696l.pro >> 32))) + c13217l.subscription) - c13217l.metrica < (-f)) {
                                Object[] objArr2 = c17893l.f34848l;
                                int i4 = c17893l.f34846l;
                                while (i < i4) {
                                    ((InterfaceC13921l) objArr2[i]).yandex();
                                    i++;
                                }
                            }
                        } else if (c13217l.vip - AbstractC10033l.mopub((C9696l) AbstractC16901l.m4231native(list), enumC7283l) < f) {
                            Object[] objArr3 = c17893l.f34848l;
                            int i5 = c17893l.f34846l;
                            while (i < i5) {
                                ((InterfaceC13921l) objArr3[i]).yandex();
                                i++;
                            }
                        }
                    }
                }
            }
            c18145l.amazon = f;
        }
    }

    @Override // defpackage.InterfaceC17955l
    public final boolean amazon() {
        return ((Boolean) this.tapsense.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void billing(C13217l c13217l, boolean z, boolean z2) {
        C9696l c9696l;
        C9696l c9696l2;
        C9696l c9696l3;
        List list = c13217l.remoteconfig;
        int i = c13217l.startapp;
        C2931l c2931l = c13217l.yandex;
        int i2 = c13217l.loadAd;
        this.metrica.purchase = list.size();
        Object obj = null;
        obj = null;
        C15387l c15387l = this.amazon;
        C13568l c13568l = this.license;
        if (!z && this.loadAd) {
            this.crashlytics = c13217l;
            AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
            Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
            AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
            try {
                if (c13568l.metrica() && i2 == c15387l.crashlytics.admob() && c2931l != null && (c9696l3 = (C9696l) AbstractC8669l.m2412private(c2931l.loadAd)) != null && c9696l3.yandex == c15387l.loadAd.admob()) {
                    c13568l.Signature();
                }
                Unit unit = Unit.INSTANCE;
                return;
            } finally {
                AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
            }
        }
        if (z) {
            this.loadAd = true;
        }
        this.mopub -= c13217l.amazon;
        this.purchase.setValue(c13217l);
        this.Signature.setValue(Boolean.valueOf(((c2931l != null ? c2931l.yandex : 0) == 0 && i2 == 0) ? false : true));
        this.tapsense.setValue(Boolean.valueOf(c13217l.crashlytics));
        if (z2) {
            c15387l.getClass();
            if (!(((float) i2) >= 0.0f)) {
                AbstractC14825l.crashlytics("scrollOffset should be non-negative");
            }
            c15387l.crashlytics.subs(i2);
        } else {
            c15387l.getClass();
            if (c2931l != null && (c9696l2 = (C9696l) AbstractC8669l.m2412private(c2931l.loadAd)) != null) {
                obj = c9696l2.loadAd;
            }
            c15387l.purchase = obj;
            if (c15387l.amazon || i > 0) {
                c15387l.amazon = true;
                if ((((float) i2) >= 0.0f) == false) {
                    AbstractC14825l.crashlytics("scrollOffset should be non-negative (" + i2 + ")");
                }
                c15387l.yandex((c2931l == null || (c9696l = (C9696l) AbstractC8669l.m2412private(c2931l.loadAd)) == null) ? 0 : c9696l.yandex, i2);
            }
            if (this.subs) {
                C18145l c18145l = this.yandex;
                C17893l c17893l = (C17893l) c18145l.purchase;
                int i3 = c18145l.yandex;
                boolean z3 = c18145l.loadAd;
                if (i3 != -1 && !list.isEmpty() && i3 != C18145l.crashlytics(c13217l, z3)) {
                    c18145l.yandex = -1;
                    Object[] objArr = c17893l.f34848l;
                    int i4 = c17893l.f34846l;
                    for (int i5 = 0; i5 < i4; i5++) {
                        ((InterfaceC13921l) objArr[i5]).cancel();
                    }
                    c17893l.isPro();
                }
                int i6 = c18145l.crashlytics;
                if (i6 != -1 && c18145l.amazon != 0.0f && i6 != i && !list.isEmpty()) {
                    int iCrashlytics = C18145l.crashlytics(c13217l, c18145l.amazon < 0.0f);
                    int iYandex = C18145l.yandex(c13217l, c18145l.amazon < 0.0f);
                    if (iYandex >= 0 && iYandex < i && iCrashlytics != c18145l.yandex && iCrashlytics >= 0) {
                        c18145l.yandex = iCrashlytics;
                        c17893l.isPro();
                        c17893l.billing(c17893l.f34846l, this.startapp.m3585strictfp(iCrashlytics));
                    }
                }
                c18145l.crashlytics = i;
            }
        }
        if (z) {
            c13568l.ad(c13217l.billing, c13217l.subs, c13217l.admob);
        }
    }

    @Override // defpackage.InterfaceC17955l
    public final boolean crashlytics() {
        return ((Boolean) this.Signature.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r6.admob.loadAd(r7, r8, r0) == r5) goto L23;
     */
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
    @Override // defpackage.InterfaceC17955l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object loadAd(defpackage.EnumC11011l r7, kotlin.jvm.functions.Function2 r8, defpackage.InterfaceC14029l r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.C13050l
            if (r0 == 0) goto L13
            r0 = r9
            lْؑ r0 = (defpackage.C13050l) r0
            int r1 = r0.f25554l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25554l = r1
            goto L18
        L13:
            lْؑ r0 = new lْؑ
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f25557l
            int r1 = r0.f25554l
            r2 = 0
            r3 = 2
            r4 = 1
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.AbstractC2829l.crashlytics(r9)
            goto L6a
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r6)
            return r2
        L31:
            lٌؘۦ r7 = r0.f25555l
            r8 = r7
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            lًُْ r7 = r0.f25556l
            defpackage.AbstractC2829l.crashlytics(r9)
            goto L5b
        L3c:
            defpackage.AbstractC2829l.crashlytics(r9)
            lََؖ r9 = r6.purchase
            java.lang.Object r9 = r9.getValue()
            lًؚْ r1 = defpackage.AbstractC18088l.yandex
            if (r9 != r1) goto L5b
            r0.f25556l = r7
            r9 = r8
            lٌؘۦ r9 = (defpackage.AbstractC5563l) r9
            r0.f25555l = r9
            r0.f25554l = r4
            lؖؔؖ r9 = r6.smaato
            java.lang.Object r9 = r9.isPro(r0)
            if (r9 != r5) goto L5b
            goto L69
        L5b:
            r0.f25556l = r2
            r0.f25555l = r2
            r0.f25554l = r3
            lؚْ۟ r6 = r6.admob
            java.lang.Object r6 = r6.loadAd(r7, r8, r0)
            if (r6 != r5) goto L6a
        L69:
            return r5
        L6a:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8232l.loadAd(lًُْ, kotlin.jvm.functions.Function2, lٌؚٓ):java.lang.Object");
    }

    public final C13217l mopub() {
        return (C13217l) this.purchase.getValue();
    }

    @Override // defpackage.InterfaceC17955l
    public final float purchase(float f) {
        return this.admob.purchase(f);
    }

    @Override // defpackage.InterfaceC17955l
    public final boolean yandex() {
        return this.admob.yandex();
    }
}
