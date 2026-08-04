package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lِّؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11786l implements Iterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f23595l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f23596l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f23597l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f23598l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f23599l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11786l(C11154l c11154l, int i) {
        this(c11154l.f11161l);
        this.f23599l = i;
        switch (i) {
            case 1:
                this.f23598l = c11154l;
                this(c11154l.f11161l);
                break;
            default:
                this.f23598l = c11154l;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23596l < this.f23597l;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objBilling;
        if (!hasNext()) {
            C4875l.firebase();
            return null;
        }
        int i = this.f23596l;
        int i2 = this.f23599l;
        Object obj = this.f23598l;
        switch (i2) {
            case 0:
                objBilling = ((C11154l) obj).billing(i);
                break;
            case 1:
                objBilling = ((C11154l) obj).subs(i);
                break;
            default:
                objBilling = ((C10834l) obj).f21898l[i];
                break;
        }
        this.f23596l++;
        this.f23595l = true;
        return objBilling;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f23595l) {
            C8339l.smaato("Call next() before removing an element.");
            return;
        }
        int i = this.f23596l - 1;
        this.f23596l = i;
        int i2 = this.f23599l;
        Object obj = this.f23598l;
        switch (i2) {
            case 0:
                ((C11154l) obj).mopub(i);
                break;
            case 1:
                ((C11154l) obj).mopub(i);
                break;
            default:
                ((C10834l) obj).amazon(i);
                break;
        }
        this.f23597l--;
        this.f23595l = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11786l(C10834l c10834l) {
        this(c10834l.f21897l);
        this.f23599l = 2;
        this.f23598l = c10834l;
    }

    public C11786l(int i) {
        this.f23597l = i;
    }
}
