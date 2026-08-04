package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٔۙؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15127l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f29681l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f29682l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f29683l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15127l(int i, InterfaceC14029l interfaceC14029l, int i2, boolean z) {
        super(2, interfaceC14029l);
        this.f29682l = i2;
        this.f29683l = i;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        Object objAdmob;
        InterfaceC2262l interfaceC2262l;
        Object objFirebase;
        int i = this.f29682l;
        int i2 = 5;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i3 = 1;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i4 = this.f29683l;
                try {
                    if (i4 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C12772l c12772l = new C12772l((byte) 0, 3);
                        this.f29681l = null;
                        this.f29683l = 1;
                        objAdmob = AbstractC8189l.admob(c12772l, this);
                        if (objAdmob == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i4 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                        objAdmob = obj;
                    }
                    break;
                } catch (Throwable unused) {
                }
                return Unit.INSTANCE;
            case 1:
                int i5 = this.f29683l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    interfaceC2262l = (InterfaceC2262l) this.f29681l;
                } else {
                    if (i5 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    interfaceC2262l = (InterfaceC2262l) this.f29681l;
                    AbstractC2829l.crashlytics(obj);
                }
                while (AbstractC11174l.isPro(interfaceC2262l.vip())) {
                    C1306l c1306l = new C1306l(i2);
                    this.f29681l = interfaceC2262l;
                    this.f29683l = 1;
                    if (AbstractC1789l.amazon(this.f1295l).mo1226super(c1306l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                }
                return Unit.INSTANCE;
            case 2:
                C16811l c16811l = (C16811l) this.f29681l;
                AbstractC2829l.crashlytics(obj);
                boolean zMo2758finally = c16811l.mo2758finally();
                int iMo2761implements = c16811l.mo2761implements();
                int i6 = this.f29683l;
                if (iMo2761implements != i6) {
                    c16811l.smaato(i6, 0L);
                    if (zMo2758finally) {
                        c16811l.mo2801protected();
                    }
                }
                return Unit.INSTANCE;
            case 3:
                InterfaceC9427l interfaceC9427l = (InterfaceC9427l) this.f29681l;
                int i7 = this.f29683l;
                if (i7 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C3331l c3331l = new C3331l(0);
                    this.f29681l = null;
                    this.f29683l = 1;
                    if (interfaceC9427l.isPro(c3331l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i7 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 4:
                InterfaceC2262l interfaceC2262l2 = (InterfaceC2262l) this.f29681l;
                int i8 = this.f29683l;
                if (i8 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C6069l c6069l = new C6069l(i3);
                    this.f29681l = interfaceC2262l2;
                    this.f29683l = 1;
                    objFirebase = AbstractC10999l.firebase(AbstractC11463l.yandex, new C5888l(c6069l, interfaceC14029l, 14), this);
                    if (objFirebase == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i8 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                    objFirebase = obj;
                }
                for (String str : AbstractC12024l.applovin(1000, (String) objFirebase)) {
                }
                return objFirebase;
            case 5:
                C4700l c4700l = (C4700l) this.f29681l;
                AbstractC2829l.crashlytics(obj);
                return C4700l.loadAd(c4700l, false, this.f29683l, 5);
            case 6:
                C15343l c15343l = (C15343l) this.f29681l;
                AbstractC2829l.crashlytics(obj);
                return C15343l.loadAd(c15343l, 0, this.f29683l, 0, 0, 0, 0, false, false, false, false, null, 0, false, 16381);
            case 7:
                C15343l c15343l2 = (C15343l) this.f29681l;
                AbstractC2829l.crashlytics(obj);
                return C15343l.loadAd(c15343l2, this.f29683l, 0, 0, 0, 0, 0, false, false, false, false, null, 0, false, 16382);
            case 8:
                C15343l c15343l3 = (C15343l) this.f29681l;
                AbstractC2829l.crashlytics(obj);
                return C15343l.loadAd(c15343l3, 0, 0, 0, 0, 0, this.f29683l, false, false, false, false, null, 0, false, 16351);
            case 9:
                C15343l c15343l4 = (C15343l) this.f29681l;
                AbstractC2829l.crashlytics(obj);
                return C15343l.loadAd(c15343l4, 0, 0, 0, 0, this.f29683l, 0, false, false, false, false, null, 0, false, 16367);
            case 10:
                C15343l c15343l5 = (C15343l) this.f29681l;
                AbstractC2829l.crashlytics(obj);
                return C15343l.loadAd(c15343l5, 0, 0, 0, this.f29683l, 0, 0, false, false, false, false, null, 0, false, 16375);
            case 11:
                C15343l c15343l6 = (C15343l) this.f29681l;
                AbstractC2829l.crashlytics(obj);
                return C15343l.loadAd(c15343l6, 0, 0, this.f29683l, 0, 0, 0, false, false, false, false, null, 0, false, 16379);
            default:
                C15343l c15343l7 = (C15343l) this.f29681l;
                AbstractC2829l.crashlytics(obj);
                return C15343l.loadAd(c15343l7, 0, 0, 0, 0, 0, 0, false, false, false, false, null, this.f29683l, false, 14335);
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f29682l) {
            case 0:
                C15127l c15127l = new C15127l(2, interfaceC14029l, 0);
                c15127l.f29681l = obj;
                return c15127l;
            case 1:
                C15127l c15127l2 = new C15127l(2, interfaceC14029l, 1);
                c15127l2.f29681l = obj;
                return c15127l2;
            case 2:
                C15127l c15127l3 = new C15127l(this.f29683l, interfaceC14029l, 2, false);
                c15127l3.f29681l = obj;
                return c15127l3;
            case 3:
                C15127l c15127l4 = new C15127l(2, interfaceC14029l, 3);
                c15127l4.f29681l = obj;
                return c15127l4;
            case 4:
                C15127l c15127l5 = new C15127l(2, interfaceC14029l, 4);
                c15127l5.f29681l = obj;
                return c15127l5;
            case 5:
                C15127l c15127l6 = new C15127l(this.f29683l, interfaceC14029l, 5, false);
                c15127l6.f29681l = obj;
                return c15127l6;
            case 6:
                C15127l c15127l7 = new C15127l(this.f29683l, interfaceC14029l, 6, false);
                c15127l7.f29681l = obj;
                return c15127l7;
            case 7:
                C15127l c15127l8 = new C15127l(this.f29683l, interfaceC14029l, 7, false);
                c15127l8.f29681l = obj;
                return c15127l8;
            case 8:
                C15127l c15127l9 = new C15127l(this.f29683l, interfaceC14029l, 8, false);
                c15127l9.f29681l = obj;
                return c15127l9;
            case 9:
                C15127l c15127l10 = new C15127l(this.f29683l, interfaceC14029l, 9, false);
                c15127l10.f29681l = obj;
                return c15127l10;
            case 10:
                C15127l c15127l11 = new C15127l(this.f29683l, interfaceC14029l, 10, false);
                c15127l11.f29681l = obj;
                return c15127l11;
            case 11:
                C15127l c15127l12 = new C15127l(this.f29683l, interfaceC14029l, 11, false);
                c15127l12.f29681l = obj;
                return c15127l12;
            default:
                C15127l c15127l13 = new C15127l(this.f29683l, interfaceC14029l, 12, false);
                c15127l13.f29681l = obj;
                return c15127l13;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29682l) {
            case 0:
                return ((C15127l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C15127l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C15127l) ads((InterfaceC14029l) obj2, (C16811l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C15127l) ads((InterfaceC14029l) obj2, (InterfaceC9427l) obj)).Signature(Unit.INSTANCE);
            case 4:
                return ((C15127l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 5:
                return ((C15127l) ads((InterfaceC14029l) obj2, (C4700l) obj)).Signature(Unit.INSTANCE);
            case 6:
                return ((C15127l) ads((InterfaceC14029l) obj2, (C15343l) obj)).Signature(Unit.INSTANCE);
            case 7:
                return ((C15127l) ads((InterfaceC14029l) obj2, (C15343l) obj)).Signature(Unit.INSTANCE);
            case 8:
                return ((C15127l) ads((InterfaceC14029l) obj2, (C15343l) obj)).Signature(Unit.INSTANCE);
            case 9:
                return ((C15127l) ads((InterfaceC14029l) obj2, (C15343l) obj)).Signature(Unit.INSTANCE);
            case 10:
                return ((C15127l) ads((InterfaceC14029l) obj2, (C15343l) obj)).Signature(Unit.INSTANCE);
            case 11:
                return ((C15127l) ads((InterfaceC14029l) obj2, (C15343l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C15127l) ads((InterfaceC14029l) obj2, (C15343l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15127l(int i, InterfaceC14029l interfaceC14029l, int i2) {
        super(i, interfaceC14029l);
        this.f29682l = i2;
    }
}
