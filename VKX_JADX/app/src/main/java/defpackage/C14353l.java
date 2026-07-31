package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;

/* JADX INFO: renamed from: lٓۗٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14353l implements InterfaceC6942l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f28102l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6942l f28103l;

    public C14353l(InterfaceC6942l interfaceC6942l, int i) {
        this.f28103l = interfaceC6942l;
        this.f28102l = i;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC6942l
    public final Object yandex(InterfaceC9427l interfaceC9427l, InterfaceC14029l interfaceC14029l) {
        C2276l c2276l;
        Object obj;
        if (interfaceC14029l instanceof C2276l) {
            c2276l = (C2276l) interfaceC14029l;
            int i = c2276l.f4973l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2276l.f4973l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c2276l = new C2276l(this, interfaceC14029l);
            }
        } else {
            c2276l = new C2276l(this, interfaceC14029l);
        }
        Object obj2 = c2276l.f4974l;
        int i2 = c2276l.f4973l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj2);
            Object obj3 = new Object();
            C9987l c9987l = new C9987l();
            try {
                InterfaceC6942l interfaceC6942l = this.f28103l;
                C16117l c16117l = new C16117l(c9987l, this.f28102l, interfaceC9427l, obj3);
                c2276l.f4972l = obj3;
                c2276l.f4973l = 1;
                Object objYandex = interfaceC6942l.yandex(c16117l, c2276l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objYandex == enumC9342l) {
                    return enumC9342l;
                }
            } catch (Cinstanceof e) {
                e = e;
                obj = obj3;
                if (e.f839l != obj) {
                    throw e;
                }
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = c2276l.f4972l;
            try {
                AbstractC2829l.crashlytics(obj2);
            } catch (Cinstanceof e2) {
                e = e2;
                if (e.f839l != obj) {
                    throw e;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
