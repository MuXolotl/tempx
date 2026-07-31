package defpackage;

import android.view.ViewGroup;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌُۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9117l implements InterfaceC0492l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C17893l f18726l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public InterfaceC2702l f18727l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C13660l f18728l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C2121l f18729l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final String f18730l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public AbstractC0306l f18731l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C3654l f18732l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C13660l f18733l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public int f18734l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f18735l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f18736l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C13660l f18737l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C3606l f18738l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C13660l f18739l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C6106l f18740l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public int f18741l;

    public C9117l(C3654l c3654l, InterfaceC2702l interfaceC2702l) {
        this.f18732l = c3654l;
        this.f18727l = interfaceC2702l;
        long[] jArr = AbstractC12154l.yandex;
        this.f18739l = new C13660l();
        this.f18728l = new C13660l();
        this.f18729l = new C2121l(this);
        this.f18738l = new C3606l(this);
        this.f18733l = new C13660l();
        this.f18740l = new C6106l();
        this.f18737l = new C13660l();
        this.f18726l = new C17893l(0, new Object[16]);
        this.f18730l = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static final void crashlytics(C9117l c9117l, Object obj) {
        C3654l c3654l = c9117l.f18732l;
        c9117l.admob();
        C3654l c3654l2 = (C3654l) c9117l.f18733l.smaato(obj);
        if (c3654l2 != null) {
            if (c9117l.f18734l <= 0) {
                AbstractC0081l.crashlytics("No pre-composed items to dispose");
            }
            int iSmaato = ((C17893l) ((C4588l) c3654l.startapp()).f9321l).smaato(c3654l2);
            if (iSmaato < ((C17893l) ((C4588l) c3654l.startapp()).f9321l).f34846l - c9117l.f18734l) {
                AbstractC0081l.crashlytics("Item is not in pre-composed item range");
            }
            c9117l.f18741l++;
            c9117l.f18734l--;
            C14346l c14346l = (C14346l) c9117l.f18739l.mopub(c3654l2);
            if (c14346l != null) {
                purchase(c14346l);
            }
            int i = (((C17893l) ((C4588l) c3654l.startapp()).f9321l).f34846l - c9117l.f18734l) - c9117l.f18741l;
            c9117l.firebase(iSmaato, i);
            c9117l.mopub(i);
        }
        if (c9117l.f18726l.firebase(obj)) {
            C3654l.m1371goto(c3654l, true, 6);
        }
    }

    public static void purchase(C14346l c14346l) {
        C6295l c6295l;
        C15492l c15492l = c14346l.billing;
        if (c15492l != null) {
            c15492l.admob.set(EnumC17373l.f33841l);
            C15389l c15389l = c15492l.firebase;
            if (((C6295l) c15389l.amazon).subs()) {
                c6295l = (C6295l) c15389l.amazon;
                C6295l c6295l2 = AbstractC13087l.yandex;
                c15389l.amazon = new C6295l();
                ((C17893l) c15389l.crashlytics).isPro();
            } else {
                c6295l = null;
            }
            c15389l.amazon();
            C6931l c6931l = c15492l.yandex;
            c6931l.f14535l = null;
            if (c6295l != null) {
                c6931l.f14527l.firebase = c6295l;
                c6931l.f14546l = 2;
            }
            c14346l.billing = null;
            C6931l c6931l2 = c14346l.crashlytics;
            if (c6931l2 != null) {
                c6931l2.yandex();
            }
            c14346l.crashlytics = null;
        }
    }

    public final void admob() {
        int i = ((C17893l) ((C4588l) this.f18732l.startapp()).f9321l).f34846l;
        int i2 = this.f18739l.purchase;
        if (i2 != i) {
            AbstractC0081l.yandex("Inconsistency between the count of nodes tracked by the state (" + i2 + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        int i3 = this.f18741l;
        int i4 = this.f18734l;
        if ((i - i3) - i4 < 0) {
            StringBuilder sbSubscription = AbstractC14814l.subscription(i, i3, "Incorrect state. Total children ", ". Reusable children ", ". Precomposed children ");
            sbSubscription.append(i4);
            AbstractC0081l.yandex(sbSubscription.toString());
        }
        int i5 = this.f18733l.purchase;
        int i6 = this.f18734l;
        if (i5 == i6) {
            return;
        }
        AbstractC0081l.yandex("Incorrect state. Precomposed children " + i6 + ". Map size " + i5);
    }

    public final void amazon(C14346l c14346l, boolean z) {
        C15492l c15492l = c14346l.billing;
        if (c15492l != null) {
            AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
            Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
            AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
            try {
                C3654l c3654l = this.f18732l;
                c3654l.f7687l = true;
                if (z) {
                    while (!c15492l.crashlytics()) {
                        try {
                            c15492l.purchase(new C11467l(24));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                c15492l.yandex();
                c14346l.billing = null;
                Unit unit = Unit.INSTANCE;
                c3654l.f7687l = false;
                AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
            } catch (Throwable th2) {
                AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                throw th2;
            }
        }
    }

    public final InterfaceC6797l billing(Object obj) {
        return !this.f18732l.m1386native() ? new C17262l() : new C3085l(this, obj);
    }

    public final void firebase(int i, int i2) {
        C3654l c3654l = this.f18732l;
        c3654l.f7687l = true;
        c3654l.m1397throw(i, i2, 1);
        Unit unit = Unit.INSTANCE;
        c3654l.f7687l = false;
    }

    public final void isPro(boolean z) {
        this.f18734l = 0;
        this.f18733l.yandex();
        List listStartapp = this.f18732l.startapp();
        int i = ((C17893l) ((C4588l) listStartapp).f9321l).f34846l;
        if (this.f18741l != i) {
            this.f18741l = i;
            AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
            Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
            AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    C3654l c3654l = (C3654l) ((C4588l) listStartapp).get(i2);
                    C14346l c14346l = (C14346l) this.f18739l.mopub(c3654l);
                    if (c14346l != null && ((Boolean) c14346l.mopub.getValue()).booleanValue()) {
                        C14070l c14070l = c3654l.f7667l;
                        c14070l.startapp.f29317l = 3;
                        C4020l c4020l = c14070l.adcel;
                        if (c4020l != null) {
                            c4020l.f8276l = 3;
                        }
                        remoteconfig(c14346l, z);
                        c14346l.yandex = AbstractC4333l.yandex;
                    }
                } catch (Throwable th) {
                    AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                    throw th;
                }
            }
            Unit unit = Unit.INSTANCE;
            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
            this.f18728l.yandex();
        }
        admob();
    }

    @Override // defpackage.InterfaceC0492l
    public final void loadAd() {
        isPro(true);
    }

    public final C3654l metrica(Object obj) {
        C13660l c13660l;
        int i;
        if (this.f18741l == 0) {
            return null;
        }
        C4588l c4588l = (C4588l) this.f18732l.startapp();
        int i2 = ((C17893l) c4588l.f9321l).f34846l - this.f18734l;
        int i3 = i2 - this.f18741l;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            c13660l = this.f18739l;
            if (i5 < i3) {
                i = -1;
                break;
            }
            if (AbstractC8576l.yandex(((C14346l) c13660l.mopub((C3654l) c4588l.get(i5))).yandex, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (true) {
                if (i4 < i3) {
                    i5 = i4;
                    break;
                }
                C14346l c14346l = (C14346l) c13660l.mopub((C3654l) c4588l.get(i4));
                Object obj2 = c14346l.yandex;
                if (obj2 == AbstractC4333l.yandex || this.f18727l.firebase(obj, obj2)) {
                    c14346l.yandex = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            firebase(i5, i3);
        }
        this.f18741l--;
        C3654l c3654l = (C3654l) c4588l.get(i3);
        C14346l c14346l2 = (C14346l) c13660l.mopub(c3654l);
        c14346l2.mopub = AbstractC8020l.smaato(Boolean.TRUE);
        c14346l2.purchase = true;
        c14346l2.amazon = true;
        return c3654l;
    }

    public final void mopub(int i) {
        boolean z;
        boolean z2 = false;
        this.f18741l = 0;
        List listStartapp = this.f18732l.startapp();
        C4588l c4588l = (C4588l) listStartapp;
        int i2 = (((C17893l) c4588l.f9321l).f34846l - this.f18734l) - 1;
        if (i <= i2) {
            this.f18740l.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    ((C1807l) this.f18740l.f12891l).yandex(((C14346l) this.f18739l.mopub((C3654l) c4588l.get(i3))).yandex);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.f18727l.crashlytics(this.f18740l);
            AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
            Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
            AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
            z = false;
            while (i2 >= i) {
                try {
                    C3654l c3654l = (C3654l) ((C4588l) listStartapp).get(i2);
                    C14346l c14346l = (C14346l) this.f18739l.mopub(c3654l);
                    Object obj = c14346l.yandex;
                    if (((C1807l) this.f18740l.f12891l).crashlytics(obj)) {
                        this.f18741l++;
                        if (((Boolean) c14346l.mopub.getValue()).booleanValue()) {
                            C14070l c14070l = c3654l.f7667l;
                            c14070l.startapp.f29317l = 3;
                            C4020l c4020l = c14070l.adcel;
                            if (c4020l != null) {
                                c4020l.f8276l = 3;
                            }
                            remoteconfig(c14346l, false);
                            if (c14346l.admob) {
                                z = true;
                            }
                        }
                    } else {
                        C3654l c3654l2 = this.f18732l;
                        c3654l2.f7687l = true;
                        this.f18739l.smaato(c3654l);
                        C6931l c6931l = c14346l.crashlytics;
                        if (c6931l != null) {
                            c6931l.yandex();
                        }
                        this.f18732l.m1385interface(i2, 1);
                        Unit unit = Unit.INSTANCE;
                        c3654l2.f7687l = false;
                    }
                    this.f18728l.smaato(obj);
                    i2--;
                } catch (Throwable th) {
                    AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                    throw th;
                }
            }
            Unit unit2 = Unit.INSTANCE;
            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
        } else {
            z = false;
        }
        if (z) {
            synchronized (AbstractC9620l.crashlytics) {
                C6295l c6295l = AbstractC9620l.isPro.admob;
                if (c6295l != null && c6295l.subs()) {
                    z2 = true;
                }
            }
            if (z2) {
                AbstractC9620l.yandex();
            }
        }
        admob();
    }

    public final void remoteconfig(C14346l c14346l, boolean z) {
        C6931l c6931l;
        if (z || !c14346l.admob) {
            c14346l.mopub = AbstractC8020l.smaato(Boolean.FALSE);
        } else {
            c14346l.mopub.setValue(Boolean.FALSE);
        }
        if (c14346l.billing != null) {
            purchase(c14346l);
            return;
        }
        if (z) {
            C6931l c6931l2 = c14346l.crashlytics;
            if (c6931l2 != null) {
                c6931l2.remoteconfig();
                return;
            }
            return;
        }
        InterfaceC0159l outOfFrameExecutor = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(this.f18732l)).getOutOfFrameExecutor();
        if (outOfFrameExecutor != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC13840l) outOfFrameExecutor).m3770package(new C11029l(10, c14346l));
        } else {
            if (c14346l.admob || (c6931l = c14346l.crashlytics) == null) {
                return;
            }
            c6931l.remoteconfig();
        }
    }

    public final void smaato(Object obj, Function2 function2, boolean z) {
        C3654l c3654l = this.f18732l;
        if (c3654l.m1386native()) {
            admob();
            if (this.f18728l.crashlytics(obj)) {
                return;
            }
            this.f18737l.smaato(obj);
            C13660l c13660l = this.f18733l;
            Object objMopub = c13660l.mopub(obj);
            if (objMopub == null) {
                objMopub = metrica(obj);
                if (objMopub != null) {
                    firebase(((C17893l) ((C4588l) c3654l.startapp()).f9321l).smaato(objMopub), ((C17893l) ((C4588l) c3654l.startapp()).f9321l).f34846l);
                    this.f18734l++;
                } else {
                    int i = ((C17893l) ((C4588l) c3654l.startapp()).f9321l).f34846l;
                    C3654l c3654l2 = new C3654l(2);
                    c3654l.f7687l = true;
                    c3654l.applovin(i, c3654l2);
                    Unit unit = Unit.INSTANCE;
                    c3654l.f7687l = false;
                    this.f18734l++;
                    objMopub = c3654l2;
                }
                c13660l.vip(obj, objMopub);
            }
            vip((C3654l) objMopub, obj, z, function2);
        }
    }

    @Override // defpackage.InterfaceC0492l
    public final void subs() {
        isPro(false);
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
    public final void vip(C3654l c3654l, Object obj, boolean z, Function2 function2) {
        boolean z2;
        C6931l c6931l;
        C13660l c13660l = this.f18739l;
        Object objMopub = c13660l.mopub(c3654l);
        Object obj2 = objMopub;
        if (objMopub == null) {
            C15578l c15578l = AbstractC0893l.yandex;
            C14346l c14346l = new C14346l();
            c14346l.yandex = obj;
            c14346l.loadAd = c15578l;
            c14346l.crashlytics = null;
            c14346l.mopub = AbstractC8020l.smaato(Boolean.TRUE);
            c13660l.vip(c3654l, c14346l);
            obj2 = c14346l;
        }
        C14346l c14346l2 = (C14346l) obj2;
        boolean z3 = c14346l2.loadAd != function2;
        if (c14346l2.billing != null) {
            if (z3) {
                purchase(c14346l2);
            } else if (z) {
                return;
            } else {
                amazon(c14346l2, true);
            }
        }
        C6931l c6931l2 = c14346l2.crashlytics;
        if (c6931l2 != null) {
            synchronized (c6931l2.f14539l) {
                z2 = c6931l2.f14544l.purchase > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || c14346l2.amazon) {
            c14346l2.loadAd = function2;
            if (c14346l2.billing != null) {
                AbstractC0081l.yandex("new subcompose call while paused composition is still active");
            }
            AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
            Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
            AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
            try {
                C3654l c3654l2 = this.f18732l;
                c3654l2.f7687l = true;
                C6931l c6931l3 = c14346l2.crashlytics;
                AbstractC0306l abstractC0306l = this.f18731l;
                if (abstractC0306l == null) {
                    AbstractC0081l.amazon("parent composition reference not set");
                    throw new C6451l(10);
                }
                if (c6931l3 == null || c6931l3.license()) {
                    if (z) {
                        ViewGroup.LayoutParams layoutParams = AbstractC4012l.yandex;
                        c6931l = new C6931l(abstractC0306l, new C11803l(c3654l));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = AbstractC4012l.yandex;
                        c6931l = new C6931l(abstractC0306l, new C11803l(c3654l));
                    }
                    c6931l3 = c6931l;
                }
                c14346l2.crashlytics = c6931l3;
                Function2 c15578l2 = c14346l2.loadAd;
                if (((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(this.f18732l)).getOutOfFrameExecutor() != null) {
                    c14346l2.admob = false;
                } else {
                    c14346l2.admob = true;
                    c15578l2 = new C15578l(1524156494, true, new C17671l(c14346l2, c15578l2, 3));
                }
                if (z) {
                    if (c14346l2.purchase) {
                        c6931l3.isPro();
                        c6931l3.adcel();
                        c14346l2.billing = c6931l3.smaato(true, c15578l2);
                    } else {
                        c14346l2.billing = c6931l3.smaato(c6931l3.isPro(), c15578l2);
                    }
                } else if (c14346l2.purchase) {
                    c6931l3.isPro();
                    c6931l3.adcel();
                    C6956l c6956l = c6931l3.f14523l;
                    c6956l.isVip = 0;
                    c6956l.advert = true;
                    c6931l3.f14531l = c15578l2;
                    c6931l3.f14533l.yandex(c6931l3, c15578l2);
                    if (c6956l.f14606throws || c6956l.isVip != 0) {
                        AbstractC5363l.yandex("Cannot disable reuse from root if it was caused by other groups");
                    }
                    c6956l.isVip = -1;
                    c6956l.advert = false;
                } else {
                    c6931l3.premium(c15578l2);
                }
                c14346l2.purchase = false;
                Unit unit = Unit.INSTANCE;
                c3654l2.f7687l = false;
                AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                c14346l2.amazon = false;
            } catch (Throwable th) {
                AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[LOOP:0: B:5:0x0014->B:17:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[EDGE_INSN: B:21:0x0052->B:18:0x0052 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x004f], SYNTHETIC] */
    @Override // defpackage.InterfaceC0492l
    public final void yandex() {
        C6931l c6931l;
        C3654l c3654l = this.f18732l;
        c3654l.f7687l = true;
        C13660l c13660l = this.f18739l;
        Object[] objArr = c13660l.crashlytics;
        long[] jArr = c13660l.yandex;
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
                        if ((255 & j) < 128 && (c6931l = ((C14346l) objArr[(i << 3) + i3]).crashlytics) != null) {
                            c6931l.yandex();
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
        c3654l.m1377class();
        Unit unit = Unit.INSTANCE;
        c3654l.f7687l = false;
        c13660l.yandex();
        this.f18728l.yandex();
        this.f18734l = 0;
        this.f18741l = 0;
        this.f18733l.yandex();
        admob();
    }
}
