package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* JADX INFO: renamed from: lَّٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12514l implements PointerInputEventHandler {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C12217l f24653l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24654l;

    public /* synthetic */ C12514l(C12217l c12217l, int i) {
        this.f24654l = i;
        this.f24653l = c12217l;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC6843l interfaceC6843l, InterfaceC14029l interfaceC14029l) {
        int i = this.f24654l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C12217l c12217l = this.f24653l;
        switch (i) {
            case 0:
                Object objAdmob = AbstractC11990l.admob(new C8568l(c12217l, interfaceC6843l, null, 12), interfaceC14029l);
                if (objAdmob != enumC9342l) {
                    objAdmob = Unit.INSTANCE;
                }
                return objAdmob == enumC9342l ? objAdmob : Unit.INSTANCE;
            case 1:
                Object objAdmob2 = AbstractC11990l.admob(new C0519l(c12217l, interfaceC6843l, true, null), interfaceC14029l);
                if (objAdmob2 != enumC9342l) {
                    objAdmob2 = Unit.INSTANCE;
                }
                return objAdmob2 == enumC9342l ? objAdmob2 : Unit.INSTANCE;
            default:
                Object objAdmob3 = AbstractC11990l.admob(new C0519l(c12217l, interfaceC6843l, false, null), interfaceC14029l);
                if (objAdmob3 != enumC9342l) {
                    objAdmob3 = Unit.INSTANCE;
                }
                return objAdmob3 == enumC9342l ? objAdmob3 : Unit.INSTANCE;
        }
    }
}
