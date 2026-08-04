package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٕؗؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4570l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f9270l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f9271l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9272l;

    public /* synthetic */ C4570l(InterfaceC12244l interfaceC12244l, InterfaceC12244l interfaceC12244l2, int i) {
        this.f9272l = i;
        this.f9271l = interfaceC12244l;
        this.f9270l = interfaceC12244l2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f9272l;
        InterfaceC12244l interfaceC12244l = this.f9270l;
        InterfaceC12244l interfaceC12244l2 = this.f9271l;
        switch (i) {
            case 0:
                C6148l c6148l = (C6148l) obj;
                c6148l.Signature(c6148l.f12941l.loadAd() * ((C14467l) interfaceC12244l2.getValue()).f28331l);
                c6148l.crashlytics(((Number) interfaceC12244l.getValue()).floatValue());
                break;
            case 1:
                InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj;
                float fMo868instanceof = interfaceC13349l.mo868instanceof(2.0f);
                float f = fMo868instanceof / 2.0f;
                AbstractC9361l.admob(interfaceC13349l, ((C9735l) interfaceC12244l2.getValue()).yandex, interfaceC13349l.mo868instanceof(10.0f) - f, 0L, new C0404l(fMo868instanceof, 0.0f, 0, 0, null, 30), 108);
                if (C14467l.yandex(((C14467l) interfaceC12244l.getValue()).f28331l, 0.0f) > 0) {
                    AbstractC9361l.admob(interfaceC13349l, ((C9735l) interfaceC12244l2.getValue()).yandex, interfaceC13349l.mo868instanceof(((C14467l) interfaceC12244l.getValue()).f28331l) - f, 0L, C5053l.yandex, 108);
                }
                break;
            default:
                C6148l c6148l2 = (C6148l) obj;
                c6148l2.remoteconfig(((Number) interfaceC12244l2.getValue()).floatValue());
                c6148l2.vip(((Number) interfaceC12244l2.getValue()).floatValue());
                c6148l2.crashlytics(((Number) interfaceC12244l.getValue()).floatValue());
                break;
        }
        return Unit.INSTANCE;
    }
}
