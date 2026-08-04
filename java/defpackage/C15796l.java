package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٕٜؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15796l implements InterfaceC6942l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function3 f31014l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6942l f31015l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31016l;

    public /* synthetic */ C15796l(InterfaceC6942l interfaceC6942l, Function3 function3, int i) {
        this.f31016l = i;
        this.f31015l = interfaceC6942l;
        this.f31014l = function3;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0079  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // defpackage.InterfaceC6942l
    public final Object yandex(InterfaceC9427l interfaceC9427l, InterfaceC14029l interfaceC14029l) throws Throwable {
        C14831l c14831l;
        C10412l c10412l;
        C10412l c10412l2;
        Throwable th;
        C8190l c8190l;
        int i = this.f31016l;
        Function3 function3 = this.f31014l;
        InterfaceC6942l interfaceC6942l = this.f31015l;
        int i2 = 0;
        Object obj = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                if (interfaceC14029l instanceof C14831l) {
                    c14831l = (C14831l) interfaceC14029l;
                    int i3 = c14831l.f29039l;
                    if ((i3 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c14831l.f29039l = i3 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c14831l = new C14831l(this, interfaceC14029l);
                    }
                } else {
                    c14831l = new C14831l(this, interfaceC14029l);
                }
                Object obj2 = c14831l.f29040l;
                int i4 = c14831l.f29039l;
                try {
                    try {
                        if (i4 == 0) {
                            AbstractC2829l.crashlytics(obj2);
                            c14831l.f29037l = interfaceC9427l;
                            c14831l.f29041l = 0;
                            c14831l.f29039l = 1;
                            if (interfaceC6942l.yandex(interfaceC9427l, c14831l) == obj) {
                                return obj;
                            }
                        } else {
                            if (i4 != 1) {
                                if (i4 == 2) {
                                    Throwable th2 = (Throwable) c14831l.f29038l;
                                    AbstractC2829l.crashlytics(obj2);
                                    throw th2;
                                }
                                if (i4 != 3) {
                                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                c10412l2 = (C10412l) c14831l.f29038l;
                                try {
                                    AbstractC2829l.crashlytics(obj2);
                                    c10412l2.license();
                                    return Unit.INSTANCE;
                                } catch (Throwable th3) {
                                    th = th3;
                                    c10412l2.license();
                                    throw th;
                                }
                            }
                            i2 = c14831l.f29041l;
                            interfaceC9427l = c14831l.f29037l;
                            AbstractC2829l.crashlytics(obj2);
                        }
                        c14831l.f29037l = null;
                        c14831l.f29038l = c10412l;
                        c14831l.f29041l = i2;
                        c14831l.f29039l = 3;
                        if (function3.invoke(c10412l, null, c14831l) == obj) {
                            return obj;
                        }
                        c10412l2 = c10412l;
                        c10412l2.license();
                        return Unit.INSTANCE;
                    } catch (Throwable th4) {
                        c10412l2 = c10412l;
                        th = th4;
                        c10412l2.license();
                        throw th;
                    }
                    c10412l = new C10412l(interfaceC9427l, c14831l.f1295l);
                } catch (Throwable th5) {
                    C17993l c17993l = new C17993l(th5);
                    c14831l.f29037l = null;
                    c14831l.f29038l = th5;
                    c14831l.f29041l = i2;
                    c14831l.f29039l = 2;
                    if (AbstractC8069l.yandex(c17993l, function3, th5, c14831l) == obj) {
                        return obj;
                    }
                    throw th5;
                }
                break;
            default:
                if (interfaceC14029l instanceof C8190l) {
                    c8190l = (C8190l) interfaceC14029l;
                    int i5 = c8190l.f17094l;
                    if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c8190l.f17094l = i5 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c8190l = new C8190l(this, interfaceC14029l);
                    }
                } else {
                    c8190l = new C8190l(this, interfaceC14029l);
                }
                Object objPurchase = c8190l.f17095l;
                int i6 = c8190l.f17094l;
                if (i6 != 0) {
                    if (i6 == 1) {
                        i2 = c8190l.f17093l;
                        interfaceC9427l = c8190l.f17092l;
                        AbstractC2829l.crashlytics(objPurchase);
                    } else {
                        if (i6 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(objPurchase);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(objPurchase);
                c8190l.f17092l = interfaceC9427l;
                c8190l.f17093l = 0;
                c8190l.f17094l = 1;
                objPurchase = AbstractC0622l.purchase(interfaceC6942l, interfaceC9427l, c8190l);
                if (objPurchase == obj) {
                    return obj;
                }
                Throwable th6 = (Throwable) objPurchase;
                if (th6 != null) {
                    c8190l.f17092l = null;
                    c8190l.f17093l = i2;
                    c8190l.f17094l = 2;
                    if (function3.invoke(interfaceC9427l, th6, c8190l) == obj) {
                        return obj;
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
