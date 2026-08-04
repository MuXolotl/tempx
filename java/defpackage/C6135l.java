package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘۨؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6135l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C9426l f12917l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1142l f12918l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12919l = 0;

    public /* synthetic */ C6135l(InterfaceC1142l interfaceC1142l, C9426l c9426l) {
        this.f12918l = interfaceC1142l;
        this.f12917l = c9426l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f12919l;
        C9426l c9426l = this.f12917l;
        InterfaceC1142l interfaceC1142l = this.f12918l;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                if (th == null) {
                    c9426l.m3885new(interfaceC1142l.isVip());
                } else if (th instanceof CancellationException) {
                    c9426l.ad((CancellationException) th);
                } else {
                    c9426l.m2649l(th);
                }
                break;
            default:
                if (th == null) {
                    c9426l.m3885new(Unit.INSTANCE);
                } else if (th instanceof CancellationException) {
                    c9426l.ad((CancellationException) th);
                } else {
                    c9426l.m2649l(th);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C6135l(InterfaceC1142l interfaceC1142l, C9426l c9426l, C5562l c5562l) {
        this.f12918l = interfaceC1142l;
        this.f12917l = c9426l;
    }
}
