package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: renamed from: lِْۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13636l implements InterfaceC11766l, Serializable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f26662l;

    public C13636l() {
        AbstractC12832l.loadAd(2, "expectedValuesPerKey");
        this.f26662l = 2;
    }

    @Override // defpackage.InterfaceC11766l
    public final Object get() {
        return new ArrayList(this.f26662l);
    }
}
