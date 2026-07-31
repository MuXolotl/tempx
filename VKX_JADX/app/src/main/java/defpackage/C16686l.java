package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٖ۠ۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16686l implements InterfaceC12750l {
    public final float loadAd;
    public final AbstractC17404l yandex;

    public C16686l(AbstractC17404l abstractC17404l, float f) {
        this.yandex = abstractC17404l;
        this.loadAd = f;
    }

    @Override // defpackage.InterfaceC12750l
    public final /* synthetic */ InterfaceC12750l amazon(InterfaceC12750l interfaceC12750l) {
        return AbstractC12589l.tapsense(this, interfaceC12750l);
    }

    @Override // defpackage.InterfaceC12750l
    public final InterfaceC12750l crashlytics(Function0 function0) {
        return !equals(C15368l.yandex) ? this : (InterfaceC12750l) function0.invoke();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16686l)) {
            return false;
        }
        C16686l c16686l = (C16686l) obj;
        return AbstractC8576l.yandex(this.yandex, c16686l.yandex) && Float.compare(this.loadAd, c16686l.loadAd) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.loadAd) + (this.yandex.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC12750l
    public final long loadAd() {
        int i = C9735l.smaato;
        return C9735l.firebase;
    }

    @Override // defpackage.InterfaceC12750l
    public final AbstractC9544l purchase() {
        return this.yandex;
    }

    public final String toString() {
        return "BrushStyle(value=" + this.yandex + ", alpha=" + this.loadAd + ")";
    }

    @Override // defpackage.InterfaceC12750l
    public final float yandex() {
        return this.loadAd;
    }
}
