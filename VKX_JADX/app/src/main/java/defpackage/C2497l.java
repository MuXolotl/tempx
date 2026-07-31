package defpackage;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: lٌؔٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2497l extends AbstractC2168l implements InterfaceC12767l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final transient int f5295l;

    public C2497l() {
        super(C6756l.loadAd(12));
        this.f5295l = 2;
        this.f5295l = 2;
    }

    @Override // defpackage.AbstractC2168l
    public final Collection firebase(Object obj, Collection collection) {
        return new C15596l(this, obj, (Set) collection);
    }

    @Override // defpackage.AbstractC2168l, defpackage.InterfaceC12767l
    public final Collection get(Object obj) {
        return (Set) super.get(obj);
    }

    @Override // defpackage.AbstractC6671l, defpackage.InterfaceC12767l
    public final Collection mopub() {
        return (Set) super.mopub();
    }

    @Override // defpackage.AbstractC2168l
    public final Collection subs() {
        return C17501l.amazon(this.f5295l);
    }
}
