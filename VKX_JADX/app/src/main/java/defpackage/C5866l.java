package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘٟٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5866l implements InterfaceC17955l {
    public static final C13645l advert;
    public final C10086l Signature;
    public final C13568l ad;
    public final C14541l adcel;
    public float admob;
    public final C7972l ads;
    public boolean amazon;
    public final C10086l billing;
    public C1644l crashlytics;
    public final boolean firebase;
    public final C7239l isPro;
    public final C10086l license;
    public boolean loadAd;
    public final C12660l metrica;
    public final C2403l mopub;
    public final InterfaceC8714l pro;
    public final C15387l purchase;
    public final C6188l remoteconfig;
    public C3654l smaato;
    public final C5138l startapp;
    public boolean subs;
    public final C16141l subscription;
    public final InterfaceC8714l tapsense;
    public final C3877l vip;
    public final C18145l yandex;

    static {
        int i = 23;
        advert = AbstractC15212l.purchase(new C2613l(i), new C12513l((byte) 0, i));
    }

    public C5866l(int i, int i2) {
        C18145l c18145l = new C18145l();
        c18145l.yandex = -1;
        c18145l.crashlytics = -1;
        this.yandex = c18145l;
        this.purchase = new C15387l(i, i2, 1);
        this.billing = new C10086l(AbstractC11598l.yandex, C18450l.f36015l);
        this.mopub = new C2403l();
        this.isPro = new C7239l(new C17015l(21, this));
        this.firebase = true;
        this.remoteconfig = new C6188l(this, 1);
        this.vip = new C3877l();
        this.metrica = new C12660l();
        this.startapp = new C5138l((byte) 0, 18);
        this.adcel = new C14541l(new C2221l(this, i, 11));
        this.ads = new C7972l(16, this);
        this.subscription = new C16141l();
        this.tapsense = AbstractC11184l.amazon();
        Boolean bool = Boolean.FALSE;
        this.Signature = AbstractC8020l.smaato(bool);
        this.license = AbstractC8020l.smaato(bool);
        this.pro = AbstractC11184l.amazon();
        this.ad = new C13568l(1);
    }

    public static Object isPro(C5866l c5866l, int i, AbstractC5563l abstractC5563l) {
        c5866l.getClass();
        Object objLoadAd = c5866l.loadAd(EnumC11011l.f22182l, new C11640l(c5866l, i, (InterfaceC14029l) null), abstractC5563l);
        return objLoadAd == EnumC9342l.f19165l ? objLoadAd : Unit.INSTANCE;
    }

    public final C1644l admob() {
        return (C1644l) this.billing.getValue();
    }

    @Override // defpackage.InterfaceC17955l
    public final boolean amazon() {
        return ((Boolean) this.Signature.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Unit] */
    public final Object billing(int i, AbstractC0283l abstractC0283l) {
        C17786l c17786l;
        if (abstractC0283l instanceof C17786l) {
            c17786l = (C17786l) abstractC0283l;
            int i2 = c17786l.f34647l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c17786l.f34647l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c17786l = new C17786l(this, abstractC0283l);
            }
        } else {
            c17786l = new C17786l(this, abstractC0283l);
        }
        Object obj = c17786l.f34646l;
        int i3 = c17786l.f34647l;
        try {
            if (i3 == 0) {
                AbstractC2829l.crashlytics(obj);
                this.subs = true;
                C13941l c13941l = new C13941l(this, i, null);
                c17786l.f34647l = 1;
                Object objLoadAd = loadAd(EnumC11011l.f22182l, c13941l, c17786l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objLoadAd == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                if (i3 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
            }
            this.subs = false;
            this = Unit.INSTANCE;
            return this;
        } catch (Throwable th) {
            this.subs = false;
            throw th;
        }
    }

    @Override // defpackage.InterfaceC17955l
    public final boolean crashlytics() {
        return ((Boolean) this.license.getValue()).booleanValue();
    }

    public final void firebase(int i, int i2, boolean z) {
        C15387l c15387l = this.purchase;
        if (c15387l.loadAd.admob() != i || c15387l.crashlytics.admob() != i2) {
            C12660l c12660l = this.metrica;
            c12660l.purchase();
            c12660l.loadAd = null;
            c12660l.crashlytics = -1;
        }
        c15387l.yandex(i, i2);
        c15387l.purchase = null;
        if (!z) {
            AbstractC11184l.metrica(this.tapsense);
            return;
        }
        C3654l c3654l = this.smaato;
        if (c3654l != null) {
            c3654l.smaato();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r6.isPro.loadAd(r7, r8, r0) == r5) goto L23;
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
            boolean r0 = r9 instanceof defpackage.C4797l
            if (r0 == 0) goto L13
            r0 = r9
            lَُؗ r0 = (defpackage.C4797l) r0
            int r1 = r0.f9841l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9841l = r1
            goto L18
        L13:
            lَُؗ r0 = new lَُؗ
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f9844l
            int r1 = r0.f9841l
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
            lٌؘۦ r7 = r0.f9842l
            r8 = r7
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            lًُْ r7 = r0.f9843l
            defpackage.AbstractC2829l.crashlytics(r9)
            goto L5b
        L3c:
            defpackage.AbstractC2829l.crashlytics(r9)
            lََؖ r9 = r6.billing
            java.lang.Object r9 = r9.getValue()
            lٕؓؗ r1 = defpackage.AbstractC11598l.yandex
            if (r9 != r1) goto L5b
            r0.f9843l = r7
            r9 = r8
            lٌؘۦ r9 = (defpackage.AbstractC5563l) r9
            r0.f9842l = r9
            r0.f9841l = r4
            lؖؔؖ r9 = r6.vip
            java.lang.Object r9 = r9.isPro(r0)
            if (r9 != r5) goto L5b
            goto L69
        L5b:
            r0.f9843l = r2
            r0.f9842l = r2
            r0.f9841l = r3
            lؚْ۟ r6 = r6.isPro
            java.lang.Object r6 = r6.loadAd(r7, r8, r0)
            if (r6 != r5) goto L6a
        L69:
            return r5
        L6a:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5866l.loadAd(lًُْ, kotlin.jvm.functions.Function2, lٌؚٓ):java.lang.Object");
    }

    public final void mopub(C1644l c1644l, boolean z, boolean z2) {
        List list = c1644l.firebase;
        int i = c1644l.vip;
        int i2 = c1644l.loadAd;
        C15237l c15237l = c1644l.yandex;
        this.adcel.purchase = list.size();
        C13568l c13568l = this.ad;
        C15387l c15387l = this.purchase;
        if (!z && this.loadAd) {
            this.crashlytics = c1644l;
            AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
            Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
            AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
            try {
                if (c13568l.metrica() && c15237l != null && c15237l.yandex == c15387l.loadAd.admob() && i2 == c15387l.crashlytics.admob()) {
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
        this.license.setValue(Boolean.valueOf(((c15237l != null ? c15237l.yandex : 0) == 0 && i2 == 0) ? false : true));
        this.Signature.setValue(Boolean.valueOf(c1644l.crashlytics));
        this.admob -= c1644l.amazon;
        this.billing.setValue(c1644l);
        if (z2) {
            c15387l.getClass();
            if (!(((float) i2) >= 0.0f)) {
                AbstractC14825l.crashlytics("scrollOffset should be non-negative");
            }
            c15387l.crashlytics.subs(i2);
        } else {
            C15237l c15237l2 = (C15237l) AbstractC16901l.m4217extends(list);
            C15237l c15237l3 = (C15237l) AbstractC16901l.m4212class(list);
            AbstractC11880l.m3277interface(c15237l2 != null ? c15237l2.yandex : -1L, "firstVisibleItem:index");
            AbstractC11880l.m3277interface(c15237l3 != null ? c15237l3.yandex : -1L, "lastVisibleItem:index");
            c15387l.getClass();
            c15387l.purchase = c15237l != null ? c15237l.firebase : null;
            if (c15387l.amazon || i > 0) {
                c15387l.amazon = true;
                if (!(((float) i2) >= 0.0f)) {
                    AbstractC14825l.crashlytics("scrollOffset should be non-negative");
                }
                c15387l.yandex(c15237l != null ? c15237l.yandex : 0, i2);
            }
            if (this.firebase) {
                C18145l c18145l = this.yandex;
                int i3 = c18145l.yandex;
                boolean z3 = c18145l.loadAd;
                if (i3 != -1 && !list.isEmpty() && i3 != C18145l.loadAd(c1644l, z3)) {
                    c18145l.yandex = -1;
                    InterfaceC13921l interfaceC13921l = (InterfaceC13921l) c18145l.purchase;
                    if (interfaceC13921l != null) {
                        interfaceC13921l.cancel();
                    }
                    c18145l.purchase = null;
                }
                int i4 = c18145l.crashlytics;
                if (i4 != -1 && c18145l.amazon != 0.0f && i4 != i && !list.isEmpty()) {
                    int iLoadAd = C18145l.loadAd(c1644l, c18145l.amazon < 0.0f);
                    if (iLoadAd >= 0 && iLoadAd < i) {
                        c18145l.yandex = iLoadAd;
                        c18145l.purchase = AbstractC1757l.m1030catch(this.ads, iLoadAd);
                    }
                }
                c18145l.crashlytics = i;
            }
        }
        if (z) {
            c13568l.ad(c1644l.billing, c1644l.subs, c1644l.admob);
        }
    }

    @Override // defpackage.InterfaceC17955l
    public final float purchase(float f) {
        return this.isPro.purchase(f);
    }

    public final void subs(float f, C1644l c1644l) {
        InterfaceC13921l interfaceC13921l;
        InterfaceC13921l interfaceC13921l2;
        if (this.firebase) {
            boolean zIsEmpty = c1644l.firebase.isEmpty();
            C18145l c18145l = this.yandex;
            if (!zIsEmpty) {
                boolean z = f < 0.0f;
                int iLoadAd = C18145l.loadAd(c1644l, z);
                if (iLoadAd >= 0 && iLoadAd < c1644l.vip) {
                    if (iLoadAd != c18145l.yandex) {
                        if (c18145l.loadAd != z) {
                            c18145l.yandex = -1;
                            InterfaceC13921l interfaceC13921l3 = (InterfaceC13921l) c18145l.purchase;
                            if (interfaceC13921l3 != null) {
                                interfaceC13921l3.cancel();
                            }
                            c18145l.purchase = null;
                        }
                        c18145l.loadAd = z;
                        c18145l.yandex = iLoadAd;
                        c18145l.purchase = AbstractC1757l.m1030catch(this.ads, iLoadAd);
                    }
                    List list = c1644l.firebase;
                    if (z) {
                        C15237l c15237l = (C15237l) AbstractC16901l.m4214continue(list);
                        if (((c15237l.metrica + c15237l.startapp) + c1644l.adcel) - c1644l.remoteconfig < (-f) && (interfaceC13921l2 = (InterfaceC13921l) c18145l.purchase) != null) {
                            interfaceC13921l2.yandex();
                        }
                    } else if (c1644l.smaato - ((C15237l) AbstractC16901l.m4231native(list)).metrica < f && (interfaceC13921l = (InterfaceC13921l) c18145l.purchase) != null) {
                        interfaceC13921l.yandex();
                    }
                }
            }
            c18145l.amazon = f;
        }
    }

    @Override // defpackage.InterfaceC17955l
    public final boolean yandex() {
        return this.isPro.yandex();
    }
}
