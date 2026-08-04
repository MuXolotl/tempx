package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* JADX INFO: renamed from: lٕؖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15458l implements PointerInputEventHandler {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f30226l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f30227l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30228l;

    public /* synthetic */ C15458l(Object obj, Object obj2, int i) {
        this.f30228l = i;
        this.f30227l = obj;
        this.f30226l = obj2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC6843l interfaceC6843l, InterfaceC14029l interfaceC14029l) {
        int i = this.f30228l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        Object obj = this.f30226l;
        Object obj2 = this.f30227l;
        switch (i) {
            case 0:
                Object objAdmob = AbstractC11990l.admob(new C13979l(interfaceC6843l, (InterfaceC2077l) obj2, (C16173l) obj, null, 2), interfaceC14029l);
                return objAdmob == enumC9342l ? objAdmob : Unit.INSTANCE;
            default:
                Object objCrashlytics = AbstractC11141l.crashlytics(interfaceC6843l, new amazon((C0205l) obj2, (C1120l) obj, null, 4), interfaceC14029l);
                return objCrashlytics == enumC9342l ? objCrashlytics : Unit.INSTANCE;
        }
    }
}
