package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًؖۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7795l implements PointerInputEventHandler {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f16321l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16322l;

    public /* synthetic */ C7795l(int i, Object obj) {
        this.f16322l = i;
        this.f16321l = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC6843l interfaceC6843l, InterfaceC14029l interfaceC14029l) {
        int i = this.f16322l;
        int i2 = 3;
        InterfaceC14029l interfaceC14029l2 = null;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        Object obj = this.f16321l;
        switch (i) {
            case 0:
                Object objCrashlytics = AbstractC11141l.crashlytics(interfaceC6843l, new C2057l((C10306l) obj, interfaceC14029l2, 0), interfaceC14029l);
                return objCrashlytics == enumC9342l ? objCrashlytics : Unit.INSTANCE;
            case 1:
                Object objAdmob = AbstractC11990l.admob(new C15559l(interfaceC6843l, (AbstractC13264l) obj, interfaceC14029l2, 6), interfaceC14029l);
                return objAdmob == enumC9342l ? objAdmob : Unit.INSTANCE;
            case 2:
                C11625l c11625l = (C11625l) obj;
                Object objPurchase = AbstractC18112l.purchase(interfaceC6843l, new C14589l(c11625l, null), new C14120l(c11625l, 1), interfaceC14029l, 3);
                return objPurchase == enumC9342l ? objPurchase : Unit.INSTANCE;
            case 3:
                Object objPurchase2 = AbstractC18112l.purchase(interfaceC6843l, null, new C6199l(12, (Function0) obj), interfaceC14029l, 7);
                return objPurchase2 == enumC9342l ? objPurchase2 : Unit.INSTANCE;
            case 4:
                Object objM1556l = ((C4566l) interfaceC6843l).m1556l(new C12607l(i2, interfaceC14029l2, (Function1) obj), interfaceC14029l);
                return objM1556l == enumC9342l ? objM1556l : Unit.INSTANCE;
            case 5:
                C5787l c5787l = (C5787l) obj;
                Object objCrashlytics2 = AbstractC15344l.crashlytics(interfaceC6843l, c5787l.f12196l, c5787l.f12197l, interfaceC14029l);
                return objCrashlytics2 == enumC9342l ? objCrashlytics2 : Unit.INSTANCE;
            case 6:
                Object objCrashlytics3 = AbstractC11141l.crashlytics(interfaceC6843l, new C3977l((C8453l) obj, interfaceC14029l2, 4), interfaceC14029l);
                return objCrashlytics3 == enumC9342l ? objCrashlytics3 : Unit.INSTANCE;
            case 7:
                Object objCrashlytics4 = AbstractC11141l.crashlytics(interfaceC6843l, new C12607l(2, interfaceC14029l2, new C3151l(1, (C7292l) obj, C7292l.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 0, 10)), interfaceC14029l);
                if (objCrashlytics4 != enumC9342l) {
                    objCrashlytics4 = Unit.INSTANCE;
                }
                return objCrashlytics4 == enumC9342l ? objCrashlytics4 : Unit.INSTANCE;
            case 8:
                Object objAdmob2 = AbstractC11990l.admob(new C8568l((C4240l) obj, interfaceC6843l, interfaceC14029l2, 11), interfaceC14029l);
                return objAdmob2 == enumC9342l ? objAdmob2 : Unit.INSTANCE;
            default:
                C16173l c16173l = (C16173l) obj;
                Object objCrashlytics5 = AbstractC15344l.crashlytics(interfaceC6843l, c16173l.isVip, c16173l.advert, interfaceC14029l);
                return objCrashlytics5 == enumC9342l ? objCrashlytics5 : Unit.INSTANCE;
        }
    }
}
