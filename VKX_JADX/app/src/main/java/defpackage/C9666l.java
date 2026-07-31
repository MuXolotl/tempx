package defpackage;

import java.util.Enumeration;

/* JADX INFO: renamed from: lٍٚۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9666l implements Enumeration {
    public final Enumeration yandex;

    public C9666l(Enumeration enumeration) {
        this.yandex = enumeration;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.yandex.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        return C16457l.metrica(this.yandex.nextElement());
    }
}
