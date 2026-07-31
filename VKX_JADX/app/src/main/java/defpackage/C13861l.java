package defpackage;

import java.io.IOException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٌٓؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13861l implements InterfaceC6097l {
    public final String loadAd;
    public final C1645l yandex;

    public C13861l(C1645l c1645l, String str) {
        this.yandex = c1645l;
        this.loadAd = str;
    }

    public final String toString() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC6097l
    public final Object yandex(InterfaceC7697l interfaceC7697l, String str, int i) throws IOException {
        if (i >= str.length()) {
            return Integer.valueOf(i);
        }
        final char cCharAt = str.charAt(i);
        C1645l c1645l = this.yandex;
        if (cCharAt == '-') {
            c1645l.invoke(interfaceC7697l, Boolean.TRUE);
            return Integer.valueOf(i + 1);
        }
        if (cCharAt != '+') {
            return new C0876l(i, new Function0() { // from class: lًۦَ
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return "Expected " + this.f17407l.loadAd + " but got " + cCharAt;
                }
            });
        }
        c1645l.invoke(interfaceC7697l, Boolean.FALSE);
        return Integer.valueOf(i + 1);
    }
}
