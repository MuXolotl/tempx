package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lًٌۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8245l implements InterfaceC12750l {
    public final long yandex;

    public C8245l(long j) {
        this.yandex = j;
        if (j != 16) {
            return;
        }
        AbstractC1786l.yandex("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
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
        return (obj instanceof C8245l) && C9735l.crashlytics(this.yandex, ((C8245l) obj).yandex);
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        return C10882l.yandex(this.yandex);
    }

    @Override // defpackage.InterfaceC12750l
    public final long loadAd() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC12750l
    public final AbstractC9544l purchase() {
        return null;
    }

    public final String toString() {
        return AbstractC15560l.Signature("ColorStyle(value=", C9735l.subs(this.yandex), ")");
    }

    @Override // defpackage.InterfaceC12750l
    public final float yandex() {
        return C9735l.amazon(this.yandex);
    }
}
