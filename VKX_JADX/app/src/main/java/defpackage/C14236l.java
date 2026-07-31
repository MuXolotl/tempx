package defpackage;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: renamed from: lٌٓٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C14236l implements Enumeration {
    public Ccase loadAd;
    public Csynchronized yandex;

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.loadAd != null;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        Ccase ccase = this.loadAd;
        if (ccase != null) {
            this.loadAd = yandex();
            return ccase;
        }
        C4875l.firebase();
        return null;
    }

    public final Ccase yandex() {
        try {
            return this.yandex.ads();
        } catch (IOException e) {
            throw new Celse("malformed ASN.1: " + e, e, 0);
        }
    }
}
