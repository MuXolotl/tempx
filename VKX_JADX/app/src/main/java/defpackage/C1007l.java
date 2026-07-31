package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* JADX INFO: renamed from: lُّؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1007l implements PointerInputEventHandler {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C15178l f2751l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2752l;

    public /* synthetic */ C1007l(C15178l c15178l, int i) {
        this.f2752l = i;
        this.f2751l = c15178l;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC6843l interfaceC6843l, InterfaceC14029l interfaceC14029l) {
        int i = this.f2752l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C15178l c15178l = this.f2751l;
        switch (i) {
            case 0:
                Object objAdmob = AbstractC11990l.admob(new C11238l(interfaceC6843l, c15178l, null, 0), interfaceC14029l);
                return objAdmob == enumC9342l ? objAdmob : Unit.INSTANCE;
            default:
                Object objAdmob2 = AbstractC11990l.admob(new C11238l(interfaceC6843l, c15178l, null, 1), interfaceC14029l);
                return objAdmob2 == enumC9342l ? objAdmob2 : Unit.INSTANCE;
        }
    }
}
