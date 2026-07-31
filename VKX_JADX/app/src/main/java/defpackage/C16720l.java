package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٖۢۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16720l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C13695l f32732l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f32733l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f32734l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16720l(C13695l c13695l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f32733l = i;
        this.f32732l = c13695l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f32733l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C13695l c13695l = this.f32732l;
        switch (i) {
            case 0:
                int i2 = this.f32734l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f32734l = 1;
                    if (C13695l.m3662import(c13695l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                int i3 = this.f32734l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    c13695l.f26739l.setValue(Boolean.TRUE);
                    C7093l c7093l = new C7093l(c13695l.m3663abstract());
                    this.f32734l = 1;
                    if (c7093l.ads(this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                c13695l.mo1143default();
                c13695l.f26739l.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f32733l;
        C13695l c13695l = this.f32732l;
        switch (i) {
            case 0:
                return new C16720l(c13695l, interfaceC14029l, 0);
            default:
                return new C16720l(c13695l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f32733l) {
            case 0:
                break;
        }
        return ((C16720l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
