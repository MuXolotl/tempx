package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؖۧ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4540l {
    public ArrayList yandex;

    public final void crashlytics(int i, int i2) {
        ((int[]) this.yandex.get(i / 768))[i % 768] = i2;
    }

    public final C17798l loadAd() {
        return new C17798l(4, new C3375l(this, null, 0));
    }

    public final int yandex(int i) {
        return ((int[]) this.yandex.get(i / 768))[i % 768];
    }
}
