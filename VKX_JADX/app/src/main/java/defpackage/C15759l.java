package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٕٙؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15759l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C5374l f30931l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30932l;

    public /* synthetic */ C15759l(C5374l c5374l, int i) {
        this.f30932l = i;
        this.f30931l = c5374l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f30932l;
        C5374l c5374l = this.f30931l;
        switch (i) {
            case 0:
                InterfaceC14029l interfaceC14029l = null;
                C4978l c4978l = new C4978l(c5374l, interfaceC14029l, 3);
                C15352l c15352l = new C15352l(c5374l, interfaceC14029l, 8);
                C15759l c15759l = new C15759l(c5374l, 2);
                Unit unit = Unit.INSTANCE;
                ((C13791l) obj).yandex.add(new C5808l(c15352l, c4978l, c15759l));
                return Unit.INSTANCE;
            case 1:
                C13056l c13056l = ((C16522l) obj).loadAd;
                String str = c5374l.admob;
                if (AbstractC12024l.appmetrica(str, "/", false) || AbstractC12024l.appmetrica(str, "?", false) || AbstractC12024l.appmetrica(str, "#", false)) {
                    AbstractC3552l.yandex.remoteconfig("DefaultRequest.host was set to '" + str + "', which is not a valid host. Host must not contain scheme, path, query or fragment. Use `url(...)` or `url{ ... }` instead.");
                }
                c13056l.yandex = str;
                c13056l.amazon = C17289l.f33554l;
                return Unit.INSTANCE;
            default:
                return Boolean.valueOf(AbstractC8576l.yandex(((C6806l) obj).yandex.yandex, c5374l.admob));
        }
    }
}
