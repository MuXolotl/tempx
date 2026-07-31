package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;

/* JADX INFO: renamed from: lٍٖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16117l implements InterfaceC9427l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC9427l f31571l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f31572l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C9987l f31573l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f31574l;

    public C16117l(C9987l c9987l, int i, InterfaceC9427l interfaceC9427l, Object obj) {
        this.f31573l = c9987l;
        this.f31572l = i;
        this.f31571l = interfaceC9427l;
        this.f31574l = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC9427l
    public final Object isPro(Object obj, InterfaceC14029l interfaceC14029l) {
        C9878l c9878l;
        if (interfaceC14029l instanceof C9878l) {
            c9878l = (C9878l) interfaceC14029l;
            int i = c9878l.f20102l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c9878l.f20102l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c9878l = new C9878l(this, interfaceC14029l);
            }
        } else {
            c9878l = new C9878l(this, interfaceC14029l);
        }
        Object obj2 = c9878l.f20101l;
        int i2 = c9878l.f20102l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj2);
            C9987l c9987l = this.f31573l;
            int i3 = c9987l.f20387l + 1;
            c9987l.f20387l = i3;
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            int i4 = this.f31572l;
            InterfaceC9427l interfaceC9427l = this.f31571l;
            if (i3 >= i4) {
                c9878l.f20102l = 2;
                AbstractC7709l.yandex(interfaceC9427l, obj, this.f31574l, c9878l);
                return enumC9342l;
            }
            c9878l.f20102l = 1;
            if (interfaceC9427l.isPro(obj, c9878l) == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    AbstractC2829l.crashlytics(obj2);
                    return Unit.INSTANCE;
                }
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj2);
        }
        return Unit.INSTANCE;
    }
}
