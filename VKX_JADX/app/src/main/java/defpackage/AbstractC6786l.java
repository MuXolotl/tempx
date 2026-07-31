package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؙ۟ٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6786l implements InterfaceC14361l, InterfaceC5272l, InterfaceC6913l, InterfaceC6440l, InterfaceC13012l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C2343l f14215l;

    public AbstractC6786l(Function0 function0) {
        C2343l c2343lLoadAd = null;
        C2343l c2343l = function0 instanceof C2343l ? (C2343l) function0 : null;
        if (c2343l != null) {
            c2343lLoadAd = c2343l;
        } else if (function0 != null) {
            c2343lLoadAd = AbstractC3124l.loadAd(null, function0);
        }
        this.f14215l = c2343lLoadAd;
    }

    /* JADX INFO: renamed from: catch */
    public abstract AbstractC6786l mo1765catch();

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC6786l) && AbstractC7209l.firebase(C17334l.f33654l, this, (InterfaceC13789l) obj);
    }

    /* JADX INFO: renamed from: extends */
    public abstract AbstractC6786l mo1767extends();

    /* JADX INFO: renamed from: for */
    public abstract AbstractC6786l mo1768for(boolean z);

    public int hashCode() {
        InterfaceC1122l interfaceC1122lMo1616package = mo1616package();
        return ((mo1617throws().hashCode() + ((interfaceC1122lMo1616package != null ? interfaceC1122lMo1616package.hashCode() : 0) * 31)) * 31) + (Signature() ? 1231 : 1237);
    }

    public abstract boolean premium();

    /* JADX INFO: renamed from: private */
    public abstract boolean mo1769private();

    public abstract boolean pro();

    public abstract InterfaceC1388l remoteconfig();

    public abstract InterfaceC13012l subs();

    /* JADX INFO: renamed from: synchronized */
    public abstract boolean mo1770synchronized();

    /* JADX INFO: renamed from: throw */
    public abstract AbstractC6786l mo1771throw(boolean z);

    public String toString() {
        return C8565l.tapsense(this, false);
    }
}
