package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lؓؓٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1569l extends AbstractC5563l implements Function4 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ String f3888l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f3889l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ C6806l f3890l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1569l(String str, InterfaceC14029l interfaceC14029l, int i) {
        super(4, interfaceC14029l);
        this.f3889l = i;
        this.f3888l = str;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f3889l;
        String str = this.f3888l;
        C6806l c6806l = this.f3890l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                if (!((Map) c6806l.crashlytics.f833l).containsKey("Accept-Encoding")) {
                    InterfaceC6272l interfaceC6272l = AbstractC4689l.yandex;
                    if (interfaceC6272l.admob()) {
                        StringBuilder sbIsVip = AbstractC5020l.isVip("Adding Accept-Encoding=", str, " for ");
                        sbIsVip.append(c6806l.yandex);
                        interfaceC6272l.vip(sbIsVip.toString());
                    }
                    c6806l.crashlytics.m223l("Accept-Encoding", str);
                }
                break;
            default:
                AbstractC2829l.crashlytics(obj);
                if (!((Map) c6806l.crashlytics.f833l).containsKey("User-Agent")) {
                    AbstractC11201l.yandex.vip("Adding User-Agent header: agent for " + c6806l.yandex);
                    c6806l.crashlytics.mo214l("User-Agent", str.toString());
                }
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f3889l;
        String str = this.f3888l;
        C6806l c6806l = (C6806l) obj2;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj4;
        switch (i) {
            case 0:
                C1569l c1569l = new C1569l(str, interfaceC14029l, 0);
                c1569l.f3890l = c6806l;
                return c1569l.Signature(Unit.INSTANCE);
            default:
                C1569l c1569l2 = new C1569l(str, interfaceC14029l, 1);
                c1569l2.f3890l = c6806l;
                return c1569l2.Signature(Unit.INSTANCE);
        }
    }
}
