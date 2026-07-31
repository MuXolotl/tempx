package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lّؕۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12383l extends IOException {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public AbstractC14080l f24472l;

    public C12383l(String str) {
        super(str);
        this.f24472l = null;
    }

    public static C12383l loadAd() {
        return new C12383l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public final void yandex(AbstractC2597l abstractC2597l) {
        this.f24472l = abstractC2597l;
    }
}
