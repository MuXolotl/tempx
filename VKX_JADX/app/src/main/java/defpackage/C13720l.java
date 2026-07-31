package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* JADX INFO: renamed from: lْ۠ۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13720l implements PointerInputEventHandler {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C2403l f26770l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f26771l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2262l f26772l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f26773l;

    public C13720l(InterfaceC2262l interfaceC2262l, InterfaceC8714l interfaceC8714l, C2403l c2403l, InterfaceC8714l interfaceC8714l2) {
        this.f26772l = interfaceC2262l;
        this.f26771l = interfaceC8714l;
        this.f26770l = c2403l;
        this.f26773l = interfaceC8714l2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC6843l interfaceC6843l, InterfaceC14029l interfaceC14029l) {
        C1595l c1595l = new C1595l(this.f26772l, this.f26771l, this.f26770l, null);
        C17660l c17660l = new C17660l(this.f26773l, 3);
        C12349l c12349l = AbstractC18112l.yandex;
        Object objAdmob = AbstractC11990l.admob(new C0469l(interfaceC6843l, c1595l, c17660l, new C1304l(interfaceC6843l), (InterfaceC14029l) null), interfaceC14029l);
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (objAdmob != enumC9342l) {
            objAdmob = Unit.INSTANCE;
        }
        return objAdmob == enumC9342l ? objAdmob : Unit.INSTANCE;
    }
}
