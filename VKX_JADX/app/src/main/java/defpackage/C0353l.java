package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lٖؑؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0353l extends AbstractC6671l implements InterfaceC14738l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final InterfaceC14738l f1417l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C3585l f1418l;

    public C0353l(InterfaceC14738l interfaceC14738l, C3585l c3585l) {
        interfaceC14738l.getClass();
        this.f1417l = interfaceC14738l;
        this.f1418l = c3585l;
    }

    @Override // defpackage.AbstractC6671l
    public final Collection amazon() {
        return new C9897l(0, this);
    }

    @Override // defpackage.AbstractC6671l
    public final Iterator billing() {
        return new C10219l(this.f1417l.mopub().iterator(), new C1164l(0, this.f1418l));
    }

    @Override // defpackage.InterfaceC12767l
    public final void clear() {
        this.f1417l.clear();
    }

    @Override // defpackage.AbstractC6671l
    public final Map crashlytics() {
        return new C5615l(this.f1417l.admob(), new C6536l(23, this));
    }

    @Override // defpackage.InterfaceC12767l
    public final Collection get(Object obj) {
        return AbstractC7280l.isPro(new C13254l(this.f1418l, obj), (List) this.f1417l.get(obj));
    }

    @Override // defpackage.AbstractC6671l
    public final Set purchase() {
        return this.f1417l.keySet();
    }

    @Override // defpackage.AbstractC6671l, defpackage.InterfaceC12767l
    public final boolean remove(Object obj, Object obj2) {
        return get(obj).remove(obj2);
    }

    @Override // defpackage.InterfaceC12767l
    public final int size() {
        return this.f1417l.size();
    }
}
