package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: lؑٛۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0440l {
    public final InterfaceC11766l loadAd;
    public final Context yandex;

    public C0440l(Context context, InterfaceC11766l interfaceC11766l) {
        this.yandex = context;
        this.loadAd = interfaceC11766l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0440l)) {
            return false;
        }
        C0440l c0440l = (C0440l) obj;
        if (!this.yandex.equals(c0440l.yandex)) {
            return false;
        }
        InterfaceC11766l interfaceC11766l = c0440l.loadAd;
        InterfaceC11766l interfaceC11766l2 = this.loadAd;
        if (interfaceC11766l2 == null) {
            return interfaceC11766l == null;
        }
        return interfaceC11766l2.equals(interfaceC11766l);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() ^ 1000003;
        InterfaceC11766l interfaceC11766l = this.loadAd;
        return (interfaceC11766l == null ? 0 : interfaceC11766l.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        String string = this.yandex.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.loadAd);
        StringBuilder sb = new StringBuilder(length + 45 + strValueOf.length() + 1);
        AbstractC9361l.appmetrica(sb, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
