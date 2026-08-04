package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lٌؔؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2488l implements InterfaceC9760l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC7042l f5289l;

    public /* synthetic */ C2488l(InterfaceC7042l interfaceC7042l) {
        this.f5289l = interfaceC7042l;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2488l) {
            return this.f5289l.equals(((C2488l) obj).f5289l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5289l.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.f5289l + ")";
    }

    @Override // defpackage.InterfaceC9760l
    public final Object yandex(C9039l c9039l) {
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC9760l
    public final /* synthetic */ void crashlytics() {
    }

    @Override // defpackage.InterfaceC9760l
    public final /* synthetic */ void loadAd() {
    }

    @Override // defpackage.InterfaceC9760l
    public final /* synthetic */ void start() {
    }
}
