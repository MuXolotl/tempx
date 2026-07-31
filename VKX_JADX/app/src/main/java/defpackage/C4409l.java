package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٖؖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4409l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C12014l f8942l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8943l;

    public /* synthetic */ C4409l(C12014l c12014l, int i) {
        this.f8943l = i;
        this.f8942l = c12014l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f8943l;
        C12014l c12014l = this.f8942l;
        switch (i) {
            case 0:
                return new C12406l((InterfaceC11865l) c12014l.f23940l, (C2312l) obj, 0);
            default:
                C14459l c14459l = (C14459l) obj;
                C3624l c3624l = c14459l.yandex;
                List list = c14459l.loadAd;
                if (c3624l.crashlytics) {
                    C1759l.adcel(c3624l, "Unresolved local class: ");
                    return null;
                }
                C3624l c3624lPurchase = c3624l.purchase();
                InterfaceC4920l interfaceC4920lTapsense = c3624lPurchase != null ? c12014l.tapsense(c3624lPurchase, AbstractC16901l.m4233package(1, list)) : (InterfaceC4920l) ((C0098l) c12014l.f23944l).invoke(c3624l.yandex);
                boolean zMopub = c3624l.mopub();
                C16412l c16412l = (C16412l) c12014l.f23941l;
                C3498l c3498lBilling = c3624l.billing();
                Integer num = (Integer) AbstractC16901l.m4217extends(list);
                return new C8153l(c16412l, interfaceC4920lTapsense, c3498lBilling, zMopub, num != null ? num.intValue() : 0);
        }
    }
}
