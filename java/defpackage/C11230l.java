package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُٟۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Llُٟۜ;", "T", "Llَّؓ;", "Llًٌۧ;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C11230l<T> extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final EnumC7283l f22601l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Function2 f22602l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C15389l f22603l;

    public C11230l(C15389l c15389l, Function2 function2, EnumC7283l enumC7283l) {
        this.f22603l = c15389l;
        this.f22602l = function2;
        this.f22601l = enumC7283l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C8427l c8427l = (C8427l) abstractC14971l;
        C15389l c15389l = c8427l.f17437l;
        C15389l c15389l2 = this.f22603l;
        boolean zYandex = AbstractC8576l.yandex(c15389l, c15389l2);
        c8427l.f17437l = c15389l2;
        c8427l.f17435l = this.f22602l;
        c8427l.f17436l = this.f22601l;
        if (zYandex) {
            return;
        }
        c8427l.f17438l = false;
        AbstractC4047l.isPro(c8427l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11230l)) {
            return false;
        }
        C11230l c11230l = (C11230l) obj;
        return AbstractC8576l.yandex(this.f22603l, c11230l.f22603l) && this.f22602l == c11230l.f22602l && this.f22601l == c11230l.f22601l;
    }

    public final int hashCode() {
        return this.f22601l.hashCode() + ((this.f22602l.hashCode() + (this.f22603l.hashCode() * 31)) * 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C8427l c8427l = new C8427l();
        c8427l.f17437l = this.f22603l;
        c8427l.f17435l = this.f22602l;
        c8427l.f17436l = this.f22601l;
        return c8427l;
    }
}
