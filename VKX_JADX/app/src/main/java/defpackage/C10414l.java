package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَٛۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10414l implements InterfaceC9427l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C10700l f21233l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f21234l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21235l;

    public /* synthetic */ C10414l(Function2 function2, C10700l c10700l, int i) {
        this.f21235l = i;
        this.f21234l = function2;
        this.f21233l = c10700l;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.InterfaceC9427l
    public final Object isPro(Object obj, InterfaceC14029l interfaceC14029l) {
        C10442l c10442l;
        C10967l c10967l;
        int i = this.f21235l;
        C10700l c10700l = this.f21233l;
        Function2 function2 = this.f21234l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                if (interfaceC14029l instanceof C10442l) {
                    c10442l = (C10442l) interfaceC14029l;
                    int i2 = c10442l.f21257l;
                    if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c10442l.f21257l = i2 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c10442l = new C10442l(this, interfaceC14029l);
                    }
                } else {
                    c10442l = new C10442l(this, interfaceC14029l);
                }
                Object objInvoke = c10442l.f21258l;
                int i3 = c10442l.f21257l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(objInvoke);
                    c10442l.f21256l = obj;
                    c10442l.f21257l = 1;
                    objInvoke = function2.invoke(obj, c10442l);
                    if (objInvoke == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = c10442l.f21256l;
                    AbstractC2829l.crashlytics(objInvoke);
                }
                if (!((Boolean) objInvoke).booleanValue()) {
                    return Unit.INSTANCE;
                }
                c10700l.f21708l = obj;
                throw new Cinstanceof(this);
            default:
                if (interfaceC14029l instanceof C10967l) {
                    c10967l = (C10967l) interfaceC14029l;
                    int i4 = c10967l.f22098l;
                    if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c10967l.f22098l = i4 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c10967l = new C10967l(this, interfaceC14029l);
                    }
                } else {
                    c10967l = new C10967l(this, interfaceC14029l);
                }
                Object objInvoke2 = c10967l.f22099l;
                int i5 = c10967l.f22098l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(objInvoke2);
                    c10967l.f22097l = obj;
                    c10967l.f22098l = 1;
                    objInvoke2 = function2.invoke(obj, c10967l);
                    if (objInvoke2 == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i5 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = c10967l.f22097l;
                    AbstractC2829l.crashlytics(objInvoke2);
                }
                if (!((Boolean) objInvoke2).booleanValue()) {
                    return Unit.INSTANCE;
                }
                c10700l.f21708l = obj;
                throw new Cinstanceof(this);
        }
    }
}
