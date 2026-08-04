package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lِۧۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12266l implements InterfaceC13914l {
    public final /* synthetic */ InterfaceC2262l amazon;
    public final /* synthetic */ InterfaceC8714l crashlytics;
    public final /* synthetic */ InterfaceC8714l loadAd;
    public final /* synthetic */ C2403l purchase;
    public final /* synthetic */ Function0 yandex;

    public C12266l(Function0 function0, InterfaceC8714l interfaceC8714l, InterfaceC8714l interfaceC8714l2, InterfaceC2262l interfaceC2262l, C2403l c2403l) {
        this.yandex = function0;
        this.loadAd = interfaceC8714l;
        this.crashlytics = interfaceC8714l2;
        this.amazon = interfaceC2262l;
        this.purchase = c2403l;
    }

    @Override // defpackage.InterfaceC13914l
    public final void yandex() {
        InterfaceC8714l interfaceC8714l = this.loadAd;
        if (((Boolean) interfaceC8714l.getValue()).booleanValue()) {
            C1311l c1311l = (C1311l) this.crashlytics.getValue();
            if (c1311l != null) {
                AbstractC10999l.mopub(this.amazon, null, 0, new C17286l(this.purchase, c1311l, null, 0), 3);
            }
            if (((Boolean) interfaceC8714l.getValue()).booleanValue()) {
                this.yandex.invoke();
            }
            interfaceC8714l.setValue(Boolean.FALSE);
        }
    }
}
