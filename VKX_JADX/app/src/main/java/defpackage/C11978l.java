package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًِٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11978l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC11383l f23869l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23870l;

    public /* synthetic */ C11978l(AbstractC11383l abstractC11383l, int i) {
        this.f23870l = i;
        this.f23869l = abstractC11383l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f23870l;
        AbstractC11383l abstractC11383l = this.f23869l;
        switch (i) {
            case 0:
                C10086l c10086l = abstractC11383l.f22963l;
                C1336l c1336l = (C1336l) obj;
                AbstractC1757l.m1032else(c1336l, new C15578l(-828933298, true, new C4508l(6, abstractC11383l)), 3);
                if (((Boolean) abstractC11383l.f22961l.getValue()).booleanValue()) {
                    AbstractC1757l.appmetrica(c1336l, null, null, AbstractC16357l.loadAd, 3);
                }
                int i2 = 0;
                byte b = 0;
                if (!((InterfaceC13238l) c10086l.getValue()).isEmpty()) {
                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(6023956, true, new C9672l(abstractC11383l, i2)), 3);
                }
                InterfaceC13238l interfaceC13238l = (InterfaceC13238l) c10086l.getValue();
                c1336l.firebase(((AbstractC7095l) interfaceC13238l).pro(), null, new C5640l(interfaceC13238l, 4, b == true ? 1 : 0), new C15578l(802480018, true, new C6780l(interfaceC13238l, abstractC11383l, 11)));
                break;
            default:
                abstractC11383l.f22965l.setValue((String) obj);
                break;
        }
        return Unit.INSTANCE;
    }
}
