package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؓۛٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2116l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f4746l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4747l;

    public /* synthetic */ C2116l(InterfaceC12244l interfaceC12244l, int i) {
        this.f4747l = i;
        this.f4746l = interfaceC12244l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f4747l;
        InterfaceC12244l interfaceC12244l = this.f4746l;
        switch (i) {
            case 0:
                return new C5177l(((long) ((InterfaceC13490l) obj).mo870l(((C14467l) interfaceC12244l.getValue()).f28331l)) & 4294967295L);
            case 1:
                return new C5177l(((long) ((InterfaceC13490l) obj).mo870l(((C14467l) interfaceC12244l.getValue()).f28331l)) & 4294967295L);
            case 2:
                InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj;
                long j = ((C9735l) interfaceC12244l.getValue()).yandex;
                if (!C9735l.crashlytics(j, C9735l.firebase)) {
                    AbstractC9361l.metrica(interfaceC13349l, j, 0L, 0L, 0.0f, null, null, 0, 126);
                }
                return Unit.INSTANCE;
            case 3:
                return new C5177l(((long) ((InterfaceC13490l) obj).mo870l(((C14467l) interfaceC12244l.getValue()).f28331l)) & 4294967295L);
            case 4:
                ((C6148l) obj).crashlytics(((Number) interfaceC12244l.getValue()).floatValue());
                return Unit.INSTANCE;
            case 5:
                return new C5177l(((long) ((InterfaceC13490l) obj).mo870l(((C14467l) interfaceC12244l.getValue()).f28331l)) & 4294967295L);
            case 6:
                ((C6148l) obj).crashlytics(((Number) interfaceC12244l.getValue()).floatValue());
                return Unit.INSTANCE;
            case 7:
                AbstractC9361l.metrica((InterfaceC13349l) obj, ((C9735l) interfaceC12244l.getValue()).yandex, 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.INSTANCE;
            default:
                AbstractC9361l.metrica((InterfaceC13349l) obj, ((C9735l) interfaceC12244l.getValue()).yandex, 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.INSTANCE;
        }
    }
}
