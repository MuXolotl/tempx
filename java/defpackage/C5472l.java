package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؘؗۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5472l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f11717l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f11718l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5472l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f11717l = i;
        this.f11718l = obj;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f11717l;
        Object obj2 = this.f11718l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                C14451l c14451l = (C14451l) obj2;
                C16076l c16076l = VKXApplication.f36632l;
                if (c16076l == null) {
                    c16076l = null;
                }
                C10507l c10507lCrashlytics = c16076l.crashlytics();
                c14451l.f28308l = c10507lCrashlytics != null ? c10507lCrashlytics.loadAd : null;
                break;
            case 1:
                AbstractC2829l.crashlytics(obj);
                ((C7424l) obj2).invoke();
                break;
            default:
                AbstractC2829l.crashlytics(obj);
                ((Ctry) ((C13904l) obj2).f27205l).invoke();
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f11717l;
        Object obj2 = this.f11718l;
        switch (i) {
            case 0:
                return new C5472l((C14451l) obj2, interfaceC14029l, 0);
            case 1:
                return new C5472l((C7424l) obj2, interfaceC14029l, 1);
            default:
                return new C5472l((C13904l) obj2, interfaceC14029l, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f11717l) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C5472l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
