package defpackage;

import java.io.Serializable;

/* JADX INFO: renamed from: lٗؗؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16915l implements InterfaceC18660l, Serializable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f32992l;

    public AbstractC16915l(int i) {
        this.f32992l = i;
    }

    @Override // defpackage.InterfaceC18660l
    public final int getArity() {
        return this.f32992l;
    }

    public final String toString() {
        return AbstractC18202l.yandex.firebase(this);
    }
}
