package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l٘۠ٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C18252l extends AbstractC16079l implements InterfaceC14738l, Serializable {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final transient C15333l f35759l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final transient int f35760l;

    public C18252l(C15333l c15333l, int i) {
        this.f35759l = c15333l;
        this.f35760l = i;
    }

    @Override // defpackage.AbstractC6671l
    public final Collection amazon() {
        return new C12146l(this);
    }

    @Override // defpackage.AbstractC6671l
    public final Iterator billing() {
        return new C15220l(this);
    }

    @Override // defpackage.InterfaceC12767l
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.AbstractC6671l
    public final Map crashlytics() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.InterfaceC12767l
    public final Collection get(Object obj) {
        AbstractC1186l abstractC1186l = (AbstractC1186l) this.f35759l.get(obj);
        if (abstractC1186l != null) {
            return abstractC1186l;
        }
        C9258l c9258l = AbstractC1186l.f3181l;
        return C13708l.f26763l;
    }

    @Override // defpackage.AbstractC6671l, defpackage.InterfaceC12767l
    public final Set keySet() {
        return this.f35759l.keySet();
    }

    @Override // defpackage.AbstractC6671l
    public final boolean loadAd(Object obj) {
        return obj != null && super.loadAd(obj);
    }

    @Override // defpackage.AbstractC6671l, defpackage.InterfaceC12767l
    public final Collection mopub() {
        return (AbstractC5511l) super.mopub();
    }

    @Override // defpackage.AbstractC6671l
    public final Set purchase() {
        throw new AssertionError("unreachable");
    }

    @Override // defpackage.AbstractC6671l, defpackage.InterfaceC12767l
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC12767l
    public final int size() {
        return this.f35760l;
    }

    @Override // defpackage.AbstractC6671l, defpackage.InterfaceC12767l
    /* JADX INFO: renamed from: subs, reason: merged with bridge method [inline-methods] */
    public AbstractC13675l admob() {
        return this.f35759l;
    }
}
