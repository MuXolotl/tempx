package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّؑٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12307l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f24379l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ boolean f24380l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f24381l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f24382l = 1;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f24383l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f24384l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12307l(InterfaceC14029l interfaceC14029l, C12094l c12094l, C9426l c9426l, boolean z, boolean z2) {
        super(2, interfaceC14029l);
        this.f24383l = c12094l;
        this.f24381l = c9426l;
        this.f24379l = z;
        this.f24380l = z2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0078  */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:57:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        boolean zBooleanValue;
        boolean z;
        C9426l c9426l;
        C15161l c15161l;
        Integer num;
        switch (this.f24382l) {
            case 0:
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                int i = this.f24384l;
                if (i != 0) {
                    if (i == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                AbstractC15781l abstractC15781l = (AbstractC15781l) this.f24383l;
                boolean z2 = this.f24379l;
                C13699l c13699l = new C13699l(null, abstractC15781l, (Function1) this.f24381l, this.f24380l, z2);
                this.f24384l = 1;
                Object objMetrica = abstractC15781l.metrica(z2, c13699l, this);
                return objMetrica == enumC9342l ? enumC9342l : objMetrica;
            default:
                boolean z3 = this.f24379l;
                C9426l c9426l2 = (C9426l) this.f24381l;
                C12094l c12094l = (C12094l) this.f24383l;
                EnumC9342l enumC9342l2 = EnumC9342l.f19165l;
                int i2 = this.f24384l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC1142l interfaceC1142l = c12094l.subs;
                    if (interfaceC1142l != null) {
                        this.f24384l = 1;
                        obj = interfaceC1142l.m832l(this);
                        if (obj == enumC9342l2) {
                            return enumC9342l2;
                        }
                    } else {
                        zBooleanValue = false;
                    }
                    if (zBooleanValue) {
                        c12094l.crashlytics(c12094l.billing, -1);
                        c9426l2.m2649l(new IllegalStateException("Low Light Boost is disabled when expected frame rate range exceeds 30."));
                    } else {
                        c12094l.purchase = z3;
                        if (!z3) {
                            c12094l.crashlytics(c12094l.billing, -1);
                        }
                        if (c12094l.crashlytics != null) {
                            if (z3) {
                                c12094l.crashlytics(c12094l.billing, 0);
                            }
                            z = this.f24380l;
                            c9426l = c12094l.admob;
                            if (z) {
                                if (c9426l != null) {
                                    AbstractC14814l.isVip("There is a new enableLowLightBoost being set", c9426l);
                                }
                                c12094l.admob = null;
                            } else if (c9426l != null) {
                                AbstractC0140l.vip(c9426l2, c9426l);
                            }
                            c12094l.admob = c9426l2;
                            c15161l = c12094l.yandex;
                            num = z3 ? new Integer(6) : null;
                            synchronized (c15161l.amazon) {
                                c15161l.firebase = num;
                                Unit unit = Unit.INSTANCE;
                            }
                            AbstractC0140l.vip(c15161l.billing(), c9426l2);
                            c9426l2.mo2154l(new C3768l(c9426l2, c12094l, 16));
                        } else {
                            AbstractC14814l.isVip("Camera is not active.", c9426l2);
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue) {
                    c12094l.crashlytics(c12094l.billing, -1);
                    c9426l2.m2649l(new IllegalStateException("Low Light Boost is disabled when expected frame rate range exceeds 30."));
                } else {
                    c12094l.purchase = z3;
                    if (!z3) {
                        c12094l.crashlytics(c12094l.billing, -1);
                    }
                    if (c12094l.crashlytics != null) {
                        if (z3) {
                            c12094l.crashlytics(c12094l.billing, 0);
                        }
                        z = this.f24380l;
                        c9426l = c12094l.admob;
                        if (z) {
                            if (c9426l != null) {
                                AbstractC14814l.isVip("There is a new enableLowLightBoost being set", c9426l);
                            }
                            c12094l.admob = null;
                        } else if (c9426l != null) {
                            AbstractC0140l.vip(c9426l2, c9426l);
                        }
                        c12094l.admob = c9426l2;
                        c15161l = c12094l.yandex;
                        if (z3) {
                        }
                        synchronized (c15161l.amazon) {
                            c15161l.firebase = num;
                            Unit unit3 = Unit.INSTANCE;
                            AbstractC0140l.vip(c15161l.billing(), c9426l2);
                            c9426l2.mo2154l(new C3768l(c9426l2, c12094l, 16));
                        }
                    } else {
                        AbstractC14814l.isVip("Camera is not active.", c9426l2);
                        Unit unit4 = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f24382l;
        Object obj2 = this.f24381l;
        Object obj3 = this.f24383l;
        switch (i) {
            case 0:
                return new C12307l(interfaceC14029l, (AbstractC15781l) obj3, (Function1) obj2, this.f24379l, this.f24380l);
            default:
                return new C12307l(interfaceC14029l, (C12094l) obj3, (C9426l) obj2, this.f24379l, this.f24380l);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f24382l) {
            case 0:
                break;
        }
        return ((C12307l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12307l(InterfaceC14029l interfaceC14029l, AbstractC15781l abstractC15781l, Function1 function1, boolean z, boolean z2) {
        super(2, interfaceC14029l);
        this.f24383l = abstractC15781l;
        this.f24379l = z;
        this.f24380l = z2;
        this.f24381l = function1;
    }
}
