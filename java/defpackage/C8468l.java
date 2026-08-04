package defpackage;

/* JADX INFO: renamed from: lٌؐٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8468l implements InterfaceC16588l {
    public final C14118l loadAd;
    public final InterfaceC16588l yandex;

    public C8468l(InterfaceC16588l interfaceC16588l) {
        this.yandex = interfaceC16588l;
        this.loadAd = new C14118l(interfaceC16588l.purchase());
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        if (obj == null) {
            interfaceC17739l.amazon();
        } else {
            interfaceC17739l.remoteconfig();
            interfaceC17739l.purchase(this.yandex, obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C8468l.class == obj.getClass() && AbstractC8576l.yandex(this.yandex, ((C8468l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        if (interfaceC10726l.pro()) {
            return interfaceC10726l.mopub(this.yandex);
        }
        interfaceC10726l.startapp();
        return null;
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return this.loadAd;
    }
}
