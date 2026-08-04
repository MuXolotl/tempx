package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍؒۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٍؒۗ;", "Llَّؓ;", "Llَِؕ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C9274l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Function1 f19072l;

    public C9274l(Function1 function1) {
        this.f19072l = function1;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C3306l c3306l = (C3306l) abstractC14971l;
        Function1 function1 = c3306l.f7045l;
        Function1 function2 = this.f19072l;
        if (function1 != function2) {
            c3306l.f7045l = function2;
            C12923l c12923l = c3306l.f7044l;
            if (c12923l != null) {
                InterfaceC10137l interfaceC10137l = (InterfaceC10137l) function2.invoke(c12923l);
                if (AbstractC8576l.yandex(interfaceC10137l, c3306l.f23568l)) {
                    return;
                }
                c3306l.f23568l = interfaceC10137l;
                c3306l.mo2588l();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9274l) {
            return this.f19072l == ((C9274l) obj).f19072l;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19072l.hashCode();
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C3306l c3306l = new C3306l(AbstractC14760l.smaato);
        c3306l.f7045l = this.f19072l;
        return c3306l;
    }
}
