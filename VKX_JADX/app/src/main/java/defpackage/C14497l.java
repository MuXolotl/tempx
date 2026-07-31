package defpackage;

import android.database.SQLException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٓۢ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14497l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f28371l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C17274l f28372l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f28373l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f28374l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14497l(C17274l c17274l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f28373l = i;
        this.f28372l = c17274l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        InterfaceC12352l interfaceC12352l;
        Object objAmazon;
        Object objYandex;
        InterfaceC12352l interfaceC12352l2;
        Object objAmazon2;
        EnumC0952l[] enumC0952lArr;
        EnumC0952l enumC0952l;
        int i = this.f28373l;
        EnumC18674l enumC18674l = EnumC18674l.f36442l;
        boolean z = false;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        boolean z2 = true;
        C17274l c17274l = this.f28372l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i2 = this.f28374l;
                if (i2 != 0) {
                    if (i2 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                C10595l c10595l = (C10595l) this.f28371l;
                this.f28374l = 1;
                Object objYandex2 = C17274l.yandex(c17274l, c10595l, this);
                return objYandex2 == enumC9342l ? enumC9342l : objYandex2;
            case 1:
                int i3 = this.f28374l;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            interfaceC12352l = (InterfaceC12352l) this.f28371l;
                            AbstractC2829l.crashlytics(obj);
                            objAmazon = obj;
                        } else {
                            if (i3 != 2) {
                                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            AbstractC2829l.crashlytics(obj);
                            objYandex = obj;
                        }
                        return (Set) objYandex;
                    }
                    AbstractC2829l.crashlytics(obj);
                    interfaceC12352l = (InterfaceC12352l) this.f28371l;
                    this.f28371l = interfaceC12352l;
                    this.f28374l = 1;
                    objAmazon = interfaceC12352l.amazon(this);
                    if (objAmazon == enumC9342l) {
                        return enumC9342l;
                    }
                    if (!((Boolean) objAmazon).booleanValue()) {
                        C14497l c14497l = new C14497l(c17274l, interfaceC14029l, 0);
                        this.f28371l = null;
                        this.f28374l = 2;
                        objYandex = interfaceC12352l.yandex(enumC18674l, c14497l, this);
                        if (objYandex == enumC9342l) {
                            return enumC9342l;
                        }
                        return (Set) objYandex;
                    }
                } catch (SQLException unused) {
                }
                return C5746l.f12138l;
            default:
                int i4 = this.f28374l;
                if (i4 != 0) {
                    if (i4 == 1) {
                        interfaceC12352l2 = (InterfaceC12352l) this.f28371l;
                        AbstractC2829l.crashlytics(obj);
                        objAmazon2 = obj;
                    } else {
                        if (i4 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                interfaceC12352l2 = (InterfaceC12352l) this.f28371l;
                this.f28371l = interfaceC12352l2;
                this.f28374l = 1;
                objAmazon2 = interfaceC12352l2.amazon(this);
                if (objAmazon2 == enumC9342l) {
                    return enumC9342l;
                }
                if (((Boolean) objAmazon2).booleanValue()) {
                    return Unit.INSTANCE;
                }
                C11919l c11919l = (C11919l) c17274l.admob;
                long[] jArr = (long[]) c11919l.f23767l;
                ReentrantLock reentrantLock = (ReentrantLock) c11919l.f23763l;
                reentrantLock.lock();
                try {
                    if (c11919l.f23764l) {
                        c11919l.f23764l = false;
                        int length = jArr.length;
                        enumC0952lArr = new EnumC0952l[length];
                        int i5 = 0;
                        boolean z3 = false;
                        while (i5 < length) {
                            if (jArr[i5] > 0) {
                                z = z2;
                            }
                            boolean[] zArr = (boolean[]) c11919l.f23766l;
                            if (z != zArr[i5]) {
                                zArr[i5] = z;
                                enumC0952l = z ? EnumC0952l.f2637l : EnumC0952l.f2636l;
                                z3 = true;
                            } else {
                                enumC0952l = EnumC0952l.f2638l;
                            }
                            enumC0952lArr[i5] = enumC0952l;
                            i5++;
                            z = false;
                            z2 = true;
                        }
                        if (!z3) {
                            enumC0952lArr = null;
                        }
                        reentrantLock.unlock();
                    } else {
                        reentrantLock.unlock();
                        enumC0952lArr = null;
                    }
                    if (enumC0952lArr != null) {
                        C18321l c18321l = new C18321l(enumC0952lArr, c17274l, interfaceC12352l2, null);
                        this.f28371l = null;
                        this.f28374l = 2;
                        if (interfaceC12352l2.yandex(enumC18674l, c18321l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f28373l;
        C17274l c17274l = this.f28372l;
        switch (i) {
            case 0:
                C14497l c14497l = new C14497l(c17274l, interfaceC14029l, 0);
                c14497l.f28371l = obj;
                return c14497l;
            case 1:
                C14497l c14497l2 = new C14497l(c17274l, interfaceC14029l, 1);
                c14497l2.f28371l = obj;
                return c14497l2;
            default:
                C14497l c14497l3 = new C14497l(c17274l, interfaceC14029l, 2);
                c14497l3.f28371l = obj;
                return c14497l3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28373l) {
            case 0:
                return ((C14497l) ads((InterfaceC14029l) obj2, (C10595l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C14497l) ads((InterfaceC14029l) obj2, (InterfaceC12352l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C14497l) ads((InterfaceC14029l) obj2, (InterfaceC12352l) obj)).Signature(Unit.INSTANCE);
        }
    }
}
