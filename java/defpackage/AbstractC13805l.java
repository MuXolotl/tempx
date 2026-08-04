package defpackage;

import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lْۦۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13805l implements InterfaceC14536l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient C1137l f26936l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient C14679l f26937l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC14536l) {
            return yandex().equals(((AbstractC13805l) ((InterfaceC14536l) obj)).yandex());
        }
        return false;
    }

    public final int hashCode() {
        return ((C1137l) yandex()).f3093l.hashCode();
    }

    public final Set loadAd() {
        C14679l c14679l = this.f26937l;
        if (c14679l != null) {
            return c14679l;
        }
        C14164l c14164l = (C14164l) this;
        C14679l c14679l2 = new C14679l(c14164l, c14164l.f27696l);
        this.f26937l = c14679l2;
        return c14679l2;
    }

    public final String toString() {
        return ((C1137l) yandex()).f3093l.toString();
    }

    public final Map yandex() {
        C1137l c1137l = this.f26936l;
        if (c1137l != null) {
            return c1137l;
        }
        C14164l c14164l = (C14164l) this;
        C1137l c1137l2 = new C1137l(c14164l, c14164l.f27696l, 1);
        this.f26936l = c1137l2;
        return c1137l2;
    }
}
