package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَۛۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10574l implements InterfaceC6752l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public InterfaceC13914l f21485l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Function1 f21486l;

    public C10574l(Function1 function1) {
        this.f21486l = function1;
    }

    @Override // defpackage.InterfaceC6752l
    public final void crashlytics() {
        this.f21485l = (InterfaceC13914l) this.f21486l.invoke(AbstractC12311l.yandex);
    }

    @Override // defpackage.InterfaceC6752l
    public final void loadAd() {
        InterfaceC13914l interfaceC13914l = this.f21485l;
        if (interfaceC13914l != null) {
            interfaceC13914l.yandex();
        }
        this.f21485l = null;
    }

    @Override // defpackage.InterfaceC6752l
    public final void yandex() {
    }
}
