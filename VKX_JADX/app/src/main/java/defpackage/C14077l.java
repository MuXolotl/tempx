package defpackage;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lُْٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14077l extends AbstractC5563l implements Function4 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ C4043l f27432l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f27433l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f27434l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f27435l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14077l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(4, interfaceC14029l);
        this.f27434l = i;
        this.f27433l = obj;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f27434l;
        Object obj2 = this.f27433l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f27435l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C4043l c4043l = this.f27432l;
                    this.f27435l = 1;
                    c4043l.getClass();
                    Object objBilling = c4043l.billing(new C12076l((Bundle) obj2), this);
                    if (objBilling != enumC9342l) {
                        objBilling = Unit.INSTANCE;
                    }
                    if (objBilling == enumC9342l) {
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
                int i3 = this.f27435l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C4043l c4043l2 = this.f27432l;
                    this.f27435l = 1;
                    c4043l2.getClass();
                    Object objBilling2 = c4043l2.billing(new C10105l((String) obj2), this);
                    if (objBilling2 != enumC9342l) {
                        objBilling2 = Unit.INSTANCE;
                    }
                    if (objBilling2 == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f27434l;
        C4043l c4043l = (C4043l) obj2;
        ((Boolean) obj3).getClass();
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj4;
        switch (i) {
            case 0:
                C14077l c14077l = new C14077l((Bundle) this.f27433l, interfaceC14029l, 0);
                c14077l.f27432l = c4043l;
                return c14077l.Signature(Unit.INSTANCE);
            default:
                C14077l c14077l2 = new C14077l((String) this.f27433l, interfaceC14029l, 1);
                c14077l2.f27432l = c4043l;
                return c14077l2.Signature(Unit.INSTANCE);
        }
    }
}
