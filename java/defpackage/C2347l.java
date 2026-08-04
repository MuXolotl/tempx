package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؔؓؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2347l implements InterfaceC6942l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f5109l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6942l f5110l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f5111l;

    public C2347l(Function2 function2, InterfaceC6942l interfaceC6942l) {
        this.f5111l = 0;
        this.f5109l = function2;
        this.f5110l = interfaceC6942l;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v2, types: [lّؑۧ] */
    /* JADX WARN: Type inference failed for: r9v4, types: [lّؑۧ] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // defpackage.InterfaceC6942l
    public final Object yandex(InterfaceC9427l interfaceC9427l, InterfaceC14029l interfaceC14029l) {
        C8185l c8185l;
        int i;
        int i2 = this.f5111l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        Function2 function2 = this.f5109l;
        InterfaceC6942l interfaceC6942l = this.f5110l;
        switch (i2) {
            case 0:
                if (interfaceC14029l instanceof C8185l) {
                    c8185l = (C8185l) interfaceC14029l;
                    int i3 = c8185l.f17078l;
                    if ((i3 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c8185l.f17078l = i3 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c8185l = new C8185l(this, interfaceC14029l);
                    }
                } else {
                    c8185l = new C8185l(this, interfaceC14029l);
                }
                Object obj = c8185l.f17079l;
                ?? r9 = c8185l.f17078l;
                try {
                    if (r9 != 0) {
                        if (r9 == 1) {
                            int i4 = c8185l.f17080l;
                            C10412l c10412l = c8185l.f17077l;
                            InterfaceC9427l interfaceC9427l2 = c8185l.f17076l;
                            AbstractC2829l.crashlytics(obj);
                            i = i4;
                            interfaceC9427l = interfaceC9427l2;
                            r9 = c10412l;
                        } else {
                            if (r9 != 2) {
                                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            AbstractC2829l.crashlytics(obj);
                        }
                        return Unit.INSTANCE;
                    }
                    AbstractC2829l.crashlytics(obj);
                    C10412l c10412l2 = new C10412l(interfaceC9427l, c8185l.f1295l);
                    c8185l.f17076l = interfaceC9427l;
                    c8185l.f17077l = c10412l2;
                    i = 0;
                    c8185l.f17080l = 0;
                    c8185l.f17078l = 1;
                    Object objInvoke = function2.invoke(c10412l2, c8185l);
                    r9 = c10412l2;
                    if (objInvoke == enumC9342l) {
                        return enumC9342l;
                    }
                    r9.license();
                    c8185l.f17076l = null;
                    c8185l.f17077l = null;
                    c8185l.f17080l = i;
                    c8185l.f17078l = 2;
                    if (interfaceC6942l.yandex(interfaceC9427l, c8185l) == enumC9342l) {
                        return enumC9342l;
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    r9.license();
                    throw th;
                }
            case 1:
                Object objYandex = interfaceC6942l.yandex(new C17354l(new C9122l(), interfaceC9427l, function2, 5), interfaceC14029l);
                return objYandex == enumC9342l ? objYandex : Unit.INSTANCE;
            default:
                Object objYandex2 = interfaceC6942l.yandex(new C15215l(interfaceC9427l, function2, 6), interfaceC14029l);
                return objYandex2 == enumC9342l ? objYandex2 : Unit.INSTANCE;
        }
    }

    public /* synthetic */ C2347l(InterfaceC6942l interfaceC6942l, Function2 function2, int i) {
        this.f5111l = i;
        this.f5110l = interfaceC6942l;
        this.f5109l = function2;
    }
}
