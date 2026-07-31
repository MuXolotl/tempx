package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* JADX INFO: renamed from: lؖۚٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4378l extends AbstractC9151l {
    public final InetSocketAddress amazon;

    public C4378l(InetSocketAddress inetSocketAddress) {
        this.amazon = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (C4378l.class.equals(obj != null ? obj.getClass() : null)) {
            return AbstractC8576l.yandex(this.amazon, ((C4378l) obj).amazon);
        }
        return false;
    }

    public final int hashCode() {
        return this.amazon.hashCode();
    }

    @Override // defpackage.AbstractC9151l
    public final SocketAddress mopub() {
        return this.amazon;
    }

    public final String toString() {
        return this.amazon.toString();
    }
}
