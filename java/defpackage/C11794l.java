package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِّٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11794l implements InterfaceC1925l, InterfaceC2224l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f23606l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final LinkedHashSet f23607l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public AbstractC18041l f23608l;

    public C11794l(AbstractCollection abstractCollection) {
        abstractCollection.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(abstractCollection);
        this.f23607l = linkedHashSet;
        this.f23606l = linkedHashSet.hashCode();
    }

    public final String crashlytics(Function1 function1) {
        int i = 1;
        return AbstractC16901l.m4210case(AbstractC16901l.m4243this(this.f23607l, new C0323l(i, function1)), " & ", "{", "}", new C13832l(i, function1), 24);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11794l)) {
            return false;
        }
        return AbstractC8576l.yandex(this.f23607l, ((C11794l) obj).f23607l);
    }

    @Override // defpackage.InterfaceC1925l
    public final List getParameters() {
        return C2580l.f5619l;
    }

    public final int hashCode() {
        return this.f23606l;
    }

    public final AbstractC15211l loadAd() {
        C16017l.f31395l.getClass();
        return AbstractC3605l.tapsense(C16017l.f31394l, this, C2580l.f5619l, false, AbstractC7303l.loadAd("member scope for intersection type", this.f23607l), new C6238l(17, this));
    }

    @Override // defpackage.InterfaceC1925l
    public final boolean premium() {
        return false;
    }

    @Override // defpackage.InterfaceC1925l
    public final InterfaceC15234l pro() {
        return null;
    }

    @Override // defpackage.InterfaceC1925l
    public final AbstractC16860l subs() {
        return ((AbstractC18041l) this.f23607l.iterator().next()).mo1339native().subs();
    }

    public final String toString() {
        return crashlytics(C2100l.f4697l);
    }

    @Override // defpackage.InterfaceC1925l
    public final Collection yandex() {
        return this.f23607l;
    }
}
