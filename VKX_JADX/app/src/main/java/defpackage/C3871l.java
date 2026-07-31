package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؖؓٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3871l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C4456l f8005l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8006l;

    public /* synthetic */ C3871l(C4456l c4456l, int i) {
        this.f8006l = i;
        this.f8005l = c4456l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f8006l;
        EnumC16462l enumC16462l = EnumC16462l.f32182l;
        C4456l c4456l = this.f8005l;
        switch (i) {
            case 0:
                c4456l.f9075l.metrica(c4456l);
                break;
            case 1:
                c4456l.f9075l.remoteconfig(c4456l.f5081l);
                break;
            case 2:
                c4456l.f9075l.getClass();
                break;
            case 3:
                c4456l.m1548package();
                break;
            case 4:
                C10086l c10086l = c4456l.f9074l;
                c10086l.setValue(Boolean.valueOf(!((Boolean) c10086l.getValue()).booleanValue()));
                break;
            case 5:
                c4456l.m1549synchronized(enumC16462l);
                break;
            default:
                c4456l.m1549synchronized(enumC16462l);
                break;
        }
        return Unit.INSTANCE;
    }
}
