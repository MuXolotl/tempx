package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚؑۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0641l implements InterfaceC15829l {
    public final InterfaceC15829l yandex;

    public C0641l(InterfaceC15829l interfaceC15829l) {
        this.yandex = interfaceC15829l;
    }

    @Override // defpackage.InterfaceC15829l
    public final Object loadAd(Function2 function2, InterfaceC14029l interfaceC14029l) {
        return this.yandex.loadAd(new C7178l(function2, null, 2), interfaceC14029l);
    }

    @Override // defpackage.InterfaceC15829l
    public final InterfaceC6942l yandex() {
        return this.yandex.yandex();
    }
}
