package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًٌٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Llًٌٞ;", "T", "Llَّؓ;", "Llِٜۧ;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class C8650l<T> extends AbstractC12338l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Function2 f17823l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C15389l f17824l;

    public C8650l(C15389l c15389l, Function2 function2) {
        this.f17824l = c15389l;
        this.f17823l = function2;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C12263l c12263l = (C12263l) abstractC14971l;
        c12263l.f24324l = this.f17824l;
        c12263l.f24322l = this.f17823l;
        c12263l.f24323l = EnumC7283l.f15125l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8650l)) {
            return false;
        }
        C8650l c8650l = (C8650l) obj;
        return AbstractC8576l.yandex(this.f17824l, c8650l.f17824l) && this.f17823l == c8650l.f17823l;
    }

    public final int hashCode() {
        return EnumC7283l.f15125l.hashCode() + ((this.f17823l.hashCode() + (this.f17824l.hashCode() * 31)) * 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C12263l c12263l = new C12263l();
        c12263l.f24324l = this.f17824l;
        c12263l.f24322l = this.f17823l;
        c12263l.f24323l = EnumC7283l.f15125l;
        return c12263l;
    }
}
