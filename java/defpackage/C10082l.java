package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَؖؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10082l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C14691l f20557l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20558l;

    public /* synthetic */ C10082l(C14691l c14691l, int i) {
        this.f20558l = i;
        this.f20557l = c14691l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f20558l;
        C14691l c14691l = this.f20557l;
        C14416l c14416l = (C14416l) obj;
        switch (i) {
            case 0:
                c14416l.yandex(C0194l.loadAd, "type");
                c14416l.yandex(AbstractC16814l.amazon("kotlinx.serialization.Sealed<" + c14691l.yandex.license() + '>', C10155l.amazon, new InterfaceC18035l[0], new C10082l(c14691l, 1)), "value");
                c14416l.loadAd = c14691l.loadAd;
                break;
            default:
                for (Map.Entry entry : c14691l.purchase.entrySet()) {
                    c14416l.yandex(((InterfaceC16588l) entry.getValue()).purchase(), (String) entry.getKey());
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
