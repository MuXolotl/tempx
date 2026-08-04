package defpackage;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: lًًؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1702l extends AbstractC2648l {
    public final Field loadAd;

    public C1702l(Field field) {
        this.loadAd = field;
    }

    @Override // defpackage.AbstractC2648l
    public final String loadAd() {
        StringBuilder sb = new StringBuilder();
        Field field = this.loadAd;
        sb.append(AbstractC4792l.yandex(field.getName()));
        sb.append("()");
        sb.append(AbstractC1845l.loadAd(field.getType()));
        return sb.toString();
    }
}
