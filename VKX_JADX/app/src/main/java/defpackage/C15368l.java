package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٕؑؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15368l implements InterfaceC12750l {
    public static final C15368l yandex = new C15368l();

    @Override // defpackage.InterfaceC12750l
    public final /* synthetic */ InterfaceC12750l amazon(InterfaceC12750l interfaceC12750l) {
        return AbstractC12589l.tapsense(this, interfaceC12750l);
    }

    @Override // defpackage.InterfaceC12750l
    public final InterfaceC12750l crashlytics(Function0 function0) {
        return this != yandex ? this : (InterfaceC12750l) function0.invoke();
    }

    @Override // defpackage.InterfaceC12750l
    public final long loadAd() {
        int i = C9735l.smaato;
        return C9735l.firebase;
    }

    @Override // defpackage.InterfaceC12750l
    public final AbstractC9544l purchase() {
        return null;
    }

    @Override // defpackage.InterfaceC12750l
    public final float yandex() {
        return Float.NaN;
    }
}
